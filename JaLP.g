grammar JaLP;

options {
    language=Java;
}

Identifier:
	IDENTIFIER
	;
	
Literal:
	 INTLITERAL 	
	| FLOATLITERAL
	| CHARLITERAL 	
	| STRINGLITERAL 	
	| BOOLEANLITERAL
	| NULLLITERAL
	;

Expression: 
	Expression1 (AssignmentOperator Expression1)?
	;
	
AssignmentOperator:
	'=' 
	| '+=' 
	| '-=' 
	| '*=' 
	| '/=' 	
	;

Type: 
	BasicType
	| Identifier BracketsOpt
	;

StatementExpression: 
	Expression
	;

ConstantExpression: 
	Expression
	;

Expression1: 
	Expression2 // (Expression1Rest)?
	;

/* Expression1Rest: 
	[  ?   Expression   :   Expression1]
*/

Expression2 : 
	Expression3 (Expression2Rest)?
	;


Expression2Rest: 
	(Infixop Expression3)*
	| Expression3 'instanceof' Type
	;

Infixop:
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

Expression3: 
	PrefixOp Expression3
	| '('   ( /*Expr |*/ Type)   ')'   Expression3
	| Primary (Selector)* (PostfixOp)*
	;

Primary: 
	| '(' Expression ')'
	| 'this' (Arguments)?
	| 'super' SuperSuffix
	| Literal
	| 'new' Creator
	| Identifier ( '.' Identifier )* (IdentifierSuffix)?
	| BasicType BracketsOpt '.class'
	| 'void.class'
	;

IdentifierSuffix:
	'[' 
		( 
		  (']' BracketsOpt   '.class') 
		| ( Expression ']')
		)
	| Arguments
	| '.'   ( 'class' | 'this' | ('super' Arguments) /*| ('new' InnerCreator)*/ )
	;

PrefixOp:
	'++' 
	| '--' 
	| '!' 
	// ~ 
	| '+' 
	| '-'
	; 

PostfixOp: 
	'++'
	| '--'
	; 

Selector: 
	'.' Identifier (Arguments)?
	 //. this
	 // . super SuperSuffix // delete
	 // . new InnerCreator // delete
	| '[' Expression ']'
	;
	
SuperSuffix: 
	Arguments 
	| '.' Identifier (Arguments)?
	;


fragment
IntegerNumber
    :   '0' 
    |   '1'..'9' Digit*    
    ;
BasicType: 
	'byte' 
	| 'short'
	| 'char' 
	| 'int' 
	| 'long' 
	| 'float'
	| 'double'
	| 'boolean'
	;

ArgumentsOpt: 
	(Arguments)?
	;

Arguments: 
	'(' (Expression (',' Expression)*)? ')'
	;
	
BracketsOpt: 
	('[]')*
	;

Creator: 
	/*Qualified*/Identifier ( ArrayCreatorRest  | ClassCreatorRest )
	;

/*InnerCreator: 
	Identifier ClassCreatorRest
	;
*/
ArrayCreatorRest: 
	'[' ( (']' BracketsOpt ArrayInitializer) | (Expression ']' ('[' Expression ']')* BracketsOpt ) )
	; 
	
ClassCreatorRest: 
	Arguments // (ClassBody)?
	;

ArrayInitializer: 
	'{' (VariableInitializer (',' VariableInitializer)* (',')?)? '}'
	;

VariableInitializer: 
	ArrayInitializer
	| Expression
	;

ParExpression: 
	( Expression )
	;

Block: 
	'{' BlockStatements '}'
	;

BlockStatements: 
	(BlockStatement)*
	;

BlockStatement : 
	LocalVariableDeclarationStatement
	| ClassOrInterfaceDeclaration
	| (Identifier ':')? Statement
	;

LocalVariableDeclarationStatement:
	/*(final)?*/ Type VariableDeclarators ';'   
	;  

Statement:
	Block
	| 'if' ParExpression Statement ('else' Statement)?
	| 'for' '(' ForInit   ';'   (Expression)?   ';'   ForUpdate ')' Statement
	| 'while' ParExpression Statement
	| 'do' Statement 'while' ParExpression ';' 
	// | 'try' Block ( Catches | [Catches] 'finally' Block )
	// switch ParExpression { SwitchBlockStatementGroups }
	// synchronized ParExpression Block
	| 'return' (Expression)? ';' 
	// | throw Expression   ; 
	// break [Identifier]
	// continue [Identifier]
	| ';' 
	| StatementExpression //ExpressionStatement
	| Identifier   ':'   Statement
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
MoreStatementExpressions: 
	( ',' StatementExpression )*
	;

