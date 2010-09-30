/*tree grammar JaWalker;

options {
  tokenVocab=Ja; // import tokens from Ja.g
  ASTLabelType=CommonTree;
}
*/

compilationUnit
    :  classDeclaration // bisogno di ^ per togliere nil?
    ;
    
classDeclaration
    :   ^(CLASS IDENTIFIER classType? classBody)
    ;
     
classBody
    :   classBodyDeclaration*
    ;

classBodyDeclaration
    :   memberDeclaration
    ;
    
memberDeclaration
    :   ^(METHOD  modifier type  methodDeclaration)
    |	fieldDeclaration			
    |   ^(METHOD modifier VOID IDENTIFIER voidMethodDeclaratorRest)
    |   ^(CONSTR modifier IDENTIFIER formalParameters? constructorBody?)
    ;
    
methodDeclaration
    :   IDENTIFIER formalParameters methodBody
    ;

fieldDeclaration
    :   ^(FIELD modifier variableDeclarator)+ 
    ;
    
voidMethodDeclaratorRest
    :	formalParameters methodBody
    ;

variableDeclarator
    :   variableDeclaratorId (variableInitializer)?
    ;
    
variableDeclaratorId 
    :	  arrayOrType IDENTIFIER
    ;
    
arrayOrType
    :	^(ARRAYTYPE arrayOrType)
    | 	type
    ;	
  

variableInitializer
    :   arrayInitializer
    |   expression
    ;

arrayInitializer
    :   ^(ARRAYINIT variableInitializer (variableInitializer)*) 
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
    :	^(ARRAYTYPE nonPrimitiveType)
    |   classType       			
    |	^(ARRAYTYPE primitiveType)
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
    :   ^(FPARMS formalParameterDecls?)
    |	
    ;
    
formalParameterDecls
    :	^(FPARM variableDeclaratorId) formalParameterDecls?
    |	^(FMULTPARM variableDeclaratorId)
    ;
    
methodBody
    :   ^(MBODY block?)
    ;

constructorBody
    :	^(CBODY explicitConstructorInvocation? blockStatement*)
    ;

explicitConstructorInvocation
    :   ^(CONSTRCALL THIS  arguments?)
    |	^(CONSTRCALL SUPER arguments?)
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
    :   blockStatement*
    ;
    
blockStatement
    :   localVariableDeclarationStatement
    |   statement
    ;
    
localVariableDeclarationStatement
    :	localVariableDeclaration
    ;

localVariableDeclaration
    :	^(VARDECL variableDeclarator)+
    ;
   

statement
    :   ^(BLOCK block)
    |   ^(IF ^(CONDITION parExpression) ^(THEN statement) elseStmt?)
    |   ^(FOR ^(INIT forInit)? ^(CONDITION expression)? ^(UPDATE forUpdate)? statement )
    |   ^(WHILE ^(CONDITION parExpression) statement)
    |   ^(DOWHILE ^(CONDITION parExpression) statement)
    |   ^(RETURN expression?) 
    |   ^(STMT statementExpression)
    ;
    
elseStmt
    :	^(ELSE statement)
    ;

forInit
    :   localVariableDeclaration
    |   expressionList
    ;

forUpdate
    :   expressionList
    ;

parExpression
    :   expression
    ;
    
expressionList
    :   expression (expression)*
    ;

statementExpression
    :   expression
    ;
    
constantExpression
    :   expression
    ;
    
expression
    :   ^(EQ    expression expression)
    |	^(PLUS  expression expression)
    |	^(MINUS expression expression)
    |	^(STAR  expression expression)
    |	^(SLASH expression expression)
    |   ^('||'  expression expression) 	 
    |   ^('&&'  expression expression)
    |   ^('=='  expression expression)
    |   ^('!='  expression expression)
    |	^(INSTANCEOF expression type)
    |	^(COMPAREOP expression expression)
    |   ^('%'   expression expression)
    |	^(UNARYPLUS  unaryExpression) 
    |   ^(UNARYMINUS unaryExpression)
    |   ^(PREINC unaryExpression)
    |   ^(PREDEC unaryExpression)
    |	^('!' expression)
    |   ^(CAST primitiveType expression)
    |   ^(CAST nonPrimitiveType expression)
    |   ^(NEW creator)
    |	^(POSTINC ps)
    |   ^(POSTDEC ps)
    |   ps 
    ;    

ps 
	:  	^(selector ps)
	|  primary
	;    
    
primary
    :   parExpression
    |   THIS 
    |   superMemberAccess
    |   literal
    |   IDENTIFIER
    |   (IDENTIFIER -> IDENTIFIER) ('[' ']' -> ^(ARRAYTYPE $primary))+ ('.' CLASS -> ^(DOTCLASS $primary))
    |   ^(METHODCALL IDENTIFIER arguments? THIS)
    |	^(DOTCLASS IDENTIFIER)
    |   (primitiveType -> primitiveType) ('[' ']' -> ^(ARRAYTYPE $primary))* ('.' CLASS -> ^(DOTCLASS $primary))
    |    ^(DOTCLASS VOID)
    ;
    
selector
    :   '.' IDENTIFIER -> ^(FIELDACCESS {$primary} IDENTIFIER)
    |	'.' IDENTIFIER arguments -> ^(METHODCALL {$primary} IDENTIFIER arguments?)
    |   '[' expression ']'-> ^(ARRAYACCESS {$primary} expression)
    ;

creator
    :    arrayCreatorRest 
    |    classCreatorRest 
    ;


createdName
    :   classType
    |   primitiveType
    ;
    
arrayCreatorRest[CommonTree type]
    :   ('['']' -> ^(ARRAYTYPE  {$type})) ( ('[' ']') -> ^(ARRAYTYPE $arrayCreatorRest) )* 
    		(arrayInitializer  -> $arrayCreatorRest arrayInitializer)    
    |	('[' expression ']' -> ^(ARRAYTYPE  {$type} expression)) ( ('[' expression ']') -> ^(ARRAYTYPE $arrayCreatorRest expression) )*  
    ; 

classCreatorRest[CommonTree type]
    :   arguments -> {$type} arguments
    ;   
   
superMemberAccess 
    :	'.' IDENTIFIER arguments? -> {$arguments.tree != null}? ^( METHODCALL SUPER IDENTIFIER arguments)
    				  -> ^(FIELDACCESS SUPER IDENTIFIER)
    ;

arguments
    :   '(' expressionList? ')' -> {$expressionList.tree != null}? ^(ARGUMENTS expressionList?)
    				->
    ;