tree grammar JaWalker;

options {
  tokenVocab=Ja; // import tokens from Ja.tokens
  ASTLabelType=CommonTree;
}

scope JaScope {
	String name;
	
	// Viene utilizzata una lista per mantenere l'ordine dei parametri formali dei metodi e costruttori,
	// in quanto la loro firma viene utilizzata per la corretta visualizzazione degi messaggi di errore.
	LinkedSetList<Variable> symbols;
}

@header{
	package jagrammar;
	
	import jagrammar.typehierarchy.*;
	import jagrammar.util.*;
	import java.util.Map;
	import java.util.HashMap;
}

@members { 
	private Map<String, ReferenceType> cTab = new HashMap<String, ReferenceType>(); // inizializzazione per ANTLRWORKS
	private ReferenceType rt;	
		
	public void setClassTable(Map<String, ReferenceType> m) {
        	cTab = m;
    	}
    	
	public void setReferenceType(ReferenceType rt) {
    		this.rt = rt;
    	}
    	
    	/** Verifica se v e' definito in JaScope. Analizza lo stack dall'alto verso il basso
    	 *  controllando la presenza di v ad ogni livello.
 	 */
	private boolean isDefined(Variable v) {
	    for (int s=$JaScope.size()-1; s>=0; s--) {
	        if ( $JaScope[s]::symbols.contains(v) ) {
	            return true;
	        }
	    }
	    return false;
	}
	
	private String getMethodSignature() {
	    String list = $JaScope[0]::symbols.toString();
	    return $JaScope[0]::name + '(' + list.substring(1, list.length()-1) + ')';
	}
}


compilationUnit
    :  classDeclaration // bisogno di ^ per togliere nil?
    ;
    
classDeclaration
    :   ^(CLASS IDENTIFIER classType? classBody) { System.out.println("Class Declaration in Tree grammar"); }
    ;
     
classBody
    :   classBodyDeclaration*
    ;

classBodyDeclaration
    :   memberDeclaration
    ;
    
memberDeclaration
    :   fieldDeclaration
    |	methodAndConstructorDeclaration
    ;
    
methodAndConstructorDeclaration
scope JaScope;
@init {
	$JaScope::symbols = new LinkedSetList<Variable>();
}
@after {
	System.out.println("methodAndConstructorDeclaration: " + getMethodSignature());
}
    :   ^(METHOD  modifier type  methodDeclaration)			
    |   ^(METHOD modifier VOID IDENTIFIER { $JaScope::name = $IDENTIFIER.text; } voidMethodDeclaratorRest) 	 
    |   ^(CONSTR modifier IDENTIFIER { $JaScope::name = $IDENTIFIER.text; } formalParameters? constructorBody?) 
    ;
    
    
methodDeclaration
    :   IDENTIFIER { $JaScope::name = $IDENTIFIER.text; } formalParameters methodBody
    ;

fieldDeclaration
    :   ^(FIELD modifier variableDeclarator) // il + e' assorbito dalla * di classBodyDeclaration*
    ;
    
voidMethodDeclaratorRest
    :	formalParameters methodBody
    ;

variableDeclarator
    :   variableDeclaratorId (variableInitializer)?
    ;
    
variableDeclaratorId
    :	  type IDENTIFIER { Variable v = new Variable($IDENTIFIER.text, $type.t);
    			    if(!isDefined(v)) 
    			    	$JaScope::symbols.add(v);
    			    else
    			    	throw new UnacceptableLocalVariableException($IDENTIFIER.text, getMethodSignature(), $IDENTIFIER.line, $IDENTIFIER.pos); 
    			  }
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

type returns [Type t]
    :	nonPrimitiveType { $t = $nonPrimitiveType.t; }
    |	primitiveType    { $t = $primitiveType.bs;   }
    ;
	
nonPrimitiveType returns [ComplexType t]
    :	^(ARRAYTYPE npt=nonPrimitiveType) { $t = (ComplexType)ParserHelper.createArrayType($npt.t, 1); }
    |   classType  	  	          { $t = $classType.t; }     			
    |	^(ARRAYTYPE primitiveType)        { $t = (ComplexType)ParserHelper.createArrayType($primitiveType.bs, 1); }
    ;

