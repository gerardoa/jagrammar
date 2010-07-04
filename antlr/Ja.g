grammar Ja;
options {language = Java;
	 output = AST;
}
tokens {
	METHODCALL; FIELDACCESS; ARRAYACCESS; DOTCLASS;ARRAYTYPE; METHOD; FIELD; CONSTR; FPARMS; FPARM; FMULTPARM; MBODY;
	VARDECL; BLOCK; STMT; INIT; CONDITION; UPDATE; DOWHILE; THEN;
}

@header{
	package jagrammar;
	
	import jagrammar.typehierarchy.*;
	import java.util.Queue;
	//import java.util.Map; importato da antlr
}

@lexer::header{
	package jagrammar;
}

@members {        
	private Queue<String> todo;
	private Map<String, ReferenceType> cTab;
	private ReferenceType rt;
	
	public void setQueue(Queue<String> q){
        	todo = q;
    	}
    	
    	public void setClassTable(Map<String, ReferenceType> m){
        	cTab = m;
    	}
    	
    	public ReferenceType getReferenceType() {
    		return rt;
    	}
    	
    	private ComplexType createArrayType(Type t, int dim) {
    		for(int i=0; i < dim; i++) {
    			t = new ArrayType(t);
    		}
    		// siamo sicuri che per BasicType dim  > 0 dunque entra nel for
    		return (ComplexType)t;
    	}
}

// starting point for parsing a java file
compilationUnit
    :  classDeclaration^ // toglie nil
    | ';'
    ;
    
classDeclaration
    :   classModifier! CLASS^ IDENTIFIER { if(cTab.containsKey($IDENTIFIER.text)) {
    						 rt = cTab.get($IDENTIFIER.text);
    					   } else {
    					   	rt = new ReferenceType($IDENTIFIER.text);
    					   	cTab.put($IDENTIFIER.text, rt);
    					   }
    					 }
	        (EXTENDS! type {if(cTab.containsKey($type.text)) {
	        			rt.addSuperType(cTab.get($type.text));
        			} else {
        				ReferenceType superRt = new ReferenceType($type.text);
        				rt.addSuperType(superRt);
        				cTab.put($type.text, superRt);
        				todo.add($type.text);	
        			}
        		})?
        classBody
    ;

classModifier
    :  
        PUBLIC
    ;
    
/*typeList
    :   type (',' type)*
    ;
*/    
classBody
    :   '{'! classBodyDeclaration* '}'!
    ;

classBodyDeclaration
    :   ';'!
    |   memberDeclaration
    ;
    
memberDeclaration
    :   (modifier type -> modifier type)(methodDeclaration[$modifier.pub, $type.t] -> ^(METHOD $memberDeclaration methodDeclaration)
    					| fieldDeclaration[(CommonTree)$memberDeclaration.tree, $modifier.pub, $type.t] -> fieldDeclaration //^(FIELD $memberDeclaration fieldDeclaration)
    					)
    |   modifier VOID IDENTIFIER voidMethodDeclaratorRest[$modifier.pub, VoidType.TYPE, $IDENTIFIER.text] -> ^(METHOD modifier VOID IDENTIFIER voidMethodDeclaratorRest)
    |   modifier (IDENTIFIER formalParameters) => IDENTIFIER formalParameters constructorBody { rt.addConstructor($modifier.pub, $formalParameters.args); }
    	-> ^(CONSTR modifier IDENTIFIER formalParameters constructorBody)
    ;

methodDeclaration[boolean pub, Type t]
    :   IDENTIFIER formalParameters { rt.addMethod($pub, $t, $IDENTIFIER.text, $formalParameters.args); }
        (   methodBody
        |   ';'
        )// -> ^(FPARM formalParameters methodBody?)
    ;

fieldDeclaration[CommonTree modAndTyp, boolean pub, Type t]
    :   v1=variableDeclarator      { rt.addField($v1.varName, t, pub); } 
        (',' v2=variableDeclarator { rt.addField($v2.varName, t, pub); })* ';' 
        -> ^(FIELD {$modAndTyp} variableDeclarator)+ 
    ;
    
voidMethodDeclaratorRest[boolean pub, Type t, String methodName]
    :   formalParameters { rt.addMethod($pub, $t, $methodName, $formalParameters.args); }
        (   methodBody
        |   ';'
        )
    ;

variableDeclarator returns [String varName]
    :   variableDeclaratorId { $varName = $variableDeclaratorId.text; } ('='! variableInitializer)? //-> variableDeclaratorId ^(INIT variableInitializer)?
    ;
    
