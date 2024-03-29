tree grammar JaWalker;

options {
  tokenVocab=Ja; // import tokens from Ja.tokens
  ASTLabelType=CommonTree;  
}

scope JaScope {
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

@members{

	private ErrorLogger errorLog;
	private Map<String, ReferenceType> cTab = new HashMap<String, ReferenceType>(); // inizializzazione per ANTLRWORKS
	private ReferenceType rt;	
		
	public void setClassTable(Map<String, ReferenceType> m) {
        	cTab = m;
    	}
    	
	public void setReferenceType(ReferenceType rt) {
    		this.rt = rt;
    	}
    	
    	public void setErrorLogger(ErrorLogger errorLog){
    		this.errorLog = errorLog;
    	}
    	
    	private ArrayList<Type> formalParameters;
    	
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
	
	/** Restituisce il tipo di id. Controlla se e' definito in JaScope, in caso non viene 
    	 *  trovato verifica se e' un campo dichiarato nella classe.
 	 */
	private Type getVariableType(String id) {
	    for (int s=$JaScope.size()-1; s>=0; s--) {
	        if ( $JaScope[s]::symbols.containsKey(id) ) {
	            return $JaScope[s]::symbols.get(id);
	        }
	    }
	    return rt.getField(true, id);
	}
	
	private String methodName;
	private Type methodReturn;
	
	
	/** Restituisce la firma (nome e la lista dei parametri formali) del metodo correntemente in analisi.  
	 */  
	private String getMethodSignature() {	
	    String parameters = formalParameters.toString();
	    parameters = formalParameters.size() > 0 ? parameters.substring(1, parameters.length() - 1) : "";
	    return methodName + '(' + parameters + ')';
	}
	
	/** Stampa la lista dei parametri formali contenuti nella lista args
	 */
	private String printArguments(ArrayList<Type> args) {
		if (args == null)
			return "";
		String list = args.toString();
		return list.substring(1, list.length() - 1);
	}
	
	
	/* Aggiunge una variabile a JaScope. Se essa e' stata gia' definita precedentemente
	 * registra un errore di tipo UnacceptableLocalVariableException al log.
	 */
	private void addVariableToScope(CommonTree identifier, Type t) {
	    String id = identifier.getText();
	    int line = identifier.getLine();
	    int pos = identifier.getCharPositionInLine();
	    if(!isDefined(id))
    	    	$JaScope::symbols.put(id, t);
    	    else
   		errorLog.add(new UnacceptableLocalVariableException(id, getMethodSignature(), line, pos));
    	}
    	
    	/** Effettua controllo sui tipi degli operandi su cui e' applicato l'operatore '+'. Se almeno uno di essi
    	 *  e' di tipo ReferenceType.STRING si deduce che l'operazione da eseguire e' una concatenazione, 
    	 *  ed il risultato sara' quindi di tipo ReferenceType.STRING. Altrimenti l'operazione e' considerata
    	 *  di somma ed e' affidata al metodo arithmeticOperation.
    	 */
	private Type plusOperation(CommonTree operator, Type op1, Type op2 ) {
	    if (op1 == ReferenceType.STRING || op2 == ReferenceType.STRING) {
	        return ReferenceType.STRING;
	    }
	    return arithmeticOperation(operator, op1, op2);
	}

        /** Effettua i controlli di tipo sugli operandi su cui sono applicati gli operatori aritmetici (somma, 
	 *  sottrazione, divisione, resto della divisione): entrambi operandi devono essere di tipo numerico. 
	 *  In caso contrario registra un errore di tipo CannotBeAppliedToException al log. 
	 *  Per determinare il tipo del risultato dell'operazione si esegue una promozione
	 *  dei tipi degli operandi se essi sono assegnabili a BasicType.INT, dopo di che si 
	 *  prende il tipo "piu' grande" tra i due, cioe' quello a cui ne sono entrambi assegnabili.   
	 */
	private Type arithmeticOperation(CommonTree operator, Type op1, Type op2) {
	    // controllo che siano numerici o char
	    if ( !(op1.isNumeric() && op2.isNumeric()) ) {
	        errorLog.add(new CannotBeAppliedToException(operator.getText(), op1.toString(), op2.toString(), operator.getLine(), operator.getCharPositionInLine()));
	    	return null;
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
	
	/** Effettua il controllo di tipo sugli operandi su cui sono applicati gli operatori booleani  
	 *  (AND, OR, ==, !=): entrambi operandi devono essere di tipo booleano. 
	 *  In caso contrario viene aggiunto un errore di tipo CannotBeAppliedToException al log. 
	 */
	private Type booleanOperation(CommonTree operator, Type op1, Type op2) {
	    // controllo che siano entrambi boolean
	    if ( !(op1 == BasicType.BOOLEAN && op2 == BasicType.BOOLEAN) ) {
	        errorLog.add(new CannotBeAppliedToException(operator.getText(), op1.toString(), op2.toString(), operator.getLine(), operator.getCharPositionInLine()));
	    }
	    return BasicType.BOOLEAN;
	}
	
	/** Effettua il controllo di tipo sugli operandi su cui e' applicato l'operatore di assegnazione:
	 *  l'espressione a destra di '=' deve avere un tipo assegnabile al tipo della variabile a sinistra.
	 *  In caso contrario si possono verificare due tipi di errore:
	 *	PossibleLossOfPrecisionException, quando l'espressione e' di tipo numerico castabile al tipo della variabile; 
	 *	PossibleLossOfPrecisionException, altrimenti.
	 */
	private Type assignOperation(CommonTree equal, Type var, Type expr) {
	    if (!expr.isAssignableTo(var)) {
	    	if (expr.isNumeric() && expr.isCastableTo(var))
			errorLog.add(new PossibleLossOfPrecisionException(var.toString(), expr.toString(), equal.getLine(), equal.getCharPositionInLine()));
		else 
			errorLog.add(new IncompatibleTypesException(var.toString(), expr.toString(), equal.getLine(), equal.getCharPositionInLine()));    	       
	    }
	    return var;
	}
	
	/** Controlla che le dimensioni degli array sono specificati correttamente, ovvero con un numero di tipo intero.
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
    	
    	@Override
    	public void emitErrorMessage(String msg) {
		errorLog.add("walker reports: " + msg);
    	}    			 
}


compilationUnit
    :  classDeclaration
    |  ';'
    ;
    
classDeclaration
    :   ^(CLASS IDENTIFIER classType? classBody)
    ;
     
classBody
    :   ^(CLASSBODY classBodyDeclaration*)
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
	formalParameters = new ArrayList<Type>();
}
    :   ^(METHOD modifier type { methodReturn = $type.t; } IDENTIFIER { methodName = $IDENTIFIER.text; } formalParameters? methodBody)	
    	{ try { 
    		rt.checksOverriding(methodName, formalParameters); 
    	  } catch (RuntimeException ex) {
    	  	errorLog.add(ex, $IDENTIFIER.line, $IDENTIFIER.pos);
    	  } 
    	}		
    |   ^(METHOD modifier VOID IDENTIFIER { methodName = $IDENTIFIER.text; methodReturn = VoidType.TYPE; } formalParameters? methodBody) 	 
    	{ try { 
    		rt.checksOverriding(methodName, formalParameters); 
    	  } catch (RuntimeException ex) {
    	  	errorLog.add(ex, $IDENTIFIER.line, $IDENTIFIER.pos);
    	  } 
    	}
    |   ^(CONSTR modifier IDENTIFIER { methodName = $IDENTIFIER.text; } formalParameters? constructorBody?) 
    ;
    
fieldDeclaration
    :   ^(FIELD modifier variableDeclarator) // il + e' assorbito dalla * di classBodyDeclaration*
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
    :	primitiveType { $t = $primitiveType.bs; }
    |	classType     { $t = $classType.t;      }
    |	arrayType     { $t = $arrayType.t;      }
    ;
	
arrayType returns [ArrayType t]
    :	brackets { $t = $brackets.t; }
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
    :	^(FPARM variableDeclaratorId) { formalParameters.add($variableDeclaratorId.t); addVariableToScope($variableDeclaratorId.id, $variableDeclaratorId.t); } formalParameterDecls?
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
    :	^(CBODY explicitConstructorInvocation? blockStatement*)
    ;

explicitConstructorInvocation
    :   ^(CONSTRCALL THIS  arguments?)
        { if($arguments.types == null || ruleTypeCheck($arguments.types.toArray(new Type[$arguments.types.size()]))) {
	    	  try {
			rt.bindConstructor($arguments.types);
	    	  } catch (EarlyBindingException ex) {
	    	  	errorLog.add(new CannotFindSymbolException(("constructor " + rt.toString() + '(' + printArguments($arguments.types) + ')'), "class " + rt.toString(), $THIS.line, $THIS.pos));
	    	  }
    	  } 
    	}
    |	^(CONSTRCALL SUPER arguments?)
    	{ ReferenceType sc = rt.getSuperClass();
    	  if( $arguments.types == null || ruleTypeCheck($arguments.types.toArray(new Type[$arguments.types.size()])) ) {
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
    			 	if ((literal >= -32768) &&( literal <= 32767)) 
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
    :	^(VARDECL variableDeclarator)   // il + della grammatica e' assorbito da blockStatement*   
    	{ addVariableToScope($variableDeclarator.id, $variableDeclarator.t); }  
    ;
   

statement
    :   ^(BLOCK block)
    |   ^(IF condition (^(THEN statement))? elseStmt?)
    |   ^(FOR (^(INIT forInit))? condition? (^(UPDATE forUpdate))? statement )
    |   ^(WHILE condition statement)
    |   ^(DOWHILE condition statement)
    |   ^(RETURN expression) 
    	{ if ( ruleTypeCheck(methodReturn)) {
    	  	if(methodReturn.isVoid())
    			errorLog.add(new ReturnFromVoidMethodException($RETURN.line, $RETURN.pos));    		
    	  	else if (ruleTypeCheck($expression.t))
    	  		assignOperation($RETURN, methodReturn, $expression.t);
    	  }
    	}    
    |   RETURN { if((methodReturn==null) || (!methodReturn.isVoid())) errorLog.add(new MissingReturnValueException($RETURN.line, $RETURN.pos)); }
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
 
expression returns [Type t, boolean isVar]
    :   ^(EQ e1=expression e2=expression) 
    	{ if (!$e1.isVar) 
	  	errorLog.add(new UnexpectedTypeException("variable", "value", $EQ.line, $EQ.pos));
	  else
	    	if(ruleTypeCheck($e1.t, $e2.t)) $t = assignOperation($EQ, $e1.t, $e2.t);
    	}
    |	^(PLUS    e1=expression e2=expression) { if(ruleTypeCheck($e1.t, $e2.t)) $t = plusOperation($PLUS, $e1.t, $e2.t); }
    |	^(MINUS   e1=expression e2=expression) { if(ruleTypeCheck($e1.t, $e2.t)) $t = arithmeticOperation($MINUS, $e1.t, $e2.t); }
    |	^(STAR    e1=expression e2=expression) { if(ruleTypeCheck($e1.t, $e2.t)) $t = arithmeticOperation($STAR,  $e1.t, $e2.t); }
    |	^(SLASH   e1=expression e2=expression) { if(ruleTypeCheck($e1.t, $e2.t)) $t = arithmeticOperation($SLASH, $e1.t, $e2.t); }
    |   ^(mod='%' e1=expression e2=expression) { if(ruleTypeCheck($e1.t, $e2.t)) $t = arithmeticOperation($mod,   $e1.t, $e2.t); }
    |   ^(or='||'  e1=expression e2=expression) { if(ruleTypeCheck($e1.t, $e2.t)) $t = booleanOperation($or,  $e1.t, $e2.t); }
    |   ^(and='&&' e1=expression e2=expression) { if(ruleTypeCheck($e1.t, $e2.t)) $t = booleanOperation($and, $e1.t, $e2.t); }
    |   ^(eq='=='  e1=expression e2=expression) 
        { if(ruleTypeCheck($e1.t, $e2.t)){
          	  if (!$e1.t.isCastableTo($e2.t)) errorLog.add(new IncomparableTypesException($e1.t.toString(), $e2.t.toString(), $eq.line, $eq.pos));
	          $t = BasicType.BOOLEAN; 
       	  }
        }
    |   ^(nq='!='  e1=expression e2=expression) 
        { if(ruleTypeCheck($e1.t, $e2.t)){
          	  if (!$e1.t.isCastableTo($e2.t)) errorLog.add(new IncomparableTypesException($e1.t.toString(), $e2.t.toString(), $nq.line, $nq.pos));
	          $t = BasicType.BOOLEAN; 
       	  }
        }    
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
    |   ^( op=(UNARYPLUS| UNARYMINUS) e=expression) 
        { if(ruleTypeCheck($e.t)) {
	          if (!$e.t.isNumeric())
	          	errorLog.add(new CannotBeAppliedToException($op.text, $e.t.toString(), "", $op.line, $op.pos));
	          else
	          	$t = $e.t;
	    	  
    	  }
    	}
    |   ^( op=(PREINC | PREDEC) e=expression)
        { if (!$e.isVar) {
     	  	errorLog.add(new UnexpectedTypeException("variable", "value", $op.line, $op.pos));
     	  } else {
	     	  if (ruleTypeCheck($e.t)) {
		     	  if (!$e.t.isNumeric()) 
		     	  	errorLog.add(new CannotBeAppliedToException($op.text, $e.t.toString(), "", $op.line, $op.pos));
		     	  else	 
		     	  	$t = $e.t;   	  
	    	  }
    	  } 
    	}  
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
    |   ^(CAST at=arrayType e=expression)
    	{ if(ruleTypeCheck($at.t, $e.t)) {
	    	  if (!$e.t.isCastableTo($at.t)) errorLog.add(new InconvertibleTypesException($at.t.toString(), $e.t.toString(), $CAST.line, $CAST.pos));
	    	  $t = $at.t;
    	  }
    	}
    |   ^(CAST ct=classType e=expression)
    	{ if(ruleTypeCheck($ct.t, $e.t)) {
	    	  if (!$e.t.isCastableTo($ct.t)) errorLog.add(new InconvertibleTypesException($ct.t.toString(), $e.t.toString(), $CAST.line, $CAST.pos));
	    	  $t = $ct.t;
    	  }
    	}	
    |   ^(NEW creator) { $t = $creator.t; }
    |	^(op=(POSTINC | POSTDEC) e=expression)
     	{ if (!$e.isVar) {
     	  	errorLog.add(new UnexpectedTypeException("variable", "value", $op.line, $op.pos));
     	  } else {
	     	  if (ruleTypeCheck($e.t)) {
		     	  if (!$e.t.isNumeric()) 
		     	  	errorLog.add(new CannotBeAppliedToException($op.text, $e.t.toString(), "", $op.line, $op.pos));
		     	  else	 
		     	  	$t = $e.t;   	  
	    	  }
    	  } 
    	}  	  
    |   selector { $t = $selector.t; $isVar = $selector.isVar; }
    |   primary  { $t = $primary.t;  $isVar = $primary.isVar;  }
    ;        
    
primary returns [Type t, boolean isVar]
    :	THIS { $t = rt; }
    |   superMemberAccess { $t = $superMemberAccess.t; }
    |   literal { $t = $literal.t; }
    |   IDENTIFIER 
    	{ $isVar = true;
    	  $t = getVariableType($IDENTIFIER.text); 
    	  if ($t == null) errorLog.add(new CannotFindSymbolException(("variable " + $IDENTIFIER.text), getMethodSignature(), $IDENTIFIER.line, $IDENTIFIER.pos));
    	}
    //|   ^(METHODCALL THIS IDENTIFIER arguments? ) riconosciuto in selector
    |   ^(DOTCLASS type) { $t = ReferenceType.CLASS; }  
    |   ^(DOTCLASS VOID) { $t = ReferenceType.CLASS; }
    ;
    
selector returns [Type t, boolean isVar]
    :   ^(FIELDACCESS expression IDENTIFIER) 
    	{ $isVar = true;
    	  if(ruleTypeCheck($expression.t)) {
	    	  if (!$expression.t.isReference()){
	    	  	errorLog.add(new CannotBeDereferencedException($expression.t.toString(), $IDENTIFIER.line, $IDENTIFIER.pos)); 
	    	  }else{
	    	  	ReferenceType expt = (ReferenceType)$expression.t;
	    	  	boolean isSameClass = (expt.getName().equals(rt.getName())); 
	    	  	$t = expt.getField(isSameClass, $IDENTIFIER.text);
		  	if ($t == null) errorLog.add(new CannotFindSymbolException(("field " + $IDENTIFIER.text), expt.getName(), $IDENTIFIER.line, $IDENTIFIER.pos));
    	  	  }
    	  }
    	} 
    |	^(METHODCALL expression IDENTIFIER arguments?)
        { // Se ci sono argomenti, bisogna richiamare ruleTypeCheck su di essi
          if( ruleTypeCheck($expression.t) && ($arguments.types == null || ruleTypeCheck($arguments.types.toArray(new Type[$arguments.types.size()]))) ) {
	    	  if (!$expression.t.isReference()){
	    	  	errorLog.add(new CannotBeDereferencedException($expression.t.toString(), $IDENTIFIER.line, $IDENTIFIER.pos)); 
	    	  }else{
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
    	}
    |   ^(ARRAYACCESS e1=expression e2=expression) 
    	{ $isVar = true;
    	  if (ruleTypeCheck($e1.t, $e2.t)) {
	    	  if (!$e1.t.isArray()) {
	    	  	errorLog.add(new ArrayRequiredException($e1.t.toString(), $ARRAYACCESS.line, $ARRAYACCESS.pos));
	    	  } else {
	    	  	$t = ((ArrayType)$e1.t).getHostType(); 
	    	  }	
	    	  arrayExprCheck($ARRAYACCESS, $e2.t);
	    	  
    	  }
    	}
    ;

creator returns [Type t]
    :   arrayCreatorRest {$t = $arrayCreatorRest.t; }
    |   classType classCreatorRest? 
    	{ if(ruleTypeCheck($classType.t) && ($classCreatorRest.types == null || ruleTypeCheck($classCreatorRest.types.toArray(new Type[$classCreatorRest.types.size()])) )) {
  	  	  Token tk = $classType.start.token;
	    	  try {
			((ReferenceType)$classType.t).bindConstructor($classCreatorRest.types);
	    	  } catch (EarlyBindingException ex) {
	    	  	errorLog.add(new CannotFindSymbolException(("constructor " + $classType.t.toString() + '(' + printArguments($classCreatorRest.types) + ')'), "class " + rt.toString(), tk.getLine(), tk.getCharPositionInLine()));
	    	  }	    	 
		  $t = $classType.t;
	  }
    	}
    ;


createdName returns [Type t]
    :   classType     { $t = $classType.t;      }
    |   primitiveType { $t = $primitiveType.bs; }
    ;
    
arrayCreatorRest returns [ArrayType t]
    :	^(ARRAYALLOCINIT brackets arrayInitializer[$brackets.t.getHostType()]) { $t = $brackets.t; }
    |   ^(ARRAYALLOC bracketsOpt) { $t = (ArrayType)$bracketsOpt.t; }
    ;

classCreatorRest returns [ArrayList<Type> types]
    :   arguments { $types = $arguments.types; }
    ;     
   
superMemberAccess returns [Type t]
    :	^(METHODCALL SUPER IDENTIFIER arguments?) 
    	{ if( $arguments.types == null || ruleTypeCheck($arguments.types.toArray(new Type[$arguments.types.size()])) ) {
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
    
brackets returns [ArrayType t]
    :	^(ARRAYTYPE bracketsOpt) { if (ruleTypeCheck($bracketsOpt.t)) $t = (ArrayType)ParserHelper.createArrayType($bracketsOpt.t, 1); }
    ;
    
bracketsOpt returns [Type t]
    :	createdName 		    { $t = $createdName.t; }
    |	^(ARRAYTYPE bo=bracketsOpt) { if (ruleTypeCheck($bo.t)) $t = ParserHelper.createArrayType($bo.t, 1); }
    |	^(ARRAYTYPE expression bo=bracketsOpt)
        { if (ruleTypeCheck($bo.t)) $t = ParserHelper.createArrayType($bo.t, 1); 
    	  if (ruleTypeCheck($expression.t)) arrayExprCheck($ARRAYTYPE, $expression.t);
       	} 
    ;
    
