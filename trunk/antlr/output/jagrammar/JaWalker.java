// $ANTLR 3.2 Sep 23, 2009 12:02:23 D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g 2010-10-18 21:24:51

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "METHODCALL", "CONSTRCALL", "FIELDACCESS", "ARRAYACCESS", "DOTCLASS", "ARRAYTYPE", "METHOD", "FIELD", "CONSTR", "FPARMS", "ARGUMENTS", "FPARM", "FMULTPARM", "MBODY", "CBODY", "VARDECL", "BLOCK", "STMT", "INIT", "CONDITION", "UPDATE", "DOWHILE", "THEN", "ARRAYINIT", "PREINC", "POSTINC", "PREDEC", "POSTDEC", "UNARYPLUS", "UNARYMINUS", "CAST", "CLASSBODY", "CLASS", "IDENTIFIER", "EXTENDS", "PUBLIC", "VOID", "PRIVATE", "CHAR", "BYTE", "SHORT", "INT", "LONG", "FLOAT", "DOUBLE", "BOOLEAN", "THIS", "SUPER", "INTLITERAL", "LONGLITERAL", "FLOATLITERAL", "DOUBLELITERAL", "CHARLITERAL", "STRINGLITERAL", "BOOLEANLITERAL", "NULLLITERAL", "IF", "FOR", "WHILE", "DO", "RETURN", "ELSE", "INSTANCEOF", "COMPAREOP", "NEW", "Digit", "IntegerNumber", "LongSuffix", "Exponent", "FloatingPointLiteral", "FloatSuffix", "DoubleSuffix", "EscapeSequence", "WS", "COMMENT", "LINE_COMMENT", "EQ", "PLUS", "MINUS", "STAR", "SLASH", "Letter", "Currency", "';'", "'{'", "'}'", "','", "'['", "']'", "'('", "')'", "'+='", "'-='", "'*='", "'/='", "'||'", "'&&'", "'=='", "'!='", "'%'", "'++'", "'--'", "'!'", "'.'"
    };
    public static final int CAST=34;
    public static final int FMULTPARM=16;
    public static final int STAR=83;
    public static final int WHILE=62;
    public static final int CLASSBODY=35;
    public static final int UNARYMINUS=33;
    public static final int PREDEC=30;
    public static final int CHAR=42;
    public static final int BOOLEANLITERAL=58;
    public static final int NEW=68;
    public static final int DO=63;
    public static final int CONDITION=23;
    public static final int UNARYPLUS=32;
    public static final int EOF=-1;
    public static final int Currency=86;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__90=90;
    public static final int FloatSuffix=74;
    public static final int RETURN=64;
    public static final int THIS=50;
    public static final int CBODY=18;
    public static final int DOUBLE=48;
    public static final int VOID=40;
    public static final int SUPER=51;
    public static final int EQ=80;
    public static final int COMMENT=78;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int ARGUMENTS=14;
    public static final int LINE_COMMENT=79;
    public static final int PRIVATE=41;
    public static final int ELSE=65;
    public static final int DOUBLELITERAL=55;
    public static final int INT=45;
    public static final int INTLITERAL=52;
    public static final int T__87=87;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int LongSuffix=71;
    public static final int LONGLITERAL=53;
    public static final int WS=77;
    public static final int FIELDACCESS=6;
    public static final int FloatingPointLiteral=73;
    public static final int CHARLITERAL=56;
    public static final int FPARM=15;
    public static final int FIELD=11;
    public static final int METHODCALL=4;
    public static final int POSTINC=29;
    public static final int INIT=22;
    public static final int Letter=85;
    public static final int EscapeSequence=76;
    public static final int POSTDEC=31;
    public static final int CLASS=36;
    public static final int STMT=21;
    public static final int IntegerNumber=70;
    public static final int MBODY=17;
    public static final int ARRAYTYPE=9;
    public static final int UPDATE=24;
    public static final int Exponent=72;
    public static final int FOR=61;
    public static final int FLOAT=47;
    public static final int VARDECL=19;
    public static final int DOTCLASS=8;
    public static final int CONSTR=12;
    public static final int IF=60;
    public static final int SLASH=84;
    public static final int CONSTRCALL=5;
    public static final int BOOLEAN=49;
    public static final int THEN=26;
    public static final int T__107=107;
    public static final int NULLLITERAL=59;
    public static final int IDENTIFIER=37;
    public static final int T__103=103;
    public static final int ARRAYINIT=27;
    public static final int PREINC=28;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int PLUS=81;
    public static final int ARRAYACCESS=7;
    public static final int BYTE=43;
    public static final int SHORT=44;
    public static final int T__102=102;
    public static final int INSTANCEOF=66;
    public static final int T__101=101;
    public static final int FPARMS=13;
    public static final int T__100=100;
    public static final int MINUS=82;
    public static final int Digit=69;
    public static final int DoubleSuffix=75;
    public static final int STRINGLITERAL=57;
    public static final int BLOCK=20;
    public static final int LONG=46;
    public static final int FLOATLITERAL=54;
    public static final int PUBLIC=39;
    public static final int EXTENDS=38;
    public static final int COMPAREOP=67;
    public static final int METHOD=10;
    public static final int DOWHILE=25;

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
    public String getGrammarFileName() { return "D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g"; }



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
    	
    	private String methodName;
    	private Type methodReturn;
    	
    	private String getMethodSignature() {	
    	    String parameters = formalParameters.toString();
    	    parameters = formalParameters.size() > 0 ? parameters.substring(1, parameters.length() - 1) : "";
    	    return methodName + '(' + parameters + ')';
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:158:1: compilationUnit : ( classDeclaration | ';' );
    public final void compilationUnit() throws RecognitionException {
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:172:5: ( classDeclaration | ';' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==CLASS) ) {
                alt1=1;
            }
            else if ( (LA1_0==87) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:172:8: classDeclaration
                    {
                    pushFollow(FOLLOW_classDeclaration_in_compilationUnit63);
                    classDeclaration();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:173:8: ';'
                    {
                    match(input,87,FOLLOW_87_in_compilationUnit72); 

                    }
                    break;

            }

            	System.out.flush();
            	try {
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                    }
            	System.err.println("ERROR LOG:" + errorLog);
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:176:1: classDeclaration : ^( CLASS IDENTIFIER ( classType )? classBody ) ;
    public final void classDeclaration() throws RecognitionException {
        CommonTree IDENTIFIER1=null;

        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:177:5: ( ^( CLASS IDENTIFIER ( classType )? classBody ) )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:177:9: ^( CLASS IDENTIFIER ( classType )? classBody )
            {
            match(input,CLASS,FOLLOW_CLASS_in_classDeclaration96); 

            match(input, Token.DOWN, null); 
            IDENTIFIER1=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classDeclaration98); 
             errorLog= new ErrorLogger((IDENTIFIER1!=null?IDENTIFIER1.getText():null)); 
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:177:77: ( classType )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==IDENTIFIER) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:177:77: classType
                    {
                    pushFollow(FOLLOW_classType_in_classDeclaration102);
                    classType();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_classBody_in_classDeclaration105);
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:180:1: classBody : ^( CLASSBODY ( classBodyDeclaration )* ) ;
    public final void classBody() throws RecognitionException {
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:181:5: ( ^( CLASSBODY ( classBodyDeclaration )* ) )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:181:9: ^( CLASSBODY ( classBodyDeclaration )* )
            {
            match(input,CLASSBODY,FOLLOW_CLASSBODY_in_classBody131); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:181:21: ( classBodyDeclaration )*
                loop3:
                do {
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( ((LA3_0>=METHOD && LA3_0<=CONSTR)) ) {
                        alt3=1;
                    }


                    switch (alt3) {
                	case 1 :
                	    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:181:21: classBodyDeclaration
                	    {
                	    pushFollow(FOLLOW_classBodyDeclaration_in_classBody133);
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:184:1: classBodyDeclaration : memberDeclaration ;
    public final void classBodyDeclaration() throws RecognitionException {
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:185:5: ( memberDeclaration )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:185:9: memberDeclaration
            {
            pushFollow(FOLLOW_memberDeclaration_in_classBodyDeclaration154);
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:188:1: memberDeclaration : ( fieldDeclaration | methodAndConstructorDeclaration );
    public final void memberDeclaration() throws RecognitionException {
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:189:5: ( fieldDeclaration | methodAndConstructorDeclaration )
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
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:189:9: fieldDeclaration
                    {
                    pushFollow(FOLLOW_fieldDeclaration_in_memberDeclaration177);
                    fieldDeclaration();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:190:7: methodAndConstructorDeclaration
                    {
                    pushFollow(FOLLOW_methodAndConstructorDeclaration_in_memberDeclaration185);
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:193:1: methodAndConstructorDeclaration : ( ^( METHOD modifier type methodDeclaration ) | ^( METHOD modifier VOID IDENTIFIER voidMethodDeclaratorRest ) | ^( CONSTR modifier IDENTIFIER ( formalParameters )? ( constructorBody )? ) );
    public final void methodAndConstructorDeclaration() throws RecognitionException {
        JaScope_stack.push(new JaScope_scope());

        CommonTree IDENTIFIER3=null;
        CommonTree IDENTIFIER4=null;
        Type type2 = null;



        	((JaScope_scope)JaScope_stack.peek()).symbols = new HashMap<String, Type>();
        	formalParameters = new LinkedList<String>();

        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:199:5: ( ^( METHOD modifier type methodDeclaration ) | ^( METHOD modifier VOID IDENTIFIER voidMethodDeclaratorRest ) | ^( CONSTR modifier IDENTIFIER ( formalParameters )? ( constructorBody )? ) )
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==METHOD) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==DOWN) ) {
                    int LA7_3 = input.LA(3);

                    if ( (LA7_3==PUBLIC||LA7_3==PRIVATE) ) {
                        int LA7_4 = input.LA(4);

                        if ( (LA7_4==ARRAYTYPE||LA7_4==IDENTIFIER||(LA7_4>=CHAR && LA7_4<=BOOLEAN)) ) {
                            alt7=1;
                        }
                        else if ( (LA7_4==VOID) ) {
                            alt7=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 7, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA7_0==CONSTR) ) {
                alt7=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:199:9: ^( METHOD modifier type methodDeclaration )
                    {
                    match(input,METHOD,FOLLOW_METHOD_in_methodAndConstructorDeclaration219); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_modifier_in_methodAndConstructorDeclaration221);
                    modifier();

                    state._fsp--;

                    pushFollow(FOLLOW_type_in_methodAndConstructorDeclaration223);
                    type2=type();

                    state._fsp--;

                     methodReturn = type2; 
                    pushFollow(FOLLOW_methodDeclaration_in_methodAndConstructorDeclaration227);
                    methodDeclaration();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:200:9: ^( METHOD modifier VOID IDENTIFIER voidMethodDeclaratorRest )
                    {
                    match(input,METHOD,FOLLOW_METHOD_in_methodAndConstructorDeclaration242); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_modifier_in_methodAndConstructorDeclaration244);
                    modifier();

                    state._fsp--;

                    match(input,VOID,FOLLOW_VOID_in_methodAndConstructorDeclaration246); 
                    IDENTIFIER3=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_methodAndConstructorDeclaration248); 
                     methodName = (IDENTIFIER3!=null?IDENTIFIER3.getText():null); methodReturn = VoidType.TYPE; 
                    pushFollow(FOLLOW_voidMethodDeclaratorRest_in_methodAndConstructorDeclaration252);
                    voidMethodDeclaratorRest();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:201:9: ^( CONSTR modifier IDENTIFIER ( formalParameters )? ( constructorBody )? )
                    {
                    match(input,CONSTR,FOLLOW_CONSTR_in_methodAndConstructorDeclaration267); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_modifier_in_methodAndConstructorDeclaration269);
                    modifier();

                    state._fsp--;

                    IDENTIFIER4=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_methodAndConstructorDeclaration271); 
                     methodName = (IDENTIFIER4!=null?IDENTIFIER4.getText():null); 
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:201:73: ( formalParameters )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==FPARMS) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:201:73: formalParameters
                            {
                            pushFollow(FOLLOW_formalParameters_in_methodAndConstructorDeclaration275);
                            formalParameters();

                            state._fsp--;


                            }
                            break;

                    }

                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:201:91: ( constructorBody )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==CBODY) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:201:91: constructorBody
                            {
                            pushFollow(FOLLOW_constructorBody_in_methodAndConstructorDeclaration278);
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


    // $ANTLR start "methodDeclaration"
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:205:1: methodDeclaration : IDENTIFIER ( formalParameters )? methodBody ;
    public final void methodDeclaration() throws RecognitionException {
        CommonTree IDENTIFIER5=null;

        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:206:5: ( IDENTIFIER ( formalParameters )? methodBody )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:206:9: IDENTIFIER ( formalParameters )? methodBody
            {
            IDENTIFIER5=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_methodDeclaration309); 
             methodName = (IDENTIFIER5!=null?IDENTIFIER5.getText():null); 
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:206:55: ( formalParameters )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==FPARMS) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:206:55: formalParameters
                    {
                    pushFollow(FOLLOW_formalParameters_in_methodDeclaration313);
                    formalParameters();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_methodBody_in_methodDeclaration316);
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:209:1: fieldDeclaration : ^( FIELD modifier variableDeclarator ) ;
    public final void fieldDeclaration() throws RecognitionException {
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:210:5: ( ^( FIELD modifier variableDeclarator ) )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:210:9: ^( FIELD modifier variableDeclarator )
            {
            match(input,FIELD,FOLLOW_FIELD_in_fieldDeclaration336); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_modifier_in_fieldDeclaration338);
            modifier();

            state._fsp--;

            pushFollow(FOLLOW_variableDeclarator_in_fieldDeclaration340);
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:213:1: voidMethodDeclaratorRest : ( formalParameters )? methodBody ;
    public final void voidMethodDeclaratorRest() throws RecognitionException {
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:214:5: ( ( formalParameters )? methodBody )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:214:7: ( formalParameters )? methodBody
            {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:214:7: ( formalParameters )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==FPARMS) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:214:7: formalParameters
                    {
                    pushFollow(FOLLOW_formalParameters_in_voidMethodDeclaratorRest363);
                    formalParameters();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_methodBody_in_voidMethodDeclaratorRest366);
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:217:1: variableDeclarator returns [CommonTree id, Type t] : variableDeclaratorId ( variableInitializer[$variableDeclaratorId.t, $variableDeclaratorId.id] )? ;
    public final JaWalker.variableDeclarator_return variableDeclarator() throws RecognitionException {
        JaWalker.variableDeclarator_return retval = new JaWalker.variableDeclarator_return();
        retval.start = input.LT(1);

        JaWalker.variableDeclaratorId_return variableDeclaratorId6 = null;


        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:218:5: ( variableDeclaratorId ( variableInitializer[$variableDeclaratorId.t, $variableDeclaratorId.id] )? )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:218:9: variableDeclaratorId ( variableInitializer[$variableDeclaratorId.t, $variableDeclaratorId.id] )?
            {
            pushFollow(FOLLOW_variableDeclaratorId_in_variableDeclarator389);
            variableDeclaratorId6=variableDeclaratorId();

            state._fsp--;

             retval.id = (variableDeclaratorId6!=null?variableDeclaratorId6.id:null); retval.t = (variableDeclaratorId6!=null?variableDeclaratorId6.t:null); 
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:218:96: ( variableInitializer[$variableDeclaratorId.t, $variableDeclaratorId.id] )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==METHODCALL||(LA10_0>=FIELDACCESS && LA10_0<=DOTCLASS)||(LA10_0>=ARRAYINIT && LA10_0<=CAST)||LA10_0==IDENTIFIER||LA10_0==THIS||(LA10_0>=INTLITERAL && LA10_0<=NULLLITERAL)||(LA10_0>=INSTANCEOF && LA10_0<=NEW)||(LA10_0>=EQ && LA10_0<=SLASH)||(LA10_0>=99 && LA10_0<=103)||LA10_0==106) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:218:97: variableInitializer[$variableDeclaratorId.t, $variableDeclaratorId.id]
                    {
                    pushFollow(FOLLOW_variableInitializer_in_variableDeclarator394);
                    variableInitializer((variableDeclaratorId6!=null?variableDeclaratorId6.t:null), (variableDeclaratorId6!=null?variableDeclaratorId6.id:null));

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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:221:1: variableDeclaratorId returns [CommonTree id, Type t] : type IDENTIFIER ;
    public final JaWalker.variableDeclaratorId_return variableDeclaratorId() throws RecognitionException {
        JaWalker.variableDeclaratorId_return retval = new JaWalker.variableDeclaratorId_return();
        retval.start = input.LT(1);

        CommonTree IDENTIFIER7=null;
        Type type8 = null;


        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:222:5: ( type IDENTIFIER )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:222:9: type IDENTIFIER
            {
            pushFollow(FOLLOW_type_in_variableDeclaratorId424);
            type8=type();

            state._fsp--;

            IDENTIFIER7=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variableDeclaratorId426); 
             retval.id = IDENTIFIER7; retval.t = type8; 

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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:225:1: variableInitializer[Type tin, CommonTree token] : ( arrayInitializer[$tin] | e= expression );
    public final void variableInitializer(Type tin, CommonTree token) throws RecognitionException {
        JaWalker.expression_return e = null;


        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:226:5: ( arrayInitializer[$tin] | e= expression )
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
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:226:9: arrayInitializer[$tin]
                    {
                     if(tin.isArray()) {
                        	  	tin = ((ArrayType)tin).getHostType();
                        	  } else {
                        	  	errorLog.add(new IllegalArrayInitializerException(tin.toString(), token.getLine(), token.getCharPositionInLine()));
                        	  }
                        	
                    pushFollow(FOLLOW_arrayInitializer_in_variableInitializer462);
                    arrayInitializer(tin);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:234:9: e= expression
                    {
                    pushFollow(FOLLOW_expression_in_variableInitializer481);
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:241:1: arrayInitializer[Type tin] : ^( ARRAYINIT ( variableInitializer[$tin, $ARRAYINIT] )* ) ;
    public final void arrayInitializer(Type tin) throws RecognitionException {
        CommonTree ARRAYINIT9=null;

        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:242:5: ( ^( ARRAYINIT ( variableInitializer[$tin, $ARRAYINIT] )* ) )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:242:9: ^( ARRAYINIT ( variableInitializer[$tin, $ARRAYINIT] )* )
            {
            ARRAYINIT9=(CommonTree)match(input,ARRAYINIT,FOLLOW_ARRAYINIT_in_arrayInitializer515); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:242:21: ( variableInitializer[$tin, $ARRAYINIT] )*
                loop12:
                do {
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==METHODCALL||(LA12_0>=FIELDACCESS && LA12_0<=DOTCLASS)||(LA12_0>=ARRAYINIT && LA12_0<=CAST)||LA12_0==IDENTIFIER||LA12_0==THIS||(LA12_0>=INTLITERAL && LA12_0<=NULLLITERAL)||(LA12_0>=INSTANCEOF && LA12_0<=NEW)||(LA12_0>=EQ && LA12_0<=SLASH)||(LA12_0>=99 && LA12_0<=103)||LA12_0==106) ) {
                        alt12=1;
                    }


                    switch (alt12) {
                	case 1 :
                	    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:242:21: variableInitializer[$tin, $ARRAYINIT]
                	    {
                	    pushFollow(FOLLOW_variableInitializer_in_arrayInitializer517);
                	    variableInitializer(tin, ARRAYINIT9);

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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:245:1: modifier : ( PUBLIC | PRIVATE );
    public final void modifier() throws RecognitionException {
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:246:5: ( PUBLIC | PRIVATE )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:250:1: type returns [Type t] : ( nonPrimitiveType | primitiveType );
    public final Type type() throws RecognitionException {
        Type t = null;

        ComplexType nonPrimitiveType10 = null;

        BasicType primitiveType11 = null;


        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:251:5: ( nonPrimitiveType | primitiveType )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==ARRAYTYPE||LA13_0==IDENTIFIER) ) {
                alt13=1;
            }
            else if ( ((LA13_0>=CHAR && LA13_0<=BOOLEAN)) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:251:7: nonPrimitiveType
                    {
                    pushFollow(FOLLOW_nonPrimitiveType_in_type578);
                    nonPrimitiveType10=nonPrimitiveType();

                    state._fsp--;

                     t = nonPrimitiveType10; 

                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:252:7: primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_type588);
                    primitiveType11=primitiveType();

                    state._fsp--;

                     t = primitiveType11;   

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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:255:1: nonPrimitiveType returns [ComplexType t] : ( ^( ARRAYTYPE npt= nonPrimitiveType ) | classType | ^( ARRAYTYPE primitiveType ) );
    public final ComplexType nonPrimitiveType() throws RecognitionException {
        ComplexType t = null;

        ComplexType npt = null;

        ReferenceType classType12 = null;

        BasicType primitiveType13 = null;


        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:256:5: ( ^( ARRAYTYPE npt= nonPrimitiveType ) | classType | ^( ARRAYTYPE primitiveType ) )
            int alt14=3;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==ARRAYTYPE) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==DOWN) ) {
                    int LA14_3 = input.LA(3);

                    if ( (LA14_3==ARRAYTYPE||LA14_3==IDENTIFIER) ) {
                        alt14=1;
                    }
                    else if ( ((LA14_3>=CHAR && LA14_3<=BOOLEAN)) ) {
                        alt14=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA14_0==IDENTIFIER) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:256:7: ^( ARRAYTYPE npt= nonPrimitiveType )
                    {
                    match(input,ARRAYTYPE,FOLLOW_ARRAYTYPE_in_nonPrimitiveType616); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_nonPrimitiveType_in_nonPrimitiveType620);
                    npt=nonPrimitiveType();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     t = (ComplexType)ParserHelper.createArrayType(npt, 1); 

                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:257:9: classType
                    {
                    pushFollow(FOLLOW_classType_in_nonPrimitiveType633);
                    classType12=classType();

                    state._fsp--;

                     t = classType12; 

                    }
                    break;
                case 3 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:258:7: ^( ARRAYTYPE primitiveType )
                    {
                    match(input,ARRAYTYPE,FOLLOW_ARRAYTYPE_in_nonPrimitiveType667); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_primitiveType_in_nonPrimitiveType669);
                    primitiveType13=primitiveType();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     t = (ComplexType)ParserHelper.createArrayType(primitiveType13, 1); 

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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:261:1: classType returns [ReferenceType t] : IDENTIFIER ;
    public final ReferenceType classType() throws RecognitionException {
        ReferenceType t = null;

        CommonTree IDENTIFIER14=null;

        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:262:5: ( IDENTIFIER )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:262:7: IDENTIFIER
            {
            IDENTIFIER14=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classType700); 
             t = cTab.get((IDENTIFIER14!=null?IDENTIFIER14.getText():null)); 
                	  if (t == null) errorLog.add(new CannotFindSymbolException(("class " + (IDENTIFIER14!=null?IDENTIFIER14.getText():null)), "class " + rt.toString(), (IDENTIFIER14!=null?IDENTIFIER14.getLine():0), (IDENTIFIER14!=null?IDENTIFIER14.getCharPositionInLine():0)));
                	

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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:268:1: primitiveType returns [BasicType bs] : ( CHAR | BYTE | SHORT | INT | LONG | FLOAT | DOUBLE | BOOLEAN );
    public final BasicType primitiveType() throws RecognitionException {
        BasicType bs = null;

        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:269:5: ( CHAR | BYTE | SHORT | INT | LONG | FLOAT | DOUBLE | BOOLEAN )
            int alt15=8;
            switch ( input.LA(1) ) {
            case CHAR:
                {
                alt15=1;
                }
                break;
            case BYTE:
                {
                alt15=2;
                }
                break;
            case SHORT:
                {
                alt15=3;
                }
                break;
            case INT:
                {
                alt15=4;
                }
                break;
            case LONG:
                {
                alt15=5;
                }
                break;
            case FLOAT:
                {
                alt15=6;
                }
                break;
            case DOUBLE:
                {
                alt15=7;
                }
                break;
            case BOOLEAN:
                {
                alt15=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:269:9: CHAR
                    {
                    match(input,CHAR,FOLLOW_CHAR_in_primitiveType731); 
                     bs = BasicType.CHAR;    

                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:270:9: BYTE
                    {
                    match(input,BYTE,FOLLOW_BYTE_in_primitiveType746); 
                     bs = BasicType.BYTE;    

                    }
                    break;
                case 3 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:271:9: SHORT
                    {
                    match(input,SHORT,FOLLOW_SHORT_in_primitiveType761); 
                     bs = BasicType.SHORT;   

                    }
                    break;
                case 4 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:272:9: INT
                    {
                    match(input,INT,FOLLOW_INT_in_primitiveType775); 
                     bs = BasicType.INT;     

                    }
                    break;
                case 5 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:273:9: LONG
                    {
                    match(input,LONG,FOLLOW_LONG_in_primitiveType791); 
                     bs = BasicType.LONG;    

                    }
                    break;
                case 6 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:274:9: FLOAT
                    {
                    match(input,FLOAT,FOLLOW_FLOAT_in_primitiveType806); 
                     bs = BasicType.FLOAT;   

                    }
                    break;
                case 7 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:275:9: DOUBLE
                    {
                    match(input,DOUBLE,FOLLOW_DOUBLE_in_primitiveType820); 
                     bs = BasicType.DOUBLE;  

                    }
                    break;
                case 8 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:276:9: BOOLEAN
                    {
                    match(input,BOOLEAN,FOLLOW_BOOLEAN_in_primitiveType833); 
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:279:1: formalParameters : ^( FPARMS ( formalParameterDecls )? ) ;
    public final void formalParameters() throws RecognitionException {
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:280:5: ( ^( FPARMS ( formalParameterDecls )? ) )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:280:9: ^( FPARMS ( formalParameterDecls )? )
            {
            match(input,FPARMS,FOLLOW_FPARMS_in_formalParameters859); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:280:18: ( formalParameterDecls )?
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==FPARM) ) {
                    alt16=1;
                }
                switch (alt16) {
                    case 1 :
                        // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:280:18: formalParameterDecls
                        {
                        pushFollow(FOLLOW_formalParameterDecls_in_formalParameters861);
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:283:1: formalParameterDecls : ^( FPARM variableDeclaratorId ) ( formalParameterDecls )? ;
    public final void formalParameterDecls() throws RecognitionException {
        JaWalker.variableDeclaratorId_return variableDeclaratorId15 = null;


        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:284:5: ( ^( FPARM variableDeclaratorId ) ( formalParameterDecls )? )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:284:7: ^( FPARM variableDeclaratorId ) ( formalParameterDecls )?
            {
            match(input,FPARM,FOLLOW_FPARM_in_formalParameterDecls886); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_variableDeclaratorId_in_formalParameterDecls888);
            variableDeclaratorId15=variableDeclaratorId();

            state._fsp--;


            match(input, Token.UP, null); 
             formalParameters.add((variableDeclaratorId15!=null?variableDeclaratorId15.t:null).toString()); addVariableToScope((variableDeclaratorId15!=null?variableDeclaratorId15.id:null), (variableDeclaratorId15!=null?variableDeclaratorId15.t:null)); 
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:284:170: ( formalParameterDecls )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==FPARM) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:284:170: formalParameterDecls
                    {
                    pushFollow(FOLLOW_formalParameterDecls_in_formalParameterDecls893);
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:288:1: methodBody : ^( MBODY block ) ;
    public final void methodBody() throws RecognitionException {
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:289:5: ( ^( MBODY block ) )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:289:9: ^( MBODY block )
            {
            match(input,MBODY,FOLLOW_MBODY_in_methodBody919); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                pushFollow(FOLLOW_block_in_methodBody921);
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:293:1: constructorBody : ^( CBODY ( explicitConstructorInvocation )? ( blockStatement )* ) ;
    public final void constructorBody() throws RecognitionException {
        JaScope_stack.push(new JaScope_scope());


        	((JaScope_scope)JaScope_stack.peek()).symbols = new HashMap<String, Type>();

        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:301:5: ( ^( CBODY ( explicitConstructorInvocation )? ( blockStatement )* ) )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:301:7: ^( CBODY ( explicitConstructorInvocation )? ( blockStatement )* )
            {
            match(input,CBODY,FOLLOW_CBODY_in_constructorBody980); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:301:15: ( explicitConstructorInvocation )?
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==CONSTRCALL) ) {
                    alt18=1;
                }
                switch (alt18) {
                    case 1 :
                        // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:301:15: explicitConstructorInvocation
                        {
                        pushFollow(FOLLOW_explicitConstructorInvocation_in_constructorBody982);
                        explicitConstructorInvocation();

                        state._fsp--;


                        }
                        break;

                }

                // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:301:46: ( blockStatement )*
                loop19:
                do {
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( ((LA19_0>=VARDECL && LA19_0<=STMT)||LA19_0==DOWHILE||(LA19_0>=IF && LA19_0<=WHILE)||LA19_0==RETURN) ) {
                        alt19=1;
                    }


                    switch (alt19) {
                	case 1 :
                	    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:301:46: blockStatement
                	    {
                	    pushFollow(FOLLOW_blockStatement_in_constructorBody985);
                	    blockStatement();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop19;
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:304:1: explicitConstructorInvocation : ( ^( CONSTRCALL THIS ( arguments )? ) | ^( CONSTRCALL SUPER ( arguments )? ) );
    public final void explicitConstructorInvocation() throws RecognitionException {
        CommonTree THIS17=null;
        CommonTree SUPER19=null;
        JaWalker.arguments_return arguments16 = null;

        JaWalker.arguments_return arguments18 = null;


        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:305:5: ( ^( CONSTRCALL THIS ( arguments )? ) | ^( CONSTRCALL SUPER ( arguments )? ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==CONSTRCALL) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==DOWN) ) {
                    int LA22_2 = input.LA(3);

                    if ( (LA22_2==THIS) ) {
                        alt22=1;
                    }
                    else if ( (LA22_2==SUPER) ) {
                        alt22=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:305:9: ^( CONSTRCALL THIS ( arguments )? )
                    {
                    match(input,CONSTRCALL,FOLLOW_CONSTRCALL_in_explicitConstructorInvocation1007); 

                    match(input, Token.DOWN, null); 
                    THIS17=(CommonTree)match(input,THIS,FOLLOW_THIS_in_explicitConstructorInvocation1009); 
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:305:28: ( arguments )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==ARGUMENTS) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:305:28: arguments
                            {
                            pushFollow(FOLLOW_arguments_in_explicitConstructorInvocation1012);
                            arguments16=arguments();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                     if((arguments16!=null?arguments16.types:null) == null || ruleTypeCheck((arguments16!=null?arguments16.types:null).toArray(new Type[(arguments16!=null?arguments16.types:null).size()]))) {
                    	    	  try {
                    			rt.bindConstructor((arguments16!=null?arguments16.types:null));
                    	    	  } catch (EarlyBindingException ex) {
                    	    	  	errorLog.add(new CannotFindSymbolException(("constructor " + rt.toString() + '(' + printArguments((arguments16!=null?arguments16.types:null)) + ')'), "class " + rt.toString(), (THIS17!=null?THIS17.getLine():0), (THIS17!=null?THIS17.getCharPositionInLine():0)));
                    	    	  }
                        	  } 
                        	

                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:314:7: ^( CONSTRCALL SUPER ( arguments )? )
                    {
                    match(input,CONSTRCALL,FOLLOW_CONSTRCALL_in_explicitConstructorInvocation1033); 

                    match(input, Token.DOWN, null); 
                    SUPER19=(CommonTree)match(input,SUPER,FOLLOW_SUPER_in_explicitConstructorInvocation1035); 
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:314:26: ( arguments )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==ARGUMENTS) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:314:26: arguments
                            {
                            pushFollow(FOLLOW_arguments_in_explicitConstructorInvocation1037);
                            arguments18=arguments();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                     ReferenceType sc = rt.getSuperClass();
                        	  if( (arguments18!=null?arguments18.types:null) == null || ruleTypeCheck((arguments18!=null?arguments18.types:null).toArray(new Type[(arguments18!=null?arguments18.types:null).size()])) ) {
                    	    	  try {
                    			 sc.bindConstructor((arguments18!=null?arguments18.types:null));
                    		  } catch (EarlyBindingException ex) {
                    			errorLog.add(new CannotFindSymbolException(("constructor " + sc.toString() + '(' + printArguments((arguments18!=null?arguments18.types:null)) + ')'), "class " + sc.toString(), (SUPER19!=null?SUPER19.getLine():0), (SUPER19!=null?SUPER19.getCharPositionInLine():0)));
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:326:1: literal returns [Type t] : ( INTLITERAL | LONGLITERAL | FLOATLITERAL | DOUBLELITERAL | CHARLITERAL | STRINGLITERAL | BOOLEANLITERAL | NULLLITERAL );
    public final Type literal() throws RecognitionException {
        Type t = null;

        CommonTree INTLITERAL20=null;

        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:327:5: ( INTLITERAL | LONGLITERAL | FLOATLITERAL | DOUBLELITERAL | CHARLITERAL | STRINGLITERAL | BOOLEANLITERAL | NULLLITERAL )
            int alt23=8;
            switch ( input.LA(1) ) {
            case INTLITERAL:
                {
                alt23=1;
                }
                break;
            case LONGLITERAL:
                {
                alt23=2;
                }
                break;
            case FLOATLITERAL:
                {
                alt23=3;
                }
                break;
            case DOUBLELITERAL:
                {
                alt23=4;
                }
                break;
            case CHARLITERAL:
                {
                alt23=5;
                }
                break;
            case STRINGLITERAL:
                {
                alt23=6;
                }
                break;
            case BOOLEANLITERAL:
                {
                alt23=7;
                }
                break;
            case NULLLITERAL:
                {
                alt23=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:327:9: INTLITERAL
                    {
                    INTLITERAL20=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_literal1069); 
                     int literal = Integer.parseInt((INTLITERAL20!=null?INTLITERAL20.getText():null));
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
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:336:9: LONGLITERAL
                    {
                    match(input,LONGLITERAL,FOLLOW_LONGLITERAL_in_literal1085); 
                     t = BasicType.LONG;       

                    }
                    break;
                case 3 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:337:9: FLOATLITERAL
                    {
                    match(input,FLOATLITERAL,FOLLOW_FLOATLITERAL_in_literal1100); 
                     t = BasicType.FLOAT;      

                    }
                    break;
                case 4 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:338:7: DOUBLELITERAL
                    {
                    match(input,DOUBLELITERAL,FOLLOW_DOUBLELITERAL_in_literal1112); 
                     t = BasicType.DOUBLE;     

                    }
                    break;
                case 5 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:339:9: CHARLITERAL
                    {
                    match(input,CHARLITERAL,FOLLOW_CHARLITERAL_in_literal1125); 
                     t = BasicType.CHAR;       

                    }
                    break;
                case 6 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:340:9: STRINGLITERAL
                    {
                    match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_literal1140); 
                     t = ReferenceType.STRING; 

                    }
                    break;
                case 7 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:341:9: BOOLEANLITERAL
                    {
                    match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_literal1153); 
                     t = BasicType.BOOLEAN;    

                    }
                    break;
                case 8 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:342:9: NULLLITERAL
                    {
                    match(input,NULLLITERAL,FOLLOW_NULLLITERAL_in_literal1165); 
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:347:1: block : ( blockStatement )* ;
    public final void block() throws RecognitionException {
        JaScope_stack.push(new JaScope_scope());


        	((JaScope_scope)JaScope_stack.peek()).symbols = new HashMap<String, Type>();

        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:352:5: ( ( blockStatement )* )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:352:9: ( blockStatement )*
            {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:352:9: ( blockStatement )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=VARDECL && LA24_0<=STMT)||LA24_0==DOWHILE||(LA24_0>=IF && LA24_0<=WHILE)||LA24_0==RETURN) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:352:9: blockStatement
            	    {
            	    pushFollow(FOLLOW_blockStatement_in_block1201);
            	    blockStatement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:355:1: blockStatement : ( localVariableDeclarationStatement | statement );
    public final void blockStatement() throws RecognitionException {
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:356:5: ( localVariableDeclarationStatement | statement )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==VARDECL) ) {
                alt25=1;
            }
            else if ( ((LA25_0>=BLOCK && LA25_0<=STMT)||LA25_0==DOWHILE||(LA25_0>=IF && LA25_0<=WHILE)||LA25_0==RETURN) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:356:9: localVariableDeclarationStatement
                    {
                    pushFollow(FOLLOW_localVariableDeclarationStatement_in_blockStatement1225);
                    localVariableDeclarationStatement();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:357:9: statement
                    {
                    pushFollow(FOLLOW_statement_in_blockStatement1236);
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:360:1: localVariableDeclarationStatement : localVariableDeclaration ;
    public final void localVariableDeclarationStatement() throws RecognitionException {
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:361:5: ( localVariableDeclaration )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:361:7: localVariableDeclaration
            {
            pushFollow(FOLLOW_localVariableDeclaration_in_localVariableDeclarationStatement1257);
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:364:1: localVariableDeclaration : ^( VARDECL variableDeclarator ) ;
    public final void localVariableDeclaration() throws RecognitionException {
        JaWalker.variableDeclarator_return variableDeclarator21 = null;


        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:365:5: ( ^( VARDECL variableDeclarator ) )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:365:7: ^( VARDECL variableDeclarator )
            {
            match(input,VARDECL,FOLLOW_VARDECL_in_localVariableDeclaration1275); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_variableDeclarator_in_localVariableDeclaration1277);
            variableDeclarator21=variableDeclarator();

            state._fsp--;


            match(input, Token.UP, null); 
             addVariableToScope((variableDeclarator21!=null?variableDeclarator21.id:null), (variableDeclarator21!=null?variableDeclarator21.t:null)); 

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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:370:1: statement : ( ^( BLOCK block ) | ^( IF condition ( ^( THEN statement ) )? ( elseStmt )? ) | ^( FOR ( ^( INIT forInit ) )? ( condition )? ( ^( UPDATE forUpdate ) )? statement ) | ^( WHILE condition statement ) | ^( DOWHILE condition statement ) | ^( RETURN expression ) | RETURN | ^( STMT statementExpression ) );
    public final void statement() throws RecognitionException {
        CommonTree RETURN22=null;
        CommonTree RETURN24=null;
        JaWalker.expression_return expression23 = null;


        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:371:5: ( ^( BLOCK block ) | ^( IF condition ( ^( THEN statement ) )? ( elseStmt )? ) | ^( FOR ( ^( INIT forInit ) )? ( condition )? ( ^( UPDATE forUpdate ) )? statement ) | ^( WHILE condition statement ) | ^( DOWHILE condition statement ) | ^( RETURN expression ) | RETURN | ^( STMT statementExpression ) )
            int alt31=8;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:371:9: ^( BLOCK block )
                    {
                    match(input,BLOCK,FOLLOW_BLOCK_in_statement1314); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_block_in_statement1316);
                        block();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }

                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:372:9: ^( IF condition ( ^( THEN statement ) )? ( elseStmt )? )
                    {
                    match(input,IF,FOLLOW_IF_in_statement1328); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_condition_in_statement1330);
                    condition();

                    state._fsp--;

                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:372:24: ( ^( THEN statement ) )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==THEN) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:372:25: ^( THEN statement )
                            {
                            match(input,THEN,FOLLOW_THEN_in_statement1334); 

                            match(input, Token.DOWN, null); 
                            pushFollow(FOLLOW_statement_in_statement1336);
                            statement();

                            state._fsp--;


                            match(input, Token.UP, null); 

                            }
                            break;

                    }

                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:372:45: ( elseStmt )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==ELSE) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:372:45: elseStmt
                            {
                            pushFollow(FOLLOW_elseStmt_in_statement1341);
                            elseStmt();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:373:9: ^( FOR ( ^( INIT forInit ) )? ( condition )? ( ^( UPDATE forUpdate ) )? statement )
                    {
                    match(input,FOR,FOLLOW_FOR_in_statement1354); 

                    match(input, Token.DOWN, null); 
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:373:15: ( ^( INIT forInit ) )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==INIT) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:373:16: ^( INIT forInit )
                            {
                            match(input,INIT,FOLLOW_INIT_in_statement1358); 

                            match(input, Token.DOWN, null); 
                            pushFollow(FOLLOW_forInit_in_statement1360);
                            forInit();

                            state._fsp--;


                            match(input, Token.UP, null); 

                            }
                            break;

                    }

                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:373:34: ( condition )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==CONDITION) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:373:34: condition
                            {
                            pushFollow(FOLLOW_condition_in_statement1365);
                            condition();

                            state._fsp--;


                            }
                            break;

                    }

                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:373:45: ( ^( UPDATE forUpdate ) )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==UPDATE) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:373:46: ^( UPDATE forUpdate )
                            {
                            match(input,UPDATE,FOLLOW_UPDATE_in_statement1370); 

                            match(input, Token.DOWN, null); 
                            pushFollow(FOLLOW_forUpdate_in_statement1372);
                            forUpdate();

                            state._fsp--;


                            match(input, Token.UP, null); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_statement_in_statement1377);
                    statement();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:374:9: ^( WHILE condition statement )
                    {
                    match(input,WHILE,FOLLOW_WHILE_in_statement1390); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_condition_in_statement1392);
                    condition();

                    state._fsp--;

                    pushFollow(FOLLOW_statement_in_statement1394);
                    statement();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:375:9: ^( DOWHILE condition statement )
                    {
                    match(input,DOWHILE,FOLLOW_DOWHILE_in_statement1406); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_condition_in_statement1408);
                    condition();

                    state._fsp--;

                    pushFollow(FOLLOW_statement_in_statement1410);
                    statement();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:376:9: ^( RETURN expression )
                    {
                    RETURN22=(CommonTree)match(input,RETURN,FOLLOW_RETURN_in_statement1422); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_statement1424);
                    expression23=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(methodReturn.isVoid())
                        		errorLog.add(new ReturnFromVoidMethodException((RETURN22!=null?RETURN22.getLine():0), (RETURN22!=null?RETURN22.getCharPositionInLine():0)));    		
                        	  else if (ruleTypeCheck((expression23!=null?expression23.t:null)))
                        	  	assignOperation(RETURN22, methodReturn, (expression23!=null?expression23.t:null));
                        	

                    }
                    break;
                case 7 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:382:9: RETURN
                    {
                    RETURN24=(CommonTree)match(input,RETURN,FOLLOW_RETURN_in_statement1447); 
                     if(!methodReturn.isVoid()) errorLog.add(new MissingReturnValueException((RETURN24!=null?RETURN24.getLine():0), (RETURN24!=null?RETURN24.getCharPositionInLine():0))); 

                    }
                    break;
                case 8 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:383:9: ^( STMT statementExpression )
                    {
                    match(input,STMT,FOLLOW_STMT_in_statement1460); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_statementExpression_in_statement1462);
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:386:1: condition : ^( CONDITION expression ) ;
    public final void condition() throws RecognitionException {
        CommonTree CONDITION26=null;
        JaWalker.expression_return expression25 = null;


        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:387:5: ( ^( CONDITION expression ) )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:387:7: ^( CONDITION expression )
            {
            CONDITION26=(CommonTree)match(input,CONDITION,FOLLOW_CONDITION_in_condition1485); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_condition1487);
            expression25=expression();

            state._fsp--;


            match(input, Token.UP, null); 
             if (ruleTypeCheck((expression25!=null?expression25.t:null))) {
                	  	if (!((expression25!=null?expression25.t:null) == BasicType.BOOLEAN)) errorLog.add(new IncompatibleTypesException(BasicType.BOOLEAN.toString(), (expression25!=null?expression25.t:null).toString(), (CONDITION26!=null?CONDITION26.getLine():0), (CONDITION26!=null?CONDITION26.getCharPositionInLine():0)));
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:394:1: elseStmt : ^( ELSE statement ) ;
    public final void elseStmt() throws RecognitionException {
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:395:5: ( ^( ELSE statement ) )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:395:7: ^( ELSE statement )
            {
            match(input,ELSE,FOLLOW_ELSE_in_elseStmt1520); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_statement_in_elseStmt1522);
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:398:1: forInit : ( localVariableDeclaration | expressionList );
    public final void forInit() throws RecognitionException {
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:399:5: ( localVariableDeclaration | expressionList )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==VARDECL) ) {
                alt32=1;
            }
            else if ( (LA32_0==METHODCALL||(LA32_0>=FIELDACCESS && LA32_0<=DOTCLASS)||(LA32_0>=PREINC && LA32_0<=CAST)||LA32_0==IDENTIFIER||LA32_0==THIS||(LA32_0>=INTLITERAL && LA32_0<=NULLLITERAL)||(LA32_0>=INSTANCEOF && LA32_0<=NEW)||(LA32_0>=EQ && LA32_0<=SLASH)||(LA32_0>=99 && LA32_0<=103)||LA32_0==106) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:399:9: localVariableDeclaration
                    {
                    pushFollow(FOLLOW_localVariableDeclaration_in_forInit1542);
                    localVariableDeclaration();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:400:9: expressionList
                    {
                    pushFollow(FOLLOW_expressionList_in_forInit1552);
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:403:1: forUpdate : expressionList ;
    public final void forUpdate() throws RecognitionException {
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:404:5: ( expressionList )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:404:9: expressionList
            {
            pushFollow(FOLLOW_expressionList_in_forUpdate1571);
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:411:1: expressionList returns [ArrayList<Type> types] : ( expression )+ ;
    public final ArrayList<Type> expressionList() throws RecognitionException {
        ArrayList<Type> types = null;

        JaWalker.expression_return expression27 = null;



        	types = new ArrayList<Type>();

        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:415:5: ( ( expression )+ )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:415:9: ( expression )+
            {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:415:9: ( expression )+
            int cnt33=0;
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==METHODCALL||(LA33_0>=FIELDACCESS && LA33_0<=DOTCLASS)||(LA33_0>=PREINC && LA33_0<=CAST)||LA33_0==IDENTIFIER||LA33_0==THIS||(LA33_0>=INTLITERAL && LA33_0<=NULLLITERAL)||(LA33_0>=INSTANCEOF && LA33_0<=NEW)||(LA33_0>=EQ && LA33_0<=SLASH)||(LA33_0>=99 && LA33_0<=103)||LA33_0==106) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:415:10: expression
            	    {
            	    pushFollow(FOLLOW_expression_in_expressionList1606);
            	    expression27=expression();

            	    state._fsp--;

            	     types.add((expression27!=null?expression27.t:null)); 

            	    }
            	    break;

            	default :
            	    if ( cnt33 >= 1 ) break loop33;
                        EarlyExitException eee =
                            new EarlyExitException(33, input);
                        throw eee;
                }
                cnt33++;
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:418:1: statementExpression : expression ;
    public final void statementExpression() throws RecognitionException {
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:419:5: ( expression )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:419:9: expression
            {
            pushFollow(FOLLOW_expression_in_statementExpression1629);
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:422:1: expression returns [Type t, boolean isVar] : ( ^( EQ e1= expression e2= expression ) | ^( PLUS e1= expression e2= expression ) | ^( MINUS e1= expression e2= expression ) | ^( STAR e1= expression e2= expression ) | ^( SLASH e1= expression e2= expression ) | ^(mod= '%' e1= expression e2= expression ) | ^(or= '||' e1= expression e2= expression ) | ^(and= '&&' e1= expression e2= expression ) | ^(eq= '==' e1= expression e2= expression ) | ^(nq= '!=' e1= expression e2= expression ) | ^( INSTANCEOF e= expression type ) | ^( COMPAREOP e1= expression e2= expression ) | ^(op= ( UNARYPLUS | UNARYMINUS ) e= expression ) | ^(op= ( PREINC | PREDEC ) e= expression ) | ^(op= '!' e= expression ) | ^( CAST pt= primitiveType e= expression ) | ^( CAST npt= nonPrimitiveType e= expression ) | ^( NEW creator ) | ^(op= ( POSTINC | POSTDEC ) (s= selector | p= primary ) ) | selector | primary );
    public final JaWalker.expression_return expression() throws RecognitionException {
        JaWalker.expression_return retval = new JaWalker.expression_return();
        retval.start = input.LT(1);

        CommonTree mod=null;
        CommonTree or=null;
        CommonTree and=null;
        CommonTree eq=null;
        CommonTree nq=null;
        CommonTree op=null;
        CommonTree EQ28=null;
        CommonTree PLUS29=null;
        CommonTree MINUS30=null;
        CommonTree STAR31=null;
        CommonTree SLASH32=null;
        CommonTree INSTANCEOF34=null;
        CommonTree COMPAREOP35=null;
        CommonTree CAST36=null;
        CommonTree CAST37=null;
        JaWalker.expression_return e1 = null;

        JaWalker.expression_return e2 = null;

        JaWalker.expression_return e = null;

        BasicType pt = null;

        ComplexType npt = null;

        JaWalker.selector_return s = null;

        JaWalker.primary_return p = null;

        Type type33 = null;

        Type creator38 = null;

        JaWalker.selector_return selector39 = null;

        JaWalker.primary_return primary40 = null;


        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:423:5: ( ^( EQ e1= expression e2= expression ) | ^( PLUS e1= expression e2= expression ) | ^( MINUS e1= expression e2= expression ) | ^( STAR e1= expression e2= expression ) | ^( SLASH e1= expression e2= expression ) | ^(mod= '%' e1= expression e2= expression ) | ^(or= '||' e1= expression e2= expression ) | ^(and= '&&' e1= expression e2= expression ) | ^(eq= '==' e1= expression e2= expression ) | ^(nq= '!=' e1= expression e2= expression ) | ^( INSTANCEOF e= expression type ) | ^( COMPAREOP e1= expression e2= expression ) | ^(op= ( UNARYPLUS | UNARYMINUS ) e= expression ) | ^(op= ( PREINC | PREDEC ) e= expression ) | ^(op= '!' e= expression ) | ^( CAST pt= primitiveType e= expression ) | ^( CAST npt= nonPrimitiveType e= expression ) | ^( NEW creator ) | ^(op= ( POSTINC | POSTDEC ) (s= selector | p= primary ) ) | selector | primary )
            int alt35=21;
            alt35 = dfa35.predict(input);
            switch (alt35) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:423:9: ^( EQ e1= expression e2= expression )
                    {
                    EQ28=(CommonTree)match(input,EQ,FOLLOW_EQ_in_expression1655); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1659);
                    e1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1663);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if (!(e1!=null?e1.isVar:false)) 
                    	  	errorLog.add(new UnexpectedTypeException("variable", "value", (EQ28!=null?EQ28.getLine():0), (EQ28!=null?EQ28.getCharPositionInLine():0)));
                    	  else
                    	    	if(ruleTypeCheck((e1!=null?e1.t:null), (e2!=null?e2.t:null))) retval.t = assignOperation(EQ28, (e1!=null?e1.t:null), (e2!=null?e2.t:null));
                        	

                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:429:7: ^( PLUS e1= expression e2= expression )
                    {
                    PLUS29=(CommonTree)match(input,PLUS,FOLLOW_PLUS_in_expression1681); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1688);
                    e1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1692);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck((e1!=null?e1.t:null), (e2!=null?e2.t:null))) retval.t = plusOperation(PLUS29, (e1!=null?e1.t:null), (e2!=null?e2.t:null)); 

                    }
                    break;
                case 3 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:430:7: ^( MINUS e1= expression e2= expression )
                    {
                    MINUS30=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_expression1704); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1710);
                    e1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1714);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck((e1!=null?e1.t:null), (e2!=null?e2.t:null))) retval.t = arithmeticOperation(MINUS30, (e1!=null?e1.t:null), (e2!=null?e2.t:null)); 

                    }
                    break;
                case 4 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:431:7: ^( STAR e1= expression e2= expression )
                    {
                    STAR31=(CommonTree)match(input,STAR,FOLLOW_STAR_in_expression1726); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1733);
                    e1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1737);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck((e1!=null?e1.t:null), (e2!=null?e2.t:null))) retval.t = arithmeticOperation(STAR31,  (e1!=null?e1.t:null), (e2!=null?e2.t:null)); 

                    }
                    break;
                case 5 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:432:7: ^( SLASH e1= expression e2= expression )
                    {
                    SLASH32=(CommonTree)match(input,SLASH,FOLLOW_SLASH_in_expression1749); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1755);
                    e1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1759);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck((e1!=null?e1.t:null), (e2!=null?e2.t:null))) retval.t = arithmeticOperation(SLASH32, (e1!=null?e1.t:null), (e2!=null?e2.t:null)); 

                    }
                    break;
                case 6 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:433:9: ^(mod= '%' e1= expression e2= expression )
                    {
                    mod=(CommonTree)match(input,103,FOLLOW_103_in_expression1775); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1779);
                    e1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1783);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck((e1!=null?e1.t:null), (e2!=null?e2.t:null))) retval.t = arithmeticOperation(mod,   (e1!=null?e1.t:null), (e2!=null?e2.t:null)); 

                    }
                    break;
                case 7 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:434:9: ^(or= '||' e1= expression e2= expression )
                    {
                    or=(CommonTree)match(input,99,FOLLOW_99_in_expression1799); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1804);
                    e1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1808);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck((e1!=null?e1.t:null), (e2!=null?e2.t:null))) retval.t = booleanOperation(or,  (e1!=null?e1.t:null), (e2!=null?e2.t:null)); 

                    }
                    break;
                case 8 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:435:9: ^(and= '&&' e1= expression e2= expression )
                    {
                    and=(CommonTree)match(input,100,FOLLOW_100_in_expression1824); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1828);
                    e1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1832);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck((e1!=null?e1.t:null), (e2!=null?e2.t:null))) retval.t = booleanOperation(and, (e1!=null?e1.t:null), (e2!=null?e2.t:null)); 

                    }
                    break;
                case 9 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:436:9: ^(eq= '==' e1= expression e2= expression )
                    {
                    eq=(CommonTree)match(input,101,FOLLOW_101_in_expression1848); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1853);
                    e1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1857);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck((e1!=null?e1.t:null), (e2!=null?e2.t:null))) retval.t = booleanOperation(eq,  (e1!=null?e1.t:null), (e2!=null?e2.t:null)); 

                    }
                    break;
                case 10 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:437:9: ^(nq= '!=' e1= expression e2= expression )
                    {
                    nq=(CommonTree)match(input,102,FOLLOW_102_in_expression1873); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1878);
                    e1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1882);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck((e1!=null?e1.t:null), (e2!=null?e2.t:null))) retval.t = booleanOperation(nq,  (e1!=null?e1.t:null), (e2!=null?e2.t:null)); 

                    }
                    break;
                case 11 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:438:7: ^( INSTANCEOF e= expression type )
                    {
                    INSTANCEOF34=(CommonTree)match(input,INSTANCEOF,FOLLOW_INSTANCEOF_in_expression1894); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1898);
                    e=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_type_in_expression1900);
                    type33=type();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck((e!=null?e.t:null), type33)) { 
                    	          if ( !((e!=null?e.t:null).isComplexType() || (e!=null?e.t:null).isNull()) ) errorLog.add(new UnexpectedTypeException("reference", (e!=null?e.t:null).toString(), (INSTANCEOF34!=null?INSTANCEOF34.getLine():0), (INSTANCEOF34!=null?INSTANCEOF34.getCharPositionInLine():0)));
                    	          if (!type33.isComplexType()) errorLog.add(new UnexpectedTypeException("class or array", type33.toString(), (INSTANCEOF34!=null?INSTANCEOF34.getLine():0), (INSTANCEOF34!=null?INSTANCEOF34.getCharPositionInLine():0)));
                    	          if (!(e!=null?e.t:null).isCastableTo(type33)) errorLog.add(new InconvertibleTypesException(type33.toString(), (e!=null?e.t:null).toString(), (INSTANCEOF34!=null?INSTANCEOF34.getLine():0), (INSTANCEOF34!=null?INSTANCEOF34.getCharPositionInLine():0)));
                    	          retval.t = BasicType.BOOLEAN;
                              } 
                            

                    }
                    break;
                case 12 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:446:7: ^( COMPAREOP e1= expression e2= expression )
                    {
                    COMPAREOP35=(CommonTree)match(input,COMPAREOP,FOLLOW_COMPAREOP_in_expression1920); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1924);
                    e1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1928);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck((e1!=null?e1.t:null), (e2!=null?e2.t:null))) { 
                    	    	  if ( !((e1!=null?e1.t:null).isNumeric() && (e2!=null?e2.t:null).isNumeric()) ) errorLog.add(new CannotBeAppliedToException((COMPAREOP35!=null?COMPAREOP35.getText():null), (e1!=null?e1.t:null).toString(), (e2!=null?e2.t:null).toString(), (COMPAREOP35!=null?COMPAREOP35.getLine():0), (COMPAREOP35!=null?COMPAREOP35.getCharPositionInLine():0)));
                    	    	  retval.t = BasicType.BOOLEAN;
                        	  } 
                        	

                    }
                    break;
                case 13 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:452:9: ^(op= ( UNARYPLUS | UNARYMINUS ) e= expression )
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
                    pushFollow(FOLLOW_expression_in_expression1959);
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
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:461:9: ^(op= ( PREINC | PREDEC ) e= expression )
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
                    pushFollow(FOLLOW_expression_in_expression1995);
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
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:473:7: ^(op= '!' e= expression )
                    {
                    op=(CommonTree)match(input,106,FOLLOW_106_in_expression2019); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression2023);
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
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:479:9: ^( CAST pt= primitiveType e= expression )
                    {
                    CAST36=(CommonTree)match(input,CAST,FOLLOW_CAST_in_expression2042); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_primitiveType_in_expression2046);
                    pt=primitiveType();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression2050);
                    e=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck(pt, (e!=null?e.t:null))) {
                    	    	  if (!(e!=null?e.t:null).isCastableTo(pt)) errorLog.add(new InconvertibleTypesException(pt.toString(), (e!=null?e.t:null).toString(), (CAST36!=null?CAST36.getLine():0), (CAST36!=null?CAST36.getCharPositionInLine():0)));
                    	    	  retval.t = pt;
                        	  }
                        	

                    }
                    break;
                case 17 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:485:9: ^( CAST npt= nonPrimitiveType e= expression )
                    {
                    CAST37=(CommonTree)match(input,CAST,FOLLOW_CAST_in_expression2069); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_nonPrimitiveType_in_expression2073);
                    npt=nonPrimitiveType();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression2077);
                    e=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck(npt, (e!=null?e.t:null))) {
                    	    	  if (!(e!=null?e.t:null).isCastableTo(npt)) errorLog.add(new InconvertibleTypesException(npt.toString(), (e!=null?e.t:null).toString(), (CAST37!=null?CAST37.getLine():0), (CAST37!=null?CAST37.getCharPositionInLine():0)));
                    	    	  retval.t = npt;
                        	  }
                        	

                    }
                    break;
                case 18 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:491:9: ^( NEW creator )
                    {
                    match(input,NEW,FOLLOW_NEW_in_expression2096); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_creator_in_expression2098);
                    creator38=creator();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     retval.t = creator38; 

                    }
                    break;
                case 19 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:492:7: ^(op= ( POSTINC | POSTDEC ) (s= selector | p= primary ) )
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
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:492:32: (s= selector | p= primary )
                    int alt34=2;
                    switch ( input.LA(1) ) {
                    case FIELDACCESS:
                        {
                        int LA34_1 = input.LA(2);

                        if ( (LA34_1==DOWN) ) {
                            int LA34_5 = input.LA(3);

                            if ( (LA34_5==SUPER) ) {
                                alt34=2;
                            }
                            else if ( (LA34_5==METHODCALL||(LA34_5>=FIELDACCESS && LA34_5<=DOTCLASS)||(LA34_5>=PREINC && LA34_5<=CAST)||LA34_5==IDENTIFIER||LA34_5==THIS||(LA34_5>=INTLITERAL && LA34_5<=NULLLITERAL)||(LA34_5>=INSTANCEOF && LA34_5<=NEW)||(LA34_5>=EQ && LA34_5<=SLASH)||(LA34_5>=99 && LA34_5<=103)||LA34_5==106) ) {
                                alt34=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 34, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 34, 1, input);

                            throw nvae;
                        }
                        }
                        break;
                    case METHODCALL:
                        {
                        int LA34_2 = input.LA(2);

                        if ( (LA34_2==DOWN) ) {
                            int LA34_6 = input.LA(3);

                            if ( (LA34_6==SUPER) ) {
                                alt34=2;
                            }
                            else if ( (LA34_6==METHODCALL||(LA34_6>=FIELDACCESS && LA34_6<=DOTCLASS)||(LA34_6>=PREINC && LA34_6<=CAST)||LA34_6==IDENTIFIER||LA34_6==THIS||(LA34_6>=INTLITERAL && LA34_6<=NULLLITERAL)||(LA34_6>=INSTANCEOF && LA34_6<=NEW)||(LA34_6>=EQ && LA34_6<=SLASH)||(LA34_6>=99 && LA34_6<=103)||LA34_6==106) ) {
                                alt34=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 34, 6, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 34, 2, input);

                            throw nvae;
                        }
                        }
                        break;
                    case ARRAYACCESS:
                        {
                        alt34=1;
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
                        alt34=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 0, input);

                        throw nvae;
                    }

                    switch (alt34) {
                        case 1 :
                            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:492:33: s= selector
                            {
                            pushFollow(FOLLOW_selector_in_expression2123);
                            s=selector();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:492:46: p= primary
                            {
                            pushFollow(FOLLOW_primary_in_expression2129);
                            p=primary();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                     Type t = null;
                         	  boolean isVar = false;
                         	  // Recupero i dati dalla regola che e' stata applicata
                         	  if( s != null ) { t = (s!=null?s.t:null); isVar = (s!=null?s.isVar:false); }
                         	  if( p != null ) { t = (p!=null?p.t:null); isVar = (p!=null?p.isVar:false); }  
                         	  
                         	  if (!isVar) {
                         	  	errorLog.add(new UnexpectedTypeException("variable", "value", (op!=null?op.getLine():0), (op!=null?op.getCharPositionInLine():0)));
                         	  } else {
                    	     	  if (ruleTypeCheck(t)) {
                    		     	  if (!t.isNumeric())
                    		     	  	errorLog.add(new CannotBeAppliedToException((op!=null?op.getText():null), t.toString(), "", (op!=null?op.getLine():0), (op!=null?op.getCharPositionInLine():0)));+
                    		     	  else
                    		     	  	retval.t = t;    	  
                    	    	  }
                        	  }    	  
                        	

                    }
                    break;
                case 20 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:511:9: selector
                    {
                    pushFollow(FOLLOW_selector_in_expression2154);
                    selector39=selector();

                    state._fsp--;

                     retval.t = (selector39!=null?selector39.t:null); retval.isVar = (selector39!=null?selector39.isVar:false); 

                    }
                    break;
                case 21 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:512:9: primary
                    {
                    pushFollow(FOLLOW_primary_in_expression2166);
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:515:1: primary returns [Type t, boolean isVar] : ( THIS | superMemberAccess | literal | IDENTIFIER | ^( DOTCLASS ^( ARRAYTYPE type ) ) | ^( DOTCLASS IDENTIFIER ) | ^( DOTCLASS primitiveType ) | ^( DOTCLASS VOID ) );
    public final JaWalker.primary_return primary() throws RecognitionException {
        JaWalker.primary_return retval = new JaWalker.primary_return();
        retval.start = input.LT(1);

        CommonTree IDENTIFIER43=null;
        Type superMemberAccess41 = null;

        Type literal42 = null;


        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:517:5: ( THIS | superMemberAccess | literal | IDENTIFIER | ^( DOTCLASS ^( ARRAYTYPE type ) ) | ^( DOTCLASS IDENTIFIER ) | ^( DOTCLASS primitiveType ) | ^( DOTCLASS VOID ) )
            int alt36=8;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:517:7: THIS
                    {
                    match(input,THIS,FOLLOW_THIS_in_primary2207); 
                     retval.t = rt; 

                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:518:9: superMemberAccess
                    {
                    pushFollow(FOLLOW_superMemberAccess_in_primary2219);
                    superMemberAccess41=superMemberAccess();

                    state._fsp--;

                     retval.t = superMemberAccess41; 

                    }
                    break;
                case 3 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:519:9: literal
                    {
                    pushFollow(FOLLOW_literal_in_primary2231);
                    literal42=literal();

                    state._fsp--;

                     retval.t = literal42; 

                    }
                    break;
                case 4 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:520:9: IDENTIFIER
                    {
                    IDENTIFIER43=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary2243); 
                     retval.isVar = true;
                        	  retval.t = getVariableType((IDENTIFIER43!=null?IDENTIFIER43.getText():null)); 
                        	  if (retval.t == null) errorLog.add(new CannotFindSymbolException(("variable " + (IDENTIFIER43!=null?IDENTIFIER43.getText():null)), getMethodSignature(), (IDENTIFIER43!=null?IDENTIFIER43.getLine():0), (IDENTIFIER43!=null?IDENTIFIER43.getCharPositionInLine():0)));
                        	

                    }
                    break;
                case 5 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:526:9: ^( DOTCLASS ^( ARRAYTYPE type ) )
                    {
                    match(input,DOTCLASS,FOLLOW_DOTCLASS_in_primary2267); 

                    match(input, Token.DOWN, null); 
                    match(input,ARRAYTYPE,FOLLOW_ARRAYTYPE_in_primary2270); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_in_primary2272);
                    type();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 
                     retval.t = ReferenceType.CLASS; 

                    }
                    break;
                case 6 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:527:7: ^( DOTCLASS IDENTIFIER )
                    {
                    match(input,DOTCLASS,FOLLOW_DOTCLASS_in_primary2287); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary2289); 

                    match(input, Token.UP, null); 
                     retval.t = ReferenceType.CLASS; 

                    }
                    break;
                case 7 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:528:9: ^( DOTCLASS primitiveType )
                    {
                    match(input,DOTCLASS,FOLLOW_DOTCLASS_in_primary2310); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_primitiveType_in_primary2312);
                    primitiveType();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     retval.t = ReferenceType.CLASS; 

                    }
                    break;
                case 8 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:529:9: ^( DOTCLASS VOID )
                    {
                    match(input,DOTCLASS,FOLLOW_DOTCLASS_in_primary2330); 

                    match(input, Token.DOWN, null); 
                    match(input,VOID,FOLLOW_VOID_in_primary2332); 

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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:532:1: selector returns [Type t, boolean isVar] : ( ^( FIELDACCESS expression IDENTIFIER ) | ^( METHODCALL expression IDENTIFIER ( arguments )? ) | ^( ARRAYACCESS e1= expression e2= expression ) );
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
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:533:5: ( ^( FIELDACCESS expression IDENTIFIER ) | ^( METHODCALL expression IDENTIFIER ( arguments )? ) | ^( ARRAYACCESS e1= expression e2= expression ) )
            int alt38=3;
            switch ( input.LA(1) ) {
            case FIELDACCESS:
                {
                alt38=1;
                }
                break;
            case METHODCALL:
                {
                alt38=2;
                }
                break;
            case ARRAYACCESS:
                {
                alt38=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:533:9: ^( FIELDACCESS expression IDENTIFIER )
                    {
                    match(input,FIELDACCESS,FOLLOW_FIELDACCESS_in_selector2376); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_selector2378);
                    expression44=expression();

                    state._fsp--;

                    IDENTIFIER45=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_selector2380); 

                    match(input, Token.UP, null); 
                     retval.isVar = true;
                        	  if(ruleTypeCheck((expression44!=null?expression44.t:null))) {
                    	    	  if (!(expression44!=null?expression44.t:null).isReference())
                    	    	  	errorLog.add(new CannotBeDereferencedException((expression44!=null?expression44.t:null).toString(), (IDENTIFIER45!=null?IDENTIFIER45.getLine():0), (IDENTIFIER45!=null?IDENTIFIER45.getCharPositionInLine():0))); 
                    	    	  ReferenceType expt = (ReferenceType)(expression44!=null?expression44.t:null);
                    	    	  boolean isSameClass = (expt.getName().equals(rt.getName())); 
                    	    	  retval.t = expt.getField(isSameClass, (IDENTIFIER45!=null?IDENTIFIER45.getText():null));
                    		  if (retval.t == null) errorLog.add(new CannotFindSymbolException(("field " + (IDENTIFIER45!=null?IDENTIFIER45.getText():null)), expt.getName(), (IDENTIFIER45!=null?IDENTIFIER45.getLine():0), (IDENTIFIER45!=null?IDENTIFIER45.getCharPositionInLine():0)));
                        	  }
                        	

                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:544:7: ^( METHODCALL expression IDENTIFIER ( arguments )? )
                    {
                    match(input,METHODCALL,FOLLOW_METHODCALL_in_selector2399); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_selector2401);
                    expression46=expression();

                    state._fsp--;

                    IDENTIFIER48=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_selector2403); 
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:544:42: ( arguments )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==ARGUMENTS) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:544:42: arguments
                            {
                            pushFollow(FOLLOW_arguments_in_selector2405);
                            arguments47=arguments();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                     // Se ci sono argomenti, bisogna richiamare ruleTypeCheck su di essi
                              if( ruleTypeCheck((expression46!=null?expression46.t:null)) && ((arguments47!=null?arguments47.types:null) == null || ruleTypeCheck((arguments47!=null?arguments47.types:null).toArray(new Type[(arguments47!=null?arguments47.types:null).size()]))) ) {
                    	    	  if (!(expression46!=null?expression46.t:null).isReference())
                    	    	  	errorLog.add(new CannotBeDereferencedException((expression46!=null?expression46.t:null).toString(), (IDENTIFIER48!=null?IDENTIFIER48.getLine():0), (IDENTIFIER48!=null?IDENTIFIER48.getCharPositionInLine():0))); 
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
                    break;
                case 3 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:559:9: ^( ARRAYACCESS e1= expression e2= expression )
                    {
                    ARRAYACCESS49=(CommonTree)match(input,ARRAYACCESS,FOLLOW_ARRAYACCESS_in_selector2428); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_selector2432);
                    e1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_selector2436);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if (ruleTypeCheck((e1!=null?e1.t:null), (e2!=null?e2.t:null))) {
                    	    	  if (!(e1!=null?e1.t:null).isArray()) errorLog.add(new ArrayRequiredException((e1!=null?e1.t:null).toString(), (ARRAYACCESS49!=null?ARRAYACCESS49.getLine():0), (ARRAYACCESS49!=null?ARRAYACCESS49.getCharPositionInLine():0)));
                    	    	  arrayExprCheck(ARRAYACCESS49, (e2!=null?e2.t:null));
                    	    	  retval.t = ((ArrayType)(e1!=null?e1.t:null)).getHostType(); 
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:568:1: creator returns [Type t] : (acr= arrayCreatorRest ( arrayInitializer[$acr.t.getHostType()] )? | createdName ( classCreatorRest )? );
    public final Type creator() throws RecognitionException {
        Type t = null;

        ArrayType acr = null;


        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:569:5: (acr= arrayCreatorRest ( arrayInitializer[$acr.t.getHostType()] )? | createdName ( classCreatorRest )? )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==ARRAYTYPE) ) {
                alt41=1;
            }
            else if ( (LA41_0==IDENTIFIER||(LA41_0>=CHAR && LA41_0<=BOOLEAN)) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:569:10: acr= arrayCreatorRest ( arrayInitializer[$acr.t.getHostType()] )?
                    {
                    pushFollow(FOLLOW_arrayCreatorRest_in_creator2471);
                    acr=arrayCreatorRest();

                    state._fsp--;

                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:569:31: ( arrayInitializer[$acr.t.getHostType()] )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==ARRAYINIT) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:569:31: arrayInitializer[$acr.t.getHostType()]
                            {
                            pushFollow(FOLLOW_arrayInitializer_in_creator2473);
                            arrayInitializer(acr.getHostType());

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:570:10: createdName ( classCreatorRest )?
                    {
                    pushFollow(FOLLOW_createdName_in_creator2486);
                    createdName();

                    state._fsp--;

                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:570:22: ( classCreatorRest )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==ARGUMENTS) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:570:22: classCreatorRest
                            {
                            pushFollow(FOLLOW_classCreatorRest_in_creator2488);
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:574:1: createdName returns [Type t] : ( classType | primitiveType );
    public final Type createdName() throws RecognitionException {
        Type t = null;

        ReferenceType classType50 = null;

        BasicType primitiveType51 = null;


        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:575:5: ( classType | primitiveType )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==IDENTIFIER) ) {
                alt42=1;
            }
            else if ( ((LA42_0>=CHAR && LA42_0<=BOOLEAN)) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:575:9: classType
                    {
                    pushFollow(FOLLOW_classType_in_createdName2514);
                    classType50=classType();

                    state._fsp--;

                     t = classType50;      

                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:576:9: primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_createdName2530);
                    primitiveType51=primitiveType();

                    state._fsp--;

                     t = primitiveType51; 

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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:579:1: arrayCreatorRest returns [ArrayType t] : ( ^( ARRAYTYPE acr= arrayCreatorRest ) | ^( ARRAYTYPE createdName ) | ^( ARRAYTYPE e= expression acre= arrayCreatorRestExpr ) );
    public final ArrayType arrayCreatorRest() throws RecognitionException {
        ArrayType t = null;

        CommonTree ARRAYTYPE53=null;
        ArrayType acr = null;

        JaWalker.expression_return e = null;

        Type acre = null;

        Type createdName52 = null;


        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:580:5: ( ^( ARRAYTYPE acr= arrayCreatorRest ) | ^( ARRAYTYPE createdName ) | ^( ARRAYTYPE e= expression acre= arrayCreatorRestExpr ) )
            int alt43=3;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==ARRAYTYPE) ) {
                int LA43_1 = input.LA(2);

                if ( (LA43_1==DOWN) ) {
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
                    case IDENTIFIER:
                        {
                        int LA43_4 = input.LA(4);

                        if ( (LA43_4==ARRAYTYPE||LA43_4==IDENTIFIER||(LA43_4>=CHAR && LA43_4<=BOOLEAN)) ) {
                            alt43=3;
                        }
                        else if ( (LA43_4==UP) ) {
                            alt43=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 43, 4, input);

                            throw nvae;
                        }
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
                        alt43=2;
                        }
                        break;
                    case ARRAYTYPE:
                        {
                        alt43=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 1, input);

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
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:580:8: ^( ARRAYTYPE acr= arrayCreatorRest )
                    {
                    match(input,ARRAYTYPE,FOLLOW_ARRAYTYPE_in_arrayCreatorRest2559); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_arrayCreatorRest_in_arrayCreatorRest2563);
                    acr=arrayCreatorRest();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if (ruleTypeCheck(acr)) t = (ArrayType)ParserHelper.createArrayType(acr, 1); 

                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:582:7: ^( ARRAYTYPE createdName )
                    {
                    match(input,ARRAYTYPE,FOLLOW_ARRAYTYPE_in_arrayCreatorRest2583); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_createdName_in_arrayCreatorRest2585);
                    createdName52=createdName();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if (ruleTypeCheck(createdName52)) t = (ArrayType)ParserHelper.createArrayType(createdName52, 1); 

                    }
                    break;
                case 3 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:583:9: ^( ARRAYTYPE e= expression acre= arrayCreatorRestExpr )
                    {
                    ARRAYTYPE53=(CommonTree)match(input,ARRAYTYPE,FOLLOW_ARRAYTYPE_in_arrayCreatorRest2599); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_arrayCreatorRest2603);
                    e=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_arrayCreatorRestExpr_in_arrayCreatorRest2607);
                    acre=arrayCreatorRestExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if (ruleTypeCheck(acre)) t = (ArrayType)ParserHelper.createArrayType(acre, 1); 
                        	  if (ruleTypeCheck((e!=null?e.t:null))) arrayExprCheck(ARRAYTYPE53, (e!=null?e.t:null));
                           	

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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:589:1: arrayCreatorRestExpr returns [Type t] : ( ( ^( ARRAYTYPE e= expression acr= arrayCreatorRest ) ) | createdName );
    public final Type arrayCreatorRestExpr() throws RecognitionException {
        Type t = null;

        CommonTree ARRAYTYPE54=null;
        JaWalker.expression_return e = null;

        ArrayType acr = null;

        Type createdName55 = null;


        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:590:5: ( ( ^( ARRAYTYPE e= expression acr= arrayCreatorRest ) ) | createdName )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==ARRAYTYPE) ) {
                alt44=1;
            }
            else if ( (LA44_0==IDENTIFIER||(LA44_0>=CHAR && LA44_0<=BOOLEAN)) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:590:8: ( ^( ARRAYTYPE e= expression acr= arrayCreatorRest ) )
                    {
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:590:8: ( ^( ARRAYTYPE e= expression acr= arrayCreatorRest ) )
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:590:9: ^( ARRAYTYPE e= expression acr= arrayCreatorRest )
                    {
                    ARRAYTYPE54=(CommonTree)match(input,ARRAYTYPE,FOLLOW_ARRAYTYPE_in_arrayCreatorRestExpr2640); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_arrayCreatorRestExpr2644);
                    e=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_arrayCreatorRest_in_arrayCreatorRestExpr2648);
                    acr=arrayCreatorRest();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }

                     if (ruleTypeCheck(acr)) t = (ComplexType)ParserHelper.createArrayType(acr, 1); 
                        	 if (ruleTypeCheck((e!=null?e.t:null))) arrayExprCheck(ARRAYTYPE54, (e!=null?e.t:null));
                           

                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:594:8: createdName
                    {
                    pushFollow(FOLLOW_createdName_in_arrayCreatorRestExpr2668);
                    createdName55=createdName();

                    state._fsp--;

                     if (ruleTypeCheck(createdName55)) t = createdName55; 

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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:597:1: classCreatorRest returns [ArrayList<Type> types] : arguments ;
    public final ArrayList<Type> classCreatorRest() throws RecognitionException {
        ArrayList<Type> types = null;

        JaWalker.arguments_return arguments56 = null;


        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:598:5: ( arguments )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:598:9: arguments
            {
            pushFollow(FOLLOW_arguments_in_classCreatorRest2693);
            arguments56=arguments();

            state._fsp--;

             types = (arguments56!=null?arguments56.types:null); 

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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:601:1: superMemberAccess returns [Type t] : ( ^( METHODCALL SUPER IDENTIFIER ( arguments )? ) | ^( FIELDACCESS SUPER IDENTIFIER ) );
    public final Type superMemberAccess() throws RecognitionException {
        Type t = null;

        CommonTree IDENTIFIER58=null;
        CommonTree IDENTIFIER59=null;
        JaWalker.arguments_return arguments57 = null;


        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:602:5: ( ^( METHODCALL SUPER IDENTIFIER ( arguments )? ) | ^( FIELDACCESS SUPER IDENTIFIER ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==METHODCALL) ) {
                alt46=1;
            }
            else if ( (LA46_0==FIELDACCESS) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:602:7: ^( METHODCALL SUPER IDENTIFIER ( arguments )? )
                    {
                    match(input,METHODCALL,FOLLOW_METHODCALL_in_superMemberAccess2725); 

                    match(input, Token.DOWN, null); 
                    match(input,SUPER,FOLLOW_SUPER_in_superMemberAccess2727); 
                    IDENTIFIER58=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_superMemberAccess2729); 
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:602:37: ( arguments )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==ARGUMENTS) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:602:37: arguments
                            {
                            pushFollow(FOLLOW_arguments_in_superMemberAccess2731);
                            arguments57=arguments();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                     if( (arguments57!=null?arguments57.types:null) == null || ruleTypeCheck((arguments57!=null?arguments57.types:null).toArray(new Type[(arguments57!=null?arguments57.types:null).size()])) ) {
                    	    	  try {
                    	          	t = rt.getSuperClass().bindMethod(false, (IDENTIFIER58!=null?IDENTIFIER58.getText():null), (arguments57!=null?arguments57.types:null));
                    		  } catch (EarlyBindingException ex) {
                    		   	errorLog.add(new CannotFindSymbolException(("method " + (IDENTIFIER58!=null?IDENTIFIER58.getText():null) + '(' + printArguments((arguments57!=null?arguments57.types:null)) + ')'), rt.getSuperClass().getName(), (IDENTIFIER58!=null?IDENTIFIER58.getLine():0), (IDENTIFIER58!=null?IDENTIFIER58.getCharPositionInLine():0)));
                    		  }
                    	  }
                        	

                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:611:9: ^( FIELDACCESS SUPER IDENTIFIER )
                    {
                    match(input,FIELDACCESS,FOLLOW_FIELDACCESS_in_superMemberAccess2752); 

                    match(input, Token.DOWN, null); 
                    match(input,SUPER,FOLLOW_SUPER_in_superMemberAccess2754); 
                    IDENTIFIER59=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_superMemberAccess2756); 

                    match(input, Token.UP, null); 
                     t = rt.getSuperClass().getField(false, (IDENTIFIER59!=null?IDENTIFIER59.getText():null));
                    	  if (t == null) errorLog.add(new CannotFindSymbolException(("field " + (IDENTIFIER59!=null?IDENTIFIER59.getText():null)), rt.getSuperClass().getName(), (IDENTIFIER59!=null?IDENTIFIER59.getLine():0), (IDENTIFIER59!=null?IDENTIFIER59.getCharPositionInLine():0))); 
                    	

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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:617:1: arguments returns [ArrayList<Type> types] : ^( ARGUMENTS expressionList ) ;
    public final JaWalker.arguments_return arguments() throws RecognitionException {
        JaWalker.arguments_return retval = new JaWalker.arguments_return();
        retval.start = input.LT(1);

        ArrayList<Type> expressionList60 = null;


        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:618:5: ( ^( ARGUMENTS expressionList ) )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:618:8: ^( ARGUMENTS expressionList )
            {
            match(input,ARGUMENTS,FOLLOW_ARGUMENTS_in_arguments2797); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expressionList_in_arguments2799);
            expressionList60=expressionList();

            state._fsp--;


            match(input, Token.UP, null); 
             retval.types = expressionList60; 

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


    protected DFA31 dfa31 = new DFA31(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA36 dfa36 = new DFA36(this);
    static final String DFA31_eotS =
        "\12\uffff";
    static final String DFA31_eofS =
        "\12\uffff";
    static final String DFA31_minS =
        "\1\24\5\uffff\1\2\3\uffff";
    static final String DFA31_maxS =
        "\1\100\5\uffff\1\100\3\uffff";
    static final String DFA31_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff\1\10\1\6\1\7";
    static final String DFA31_specialS =
        "\12\uffff}>";
    static final String[] DFA31_transitionS = {
            "\1\1\1\7\3\uffff\1\5\42\uffff\1\2\1\3\1\4\1\uffff\1\6",
            "",
            "",
            "",
            "",
            "",
            "\1\10\1\11\17\uffff\3\11\3\uffff\1\11\42\uffff\3\11\1\uffff"+
            "\1\11",
            "",
            "",
            ""
    };

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "370:1: statement : ( ^( BLOCK block ) | ^( IF condition ( ^( THEN statement ) )? ( elseStmt )? ) | ^( FOR ( ^( INIT forInit ) )? ( condition )? ( ^( UPDATE forUpdate ) )? statement ) | ^( WHILE condition statement ) | ^( DOWHILE condition statement ) | ^( RETURN expression ) | RETURN | ^( STMT statementExpression ) );";
        }
    }
    static final String DFA35_eotS =
        "\34\uffff";
    static final String DFA35_eofS =
        "\34\uffff";
    static final String DFA35_minS =
        "\1\4\17\uffff\1\2\2\uffff\2\2\2\uffff\1\11\2\4\2\uffff";
    static final String DFA35_maxS =
        "\1\152\17\uffff\1\2\2\uffff\2\2\2\uffff\1\61\2\152\2\uffff";
    static final String DFA35_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\uffff\1\22\1\23\2\uffff\1\24\1\25\3\uffff\1\21\1"+
        "\20";
    static final String DFA35_specialS =
        "\34\uffff}>";
    static final String[] DFA35_transitionS = {
            "\1\24\1\uffff\1\23\1\25\1\26\23\uffff\1\16\1\22\1\16\1\22\2"+
            "\15\1\20\2\uffff\1\26\14\uffff\1\26\1\uffff\10\26\6\uffff\1"+
            "\13\1\14\1\21\13\uffff\1\1\1\2\1\3\1\4\1\5\16\uffff\1\7\1\10"+
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
            "\1\32\33\uffff\1\32\4\uffff\10\33",
            "\1\25\1\uffff\3\25\23\uffff\7\25\2\uffff\1\25\14\uffff\1\25"+
            "\1\26\10\25\6\uffff\3\25\13\uffff\5\25\16\uffff\5\25\2\uffff"+
            "\1\25",
            "\1\25\1\uffff\3\25\23\uffff\7\25\2\uffff\1\25\14\uffff\1\25"+
            "\1\26\10\25\6\uffff\3\25\13\uffff\5\25\16\uffff\5\25\2\uffff"+
            "\1\25",
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
            return "422:1: expression returns [Type t, boolean isVar] : ( ^( EQ e1= expression e2= expression ) | ^( PLUS e1= expression e2= expression ) | ^( MINUS e1= expression e2= expression ) | ^( STAR e1= expression e2= expression ) | ^( SLASH e1= expression e2= expression ) | ^(mod= '%' e1= expression e2= expression ) | ^(or= '||' e1= expression e2= expression ) | ^(and= '&&' e1= expression e2= expression ) | ^(eq= '==' e1= expression e2= expression ) | ^(nq= '!=' e1= expression e2= expression ) | ^( INSTANCEOF e= expression type ) | ^( COMPAREOP e1= expression e2= expression ) | ^(op= ( UNARYPLUS | UNARYMINUS ) e= expression ) | ^(op= ( PREINC | PREDEC ) e= expression ) | ^(op= '!' e= expression ) | ^( CAST pt= primitiveType e= expression ) | ^( CAST npt= nonPrimitiveType e= expression ) | ^( NEW creator ) | ^(op= ( POSTINC | POSTDEC ) (s= selector | p= primary ) ) | selector | primary );";
        }
    }
    static final String DFA36_eotS =
        "\13\uffff";
    static final String DFA36_eofS =
        "\13\uffff";
    static final String DFA36_minS =
        "\1\4\4\uffff\1\2\1\11\4\uffff";
    static final String DFA36_maxS =
        "\1\73\4\uffff\1\2\1\61\4\uffff";
    static final String DFA36_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\2\uffff\1\5\1\6\1\10\1\7";
    static final String DFA36_specialS =
        "\13\uffff}>";
    static final String[] DFA36_transitionS = {
            "\1\2\1\uffff\1\2\1\uffff\1\5\34\uffff\1\4\14\uffff\1\1\1\uffff"+
            "\10\3",
            "",
            "",
            "",
            "",
            "\1\6",
            "\1\7\33\uffff\1\10\2\uffff\1\11\1\uffff\10\12",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA36_eot = DFA.unpackEncodedString(DFA36_eotS);
    static final short[] DFA36_eof = DFA.unpackEncodedString(DFA36_eofS);
    static final char[] DFA36_min = DFA.unpackEncodedStringToUnsignedChars(DFA36_minS);
    static final char[] DFA36_max = DFA.unpackEncodedStringToUnsignedChars(DFA36_maxS);
    static final short[] DFA36_accept = DFA.unpackEncodedString(DFA36_acceptS);
    static final short[] DFA36_special = DFA.unpackEncodedString(DFA36_specialS);
    static final short[][] DFA36_transition;

    static {
        int numStates = DFA36_transitionS.length;
        DFA36_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA36_transition[i] = DFA.unpackEncodedString(DFA36_transitionS[i]);
        }
    }

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = DFA36_eot;
            this.eof = DFA36_eof;
            this.min = DFA36_min;
            this.max = DFA36_max;
            this.accept = DFA36_accept;
            this.special = DFA36_special;
            this.transition = DFA36_transition;
        }
        public String getDescription() {
            return "515:1: primary returns [Type t, boolean isVar] : ( THIS | superMemberAccess | literal | IDENTIFIER | ^( DOTCLASS ^( ARRAYTYPE type ) ) | ^( DOTCLASS IDENTIFIER ) | ^( DOTCLASS primitiveType ) | ^( DOTCLASS VOID ) );";
        }
    }
 

    public static final BitSet FOLLOW_classDeclaration_in_compilationUnit63 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_compilationUnit72 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_in_classDeclaration96 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classDeclaration98 = new BitSet(new long[]{0x0000002800000000L});
    public static final BitSet FOLLOW_classType_in_classDeclaration102 = new BitSet(new long[]{0x0000002800000000L});
    public static final BitSet FOLLOW_classBody_in_classDeclaration105 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASSBODY_in_classBody131 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_classBodyDeclaration_in_classBody133 = new BitSet(new long[]{0x0000000000001C08L});
    public static final BitSet FOLLOW_memberDeclaration_in_classBodyDeclaration154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldDeclaration_in_memberDeclaration177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodAndConstructorDeclaration_in_memberDeclaration185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_METHOD_in_methodAndConstructorDeclaration219 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifier_in_methodAndConstructorDeclaration221 = new BitSet(new long[]{0x0003FC2000000200L});
    public static final BitSet FOLLOW_type_in_methodAndConstructorDeclaration223 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_methodDeclaration_in_methodAndConstructorDeclaration227 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_METHOD_in_methodAndConstructorDeclaration242 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifier_in_methodAndConstructorDeclaration244 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_VOID_in_methodAndConstructorDeclaration246 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_methodAndConstructorDeclaration248 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_voidMethodDeclaratorRest_in_methodAndConstructorDeclaration252 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONSTR_in_methodAndConstructorDeclaration267 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifier_in_methodAndConstructorDeclaration269 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_methodAndConstructorDeclaration271 = new BitSet(new long[]{0x0000000000042008L});
    public static final BitSet FOLLOW_formalParameters_in_methodAndConstructorDeclaration275 = new BitSet(new long[]{0x0000000000040008L});
    public static final BitSet FOLLOW_constructorBody_in_methodAndConstructorDeclaration278 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_methodDeclaration309 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_formalParameters_in_methodDeclaration313 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_methodBody_in_methodDeclaration316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIELD_in_fieldDeclaration336 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifier_in_fieldDeclaration338 = new BitSet(new long[]{0x0003FC2000000200L});
    public static final BitSet FOLLOW_variableDeclarator_in_fieldDeclaration340 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_formalParameters_in_voidMethodDeclaratorRest363 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_methodBody_in_voidMethodDeclaratorRest366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_variableDeclarator389 = new BitSet(new long[]{0x0FF40027F80001D2L,0x000004F8001F001CL});
    public static final BitSet FOLLOW_variableInitializer_in_variableDeclarator394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_variableDeclaratorId424 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_variableDeclaratorId426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayInitializer_in_variableInitializer462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_variableInitializer481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAYINIT_in_arrayInitializer515 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableInitializer_in_arrayInitializer517 = new BitSet(new long[]{0x0FF40027F80001D8L,0x000004F8001F001CL});
    public static final BitSet FOLLOW_set_in_modifier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonPrimitiveType_in_type578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_type588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAYTYPE_in_nonPrimitiveType616 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_nonPrimitiveType_in_nonPrimitiveType620 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_classType_in_nonPrimitiveType633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAYTYPE_in_nonPrimitiveType667 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primitiveType_in_nonPrimitiveType669 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classType700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_primitiveType731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BYTE_in_primitiveType746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHORT_in_primitiveType761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_primitiveType775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_in_primitiveType791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_primitiveType806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_primitiveType820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_primitiveType833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FPARMS_in_formalParameters859 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_formalParameterDecls_in_formalParameters861 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FPARM_in_formalParameterDecls886 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_formalParameterDecls888 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_formalParameterDecls_in_formalParameterDecls893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MBODY_in_methodBody919 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_methodBody921 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CBODY_in_constructorBody980 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_explicitConstructorInvocation_in_constructorBody982 = new BitSet(new long[]{0x7000000002380008L,0x0000000000000001L});
    public static final BitSet FOLLOW_blockStatement_in_constructorBody985 = new BitSet(new long[]{0x7000000002380008L,0x0000000000000001L});
    public static final BitSet FOLLOW_CONSTRCALL_in_explicitConstructorInvocation1007 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_THIS_in_explicitConstructorInvocation1009 = new BitSet(new long[]{0x0000000000004008L});
    public static final BitSet FOLLOW_arguments_in_explicitConstructorInvocation1012 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONSTRCALL_in_explicitConstructorInvocation1033 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SUPER_in_explicitConstructorInvocation1035 = new BitSet(new long[]{0x0000000000004008L});
    public static final BitSet FOLLOW_arguments_in_explicitConstructorInvocation1037 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INTLITERAL_in_literal1069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONGLITERAL_in_literal1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOATLITERAL_in_literal1100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLELITERAL_in_literal1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARLITERAL_in_literal1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_literal1140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_literal1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULLLITERAL_in_literal1165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockStatement_in_block1201 = new BitSet(new long[]{0x7000000002380002L,0x0000000000000001L});
    public static final BitSet FOLLOW_localVariableDeclarationStatement_in_blockStatement1225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_blockStatement1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localVariableDeclaration_in_localVariableDeclarationStatement1257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARDECL_in_localVariableDeclaration1275 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableDeclarator_in_localVariableDeclaration1277 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLOCK_in_statement1314 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_statement1316 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_in_statement1328 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_condition_in_statement1330 = new BitSet(new long[]{0x0000000004000008L,0x0000000000000002L});
    public static final BitSet FOLLOW_THEN_in_statement1334 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_statement1336 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_elseStmt_in_statement1341 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FOR_in_statement1354 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INIT_in_statement1358 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_forInit_in_statement1360 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_condition_in_statement1365 = new BitSet(new long[]{0x7000000003380000L,0x0000000000000001L});
    public static final BitSet FOLLOW_UPDATE_in_statement1370 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_forUpdate_in_statement1372 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_statement_in_statement1377 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WHILE_in_statement1390 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_condition_in_statement1392 = new BitSet(new long[]{0x7000000002380000L,0x0000000000000001L});
    public static final BitSet FOLLOW_statement_in_statement1394 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DOWHILE_in_statement1406 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_condition_in_statement1408 = new BitSet(new long[]{0x7000000002380000L,0x0000000000000001L});
    public static final BitSet FOLLOW_statement_in_statement1410 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RETURN_in_statement1422 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement1424 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RETURN_in_statement1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STMT_in_statement1460 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statementExpression_in_statement1462 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONDITION_in_condition1485 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_condition1487 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ELSE_in_elseStmt1520 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_elseStmt1522 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_localVariableDeclaration_in_forInit1542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionList_in_forInit1552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionList_in_forUpdate1571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionList1606 = new BitSet(new long[]{0x0FF40027F80001D2L,0x000004F8001F001CL});
    public static final BitSet FOLLOW_expression_in_statementExpression1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_expression1655 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1659 = new BitSet(new long[]{0x0FF40027F80001D0L,0x000004F8001F001CL});
    public static final BitSet FOLLOW_expression_in_expression1663 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_in_expression1681 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1688 = new BitSet(new long[]{0x0FF40027F80001D0L,0x000004F8001F001CL});
    public static final BitSet FOLLOW_expression_in_expression1692 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_expression1704 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1710 = new BitSet(new long[]{0x0FF40027F80001D0L,0x000004F8001F001CL});
    public static final BitSet FOLLOW_expression_in_expression1714 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STAR_in_expression1726 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1733 = new BitSet(new long[]{0x0FF40027F80001D0L,0x000004F8001F001CL});
    public static final BitSet FOLLOW_expression_in_expression1737 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SLASH_in_expression1749 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1755 = new BitSet(new long[]{0x0FF40027F80001D0L,0x000004F8001F001CL});
    public static final BitSet FOLLOW_expression_in_expression1759 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_103_in_expression1775 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1779 = new BitSet(new long[]{0x0FF40027F80001D0L,0x000004F8001F001CL});
    public static final BitSet FOLLOW_expression_in_expression1783 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_99_in_expression1799 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1804 = new BitSet(new long[]{0x0FF40027F80001D0L,0x000004F8001F001CL});
    public static final BitSet FOLLOW_expression_in_expression1808 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_100_in_expression1824 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1828 = new BitSet(new long[]{0x0FF40027F80001D0L,0x000004F8001F001CL});
    public static final BitSet FOLLOW_expression_in_expression1832 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_101_in_expression1848 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1853 = new BitSet(new long[]{0x0FF40027F80001D0L,0x000004F8001F001CL});
    public static final BitSet FOLLOW_expression_in_expression1857 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_102_in_expression1873 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1878 = new BitSet(new long[]{0x0FF40027F80001D0L,0x000004F8001F001CL});
    public static final BitSet FOLLOW_expression_in_expression1882 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INSTANCEOF_in_expression1894 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1898 = new BitSet(new long[]{0x0003FC2000000200L});
    public static final BitSet FOLLOW_type_in_expression1900 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COMPAREOP_in_expression1920 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1924 = new BitSet(new long[]{0x0FF40027F80001D0L,0x000004F8001F001CL});
    public static final BitSet FOLLOW_expression_in_expression1928 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_expression1950 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1959 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_expression1985 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1995 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_106_in_expression2019 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2023 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CAST_in_expression2042 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primitiveType_in_expression2046 = new BitSet(new long[]{0x0FF40027F80001D0L,0x000004F8001F001CL});
    public static final BitSet FOLLOW_expression_in_expression2050 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CAST_in_expression2069 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_nonPrimitiveType_in_expression2073 = new BitSet(new long[]{0x0FF40027F80001D0L,0x000004F8001F001CL});
    public static final BitSet FOLLOW_expression_in_expression2077 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NEW_in_expression2096 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_creator_in_expression2098 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_expression2112 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_selector_in_expression2123 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_primary_in_expression2129 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_selector_in_expression2154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_in_expression2166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_primary2207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_superMemberAccess_in_primary2219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primary2231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_primary2243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOTCLASS_in_primary2267 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ARRAYTYPE_in_primary2270 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_primary2272 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DOTCLASS_in_primary2287 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_primary2289 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DOTCLASS_in_primary2310 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primitiveType_in_primary2312 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DOTCLASS_in_primary2330 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VOID_in_primary2332 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FIELDACCESS_in_selector2376 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_selector2378 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_selector2380 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_METHODCALL_in_selector2399 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_selector2401 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_selector2403 = new BitSet(new long[]{0x0000000000004008L});
    public static final BitSet FOLLOW_arguments_in_selector2405 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARRAYACCESS_in_selector2428 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_selector2432 = new BitSet(new long[]{0x0FF40027F80001D0L,0x000004F8001F001CL});
    public static final BitSet FOLLOW_expression_in_selector2436 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_arrayCreatorRest_in_creator2471 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_arrayInitializer_in_creator2473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createdName_in_creator2486 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_classCreatorRest_in_creator2488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classType_in_createdName2514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_createdName2530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAYTYPE_in_arrayCreatorRest2559 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arrayCreatorRest_in_arrayCreatorRest2563 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARRAYTYPE_in_arrayCreatorRest2583 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_createdName_in_arrayCreatorRest2585 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARRAYTYPE_in_arrayCreatorRest2599 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_arrayCreatorRest2603 = new BitSet(new long[]{0x0003FC2000000200L});
    public static final BitSet FOLLOW_arrayCreatorRestExpr_in_arrayCreatorRest2607 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARRAYTYPE_in_arrayCreatorRestExpr2640 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_arrayCreatorRestExpr2644 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_arrayCreatorRest_in_arrayCreatorRestExpr2648 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_createdName_in_arrayCreatorRestExpr2668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arguments_in_classCreatorRest2693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_METHODCALL_in_superMemberAccess2725 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SUPER_in_superMemberAccess2727 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_superMemberAccess2729 = new BitSet(new long[]{0x0000000000004008L});
    public static final BitSet FOLLOW_arguments_in_superMemberAccess2731 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FIELDACCESS_in_superMemberAccess2752 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SUPER_in_superMemberAccess2754 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_superMemberAccess2756 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARGUMENTS_in_arguments2797 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expressionList_in_arguments2799 = new BitSet(new long[]{0x0000000000000008L});

}