variableDeclaratorId  returns [int arrayDim]
    :   IDENTIFIER (l+='[' ']')* {if($l != null) $arrayDim = $l.size();} 
    ;

variableInitializer
    :   arrayInitializer
    |   expression
    ;
        
arrayInitializer
    :   '{' (variableInitializer (',' variableInitializer)* (',')? )? '}'
    ;

modifier returns [boolean pub]
    :   PUBLIC  { $pub = true;  }
    |   PRIVATE { $pub = false; }
    ;

typeName
    :   IDENTIFIER
    ;

type returns [Type t]
	:	nonPrimitiveType {$t=$nonPrimitiveType.t;}
	|	primitiveType {$t=$primitiveType.bs;}
	;
	
nonPrimitiveType returns [ComplexType t]
	:	classType (l+='[' ']')* {if($l != null) $t = createArrayType($classType.t, $l.size());}
	|	primitiveType (l+='[' ']')+ {if($l != null) $t = createArrayType($primitiveType.bs, $l.size());}
	;

classType returns [ReferenceType t]
	:	IDENTIFIER { if(cTab.containsKey($IDENTIFIER.text)) {
	        			$t = cTab.get($IDENTIFIER.text);
        			} else {
        				$t = new ReferenceType($IDENTIFIER.text);
        				cTab.put($IDENTIFIER.text, $t);
        				todo.add($IDENTIFIER.text);	
        			}
        		  }
	;

primitiveType returns [BasicType bs]
    :   CHAR {$bs=BasicType.CHAR;}
    |   BYTE {$bs=BasicType.BYTE;}
    |   SHORT {$bs=BasicType.SHORT;}
    |   INT {$bs=BasicType.INT;}
    |   LONG {$bs=BasicType.LONG;}
    |   FLOAT {$bs=BasicType.FLOAT;}
    |   DOUBLE {$bs=BasicType.DOUBLE;}
    ;
    
formalParameters returns [ArrayList<Type> args]
@init {
	ArrayList<Type> args = new ArrayList<Type>();
}
    :   '(' formalParameterDecls[args]? ')' {$args = args;} -> {$formalParameterDecls.tree != null}? ^(FPARMS formalParameterDecls?)
    				      ->
    ;
    
formalParameterDecls[ArrayList<Type> args]
    :  type variableDeclaratorId (',' formalParameterDecls[args])? {if($variableDeclaratorId.arrayDim > 0) {
    								 $args.add(createArrayType($type.t, $variableDeclaratorId.arrayDim));
    								} else {
    								 $args.add($type.t);
    								}
    							     }
    
     -> ^(FPARM type variableDeclaratorId) formalParameterDecls?
    |  type '...' variableDeclaratorId -> ^(FMULTPARM type variableDeclaratorId)
    ;
    
methodBody
    :   block -> ^(MBODY block)
    ;

constructorBody
    :   '{' explicitConstructorInvocation? blockStatement* '}'
    ;

explicitConstructorInvocation
    :   (THIS | SUPER) arguments ';'
    //|   primary '.'  'super' arguments ';'
    ;

literal 
    :   INTLITERAL
    |   FloatingPointLiteral
    |   CHARLITERAL
    |   STRINGLITERAL
    |   BOOLEANLITERAL
    |   NULLLITERAL
    ;


// STATEMENTS / BLOCKS

block
    :   '{'! blockStatement* '}'!
    ;
    
blockStatement
    :   localVariableDeclarationStatement
    |   statement
    ;
    
localVariableDeclarationStatement
    :    localVariableDeclaration ';'!
    ;

localVariableDeclaration
    : 	 type variableDeclarator (',' variableDeclarator)* -> ^(VARDECL type variableDeclarator)+
    ;
   

statement
    :   block -> ^(BLOCK block)
    |   IF parExpression statement elseStmt -> ^(IF ^(CONDITION parExpression) ^(THEN statement) elseStmt?)
    |   FOR '(' forInit? ';' expression? ';' forUpdate? ')' statement 
    	-> ^(FOR ^(INIT forInit)? ^(CONDITION expression)? ^(UPDATE forUpdate)? statement )
    |   WHILE parExpression statement -> ^(WHILE ^(CONDITION parExpression) statement)
    |   DO statement WHILE parExpression ';' -> ^(DOWHILE ^(CONDITION parExpression) statement)
    |   RETURN^ expression? ';'!
    |   ';'! 
    |   statementExpression ';' -> ^(STMT statementExpression)
    ;
    
