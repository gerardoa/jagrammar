// $ANTLR 3.2 Sep 23, 2009 12:02:23 D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g 2010-10-07 23:55:19

	package jagrammar;
	
	import jagrammar.typehierarchy.*;
	import jagrammar.exception.*;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "METHODCALL", "CONSTRCALL", "FIELDACCESS", "ARRAYACCESS", "DOTCLASS", "ARRAYTYPE", "METHOD", "FIELD", "CONSTR", "FPARMS", "ARGUMENTS", "FPARM", "FMULTPARM", "MBODY", "CBODY", "VARDECL", "BLOCK", "STMT", "INIT", "CONDITION", "UPDATE", "DOWHILE", "THEN", "ARRAYINIT", "PREINC", "POSTINC", "PREDEC", "POSTDEC", "UNARYPLUS", "UNARYMINUS", "CAST", "CLASS", "IDENTIFIER", "EXTENDS", "PUBLIC", "VOID", "PRIVATE", "CHAR", "BYTE", "SHORT", "INT", "LONG", "FLOAT", "DOUBLE", "BOOLEAN", "THIS", "SUPER", "INTLITERAL", "LONGLITERAL", "FLOATLITERAL", "DOUBLELITERAL", "CHARLITERAL", "STRINGLITERAL", "BOOLEANLITERAL", "NULLLITERAL", "IF", "FOR", "WHILE", "DO", "RETURN", "ELSE", "INSTANCEOF", "COMPAREOP", "NEW", "Digit", "IntegerNumber", "LongSuffix", "Exponent", "FloatingPointLiteral", "FloatSuffix", "DoubleSuffix", "EscapeSequence", "WS", "COMMENT", "LINE_COMMENT", "EQ", "PLUS", "MINUS", "STAR", "SLASH", "Letter", "Currency", "';'", "'{'", "'}'", "','", "'['", "']'", "'('", "')'", "'...'", "'+='", "'-='", "'*='", "'/='", "'||'", "'&&'", "'=='", "'!='", "'%'", "'++'", "'--'", "'!'", "'.'"
    };
    public static final int CAST=34;
    public static final int FMULTPARM=16;
    public static final int STAR=82;
    public static final int WHILE=61;
    public static final int UNARYMINUS=33;
    public static final int PREDEC=30;
    public static final int CHAR=41;
    public static final int BOOLEANLITERAL=57;
    public static final int NEW=67;
    public static final int DO=62;
    public static final int CONDITION=23;
    public static final int UNARYPLUS=32;
    public static final int EOF=-1;
    public static final int Currency=85;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__90=90;
    public static final int FloatSuffix=73;
    public static final int RETURN=63;
    public static final int THIS=49;
    public static final int CBODY=18;
    public static final int DOUBLE=47;
    public static final int VOID=39;
    public static final int SUPER=50;
    public static final int EQ=79;
    public static final int COMMENT=77;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int ARGUMENTS=14;
    public static final int LINE_COMMENT=78;
    public static final int PRIVATE=40;
    public static final int ELSE=64;
    public static final int DOUBLELITERAL=54;
    public static final int INT=44;
    public static final int INTLITERAL=51;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int LongSuffix=70;
    public static final int LONGLITERAL=52;
    public static final int WS=76;
    public static final int FIELDACCESS=6;
    public static final int FloatingPointLiteral=72;
    public static final int CHARLITERAL=55;
    public static final int FPARM=15;
    public static final int FIELD=11;
    public static final int METHODCALL=4;
    public static final int POSTINC=29;
    public static final int INIT=22;
    public static final int Letter=84;
    public static final int EscapeSequence=75;
    public static final int POSTDEC=31;
    public static final int CLASS=35;
    public static final int STMT=21;
    public static final int IntegerNumber=69;
    public static final int MBODY=17;
    public static final int ARRAYTYPE=9;
    public static final int UPDATE=24;
    public static final int Exponent=71;
    public static final int FOR=60;
    public static final int FLOAT=46;
    public static final int VARDECL=19;
    public static final int DOTCLASS=8;
    public static final int CONSTR=12;
    public static final int IF=59;
    public static final int SLASH=83;
    public static final int CONSTRCALL=5;
    public static final int BOOLEAN=48;
    public static final int THEN=26;
    public static final int T__107=107;
    public static final int NULLLITERAL=58;
    public static final int IDENTIFIER=36;
    public static final int T__103=103;
    public static final int ARRAYINIT=27;
    public static final int PREINC=28;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int PLUS=80;
    public static final int ARRAYACCESS=7;
    public static final int BYTE=42;
    public static final int SHORT=43;
    public static final int T__102=102;
    public static final int INSTANCEOF=65;
    public static final int T__101=101;
    public static final int FPARMS=13;
    public static final int T__100=100;
    public static final int MINUS=81;
    public static final int Digit=68;
    public static final int DoubleSuffix=74;
    public static final int STRINGLITERAL=56;
    public static final int BLOCK=20;
    public static final int LONG=45;
    public static final int FLOATLITERAL=53;
    public static final int PUBLIC=38;
    public static final int EXTENDS=37;
    public static final int COMPAREOP=66;
    public static final int METHOD=10;
    public static final int DOWHILE=25;

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
    public String getGrammarFileName() { return "D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g"; }



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
    	    StringBuilder list = new StringBuilder("");
    	    for(String id : formalParameters) {
    	    	list.append(((JaScope_scope)JaScope_stack.elementAt(0)).symbols.get(id) + " " + id + ", ");
    	    }
    	    return ((JaScope_scope)JaScope_stack.elementAt(0)).name + '(' + list.substring(0, list.length() - 2) + ')';
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
        		errorLog.add(new UnacceptableLocalVariableException(id, getMethodSignature(), line, pos, rt)); 
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
    	        errorLog.add(new CannotBeAppliedToException(operator.getText(), op1.toString(), op2.toString(), operator.getLine(), operator.getCharPositionInLine(), rt));
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
    	        errorLog.add(new CannotBeAppliedToException(operator.getText(), op1.toString(), op2.toString(), operator.getLine(), operator.getCharPositionInLine(), rt));
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
        			 



    // $ANTLR start "compilationUnit"
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:136:1: compilationUnit : classDeclaration ;
    public final void compilationUnit() throws RecognitionException {
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:140:5: ( classDeclaration )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:140:8: classDeclaration
            {
            pushFollow(FOLLOW_classDeclaration_in_compilationUnit61);
            classDeclaration();

            state._fsp--;


            }


            	System.out.println("ERROR LOG:" + errorLog);

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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:143:1: classDeclaration : ^( CLASS IDENTIFIER ( classType )? classBody ) ;
    public final void classDeclaration() throws RecognitionException {
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:144:5: ( ^( CLASS IDENTIFIER ( classType )? classBody ) )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:144:9: ^( CLASS IDENTIFIER ( classType )? classBody )
            {
            match(input,CLASS,FOLLOW_CLASS_in_classDeclaration86); 

            match(input, Token.DOWN, null); 
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classDeclaration88); 
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:144:28: ( classType )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==IDENTIFIER) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:144:28: classType
                    {
                    pushFollow(FOLLOW_classType_in_classDeclaration90);
                    classType();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_classBody_in_classDeclaration93);
            classBody();

            state._fsp--;


            match(input, Token.UP, null); 
             System.out.println("Class Declaration in Tree grammar"); 

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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:147:1: classBody : ( classBodyDeclaration )* ;
    public final void classBody() throws RecognitionException {
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:148:5: ( ( classBodyDeclaration )* )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:148:9: ( classBodyDeclaration )*
            {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:148:9: ( classBodyDeclaration )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=METHOD && LA2_0<=CONSTR)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:148:9: classBodyDeclaration
            	    {
            	    pushFollow(FOLLOW_classBodyDeclaration_in_classBody120);
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:151:1: classBodyDeclaration : memberDeclaration ;
    public final void classBodyDeclaration() throws RecognitionException {
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:152:5: ( memberDeclaration )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:152:9: memberDeclaration
            {
            pushFollow(FOLLOW_memberDeclaration_in_classBodyDeclaration140);
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:155:1: memberDeclaration : ( fieldDeclaration | methodAndConstructorDeclaration );
    public final void memberDeclaration() throws RecognitionException {
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:156:5: ( fieldDeclaration | methodAndConstructorDeclaration )
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
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:156:9: fieldDeclaration
                    {
                    pushFollow(FOLLOW_fieldDeclaration_in_memberDeclaration163);
                    fieldDeclaration();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:157:7: methodAndConstructorDeclaration
                    {
                    pushFollow(FOLLOW_methodAndConstructorDeclaration_in_memberDeclaration171);
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:160:1: methodAndConstructorDeclaration : ( ^( METHOD modifier type methodDeclaration ) | ^( METHOD modifier VOID IDENTIFIER voidMethodDeclaratorRest ) | ^( CONSTR modifier IDENTIFIER ( formalParameters )? ( constructorBody )? ) );
    public final void methodAndConstructorDeclaration() throws RecognitionException {
        JaScope_stack.push(new JaScope_scope());

        CommonTree IDENTIFIER1=null;
        CommonTree IDENTIFIER2=null;


        	((JaScope_scope)JaScope_stack.peek()).symbols = new HashMap<String, Type>();
        	formalParameters = new LinkedList<String>();

        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:169:5: ( ^( METHOD modifier type methodDeclaration ) | ^( METHOD modifier VOID IDENTIFIER voidMethodDeclaratorRest ) | ^( CONSTR modifier IDENTIFIER ( formalParameters )? ( constructorBody )? ) )
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
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:169:9: ^( METHOD modifier type methodDeclaration )
                    {
                    match(input,METHOD,FOLLOW_METHOD_in_methodAndConstructorDeclaration210); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_modifier_in_methodAndConstructorDeclaration212);
                    modifier();

                    state._fsp--;

                    pushFollow(FOLLOW_type_in_methodAndConstructorDeclaration214);
                    type();

                    state._fsp--;

                    pushFollow(FOLLOW_methodDeclaration_in_methodAndConstructorDeclaration217);
                    methodDeclaration();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:170:9: ^( METHOD modifier VOID IDENTIFIER voidMethodDeclaratorRest )
                    {
                    match(input,METHOD,FOLLOW_METHOD_in_methodAndConstructorDeclaration232); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_modifier_in_methodAndConstructorDeclaration234);
                    modifier();

                    state._fsp--;

                    match(input,VOID,FOLLOW_VOID_in_methodAndConstructorDeclaration236); 
                    IDENTIFIER1=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_methodAndConstructorDeclaration238); 
                     ((JaScope_scope)JaScope_stack.peek()).name = (IDENTIFIER1!=null?IDENTIFIER1.getText():null); 
                    pushFollow(FOLLOW_voidMethodDeclaratorRest_in_methodAndConstructorDeclaration242);
                    voidMethodDeclaratorRest();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:171:9: ^( CONSTR modifier IDENTIFIER ( formalParameters )? ( constructorBody )? )
                    {
                    match(input,CONSTR,FOLLOW_CONSTR_in_methodAndConstructorDeclaration257); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_modifier_in_methodAndConstructorDeclaration259);
                    modifier();

                    state._fsp--;

                    IDENTIFIER2=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_methodAndConstructorDeclaration261); 
                     ((JaScope_scope)JaScope_stack.peek()).name = (IDENTIFIER2!=null?IDENTIFIER2.getText():null); 
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:171:77: ( formalParameters )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==FPARMS) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:171:77: formalParameters
                            {
                            pushFollow(FOLLOW_formalParameters_in_methodAndConstructorDeclaration265);
                            formalParameters();

                            state._fsp--;


                            }
                            break;

                    }

                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:171:95: ( constructorBody )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==CBODY) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:171:95: constructorBody
                            {
                            pushFollow(FOLLOW_constructorBody_in_methodAndConstructorDeclaration268);
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:175:1: methodDeclaration : IDENTIFIER formalParameters methodBody ;
    public final void methodDeclaration() throws RecognitionException {
        CommonTree IDENTIFIER3=null;

        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:176:5: ( IDENTIFIER formalParameters methodBody )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:176:9: IDENTIFIER formalParameters methodBody
            {
            IDENTIFIER3=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_methodDeclaration299); 
             ((JaScope_scope)JaScope_stack.peek()).name = (IDENTIFIER3!=null?IDENTIFIER3.getText():null); 
            pushFollow(FOLLOW_formalParameters_in_methodDeclaration303);
            formalParameters();

            state._fsp--;

            pushFollow(FOLLOW_methodBody_in_methodDeclaration305);
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:179:1: fieldDeclaration : ^( FIELD modifier variableDeclarator ) ;
    public final void fieldDeclaration() throws RecognitionException {
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:180:5: ( ^( FIELD modifier variableDeclarator ) )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:180:9: ^( FIELD modifier variableDeclarator )
            {
            match(input,FIELD,FOLLOW_FIELD_in_fieldDeclaration325); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_modifier_in_fieldDeclaration327);
            modifier();

            state._fsp--;

            pushFollow(FOLLOW_variableDeclarator_in_fieldDeclaration329);
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:183:1: voidMethodDeclaratorRest : formalParameters methodBody ;
    public final void voidMethodDeclaratorRest() throws RecognitionException {
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:184:5: ( formalParameters methodBody )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:184:7: formalParameters methodBody
            {
            pushFollow(FOLLOW_formalParameters_in_voidMethodDeclaratorRest352);
            formalParameters();

            state._fsp--;

            pushFollow(FOLLOW_methodBody_in_voidMethodDeclaratorRest354);
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:187:1: variableDeclarator returns [CommonTree id, Type t] : variableDeclaratorId ( variableInitializer )? ;
    public final JaWalker.variableDeclarator_return variableDeclarator() throws RecognitionException {
        JaWalker.variableDeclarator_return retval = new JaWalker.variableDeclarator_return();
        retval.start = input.LT(1);

        JaWalker.variableDeclaratorId_return variableDeclaratorId4 = null;


        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:188:5: ( variableDeclaratorId ( variableInitializer )? )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:188:9: variableDeclaratorId ( variableInitializer )?
            {
            pushFollow(FOLLOW_variableDeclaratorId_in_variableDeclarator377);
            variableDeclaratorId4=variableDeclaratorId();

            state._fsp--;

             retval.id = (variableDeclaratorId4!=null?variableDeclaratorId4.id:null); retval.t = (variableDeclaratorId4!=null?variableDeclaratorId4.t:null); 
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:188:96: ( variableInitializer )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==METHODCALL||(LA7_0>=FIELDACCESS && LA7_0<=DOTCLASS)||(LA7_0>=ARRAYINIT && LA7_0<=CAST)||LA7_0==IDENTIFIER||LA7_0==THIS||(LA7_0>=INTLITERAL && LA7_0<=NULLLITERAL)||(LA7_0>=INSTANCEOF && LA7_0<=NEW)||(LA7_0>=EQ && LA7_0<=SLASH)||(LA7_0>=99 && LA7_0<=103)||LA7_0==106) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:188:97: variableInitializer
                    {
                    pushFollow(FOLLOW_variableInitializer_in_variableDeclarator382);
                    variableInitializer();

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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:191:1: variableDeclaratorId returns [CommonTree id, Type t] : type IDENTIFIER ;
    public final JaWalker.variableDeclaratorId_return variableDeclaratorId() throws RecognitionException {
        JaWalker.variableDeclaratorId_return retval = new JaWalker.variableDeclaratorId_return();
        retval.start = input.LT(1);

        CommonTree IDENTIFIER5=null;
        Type type6 = null;


        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:192:5: ( type IDENTIFIER )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:192:9: type IDENTIFIER
            {
            pushFollow(FOLLOW_type_in_variableDeclaratorId411);
            type6=type();

            state._fsp--;

            IDENTIFIER5=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variableDeclaratorId413); 
             retval.id = IDENTIFIER5; retval.t = type6; 

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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:195:1: variableInitializer : ( arrayInitializer | expression );
    public final void variableInitializer() throws RecognitionException {
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:196:5: ( arrayInitializer | expression )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==ARRAYINIT) ) {
                alt8=1;
            }
            else if ( (LA8_0==METHODCALL||(LA8_0>=FIELDACCESS && LA8_0<=DOTCLASS)||(LA8_0>=PREINC && LA8_0<=CAST)||LA8_0==IDENTIFIER||LA8_0==THIS||(LA8_0>=INTLITERAL && LA8_0<=NULLLITERAL)||(LA8_0>=INSTANCEOF && LA8_0<=NEW)||(LA8_0>=EQ && LA8_0<=SLASH)||(LA8_0>=99 && LA8_0<=103)||LA8_0==106) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:196:9: arrayInitializer
                    {
                    pushFollow(FOLLOW_arrayInitializer_in_variableInitializer438);
                    arrayInitializer();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:197:9: expression
                    {
                    pushFollow(FOLLOW_expression_in_variableInitializer448);
                    expression();

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
    // $ANTLR end "variableInitializer"


    // $ANTLR start "arrayInitializer"
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:200:1: arrayInitializer : ^( ARRAYINIT variableInitializer ( variableInitializer )* ) ;
    public final void arrayInitializer() throws RecognitionException {
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:201:5: ( ^( ARRAYINIT variableInitializer ( variableInitializer )* ) )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:201:9: ^( ARRAYINIT variableInitializer ( variableInitializer )* )
            {
            match(input,ARRAYINIT,FOLLOW_ARRAYINIT_in_arrayInitializer468); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_variableInitializer_in_arrayInitializer470);
            variableInitializer();

            state._fsp--;

            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:201:41: ( variableInitializer )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==METHODCALL||(LA9_0>=FIELDACCESS && LA9_0<=DOTCLASS)||(LA9_0>=ARRAYINIT && LA9_0<=CAST)||LA9_0==IDENTIFIER||LA9_0==THIS||(LA9_0>=INTLITERAL && LA9_0<=NULLLITERAL)||(LA9_0>=INSTANCEOF && LA9_0<=NEW)||(LA9_0>=EQ && LA9_0<=SLASH)||(LA9_0>=99 && LA9_0<=103)||LA9_0==106) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:201:42: variableInitializer
            	    {
            	    pushFollow(FOLLOW_variableInitializer_in_arrayInitializer473);
            	    variableInitializer();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


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
    // $ANTLR end "arrayInitializer"


    // $ANTLR start "modifier"
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:204:1: modifier : ( PUBLIC | PRIVATE );
    public final void modifier() throws RecognitionException {
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:205:5: ( PUBLIC | PRIVATE )
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:209:1: type returns [Type t] : ( nonPrimitiveType | primitiveType );
    public final Type type() throws RecognitionException {
        Type t = null;

        ComplexType nonPrimitiveType7 = null;

        BasicType primitiveType8 = null;


        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:210:5: ( nonPrimitiveType | primitiveType )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ARRAYTYPE||LA10_0==IDENTIFIER) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=CHAR && LA10_0<=BOOLEAN)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:210:7: nonPrimitiveType
                    {
                    pushFollow(FOLLOW_nonPrimitiveType_in_type535);
                    nonPrimitiveType7=nonPrimitiveType();

                    state._fsp--;

                     t = nonPrimitiveType7; 

                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:211:7: primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_type545);
                    primitiveType8=primitiveType();

                    state._fsp--;

                     t = primitiveType8;   

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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:214:1: nonPrimitiveType returns [ComplexType t] : ( ^( ARRAYTYPE npt= nonPrimitiveType ) | classType | ^( ARRAYTYPE primitiveType ) );
    public final ComplexType nonPrimitiveType() throws RecognitionException {
        ComplexType t = null;

        ComplexType npt = null;

        ReferenceType classType9 = null;

        BasicType primitiveType10 = null;


        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:215:5: ( ^( ARRAYTYPE npt= nonPrimitiveType ) | classType | ^( ARRAYTYPE primitiveType ) )
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ARRAYTYPE) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==DOWN) ) {
                    int LA11_3 = input.LA(3);

                    if ( (LA11_3==ARRAYTYPE||LA11_3==IDENTIFIER) ) {
                        alt11=1;
                    }
                    else if ( ((LA11_3>=CHAR && LA11_3<=BOOLEAN)) ) {
                        alt11=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA11_0==IDENTIFIER) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:215:7: ^( ARRAYTYPE npt= nonPrimitiveType )
                    {
                    match(input,ARRAYTYPE,FOLLOW_ARRAYTYPE_in_nonPrimitiveType573); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_nonPrimitiveType_in_nonPrimitiveType577);
                    npt=nonPrimitiveType();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     t = (ComplexType)ParserHelper.createArrayType(npt, 1); 

                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:216:9: classType
                    {
                    pushFollow(FOLLOW_classType_in_nonPrimitiveType590);
                    classType9=classType();

                    state._fsp--;

                     t = classType9; 

                    }
                    break;
                case 3 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:217:7: ^( ARRAYTYPE primitiveType )
                    {
                    match(input,ARRAYTYPE,FOLLOW_ARRAYTYPE_in_nonPrimitiveType624); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_primitiveType_in_nonPrimitiveType626);
                    primitiveType10=primitiveType();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     t = (ComplexType)ParserHelper.createArrayType(primitiveType10, 1); 

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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:220:1: classType returns [ReferenceType t] : IDENTIFIER ;
    public final ReferenceType classType() throws RecognitionException {
        ReferenceType t = null;

        CommonTree IDENTIFIER11=null;

        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:221:5: ( IDENTIFIER )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:221:7: IDENTIFIER
            {
            IDENTIFIER11=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classType657); 
             t = cTab.get((IDENTIFIER11!=null?IDENTIFIER11.getText():null)); 

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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:224:1: primitiveType returns [BasicType bs] : ( CHAR | BYTE | SHORT | INT | LONG | FLOAT | DOUBLE | BOOLEAN );
    public final BasicType primitiveType() throws RecognitionException {
        BasicType bs = null;

        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:225:5: ( CHAR | BYTE | SHORT | INT | LONG | FLOAT | DOUBLE | BOOLEAN )
            int alt12=8;
            switch ( input.LA(1) ) {
            case CHAR:
                {
                alt12=1;
                }
                break;
            case BYTE:
                {
                alt12=2;
                }
                break;
            case SHORT:
                {
                alt12=3;
                }
                break;
            case INT:
                {
                alt12=4;
                }
                break;
            case LONG:
                {
                alt12=5;
                }
                break;
            case FLOAT:
                {
                alt12=6;
                }
                break;
            case DOUBLE:
                {
                alt12=7;
                }
                break;
            case BOOLEAN:
                {
                alt12=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:225:9: CHAR
                    {
                    match(input,CHAR,FOLLOW_CHAR_in_primitiveType682); 
                     bs = BasicType.CHAR;    

                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:226:9: BYTE
                    {
                    match(input,BYTE,FOLLOW_BYTE_in_primitiveType697); 
                     bs = BasicType.BYTE;    

                    }
                    break;
                case 3 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:227:9: SHORT
                    {
                    match(input,SHORT,FOLLOW_SHORT_in_primitiveType712); 
                     bs = BasicType.SHORT;   

                    }
                    break;
                case 4 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:228:9: INT
                    {
                    match(input,INT,FOLLOW_INT_in_primitiveType726); 
                     bs = BasicType.INT;     

                    }
                    break;
                case 5 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:229:9: LONG
                    {
                    match(input,LONG,FOLLOW_LONG_in_primitiveType742); 
                     bs = BasicType.LONG;    

                    }
                    break;
                case 6 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:230:9: FLOAT
                    {
                    match(input,FLOAT,FOLLOW_FLOAT_in_primitiveType757); 
                     bs = BasicType.FLOAT;   

                    }
                    break;
                case 7 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:231:9: DOUBLE
                    {
                    match(input,DOUBLE,FOLLOW_DOUBLE_in_primitiveType771); 
                     bs = BasicType.DOUBLE;  

                    }
                    break;
                case 8 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:232:9: BOOLEAN
                    {
                    match(input,BOOLEAN,FOLLOW_BOOLEAN_in_primitiveType784); 
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:235:1: formalParameters : ^( FPARMS ( formalParameterDecls )? ) ;
    public final void formalParameters() throws RecognitionException {
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:236:5: ( ^( FPARMS ( formalParameterDecls )? ) )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:236:9: ^( FPARMS ( formalParameterDecls )? )
            {
            match(input,FPARMS,FOLLOW_FPARMS_in_formalParameters810); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:236:18: ( formalParameterDecls )?
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=FPARM && LA13_0<=FMULTPARM)) ) {
                    alt13=1;
                }
                switch (alt13) {
                    case 1 :
                        // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:236:18: formalParameterDecls
                        {
                        pushFollow(FOLLOW_formalParameterDecls_in_formalParameters812);
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:239:1: formalParameterDecls : ( ^( FPARM variableDeclaratorId ) ( formalParameterDecls )? | ^( FMULTPARM variableDeclaratorId ) );
    public final void formalParameterDecls() throws RecognitionException {
        JaWalker.variableDeclaratorId_return variableDeclaratorId12 = null;

        JaWalker.variableDeclaratorId_return variableDeclaratorId13 = null;


        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:240:5: ( ^( FPARM variableDeclaratorId ) ( formalParameterDecls )? | ^( FMULTPARM variableDeclaratorId ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==FPARM) ) {
                alt15=1;
            }
            else if ( (LA15_0==FMULTPARM) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:240:7: ^( FPARM variableDeclaratorId ) ( formalParameterDecls )?
                    {
                    match(input,FPARM,FOLLOW_FPARM_in_formalParameterDecls837); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_variableDeclaratorId_in_formalParameterDecls839);
                    variableDeclaratorId12=variableDeclaratorId();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     formalParameters.add((variableDeclaratorId12!=null?variableDeclaratorId12.id:null).getText()); addVariableToScope((variableDeclaratorId12!=null?variableDeclaratorId12.id:null), (variableDeclaratorId12!=null?variableDeclaratorId12.t:null)); 
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:240:170: ( formalParameterDecls )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( ((LA14_0>=FPARM && LA14_0<=FMULTPARM)) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:240:170: formalParameterDecls
                            {
                            pushFollow(FOLLOW_formalParameterDecls_in_formalParameterDecls844);
                            formalParameterDecls();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:241:7: ^( FMULTPARM variableDeclaratorId )
                    {
                    match(input,FMULTPARM,FOLLOW_FMULTPARM_in_formalParameterDecls854); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_variableDeclaratorId_in_formalParameterDecls856);
                    variableDeclaratorId13=variableDeclaratorId();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     formalParameters.add((variableDeclaratorId13!=null?variableDeclaratorId13.id:null).getText()); addVariableToScope((variableDeclaratorId13!=null?variableDeclaratorId13.id:null), (variableDeclaratorId13!=null?variableDeclaratorId13.t:null));

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
    // $ANTLR end "formalParameterDecls"


    // $ANTLR start "methodBody"
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:244:1: methodBody : ^( MBODY block ) ;
    public final void methodBody() throws RecognitionException {
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:245:5: ( ^( MBODY block ) )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:245:9: ^( MBODY block )
            {
            match(input,MBODY,FOLLOW_MBODY_in_methodBody883); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                pushFollow(FOLLOW_block_in_methodBody885);
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:249:1: constructorBody : ^( CBODY ( explicitConstructorInvocation )? ( blockStatement )* ) ;
    public final void constructorBody() throws RecognitionException {
        JaScope_stack.push(new JaScope_scope());


        	((JaScope_scope)JaScope_stack.peek()).symbols = new HashMap<String, Type>();

        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:257:5: ( ^( CBODY ( explicitConstructorInvocation )? ( blockStatement )* ) )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:257:7: ^( CBODY ( explicitConstructorInvocation )? ( blockStatement )* )
            {
            match(input,CBODY,FOLLOW_CBODY_in_constructorBody944); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:257:15: ( explicitConstructorInvocation )?
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==CONSTRCALL) ) {
                    alt16=1;
                }
                switch (alt16) {
                    case 1 :
                        // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:257:15: explicitConstructorInvocation
                        {
                        pushFollow(FOLLOW_explicitConstructorInvocation_in_constructorBody946);
                        explicitConstructorInvocation();

                        state._fsp--;


                        }
                        break;

                }

                // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:257:46: ( blockStatement )*
                loop17:
                do {
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( ((LA17_0>=VARDECL && LA17_0<=STMT)||LA17_0==DOWHILE||(LA17_0>=IF && LA17_0<=WHILE)||LA17_0==RETURN) ) {
                        alt17=1;
                    }


                    switch (alt17) {
                	case 1 :
                	    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:257:46: blockStatement
                	    {
                	    pushFollow(FOLLOW_blockStatement_in_constructorBody949);
                	    blockStatement();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop17;
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:260:1: explicitConstructorInvocation : ( ^( CONSTRCALL THIS ( arguments )? ) | ^( CONSTRCALL SUPER ( arguments )? ) );
    public final void explicitConstructorInvocation() throws RecognitionException {
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:261:5: ( ^( CONSTRCALL THIS ( arguments )? ) | ^( CONSTRCALL SUPER ( arguments )? ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==CONSTRCALL) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==DOWN) ) {
                    int LA20_2 = input.LA(3);

                    if ( (LA20_2==THIS) ) {
                        alt20=1;
                    }
                    else if ( (LA20_2==SUPER) ) {
                        alt20=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:261:9: ^( CONSTRCALL THIS ( arguments )? )
                    {
                    match(input,CONSTRCALL,FOLLOW_CONSTRCALL_in_explicitConstructorInvocation971); 

                    match(input, Token.DOWN, null); 
                    match(input,THIS,FOLLOW_THIS_in_explicitConstructorInvocation973); 
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:261:28: ( arguments )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==ARGUMENTS) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:261:28: arguments
                            {
                            pushFollow(FOLLOW_arguments_in_explicitConstructorInvocation976);
                            arguments();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:262:7: ^( CONSTRCALL SUPER ( arguments )? )
                    {
                    match(input,CONSTRCALL,FOLLOW_CONSTRCALL_in_explicitConstructorInvocation987); 

                    match(input, Token.DOWN, null); 
                    match(input,SUPER,FOLLOW_SUPER_in_explicitConstructorInvocation989); 
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:262:26: ( arguments )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==ARGUMENTS) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:262:26: arguments
                            {
                            pushFollow(FOLLOW_arguments_in_explicitConstructorInvocation991);
                            arguments();

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
        }
        return ;
    }
    // $ANTLR end "explicitConstructorInvocation"


    // $ANTLR start "literal"
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:265:1: literal returns [Type t] : ( INTLITERAL | LONGLITERAL | FLOATLITERAL | DOUBLELITERAL | CHARLITERAL | STRINGLITERAL | BOOLEANLITERAL | NULLLITERAL );
    public final Type literal() throws RecognitionException {
        Type t = null;

        CommonTree INTLITERAL14=null;

        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:266:5: ( INTLITERAL | LONGLITERAL | FLOATLITERAL | DOUBLELITERAL | CHARLITERAL | STRINGLITERAL | BOOLEANLITERAL | NULLLITERAL )
            int alt21=8;
            switch ( input.LA(1) ) {
            case INTLITERAL:
                {
                alt21=1;
                }
                break;
            case LONGLITERAL:
                {
                alt21=2;
                }
                break;
            case FLOATLITERAL:
                {
                alt21=3;
                }
                break;
            case DOUBLELITERAL:
                {
                alt21=4;
                }
                break;
            case CHARLITERAL:
                {
                alt21=5;
                }
                break;
            case STRINGLITERAL:
                {
                alt21=6;
                }
                break;
            case BOOLEANLITERAL:
                {
                alt21=7;
                }
                break;
            case NULLLITERAL:
                {
                alt21=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:266:9: INTLITERAL
                    {
                    INTLITERAL14=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_literal1016); 
                     int literal = Integer.parseInt((INTLITERAL14!=null?INTLITERAL14.getText():null));
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
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:275:9: LONGLITERAL
                    {
                    match(input,LONGLITERAL,FOLLOW_LONGLITERAL_in_literal1032); 
                     t = BasicType.LONG;       

                    }
                    break;
                case 3 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:276:9: FLOATLITERAL
                    {
                    match(input,FLOATLITERAL,FOLLOW_FLOATLITERAL_in_literal1047); 
                     t = BasicType.FLOAT;      

                    }
                    break;
                case 4 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:277:7: DOUBLELITERAL
                    {
                    match(input,DOUBLELITERAL,FOLLOW_DOUBLELITERAL_in_literal1059); 
                     t = BasicType.DOUBLE;     

                    }
                    break;
                case 5 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:278:9: CHARLITERAL
                    {
                    match(input,CHARLITERAL,FOLLOW_CHARLITERAL_in_literal1072); 
                     t = BasicType.CHAR;       

                    }
                    break;
                case 6 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:279:9: STRINGLITERAL
                    {
                    match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_literal1087); 
                     t = ReferenceType.STRING; 

                    }
                    break;
                case 7 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:280:9: BOOLEANLITERAL
                    {
                    match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_literal1100); 
                     t = BasicType.BOOLEAN;    

                    }
                    break;
                case 8 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:281:9: NULLLITERAL
                    {
                    match(input,NULLLITERAL,FOLLOW_NULLLITERAL_in_literal1112); 
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:286:1: block : ( blockStatement )* ;
    public final void block() throws RecognitionException {
        JaScope_stack.push(new JaScope_scope());

        JaWalker.blockStatement_return blockStatement15 = null;



        	((JaScope_scope)JaScope_stack.peek()).symbols = new HashMap<String, Type>();

        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:294:5: ( ( blockStatement )* )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:294:9: ( blockStatement )*
            {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:294:9: ( blockStatement )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=VARDECL && LA22_0<=STMT)||LA22_0==DOWHILE||(LA22_0>=IF && LA22_0<=WHILE)||LA22_0==RETURN) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:294:10: blockStatement
            	    {
            	    pushFollow(FOLLOW_blockStatement_in_block1154);
            	    blockStatement15=blockStatement();

            	    state._fsp--;

            	     System.out.println("Statement text: " + (blockStatement15!=null?(input.getTokenStream().toString(
            	      input.getTreeAdaptor().getTokenStartIndex(blockStatement15.start),
            	      input.getTreeAdaptor().getTokenStopIndex(blockStatement15.start))):null)); 

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            	System.out.println("block: " + ((JaScope_scope)JaScope_stack.peek()).symbols);

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

    public static class blockStatement_return extends TreeRuleReturnScope {
    };

    // $ANTLR start "blockStatement"
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:297:1: blockStatement : ( localVariableDeclarationStatement | statement );
    public final JaWalker.blockStatement_return blockStatement() throws RecognitionException {
        JaWalker.blockStatement_return retval = new JaWalker.blockStatement_return();
        retval.start = input.LT(1);

        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:298:5: ( localVariableDeclarationStatement | statement )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==VARDECL) ) {
                alt23=1;
            }
            else if ( ((LA23_0>=BLOCK && LA23_0<=STMT)||LA23_0==DOWHILE||(LA23_0>=IF && LA23_0<=WHILE)||LA23_0==RETURN) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:298:9: localVariableDeclarationStatement
                    {
                    pushFollow(FOLLOW_localVariableDeclarationStatement_in_blockStatement1181);
                    localVariableDeclarationStatement();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:299:9: statement
                    {
                    pushFollow(FOLLOW_statement_in_blockStatement1192);
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
        return retval;
    }
    // $ANTLR end "blockStatement"


    // $ANTLR start "localVariableDeclarationStatement"
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:302:1: localVariableDeclarationStatement : localVariableDeclaration ;
    public final void localVariableDeclarationStatement() throws RecognitionException {
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:303:5: ( localVariableDeclaration )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:303:7: localVariableDeclaration
            {
            pushFollow(FOLLOW_localVariableDeclaration_in_localVariableDeclarationStatement1213);
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:306:1: localVariableDeclaration : ^( VARDECL variableDeclarator ) ;
    public final void localVariableDeclaration() throws RecognitionException {
        JaWalker.variableDeclarator_return variableDeclarator16 = null;


        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:307:5: ( ^( VARDECL variableDeclarator ) )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:307:7: ^( VARDECL variableDeclarator )
            {
            match(input,VARDECL,FOLLOW_VARDECL_in_localVariableDeclaration1231); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_variableDeclarator_in_localVariableDeclaration1233);
            variableDeclarator16=variableDeclarator();

            state._fsp--;


            match(input, Token.UP, null); 
             addVariableToScope((variableDeclarator16!=null?variableDeclarator16.id:null), (variableDeclarator16!=null?variableDeclarator16.t:null)); 

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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:312:1: statement : ( ^( BLOCK block ) | ^( IF ^( CONDITION expression ) ^( THEN statement ) ( elseStmt )? ) | ^( FOR ( ^( INIT forInit ) )? ( ^( CONDITION expression ) )? ( ^( UPDATE forUpdate ) )? statement ) | ^( WHILE ^( CONDITION expression ) statement ) | ^( DOWHILE ^( CONDITION expression ) statement ) | ^( RETURN ( expression )? ) | ^( STMT statementExpression ) );
    public final void statement() throws RecognitionException {
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:313:5: ( ^( BLOCK block ) | ^( IF ^( CONDITION expression ) ^( THEN statement ) ( elseStmt )? ) | ^( FOR ( ^( INIT forInit ) )? ( ^( CONDITION expression ) )? ( ^( UPDATE forUpdate ) )? statement ) | ^( WHILE ^( CONDITION expression ) statement ) | ^( DOWHILE ^( CONDITION expression ) statement ) | ^( RETURN ( expression )? ) | ^( STMT statementExpression ) )
            int alt29=7;
            switch ( input.LA(1) ) {
            case BLOCK:
                {
                alt29=1;
                }
                break;
            case IF:
                {
                alt29=2;
                }
                break;
            case FOR:
                {
                alt29=3;
                }
                break;
            case WHILE:
                {
                alt29=4;
                }
                break;
            case DOWHILE:
                {
                alt29=5;
                }
                break;
            case RETURN:
                {
                alt29=6;
                }
                break;
            case STMT:
                {
                alt29=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:313:9: ^( BLOCK block )
                    {
                    match(input,BLOCK,FOLLOW_BLOCK_in_statement1270); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_block_in_statement1272);
                        block();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }

                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:314:9: ^( IF ^( CONDITION expression ) ^( THEN statement ) ( elseStmt )? )
                    {
                    match(input,IF,FOLLOW_IF_in_statement1284); 

                    match(input, Token.DOWN, null); 
                    match(input,CONDITION,FOLLOW_CONDITION_in_statement1287); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_statement1289);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    match(input,THEN,FOLLOW_THEN_in_statement1293); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_statement_in_statement1295);
                    statement();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:314:56: ( elseStmt )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==ELSE) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:314:56: elseStmt
                            {
                            pushFollow(FOLLOW_elseStmt_in_statement1298);
                            elseStmt();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:315:9: ^( FOR ( ^( INIT forInit ) )? ( ^( CONDITION expression ) )? ( ^( UPDATE forUpdate ) )? statement )
                    {
                    match(input,FOR,FOLLOW_FOR_in_statement1311); 

                    match(input, Token.DOWN, null); 
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:315:15: ( ^( INIT forInit ) )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==INIT) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:315:16: ^( INIT forInit )
                            {
                            match(input,INIT,FOLLOW_INIT_in_statement1315); 

                            match(input, Token.DOWN, null); 
                            pushFollow(FOLLOW_forInit_in_statement1317);
                            forInit();

                            state._fsp--;


                            match(input, Token.UP, null); 

                            }
                            break;

                    }

                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:315:34: ( ^( CONDITION expression ) )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==CONDITION) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:315:35: ^( CONDITION expression )
                            {
                            match(input,CONDITION,FOLLOW_CONDITION_in_statement1324); 

                            match(input, Token.DOWN, null); 
                            pushFollow(FOLLOW_expression_in_statement1326);
                            expression();

                            state._fsp--;


                            match(input, Token.UP, null); 

                            }
                            break;

                    }

                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:315:61: ( ^( UPDATE forUpdate ) )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==UPDATE) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:315:62: ^( UPDATE forUpdate )
                            {
                            match(input,UPDATE,FOLLOW_UPDATE_in_statement1333); 

                            match(input, Token.DOWN, null); 
                            pushFollow(FOLLOW_forUpdate_in_statement1335);
                            forUpdate();

                            state._fsp--;


                            match(input, Token.UP, null); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_statement_in_statement1340);
                    statement();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:316:9: ^( WHILE ^( CONDITION expression ) statement )
                    {
                    match(input,WHILE,FOLLOW_WHILE_in_statement1353); 

                    match(input, Token.DOWN, null); 
                    match(input,CONDITION,FOLLOW_CONDITION_in_statement1356); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_statement1358);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    pushFollow(FOLLOW_statement_in_statement1361);
                    statement();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:317:9: ^( DOWHILE ^( CONDITION expression ) statement )
                    {
                    match(input,DOWHILE,FOLLOW_DOWHILE_in_statement1373); 

                    match(input, Token.DOWN, null); 
                    match(input,CONDITION,FOLLOW_CONDITION_in_statement1376); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_statement1378);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    pushFollow(FOLLOW_statement_in_statement1381);
                    statement();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:318:9: ^( RETURN ( expression )? )
                    {
                    match(input,RETURN,FOLLOW_RETURN_in_statement1393); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:318:18: ( expression )?
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==METHODCALL||(LA28_0>=FIELDACCESS && LA28_0<=DOTCLASS)||(LA28_0>=PREINC && LA28_0<=CAST)||LA28_0==IDENTIFIER||LA28_0==THIS||(LA28_0>=INTLITERAL && LA28_0<=NULLLITERAL)||(LA28_0>=INSTANCEOF && LA28_0<=NEW)||(LA28_0>=EQ && LA28_0<=SLASH)||(LA28_0>=99 && LA28_0<=103)||LA28_0==106) ) {
                            alt28=1;
                        }
                        switch (alt28) {
                            case 1 :
                                // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:318:18: expression
                                {
                                pushFollow(FOLLOW_expression_in_statement1395);
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
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:319:9: ^( STMT statementExpression )
                    {
                    match(input,STMT,FOLLOW_STMT_in_statement1409); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_statementExpression_in_statement1411);
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:322:1: elseStmt : ^( ELSE statement ) ;
    public final void elseStmt() throws RecognitionException {
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:323:5: ( ^( ELSE statement ) )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:323:7: ^( ELSE statement )
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:326:1: forInit : ( localVariableDeclaration | expressionList );
    public final void forInit() throws RecognitionException {
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:327:5: ( localVariableDeclaration | expressionList )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==VARDECL) ) {
                alt30=1;
            }
            else if ( (LA30_0==METHODCALL||(LA30_0>=FIELDACCESS && LA30_0<=DOTCLASS)||(LA30_0>=PREINC && LA30_0<=CAST)||LA30_0==IDENTIFIER||LA30_0==THIS||(LA30_0>=INTLITERAL && LA30_0<=NULLLITERAL)||(LA30_0>=INSTANCEOF && LA30_0<=NEW)||(LA30_0>=EQ && LA30_0<=SLASH)||(LA30_0>=99 && LA30_0<=103)||LA30_0==106) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:327:9: localVariableDeclaration
                    {
                    pushFollow(FOLLOW_localVariableDeclaration_in_forInit1456);
                    localVariableDeclaration();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:328:9: expressionList
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:331:1: forUpdate : expressionList ;
    public final void forUpdate() throws RecognitionException {
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:332:5: ( expressionList )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:332:9: expressionList
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:339:1: expressionList returns [ArrayList<Type> types] : ( expression )+ ;
    public final ArrayList<Type> expressionList() throws RecognitionException {
        ArrayList<Type> types = null;

        Type expression17 = null;



        	types = new ArrayList<Type>();

        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:343:5: ( ( expression )+ )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:343:9: ( expression )+
            {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:343:9: ( expression )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==METHODCALL||(LA31_0>=FIELDACCESS && LA31_0<=DOTCLASS)||(LA31_0>=PREINC && LA31_0<=CAST)||LA31_0==IDENTIFIER||LA31_0==THIS||(LA31_0>=INTLITERAL && LA31_0<=NULLLITERAL)||(LA31_0>=INSTANCEOF && LA31_0<=NEW)||(LA31_0>=EQ && LA31_0<=SLASH)||(LA31_0>=99 && LA31_0<=103)||LA31_0==106) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:343:10: expression
            	    {
            	    pushFollow(FOLLOW_expression_in_expressionList1520);
            	    expression17=expression();

            	    state._fsp--;

            	     types.add(expression17); 

            	    }
            	    break;

            	default :
            	    if ( cnt31 >= 1 ) break loop31;
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        throw eee;
                }
                cnt31++;
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:346:1: statementExpression : expression ;
    public final void statementExpression() throws RecognitionException {
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:347:5: ( expression )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:347:9: expression
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


    // $ANTLR start "constantExpression"
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:350:1: constantExpression : expression ;
    public final void constantExpression() throws RecognitionException {
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:351:5: ( expression )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:351:9: expression
            {
            pushFollow(FOLLOW_expression_in_constantExpression1566);
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
    // $ANTLR end "constantExpression"


    // $ANTLR start "expression"
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:354:1: expression returns [Type t] : ( ^( EQ e1= expression e2= expression ) | ^( PLUS e1= expression e2= expression ) | ^( MINUS e1= expression e2= expression ) | ^( STAR e1= expression e2= expression ) | ^( SLASH e1= expression e2= expression ) | ^(mod= '%' e1= expression e2= expression ) | ^(or= '||' e1= expression e2= expression ) | ^(and= '&&' e1= expression e2= expression ) | ^(eq= '==' e1= expression e2= expression ) | ^(nq= '!=' e1= expression e2= expression ) | ^( INSTANCEOF e= expression type ) | ^( COMPAREOP e1= expression e2= expression ) | ^(op= ( UNARYPLUS | UNARYMINUS | PREINC | PREDEC ) e= expression ) | ^(op= '!' e= expression ) | ^( CAST pt= primitiveType e= expression ) | ^( CAST npt= nonPrimitiveType e= expression ) | ^( NEW creator ) | ^(op= ( POSTINC | POSTDEC ) (e= selector | e= primary ) ) | selector | primary );
    public final Type expression() throws RecognitionException {
        Type t = null;

        CommonTree mod=null;
        CommonTree or=null;
        CommonTree and=null;
        CommonTree eq=null;
        CommonTree nq=null;
        CommonTree op=null;
        CommonTree PLUS18=null;
        CommonTree MINUS19=null;
        CommonTree STAR20=null;
        CommonTree SLASH21=null;
        CommonTree INSTANCEOF23=null;
        CommonTree COMPAREOP24=null;
        CommonTree CAST25=null;
        CommonTree CAST26=null;
        Type e1 = null;

        Type e2 = null;

        Type e = null;

        BasicType pt = null;

        ComplexType npt = null;

        Type type22 = null;

        Type creator27 = null;

        Type selector28 = null;

        Type primary29 = null;


        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:355:5: ( ^( EQ e1= expression e2= expression ) | ^( PLUS e1= expression e2= expression ) | ^( MINUS e1= expression e2= expression ) | ^( STAR e1= expression e2= expression ) | ^( SLASH e1= expression e2= expression ) | ^(mod= '%' e1= expression e2= expression ) | ^(or= '||' e1= expression e2= expression ) | ^(and= '&&' e1= expression e2= expression ) | ^(eq= '==' e1= expression e2= expression ) | ^(nq= '!=' e1= expression e2= expression ) | ^( INSTANCEOF e= expression type ) | ^( COMPAREOP e1= expression e2= expression ) | ^(op= ( UNARYPLUS | UNARYMINUS | PREINC | PREDEC ) e= expression ) | ^(op= '!' e= expression ) | ^( CAST pt= primitiveType e= expression ) | ^( CAST npt= nonPrimitiveType e= expression ) | ^( NEW creator ) | ^(op= ( POSTINC | POSTDEC ) (e= selector | e= primary ) ) | selector | primary )
            int alt33=20;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:355:9: ^( EQ e1= expression e2= expression )
                    {
                    match(input,EQ,FOLLOW_EQ_in_expression1594); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1598);
                    e1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1602);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:356:7: ^( PLUS e1= expression e2= expression )
                    {
                    PLUS18=(CommonTree)match(input,PLUS,FOLLOW_PLUS_in_expression1614); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1621);
                    e1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1625);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck(e1, e2)) t = plusOperation(PLUS18, e1, e2); 

                    }
                    break;
                case 3 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:357:7: ^( MINUS e1= expression e2= expression )
                    {
                    MINUS19=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_expression1637); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1643);
                    e1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1647);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck(e1, e2)) t = arithmeticOperation(MINUS19, e1, e2); 

                    }
                    break;
                case 4 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:358:7: ^( STAR e1= expression e2= expression )
                    {
                    STAR20=(CommonTree)match(input,STAR,FOLLOW_STAR_in_expression1659); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1666);
                    e1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1670);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck(e1, e2)) t = arithmeticOperation(STAR20,  e1, e2); 

                    }
                    break;
                case 5 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:359:7: ^( SLASH e1= expression e2= expression )
                    {
                    SLASH21=(CommonTree)match(input,SLASH,FOLLOW_SLASH_in_expression1682); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1688);
                    e1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1692);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck(e1, e2)) t = arithmeticOperation(SLASH21, e1, e2); 

                    }
                    break;
                case 6 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:360:9: ^(mod= '%' e1= expression e2= expression )
                    {
                    mod=(CommonTree)match(input,103,FOLLOW_103_in_expression1708); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1712);
                    e1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1716);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck(e1, e2)) t = arithmeticOperation(mod,   e1, e2); 

                    }
                    break;
                case 7 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:361:9: ^(or= '||' e1= expression e2= expression )
                    {
                    or=(CommonTree)match(input,99,FOLLOW_99_in_expression1732); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1737);
                    e1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1741);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck(e1, e2)) t = booleanOperation(or,  e1, e2); 

                    }
                    break;
                case 8 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:362:9: ^(and= '&&' e1= expression e2= expression )
                    {
                    and=(CommonTree)match(input,100,FOLLOW_100_in_expression1757); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1761);
                    e1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1765);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck(e1, e2)) t = booleanOperation(and, e1, e2); 

                    }
                    break;
                case 9 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:363:9: ^(eq= '==' e1= expression e2= expression )
                    {
                    eq=(CommonTree)match(input,101,FOLLOW_101_in_expression1781); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1786);
                    e1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1790);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck(e1, e2)) t = booleanOperation(eq,  e1, e2); 

                    }
                    break;
                case 10 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:364:9: ^(nq= '!=' e1= expression e2= expression )
                    {
                    nq=(CommonTree)match(input,102,FOLLOW_102_in_expression1806); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1811);
                    e1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1815);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck(e1, e2)) t = booleanOperation(nq,  e1, e2); 

                    }
                    break;
                case 11 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:365:7: ^( INSTANCEOF e= expression type )
                    {
                    INSTANCEOF23=(CommonTree)match(input,INSTANCEOF,FOLLOW_INSTANCEOF_in_expression1827); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1831);
                    e=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_type_in_expression1833);
                    type22=type();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck(e, type22)) { 
                    	          if ( !(e.isComplexType() || e.isNull()) ) errorLog.add(new UnexpectedTypeException("reference", e.toString(), (INSTANCEOF23!=null?INSTANCEOF23.getLine():0), (INSTANCEOF23!=null?INSTANCEOF23.getCharPositionInLine():0), rt));
                    	          if (!type22.isComplexType()) errorLog.add(new UnexpectedTypeException("class or array", type22.toString(), (INSTANCEOF23!=null?INSTANCEOF23.getLine():0), (INSTANCEOF23!=null?INSTANCEOF23.getCharPositionInLine():0), rt));
                    	          if (!e.isCastableTo(type22)) errorLog.add(new InconvertibleTypesException(type22.toString(), e.toString(), (INSTANCEOF23!=null?INSTANCEOF23.getLine():0), (INSTANCEOF23!=null?INSTANCEOF23.getCharPositionInLine():0), rt));
                    	          t = BasicType.BOOLEAN;
                              } 
                            

                    }
                    break;
                case 12 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:373:7: ^( COMPAREOP e1= expression e2= expression )
                    {
                    COMPAREOP24=(CommonTree)match(input,COMPAREOP,FOLLOW_COMPAREOP_in_expression1853); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1857);
                    e1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1861);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck(e1, e2)) { 
                    	    	  if ( !(e1.isNumeric() && e2.isNumeric()) ) errorLog.add(new CannotBeAppliedToException((COMPAREOP24!=null?COMPAREOP24.getText():null), e1.toString(), e2.toString(), (COMPAREOP24!=null?COMPAREOP24.getLine():0), (COMPAREOP24!=null?COMPAREOP24.getCharPositionInLine():0), rt));
                    	    	  t = BasicType.BOOLEAN;
                        	  } 
                        	

                    }
                    break;
                case 13 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:379:9: ^(op= ( UNARYPLUS | UNARYMINUS | PREINC | PREDEC ) e= expression )
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
                    pushFollow(FOLLOW_expression_in_expression1899);
                    e=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck(e)) { 
                    	          if (!e.isNumeric()) errorLog.add(new CannotBeAppliedToException((op!=null?op.getText():null), e.toString(), "", (op!=null?op.getLine():0), (op!=null?op.getCharPositionInLine():0), rt));
                    	    	  t = e;
                        	  }
                        	

                    }
                    break;
                case 14 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:388:7: ^(op= '!' e= expression )
                    {
                    op=(CommonTree)match(input,106,FOLLOW_106_in_expression1937); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1941);
                    e=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck(e)) {
                    	    	  if (!(e == BasicType.BOOLEAN)) errorLog.add(new CannotBeAppliedToException((op!=null?op.getText():null), e.toString(), "", (op!=null?op.getLine():0), (op!=null?op.getCharPositionInLine():0), rt));
                    	    	  t = BasicType.BOOLEAN;
                        	  }
                        	

                    }
                    break;
                case 15 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:394:9: ^( CAST pt= primitiveType e= expression )
                    {
                    CAST25=(CommonTree)match(input,CAST,FOLLOW_CAST_in_expression1960); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_primitiveType_in_expression1964);
                    pt=primitiveType();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1968);
                    e=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck(pt, e)) {
                    	    	  if (!e.isCastableTo(pt)) errorLog.add(new InconvertibleTypesException(pt.toString(), e.toString(), (CAST25!=null?CAST25.getLine():0), (CAST25!=null?CAST25.getCharPositionInLine():0), rt));
                    	    	  t = pt;
                        	  }
                        	

                    }
                    break;
                case 16 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:400:9: ^( CAST npt= nonPrimitiveType e= expression )
                    {
                    CAST26=(CommonTree)match(input,CAST,FOLLOW_CAST_in_expression1987); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_nonPrimitiveType_in_expression1991);
                    npt=nonPrimitiveType();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1995);
                    e=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck(npt, e)) {
                    	    	  if (!e.isCastableTo(npt)) errorLog.add(new InconvertibleTypesException(npt.toString(), e.toString(), (CAST26!=null?CAST26.getLine():0), (CAST26!=null?CAST26.getCharPositionInLine():0), rt));
                    	    	  t = npt;
                        	  }
                        	

                    }
                    break;
                case 17 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:406:9: ^( NEW creator )
                    {
                    match(input,NEW,FOLLOW_NEW_in_expression2014); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_creator_in_expression2016);
                    creator27=creator();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     t = creator27; 

                    }
                    break;
                case 18 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:407:7: ^(op= ( POSTINC | POSTDEC ) (e= selector | e= primary ) )
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
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:407:32: (e= selector | e= primary )
                    int alt32=2;
                    switch ( input.LA(1) ) {
                    case FIELDACCESS:
                        {
                        int LA32_1 = input.LA(2);

                        if ( (LA32_1==DOWN) ) {
                            int LA32_5 = input.LA(3);

                            if ( (LA32_5==SUPER) ) {
                                alt32=2;
                            }
                            else if ( (LA32_5==METHODCALL||(LA32_5>=FIELDACCESS && LA32_5<=DOTCLASS)||(LA32_5>=PREINC && LA32_5<=CAST)||LA32_5==IDENTIFIER||LA32_5==THIS||(LA32_5>=INTLITERAL && LA32_5<=NULLLITERAL)||(LA32_5>=INSTANCEOF && LA32_5<=NEW)||(LA32_5>=EQ && LA32_5<=SLASH)||(LA32_5>=99 && LA32_5<=103)||LA32_5==106) ) {
                                alt32=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 32, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 32, 1, input);

                            throw nvae;
                        }
                        }
                        break;
                    case METHODCALL:
                        {
                        int LA32_2 = input.LA(2);

                        if ( (LA32_2==DOWN) ) {
                            int LA32_6 = input.LA(3);

                            if ( (LA32_6==SUPER) ) {
                                alt32=2;
                            }
                            else if ( (LA32_6==METHODCALL||(LA32_6>=FIELDACCESS && LA32_6<=DOTCLASS)||(LA32_6>=PREINC && LA32_6<=CAST)||LA32_6==IDENTIFIER||LA32_6==THIS||(LA32_6>=INTLITERAL && LA32_6<=NULLLITERAL)||(LA32_6>=INSTANCEOF && LA32_6<=NEW)||(LA32_6>=EQ && LA32_6<=SLASH)||(LA32_6>=99 && LA32_6<=103)||LA32_6==106) ) {
                                alt32=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 32, 6, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 32, 2, input);

                            throw nvae;
                        }
                        }
                        break;
                    case ARRAYACCESS:
                        {
                        alt32=1;
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
                        alt32=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 0, input);

                        throw nvae;
                    }

                    switch (alt32) {
                        case 1 :
                            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:407:33: e= selector
                            {
                            pushFollow(FOLLOW_selector_in_expression2041);
                            e=selector();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:407:46: e= primary
                            {
                            pushFollow(FOLLOW_primary_in_expression2047);
                            e=primary();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                     if (!e.isNumeric()) {
                        	  	throw new CannotBeAppliedToException((op!=null?op.getText():null), e.toString(), "", (op!=null?op.getLine():0), (op!=null?op.getCharPositionInLine():0), rt);
                        	  }
                        	  t = e;
                        	

                    }
                    break;
                case 19 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:414:9: selector
                    {
                    pushFollow(FOLLOW_selector_in_expression2072);
                    selector28=selector();

                    state._fsp--;

                     t = selector28; 

                    }
                    break;
                case 20 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:415:9: primary
                    {
                    pushFollow(FOLLOW_primary_in_expression2084);
                    primary29=primary();

                    state._fsp--;

                     t = primary29; 

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
    // $ANTLR end "expression"


    // $ANTLR start "primary"
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:418:1: primary returns [Type t] : ( THIS | superMemberAccess | literal | IDENTIFIER | ^( DOTCLASS ^( ARRAYTYPE type ) ) | ^( DOTCLASS IDENTIFIER ) | ^( DOTCLASS primitiveType ) | ^( DOTCLASS VOID ) );
    public final Type primary() throws RecognitionException {
        Type t = null;

        CommonTree IDENTIFIER32=null;
        Type superMemberAccess30 = null;

        Type literal31 = null;


        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:420:5: ( THIS | superMemberAccess | literal | IDENTIFIER | ^( DOTCLASS ^( ARRAYTYPE type ) ) | ^( DOTCLASS IDENTIFIER ) | ^( DOTCLASS primitiveType ) | ^( DOTCLASS VOID ) )
            int alt34=8;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:420:7: THIS
                    {
                    match(input,THIS,FOLLOW_THIS_in_primary2125); 
                     t = rt; 

                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:421:9: superMemberAccess
                    {
                    pushFollow(FOLLOW_superMemberAccess_in_primary2137);
                    superMemberAccess30=superMemberAccess();

                    state._fsp--;

                     t = superMemberAccess30; 

                    }
                    break;
                case 3 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:422:9: literal
                    {
                    pushFollow(FOLLOW_literal_in_primary2149);
                    literal31=literal();

                    state._fsp--;

                     t = literal31; 

                    }
                    break;
                case 4 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:423:9: IDENTIFIER
                    {
                    IDENTIFIER32=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary2161); 
                     t = getVariableType((IDENTIFIER32!=null?IDENTIFIER32.getText():null)); 
                        		     if (t == null) errorLog.add(new CannotFindSymbolException(("variable " + (IDENTIFIER32!=null?IDENTIFIER32.getText():null)), getMethodSignature(), (IDENTIFIER32!=null?IDENTIFIER32.getLine():0), (IDENTIFIER32!=null?IDENTIFIER32.getCharPositionInLine():0), rt));
                        		   

                    }
                    break;
                case 5 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:427:9: ^( DOTCLASS ^( ARRAYTYPE type ) )
                    {
                    match(input,DOTCLASS,FOLLOW_DOTCLASS_in_primary2179); 

                    match(input, Token.DOWN, null); 
                    match(input,ARRAYTYPE,FOLLOW_ARRAYTYPE_in_primary2182); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_in_primary2184);
                    type();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 
                     t = ReferenceType.CLASS; 

                    }
                    break;
                case 6 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:428:7: ^( DOTCLASS IDENTIFIER )
                    {
                    match(input,DOTCLASS,FOLLOW_DOTCLASS_in_primary2199); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary2201); 

                    match(input, Token.UP, null); 
                     t = ReferenceType.CLASS; 

                    }
                    break;
                case 7 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:429:9: ^( DOTCLASS primitiveType )
                    {
                    match(input,DOTCLASS,FOLLOW_DOTCLASS_in_primary2222); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_primitiveType_in_primary2224);
                    primitiveType();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     t = ReferenceType.CLASS; 

                    }
                    break;
                case 8 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:430:9: ^( DOTCLASS VOID )
                    {
                    match(input,DOTCLASS,FOLLOW_DOTCLASS_in_primary2242); 

                    match(input, Token.DOWN, null); 
                    match(input,VOID,FOLLOW_VOID_in_primary2244); 

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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:433:1: selector returns [Type t] : ( ^( FIELDACCESS expression IDENTIFIER ) | ^( METHODCALL expression IDENTIFIER ( arguments )? ) | ^( ARRAYACCESS e1= expression e2= expression ) );
    public final Type selector() throws RecognitionException {
        Type t = null;

        CommonTree IDENTIFIER34=null;
        CommonTree IDENTIFIER37=null;
        CommonTree ARRAYACCESS38=null;
        Type e1 = null;

        Type e2 = null;

        Type expression33 = null;

        Type expression35 = null;

        JaWalker.arguments_return arguments36 = null;


        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:434:5: ( ^( FIELDACCESS expression IDENTIFIER ) | ^( METHODCALL expression IDENTIFIER ( arguments )? ) | ^( ARRAYACCESS e1= expression e2= expression ) )
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
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:434:9: ^( FIELDACCESS expression IDENTIFIER )
                    {
                    match(input,FIELDACCESS,FOLLOW_FIELDACCESS_in_selector2288); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_selector2290);
                    expression33=expression();

                    state._fsp--;

                    IDENTIFIER34=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_selector2292); 

                    match(input, Token.UP, null); 
                     if(ruleTypeCheck(expression33)) {
                    	    	  if (!expression33.isReference())
                    	    	  	errorLog.add(new CannotBeDereferencedException(expression33, (IDENTIFIER34!=null?IDENTIFIER34.getLine():0), (IDENTIFIER34!=null?IDENTIFIER34.getCharPositionInLine():0), rt)); 
                    	    	  ReferenceType expt = (ReferenceType)expression33;
                    	    	  boolean isSameClass = (expt.getName() == rt.getName()); 
                    	    	  t = expt.getField(isSameClass, (IDENTIFIER34!=null?IDENTIFIER34.getText():null));
                    		  if (t == null) errorLog.add(new CannotFindSymbolException(("field " + (IDENTIFIER34!=null?IDENTIFIER34.getText():null)), expt.getName(), (IDENTIFIER34!=null?IDENTIFIER34.getLine():0), (IDENTIFIER34!=null?IDENTIFIER34.getCharPositionInLine():0), rt));
                        	  }
                        	

                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:444:7: ^( METHODCALL expression IDENTIFIER ( arguments )? )
                    {
                    match(input,METHODCALL,FOLLOW_METHODCALL_in_selector2311); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_selector2313);
                    expression35=expression();

                    state._fsp--;

                    IDENTIFIER37=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_selector2315); 
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:444:42: ( arguments )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==ARGUMENTS) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:444:42: arguments
                            {
                            pushFollow(FOLLOW_arguments_in_selector2317);
                            arguments36=arguments();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                     // Se ci sono argomenti, bisogna richiamare ruleTypeCheck su di essi
                              if( ruleTypeCheck(expression35) && ((arguments36!=null?arguments36.types:null) == null || ruleTypeCheck((Type[])(arguments36!=null?arguments36.types:null).toArray())) ) {
                    	    	  if (!expression35.isReference())
                    	    	  	errorLog.add(new CannotBeDereferencedException(expression35, (IDENTIFIER37!=null?IDENTIFIER37.getLine():0), (IDENTIFIER37!=null?IDENTIFIER37.getCharPositionInLine():0), rt)); 
                    	    	  ReferenceType expt = (ReferenceType)expression35;
                    	    	  ArrayList<Type> argTypes = (arguments36!=null?arguments36.types:null); //((arguments36!=null?((CommonTree)arguments36.tree):null) == null)?null:(arguments36!=null?arguments36.types:null);
                    	    	  try {
                    		    	boolean isSameClass = (expt.getName() == rt.getName()); 
                    		    	t = expt.bindMethod(isSameClass, (IDENTIFIER37!=null?IDENTIFIER37.getText():null), argTypes);
                    	    	  } catch (EarlyBindingException ex) {
                    	    	  	errorLog.add(new CannotFindSymbolException(("method " + (IDENTIFIER37!=null?IDENTIFIER37.getText():null) + '(' + printArguments(argTypes) + ')'), expt.getName(), (IDENTIFIER37!=null?IDENTIFIER37.getLine():0), (IDENTIFIER37!=null?IDENTIFIER37.getCharPositionInLine():0), rt));
                    	    	  }
                        	  }
                        	

                    }
                    break;
                case 3 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:459:9: ^( ARRAYACCESS e1= expression e2= expression )
                    {
                    ARRAYACCESS38=(CommonTree)match(input,ARRAYACCESS,FOLLOW_ARRAYACCESS_in_selector2340); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_selector2344);
                    e1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_selector2348);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if (ruleTypeCheck(e1, e2)) {
                    	    	  if (!e1.isArray()) errorLog.add(new ArrayRequiredException(e1.toString(), (ARRAYACCESS38!=null?ARRAYACCESS38.getLine():0), (ARRAYACCESS38!=null?ARRAYACCESS38.getCharPositionInLine():0), rt));
                    	    	  if (!e2.isAssignableTo(BasicType.INT)) {
                    	    	  	if (e2.isCastableTo(	BasicType.INT))
                    	    	  		errorLog.add(new PossibleLossOfPrecisionException(BasicType.INT.toString(), e2.toString(), (ARRAYACCESS38!=null?ARRAYACCESS38.getLine():0), (ARRAYACCESS38!=null?ARRAYACCESS38.getCharPositionInLine():0), rt));
                    	    	  	else 
                    	    	  		errorLog.add(new IncompatibleTypesException(BasicType.INT.toString(), e2.toString(), (ARRAYACCESS38!=null?ARRAYACCESS38.getLine():0), (ARRAYACCESS38!=null?ARRAYACCESS38.getCharPositionInLine():0), rt));    	       
                    	    	  }
                    	    	  t = ((ArrayType)e1).getHostType(); 
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:473:1: creator returns [Type t] : ( arrayCreatorRest | createdName ( classCreatorRest )? );
    public final Type creator() throws RecognitionException {
        Type t = null;

        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:474:5: ( arrayCreatorRest | createdName ( classCreatorRest )? )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==ARRAYTYPE) ) {
                alt38=1;
            }
            else if ( (LA38_0==IDENTIFIER||(LA38_0>=CHAR && LA38_0<=BOOLEAN)) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:474:10: arrayCreatorRest
                    {
                    pushFollow(FOLLOW_arrayCreatorRest_in_creator2381);
                    arrayCreatorRest();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:475:10: createdName ( classCreatorRest )?
                    {
                    pushFollow(FOLLOW_createdName_in_creator2393);
                    createdName();

                    state._fsp--;

                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:475:22: ( classCreatorRest )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==ARGUMENTS) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:475:22: classCreatorRest
                            {
                            pushFollow(FOLLOW_classCreatorRest_in_creator2395);
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:479:1: createdName returns [Type t] : ( classType | primitiveType );
    public final Type createdName() throws RecognitionException {
        Type t = null;

        ReferenceType classType39 = null;

        BasicType primitiveType40 = null;


        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:480:5: ( classType | primitiveType )
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
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:480:9: classType
                    {
                    pushFollow(FOLLOW_classType_in_createdName2421);
                    classType39=classType();

                    state._fsp--;

                     t = classType39;      

                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:481:9: primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_createdName2437);
                    primitiveType40=primitiveType();

                    state._fsp--;

                     t = primitiveType40; 

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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:484:1: arrayCreatorRest : ( ( ^( ARRAYTYPE createdName ) arrayInitializer ) | ^( ARRAYTYPE arrayCreatorExpr expression ) );
    public final void arrayCreatorRest() throws RecognitionException {
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:485:5: ( ( ^( ARRAYTYPE createdName ) arrayInitializer ) | ^( ARRAYTYPE arrayCreatorExpr expression ) )
            int alt40=2;
            alt40 = dfa40.predict(input);
            switch (alt40) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:485:9: ( ^( ARRAYTYPE createdName ) arrayInitializer )
                    {
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:485:9: ( ^( ARRAYTYPE createdName ) arrayInitializer )
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:485:10: ^( ARRAYTYPE createdName ) arrayInitializer
                    {
                    match(input,ARRAYTYPE,FOLLOW_ARRAYTYPE_in_arrayCreatorRest2464); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_createdName_in_arrayCreatorRest2467);
                    createdName();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    pushFollow(FOLLOW_arrayInitializer_in_arrayCreatorRest2470);
                    arrayInitializer();

                    state._fsp--;


                    }


                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:486:8: ^( ARRAYTYPE arrayCreatorExpr expression )
                    {
                    match(input,ARRAYTYPE,FOLLOW_ARRAYTYPE_in_arrayCreatorRest2484); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_arrayCreatorExpr_in_arrayCreatorRest2487);
                    arrayCreatorExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_arrayCreatorRest2489);
                    expression();

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
    // $ANTLR end "arrayCreatorRest"


    // $ANTLR start "arrayCreatorExpr"
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:489:1: arrayCreatorExpr : ( ^( ARRAYTYPE arrayCreatorExpr expression ) | createdName );
    public final void arrayCreatorExpr() throws RecognitionException {
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:490:5: ( ^( ARRAYTYPE arrayCreatorExpr expression ) | createdName )
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
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:490:7: ^( ARRAYTYPE arrayCreatorExpr expression )
                    {
                    match(input,ARRAYTYPE,FOLLOW_ARRAYTYPE_in_arrayCreatorExpr2516); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_arrayCreatorExpr_in_arrayCreatorExpr2518);
                    arrayCreatorExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_arrayCreatorExpr2520);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:491:8: createdName
                    {
                    pushFollow(FOLLOW_createdName_in_arrayCreatorExpr2530);
                    createdName();

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
    // $ANTLR end "arrayCreatorExpr"


    // $ANTLR start "classCreatorRest"
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:494:1: classCreatorRest : arguments ;
    public final void classCreatorRest() throws RecognitionException {
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:495:5: ( arguments )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:495:9: arguments
            {
            pushFollow(FOLLOW_arguments_in_classCreatorRest2554);
            arguments();

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
    // $ANTLR end "classCreatorRest"


    // $ANTLR start "superMemberAccess"
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:498:1: superMemberAccess returns [Type t] : ( ^( METHODCALL SUPER IDENTIFIER arguments ) | ^( FIELDACCESS SUPER IDENTIFIER ) );
    public final Type superMemberAccess() throws RecognitionException {
        Type t = null;

        CommonTree IDENTIFIER42=null;
        CommonTree IDENTIFIER43=null;
        JaWalker.arguments_return arguments41 = null;


        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:499:5: ( ^( METHODCALL SUPER IDENTIFIER arguments ) | ^( FIELDACCESS SUPER IDENTIFIER ) )
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
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:499:7: ^( METHODCALL SUPER IDENTIFIER arguments )
                    {
                    match(input,METHODCALL,FOLLOW_METHODCALL_in_superMemberAccess2582); 

                    match(input, Token.DOWN, null); 
                    match(input,SUPER,FOLLOW_SUPER_in_superMemberAccess2584); 
                    IDENTIFIER42=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_superMemberAccess2586); 
                    pushFollow(FOLLOW_arguments_in_superMemberAccess2588);
                    arguments41=arguments();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if( (arguments41!=null?arguments41.types:null) == null || ruleTypeCheck((Type[])(arguments41!=null?arguments41.types:null).toArray()) ) {
                    	    	  try {
                    	          	t = rt.getSuperClass().bindMethod(false, (IDENTIFIER42!=null?IDENTIFIER42.getText():null), (arguments41!=null?arguments41.types:null));
                    		  } catch (EarlyBindingException ex) {
                    		   	errorLog.add(new CannotFindSymbolException(("method " + (IDENTIFIER42!=null?IDENTIFIER42.getText():null) + '(' + printArguments((arguments41!=null?arguments41.types:null)) + ')'), rt.getSuperClass().getName(), (IDENTIFIER42!=null?IDENTIFIER42.getLine():0), (IDENTIFIER42!=null?IDENTIFIER42.getCharPositionInLine():0), rt));
                    		  }
                    	  }
                        	

                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:508:9: ^( FIELDACCESS SUPER IDENTIFIER )
                    {
                    match(input,FIELDACCESS,FOLLOW_FIELDACCESS_in_superMemberAccess2608); 

                    match(input, Token.DOWN, null); 
                    match(input,SUPER,FOLLOW_SUPER_in_superMemberAccess2610); 
                    IDENTIFIER43=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_superMemberAccess2612); 

                    match(input, Token.UP, null); 
                     t = rt.getSuperClass().getField(false, (IDENTIFIER43!=null?IDENTIFIER43.getText():null));
                    	  if (t == null) errorLog.add(new CannotFindSymbolException(("field " + (IDENTIFIER43!=null?IDENTIFIER43.getText():null)), rt.getSuperClass().getName(), (IDENTIFIER43!=null?IDENTIFIER43.getLine():0), (IDENTIFIER43!=null?IDENTIFIER43.getCharPositionInLine():0), rt)); 
                    	

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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:514:1: arguments returns [ArrayList<Type> types] : ^( ARGUMENTS expressionList ) ;
    public final JaWalker.arguments_return arguments() throws RecognitionException {
        JaWalker.arguments_return retval = new JaWalker.arguments_return();
        retval.start = input.LT(1);

        ArrayList<Type> expressionList44 = null;


        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:515:5: ( ^( ARGUMENTS expressionList ) )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:515:8: ^( ARGUMENTS expressionList )
            {
            match(input,ARGUMENTS,FOLLOW_ARGUMENTS_in_arguments2653); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expressionList_in_arguments2655);
            expressionList44=expressionList();

            state._fsp--;


            match(input, Token.UP, null); 
             retval.types = expressionList44; 

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


    protected DFA33 dfa33 = new DFA33(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA40 dfa40 = new DFA40(this);
    static final String DFA33_eotS =
        "\33\uffff";
    static final String DFA33_eofS =
        "\33\uffff";
    static final String DFA33_minS =
        "\1\4\16\uffff\1\2\2\uffff\2\2\2\uffff\1\11\2\4\2\uffff";
    static final String DFA33_maxS =
        "\1\152\16\uffff\1\2\2\uffff\2\2\2\uffff\1\60\2\152\2\uffff";
    static final String DFA33_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\uffff\1\21\1\22\2\uffff\1\23\1\24\3\uffff\1\20\1\17";
    static final String DFA33_specialS =
        "\33\uffff}>";
    static final String[] DFA33_transitionS = {
            "\1\23\1\uffff\1\22\1\24\1\25\23\uffff\1\15\1\21\1\15\1\21\2"+
            "\15\1\17\1\uffff\1\25\14\uffff\1\25\1\uffff\10\25\6\uffff\1"+
            "\13\1\14\1\20\13\uffff\1\1\1\2\1\3\1\4\1\5\17\uffff\1\7\1\10"+
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
            "\1\25\10\24\6\uffff\3\24\13\uffff\5\24\17\uffff\5\24\2\uffff"+
            "\1\24",
            "\1\24\1\uffff\3\24\23\uffff\7\24\1\uffff\1\24\14\uffff\1\24"+
            "\1\25\10\24\6\uffff\3\24\13\uffff\5\24\17\uffff\5\24\2\uffff"+
            "\1\24",
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
            return "354:1: expression returns [Type t] : ( ^( EQ e1= expression e2= expression ) | ^( PLUS e1= expression e2= expression ) | ^( MINUS e1= expression e2= expression ) | ^( STAR e1= expression e2= expression ) | ^( SLASH e1= expression e2= expression ) | ^(mod= '%' e1= expression e2= expression ) | ^(or= '||' e1= expression e2= expression ) | ^(and= '&&' e1= expression e2= expression ) | ^(eq= '==' e1= expression e2= expression ) | ^(nq= '!=' e1= expression e2= expression ) | ^( INSTANCEOF e= expression type ) | ^( COMPAREOP e1= expression e2= expression ) | ^(op= ( UNARYPLUS | UNARYMINUS | PREINC | PREDEC ) e= expression ) | ^(op= '!' e= expression ) | ^( CAST pt= primitiveType e= expression ) | ^( CAST npt= nonPrimitiveType e= expression ) | ^( NEW creator ) | ^(op= ( POSTINC | POSTDEC ) (e= selector | e= primary ) ) | selector | primary );";
        }
    }
    static final String DFA34_eotS =
        "\13\uffff";
    static final String DFA34_eofS =
        "\13\uffff";
    static final String DFA34_minS =
        "\1\4\4\uffff\1\2\1\11\4\uffff";
    static final String DFA34_maxS =
        "\1\72\4\uffff\1\2\1\60\4\uffff";
    static final String DFA34_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\2\uffff\1\5\1\6\1\10\1\7";
    static final String DFA34_specialS =
        "\13\uffff}>";
    static final String[] DFA34_transitionS = {
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
            return "418:1: primary returns [Type t] : ( THIS | superMemberAccess | literal | IDENTIFIER | ^( DOTCLASS ^( ARRAYTYPE type ) ) | ^( DOTCLASS IDENTIFIER ) | ^( DOTCLASS primitiveType ) | ^( DOTCLASS VOID ) );";
        }
    }
    static final String DFA40_eotS =
        "\16\uffff";
    static final String DFA40_eofS =
        "\16\uffff";
    static final String DFA40_minS =
        "\1\11\1\2\1\11\11\3\2\uffff";
    static final String DFA40_maxS =
        "\1\11\1\2\1\60\11\152\2\uffff";
    static final String DFA40_acceptS =
        "\14\uffff\1\2\1\1";
    static final String DFA40_specialS =
        "\16\uffff}>";
    static final String[] DFA40_transitionS = {
            "\1\1",
            "\1\2",
            "\1\14\32\uffff\1\3\4\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12"+
            "\1\13",
            "\1\15\1\14\1\uffff\3\14\23\uffff\7\14\1\uffff\1\14\14\uffff"+
            "\1\14\1\uffff\10\14\6\uffff\3\14\13\uffff\5\14\17\uffff\5\14"+
            "\2\uffff\1\14",
            "\1\15\1\14\1\uffff\3\14\23\uffff\7\14\1\uffff\1\14\14\uffff"+
            "\1\14\1\uffff\10\14\6\uffff\3\14\13\uffff\5\14\17\uffff\5\14"+
            "\2\uffff\1\14",
            "\1\15\1\14\1\uffff\3\14\23\uffff\7\14\1\uffff\1\14\14\uffff"+
            "\1\14\1\uffff\10\14\6\uffff\3\14\13\uffff\5\14\17\uffff\5\14"+
            "\2\uffff\1\14",
            "\1\15\1\14\1\uffff\3\14\23\uffff\7\14\1\uffff\1\14\14\uffff"+
            "\1\14\1\uffff\10\14\6\uffff\3\14\13\uffff\5\14\17\uffff\5\14"+
            "\2\uffff\1\14",
            "\1\15\1\14\1\uffff\3\14\23\uffff\7\14\1\uffff\1\14\14\uffff"+
            "\1\14\1\uffff\10\14\6\uffff\3\14\13\uffff\5\14\17\uffff\5\14"+
            "\2\uffff\1\14",
            "\1\15\1\14\1\uffff\3\14\23\uffff\7\14\1\uffff\1\14\14\uffff"+
            "\1\14\1\uffff\10\14\6\uffff\3\14\13\uffff\5\14\17\uffff\5\14"+
            "\2\uffff\1\14",
            "\1\15\1\14\1\uffff\3\14\23\uffff\7\14\1\uffff\1\14\14\uffff"+
            "\1\14\1\uffff\10\14\6\uffff\3\14\13\uffff\5\14\17\uffff\5\14"+
            "\2\uffff\1\14",
            "\1\15\1\14\1\uffff\3\14\23\uffff\7\14\1\uffff\1\14\14\uffff"+
            "\1\14\1\uffff\10\14\6\uffff\3\14\13\uffff\5\14\17\uffff\5\14"+
            "\2\uffff\1\14",
            "\1\15\1\14\1\uffff\3\14\23\uffff\7\14\1\uffff\1\14\14\uffff"+
            "\1\14\1\uffff\10\14\6\uffff\3\14\13\uffff\5\14\17\uffff\5\14"+
            "\2\uffff\1\14",
            "",
            ""
    };

    static final short[] DFA40_eot = DFA.unpackEncodedString(DFA40_eotS);
    static final short[] DFA40_eof = DFA.unpackEncodedString(DFA40_eofS);
    static final char[] DFA40_min = DFA.unpackEncodedStringToUnsignedChars(DFA40_minS);
    static final char[] DFA40_max = DFA.unpackEncodedStringToUnsignedChars(DFA40_maxS);
    static final short[] DFA40_accept = DFA.unpackEncodedString(DFA40_acceptS);
    static final short[] DFA40_special = DFA.unpackEncodedString(DFA40_specialS);
    static final short[][] DFA40_transition;

    static {
        int numStates = DFA40_transitionS.length;
        DFA40_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA40_transition[i] = DFA.unpackEncodedString(DFA40_transitionS[i]);
        }
    }

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = DFA40_eot;
            this.eof = DFA40_eof;
            this.min = DFA40_min;
            this.max = DFA40_max;
            this.accept = DFA40_accept;
            this.special = DFA40_special;
            this.transition = DFA40_transition;
        }
        public String getDescription() {
            return "484:1: arrayCreatorRest : ( ( ^( ARRAYTYPE createdName ) arrayInitializer ) | ^( ARRAYTYPE arrayCreatorExpr expression ) );";
        }
    }
 

    public static final BitSet FOLLOW_classDeclaration_in_compilationUnit61 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_in_classDeclaration86 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classDeclaration88 = new BitSet(new long[]{0x0000001000001C08L});
    public static final BitSet FOLLOW_classType_in_classDeclaration90 = new BitSet(new long[]{0x0000000000001C08L});
    public static final BitSet FOLLOW_classBody_in_classDeclaration93 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_classBodyDeclaration_in_classBody120 = new BitSet(new long[]{0x0000000000001C02L});
    public static final BitSet FOLLOW_memberDeclaration_in_classBodyDeclaration140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldDeclaration_in_memberDeclaration163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodAndConstructorDeclaration_in_memberDeclaration171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_METHOD_in_methodAndConstructorDeclaration210 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifier_in_methodAndConstructorDeclaration212 = new BitSet(new long[]{0x0001FE1000000200L});
    public static final BitSet FOLLOW_type_in_methodAndConstructorDeclaration214 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_methodDeclaration_in_methodAndConstructorDeclaration217 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_METHOD_in_methodAndConstructorDeclaration232 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifier_in_methodAndConstructorDeclaration234 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_VOID_in_methodAndConstructorDeclaration236 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_methodAndConstructorDeclaration238 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_voidMethodDeclaratorRest_in_methodAndConstructorDeclaration242 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONSTR_in_methodAndConstructorDeclaration257 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifier_in_methodAndConstructorDeclaration259 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_methodAndConstructorDeclaration261 = new BitSet(new long[]{0x0000000000042008L});
    public static final BitSet FOLLOW_formalParameters_in_methodAndConstructorDeclaration265 = new BitSet(new long[]{0x0000000000040008L});
    public static final BitSet FOLLOW_constructorBody_in_methodAndConstructorDeclaration268 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_methodDeclaration299 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_formalParameters_in_methodDeclaration303 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_methodBody_in_methodDeclaration305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIELD_in_fieldDeclaration325 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifier_in_fieldDeclaration327 = new BitSet(new long[]{0x0001FE1000000200L});
    public static final BitSet FOLLOW_variableDeclarator_in_fieldDeclaration329 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_formalParameters_in_voidMethodDeclaratorRest352 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_methodBody_in_voidMethodDeclaratorRest354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_variableDeclarator377 = new BitSet(new long[]{0x07FA0017F80001D2L,0x000004F8000F800EL});
    public static final BitSet FOLLOW_variableInitializer_in_variableDeclarator382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_variableDeclaratorId411 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_variableDeclaratorId413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayInitializer_in_variableInitializer438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_variableInitializer448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAYINIT_in_arrayInitializer468 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableInitializer_in_arrayInitializer470 = new BitSet(new long[]{0x07FA0017F80001D8L,0x000004F8000F800EL});
    public static final BitSet FOLLOW_variableInitializer_in_arrayInitializer473 = new BitSet(new long[]{0x07FA0017F80001D8L,0x000004F8000F800EL});
    public static final BitSet FOLLOW_set_in_modifier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonPrimitiveType_in_type535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_type545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAYTYPE_in_nonPrimitiveType573 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_nonPrimitiveType_in_nonPrimitiveType577 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_classType_in_nonPrimitiveType590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAYTYPE_in_nonPrimitiveType624 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primitiveType_in_nonPrimitiveType626 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classType657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_primitiveType682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BYTE_in_primitiveType697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHORT_in_primitiveType712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_primitiveType726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_in_primitiveType742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_primitiveType757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_primitiveType771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_primitiveType784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FPARMS_in_formalParameters810 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_formalParameterDecls_in_formalParameters812 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FPARM_in_formalParameterDecls837 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_formalParameterDecls839 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_formalParameterDecls_in_formalParameterDecls844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FMULTPARM_in_formalParameterDecls854 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_formalParameterDecls856 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MBODY_in_methodBody883 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_methodBody885 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CBODY_in_constructorBody944 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_explicitConstructorInvocation_in_constructorBody946 = new BitSet(new long[]{0xB800000002380008L});
    public static final BitSet FOLLOW_blockStatement_in_constructorBody949 = new BitSet(new long[]{0xB800000002380008L});
    public static final BitSet FOLLOW_CONSTRCALL_in_explicitConstructorInvocation971 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_THIS_in_explicitConstructorInvocation973 = new BitSet(new long[]{0x0000000000004008L});
    public static final BitSet FOLLOW_arguments_in_explicitConstructorInvocation976 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONSTRCALL_in_explicitConstructorInvocation987 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SUPER_in_explicitConstructorInvocation989 = new BitSet(new long[]{0x0000000000004008L});
    public static final BitSet FOLLOW_arguments_in_explicitConstructorInvocation991 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INTLITERAL_in_literal1016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONGLITERAL_in_literal1032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOATLITERAL_in_literal1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLELITERAL_in_literal1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARLITERAL_in_literal1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_literal1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_literal1100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULLLITERAL_in_literal1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockStatement_in_block1154 = new BitSet(new long[]{0xB800000002380002L});
    public static final BitSet FOLLOW_localVariableDeclarationStatement_in_blockStatement1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_blockStatement1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localVariableDeclaration_in_localVariableDeclarationStatement1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARDECL_in_localVariableDeclaration1231 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableDeclarator_in_localVariableDeclaration1233 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLOCK_in_statement1270 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_statement1272 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_in_statement1284 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CONDITION_in_statement1287 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement1289 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_THEN_in_statement1293 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_statement1295 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_elseStmt_in_statement1298 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FOR_in_statement1311 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INIT_in_statement1315 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_forInit_in_statement1317 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONDITION_in_statement1324 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement1326 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UPDATE_in_statement1333 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_forUpdate_in_statement1335 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_statement_in_statement1340 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WHILE_in_statement1353 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CONDITION_in_statement1356 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement1358 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_statement_in_statement1361 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DOWHILE_in_statement1373 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CONDITION_in_statement1376 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement1378 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_statement_in_statement1381 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RETURN_in_statement1393 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement1395 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STMT_in_statement1409 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statementExpression_in_statement1411 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ELSE_in_elseStmt1434 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_elseStmt1436 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_localVariableDeclaration_in_forInit1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionList_in_forInit1466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionList_in_forUpdate1485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionList1520 = new BitSet(new long[]{0x07FA0017F80001D2L,0x000004F8000F800EL});
    public static final BitSet FOLLOW_expression_in_statementExpression1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_constantExpression1566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_expression1594 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1598 = new BitSet(new long[]{0x07FA0017F80001D0L,0x000004F8000F800EL});
    public static final BitSet FOLLOW_expression_in_expression1602 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_in_expression1614 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1621 = new BitSet(new long[]{0x07FA0017F80001D0L,0x000004F8000F800EL});
    public static final BitSet FOLLOW_expression_in_expression1625 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_expression1637 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1643 = new BitSet(new long[]{0x07FA0017F80001D0L,0x000004F8000F800EL});
    public static final BitSet FOLLOW_expression_in_expression1647 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STAR_in_expression1659 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1666 = new BitSet(new long[]{0x07FA0017F80001D0L,0x000004F8000F800EL});
    public static final BitSet FOLLOW_expression_in_expression1670 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SLASH_in_expression1682 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1688 = new BitSet(new long[]{0x07FA0017F80001D0L,0x000004F8000F800EL});
    public static final BitSet FOLLOW_expression_in_expression1692 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_103_in_expression1708 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1712 = new BitSet(new long[]{0x07FA0017F80001D0L,0x000004F8000F800EL});
    public static final BitSet FOLLOW_expression_in_expression1716 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_99_in_expression1732 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1737 = new BitSet(new long[]{0x07FA0017F80001D0L,0x000004F8000F800EL});
    public static final BitSet FOLLOW_expression_in_expression1741 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_100_in_expression1757 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1761 = new BitSet(new long[]{0x07FA0017F80001D0L,0x000004F8000F800EL});
    public static final BitSet FOLLOW_expression_in_expression1765 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_101_in_expression1781 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1786 = new BitSet(new long[]{0x07FA0017F80001D0L,0x000004F8000F800EL});
    public static final BitSet FOLLOW_expression_in_expression1790 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_102_in_expression1806 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1811 = new BitSet(new long[]{0x07FA0017F80001D0L,0x000004F8000F800EL});
    public static final BitSet FOLLOW_expression_in_expression1815 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INSTANCEOF_in_expression1827 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1831 = new BitSet(new long[]{0x0001FE1000000200L});
    public static final BitSet FOLLOW_type_in_expression1833 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COMPAREOP_in_expression1853 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1857 = new BitSet(new long[]{0x07FA0017F80001D0L,0x000004F8000F800EL});
    public static final BitSet FOLLOW_expression_in_expression1861 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_expression1883 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1899 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_106_in_expression1937 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1941 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CAST_in_expression1960 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primitiveType_in_expression1964 = new BitSet(new long[]{0x07FA0017F80001D0L,0x000004F8000F800EL});
    public static final BitSet FOLLOW_expression_in_expression1968 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CAST_in_expression1987 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_nonPrimitiveType_in_expression1991 = new BitSet(new long[]{0x07FA0017F80001D0L,0x000004F8000F800EL});
    public static final BitSet FOLLOW_expression_in_expression1995 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NEW_in_expression2014 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_creator_in_expression2016 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_expression2030 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_selector_in_expression2041 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_primary_in_expression2047 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_selector_in_expression2072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_in_expression2084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_primary2125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_superMemberAccess_in_primary2137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primary2149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_primary2161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOTCLASS_in_primary2179 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ARRAYTYPE_in_primary2182 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_primary2184 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DOTCLASS_in_primary2199 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_primary2201 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DOTCLASS_in_primary2222 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primitiveType_in_primary2224 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DOTCLASS_in_primary2242 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VOID_in_primary2244 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FIELDACCESS_in_selector2288 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_selector2290 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_selector2292 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_METHODCALL_in_selector2311 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_selector2313 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_selector2315 = new BitSet(new long[]{0x0000000000004008L});
    public static final BitSet FOLLOW_arguments_in_selector2317 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARRAYACCESS_in_selector2340 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_selector2344 = new BitSet(new long[]{0x07FA0017F80001D0L,0x000004F8000F800EL});
    public static final BitSet FOLLOW_expression_in_selector2348 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_arrayCreatorRest_in_creator2381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createdName_in_creator2393 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_classCreatorRest_in_creator2395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classType_in_createdName2421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_createdName2437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAYTYPE_in_arrayCreatorRest2464 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_createdName_in_arrayCreatorRest2467 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_arrayInitializer_in_arrayCreatorRest2470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAYTYPE_in_arrayCreatorRest2484 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arrayCreatorExpr_in_arrayCreatorRest2487 = new BitSet(new long[]{0x07FA0017F80001D0L,0x000004F8000F800EL});
    public static final BitSet FOLLOW_expression_in_arrayCreatorRest2489 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARRAYTYPE_in_arrayCreatorExpr2516 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arrayCreatorExpr_in_arrayCreatorExpr2518 = new BitSet(new long[]{0x07FA0017F80001D0L,0x000004F8000F800EL});
    public static final BitSet FOLLOW_expression_in_arrayCreatorExpr2520 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_createdName_in_arrayCreatorExpr2530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arguments_in_classCreatorRest2554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_METHODCALL_in_superMemberAccess2582 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SUPER_in_superMemberAccess2584 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_superMemberAccess2586 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_arguments_in_superMemberAccess2588 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FIELDACCESS_in_superMemberAccess2608 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SUPER_in_superMemberAccess2610 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_superMemberAccess2612 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARGUMENTS_in_arguments2653 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expressionList_in_arguments2655 = new BitSet(new long[]{0x0000000000000008L});

}