// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g 2010-10-12 22:38:18

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "METHODCALL", "CONSTRCALL", "FIELDACCESS", "ARRAYACCESS", "DOTCLASS", "ARRAYTYPE", "METHOD", "FIELD", "CONSTR", "FPARMS", "ARGUMENTS", "FPARM", "FMULTPARM", "MBODY", "CBODY", "VARDECL", "BLOCK", "STMT", "INIT", "CONDITION", "UPDATE", "DOWHILE", "THEN", "ARRAYINIT", "PREINC", "POSTINC", "PREDEC", "POSTDEC", "UNARYPLUS", "UNARYMINUS", "CAST", "CLASS", "IDENTIFIER", "EXTENDS", "PUBLIC", "VOID", "PRIVATE", "CHAR", "BYTE", "SHORT", "INT", "LONG", "FLOAT", "DOUBLE", "BOOLEAN", "THIS", "SUPER", "INTLITERAL", "LONGLITERAL", "FLOATLITERAL", "DOUBLELITERAL", "CHARLITERAL", "STRINGLITERAL", "BOOLEANLITERAL", "NULLLITERAL", "IF", "FOR", "WHILE", "DO", "RETURN", "ELSE", "INSTANCEOF", "COMPAREOP", "NEW", "Digit", "IntegerNumber", "LongSuffix", "Exponent", "FloatingPointLiteral", "FloatSuffix", "DoubleSuffix", "EscapeSequence", "WS", "COMMENT", "LINE_COMMENT", "EQ", "PLUS", "MINUS", "STAR", "SLASH", "Letter", "Currency", "';'", "'{'", "'}'", "','", "'['", "']'", "'('", "')'", "'+='", "'-='", "'*='", "'/='", "'||'", "'&&'", "'=='", "'!='", "'%'", "'++'", "'--'", "'!'", "'.'"
    };
    public static final int STMT=21;
    public static final int CONSTR=12;
    public static final int MINUS=81;
    public static final int ARRAYACCESS=7;
    public static final int UNARYMINUS=33;
    public static final int DOUBLE=47;
    public static final int METHOD=10;
    public static final int THEN=26;
    public static final int FPARM=15;
    public static final int IntegerNumber=69;
    public static final int ARRAYINIT=27;
    public static final int PREDEC=30;
    public static final int FIELDACCESS=6;
    public static final int PRIVATE=40;
    public static final int Letter=84;
    public static final int INTLITERAL=51;
    public static final int CONDITION=23;
    public static final int PREINC=28;
    public static final int T__96=96;
    public static final int MBODY=17;
    public static final int CBODY=18;
    public static final int STRINGLITERAL=56;
    public static final int CHARLITERAL=55;
    public static final int PLUS=80;
    public static final int EXTENDS=37;
    public static final int POSTDEC=31;
    public static final int UNARYPLUS=32;
    public static final int DOUBLELITERAL=54;
    public static final int SUPER=50;
    public static final int ARGUMENTS=14;
    public static final int T__89=89;
    public static final int LongSuffix=70;
    public static final int WS=76;
    public static final int CHAR=41;
    public static final int NEW=67;
    public static final int EQ=79;
    public static final int UPDATE=24;
    public static final int T__92=92;
    public static final int T__88=88;
    public static final int LINE_COMMENT=78;
    public static final int DOTCLASS=8;
    public static final int FIELD=11;
    public static final int POSTINC=29;
    public static final int T__90=90;
    public static final int BOOLEAN=48;
    public static final int ELSE=64;
    public static final int T__91=91;
    public static final int BOOLEANLITERAL=57;
    public static final int CONSTRCALL=5;
    public static final int IDENTIFIER=36;
    public static final int T__93=93;
    public static final int SHORT=43;
    public static final int ARRAYTYPE=9;
    public static final int VARDECL=19;
    public static final int PUBLIC=38;
    public static final int LONG=45;
    public static final int T__86=86;
    public static final int T__94=94;
    public static final int Digit=68;
    public static final int T__100=100;
    public static final int T__95=95;
    public static final int FLOAT=46;
    public static final int CAST=34;
    public static final int T__101=101;
    public static final int FLOATLITERAL=53;
    public static final int INIT=22;
    public static final int FMULTPARM=16;
    public static final int T__104=104;
    public static final int DOWHILE=25;
    public static final int T__87=87;
    public static final int BLOCK=20;
    public static final int T__106=106;
    public static final int EscapeSequence=75;
    public static final int INT=44;
    public static final int COMPAREOP=66;
    public static final int VOID=39;
    public static final int INSTANCEOF=65;
    public static final int LONGLITERAL=52;
    public static final int NULLLITERAL=58;
    public static final int FloatingPointLiteral=72;
    public static final int T__98=98;
    public static final int DoubleSuffix=74;
    public static final int Exponent=71;
    public static final int FloatSuffix=73;
    public static final int DO=62;
    public static final int SLASH=83;
    public static final int WHILE=61;
    public static final int Currency=85;
    public static final int T__99=99;
    public static final int COMMENT=77;
    public static final int THIS=49;
    public static final int T__103=103;
    public static final int CLASS=35;
    public static final int RETURN=63;
    public static final int T__97=97;
    public static final int METHODCALL=4;
    public static final int BYTE=42;
    public static final int T__105=105;
    public static final int IF=59;
    public static final int FPARMS=13;
    public static final int EOF=-1;
    public static final int FOR=60;
    public static final int STAR=82;
    public static final int T__102=102;

    // delegates
    // delegators

    protected static class JaScope_scope {
        String name;
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
        	
        	private List<String> formalParameters;
        	
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
    	
    	private Type getVariableType(String id) {
    	    for (int s=JaScope_stack.size()-1; s>=0; s--) {
    	        if ( ((JaScope_scope)JaScope_stack.elementAt(s)).symbols.containsKey(id) ) {
    	            return ((JaScope_scope)JaScope_stack.elementAt(s)).symbols.get(id);
    	        }
    	    }
    	    return rt.getField(true, id);
    	}
    	
    	private String getMethodSignature() {	
    	    String parameters = formalParameters.toString();
    	    parameters = formalParameters.size() > 0 ? parameters.substring(1, parameters.length() - 1) : "";
    	    return ((JaScope_scope)JaScope_stack.elementAt(0)).name + '(' + parameters + ')';
    	}
    	
    	private List<Type> getFormalParametersList() {
    	    List types = new LinkedList<Type>();
    	    for(String id : formalParameters) {
    	    	types.add(((JaScope_scope)JaScope_stack.elementAt(0)).symbols.get(id));
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
        	    	((JaScope_scope)JaScope_stack.peek()).symbols.put(id, t);
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
        			 



    // $ANTLR start "compilationUnit"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:156:1: compilationUnit : classDeclaration ;
    public final void compilationUnit() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:170:5: ( classDeclaration )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:170:8: classDeclaration
            {
            pushFollow(FOLLOW_classDeclaration_in_compilationUnit63);
            classDeclaration();

            state._fsp--;


            }


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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:173:1: classDeclaration : ^( CLASS IDENTIFIER ( classType )? classBody ) ;
    public final void classDeclaration() throws RecognitionException {
        CommonTree IDENTIFIER1=null;

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:174:5: ( ^( CLASS IDENTIFIER ( classType )? classBody ) )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:174:9: ^( CLASS IDENTIFIER ( classType )? classBody )
            {
            match(input,CLASS,FOLLOW_CLASS_in_classDeclaration87); 

            match(input, Token.DOWN, null); 
            IDENTIFIER1=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classDeclaration89); 
             errorLog= new ErrorLogger((IDENTIFIER1!=null?IDENTIFIER1.getText():null)); 
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:174:77: ( classType )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==IDENTIFIER) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:174:77: classType
                    {
                    pushFollow(FOLLOW_classType_in_classDeclaration93);
                    classType();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_classBody_in_classDeclaration96);
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:177:1: classBody : ( classBodyDeclaration )* ;
    public final void classBody() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:178:5: ( ( classBodyDeclaration )* )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:178:9: ( classBodyDeclaration )*
            {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:178:9: ( classBodyDeclaration )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=METHOD && LA2_0<=CONSTR)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:178:9: classBodyDeclaration
            	    {
            	    pushFollow(FOLLOW_classBodyDeclaration_in_classBody121);
            	    classBodyDeclaration();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:181:1: classBodyDeclaration : memberDeclaration ;
    public final void classBodyDeclaration() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:182:5: ( memberDeclaration )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:182:9: memberDeclaration
            {
            pushFollow(FOLLOW_memberDeclaration_in_classBodyDeclaration141);
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:185:1: memberDeclaration : ( fieldDeclaration | methodAndConstructorDeclaration );
    public final void memberDeclaration() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:186:5: ( fieldDeclaration | methodAndConstructorDeclaration )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==FIELD) ) {
                alt3=1;
            }
            else if ( (LA3_0==METHOD||LA3_0==CONSTR) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:186:9: fieldDeclaration
                    {
                    pushFollow(FOLLOW_fieldDeclaration_in_memberDeclaration164);
                    fieldDeclaration();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:187:7: methodAndConstructorDeclaration
                    {
                    pushFollow(FOLLOW_methodAndConstructorDeclaration_in_memberDeclaration172);
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:190:1: methodAndConstructorDeclaration : ( ^( METHOD modifier type methodDeclaration ) | ^( METHOD modifier VOID IDENTIFIER voidMethodDeclaratorRest ) | ^( CONSTR modifier IDENTIFIER ( formalParameters )? ( constructorBody )? ) );
    public final void methodAndConstructorDeclaration() throws RecognitionException {
        JaScope_stack.push(new JaScope_scope());

        CommonTree IDENTIFIER2=null;
        CommonTree IDENTIFIER3=null;


        	((JaScope_scope)JaScope_stack.peek()).symbols = new HashMap<String, Type>();
        	formalParameters = new LinkedList<String>();

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:199:5: ( ^( METHOD modifier type methodDeclaration ) | ^( METHOD modifier VOID IDENTIFIER voidMethodDeclaratorRest ) | ^( CONSTR modifier IDENTIFIER ( formalParameters )? ( constructorBody )? ) )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==METHOD) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==DOWN) ) {
                    int LA6_3 = input.LA(3);

                    if ( (LA6_3==PUBLIC||LA6_3==PRIVATE) ) {
                        int LA6_4 = input.LA(4);

                        if ( (LA6_4==VOID) ) {
                            alt6=2;
                        }
                        else if ( (LA6_4==ARRAYTYPE||LA6_4==IDENTIFIER||(LA6_4>=CHAR && LA6_4<=BOOLEAN)) ) {
                            alt6=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA6_0==CONSTR) ) {
                alt6=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:199:9: ^( METHOD modifier type methodDeclaration )
                    {
                    match(input,METHOD,FOLLOW_METHOD_in_methodAndConstructorDeclaration211); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_modifier_in_methodAndConstructorDeclaration213);
                    modifier();

                    state._fsp--;

                    pushFollow(FOLLOW_type_in_methodAndConstructorDeclaration215);
                    type();

                    state._fsp--;

                    pushFollow(FOLLOW_methodDeclaration_in_methodAndConstructorDeclaration218);
                    methodDeclaration();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:200:9: ^( METHOD modifier VOID IDENTIFIER voidMethodDeclaratorRest )
                    {
                    match(input,METHOD,FOLLOW_METHOD_in_methodAndConstructorDeclaration233); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_modifier_in_methodAndConstructorDeclaration235);
                    modifier();

                    state._fsp--;

                    match(input,VOID,FOLLOW_VOID_in_methodAndConstructorDeclaration237); 
                    IDENTIFIER2=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_methodAndConstructorDeclaration239); 
                     ((JaScope_scope)JaScope_stack.peek()).name = (IDENTIFIER2!=null?IDENTIFIER2.getText():null); 
                    pushFollow(FOLLOW_voidMethodDeclaratorRest_in_methodAndConstructorDeclaration243);
                    voidMethodDeclaratorRest();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:201:9: ^( CONSTR modifier IDENTIFIER ( formalParameters )? ( constructorBody )? )
                    {
                    match(input,CONSTR,FOLLOW_CONSTR_in_methodAndConstructorDeclaration258); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_modifier_in_methodAndConstructorDeclaration260);
                    modifier();

                    state._fsp--;

                    IDENTIFIER3=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_methodAndConstructorDeclaration262); 
                     ((JaScope_scope)JaScope_stack.peek()).name = (IDENTIFIER3!=null?IDENTIFIER3.getText():null); 
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:201:77: ( formalParameters )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==FPARMS) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:201:77: formalParameters
                            {
                            pushFollow(FOLLOW_formalParameters_in_methodAndConstructorDeclaration266);
                            formalParameters();

                            state._fsp--;


                            }
                            break;

                    }

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:201:95: ( constructorBody )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==CBODY) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:201:95: constructorBody
                            {
                            pushFollow(FOLLOW_constructorBody_in_methodAndConstructorDeclaration269);
                            constructorBody();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;

            }

            	System.out.println("methodAndConstructorDeclaration: " + getMethodSignature());

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


    // $ANTLR start "methodDeclaration"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:205:1: methodDeclaration : IDENTIFIER ( formalParameters )? methodBody ;
    public final void methodDeclaration() throws RecognitionException {
        CommonTree IDENTIFIER4=null;

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:206:5: ( IDENTIFIER ( formalParameters )? methodBody )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:206:9: IDENTIFIER ( formalParameters )? methodBody
            {
            IDENTIFIER4=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_methodDeclaration300); 
             ((JaScope_scope)JaScope_stack.peek()).name = (IDENTIFIER4!=null?IDENTIFIER4.getText():null); 
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:206:59: ( formalParameters )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==FPARMS) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:206:59: formalParameters
                    {
                    pushFollow(FOLLOW_formalParameters_in_methodDeclaration304);
                    formalParameters();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_methodBody_in_methodDeclaration307);
            methodBody();

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
    // $ANTLR end "methodDeclaration"


    // $ANTLR start "fieldDeclaration"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:209:1: fieldDeclaration : ^( FIELD modifier variableDeclarator ) ;
    public final void fieldDeclaration() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:210:5: ( ^( FIELD modifier variableDeclarator ) )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:210:9: ^( FIELD modifier variableDeclarator )
            {
            match(input,FIELD,FOLLOW_FIELD_in_fieldDeclaration327); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_modifier_in_fieldDeclaration329);
            modifier();

            state._fsp--;

            pushFollow(FOLLOW_variableDeclarator_in_fieldDeclaration331);
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


    // $ANTLR start "voidMethodDeclaratorRest"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:213:1: voidMethodDeclaratorRest : ( formalParameters )? methodBody ;
    public final void voidMethodDeclaratorRest() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:214:5: ( ( formalParameters )? methodBody )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:214:7: ( formalParameters )? methodBody
            {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:214:7: ( formalParameters )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==FPARMS) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:214:7: formalParameters
                    {
                    pushFollow(FOLLOW_formalParameters_in_voidMethodDeclaratorRest354);
                    formalParameters();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_methodBody_in_voidMethodDeclaratorRest357);
            methodBody();

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
    // $ANTLR end "voidMethodDeclaratorRest"

    public static class variableDeclarator_return extends TreeRuleReturnScope {
        public CommonTree id;
        public Type t;
    };

    // $ANTLR start "variableDeclarator"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:217:1: variableDeclarator returns [CommonTree id, Type t] : variableDeclaratorId ( variableInitializer[$variableDeclaratorId.t, $variableDeclaratorId.id] )? ;
    public final JaWalker.variableDeclarator_return variableDeclarator() throws RecognitionException {
        JaWalker.variableDeclarator_return retval = new JaWalker.variableDeclarator_return();
        retval.start = input.LT(1);

        JaWalker.variableDeclaratorId_return variableDeclaratorId5 = null;


        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:218:5: ( variableDeclaratorId ( variableInitializer[$variableDeclaratorId.t, $variableDeclaratorId.id] )? )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:218:9: variableDeclaratorId ( variableInitializer[$variableDeclaratorId.t, $variableDeclaratorId.id] )?
            {
            pushFollow(FOLLOW_variableDeclaratorId_in_variableDeclarator380);
            variableDeclaratorId5=variableDeclaratorId();

            state._fsp--;

             retval.id = (variableDeclaratorId5!=null?variableDeclaratorId5.id:null); retval.t = (variableDeclaratorId5!=null?variableDeclaratorId5.t:null); 
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:218:96: ( variableInitializer[$variableDeclaratorId.t, $variableDeclaratorId.id] )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==METHODCALL||(LA9_0>=FIELDACCESS && LA9_0<=DOTCLASS)||(LA9_0>=ARRAYINIT && LA9_0<=CAST)||LA9_0==IDENTIFIER||LA9_0==THIS||(LA9_0>=INTLITERAL && LA9_0<=NULLLITERAL)||(LA9_0>=INSTANCEOF && LA9_0<=NEW)||(LA9_0>=EQ && LA9_0<=SLASH)||(LA9_0>=98 && LA9_0<=102)||LA9_0==105) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:218:97: variableInitializer[$variableDeclaratorId.t, $variableDeclaratorId.id]
                    {
                    pushFollow(FOLLOW_variableInitializer_in_variableDeclarator385);
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:221:1: variableDeclaratorId returns [CommonTree id, Type t] : type IDENTIFIER ;
    public final JaWalker.variableDeclaratorId_return variableDeclaratorId() throws RecognitionException {
        JaWalker.variableDeclaratorId_return retval = new JaWalker.variableDeclaratorId_return();
        retval.start = input.LT(1);

        CommonTree IDENTIFIER6=null;
        Type type7 = null;


        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:222:5: ( type IDENTIFIER )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:222:9: type IDENTIFIER
            {
            pushFollow(FOLLOW_type_in_variableDeclaratorId415);
            type7=type();

            state._fsp--;

            IDENTIFIER6=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variableDeclaratorId417); 
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:225:1: variableInitializer[Type tin, CommonTree token] : ( arrayInitializer[$tin] | e= expression );
    public final void variableInitializer(Type tin, CommonTree token) throws RecognitionException {
        JaWalker.expression_return e = null;


        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:226:5: ( arrayInitializer[$tin] | e= expression )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ARRAYINIT) ) {
                alt10=1;
            }
            else if ( (LA10_0==METHODCALL||(LA10_0>=FIELDACCESS && LA10_0<=DOTCLASS)||(LA10_0>=PREINC && LA10_0<=CAST)||LA10_0==IDENTIFIER||LA10_0==THIS||(LA10_0>=INTLITERAL && LA10_0<=NULLLITERAL)||(LA10_0>=INSTANCEOF && LA10_0<=NEW)||(LA10_0>=EQ && LA10_0<=SLASH)||(LA10_0>=98 && LA10_0<=102)||LA10_0==105) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:226:9: arrayInitializer[$tin]
                    {
                     if(tin.isArray()) {
                        	  	tin = ((ArrayType)tin).getHostType();
                        	  } else {
                        	  	errorLog.add(new IllegalArrayInitializerException(tin.toString(), token.getLine(), token.getCharPositionInLine()));
                        	  }
                        	
                    pushFollow(FOLLOW_arrayInitializer_in_variableInitializer453);
                    arrayInitializer(tin);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:234:9: e= expression
                    {
                    pushFollow(FOLLOW_expression_in_variableInitializer472);
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:241:1: arrayInitializer[Type tin] : ^( ARRAYINIT ( variableInitializer[$tin, $ARRAYINIT] )* ) ;
    public final void arrayInitializer(Type tin) throws RecognitionException {
        CommonTree ARRAYINIT8=null;

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:242:5: ( ^( ARRAYINIT ( variableInitializer[$tin, $ARRAYINIT] )* ) )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:242:9: ^( ARRAYINIT ( variableInitializer[$tin, $ARRAYINIT] )* )
            {
            ARRAYINIT8=(CommonTree)match(input,ARRAYINIT,FOLLOW_ARRAYINIT_in_arrayInitializer506); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:242:21: ( variableInitializer[$tin, $ARRAYINIT] )*
                loop11:
                do {
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==METHODCALL||(LA11_0>=FIELDACCESS && LA11_0<=DOTCLASS)||(LA11_0>=ARRAYINIT && LA11_0<=CAST)||LA11_0==IDENTIFIER||LA11_0==THIS||(LA11_0>=INTLITERAL && LA11_0<=NULLLITERAL)||(LA11_0>=INSTANCEOF && LA11_0<=NEW)||(LA11_0>=EQ && LA11_0<=SLASH)||(LA11_0>=98 && LA11_0<=102)||LA11_0==105) ) {
                        alt11=1;
                    }


                    switch (alt11) {
                	case 1 :
                	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:242:21: variableInitializer[$tin, $ARRAYINIT]
                	    {
                	    pushFollow(FOLLOW_variableInitializer_in_arrayInitializer508);
                	    variableInitializer(tin, ARRAYINIT8);

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop11;
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:245:1: modifier : ( PUBLIC | PRIVATE );
    public final void modifier() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:246:5: ( PUBLIC | PRIVATE )
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:250:1: type returns [Type t] : ( nonPrimitiveType | primitiveType );
    public final Type type() throws RecognitionException {
        Type t = null;

        ComplexType nonPrimitiveType9 = null;

        BasicType primitiveType10 = null;


        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:251:5: ( nonPrimitiveType | primitiveType )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==ARRAYTYPE||LA12_0==IDENTIFIER) ) {
                alt12=1;
            }
            else if ( ((LA12_0>=CHAR && LA12_0<=BOOLEAN)) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:251:7: nonPrimitiveType
                    {
                    pushFollow(FOLLOW_nonPrimitiveType_in_type569);
                    nonPrimitiveType9=nonPrimitiveType();

                    state._fsp--;

                     t = nonPrimitiveType9; 

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:252:7: primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_type579);
                    primitiveType10=primitiveType();

                    state._fsp--;

                     t = primitiveType10;   

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


    // $ANTLR start "nonPrimitiveType"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:255:1: nonPrimitiveType returns [ComplexType t] : ( ^( ARRAYTYPE npt= nonPrimitiveType ) | classType | ^( ARRAYTYPE primitiveType ) );
    public final ComplexType nonPrimitiveType() throws RecognitionException {
        ComplexType t = null;

        ComplexType npt = null;

        ReferenceType classType11 = null;

        BasicType primitiveType12 = null;


        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:256:5: ( ^( ARRAYTYPE npt= nonPrimitiveType ) | classType | ^( ARRAYTYPE primitiveType ) )
            int alt13=3;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==ARRAYTYPE) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==DOWN) ) {
                    int LA13_3 = input.LA(3);

                    if ( ((LA13_3>=CHAR && LA13_3<=BOOLEAN)) ) {
                        alt13=3;
                    }
                    else if ( (LA13_3==ARRAYTYPE||LA13_3==IDENTIFIER) ) {
                        alt13=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA13_0==IDENTIFIER) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:256:7: ^( ARRAYTYPE npt= nonPrimitiveType )
                    {
                    match(input,ARRAYTYPE,FOLLOW_ARRAYTYPE_in_nonPrimitiveType607); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_nonPrimitiveType_in_nonPrimitiveType611);
                    npt=nonPrimitiveType();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     t = (ComplexType)ParserHelper.createArrayType(npt, 1); 

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:257:9: classType
                    {
                    pushFollow(FOLLOW_classType_in_nonPrimitiveType624);
                    classType11=classType();

                    state._fsp--;

                     t = classType11; 

                    }
                    break;
                case 3 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:258:7: ^( ARRAYTYPE primitiveType )
                    {
                    match(input,ARRAYTYPE,FOLLOW_ARRAYTYPE_in_nonPrimitiveType658); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_primitiveType_in_nonPrimitiveType660);
                    primitiveType12=primitiveType();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     t = (ComplexType)ParserHelper.createArrayType(primitiveType12, 1); 

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
    // $ANTLR end "nonPrimitiveType"


    // $ANTLR start "classType"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:261:1: classType returns [ReferenceType t] : IDENTIFIER ;
    public final ReferenceType classType() throws RecognitionException {
        ReferenceType t = null;

        CommonTree IDENTIFIER13=null;

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:262:5: ( IDENTIFIER )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:262:7: IDENTIFIER
            {
            IDENTIFIER13=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classType691); 
             t = cTab.get((IDENTIFIER13!=null?IDENTIFIER13.getText():null)); 
                	  if (t == null) errorLog.add(new CannotFindSymbolException(("class " + (IDENTIFIER13!=null?IDENTIFIER13.getText():null)), "class " + rt.toString(), (IDENTIFIER13!=null?IDENTIFIER13.getLine():0), (IDENTIFIER13!=null?IDENTIFIER13.getCharPositionInLine():0)));
                	

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
    // $ANTLR end "classType"


    // $ANTLR start "primitiveType"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:268:1: primitiveType returns [BasicType bs] : ( CHAR | BYTE | SHORT | INT | LONG | FLOAT | DOUBLE | BOOLEAN );
    public final BasicType primitiveType() throws RecognitionException {
        BasicType bs = null;

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:269:5: ( CHAR | BYTE | SHORT | INT | LONG | FLOAT | DOUBLE | BOOLEAN )
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
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:269:9: CHAR
                    {
                    match(input,CHAR,FOLLOW_CHAR_in_primitiveType722); 
                     bs = BasicType.CHAR;    

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:270:9: BYTE
                    {
                    match(input,BYTE,FOLLOW_BYTE_in_primitiveType737); 
                     bs = BasicType.BYTE;    

                    }
                    break;
                case 3 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:271:9: SHORT
                    {
                    match(input,SHORT,FOLLOW_SHORT_in_primitiveType752); 
                     bs = BasicType.SHORT;   

                    }
                    break;
                case 4 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:272:9: INT
                    {
                    match(input,INT,FOLLOW_INT_in_primitiveType766); 
                     bs = BasicType.INT;     

                    }
                    break;
                case 5 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:273:9: LONG
                    {
                    match(input,LONG,FOLLOW_LONG_in_primitiveType782); 
                     bs = BasicType.LONG;    

                    }
                    break;
                case 6 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:274:9: FLOAT
                    {
                    match(input,FLOAT,FOLLOW_FLOAT_in_primitiveType797); 
                     bs = BasicType.FLOAT;   

                    }
                    break;
                case 7 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:275:9: DOUBLE
                    {
                    match(input,DOUBLE,FOLLOW_DOUBLE_in_primitiveType811); 
                     bs = BasicType.DOUBLE;  

                    }
                    break;
                case 8 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:276:9: BOOLEAN
                    {
                    match(input,BOOLEAN,FOLLOW_BOOLEAN_in_primitiveType824); 
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:279:1: formalParameters : ^( FPARMS ( formalParameterDecls )? ) ;
    public final void formalParameters() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:280:5: ( ^( FPARMS ( formalParameterDecls )? ) )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:280:9: ^( FPARMS ( formalParameterDecls )? )
            {
            match(input,FPARMS,FOLLOW_FPARMS_in_formalParameters850); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:280:18: ( formalParameterDecls )?
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==FPARM) ) {
                    alt15=1;
                }
                switch (alt15) {
                    case 1 :
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:280:18: formalParameterDecls
                        {
                        pushFollow(FOLLOW_formalParameterDecls_in_formalParameters852);
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:283:1: formalParameterDecls : ^( FPARM variableDeclaratorId ) ( formalParameterDecls )? ;
    public final void formalParameterDecls() throws RecognitionException {
        JaWalker.variableDeclaratorId_return variableDeclaratorId14 = null;


        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:284:5: ( ^( FPARM variableDeclaratorId ) ( formalParameterDecls )? )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:284:7: ^( FPARM variableDeclaratorId ) ( formalParameterDecls )?
            {
            match(input,FPARM,FOLLOW_FPARM_in_formalParameterDecls877); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_variableDeclaratorId_in_formalParameterDecls879);
            variableDeclaratorId14=variableDeclaratorId();

            state._fsp--;


            match(input, Token.UP, null); 
             formalParameters.add((variableDeclaratorId14!=null?variableDeclaratorId14.t:null).toString()); addVariableToScope((variableDeclaratorId14!=null?variableDeclaratorId14.id:null), (variableDeclaratorId14!=null?variableDeclaratorId14.t:null)); 
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:284:170: ( formalParameterDecls )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==FPARM) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:284:170: formalParameterDecls
                    {
                    pushFollow(FOLLOW_formalParameterDecls_in_formalParameterDecls884);
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:288:1: methodBody : ^( MBODY block ) ;
    public final void methodBody() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:289:5: ( ^( MBODY block ) )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:289:9: ^( MBODY block )
            {
            match(input,MBODY,FOLLOW_MBODY_in_methodBody910); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                pushFollow(FOLLOW_block_in_methodBody912);
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:293:1: constructorBody : ^( CBODY ( explicitConstructorInvocation )? ( blockStatement )* ) ;
    public final void constructorBody() throws RecognitionException {
        JaScope_stack.push(new JaScope_scope());


        	((JaScope_scope)JaScope_stack.peek()).symbols = new HashMap<String, Type>();

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:301:5: ( ^( CBODY ( explicitConstructorInvocation )? ( blockStatement )* ) )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:301:7: ^( CBODY ( explicitConstructorInvocation )? ( blockStatement )* )
            {
            match(input,CBODY,FOLLOW_CBODY_in_constructorBody971); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:301:15: ( explicitConstructorInvocation )?
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==CONSTRCALL) ) {
                    alt17=1;
                }
                switch (alt17) {
                    case 1 :
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:301:15: explicitConstructorInvocation
                        {
                        pushFollow(FOLLOW_explicitConstructorInvocation_in_constructorBody973);
                        explicitConstructorInvocation();

                        state._fsp--;


                        }
                        break;

                }

                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:301:46: ( blockStatement )*
                loop18:
                do {
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( ((LA18_0>=VARDECL && LA18_0<=STMT)||LA18_0==DOWHILE||(LA18_0>=IF && LA18_0<=WHILE)||LA18_0==RETURN) ) {
                        alt18=1;
                    }


                    switch (alt18) {
                	case 1 :
                	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:301:46: blockStatement
                	    {
                	    pushFollow(FOLLOW_blockStatement_in_constructorBody976);
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


            	System.out.println("constructorBody: " + getMethodSignature() + " Scope: " + ((JaScope_scope)JaScope_stack.peek()).symbols);

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:304:1: explicitConstructorInvocation : ( ^( CONSTRCALL THIS ( arguments )? ) | ^( CONSTRCALL SUPER ( arguments )? ) );
    public final void explicitConstructorInvocation() throws RecognitionException {
        JaWalker.arguments_return arguments15 = null;

        JaWalker.arguments_return arguments16 = null;


        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:305:5: ( ^( CONSTRCALL THIS ( arguments )? ) | ^( CONSTRCALL SUPER ( arguments )? ) )
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
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:305:9: ^( CONSTRCALL THIS ( arguments )? )
                    {
                    match(input,CONSTRCALL,FOLLOW_CONSTRCALL_in_explicitConstructorInvocation998); 

                    match(input, Token.DOWN, null); 
                    match(input,THIS,FOLLOW_THIS_in_explicitConstructorInvocation1000); 
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:305:28: ( arguments )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==ARGUMENTS) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:305:28: arguments
                            {
                            pushFollow(FOLLOW_arguments_in_explicitConstructorInvocation1003);
                            arguments15=arguments();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                     Type[] args;
                              if((arguments15!=null?arguments15.types:null) == null || ruleTypeCheck((arguments15!=null?arguments15.types:null).toArray(args = new Type[(arguments15!=null?arguments15.types:null).size()]))) {
                    	    	  try {
                    		    	rt.bindConstructor((arguments15!=null?arguments15.types:null));
                    	    	  } catch (EarlyBindingException ex) {
                    	    	  	//errorLog.add(new ...); 
                    	    	  	System.out.println("costruttore THIS inesistente");
                    	    	  }
                        	  } 
                        	

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:316:7: ^( CONSTRCALL SUPER ( arguments )? )
                    {
                    match(input,CONSTRCALL,FOLLOW_CONSTRCALL_in_explicitConstructorInvocation1024); 

                    match(input, Token.DOWN, null); 
                    match(input,SUPER,FOLLOW_SUPER_in_explicitConstructorInvocation1026); 
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:316:26: ( arguments )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==ARGUMENTS) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:316:26: arguments
                            {
                            pushFollow(FOLLOW_arguments_in_explicitConstructorInvocation1028);
                            arguments16=arguments();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                     Type[] args;
                        	  if( (arguments16!=null?arguments16.types:null) == null || ruleTypeCheck((arguments16!=null?arguments16.types:null).toArray(args = new Type[(arguments16!=null?arguments16.types:null).size()])) ) {
                    	    	  try {
                    	          	rt.getSuperClass().bindConstructor((arguments16!=null?arguments16.types:null));
                    		  } catch (EarlyBindingException ex) {
                    		  	System.out.println("costruttore SUPER inesistente");
                    		   	//.add(new ...);
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:329:1: literal returns [Type t] : ( INTLITERAL | LONGLITERAL | FLOATLITERAL | DOUBLELITERAL | CHARLITERAL | STRINGLITERAL | BOOLEANLITERAL | NULLLITERAL );
    public final Type literal() throws RecognitionException {
        Type t = null;

        CommonTree INTLITERAL17=null;

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:330:5: ( INTLITERAL | LONGLITERAL | FLOATLITERAL | DOUBLELITERAL | CHARLITERAL | STRINGLITERAL | BOOLEANLITERAL | NULLLITERAL )
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
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:330:9: INTLITERAL
                    {
                    INTLITERAL17=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_literal1060); 
                     int literal = Integer.parseInt((INTLITERAL17!=null?INTLITERAL17.getText():null));
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
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:339:9: LONGLITERAL
                    {
                    match(input,LONGLITERAL,FOLLOW_LONGLITERAL_in_literal1076); 
                     t = BasicType.LONG;       

                    }
                    break;
                case 3 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:340:9: FLOATLITERAL
                    {
                    match(input,FLOATLITERAL,FOLLOW_FLOATLITERAL_in_literal1091); 
                     t = BasicType.FLOAT;      

                    }
                    break;
                case 4 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:341:7: DOUBLELITERAL
                    {
                    match(input,DOUBLELITERAL,FOLLOW_DOUBLELITERAL_in_literal1103); 
                     t = BasicType.DOUBLE;     

                    }
                    break;
                case 5 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:342:9: CHARLITERAL
                    {
                    match(input,CHARLITERAL,FOLLOW_CHARLITERAL_in_literal1116); 
                     t = BasicType.CHAR;       

                    }
                    break;
                case 6 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:343:9: STRINGLITERAL
                    {
                    match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_literal1131); 
                     t = ReferenceType.STRING; 

                    }
                    break;
                case 7 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:344:9: BOOLEANLITERAL
                    {
                    match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_literal1144); 
                     t = BasicType.BOOLEAN;    

                    }
                    break;
                case 8 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:345:9: NULLLITERAL
                    {
                    match(input,NULLLITERAL,FOLLOW_NULLLITERAL_in_literal1156); 
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:350:1: block : ( blockStatement )* ;
    public final void block() throws RecognitionException {
        JaScope_stack.push(new JaScope_scope());


        	((JaScope_scope)JaScope_stack.peek()).symbols = new HashMap<String, Type>();

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:358:5: ( ( blockStatement )* )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:358:9: ( blockStatement )*
            {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:358:9: ( blockStatement )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=VARDECL && LA23_0<=STMT)||LA23_0==DOWHILE||(LA23_0>=IF && LA23_0<=WHILE)||LA23_0==RETURN) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:358:9: blockStatement
            	    {
            	    pushFollow(FOLLOW_blockStatement_in_block1197);
            	    blockStatement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }


            	System.out.println("block symbols: " + ((JaScope_scope)JaScope_stack.peek()).symbols);

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:361:1: blockStatement : ( localVariableDeclarationStatement | statement );
    public final void blockStatement() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:362:5: ( localVariableDeclarationStatement | statement )
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
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:362:9: localVariableDeclarationStatement
                    {
                    pushFollow(FOLLOW_localVariableDeclarationStatement_in_blockStatement1221);
                    localVariableDeclarationStatement();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:363:9: statement
                    {
                    pushFollow(FOLLOW_statement_in_blockStatement1232);
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:366:1: localVariableDeclarationStatement : localVariableDeclaration ;
    public final void localVariableDeclarationStatement() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:367:5: ( localVariableDeclaration )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:367:7: localVariableDeclaration
            {
            pushFollow(FOLLOW_localVariableDeclaration_in_localVariableDeclarationStatement1253);
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:370:1: localVariableDeclaration : ^( VARDECL variableDeclarator ) ;
    public final void localVariableDeclaration() throws RecognitionException {
        JaWalker.variableDeclarator_return variableDeclarator18 = null;


        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:371:5: ( ^( VARDECL variableDeclarator ) )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:371:7: ^( VARDECL variableDeclarator )
            {
            match(input,VARDECL,FOLLOW_VARDECL_in_localVariableDeclaration1271); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_variableDeclarator_in_localVariableDeclaration1273);
            variableDeclarator18=variableDeclarator();

            state._fsp--;


            match(input, Token.UP, null); 
             addVariableToScope((variableDeclarator18!=null?variableDeclarator18.id:null), (variableDeclarator18!=null?variableDeclarator18.t:null)); 

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:376:1: statement : ( ^( BLOCK block ) | ^( IF ^( CONDITION expression ) ^( THEN statement ) ( elseStmt )? ) | ^( FOR ( ^( INIT forInit ) )? ( ^( CONDITION expression ) )? ( ^( UPDATE forUpdate ) )? statement ) | ^( WHILE ^( CONDITION expression ) statement ) | ^( DOWHILE ^( CONDITION expression ) statement ) | ^( RETURN ( expression )? ) | ^( STMT statementExpression ) );
    public final void statement() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:377:5: ( ^( BLOCK block ) | ^( IF ^( CONDITION expression ) ^( THEN statement ) ( elseStmt )? ) | ^( FOR ( ^( INIT forInit ) )? ( ^( CONDITION expression ) )? ( ^( UPDATE forUpdate ) )? statement ) | ^( WHILE ^( CONDITION expression ) statement ) | ^( DOWHILE ^( CONDITION expression ) statement ) | ^( RETURN ( expression )? ) | ^( STMT statementExpression ) )
            int alt30=7;
            switch ( input.LA(1) ) {
            case BLOCK:
                {
                alt30=1;
                }
                break;
            case IF:
                {
                alt30=2;
                }
                break;
            case FOR:
                {
                alt30=3;
                }
                break;
            case WHILE:
                {
                alt30=4;
                }
                break;
            case DOWHILE:
                {
                alt30=5;
                }
                break;
            case RETURN:
                {
                alt30=6;
                }
                break;
            case STMT:
                {
                alt30=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:377:9: ^( BLOCK block )
                    {
                    match(input,BLOCK,FOLLOW_BLOCK_in_statement1310); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_block_in_statement1312);
                        block();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:378:9: ^( IF ^( CONDITION expression ) ^( THEN statement ) ( elseStmt )? )
                    {
                    match(input,IF,FOLLOW_IF_in_statement1324); 

                    match(input, Token.DOWN, null); 
                    match(input,CONDITION,FOLLOW_CONDITION_in_statement1327); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_statement1329);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    match(input,THEN,FOLLOW_THEN_in_statement1333); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_statement_in_statement1335);
                    statement();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:378:56: ( elseStmt )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==ELSE) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:378:56: elseStmt
                            {
                            pushFollow(FOLLOW_elseStmt_in_statement1338);
                            elseStmt();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:379:9: ^( FOR ( ^( INIT forInit ) )? ( ^( CONDITION expression ) )? ( ^( UPDATE forUpdate ) )? statement )
                    {
                    match(input,FOR,FOLLOW_FOR_in_statement1351); 

                    match(input, Token.DOWN, null); 
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:379:15: ( ^( INIT forInit ) )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==INIT) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:379:16: ^( INIT forInit )
                            {
                            match(input,INIT,FOLLOW_INIT_in_statement1355); 

                            match(input, Token.DOWN, null); 
                            pushFollow(FOLLOW_forInit_in_statement1357);
                            forInit();

                            state._fsp--;


                            match(input, Token.UP, null); 

                            }
                            break;

                    }

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:379:34: ( ^( CONDITION expression ) )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==CONDITION) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:379:35: ^( CONDITION expression )
                            {
                            match(input,CONDITION,FOLLOW_CONDITION_in_statement1364); 

                            match(input, Token.DOWN, null); 
                            pushFollow(FOLLOW_expression_in_statement1366);
                            expression();

                            state._fsp--;


                            match(input, Token.UP, null); 

                            }
                            break;

                    }

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:379:61: ( ^( UPDATE forUpdate ) )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==UPDATE) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:379:62: ^( UPDATE forUpdate )
                            {
                            match(input,UPDATE,FOLLOW_UPDATE_in_statement1373); 

                            match(input, Token.DOWN, null); 
                            pushFollow(FOLLOW_forUpdate_in_statement1375);
                            forUpdate();

                            state._fsp--;


                            match(input, Token.UP, null); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_statement_in_statement1380);
                    statement();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:380:9: ^( WHILE ^( CONDITION expression ) statement )
                    {
                    match(input,WHILE,FOLLOW_WHILE_in_statement1393); 

                    match(input, Token.DOWN, null); 
                    match(input,CONDITION,FOLLOW_CONDITION_in_statement1396); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_statement1398);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    pushFollow(FOLLOW_statement_in_statement1401);
                    statement();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:381:9: ^( DOWHILE ^( CONDITION expression ) statement )
                    {
                    match(input,DOWHILE,FOLLOW_DOWHILE_in_statement1413); 

                    match(input, Token.DOWN, null); 
                    match(input,CONDITION,FOLLOW_CONDITION_in_statement1416); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_statement1418);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    pushFollow(FOLLOW_statement_in_statement1421);
                    statement();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:382:9: ^( RETURN ( expression )? )
                    {
                    match(input,RETURN,FOLLOW_RETURN_in_statement1433); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:382:18: ( expression )?
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==METHODCALL||(LA29_0>=FIELDACCESS && LA29_0<=DOTCLASS)||(LA29_0>=PREINC && LA29_0<=CAST)||LA29_0==IDENTIFIER||LA29_0==THIS||(LA29_0>=INTLITERAL && LA29_0<=NULLLITERAL)||(LA29_0>=INSTANCEOF && LA29_0<=NEW)||(LA29_0>=EQ && LA29_0<=SLASH)||(LA29_0>=98 && LA29_0<=102)||LA29_0==105) ) {
                            alt29=1;
                        }
                        switch (alt29) {
                            case 1 :
                                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:382:18: expression
                                {
                                pushFollow(FOLLOW_expression_in_statement1435);
                                expression();

                                state._fsp--;


                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }

                    }
                    break;
                case 7 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:383:9: ^( STMT statementExpression )
                    {
                    match(input,STMT,FOLLOW_STMT_in_statement1449); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_statementExpression_in_statement1451);
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


    // $ANTLR start "elseStmt"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:386:1: elseStmt : ^( ELSE statement ) ;
    public final void elseStmt() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:387:5: ( ^( ELSE statement ) )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:387:7: ^( ELSE statement )
            {
            match(input,ELSE,FOLLOW_ELSE_in_elseStmt1474); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_statement_in_elseStmt1476);
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:390:1: forInit : ( localVariableDeclaration | expressionList );
    public final void forInit() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:391:5: ( localVariableDeclaration | expressionList )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==VARDECL) ) {
                alt31=1;
            }
            else if ( (LA31_0==METHODCALL||(LA31_0>=FIELDACCESS && LA31_0<=DOTCLASS)||(LA31_0>=PREINC && LA31_0<=CAST)||LA31_0==IDENTIFIER||LA31_0==THIS||(LA31_0>=INTLITERAL && LA31_0<=NULLLITERAL)||(LA31_0>=INSTANCEOF && LA31_0<=NEW)||(LA31_0>=EQ && LA31_0<=SLASH)||(LA31_0>=98 && LA31_0<=102)||LA31_0==105) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:391:9: localVariableDeclaration
                    {
                    pushFollow(FOLLOW_localVariableDeclaration_in_forInit1496);
                    localVariableDeclaration();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:392:9: expressionList
                    {
                    pushFollow(FOLLOW_expressionList_in_forInit1506);
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:395:1: forUpdate : expressionList ;
    public final void forUpdate() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:396:5: ( expressionList )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:396:9: expressionList
            {
            pushFollow(FOLLOW_expressionList_in_forUpdate1525);
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:403:1: expressionList returns [ArrayList<Type> types] : ( expression )+ ;
    public final ArrayList<Type> expressionList() throws RecognitionException {
        ArrayList<Type> types = null;

        JaWalker.expression_return expression19 = null;



        	types = new ArrayList<Type>();

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:407:5: ( ( expression )+ )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:407:9: ( expression )+
            {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:407:9: ( expression )+
            int cnt32=0;
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==METHODCALL||(LA32_0>=FIELDACCESS && LA32_0<=DOTCLASS)||(LA32_0>=PREINC && LA32_0<=CAST)||LA32_0==IDENTIFIER||LA32_0==THIS||(LA32_0>=INTLITERAL && LA32_0<=NULLLITERAL)||(LA32_0>=INSTANCEOF && LA32_0<=NEW)||(LA32_0>=EQ && LA32_0<=SLASH)||(LA32_0>=98 && LA32_0<=102)||LA32_0==105) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:407:10: expression
            	    {
            	    pushFollow(FOLLOW_expression_in_expressionList1560);
            	    expression19=expression();

            	    state._fsp--;

            	     types.add((expression19!=null?expression19.t:null)); 

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:410:1: statementExpression returns [Type t] : expression ;
    public final Type statementExpression() throws RecognitionException {
        Type t = null;

        JaWalker.expression_return expression20 = null;


        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:411:5: ( expression )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:411:9: expression
            {
            pushFollow(FOLLOW_expression_in_statementExpression1587);
            expression20=expression();

            state._fsp--;

             t = (expression20!=null?expression20.t:null); 

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
    // $ANTLR end "statementExpression"

    public static class expression_return extends TreeRuleReturnScope {
        public Type t;
    };

    // $ANTLR start "expression"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:414:1: expression returns [Type t] : ( ^( EQ e1= expression e2= expression ) | ^( PLUS e1= expression e2= expression ) | ^( MINUS e1= expression e2= expression ) | ^( STAR e1= expression e2= expression ) | ^( SLASH e1= expression e2= expression ) | ^(mod= '%' e1= expression e2= expression ) | ^(or= '||' e1= expression e2= expression ) | ^(and= '&&' e1= expression e2= expression ) | ^(eq= '==' e1= expression e2= expression ) | ^(nq= '!=' e1= expression e2= expression ) | ^( INSTANCEOF e= expression type ) | ^( COMPAREOP e1= expression e2= expression ) | ^(op= ( UNARYPLUS | UNARYMINUS | PREINC | PREDEC ) e= expression ) | ^(op= '!' e= expression ) | ^( CAST pt= primitiveType e= expression ) | ^( CAST npt= nonPrimitiveType e= expression ) | ^( NEW creator ) | ^(op= ( POSTINC | POSTDEC ) (sp= selector | sp= primary ) ) | selector | primary );
    public final JaWalker.expression_return expression() throws RecognitionException {
        JaWalker.expression_return retval = new JaWalker.expression_return();
        retval.start = input.LT(1);

        CommonTree mod=null;
        CommonTree or=null;
        CommonTree and=null;
        CommonTree eq=null;
        CommonTree nq=null;
        CommonTree op=null;
        CommonTree EQ21=null;
        CommonTree PLUS22=null;
        CommonTree MINUS23=null;
        CommonTree STAR24=null;
        CommonTree SLASH25=null;
        CommonTree INSTANCEOF27=null;
        CommonTree COMPAREOP28=null;
        CommonTree CAST29=null;
        CommonTree CAST30=null;
        JaWalker.expression_return e1 = null;

        JaWalker.expression_return e2 = null;

        JaWalker.expression_return e = null;

        BasicType pt = null;

        ComplexType npt = null;

        Type sp = null;

        Type type26 = null;

        Type creator31 = null;

        Type selector32 = null;

        Type primary33 = null;


        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:415:5: ( ^( EQ e1= expression e2= expression ) | ^( PLUS e1= expression e2= expression ) | ^( MINUS e1= expression e2= expression ) | ^( STAR e1= expression e2= expression ) | ^( SLASH e1= expression e2= expression ) | ^(mod= '%' e1= expression e2= expression ) | ^(or= '||' e1= expression e2= expression ) | ^(and= '&&' e1= expression e2= expression ) | ^(eq= '==' e1= expression e2= expression ) | ^(nq= '!=' e1= expression e2= expression ) | ^( INSTANCEOF e= expression type ) | ^( COMPAREOP e1= expression e2= expression ) | ^(op= ( UNARYPLUS | UNARYMINUS | PREINC | PREDEC ) e= expression ) | ^(op= '!' e= expression ) | ^( CAST pt= primitiveType e= expression ) | ^( CAST npt= nonPrimitiveType e= expression ) | ^( NEW creator ) | ^(op= ( POSTINC | POSTDEC ) (sp= selector | sp= primary ) ) | selector | primary )
            int alt34=20;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:415:9: ^( EQ e1= expression e2= expression )
                    {
                    EQ21=(CommonTree)match(input,EQ,FOLLOW_EQ_in_expression1614); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1618);
                    e1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1622);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck((e1!=null?e1.t:null), (e2!=null?e2.t:null))) {
                    	  	retval.t = getVariableType((e1!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(e1.start),
                      input.getTreeAdaptor().getTokenStopIndex(e1.start))):null));
                    	    	if (retval.t == null) 
                    	    		errorLog.add(new UnexpectedTypeException("variable", "value", (EQ21!=null?EQ21.getLine():0), (EQ21!=null?EQ21.getCharPositionInLine():0)));
                    	    	else
                    	    	  	retval.t = assignOperation(EQ21, (e1!=null?e1.t:null), (e2!=null?e2.t:null));
                    	  } 
                        	

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:424:7: ^( PLUS e1= expression e2= expression )
                    {
                    PLUS22=(CommonTree)match(input,PLUS,FOLLOW_PLUS_in_expression1640); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1647);
                    e1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1651);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck((e1!=null?e1.t:null), (e2!=null?e2.t:null))) retval.t = plusOperation(PLUS22, (e1!=null?e1.t:null), (e2!=null?e2.t:null)); 

                    }
                    break;
                case 3 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:425:7: ^( MINUS e1= expression e2= expression )
                    {
                    MINUS23=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_expression1663); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1669);
                    e1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1673);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck((e1!=null?e1.t:null), (e2!=null?e2.t:null))) retval.t = arithmeticOperation(MINUS23, (e1!=null?e1.t:null), (e2!=null?e2.t:null)); 

                    }
                    break;
                case 4 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:426:7: ^( STAR e1= expression e2= expression )
                    {
                    STAR24=(CommonTree)match(input,STAR,FOLLOW_STAR_in_expression1685); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1692);
                    e1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1696);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck((e1!=null?e1.t:null), (e2!=null?e2.t:null))) retval.t = arithmeticOperation(STAR24,  (e1!=null?e1.t:null), (e2!=null?e2.t:null)); 

                    }
                    break;
                case 5 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:427:7: ^( SLASH e1= expression e2= expression )
                    {
                    SLASH25=(CommonTree)match(input,SLASH,FOLLOW_SLASH_in_expression1708); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1714);
                    e1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1718);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck((e1!=null?e1.t:null), (e2!=null?e2.t:null))) retval.t = arithmeticOperation(SLASH25, (e1!=null?e1.t:null), (e2!=null?e2.t:null)); 

                    }
                    break;
                case 6 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:428:9: ^(mod= '%' e1= expression e2= expression )
                    {
                    mod=(CommonTree)match(input,102,FOLLOW_102_in_expression1734); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1738);
                    e1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1742);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck((e1!=null?e1.t:null), (e2!=null?e2.t:null))) retval.t = arithmeticOperation(mod,   (e1!=null?e1.t:null), (e2!=null?e2.t:null)); 

                    }
                    break;
                case 7 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:429:9: ^(or= '||' e1= expression e2= expression )
                    {
                    or=(CommonTree)match(input,98,FOLLOW_98_in_expression1758); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1763);
                    e1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1767);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck((e1!=null?e1.t:null), (e2!=null?e2.t:null))) retval.t = booleanOperation(or,  (e1!=null?e1.t:null), (e2!=null?e2.t:null)); 

                    }
                    break;
                case 8 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:430:9: ^(and= '&&' e1= expression e2= expression )
                    {
                    and=(CommonTree)match(input,99,FOLLOW_99_in_expression1783); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1787);
                    e1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1791);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck((e1!=null?e1.t:null), (e2!=null?e2.t:null))) retval.t = booleanOperation(and, (e1!=null?e1.t:null), (e2!=null?e2.t:null)); 

                    }
                    break;
                case 9 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:431:9: ^(eq= '==' e1= expression e2= expression )
                    {
                    eq=(CommonTree)match(input,100,FOLLOW_100_in_expression1807); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1812);
                    e1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1816);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck((e1!=null?e1.t:null), (e2!=null?e2.t:null))) retval.t = booleanOperation(eq,  (e1!=null?e1.t:null), (e2!=null?e2.t:null)); 

                    }
                    break;
                case 10 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:432:9: ^(nq= '!=' e1= expression e2= expression )
                    {
                    nq=(CommonTree)match(input,101,FOLLOW_101_in_expression1832); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1837);
                    e1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1841);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck((e1!=null?e1.t:null), (e2!=null?e2.t:null))) retval.t = booleanOperation(nq,  (e1!=null?e1.t:null), (e2!=null?e2.t:null)); 

                    }
                    break;
                case 11 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:433:7: ^( INSTANCEOF e= expression type )
                    {
                    INSTANCEOF27=(CommonTree)match(input,INSTANCEOF,FOLLOW_INSTANCEOF_in_expression1853); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1857);
                    e=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_type_in_expression1859);
                    type26=type();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck((e!=null?e.t:null), type26)) { 
                    	          if ( !((e!=null?e.t:null).isComplexType() || (e!=null?e.t:null).isNull()) ) errorLog.add(new UnexpectedTypeException("reference", (e!=null?e.t:null).toString(), (INSTANCEOF27!=null?INSTANCEOF27.getLine():0), (INSTANCEOF27!=null?INSTANCEOF27.getCharPositionInLine():0)));
                    	          if (!type26.isComplexType()) errorLog.add(new UnexpectedTypeException("class or array", type26.toString(), (INSTANCEOF27!=null?INSTANCEOF27.getLine():0), (INSTANCEOF27!=null?INSTANCEOF27.getCharPositionInLine():0)));
                    	          if (!(e!=null?e.t:null).isCastableTo(type26)) errorLog.add(new InconvertibleTypesException(type26.toString(), (e!=null?e.t:null).toString(), (INSTANCEOF27!=null?INSTANCEOF27.getLine():0), (INSTANCEOF27!=null?INSTANCEOF27.getCharPositionInLine():0)));
                    	          retval.t = BasicType.BOOLEAN;
                              } 
                            

                    }
                    break;
                case 12 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:441:7: ^( COMPAREOP e1= expression e2= expression )
                    {
                    COMPAREOP28=(CommonTree)match(input,COMPAREOP,FOLLOW_COMPAREOP_in_expression1879); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1883);
                    e1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1887);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck((e1!=null?e1.t:null), (e2!=null?e2.t:null))) { 
                    	    	  if ( !((e1!=null?e1.t:null).isNumeric() && (e2!=null?e2.t:null).isNumeric()) ) errorLog.add(new CannotBeAppliedToException((COMPAREOP28!=null?COMPAREOP28.getText():null), (e1!=null?e1.t:null).toString(), (e2!=null?e2.t:null).toString(), (COMPAREOP28!=null?COMPAREOP28.getLine():0), (COMPAREOP28!=null?COMPAREOP28.getCharPositionInLine():0)));
                    	    	  retval.t = BasicType.BOOLEAN;
                        	  } 
                        	

                    }
                    break;
                case 13 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:447:9: ^(op= ( UNARYPLUS | UNARYMINUS | PREINC | PREDEC ) e= expression )
                    {
                    op=(CommonTree)input.LT(1);
                    if ( input.LA(1)==PREINC||input.LA(1)==PREDEC||(input.LA(1)>=UNARYPLUS && input.LA(1)<=UNARYMINUS) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1925);
                    e=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck((e!=null?e.t:null))) { 
                    	          if (!(e!=null?e.t:null).isNumeric()) errorLog.add(new CannotBeAppliedToException((op!=null?op.getText():null), (e!=null?e.t:null).toString(), "", (op!=null?op.getLine():0), (op!=null?op.getCharPositionInLine():0)));
                    	    	  retval.t = (e!=null?e.t:null);
                        	  }
                        	

                    }
                    break;
                case 14 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:456:7: ^(op= '!' e= expression )
                    {
                    op=(CommonTree)match(input,105,FOLLOW_105_in_expression1963); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1967);
                    e=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck((e!=null?e.t:null))) {
                    	    	  if (!((e!=null?e.t:null) == BasicType.BOOLEAN)) errorLog.add(new CannotBeAppliedToException((op!=null?op.getText():null), (e!=null?e.t:null).toString(), "", (op!=null?op.getLine():0), (op!=null?op.getCharPositionInLine():0)));
                    	    	  retval.t = BasicType.BOOLEAN;
                        	  }
                        	

                    }
                    break;
                case 15 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:462:9: ^( CAST pt= primitiveType e= expression )
                    {
                    CAST29=(CommonTree)match(input,CAST,FOLLOW_CAST_in_expression1986); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_primitiveType_in_expression1990);
                    pt=primitiveType();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1994);
                    e=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck(pt, (e!=null?e.t:null))) {
                    	    	  if (!(e!=null?e.t:null).isCastableTo(pt)) errorLog.add(new InconvertibleTypesException(pt.toString(), (e!=null?e.t:null).toString(), (CAST29!=null?CAST29.getLine():0), (CAST29!=null?CAST29.getCharPositionInLine():0)));
                    	    	  retval.t = pt;
                        	  }
                        	

                    }
                    break;
                case 16 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:468:9: ^( CAST npt= nonPrimitiveType e= expression )
                    {
                    CAST30=(CommonTree)match(input,CAST,FOLLOW_CAST_in_expression2013); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_nonPrimitiveType_in_expression2017);
                    npt=nonPrimitiveType();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression2021);
                    e=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck(npt, (e!=null?e.t:null))) {
                    	    	  if (!(e!=null?e.t:null).isCastableTo(npt)) errorLog.add(new InconvertibleTypesException(npt.toString(), (e!=null?e.t:null).toString(), (CAST30!=null?CAST30.getLine():0), (CAST30!=null?CAST30.getCharPositionInLine():0)));
                    	    	  retval.t = npt;
                        	  }
                        	

                    }
                    break;
                case 17 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:474:9: ^( NEW creator )
                    {
                    match(input,NEW,FOLLOW_NEW_in_expression2040); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_creator_in_expression2042);
                    creator31=creator();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     retval.t = creator31; 

                    }
                    break;
                case 18 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:475:7: ^(op= ( POSTINC | POSTDEC ) (sp= selector | sp= primary ) )
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
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:475:32: (sp= selector | sp= primary )
                    int alt33=2;
                    switch ( input.LA(1) ) {
                    case FIELDACCESS:
                        {
                        int LA33_1 = input.LA(2);

                        if ( (LA33_1==DOWN) ) {
                            int LA33_5 = input.LA(3);

                            if ( (LA33_5==SUPER) ) {
                                alt33=2;
                            }
                            else if ( (LA33_5==METHODCALL||(LA33_5>=FIELDACCESS && LA33_5<=DOTCLASS)||(LA33_5>=PREINC && LA33_5<=CAST)||LA33_5==IDENTIFIER||LA33_5==THIS||(LA33_5>=INTLITERAL && LA33_5<=NULLLITERAL)||(LA33_5>=INSTANCEOF && LA33_5<=NEW)||(LA33_5>=EQ && LA33_5<=SLASH)||(LA33_5>=98 && LA33_5<=102)||LA33_5==105) ) {
                                alt33=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 33, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 33, 1, input);

                            throw nvae;
                        }
                        }
                        break;
                    case METHODCALL:
                        {
                        int LA33_2 = input.LA(2);

                        if ( (LA33_2==DOWN) ) {
                            int LA33_6 = input.LA(3);

                            if ( (LA33_6==SUPER) ) {
                                alt33=2;
                            }
                            else if ( (LA33_6==METHODCALL||(LA33_6>=FIELDACCESS && LA33_6<=DOTCLASS)||(LA33_6>=PREINC && LA33_6<=CAST)||LA33_6==IDENTIFIER||LA33_6==THIS||(LA33_6>=INTLITERAL && LA33_6<=NULLLITERAL)||(LA33_6>=INSTANCEOF && LA33_6<=NEW)||(LA33_6>=EQ && LA33_6<=SLASH)||(LA33_6>=98 && LA33_6<=102)||LA33_6==105) ) {
                                alt33=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 33, 6, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 33, 2, input);

                            throw nvae;
                        }
                        }
                        break;
                    case ARRAYACCESS:
                        {
                        alt33=1;
                        }
                        break;
                    case DOTCLASS:
                    case IDENTIFIER:
                    case THIS:
                    case INTLITERAL:
                    case LONGLITERAL:
                    case FLOATLITERAL:
                    case DOUBLELITERAL:
                    case CHARLITERAL:
                    case STRINGLITERAL:
                    case BOOLEANLITERAL:
                    case NULLLITERAL:
                        {
                        alt33=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 0, input);

                        throw nvae;
                    }

                    switch (alt33) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:475:33: sp= selector
                            {
                            pushFollow(FOLLOW_selector_in_expression2067);
                            sp=selector();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:475:47: sp= primary
                            {
                            pushFollow(FOLLOW_primary_in_expression2073);
                            sp=primary();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                     if (!sp.isNumeric()) {
                        	  	throw new CannotBeAppliedToException((op!=null?op.getText():null), sp.toString(), "", (op!=null?op.getLine():0), (op!=null?op.getCharPositionInLine():0));
                        	  }
                        	  retval.t = sp;
                        	

                    }
                    break;
                case 19 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:482:9: selector
                    {
                    pushFollow(FOLLOW_selector_in_expression2098);
                    selector32=selector();

                    state._fsp--;

                     retval.t = selector32; 

                    }
                    break;
                case 20 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:483:9: primary
                    {
                    pushFollow(FOLLOW_primary_in_expression2110);
                    primary33=primary();

                    state._fsp--;

                     retval.t = primary33; 

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


    // $ANTLR start "primary"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:486:1: primary returns [Type t] : ( THIS | superMemberAccess | literal | IDENTIFIER | ^( DOTCLASS ^( ARRAYTYPE type ) ) | ^( DOTCLASS IDENTIFIER ) | ^( DOTCLASS primitiveType ) | ^( DOTCLASS VOID ) );
    public final Type primary() throws RecognitionException {
        Type t = null;

        CommonTree IDENTIFIER36=null;
        Type superMemberAccess34 = null;

        Type literal35 = null;


        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:488:5: ( THIS | superMemberAccess | literal | IDENTIFIER | ^( DOTCLASS ^( ARRAYTYPE type ) ) | ^( DOTCLASS IDENTIFIER ) | ^( DOTCLASS primitiveType ) | ^( DOTCLASS VOID ) )
            int alt35=8;
            alt35 = dfa35.predict(input);
            switch (alt35) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:488:7: THIS
                    {
                    match(input,THIS,FOLLOW_THIS_in_primary2151); 
                     t = rt; 

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:489:9: superMemberAccess
                    {
                    pushFollow(FOLLOW_superMemberAccess_in_primary2163);
                    superMemberAccess34=superMemberAccess();

                    state._fsp--;

                     t = superMemberAccess34; 

                    }
                    break;
                case 3 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:490:9: literal
                    {
                    pushFollow(FOLLOW_literal_in_primary2175);
                    literal35=literal();

                    state._fsp--;

                     t = literal35; 

                    }
                    break;
                case 4 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:491:9: IDENTIFIER
                    {
                    IDENTIFIER36=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary2187); 
                     t = getVariableType((IDENTIFIER36!=null?IDENTIFIER36.getText():null)); 
                        		     if (t == null) errorLog.add(new CannotFindSymbolException(("variable " + (IDENTIFIER36!=null?IDENTIFIER36.getText():null)), getMethodSignature(), (IDENTIFIER36!=null?IDENTIFIER36.getLine():0), (IDENTIFIER36!=null?IDENTIFIER36.getCharPositionInLine():0)));
                        		   

                    }
                    break;
                case 5 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:495:9: ^( DOTCLASS ^( ARRAYTYPE type ) )
                    {
                    match(input,DOTCLASS,FOLLOW_DOTCLASS_in_primary2205); 

                    match(input, Token.DOWN, null); 
                    match(input,ARRAYTYPE,FOLLOW_ARRAYTYPE_in_primary2208); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_in_primary2210);
                    type();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 
                     t = ReferenceType.CLASS; 

                    }
                    break;
                case 6 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:496:7: ^( DOTCLASS IDENTIFIER )
                    {
                    match(input,DOTCLASS,FOLLOW_DOTCLASS_in_primary2225); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary2227); 

                    match(input, Token.UP, null); 
                     t = ReferenceType.CLASS; 

                    }
                    break;
                case 7 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:497:9: ^( DOTCLASS primitiveType )
                    {
                    match(input,DOTCLASS,FOLLOW_DOTCLASS_in_primary2248); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_primitiveType_in_primary2250);
                    primitiveType();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     t = ReferenceType.CLASS; 

                    }
                    break;
                case 8 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:498:9: ^( DOTCLASS VOID )
                    {
                    match(input,DOTCLASS,FOLLOW_DOTCLASS_in_primary2268); 

                    match(input, Token.DOWN, null); 
                    match(input,VOID,FOLLOW_VOID_in_primary2270); 

                    match(input, Token.UP, null); 
                     t = ReferenceType.CLASS; 

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
    // $ANTLR end "primary"


    // $ANTLR start "selector"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:501:1: selector returns [Type t] : ( ^( FIELDACCESS expression IDENTIFIER ) | ^( METHODCALL expression IDENTIFIER ( arguments )? ) | ^( ARRAYACCESS e1= expression e2= expression ) );
    public final Type selector() throws RecognitionException {
        Type t = null;

        CommonTree IDENTIFIER38=null;
        CommonTree IDENTIFIER41=null;
        CommonTree ARRAYACCESS42=null;
        JaWalker.expression_return e1 = null;

        JaWalker.expression_return e2 = null;

        JaWalker.expression_return expression37 = null;

        JaWalker.expression_return expression39 = null;

        JaWalker.arguments_return arguments40 = null;


        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:502:5: ( ^( FIELDACCESS expression IDENTIFIER ) | ^( METHODCALL expression IDENTIFIER ( arguments )? ) | ^( ARRAYACCESS e1= expression e2= expression ) )
            int alt37=3;
            switch ( input.LA(1) ) {
            case FIELDACCESS:
                {
                alt37=1;
                }
                break;
            case METHODCALL:
                {
                alt37=2;
                }
                break;
            case ARRAYACCESS:
                {
                alt37=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:502:9: ^( FIELDACCESS expression IDENTIFIER )
                    {
                    match(input,FIELDACCESS,FOLLOW_FIELDACCESS_in_selector2314); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_selector2316);
                    expression37=expression();

                    state._fsp--;

                    IDENTIFIER38=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_selector2318); 

                    match(input, Token.UP, null); 
                     if(ruleTypeCheck((expression37!=null?expression37.t:null))) {
                    	    	  if (!(expression37!=null?expression37.t:null).isReference())
                    	    	  	errorLog.add(new CannotBeDereferencedException((expression37!=null?expression37.t:null).toString(), (IDENTIFIER38!=null?IDENTIFIER38.getLine():0), (IDENTIFIER38!=null?IDENTIFIER38.getCharPositionInLine():0))); 
                    	    	  ReferenceType expt = (ReferenceType)(expression37!=null?expression37.t:null);
                    	    	  boolean isSameClass = (expt.getName().equals(rt.getName())); 
                    	    	  t = expt.getField(isSameClass, (IDENTIFIER38!=null?IDENTIFIER38.getText():null));
                    		  if (t == null) errorLog.add(new CannotFindSymbolException(("field " + (IDENTIFIER38!=null?IDENTIFIER38.getText():null)), expt.getName(), (IDENTIFIER38!=null?IDENTIFIER38.getLine():0), (IDENTIFIER38!=null?IDENTIFIER38.getCharPositionInLine():0)));
                        	  }
                        	

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:512:7: ^( METHODCALL expression IDENTIFIER ( arguments )? )
                    {
                    match(input,METHODCALL,FOLLOW_METHODCALL_in_selector2337); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_selector2339);
                    expression39=expression();

                    state._fsp--;

                    IDENTIFIER41=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_selector2341); 
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:512:42: ( arguments )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==ARGUMENTS) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:512:42: arguments
                            {
                            pushFollow(FOLLOW_arguments_in_selector2343);
                            arguments40=arguments();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                     Type[] args;
                              // Se ci sono argomenti, bisogna richiamare ruleTypeCheck su di essi
                              if( ruleTypeCheck((expression39!=null?expression39.t:null)) && ((arguments40!=null?arguments40.types:null) == null || ruleTypeCheck((arguments40!=null?arguments40.types:null).toArray(args = new Type[(arguments40!=null?arguments40.types:null).size()]))) ) {
                    	    	  if (!(expression39!=null?expression39.t:null).isReference())
                    	    	  	errorLog.add(new CannotBeDereferencedException((expression39!=null?expression39.t:null).toString(), (IDENTIFIER41!=null?IDENTIFIER41.getLine():0), (IDENTIFIER41!=null?IDENTIFIER41.getCharPositionInLine():0))); 
                    	    	  ReferenceType expt = (ReferenceType)(expression39!=null?expression39.t:null);
                    	    	  ArrayList<Type> argTypes = (arguments40!=null?arguments40.types:null); //((arguments40!=null?((CommonTree)arguments40.tree):null) == null)?null:(arguments40!=null?arguments40.types:null);
                    	    	  try {
                    		    	boolean isSameClass = (expt.getName().equals(rt.getName())); 
                    		    	t = expt.bindMethod(isSameClass, (IDENTIFIER41!=null?IDENTIFIER41.getText():null), argTypes);
                    	    	  } catch (EarlyBindingException ex) {
                    	    	  	errorLog.add(new CannotFindSymbolException(("method " + (IDENTIFIER41!=null?IDENTIFIER41.getText():null) + '(' + printArguments(argTypes) + ')'), expt.getName(), (IDENTIFIER41!=null?IDENTIFIER41.getLine():0), (IDENTIFIER41!=null?IDENTIFIER41.getCharPositionInLine():0)));
                    	    	  }
                        	  }
                        	

                    }
                    break;
                case 3 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:528:9: ^( ARRAYACCESS e1= expression e2= expression )
                    {
                    ARRAYACCESS42=(CommonTree)match(input,ARRAYACCESS,FOLLOW_ARRAYACCESS_in_selector2366); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_selector2370);
                    e1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_selector2374);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if (ruleTypeCheck((e1!=null?e1.t:null), (e2!=null?e2.t:null))) {
                    	    	  if (!(e1!=null?e1.t:null).isArray()) errorLog.add(new ArrayRequiredException((e1!=null?e1.t:null).toString(), (ARRAYACCESS42!=null?ARRAYACCESS42.getLine():0), (ARRAYACCESS42!=null?ARRAYACCESS42.getCharPositionInLine():0)));
                    	    	  arrayExprCheck(ARRAYACCESS42, (e2!=null?e2.t:null));
                    	    	  t = ((ArrayType)(e1!=null?e1.t:null)).getHostType(); 
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
    // $ANTLR end "selector"


    // $ANTLR start "creator"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:537:1: creator returns [Type t] : (acr= arrayCreatorRest ( arrayInitializer[$acr.t.getHostType()] )? | createdName ( classCreatorRest )? );
    public final Type creator() throws RecognitionException {
        Type t = null;

        ArrayType acr = null;


        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:538:5: (acr= arrayCreatorRest ( arrayInitializer[$acr.t.getHostType()] )? | createdName ( classCreatorRest )? )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==ARRAYTYPE) ) {
                alt40=1;
            }
            else if ( (LA40_0==IDENTIFIER||(LA40_0>=CHAR && LA40_0<=BOOLEAN)) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:538:10: acr= arrayCreatorRest ( arrayInitializer[$acr.t.getHostType()] )?
                    {
                    pushFollow(FOLLOW_arrayCreatorRest_in_creator2409);
                    acr=arrayCreatorRest();

                    state._fsp--;

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:538:31: ( arrayInitializer[$acr.t.getHostType()] )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==ARRAYINIT) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:538:31: arrayInitializer[$acr.t.getHostType()]
                            {
                            pushFollow(FOLLOW_arrayInitializer_in_creator2411);
                            arrayInitializer(acr.getHostType());

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:539:10: createdName ( classCreatorRest )?
                    {
                    pushFollow(FOLLOW_createdName_in_creator2424);
                    createdName();

                    state._fsp--;

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:539:22: ( classCreatorRest )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==ARGUMENTS) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:539:22: classCreatorRest
                            {
                            pushFollow(FOLLOW_classCreatorRest_in_creator2426);
                            classCreatorRest();

                            state._fsp--;


                            }
                            break;

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:543:1: createdName returns [Type t] : ( classType | primitiveType );
    public final Type createdName() throws RecognitionException {
        Type t = null;

        ReferenceType classType43 = null;

        BasicType primitiveType44 = null;


        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:544:5: ( classType | primitiveType )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==IDENTIFIER) ) {
                alt41=1;
            }
            else if ( ((LA41_0>=CHAR && LA41_0<=BOOLEAN)) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:544:9: classType
                    {
                    pushFollow(FOLLOW_classType_in_createdName2452);
                    classType43=classType();

                    state._fsp--;

                     t = classType43;      

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:545:9: primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_createdName2468);
                    primitiveType44=primitiveType();

                    state._fsp--;

                     t = primitiveType44; 

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:548:1: arrayCreatorRest returns [ArrayType t] : ( ^( ARRAYTYPE acr= arrayCreatorRest ) | ^( ARRAYTYPE createdName ) | ^( ARRAYTYPE e= expression acre= arrayCreatorRestExpr ) );
    public final ArrayType arrayCreatorRest() throws RecognitionException {
        ArrayType t = null;

        CommonTree ARRAYTYPE46=null;
        ArrayType acr = null;

        JaWalker.expression_return e = null;

        Type acre = null;

        Type createdName45 = null;


        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:549:5: ( ^( ARRAYTYPE acr= arrayCreatorRest ) | ^( ARRAYTYPE createdName ) | ^( ARRAYTYPE e= expression acre= arrayCreatorRestExpr ) )
            int alt42=3;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==ARRAYTYPE) ) {
                int LA42_1 = input.LA(2);

                if ( (LA42_1==DOWN) ) {
                    switch ( input.LA(3) ) {
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
                    case 98:
                    case 99:
                    case 100:
                    case 101:
                    case 102:
                    case 105:
                        {
                        alt42=3;
                        }
                        break;
                    case IDENTIFIER:
                        {
                        int LA42_4 = input.LA(4);

                        if ( (LA42_4==ARRAYTYPE||LA42_4==IDENTIFIER||(LA42_4>=CHAR && LA42_4<=BOOLEAN)) ) {
                            alt42=3;
                        }
                        else if ( (LA42_4==UP) ) {
                            alt42=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 42, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case ARRAYTYPE:
                        {
                        alt42=1;
                        }
                        break;
                    case CHAR:
                    case BYTE:
                    case SHORT:
                    case INT:
                    case LONG:
                    case FLOAT:
                    case DOUBLE:
                    case BOOLEAN:
                        {
                        alt42=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 42, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:549:8: ^( ARRAYTYPE acr= arrayCreatorRest )
                    {
                    match(input,ARRAYTYPE,FOLLOW_ARRAYTYPE_in_arrayCreatorRest2497); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_arrayCreatorRest_in_arrayCreatorRest2501);
                    acr=arrayCreatorRest();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if (ruleTypeCheck(acr)) t = (ArrayType)ParserHelper.createArrayType(acr, 1); 

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:551:7: ^( ARRAYTYPE createdName )
                    {
                    match(input,ARRAYTYPE,FOLLOW_ARRAYTYPE_in_arrayCreatorRest2521); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_createdName_in_arrayCreatorRest2523);
                    createdName45=createdName();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if (ruleTypeCheck(createdName45)) t = (ArrayType)ParserHelper.createArrayType(createdName45, 1); 

                    }
                    break;
                case 3 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:552:9: ^( ARRAYTYPE e= expression acre= arrayCreatorRestExpr )
                    {
                    ARRAYTYPE46=(CommonTree)match(input,ARRAYTYPE,FOLLOW_ARRAYTYPE_in_arrayCreatorRest2537); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_arrayCreatorRest2541);
                    e=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_arrayCreatorRestExpr_in_arrayCreatorRest2545);
                    acre=arrayCreatorRestExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if (ruleTypeCheck(acre)) t = (ArrayType)ParserHelper.createArrayType(acre, 1); 
                        	  if (ruleTypeCheck((e!=null?e.t:null))) arrayExprCheck(ARRAYTYPE46, (e!=null?e.t:null));
                           	

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


    // $ANTLR start "arrayCreatorRestExpr"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:558:1: arrayCreatorRestExpr returns [Type t] : ( ( ^( ARRAYTYPE e= expression acr= arrayCreatorRest ) ) | createdName );
    public final Type arrayCreatorRestExpr() throws RecognitionException {
        Type t = null;

        CommonTree ARRAYTYPE47=null;
        JaWalker.expression_return e = null;

        ArrayType acr = null;

        Type createdName48 = null;


        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:559:5: ( ( ^( ARRAYTYPE e= expression acr= arrayCreatorRest ) ) | createdName )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==ARRAYTYPE) ) {
                alt43=1;
            }
            else if ( (LA43_0==IDENTIFIER||(LA43_0>=CHAR && LA43_0<=BOOLEAN)) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:559:8: ( ^( ARRAYTYPE e= expression acr= arrayCreatorRest ) )
                    {
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:559:8: ( ^( ARRAYTYPE e= expression acr= arrayCreatorRest ) )
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:559:9: ^( ARRAYTYPE e= expression acr= arrayCreatorRest )
                    {
                    ARRAYTYPE47=(CommonTree)match(input,ARRAYTYPE,FOLLOW_ARRAYTYPE_in_arrayCreatorRestExpr2578); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_arrayCreatorRestExpr2582);
                    e=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_arrayCreatorRest_in_arrayCreatorRestExpr2586);
                    acr=arrayCreatorRest();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }

                     if (ruleTypeCheck(acr)) t = (ComplexType)ParserHelper.createArrayType(acr, 1); 
                        	 if (ruleTypeCheck((e!=null?e.t:null))) arrayExprCheck(ARRAYTYPE47, (e!=null?e.t:null));
                           

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:563:8: createdName
                    {
                    pushFollow(FOLLOW_createdName_in_arrayCreatorRestExpr2606);
                    createdName48=createdName();

                    state._fsp--;

                     if (ruleTypeCheck(createdName48)) t = createdName48; 

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
    // $ANTLR end "arrayCreatorRestExpr"


    // $ANTLR start "classCreatorRest"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:566:1: classCreatorRest returns [ArrayList<Type> types] : arguments ;
    public final ArrayList<Type> classCreatorRest() throws RecognitionException {
        ArrayList<Type> types = null;

        JaWalker.arguments_return arguments49 = null;


        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:567:5: ( arguments )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:567:9: arguments
            {
            pushFollow(FOLLOW_arguments_in_classCreatorRest2631);
            arguments49=arguments();

            state._fsp--;

             types = (arguments49!=null?arguments49.types:null); 

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:570:1: superMemberAccess returns [Type t] : ( ^( METHODCALL SUPER IDENTIFIER ( arguments )? ) | ^( FIELDACCESS SUPER IDENTIFIER ) );
    public final Type superMemberAccess() throws RecognitionException {
        Type t = null;

        CommonTree IDENTIFIER51=null;
        CommonTree IDENTIFIER52=null;
        JaWalker.arguments_return arguments50 = null;


        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:571:5: ( ^( METHODCALL SUPER IDENTIFIER ( arguments )? ) | ^( FIELDACCESS SUPER IDENTIFIER ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==METHODCALL) ) {
                alt45=1;
            }
            else if ( (LA45_0==FIELDACCESS) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:571:7: ^( METHODCALL SUPER IDENTIFIER ( arguments )? )
                    {
                    match(input,METHODCALL,FOLLOW_METHODCALL_in_superMemberAccess2663); 

                    match(input, Token.DOWN, null); 
                    match(input,SUPER,FOLLOW_SUPER_in_superMemberAccess2665); 
                    IDENTIFIER51=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_superMemberAccess2667); 
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:571:37: ( arguments )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==ARGUMENTS) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:571:37: arguments
                            {
                            pushFollow(FOLLOW_arguments_in_superMemberAccess2669);
                            arguments50=arguments();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                     if( (arguments50!=null?arguments50.types:null) == null || ruleTypeCheck((Type[])(arguments50!=null?arguments50.types:null).toArray()) ) {
                    	    	  try {
                    	          	t = rt.getSuperClass().bindMethod(false, (IDENTIFIER51!=null?IDENTIFIER51.getText():null), (arguments50!=null?arguments50.types:null));
                    		  } catch (EarlyBindingException ex) {
                    		   	errorLog.add(new CannotFindSymbolException(("method " + (IDENTIFIER51!=null?IDENTIFIER51.getText():null) + '(' + printArguments((arguments50!=null?arguments50.types:null)) + ')'), rt.getSuperClass().getName(), (IDENTIFIER51!=null?IDENTIFIER51.getLine():0), (IDENTIFIER51!=null?IDENTIFIER51.getCharPositionInLine():0)));
                    		  }
                    	  }
                        	

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:580:9: ^( FIELDACCESS SUPER IDENTIFIER )
                    {
                    match(input,FIELDACCESS,FOLLOW_FIELDACCESS_in_superMemberAccess2690); 

                    match(input, Token.DOWN, null); 
                    match(input,SUPER,FOLLOW_SUPER_in_superMemberAccess2692); 
                    IDENTIFIER52=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_superMemberAccess2694); 

                    match(input, Token.UP, null); 
                     t = rt.getSuperClass().getField(false, (IDENTIFIER52!=null?IDENTIFIER52.getText():null));
                    	  if (t == null) errorLog.add(new CannotFindSymbolException(("field " + (IDENTIFIER52!=null?IDENTIFIER52.getText():null)), rt.getSuperClass().getName(), (IDENTIFIER52!=null?IDENTIFIER52.getLine():0), (IDENTIFIER52!=null?IDENTIFIER52.getCharPositionInLine():0))); 
                    	

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:586:1: arguments returns [ArrayList<Type> types] : ^( ARGUMENTS expressionList ) ;
    public final JaWalker.arguments_return arguments() throws RecognitionException {
        JaWalker.arguments_return retval = new JaWalker.arguments_return();
        retval.start = input.LT(1);

        ArrayList<Type> expressionList53 = null;


        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:587:5: ( ^( ARGUMENTS expressionList ) )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:587:8: ^( ARGUMENTS expressionList )
            {
            match(input,ARGUMENTS,FOLLOW_ARGUMENTS_in_arguments2735); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expressionList_in_arguments2737);
            expressionList53=expressionList();

            state._fsp--;


            match(input, Token.UP, null); 
             retval.types = expressionList53; 

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

    // Delegated rules


    protected DFA34 dfa34 = new DFA34(this);
    protected DFA35 dfa35 = new DFA35(this);
    static final String DFA34_eotS =
        "\33\uffff";
    static final String DFA34_eofS =
        "\33\uffff";
    static final String DFA34_minS =
        "\1\4\16\uffff\1\2\2\uffff\2\2\2\uffff\1\11\2\4\2\uffff";
    static final String DFA34_maxS =
        "\1\151\16\uffff\1\2\2\uffff\2\2\2\uffff\1\60\2\151\2\uffff";
    static final String DFA34_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\uffff\1\21\1\22\2\uffff\1\23\1\24\3\uffff\1\20\1\17";
    static final String DFA34_specialS =
        "\33\uffff}>";
    static final String[] DFA34_transitionS = {
            "\1\23\1\uffff\1\22\1\24\1\25\23\uffff\1\15\1\21\1\15\1\21\2"+
            "\15\1\17\1\uffff\1\25\14\uffff\1\25\1\uffff\10\25\6\uffff\1"+
            "\13\1\14\1\20\13\uffff\1\1\1\2\1\3\1\4\1\5\16\uffff\1\7\1\10"+
            "\1\11\1\12\1\6\2\uffff\1\16",
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
            "\1\26",
            "",
            "",
            "\1\27",
            "\1\30",
            "",
            "",
            "\1\31\32\uffff\1\31\4\uffff\10\32",
            "\1\24\1\uffff\3\24\23\uffff\7\24\1\uffff\1\24\14\uffff\1\24"+
            "\1\25\10\24\6\uffff\3\24\13\uffff\5\24\16\uffff\5\24\2\uffff"+
            "\1\24",
            "\1\24\1\uffff\3\24\23\uffff\7\24\1\uffff\1\24\14\uffff\1\24"+
            "\1\25\10\24\6\uffff\3\24\13\uffff\5\24\16\uffff\5\24\2\uffff"+
            "\1\24",
            "",
            ""
    };

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "414:1: expression returns [Type t] : ( ^( EQ e1= expression e2= expression ) | ^( PLUS e1= expression e2= expression ) | ^( MINUS e1= expression e2= expression ) | ^( STAR e1= expression e2= expression ) | ^( SLASH e1= expression e2= expression ) | ^(mod= '%' e1= expression e2= expression ) | ^(or= '||' e1= expression e2= expression ) | ^(and= '&&' e1= expression e2= expression ) | ^(eq= '==' e1= expression e2= expression ) | ^(nq= '!=' e1= expression e2= expression ) | ^( INSTANCEOF e= expression type ) | ^( COMPAREOP e1= expression e2= expression ) | ^(op= ( UNARYPLUS | UNARYMINUS | PREINC | PREDEC ) e= expression ) | ^(op= '!' e= expression ) | ^( CAST pt= primitiveType e= expression ) | ^( CAST npt= nonPrimitiveType e= expression ) | ^( NEW creator ) | ^(op= ( POSTINC | POSTDEC ) (sp= selector | sp= primary ) ) | selector | primary );";
        }
    }
    static final String DFA35_eotS =
        "\13\uffff";
    static final String DFA35_eofS =
        "\13\uffff";
    static final String DFA35_minS =
        "\1\4\4\uffff\1\2\1\11\4\uffff";
    static final String DFA35_maxS =
        "\1\72\4\uffff\1\2\1\60\4\uffff";
    static final String DFA35_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\2\uffff\1\5\1\6\1\10\1\7";
    static final String DFA35_specialS =
        "\13\uffff}>";
    static final String[] DFA35_transitionS = {
            "\1\2\1\uffff\1\2\1\uffff\1\5\33\uffff\1\4\14\uffff\1\1\1\uffff"+
            "\10\3",
            "",
            "",
            "",
            "",
            "\1\6",
            "\1\7\32\uffff\1\10\2\uffff\1\11\1\uffff\10\12",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
    static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
    static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
    static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
    static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
    static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
    static final short[][] DFA35_transition;

    static {
        int numStates = DFA35_transitionS.length;
        DFA35_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
        }
    }

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = DFA35_eot;
            this.eof = DFA35_eof;
            this.min = DFA35_min;
            this.max = DFA35_max;
            this.accept = DFA35_accept;
            this.special = DFA35_special;
            this.transition = DFA35_transition;
        }
        public String getDescription() {
            return "486:1: primary returns [Type t] : ( THIS | superMemberAccess | literal | IDENTIFIER | ^( DOTCLASS ^( ARRAYTYPE type ) ) | ^( DOTCLASS IDENTIFIER ) | ^( DOTCLASS primitiveType ) | ^( DOTCLASS VOID ) );";
        }
    }
 

    public static final BitSet FOLLOW_classDeclaration_in_compilationUnit63 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_in_classDeclaration87 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classDeclaration89 = new BitSet(new long[]{0x0000001000001C08L});
    public static final BitSet FOLLOW_classType_in_classDeclaration93 = new BitSet(new long[]{0x0000000000001C08L});
    public static final BitSet FOLLOW_classBody_in_classDeclaration96 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_classBodyDeclaration_in_classBody121 = new BitSet(new long[]{0x0000000000001C02L});
    public static final BitSet FOLLOW_memberDeclaration_in_classBodyDeclaration141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldDeclaration_in_memberDeclaration164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodAndConstructorDeclaration_in_memberDeclaration172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_METHOD_in_methodAndConstructorDeclaration211 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifier_in_methodAndConstructorDeclaration213 = new BitSet(new long[]{0x0001FE1000000200L});
    public static final BitSet FOLLOW_type_in_methodAndConstructorDeclaration215 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_methodDeclaration_in_methodAndConstructorDeclaration218 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_METHOD_in_methodAndConstructorDeclaration233 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifier_in_methodAndConstructorDeclaration235 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_VOID_in_methodAndConstructorDeclaration237 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_methodAndConstructorDeclaration239 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_voidMethodDeclaratorRest_in_methodAndConstructorDeclaration243 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONSTR_in_methodAndConstructorDeclaration258 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifier_in_methodAndConstructorDeclaration260 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_methodAndConstructorDeclaration262 = new BitSet(new long[]{0x0000000000042008L});
    public static final BitSet FOLLOW_formalParameters_in_methodAndConstructorDeclaration266 = new BitSet(new long[]{0x0000000000040008L});
    public static final BitSet FOLLOW_constructorBody_in_methodAndConstructorDeclaration269 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_methodDeclaration300 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_formalParameters_in_methodDeclaration304 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_methodBody_in_methodDeclaration307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIELD_in_fieldDeclaration327 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifier_in_fieldDeclaration329 = new BitSet(new long[]{0x0001FE1000000200L});
    public static final BitSet FOLLOW_variableDeclarator_in_fieldDeclaration331 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_formalParameters_in_voidMethodDeclaratorRest354 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_methodBody_in_voidMethodDeclaratorRest357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_variableDeclarator380 = new BitSet(new long[]{0x07FA0017F80001D2L,0x0000027C000F800EL});
    public static final BitSet FOLLOW_variableInitializer_in_variableDeclarator385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_variableDeclaratorId415 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_variableDeclaratorId417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayInitializer_in_variableInitializer453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_variableInitializer472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAYINIT_in_arrayInitializer506 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableInitializer_in_arrayInitializer508 = new BitSet(new long[]{0x07FA0017F80001D8L,0x0000027C000F800EL});
    public static final BitSet FOLLOW_set_in_modifier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonPrimitiveType_in_type569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_type579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAYTYPE_in_nonPrimitiveType607 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_nonPrimitiveType_in_nonPrimitiveType611 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_classType_in_nonPrimitiveType624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAYTYPE_in_nonPrimitiveType658 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primitiveType_in_nonPrimitiveType660 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classType691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_primitiveType722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BYTE_in_primitiveType737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHORT_in_primitiveType752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_primitiveType766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_in_primitiveType782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_primitiveType797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_primitiveType811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_primitiveType824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FPARMS_in_formalParameters850 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_formalParameterDecls_in_formalParameters852 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FPARM_in_formalParameterDecls877 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_formalParameterDecls879 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_formalParameterDecls_in_formalParameterDecls884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MBODY_in_methodBody910 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_methodBody912 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CBODY_in_constructorBody971 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_explicitConstructorInvocation_in_constructorBody973 = new BitSet(new long[]{0xB800000002380008L});
    public static final BitSet FOLLOW_blockStatement_in_constructorBody976 = new BitSet(new long[]{0xB800000002380008L});
    public static final BitSet FOLLOW_CONSTRCALL_in_explicitConstructorInvocation998 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_THIS_in_explicitConstructorInvocation1000 = new BitSet(new long[]{0x0000000000004008L});
    public static final BitSet FOLLOW_arguments_in_explicitConstructorInvocation1003 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONSTRCALL_in_explicitConstructorInvocation1024 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SUPER_in_explicitConstructorInvocation1026 = new BitSet(new long[]{0x0000000000004008L});
    public static final BitSet FOLLOW_arguments_in_explicitConstructorInvocation1028 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INTLITERAL_in_literal1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONGLITERAL_in_literal1076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOATLITERAL_in_literal1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLELITERAL_in_literal1103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARLITERAL_in_literal1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_literal1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_literal1144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULLLITERAL_in_literal1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockStatement_in_block1197 = new BitSet(new long[]{0xB800000002380002L});
    public static final BitSet FOLLOW_localVariableDeclarationStatement_in_blockStatement1221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_blockStatement1232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localVariableDeclaration_in_localVariableDeclarationStatement1253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARDECL_in_localVariableDeclaration1271 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableDeclarator_in_localVariableDeclaration1273 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLOCK_in_statement1310 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_statement1312 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_in_statement1324 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CONDITION_in_statement1327 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement1329 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_THEN_in_statement1333 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_statement1335 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_elseStmt_in_statement1338 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FOR_in_statement1351 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INIT_in_statement1355 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_forInit_in_statement1357 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONDITION_in_statement1364 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement1366 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UPDATE_in_statement1373 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_forUpdate_in_statement1375 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_statement_in_statement1380 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WHILE_in_statement1393 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CONDITION_in_statement1396 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement1398 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_statement_in_statement1401 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DOWHILE_in_statement1413 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CONDITION_in_statement1416 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement1418 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_statement_in_statement1421 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RETURN_in_statement1433 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement1435 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STMT_in_statement1449 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statementExpression_in_statement1451 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ELSE_in_elseStmt1474 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_elseStmt1476 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_localVariableDeclaration_in_forInit1496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionList_in_forInit1506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionList_in_forUpdate1525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionList1560 = new BitSet(new long[]{0x07FA0017F80001D2L,0x0000027C000F800EL});
    public static final BitSet FOLLOW_expression_in_statementExpression1587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_expression1614 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1618 = new BitSet(new long[]{0x07FA0017F80001D0L,0x0000027C000F800EL});
    public static final BitSet FOLLOW_expression_in_expression1622 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_in_expression1640 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1647 = new BitSet(new long[]{0x07FA0017F80001D0L,0x0000027C000F800EL});
    public static final BitSet FOLLOW_expression_in_expression1651 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_expression1663 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1669 = new BitSet(new long[]{0x07FA0017F80001D0L,0x0000027C000F800EL});
    public static final BitSet FOLLOW_expression_in_expression1673 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STAR_in_expression1685 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1692 = new BitSet(new long[]{0x07FA0017F80001D0L,0x0000027C000F800EL});
    public static final BitSet FOLLOW_expression_in_expression1696 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SLASH_in_expression1708 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1714 = new BitSet(new long[]{0x07FA0017F80001D0L,0x0000027C000F800EL});
    public static final BitSet FOLLOW_expression_in_expression1718 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_102_in_expression1734 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1738 = new BitSet(new long[]{0x07FA0017F80001D0L,0x0000027C000F800EL});
    public static final BitSet FOLLOW_expression_in_expression1742 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_98_in_expression1758 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1763 = new BitSet(new long[]{0x07FA0017F80001D0L,0x0000027C000F800EL});
    public static final BitSet FOLLOW_expression_in_expression1767 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_99_in_expression1783 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1787 = new BitSet(new long[]{0x07FA0017F80001D0L,0x0000027C000F800EL});
    public static final BitSet FOLLOW_expression_in_expression1791 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_100_in_expression1807 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1812 = new BitSet(new long[]{0x07FA0017F80001D0L,0x0000027C000F800EL});
    public static final BitSet FOLLOW_expression_in_expression1816 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_101_in_expression1832 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1837 = new BitSet(new long[]{0x07FA0017F80001D0L,0x0000027C000F800EL});
    public static final BitSet FOLLOW_expression_in_expression1841 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INSTANCEOF_in_expression1853 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1857 = new BitSet(new long[]{0x0001FE1000000200L});
    public static final BitSet FOLLOW_type_in_expression1859 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COMPAREOP_in_expression1879 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1883 = new BitSet(new long[]{0x07FA0017F80001D0L,0x0000027C000F800EL});
    public static final BitSet FOLLOW_expression_in_expression1887 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_expression1909 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1925 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_105_in_expression1963 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1967 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CAST_in_expression1986 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primitiveType_in_expression1990 = new BitSet(new long[]{0x07FA0017F80001D0L,0x0000027C000F800EL});
    public static final BitSet FOLLOW_expression_in_expression1994 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CAST_in_expression2013 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_nonPrimitiveType_in_expression2017 = new BitSet(new long[]{0x07FA0017F80001D0L,0x0000027C000F800EL});
    public static final BitSet FOLLOW_expression_in_expression2021 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NEW_in_expression2040 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_creator_in_expression2042 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_expression2056 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_selector_in_expression2067 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_primary_in_expression2073 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_selector_in_expression2098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_in_expression2110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_primary2151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_superMemberAccess_in_primary2163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primary2175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_primary2187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOTCLASS_in_primary2205 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ARRAYTYPE_in_primary2208 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_primary2210 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DOTCLASS_in_primary2225 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_primary2227 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DOTCLASS_in_primary2248 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primitiveType_in_primary2250 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DOTCLASS_in_primary2268 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VOID_in_primary2270 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FIELDACCESS_in_selector2314 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_selector2316 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_selector2318 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_METHODCALL_in_selector2337 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_selector2339 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_selector2341 = new BitSet(new long[]{0x0000000000004008L});
    public static final BitSet FOLLOW_arguments_in_selector2343 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARRAYACCESS_in_selector2366 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_selector2370 = new BitSet(new long[]{0x07FA0017F80001D0L,0x0000027C000F800EL});
    public static final BitSet FOLLOW_expression_in_selector2374 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_arrayCreatorRest_in_creator2409 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_arrayInitializer_in_creator2411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createdName_in_creator2424 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_classCreatorRest_in_creator2426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classType_in_createdName2452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_createdName2468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAYTYPE_in_arrayCreatorRest2497 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arrayCreatorRest_in_arrayCreatorRest2501 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARRAYTYPE_in_arrayCreatorRest2521 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_createdName_in_arrayCreatorRest2523 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARRAYTYPE_in_arrayCreatorRest2537 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_arrayCreatorRest2541 = new BitSet(new long[]{0x0001FE1000000200L});
    public static final BitSet FOLLOW_arrayCreatorRestExpr_in_arrayCreatorRest2545 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARRAYTYPE_in_arrayCreatorRestExpr2578 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_arrayCreatorRestExpr2582 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_arrayCreatorRest_in_arrayCreatorRestExpr2586 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_createdName_in_arrayCreatorRestExpr2606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arguments_in_classCreatorRest2631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_METHODCALL_in_superMemberAccess2663 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SUPER_in_superMemberAccess2665 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_superMemberAccess2667 = new BitSet(new long[]{0x0000000000004008L});
    public static final BitSet FOLLOW_arguments_in_superMemberAccess2669 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FIELDACCESS_in_superMemberAccess2690 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SUPER_in_superMemberAccess2692 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_superMemberAccess2694 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARGUMENTS_in_arguments2735 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expressionList_in_arguments2737 = new BitSet(new long[]{0x0000000000000008L});

}