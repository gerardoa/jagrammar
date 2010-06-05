grammar JaLP;

options {
    language=Java;
}

identifier:
	IDENTIFIER
	;
	
literal:
	 INTLITERAL 	
	| FLOATLITERAL
	| CHARLITERAL 	
	| STRINGLITERAL 	
	| BOOLEANLITERAL
	| NULLLITERAL
	;

expression: 
	expression1 (assignmentOperator expression1)?
	;
	
assignmentOperator:
	'=' 
	| '+=' 
	| '-=' 
	| '*=' 
	| '/=' 	
	;

type: 
	basicType
	| identifier bracketsOpt
	;

statementExpression: 
	expression
	;

constantExpression: 
	expression
	;

expression1: 
	expression2 // (Expression1Rest)?
	;

/* Expression1Rest: 
	[  ?   Expression   :   Expression1]
*/

expression2 : 
	expression3 (expression2Rest)?
	;


expression2Rest: 
	(infixop expression3)*
	| expression3 'instanceof' type
	;

infixop:
	'||'
	| '&&' 
	| '==' 
	| '!=' 
	| COMPAREOP
	| '+' 
	| '-' 
	| '*' 
	| '/' 
	;

expression3: 
	prefixOp expression3
	| '('   ( /*Expr |*/ type)   ')'   expression3
	| primary (selector)* (postfixOp)*
	;

primary: 
	| '(' expression ')'
	| 'this' (arguments)?
	| 'super' superSuffix
	| literal
	| 'new' creator
	| identifier ( '.' identifier )* (identifierSuffix)?
	| basicType bracketsOpt '.class'
	| 'void.class'
	;

identifierSuffix:
	'[' 
		( 
		  (']' bracketsOpt   '.class') 
		| ( expression ']')
		)
	| arguments
	| '.'   ( 'class' | 'this' | ('super' arguments) /*| ('new' InnerCreator)*/ )
	;

prefixOp:
	'++' 
	| '--' 
	| '!' 
	// ~ 
	| '+' 
	| '-'
	; 

postfixOp: 
	'++'
	| '--'
	; 

selector: 
	'.' identifier (arguments)?
	 //. this
	 // . super SuperSuffix // delete
	 // . new InnerCreator // delete
	| '[' expression ']'
	;
	
superSuffix: 
	arguments 
	| '.' identifier (arguments)?
	;

basicType: 
	'byte' 
	| 'short'
	| 'char' 
	| 'int' 
	| 'long' 
	| 'float'
	| 'double'
	| 'boolean'
	;

argumentsOpt: 
	(arguments)?
	;

arguments: 
	'(' (expression (',' expression)*)? ')'
	;
	
bracketsOpt: 
	('[]')*
	;

creator: 
	/*Qualified*/identifier ( arrayCreatorRest  | classCreatorRest )
	;

/*InnerCreator: 
	Identifier ClassCreatorRest
	;
*/
arrayCreatorRest: 
	'[' ( (']' bracketsOpt arrayInitializer) | (expression ']' ('[' expression ']')* bracketsOpt ) )
	; 
	
classCreatorRest: 
	arguments // (ClassBody)?
	;

arrayInitializer: 
	'{' (variableInitializer (',' variableInitializer)* (',')?)? '}'
	;

variableInitializer: 
	arrayInitializer
	| expression
	;

parExpression: 
	( expression )
	;

block: 
	'{' blockStatements '}'
	;

blockStatements: 
	(blockStatement)*
	;

blockStatement : 
	localVariableDeclarationStatement
	| classOrInterfaceDeclaration
	| (identifier ':')? statement
	;

localVariableDeclarationStatement:
	/*(final)?*/ type variableDeclarators ';'   
	;  

statement:
	block
	| 'if' parExpression statement ('else' statement)?
	| 'for' '(' forInit   ';'   (expression)?   ';'   forUpdate ')' statement
	| 'while' parExpression statement
	| 'do' statement 'while' parExpression ';' 
	// | 'try' Block ( Catches | [Catches] 'finally' Block )
	// switch ParExpression { SwitchBlockStatementGroups }
	// synchronized ParExpression Block
	| 'return' (expression)? ';' 
	// | throw Expression   ; 
	// break [Identifier]
	// continue [Identifier]
	| ';' 
	| statementExpression //ExpressionStatement
	| identifier   ':'   statement
	;
	