ForInit: 
	StatementExpression MoreStatementExpressions
	| /*[final]*/ Type VariableDeclarators
	;

ForUpdate: 
	StatementExpression MoreStatementExpressions
	;

ModifiersOpt: 
	/*(*/ Modifier // )*
	;

Modifier: 
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

VariableDeclarators: 
	VariableDeclarator ( ','   VariableDeclarator )*
	;

VariableDeclaratorsRest: 
	VariableDeclaratorRest ( ','   VariableDeclarator )*
	;

ConstantDeclaratorsRest: 
	ConstantDeclaratorRest (','   ConstantDeclarator )*
	;

VariableDeclarator: 
	Identifier VariableDeclaratorRest
	;

ConstantDeclarator: 
	Identifier ConstantDeclaratorRest
	;

VariableDeclaratorRest: 
	BracketsOpt (  '='   VariableInitializer)?
	;

ConstantDeclaratorRest: 
	BracketsOpt   '='   VariableInitializer
	;

VariableDeclaratorId: 
	Identifier BracketsOpt
	;

CompilationUnit: 
	//[package QualifiedIdentifier   ;  ] {ImportDeclaration} 
	/*(*/ TypeDeclaration //)*
	;
/*
ImportDeclaration: 
	import Identifier {   .   Identifier } [   .     *   ] ;  
*/
TypeDeclaration: 
	ClassOrInterfaceDeclaration
	;

ClassOrInterfaceDeclaration: 
	ModifiersOpt ClassDeclaration // | InterfaceDeclaration)
	;

ClassDeclaration: 
	'class' Identifier ('extends' Type)? /*[implements TypeList]*/ ClassBody
	;
/*
InterfaceDeclaration: 
	interface Identifier [extends TypeList] InterfaceBody
*/
TypeList: 
	Type (','   Type)*
	;

ClassBody: 
	'{' (ClassBodyDeclaration)* '}'
	;
/*
InterfaceBody: 
	{ {InterfaceBodyDeclaration} }
*/
ClassBodyDeclaration:
	';' 
	| /*[static]*/ Block
	| ModifiersOpt MemberDecl
	;

MemberDecl:
	MethodOrFieldDecl
	| 'void' Identifier MethodDeclaratorRest
	| Identifier ConstructorDeclaratorRest
	| ClassOrInterfaceDeclaration
	;

MethodOrFieldDecl:
	Type Identifier MethodOrFieldRest
	;

MethodOrFieldRest:
	VariableDeclaratorRest
	| MethodDeclaratorRest
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
MethodDeclaratorRest:
		FormalParameters BracketsOpt /* [throws QualifiedIdentifierList]*/ '(' (MethodBody |   ';')  ')'
		;

VoidMethodDeclaratorRest:
		FormalParameters /*[throws QualifiedIdentifierList]*/ '(' ( MethodBody |   ';')  ')'
		;
/*
InterfaceMethodDeclaratorRest:
	FormalParameters BracketsOpt [throws QualifiedIdentifierList]   ;  

VoidInterfaceMethodDeclaratorRest:
	FormalParameters [throws QualifiedIdentifierList]   ;  
*/
ConstructorDeclaratorRest:
	FormalParameters /*[throws QualifiedIdentifierList]*/ MethodBody
	;
/*
QualifiedIdentifierList: 
	QualifiedIdentifier (  ','   QualifiedIdentifier)*
	;
*/
FormalParameters: 
	'(' (FormalParameter ( ',' FormalParameter)*)? ')'
	;

FormalParameter: 
	/*[final]*/ Type VariableDeclaratorId
	;

MethodBody:
	Block
	;

	
// LEXER

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
			{ skip(); }          
;

COMMENT
    :   '/*'
        (options {greedy=false;} : . )* // ~('*/')
        '*/'
            { skip(); }
    ;

LINE_COMMENT
    :	'//' ~('\n'|'\r')*
            { skip(); }
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
