grammar Ja40;
options {language = Java;
	 output = AST;
}
tokens {
	METHODCALL; CONSTRCALL; FIELDACCESS; ARRAYACCESS; DOTCLASS;ARRAYTYPE; METHOD; FIELD; CONSTR; FPARMS; ARGUMENTS; FPARM; FMULTPARM; MBODY; CBODY;
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
	private Queue todo;
	private Map classTable;
	private ReferenceType rt;
	
	public void setQueue(Queue q){
        	todo = q;
    	}
    	
    	public void setClassTable(Map m){
        	classTable = m;
    	}
    	
    	public void setReferenceType(ReferenceType refType) {
    		rt = refType;
    	}
}

// starting point for parsing a java file
compilationUnit
    :  classDeclaration^ // toglie nil
    | ';'
    ;
    
classDeclaration
    :   classModifier! CLASS^ IDENTIFIER
        (EXTENDS! type)?
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
    :   (modifier type -> modifier type)(methodDeclaration -> ^(METHOD $memberDeclaration methodDeclaration)
    					| fieldDeclaration[(CommonTree)$modifier.tree, (CommonTree)$type.tree] -> fieldDeclaration //^(FIELD $memberDeclaration fieldDeclaration)
    					)
    |   modifier VOID IDENTIFIER voidMethodDeclaratorRest -> ^(METHOD modifier VOID IDENTIFIER voidMethodDeclaratorRest)
    |   modifier (IDENTIFIER formalParameters) => IDENTIFIER formalParameters constructorBody 
    	-> ^(CONSTR modifier IDENTIFIER formalParameters? constructorBody?)
    ;

methodDeclaration
    :   IDENTIFIER methodDeclaratorRest
    ;

fieldDeclaration[CommonTree mod, CommonTree typ]
    :   variableDeclarator[$typ] (',' variableDeclarator[$typ])* ';' -> ^(FIELD {$mod} variableDeclarator)+ 
    ;
    
methodDeclaratorRest
    :   formalParameters
        (   methodBody
        |   ';'
        )// -> ^(FPARM formalParameters methodBody?)
    ;

    
voidMethodDeclaratorRest
    :   formalParameters
        (   methodBody
        |   ';'
        )
    ;

variableDeclarator[CommonTree typ]
    :   variableDeclaratorId[$typ] ('='! variableInitializer)? //-> variableDeclaratorId ^(INIT variableInitializer)?
    ;
    
variableDeclaratorId[CommonTree typ]
    :   (IDENTIFIER -> {$typ}) ('[' ']' -> ^(ARRAYTYPE $variableDeclaratorId))* ->  $variableDeclaratorId IDENTIFIER
    ;

variableInitializer
    :   arrayInitializer
    |   expression
    ;
        
arrayInitializer
    :   '{' (variableInitializer (',' variableInitializer)* (',')? )? '}'
    ;

modifier
    :   PUBLIC
    |   PRIVATE
    ;

typeName
    :   IDENTIFIER
    ;

type
	:	nonPrimitiveType
	|	primitiveType
	;
	
nonPrimitiveType
	:	(classType -> classType) ('[' ']' -> ^(ARRAYTYPE $nonPrimitiveType))*
	|	(primitiveType -> primitiveType) ('[' ']' -> ^(ARRAYTYPE $nonPrimitiveType))+
	;

classType
	:	IDENTIFIER
	;

primitiveType
    :   CHAR
    |   BYTE
    |   SHORT
    |   INT
    |   LONG
    |   FLOAT
    |   DOUBLE
    ;
    
formalParameters
    :   '(' formalParameterDecls? ')' -> {$formalParameterDecls.tree != null}? ^(FPARMS formalParameterDecls?)
    				      ->
    ;
    
formalParameterDecls
    :  type variableDeclaratorId[(CommonTree)$type.tree] (',' formalParameterDecls)? -> ^(FPARM variableDeclaratorId) formalParameterDecls?
    |  type '...' variableDeclaratorId[(CommonTree)$type.tree] -> ^(FMULTPARM variableDeclaratorId)
    ;
    
methodBody
    :   block -> ^(MBODY block?)
    ;

constructorBody
    :   '{' explicitConstructorInvocation? blockStatement* '}' -> ^(CBODY explicitConstructorInvocation? blockStatement*)
    ;

explicitConstructorInvocation
    :   ((THIS -> THIS) | (SUPER -> SUPER)) arguments ';' -> ^(CONSTRCALL $explicitConstructorInvocation arguments)
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
    : 	 type variableDeclarator[(CommonTree)$type.tree] (',' variableDeclarator[(CommonTree)$type.tree])* -> ^(VARDECL variableDeclarator)+
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
    :   expression (','! expression)*
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
    |   NEW^ creator
    |   primary  selector^* ('++' | '--')? //-> {$s1.tree != null}? ^(selector '++'? '--'?)+ //^($s2 '++'? '--'?)+  //se c'è selector primary viene incluso nel sottoalbero di selector
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
    | 	IDENTIFIER  arguments -> ^(METHODCALL IDENTIFIER arguments? THIS)
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
    :   '(' expressionList? ')' -> {$expressionList.tree != null}? ^(ARGUMENTS expressionList?)
    				->
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
    	| '£'    	
    ;
    