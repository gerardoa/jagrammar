// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g 2010-11-05 18:25:42

	package jagrammar;
	
	import jagrammar.typehierarchy.*;
	import jagrammar.exception.*;
	import jagrammar.typehierarchy.exception.EarlyBindingException;
	import jagrammar.util.*;
	import java.util.Map;
	import java.util.HashMap;
	import java.util.LinkedList;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class JaWalker extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "METHODCALL", "CONSTRCALL", "FIELDACCESS", "ARRAYACCESS", "DOTCLASS", "ARRAYTYPE", "METHOD", "FIELD", "CONSTR", "FPARMS", "ARGUMENTS", "FPARM", "FMULTPARM", "MBODY", "CBODY", "VARDECL", "BLOCK", "STMT", "INIT", "CONDITION", "UPDATE", "DOWHILE", "THEN", "ARRAYINIT", "PREINC", "POSTINC", "PREDEC", "POSTDEC", "UNARYPLUS", "UNARYMINUS", "CAST", "CLASSBODY", "ARRAYALLOC", "ARRAYALLOCINIT", "PUBLIC", "CLASS", "IDENTIFIER", "EXTENDS", "VOID", "PRIVATE", "CHAR", "BYTE", "SHORT", "INT", "LONG", "FLOAT", "DOUBLE", "BOOLEAN", "THIS", "SUPER", "INTLITERAL", "LONGLITERAL", "FLOATLITERAL", "DOUBLELITERAL", "CHARLITERAL", "STRINGLITERAL", "BOOLEANLITERAL", "NULLLITERAL", "IF", "FOR", "WHILE", "DO", "RETURN", "ELSE", "INSTANCEOF", "COMPAREOP", "NEW", "Digit", "IntegerNumber", "LongSuffix", "Exponent", "FloatingPointLiteral", "FloatSuffix", "DoubleSuffix", "EscapeSequence", "WS", "COMMENT", "LINE_COMMENT", "EQ", "PLUS", "MINUS", "STAR", "SLASH", "Letter", "Currency", "';'", "'{'", "'}'", "','", "'('", "')'", "'+='", "'-='", "'*='", "'/='", "'||'", "'&&'", "'=='", "'!='", "'%'", "'++'", "'--'", "'!'", "'.'", "'['", "']'"
    };
    public static final int STMT=21;
    public static final int CONSTR=12;
    public static final int MINUS=84;
    public static final int ARRAYACCESS=7;
    public static final int UNARYMINUS=33;
    public static final int DOUBLE=50;
    public static final int T__109=109;
    public static final int METHOD=10;
    public static final int THEN=26;
    public static final int FPARM=15;
    public static final int IntegerNumber=72;
    public static final int ARRAYINIT=27;
    public static final int PREDEC=30;
    public static final int FIELDACCESS=6;
    public static final int PRIVATE=43;
    public static final int Letter=87;
    public static final int INTLITERAL=54;
    public static final int CONDITION=23;
    public static final int PREINC=28;
    public static final int T__96=96;
    public static final int MBODY=17;
    public static final int CBODY=18;
    public static final int STRINGLITERAL=59;
    public static final int CHARLITERAL=58;
    public static final int T__108=108;
    public static final int PLUS=83;
    public static final int ARRAYALLOC=36;
    public static final int EXTENDS=41;
    public static final int POSTDEC=31;
    public static final int UNARYPLUS=32;
    public static final int DOUBLELITERAL=57;
    public static final int SUPER=53;
    public static final int ARGUMENTS=14;
    public static final int T__89=89;
    public static final int LongSuffix=73;
    public static final int WS=79;
    public static final int CHAR=44;
    public static final int NEW=70;
    public static final int EQ=82;
    public static final int UPDATE=24;
    public static final int T__92=92;
    public static final int LINE_COMMENT=81;
    public static final int DOTCLASS=8;
    public static final int FIELD=11;
    public static final int POSTINC=29;
    public static final int ARRAYALLOCINIT=37;
    public static final int T__90=90;
    public static final int BOOLEAN=51;
    public static final int ELSE=67;
    public static final int T__91=91;
    public static final int BOOLEANLITERAL=60;
    public static final int CONSTRCALL=5;
    public static final int CLASSBODY=35;
    public static final int IDENTIFIER=40;
    public static final int T__93=93;
    public static final int SHORT=46;
    public static final int ARRAYTYPE=9;
    public static final int VARDECL=19;
    public static final int PUBLIC=38;
    public static final int LONG=48;
    public static final int Digit=71;
    public static final int T__94=94;
    public static final int T__100=100;
    public static final int T__95=95;
    public static final int FLOAT=49;
    public static final int CAST=34;
    public static final int T__101=101;
    public static final int FLOATLITERAL=56;
    public static final int INIT=22;
    public static final int FMULTPARM=16;
    public static final int T__104=104;
    public static final int T__107=107;
    public static final int DOWHILE=25;
    public static final int BLOCK=20;
    public static final int T__106=106;
    public static final int EscapeSequence=78;
    public static final int INT=47;
    public static final int COMPAREOP=69;
    public static final int VOID=42;
    public static final int INSTANCEOF=68;
    public static final int LONGLITERAL=55;
    public static final int NULLLITERAL=61;
    public static final int FloatingPointLiteral=75;
    public static final int T__98=98;
    public static final int DoubleSuffix=77;
    public static final int Exponent=74;
    public static final int FloatSuffix=76;
    public static final int DO=65;
    public static final int SLASH=86;
    public static final int WHILE=64;
    public static final int Currency=88;
    public static final int T__99=99;
    public static final int COMMENT=80;
    public static final int THIS=52;
    public static final int T__103=103;
    public static final int CLASS=39;
    public static final int RETURN=66;
    public static final int T__97=97;
    public static final int METHODCALL=4;
    public static final int BYTE=45;
    public static final int T__105=105;
    public static final int IF=62;
    public static final int FPARMS=13;
    public static final int EOF=-1;
    public static final int FOR=63;
    public static final int STAR=85;
    public static final int T__102=102;

    // delegates
    // delegators

    protected static class JaScope_scope {
        Map<String, Type> symbols;
    }
    protected Stack JaScope_stack = new Stack();


        public JaWalker(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public JaWalker(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return JaWalker.tokenNames; }
    public String getGrammarFileName() { return "/Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g"; }



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
    	    for (int s=JaScope_stack.size()-1; s>=0; s--) {
    	        if ( ((JaScope_scope)JaScope_stack.elementAt(s)).symbols.containsKey(id) ) {
    	            return true;
    	        }
    	    }
    	    return false;
    	}
    	
    	/** Restituisce il tipo di id. Controlla se e' definito in JaScope, in caso non viene 
        	 *  trovato verifica se e' un campo dichiarato nella classe.
     	 */
    	private Type getVariableType(String id) {
    	    for (int s=JaScope_stack.size()-1; s>=0; s--) {
    	        if ( ((JaScope_scope)JaScope_stack.elementAt(s)).symbols.containsKey(id) ) {
    	            return ((JaScope_scope)JaScope_stack.elementAt(s)).symbols.get(id);
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
        	    	((JaScope_scope)JaScope_stack.peek()).symbols.put(id, t);
        	    else
       		errorLog.add(new UnacceptableLocalVariableException(id, getMethodSignature(), line, pos));
        	}
        	
        	/** Effetua controllo sui tipi degli operandi su cui e' applicato l'operatore '+'. Se almeno uno di essi
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

            /** Effetua i controlli di tipo sugli operandi su cui sono applicati gli operatori aritmetici (somma, 
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
    	
    	/** Effetua il controllo di tipo sugli operandi su cui sono applicati gli operatori booleani  
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
    	
    	/** Effetua il controllo di tipo sugli operandi su cui e' applicato l'operatore di assegnazione:
    	 *  l'espressione a destra di '=' deve avere un tipo asegnabile al tipo della variabile a sinistra.
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
    		errorLog.add(msg);
        	}    			 



    // $ANTLR start "compilationUnit"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:192:1: compilationUnit : ( classDeclaration | ';' );
    public final void compilationUnit() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:193:5: ( classDeclaration | ';' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==CLASS) ) {
                alt1=1;
            }
            else if ( (LA1_0==89) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:193:8: classDeclaration
                    {
                    pushFollow(FOLLOW_classDeclaration_in_compilationUnit57);
                    classDeclaration();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:194:8: ';'
                    {
                    match(input,89,FOLLOW_89_in_compilationUnit66); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "compilationUnit"


    // $ANTLR start "classDeclaration"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:197:1: classDeclaration : ^( CLASS IDENTIFIER ( classType )? classBody ) ;
    public final void classDeclaration() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:198:5: ( ^( CLASS IDENTIFIER ( classType )? classBody ) )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:198:9: ^( CLASS IDENTIFIER ( classType )? classBody )
            {
            match(input,CLASS,FOLLOW_CLASS_in_classDeclaration90); 

            match(input, Token.DOWN, null); 
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classDeclaration92); 
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:198:28: ( classType )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==IDENTIFIER) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:198:28: classType
                    {
                    pushFollow(FOLLOW_classType_in_classDeclaration94);
                    classType();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_classBody_in_classDeclaration97);
            classBody();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "classDeclaration"


    // $ANTLR start "classBody"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:201:1: classBody : ^( CLASSBODY ( classBodyDeclaration )* ) ;
    public final void classBody() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:202:5: ( ^( CLASSBODY ( classBodyDeclaration )* ) )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:202:9: ^( CLASSBODY ( classBodyDeclaration )* )
            {
            match(input,CLASSBODY,FOLLOW_CLASSBODY_in_classBody123); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:202:21: ( classBodyDeclaration )*
                loop3:
                do {
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( ((LA3_0>=METHOD && LA3_0<=CONSTR)) ) {
                        alt3=1;
                    }


                    switch (alt3) {
                	case 1 :
                	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:202:21: classBodyDeclaration
                	    {
                	    pushFollow(FOLLOW_classBodyDeclaration_in_classBody125);
                	    classBodyDeclaration();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop3;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "classBody"


    // $ANTLR start "classBodyDeclaration"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:205:1: classBodyDeclaration : memberDeclaration ;
    public final void classBodyDeclaration() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:206:5: ( memberDeclaration )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:206:9: memberDeclaration
            {
            pushFollow(FOLLOW_memberDeclaration_in_classBodyDeclaration146);
            memberDeclaration();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "classBodyDeclaration"


    // $ANTLR start "memberDeclaration"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:209:1: memberDeclaration : ( fieldDeclaration | methodAndConstructorDeclaration );
    public final void memberDeclaration() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:210:5: ( fieldDeclaration | methodAndConstructorDeclaration )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==FIELD) ) {
                alt4=1;
            }
            else if ( (LA4_0==METHOD||LA4_0==CONSTR) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:210:9: fieldDeclaration
                    {
                    pushFollow(FOLLOW_fieldDeclaration_in_memberDeclaration169);
                    fieldDeclaration();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:211:7: methodAndConstructorDeclaration
                    {
                    pushFollow(FOLLOW_methodAndConstructorDeclaration_in_memberDeclaration177);
                    methodAndConstructorDeclaration();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "memberDeclaration"


    // $ANTLR start "methodAndConstructorDeclaration"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:214:1: methodAndConstructorDeclaration : ( ^( METHOD modifier type IDENTIFIER ( formalParameters )? methodBody ) | ^( METHOD modifier VOID IDENTIFIER ( formalParameters )? methodBody ) | ^( CONSTR modifier IDENTIFIER ( formalParameters )? ( constructorBody )? ) );
    public final void methodAndConstructorDeclaration() throws RecognitionException {
        JaScope_stack.push(new JaScope_scope());

        CommonTree IDENTIFIER2=null;
        CommonTree IDENTIFIER3=null;
        CommonTree IDENTIFIER4=null;
        Type type1 = null;



        	((JaScope_scope)JaScope_stack.peek()).symbols = new HashMap<String, Type>();
        	formalParameters = new ArrayList<Type>();

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:220:5: ( ^( METHOD modifier type IDENTIFIER ( formalParameters )? methodBody ) | ^( METHOD modifier VOID IDENTIFIER ( formalParameters )? methodBody ) | ^( CONSTR modifier IDENTIFIER ( formalParameters )? ( constructorBody )? ) )
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==METHOD) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==DOWN) ) {
                    int LA9_3 = input.LA(3);

                    if ( (LA9_3==PUBLIC||LA9_3==PRIVATE) ) {
                        int LA9_4 = input.LA(4);

                        if ( (LA9_4==VOID) ) {
                            alt9=2;
                        }
                        else if ( (LA9_4==ARRAYTYPE||LA9_4==IDENTIFIER||(LA9_4>=CHAR && LA9_4<=BOOLEAN)) ) {
                            alt9=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 9, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA9_0==CONSTR) ) {
                alt9=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:220:9: ^( METHOD modifier type IDENTIFIER ( formalParameters )? methodBody )
                    {
                    match(input,METHOD,FOLLOW_METHOD_in_methodAndConstructorDeclaration211); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_modifier_in_methodAndConstructorDeclaration213);
                    modifier();

                    state._fsp--;

                    pushFollow(FOLLOW_type_in_methodAndConstructorDeclaration215);
                    type1=type();

                    state._fsp--;

                     methodReturn = type1; 
                    IDENTIFIER2=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_methodAndConstructorDeclaration219); 
                     methodName = (IDENTIFIER2!=null?IDENTIFIER2.getText():null); 
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:220:106: ( formalParameters )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==FPARMS) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:220:106: formalParameters
                            {
                            pushFollow(FOLLOW_formalParameters_in_methodAndConstructorDeclaration223);
                            formalParameters();

                            state._fsp--;


                            }
                            break;

                    }

                    pushFollow(FOLLOW_methodBody_in_methodAndConstructorDeclaration226);
                    methodBody();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     try { 
                        		rt.checksOverriding(methodName, formalParameters); 
                        	  } catch (RuntimeException ex) {
                        	  	errorLog.add(ex, (IDENTIFIER2!=null?IDENTIFIER2.getLine():0), (IDENTIFIER2!=null?IDENTIFIER2.getCharPositionInLine():0));
                        	  } 
                        	

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:227:9: ^( METHOD modifier VOID IDENTIFIER ( formalParameters )? methodBody )
                    {
                    match(input,METHOD,FOLLOW_METHOD_in_methodAndConstructorDeclaration248); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_modifier_in_methodAndConstructorDeclaration250);
                    modifier();

                    state._fsp--;

                    match(input,VOID,FOLLOW_VOID_in_methodAndConstructorDeclaration252); 
                    IDENTIFIER3=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_methodAndConstructorDeclaration254); 
                     methodName = (IDENTIFIER3!=null?IDENTIFIER3.getText():null); methodReturn = VoidType.TYPE; 
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:227:108: ( formalParameters )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==FPARMS) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:227:108: formalParameters
                            {
                            pushFollow(FOLLOW_formalParameters_in_methodAndConstructorDeclaration258);
                            formalParameters();

                            state._fsp--;


                            }
                            break;

                    }

                    pushFollow(FOLLOW_methodBody_in_methodAndConstructorDeclaration261);
                    methodBody();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     try { 
                        		rt.checksOverriding(methodName, formalParameters); 
                        	  } catch (RuntimeException ex) {
                        	  	errorLog.add(ex, (IDENTIFIER3!=null?IDENTIFIER3.getLine():0), (IDENTIFIER3!=null?IDENTIFIER3.getCharPositionInLine():0));
                        	  } 
                        	

                    }
                    break;
                case 3 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:234:9: ^( CONSTR modifier IDENTIFIER ( formalParameters )? ( constructorBody )? )
                    {
                    match(input,CONSTR,FOLLOW_CONSTR_in_methodAndConstructorDeclaration283); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_modifier_in_methodAndConstructorDeclaration285);
                    modifier();

                    state._fsp--;

                    IDENTIFIER4=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_methodAndConstructorDeclaration287); 
                     methodName = (IDENTIFIER4!=null?IDENTIFIER4.getText():null); 
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:234:73: ( formalParameters )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==FPARMS) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:234:73: formalParameters
                            {
                            pushFollow(FOLLOW_formalParameters_in_methodAndConstructorDeclaration291);
                            formalParameters();

                            state._fsp--;


                            }
                            break;

                    }

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:234:91: ( constructorBody )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==CBODY) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:234:91: constructorBody
                            {
                            pushFollow(FOLLOW_constructorBody_in_methodAndConstructorDeclaration294);
                            constructorBody();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            JaScope_stack.pop();

        }
        return ;
    }
    // $ANTLR end "methodAndConstructorDeclaration"


    // $ANTLR start "fieldDeclaration"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:237:1: fieldDeclaration : ^( FIELD modifier variableDeclarator ) ;
    public final void fieldDeclaration() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:238:5: ( ^( FIELD modifier variableDeclarator ) )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:238:9: ^( FIELD modifier variableDeclarator )
            {
            match(input,FIELD,FOLLOW_FIELD_in_fieldDeclaration321); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_modifier_in_fieldDeclaration323);
            modifier();

            state._fsp--;

            pushFollow(FOLLOW_variableDeclarator_in_fieldDeclaration325);
            variableDeclarator();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "fieldDeclaration"

    public static class variableDeclarator_return extends TreeRuleReturnScope {
        public CommonTree id;
        public Type t;
    };

    // $ANTLR start "variableDeclarator"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:241:1: variableDeclarator returns [CommonTree id, Type t] : variableDeclaratorId ( variableInitializer[$variableDeclaratorId.t, $variableDeclaratorId.id] )? ;
    public final JaWalker.variableDeclarator_return variableDeclarator() throws RecognitionException {
        JaWalker.variableDeclarator_return retval = new JaWalker.variableDeclarator_return();
        retval.start = input.LT(1);

        JaWalker.variableDeclaratorId_return variableDeclaratorId5 = null;


        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:242:5: ( variableDeclaratorId ( variableInitializer[$variableDeclaratorId.t, $variableDeclaratorId.id] )? )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:242:9: variableDeclaratorId ( variableInitializer[$variableDeclaratorId.t, $variableDeclaratorId.id] )?
            {
            pushFollow(FOLLOW_variableDeclaratorId_in_variableDeclarator350);
            variableDeclaratorId5=variableDeclaratorId();

            state._fsp--;

             retval.id = (variableDeclaratorId5!=null?variableDeclaratorId5.id:null); retval.t = (variableDeclaratorId5!=null?variableDeclaratorId5.t:null); 
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:242:96: ( variableInitializer[$variableDeclaratorId.t, $variableDeclaratorId.id] )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==METHODCALL||(LA10_0>=FIELDACCESS && LA10_0<=DOTCLASS)||(LA10_0>=ARRAYINIT && LA10_0<=CAST)||LA10_0==IDENTIFIER||LA10_0==THIS||(LA10_0>=INTLITERAL && LA10_0<=NULLLITERAL)||(LA10_0>=INSTANCEOF && LA10_0<=NEW)||(LA10_0>=EQ && LA10_0<=SLASH)||(LA10_0>=99 && LA10_0<=103)||LA10_0==106) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:242:97: variableInitializer[$variableDeclaratorId.t, $variableDeclaratorId.id]
                    {
                    pushFollow(FOLLOW_variableInitializer_in_variableDeclarator355);
                    variableInitializer((variableDeclaratorId5!=null?variableDeclaratorId5.t:null), (variableDeclaratorId5!=null?variableDeclaratorId5.id:null));

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "variableDeclarator"

    public static class variableDeclaratorId_return extends TreeRuleReturnScope {
        public CommonTree id;
        public Type t;
    };

    // $ANTLR start "variableDeclaratorId"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:245:1: variableDeclaratorId returns [CommonTree id, Type t] : type IDENTIFIER ;
    public final JaWalker.variableDeclaratorId_return variableDeclaratorId() throws RecognitionException {
        JaWalker.variableDeclaratorId_return retval = new JaWalker.variableDeclaratorId_return();
        retval.start = input.LT(1);

        CommonTree IDENTIFIER6=null;
        Type type7 = null;


        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:246:5: ( type IDENTIFIER )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:246:9: type IDENTIFIER
            {
            pushFollow(FOLLOW_type_in_variableDeclaratorId385);
            type7=type();

            state._fsp--;

            IDENTIFIER6=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variableDeclaratorId387); 
             retval.id = IDENTIFIER6; retval.t = type7; 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "variableDeclaratorId"


    // $ANTLR start "variableInitializer"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:249:1: variableInitializer[Type tin, CommonTree token] : ( arrayInitializer[$tin] | e= expression );
    public final void variableInitializer(Type tin, CommonTree token) throws RecognitionException {
        JaWalker.expression_return e = null;


        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:250:5: ( arrayInitializer[$tin] | e= expression )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ARRAYINIT) ) {
                alt11=1;
            }
            else if ( (LA11_0==METHODCALL||(LA11_0>=FIELDACCESS && LA11_0<=DOTCLASS)||(LA11_0>=PREINC && LA11_0<=CAST)||LA11_0==IDENTIFIER||LA11_0==THIS||(LA11_0>=INTLITERAL && LA11_0<=NULLLITERAL)||(LA11_0>=INSTANCEOF && LA11_0<=NEW)||(LA11_0>=EQ && LA11_0<=SLASH)||(LA11_0>=99 && LA11_0<=103)||LA11_0==106) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:250:9: arrayInitializer[$tin]
                    {
                     if(tin.isArray()) {
                        	  	tin = ((ArrayType)tin).getHostType();
                        	  } else {
                        	  	errorLog.add(new IllegalArrayInitializerException(tin.toString(), token.getLine(), token.getCharPositionInLine()));
                        	  }
                        	
                    pushFollow(FOLLOW_arrayInitializer_in_variableInitializer423);
                    arrayInitializer(tin);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:258:9: e= expression
                    {
                    pushFollow(FOLLOW_expression_in_variableInitializer442);
                    e=expression();

                    state._fsp--;

                     if (ruleTypeCheck((e!=null?e.t:null))) {
                    	  	assignOperation(token, tin, (e!=null?e.t:null));
                          	  }
                            

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "variableInitializer"


    // $ANTLR start "arrayInitializer"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:265:1: arrayInitializer[Type tin] : ^( ARRAYINIT ( variableInitializer[$tin, $ARRAYINIT] )* ) ;
    public final void arrayInitializer(Type tin) throws RecognitionException {
        CommonTree ARRAYINIT8=null;

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:266:5: ( ^( ARRAYINIT ( variableInitializer[$tin, $ARRAYINIT] )* ) )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:266:9: ^( ARRAYINIT ( variableInitializer[$tin, $ARRAYINIT] )* )
            {
            ARRAYINIT8=(CommonTree)match(input,ARRAYINIT,FOLLOW_ARRAYINIT_in_arrayInitializer476); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:266:21: ( variableInitializer[$tin, $ARRAYINIT] )*
                loop12:
                do {
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==METHODCALL||(LA12_0>=FIELDACCESS && LA12_0<=DOTCLASS)||(LA12_0>=ARRAYINIT && LA12_0<=CAST)||LA12_0==IDENTIFIER||LA12_0==THIS||(LA12_0>=INTLITERAL && LA12_0<=NULLLITERAL)||(LA12_0>=INSTANCEOF && LA12_0<=NEW)||(LA12_0>=EQ && LA12_0<=SLASH)||(LA12_0>=99 && LA12_0<=103)||LA12_0==106) ) {
                        alt12=1;
                    }


                    switch (alt12) {
                	case 1 :
                	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:266:21: variableInitializer[$tin, $ARRAYINIT]
                	    {
                	    pushFollow(FOLLOW_variableInitializer_in_arrayInitializer478);
                	    variableInitializer(tin, ARRAYINIT8);

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop12;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "arrayInitializer"


    // $ANTLR start "modifier"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:269:1: modifier : ( PUBLIC | PRIVATE );
    public final void modifier() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:270:5: ( PUBLIC | PRIVATE )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:
            {
            if ( input.LA(1)==PUBLIC||input.LA(1)==PRIVATE ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "modifier"


    // $ANTLR start "type"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:274:1: type returns [Type t] : ( primitiveType | classType | arrayType );
    public final Type type() throws RecognitionException {
        Type t = null;

        BasicType primitiveType9 = null;

        JaWalker.classType_return classType10 = null;

        ArrayType arrayType11 = null;


        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:275:5: ( primitiveType | classType | arrayType )
            int alt13=3;
            switch ( input.LA(1) ) {
            case CHAR:
            case BYTE:
            case SHORT:
            case INT:
            case LONG:
            case FLOAT:
            case DOUBLE:
            case BOOLEAN:
                {
                alt13=1;
                }
                break;
            case IDENTIFIER:
                {
                alt13=2;
                }
                break;
            case ARRAYTYPE:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:275:7: primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_type539);
                    primitiveType9=primitiveType();

                    state._fsp--;

                     t = primitiveType9; 

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:276:7: classType
                    {
                    pushFollow(FOLLOW_classType_in_type549);
                    classType10=classType();

                    state._fsp--;

                     t = (classType10!=null?classType10.t:null);      

                    }
                    break;
                case 3 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:277:7: arrayType
                    {
                    pushFollow(FOLLOW_arrayType_in_type563);
                    arrayType11=arrayType();

                    state._fsp--;

                     t = arrayType11;      

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return t;
    }
    // $ANTLR end "type"


    // $ANTLR start "arrayType"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:280:1: arrayType returns [ArrayType t] : brackets ;
    public final ArrayType arrayType() throws RecognitionException {
        ArrayType t = null;

        ArrayType brackets12 = null;


        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:281:5: ( brackets )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:281:7: brackets
            {
            pushFollow(FOLLOW_brackets_in_arrayType591);
            brackets12=brackets();

            state._fsp--;

             t = brackets12; 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return t;
    }
    // $ANTLR end "arrayType"

    public static class classType_return extends TreeRuleReturnScope {
        public ReferenceType t;
    };

    // $ANTLR start "classType"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:285:1: classType returns [ReferenceType t] : IDENTIFIER ;
    public final JaWalker.classType_return classType() throws RecognitionException {
        JaWalker.classType_return retval = new JaWalker.classType_return();
        retval.start = input.LT(1);

        CommonTree IDENTIFIER13=null;

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:286:5: ( IDENTIFIER )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:286:7: IDENTIFIER
            {
            IDENTIFIER13=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classType621); 
             retval.t = cTab.get((IDENTIFIER13!=null?IDENTIFIER13.getText():null)); 
                	  if (retval.t == null) errorLog.add(new CannotFindSymbolException(("class " + (IDENTIFIER13!=null?IDENTIFIER13.getText():null)), "class " + rt.toString(), (IDENTIFIER13!=null?IDENTIFIER13.getLine():0), (IDENTIFIER13!=null?IDENTIFIER13.getCharPositionInLine():0)));
                	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "classType"


    // $ANTLR start "primitiveType"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:292:1: primitiveType returns [BasicType bs] : ( CHAR | BYTE | SHORT | INT | LONG | FLOAT | DOUBLE | BOOLEAN );
    public final BasicType primitiveType() throws RecognitionException {
        BasicType bs = null;

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:293:5: ( CHAR | BYTE | SHORT | INT | LONG | FLOAT | DOUBLE | BOOLEAN )
            int alt14=8;
            switch ( input.LA(1) ) {
            case CHAR:
                {
                alt14=1;
                }
                break;
            case BYTE:
                {
                alt14=2;
                }
                break;
            case SHORT:
                {
                alt14=3;
                }
                break;
            case INT:
                {
                alt14=4;
                }
                break;
            case LONG:
                {
                alt14=5;
                }
                break;
            case FLOAT:
                {
                alt14=6;
                }
                break;
            case DOUBLE:
                {
                alt14=7;
                }
                break;
            case BOOLEAN:
                {
                alt14=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:293:9: CHAR
                    {
                    match(input,CHAR,FOLLOW_CHAR_in_primitiveType652); 
                     bs = BasicType.CHAR;    

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:294:9: BYTE
                    {
                    match(input,BYTE,FOLLOW_BYTE_in_primitiveType667); 
                     bs = BasicType.BYTE;    

                    }
                    break;
                case 3 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:295:9: SHORT
                    {
                    match(input,SHORT,FOLLOW_SHORT_in_primitiveType682); 
                     bs = BasicType.SHORT;   

                    }
                    break;
                case 4 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:296:9: INT
                    {
                    match(input,INT,FOLLOW_INT_in_primitiveType696); 
                     bs = BasicType.INT;     

                    }
                    break;
                case 5 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:297:9: LONG
                    {
                    match(input,LONG,FOLLOW_LONG_in_primitiveType712); 
                     bs = BasicType.LONG;    

                    }
                    break;
                case 6 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:298:9: FLOAT
                    {
                    match(input,FLOAT,FOLLOW_FLOAT_in_primitiveType727); 
                     bs = BasicType.FLOAT;   

                    }
                    break;
                case 7 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:299:9: DOUBLE
                    {
                    match(input,DOUBLE,FOLLOW_DOUBLE_in_primitiveType741); 
                     bs = BasicType.DOUBLE;  

                    }
                    break;
                case 8 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:300:9: BOOLEAN
                    {
                    match(input,BOOLEAN,FOLLOW_BOOLEAN_in_primitiveType754); 
                     bs = BasicType.BOOLEAN; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return bs;
    }
    // $ANTLR end "primitiveType"


    // $ANTLR start "formalParameters"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:303:1: formalParameters : ^( FPARMS ( formalParameterDecls )? ) ;
    public final void formalParameters() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:304:5: ( ^( FPARMS ( formalParameterDecls )? ) )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:304:9: ^( FPARMS ( formalParameterDecls )? )
            {
            match(input,FPARMS,FOLLOW_FPARMS_in_formalParameters780); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:304:18: ( formalParameterDecls )?
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==FPARM) ) {
                    alt15=1;
                }
                switch (alt15) {
                    case 1 :
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:304:18: formalParameterDecls
                        {
                        pushFollow(FOLLOW_formalParameterDecls_in_formalParameters782);
                        formalParameterDecls();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "formalParameters"


    // $ANTLR start "formalParameterDecls"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:307:1: formalParameterDecls : ^( FPARM variableDeclaratorId ) ( formalParameterDecls )? ;
    public final void formalParameterDecls() throws RecognitionException {
        JaWalker.variableDeclaratorId_return variableDeclaratorId14 = null;


        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:308:5: ( ^( FPARM variableDeclaratorId ) ( formalParameterDecls )? )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:308:7: ^( FPARM variableDeclaratorId ) ( formalParameterDecls )?
            {
            match(input,FPARM,FOLLOW_FPARM_in_formalParameterDecls807); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_variableDeclaratorId_in_formalParameterDecls809);
            variableDeclaratorId14=variableDeclaratorId();

            state._fsp--;


            match(input, Token.UP, null); 
             formalParameters.add((variableDeclaratorId14!=null?variableDeclaratorId14.t:null)); addVariableToScope((variableDeclaratorId14!=null?variableDeclaratorId14.id:null), (variableDeclaratorId14!=null?variableDeclaratorId14.t:null)); 
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:308:159: ( formalParameterDecls )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==FPARM) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:308:159: formalParameterDecls
                    {
                    pushFollow(FOLLOW_formalParameterDecls_in_formalParameterDecls814);
                    formalParameterDecls();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "formalParameterDecls"


    // $ANTLR start "methodBody"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:311:1: methodBody : ^( MBODY block ) ;
    public final void methodBody() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:312:5: ( ^( MBODY block ) )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:312:9: ^( MBODY block )
            {
            match(input,MBODY,FOLLOW_MBODY_in_methodBody839); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                pushFollow(FOLLOW_block_in_methodBody841);
                block();

                state._fsp--;


                match(input, Token.UP, null); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "methodBody"


    // $ANTLR start "constructorBody"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:316:1: constructorBody : ^( CBODY ( explicitConstructorInvocation )? ( blockStatement )* ) ;
    public final void constructorBody() throws RecognitionException {
        JaScope_stack.push(new JaScope_scope());


        	((JaScope_scope)JaScope_stack.peek()).symbols = new HashMap<String, Type>();

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:321:5: ( ^( CBODY ( explicitConstructorInvocation )? ( blockStatement )* ) )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:321:7: ^( CBODY ( explicitConstructorInvocation )? ( blockStatement )* )
            {
            match(input,CBODY,FOLLOW_CBODY_in_constructorBody895); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:321:15: ( explicitConstructorInvocation )?
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==CONSTRCALL) ) {
                    alt17=1;
                }
                switch (alt17) {
                    case 1 :
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:321:15: explicitConstructorInvocation
                        {
                        pushFollow(FOLLOW_explicitConstructorInvocation_in_constructorBody897);
                        explicitConstructorInvocation();

                        state._fsp--;


                        }
                        break;

                }

                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:321:46: ( blockStatement )*
                loop18:
                do {
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( ((LA18_0>=VARDECL && LA18_0<=STMT)||LA18_0==DOWHILE||(LA18_0>=IF && LA18_0<=WHILE)||LA18_0==RETURN) ) {
                        alt18=1;
                    }


                    switch (alt18) {
                	case 1 :
                	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:321:46: blockStatement
                	    {
                	    pushFollow(FOLLOW_blockStatement_in_constructorBody900);
                	    blockStatement();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop18;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            JaScope_stack.pop();

        }
        return ;
    }
    // $ANTLR end "constructorBody"


    // $ANTLR start "explicitConstructorInvocation"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:324:1: explicitConstructorInvocation : ( ^( CONSTRCALL THIS ( arguments )? ) | ^( CONSTRCALL SUPER ( arguments )? ) );
    public final void explicitConstructorInvocation() throws RecognitionException {
        CommonTree THIS16=null;
        CommonTree SUPER18=null;
        JaWalker.arguments_return arguments15 = null;

        JaWalker.arguments_return arguments17 = null;


        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:325:5: ( ^( CONSTRCALL THIS ( arguments )? ) | ^( CONSTRCALL SUPER ( arguments )? ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==CONSTRCALL) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==DOWN) ) {
                    int LA21_2 = input.LA(3);

                    if ( (LA21_2==THIS) ) {
                        alt21=1;
                    }
                    else if ( (LA21_2==SUPER) ) {
                        alt21=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:325:9: ^( CONSTRCALL THIS ( arguments )? )
                    {
                    match(input,CONSTRCALL,FOLLOW_CONSTRCALL_in_explicitConstructorInvocation922); 

                    match(input, Token.DOWN, null); 
                    THIS16=(CommonTree)match(input,THIS,FOLLOW_THIS_in_explicitConstructorInvocation924); 
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:325:28: ( arguments )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==ARGUMENTS) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:325:28: arguments
                            {
                            pushFollow(FOLLOW_arguments_in_explicitConstructorInvocation927);
                            arguments15=arguments();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                     if((arguments15!=null?arguments15.types:null) == null || ruleTypeCheck((arguments15!=null?arguments15.types:null).toArray(new Type[(arguments15!=null?arguments15.types:null).size()]))) {
                    	    	  try {
                    			rt.bindConstructor((arguments15!=null?arguments15.types:null));
                    	    	  } catch (EarlyBindingException ex) {
                    	    	  	errorLog.add(new CannotFindSymbolException(("constructor " + rt.toString() + '(' + printArguments((arguments15!=null?arguments15.types:null)) + ')'), "class " + rt.toString(), (THIS16!=null?THIS16.getLine():0), (THIS16!=null?THIS16.getCharPositionInLine():0)));
                    	    	  }
                        	  } 
                        	

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:334:7: ^( CONSTRCALL SUPER ( arguments )? )
                    {
                    match(input,CONSTRCALL,FOLLOW_CONSTRCALL_in_explicitConstructorInvocation948); 

                    match(input, Token.DOWN, null); 
                    SUPER18=(CommonTree)match(input,SUPER,FOLLOW_SUPER_in_explicitConstructorInvocation950); 
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:334:26: ( arguments )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==ARGUMENTS) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:334:26: arguments
                            {
                            pushFollow(FOLLOW_arguments_in_explicitConstructorInvocation952);
                            arguments17=arguments();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                     ReferenceType sc = rt.getSuperClass();
                        	  if( (arguments17!=null?arguments17.types:null) == null || ruleTypeCheck((arguments17!=null?arguments17.types:null).toArray(new Type[(arguments17!=null?arguments17.types:null).size()])) ) {
                    	    	  try {
                    			 sc.bindConstructor((arguments17!=null?arguments17.types:null));
                    		  } catch (EarlyBindingException ex) {
                    			errorLog.add(new CannotFindSymbolException(("constructor " + sc.toString() + '(' + printArguments((arguments17!=null?arguments17.types:null)) + ')'), "class " + sc.toString(), (SUPER18!=null?SUPER18.getLine():0), (SUPER18!=null?SUPER18.getCharPositionInLine():0)));
                    		  }
                    	  }
                        	

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "explicitConstructorInvocation"


    // $ANTLR start "literal"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:346:1: literal returns [Type t] : ( INTLITERAL | LONGLITERAL | FLOATLITERAL | DOUBLELITERAL | CHARLITERAL | STRINGLITERAL | BOOLEANLITERAL | NULLLITERAL );
    public final Type literal() throws RecognitionException {
        Type t = null;

        CommonTree INTLITERAL19=null;

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:347:5: ( INTLITERAL | LONGLITERAL | FLOATLITERAL | DOUBLELITERAL | CHARLITERAL | STRINGLITERAL | BOOLEANLITERAL | NULLLITERAL )
            int alt22=8;
            switch ( input.LA(1) ) {
            case INTLITERAL:
                {
                alt22=1;
                }
                break;
            case LONGLITERAL:
                {
                alt22=2;
                }
                break;
            case FLOATLITERAL:
                {
                alt22=3;
                }
                break;
            case DOUBLELITERAL:
                {
                alt22=4;
                }
                break;
            case CHARLITERAL:
                {
                alt22=5;
                }
                break;
            case STRINGLITERAL:
                {
                alt22=6;
                }
                break;
            case BOOLEANLITERAL:
                {
                alt22=7;
                }
                break;
            case NULLLITERAL:
                {
                alt22=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:347:9: INTLITERAL
                    {
                    INTLITERAL19=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_literal984); 
                     int literal = Integer.parseInt((INTLITERAL19!=null?INTLITERAL19.getText():null));
                        			 if ((literal >= -128) &&( literal <= 127)) 
                        			 	{ t = BasicType.BYTE; } 
                        			 else 
                        			 	if ((literal >= -32.768) &&( literal <= 32.767)) 
                        			 		{ t = BasicType.SHORT; } 
                        			 	else
                        			 		{ t = BasicType.INT; }
                        		       

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:356:9: LONGLITERAL
                    {
                    match(input,LONGLITERAL,FOLLOW_LONGLITERAL_in_literal1000); 
                     t = BasicType.LONG;       

                    }
                    break;
                case 3 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:357:9: FLOATLITERAL
                    {
                    match(input,FLOATLITERAL,FOLLOW_FLOATLITERAL_in_literal1015); 
                     t = BasicType.FLOAT;      

                    }
                    break;
                case 4 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:358:7: DOUBLELITERAL
                    {
                    match(input,DOUBLELITERAL,FOLLOW_DOUBLELITERAL_in_literal1027); 
                     t = BasicType.DOUBLE;     

                    }
                    break;
                case 5 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:359:9: CHARLITERAL
                    {
                    match(input,CHARLITERAL,FOLLOW_CHARLITERAL_in_literal1040); 
                     t = BasicType.CHAR;       

                    }
                    break;
                case 6 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:360:9: STRINGLITERAL
                    {
                    match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_literal1055); 
                     t = ReferenceType.STRING; 

                    }
                    break;
                case 7 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:361:9: BOOLEANLITERAL
                    {
                    match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_literal1068); 
                     t = BasicType.BOOLEAN;    

                    }
                    break;
                case 8 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:362:9: NULLLITERAL
                    {
                    match(input,NULLLITERAL,FOLLOW_NULLLITERAL_in_literal1080); 
                     t = NullType.TYPE;        

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return t;
    }
    // $ANTLR end "literal"


    // $ANTLR start "block"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:367:1: block : ( blockStatement )* ;
    public final void block() throws RecognitionException {
        JaScope_stack.push(new JaScope_scope());


        	((JaScope_scope)JaScope_stack.peek()).symbols = new HashMap<String, Type>();

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:372:5: ( ( blockStatement )* )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:372:9: ( blockStatement )*
            {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:372:9: ( blockStatement )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=VARDECL && LA23_0<=STMT)||LA23_0==DOWHILE||(LA23_0>=IF && LA23_0<=WHILE)||LA23_0==RETURN) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:372:9: blockStatement
            	    {
            	    pushFollow(FOLLOW_blockStatement_in_block1116);
            	    blockStatement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            JaScope_stack.pop();

        }
        return ;
    }
    // $ANTLR end "block"


    // $ANTLR start "blockStatement"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:375:1: blockStatement : ( localVariableDeclarationStatement | statement );
    public final void blockStatement() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:376:5: ( localVariableDeclarationStatement | statement )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==VARDECL) ) {
                alt24=1;
            }
            else if ( ((LA24_0>=BLOCK && LA24_0<=STMT)||LA24_0==DOWHILE||(LA24_0>=IF && LA24_0<=WHILE)||LA24_0==RETURN) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:376:9: localVariableDeclarationStatement
                    {
                    pushFollow(FOLLOW_localVariableDeclarationStatement_in_blockStatement1140);
                    localVariableDeclarationStatement();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:377:9: statement
                    {
                    pushFollow(FOLLOW_statement_in_blockStatement1150);
                    statement();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "blockStatement"


    // $ANTLR start "localVariableDeclarationStatement"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:380:1: localVariableDeclarationStatement : localVariableDeclaration ;
    public final void localVariableDeclarationStatement() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:381:5: ( localVariableDeclaration )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:381:7: localVariableDeclaration
            {
            pushFollow(FOLLOW_localVariableDeclaration_in_localVariableDeclarationStatement1171);
            localVariableDeclaration();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "localVariableDeclarationStatement"


    // $ANTLR start "localVariableDeclaration"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:384:1: localVariableDeclaration : ^( VARDECL variableDeclarator ) ;
    public final void localVariableDeclaration() throws RecognitionException {
        JaWalker.variableDeclarator_return variableDeclarator20 = null;


        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:385:5: ( ^( VARDECL variableDeclarator ) )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:385:7: ^( VARDECL variableDeclarator )
            {
            match(input,VARDECL,FOLLOW_VARDECL_in_localVariableDeclaration1189); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_variableDeclarator_in_localVariableDeclaration1191);
            variableDeclarator20=variableDeclarator();

            state._fsp--;


            match(input, Token.UP, null); 
             addVariableToScope((variableDeclarator20!=null?variableDeclarator20.id:null), (variableDeclarator20!=null?variableDeclarator20.t:null)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "localVariableDeclaration"


    // $ANTLR start "statement"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:390:1: statement : ( ^( BLOCK block ) | ^( IF condition ( ^( THEN statement ) )? ( elseStmt )? ) | ^( FOR ( ^( INIT forInit ) )? ( condition )? ( ^( UPDATE forUpdate ) )? statement ) | ^( WHILE condition statement ) | ^( DOWHILE condition statement ) | ^( RETURN expression ) | RETURN | ^( STMT statementExpression ) );
    public final void statement() throws RecognitionException {
        CommonTree RETURN21=null;
        CommonTree RETURN23=null;
        JaWalker.expression_return expression22 = null;


        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:391:5: ( ^( BLOCK block ) | ^( IF condition ( ^( THEN statement ) )? ( elseStmt )? ) | ^( FOR ( ^( INIT forInit ) )? ( condition )? ( ^( UPDATE forUpdate ) )? statement ) | ^( WHILE condition statement ) | ^( DOWHILE condition statement ) | ^( RETURN expression ) | RETURN | ^( STMT statementExpression ) )
            int alt30=8;
            alt30 = dfa30.predict(input);
            switch (alt30) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:391:9: ^( BLOCK block )
                    {
                    match(input,BLOCK,FOLLOW_BLOCK_in_statement1228); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_block_in_statement1230);
                        block();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:392:9: ^( IF condition ( ^( THEN statement ) )? ( elseStmt )? )
                    {
                    match(input,IF,FOLLOW_IF_in_statement1242); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_condition_in_statement1244);
                    condition();

                    state._fsp--;

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:392:24: ( ^( THEN statement ) )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==THEN) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:392:25: ^( THEN statement )
                            {
                            match(input,THEN,FOLLOW_THEN_in_statement1248); 

                            match(input, Token.DOWN, null); 
                            pushFollow(FOLLOW_statement_in_statement1250);
                            statement();

                            state._fsp--;


                            match(input, Token.UP, null); 

                            }
                            break;

                    }

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:392:45: ( elseStmt )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==ELSE) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:392:45: elseStmt
                            {
                            pushFollow(FOLLOW_elseStmt_in_statement1255);
                            elseStmt();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:393:9: ^( FOR ( ^( INIT forInit ) )? ( condition )? ( ^( UPDATE forUpdate ) )? statement )
                    {
                    match(input,FOR,FOLLOW_FOR_in_statement1268); 

                    match(input, Token.DOWN, null); 
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:393:15: ( ^( INIT forInit ) )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==INIT) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:393:16: ^( INIT forInit )
                            {
                            match(input,INIT,FOLLOW_INIT_in_statement1272); 

                            match(input, Token.DOWN, null); 
                            pushFollow(FOLLOW_forInit_in_statement1274);
                            forInit();

                            state._fsp--;


                            match(input, Token.UP, null); 

                            }
                            break;

                    }

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:393:34: ( condition )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==CONDITION) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:393:34: condition
                            {
                            pushFollow(FOLLOW_condition_in_statement1279);
                            condition();

                            state._fsp--;


                            }
                            break;

                    }

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:393:45: ( ^( UPDATE forUpdate ) )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==UPDATE) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:393:46: ^( UPDATE forUpdate )
                            {
                            match(input,UPDATE,FOLLOW_UPDATE_in_statement1284); 

                            match(input, Token.DOWN, null); 
                            pushFollow(FOLLOW_forUpdate_in_statement1286);
                            forUpdate();

                            state._fsp--;


                            match(input, Token.UP, null); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_statement_in_statement1291);
                    statement();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:394:9: ^( WHILE condition statement )
                    {
                    match(input,WHILE,FOLLOW_WHILE_in_statement1304); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_condition_in_statement1306);
                    condition();

                    state._fsp--;

                    pushFollow(FOLLOW_statement_in_statement1308);
                    statement();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:395:9: ^( DOWHILE condition statement )
                    {
                    match(input,DOWHILE,FOLLOW_DOWHILE_in_statement1320); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_condition_in_statement1322);
                    condition();

                    state._fsp--;

                    pushFollow(FOLLOW_statement_in_statement1324);
                    statement();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:396:9: ^( RETURN expression )
                    {
                    RETURN21=(CommonTree)match(input,RETURN,FOLLOW_RETURN_in_statement1336); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_statement1338);
                    expression22=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if ( ruleTypeCheck(methodReturn)) {
                        	  	if(methodReturn.isVoid())
                        			errorLog.add(new ReturnFromVoidMethodException((RETURN21!=null?RETURN21.getLine():0), (RETURN21!=null?RETURN21.getCharPositionInLine():0)));    		
                        	  	else if (ruleTypeCheck((expression22!=null?expression22.t:null)))
                        	  		assignOperation(RETURN21, methodReturn, (expression22!=null?expression22.t:null));
                        	  }
                        	

                    }
                    break;
                case 7 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:404:9: RETURN
                    {
                    RETURN23=(CommonTree)match(input,RETURN,FOLLOW_RETURN_in_statement1361); 
                     if((methodReturn==null) || (!methodReturn.isVoid())) errorLog.add(new MissingReturnValueException((RETURN23!=null?RETURN23.getLine():0), (RETURN23!=null?RETURN23.getCharPositionInLine():0))); 

                    }
                    break;
                case 8 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:405:9: ^( STMT statementExpression )
                    {
                    match(input,STMT,FOLLOW_STMT_in_statement1374); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_statementExpression_in_statement1376);
                    statementExpression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "statement"


    // $ANTLR start "condition"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:408:1: condition : ^( CONDITION expression ) ;
    public final void condition() throws RecognitionException {
        CommonTree CONDITION25=null;
        JaWalker.expression_return expression24 = null;


        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:409:5: ( ^( CONDITION expression ) )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:409:7: ^( CONDITION expression )
            {
            CONDITION25=(CommonTree)match(input,CONDITION,FOLLOW_CONDITION_in_condition1399); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_condition1401);
            expression24=expression();

            state._fsp--;


            match(input, Token.UP, null); 
             if (ruleTypeCheck((expression24!=null?expression24.t:null))) {
                	  	if (!((expression24!=null?expression24.t:null) == BasicType.BOOLEAN)) errorLog.add(new IncompatibleTypesException(BasicType.BOOLEAN.toString(), (expression24!=null?expression24.t:null).toString(), (CONDITION25!=null?CONDITION25.getLine():0), (CONDITION25!=null?CONDITION25.getCharPositionInLine():0)));
                	  }	
                	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "condition"


    // $ANTLR start "elseStmt"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:416:1: elseStmt : ^( ELSE statement ) ;
    public final void elseStmt() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:417:5: ( ^( ELSE statement ) )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:417:7: ^( ELSE statement )
            {
            match(input,ELSE,FOLLOW_ELSE_in_elseStmt1434); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_statement_in_elseStmt1436);
            statement();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "elseStmt"


    // $ANTLR start "forInit"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:420:1: forInit : ( localVariableDeclaration | expressionList );
    public final void forInit() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:421:5: ( localVariableDeclaration | expressionList )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==VARDECL) ) {
                alt31=1;
            }
            else if ( (LA31_0==METHODCALL||(LA31_0>=FIELDACCESS && LA31_0<=DOTCLASS)||(LA31_0>=PREINC && LA31_0<=CAST)||LA31_0==IDENTIFIER||LA31_0==THIS||(LA31_0>=INTLITERAL && LA31_0<=NULLLITERAL)||(LA31_0>=INSTANCEOF && LA31_0<=NEW)||(LA31_0>=EQ && LA31_0<=SLASH)||(LA31_0>=99 && LA31_0<=103)||LA31_0==106) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:421:9: localVariableDeclaration
                    {
                    pushFollow(FOLLOW_localVariableDeclaration_in_forInit1456);
                    localVariableDeclaration();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:422:9: expressionList
                    {
                    pushFollow(FOLLOW_expressionList_in_forInit1466);
                    expressionList();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "forInit"


    // $ANTLR start "forUpdate"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:425:1: forUpdate : expressionList ;
    public final void forUpdate() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:426:5: ( expressionList )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:426:9: expressionList
            {
            pushFollow(FOLLOW_expressionList_in_forUpdate1485);
            expressionList();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "forUpdate"


    // $ANTLR start "expressionList"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:433:1: expressionList returns [ArrayList<Type> types] : ( expression )+ ;
    public final ArrayList<Type> expressionList() throws RecognitionException {
        ArrayList<Type> types = null;

        JaWalker.expression_return expression26 = null;



        	types = new ArrayList<Type>();

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:437:5: ( ( expression )+ )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:437:9: ( expression )+
            {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:437:9: ( expression )+
            int cnt32=0;
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==METHODCALL||(LA32_0>=FIELDACCESS && LA32_0<=DOTCLASS)||(LA32_0>=PREINC && LA32_0<=CAST)||LA32_0==IDENTIFIER||LA32_0==THIS||(LA32_0>=INTLITERAL && LA32_0<=NULLLITERAL)||(LA32_0>=INSTANCEOF && LA32_0<=NEW)||(LA32_0>=EQ && LA32_0<=SLASH)||(LA32_0>=99 && LA32_0<=103)||LA32_0==106) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:437:10: expression
            	    {
            	    pushFollow(FOLLOW_expression_in_expressionList1520);
            	    expression26=expression();

            	    state._fsp--;

            	     types.add((expression26!=null?expression26.t:null)); 

            	    }
            	    break;

            	default :
            	    if ( cnt32 >= 1 ) break loop32;
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return types;
    }
    // $ANTLR end "expressionList"


    // $ANTLR start "statementExpression"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:440:1: statementExpression : expression ;
    public final void statementExpression() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:441:5: ( expression )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:441:9: expression
            {
            pushFollow(FOLLOW_expression_in_statementExpression1543);
            expression();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "statementExpression"

    public static class expression_return extends TreeRuleReturnScope {
        public Type t;
        public boolean isVar;
    };

    // $ANTLR start "expression"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:444:1: expression returns [Type t, boolean isVar] : ( ^( EQ e1= expression e2= expression ) | ^( PLUS e1= expression e2= expression ) | ^( MINUS e1= expression e2= expression ) | ^( STAR e1= expression e2= expression ) | ^( SLASH e1= expression e2= expression ) | ^(mod= '%' e1= expression e2= expression ) | ^(or= '||' e1= expression e2= expression ) | ^(and= '&&' e1= expression e2= expression ) | ^(eq= '==' e1= expression e2= expression ) | ^(nq= '!=' e1= expression e2= expression ) | ^( INSTANCEOF e= expression type ) | ^( COMPAREOP e1= expression e2= expression ) | ^(op= ( UNARYPLUS | UNARYMINUS ) e= expression ) | ^(op= ( PREINC | PREDEC ) e= expression ) | ^(op= '!' e= expression ) | ^( CAST pt= primitiveType e= expression ) | ^( CAST at= arrayType e= expression ) | ^( CAST ct= classType e= expression ) | ^( NEW creator ) | ^(op= ( POSTINC | POSTDEC ) e= expression ) | selector | primary );
    public final JaWalker.expression_return expression() throws RecognitionException {
        JaWalker.expression_return retval = new JaWalker.expression_return();
        retval.start = input.LT(1);

        CommonTree mod=null;
        CommonTree or=null;
        CommonTree and=null;
        CommonTree eq=null;
        CommonTree nq=null;
        CommonTree op=null;
        CommonTree EQ27=null;
        CommonTree PLUS28=null;
        CommonTree MINUS29=null;
        CommonTree STAR30=null;
        CommonTree SLASH31=null;
        CommonTree INSTANCEOF33=null;
        CommonTree COMPAREOP34=null;
        CommonTree CAST35=null;
        CommonTree CAST36=null;
        CommonTree CAST37=null;
        JaWalker.expression_return e1 = null;

        JaWalker.expression_return e2 = null;

        JaWalker.expression_return e = null;

        BasicType pt = null;

        ArrayType at = null;

        JaWalker.classType_return ct = null;

        Type type32 = null;

        Type creator38 = null;

        JaWalker.selector_return selector39 = null;

        JaWalker.primary_return primary40 = null;


        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:445:5: ( ^( EQ e1= expression e2= expression ) | ^( PLUS e1= expression e2= expression ) | ^( MINUS e1= expression e2= expression ) | ^( STAR e1= expression e2= expression ) | ^( SLASH e1= expression e2= expression ) | ^(mod= '%' e1= expression e2= expression ) | ^(or= '||' e1= expression e2= expression ) | ^(and= '&&' e1= expression e2= expression ) | ^(eq= '==' e1= expression e2= expression ) | ^(nq= '!=' e1= expression e2= expression ) | ^( INSTANCEOF e= expression type ) | ^( COMPAREOP e1= expression e2= expression ) | ^(op= ( UNARYPLUS | UNARYMINUS ) e= expression ) | ^(op= ( PREINC | PREDEC ) e= expression ) | ^(op= '!' e= expression ) | ^( CAST pt= primitiveType e= expression ) | ^( CAST at= arrayType e= expression ) | ^( CAST ct= classType e= expression ) | ^( NEW creator ) | ^(op= ( POSTINC | POSTDEC ) e= expression ) | selector | primary )
            int alt33=22;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:445:9: ^( EQ e1= expression e2= expression )
                    {
                    EQ27=(CommonTree)match(input,EQ,FOLLOW_EQ_in_expression1569); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1573);
                    e1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1577);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if (!(e1!=null?e1.isVar:false)) 
                    	  	errorLog.add(new UnexpectedTypeException("variable", "value", (EQ27!=null?EQ27.getLine():0), (EQ27!=null?EQ27.getCharPositionInLine():0)));
                    	  else
                    	    	if(ruleTypeCheck((e1!=null?e1.t:null), (e2!=null?e2.t:null))) retval.t = assignOperation(EQ27, (e1!=null?e1.t:null), (e2!=null?e2.t:null));
                        	

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:451:7: ^( PLUS e1= expression e2= expression )
                    {
                    PLUS28=(CommonTree)match(input,PLUS,FOLLOW_PLUS_in_expression1595); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1602);
                    e1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1606);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck((e1!=null?e1.t:null), (e2!=null?e2.t:null))) retval.t = plusOperation(PLUS28, (e1!=null?e1.t:null), (e2!=null?e2.t:null)); 

                    }
                    break;
                case 3 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:452:7: ^( MINUS e1= expression e2= expression )
                    {
                    MINUS29=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_expression1618); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1624);
                    e1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1628);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck((e1!=null?e1.t:null), (e2!=null?e2.t:null))) retval.t = arithmeticOperation(MINUS29, (e1!=null?e1.t:null), (e2!=null?e2.t:null)); 

                    }
                    break;
                case 4 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:453:7: ^( STAR e1= expression e2= expression )
                    {
                    STAR30=(CommonTree)match(input,STAR,FOLLOW_STAR_in_expression1640); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1647);
                    e1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1651);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck((e1!=null?e1.t:null), (e2!=null?e2.t:null))) retval.t = arithmeticOperation(STAR30,  (e1!=null?e1.t:null), (e2!=null?e2.t:null)); 

                    }
                    break;
                case 5 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:454:7: ^( SLASH e1= expression e2= expression )
                    {
                    SLASH31=(CommonTree)match(input,SLASH,FOLLOW_SLASH_in_expression1663); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1669);
                    e1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1673);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck((e1!=null?e1.t:null), (e2!=null?e2.t:null))) retval.t = arithmeticOperation(SLASH31, (e1!=null?e1.t:null), (e2!=null?e2.t:null)); 

                    }
                    break;
                case 6 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:455:9: ^(mod= '%' e1= expression e2= expression )
                    {
                    mod=(CommonTree)match(input,103,FOLLOW_103_in_expression1689); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1693);
                    e1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1697);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck((e1!=null?e1.t:null), (e2!=null?e2.t:null))) retval.t = arithmeticOperation(mod,   (e1!=null?e1.t:null), (e2!=null?e2.t:null)); 

                    }
                    break;
                case 7 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:456:9: ^(or= '||' e1= expression e2= expression )
                    {
                    or=(CommonTree)match(input,99,FOLLOW_99_in_expression1713); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1718);
                    e1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1722);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck((e1!=null?e1.t:null), (e2!=null?e2.t:null))) retval.t = booleanOperation(or,  (e1!=null?e1.t:null), (e2!=null?e2.t:null)); 

                    }
                    break;
                case 8 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:457:9: ^(and= '&&' e1= expression e2= expression )
                    {
                    and=(CommonTree)match(input,100,FOLLOW_100_in_expression1738); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1742);
                    e1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1746);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck((e1!=null?e1.t:null), (e2!=null?e2.t:null))) retval.t = booleanOperation(and, (e1!=null?e1.t:null), (e2!=null?e2.t:null)); 

                    }
                    break;
                case 9 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:458:9: ^(eq= '==' e1= expression e2= expression )
                    {
                    eq=(CommonTree)match(input,101,FOLLOW_101_in_expression1762); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1767);
                    e1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1771);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck((e1!=null?e1.t:null), (e2!=null?e2.t:null))) retval.t = booleanOperation(eq,  (e1!=null?e1.t:null), (e2!=null?e2.t:null)); 

                    }
                    break;
                case 10 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:459:9: ^(nq= '!=' e1= expression e2= expression )
                    {
                    nq=(CommonTree)match(input,102,FOLLOW_102_in_expression1787); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1792);
                    e1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1796);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck((e1!=null?e1.t:null), (e2!=null?e2.t:null))) retval.t = booleanOperation(nq,  (e1!=null?e1.t:null), (e2!=null?e2.t:null)); 

                    }
                    break;
                case 11 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:460:7: ^( INSTANCEOF e= expression type )
                    {
                    INSTANCEOF33=(CommonTree)match(input,INSTANCEOF,FOLLOW_INSTANCEOF_in_expression1808); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1812);
                    e=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_type_in_expression1814);
                    type32=type();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck((e!=null?e.t:null), type32)) { 
                    	          if ( !((e!=null?e.t:null).isComplexType() || (e!=null?e.t:null).isNull()) ) errorLog.add(new UnexpectedTypeException("reference", (e!=null?e.t:null).toString(), (INSTANCEOF33!=null?INSTANCEOF33.getLine():0), (INSTANCEOF33!=null?INSTANCEOF33.getCharPositionInLine():0)));
                    	          if (!type32.isComplexType()) errorLog.add(new UnexpectedTypeException("class or array", type32.toString(), (INSTANCEOF33!=null?INSTANCEOF33.getLine():0), (INSTANCEOF33!=null?INSTANCEOF33.getCharPositionInLine():0)));
                    	          if (!(e!=null?e.t:null).isCastableTo(type32)) errorLog.add(new InconvertibleTypesException(type32.toString(), (e!=null?e.t:null).toString(), (INSTANCEOF33!=null?INSTANCEOF33.getLine():0), (INSTANCEOF33!=null?INSTANCEOF33.getCharPositionInLine():0)));
                    	          retval.t = BasicType.BOOLEAN;
                              } 
                            

                    }
                    break;
                case 12 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:468:7: ^( COMPAREOP e1= expression e2= expression )
                    {
                    COMPAREOP34=(CommonTree)match(input,COMPAREOP,FOLLOW_COMPAREOP_in_expression1834); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1838);
                    e1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1842);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck((e1!=null?e1.t:null), (e2!=null?e2.t:null))) { 
                    	    	  if ( !((e1!=null?e1.t:null).isNumeric() && (e2!=null?e2.t:null).isNumeric()) ) errorLog.add(new CannotBeAppliedToException((COMPAREOP34!=null?COMPAREOP34.getText():null), (e1!=null?e1.t:null).toString(), (e2!=null?e2.t:null).toString(), (COMPAREOP34!=null?COMPAREOP34.getLine():0), (COMPAREOP34!=null?COMPAREOP34.getCharPositionInLine():0)));
                    	    	  retval.t = BasicType.BOOLEAN;
                        	  } 
                        	

                    }
                    break;
                case 13 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:474:9: ^(op= ( UNARYPLUS | UNARYMINUS ) e= expression )
                    {
                    op=(CommonTree)input.LT(1);
                    if ( (input.LA(1)>=UNARYPLUS && input.LA(1)<=UNARYMINUS) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1873);
                    e=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck((e!=null?e.t:null))) {
                    	          if (!(e!=null?e.t:null).isNumeric())
                    	          	errorLog.add(new CannotBeAppliedToException((op!=null?op.getText():null), (e!=null?e.t:null).toString(), "", (op!=null?op.getLine():0), (op!=null?op.getCharPositionInLine():0)));
                    	          else
                    	          	retval.t = (e!=null?e.t:null);
                    	    	  
                        	  }
                        	

                    }
                    break;
                case 14 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:483:9: ^(op= ( PREINC | PREDEC ) e= expression )
                    {
                    op=(CommonTree)input.LT(1);
                    if ( input.LA(1)==PREINC||input.LA(1)==PREDEC ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1909);
                    e=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if (!(e!=null?e.isVar:false)) {
                         	  	errorLog.add(new UnexpectedTypeException("variable", "value", (op!=null?op.getLine():0), (op!=null?op.getCharPositionInLine():0)));
                         	  } else {
                    	     	  if (ruleTypeCheck((e!=null?e.t:null))) {
                    		     	  if (!(e!=null?e.t:null).isNumeric()) 
                    		     	  	errorLog.add(new CannotBeAppliedToException((op!=null?op.getText():null), (e!=null?e.t:null).toString(), "", (op!=null?op.getLine():0), (op!=null?op.getCharPositionInLine():0)));
                    		     	  else	 
                    		     	  	retval.t = (e!=null?e.t:null);   	  
                    	    	  }
                        	  } 
                        	

                    }
                    break;
                case 15 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:495:7: ^(op= '!' e= expression )
                    {
                    op=(CommonTree)match(input,106,FOLLOW_106_in_expression1933); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1937);
                    e=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck((e!=null?e.t:null))) {
                    	    	  if (!((e!=null?e.t:null) == BasicType.BOOLEAN)) errorLog.add(new CannotBeAppliedToException((op!=null?op.getText():null), (e!=null?e.t:null).toString(), "", (op!=null?op.getLine():0), (op!=null?op.getCharPositionInLine():0)));
                    	    	  retval.t = BasicType.BOOLEAN;
                        	  }
                        	

                    }
                    break;
                case 16 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:501:9: ^( CAST pt= primitiveType e= expression )
                    {
                    CAST35=(CommonTree)match(input,CAST,FOLLOW_CAST_in_expression1956); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_primitiveType_in_expression1960);
                    pt=primitiveType();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1964);
                    e=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck(pt, (e!=null?e.t:null))) {
                    	    	  if (!(e!=null?e.t:null).isCastableTo(pt)) errorLog.add(new InconvertibleTypesException(pt.toString(), (e!=null?e.t:null).toString(), (CAST35!=null?CAST35.getLine():0), (CAST35!=null?CAST35.getCharPositionInLine():0)));
                    	    	  retval.t = pt;
                        	  }
                        	

                    }
                    break;
                case 17 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:507:9: ^( CAST at= arrayType e= expression )
                    {
                    CAST36=(CommonTree)match(input,CAST,FOLLOW_CAST_in_expression1983); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_arrayType_in_expression1987);
                    at=arrayType();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1991);
                    e=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck(at, (e!=null?e.t:null))) {
                    	    	  if (!(e!=null?e.t:null).isCastableTo(at)) errorLog.add(new InconvertibleTypesException(at.toString(), (e!=null?e.t:null).toString(), (CAST36!=null?CAST36.getLine():0), (CAST36!=null?CAST36.getCharPositionInLine():0)));
                    	    	  retval.t = at;
                        	  }
                        	

                    }
                    break;
                case 18 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:513:9: ^( CAST ct= classType e= expression )
                    {
                    CAST37=(CommonTree)match(input,CAST,FOLLOW_CAST_in_expression2010); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_classType_in_expression2014);
                    ct=classType();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression2018);
                    e=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck((ct!=null?ct.t:null), (e!=null?e.t:null))) {
                    	    	  if (!(e!=null?e.t:null).isCastableTo((ct!=null?ct.t:null))) errorLog.add(new InconvertibleTypesException((ct!=null?ct.t:null).toString(), (e!=null?e.t:null).toString(), (CAST37!=null?CAST37.getLine():0), (CAST37!=null?CAST37.getCharPositionInLine():0)));
                    	    	  retval.t = (ct!=null?ct.t:null);
                        	  }
                        	

                    }
                    break;
                case 19 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:519:9: ^( NEW creator )
                    {
                    match(input,NEW,FOLLOW_NEW_in_expression2038); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_creator_in_expression2040);
                    creator38=creator();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     retval.t = creator38; 

                    }
                    break;
                case 20 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:520:7: ^(op= ( POSTINC | POSTDEC ) e= expression )
                    {
                    op=(CommonTree)input.LT(1);
                    if ( input.LA(1)==POSTINC||input.LA(1)==POSTDEC ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression2064);
                    e=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if (!(e!=null?e.isVar:false)) {
                         	  	errorLog.add(new UnexpectedTypeException("variable", "value", (op!=null?op.getLine():0), (op!=null?op.getCharPositionInLine():0)));
                         	  } else {
                    	     	  if (ruleTypeCheck((e!=null?e.t:null))) {
                    		     	  if (!(e!=null?e.t:null).isNumeric()) 
                    		     	  	errorLog.add(new CannotBeAppliedToException((op!=null?op.getText():null), (e!=null?e.t:null).toString(), "", (op!=null?op.getLine():0), (op!=null?op.getCharPositionInLine():0)));
                    		     	  else	 
                    		     	  	retval.t = (e!=null?e.t:null);   	  
                    	    	  }
                        	  } 
                        	

                    }
                    break;
                case 21 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:532:9: selector
                    {
                    pushFollow(FOLLOW_selector_in_expression2088);
                    selector39=selector();

                    state._fsp--;

                     retval.t = (selector39!=null?selector39.t:null); retval.isVar = (selector39!=null?selector39.isVar:false); 

                    }
                    break;
                case 22 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:533:9: primary
                    {
                    pushFollow(FOLLOW_primary_in_expression2100);
                    primary40=primary();

                    state._fsp--;

                     retval.t = (primary40!=null?primary40.t:null);  retval.isVar = (primary40!=null?primary40.isVar:false);  

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class primary_return extends TreeRuleReturnScope {
        public Type t;
        public boolean isVar;
    };

    // $ANTLR start "primary"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:536:1: primary returns [Type t, boolean isVar] : ( THIS | superMemberAccess | literal | IDENTIFIER | ^( DOTCLASS type ) | ^( DOTCLASS VOID ) );
    public final JaWalker.primary_return primary() throws RecognitionException {
        JaWalker.primary_return retval = new JaWalker.primary_return();
        retval.start = input.LT(1);

        CommonTree IDENTIFIER43=null;
        Type superMemberAccess41 = null;

        Type literal42 = null;


        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:537:5: ( THIS | superMemberAccess | literal | IDENTIFIER | ^( DOTCLASS type ) | ^( DOTCLASS VOID ) )
            int alt34=6;
            switch ( input.LA(1) ) {
            case THIS:
                {
                alt34=1;
                }
                break;
            case METHODCALL:
            case FIELDACCESS:
                {
                alt34=2;
                }
                break;
            case INTLITERAL:
            case LONGLITERAL:
            case FLOATLITERAL:
            case DOUBLELITERAL:
            case CHARLITERAL:
            case STRINGLITERAL:
            case BOOLEANLITERAL:
            case NULLLITERAL:
                {
                alt34=3;
                }
                break;
            case IDENTIFIER:
                {
                alt34=4;
                }
                break;
            case DOTCLASS:
                {
                int LA34_5 = input.LA(2);

                if ( (LA34_5==DOWN) ) {
                    int LA34_6 = input.LA(3);

                    if ( (LA34_6==VOID) ) {
                        alt34=6;
                    }
                    else if ( (LA34_6==ARRAYTYPE||LA34_6==IDENTIFIER||(LA34_6>=CHAR && LA34_6<=BOOLEAN)) ) {
                        alt34=5;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 6, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 5, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:537:7: THIS
                    {
                    match(input,THIS,FOLLOW_THIS_in_primary2136); 
                     retval.t = rt; 

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:538:9: superMemberAccess
                    {
                    pushFollow(FOLLOW_superMemberAccess_in_primary2148);
                    superMemberAccess41=superMemberAccess();

                    state._fsp--;

                     retval.t = superMemberAccess41; 

                    }
                    break;
                case 3 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:539:9: literal
                    {
                    pushFollow(FOLLOW_literal_in_primary2160);
                    literal42=literal();

                    state._fsp--;

                     retval.t = literal42; 

                    }
                    break;
                case 4 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:540:9: IDENTIFIER
                    {
                    IDENTIFIER43=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary2172); 
                     retval.isVar = true;
                        	  retval.t = getVariableType((IDENTIFIER43!=null?IDENTIFIER43.getText():null)); 
                        	  if (retval.t == null) errorLog.add(new CannotFindSymbolException(("variable " + (IDENTIFIER43!=null?IDENTIFIER43.getText():null)), getMethodSignature(), (IDENTIFIER43!=null?IDENTIFIER43.getLine():0), (IDENTIFIER43!=null?IDENTIFIER43.getCharPositionInLine():0)));
                        	

                    }
                    break;
                case 5 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:546:9: ^( DOTCLASS type )
                    {
                    match(input,DOTCLASS,FOLLOW_DOTCLASS_in_primary2196); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_in_primary2198);
                    type();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     retval.t = ReferenceType.CLASS; 

                    }
                    break;
                case 6 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:547:9: ^( DOTCLASS VOID )
                    {
                    match(input,DOTCLASS,FOLLOW_DOTCLASS_in_primary2214); 

                    match(input, Token.DOWN, null); 
                    match(input,VOID,FOLLOW_VOID_in_primary2216); 

                    match(input, Token.UP, null); 
                     retval.t = ReferenceType.CLASS; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "primary"

    public static class selector_return extends TreeRuleReturnScope {
        public Type t;
        public boolean isVar;
    };

    // $ANTLR start "selector"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:550:1: selector returns [Type t, boolean isVar] : ( ^( FIELDACCESS expression IDENTIFIER ) | ^( METHODCALL expression IDENTIFIER ( arguments )? ) | ^( ARRAYACCESS e1= expression e2= expression ) );
    public final JaWalker.selector_return selector() throws RecognitionException {
        JaWalker.selector_return retval = new JaWalker.selector_return();
        retval.start = input.LT(1);

        CommonTree IDENTIFIER45=null;
        CommonTree IDENTIFIER48=null;
        CommonTree ARRAYACCESS49=null;
        JaWalker.expression_return e1 = null;

        JaWalker.expression_return e2 = null;

        JaWalker.expression_return expression44 = null;

        JaWalker.expression_return expression46 = null;

        JaWalker.arguments_return arguments47 = null;


        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:551:5: ( ^( FIELDACCESS expression IDENTIFIER ) | ^( METHODCALL expression IDENTIFIER ( arguments )? ) | ^( ARRAYACCESS e1= expression e2= expression ) )
            int alt36=3;
            switch ( input.LA(1) ) {
            case FIELDACCESS:
                {
                alt36=1;
                }
                break;
            case METHODCALL:
                {
                alt36=2;
                }
                break;
            case ARRAYACCESS:
                {
                alt36=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:551:9: ^( FIELDACCESS expression IDENTIFIER )
                    {
                    match(input,FIELDACCESS,FOLLOW_FIELDACCESS_in_selector2247); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_selector2249);
                    expression44=expression();

                    state._fsp--;

                    IDENTIFIER45=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_selector2251); 

                    match(input, Token.UP, null); 
                     retval.isVar = true;
                        	  if(ruleTypeCheck((expression44!=null?expression44.t:null))) {
                    	    	  if (!(expression44!=null?expression44.t:null).isReference()){
                    	    	  	errorLog.add(new CannotBeDereferencedException((expression44!=null?expression44.t:null).toString(), (IDENTIFIER45!=null?IDENTIFIER45.getLine():0), (IDENTIFIER45!=null?IDENTIFIER45.getCharPositionInLine():0))); 
                    	    	  }else{
                    	    	  	ReferenceType expt = (ReferenceType)(expression44!=null?expression44.t:null);
                    	    	  	boolean isSameClass = (expt.getName().equals(rt.getName())); 
                    	    	  	retval.t = expt.getField(isSameClass, (IDENTIFIER45!=null?IDENTIFIER45.getText():null));
                    		  	if (retval.t == null) errorLog.add(new CannotFindSymbolException(("field " + (IDENTIFIER45!=null?IDENTIFIER45.getText():null)), expt.getName(), (IDENTIFIER45!=null?IDENTIFIER45.getLine():0), (IDENTIFIER45!=null?IDENTIFIER45.getCharPositionInLine():0)));
                        	  	  }
                        	  }
                        	

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:564:7: ^( METHODCALL expression IDENTIFIER ( arguments )? )
                    {
                    match(input,METHODCALL,FOLLOW_METHODCALL_in_selector2270); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_selector2272);
                    expression46=expression();

                    state._fsp--;

                    IDENTIFIER48=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_selector2274); 
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:564:42: ( arguments )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==ARGUMENTS) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:564:42: arguments
                            {
                            pushFollow(FOLLOW_arguments_in_selector2276);
                            arguments47=arguments();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                     // Se ci sono argomenti, bisogna richiamare ruleTypeCheck su di essi
                              if( ruleTypeCheck((expression46!=null?expression46.t:null)) && ((arguments47!=null?arguments47.types:null) == null || ruleTypeCheck((arguments47!=null?arguments47.types:null).toArray(new Type[(arguments47!=null?arguments47.types:null).size()]))) ) {
                    	    	  if (!(expression46!=null?expression46.t:null).isReference()){
                    	    	  	errorLog.add(new CannotBeDereferencedException((expression46!=null?expression46.t:null).toString(), (IDENTIFIER48!=null?IDENTIFIER48.getLine():0), (IDENTIFIER48!=null?IDENTIFIER48.getCharPositionInLine():0))); 
                    	    	  }else{
                    	    	  	ReferenceType expt = (ReferenceType)(expression46!=null?expression46.t:null);
                    	    	  	ArrayList<Type> argTypes = (arguments47!=null?arguments47.types:null); //((arguments47!=null?((CommonTree)arguments47.tree):null) == null)?null:(arguments47!=null?arguments47.types:null);
                    	    	  	try {
                    		    		boolean isSameClass = (expt.getName().equals(rt.getName())); 
                    		    		retval.t = expt.bindMethod(isSameClass, (IDENTIFIER48!=null?IDENTIFIER48.getText():null), argTypes);
                    	    	  	} catch (EarlyBindingException ex) {
                    	    	  		errorLog.add(new CannotFindSymbolException(("method " + (IDENTIFIER48!=null?IDENTIFIER48.getText():null) + '(' + printArguments(argTypes) + ')'), expt.getName(), (IDENTIFIER48!=null?IDENTIFIER48.getLine():0), (IDENTIFIER48!=null?IDENTIFIER48.getCharPositionInLine():0)));
                    	    	  	}
                    	    	  }
                        	  }
                        	

                    }
                    break;
                case 3 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:581:9: ^( ARRAYACCESS e1= expression e2= expression )
                    {
                    ARRAYACCESS49=(CommonTree)match(input,ARRAYACCESS,FOLLOW_ARRAYACCESS_in_selector2299); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_selector2303);
                    e1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_selector2307);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if (ruleTypeCheck((e1!=null?e1.t:null), (e2!=null?e2.t:null))) {
                    	    	  if (!(e1!=null?e1.t:null).isArray()) {
                    	    	  	errorLog.add(new ArrayRequiredException((e1!=null?e1.t:null).toString(), (ARRAYACCESS49!=null?ARRAYACCESS49.getLine():0), (ARRAYACCESS49!=null?ARRAYACCESS49.getCharPositionInLine():0)));
                    	    	  } else {
                    	    	  	retval.t = ((ArrayType)(e1!=null?e1.t:null)).getHostType(); 
                    	    	  }	
                    	    	  arrayExprCheck(ARRAYACCESS49, (e2!=null?e2.t:null));
                    	    	  
                        	  }
                        	

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "selector"


    // $ANTLR start "creator"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:594:1: creator returns [Type t] : ( arrayCreatorRest | classType ( classCreatorRest )? );
    public final Type creator() throws RecognitionException {
        Type t = null;

        ArrayType arrayCreatorRest50 = null;

        JaWalker.classType_return classType51 = null;

        ArrayList<Type> classCreatorRest52 = null;


        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:595:5: ( arrayCreatorRest | classType ( classCreatorRest )? )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=ARRAYALLOC && LA38_0<=ARRAYALLOCINIT)) ) {
                alt38=1;
            }
            else if ( (LA38_0==IDENTIFIER) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:595:9: arrayCreatorRest
                    {
                    pushFollow(FOLLOW_arrayCreatorRest_in_creator2339);
                    arrayCreatorRest50=arrayCreatorRest();

                    state._fsp--;

                    t = arrayCreatorRest50; 

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:596:9: classType ( classCreatorRest )?
                    {
                    pushFollow(FOLLOW_classType_in_creator2351);
                    classType51=classType();

                    state._fsp--;

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:596:19: ( classCreatorRest )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==ARGUMENTS) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:596:19: classCreatorRest
                            {
                            pushFollow(FOLLOW_classCreatorRest_in_creator2353);
                            classCreatorRest52=classCreatorRest();

                            state._fsp--;


                            }
                            break;

                    }

                     if(ruleTypeCheck((classType51!=null?classType51.t:null)) && (classCreatorRest52 == null || ruleTypeCheck(classCreatorRest52.toArray(new Type[classCreatorRest52.size()])) )) {
                      	  	  Token tk = (classType51!=null?((CommonTree)classType51.start):null).token;
                    	    	  try {
                    			((ReferenceType)(classType51!=null?classType51.t:null)).bindConstructor(classCreatorRest52);
                    	    	  } catch (EarlyBindingException ex) {
                    	    	  	errorLog.add(new CannotFindSymbolException(("constructor " + rt.toString() + '(' + printArguments(classCreatorRest52) + ')'), "class " + rt.toString(), tk.getLine(), tk.getCharPositionInLine()));
                    	    	  }	    	 
                    		  t = (classType51!=null?classType51.t:null);
                    	  }
                        	

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return t;
    }
    // $ANTLR end "creator"


    // $ANTLR start "createdName"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:610:1: createdName returns [Type t] : ( classType | primitiveType );
    public final Type createdName() throws RecognitionException {
        Type t = null;

        JaWalker.classType_return classType53 = null;

        BasicType primitiveType54 = null;


        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:611:5: ( classType | primitiveType )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==IDENTIFIER) ) {
                alt39=1;
            }
            else if ( ((LA39_0>=CHAR && LA39_0<=BOOLEAN)) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:611:9: classType
                    {
                    pushFollow(FOLLOW_classType_in_createdName2386);
                    classType53=classType();

                    state._fsp--;

                     t = (classType53!=null?classType53.t:null);      

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:612:9: primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_createdName2402);
                    primitiveType54=primitiveType();

                    state._fsp--;

                     t = primitiveType54; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return t;
    }
    // $ANTLR end "createdName"


    // $ANTLR start "arrayCreatorRest"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:615:1: arrayCreatorRest returns [ArrayType t] : ( ^( ARRAYALLOCINIT brackets arrayInitializer[$brackets.t.getHostType()] ) | ^( ARRAYALLOC bracketsOpt ) );
    public final ArrayType arrayCreatorRest() throws RecognitionException {
        ArrayType t = null;

        ArrayType brackets55 = null;

        Type bracketsOpt56 = null;


        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:616:5: ( ^( ARRAYALLOCINIT brackets arrayInitializer[$brackets.t.getHostType()] ) | ^( ARRAYALLOC bracketsOpt ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==ARRAYALLOCINIT) ) {
                alt40=1;
            }
            else if ( (LA40_0==ARRAYALLOC) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:616:7: ^( ARRAYALLOCINIT brackets arrayInitializer[$brackets.t.getHostType()] )
                    {
                    match(input,ARRAYALLOCINIT,FOLLOW_ARRAYALLOCINIT_in_arrayCreatorRest2430); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_brackets_in_arrayCreatorRest2432);
                    brackets55=brackets();

                    state._fsp--;

                    pushFollow(FOLLOW_arrayInitializer_in_arrayCreatorRest2434);
                    arrayInitializer(brackets55.getHostType());

                    state._fsp--;


                    match(input, Token.UP, null); 
                     t = brackets55; 

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:617:9: ^( ARRAYALLOC bracketsOpt )
                    {
                    match(input,ARRAYALLOC,FOLLOW_ARRAYALLOC_in_arrayCreatorRest2449); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_bracketsOpt_in_arrayCreatorRest2451);
                    bracketsOpt56=bracketsOpt();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     t = (ArrayType)bracketsOpt56; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return t;
    }
    // $ANTLR end "arrayCreatorRest"


    // $ANTLR start "classCreatorRest"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:620:1: classCreatorRest returns [ArrayList<Type> types] : arguments ;
    public final ArrayList<Type> classCreatorRest() throws RecognitionException {
        ArrayList<Type> types = null;

        JaWalker.arguments_return arguments57 = null;


        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:621:5: ( arguments )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:621:9: arguments
            {
            pushFollow(FOLLOW_arguments_in_classCreatorRest2477);
            arguments57=arguments();

            state._fsp--;

             types = (arguments57!=null?arguments57.types:null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return types;
    }
    // $ANTLR end "classCreatorRest"


    // $ANTLR start "superMemberAccess"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:624:1: superMemberAccess returns [Type t] : ( ^( METHODCALL SUPER IDENTIFIER ( arguments )? ) | ^( FIELDACCESS SUPER IDENTIFIER ) );
    public final Type superMemberAccess() throws RecognitionException {
        Type t = null;

        CommonTree IDENTIFIER59=null;
        CommonTree IDENTIFIER60=null;
        JaWalker.arguments_return arguments58 = null;


        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:625:5: ( ^( METHODCALL SUPER IDENTIFIER ( arguments )? ) | ^( FIELDACCESS SUPER IDENTIFIER ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==METHODCALL) ) {
                alt42=1;
            }
            else if ( (LA42_0==FIELDACCESS) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:625:7: ^( METHODCALL SUPER IDENTIFIER ( arguments )? )
                    {
                    match(input,METHODCALL,FOLLOW_METHODCALL_in_superMemberAccess2509); 

                    match(input, Token.DOWN, null); 
                    match(input,SUPER,FOLLOW_SUPER_in_superMemberAccess2511); 
                    IDENTIFIER59=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_superMemberAccess2513); 
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:625:37: ( arguments )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==ARGUMENTS) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:625:37: arguments
                            {
                            pushFollow(FOLLOW_arguments_in_superMemberAccess2515);
                            arguments58=arguments();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                     if( (arguments58!=null?arguments58.types:null) == null || ruleTypeCheck((arguments58!=null?arguments58.types:null).toArray(new Type[(arguments58!=null?arguments58.types:null).size()])) ) {
                    	    	  try {
                    	          	t = rt.getSuperClass().bindMethod(false, (IDENTIFIER59!=null?IDENTIFIER59.getText():null), (arguments58!=null?arguments58.types:null));
                    		  } catch (EarlyBindingException ex) {
                    		   	errorLog.add(new CannotFindSymbolException(("method " + (IDENTIFIER59!=null?IDENTIFIER59.getText():null) + '(' + printArguments((arguments58!=null?arguments58.types:null)) + ')'), rt.getSuperClass().getName(), (IDENTIFIER59!=null?IDENTIFIER59.getLine():0), (IDENTIFIER59!=null?IDENTIFIER59.getCharPositionInLine():0)));
                    		  }
                    	  }
                        	

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:634:9: ^( FIELDACCESS SUPER IDENTIFIER )
                    {
                    match(input,FIELDACCESS,FOLLOW_FIELDACCESS_in_superMemberAccess2536); 

                    match(input, Token.DOWN, null); 
                    match(input,SUPER,FOLLOW_SUPER_in_superMemberAccess2538); 
                    IDENTIFIER60=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_superMemberAccess2540); 

                    match(input, Token.UP, null); 
                     t = rt.getSuperClass().getField(false, (IDENTIFIER60!=null?IDENTIFIER60.getText():null));
                    	  if (t == null) errorLog.add(new CannotFindSymbolException(("field " + (IDENTIFIER60!=null?IDENTIFIER60.getText():null)), rt.getSuperClass().getName(), (IDENTIFIER60!=null?IDENTIFIER60.getLine():0), (IDENTIFIER60!=null?IDENTIFIER60.getCharPositionInLine():0))); 
                    	

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return t;
    }
    // $ANTLR end "superMemberAccess"

    public static class arguments_return extends TreeRuleReturnScope {
        public ArrayList<Type> types;
    };

    // $ANTLR start "arguments"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:640:1: arguments returns [ArrayList<Type> types] : ^( ARGUMENTS expressionList ) ;
    public final JaWalker.arguments_return arguments() throws RecognitionException {
        JaWalker.arguments_return retval = new JaWalker.arguments_return();
        retval.start = input.LT(1);

        ArrayList<Type> expressionList61 = null;


        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:641:5: ( ^( ARGUMENTS expressionList ) )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:641:8: ^( ARGUMENTS expressionList )
            {
            match(input,ARGUMENTS,FOLLOW_ARGUMENTS_in_arguments2581); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expressionList_in_arguments2583);
            expressionList61=expressionList();

            state._fsp--;


            match(input, Token.UP, null); 
             retval.types = expressionList61; 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "arguments"


    // $ANTLR start "brackets"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:644:1: brackets returns [ArrayType t] : ^( ARRAYTYPE bracketsOpt ) ;
    public final ArrayType brackets() throws RecognitionException {
        ArrayType t = null;

        Type bracketsOpt62 = null;


        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:645:5: ( ^( ARRAYTYPE bracketsOpt ) )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:645:7: ^( ARRAYTYPE bracketsOpt )
            {
            match(input,ARRAYTYPE,FOLLOW_ARRAYTYPE_in_brackets2612); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_bracketsOpt_in_brackets2614);
            bracketsOpt62=bracketsOpt();

            state._fsp--;


            match(input, Token.UP, null); 
             if (ruleTypeCheck(bracketsOpt62)) t = (ArrayType)ParserHelper.createArrayType(bracketsOpt62, 1); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return t;
    }
    // $ANTLR end "brackets"


    // $ANTLR start "bracketsOpt"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:648:1: bracketsOpt returns [Type t] : ( createdName | ^( ARRAYTYPE bo= bracketsOpt ) | ^( ARRAYTYPE expression bo= bracketsOpt ) );
    public final Type bracketsOpt() throws RecognitionException {
        Type t = null;

        CommonTree ARRAYTYPE65=null;
        Type bo = null;

        Type createdName63 = null;

        JaWalker.expression_return expression64 = null;


        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:649:5: ( createdName | ^( ARRAYTYPE bo= bracketsOpt ) | ^( ARRAYTYPE expression bo= bracketsOpt ) )
            int alt43=3;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==IDENTIFIER||(LA43_0>=CHAR && LA43_0<=BOOLEAN)) ) {
                alt43=1;
            }
            else if ( (LA43_0==ARRAYTYPE) ) {
                int LA43_2 = input.LA(2);

                if ( (LA43_2==DOWN) ) {
                    switch ( input.LA(3) ) {
                    case IDENTIFIER:
                        {
                        int LA43_4 = input.LA(4);

                        if ( (LA43_4==UP) ) {
                            alt43=2;
                        }
                        else if ( (LA43_4==ARRAYTYPE||LA43_4==IDENTIFIER||(LA43_4>=CHAR && LA43_4<=BOOLEAN)) ) {
                            alt43=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 43, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case ARRAYTYPE:
                    case CHAR:
                    case BYTE:
                    case SHORT:
                    case INT:
                    case LONG:
                    case FLOAT:
                    case DOUBLE:
                    case BOOLEAN:
                        {
                        alt43=2;
                        }
                        break;
                    case METHODCALL:
                    case FIELDACCESS:
                    case ARRAYACCESS:
                    case DOTCLASS:
                    case PREINC:
                    case POSTINC:
                    case PREDEC:
                    case POSTDEC:
                    case UNARYPLUS:
                    case UNARYMINUS:
                    case CAST:
                    case THIS:
                    case INTLITERAL:
                    case LONGLITERAL:
                    case FLOATLITERAL:
                    case DOUBLELITERAL:
                    case CHARLITERAL:
                    case STRINGLITERAL:
                    case BOOLEANLITERAL:
                    case NULLLITERAL:
                    case INSTANCEOF:
                    case COMPAREOP:
                    case NEW:
                    case EQ:
                    case PLUS:
                    case MINUS:
                    case STAR:
                    case SLASH:
                    case 99:
                    case 100:
                    case 101:
                    case 102:
                    case 103:
                    case 106:
                        {
                        alt43=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 3, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:649:7: createdName
                    {
                    pushFollow(FOLLOW_createdName_in_bracketsOpt2642);
                    createdName63=createdName();

                    state._fsp--;

                     t = createdName63; 

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:650:7: ^( ARRAYTYPE bo= bracketsOpt )
                    {
                    match(input,ARRAYTYPE,FOLLOW_ARRAYTYPE_in_bracketsOpt2659); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_bracketsOpt_in_bracketsOpt2663);
                    bo=bracketsOpt();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if (ruleTypeCheck(bo)) t = ParserHelper.createArrayType(bo, 1); 

                    }
                    break;
                case 3 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:651:7: ^( ARRAYTYPE expression bo= bracketsOpt )
                    {
                    ARRAYTYPE65=(CommonTree)match(input,ARRAYTYPE,FOLLOW_ARRAYTYPE_in_bracketsOpt2675); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_bracketsOpt2677);
                    expression64=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_bracketsOpt_in_bracketsOpt2681);
                    bo=bracketsOpt();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if (ruleTypeCheck(bo)) t = ParserHelper.createArrayType(bo, 1); 
                        	  if (ruleTypeCheck((expression64!=null?expression64.t:null))) arrayExprCheck(ARRAYTYPE65, (expression64!=null?expression64.t:null));
                           	

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return t;
    }
    // $ANTLR end "bracketsOpt"

    // Delegated rules


    protected DFA30 dfa30 = new DFA30(this);
    protected DFA33 dfa33 = new DFA33(this);
    static final String DFA30_eotS =
        "\12\uffff";
    static final String DFA30_eofS =
        "\12\uffff";
    static final String DFA30_minS =
        "\1\24\5\uffff\1\2\3\uffff";
    static final String DFA30_maxS =
        "\1\102\5\uffff\1\102\3\uffff";
    static final String DFA30_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff\1\10\1\6\1\7";
    static final String DFA30_specialS =
        "\12\uffff}>";
    static final String[] DFA30_transitionS = {
            "\1\1\1\7\3\uffff\1\5\44\uffff\1\2\1\3\1\4\1\uffff\1\6",
            "",
            "",
            "",
            "",
            "",
            "\1\10\1\11\17\uffff\3\11\3\uffff\1\11\44\uffff\3\11\1\uffff"+
            "\1\11",
            "",
            "",
            ""
    };

    static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
    static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
    static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
    static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
    static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
    static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
    static final short[][] DFA30_transition;

    static {
        int numStates = DFA30_transitionS.length;
        DFA30_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = DFA30_eot;
            this.eof = DFA30_eof;
            this.min = DFA30_min;
            this.max = DFA30_max;
            this.accept = DFA30_accept;
            this.special = DFA30_special;
            this.transition = DFA30_transition;
        }
        public String getDescription() {
            return "390:1: statement : ( ^( BLOCK block ) | ^( IF condition ( ^( THEN statement ) )? ( elseStmt )? ) | ^( FOR ( ^( INIT forInit ) )? ( condition )? ( ^( UPDATE forUpdate ) )? statement ) | ^( WHILE condition statement ) | ^( DOWHILE condition statement ) | ^( RETURN expression ) | RETURN | ^( STMT statementExpression ) );";
        }
    }
    static final String DFA33_eotS =
        "\35\uffff";
    static final String DFA33_eofS =
        "\35\uffff";
    static final String DFA33_minS =
        "\1\4\17\uffff\1\2\2\uffff\2\2\2\uffff\1\11\2\4\3\uffff";
    static final String DFA33_maxS =
        "\1\152\17\uffff\1\2\2\uffff\2\2\2\uffff\1\63\2\152\3\uffff";
    static final String DFA33_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\uffff\1\23\1\24\2\uffff\1\25\1\26\3\uffff\1\21\1"+
        "\22\1\20";
    static final String DFA33_specialS =
        "\35\uffff}>";
    static final String[] DFA33_transitionS = {
            "\1\24\1\uffff\1\23\1\25\1\26\23\uffff\1\16\1\22\1\16\1\22\2"+
            "\15\1\20\5\uffff\1\26\13\uffff\1\26\1\uffff\10\26\6\uffff\1"+
            "\13\1\14\1\21\13\uffff\1\1\1\2\1\3\1\4\1\5\14\uffff\1\7\1\10"+
            "\1\11\1\12\1\6\2\uffff\1\17",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\27",
            "",
            "",
            "\1\30",
            "\1\31",
            "",
            "",
            "\1\32\36\uffff\1\33\3\uffff\10\34",
            "\1\25\1\uffff\3\25\23\uffff\7\25\5\uffff\1\25\13\uffff\1\25"+
            "\1\26\10\25\6\uffff\3\25\13\uffff\5\25\14\uffff\5\25\2\uffff"+
            "\1\25",
            "\1\25\1\uffff\3\25\23\uffff\7\25\5\uffff\1\25\13\uffff\1\25"+
            "\1\26\10\25\6\uffff\3\25\13\uffff\5\25\14\uffff\5\25\2\uffff"+
            "\1\25",
            "",
            "",
            ""
    };

    static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
    static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
    static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
    static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
    static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
    static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
    static final short[][] DFA33_transition;

    static {
        int numStates = DFA33_transitionS.length;
        DFA33_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = DFA33_eot;
            this.eof = DFA33_eof;
            this.min = DFA33_min;
            this.max = DFA33_max;
            this.accept = DFA33_accept;
            this.special = DFA33_special;
            this.transition = DFA33_transition;
        }
        public String getDescription() {
            return "444:1: expression returns [Type t, boolean isVar] : ( ^( EQ e1= expression e2= expression ) | ^( PLUS e1= expression e2= expression ) | ^( MINUS e1= expression e2= expression ) | ^( STAR e1= expression e2= expression ) | ^( SLASH e1= expression e2= expression ) | ^(mod= '%' e1= expression e2= expression ) | ^(or= '||' e1= expression e2= expression ) | ^(and= '&&' e1= expression e2= expression ) | ^(eq= '==' e1= expression e2= expression ) | ^(nq= '!=' e1= expression e2= expression ) | ^( INSTANCEOF e= expression type ) | ^( COMPAREOP e1= expression e2= expression ) | ^(op= ( UNARYPLUS | UNARYMINUS ) e= expression ) | ^(op= ( PREINC | PREDEC ) e= expression ) | ^(op= '!' e= expression ) | ^( CAST pt= primitiveType e= expression ) | ^( CAST at= arrayType e= expression ) | ^( CAST ct= classType e= expression ) | ^( NEW creator ) | ^(op= ( POSTINC | POSTDEC ) e= expression ) | selector | primary );";
        }
    }
 

    public static final BitSet FOLLOW_classDeclaration_in_compilationUnit57 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_compilationUnit66 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_in_classDeclaration90 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classDeclaration92 = new BitSet(new long[]{0x0000010800000000L});
    public static final BitSet FOLLOW_classType_in_classDeclaration94 = new BitSet(new long[]{0x0000010800000000L});
    public static final BitSet FOLLOW_classBody_in_classDeclaration97 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASSBODY_in_classBody123 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_classBodyDeclaration_in_classBody125 = new BitSet(new long[]{0x0000000000001C08L});
    public static final BitSet FOLLOW_memberDeclaration_in_classBodyDeclaration146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldDeclaration_in_memberDeclaration169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodAndConstructorDeclaration_in_memberDeclaration177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_METHOD_in_methodAndConstructorDeclaration211 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifier_in_methodAndConstructorDeclaration213 = new BitSet(new long[]{0x000FF10000000200L});
    public static final BitSet FOLLOW_type_in_methodAndConstructorDeclaration215 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_methodAndConstructorDeclaration219 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_formalParameters_in_methodAndConstructorDeclaration223 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_methodBody_in_methodAndConstructorDeclaration226 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_METHOD_in_methodAndConstructorDeclaration248 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifier_in_methodAndConstructorDeclaration250 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_VOID_in_methodAndConstructorDeclaration252 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_methodAndConstructorDeclaration254 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_formalParameters_in_methodAndConstructorDeclaration258 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_methodBody_in_methodAndConstructorDeclaration261 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONSTR_in_methodAndConstructorDeclaration283 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifier_in_methodAndConstructorDeclaration285 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_methodAndConstructorDeclaration287 = new BitSet(new long[]{0x0000000000042008L});
    public static final BitSet FOLLOW_formalParameters_in_methodAndConstructorDeclaration291 = new BitSet(new long[]{0x0000000000040008L});
    public static final BitSet FOLLOW_constructorBody_in_methodAndConstructorDeclaration294 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FIELD_in_fieldDeclaration321 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifier_in_fieldDeclaration323 = new BitSet(new long[]{0x000FF10000000200L});
    public static final BitSet FOLLOW_variableDeclarator_in_fieldDeclaration325 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_variableDeclarator350 = new BitSet(new long[]{0x3FD00107F80001D2L,0x000004F8007C0070L});
    public static final BitSet FOLLOW_variableInitializer_in_variableDeclarator355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_variableDeclaratorId385 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_variableDeclaratorId387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayInitializer_in_variableInitializer423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_variableInitializer442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAYINIT_in_arrayInitializer476 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableInitializer_in_arrayInitializer478 = new BitSet(new long[]{0x3FD00107F80001D8L,0x000004F8007C0070L});
    public static final BitSet FOLLOW_set_in_modifier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_type539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classType_in_type549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayType_in_type563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_brackets_in_arrayType591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classType621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_primitiveType652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BYTE_in_primitiveType667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHORT_in_primitiveType682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_primitiveType696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_in_primitiveType712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_primitiveType727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_primitiveType741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_primitiveType754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FPARMS_in_formalParameters780 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_formalParameterDecls_in_formalParameters782 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FPARM_in_formalParameterDecls807 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_formalParameterDecls809 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_formalParameterDecls_in_formalParameterDecls814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MBODY_in_methodBody839 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_methodBody841 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CBODY_in_constructorBody895 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_explicitConstructorInvocation_in_constructorBody897 = new BitSet(new long[]{0xC000000002380008L,0x0000000000000005L});
    public static final BitSet FOLLOW_blockStatement_in_constructorBody900 = new BitSet(new long[]{0xC000000002380008L,0x0000000000000005L});
    public static final BitSet FOLLOW_CONSTRCALL_in_explicitConstructorInvocation922 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_THIS_in_explicitConstructorInvocation924 = new BitSet(new long[]{0x0000000000004008L});
    public static final BitSet FOLLOW_arguments_in_explicitConstructorInvocation927 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONSTRCALL_in_explicitConstructorInvocation948 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SUPER_in_explicitConstructorInvocation950 = new BitSet(new long[]{0x0000000000004008L});
    public static final BitSet FOLLOW_arguments_in_explicitConstructorInvocation952 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INTLITERAL_in_literal984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONGLITERAL_in_literal1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOATLITERAL_in_literal1015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLELITERAL_in_literal1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARLITERAL_in_literal1040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_literal1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_literal1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULLLITERAL_in_literal1080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockStatement_in_block1116 = new BitSet(new long[]{0xC000000002380002L,0x0000000000000005L});
    public static final BitSet FOLLOW_localVariableDeclarationStatement_in_blockStatement1140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_blockStatement1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localVariableDeclaration_in_localVariableDeclarationStatement1171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARDECL_in_localVariableDeclaration1189 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableDeclarator_in_localVariableDeclaration1191 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLOCK_in_statement1228 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_statement1230 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_in_statement1242 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_condition_in_statement1244 = new BitSet(new long[]{0x0000000004000008L,0x0000000000000008L});
    public static final BitSet FOLLOW_THEN_in_statement1248 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_statement1250 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_elseStmt_in_statement1255 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FOR_in_statement1268 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INIT_in_statement1272 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_forInit_in_statement1274 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_condition_in_statement1279 = new BitSet(new long[]{0xC000000003380000L,0x0000000000000005L});
    public static final BitSet FOLLOW_UPDATE_in_statement1284 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_forUpdate_in_statement1286 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_statement_in_statement1291 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WHILE_in_statement1304 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_condition_in_statement1306 = new BitSet(new long[]{0xC000000002380000L,0x0000000000000005L});
    public static final BitSet FOLLOW_statement_in_statement1308 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DOWHILE_in_statement1320 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_condition_in_statement1322 = new BitSet(new long[]{0xC000000002380000L,0x0000000000000005L});
    public static final BitSet FOLLOW_statement_in_statement1324 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RETURN_in_statement1336 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement1338 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RETURN_in_statement1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STMT_in_statement1374 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statementExpression_in_statement1376 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONDITION_in_condition1399 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_condition1401 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ELSE_in_elseStmt1434 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_elseStmt1436 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_localVariableDeclaration_in_forInit1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionList_in_forInit1466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionList_in_forUpdate1485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionList1520 = new BitSet(new long[]{0x3FD00107F80001D2L,0x000004F8007C0070L});
    public static final BitSet FOLLOW_expression_in_statementExpression1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_expression1569 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1573 = new BitSet(new long[]{0x3FD00107F80001D0L,0x000004F8007C0070L});
    public static final BitSet FOLLOW_expression_in_expression1577 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_in_expression1595 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1602 = new BitSet(new long[]{0x3FD00107F80001D0L,0x000004F8007C0070L});
    public static final BitSet FOLLOW_expression_in_expression1606 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_expression1618 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1624 = new BitSet(new long[]{0x3FD00107F80001D0L,0x000004F8007C0070L});
    public static final BitSet FOLLOW_expression_in_expression1628 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STAR_in_expression1640 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1647 = new BitSet(new long[]{0x3FD00107F80001D0L,0x000004F8007C0070L});
    public static final BitSet FOLLOW_expression_in_expression1651 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SLASH_in_expression1663 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1669 = new BitSet(new long[]{0x3FD00107F80001D0L,0x000004F8007C0070L});
    public static final BitSet FOLLOW_expression_in_expression1673 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_103_in_expression1689 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1693 = new BitSet(new long[]{0x3FD00107F80001D0L,0x000004F8007C0070L});
    public static final BitSet FOLLOW_expression_in_expression1697 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_99_in_expression1713 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1718 = new BitSet(new long[]{0x3FD00107F80001D0L,0x000004F8007C0070L});
    public static final BitSet FOLLOW_expression_in_expression1722 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_100_in_expression1738 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1742 = new BitSet(new long[]{0x3FD00107F80001D0L,0x000004F8007C0070L});
    public static final BitSet FOLLOW_expression_in_expression1746 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_101_in_expression1762 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1767 = new BitSet(new long[]{0x3FD00107F80001D0L,0x000004F8007C0070L});
    public static final BitSet FOLLOW_expression_in_expression1771 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_102_in_expression1787 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1792 = new BitSet(new long[]{0x3FD00107F80001D0L,0x000004F8007C0070L});
    public static final BitSet FOLLOW_expression_in_expression1796 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INSTANCEOF_in_expression1808 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1812 = new BitSet(new long[]{0x000FF10000000200L});
    public static final BitSet FOLLOW_type_in_expression1814 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COMPAREOP_in_expression1834 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1838 = new BitSet(new long[]{0x3FD00107F80001D0L,0x000004F8007C0070L});
    public static final BitSet FOLLOW_expression_in_expression1842 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_expression1864 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1873 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_expression1899 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1909 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_106_in_expression1933 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1937 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CAST_in_expression1956 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primitiveType_in_expression1960 = new BitSet(new long[]{0x3FD00107F80001D0L,0x000004F8007C0070L});
    public static final BitSet FOLLOW_expression_in_expression1964 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CAST_in_expression1983 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arrayType_in_expression1987 = new BitSet(new long[]{0x3FD00107F80001D0L,0x000004F8007C0070L});
    public static final BitSet FOLLOW_expression_in_expression1991 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CAST_in_expression2010 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_classType_in_expression2014 = new BitSet(new long[]{0x3FD00107F80001D0L,0x000004F8007C0070L});
    public static final BitSet FOLLOW_expression_in_expression2018 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NEW_in_expression2038 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_creator_in_expression2040 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_expression2054 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2064 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_selector_in_expression2088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_in_expression2100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_primary2136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_superMemberAccess_in_primary2148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primary2160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_primary2172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOTCLASS_in_primary2196 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_primary2198 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DOTCLASS_in_primary2214 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VOID_in_primary2216 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FIELDACCESS_in_selector2247 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_selector2249 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_selector2251 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_METHODCALL_in_selector2270 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_selector2272 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_selector2274 = new BitSet(new long[]{0x0000000000004008L});
    public static final BitSet FOLLOW_arguments_in_selector2276 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARRAYACCESS_in_selector2299 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_selector2303 = new BitSet(new long[]{0x3FD00107F80001D0L,0x000004F8007C0070L});
    public static final BitSet FOLLOW_expression_in_selector2307 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_arrayCreatorRest_in_creator2339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classType_in_creator2351 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_classCreatorRest_in_creator2353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classType_in_createdName2386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_createdName2402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAYALLOCINIT_in_arrayCreatorRest2430 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_brackets_in_arrayCreatorRest2432 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_arrayInitializer_in_arrayCreatorRest2434 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARRAYALLOC_in_arrayCreatorRest2449 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bracketsOpt_in_arrayCreatorRest2451 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_arguments_in_classCreatorRest2477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_METHODCALL_in_superMemberAccess2509 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SUPER_in_superMemberAccess2511 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_superMemberAccess2513 = new BitSet(new long[]{0x0000000000004008L});
    public static final BitSet FOLLOW_arguments_in_superMemberAccess2515 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FIELDACCESS_in_superMemberAccess2536 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SUPER_in_superMemberAccess2538 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_superMemberAccess2540 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARGUMENTS_in_arguments2581 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expressionList_in_arguments2583 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARRAYTYPE_in_brackets2612 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bracketsOpt_in_brackets2614 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_createdName_in_bracketsOpt2642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAYTYPE_in_bracketsOpt2659 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bracketsOpt_in_bracketsOpt2663 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARRAYTYPE_in_bracketsOpt2675 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_bracketsOpt2677 = new BitSet(new long[]{0x000FF10000000200L});
    public static final BitSet FOLLOW_bracketsOpt_in_bracketsOpt2681 = new BitSet(new long[]{0x0000000000000008L});

}