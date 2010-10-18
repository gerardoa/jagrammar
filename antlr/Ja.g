grammar Ja;
options {language = Java;
	 output = AST;
}
tokens {
	METHODCALL; CONSTRCALL; FIELDACCESS; ARRAYACCESS; DOTCLASS; ARRAYTYPE; 
	METHOD; FIELD; CONSTR; FPARMS; ARGUMENTS; FPARM; FMULTPARM; MBODY; CBODY;
	VARDECL; BLOCK; STMT; INIT; CONDITION; UPDATE; DOWHILE; THEN; ARRAYINIT;
	PREINC; POSTINC; PREDEC; POSTDEC; UNARYPLUS; UNARYMINUS; CAST; CLASSBODY;
	//SUPERMETHODCALL; SUPERFIELDACCESS;   Per uniformita' viene preferito   ^(METHODCALL SUPER ...) e ^(FIELDACCESS SUPER ...)
}

@header{
	package jagrammar;
	
	import jagrammar.typehierarchy.*;
	import jagrammar.util.ParserHelper;
	import java.util.Queue;
	import java.util.LinkedList;
	import java.util.HashMap;
	//import java.util.Map; importato da antlr
}

@lexer::header{
	package jagrammar;
}

@members {        
	private Queue<String> todo = new LinkedList<String>(); // inizializzazione per ANTLRWORKS
	private Map<String, ReferenceType> cTab = new HashMap<String, ReferenceType>(); // inizializzazione per ANTLRWORKS
	private ReferenceType rt;
	
	public void setQueue(Queue<String> q) {
        	todo = q;
    	}
    	
    	public void setClassTable(Map<String, ReferenceType> m) {
        	cTab = m;
    	}
    	
    	public ReferenceType getReferenceType() {
    		return rt;
    	}
}

// starting point for parsing a java file
compilationUnit
    :  classDeclaration^ // toglie nil
    | ';'
    ;
    
classDeclaration
    :   classModifier! CLASS^ IDENTIFIER 
    	{ // Potrebbe gia' esistere l'istanza prima che abbia analizzato il file .java
    	  // Aggiunta effettuata dalla regola classType per recuperare subito l'istanza della classe anche se priva di interfaccia
	  if(cTab.containsKey($IDENTIFIER.text)) {
	  	rt = cTab.get($IDENTIFIER.text);
	  } else { // crea una nuova istanza per la classe e la aggiunge alla tabella
	  	rt = new ReferenceType($IDENTIFIER.text);
	  	cTab.put($IDENTIFIER.text, rt);
	  }
	}
        (EXTENDS! classType { rt.addSuperType($classType.t); } )?		    	
    	classBody
    ;

classModifier
    :   PUBLIC
    ;
  
classBody
    :   '{' classBodyDeclaration* '}' -> ^(CLASSBODY classBodyDeclaration*)
    ;

classBodyDeclaration
    :   ';'!
    |   memberDeclaration
    ;
    
memberDeclaration
    :   modifier type
    		( methodDeclaration[$modifier.pub, $type.t] -> ^(METHOD modifier type methodDeclaration)
    		| fieldDeclaration[(CommonTree)$modifier.tree, (CommonTree)$type.tree, $modifier.pub, $type.t] -> fieldDeclaration // FIELD non e' stato riscritto qui per la molteplicita' delle dichiarazioni
    		)
    		
    |   modifier VOID IDENTIFIER voidMethodDeclaratorRest[$modifier.pub, VoidType.TYPE, $IDENTIFIER.text] 
    	-> ^(METHOD modifier VOID IDENTIFIER voidMethodDeclaratorRest)
    	
    |   modifier IDENTIFIER formalParameters constructorBody 
    	{ rt.addConstructor($modifier.pub, $formalParameters.args); }
    	-> ^(CONSTR modifier IDENTIFIER formalParameters? constructorBody?)
    ;

methodDeclaration[boolean pub, Type t]
    :   IDENTIFIER formalParameters methodBody { rt.addMethod($pub, $t, $IDENTIFIER.text, $formalParameters.args); }
    	// -> ^(FPARM formalParameters methodBody?)
    ;