elseStmt:	
	(ELSE) => ELSE^ statement
	|
	;
    
/*    
forControl
    :
    ;
*/
forInit
    :   localVariableDeclaration
    |   expressionList
    ;

forUpdate
    :   expressionList
    ;

// EXPRESSIONS

parExpression
    :   '('! expression ')'!
    ;
    
expressionList
    :   expression (',' expression)*
    ;

statementExpression
    :   expression
    ;
    
constantExpression
    :   expression
    ;
    
expression
    :  orExpression ( ap=assignmentOperator expression)? -> {$ap.c == '='}? ^('=' orExpression expression)
    							 -> {$ap.c == '+'}? ^(EQ orExpression ^(PLUS  orExpression expression))
    							 -> {$ap.c == '-'}? ^(EQ orExpression ^(MINUS orExpression expression))
    							 -> {$ap.c == '*'}? ^(EQ orExpression ^(STAR  orExpression expression))
    							 -> {$ap.c == '/'}? ^(EQ orExpression ^(SLASH orExpression expression))
    							 ->  orExpression
    ;
    
assignmentOperator returns [char c]
    :   '=' {$c = '='; } //-> ^('=' {$orExp})
    |   '+=' {$c = '+';} //-> ^('+=' {$orExp})
    |   '-=' {$c = '-';}//-> ^('-=' {$orExp})
    |   '*=' {$c = '*';}//-> ^('*=' {$orExp})
    |   '/=' {$c = '/';}//-> ^('=' {$orExp})
    ;

orExpression
    :   andExpression ( '||'^ andExpression )*
    ;

andExpression
    :   equalityExpression ( '&&'^ equalityExpression )*
    ;

equalityExpression
    :   instanceOfExpression ( ('==' | '!=')^ instanceOfExpression )*
    ;

instanceOfExpression
    :   relationalExpression (INSTANCEOF^ type)?
    ;

relationalExpression
    :   additiveExpression ( COMPAREOP^ additiveExpression )*
    ;

additiveExpression
    :   multiplicativeExpression ( ('+' | '-')^ multiplicativeExpression )*
    ;

multiplicativeExpression
    :   unaryExpression ( ( '*' | '/' | '%' )^ unaryExpression )*
    ;
    
unaryExpression
    :   '+' unaryExpression
    |   '-' unaryExpression
    |   '++' unaryExpression
    |   '--' unaryExpression
    |   unaryExpressionNotPlusMinus
    ;

unaryExpressionNotPlusMinus
    :	'!' unaryExpression
    |  	('(' primitiveType ')')  => '(' primitiveType ')' unaryExpression
    // possibile ottimizzazione su unaryExpressionNotPlusMinus
    |   ('(' nonPrimitiveType  ')' unaryExpressionNotPlusMinus) => '(' nonPrimitiveType  ')' unaryExpressionNotPlusMinus
    |   NEW creator
    |   primary  selector^* ('++' | '--')? //-> {$s1.tree != null}? ^(selector '++'? '--'?)+ //^($s2 '++'? '--'?)+  //se ce selector primary viene incluso nel sottoalbero di selector
    						//	    	    -> ^(primary '++'? '--'?)
    						     /* {$selector.tree != null}? ^(selector '--'?)
    							   -> ^(primary '--'?)*/
    ;

    
primary
    :   parExpression
    |   THIS //arguments? 
    |   SUPER^ superMemberAccess
    |   literal
    |   IDENTIFIER
    |   (IDENTIFIER -> IDENTIFIER) ('[' ']' -> ^(ARRAYTYPE $primary))+ ('.' CLASS -> ^(DOTCLASS $primary))
    | 	IDENTIFIER  arguments -> ^(METHODCALL IDENTIFIER arguments THIS)
    |	IDENTIFIER '.' CLASS -> ^(DOTCLASS IDENTIFIER)
    |   (primitiveType -> primitiveType) ('[' ']' -> ^(ARRAYTYPE $primary))* ('.' CLASS -> ^(DOTCLASS $primary))
    |   VOID '.' CLASS -> ^(DOTCLASS VOID)
    ;
    
selector
    :   '.' IDENTIFIER -> ^(FIELDACCESS IDENTIFIER)
    |	'.' IDENTIFIER arguments -> ^(METHODCALL IDENTIFIER arguments?)
    //|   '.' 'this'
    //|   '.' 'super' superSuffix
    |   '[' expression ']'-> ^(ARRAYACCESS expression)
    ;

