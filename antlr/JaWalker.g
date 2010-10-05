tree grammar JaWalker;

options {
  tokenVocab=Ja; // import tokens from Ja.tokens
  ASTLabelType=CommonTree;
}

scope JaScope {
	String name;
	Map<String, Type> symbols;
}

@header{
	package jagrammar;
	
	import jagrammar.typehierarchy.*;
	import jagrammar.util.*;
	import java.util.Map;
	import java.util.HashMap;
	import java.util.LinkedList;
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
    	
    	private List<String> formalParameters;
    	
    	/** Verifica se id e' definito in JaScope. Analizza lo stack dall'alto verso il basso
    	 *  controllando la presenza di id ad ogni livello.
 	 */
	private boolean isDefined(String id) {
	    for (int s=$JaScope.size()-1; s>=0; s--) {
	        if ( $JaScope[s]::symbols.containsKey(id) ) {
	            return true;
	        }
	    }
	    return false;
	}
	
	private Type getVariableType(String id) {
	    for (int s=$JaScope.size()-1; s>=0; s--) {
	        if ( $JaScope[s]::symbols.containsKey(id) ) {
	            return $JaScope[s]::symbols.get(id);
	        }
	    }
	    return rt.getField(true, id);
	}
	
	private String getMethodSignature() {
	    StringBuilder list = new StringBuilder("");
	    for(String id : formalParameters) {
	    	list.append($JaScope[0]::symbols.get(id) + " " + id + ", ");
	    }
	    return $JaScope[0]::name + '(' + list.substring(0, list.length() - 2) + ')';
	}
	
	private List<Type> getFormalParametersList() {
	    List types = new LinkedList<Type>();
	    for(String id : formalParameters) {
	    	types.add($JaScope[0]::symbols.get(id));
	    }
	    return types;
	}
	
	private String printArguments(ArrayList<Type> args) {
		if (args == null)
			return "";
		String list = args.toString();
		return list.substring(1, list.length() - 1);
	}
	
	private void addVariableToScope(CommonTree identifier, Type t) { 
	    String id = identifier.getText();
	    int line = identifier.getLine();
	    int pos = identifier.getCharPositionInLine();
	    if(!isDefined(id))
    	    	$JaScope::symbols.put(id, t);
    	    else
    		throw new UnacceptableLocalVariableException(id, getMethodSignature(), line, pos, rt); 
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
	$JaScope::symbols = new HashMap<String, Type>();
	formalParameters = new LinkedList<String>();
}
@after {
	System.out.println("methodAndConstructorDeclaration: " + getMethodSignature());
}
    :   ^(METHOD modifier type  methodDeclaration)			
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

variableDeclarator returns [CommonTree id, Type t]
    :   variableDeclaratorId { $id = $variableDeclaratorId.id; $t = $variableDeclaratorId.t; } (variableInitializer)?
    ;
    
variableDeclaratorId returns [CommonTree id, Type t]
    :	  type IDENTIFIER { $id = $IDENTIFIER; $t = $type.t; }
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
    :	^(FPARM variableDeclaratorId) { formalParameters.add($variableDeclaratorId.id.getText()); addVariableToScope($variableDeclaratorId.id, $variableDeclaratorId.t); } formalParameterDecls?
    |	^(FMULTPARM variableDeclaratorId) { formalParameters.add($variableDeclaratorId.id.getText()); addVariableToScope($variableDeclaratorId.id, $variableDeclaratorId.t);}
    ;
    
methodBody
    :   ^(MBODY block) // il nodo NIL e' ottenuto dallo * di blockStatement*
                       // di conseguenza abbiamo tolto il ? 
    ;

constructorBody
scope JaScope;
@init {
	$JaScope::symbols = new HashMap<String, Type>();
}
@after {
	System.out.println("constructorBody: " + getMethodSignature() + " Scope: " + $JaScope::symbols);
}
    :	^(CBODY explicitConstructorInvocation? blockStatement*)
    ;

explicitConstructorInvocation
    :   ^(CONSTRCALL THIS  arguments?)
    |	^(CONSTRCALL SUPER arguments?)
    ;

literal returns [Type t]
    :   INTLITERAL     { int literal = Integer.parseInt($INTLITERAL.text);
    			 if ((literal >= -128) &&( literal <= 127)) 
    			 	{ $t = BasicType.BYTE; } 
    			 else 
    			 	if ((literal >= -32.768) &&( literal <= 32.767)) 
    			 		{ $t = BasicType.SHORT; } 
    			 	else
    			 		{ $t = BasicType.INT; }
    		       }
    |   LONGLITERAL    { $t = BasicType.LONG;       }
    |   FLOATLITERAL   { $t = BasicType.FLOAT;      }
    |	DOUBLELITERAL  { $t = BasicType.DOUBLE;     }
    |   CHARLITERAL    { $t = BasicType.CHAR;       }
    |   STRINGLITERAL  { $t = ReferenceType.STRING; }
    |   BOOLEANLITERAL { $t = BasicType.BOOLEAN;    }
    |   NULLLITERAL    { $t = NullType.TYPE;        }
    ;

// STATEMENTS / BLOCKS

block
scope JaScope;
@init {
	$JaScope::symbols = new HashMap<String, Type>();
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
    :	^(VARDECL variableDeclarator) // il + della grammatica e' assorbito da blockStatement*
        { addVariableToScope($variableDeclarator.id, $variableDeclarator.t); } 
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
expressionList returns [ArrayList<Type> types]
@init {
	$types = new ArrayList<Type>();
}
    :   (expression { $types.add($expression.t); })+
    ;

statementExpression
    :   expression
    ;
    
constantExpression
    :   expression
    ;
    
expression returns [Type t]
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
    |   selector { $t = $selector.t; }
    |   primary  { $t = $primary.t; }
    ;        
    
primary returns [Type t]
    //:   expression
    :	THIS { $t = rt; }
    |   superMemberAccess { $t = $superMemberAccess.t; }
    |   literal { $t = $literal.t; }
    |   IDENTIFIER { $t = getVariableType($IDENTIFIER.text); 
    		     if ($t == null) throw new CannotFindSymbolException(("variable " + $IDENTIFIER.text), getMethodSignature(), $IDENTIFIER.line, $IDENTIFIER.pos, rt);
    		   }
    //|   ^(METHODCALL THIS IDENTIFIER arguments? ) riconosciuto in selector
    |   ^(DOTCLASS ^(ARRAYTYPE type))  
    |	^(DOTCLASS IDENTIFIER) { $t = new ReferenceType("Class"); }
    |   ^(DOTCLASS primitiveType)
    |   ^(DOTCLASS VOID)
    ;
    
selector returns [Type t]
    :   ^(FIELDACCESS expression IDENTIFIER) 
    	{ if (!($expression.t instanceof ReferenceType))
    	  	throw new CannotBeDereferencedException($expression.t, $IDENTIFIER.line, $IDENTIFIER.pos, rt); 
    	  ReferenceType expt = (ReferenceType)$expression.t;
    	  Type ft;
    	  if (expt.getName() == rt.getName()) 
    	  	ft = expt.getField(true, $IDENTIFIER.text);
    	  else  
    		ft = expt.getField(false, $IDENTIFIER.text);
	  if (ft == null) 
		throw new CannotFindSymbolException(("field " + $IDENTIFIER.text), expt.getName(), $IDENTIFIER.line, $IDENTIFIER.pos, rt);
    	} 
    |	^(METHODCALL expression IDENTIFIER arguments?)
    	{ if (!($expression.t instanceof ReferenceType))
    	  	throw new CannotBeDereferencedException($expression.t, $IDENTIFIER.line, $IDENTIFIER.pos, rt); 
    	  ReferenceType expt = (ReferenceType)$expression.t;
    	  Type mt;
    	  ArrayList<Type> argTypes = $arguments.types; //($arguments.tree == null)?null:$arguments.types;
    	  try {
	    	if (expt.getName() == rt.getName()) 
	    		mt = expt.bindMethod(true, $IDENTIFIER.text, argTypes);
	    	else  
	    		mt = expt.bindMethod(false, $IDENTIFIER.text, argTypes);
    	  } catch (EarlyBindingException ex) {
    	  	throw new CannotFindSymbolException(("method " + $IDENTIFIER.text + '(' + printArguments(argTypes) + ')'), expt.getName(), $IDENTIFIER.line, $IDENTIFIER.pos, rt);
    	  }
    	}
    |   ^(ARRAYACCESS e1= expression e2= expression) 
    	{ /*
    	  if (($e2.t != BasicType.BYTE) && ($e2.t != BasicType.SHORT) && 
    	      ($e2.t != BasicType.CHAR) && ($e2.t != BasicType.INT)) throw new IncompatibleTypesException(); */  
    	}
    ;

creator
    :    arrayCreatorRest 
    |    createdName classCreatorRest? 
    ;


createdName returns [Type t]
    :   classType     { $t= $classType.t;     }
    |   primitiveType { $t= $primitiveType.bs; }
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
   
superMemberAccess returns [Type t]
    :	^(METHODCALL SUPER IDENTIFIER arguments) { $t = rt.getSuperClass().bindMethod(false, $IDENTIFIER.text, $arguments.types); }
    |   ^(FIELDACCESS SUPER IDENTIFIER)          { $t = rt.getSuperClass().getField(false, $IDENTIFIER.text); }
    ;

arguments returns [ArrayList<Type> types]
    :  ^(ARGUMENTS expressionList) { $types = $expressionList.types; }
    ;