fieldDeclaration[CommonTree mod, CommonTree typ, boolean pub, Type t]
    :   v1=variableDeclarator[$typ]      { rt.addField($v1.varName, ParserHelper.createArrayType($t, $v1.arrayDim), $pub); } 
        (',' v2=variableDeclarator[$typ] { rt.addField($v2.varName, ParserHelper.createArrayType($t, $v2.arrayDim), $pub); } 
        )* ';' 
        -> ^(FIELD {$mod} variableDeclarator)+ 
    ;
    
voidMethodDeclaratorRest[boolean pub, Type t, String methodName]
    :	formalParameters methodBody { rt.addMethod($pub, $t, $methodName, $formalParameters.args); }
    ;

variableDeclarator[CommonTree typ] returns [String varName, int arrayDim]
    :   variableDeclaratorId[$typ] { $varName = $variableDeclaratorId.varName; $arrayDim = $variableDeclaratorId.arrayDim; } ('='! variableInitializer)? //-> variableDeclaratorId ^(INIT variableInitializer)?
    ;
    
variableDeclaratorId[CommonTree typ]  returns [String varName, int arrayDim]
    :   (IDENTIFIER -> {$typ}) ( l+='[' ']' -> ^(ARRAYTYPE $variableDeclaratorId) )* 
    	{ $varName = $IDENTIFIER.text; if($l != null) $arrayDim = $l.size(); } 
    	->  $variableDeclaratorId IDENTIFIER
    ;

variableInitializer
    :   arrayInitializer
    |   expression
    ;
        
arrayInitializer
    :   lc='{' (variableInitializer (',' variableInitializer)* (',')? )? '}' -> ^(ARRAYINIT[$lc, "ARRAYINIT"] variableInitializer*) 
    ;

modifier returns [boolean pub]
    :   PUBLIC  { $pub = true;  }
    |   PRIVATE { $pub = false; }
    ;

type returns [Type t]
    :	nonPrimitiveType { $t = $nonPrimitiveType.t; }
    |	primitiveType 	 { $t = $primitiveType.bs;   }
    ;
	
nonPrimitiveType returns [ComplexType t]
    :	(classType     -> classType    ) ( l+='[' ']' -> ^(ARRAYTYPE $nonPrimitiveType) )* 
	{ if($l != null) $t = (ComplexType)ParserHelper.createArrayType($classType.t, $l.size());
	  else $t = $classType.t;
	}
			
    |	(primitiveType -> primitiveType) ( l+='[' ']' -> ^(ARRAYTYPE $nonPrimitiveType) )+ 
	{ $t = (ComplexType)ParserHelper.createArrayType($primitiveType.bs, $l.size()); }
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
    :   CHAR    { $bs = BasicType.CHAR;    }
    |   BYTE    { $bs = BasicType.BYTE;    }
    |   SHORT   { $bs = BasicType.SHORT;   }
    |   INT     { $bs = BasicType.INT;     }
    |   LONG    { $bs = BasicType.LONG;    }
    |   FLOAT   { $bs = BasicType.FLOAT;   }
    |   DOUBLE  { $bs = BasicType.DOUBLE;  }
    |   BOOLEAN { $bs = BasicType.BOOLEAN; }
    ;
    
formalParameters returns [ArrayList<Type> args]
@init {
	$args = new ArrayList<Type>();
}
    :  '('!')'! 
    |  '(' formalParameterDecls[$args] ')' -> ^(FPARMS formalParameterDecls)
    ;
    
formalParameterDecls[ArrayList<Type> args]
    :	type variableDeclaratorId[(CommonTree)$type.tree] (',' formalParameterDecls[$args])? 
    	{ $args.add(ParserHelper.createArrayType($type.t, $variableDeclaratorId.arrayDim)); }
    	-> ^(FPARM variableDeclaratorId) formalParameterDecls?
    ;
    
methodBody
    :   block -> ^(MBODY block?) // block può essere il nodo NIL
    ;

constructorBody
    :	'{' explicitConstructorInvocation? blockStatement* '}' -> ^(CBODY explicitConstructorInvocation? blockStatement*)
    ;

