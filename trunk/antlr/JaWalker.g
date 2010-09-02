//g ammar JaWalker;

/*options {
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
    :	classType      ^(ARRAYTYPE $nonPrimitiveType)* 			
    |	primitiveType  ^(ARRAYTYPE $nonPrimitiveType)+ 
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
    :   ^(CONSTRCALL THIS  arguments)
    |	^(CONSTRCALL SUPER arguments)
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
    |	^(INSTANCEOF expression type)
    |	^(COMPAREOP expression expression)
    |   ^('!='  expression expression)
    |   ^('%'   expression expression)
    |	'+' expression
    |   '-' expression
    |   '++' expression
    |   '--' expression
    |	'!' expression
    |   '(' primitiveType ')' expression
    |   '(' nonPrimitiveType  ')' expression
    |   ^(NEW creator)
    |   primary  selector^* ('++' | '--')? 
    ;    
primary
    :   parExpression
    |   THIS 
    |   SUPER^ superMemberAccess
    |   literal
    |   IDENTIFIER
    |   (IDENTIFIER -> IDENTIFIER) ('[' ']' -> ^(ARRAYTYPE $primary))+ ('.' CLASS -> ^(DOTCLASS $primary))
    | 	IDENTIFIER  arguments -> ^(METHODCALL IDENTIFIER arguments? THIS)
    |	IDENTIFIER '.' CLASS -> ^(DOTCLASS IDENTIFIER)
    |   (primitiveType -> primitiveType) ('[' ']' -> ^(ARRAYTYPE $primary))* ('.' CLASS -> ^(DOTCLASS $primary))
    |    ^(DOTCLASS VOID)
    ;
    
selector
    :   '.' IDENTIFIER -> ^(FIELDACCESS IDENTIFIER)
    |	'.' IDENTIFIER arguments -> ^(METHODCALL IDENTIFIER arguments?)
    //|   '.' 'this'
    //|   '.' 'super' superSuffix
    |   '[' expression ']'-> ^(ARRAYACCESS expression)
    ;

/* SERVE??
identifierSuffix
    :   ('[' ']')+ '.' CLASS
    |   arguments
    |   '.' CLASS
    ;
*/
creator
    :	createdName arrayCreatorRest 
    |	createdName classCreatorRest
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
    :	'.' IDENTIFIER arguments?	
    ;

arguments
    :   '(' expressionList? ')' -> {$expressionList.tree != null}? ^(ARGUMENTS expressionList?)
    				->
    ;