grammar Ja;
options {language = Java;
	 output = AST;
}
tokens {
	METHODCALL; CONSTRCALL; FIELDACCESS; ARRAYACCESS; DOTCLASS; ARRAYTYPE; 
	METHOD; FIELD; CONSTR; FPARMS; ARGUMENTS; FPARM; FMULTPARM; MBODY; CBODY;
	VARDECL; BLOCK; STMT; INIT; CONDITION; UPDATE; DOWHILE; THEN; ARRAYINIT;
	PREINC; POSTINC; PREDEC; POSTDEC; UNARYPLUS; UNARYMINUS; CAST; CLASSBODY;
	ARRAYALLOC; ARRAYALLOCINIT;
	//SUPERMETHODCALL; SUPERFIELDACCESS;   Per uniformita' viene preferito   ^(METHODCALL SUPER ...) e ^(FIELDACCESS SUPER ...)
}

@header{
	package jagrammar;
	
	import jagrammar.exception.*;
	import jagrammar.typehierarchy.*;
	import jagrammar.typehierarchy.exception.*;
	import jagrammar.util.*;
	import java.util.Queue;
	import java.util.LinkedList;
	import java.util.HashMap;
	//import java.util.Map; importato da antlr
}

@lexer::header{
	package jagrammar;
	
	import jagrammar.util.ErrorLogger;
}

@members {
	private String fileName = "Test";  // permette il debug da ANTLRWORKS
	private ErrorLogger errorLog = new ErrorLogger("DEBUG"); // permette il debug da ANTLRWORKS
	private Queue<String> todo = new LinkedList<String>(); // permette il debug da ANTLRWORKS
	private Map<String, ReferenceType> cTab = new HashMap<String, ReferenceType>(); // permette il debug da ANTLRWORKS
	private ReferenceType rt;
	
	public void setQueue(Queue<String> q) {
        	todo = q;
    	}
    	
    	public void setClassTable(Map<String, ReferenceType> m) {
        	cTab = m;
    	}
    	
    	public ReferenceType getReferenceType() {
    		return rt;
    	}    	
    	
    	public void setFileName(String fileName) {
    		this.fileName = fileName;
    	}
    	
    	public void setErrorLogger(ErrorLogger el) {
    		this.errorLog = el;
    	}
    	
    	@Override
    	public void emitErrorMessage(String msg) {
		errorLog.add("parser reports: " + msg);
    	}
}

@lexer::members{
	private ErrorLogger errorLog = new ErrorLogger("DEBUG"); // permette il debug da ANTLRWORKS
	
	public void setErrorLogger(ErrorLogger el) {
    		this.errorLog = el;
    	}
    	
	@Override
    	public void emitErrorMessage(String msg) {
		errorLog.add("lexer reports: " + msg);
    	}
} 


// Alter code generation so catch-clauses get replace with 
// this action. 
@rulecatch { 
	catch (RecognitionException e) { 
		throw e; 
	} 
} 





// Regola iniziale
compilationUnit
    :   classDeclaration^ // toglie nil
    |   ';'
    ;
    
classDeclaration
    :   PUBLIC! CLASS^ IDENTIFIER 
    	{ if (!fileName.equals($IDENTIFIER.text)) {
    	  	errorLog.add(new MismatchedClassNameException($IDENTIFIER.text, $IDENTIFIER.line, $IDENTIFIER.pos));
    	  }
    	  // Potrebbe gia' esistere l'istanza prima che abbia analizzato il file .java
    	  // Aggiunta effettuata dalla regola classType per recuperare subito l'istanza della classe anche se priva di interfaccia
	  if(cTab.containsKey(fileName)) {
	  	rt = cTab.get(fileName);
	  } else { // crea una nuova istanza per la classe e la aggiunge alla tabella
	  	rt = new ReferenceType(fileName);
	  	cTab.put(fileName, rt);
	  }
	}
        (EXTENDS! classType { try { rt.addSuperType($classType.t); } catch(CyclicInheritanceException ex) { errorLog.add(ex, $EXTENDS.line, $EXTENDS.pos); } } )?		    	
    	classBody
    ;
  