identifierSuffix
    :   ('[' ']')+ '.' CLASS
    //|   ('[' expression ']')+ // can also be matched by selector, but do here
    |   arguments
    |   '.' CLASS
    //|   '.' 'this'
    //|   '.' 'super' arguments
    ;

creator
    :  createdName (arrayCreatorRest | classCreatorRest)
    ;

createdName
    :   classType
    |   primitiveType
    ;
    
arrayCreatorRest
    :   '['']' ('[' ']')* arrayInitializer
    |	'[' expression ']' ('[' expression ']')* 
    ; 

classCreatorRest
    :   arguments 
    ;   
   
superMemberAccess
	:
	'.' IDENTIFIER arguments?	
	;

arguments
    :   '('! expressionList? ')'!
    ;
    
// LEXER
    
fragment
IntegerNumber
    :   '0' 
    |   '1'..'9' Digit*    
    ;
    
fragment
Digit
    : '0'..'9'
    ;
        

fragment
LongSuffix
    :   'l' | 'L'
    ;

INTLITERAL
    :   IntegerNumber 
    ;
	
LONGLITERAL
    :   IntegerNumber LongSuffix
    ;
	
fragment
FloatingPointLiteral
    :   Digit+ '.' Digit* Exponent?
    |   ('.')? Digit+ Exponent?  
    ;
        
fragment 
Exponent    
    :   ( 'e' | 'E' ) ( '+' | '-' )? Digit+ 
    ;
    
fragment 
FloatSuffix
    :   'f' | 'F' 
    ;     

fragment
DoubleSuffix
    :   'd' | 'D'
    ;
        
FLOATLITERAL
    :   FloatingPointLiteral FloatSuffix
    ;
    
DOUBLELITERAL
    :   FloatingPointLiteral DoubleSuffix?
    ;

CHARLITERAL
    :   '\'' 
        (   EscapeSequence 
        |   ~( '\'' | '\\' | '\r' | '\n' )
        ) 
        '\''
    ; 

STRINGLITERAL
    :   '"' 
        (   EscapeSequence
        |   ~( '\\' | '"' | '\r' | '\n' )        
        )* 
        '"' 
    ;

fragment
EscapeSequence 
    :   '\\' (
                 't' 
             |   'n' 
             |   'r' 
             |   '\"' 
             |   '\'' 
             |   '\\'
             )          
;     
	

BOOLEANLITERAL
	: 'true'
	| 'false'
	;
NULLLITERAL
    :   'null'
    ;


BOOLEAN
    :   'boolean'
    ;
    
BYTE
    :   'byte'
    ;

CHAR
    :   'char'
    ;
    	
SHORT
    :   'short'
    ;
	
INT
    :   'int'
    ;

LONG
    :   'long'
    ;

FLOAT
    :   'float'
    ;

DOUBLE
    :   'double'
    ;		

VOID
    :   'void'
    ;	

	
WS  
    :   (
             ' '
        |    '\r'
        |    '\t'
        |    '\n'
        ) 
			{ $channel=HIDDEN; }          
;

COMMENT
    :   '/*'
        (options {greedy=false;} : . )* // ~('*/')
        '*/'
            { $channel=HIDDEN; }
    ;

LINE_COMMENT
    :	'//' ~('\n'|'\r')*
            { $channel=HIDDEN; }
    ;   
        
CLASS
    :   'class'
    ;

EXTENDS
    :   'extends'
    ;
		
FOR
    :   'for'
    ;

DO
    :   'do'
    ;

WHILE
    :   'while'
    ;
	
IF
    :   'if'
    ;

ELSE
    :   'else'
    ;	
	
INSTANCEOF
    :   'instanceof'
    ;
	
NEW
    :   'new'
    ;

PRIVATE
    :   'private'
    ;

PUBLIC
    :   'public'
    ;

RETURN
    :   'return'
    ;

SUPER
    :   'super'
    ;

THIS
    :   'this'
    ;
    
EQ
    :   '='
    ;

PLUS
    :   '+'
    ;

MINUS
    :   '-'
    ;

STAR
    :   '*'
    ;

SLASH
    :   '/'
    ;
    

COMPAREOP
    :	 '>'
    	| '<'
    	| '>='
    	| '<='    	
    ;    

IDENTIFIER
    :  (
		Letter 
		|   Currency 
		|	'_') 
		(
			Digit 
		| 	Letter 
		| 	Currency 
		|	'_'
		)*
    ;    			
   
fragment
Letter
    : 	 'a'..'z' 
	| 'A'..'Z'
	
    ;
   
fragment 
Currency
    : 	 '$'    	
    ;
    