explicitConstructorInvocation
    :   ((THIS -> THIS) | (SUPER -> SUPER)) arguments ';' -> ^(CONSTRCALL $explicitConstructorInvocation arguments?)
    ;

literal 
    :   INTLITERAL
    |	LONGLITERAL
    |   FLOATLITERAL
    |	DOUBLELITERAL
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
    :	localVariableDeclaration ';'!
    ;

localVariableDeclaration
    :	type variableDeclarator[(CommonTree)$type.tree] (',' variableDeclarator[(CommonTree)$type.tree])* 
    	-> ^(VARDECL variableDeclarator)+
    ;
   

statement
    :   block -> ^(BLOCK block?)
    |   tk=IF parExpression statement elseStmt -> ^(IF ^(CONDITION[$tk, "CONDITION"] parExpression) (^(THEN statement))? elseStmt?)
    |   FOR lp='(' forInit? ';' expression? ';' forUpdate? ')' statement 
    		-> ^(FOR ^(INIT forInit)? ^(CONDITION[$lp, "CONDITION"] expression)? ^(UPDATE forUpdate)? statement )   	
    |   tk=WHILE parExpression statement -> ^(WHILE ^(CONDITION[$tk, "CONDITION"] parExpression) statement)
    |   DO statement tk=WHILE parExpression ';' -> ^(DOWHILE ^(CONDITION[$tk, "CONDITION"] parExpression) statement)
    |   RETURN^ expression? ';'!
    |   ';'! 
    |   statementExpression ';' -> ^(STMT statementExpression)
    ;
    
elseStmt
    :	(ELSE) => ELSE^ statement
    |
    ;

forInit
    :   localVariableDeclaration
    |   expressionList
    ;

forUpdate
    :   expressionList
    ;

parExpression
    :   '('! expression ')'!
    ;
    
expressionList
    :   expression (','! expression)*
    ;

statementExpression
    :   expression
    ;
 
expression
    :  orExpression ( ap=assignmentOperator expression)? 
       -> {$ap.c == '='}? ^(EQ[$ap.tk, "="] orExpression expression)
       -> {$ap.c == '+'}? ^(EQ[$ap.tk, "="] orExpression ^(PLUS[$ap.tk, "+"]  orExpression expression))
       -> {$ap.c == '-'}? ^(EQ[$ap.tk, "="] orExpression ^(MINUS[$ap.tk, "-"] orExpression expression))
       -> {$ap.c == '*'}? ^(EQ[$ap.tk, "="] orExpression ^(STAR[$ap.tk, "*"]  orExpression expression))
       -> {$ap.c == '/'}? ^(EQ[$ap.tk, "="] orExpression ^(SLASH[$ap.tk, "/"] orExpression expression))
       ->  orExpression
    ;
    
assignmentOperator returns [char c, Token tk]
    :   t='='  { $c = '='; $tk=$t; }
    |   t='+=' { $c = '+'; $tk=$t; }
    |   t='-=' { $c = '-'; $tk=$t; }
    |   t='*=' { $c = '*'; $tk=$t; }
    |   t='/=' { $c = '/'; $tk=$t; }
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
    :   up='+'  unaryExpression -> ^(UNARYPLUS[$up]  unaryExpression) 
    |   um='-'  unaryExpression -> ^(UNARYMINUS[$um] unaryExpression)
    |   pi='++' unaryExpression -> ^(PREINC[$pi] unaryExpression)
    |   pd='--' unaryExpression -> ^(PREDEC[$pd] unaryExpression)
    |   unaryExpressionNotPlusMinus
    ;

unaryExpressionNotPlusMinus
    :	'!'^ unaryExpression
    
    |  	lp='(' primitiveType ')' unaryExpression
    		-> ^(CAST[$lp, "CAST"] primitiveType unaryExpression)
    		
    |   lp='(' nonPrimitiveType  ')' unaryExpressionNotPlusMinus
    		-> ^(CAST[$lp, "CAST"] nonPrimitiveType unaryExpressionNotPlusMinus)
    		
    |   NEW^ creator
    
    |   (primary -> primary)  (selector[(CommonTree)$unaryExpressionNotPlusMinus.tree] -> selector)* 
    		('++' -> ^(POSTINC $unaryExpressionNotPlusMinus) | '--' -> ^(POSTDEC $unaryExpressionNotPlusMinus) )* 
    ;

    
