// $ANTLR 3.2 Sep 23, 2009 12:02:23 D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g 2010-10-06 19:48:41

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
        			 



    // $ANTLR start "compilationUnit"
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:126:1: compilationUnit : classDeclaration ;
    public final void compilationUnit() throws RecognitionException {
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:127:5: ( classDeclaration )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:127:8: classDeclaration
            {
            pushFollow(FOLLOW_classDeclaration_in_compilationUnit56);
            classDeclaration();

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
    // $ANTLR end "compilationUnit"


    // $ANTLR start "classDeclaration"
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:130:1: classDeclaration : ^( CLASS IDENTIFIER ( classType )? classBody ) ;
    public final void classDeclaration() throws RecognitionException {
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:131:5: ( ^( CLASS IDENTIFIER ( classType )? classBody ) )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:131:9: ^( CLASS IDENTIFIER ( classType )? classBody )
            {
            match(input,CLASS,FOLLOW_CLASS_in_classDeclaration81); 

            match(input, Token.DOWN, null); 
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classDeclaration83); 
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:131:28: ( classType )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==IDENTIFIER) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:131:28: classType
                    {
                    pushFollow(FOLLOW_classType_in_classDeclaration85);
                    classType();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_classBody_in_classDeclaration88);
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:134:1: classBody : ( classBodyDeclaration )* ;
    public final void classBody() throws RecognitionException {
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:135:5: ( ( classBodyDeclaration )* )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:135:9: ( classBodyDeclaration )*
            {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:135:9: ( classBodyDeclaration )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=METHOD && LA2_0<=CONSTR)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:135:9: classBodyDeclaration
            	    {
            	    pushFollow(FOLLOW_classBodyDeclaration_in_classBody115);
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:138:1: classBodyDeclaration : memberDeclaration ;
    public final void classBodyDeclaration() throws RecognitionException {
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:139:5: ( memberDeclaration )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:139:9: memberDeclaration
            {
            pushFollow(FOLLOW_memberDeclaration_in_classBodyDeclaration135);
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:142:1: memberDeclaration : ( fieldDeclaration | methodAndConstructorDeclaration );
    public final void memberDeclaration() throws RecognitionException {
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:143:5: ( fieldDeclaration | methodAndConstructorDeclaration )
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
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:143:9: fieldDeclaration
                    {
                    pushFollow(FOLLOW_fieldDeclaration_in_memberDeclaration158);
                    fieldDeclaration();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:144:7: methodAndConstructorDeclaration
                    {
                    pushFollow(FOLLOW_methodAndConstructorDeclaration_in_memberDeclaration166);
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:147:1: methodAndConstructorDeclaration : ( ^( METHOD modifier type methodDeclaration ) | ^( METHOD modifier VOID IDENTIFIER voidMethodDeclaratorRest ) | ^( CONSTR modifier IDENTIFIER ( formalParameters )? ( constructorBody )? ) );
    public final void methodAndConstructorDeclaration() throws RecognitionException {
        JaScope_stack.push(new JaScope_scope());

        CommonTree IDENTIFIER1=null;
        CommonTree IDENTIFIER2=null;


        	((JaScope_scope)JaScope_stack.peek()).symbols = new HashMap<String, Type>();
        	formalParameters = new LinkedList<String>();

        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:156:5: ( ^( METHOD modifier type methodDeclaration ) | ^( METHOD modifier VOID IDENTIFIER voidMethodDeclaratorRest ) | ^( CONSTR modifier IDENTIFIER ( formalParameters )? ( constructorBody )? ) )
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
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:156:9: ^( METHOD modifier type methodDeclaration )
                    {
                    match(input,METHOD,FOLLOW_METHOD_in_methodAndConstructorDeclaration205); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_modifier_in_methodAndConstructorDeclaration207);
                    modifier();

                    state._fsp--;

                    pushFollow(FOLLOW_type_in_methodAndConstructorDeclaration209);
                    type();

                    state._fsp--;

                    pushFollow(FOLLOW_methodDeclaration_in_methodAndConstructorDeclaration212);
                    methodDeclaration();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:157:9: ^( METHOD modifier VOID IDENTIFIER voidMethodDeclaratorRest )
                    {
                    match(input,METHOD,FOLLOW_METHOD_in_methodAndConstructorDeclaration227); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_modifier_in_methodAndConstructorDeclaration229);
                    modifier();

                    state._fsp--;

                    match(input,VOID,FOLLOW_VOID_in_methodAndConstructorDeclaration231); 
                    IDENTIFIER1=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_methodAndConstructorDeclaration233); 
                     ((JaScope_scope)JaScope_stack.peek()).name = (IDENTIFIER1!=null?IDENTIFIER1.getText():null); 
                    pushFollow(FOLLOW_voidMethodDeclaratorRest_in_methodAndConstructorDeclaration237);
                    voidMethodDeclaratorRest();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:158:9: ^( CONSTR modifier IDENTIFIER ( formalParameters )? ( constructorBody )? )
                    {
                    match(input,CONSTR,FOLLOW_CONSTR_in_methodAndConstructorDeclaration252); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_modifier_in_methodAndConstructorDeclaration254);
                    modifier();

                    state._fsp--;

                    IDENTIFIER2=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_methodAndConstructorDeclaration256); 
                     ((JaScope_scope)JaScope_stack.peek()).name = (IDENTIFIER2!=null?IDENTIFIER2.getText():null); 
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:158:77: ( formalParameters )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==FPARMS) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:158:77: formalParameters
                            {
                            pushFollow(FOLLOW_formalParameters_in_methodAndConstructorDeclaration260);
                            formalParameters();

                            state._fsp--;


                            }
                            break;

                    }

                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:158:95: ( constructorBody )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==CBODY) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:158:95: constructorBody
                            {
                            pushFollow(FOLLOW_constructorBody_in_methodAndConstructorDeclaration263);
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:162:1: methodDeclaration : IDENTIFIER formalParameters methodBody ;
    public final void methodDeclaration() throws RecognitionException {
        CommonTree IDENTIFIER3=null;

        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:163:5: ( IDENTIFIER formalParameters methodBody )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:163:9: IDENTIFIER formalParameters methodBody
            {
            IDENTIFIER3=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_methodDeclaration294); 
             ((JaScope_scope)JaScope_stack.peek()).name = (IDENTIFIER3!=null?IDENTIFIER3.getText():null); 
            pushFollow(FOLLOW_formalParameters_in_methodDeclaration298);
            formalParameters();

            state._fsp--;

            pushFollow(FOLLOW_methodBody_in_methodDeclaration300);
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:166:1: fieldDeclaration : ^( FIELD modifier variableDeclarator ) ;
    public final void fieldDeclaration() throws RecognitionException {
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:167:5: ( ^( FIELD modifier variableDeclarator ) )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:167:9: ^( FIELD modifier variableDeclarator )
            {
            match(input,FIELD,FOLLOW_FIELD_in_fieldDeclaration320); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_modifier_in_fieldDeclaration322);
            modifier();

            state._fsp--;

            pushFollow(FOLLOW_variableDeclarator_in_fieldDeclaration324);
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:170:1: voidMethodDeclaratorRest : formalParameters methodBody ;
    public final void voidMethodDeclaratorRest() throws RecognitionException {
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:171:5: ( formalParameters methodBody )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:171:7: formalParameters methodBody
            {
            pushFollow(FOLLOW_formalParameters_in_voidMethodDeclaratorRest347);
            formalParameters();

            state._fsp--;

            pushFollow(FOLLOW_methodBody_in_voidMethodDeclaratorRest349);
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:174:1: variableDeclarator returns [CommonTree id, Type t] : variableDeclaratorId ( variableInitializer )? ;
    public final JaWalker.variableDeclarator_return variableDeclarator() throws RecognitionException {
        JaWalker.variableDeclarator_return retval = new JaWalker.variableDeclarator_return();
        retval.start = input.LT(1);

        JaWalker.variableDeclaratorId_return variableDeclaratorId4 = null;


        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:175:5: ( variableDeclaratorId ( variableInitializer )? )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:175:9: variableDeclaratorId ( variableInitializer )?
            {
            pushFollow(FOLLOW_variableDeclaratorId_in_variableDeclarator372);
            variableDeclaratorId4=variableDeclaratorId();

            state._fsp--;

             retval.id = (variableDeclaratorId4!=null?variableDeclaratorId4.id:null); retval.t = (variableDeclaratorId4!=null?variableDeclaratorId4.t:null); 
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:175:96: ( variableInitializer )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==METHODCALL||(LA7_0>=FIELDACCESS && LA7_0<=DOTCLASS)||(LA7_0>=ARRAYINIT && LA7_0<=CAST)||LA7_0==IDENTIFIER||LA7_0==THIS||(LA7_0>=INTLITERAL && LA7_0<=NULLLITERAL)||(LA7_0>=INSTANCEOF && LA7_0<=NEW)||(LA7_0>=EQ && LA7_0<=SLASH)||(LA7_0>=99 && LA7_0<=103)||LA7_0==106) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:175:97: variableInitializer
                    {
                    pushFollow(FOLLOW_variableInitializer_in_variableDeclarator377);
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:178:1: variableDeclaratorId returns [CommonTree id, Type t] : type IDENTIFIER ;
    public final JaWalker.variableDeclaratorId_return variableDeclaratorId() throws RecognitionException {
        JaWalker.variableDeclaratorId_return retval = new JaWalker.variableDeclaratorId_return();
        retval.start = input.LT(1);

        CommonTree IDENTIFIER5=null;
        Type type6 = null;


        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:179:5: ( type IDENTIFIER )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:179:9: type IDENTIFIER
            {
            pushFollow(FOLLOW_type_in_variableDeclaratorId406);
            type6=type();

            state._fsp--;

            IDENTIFIER5=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variableDeclaratorId408); 
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:182:1: variableInitializer : ( arrayInitializer | expression );
    public final void variableInitializer() throws RecognitionException {
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:183:5: ( arrayInitializer | expression )
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
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:183:9: arrayInitializer
                    {
                    pushFollow(FOLLOW_arrayInitializer_in_variableInitializer433);
                    arrayInitializer();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:184:9: expression
                    {
                    pushFollow(FOLLOW_expression_in_variableInitializer443);
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:187:1: arrayInitializer : ^( ARRAYINIT variableInitializer ( variableInitializer )* ) ;
    public final void arrayInitializer() throws RecognitionException {
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:188:5: ( ^( ARRAYINIT variableInitializer ( variableInitializer )* ) )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:188:9: ^( ARRAYINIT variableInitializer ( variableInitializer )* )
            {
            match(input,ARRAYINIT,FOLLOW_ARRAYINIT_in_arrayInitializer463); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_variableInitializer_in_arrayInitializer465);
            variableInitializer();

            state._fsp--;

            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:188:41: ( variableInitializer )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==METHODCALL||(LA9_0>=FIELDACCESS && LA9_0<=DOTCLASS)||(LA9_0>=ARRAYINIT && LA9_0<=CAST)||LA9_0==IDENTIFIER||LA9_0==THIS||(LA9_0>=INTLITERAL && LA9_0<=NULLLITERAL)||(LA9_0>=INSTANCEOF && LA9_0<=NEW)||(LA9_0>=EQ && LA9_0<=SLASH)||(LA9_0>=99 && LA9_0<=103)||LA9_0==106) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:188:42: variableInitializer
            	    {
            	    pushFollow(FOLLOW_variableInitializer_in_arrayInitializer468);
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:191:1: modifier : ( PUBLIC | PRIVATE );
    public final void modifier() throws RecognitionException {
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:192:5: ( PUBLIC | PRIVATE )
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:196:1: type returns [Type t] : ( nonPrimitiveType | primitiveType );
    public final Type type() throws RecognitionException {
        Type t = null;

        ComplexType nonPrimitiveType7 = null;

        BasicType primitiveType8 = null;


        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:197:5: ( nonPrimitiveType | primitiveType )
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
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:197:7: nonPrimitiveType
                    {
                    pushFollow(FOLLOW_nonPrimitiveType_in_type530);
                    nonPrimitiveType7=nonPrimitiveType();

                    state._fsp--;

                     t = nonPrimitiveType7; 

                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:198:7: primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_type540);
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:201:1: nonPrimitiveType returns [ComplexType t] : ( ^( ARRAYTYPE npt= nonPrimitiveType ) | classType | ^( ARRAYTYPE primitiveType ) );
    public final ComplexType nonPrimitiveType() throws RecognitionException {
        ComplexType t = null;

        ComplexType npt = null;

        ReferenceType classType9 = null;

        BasicType primitiveType10 = null;


        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:202:5: ( ^( ARRAYTYPE npt= nonPrimitiveType ) | classType | ^( ARRAYTYPE primitiveType ) )
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
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:202:7: ^( ARRAYTYPE npt= nonPrimitiveType )
                    {
                    match(input,ARRAYTYPE,FOLLOW_ARRAYTYPE_in_nonPrimitiveType568); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_nonPrimitiveType_in_nonPrimitiveType572);
                    npt=nonPrimitiveType();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     t = (ComplexType)ParserHelper.createArrayType(npt, 1); 

                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:203:9: classType
                    {
                    pushFollow(FOLLOW_classType_in_nonPrimitiveType585);
                    classType9=classType();

                    state._fsp--;

                     t = classType9; 

                    }
                    break;
                case 3 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:204:7: ^( ARRAYTYPE primitiveType )
                    {
                    match(input,ARRAYTYPE,FOLLOW_ARRAYTYPE_in_nonPrimitiveType619); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_primitiveType_in_nonPrimitiveType621);
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:207:1: classType returns [ReferenceType t] : IDENTIFIER ;
    public final ReferenceType classType() throws RecognitionException {
        ReferenceType t = null;

        CommonTree IDENTIFIER11=null;

        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:208:5: ( IDENTIFIER )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:208:7: IDENTIFIER
            {
            IDENTIFIER11=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classType652); 
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:211:1: primitiveType returns [BasicType bs] : ( CHAR | BYTE | SHORT | INT | LONG | FLOAT | DOUBLE | BOOLEAN );
    public final BasicType primitiveType() throws RecognitionException {
        BasicType bs = null;

        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:212:5: ( CHAR | BYTE | SHORT | INT | LONG | FLOAT | DOUBLE | BOOLEAN )
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
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:212:9: CHAR
                    {
                    match(input,CHAR,FOLLOW_CHAR_in_primitiveType677); 
                     bs = BasicType.CHAR;    

                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:213:9: BYTE
                    {
                    match(input,BYTE,FOLLOW_BYTE_in_primitiveType692); 
                     bs = BasicType.BYTE;    

                    }
                    break;
                case 3 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:214:9: SHORT
                    {
                    match(input,SHORT,FOLLOW_SHORT_in_primitiveType707); 
                     bs = BasicType.SHORT;   

                    }
                    break;
                case 4 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:215:9: INT
                    {
                    match(input,INT,FOLLOW_INT_in_primitiveType721); 
                     bs = BasicType.INT;     

                    }
                    break;
                case 5 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:216:9: LONG
                    {
                    match(input,LONG,FOLLOW_LONG_in_primitiveType737); 
                     bs = BasicType.LONG;    

                    }
                    break;
                case 6 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:217:9: FLOAT
                    {
                    match(input,FLOAT,FOLLOW_FLOAT_in_primitiveType752); 
                     bs = BasicType.FLOAT;   

                    }
                    break;
                case 7 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:218:9: DOUBLE
                    {
                    match(input,DOUBLE,FOLLOW_DOUBLE_in_primitiveType766); 
                     bs = BasicType.DOUBLE;  

                    }
                    break;
                case 8 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:219:9: BOOLEAN
                    {
                    match(input,BOOLEAN,FOLLOW_BOOLEAN_in_primitiveType779); 
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:222:1: formalParameters : ^( FPARMS ( formalParameterDecls )? ) ;
    public final void formalParameters() throws RecognitionException {
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:223:5: ( ^( FPARMS ( formalParameterDecls )? ) )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:223:9: ^( FPARMS ( formalParameterDecls )? )
            {
            match(input,FPARMS,FOLLOW_FPARMS_in_formalParameters805); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:223:18: ( formalParameterDecls )?
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=FPARM && LA13_0<=FMULTPARM)) ) {
                    alt13=1;
                }
                switch (alt13) {
                    case 1 :
                        // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:223:18: formalParameterDecls
                        {
                        pushFollow(FOLLOW_formalParameterDecls_in_formalParameters807);
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:226:1: formalParameterDecls : ( ^( FPARM variableDeclaratorId ) ( formalParameterDecls )? | ^( FMULTPARM variableDeclaratorId ) );
    public final void formalParameterDecls() throws RecognitionException {
        JaWalker.variableDeclaratorId_return variableDeclaratorId12 = null;

        JaWalker.variableDeclaratorId_return variableDeclaratorId13 = null;


        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:227:5: ( ^( FPARM variableDeclaratorId ) ( formalParameterDecls )? | ^( FMULTPARM variableDeclaratorId ) )
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
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:227:7: ^( FPARM variableDeclaratorId ) ( formalParameterDecls )?
                    {
                    match(input,FPARM,FOLLOW_FPARM_in_formalParameterDecls832); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_variableDeclaratorId_in_formalParameterDecls834);
                    variableDeclaratorId12=variableDeclaratorId();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     formalParameters.add((variableDeclaratorId12!=null?variableDeclaratorId12.id:null).getText()); addVariableToScope((variableDeclaratorId12!=null?variableDeclaratorId12.id:null), (variableDeclaratorId12!=null?variableDeclaratorId12.t:null)); 
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:227:170: ( formalParameterDecls )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( ((LA14_0>=FPARM && LA14_0<=FMULTPARM)) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:227:170: formalParameterDecls
                            {
                            pushFollow(FOLLOW_formalParameterDecls_in_formalParameterDecls839);
                            formalParameterDecls();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:228:7: ^( FMULTPARM variableDeclaratorId )
                    {
                    match(input,FMULTPARM,FOLLOW_FMULTPARM_in_formalParameterDecls849); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_variableDeclaratorId_in_formalParameterDecls851);
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:231:1: methodBody : ^( MBODY block ) ;
    public final void methodBody() throws RecognitionException {
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:232:5: ( ^( MBODY block ) )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:232:9: ^( MBODY block )
            {
            match(input,MBODY,FOLLOW_MBODY_in_methodBody878); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                pushFollow(FOLLOW_block_in_methodBody880);
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:236:1: constructorBody : ^( CBODY ( explicitConstructorInvocation )? ( blockStatement )* ) ;
    public final void constructorBody() throws RecognitionException {
        JaScope_stack.push(new JaScope_scope());


        	((JaScope_scope)JaScope_stack.peek()).symbols = new HashMap<String, Type>();

        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:244:5: ( ^( CBODY ( explicitConstructorInvocation )? ( blockStatement )* ) )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:244:7: ^( CBODY ( explicitConstructorInvocation )? ( blockStatement )* )
            {
            match(input,CBODY,FOLLOW_CBODY_in_constructorBody939); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:244:15: ( explicitConstructorInvocation )?
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==CONSTRCALL) ) {
                    alt16=1;
                }
                switch (alt16) {
                    case 1 :
                        // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:244:15: explicitConstructorInvocation
                        {
                        pushFollow(FOLLOW_explicitConstructorInvocation_in_constructorBody941);
                        explicitConstructorInvocation();

                        state._fsp--;


                        }
                        break;

                }

                // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:244:46: ( blockStatement )*
                loop17:
                do {
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( ((LA17_0>=VARDECL && LA17_0<=STMT)||LA17_0==DOWHILE||(LA17_0>=IF && LA17_0<=WHILE)||LA17_0==RETURN) ) {
                        alt17=1;
                    }


                    switch (alt17) {
                	case 1 :
                	    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:244:46: blockStatement
                	    {
                	    pushFollow(FOLLOW_blockStatement_in_constructorBody944);
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:247:1: explicitConstructorInvocation : ( ^( CONSTRCALL THIS ( arguments )? ) | ^( CONSTRCALL SUPER ( arguments )? ) );
    public final void explicitConstructorInvocation() throws RecognitionException {
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:248:5: ( ^( CONSTRCALL THIS ( arguments )? ) | ^( CONSTRCALL SUPER ( arguments )? ) )
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
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:248:9: ^( CONSTRCALL THIS ( arguments )? )
                    {
                    match(input,CONSTRCALL,FOLLOW_CONSTRCALL_in_explicitConstructorInvocation966); 

                    match(input, Token.DOWN, null); 
                    match(input,THIS,FOLLOW_THIS_in_explicitConstructorInvocation968); 
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:248:28: ( arguments )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==ARGUMENTS) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:248:28: arguments
                            {
                            pushFollow(FOLLOW_arguments_in_explicitConstructorInvocation971);
                            arguments();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:249:7: ^( CONSTRCALL SUPER ( arguments )? )
                    {
                    match(input,CONSTRCALL,FOLLOW_CONSTRCALL_in_explicitConstructorInvocation982); 

                    match(input, Token.DOWN, null); 
                    match(input,SUPER,FOLLOW_SUPER_in_explicitConstructorInvocation984); 
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:249:26: ( arguments )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==ARGUMENTS) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:249:26: arguments
                            {
                            pushFollow(FOLLOW_arguments_in_explicitConstructorInvocation986);
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:252:1: literal returns [Type t] : ( INTLITERAL | LONGLITERAL | FLOATLITERAL | DOUBLELITERAL | CHARLITERAL | STRINGLITERAL | BOOLEANLITERAL | NULLLITERAL );
    public final Type literal() throws RecognitionException {
        Type t = null;

        CommonTree INTLITERAL14=null;

        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:253:5: ( INTLITERAL | LONGLITERAL | FLOATLITERAL | DOUBLELITERAL | CHARLITERAL | STRINGLITERAL | BOOLEANLITERAL | NULLLITERAL )
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
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:253:9: INTLITERAL
                    {
                    INTLITERAL14=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_literal1011); 
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
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:262:9: LONGLITERAL
                    {
                    match(input,LONGLITERAL,FOLLOW_LONGLITERAL_in_literal1027); 
                     t = BasicType.LONG;       

                    }
                    break;
                case 3 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:263:9: FLOATLITERAL
                    {
                    match(input,FLOATLITERAL,FOLLOW_FLOATLITERAL_in_literal1042); 
                     t = BasicType.FLOAT;      

                    }
                    break;
                case 4 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:264:7: DOUBLELITERAL
                    {
                    match(input,DOUBLELITERAL,FOLLOW_DOUBLELITERAL_in_literal1054); 
                     t = BasicType.DOUBLE;     

                    }
                    break;
                case 5 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:265:9: CHARLITERAL
                    {
                    match(input,CHARLITERAL,FOLLOW_CHARLITERAL_in_literal1067); 
                     t = BasicType.CHAR;       

                    }
                    break;
                case 6 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:266:9: STRINGLITERAL
                    {
                    match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_literal1082); 
                     t = ReferenceType.STRING; 

                    }
                    break;
                case 7 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:267:9: BOOLEANLITERAL
                    {
                    match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_literal1095); 
                     t = BasicType.BOOLEAN;    

                    }
                    break;
                case 8 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:268:9: NULLLITERAL
                    {
                    match(input,NULLLITERAL,FOLLOW_NULLLITERAL_in_literal1107); 
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:273:1: block : ( blockStatement )* ;
    public final void block() throws RecognitionException {
        JaScope_stack.push(new JaScope_scope());


        	((JaScope_scope)JaScope_stack.peek()).symbols = new HashMap<String, Type>();

        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:281:5: ( ( blockStatement )* )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:281:9: ( blockStatement )*
            {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:281:9: ( blockStatement )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=VARDECL && LA22_0<=STMT)||LA22_0==DOWHILE||(LA22_0>=IF && LA22_0<=WHILE)||LA22_0==RETURN) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:281:9: blockStatement
            	    {
            	    pushFollow(FOLLOW_blockStatement_in_block1148);
            	    blockStatement();

            	    state._fsp--;


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


    // $ANTLR start "blockStatement"
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:284:1: blockStatement : ( localVariableDeclarationStatement | statement );
    public final void blockStatement() throws RecognitionException {
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:285:5: ( localVariableDeclarationStatement | statement )
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
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:285:9: localVariableDeclarationStatement
                    {
                    pushFollow(FOLLOW_localVariableDeclarationStatement_in_blockStatement1172);
                    localVariableDeclarationStatement();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:286:9: statement
                    {
                    pushFollow(FOLLOW_statement_in_blockStatement1182);
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:289:1: localVariableDeclarationStatement : localVariableDeclaration ;
    public final void localVariableDeclarationStatement() throws RecognitionException {
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:290:5: ( localVariableDeclaration )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:290:7: localVariableDeclaration
            {
            pushFollow(FOLLOW_localVariableDeclaration_in_localVariableDeclarationStatement1203);
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:293:1: localVariableDeclaration : ^( VARDECL variableDeclarator ) ;
    public final void localVariableDeclaration() throws RecognitionException {
        JaWalker.variableDeclarator_return variableDeclarator15 = null;


        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:294:5: ( ^( VARDECL variableDeclarator ) )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:294:7: ^( VARDECL variableDeclarator )
            {
            match(input,VARDECL,FOLLOW_VARDECL_in_localVariableDeclaration1221); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_variableDeclarator_in_localVariableDeclaration1223);
            variableDeclarator15=variableDeclarator();

            state._fsp--;


            match(input, Token.UP, null); 
             addVariableToScope((variableDeclarator15!=null?variableDeclarator15.id:null), (variableDeclarator15!=null?variableDeclarator15.t:null)); 

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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:299:1: statement : ( ^( BLOCK block ) | ^( IF ^( CONDITION expression ) ^( THEN statement ) ( elseStmt )? ) | ^( FOR ( ^( INIT forInit ) )? ( ^( CONDITION expression ) )? ( ^( UPDATE forUpdate ) )? statement ) | ^( WHILE ^( CONDITION expression ) statement ) | ^( DOWHILE ^( CONDITION expression ) statement ) | ^( RETURN ( expression )? ) | ^( STMT statementExpression ) );
    public final void statement() throws RecognitionException {
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:300:5: ( ^( BLOCK block ) | ^( IF ^( CONDITION expression ) ^( THEN statement ) ( elseStmt )? ) | ^( FOR ( ^( INIT forInit ) )? ( ^( CONDITION expression ) )? ( ^( UPDATE forUpdate ) )? statement ) | ^( WHILE ^( CONDITION expression ) statement ) | ^( DOWHILE ^( CONDITION expression ) statement ) | ^( RETURN ( expression )? ) | ^( STMT statementExpression ) )
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
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:300:9: ^( BLOCK block )
                    {
                    match(input,BLOCK,FOLLOW_BLOCK_in_statement1260); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_block_in_statement1262);
                        block();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }

                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:301:9: ^( IF ^( CONDITION expression ) ^( THEN statement ) ( elseStmt )? )
                    {
                    match(input,IF,FOLLOW_IF_in_statement1274); 

                    match(input, Token.DOWN, null); 
                    match(input,CONDITION,FOLLOW_CONDITION_in_statement1277); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_statement1279);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    match(input,THEN,FOLLOW_THEN_in_statement1283); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_statement_in_statement1285);
                    statement();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:301:56: ( elseStmt )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==ELSE) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:301:56: elseStmt
                            {
                            pushFollow(FOLLOW_elseStmt_in_statement1288);
                            elseStmt();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:302:9: ^( FOR ( ^( INIT forInit ) )? ( ^( CONDITION expression ) )? ( ^( UPDATE forUpdate ) )? statement )
                    {
                    match(input,FOR,FOLLOW_FOR_in_statement1301); 

                    match(input, Token.DOWN, null); 
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:302:15: ( ^( INIT forInit ) )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==INIT) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:302:16: ^( INIT forInit )
                            {
                            match(input,INIT,FOLLOW_INIT_in_statement1305); 

                            match(input, Token.DOWN, null); 
                            pushFollow(FOLLOW_forInit_in_statement1307);
                            forInit();

                            state._fsp--;


                            match(input, Token.UP, null); 

                            }
                            break;

                    }

                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:302:34: ( ^( CONDITION expression ) )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==CONDITION) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:302:35: ^( CONDITION expression )
                            {
                            match(input,CONDITION,FOLLOW_CONDITION_in_statement1314); 

                            match(input, Token.DOWN, null); 
                            pushFollow(FOLLOW_expression_in_statement1316);
                            expression();

                            state._fsp--;


                            match(input, Token.UP, null); 

                            }
                            break;

                    }

                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:302:61: ( ^( UPDATE forUpdate ) )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==UPDATE) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:302:62: ^( UPDATE forUpdate )
                            {
                            match(input,UPDATE,FOLLOW_UPDATE_in_statement1323); 

                            match(input, Token.DOWN, null); 
                            pushFollow(FOLLOW_forUpdate_in_statement1325);
                            forUpdate();

                            state._fsp--;


                            match(input, Token.UP, null); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_statement_in_statement1330);
                    statement();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:303:9: ^( WHILE ^( CONDITION expression ) statement )
                    {
                    match(input,WHILE,FOLLOW_WHILE_in_statement1343); 

                    match(input, Token.DOWN, null); 
                    match(input,CONDITION,FOLLOW_CONDITION_in_statement1346); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_statement1348);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    pushFollow(FOLLOW_statement_in_statement1351);
                    statement();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:304:9: ^( DOWHILE ^( CONDITION expression ) statement )
                    {
                    match(input,DOWHILE,FOLLOW_DOWHILE_in_statement1363); 

                    match(input, Token.DOWN, null); 
                    match(input,CONDITION,FOLLOW_CONDITION_in_statement1366); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_statement1368);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    pushFollow(FOLLOW_statement_in_statement1371);
                    statement();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:305:9: ^( RETURN ( expression )? )
                    {
                    match(input,RETURN,FOLLOW_RETURN_in_statement1383); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:305:18: ( expression )?
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==METHODCALL||(LA28_0>=FIELDACCESS && LA28_0<=DOTCLASS)||(LA28_0>=PREINC && LA28_0<=CAST)||LA28_0==IDENTIFIER||LA28_0==THIS||(LA28_0>=INTLITERAL && LA28_0<=NULLLITERAL)||(LA28_0>=INSTANCEOF && LA28_0<=NEW)||(LA28_0>=EQ && LA28_0<=SLASH)||(LA28_0>=99 && LA28_0<=103)||LA28_0==106) ) {
                            alt28=1;
                        }
                        switch (alt28) {
                            case 1 :
                                // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:305:18: expression
                                {
                                pushFollow(FOLLOW_expression_in_statement1385);
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
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:306:9: ^( STMT statementExpression )
                    {
                    match(input,STMT,FOLLOW_STMT_in_statement1399); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_statementExpression_in_statement1401);
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:309:1: elseStmt : ^( ELSE statement ) ;
    public final void elseStmt() throws RecognitionException {
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:310:5: ( ^( ELSE statement ) )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:310:7: ^( ELSE statement )
            {
            match(input,ELSE,FOLLOW_ELSE_in_elseStmt1424); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_statement_in_elseStmt1426);
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:313:1: forInit : ( localVariableDeclaration | expressionList );
    public final void forInit() throws RecognitionException {
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:314:5: ( localVariableDeclaration | expressionList )
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
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:314:9: localVariableDeclaration
                    {
                    pushFollow(FOLLOW_localVariableDeclaration_in_forInit1446);
                    localVariableDeclaration();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:315:9: expressionList
                    {
                    pushFollow(FOLLOW_expressionList_in_forInit1456);
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:318:1: forUpdate : expressionList ;
    public final void forUpdate() throws RecognitionException {
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:319:5: ( expressionList )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:319:9: expressionList
            {
            pushFollow(FOLLOW_expressionList_in_forUpdate1475);
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:326:1: expressionList returns [ArrayList<Type> types] : ( expression )+ ;
    public final ArrayList<Type> expressionList() throws RecognitionException {
        ArrayList<Type> types = null;

        Type expression16 = null;



        	types = new ArrayList<Type>();

        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:330:5: ( ( expression )+ )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:330:9: ( expression )+
            {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:330:9: ( expression )+
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
            	    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:330:10: expression
            	    {
            	    pushFollow(FOLLOW_expression_in_expressionList1510);
            	    expression16=expression();

            	    state._fsp--;

            	     types.add(expression16); 

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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:333:1: statementExpression : expression ;
    public final void statementExpression() throws RecognitionException {
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:334:5: ( expression )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:334:9: expression
            {
            pushFollow(FOLLOW_expression_in_statementExpression1533);
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:337:1: constantExpression : expression ;
    public final void constantExpression() throws RecognitionException {
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:338:5: ( expression )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:338:9: expression
            {
            pushFollow(FOLLOW_expression_in_constantExpression1556);
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:341:1: expression returns [Type t] : ( ^( EQ e1= expression e2= expression ) | ^( PLUS e1= expression e2= expression ) | ^( MINUS e1= expression e2= expression ) | ^( STAR e1= expression e2= expression ) | ^( SLASH e1= expression e2= expression ) | ^(or= '||' e1= expression e2= expression ) | ^(and= '&&' e1= expression e2= expression ) | ^(eq= '==' e1= expression e2= expression ) | ^(nq= '!=' expression expression ) | ^( INSTANCEOF e= expression type ) | ^( COMPAREOP e1= expression e2= expression ) | ^( '%' expression expression ) | ^( UNARYPLUS expression ) | ^( UNARYMINUS expression ) | ^( PREINC expression ) | ^( PREDEC expression ) | ^( '!' expression ) | ^( CAST primitiveType expression ) | ^( CAST nonPrimitiveType expression ) | ^( NEW creator ) | ^( POSTINC ( selector | primary ) ) | ^( POSTDEC ( selector | primary ) ) | selector | primary );
    public final Type expression() throws RecognitionException {
        Type t = null;

        CommonTree or=null;
        CommonTree and=null;
        CommonTree eq=null;
        CommonTree nq=null;
        CommonTree PLUS17=null;
        CommonTree MINUS18=null;
        CommonTree STAR19=null;
        CommonTree SLASH20=null;
        CommonTree INSTANCEOF21=null;
        CommonTree COMPAREOP23=null;
        Type e1 = null;

        Type e2 = null;

        Type e = null;

        Type type22 = null;

        Type selector24 = null;

        Type primary25 = null;


        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:342:5: ( ^( EQ e1= expression e2= expression ) | ^( PLUS e1= expression e2= expression ) | ^( MINUS e1= expression e2= expression ) | ^( STAR e1= expression e2= expression ) | ^( SLASH e1= expression e2= expression ) | ^(or= '||' e1= expression e2= expression ) | ^(and= '&&' e1= expression e2= expression ) | ^(eq= '==' e1= expression e2= expression ) | ^(nq= '!=' expression expression ) | ^( INSTANCEOF e= expression type ) | ^( COMPAREOP e1= expression e2= expression ) | ^( '%' expression expression ) | ^( UNARYPLUS expression ) | ^( UNARYMINUS expression ) | ^( PREINC expression ) | ^( PREDEC expression ) | ^( '!' expression ) | ^( CAST primitiveType expression ) | ^( CAST nonPrimitiveType expression ) | ^( NEW creator ) | ^( POSTINC ( selector | primary ) ) | ^( POSTDEC ( selector | primary ) ) | selector | primary )
            int alt34=24;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:342:9: ^( EQ e1= expression e2= expression )
                    {
                    match(input,EQ,FOLLOW_EQ_in_expression1584); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1591);
                    e1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1595);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:343:7: ^( PLUS e1= expression e2= expression )
                    {
                    PLUS17=(CommonTree)match(input,PLUS,FOLLOW_PLUS_in_expression1607); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1612);
                    e1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1616);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     t = plusOperation(PLUS17, e1, e2);        

                    }
                    break;
                case 3 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:344:7: ^( MINUS e1= expression e2= expression )
                    {
                    MINUS18=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_expression1629); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1633);
                    e1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1637);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     t = arithmeticOperation(MINUS18, e1, e2); 

                    }
                    break;
                case 4 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:345:7: ^( STAR e1= expression e2= expression )
                    {
                    STAR19=(CommonTree)match(input,STAR,FOLLOW_STAR_in_expression1650); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1655);
                    e1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1659);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     t = arithmeticOperation(STAR19, e1, e2);  

                    }
                    break;
                case 5 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:346:7: ^( SLASH e1= expression e2= expression )
                    {
                    SLASH20=(CommonTree)match(input,SLASH,FOLLOW_SLASH_in_expression1672); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1676);
                    e1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1680);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     t = arithmeticOperation(SLASH20, e1, e2); 

                    }
                    break;
                case 6 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:347:9: ^(or= '||' e1= expression e2= expression )
                    {
                    or=(CommonTree)match(input,99,FOLLOW_99_in_expression1697); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1702);
                    e1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1706);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     t = booleanOperation(or, e1, e2);  

                    }
                    break;
                case 7 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:348:9: ^(and= '&&' e1= expression e2= expression )
                    {
                    and=(CommonTree)match(input,100,FOLLOW_100_in_expression1723); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1728);
                    e1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1732);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     t = booleanOperation(and, e1, e2); 

                    }
                    break;
                case 8 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:349:9: ^(eq= '==' e1= expression e2= expression )
                    {
                    eq=(CommonTree)match(input,101,FOLLOW_101_in_expression1748); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1753);
                    e1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1757);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     t = booleanOperation(eq, e1, e2);  

                    }
                    break;
                case 9 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:350:9: ^(nq= '!=' expression expression )
                    {
                    nq=(CommonTree)match(input,102,FOLLOW_102_in_expression1774); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1777);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1779);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     t = booleanOperation(nq, e1, e2);  

                    }
                    break;
                case 10 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:351:7: ^( INSTANCEOF e= expression type )
                    {
                    INSTANCEOF21=(CommonTree)match(input,INSTANCEOF,FOLLOW_INSTANCEOF_in_expression1798); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1802);
                    e=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_type_in_expression1804);
                    type22=type();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if ( !(e.isComplexType() || e.isNull()) ) throw new UnexpectedTypeException("reference", e.toString(), (INSTANCEOF21!=null?INSTANCEOF21.getLine():0), (INSTANCEOF21!=null?INSTANCEOF21.getCharPositionInLine():0), rt);
                              if (!type22.isComplexType()) throw new UnexpectedTypeException("class or array", type22.toString(), (INSTANCEOF21!=null?INSTANCEOF21.getLine():0), (INSTANCEOF21!=null?INSTANCEOF21.getCharPositionInLine():0), rt);
                              if (!e.isCastableTo(type22)) throw new InconvertibleTypesException(type22.toString(), e.toString(), (INSTANCEOF21!=null?INSTANCEOF21.getLine():0), (INSTANCEOF21!=null?INSTANCEOF21.getCharPositionInLine():0), rt);
                              t = BasicType.BOOLEAN; 
                            

                    }
                    break;
                case 11 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:357:7: ^( COMPAREOP e1= expression e2= expression )
                    {
                    COMPAREOP23=(CommonTree)match(input,COMPAREOP,FOLLOW_COMPAREOP_in_expression1824); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1828);
                    e1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1832);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                      if ( !(e1.isNumeric() && e2.isNumeric()) ) {
                    	        throw new CannotBeAppliedToException((COMPAREOP23!=null?COMPAREOP23.getText():null), e1.toString(), e2.toString(), (COMPAREOP23!=null?COMPAREOP23.getLine():0), (COMPAREOP23!=null?COMPAREOP23.getCharPositionInLine():0), rt);
                    	    }
                        	   t = BasicType.BOOLEAN; 
                        	

                    }
                    break;
                case 12 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:363:9: ^( '%' expression expression )
                    {
                    match(input,103,FOLLOW_103_in_expression1851); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1855);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1857);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 13 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:364:7: ^( UNARYPLUS expression )
                    {
                    match(input,UNARYPLUS,FOLLOW_UNARYPLUS_in_expression1867); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1870);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 14 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:365:9: ^( UNARYMINUS expression )
                    {
                    match(input,UNARYMINUS,FOLLOW_UNARYMINUS_in_expression1883); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1885);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 15 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:366:9: ^( PREINC expression )
                    {
                    match(input,PREINC,FOLLOW_PREINC_in_expression1897); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1899);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 16 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:367:9: ^( PREDEC expression )
                    {
                    match(input,PREDEC,FOLLOW_PREDEC_in_expression1911); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1913);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 17 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:368:7: ^( '!' expression )
                    {
                    match(input,106,FOLLOW_106_in_expression1925); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1927);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 18 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:369:9: ^( CAST primitiveType expression )
                    {
                    match(input,CAST,FOLLOW_CAST_in_expression1939); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_primitiveType_in_expression1941);
                    primitiveType();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1943);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 19 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:370:9: ^( CAST nonPrimitiveType expression )
                    {
                    match(input,CAST,FOLLOW_CAST_in_expression1955); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_nonPrimitiveType_in_expression1957);
                    nonPrimitiveType();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1959);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 20 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:371:9: ^( NEW creator )
                    {
                    match(input,NEW,FOLLOW_NEW_in_expression1971); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_creator_in_expression1973);
                    creator();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 21 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:372:7: ^( POSTINC ( selector | primary ) )
                    {
                    match(input,POSTINC,FOLLOW_POSTINC_in_expression1983); 

                    match(input, Token.DOWN, null); 
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:372:17: ( selector | primary )
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
                            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:372:18: selector
                            {
                            pushFollow(FOLLOW_selector_in_expression1986);
                            selector();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:372:29: primary
                            {
                            pushFollow(FOLLOW_primary_in_expression1990);
                            primary();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 22 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:373:9: ^( POSTDEC ( selector | primary ) )
                    {
                    match(input,POSTDEC,FOLLOW_POSTDEC_in_expression2003); 

                    match(input, Token.DOWN, null); 
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:373:19: ( selector | primary )
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
                            else if ( (LA33_5==METHODCALL||(LA33_5>=FIELDACCESS && LA33_5<=DOTCLASS)||(LA33_5>=PREINC && LA33_5<=CAST)||LA33_5==IDENTIFIER||LA33_5==THIS||(LA33_5>=INTLITERAL && LA33_5<=NULLLITERAL)||(LA33_5>=INSTANCEOF && LA33_5<=NEW)||(LA33_5>=EQ && LA33_5<=SLASH)||(LA33_5>=99 && LA33_5<=103)||LA33_5==106) ) {
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
                            else if ( (LA33_6==METHODCALL||(LA33_6>=FIELDACCESS && LA33_6<=DOTCLASS)||(LA33_6>=PREINC && LA33_6<=CAST)||LA33_6==IDENTIFIER||LA33_6==THIS||(LA33_6>=INTLITERAL && LA33_6<=NULLLITERAL)||(LA33_6>=INSTANCEOF && LA33_6<=NEW)||(LA33_6>=EQ && LA33_6<=SLASH)||(LA33_6>=99 && LA33_6<=103)||LA33_6==106) ) {
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
                            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:373:20: selector
                            {
                            pushFollow(FOLLOW_selector_in_expression2006);
                            selector();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:373:31: primary
                            {
                            pushFollow(FOLLOW_primary_in_expression2010);
                            primary();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 23 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:374:9: selector
                    {
                    pushFollow(FOLLOW_selector_in_expression2022);
                    selector24=selector();

                    state._fsp--;

                     t = selector24; 

                    }
                    break;
                case 24 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:375:9: primary
                    {
                    pushFollow(FOLLOW_primary_in_expression2034);
                    primary25=primary();

                    state._fsp--;

                     t = primary25; 

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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:378:1: primary returns [Type t] : ( THIS | superMemberAccess | literal | IDENTIFIER | ^( DOTCLASS ^( ARRAYTYPE type ) ) | ^( DOTCLASS IDENTIFIER ) | ^( DOTCLASS primitiveType ) | ^( DOTCLASS VOID ) );
    public final Type primary() throws RecognitionException {
        Type t = null;

        CommonTree IDENTIFIER28=null;
        Type superMemberAccess26 = null;

        Type literal27 = null;


        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:380:5: ( THIS | superMemberAccess | literal | IDENTIFIER | ^( DOTCLASS ^( ARRAYTYPE type ) ) | ^( DOTCLASS IDENTIFIER ) | ^( DOTCLASS primitiveType ) | ^( DOTCLASS VOID ) )
            int alt35=8;
            alt35 = dfa35.predict(input);
            switch (alt35) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:380:7: THIS
                    {
                    match(input,THIS,FOLLOW_THIS_in_primary2075); 
                     t = rt; 

                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:381:9: superMemberAccess
                    {
                    pushFollow(FOLLOW_superMemberAccess_in_primary2087);
                    superMemberAccess26=superMemberAccess();

                    state._fsp--;

                     t = superMemberAccess26; 

                    }
                    break;
                case 3 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:382:9: literal
                    {
                    pushFollow(FOLLOW_literal_in_primary2099);
                    literal27=literal();

                    state._fsp--;

                     t = literal27; 

                    }
                    break;
                case 4 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:383:9: IDENTIFIER
                    {
                    IDENTIFIER28=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary2111); 
                     t = getVariableType((IDENTIFIER28!=null?IDENTIFIER28.getText():null)); 
                        		     if (t == null) throw new CannotFindSymbolException(("variable " + (IDENTIFIER28!=null?IDENTIFIER28.getText():null)), getMethodSignature(), (IDENTIFIER28!=null?IDENTIFIER28.getLine():0), (IDENTIFIER28!=null?IDENTIFIER28.getCharPositionInLine():0), rt);
                        		   

                    }
                    break;
                case 5 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:387:9: ^( DOTCLASS ^( ARRAYTYPE type ) )
                    {
                    match(input,DOTCLASS,FOLLOW_DOTCLASS_in_primary2129); 

                    match(input, Token.DOWN, null); 
                    match(input,ARRAYTYPE,FOLLOW_ARRAYTYPE_in_primary2132); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_in_primary2134);
                    type();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 
                     t = ReferenceType.CLASS; 

                    }
                    break;
                case 6 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:388:7: ^( DOTCLASS IDENTIFIER )
                    {
                    match(input,DOTCLASS,FOLLOW_DOTCLASS_in_primary2149); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary2151); 

                    match(input, Token.UP, null); 
                     t = ReferenceType.CLASS; 

                    }
                    break;
                case 7 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:389:9: ^( DOTCLASS primitiveType )
                    {
                    match(input,DOTCLASS,FOLLOW_DOTCLASS_in_primary2172); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_primitiveType_in_primary2174);
                    primitiveType();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     t = ReferenceType.CLASS; 

                    }
                    break;
                case 8 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:390:9: ^( DOTCLASS VOID )
                    {
                    match(input,DOTCLASS,FOLLOW_DOTCLASS_in_primary2192); 

                    match(input, Token.DOWN, null); 
                    match(input,VOID,FOLLOW_VOID_in_primary2194); 

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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:393:1: selector returns [Type t] : ( ^( FIELDACCESS expression IDENTIFIER ) | ^( METHODCALL expression IDENTIFIER ( arguments )? ) | ^( ARRAYACCESS e1= expression e2= expression ) );
    public final Type selector() throws RecognitionException {
        Type t = null;

        CommonTree IDENTIFIER30=null;
        CommonTree IDENTIFIER32=null;
        CommonTree ARRAYACCESS34=null;
        Type e1 = null;

        Type e2 = null;

        Type expression29 = null;

        Type expression31 = null;

        JaWalker.arguments_return arguments33 = null;


        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:394:5: ( ^( FIELDACCESS expression IDENTIFIER ) | ^( METHODCALL expression IDENTIFIER ( arguments )? ) | ^( ARRAYACCESS e1= expression e2= expression ) )
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
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:394:9: ^( FIELDACCESS expression IDENTIFIER )
                    {
                    match(input,FIELDACCESS,FOLLOW_FIELDACCESS_in_selector2238); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_selector2240);
                    expression29=expression();

                    state._fsp--;

                    IDENTIFIER30=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_selector2242); 

                    match(input, Token.UP, null); 
                     if (!expression29.isReference())
                        	  	throw new CannotBeDereferencedException(expression29, (IDENTIFIER30!=null?IDENTIFIER30.getLine():0), (IDENTIFIER30!=null?IDENTIFIER30.getCharPositionInLine():0), rt); 
                        	  ReferenceType expt = (ReferenceType)expression29;
                        	  if (expt.getName() == rt.getName()) 
                        	  	t = expt.getField(true, (IDENTIFIER30!=null?IDENTIFIER30.getText():null));
                        	  else  
                        		t = expt.getField(false, (IDENTIFIER30!=null?IDENTIFIER30.getText():null));
                    	  if (t == null) 
                    		throw new CannotFindSymbolException(("field " + (IDENTIFIER30!=null?IDENTIFIER30.getText():null)), expt.getName(), (IDENTIFIER30!=null?IDENTIFIER30.getLine():0), (IDENTIFIER30!=null?IDENTIFIER30.getCharPositionInLine():0), rt);
                        	

                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:405:7: ^( METHODCALL expression IDENTIFIER ( arguments )? )
                    {
                    match(input,METHODCALL,FOLLOW_METHODCALL_in_selector2261); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_selector2263);
                    expression31=expression();

                    state._fsp--;

                    IDENTIFIER32=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_selector2265); 
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:405:42: ( arguments )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==ARGUMENTS) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:405:42: arguments
                            {
                            pushFollow(FOLLOW_arguments_in_selector2267);
                            arguments33=arguments();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                     if (!expression31.isReference())
                        	  	throw new CannotBeDereferencedException(expression31, (IDENTIFIER32!=null?IDENTIFIER32.getLine():0), (IDENTIFIER32!=null?IDENTIFIER32.getCharPositionInLine():0), rt); 
                        	  ReferenceType expt = (ReferenceType)expression31;
                        	  ArrayList<Type> argTypes = (arguments33!=null?arguments33.types:null); //((arguments33!=null?((CommonTree)arguments33.tree):null) == null)?null:(arguments33!=null?arguments33.types:null);
                        	  try {
                    	    	if (expt.getName() == rt.getName()) 
                    	    		t = expt.bindMethod(true, (IDENTIFIER32!=null?IDENTIFIER32.getText():null), argTypes);
                    	    	else  
                    	    		t = expt.bindMethod(false, (IDENTIFIER32!=null?IDENTIFIER32.getText():null), argTypes);
                        	  } catch (EarlyBindingException ex) {
                        	  	throw new CannotFindSymbolException(("method " + (IDENTIFIER32!=null?IDENTIFIER32.getText():null) + '(' + printArguments(argTypes) + ')'), expt.getName(), (IDENTIFIER32!=null?IDENTIFIER32.getLine():0), (IDENTIFIER32!=null?IDENTIFIER32.getCharPositionInLine():0), rt);
                        	  }
                        	

                    }
                    break;
                case 3 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:419:9: ^( ARRAYACCESS e1= expression e2= expression )
                    {
                    ARRAYACCESS34=(CommonTree)match(input,ARRAYACCESS,FOLLOW_ARRAYACCESS_in_selector2287); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_selector2291);
                    e1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_selector2295);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if (!e1.isArray()) throw new ArrayRequiredException(e1.toString(), (ARRAYACCESS34!=null?ARRAYACCESS34.getLine():0), (ARRAYACCESS34!=null?ARRAYACCESS34.getCharPositionInLine():0), rt);
                        	  if (!e2.isAssignableTo(BasicType.INT)) {
                        	  	if (e2.isCastableTo(	BasicType.INT)) {
                        	  		throw new PossibleLossOfPrecisionException(BasicType.INT.toString(), e2.toString(), (ARRAYACCESS34!=null?ARRAYACCESS34.getLine():0), (ARRAYACCESS34!=null?ARRAYACCESS34.getCharPositionInLine():0), rt);
                        	  	} else {
                        	  		throw new IncompatibleTypesException(BasicType.INT.toString(), e2.toString(), (ARRAYACCESS34!=null?ARRAYACCESS34.getLine():0), (ARRAYACCESS34!=null?ARRAYACCESS34.getCharPositionInLine():0), rt);
                        	  	}    	       
                        	  }
                        	  t = ((ArrayType)e1).getHostType(); 
                        	

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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:432:1: creator : ( arrayCreatorRest | createdName ( classCreatorRest )? );
    public final void creator() throws RecognitionException {
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:433:5: ( arrayCreatorRest | createdName ( classCreatorRest )? )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==ARRAYTYPE) ) {
                alt39=1;
            }
            else if ( (LA39_0==IDENTIFIER||(LA39_0>=CHAR && LA39_0<=BOOLEAN)) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:433:10: arrayCreatorRest
                    {
                    pushFollow(FOLLOW_arrayCreatorRest_in_creator2324);
                    arrayCreatorRest();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:434:10: createdName ( classCreatorRest )?
                    {
                    pushFollow(FOLLOW_createdName_in_creator2336);
                    createdName();

                    state._fsp--;

                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:434:22: ( classCreatorRest )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==ARGUMENTS) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:434:22: classCreatorRest
                            {
                            pushFollow(FOLLOW_classCreatorRest_in_creator2338);
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
        return ;
    }
    // $ANTLR end "creator"


    // $ANTLR start "createdName"
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:438:1: createdName returns [Type t] : ( classType | primitiveType );
    public final Type createdName() throws RecognitionException {
        Type t = null;

        ReferenceType classType35 = null;

        BasicType primitiveType36 = null;


        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:439:5: ( classType | primitiveType )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==IDENTIFIER) ) {
                alt40=1;
            }
            else if ( ((LA40_0>=CHAR && LA40_0<=BOOLEAN)) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:439:9: classType
                    {
                    pushFollow(FOLLOW_classType_in_createdName2364);
                    classType35=classType();

                    state._fsp--;

                     t = classType35;     

                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:440:9: primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_createdName2380);
                    primitiveType36=primitiveType();

                    state._fsp--;

                     t = primitiveType36; 

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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:443:1: arrayCreatorRest : ( ( ^( ARRAYTYPE createdName ) arrayInitializer ) | ^( ARRAYTYPE arrayCreatorExpr expression ) );
    public final void arrayCreatorRest() throws RecognitionException {
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:444:5: ( ( ^( ARRAYTYPE createdName ) arrayInitializer ) | ^( ARRAYTYPE arrayCreatorExpr expression ) )
            int alt41=2;
            alt41 = dfa41.predict(input);
            switch (alt41) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:444:9: ( ^( ARRAYTYPE createdName ) arrayInitializer )
                    {
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:444:9: ( ^( ARRAYTYPE createdName ) arrayInitializer )
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:444:10: ^( ARRAYTYPE createdName ) arrayInitializer
                    {
                    match(input,ARRAYTYPE,FOLLOW_ARRAYTYPE_in_arrayCreatorRest2407); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_createdName_in_arrayCreatorRest2410);
                    createdName();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    pushFollow(FOLLOW_arrayInitializer_in_arrayCreatorRest2413);
                    arrayInitializer();

                    state._fsp--;


                    }


                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:445:8: ^( ARRAYTYPE arrayCreatorExpr expression )
                    {
                    match(input,ARRAYTYPE,FOLLOW_ARRAYTYPE_in_arrayCreatorRest2427); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_arrayCreatorExpr_in_arrayCreatorRest2430);
                    arrayCreatorExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_arrayCreatorRest2432);
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:448:1: arrayCreatorExpr : ( ^( ARRAYTYPE arrayCreatorExpr expression ) | createdName );
    public final void arrayCreatorExpr() throws RecognitionException {
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:449:5: ( ^( ARRAYTYPE arrayCreatorExpr expression ) | createdName )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==ARRAYTYPE) ) {
                alt42=1;
            }
            else if ( (LA42_0==IDENTIFIER||(LA42_0>=CHAR && LA42_0<=BOOLEAN)) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:449:7: ^( ARRAYTYPE arrayCreatorExpr expression )
                    {
                    match(input,ARRAYTYPE,FOLLOW_ARRAYTYPE_in_arrayCreatorExpr2459); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_arrayCreatorExpr_in_arrayCreatorExpr2461);
                    arrayCreatorExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_arrayCreatorExpr2463);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:450:8: createdName
                    {
                    pushFollow(FOLLOW_createdName_in_arrayCreatorExpr2473);
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:453:1: classCreatorRest : arguments ;
    public final void classCreatorRest() throws RecognitionException {
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:454:5: ( arguments )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:454:9: arguments
            {
            pushFollow(FOLLOW_arguments_in_classCreatorRest2497);
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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:457:1: superMemberAccess returns [Type t] : ( ^( METHODCALL SUPER IDENTIFIER arguments ) | ^( FIELDACCESS SUPER IDENTIFIER ) );
    public final Type superMemberAccess() throws RecognitionException {
        Type t = null;

        CommonTree IDENTIFIER37=null;
        CommonTree IDENTIFIER39=null;
        JaWalker.arguments_return arguments38 = null;


        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:458:5: ( ^( METHODCALL SUPER IDENTIFIER arguments ) | ^( FIELDACCESS SUPER IDENTIFIER ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==METHODCALL) ) {
                alt43=1;
            }
            else if ( (LA43_0==FIELDACCESS) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:458:7: ^( METHODCALL SUPER IDENTIFIER arguments )
                    {
                    match(input,METHODCALL,FOLLOW_METHODCALL_in_superMemberAccess2525); 

                    match(input, Token.DOWN, null); 
                    match(input,SUPER,FOLLOW_SUPER_in_superMemberAccess2527); 
                    IDENTIFIER37=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_superMemberAccess2529); 
                    pushFollow(FOLLOW_arguments_in_superMemberAccess2531);
                    arguments38=arguments();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     t = rt.getSuperClass().bindMethod(false, (IDENTIFIER37!=null?IDENTIFIER37.getText():null), (arguments38!=null?arguments38.types:null)); 

                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:459:9: ^( FIELDACCESS SUPER IDENTIFIER )
                    {
                    match(input,FIELDACCESS,FOLLOW_FIELDACCESS_in_superMemberAccess2545); 

                    match(input, Token.DOWN, null); 
                    match(input,SUPER,FOLLOW_SUPER_in_superMemberAccess2547); 
                    IDENTIFIER39=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_superMemberAccess2549); 

                    match(input, Token.UP, null); 
                     t = rt.getSuperClass().getField(false, (IDENTIFIER39!=null?IDENTIFIER39.getText():null)); 

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
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:462:1: arguments returns [ArrayList<Type> types] : ^( ARGUMENTS expressionList ) ;
    public final JaWalker.arguments_return arguments() throws RecognitionException {
        JaWalker.arguments_return retval = new JaWalker.arguments_return();
        retval.start = input.LT(1);

        ArrayList<Type> expressionList40 = null;


        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:463:5: ( ^( ARGUMENTS expressionList ) )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\JaWalker.g:463:8: ^( ARGUMENTS expressionList )
            {
            match(input,ARGUMENTS,FOLLOW_ARGUMENTS_in_arguments2584); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expressionList_in_arguments2586);
            expressionList40=expressionList();

            state._fsp--;


            match(input, Token.UP, null); 
             retval.types = expressionList40; 

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
    protected DFA41 dfa41 = new DFA41(this);
    static final String DFA34_eotS =
        "\37\uffff";
    static final String DFA34_eofS =
        "\37\uffff";
    static final String DFA34_minS =
        "\1\4\21\uffff\1\2\3\uffff\2\2\2\uffff\1\11\2\4\2\uffff";
    static final String DFA34_maxS =
        "\1\152\21\uffff\1\2\3\uffff\2\2\2\uffff\1\60\2\152\2\uffff";
    static final String DFA34_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\20\1\21\1\uffff\1\24\1\25\1\26\2\uffff\1\27\1\30"+
        "\3\uffff\1\23\1\22";
    static final String DFA34_specialS =
        "\37\uffff}>";
    static final String[] DFA34_transitionS = {
            "\1\27\1\uffff\1\26\1\30\1\31\23\uffff\1\17\1\24\1\20\1\25\1"+
            "\15\1\16\1\22\1\uffff\1\31\14\uffff\1\31\1\uffff\10\31\6\uffff"+
            "\1\12\1\13\1\23\13\uffff\1\1\1\2\1\3\1\4\1\5\17\uffff\1\6\1"+
            "\7\1\10\1\11\1\14\2\uffff\1\21",
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
            "",
            "",
            "\1\32",
            "",
            "",
            "",
            "\1\33",
            "\1\34",
            "",
            "",
            "\1\35\32\uffff\1\35\4\uffff\10\36",
            "\1\30\1\uffff\3\30\23\uffff\7\30\1\uffff\1\30\14\uffff\1\30"+
            "\1\31\10\30\6\uffff\3\30\13\uffff\5\30\17\uffff\5\30\2\uffff"+
            "\1\30",
            "\1\30\1\uffff\3\30\23\uffff\7\30\1\uffff\1\30\14\uffff\1\30"+
            "\1\31\10\30\6\uffff\3\30\13\uffff\5\30\17\uffff\5\30\2\uffff"+
            "\1\30",
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
            return "341:1: expression returns [Type t] : ( ^( EQ e1= expression e2= expression ) | ^( PLUS e1= expression e2= expression ) | ^( MINUS e1= expression e2= expression ) | ^( STAR e1= expression e2= expression ) | ^( SLASH e1= expression e2= expression ) | ^(or= '||' e1= expression e2= expression ) | ^(and= '&&' e1= expression e2= expression ) | ^(eq= '==' e1= expression e2= expression ) | ^(nq= '!=' expression expression ) | ^( INSTANCEOF e= expression type ) | ^( COMPAREOP e1= expression e2= expression ) | ^( '%' expression expression ) | ^( UNARYPLUS expression ) | ^( UNARYMINUS expression ) | ^( PREINC expression ) | ^( PREDEC expression ) | ^( '!' expression ) | ^( CAST primitiveType expression ) | ^( CAST nonPrimitiveType expression ) | ^( NEW creator ) | ^( POSTINC ( selector | primary ) ) | ^( POSTDEC ( selector | primary ) ) | selector | primary );";
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
            return "378:1: primary returns [Type t] : ( THIS | superMemberAccess | literal | IDENTIFIER | ^( DOTCLASS ^( ARRAYTYPE type ) ) | ^( DOTCLASS IDENTIFIER ) | ^( DOTCLASS primitiveType ) | ^( DOTCLASS VOID ) );";
        }
    }
    static final String DFA41_eotS =
        "\16\uffff";
    static final String DFA41_eofS =
        "\16\uffff";
    static final String DFA41_minS =
        "\1\11\1\2\1\11\1\uffff\11\3\1\uffff";
    static final String DFA41_maxS =
        "\1\11\1\2\1\60\1\uffff\11\152\1\uffff";
    static final String DFA41_acceptS =
        "\3\uffff\1\2\11\uffff\1\1";
    static final String DFA41_specialS =
        "\16\uffff}>";
    static final String[] DFA41_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3\32\uffff\1\4\4\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13"+
            "\1\14",
            "",
            "\1\15\1\3\1\uffff\3\3\23\uffff\7\3\1\uffff\1\3\14\uffff\1"+
            "\3\1\uffff\10\3\6\uffff\3\3\13\uffff\5\3\17\uffff\5\3\2\uffff"+
            "\1\3",
            "\1\15\1\3\1\uffff\3\3\23\uffff\7\3\1\uffff\1\3\14\uffff\1"+
            "\3\1\uffff\10\3\6\uffff\3\3\13\uffff\5\3\17\uffff\5\3\2\uffff"+
            "\1\3",
            "\1\15\1\3\1\uffff\3\3\23\uffff\7\3\1\uffff\1\3\14\uffff\1"+
            "\3\1\uffff\10\3\6\uffff\3\3\13\uffff\5\3\17\uffff\5\3\2\uffff"+
            "\1\3",
            "\1\15\1\3\1\uffff\3\3\23\uffff\7\3\1\uffff\1\3\14\uffff\1"+
            "\3\1\uffff\10\3\6\uffff\3\3\13\uffff\5\3\17\uffff\5\3\2\uffff"+
            "\1\3",
            "\1\15\1\3\1\uffff\3\3\23\uffff\7\3\1\uffff\1\3\14\uffff\1"+
            "\3\1\uffff\10\3\6\uffff\3\3\13\uffff\5\3\17\uffff\5\3\2\uffff"+
            "\1\3",
            "\1\15\1\3\1\uffff\3\3\23\uffff\7\3\1\uffff\1\3\14\uffff\1"+
            "\3\1\uffff\10\3\6\uffff\3\3\13\uffff\5\3\17\uffff\5\3\2\uffff"+
            "\1\3",
            "\1\15\1\3\1\uffff\3\3\23\uffff\7\3\1\uffff\1\3\14\uffff\1"+
            "\3\1\uffff\10\3\6\uffff\3\3\13\uffff\5\3\17\uffff\5\3\2\uffff"+
            "\1\3",
            "\1\15\1\3\1\uffff\3\3\23\uffff\7\3\1\uffff\1\3\14\uffff\1"+
            "\3\1\uffff\10\3\6\uffff\3\3\13\uffff\5\3\17\uffff\5\3\2\uffff"+
            "\1\3",
            "\1\15\1\3\1\uffff\3\3\23\uffff\7\3\1\uffff\1\3\14\uffff\1"+
            "\3\1\uffff\10\3\6\uffff\3\3\13\uffff\5\3\17\uffff\5\3\2\uffff"+
            "\1\3",
            ""
    };

    static final short[] DFA41_eot = DFA.unpackEncodedString(DFA41_eotS);
    static final short[] DFA41_eof = DFA.unpackEncodedString(DFA41_eofS);
    static final char[] DFA41_min = DFA.unpackEncodedStringToUnsignedChars(DFA41_minS);
    static final char[] DFA41_max = DFA.unpackEncodedStringToUnsignedChars(DFA41_maxS);
    static final short[] DFA41_accept = DFA.unpackEncodedString(DFA41_acceptS);
    static final short[] DFA41_special = DFA.unpackEncodedString(DFA41_specialS);
    static final short[][] DFA41_transition;

    static {
        int numStates = DFA41_transitionS.length;
        DFA41_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA41_transition[i] = DFA.unpackEncodedString(DFA41_transitionS[i]);
        }
    }

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = DFA41_eot;
            this.eof = DFA41_eof;
            this.min = DFA41_min;
            this.max = DFA41_max;
            this.accept = DFA41_accept;
            this.special = DFA41_special;
            this.transition = DFA41_transition;
        }
        public String getDescription() {
            return "443:1: arrayCreatorRest : ( ( ^( ARRAYTYPE createdName ) arrayInitializer ) | ^( ARRAYTYPE arrayCreatorExpr expression ) );";
        }
    }
 

    public static final BitSet FOLLOW_classDeclaration_in_compilationUnit56 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_in_classDeclaration81 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classDeclaration83 = new BitSet(new long[]{0x0000001000001C08L});
    public static final BitSet FOLLOW_classType_in_classDeclaration85 = new BitSet(new long[]{0x0000000000001C08L});
    public static final BitSet FOLLOW_classBody_in_classDeclaration88 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_classBodyDeclaration_in_classBody115 = new BitSet(new long[]{0x0000000000001C02L});
    public static final BitSet FOLLOW_memberDeclaration_in_classBodyDeclaration135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldDeclaration_in_memberDeclaration158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodAndConstructorDeclaration_in_memberDeclaration166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_METHOD_in_methodAndConstructorDeclaration205 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifier_in_methodAndConstructorDeclaration207 = new BitSet(new long[]{0x0001FE1000000200L});
    public static final BitSet FOLLOW_type_in_methodAndConstructorDeclaration209 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_methodDeclaration_in_methodAndConstructorDeclaration212 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_METHOD_in_methodAndConstructorDeclaration227 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifier_in_methodAndConstructorDeclaration229 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_VOID_in_methodAndConstructorDeclaration231 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_methodAndConstructorDeclaration233 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_voidMethodDeclaratorRest_in_methodAndConstructorDeclaration237 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONSTR_in_methodAndConstructorDeclaration252 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifier_in_methodAndConstructorDeclaration254 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_methodAndConstructorDeclaration256 = new BitSet(new long[]{0x0000000000042008L});
    public static final BitSet FOLLOW_formalParameters_in_methodAndConstructorDeclaration260 = new BitSet(new long[]{0x0000000000040008L});
    public static final BitSet FOLLOW_constructorBody_in_methodAndConstructorDeclaration263 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_methodDeclaration294 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_formalParameters_in_methodDeclaration298 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_methodBody_in_methodDeclaration300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIELD_in_fieldDeclaration320 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifier_in_fieldDeclaration322 = new BitSet(new long[]{0x0001FE1000000200L});
    public static final BitSet FOLLOW_variableDeclarator_in_fieldDeclaration324 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_formalParameters_in_voidMethodDeclaratorRest347 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_methodBody_in_voidMethodDeclaratorRest349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_variableDeclarator372 = new BitSet(new long[]{0x07FA0017F80001D2L,0x000004F8000F800EL});
    public static final BitSet FOLLOW_variableInitializer_in_variableDeclarator377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_variableDeclaratorId406 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_variableDeclaratorId408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayInitializer_in_variableInitializer433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_variableInitializer443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAYINIT_in_arrayInitializer463 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableInitializer_in_arrayInitializer465 = new BitSet(new long[]{0x07FA0017F80001D8L,0x000004F8000F800EL});
    public static final BitSet FOLLOW_variableInitializer_in_arrayInitializer468 = new BitSet(new long[]{0x07FA0017F80001D8L,0x000004F8000F800EL});
    public static final BitSet FOLLOW_set_in_modifier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonPrimitiveType_in_type530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_type540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAYTYPE_in_nonPrimitiveType568 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_nonPrimitiveType_in_nonPrimitiveType572 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_classType_in_nonPrimitiveType585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAYTYPE_in_nonPrimitiveType619 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primitiveType_in_nonPrimitiveType621 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classType652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_primitiveType677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BYTE_in_primitiveType692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHORT_in_primitiveType707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_primitiveType721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_in_primitiveType737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_primitiveType752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_primitiveType766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_primitiveType779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FPARMS_in_formalParameters805 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_formalParameterDecls_in_formalParameters807 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FPARM_in_formalParameterDecls832 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_formalParameterDecls834 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_formalParameterDecls_in_formalParameterDecls839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FMULTPARM_in_formalParameterDecls849 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_formalParameterDecls851 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MBODY_in_methodBody878 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_methodBody880 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CBODY_in_constructorBody939 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_explicitConstructorInvocation_in_constructorBody941 = new BitSet(new long[]{0xB800000002380008L});
    public static final BitSet FOLLOW_blockStatement_in_constructorBody944 = new BitSet(new long[]{0xB800000002380008L});
    public static final BitSet FOLLOW_CONSTRCALL_in_explicitConstructorInvocation966 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_THIS_in_explicitConstructorInvocation968 = new BitSet(new long[]{0x0000000000004008L});
    public static final BitSet FOLLOW_arguments_in_explicitConstructorInvocation971 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONSTRCALL_in_explicitConstructorInvocation982 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SUPER_in_explicitConstructorInvocation984 = new BitSet(new long[]{0x0000000000004008L});
    public static final BitSet FOLLOW_arguments_in_explicitConstructorInvocation986 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INTLITERAL_in_literal1011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONGLITERAL_in_literal1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOATLITERAL_in_literal1042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLELITERAL_in_literal1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARLITERAL_in_literal1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_literal1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_literal1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULLLITERAL_in_literal1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockStatement_in_block1148 = new BitSet(new long[]{0xB800000002380002L});
    public static final BitSet FOLLOW_localVariableDeclarationStatement_in_blockStatement1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_blockStatement1182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localVariableDeclaration_in_localVariableDeclarationStatement1203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARDECL_in_localVariableDeclaration1221 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableDeclarator_in_localVariableDeclaration1223 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLOCK_in_statement1260 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_statement1262 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_in_statement1274 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CONDITION_in_statement1277 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement1279 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_THEN_in_statement1283 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_statement1285 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_elseStmt_in_statement1288 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FOR_in_statement1301 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INIT_in_statement1305 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_forInit_in_statement1307 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONDITION_in_statement1314 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement1316 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UPDATE_in_statement1323 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_forUpdate_in_statement1325 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_statement_in_statement1330 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WHILE_in_statement1343 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CONDITION_in_statement1346 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement1348 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_statement_in_statement1351 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DOWHILE_in_statement1363 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CONDITION_in_statement1366 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement1368 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_statement_in_statement1371 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RETURN_in_statement1383 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement1385 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STMT_in_statement1399 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statementExpression_in_statement1401 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ELSE_in_elseStmt1424 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_elseStmt1426 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_localVariableDeclaration_in_forInit1446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionList_in_forInit1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionList_in_forUpdate1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionList1510 = new BitSet(new long[]{0x07FA0017F80001D2L,0x000004F8000F800EL});
    public static final BitSet FOLLOW_expression_in_statementExpression1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_constantExpression1556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_expression1584 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1591 = new BitSet(new long[]{0x07FA0017F80001D0L,0x000004F8000F800EL});
    public static final BitSet FOLLOW_expression_in_expression1595 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_in_expression1607 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1612 = new BitSet(new long[]{0x07FA0017F80001D0L,0x000004F8000F800EL});
    public static final BitSet FOLLOW_expression_in_expression1616 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_expression1629 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1633 = new BitSet(new long[]{0x07FA0017F80001D0L,0x000004F8000F800EL});
    public static final BitSet FOLLOW_expression_in_expression1637 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STAR_in_expression1650 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1655 = new BitSet(new long[]{0x07FA0017F80001D0L,0x000004F8000F800EL});
    public static final BitSet FOLLOW_expression_in_expression1659 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SLASH_in_expression1672 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1676 = new BitSet(new long[]{0x07FA0017F80001D0L,0x000004F8000F800EL});
    public static final BitSet FOLLOW_expression_in_expression1680 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_99_in_expression1697 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1702 = new BitSet(new long[]{0x07FA0017F80001D0L,0x000004F8000F800EL});
    public static final BitSet FOLLOW_expression_in_expression1706 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_100_in_expression1723 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1728 = new BitSet(new long[]{0x07FA0017F80001D0L,0x000004F8000F800EL});
    public static final BitSet FOLLOW_expression_in_expression1732 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_101_in_expression1748 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1753 = new BitSet(new long[]{0x07FA0017F80001D0L,0x000004F8000F800EL});
    public static final BitSet FOLLOW_expression_in_expression1757 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_102_in_expression1774 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1777 = new BitSet(new long[]{0x07FA0017F80001D0L,0x000004F8000F800EL});
    public static final BitSet FOLLOW_expression_in_expression1779 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INSTANCEOF_in_expression1798 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1802 = new BitSet(new long[]{0x0001FE1000000200L});
    public static final BitSet FOLLOW_type_in_expression1804 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COMPAREOP_in_expression1824 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1828 = new BitSet(new long[]{0x07FA0017F80001D0L,0x000004F8000F800EL});
    public static final BitSet FOLLOW_expression_in_expression1832 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_103_in_expression1851 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1855 = new BitSet(new long[]{0x07FA0017F80001D0L,0x000004F8000F800EL});
    public static final BitSet FOLLOW_expression_in_expression1857 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNARYPLUS_in_expression1867 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1870 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNARYMINUS_in_expression1883 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1885 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PREINC_in_expression1897 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1899 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PREDEC_in_expression1911 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1913 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_106_in_expression1925 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1927 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CAST_in_expression1939 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primitiveType_in_expression1941 = new BitSet(new long[]{0x07FA0017F80001D0L,0x000004F8000F800EL});
    public static final BitSet FOLLOW_expression_in_expression1943 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CAST_in_expression1955 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_nonPrimitiveType_in_expression1957 = new BitSet(new long[]{0x07FA0017F80001D0L,0x000004F8000F800EL});
    public static final BitSet FOLLOW_expression_in_expression1959 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NEW_in_expression1971 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_creator_in_expression1973 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POSTINC_in_expression1983 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_selector_in_expression1986 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_primary_in_expression1990 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POSTDEC_in_expression2003 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_selector_in_expression2006 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_primary_in_expression2010 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_selector_in_expression2022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_in_expression2034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_primary2075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_superMemberAccess_in_primary2087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primary2099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_primary2111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOTCLASS_in_primary2129 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ARRAYTYPE_in_primary2132 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_primary2134 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DOTCLASS_in_primary2149 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_primary2151 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DOTCLASS_in_primary2172 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primitiveType_in_primary2174 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DOTCLASS_in_primary2192 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VOID_in_primary2194 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FIELDACCESS_in_selector2238 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_selector2240 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_selector2242 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_METHODCALL_in_selector2261 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_selector2263 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_selector2265 = new BitSet(new long[]{0x0000000000004008L});
    public static final BitSet FOLLOW_arguments_in_selector2267 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARRAYACCESS_in_selector2287 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_selector2291 = new BitSet(new long[]{0x07FA0017F80001D0L,0x000004F8000F800EL});
    public static final BitSet FOLLOW_expression_in_selector2295 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_arrayCreatorRest_in_creator2324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createdName_in_creator2336 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_classCreatorRest_in_creator2338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classType_in_createdName2364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_createdName2380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAYTYPE_in_arrayCreatorRest2407 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_createdName_in_arrayCreatorRest2410 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_arrayInitializer_in_arrayCreatorRest2413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAYTYPE_in_arrayCreatorRest2427 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arrayCreatorExpr_in_arrayCreatorRest2430 = new BitSet(new long[]{0x07FA0017F80001D0L,0x000004F8000F800EL});
    public static final BitSet FOLLOW_expression_in_arrayCreatorRest2432 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARRAYTYPE_in_arrayCreatorExpr2459 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arrayCreatorExpr_in_arrayCreatorExpr2461 = new BitSet(new long[]{0x07FA0017F80001D0L,0x000004F8000F800EL});
    public static final BitSet FOLLOW_expression_in_arrayCreatorExpr2463 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_createdName_in_arrayCreatorExpr2473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arguments_in_classCreatorRest2497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_METHODCALL_in_superMemberAccess2525 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SUPER_in_superMemberAccess2527 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_superMemberAccess2529 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_arguments_in_superMemberAccess2531 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FIELDACCESS_in_superMemberAccess2545 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SUPER_in_superMemberAccess2547 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_superMemberAccess2549 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARGUMENTS_in_arguments2584 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expressionList_in_arguments2586 = new BitSet(new long[]{0x0000000000000008L});

}