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
	import jagrammar.typehierarchy.exception.EarlyBindingException;
	import jagrammar.util.*;
	import java.util.Map;
	import java.util.HashMap;
	import java.util.LinkedList;
}

@members {

	private ErrorLogger errorLog;
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
	    String parameters = formalParameters.toString();
	    parameters = formalParameters.size() > 0 ? parameters.substring(1, parameters.length() - 1) : "";
	    return $JaScope[0]::name + '(' + parameters + ')';
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
    		errorLog.add(new UnacceptableLocalVariableException(id, getMethodSignature(), line, pos)); 
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
	        errorLog.add(new CannotBeAppliedToException(operator.getText(), op1.toString(), op2.toString(), operator.getLine(), operator.getCharPositionInLine()));
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
	        errorLog.add(new CannotBeAppliedToException(operator.getText(), op1.toString(), op2.toString(), operator.getLine(), operator.getCharPositionInLine()));
	    }
	    return BasicType.BOOLEAN;
	}
	
	private  Type assignOperation(CommonTree equal, Type var, Type expr) {
	    if (!expr.isAssignableTo(var)) {
	    	if (expr.isNumeric() && expr.isCastableTo(var))
			errorLog.add(new PossibleLossOfPrecisionException(var.toString(), expr.toString(), equal.getLine(), equal.getCharPositionInLine()));
		else 
			errorLog.add(new IncompatibleTypesException(var.toString(), expr.toString(), equal.getLine(), equal.getCharPositionInLine()));    	       
	    }
	    return var;
	}
	
	/** Controlla che le dimensioni degli array sono specificati correttamente, ovvero con un numero di tipo intero
	*/
	private void arrayExprCheck(CommonTree bracket, Type expr) {
	    if (!expr.isAssignableTo(BasicType.INT)) {
	    	if (expr.isCastableTo(BasicType.INT))
			errorLog.add(new PossibleLossOfPrecisionException(BasicType.INT.toString(), expr.toString(), bracket.getLine(), bracket.getCharPositionInLine()));
		else 
			errorLog.add(new IncompatibleTypesException(BasicType.INT.toString(), expr.toString(), bracket.getLine(), bracket.getCharPositionInLine()));    	       
	    }
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
@after {
	System.out.flush();
	try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
        }
	System.err.println("ERROR LOG:\n" + errorLog);
	System.err.flush();
	 try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
        }
}
    :  classDeclaration
    ;
    
classDeclaration
    :   ^(CLASS IDENTIFIER { errorLog= new ErrorLogger($IDENTIFIER.text); } classType? classBody)
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
    :   IDENTIFIER { $JaScope::name = $IDENTIFIER.text; } formalParameters? methodBody
    ;

fieldDeclaration
    :   ^(FIELD modifier variableDeclarator) // il + e' assorbito dalla * di classBodyDeclaration*
    ;
    
voidMethodDeclaratorRest
    :	formalParameters? methodBody
    ;

variableDeclarator returns [CommonTree id, Type t]
    :   variableDeclaratorId { $id = $variableDeclaratorId.id; $t = $variableDeclaratorId.t; } (variableInitializer[$variableDeclaratorId.t, $variableDeclaratorId.id])?
    ;
    
variableDeclaratorId returns [CommonTree id, Type t]
    :	  type IDENTIFIER { $id = $IDENTIFIER; $t = $type.t; }
    ;
    
variableInitializer [Type tin, CommonTree token] 
    :   { if($tin.isArray()) {
    	  	$tin = ((ArrayType)$tin).getHostType();
    	  } else {
    	  	errorLog.add(new IllegalArrayInitializerException($tin.toString(), token.getLine(), token.getCharPositionInLine()));
    	  }
    	} 
    	arrayInitializer[$tin]
    	
    |   e=expression 
        { if (ruleTypeCheck($e.t)) {
	  	assignOperation(token, $tin, $e.t);
      	  }
        } 
    ;

