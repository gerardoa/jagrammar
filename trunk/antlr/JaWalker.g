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
	import jagrammar.exception.*;
	import jagrammar.util.*;
	import java.util.Map;
	import java.util.HashMap;
	import java.util.LinkedList;
}

@members {

	private ErrorLogger errorLog = new ErrorLogger(); 
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
    	
    	
	private Type plusOperation(CommonTree operator, Type op1, Type op2 ) {
	    if (op1 == ReferenceType.STRING || op2 == ReferenceType.STRING) {
	        return ReferenceType.STRING;
	    }
	    return arithmeticOperation(operator, op1, op2);
	}

	private  Type arithmeticOperation(CommonTree operator, Type op1, Type op2) {
	    // controllo che siano numerici o char
	    if ( !(op1.isNumeric() && op2.isNumeric()) ) {
	        throw new CannotBeAppliedToException(operator.getText(), op1.toString(), op2.toString(), operator.getLine(), operator.getCharPositionInLine(), rt);
	    }
	    // promozioni
	    if (op1.isAssignableTo(BasicType.INT)) {
	        op1 = BasicType.INT;
	    }
	    if (op2.isAssignableTo(BasicType.INT)) {
	        op2 = BasicType.INT;
	    }
	    return (op1.isAssignableTo(op2)) ? op2 : op1;	   
	}
	
	private  Type booleanOperation(CommonTree operator, Type op1, Type op2) {
	    // controllo che siano entrambi boolean
	    if ( !(op1 == BasicType.BOOLEAN && op2 == BasicType.BOOLEAN) ) {
	        throw new CannotBeAppliedToException(operator.getText(), op1.toString(), op2.toString(), operator.getLine(), operator.getCharPositionInLine(), rt);
	    }
	    return BasicType.BOOLEAN;
	}
    	
    	/** Verifica che sia stato assegnato un tipo di ritorno a tutte le sottoregole. 
    	*/	
    	private boolean ruleTypeCheck(Type ... rt) {
    	    for (int i = 0; i < rt.length; i++)
        	if (rt[i] == null) return false;
  	    return true;
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
    :   CHAR    { $bs = BasicType.CHAR;    }
    |   BYTE    { $bs = BasicType.BYTE;    }
    |   SHORT   { $bs = BasicType.SHORT;   }
    |   INT     { $bs = BasicType.INT;     }
    |   LONG    { $bs = BasicType.LONG;    }
    |   FLOAT   { $bs = BasicType.FLOAT;   }
    |   DOUBLE  { $bs = BasicType.DOUBLE;  }
    |   BOOLEAN { $bs = BasicType.BOOLEAN; }
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
    :   (blockStatement {{ System.out.println("Statement text: " + $blockStatement.text); }})*
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
    :   ^(EQ    e1=expression e2=expression)  
    |	^(PLUS  e1=expression e2=expression)  { $t = plusOperation($PLUS, $e1.t, $e2.t);        }
    |	^(MINUS e1=expression e2=expression)  { $t = arithmeticOperation($MINUS, $e1.t, $e2.t); }
    |	^(STAR  e1=expression e2=expression)  { $t = arithmeticOperation($STAR, $e1.t, $e2.t);  }
    |	^(SLASH e1=expression e2=expression)  { $t = arithmeticOperation($SLASH, $e1.t, $e2.t); }
    |   ^(or='||'  e1=expression e2=expression)  { $t = booleanOperation($or, $e1.t, $e2.t);  }
    |   ^(and='&&'  e1=expression e2=expression) { $t = booleanOperation($and, $e1.t, $e2.t); }
    |   ^(eq='=='  e1=expression e2=expression)  { $t = booleanOperation($eq, $e1.t, $e2.t);  }
    |   ^(nq='!='  expression expression)        { $t = booleanOperation($nq, $e1.t, $e2.t);  }
    |	^(INSTANCEOF e=expression type)
        { if ( !($e.t.isComplexType() || $e.t.isNull()) ) throw new UnexpectedTypeException("reference", $e.t.toString(), $INSTANCEOF.line, $INSTANCEOF.pos, rt);
          if (!$type.t.isComplexType()) throw new UnexpectedTypeException("class or array", $type.t.toString(), $INSTANCEOF.line, $INSTANCEOF.pos, rt);
          if (!$e.t.isCastableTo($type.t)) throw new InconvertibleTypesException($type.t.toString(), $e.t.toString(), $INSTANCEOF.line, $INSTANCEOF.pos, rt);
          $t = BasicType.BOOLEAN; 
        }
    |	^(COMPAREOP e1=expression e2=expression)
    	{ if ( !($e1.t.isNumeric() && $e2.t.isNumeric()) ) {
	  	throw new CannotBeAppliedToException($COMPAREOP.text, $e1.t.toString(), $e2.t.toString(), $COMPAREOP.line, $COMPAREOP.pos, rt);
	  }
    	  $t = BasicType.BOOLEAN; 
    	}
    |   ^(mod='%'   e1=expression e2=expression) { $t = arithmeticOperation($mod, $e1.t, $e2.t); }
    |   ^( op=(UNARYPLUS| UNARYMINUS| PREINC | PREDEC) e=expression) 
        { if (!$e.t.isNumeric()) {
    	  	throw new CannotBeAppliedToException($op.text, $e.t.toString(), "", $op.line, $op.pos, rt);
    	  }
    	  $t = $e.t;
    	}
    //|	  ^(UNARYPLUS  e=expression) 
    //|   ^(UNARYMINUS e=expression)
    //|   ^(PREDEC expression)  
    |	^(op='!' e=expression)
    	{ if (!($e.t == BasicType.BOOLEAN)) {
    	  	throw new CannotBeAppliedToException($op.text, $e.t.toString(), "", $op.line, $op.pos, rt);
    	  }
    	  $t = BasicType.BOOLEAN;
    	}
    |   ^(CAST pt=primitiveType e=expression)
    	{ System.out.println($CAST.text + "  " + $pt.text + "  " + $e.text); 
    	  if (!$e.t.isCastableTo($pt.bs))
    		throw new InconvertibleTypesException($pt.bs.toString(), $e.t.toString(), $CAST.line, $CAST.pos, rt);
    	  $t = $pt.bs;
    	}
    |   ^(CAST npt=nonPrimitiveType e=expression)
    	{ if (!$e.t.isCastableTo($npt.t))
    		throw new InconvertibleTypesException($npt.t.toString(), $e.t.toString(), $CAST.line, $CAST.pos, rt);
    	  $t = $npt.t;
    	}
    |   ^(NEW creator) { $t = $creator.t; }
    |	^(op=(POSTINC | POSTDEC) (e=selector | e=primary))
     	{ if (!$e.t.isNumeric()) {
    	  	throw new CannotBeAppliedToException($op.text, $e.t.toString(), "", $op.line, $op.pos, rt);
    	  }
    	  $t = $e.t;
    	}
    //|   ^(POSTDEC (selector | primary))
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
    |   ^(DOTCLASS ^(ARRAYTYPE type)) { $t = ReferenceType.CLASS; }  
    |	^(DOTCLASS IDENTIFIER)        { $t = ReferenceType.CLASS; }
    |   ^(DOTCLASS primitiveType)     { $t = ReferenceType.CLASS; }
    |   ^(DOTCLASS VOID)              { $t = ReferenceType.CLASS; }
    ;
    
selector returns [Type t]
    :   ^(FIELDACCESS expression IDENTIFIER) 
    	{ if (!$expression.t.isReference())
    	  	throw new CannotBeDereferencedException($expression.t, $IDENTIFIER.line, $IDENTIFIER.pos, rt); 
    	  ReferenceType expt = (ReferenceType)$expression.t;
    	  if (expt.getName() == rt.getName()) 
    	  	$t = expt.getField(true, $IDENTIFIER.text);
    	  else  
    		$t = expt.getField(false, $IDENTIFIER.text);
	  if ($t == null) 
		throw new CannotFindSymbolException(("field " + $IDENTIFIER.text), expt.getName(), $IDENTIFIER.line, $IDENTIFIER.pos, rt);
    	} 
    |	^(METHODCALL expression IDENTIFIER arguments?)
    	{ if (!$expression.t.isReference())
    	  	throw new CannotBeDereferencedException($expression.t, $IDENTIFIER.line, $IDENTIFIER.pos, rt); 
    	  ReferenceType expt = (ReferenceType)$expression.t;
    	  ArrayList<Type> argTypes = $arguments.types; //($arguments.tree == null)?null:$arguments.types;
    	  try {
	    	if (expt.getName() == rt.getName()) 
	    		$t = expt.bindMethod(true, $IDENTIFIER.text, argTypes);
	    	else  
	    		$t = expt.bindMethod(false, $IDENTIFIER.text, argTypes);
    	  } catch (EarlyBindingException ex) {
    	  	throw new CannotFindSymbolException(("method " + $IDENTIFIER.text + '(' + printArguments(argTypes) + ')'), expt.getName(), $IDENTIFIER.line, $IDENTIFIER.pos, rt);
    	  }
    	}
    |   ^(ARRAYACCESS e1=expression e2=expression) 
    	{ if (!$e1.t.isArray()) throw new ArrayRequiredException($e1.t.toString(), $ARRAYACCESS.line, $ARRAYACCESS.pos, rt);
    	  if (!$e2.t.isAssignableTo(BasicType.INT)) {
    	  	if ($e2.t.isCastableTo(	BasicType.INT)) {
    	  		throw new PossibleLossOfPrecisionException(BasicType.INT.toString(), $e2.t.toString(), $ARRAYACCESS.line, $ARRAYACCESS.pos, rt);
    	  	} else {
    	  		throw new IncompatibleTypesException(BasicType.INT.toString(), $e2.t.toString(), $ARRAYACCESS.line, $ARRAYACCESS.pos, rt);
    	  	}    	       
    	  }
    	  $t = ((ArrayType)$e1.t).getHostType(); 
    	}
    ;

creator returns [Type t]
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