classBody
    :   '{' classBodyDeclaration* '}' -> ^(CLASSBODY classBodyDeclaration*)
    ;

classBodyDeclaration
    :   ';'!
    |   memberDeclaration
    ;
    
memberDeclaration
    :   m=modifier t=type IDENTIFIER formalParameters bracketsOpt[(CommonTree)$t.tree] methodBody  	
    	{ Type typ = ParserHelper.createArrayType($t.t, $bracketsOpt.arrayDim);
    	  try { rt.addMethod($m.pub, typ, $IDENTIFIER.text, $formalParameters.args); } catch(UnacceptableMethodException ex) { errorLog.add(ex, $IDENTIFIER.line, $IDENTIFIER.pos); } 
    	}
    	-> ^(METHOD modifier bracketsOpt IDENTIFIER formalParameters? methodBody)
    	    
    |   m=modifier! t=type! fieldDeclaration[(CommonTree)$m.tree, (CommonTree)$t.tree, $m.pub, $t.t] // FIELD non e' stato riscritto qui per la molteplicita' delle dichiarazioni
        		
    |   m=modifier VOID IDENTIFIER formalParameters methodBody 
        { try { rt.addMethod($m.pub, VoidType.TYPE, $IDENTIFIER.text, $formalParameters.args); } catch(UnacceptableMethodException ex) { errorLog.add(ex, $IDENTIFIER.line, $IDENTIFIER.pos); } }
    	-> ^(METHOD modifier VOID IDENTIFIER formalParameters? methodBody)
    	
    |   modifier IDENTIFIER formalParameters constructorBody 
    	{ if(rt.getName().equals($IDENTIFIER.text))
    		try { rt.addConstructor($modifier.pub, $formalParameters.args); } catch(UnacceptableConstructorException ex) { errorLog.add(ex, $IDENTIFIER.line, $IDENTIFIER.pos); } 
   	  else 
   	  	errorLog.add(new InvalidMethodDeclarationException($IDENTIFIER.line, $IDENTIFIER.pos));
    	}
    	-> ^(CONSTR modifier IDENTIFIER formalParameters? constructorBody?)
    ;

fieldDeclaration[CommonTree mod, CommonTree typ, boolean pub, Type t]
    :   v1=variableDeclarator[$typ]      
        { try { 
            rt.addField($v1.varName, ParserHelper.createArrayType($t, $v1.arrayDim), $pub); 
          } catch(UnacceptableFieldException ex) {
            errorLog.add(ex, $v1.start.getLine(), $v1.start.getCharPositionInLine()); 
          } 
        } 
        (',' v2=variableDeclarator[(CommonTree)$typ.dupNode()] 
        { try { 
            rt.addField($v2.varName, ParserHelper.createArrayType($t, $v2.arrayDim), $pub); 
          } catch(UnacceptableFieldException ex) { 
            errorLog.add(ex, $v2.start.getLine(), $v2.start.getCharPositionInLine()); 
          }
        } 
        )* ';' 
        -> ^(FIELD {$mod.dupNode()} variableDeclarator)+ 
    ;

variableDeclarator[CommonTree typ] returns [String varName, int arrayDim]
    :   variableDeclaratorId[$typ] { $varName = $variableDeclaratorId.varName; $arrayDim = $variableDeclaratorId.arrayDim; } ('='! variableInitializer)? //-> variableDeclaratorId ^(INIT variableInitializer)?
    ;
    
variableDeclaratorId[CommonTree typ]  returns [String varName, int arrayDim]
    :   IDENTIFIER bracketsOpt[$typ]
    	{ $varName = $IDENTIFIER.text; $arrayDim = $bracketsOpt.arrayDim; } 
    	->  bracketsOpt IDENTIFIER
    ;

variableInitializer
    :   arrayInitializer
    |   expression
    ;
        
arrayInitializer
    :   lc='{' (variableInitializer (',' variableInitializer)* (',')? )? '}' -> ^(ARRAYINIT[$lc, "ARRAYINIT"] variableInitializer*) 
    ;

