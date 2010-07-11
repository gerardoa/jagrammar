tree grammar JaWalker;

options {
  tokenVocab=Ja; // import tokens from Ja.g
  ASTLabelType=CommonTree;
}

compilationUnit
    :  classDeclaration // bisogno di ^ per togliere nil?
    ;
    
classDeclaration
    :   ^(CLASS IDENTIFIER type? classBody)
    ;
     
classBody
    :   classBodyDeclaration*
    ;

classBodyDeclaration
    :   memberDeclaration
    ;
    
memberDeclaration
    :   ^(METHOD  modifier type  methodDeclaration)
    |	^(FIELD modifier type variableDeclarator) 				
    |   ^(METHOD modifier VOID IDENTIFIER voidMethodDeclaratorRest)
    |   ^(CONSTR modifier IDENTIFIER formalParameters constructorBody)
    ;

methodDeclaration
    :   IDENTIFIER formalParameters methodBody
    ;

fieldDeclaration
    :   variableDeclarator (',' variableDeclarator)* ';' -> 
    ;
    
voidMethodDeclaratorRest
    :   formalParameters methodBody
    ;

variableDeclarator
    :   variableDeclaratorId ('='! variableInitializer)? //-> variableDeclaratorId ^(INIT variableInitializer)?
    ;
    
variableDeclaratorId  returns [int arrayDim]
    :   IDENTIFIER (l+='[' ']')* {arrayDim = l.size();} 
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

type returns [Type t]
    :	nonPrimitiveType {t=$nonPrimitiveType.t;}
    |	primitiveType {t=$primitiveType.bs;}
    ;
	
nonPrimitiveType returns [ComplexType t]
    :	classType (l+='[' ']')* {t = createArrayType($classType.t, l.size());}
    |	primitiveType (l+='[' ']')+ {t = createArrayType($primitiveType.t, l.size());}
    ;
    

classType returns [ReferenceType t]
    :	IDENTIFIER { if(cTab.containsKey($IDENTIFIER.text)) {
        			t = cTab.get($IDENTIFIER.text);
       			} else {
       				t = new ReferenceType($IDENTIFIER.text);
       				cTab.put($IDENTIFIER.text, t);
       				todo.add($IDENTIFIER.text);	
       			}
       		  }
    ;

primitiveType returns [BasicType bs]
    :   CHAR {bs=BacisType.CHAR;}
    |   BYTE {bs=BacisType.BYTE;}
    |   SHORT {bs=BacisType.SHORT;}
    |   INT {bs=BacisType.INT;}
    |   LONG {bs=BacisType.LONG;}
    |   FLOAT {bs=BacisType.FLOAT;}
    |   DOUBLE {bs=BacisType.DOUBLE;}
    ;
    
formalParameters
@init {
	ArrayList<Type> args = new ArrayList<Type>();
}
    :   '(' formalParameterDecls[args]? ')' -> {$formalParameterDecls.tree != null}? ^(FPARMS formalParameterDecls?)
    				      ->
    ;
    
formalParameterDecls[ArrayList<Type> args]
    :  type variableDeclaratorId (',' formalParameterDecls)? {if($variableDeclaratorId.arrayDim > 0) {
    								 args.add(createArrayType($type.t, $variableDeclaratorId.arrayDim);
    								} else {
    								 args.add($type.t);
    								}
    							     }
    
    } -> ^(FPARM type variableDeclaratorId) formalParameterDecls?
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
    :    blockStatement*
    ;
    
blockStatement
    :   localVariableDeclarationStatement
    |   statement
    ;
    
localVariableDeclarationStatement
    :    localVariableDeclaration 
    ;

localVariableDeclaration
    :   ^(VARDECL type variableDeclarator)+
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
    
elseStmt:	
	(ELSE) => ELSE^ statement
	|
	;

forInit
    :   localVariableDeclaration
    |   expressionList
    ;

forUpdate
    :   expressionList
    ;

// EXPRESSIONS

parExpression
    :   expression
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
    :  ^('=' orExpression expression)
    |  ^(EQ orExpression ^(PLUS  orExpression expression))
    |  ^(EQ orExpression ^(MINUS orExpression expression))
    |  ^(EQ orExpression ^(STAR  orExpression expression))
    |  ^(EQ orExpression ^(SLASH orExpression expression))
    |   orExpression
    ;
    
/*assignmentOperator 
    :   '=' {$c = '='; } //-> ^('=' {$orExp})
    |   '+=' {$c = '+';} //-> ^('+=' {$orExp})
    |   '-=' {$c = '-';}//-> ^('-=' {$orExp})
    |   '*=' {$c = '*';}//-> ^('*=' {$orExp})
    |   '/=' {$c = '/';}//-> ^('=' {$orExp})
    ;
*/

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
    