primary
    :   parExpression
    |   THIS 
    |   SUPER! superMemberAccess
    |   literal
    |   IDENTIFIER
    |   (IDENTIFIER -> IDENTIFIER) ('[' ']' -> ^(ARRAYTYPE $primary))+ ('.' CLASS -> ^(DOTCLASS $primary))
    | 	IDENTIFIER  arguments -> ^(METHODCALL THIS IDENTIFIER arguments?)
    |	IDENTIFIER '.' CLASS -> ^(DOTCLASS IDENTIFIER)
    |   (primitiveType -> primitiveType) ('[' ']' -> ^(ARRAYTYPE $primary))* ('.' CLASS -> ^(DOTCLASS $primary))
    |   VOID '.' CLASS -> ^(DOTCLASS VOID)
    ;
    
selector [CommonTree primary]
    :   '.' IDENTIFIER -> ^(FIELDACCESS {$primary} IDENTIFIER)
    |	'.' IDENTIFIER arguments -> ^(METHODCALL {$primary} IDENTIFIER arguments?)
    |   lb='[' expression ']'-> ^(ARRAYACCESS[$lb, "ARRAYACCESS"] {$primary} expression)
    ;

creator
    :	createdName ( arrayCreatorRest[(CommonTree)$createdName.tree] -> arrayCreatorRest
    	            | classCreatorRest 				      -> createdName classCreatorRest? 
    	            ) 
    ;

createdName
    :   classType
    |   primitiveType
    ;
    
arrayCreatorRest[CommonTree createdName]
    :   (lb='['']' -> ^(ARRAYTYPE[$lb, "ARRAYTYPE"]  {$createdName})) ( (lb='[' ']') -> ^(ARRAYTYPE[$lb, "ARRAYTYPE"] $arrayCreatorRest) )* 
    		(arrayInitializer  -> $arrayCreatorRest arrayInitializer)    
    |	(lb='[' expression ']' -> ^(ARRAYTYPE[$lb, "ARRAYTYPE"] expression {$createdName})) ( (lb='[' expression ']') -> ^(ARRAYTYPE[$lb, "ARRAYTYPE"] expression $arrayCreatorRest ) )*  
    		( (lb='['']') -> ^(ARRAYTYPE[$lb, "ARRAYTYPE"] $arrayCreatorRest) )*
    ; 

classCreatorRest
    :   arguments
    ;   
   
superMemberAccess 
    :	'.' IDENTIFIER -> ^(FIELDACCESS SUPER IDENTIFIER)
    |   '.' IDENTIFIER arguments -> ^( METHODCALL SUPER IDENTIFIER arguments?)
    ;

arguments
    :   '('!')'!
    |	'(' expressionList ')' -> ^(ARGUMENTS expressionList)   
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
    :   '\\' 
    	( 't' 
        | 'n' 
        | 'r' 
        | '\"' 
        | '\'' 
        | '\\'
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
    :   ( ' '
        | '\r'
        | '\t'
        | '\n'
        ) 
	{ $channel = HIDDEN; }          
    ;

COMMENT
    :   '/*'
        (options {greedy=false;} : . )* // ~('*/')
        '*/'
        { $channel = HIDDEN; }
    ;

LINE_COMMENT
    :	'//' ~('\n'|'\r')*
        { $channel = HIDDEN; }
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
    :	'>'
    |	'<'
    |	'>='
    |	'<='    	
    ;    

IDENTIFIER
    :	( Letter 
    	| Currency 
	| '_'
	)
	( Digit 
	| Letter 
	| Currency 
	| '_'
	)*
    ;    			
   
fragment
Letter
    :	'a'..'z' 
    |	'A'..'Z'
    ;
   
fragment 
Currency
    :	'$'    	
    ;