modifier returns [boolean pub]
    :   PUBLIC  { $pub = true;  }
    |   PRIVATE { $pub = false; }
    ;

type returns [Type t]
    :	primitiveType { $t = $primitiveType.bs; }
    |	classType     { $t = $classType.t;      }
    |	arrayType     { $t = $arrayType.t;      }
    ;
	
arrayType returns [ArrayType t]
    :   primitiveType! brackets[(CommonTree)$primitiveType.tree] 
	{ $t = (ArrayType)ParserHelper.createArrayType($primitiveType.bs, $brackets.arrayDim); }
    
    |   classType!     brackets[(CommonTree)$classType.tree] 
	{ $t = (ArrayType)ParserHelper.createArrayType($classType.t, $brackets.arrayDim);      }
    ;	

classType returns [ReferenceType t]
    :	IDENTIFIER { if(cTab.containsKey($IDENTIFIER.text)) {
        	     	$t = cTab.get($IDENTIFIER.text);
       		     } else {
		     	$t = new ReferenceType($IDENTIFIER.text);
			cTab.put($IDENTIFIER.text, $t);
			todo.add($IDENTIFIER.text);	
       		     }
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
    
formalParameters returns [ArrayList<Type> args]
@init {
	$args = new ArrayList<Type>();
}
    :  '('!')'! 
    |  '(' formalParameterDecls[$args] ')' -> ^(FPARMS formalParameterDecls)
    ;
    
formalParameterDecls[ArrayList<Type> args]
    :	type variableDeclaratorId[(CommonTree)$type.tree] (',' formalParameterDecls[$args])? 
    	{ $args.add(ParserHelper.createArrayType($type.t, $variableDeclaratorId.arrayDim)); }
    	-> ^(FPARM variableDeclaratorId) formalParameterDecls?
    ;
    
methodBody
    :   block -> ^(MBODY block?) // block pu� essere il nodo NIL
    ;

constructorBody
    :	'{' explicitConstructorInvocation? blockStatement* '}' -> ^(CBODY explicitConstructorInvocation? blockStatement*)
    ;

explicitConstructorInvocation
    :   THIS  arguments ';' -> ^(CONSTRCALL THIS  arguments?)
    |   SUPER arguments ';' -> ^(CONSTRCALL SUPER arguments?)
    ;

literal 
    :   INTLITERAL
    |	LONGLITERAL
    |   FLOATLITERAL
    |	DOUBLELITERAL
    |   CHARLITERAL
    |   STRINGLITERAL
    |   BOOLEANLITERAL
    |   NULLLITERAL
    ;

// STATEMENTS / BLOCKS

block
    :   '{'! blockStatement* '}'!
    ;
    
blockStatement
    :   localVariableDeclarationStatement
    |   statement
    ;
    
localVariableDeclarationStatement
    :	localVariableDeclaration ';'!
    ;

localVariableDeclaration
    :	type variableDeclarator[(CommonTree)$type.tree] (',' variableDeclarator[(CommonTree)((CommonTree)$type.tree).dupNode()])* 
    	-> ^(VARDECL variableDeclarator)+
    ;
   

statement
    :   block -> ^(BLOCK block?)
    
    |   tk=IF parExpression statement elseStmt -> ^(IF ^(CONDITION[$tk, "CONDITION"] parExpression) (^(THEN statement))? elseStmt?)
    
    |   FOR lp='(' forInit? ';' expression? ';' forUpdate? ')' statement 
    	-> ^(FOR ^(INIT forInit)? ^(CONDITION[$lp, "CONDITION"] expression)? ^(UPDATE forUpdate)? statement ) 
    		  	
    |   tk=WHILE parExpression statement -> ^(WHILE ^(CONDITION[$tk, "CONDITION"] parExpression) statement)
    
    |   DO statement tk=WHILE parExpression ';' -> ^(DOWHILE ^(CONDITION[$tk, "CONDITION"] parExpression) statement)
    
    |   RETURN^ expression? ';'!
    
    |   ';'! 
    
    |   statementExpression ';' -> ^(STMT statementExpression)
    ;
    
elseStmt
    :	(ELSE) => ELSE^ statement
    |
    ;

forInit
    :   localVariableDeclaration
    |   expressionList
    ;

forUpdate
    :   expressionList
    ;

parExpression
    :   '('! expression ')'!
    ;
    
expressionList
    :   expression (','! expression)*
    ;

statementExpression
    :   expression
    ;
 
expression
    :  orExpression ( ap=assignmentOperator expression)? 
       -> {$ap.c == '='}? ^(EQ[$ap.tk, "="] orExpression expression)
       -> {$ap.c == '+'}? ^(EQ[$ap.tk, "="] orExpression ^(PLUS[$ap.tk, "+"]  orExpression expression))
       -> {$ap.c == '-'}? ^(EQ[$ap.tk, "="] orExpression ^(MINUS[$ap.tk, "-"] orExpression expression))
       -> {$ap.c == '*'}? ^(EQ[$ap.tk, "="] orExpression ^(STAR[$ap.tk, "*"]  orExpression expression))
       -> {$ap.c == '/'}? ^(EQ[$ap.tk, "="] orExpression ^(SLASH[$ap.tk, "/"] orExpression expression))
       ->  orExpression
    ;
    
assignmentOperator returns [char c, Token tk]
    :   t='='  { $c = '='; $tk=$t; }
    |   t='+=' { $c = '+'; $tk=$t; }
    |   t='-=' { $c = '-'; $tk=$t; }
    |   t='*=' { $c = '*'; $tk=$t; }
    |   t='/=' { $c = '/'; $tk=$t; }
    ;

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
    :   up='+'  unaryExpression -> ^(UNARYPLUS[$up]  unaryExpression) 
    |   um='-'  unaryExpression -> ^(UNARYMINUS[$um] unaryExpression)
    |   pi='++' unaryExpression -> ^(PREINC[$pi] unaryExpression)
    |   pd='--' unaryExpression -> ^(PREDEC[$pd] unaryExpression)
    |   unaryExpressionNotPlusMinus
    ;

unaryExpressionNotPlusMinus
    :	'!'^ unaryExpression
    
    |  	lp='(' primitiveType ')' unaryExpression
    		-> ^(CAST[$lp, "CAST"] primitiveType unaryExpression)
    
    |  	lp='(' arrayType ')' unaryExpression
    		-> ^(CAST[$lp, "CAST"] arrayType unaryExpression)
    		
    |   lp='(' classType  ')' unaryExpressionNotPlusMinus
    		-> ^(CAST[$lp, "CAST"] classType unaryExpressionNotPlusMinus)
    		
    |   NEW^ creator
    
    |   (primary -> primary)  (selector[(CommonTree)$unaryExpressionNotPlusMinus.tree] -> selector)* 
    		('++' -> ^(POSTINC $unaryExpressionNotPlusMinus) | '--' -> ^(POSTDEC $unaryExpressionNotPlusMinus) )* 
    ;

    
primary
    :   parExpression
    |   THIS 
    |   SUPER! superMemberAccess
    |   literal
    |   IDENTIFIER
    | 	IDENTIFIER  arguments -> ^(METHODCALL THIS IDENTIFIER arguments?)
    |	type '.' CLASS -> ^(DOTCLASS type)
    |   VOID '.' CLASS -> ^(DOTCLASS VOID)
    ;
    
selector [CommonTree primary]
    :   '.' IDENTIFIER           -> ^(FIELDACCESS {$primary} IDENTIFIER)
    |	'.' IDENTIFIER arguments -> ^(METHODCALL  {$primary} IDENTIFIER arguments?)
    |   lb='[' expression ']'    -> ^(ARRAYACCESS[$lb, "ARRAYACCESS"] {$primary} expression)
    ;

creator
    :	createdName! arrayCreatorRest[(CommonTree)$createdName.tree]
    |	classType classCreatorRest
    ;

createdName
    :   classType
    |   primitiveType
    ;
    
arrayCreatorRest[CommonTree createdName]
    :   brackets[createdName] arrayInitializer -> ^(ARRAYALLOCINIT brackets arrayInitializer)   
    |	(lb='[' expression ']' -> ^(ARRAYTYPE[$lb, "ARRAYTYPE"] expression {$createdName})) ( lb='[' expression ']' -> ^(ARRAYTYPE[$lb, "ARRAYTYPE"] expression $arrayCreatorRest ) )*  
    		bracketsOpt[(CommonTree)$arrayCreatorRest.tree] -> ^(ARRAYALLOC bracketsOpt)
    ; 

classCreatorRest
    :   arguments
    ;   
   
superMemberAccess 
    :	'.' IDENTIFIER           -> ^(FIELDACCESS SUPER IDENTIFIER)
    |   '.' IDENTIFIER arguments -> ^(METHODCALL  SUPER IDENTIFIER arguments?)
    ;

arguments
    :   '('! ')'!
    |	'(' expressionList ')' -> ^(ARGUMENTS expressionList)   
    ;

brackets[CommonTree t] returns [int arrayDim]
    :	lb='['']' bracketsOpt[$t] 
    	{ $arrayDim = $bracketsOpt.arrayDim + 1; }
    	-> ^(ARRAYTYPE[$lb, "ARRAYTYPE"] bracketsOpt )
    	
    ;
  
bracketsOpt[CommonTree t] returns [int arrayDim]
    :  	(-> {$t})  l +=(lb='['']' -> ^(ARRAYTYPE[$lb, "ARRAYTYPE"] $bracketsOpt ))*
    	{ if($l != null) $arrayDim = $l.size(); }
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
           ( EscapeSequence | ~( '\'' | '\\' | '\r' | '\n' ) ) 
        '\''
    ; 

STRINGLITERAL
    :   '"' 
    	   ( EscapeSequence | ~( '\\' | '"' | '\r' | '\n' ) )*  
    	'"' 
    ;
        
fragment
EscapeSequence 
    :   '\\' ( 't' | 'n' | 'r'  | '\"'  | '\'' | '\\' )          
    ;     
	
BOOLEANLITERAL
    :   'true'
    |   'false'
    ;
    
NULLLITERAL
    :   'null'
    ;

BOOLEAN
    :   'boolean'
    ;
    
BYTE
    :   'byte'
    ;

CHAR
    :   'char'
    ;
    	
SHORT
    :   'short'
    ;
	
INT
    :   'int'
    ;

LONG
    :   'long'
    ;

FLOAT
    :   'float'
    ;

DOUBLE
    :   'double'
    ;		

VOID
    :   'void'
    ;	
	
WS  
    :   ( ' ' | '\r' | '\t' | '\n' ) 
	{ $channel = HIDDEN; }          
    ;

COMMENT
    :   '/*'
        (options {greedy=false;} : . )* // ~('*/')
        '*/'
        { $channel = HIDDEN; }
    ;

LINE_COMMENT
    :	'//' ~('\n'|'\r')*
        { $channel = HIDDEN; }
    ;   
        
CLASS
    :   'class'
    ;

EXTENDS
    :   'extends'
    ;
		
FOR
    :   'for'
    ;

DO
    :   'do'
    ;

WHILE
    :   'while'
    ;
	
IF
    :   'if'
    ;

ELSE
    :   'else'
    ;	
	
INSTANCEOF
    :   'instanceof'
    ;
	
NEW
    :   'new'
    ;

PRIVATE
    :   'private'
    ;

PUBLIC
    :   'public'
    ;

RETURN
    :   'return'
    ;

SUPER
    :   'super'
    ;

THIS
    :   'this'
    ;
    
EQ
    :   '='
    ;

PLUS
    :   '+'
    ;

MINUS
    :   '-'
    ;

STAR
    :   '*'
    ;

SLASH
    :   '/'
    ;    

COMPAREOP
    :	'>'
    |	'<'
    |	'>='
    |	'<='    	
    ;    

IDENTIFIER
    :	( Letter | Currency | '_' )
		( Digit | Letter | Currency | '_' )*
    ;    			
   
fragment
Letter
    :	'a'..'z' 
    |	'A'..'Z'
    ;
   
fragment 
Currency
    :	'$'    	
    ;