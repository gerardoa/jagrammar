grammar JaLP;
options {language = Java;}


// starting point for parsing a java file
compilationUnit
    :  typeDeclaration*
    ;
    
typeDeclaration
    :   classDeclaration
    |   ';'
    ;
    
classDeclaration
    :   classModifier classDeclaration 
    ;


classModifier
    :  
        PUBLIC
    ;


classDeclaration
    :   CLASS IDENTIFIER 
        (EXTENDS type)?
        classBody
    ;
    
typeList
    :   type (',' type)*
    ;
    
classBody
    :   '{' classBodyDeclaration* '}'
    ;

classBodyDeclaration
    :   ';'
    |   modifier memberDecl
    ;
    
memberDecl
    :    memberDeclaration
    |   VOID IDENTIFIER voidMethodDeclaratorRest
    |    IDENTIFIER constructorDeclaratorRest
    ;
    
memberDeclaration
    :   type (methodDeclaration | fieldDeclaration)
    ;


methodDeclaration
    :   IDENTIFIER methodDeclaratorRest
    ;

fieldDeclaration
    :   variableDeclarators ';'
    ;
    
methodDeclaratorRest
    :   formalParameters ('[' ']')*
        (   methodBody
        |   ';'
        )
    ;
    
voidMethodDeclaratorRest
    :   formalParameters
        (   methodBody
        |   ';'
        )
    ;

constructorDeclaratorRest
    :   formalParameters constructorBody
    ;

variableDeclarators
    :   variableDeclarator (',' variableDeclarator)*
    ;

variableDeclarator
    :   variableDeclaratorId ('=' variableInitializer)?
    ;
    
variableDeclaratorId
    :   IDENTIFIER ('[' ']')*
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
    :   qualifiedName
    ;

type
	:	classType ('[' ']')*
	|	primitiveType ('[' ']')*
	;

classType
	:	IDENTIFIER
	;

primitiveType
    :   	
    |   CHAR
    |   BYTE
    |   SHORT
    |   INT
    |   LONG
    |   FLOAT
    |   DOUBLE
    ;
    
formalParameters
    :   '(' formalParameterDecls? ')'
    ;
    
formalParameterDecls
    :   modifier type formalParameterDeclsRest
    ;
    
formalParameterDeclsRest'null'
    :   variableDeclaratorId (',' formalParameterDecls)?
    |   '...' variableDeclaratorId
    ;
    
methodBody
    :   block
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
    :   '{' blockStatement* '}'
    ;
    
blockStatement
    :   localVariableDeclarationStatement
    |   classDeclaration
    |   statement
    ;
    
localVariableDeclarationStatement
    :    localVariableDeclaration ';'
    ;

localVariableDeclaration
    :   modifier type variableDeclarators
    ;
   

statement
    : block
    |   IF parExpression statement (ELSE statement)?
    |   FOR '(' forInit? ';' expression? ';' forUpdate? ')' statement
    |   parExpression statement
    |   DO statement WHILE parExpression ';'
    |   RETURN expression? ';'
    |   ';' 
    |   statementExpression ';'
    |   IDENTIFIER ':' statement
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
    :   '(' expression ')'
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
    :  OrExpression (assignmentOperator expression)?
    ;
    
assignmentOperator
    :   '='
    |   '+='
    |   '-='
    |   '*='
    |   '/='
    ;

OrExpression
    :   AndExpression ( '||' AndExpression )*
    ;

AndExpression
    :   equalityExpression ( '&&' equalityExpression )*
    ;

equalityExpression
    :   instanceOfExpression ( ('==' | '!=') instanceOfExpression )*
    ;

instanceOfExpression
    :   relationalExpression (INSTANCEOF type)?
    ;

relationalExpression
    :   additiveExpression ( COMPAREOP additiveExpression )*
    ;

additiveExpression
    :   multiplicativeExpression ( ('+' | '-') multiplicativeExpression )*
    ;

multiplicativeExpression
    :   unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )*
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
    |   castExpression
    |   primary selector* ('++'|'--')?
    ;

castExpression
    :  ('(' primitiveType) => '(' primitiveType ')' unaryExpression
    |  '(' type ')' unaryExpressionNotPlusMinus
    ;

primary
    :   parExpression
    |   THIS //('.' IDENTIFIER)+ identifierSuffix?
    |   SUPER superMemberAccess
    |   literal
    |   NEW creator
    |   IDENTIFIER identifierSuffix?
    |   primitiveType ('[' ']')* '.' CLASS
    |   VOID '.' CLASS
    ;

identifierSuffix
    :   ('[' ']')+ '.' CLASS
    |   ('[' expression ']')+ // can also be matched by selector, but do here
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
    :   '['
        (   ']' ('[' ']')* arrayInitializer
        |   expression ']' ('[' expression ']')* ('[' ']')*
        )
    ;

classCreatorRest
    :   arguments 
    ;
    
    
selector
    :   '.' IDENTIFIER arguments?
    //|   '.' 'this'
    //|   '.' 'super' superSuffix
    |   '[' expression ']'
    ;
    
   
superMemberAccess
	:
	'.' IDENTIFIER arguments?	
	;

arguments
    :   '(' expressionList? ')'
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
    