arrayInitializer [Type tin]
    :   ^(ARRAYINIT variableInitializer[$tin, $ARRAYINIT]*)
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
    :	IDENTIFIER 
    	{ $t = cTab.get($IDENTIFIER.text); 
    	  if ($t == null) errorLog.add(new CannotFindSymbolException(("class " + $IDENTIFIER.text), "class " + rt.toString(), $IDENTIFIER.line, $IDENTIFIER.pos));
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
    
formalParameters
    :   ^(FPARMS formalParameterDecls?)	
    ;
    
formalParameterDecls
    :	^(FPARM variableDeclaratorId) { formalParameters.add($variableDeclaratorId.t.toString()); addVariableToScope($variableDeclaratorId.id, $variableDeclaratorId.t); } formalParameterDecls?
//    |	^(FMULTPARM variableDeclaratorId) { formalParameters.add($variableDeclaratorId.id.getText()); addVariableToScope($variableDeclaratorId.id, $variableDeclaratorId.t);}
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
        { Type[] args;
          if($arguments.types == null || ruleTypeCheck($arguments.types.toArray(args = new Type[$arguments.types.size()]))) {
	    	  try {
			rt.bindConstructor($arguments.types);
	    	  } catch (EarlyBindingException ex) {
	    	  	errorLog.add(new CannotFindSymbolException(("constructor " + rt.toString() + '(' + printArguments($arguments.types) + ')'), "class " + rt.toString(), $THIS.line, $THIS.pos));
	    	  }
    	  } 
    	}
    |	^(CONSTRCALL SUPER arguments?)
    	{ Type[] args;
    	  ReferenceType sc = rt.getSuperClass();
    	  if( $arguments.types == null || ruleTypeCheck($arguments.types.toArray(args = new Type[$arguments.types.size()])) ) {
	    	  try {
			 sc.bindConstructor($arguments.types);
		  } catch (EarlyBindingException ex) {
			errorLog.add(new CannotFindSymbolException(("constructor " + sc.toString() + '(' + printArguments($arguments.types) + ')'), "class " + sc.toString(), $SUPER.line, $SUPER.pos));
		  }
	  }
    	}
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
	System.out.println("block symbols: " + $JaScope::symbols);
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
    |   ^(IF condition (^(THEN statement))? elseStmt?)
    |   ^(FOR (^(INIT forInit))? condition? (^(UPDATE forUpdate))? statement )
    |   ^(WHILE condition statement)
    |   ^(DOWHILE condition statement)
    |   ^(RETURN expression?) 
    |   ^(STMT statementExpression)
    ;
    
condition
    :	^(CONDITION expression)
        { if (ruleTypeCheck($expression.t)) {
    	  	if (!($expression.t == BasicType.BOOLEAN)) errorLog.add(new IncompatibleTypesException(BasicType.BOOLEAN.toString(), $expression.t.toString(), $CONDITION.line, $CONDITION.pos));
    	  }	
    	}
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
 
expression returns [Type t]
    :   ^(EQ e1=expression e2=expression) 
    	{ if(ruleTypeCheck($e1.t, $e2.t)) {
	  	$t = getVariableType($e1.text);
	    	if ($t == null) 
	    		errorLog.add(new UnexpectedTypeException("variable", "value", $EQ.line, $EQ.pos));
	    	else
	    	  	$t = assignOperation($EQ, $e1.t, $e2.t);
	  } 
    	}
    |	^(PLUS    e1=expression e2=expression) { if(ruleTypeCheck($e1.t, $e2.t)) $t = plusOperation($PLUS, $e1.t, $e2.t); }
    |	^(MINUS   e1=expression e2=expression) { if(ruleTypeCheck($e1.t, $e2.t)) $t = arithmeticOperation($MINUS, $e1.t, $e2.t); }
    |	^(STAR    e1=expression e2=expression) { if(ruleTypeCheck($e1.t, $e2.t)) $t = arithmeticOperation($STAR,  $e1.t, $e2.t); }
    |	^(SLASH   e1=expression e2=expression) { if(ruleTypeCheck($e1.t, $e2.t)) $t = arithmeticOperation($SLASH, $e1.t, $e2.t); }
    |   ^(mod='%' e1=expression e2=expression) { if(ruleTypeCheck($e1.t, $e2.t)) $t = arithmeticOperation($mod,   $e1.t, $e2.t); }
    |   ^(or='||'  e1=expression e2=expression) { if(ruleTypeCheck($e1.t, $e2.t)) $t = booleanOperation($or,  $e1.t, $e2.t); }
    |   ^(and='&&' e1=expression e2=expression) { if(ruleTypeCheck($e1.t, $e2.t)) $t = booleanOperation($and, $e1.t, $e2.t); }
    |   ^(eq='=='  e1=expression e2=expression) { if(ruleTypeCheck($e1.t, $e2.t)) $t = booleanOperation($eq,  $e1.t, $e2.t); }
    |   ^(nq='!='  e1=expression e2=expression) { if(ruleTypeCheck($e1.t, $e2.t)) $t = booleanOperation($nq,  $e1.t, $e2.t); }
    |	^(INSTANCEOF e=expression type)
        { if(ruleTypeCheck($e.t, $type.t)) { 
	          if ( !($e.t.isComplexType() || $e.t.isNull()) ) errorLog.add(new UnexpectedTypeException("reference", $e.t.toString(), $INSTANCEOF.line, $INSTANCEOF.pos));
	          if (!$type.t.isComplexType()) errorLog.add(new UnexpectedTypeException("class or array", $type.t.toString(), $INSTANCEOF.line, $INSTANCEOF.pos));
	          if (!$e.t.isCastableTo($type.t)) errorLog.add(new InconvertibleTypesException($type.t.toString(), $e.t.toString(), $INSTANCEOF.line, $INSTANCEOF.pos));
	          $t = BasicType.BOOLEAN;
          } 
        }
    |	^(COMPAREOP e1=expression e2=expression)
    	{ if(ruleTypeCheck($e1.t, $e2.t)) { 
	    	  if ( !($e1.t.isNumeric() && $e2.t.isNumeric()) ) errorLog.add(new CannotBeAppliedToException($COMPAREOP.text, $e1.t.toString(), $e2.t.toString(), $COMPAREOP.line, $COMPAREOP.pos));
	    	  $t = BasicType.BOOLEAN;
    	  } 
    	}
    |   ^( op=(UNARYPLUS| UNARYMINUS| PREINC | PREDEC) e=expression) 
        { if(ruleTypeCheck($e.t)) { 
	          if (!$e.t.isNumeric()) errorLog.add(new CannotBeAppliedToException($op.text, $e.t.toString(), "", $op.line, $op.pos));
	    	  $t = $e.t;
    	  }
    	}
    //|	  ^(UNARYPLUS  e=expression) 
    //|   ^(UNARYMINUS e=expression)
    //|   ^(PREDEC expression)  
    |	^(op='!' e=expression)
    	{ if(ruleTypeCheck($e.t)) {
	    	  if (!($e.t == BasicType.BOOLEAN)) errorLog.add(new CannotBeAppliedToException($op.text, $e.t.toString(), "", $op.line, $op.pos));
	    	  $t = BasicType.BOOLEAN;
    	  }
    	}
    |   ^(CAST pt=primitiveType e=expression)
    	{ if(ruleTypeCheck($pt.bs, $e.t)) {
	    	  if (!$e.t.isCastableTo($pt.bs)) errorLog.add(new InconvertibleTypesException($pt.bs.toString(), $e.t.toString(), $CAST.line, $CAST.pos));
	    	  $t = $pt.bs;
    	  }
    	}
    |   ^(CAST npt=nonPrimitiveType e=expression)
    	{ if(ruleTypeCheck($npt.t, $e.t)) {
	    	  if (!$e.t.isCastableTo($npt.t)) errorLog.add(new InconvertibleTypesException($npt.t.toString(), $e.t.toString(), $CAST.line, $CAST.pos));
	    	  $t = $npt.t;
    	  }
    	}
    |   ^(NEW creator) { $t = $creator.t; }
    |	^(op=(POSTINC | POSTDEC) (sp=selector | sp=primary))
     	{ if (!$sp.t.isNumeric()) {
    	  	throw new CannotBeAppliedToException($op.text, $sp.t.toString(), "", $op.line, $op.pos);
    	  }
    	  $t = $sp.t;
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
    		     if ($t == null) errorLog.add(new CannotFindSymbolException(("variable " + $IDENTIFIER.text), getMethodSignature(), $IDENTIFIER.line, $IDENTIFIER.pos));
    		   }
    //|   ^(METHODCALL THIS IDENTIFIER arguments? ) riconosciuto in selector
    |   ^(DOTCLASS ^(ARRAYTYPE type)) { $t = ReferenceType.CLASS; }  
    |	^(DOTCLASS IDENTIFIER)        { $t = ReferenceType.CLASS; }
    |   ^(DOTCLASS primitiveType)     { $t = ReferenceType.CLASS; }
    |   ^(DOTCLASS VOID)              { $t = ReferenceType.CLASS; }
    ;
    
selector returns [Type t]
    :   ^(FIELDACCESS expression IDENTIFIER) 
    	{ if(ruleTypeCheck($expression.t)) {
	    	  if (!$expression.t.isReference())
	    	  	errorLog.add(new CannotBeDereferencedException($expression.t.toString(), $IDENTIFIER.line, $IDENTIFIER.pos)); 
	    	  ReferenceType expt = (ReferenceType)$expression.t;
	    	  boolean isSameClass = (expt.getName().equals(rt.getName())); 
	    	  $t = expt.getField(isSameClass, $IDENTIFIER.text);
		  if ($t == null) errorLog.add(new CannotFindSymbolException(("field " + $IDENTIFIER.text), expt.getName(), $IDENTIFIER.line, $IDENTIFIER.pos));
    	  }
    	} 
    |	^(METHODCALL expression IDENTIFIER arguments?)
        { Type[] args;
          // Se ci sono argomenti, bisogna richiamare ruleTypeCheck su di essi
          if( ruleTypeCheck($expression.t) && ($arguments.types == null || ruleTypeCheck($arguments.types.toArray(args = new Type[$arguments.types.size()]))) ) {
	    	  if (!$expression.t.isReference())
	    	  	errorLog.add(new CannotBeDereferencedException($expression.t.toString(), $IDENTIFIER.line, $IDENTIFIER.pos)); 
	    	  ReferenceType expt = (ReferenceType)$expression.t;
	    	  ArrayList<Type> argTypes = $arguments.types; //($arguments.tree == null)?null:$arguments.types;
	    	  try {
		    	boolean isSameClass = (expt.getName().equals(rt.getName())); 
		    	$t = expt.bindMethod(isSameClass, $IDENTIFIER.text, argTypes);
	    	  } catch (EarlyBindingException ex) {
	    	  	errorLog.add(new CannotFindSymbolException(("method " + $IDENTIFIER.text + '(' + printArguments(argTypes) + ')'), expt.getName(), $IDENTIFIER.line, $IDENTIFIER.pos));
	    	  }
    	  }
    	}
    |   ^(ARRAYACCESS e1=expression e2=expression) 
    	{ if (ruleTypeCheck($e1.t, $e2.t)) {
	    	  if (!$e1.t.isArray()) errorLog.add(new ArrayRequiredException($e1.t.toString(), $ARRAYACCESS.line, $ARRAYACCESS.pos));
	    	  arrayExprCheck($ARRAYACCESS, $e2.t);
	    	  $t = ((ArrayType)$e1.t).getHostType(); 
    	  }
    	}
    ;

creator returns [Type t]
    :    acr=arrayCreatorRest arrayInitializer[$acr.t.getHostType()]?
    |    createdName classCreatorRest? 
    ;


createdName returns [Type t]
    :   classType     { $t = $classType.t;      }
    |   primitiveType { $t = $primitiveType.bs; }
    ;
    
arrayCreatorRest returns [ArrayType t]
    :  ^(ARRAYTYPE acr=arrayCreatorRest) 
       { if (ruleTypeCheck($acr.t)) $t = (ArrayType)ParserHelper.createArrayType($acr.t, 1); }
    |	^(ARRAYTYPE createdName) { if (ruleTypeCheck($createdName.t)) $t = (ArrayType)ParserHelper.createArrayType($createdName.t, 1); }
    |   ^(ARRAYTYPE e=expression acre=arrayCreatorRestExpr) 
    	{ if (ruleTypeCheck($acre.t)) $t = (ArrayType)ParserHelper.createArrayType($acre.t, 1); 
    	  if (ruleTypeCheck($e.t)) arrayExprCheck($ARRAYTYPE, $e.t);
       	}
    ;

arrayCreatorRestExpr returns [Type t]
    :  (^(ARRAYTYPE e=expression acr=arrayCreatorRest))
       { if (ruleTypeCheck($acr.t)) $t = (ComplexType)ParserHelper.createArrayType($acr.t, 1); 
    	 if (ruleTypeCheck($e.t)) arrayExprCheck($ARRAYTYPE, $e.t);
       }
    |  createdName { if (ruleTypeCheck($createdName.t)) $t = $createdName.t; }
    ;

classCreatorRest returns [ArrayList<Type> types]
    :   arguments { $types = $arguments.types; }
    ;     
   
superMemberAccess returns [Type t]
    :	^(METHODCALL SUPER IDENTIFIER arguments?) 
    	{ if( $arguments.types == null || ruleTypeCheck((Type[])$arguments.types.toArray()) ) {
	    	  try {
	          	$t = rt.getSuperClass().bindMethod(false, $IDENTIFIER.text, $arguments.types);
		  } catch (EarlyBindingException ex) {
		   	errorLog.add(new CannotFindSymbolException(("method " + $IDENTIFIER.text + '(' + printArguments($arguments.types) + ')'), rt.getSuperClass().getName(), $IDENTIFIER.line, $IDENTIFIER.pos));
		  }
	  }
    	}
    |   ^(FIELDACCESS SUPER IDENTIFIER)          
    	{ $t = rt.getSuperClass().getField(false, $IDENTIFIER.text);
	  if ($t == null) errorLog.add(new CannotFindSymbolException(("field " + $IDENTIFIER.text), rt.getSuperClass().getName(), $IDENTIFIER.line, $IDENTIFIER.pos)); 
	}
    ;

arguments returns [ArrayList<Type> types]
    :  ^(ARGUMENTS expressionList) { $types = $expressionList.types; }
    ;