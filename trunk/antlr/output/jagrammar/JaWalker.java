// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g 2010-10-04 18:41:49

	package jagrammar;
	
	import jagrammar.typehierarchy.*;
	import jagrammar.util.*;
	import java.util.Map;
	import java.util.HashMap;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class JaWalker extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "METHODCALL", "CONSTRCALL", "FIELDACCESS", "ARRAYACCESS", "DOTCLASS", "ARRAYTYPE", "METHOD", "FIELD", "CONSTR", "FPARMS", "ARGUMENTS", "FPARM", "FMULTPARM", "MBODY", "CBODY", "VARDECL", "BLOCK", "STMT", "INIT", "CONDITION", "UPDATE", "DOWHILE", "THEN", "ARRAYINIT", "PREINC", "POSTINC", "PREDEC", "POSTDEC", "UNARYPLUS", "UNARYMINUS", "CAST", "CLASS", "IDENTIFIER", "EXTENDS", "PUBLIC", "VOID", "PRIVATE", "CHAR", "BYTE", "SHORT", "INT", "LONG", "FLOAT", "DOUBLE", "THIS", "SUPER", "INTLITERAL", "LONGLITERAL", "FLOATLITERAL", "DOUBLELITERAL", "CHARLITERAL", "STRINGLITERAL", "BOOLEANLITERAL", "NULLLITERAL", "IF", "FOR", "WHILE", "DO", "RETURN", "ELSE", "INSTANCEOF", "COMPAREOP", "NEW", "Digit", "IntegerNumber", "LongSuffix", "Exponent", "FloatingPointLiteral", "FloatSuffix", "DoubleSuffix", "EscapeSequence", "BOOLEAN", "WS", "COMMENT", "LINE_COMMENT", "EQ", "PLUS", "MINUS", "STAR", "SLASH", "Letter", "Currency", "';'", "'{'", "'}'", "','", "'['", "']'", "'('", "')'", "'...'", "'+='", "'-='", "'*='", "'/='", "'||'", "'&&'", "'=='", "'!='", "'%'", "'++'", "'--'", "'!'", "'.'"
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
    public static final int IntegerNumber=68;
    public static final int ARRAYINIT=27;
    public static final int PREDEC=30;
    public static final int FIELDACCESS=6;
    public static final int PRIVATE=40;
    public static final int Letter=84;
    public static final int INTLITERAL=50;
    public static final int CONDITION=23;
    public static final int PREINC=28;
    public static final int T__96=96;
    public static final int MBODY=17;
    public static final int CBODY=18;
    public static final int STRINGLITERAL=55;
    public static final int CHARLITERAL=54;
    public static final int PLUS=80;
    public static final int EXTENDS=37;
    public static final int POSTDEC=31;
    public static final int UNARYPLUS=32;
    public static final int DOUBLELITERAL=53;
    public static final int SUPER=49;
    public static final int ARGUMENTS=14;
    public static final int T__89=89;
    public static final int LongSuffix=69;
    public static final int WS=76;
    public static final int CHAR=41;
    public static final int NEW=66;
    public static final int EQ=79;
    public static final int UPDATE=24;
    public static final int T__92=92;
    public static final int T__88=88;
    public static final int LINE_COMMENT=78;
    public static final int DOTCLASS=8;
    public static final int FIELD=11;
    public static final int POSTINC=29;
    public static final int T__90=90;
    public static final int BOOLEAN=75;
    public static final int ELSE=63;
    public static final int T__91=91;
    public static final int BOOLEANLITERAL=56;
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
    public static final int Digit=67;
    public static final int T__100=100;
    public static final int T__95=95;
    public static final int FLOAT=46;
    public static final int CAST=34;
    public static final int T__101=101;
    public static final int FLOATLITERAL=52;
    public static final int INIT=22;
    public static final int FMULTPARM=16;
    public static final int T__104=104;
    public static final int T__107=107;
    public static final int DOWHILE=25;
    public static final int T__87=87;
    public static final int BLOCK=20;
    public static final int T__106=106;
    public static final int EscapeSequence=74;
    public static final int INT=44;
    public static final int COMPAREOP=65;
    public static final int VOID=39;
    public static final int INSTANCEOF=64;
    public static final int LONGLITERAL=51;
    public static final int NULLLITERAL=57;
    public static final int FloatingPointLiteral=71;
    public static final int T__98=98;
    public static final int DoubleSuffix=73;
    public static final int Exponent=70;
    public static final int FloatSuffix=72;
    public static final int DO=61;
    public static final int SLASH=83;
    public static final int WHILE=60;
    public static final int Currency=85;
    public static final int T__99=99;
    public static final int COMMENT=77;
    public static final int THIS=48;
    public static final int T__103=103;
    public static final int CLASS=35;
    public static final int RETURN=62;
    public static final int T__97=97;
    public static final int METHODCALL=4;
    public static final int BYTE=42;
    public static final int T__105=105;
    public static final int IF=58;
    public static final int FPARMS=13;
    public static final int EOF=-1;
    public static final int FOR=59;
    public static final int STAR=82;
    public static final int T__102=102;

    // delegates
    // delegators

    protected static class JaScope_scope {
        String name;
        LinkedSetList<Variable> symbols;
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

     
    	private Map<String, ReferenceType> cTab = new HashMap<String, ReferenceType>(); // inizializzazione per ANTLRWORKS
    	private ReferenceType rt;	
    		
    	public void setClassTable(Map<String, ReferenceType> m) {
            	cTab = m;
        	}
        	
    	public void setReferenceType(ReferenceType rt) {
        		this.rt = rt;
        	}
        	
        	/** Verifica se v e' definito in JaScope. Analizza lo stack dall'alto verso il basso
        	 *  controllando la presenza di v ad ogni livello.
     	 */
    	private boolean isDefined(Variable v) {
    	    for (int s=JaScope_stack.size()-1; s>=0; s--) {
    	        if ( ((JaScope_scope)JaScope_stack.elementAt(s)).symbols.contains(v) ) {
    	            return true;
    	        }
    	    }
    	    return false;
    	}
    	
    	private String getMethodSignature() {
    	    String list = ((JaScope_scope)JaScope_stack.elementAt(0)).symbols.toString();
    	    return ((JaScope_scope)JaScope_stack.elementAt(0)).name + '(' + list.substring(1, list.length()-1) + ')';
    	}



    // $ANTLR start "compilationUnit"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:56:1: compilationUnit : classDeclaration ;
    public final void compilationUnit() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:57:5: ( classDeclaration )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:57:8: classDeclaration
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:60:1: classDeclaration : ^( CLASS IDENTIFIER ( classType )? classBody ) ;
    public final void classDeclaration() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:61:5: ( ^( CLASS IDENTIFIER ( classType )? classBody ) )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:61:9: ^( CLASS IDENTIFIER ( classType )? classBody )
            {
            match(input,CLASS,FOLLOW_CLASS_in_classDeclaration81); 

            match(input, Token.DOWN, null); 
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classDeclaration83); 
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:61:28: ( classType )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==IDENTIFIER) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:61:28: classType
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:64:1: classBody : ( classBodyDeclaration )* ;
    public final void classBody() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:65:5: ( ( classBodyDeclaration )* )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:65:9: ( classBodyDeclaration )*
            {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:65:9: ( classBodyDeclaration )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=METHOD && LA2_0<=CONSTR)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:65:9: classBodyDeclaration
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:68:1: classBodyDeclaration : memberDeclaration ;
    public final void classBodyDeclaration() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:69:5: ( memberDeclaration )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:69:9: memberDeclaration
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:72:1: memberDeclaration : ( fieldDeclaration | methodAndConstructorDeclaration );
    public final void memberDeclaration() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:73:5: ( fieldDeclaration | methodAndConstructorDeclaration )
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
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:73:9: fieldDeclaration
                    {
                    pushFollow(FOLLOW_fieldDeclaration_in_memberDeclaration158);
                    fieldDeclaration();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:74:7: methodAndConstructorDeclaration
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:77:1: methodAndConstructorDeclaration : ( ^( METHOD modifier type methodDeclaration ) | ^( METHOD modifier VOID IDENTIFIER voidMethodDeclaratorRest ) | ^( CONSTR modifier IDENTIFIER ( formalParameters )? ( constructorBody )? ) );
    public final void methodAndConstructorDeclaration() throws RecognitionException {
        JaScope_stack.push(new JaScope_scope());

        CommonTree IDENTIFIER1=null;
        CommonTree IDENTIFIER2=null;


        	((JaScope_scope)JaScope_stack.peek()).symbols = new LinkedSetList<Variable>();

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:85:5: ( ^( METHOD modifier type methodDeclaration ) | ^( METHOD modifier VOID IDENTIFIER voidMethodDeclaratorRest ) | ^( CONSTR modifier IDENTIFIER ( formalParameters )? ( constructorBody )? ) )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==METHOD) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==DOWN) ) {
                    int LA6_3 = input.LA(3);

                    if ( (LA6_3==PUBLIC||LA6_3==PRIVATE) ) {
                        int LA6_4 = input.LA(4);

                        if ( (LA6_4==ARRAYTYPE||LA6_4==IDENTIFIER||(LA6_4>=CHAR && LA6_4<=DOUBLE)) ) {
                            alt6=1;
                        }
                        else if ( (LA6_4==VOID) ) {
                            alt6=2;
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
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:85:9: ^( METHOD modifier type methodDeclaration )
                    {
                    match(input,METHOD,FOLLOW_METHOD_in_methodAndConstructorDeclaration205); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_modifier_in_methodAndConstructorDeclaration208);
                    modifier();

                    state._fsp--;

                    pushFollow(FOLLOW_type_in_methodAndConstructorDeclaration210);
                    type();

                    state._fsp--;

                    pushFollow(FOLLOW_methodDeclaration_in_methodAndConstructorDeclaration213);
                    methodDeclaration();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:86:9: ^( METHOD modifier VOID IDENTIFIER voidMethodDeclaratorRest )
                    {
                    match(input,METHOD,FOLLOW_METHOD_in_methodAndConstructorDeclaration228); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_modifier_in_methodAndConstructorDeclaration230);
                    modifier();

                    state._fsp--;

                    match(input,VOID,FOLLOW_VOID_in_methodAndConstructorDeclaration232); 
                    IDENTIFIER1=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_methodAndConstructorDeclaration234); 
                     ((JaScope_scope)JaScope_stack.peek()).name = (IDENTIFIER1!=null?IDENTIFIER1.getText():null); 
                    pushFollow(FOLLOW_voidMethodDeclaratorRest_in_methodAndConstructorDeclaration238);
                    voidMethodDeclaratorRest();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:87:9: ^( CONSTR modifier IDENTIFIER ( formalParameters )? ( constructorBody )? )
                    {
                    match(input,CONSTR,FOLLOW_CONSTR_in_methodAndConstructorDeclaration253); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_modifier_in_methodAndConstructorDeclaration255);
                    modifier();

                    state._fsp--;

                    IDENTIFIER2=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_methodAndConstructorDeclaration257); 
                     ((JaScope_scope)JaScope_stack.peek()).name = (IDENTIFIER2!=null?IDENTIFIER2.getText():null); 
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:87:77: ( formalParameters )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==FPARMS) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:87:77: formalParameters
                            {
                            pushFollow(FOLLOW_formalParameters_in_methodAndConstructorDeclaration261);
                            formalParameters();

                            state._fsp--;


                            }
                            break;

                    }

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:87:95: ( constructorBody )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==CBODY) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:87:95: constructorBody
                            {
                            pushFollow(FOLLOW_constructorBody_in_methodAndConstructorDeclaration264);
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:91:1: methodDeclaration : IDENTIFIER formalParameters methodBody ;
    public final void methodDeclaration() throws RecognitionException {
        CommonTree IDENTIFIER3=null;

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:92:5: ( IDENTIFIER formalParameters methodBody )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:92:9: IDENTIFIER formalParameters methodBody
            {
            IDENTIFIER3=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_methodDeclaration295); 
             ((JaScope_scope)JaScope_stack.peek()).name = (IDENTIFIER3!=null?IDENTIFIER3.getText():null); 
            pushFollow(FOLLOW_formalParameters_in_methodDeclaration299);
            formalParameters();

            state._fsp--;

            pushFollow(FOLLOW_methodBody_in_methodDeclaration301);
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:95:1: fieldDeclaration : ^( FIELD modifier variableDeclarator ) ;
    public final void fieldDeclaration() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:96:5: ( ^( FIELD modifier variableDeclarator ) )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:96:9: ^( FIELD modifier variableDeclarator )
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


    // $ANTLR start "voidMethodDeclaratorRest"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:99:1: voidMethodDeclaratorRest : formalParameters methodBody ;
    public final void voidMethodDeclaratorRest() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:100:5: ( formalParameters methodBody )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:100:7: formalParameters methodBody
            {
            pushFollow(FOLLOW_formalParameters_in_voidMethodDeclaratorRest348);
            formalParameters();

            state._fsp--;

            pushFollow(FOLLOW_methodBody_in_voidMethodDeclaratorRest350);
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


    // $ANTLR start "variableDeclarator"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:103:1: variableDeclarator : variableDeclaratorId ( variableInitializer )? ;
    public final void variableDeclarator() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:104:5: ( variableDeclaratorId ( variableInitializer )? )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:104:9: variableDeclaratorId ( variableInitializer )?
            {
            pushFollow(FOLLOW_variableDeclaratorId_in_variableDeclarator369);
            variableDeclaratorId();

            state._fsp--;

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:104:30: ( variableInitializer )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==METHODCALL||(LA7_0>=FIELDACCESS && LA7_0<=DOTCLASS)||(LA7_0>=ARRAYINIT && LA7_0<=CAST)||LA7_0==IDENTIFIER||LA7_0==THIS||LA7_0==INTLITERAL||(LA7_0>=CHARLITERAL && LA7_0<=NULLLITERAL)||(LA7_0>=INSTANCEOF && LA7_0<=NEW)||LA7_0==FloatingPointLiteral||(LA7_0>=EQ && LA7_0<=SLASH)||(LA7_0>=99 && LA7_0<=103)||LA7_0==106) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:104:31: variableInitializer
                    {
                    pushFollow(FOLLOW_variableInitializer_in_variableDeclarator372);
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
        return ;
    }
    // $ANTLR end "variableDeclarator"


    // $ANTLR start "variableDeclaratorId"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:107:1: variableDeclaratorId : type IDENTIFIER ;
    public final void variableDeclaratorId() throws RecognitionException {
        CommonTree IDENTIFIER4=null;
        Type type5 = null;


        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:108:5: ( type IDENTIFIER )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:108:9: type IDENTIFIER
            {
            pushFollow(FOLLOW_type_in_variableDeclaratorId397);
            type5=type();

            state._fsp--;

            IDENTIFIER4=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variableDeclaratorId399); 
             Variable v = new Variable((IDENTIFIER4!=null?IDENTIFIER4.getText():null), type5);
                			    if(!isDefined(v)) 
                			    	((JaScope_scope)JaScope_stack.peek()).symbols.add(v);
                			    else
                			    	throw new UnacceptableLocalVariableException((IDENTIFIER4!=null?IDENTIFIER4.getText():null), getMethodSignature(), (IDENTIFIER4!=null?IDENTIFIER4.getLine():0), (IDENTIFIER4!=null?IDENTIFIER4.getCharPositionInLine():0)); 
                			  

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
    // $ANTLR end "variableDeclaratorId"


    // $ANTLR start "variableInitializer"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:116:1: variableInitializer : ( arrayInitializer | expression );
    public final void variableInitializer() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:117:5: ( arrayInitializer | expression )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==ARRAYINIT) ) {
                alt8=1;
            }
            else if ( (LA8_0==METHODCALL||(LA8_0>=FIELDACCESS && LA8_0<=DOTCLASS)||(LA8_0>=PREINC && LA8_0<=CAST)||LA8_0==IDENTIFIER||LA8_0==THIS||LA8_0==INTLITERAL||(LA8_0>=CHARLITERAL && LA8_0<=NULLLITERAL)||(LA8_0>=INSTANCEOF && LA8_0<=NEW)||LA8_0==FloatingPointLiteral||(LA8_0>=EQ && LA8_0<=SLASH)||(LA8_0>=99 && LA8_0<=103)||LA8_0==106) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:117:9: arrayInitializer
                    {
                    pushFollow(FOLLOW_arrayInitializer_in_variableInitializer424);
                    arrayInitializer();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:118:9: expression
                    {
                    pushFollow(FOLLOW_expression_in_variableInitializer434);
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:121:1: arrayInitializer : ^( ARRAYINIT variableInitializer ( variableInitializer )* ) ;
    public final void arrayInitializer() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:122:5: ( ^( ARRAYINIT variableInitializer ( variableInitializer )* ) )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:122:9: ^( ARRAYINIT variableInitializer ( variableInitializer )* )
            {
            match(input,ARRAYINIT,FOLLOW_ARRAYINIT_in_arrayInitializer454); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_variableInitializer_in_arrayInitializer456);
            variableInitializer();

            state._fsp--;

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:122:41: ( variableInitializer )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==METHODCALL||(LA9_0>=FIELDACCESS && LA9_0<=DOTCLASS)||(LA9_0>=ARRAYINIT && LA9_0<=CAST)||LA9_0==IDENTIFIER||LA9_0==THIS||LA9_0==INTLITERAL||(LA9_0>=CHARLITERAL && LA9_0<=NULLLITERAL)||(LA9_0>=INSTANCEOF && LA9_0<=NEW)||LA9_0==FloatingPointLiteral||(LA9_0>=EQ && LA9_0<=SLASH)||(LA9_0>=99 && LA9_0<=103)||LA9_0==106) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:122:42: variableInitializer
            	    {
            	    pushFollow(FOLLOW_variableInitializer_in_arrayInitializer459);
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:125:1: modifier : ( PUBLIC | PRIVATE );
    public final void modifier() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:126:5: ( PUBLIC | PRIVATE )
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:130:1: type returns [Type t] : ( nonPrimitiveType | primitiveType );
    public final Type type() throws RecognitionException {
        Type t = null;

        ComplexType nonPrimitiveType6 = null;

        BasicType primitiveType7 = null;


        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:131:5: ( nonPrimitiveType | primitiveType )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ARRAYTYPE||LA10_0==IDENTIFIER) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=CHAR && LA10_0<=DOUBLE)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:131:7: nonPrimitiveType
                    {
                    pushFollow(FOLLOW_nonPrimitiveType_in_type521);
                    nonPrimitiveType6=nonPrimitiveType();

                    state._fsp--;

                     t = nonPrimitiveType6; 

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:132:7: primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_type531);
                    primitiveType7=primitiveType();

                    state._fsp--;

                     t = primitiveType7;   

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:135:1: nonPrimitiveType returns [ComplexType t] : ( ^( ARRAYTYPE npt= nonPrimitiveType ) | classType | ^( ARRAYTYPE primitiveType ) );
    public final ComplexType nonPrimitiveType() throws RecognitionException {
        ComplexType t = null;

        ComplexType npt = null;

        ReferenceType classType8 = null;

        BasicType primitiveType9 = null;


        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:136:5: ( ^( ARRAYTYPE npt= nonPrimitiveType ) | classType | ^( ARRAYTYPE primitiveType ) )
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ARRAYTYPE) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==DOWN) ) {
                    int LA11_3 = input.LA(3);

                    if ( ((LA11_3>=CHAR && LA11_3<=DOUBLE)) ) {
                        alt11=3;
                    }
                    else if ( (LA11_3==ARRAYTYPE||LA11_3==IDENTIFIER) ) {
                        alt11=1;
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
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:136:7: ^( ARRAYTYPE npt= nonPrimitiveType )
                    {
                    match(input,ARRAYTYPE,FOLLOW_ARRAYTYPE_in_nonPrimitiveType559); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_nonPrimitiveType_in_nonPrimitiveType563);
                    npt=nonPrimitiveType();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     t = (ComplexType)ParserHelper.createArrayType(npt, 1); 

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:137:9: classType
                    {
                    pushFollow(FOLLOW_classType_in_nonPrimitiveType576);
                    classType8=classType();

                    state._fsp--;

                     t = classType8; 

                    }
                    break;
                case 3 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:138:7: ^( ARRAYTYPE primitiveType )
                    {
                    match(input,ARRAYTYPE,FOLLOW_ARRAYTYPE_in_nonPrimitiveType610); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_primitiveType_in_nonPrimitiveType612);
                    primitiveType9=primitiveType();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     t = (ComplexType)ParserHelper.createArrayType(primitiveType9, 1); 

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:141:1: classType returns [ReferenceType t] : IDENTIFIER ;
    public final ReferenceType classType() throws RecognitionException {
        ReferenceType t = null;

        CommonTree IDENTIFIER10=null;

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:142:5: ( IDENTIFIER )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:142:7: IDENTIFIER
            {
            IDENTIFIER10=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classType643); 
             t = cTab.get((IDENTIFIER10!=null?IDENTIFIER10.getText():null)); 

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:145:1: primitiveType returns [BasicType bs] : ( CHAR | BYTE | SHORT | INT | LONG | FLOAT | DOUBLE );
    public final BasicType primitiveType() throws RecognitionException {
        BasicType bs = null;

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:146:5: ( CHAR | BYTE | SHORT | INT | LONG | FLOAT | DOUBLE )
            int alt12=7;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:146:9: CHAR
                    {
                    match(input,CHAR,FOLLOW_CHAR_in_primitiveType668); 
                     bs = BasicType.CHAR;   

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:147:9: BYTE
                    {
                    match(input,BYTE,FOLLOW_BYTE_in_primitiveType682); 
                     bs = BasicType.BYTE;   

                    }
                    break;
                case 3 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:148:9: SHORT
                    {
                    match(input,SHORT,FOLLOW_SHORT_in_primitiveType696); 
                     bs = BasicType.SHORT;  

                    }
                    break;
                case 4 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:149:9: INT
                    {
                    match(input,INT,FOLLOW_INT_in_primitiveType709); 
                     bs = BasicType.INT;    

                    }
                    break;
                case 5 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:150:9: LONG
                    {
                    match(input,LONG,FOLLOW_LONG_in_primitiveType724); 
                     bs = BasicType.LONG;   

                    }
                    break;
                case 6 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:151:9: FLOAT
                    {
                    match(input,FLOAT,FOLLOW_FLOAT_in_primitiveType738); 
                     bs = BasicType.FLOAT;  

                    }
                    break;
                case 7 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:152:9: DOUBLE
                    {
                    match(input,DOUBLE,FOLLOW_DOUBLE_in_primitiveType751); 
                     bs = BasicType.DOUBLE; 

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:155:1: formalParameters : ^( FPARMS ( formalParameterDecls )? ) ;
    public final void formalParameters() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:156:5: ( ^( FPARMS ( formalParameterDecls )? ) )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:156:9: ^( FPARMS ( formalParameterDecls )? )
            {
            match(input,FPARMS,FOLLOW_FPARMS_in_formalParameters777); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:156:18: ( formalParameterDecls )?
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=FPARM && LA13_0<=FMULTPARM)) ) {
                    alt13=1;
                }
                switch (alt13) {
                    case 1 :
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:156:18: formalParameterDecls
                        {
                        pushFollow(FOLLOW_formalParameterDecls_in_formalParameters779);
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:159:1: formalParameterDecls : ( ^( FPARM variableDeclaratorId ) ( formalParameterDecls )? | ^( FMULTPARM variableDeclaratorId ) );
    public final void formalParameterDecls() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:160:5: ( ^( FPARM variableDeclaratorId ) ( formalParameterDecls )? | ^( FMULTPARM variableDeclaratorId ) )
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
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:160:7: ^( FPARM variableDeclaratorId ) ( formalParameterDecls )?
                    {
                    match(input,FPARM,FOLLOW_FPARM_in_formalParameterDecls804); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_variableDeclaratorId_in_formalParameterDecls806);
                    variableDeclaratorId();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:160:37: ( formalParameterDecls )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( ((LA14_0>=FPARM && LA14_0<=FMULTPARM)) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:160:37: formalParameterDecls
                            {
                            pushFollow(FOLLOW_formalParameterDecls_in_formalParameterDecls809);
                            formalParameterDecls();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:161:7: ^( FMULTPARM variableDeclaratorId )
                    {
                    match(input,FMULTPARM,FOLLOW_FMULTPARM_in_formalParameterDecls819); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_variableDeclaratorId_in_formalParameterDecls821);
                    variableDeclaratorId();

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
    // $ANTLR end "formalParameterDecls"


    // $ANTLR start "methodBody"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:164:1: methodBody : ^( MBODY block ) ;
    public final void methodBody() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:165:5: ( ^( MBODY block ) )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:165:9: ^( MBODY block )
            {
            match(input,MBODY,FOLLOW_MBODY_in_methodBody846); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                pushFollow(FOLLOW_block_in_methodBody848);
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:169:1: constructorBody : ^( CBODY ( explicitConstructorInvocation )? ( blockStatement )* ) ;
    public final void constructorBody() throws RecognitionException {
        JaScope_stack.push(new JaScope_scope());


        	((JaScope_scope)JaScope_stack.peek()).symbols = new LinkedSetList<Variable>();

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:177:5: ( ^( CBODY ( explicitConstructorInvocation )? ( blockStatement )* ) )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:177:7: ^( CBODY ( explicitConstructorInvocation )? ( blockStatement )* )
            {
            match(input,CBODY,FOLLOW_CBODY_in_constructorBody907); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:177:15: ( explicitConstructorInvocation )?
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==CONSTRCALL) ) {
                    alt16=1;
                }
                switch (alt16) {
                    case 1 :
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:177:15: explicitConstructorInvocation
                        {
                        pushFollow(FOLLOW_explicitConstructorInvocation_in_constructorBody909);
                        explicitConstructorInvocation();

                        state._fsp--;


                        }
                        break;

                }

                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:177:46: ( blockStatement )*
                loop17:
                do {
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( ((LA17_0>=VARDECL && LA17_0<=STMT)||LA17_0==DOWHILE||(LA17_0>=IF && LA17_0<=WHILE)||LA17_0==RETURN) ) {
                        alt17=1;
                    }


                    switch (alt17) {
                	case 1 :
                	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:177:46: blockStatement
                	    {
                	    pushFollow(FOLLOW_blockStatement_in_constructorBody912);
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


            	System.out.println("constructorBody: " + getMethodSignature());

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:180:1: explicitConstructorInvocation : ( ^( CONSTRCALL THIS ( arguments )? ) | ^( CONSTRCALL SUPER ( arguments )? ) );
    public final void explicitConstructorInvocation() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:181:5: ( ^( CONSTRCALL THIS ( arguments )? ) | ^( CONSTRCALL SUPER ( arguments )? ) )
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
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:181:9: ^( CONSTRCALL THIS ( arguments )? )
                    {
                    match(input,CONSTRCALL,FOLLOW_CONSTRCALL_in_explicitConstructorInvocation934); 

                    match(input, Token.DOWN, null); 
                    match(input,THIS,FOLLOW_THIS_in_explicitConstructorInvocation936); 
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:181:28: ( arguments )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==ARGUMENTS) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:181:28: arguments
                            {
                            pushFollow(FOLLOW_arguments_in_explicitConstructorInvocation939);
                            arguments();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:182:7: ^( CONSTRCALL SUPER ( arguments )? )
                    {
                    match(input,CONSTRCALL,FOLLOW_CONSTRCALL_in_explicitConstructorInvocation950); 

                    match(input, Token.DOWN, null); 
                    match(input,SUPER,FOLLOW_SUPER_in_explicitConstructorInvocation952); 
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:182:26: ( arguments )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==ARGUMENTS) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:182:26: arguments
                            {
                            pushFollow(FOLLOW_arguments_in_explicitConstructorInvocation954);
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:185:1: literal : ( INTLITERAL | FloatingPointLiteral | CHARLITERAL | STRINGLITERAL | BOOLEANLITERAL | NULLLITERAL );
    public final void literal() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:186:5: ( INTLITERAL | FloatingPointLiteral | CHARLITERAL | STRINGLITERAL | BOOLEANLITERAL | NULLLITERAL )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:
            {
            if ( input.LA(1)==INTLITERAL||(input.LA(1)>=CHARLITERAL && input.LA(1)<=NULLLITERAL)||input.LA(1)==FloatingPointLiteral ) {
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
    // $ANTLR end "literal"


    // $ANTLR start "block"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:196:1: block : ( blockStatement )* ;
    public final void block() throws RecognitionException {
        JaScope_stack.push(new JaScope_scope());


        	((JaScope_scope)JaScope_stack.peek()).symbols = new LinkedSetList<Variable>();

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:204:5: ( ( blockStatement )* )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:204:9: ( blockStatement )*
            {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:204:9: ( blockStatement )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=VARDECL && LA21_0<=STMT)||LA21_0==DOWHILE||(LA21_0>=IF && LA21_0<=WHILE)||LA21_0==RETURN) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:204:9: blockStatement
            	    {
            	    pushFollow(FOLLOW_blockStatement_in_block1062);
            	    blockStatement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:207:1: blockStatement : ( localVariableDeclarationStatement | statement );
    public final void blockStatement() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:208:5: ( localVariableDeclarationStatement | statement )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==VARDECL) ) {
                alt22=1;
            }
            else if ( ((LA22_0>=BLOCK && LA22_0<=STMT)||LA22_0==DOWHILE||(LA22_0>=IF && LA22_0<=WHILE)||LA22_0==RETURN) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:208:9: localVariableDeclarationStatement
                    {
                    pushFollow(FOLLOW_localVariableDeclarationStatement_in_blockStatement1086);
                    localVariableDeclarationStatement();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:209:9: statement
                    {
                    pushFollow(FOLLOW_statement_in_blockStatement1096);
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:212:1: localVariableDeclarationStatement : localVariableDeclaration ;
    public final void localVariableDeclarationStatement() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:213:5: ( localVariableDeclaration )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:213:7: localVariableDeclaration
            {
            pushFollow(FOLLOW_localVariableDeclaration_in_localVariableDeclarationStatement1117);
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:216:1: localVariableDeclaration : ^( VARDECL variableDeclarator ) ;
    public final void localVariableDeclaration() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:217:5: ( ^( VARDECL variableDeclarator ) )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:217:7: ^( VARDECL variableDeclarator )
            {
            match(input,VARDECL,FOLLOW_VARDECL_in_localVariableDeclaration1135); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_variableDeclarator_in_localVariableDeclaration1137);
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
    // $ANTLR end "localVariableDeclaration"


    // $ANTLR start "statement"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:221:1: statement : ( ^( BLOCK block ) | ^( IF ^( CONDITION expression ) ^( THEN statement ) ( elseStmt )? ) | ^( FOR ( ^( INIT forInit ) )? ( ^( CONDITION expression ) )? ( ^( UPDATE forUpdate ) )? statement ) | ^( WHILE ^( CONDITION expression ) statement ) | ^( DOWHILE ^( CONDITION expression ) statement ) | ^( RETURN ( expression )? ) | ^( STMT statementExpression ) );
    public final void statement() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:222:5: ( ^( BLOCK block ) | ^( IF ^( CONDITION expression ) ^( THEN statement ) ( elseStmt )? ) | ^( FOR ( ^( INIT forInit ) )? ( ^( CONDITION expression ) )? ( ^( UPDATE forUpdate ) )? statement ) | ^( WHILE ^( CONDITION expression ) statement ) | ^( DOWHILE ^( CONDITION expression ) statement ) | ^( RETURN ( expression )? ) | ^( STMT statementExpression ) )
            int alt28=7;
            switch ( input.LA(1) ) {
            case BLOCK:
                {
                alt28=1;
                }
                break;
            case IF:
                {
                alt28=2;
                }
                break;
            case FOR:
                {
                alt28=3;
                }
                break;
            case WHILE:
                {
                alt28=4;
                }
                break;
            case DOWHILE:
                {
                alt28=5;
                }
                break;
            case RETURN:
                {
                alt28=6;
                }
                break;
            case STMT:
                {
                alt28=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:222:9: ^( BLOCK block )
                    {
                    match(input,BLOCK,FOLLOW_BLOCK_in_statement1163); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_block_in_statement1165);
                        block();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:223:9: ^( IF ^( CONDITION expression ) ^( THEN statement ) ( elseStmt )? )
                    {
                    match(input,IF,FOLLOW_IF_in_statement1177); 

                    match(input, Token.DOWN, null); 
                    match(input,CONDITION,FOLLOW_CONDITION_in_statement1180); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_statement1182);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    match(input,THEN,FOLLOW_THEN_in_statement1186); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_statement_in_statement1188);
                    statement();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:223:56: ( elseStmt )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==ELSE) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:223:56: elseStmt
                            {
                            pushFollow(FOLLOW_elseStmt_in_statement1191);
                            elseStmt();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:224:9: ^( FOR ( ^( INIT forInit ) )? ( ^( CONDITION expression ) )? ( ^( UPDATE forUpdate ) )? statement )
                    {
                    match(input,FOR,FOLLOW_FOR_in_statement1204); 

                    match(input, Token.DOWN, null); 
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:224:15: ( ^( INIT forInit ) )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==INIT) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:224:16: ^( INIT forInit )
                            {
                            match(input,INIT,FOLLOW_INIT_in_statement1208); 

                            match(input, Token.DOWN, null); 
                            pushFollow(FOLLOW_forInit_in_statement1210);
                            forInit();

                            state._fsp--;


                            match(input, Token.UP, null); 

                            }
                            break;

                    }

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:224:34: ( ^( CONDITION expression ) )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==CONDITION) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:224:35: ^( CONDITION expression )
                            {
                            match(input,CONDITION,FOLLOW_CONDITION_in_statement1217); 

                            match(input, Token.DOWN, null); 
                            pushFollow(FOLLOW_expression_in_statement1219);
                            expression();

                            state._fsp--;


                            match(input, Token.UP, null); 

                            }
                            break;

                    }

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:224:61: ( ^( UPDATE forUpdate ) )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==UPDATE) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:224:62: ^( UPDATE forUpdate )
                            {
                            match(input,UPDATE,FOLLOW_UPDATE_in_statement1226); 

                            match(input, Token.DOWN, null); 
                            pushFollow(FOLLOW_forUpdate_in_statement1228);
                            forUpdate();

                            state._fsp--;


                            match(input, Token.UP, null); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_statement_in_statement1233);
                    statement();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:225:9: ^( WHILE ^( CONDITION expression ) statement )
                    {
                    match(input,WHILE,FOLLOW_WHILE_in_statement1246); 

                    match(input, Token.DOWN, null); 
                    match(input,CONDITION,FOLLOW_CONDITION_in_statement1249); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_statement1251);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    pushFollow(FOLLOW_statement_in_statement1254);
                    statement();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:226:9: ^( DOWHILE ^( CONDITION expression ) statement )
                    {
                    match(input,DOWHILE,FOLLOW_DOWHILE_in_statement1266); 

                    match(input, Token.DOWN, null); 
                    match(input,CONDITION,FOLLOW_CONDITION_in_statement1269); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_statement1271);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    pushFollow(FOLLOW_statement_in_statement1274);
                    statement();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:227:9: ^( RETURN ( expression )? )
                    {
                    match(input,RETURN,FOLLOW_RETURN_in_statement1286); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:227:18: ( expression )?
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==METHODCALL||(LA27_0>=FIELDACCESS && LA27_0<=DOTCLASS)||(LA27_0>=PREINC && LA27_0<=CAST)||LA27_0==IDENTIFIER||LA27_0==THIS||LA27_0==INTLITERAL||(LA27_0>=CHARLITERAL && LA27_0<=NULLLITERAL)||(LA27_0>=INSTANCEOF && LA27_0<=NEW)||LA27_0==FloatingPointLiteral||(LA27_0>=EQ && LA27_0<=SLASH)||(LA27_0>=99 && LA27_0<=103)||LA27_0==106) ) {
                            alt27=1;
                        }
                        switch (alt27) {
                            case 1 :
                                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:227:18: expression
                                {
                                pushFollow(FOLLOW_expression_in_statement1288);
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
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:228:9: ^( STMT statementExpression )
                    {
                    match(input,STMT,FOLLOW_STMT_in_statement1302); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_statementExpression_in_statement1304);
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:231:1: elseStmt : ^( ELSE statement ) ;
    public final void elseStmt() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:232:5: ( ^( ELSE statement ) )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:232:7: ^( ELSE statement )
            {
            match(input,ELSE,FOLLOW_ELSE_in_elseStmt1327); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_statement_in_elseStmt1329);
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:235:1: forInit : ( localVariableDeclaration | expressionList );
    public final void forInit() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:236:5: ( localVariableDeclaration | expressionList )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==VARDECL) ) {
                alt29=1;
            }
            else if ( (LA29_0==METHODCALL||(LA29_0>=FIELDACCESS && LA29_0<=DOTCLASS)||(LA29_0>=PREINC && LA29_0<=CAST)||LA29_0==IDENTIFIER||LA29_0==THIS||LA29_0==INTLITERAL||(LA29_0>=CHARLITERAL && LA29_0<=NULLLITERAL)||(LA29_0>=INSTANCEOF && LA29_0<=NEW)||LA29_0==FloatingPointLiteral||(LA29_0>=EQ && LA29_0<=SLASH)||(LA29_0>=99 && LA29_0<=103)||LA29_0==106) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:236:9: localVariableDeclaration
                    {
                    pushFollow(FOLLOW_localVariableDeclaration_in_forInit1349);
                    localVariableDeclaration();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:237:9: expressionList
                    {
                    pushFollow(FOLLOW_expressionList_in_forInit1359);
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:240:1: forUpdate : expressionList ;
    public final void forUpdate() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:241:5: ( expressionList )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:241:9: expressionList
            {
            pushFollow(FOLLOW_expressionList_in_forUpdate1378);
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:248:1: expressionList : expression ( expression )* ;
    public final void expressionList() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:249:5: ( expression ( expression )* )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:249:9: expression ( expression )*
            {
            pushFollow(FOLLOW_expression_in_expressionList1403);
            expression();

            state._fsp--;

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:249:20: ( expression )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==METHODCALL||(LA30_0>=FIELDACCESS && LA30_0<=DOTCLASS)||(LA30_0>=PREINC && LA30_0<=CAST)||LA30_0==IDENTIFIER||LA30_0==THIS||LA30_0==INTLITERAL||(LA30_0>=CHARLITERAL && LA30_0<=NULLLITERAL)||(LA30_0>=INSTANCEOF && LA30_0<=NEW)||LA30_0==FloatingPointLiteral||(LA30_0>=EQ && LA30_0<=SLASH)||(LA30_0>=99 && LA30_0<=103)||LA30_0==106) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:249:21: expression
            	    {
            	    pushFollow(FOLLOW_expression_in_expressionList1406);
            	    expression();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // $ANTLR end "expressionList"


    // $ANTLR start "statementExpression"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:252:1: statementExpression : expression ;
    public final void statementExpression() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:253:5: ( expression )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:253:9: expression
            {
            pushFollow(FOLLOW_expression_in_statementExpression1427);
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:256:1: constantExpression : expression ;
    public final void constantExpression() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:257:5: ( expression )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:257:9: expression
            {
            pushFollow(FOLLOW_expression_in_constantExpression1450);
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:260:1: expression : ( ^( EQ expression expression ) | ^( PLUS expression expression ) | ^( MINUS expression expression ) | ^( STAR expression expression ) | ^( SLASH expression expression ) | ^( '||' expression expression ) | ^( '&&' expression expression ) | ^( '==' expression expression ) | ^( '!=' expression expression ) | ^( INSTANCEOF expression type ) | ^( COMPAREOP expression expression ) | ^( '%' expression expression ) | ^( UNARYPLUS expression ) | ^( UNARYMINUS expression ) | ^( PREINC expression ) | ^( PREDEC expression ) | ^( '!' expression ) | ^( CAST primitiveType expression ) | ^( CAST nonPrimitiveType expression ) | ^( NEW creator ) | ^( POSTINC ( selector | primary ) ) | ^( POSTDEC ( selector | primary ) ) | selector | primary );
    public final void expression() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:261:5: ( ^( EQ expression expression ) | ^( PLUS expression expression ) | ^( MINUS expression expression ) | ^( STAR expression expression ) | ^( SLASH expression expression ) | ^( '||' expression expression ) | ^( '&&' expression expression ) | ^( '==' expression expression ) | ^( '!=' expression expression ) | ^( INSTANCEOF expression type ) | ^( COMPAREOP expression expression ) | ^( '%' expression expression ) | ^( UNARYPLUS expression ) | ^( UNARYMINUS expression ) | ^( PREINC expression ) | ^( PREDEC expression ) | ^( '!' expression ) | ^( CAST primitiveType expression ) | ^( CAST nonPrimitiveType expression ) | ^( NEW creator ) | ^( POSTINC ( selector | primary ) ) | ^( POSTDEC ( selector | primary ) ) | selector | primary )
            int alt33=24;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:261:9: ^( EQ expression expression )
                    {
                    match(input,EQ,FOLLOW_EQ_in_expression1474); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1479);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1481);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:262:7: ^( PLUS expression expression )
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_expression1491); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1494);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1496);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:263:7: ^( MINUS expression expression )
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_expression1506); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1508);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1510);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:264:7: ^( STAR expression expression )
                    {
                    match(input,STAR,FOLLOW_STAR_in_expression1520); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1523);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1525);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:265:7: ^( SLASH expression expression )
                    {
                    match(input,SLASH,FOLLOW_SLASH_in_expression1535); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1537);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1539);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:266:9: ^( '||' expression expression )
                    {
                    match(input,99,FOLLOW_99_in_expression1551); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1554);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1556);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 7 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:267:9: ^( '&&' expression expression )
                    {
                    match(input,100,FOLLOW_100_in_expression1571); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1574);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1576);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 8 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:268:9: ^( '==' expression expression )
                    {
                    match(input,101,FOLLOW_101_in_expression1588); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1591);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1593);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 9 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:269:9: ^( '!=' expression expression )
                    {
                    match(input,102,FOLLOW_102_in_expression1605); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1608);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1610);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 10 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:270:7: ^( INSTANCEOF expression type )
                    {
                    match(input,INSTANCEOF,FOLLOW_INSTANCEOF_in_expression1620); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1622);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_type_in_expression1624);
                    type();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 11 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:271:7: ^( COMPAREOP expression expression )
                    {
                    match(input,COMPAREOP,FOLLOW_COMPAREOP_in_expression1634); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1636);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1638);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 12 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:272:9: ^( '%' expression expression )
                    {
                    match(input,103,FOLLOW_103_in_expression1650); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1654);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1656);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 13 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:273:7: ^( UNARYPLUS expression )
                    {
                    match(input,UNARYPLUS,FOLLOW_UNARYPLUS_in_expression1666); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1669);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 14 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:274:9: ^( UNARYMINUS expression )
                    {
                    match(input,UNARYMINUS,FOLLOW_UNARYMINUS_in_expression1682); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1684);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 15 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:275:9: ^( PREINC expression )
                    {
                    match(input,PREINC,FOLLOW_PREINC_in_expression1696); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1698);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 16 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:276:9: ^( PREDEC expression )
                    {
                    match(input,PREDEC,FOLLOW_PREDEC_in_expression1710); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1712);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 17 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:277:7: ^( '!' expression )
                    {
                    match(input,106,FOLLOW_106_in_expression1724); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1726);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 18 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:278:9: ^( CAST primitiveType expression )
                    {
                    match(input,CAST,FOLLOW_CAST_in_expression1738); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_primitiveType_in_expression1740);
                    primitiveType();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1742);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 19 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:279:9: ^( CAST nonPrimitiveType expression )
                    {
                    match(input,CAST,FOLLOW_CAST_in_expression1754); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_nonPrimitiveType_in_expression1756);
                    nonPrimitiveType();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1758);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 20 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:280:9: ^( NEW creator )
                    {
                    match(input,NEW,FOLLOW_NEW_in_expression1770); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_creator_in_expression1772);
                    creator();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 21 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:281:7: ^( POSTINC ( selector | primary ) )
                    {
                    match(input,POSTINC,FOLLOW_POSTINC_in_expression1782); 

                    match(input, Token.DOWN, null); 
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:281:17: ( selector | primary )
                    int alt31=2;
                    switch ( input.LA(1) ) {
                    case FIELDACCESS:
                        {
                        int LA31_1 = input.LA(2);

                        if ( (LA31_1==DOWN) ) {
                            int LA31_5 = input.LA(3);

                            if ( (LA31_5==SUPER) ) {
                                alt31=2;
                            }
                            else if ( (LA31_5==METHODCALL||(LA31_5>=FIELDACCESS && LA31_5<=DOTCLASS)||(LA31_5>=PREINC && LA31_5<=CAST)||LA31_5==IDENTIFIER||LA31_5==THIS||LA31_5==INTLITERAL||(LA31_5>=CHARLITERAL && LA31_5<=NULLLITERAL)||(LA31_5>=INSTANCEOF && LA31_5<=NEW)||LA31_5==FloatingPointLiteral||(LA31_5>=EQ && LA31_5<=SLASH)||(LA31_5>=99 && LA31_5<=103)||LA31_5==106) ) {
                                alt31=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 31, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 31, 1, input);

                            throw nvae;
                        }
                        }
                        break;
                    case METHODCALL:
                        {
                        int LA31_2 = input.LA(2);

                        if ( (LA31_2==DOWN) ) {
                            int LA31_6 = input.LA(3);

                            if ( (LA31_6==SUPER) ) {
                                alt31=2;
                            }
                            else if ( (LA31_6==METHODCALL||(LA31_6>=FIELDACCESS && LA31_6<=DOTCLASS)||(LA31_6>=PREINC && LA31_6<=CAST)||LA31_6==IDENTIFIER||LA31_6==THIS||LA31_6==INTLITERAL||(LA31_6>=CHARLITERAL && LA31_6<=NULLLITERAL)||(LA31_6>=INSTANCEOF && LA31_6<=NEW)||LA31_6==FloatingPointLiteral||(LA31_6>=EQ && LA31_6<=SLASH)||(LA31_6>=99 && LA31_6<=103)||LA31_6==106) ) {
                                alt31=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 31, 6, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 31, 2, input);

                            throw nvae;
                        }
                        }
                        break;
                    case ARRAYACCESS:
                        {
                        alt31=1;
                        }
                        break;
                    case DOTCLASS:
                    case IDENTIFIER:
                    case THIS:
                    case INTLITERAL:
                    case CHARLITERAL:
                    case STRINGLITERAL:
                    case BOOLEANLITERAL:
                    case NULLLITERAL:
                    case FloatingPointLiteral:
                        {
                        alt31=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 0, input);

                        throw nvae;
                    }

                    switch (alt31) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:281:18: selector
                            {
                            pushFollow(FOLLOW_selector_in_expression1785);
                            selector();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:281:29: primary
                            {
                            pushFollow(FOLLOW_primary_in_expression1789);
                            primary();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 22 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:282:9: ^( POSTDEC ( selector | primary ) )
                    {
                    match(input,POSTDEC,FOLLOW_POSTDEC_in_expression1802); 

                    match(input, Token.DOWN, null); 
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:282:19: ( selector | primary )
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
                            else if ( (LA32_5==METHODCALL||(LA32_5>=FIELDACCESS && LA32_5<=DOTCLASS)||(LA32_5>=PREINC && LA32_5<=CAST)||LA32_5==IDENTIFIER||LA32_5==THIS||LA32_5==INTLITERAL||(LA32_5>=CHARLITERAL && LA32_5<=NULLLITERAL)||(LA32_5>=INSTANCEOF && LA32_5<=NEW)||LA32_5==FloatingPointLiteral||(LA32_5>=EQ && LA32_5<=SLASH)||(LA32_5>=99 && LA32_5<=103)||LA32_5==106) ) {
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
                            else if ( (LA32_6==METHODCALL||(LA32_6>=FIELDACCESS && LA32_6<=DOTCLASS)||(LA32_6>=PREINC && LA32_6<=CAST)||LA32_6==IDENTIFIER||LA32_6==THIS||LA32_6==INTLITERAL||(LA32_6>=CHARLITERAL && LA32_6<=NULLLITERAL)||(LA32_6>=INSTANCEOF && LA32_6<=NEW)||LA32_6==FloatingPointLiteral||(LA32_6>=EQ && LA32_6<=SLASH)||(LA32_6>=99 && LA32_6<=103)||LA32_6==106) ) {
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
                    case CHARLITERAL:
                    case STRINGLITERAL:
                    case BOOLEANLITERAL:
                    case NULLLITERAL:
                    case FloatingPointLiteral:
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
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:282:20: selector
                            {
                            pushFollow(FOLLOW_selector_in_expression1805);
                            selector();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:282:31: primary
                            {
                            pushFollow(FOLLOW_primary_in_expression1809);
                            primary();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 23 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:283:9: selector
                    {
                    pushFollow(FOLLOW_selector_in_expression1821);
                    selector();

                    state._fsp--;


                    }
                    break;
                case 24 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:284:9: primary
                    {
                    pushFollow(FOLLOW_primary_in_expression1831);
                    primary();

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
    // $ANTLR end "expression"


    // $ANTLR start "primary"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:287:1: primary : ( THIS | superMemberAccess | literal | IDENTIFIER | ^( DOTCLASS ^( ARRAYTYPE type ) ) | ^( DOTCLASS IDENTIFIER ) | ^( DOTCLASS primitiveType ) | ^( DOTCLASS VOID ) );
    public final void primary() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:289:5: ( THIS | superMemberAccess | literal | IDENTIFIER | ^( DOTCLASS ^( ARRAYTYPE type ) ) | ^( DOTCLASS IDENTIFIER ) | ^( DOTCLASS primitiveType ) | ^( DOTCLASS VOID ) )
            int alt34=8;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:289:7: THIS
                    {
                    match(input,THIS,FOLLOW_THIS_in_primary1866); 

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:290:9: superMemberAccess
                    {
                    pushFollow(FOLLOW_superMemberAccess_in_primary1877);
                    superMemberAccess();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:291:9: literal
                    {
                    pushFollow(FOLLOW_literal_in_primary1887);
                    literal();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:292:9: IDENTIFIER
                    {
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary1897); 

                    }
                    break;
                case 5 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:293:9: ^( DOTCLASS ^( ARRAYTYPE type ) )
                    {
                    match(input,DOTCLASS,FOLLOW_DOTCLASS_in_primary1908); 

                    match(input, Token.DOWN, null); 
                    match(input,ARRAYTYPE,FOLLOW_ARRAYTYPE_in_primary1911); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_in_primary1913);
                    type();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:295:7: ^( DOTCLASS IDENTIFIER )
                    {
                    match(input,DOTCLASS,FOLLOW_DOTCLASS_in_primary1931); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary1933); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 7 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:296:9: ^( DOTCLASS primitiveType )
                    {
                    match(input,DOTCLASS,FOLLOW_DOTCLASS_in_primary1945); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_primitiveType_in_primary1947);
                    primitiveType();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 8 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:297:9: ^( DOTCLASS VOID )
                    {
                    match(input,DOTCLASS,FOLLOW_DOTCLASS_in_primary1959); 

                    match(input, Token.DOWN, null); 
                    match(input,VOID,FOLLOW_VOID_in_primary1961); 

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
    // $ANTLR end "primary"


    // $ANTLR start "selector"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:300:1: selector : ( ^( FIELDACCESS expression IDENTIFIER ) | ^( METHODCALL expression IDENTIFIER ( arguments )? ) | ^( ARRAYACCESS expression expression ) );
    public final void selector() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:301:5: ( ^( FIELDACCESS expression IDENTIFIER ) | ^( METHODCALL expression IDENTIFIER ( arguments )? ) | ^( ARRAYACCESS expression expression ) )
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
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:301:9: ^( FIELDACCESS expression IDENTIFIER )
                    {
                    match(input,FIELDACCESS,FOLLOW_FIELDACCESS_in_selector1986); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_selector1988);
                    expression();

                    state._fsp--;

                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_selector1990); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:302:7: ^( METHODCALL expression IDENTIFIER ( arguments )? )
                    {
                    match(input,METHODCALL,FOLLOW_METHODCALL_in_selector2000); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_selector2002);
                    expression();

                    state._fsp--;

                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_selector2004); 
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:302:42: ( arguments )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==ARGUMENTS) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:302:42: arguments
                            {
                            pushFollow(FOLLOW_arguments_in_selector2006);
                            arguments();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:303:9: ^( ARRAYACCESS expression expression )
                    {
                    match(input,ARRAYACCESS,FOLLOW_ARRAYACCESS_in_selector2019); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_selector2021);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_selector2023);
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
    // $ANTLR end "selector"


    // $ANTLR start "creator"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:306:1: creator : ( arrayCreatorRest | createdName ( classCreatorRest )? );
    public final void creator() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:307:5: ( arrayCreatorRest | createdName ( classCreatorRest )? )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==ARRAYTYPE) ) {
                alt38=1;
            }
            else if ( (LA38_0==IDENTIFIER||(LA38_0>=CHAR && LA38_0<=DOUBLE)) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:307:10: arrayCreatorRest
                    {
                    pushFollow(FOLLOW_arrayCreatorRest_in_creator2044);
                    arrayCreatorRest();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:308:10: createdName ( classCreatorRest )?
                    {
                    pushFollow(FOLLOW_createdName_in_creator2056);
                    createdName();

                    state._fsp--;

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:308:22: ( classCreatorRest )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==ARGUMENTS) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:308:22: classCreatorRest
                            {
                            pushFollow(FOLLOW_classCreatorRest_in_creator2058);
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:312:1: createdName : ( classType | primitiveType );
    public final void createdName() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:313:5: ( classType | primitiveType )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==IDENTIFIER) ) {
                alt39=1;
            }
            else if ( ((LA39_0>=CHAR && LA39_0<=DOUBLE)) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:313:9: classType
                    {
                    pushFollow(FOLLOW_classType_in_createdName2080);
                    classType();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:314:9: primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_createdName2090);
                    primitiveType();

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
    // $ANTLR end "createdName"


    // $ANTLR start "arrayCreatorRest"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:317:1: arrayCreatorRest : ( ( ^( ARRAYTYPE createdName ) arrayInitializer ) | ^( ARRAYTYPE arrayCreatorExpr expression ) );
    public final void arrayCreatorRest() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:318:5: ( ( ^( ARRAYTYPE createdName ) arrayInitializer ) | ^( ARRAYTYPE arrayCreatorExpr expression ) )
            int alt40=2;
            alt40 = dfa40.predict(input);
            switch (alt40) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:318:9: ( ^( ARRAYTYPE createdName ) arrayInitializer )
                    {
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:318:9: ( ^( ARRAYTYPE createdName ) arrayInitializer )
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:318:10: ^( ARRAYTYPE createdName ) arrayInitializer
                    {
                    match(input,ARRAYTYPE,FOLLOW_ARRAYTYPE_in_arrayCreatorRest2115); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_createdName_in_arrayCreatorRest2118);
                    createdName();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    pushFollow(FOLLOW_arrayInitializer_in_arrayCreatorRest2121);
                    arrayInitializer();

                    state._fsp--;


                    }


                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:319:8: ^( ARRAYTYPE arrayCreatorExpr expression )
                    {
                    match(input,ARRAYTYPE,FOLLOW_ARRAYTYPE_in_arrayCreatorRest2135); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_arrayCreatorExpr_in_arrayCreatorRest2138);
                    arrayCreatorExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_arrayCreatorRest2140);
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:322:1: arrayCreatorExpr : ( ^( ARRAYTYPE arrayCreatorExpr expression ) | createdName );
    public final void arrayCreatorExpr() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:323:5: ( ^( ARRAYTYPE arrayCreatorExpr expression ) | createdName )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==ARRAYTYPE) ) {
                alt41=1;
            }
            else if ( (LA41_0==IDENTIFIER||(LA41_0>=CHAR && LA41_0<=DOUBLE)) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:323:7: ^( ARRAYTYPE arrayCreatorExpr expression )
                    {
                    match(input,ARRAYTYPE,FOLLOW_ARRAYTYPE_in_arrayCreatorExpr2167); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_arrayCreatorExpr_in_arrayCreatorExpr2169);
                    arrayCreatorExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_arrayCreatorExpr2171);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:324:8: createdName
                    {
                    pushFollow(FOLLOW_createdName_in_arrayCreatorExpr2181);
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:327:1: classCreatorRest : arguments ;
    public final void classCreatorRest() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:328:5: ( arguments )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:328:9: arguments
            {
            pushFollow(FOLLOW_arguments_in_classCreatorRest2205);
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:331:1: superMemberAccess : ( ^( METHODCALL SUPER IDENTIFIER arguments ) | ^( FIELDACCESS SUPER IDENTIFIER ) );
    public final void superMemberAccess() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:332:5: ( ^( METHODCALL SUPER IDENTIFIER arguments ) | ^( FIELDACCESS SUPER IDENTIFIER ) )
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
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:332:7: ^( METHODCALL SUPER IDENTIFIER arguments )
                    {
                    match(input,METHODCALL,FOLLOW_METHODCALL_in_superMemberAccess2230); 

                    match(input, Token.DOWN, null); 
                    match(input,SUPER,FOLLOW_SUPER_in_superMemberAccess2232); 
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_superMemberAccess2234); 
                    pushFollow(FOLLOW_arguments_in_superMemberAccess2236);
                    arguments();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:333:9: ^( FIELDACCESS SUPER IDENTIFIER )
                    {
                    match(input,FIELDACCESS,FOLLOW_FIELDACCESS_in_superMemberAccess2248); 

                    match(input, Token.DOWN, null); 
                    match(input,SUPER,FOLLOW_SUPER_in_superMemberAccess2250); 
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_superMemberAccess2252); 

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
    // $ANTLR end "superMemberAccess"


    // $ANTLR start "arguments"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:336:1: arguments : ^( ARGUMENTS expressionList ) ;
    public final void arguments() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:337:5: ( ^( ARGUMENTS expressionList ) )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:337:8: ^( ARGUMENTS expressionList )
            {
            match(input,ARGUMENTS,FOLLOW_ARGUMENTS_in_arguments2272); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expressionList_in_arguments2274);
            expressionList();

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
    // $ANTLR end "arguments"

    // Delegated rules


    protected DFA33 dfa33 = new DFA33(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA40 dfa40 = new DFA40(this);
    static final String DFA33_eotS =
        "\37\uffff";
    static final String DFA33_eofS =
        "\37\uffff";
    static final String DFA33_minS =
        "\1\4\21\uffff\1\2\3\uffff\2\2\2\uffff\1\11\2\4\2\uffff";
    static final String DFA33_maxS =
        "\1\152\21\uffff\1\2\3\uffff\2\2\2\uffff\1\57\2\152\2\uffff";
    static final String DFA33_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\20\1\21\1\uffff\1\24\1\25\1\26\2\uffff\1\27\1\30"+
        "\3\uffff\1\22\1\23";
    static final String DFA33_specialS =
        "\37\uffff}>";
    static final String[] DFA33_transitionS = {
            "\1\27\1\uffff\1\26\1\30\1\31\23\uffff\1\17\1\24\1\20\1\25\1"+
            "\15\1\16\1\22\1\uffff\1\31\13\uffff\1\31\1\uffff\1\31\3\uffff"+
            "\4\31\6\uffff\1\12\1\13\1\23\4\uffff\1\31\7\uffff\1\1\1\2\1"+
            "\3\1\4\1\5\17\uffff\1\6\1\7\1\10\1\11\1\14\2\uffff\1\21",
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
            "\1\36\32\uffff\1\36\4\uffff\7\35",
            "\1\30\1\uffff\3\30\23\uffff\7\30\1\uffff\1\30\13\uffff\1\30"+
            "\1\31\1\30\3\uffff\4\30\6\uffff\3\30\4\uffff\1\30\7\uffff\5"+
            "\30\17\uffff\5\30\2\uffff\1\30",
            "\1\30\1\uffff\3\30\23\uffff\7\30\1\uffff\1\30\13\uffff\1\30"+
            "\1\31\1\30\3\uffff\4\30\6\uffff\3\30\4\uffff\1\30\7\uffff\5"+
            "\30\17\uffff\5\30\2\uffff\1\30",
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
            return "260:1: expression : ( ^( EQ expression expression ) | ^( PLUS expression expression ) | ^( MINUS expression expression ) | ^( STAR expression expression ) | ^( SLASH expression expression ) | ^( '||' expression expression ) | ^( '&&' expression expression ) | ^( '==' expression expression ) | ^( '!=' expression expression ) | ^( INSTANCEOF expression type ) | ^( COMPAREOP expression expression ) | ^( '%' expression expression ) | ^( UNARYPLUS expression ) | ^( UNARYMINUS expression ) | ^( PREINC expression ) | ^( PREDEC expression ) | ^( '!' expression ) | ^( CAST primitiveType expression ) | ^( CAST nonPrimitiveType expression ) | ^( NEW creator ) | ^( POSTINC ( selector | primary ) ) | ^( POSTDEC ( selector | primary ) ) | selector | primary );";
        }
    }
    static final String DFA34_eotS =
        "\13\uffff";
    static final String DFA34_eofS =
        "\13\uffff";
    static final String DFA34_minS =
        "\1\4\4\uffff\1\2\1\11\4\uffff";
    static final String DFA34_maxS =
        "\1\107\4\uffff\1\2\1\57\4\uffff";
    static final String DFA34_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\2\uffff\1\5\1\6\1\10\1\7";
    static final String DFA34_specialS =
        "\13\uffff}>";
    static final String[] DFA34_transitionS = {
            "\1\2\1\uffff\1\2\1\uffff\1\5\33\uffff\1\4\13\uffff\1\1\1\uffff"+
            "\1\3\3\uffff\4\3\15\uffff\1\3",
            "",
            "",
            "",
            "",
            "\1\6",
            "\1\7\32\uffff\1\10\2\uffff\1\11\1\uffff\7\12",
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
            return "287:1: primary : ( THIS | superMemberAccess | literal | IDENTIFIER | ^( DOTCLASS ^( ARRAYTYPE type ) ) | ^( DOTCLASS IDENTIFIER ) | ^( DOTCLASS primitiveType ) | ^( DOTCLASS VOID ) );";
        }
    }
    static final String DFA40_eotS =
        "\15\uffff";
    static final String DFA40_eofS =
        "\15\uffff";
    static final String DFA40_minS =
        "\1\11\1\2\1\11\1\uffff\10\3\1\uffff";
    static final String DFA40_maxS =
        "\1\11\1\2\1\57\1\uffff\10\152\1\uffff";
    static final String DFA40_acceptS =
        "\3\uffff\1\2\10\uffff\1\1";
    static final String DFA40_specialS =
        "\15\uffff}>";
    static final String[] DFA40_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3\32\uffff\1\4\4\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13",
            "",
            "\1\14\1\3\1\uffff\3\3\23\uffff\7\3\1\uffff\1\3\13\uffff\1\3"+
            "\1\uffff\1\3\3\uffff\4\3\6\uffff\3\3\4\uffff\1\3\7\uffff\5\3"+
            "\17\uffff\5\3\2\uffff\1\3",
            "\1\14\1\3\1\uffff\3\3\23\uffff\7\3\1\uffff\1\3\13\uffff\1\3"+
            "\1\uffff\1\3\3\uffff\4\3\6\uffff\3\3\4\uffff\1\3\7\uffff\5\3"+
            "\17\uffff\5\3\2\uffff\1\3",
            "\1\14\1\3\1\uffff\3\3\23\uffff\7\3\1\uffff\1\3\13\uffff\1\3"+
            "\1\uffff\1\3\3\uffff\4\3\6\uffff\3\3\4\uffff\1\3\7\uffff\5\3"+
            "\17\uffff\5\3\2\uffff\1\3",
            "\1\14\1\3\1\uffff\3\3\23\uffff\7\3\1\uffff\1\3\13\uffff\1\3"+
            "\1\uffff\1\3\3\uffff\4\3\6\uffff\3\3\4\uffff\1\3\7\uffff\5\3"+
            "\17\uffff\5\3\2\uffff\1\3",
            "\1\14\1\3\1\uffff\3\3\23\uffff\7\3\1\uffff\1\3\13\uffff\1\3"+
            "\1\uffff\1\3\3\uffff\4\3\6\uffff\3\3\4\uffff\1\3\7\uffff\5\3"+
            "\17\uffff\5\3\2\uffff\1\3",
            "\1\14\1\3\1\uffff\3\3\23\uffff\7\3\1\uffff\1\3\13\uffff\1\3"+
            "\1\uffff\1\3\3\uffff\4\3\6\uffff\3\3\4\uffff\1\3\7\uffff\5\3"+
            "\17\uffff\5\3\2\uffff\1\3",
            "\1\14\1\3\1\uffff\3\3\23\uffff\7\3\1\uffff\1\3\13\uffff\1\3"+
            "\1\uffff\1\3\3\uffff\4\3\6\uffff\3\3\4\uffff\1\3\7\uffff\5\3"+
            "\17\uffff\5\3\2\uffff\1\3",
            "\1\14\1\3\1\uffff\3\3\23\uffff\7\3\1\uffff\1\3\13\uffff\1\3"+
            "\1\uffff\1\3\3\uffff\4\3\6\uffff\3\3\4\uffff\1\3\7\uffff\5\3"+
            "\17\uffff\5\3\2\uffff\1\3",
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
            return "317:1: arrayCreatorRest : ( ( ^( ARRAYTYPE createdName ) arrayInitializer ) | ^( ARRAYTYPE arrayCreatorExpr expression ) );";
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
    public static final BitSet FOLLOW_modifier_in_methodAndConstructorDeclaration208 = new BitSet(new long[]{0x0000FE1000000200L});
    public static final BitSet FOLLOW_type_in_methodAndConstructorDeclaration210 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_methodDeclaration_in_methodAndConstructorDeclaration213 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_METHOD_in_methodAndConstructorDeclaration228 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifier_in_methodAndConstructorDeclaration230 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_VOID_in_methodAndConstructorDeclaration232 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_methodAndConstructorDeclaration234 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_voidMethodDeclaratorRest_in_methodAndConstructorDeclaration238 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONSTR_in_methodAndConstructorDeclaration253 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifier_in_methodAndConstructorDeclaration255 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_methodAndConstructorDeclaration257 = new BitSet(new long[]{0x0000000000042008L});
    public static final BitSet FOLLOW_formalParameters_in_methodAndConstructorDeclaration261 = new BitSet(new long[]{0x0000000000040008L});
    public static final BitSet FOLLOW_constructorBody_in_methodAndConstructorDeclaration264 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_methodDeclaration295 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_formalParameters_in_methodDeclaration299 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_methodBody_in_methodDeclaration301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIELD_in_fieldDeclaration321 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifier_in_fieldDeclaration323 = new BitSet(new long[]{0x0000FE1000000200L});
    public static final BitSet FOLLOW_variableDeclarator_in_fieldDeclaration325 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_formalParameters_in_voidMethodDeclaratorRest348 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_methodBody_in_voidMethodDeclaratorRest350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_variableDeclarator369 = new BitSet(new long[]{0x03C50017F80001D2L,0x000004F8000F8087L});
    public static final BitSet FOLLOW_variableInitializer_in_variableDeclarator372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_variableDeclaratorId397 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_variableDeclaratorId399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayInitializer_in_variableInitializer424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_variableInitializer434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAYINIT_in_arrayInitializer454 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableInitializer_in_arrayInitializer456 = new BitSet(new long[]{0x03C50017F80001D8L,0x000004F8000F8087L});
    public static final BitSet FOLLOW_variableInitializer_in_arrayInitializer459 = new BitSet(new long[]{0x03C50017F80001D8L,0x000004F8000F8087L});
    public static final BitSet FOLLOW_set_in_modifier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonPrimitiveType_in_type521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_type531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAYTYPE_in_nonPrimitiveType559 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_nonPrimitiveType_in_nonPrimitiveType563 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_classType_in_nonPrimitiveType576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAYTYPE_in_nonPrimitiveType610 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primitiveType_in_nonPrimitiveType612 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classType643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_primitiveType668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BYTE_in_primitiveType682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHORT_in_primitiveType696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_primitiveType709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_in_primitiveType724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_primitiveType738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_primitiveType751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FPARMS_in_formalParameters777 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_formalParameterDecls_in_formalParameters779 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FPARM_in_formalParameterDecls804 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_formalParameterDecls806 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_formalParameterDecls_in_formalParameterDecls809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FMULTPARM_in_formalParameterDecls819 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_formalParameterDecls821 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MBODY_in_methodBody846 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_methodBody848 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CBODY_in_constructorBody907 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_explicitConstructorInvocation_in_constructorBody909 = new BitSet(new long[]{0x5C00000002380008L});
    public static final BitSet FOLLOW_blockStatement_in_constructorBody912 = new BitSet(new long[]{0x5C00000002380008L});
    public static final BitSet FOLLOW_CONSTRCALL_in_explicitConstructorInvocation934 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_THIS_in_explicitConstructorInvocation936 = new BitSet(new long[]{0x0000000000004008L});
    public static final BitSet FOLLOW_arguments_in_explicitConstructorInvocation939 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONSTRCALL_in_explicitConstructorInvocation950 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SUPER_in_explicitConstructorInvocation952 = new BitSet(new long[]{0x0000000000004008L});
    public static final BitSet FOLLOW_arguments_in_explicitConstructorInvocation954 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_literal0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockStatement_in_block1062 = new BitSet(new long[]{0x5C00000002380002L});
    public static final BitSet FOLLOW_localVariableDeclarationStatement_in_blockStatement1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_blockStatement1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localVariableDeclaration_in_localVariableDeclarationStatement1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARDECL_in_localVariableDeclaration1135 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableDeclarator_in_localVariableDeclaration1137 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLOCK_in_statement1163 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_statement1165 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_in_statement1177 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CONDITION_in_statement1180 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement1182 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_THEN_in_statement1186 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_statement1188 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_elseStmt_in_statement1191 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FOR_in_statement1204 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INIT_in_statement1208 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_forInit_in_statement1210 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONDITION_in_statement1217 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement1219 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UPDATE_in_statement1226 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_forUpdate_in_statement1228 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_statement_in_statement1233 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WHILE_in_statement1246 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CONDITION_in_statement1249 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement1251 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_statement_in_statement1254 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DOWHILE_in_statement1266 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CONDITION_in_statement1269 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement1271 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_statement_in_statement1274 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RETURN_in_statement1286 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement1288 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STMT_in_statement1302 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statementExpression_in_statement1304 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ELSE_in_elseStmt1327 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_elseStmt1329 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_localVariableDeclaration_in_forInit1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionList_in_forInit1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionList_in_forUpdate1378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionList1403 = new BitSet(new long[]{0x03C50017F80001D2L,0x000004F8000F8087L});
    public static final BitSet FOLLOW_expression_in_expressionList1406 = new BitSet(new long[]{0x03C50017F80001D2L,0x000004F8000F8087L});
    public static final BitSet FOLLOW_expression_in_statementExpression1427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_constantExpression1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_expression1474 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1479 = new BitSet(new long[]{0x03C50017F80001D0L,0x000004F8000F8087L});
    public static final BitSet FOLLOW_expression_in_expression1481 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_in_expression1491 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1494 = new BitSet(new long[]{0x03C50017F80001D0L,0x000004F8000F8087L});
    public static final BitSet FOLLOW_expression_in_expression1496 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_expression1506 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1508 = new BitSet(new long[]{0x03C50017F80001D0L,0x000004F8000F8087L});
    public static final BitSet FOLLOW_expression_in_expression1510 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STAR_in_expression1520 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1523 = new BitSet(new long[]{0x03C50017F80001D0L,0x000004F8000F8087L});
    public static final BitSet FOLLOW_expression_in_expression1525 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SLASH_in_expression1535 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1537 = new BitSet(new long[]{0x03C50017F80001D0L,0x000004F8000F8087L});
    public static final BitSet FOLLOW_expression_in_expression1539 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_99_in_expression1551 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1554 = new BitSet(new long[]{0x03C50017F80001D0L,0x000004F8000F8087L});
    public static final BitSet FOLLOW_expression_in_expression1556 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_100_in_expression1571 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1574 = new BitSet(new long[]{0x03C50017F80001D0L,0x000004F8000F8087L});
    public static final BitSet FOLLOW_expression_in_expression1576 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_101_in_expression1588 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1591 = new BitSet(new long[]{0x03C50017F80001D0L,0x000004F8000F8087L});
    public static final BitSet FOLLOW_expression_in_expression1593 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_102_in_expression1605 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1608 = new BitSet(new long[]{0x03C50017F80001D0L,0x000004F8000F8087L});
    public static final BitSet FOLLOW_expression_in_expression1610 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INSTANCEOF_in_expression1620 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1622 = new BitSet(new long[]{0x0000FE1000000200L});
    public static final BitSet FOLLOW_type_in_expression1624 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COMPAREOP_in_expression1634 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1636 = new BitSet(new long[]{0x03C50017F80001D0L,0x000004F8000F8087L});
    public static final BitSet FOLLOW_expression_in_expression1638 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_103_in_expression1650 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1654 = new BitSet(new long[]{0x03C50017F80001D0L,0x000004F8000F8087L});
    public static final BitSet FOLLOW_expression_in_expression1656 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNARYPLUS_in_expression1666 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1669 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNARYMINUS_in_expression1682 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1684 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PREINC_in_expression1696 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1698 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PREDEC_in_expression1710 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1712 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_106_in_expression1724 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1726 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CAST_in_expression1738 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primitiveType_in_expression1740 = new BitSet(new long[]{0x03C50017F80001D0L,0x000004F8000F8087L});
    public static final BitSet FOLLOW_expression_in_expression1742 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CAST_in_expression1754 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_nonPrimitiveType_in_expression1756 = new BitSet(new long[]{0x03C50017F80001D0L,0x000004F8000F8087L});
    public static final BitSet FOLLOW_expression_in_expression1758 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NEW_in_expression1770 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_creator_in_expression1772 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POSTINC_in_expression1782 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_selector_in_expression1785 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_primary_in_expression1789 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POSTDEC_in_expression1802 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_selector_in_expression1805 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_primary_in_expression1809 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_selector_in_expression1821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_in_expression1831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_primary1866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_superMemberAccess_in_primary1877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primary1887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_primary1897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOTCLASS_in_primary1908 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ARRAYTYPE_in_primary1911 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_primary1913 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DOTCLASS_in_primary1931 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_primary1933 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DOTCLASS_in_primary1945 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primitiveType_in_primary1947 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DOTCLASS_in_primary1959 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VOID_in_primary1961 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FIELDACCESS_in_selector1986 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_selector1988 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_selector1990 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_METHODCALL_in_selector2000 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_selector2002 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_selector2004 = new BitSet(new long[]{0x0000000000004008L});
    public static final BitSet FOLLOW_arguments_in_selector2006 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARRAYACCESS_in_selector2019 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_selector2021 = new BitSet(new long[]{0x03C50017F80001D0L,0x000004F8000F8087L});
    public static final BitSet FOLLOW_expression_in_selector2023 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_arrayCreatorRest_in_creator2044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createdName_in_creator2056 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_classCreatorRest_in_creator2058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classType_in_createdName2080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_createdName2090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAYTYPE_in_arrayCreatorRest2115 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_createdName_in_arrayCreatorRest2118 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_arrayInitializer_in_arrayCreatorRest2121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAYTYPE_in_arrayCreatorRest2135 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arrayCreatorExpr_in_arrayCreatorRest2138 = new BitSet(new long[]{0x03C50017F80001D0L,0x000004F8000F8087L});
    public static final BitSet FOLLOW_expression_in_arrayCreatorRest2140 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARRAYTYPE_in_arrayCreatorExpr2167 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arrayCreatorExpr_in_arrayCreatorExpr2169 = new BitSet(new long[]{0x03C50017F80001D0L,0x000004F8000F8087L});
    public static final BitSet FOLLOW_expression_in_arrayCreatorExpr2171 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_createdName_in_arrayCreatorExpr2181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arguments_in_classCreatorRest2205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_METHODCALL_in_superMemberAccess2230 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SUPER_in_superMemberAccess2232 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_superMemberAccess2234 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_arguments_in_superMemberAccess2236 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FIELDACCESS_in_superMemberAccess2248 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SUPER_in_superMemberAccess2250 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_superMemberAccess2252 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARGUMENTS_in_arguments2272 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expressionList_in_arguments2274 = new BitSet(new long[]{0x0000000000000008L});

}