classType returns [ReferenceType t]
    :	IDENTIFIER { $t = cTab.get($IDENTIFIER.text); }
    ;

primitiveType returns [BasicType bs]
    :   CHAR   { $bs = BasicType.CHAR;   }
    |   BYTE   { $bs = BasicType.BYTE;   }
    |   SHORT  { $bs = BasicType.SHORT;  }
    |   INT    { $bs = BasicType.INT;    }
    |   LONG   { $bs = BasicType.LONG;   }
    |   FLOAT  { $bs = BasicType.FLOAT;  }
    |   DOUBLE { $bs = BasicType.DOUBLE; }
    ;
    
formalParameters
    :   ^(FPARMS formalParameterDecls?)	
    ;
    
formalParameterDecls
    :	^(FPARM variableDeclaratorId) formalParameterDecls?
    |	^(FMULTPARM variableDeclaratorId)
    ;
    
methodBody
    :   ^(MBODY block) // il nodo NIL è ottenuto dallo * di blockStatement*
                       // di conseguenza abbiamo tolto il ? 
    ;

constructorBody
scope JaScope;
@init {
	$JaScope::symbols = new LinkedSetList<Variable>();
}
@after {
	System.out.println("constructorBody: " + getMethodSignature());
}
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
scope JaScope;
@init {
	$JaScope::symbols = new LinkedSetList<Variable>();
}
@after {
	System.out.println("block: " + $JaScope::symbols);
}
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
    :	^(VARDECL variableDeclarator) // il + della grammatica è assorbito da blockStatement*
    ;
   

statement
    :   ^(BLOCK block)
    |   ^(IF ^(CONDITION expression) ^(THEN statement) elseStmt?)
    |   ^(FOR (^(INIT forInit))? (^(CONDITION expression))? (^(UPDATE forUpdate))? statement )
    |   ^(WHILE ^(CONDITION expression) statement)
    |   ^(DOWHILE ^(CONDITION expression) statement)
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

/*parExpression
    :   expression
    ;
*/    
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
    |	^(UNARYPLUS  expression) 
    |   ^(UNARYMINUS expression)
    |   ^(PREINC expression)
    |   ^(PREDEC expression)  
    |	^('!' expression)
    |   ^(CAST primitiveType expression)
    |   ^(CAST nonPrimitiveType expression)
    |   ^(NEW creator)
    |	^(POSTINC (selector | primary))
    |   ^(POSTDEC (selector | primary))
    |   selector
    |   primary 
    ;        
    
primary
    //:   expression
    :	THIS 
    |   superMemberAccess
    |   literal
    |   IDENTIFIER
    |   ^(DOTCLASS ^(ARRAYTYPE type))  
    //|   ^(METHODCALL THIS IDENTIFIER arguments? ) riconosciuto in selector
    |	^(DOTCLASS IDENTIFIER)
    |   ^(DOTCLASS primitiveType)
    |   ^(DOTCLASS VOID)
    ;
    
selector
    :   ^(FIELDACCESS expression IDENTIFIER)
    |	^(METHODCALL expression IDENTIFIER arguments?)
    |   ^(ARRAYACCESS expression expression)
    ;

creator
    :    arrayCreatorRest 
    |    createdName classCreatorRest? 
    ;


createdName
    :   classType
    |   primitiveType
    ;
    
arrayCreatorRest
    :   (^(ARRAYTYPE  createdName) arrayInitializer)   
    |	 ^(ARRAYTYPE  arrayCreatorExpr expression)   
    ; 
    
arrayCreatorExpr
    :	^(ARRAYTYPE arrayCreatorExpr expression)
    | 	createdName 
    ;    

classCreatorRest
    :   arguments
    ;   
   
superMemberAccess 
    :	^(METHODCALL SUPER IDENTIFIER arguments)
    |   ^(FIELDACCESS SUPER IDENTIFIER)
    ;

arguments
    :  ^(ARGUMENTS expressionList)
    ;