/*Catches: 
	CatchClause {CatchClause}

CatchClause: 
	catch ( FormalParameter ) Block

SwitchBlockStatementGroups: 
	{ SwitchBlockStatementGroup }

SwitchBlockStatementGroup: 
	SwitchLabel BlockStatements

SwitchLabel: 
	case ConstantExpression   :
	default:  
*/
moreStatementExpressions: 
	( ',' statementExpression )*
	;

forInit: 
	statementExpression moreStatementExpressions
	| /*[final]*/ type variableDeclarators
	;

forUpdate: 
	statementExpression moreStatementExpressions
	;

modifiersOpt: 
	/*(*/ modifier // )*
	;

modifier: 
	'public' 
	// | 'protected' 
	| 'private' 
	// | 'static'
	// | 'abstract'
	// | 'final' 
	// | 'native'
	// | 'synchronized'
	// | 'transient'
	// | 'volatile'
	// | 'strictfp'
	;

variableDeclarators: 
	variableDeclarator ( ','   variableDeclarator )*
	;

variableDeclaratorsRest: 
	variableDeclaratorRest ( ','   variableDeclarator )*
	;

constantDeclaratorsRest: 
	constantDeclaratorRest (','   constantDeclarator )*
	;

variableDeclarator: 
	identifier variableDeclaratorRest
	;

constantDeclarator: 
	identifier constantDeclaratorRest
	;

variableDeclaratorRest: 
	bracketsOpt (  '='   variableInitializer)?
	;

constantDeclaratorRest: 
	bracketsOpt   '='   variableInitializer
	;

variableDeclaratorId: 
	identifier bracketsOpt
	;

compilationUnit: 
	//[package QualifiedIdentifier   ;  ] {ImportDeclaration} 
	/*(*/ typeDeclaration //)*
	;
/*
ImportDeclaration: 
	import Identifier {   .   Identifier } [   .     *   ] ;  
*/
typeDeclaration: 
	classOrInterfaceDeclaration
	;

classOrInterfaceDeclaration: 
	modifiersOpt classDeclaration // | InterfaceDeclaration)
	;

classDeclaration: 
	'class' identifier ('extends' type)? /*[implements TypeList]*/ classBody
	;
/*
InterfaceDeclaration: 
	interface Identifier [extends TypeList] InterfaceBody
*/
typeList: 
	type (','   type)*
	;

classBody: 
	'{' (classBodyDeclaration)* '}'
	;
/*
InterfaceBody: 
	{ {InterfaceBodyDeclaration} }
*/
classBodyDeclaration:
	';' 
	| /*[static]*/ block
	| modifiersOpt memberDecl
	;

memberDecl:
	methodOrFieldDecl
	| 'void' identifier methodDeclaratorRest
	| identifier constructorDeclaratorRest
	| classOrInterfaceDeclaration
	;

methodOrFieldDecl:
	type identifier methodOrFieldRest
	;

methodOrFieldRest:
	variableDeclaratorRest
	| methodDeclaratorRest
	;
/*
InterfaceBodyDeclaration:
	; 
	ModifiersOpt InterfaceMemberDecl

InterfaceMemberDecl:
	InterfaceMethodOrFieldDecl
	void Identifier VoidInterfaceMethodDeclaratorRest
	ClassOrInterfaceDeclaration

InterfaceMethodOrFieldDecl:
	Type Identifier InterfaceMethodOrFieldRest

InterfaceMethodOrFieldRest:
	ConstantDeclaratorsRest ;
	InterfaceMethodDeclaratorRest
*/
methodDeclaratorRest:
		formalParameters bracketsOpt /* [throws QualifiedIdentifierList]*/ (methodBody |   ';')
		;

voidMethodDeclaratorRest:
		formalParameters /*[throws QualifiedIdentifierList]*/ ( methodBody |   ';') 
		;
/*
InterfaceMethodDeclaratorRest:
	FormalParameters BracketsOpt [throws QualifiedIdentifierList]   ;  

VoidInterfaceMethodDeclaratorRest:
	FormalParameters [throws QualifiedIdentifierList]   ;  
*/
constructorDeclaratorRest:
	formalParameters /*[throws QualifiedIdentifierList]*/ methodBody
	;
/*
QualifiedIdentifierList: 
	QualifiedIdentifier (  ','   QualifiedIdentifier)*
	;
*/
formalParameters: 
	'(' (formalParameter ( ',' formalParameter)*)? ')'
	;

formalParameter: 
	/*[final]*/ type variableDeclaratorId
	;

methodBody:
	block
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
