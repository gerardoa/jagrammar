// $ANTLR 3.2 Sep 23, 2009 12:02:23 D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g 2010-10-11 01:21:35

	package jagrammar;
	
	import jagrammar.typehierarchy.*;
	import jagrammar.util.ParserHelper;
	import java.util.Queue;
	import java.util.LinkedList;
	import java.util.HashMap;
	//import java.util.Map; importato da antlr


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class JaParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "METHODCALL", "CONSTRCALL", "FIELDACCESS", "ARRAYACCESS", "DOTCLASS", "ARRAYTYPE", "METHOD", "FIELD", "CONSTR", "FPARMS", "ARGUMENTS", "FPARM", "FMULTPARM", "MBODY", "CBODY", "VARDECL", "BLOCK", "STMT", "INIT", "CONDITION", "UPDATE", "DOWHILE", "THEN", "ARRAYINIT", "PREINC", "POSTINC", "PREDEC", "POSTDEC", "UNARYPLUS", "UNARYMINUS", "CAST", "CLASS", "IDENTIFIER", "EXTENDS", "PUBLIC", "VOID", "PRIVATE", "CHAR", "BYTE", "SHORT", "INT", "LONG", "FLOAT", "DOUBLE", "BOOLEAN", "THIS", "SUPER", "INTLITERAL", "LONGLITERAL", "FLOATLITERAL", "DOUBLELITERAL", "CHARLITERAL", "STRINGLITERAL", "BOOLEANLITERAL", "NULLLITERAL", "IF", "FOR", "WHILE", "DO", "RETURN", "ELSE", "INSTANCEOF", "COMPAREOP", "NEW", "Digit", "IntegerNumber", "LongSuffix", "Exponent", "FloatingPointLiteral", "FloatSuffix", "DoubleSuffix", "EscapeSequence", "WS", "COMMENT", "LINE_COMMENT", "EQ", "PLUS", "MINUS", "STAR", "SLASH", "Letter", "Currency", "';'", "'{'", "'}'", "','", "'['", "']'", "'('", "')'", "'+='", "'-='", "'*='", "'/='", "'||'", "'&&'", "'=='", "'!='", "'%'", "'++'", "'--'", "'!'", "'.'"
    };
    public static final int FMULTPARM=16;
    public static final int CAST=34;
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
    public static final int CBODY=18;
    public static final int THIS=49;
    public static final int RETURN=63;
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
    public static final int LONGLITERAL=52;
    public static final int LongSuffix=70;
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
    public static final int FPARMS=13;
    public static final int T__101=101;
    public static final int INSTANCEOF=65;
    public static final int T__100=100;
    public static final int MINUS=81;
    public static final int Digit=68;
    public static final int DoubleSuffix=74;
    public static final int STRINGLITERAL=56;
    public static final int BLOCK=20;
    public static final int LONG=45;
    public static final int EXTENDS=37;
    public static final int PUBLIC=38;
    public static final int FLOATLITERAL=53;
    public static final int METHOD=10;
    public static final int COMPAREOP=66;
    public static final int DOWHILE=25;

    // delegates
    // delegators


        public JaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public JaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return JaParser.tokenNames; }
    public String getGrammarFileName() { return "D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g"; }

            
    	private Queue<String> todo = new LinkedList<String>(); // inizializzazione per ANTLRWORKS
    	private Map<String, ReferenceType> cTab = new HashMap<String, ReferenceType>(); // inizializzazione per ANTLRWORKS
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


    public static class compilationUnit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "compilationUnit"
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:47:1: compilationUnit : ( classDeclaration | ';' );
    public final JaParser.compilationUnit_return compilationUnit() throws RecognitionException {
        JaParser.compilationUnit_return retval = new JaParser.compilationUnit_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal2=null;
        JaParser.classDeclaration_return classDeclaration1 = null;


        Object char_literal2_tree=null;

        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:48:5: ( classDeclaration | ';' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==PUBLIC) ) {
                alt1=1;
            }
            else if ( (LA1_0==86) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:48:8: classDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_classDeclaration_in_compilationUnit158);
                    classDeclaration1=classDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(classDeclaration1.getTree(), root_0);

                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:49:7: ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal2=(Token)match(input,86,FOLLOW_86_in_compilationUnit168); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal2_tree = (Object)adaptor.create(char_literal2);
                    adaptor.addChild(root_0, char_literal2_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "compilationUnit"

    public static class classDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classDeclaration"
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:52:1: classDeclaration : classModifier CLASS IDENTIFIER ( EXTENDS classType )? classBody ;
    public final JaParser.classDeclaration_return classDeclaration() throws RecognitionException {
        JaParser.classDeclaration_return retval = new JaParser.classDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CLASS4=null;
        Token IDENTIFIER5=null;
        Token EXTENDS6=null;
        JaParser.classModifier_return classModifier3 = null;

        JaParser.classType_return classType7 = null;

        JaParser.classBody_return classBody8 = null;


        Object CLASS4_tree=null;
        Object IDENTIFIER5_tree=null;
        Object EXTENDS6_tree=null;

        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:53:5: ( classModifier CLASS IDENTIFIER ( EXTENDS classType )? classBody )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:53:9: classModifier CLASS IDENTIFIER ( EXTENDS classType )? classBody
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_classModifier_in_classDeclaration191);
            classModifier3=classModifier();

            state._fsp--;
            if (state.failed) return retval;
            CLASS4=(Token)match(input,CLASS,FOLLOW_CLASS_in_classDeclaration194); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CLASS4_tree = (Object)adaptor.create(CLASS4);
            root_0 = (Object)adaptor.becomeRoot(CLASS4_tree, root_0);
            }
            IDENTIFIER5=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classDeclaration197); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER5_tree = (Object)adaptor.create(IDENTIFIER5);
            adaptor.addChild(root_0, IDENTIFIER5_tree);
            }
            if ( state.backtracking==0 ) {
               // Potrebbe gia' esistere l'istanza prima che abbia analizzato il file .java
                  					   // Aggiunta effettuata dalla regola classType per recuperare subito l'istanza della classe anche se priva di interfaccia
                  					   if(cTab.containsKey((IDENTIFIER5!=null?IDENTIFIER5.getText():null))) {
                  				    	   	rt = cTab.get((IDENTIFIER5!=null?IDENTIFIER5.getText():null));
                  					   } else { // crea una nuova istanza per la classe e la aggiunge alla tabella
                  					   	rt = new ReferenceType((IDENTIFIER5!=null?IDENTIFIER5.getText():null));
                  					   	cTab.put((IDENTIFIER5!=null?IDENTIFIER5.getText():null), rt);
                  					   }
                  					 
            }
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:62:9: ( EXTENDS classType )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==EXTENDS) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:62:10: EXTENDS classType
                    {
                    EXTENDS6=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_classDeclaration210); if (state.failed) return retval;
                    pushFollow(FOLLOW_classType_in_classDeclaration213);
                    classType7=classType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classType7.getTree());
                    if ( state.backtracking==0 ) {
                       rt.addSuperType((classType7!=null?classType7.t:null)); 
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_classBody_in_classDeclaration232);
            classBody8=classBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, classBody8.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "classDeclaration"

    public static class classModifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classModifier"
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:66:1: classModifier : PUBLIC ;
    public final JaParser.classModifier_return classModifier() throws RecognitionException {
        JaParser.classModifier_return retval = new JaParser.classModifier_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PUBLIC9=null;

        Object PUBLIC9_tree=null;

        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:67:5: ( PUBLIC )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:67:9: PUBLIC
            {
            root_0 = (Object)adaptor.nil();

            PUBLIC9=(Token)match(input,PUBLIC,FOLLOW_PUBLIC_in_classModifier251); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PUBLIC9_tree = (Object)adaptor.create(PUBLIC9);
            adaptor.addChild(root_0, PUBLIC9_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "classModifier"

    public static class classBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classBody"
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:70:1: classBody : '{' ( classBodyDeclaration )* '}' ;
    public final JaParser.classBody_return classBody() throws RecognitionException {
        JaParser.classBody_return retval = new JaParser.classBody_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal10=null;
        Token char_literal12=null;
        JaParser.classBodyDeclaration_return classBodyDeclaration11 = null;


        Object char_literal10_tree=null;
        Object char_literal12_tree=null;

        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:71:5: ( '{' ( classBodyDeclaration )* '}' )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:71:9: '{' ( classBodyDeclaration )* '}'
            {
            root_0 = (Object)adaptor.nil();

            char_literal10=(Token)match(input,87,FOLLOW_87_in_classBody272); if (state.failed) return retval;
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:71:14: ( classBodyDeclaration )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==PUBLIC||LA3_0==PRIVATE||LA3_0==86) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:71:14: classBodyDeclaration
            	    {
            	    pushFollow(FOLLOW_classBodyDeclaration_in_classBody275);
            	    classBodyDeclaration11=classBodyDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, classBodyDeclaration11.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            char_literal12=(Token)match(input,88,FOLLOW_88_in_classBody278); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "classBody"

    public static class classBodyDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classBodyDeclaration"
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:74:1: classBodyDeclaration : ( ';' | memberDeclaration );
    public final JaParser.classBodyDeclaration_return classBodyDeclaration() throws RecognitionException {
        JaParser.classBodyDeclaration_return retval = new JaParser.classBodyDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal13=null;
        JaParser.memberDeclaration_return memberDeclaration14 = null;


        Object char_literal13_tree=null;

        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:75:5: ( ';' | memberDeclaration )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==86) ) {
                alt4=1;
            }
            else if ( (LA4_0==PUBLIC||LA4_0==PRIVATE) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:75:9: ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal13=(Token)match(input,86,FOLLOW_86_in_classBodyDeclaration298); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:76:9: memberDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_memberDeclaration_in_classBodyDeclaration309);
                    memberDeclaration14=memberDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, memberDeclaration14.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "classBodyDeclaration"

    public static class memberDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "memberDeclaration"
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:79:1: memberDeclaration : ( ( modifier type -> modifier type ) ( methodDeclaration[$modifier.pub, $type.t] -> ^( METHOD $memberDeclaration methodDeclaration ) | fieldDeclaration[(CommonTree)$modifier.tree, (CommonTree)$type.tree, $modifier.pub, $type.t] -> fieldDeclaration ) | modifier VOID IDENTIFIER voidMethodDeclaratorRest[$modifier.pub, VoidType.TYPE, $IDENTIFIER.text] -> ^( METHOD modifier VOID IDENTIFIER voidMethodDeclaratorRest ) | modifier ( IDENTIFIER formalParameters )=> IDENTIFIER formalParameters constructorBody -> ^( CONSTR modifier IDENTIFIER ( formalParameters )? ( constructorBody )? ) );
    public final JaParser.memberDeclaration_return memberDeclaration() throws RecognitionException {
        JaParser.memberDeclaration_return retval = new JaParser.memberDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VOID20=null;
        Token IDENTIFIER21=null;
        Token IDENTIFIER24=null;
        JaParser.modifier_return modifier15 = null;

        JaParser.type_return type16 = null;

        JaParser.methodDeclaration_return methodDeclaration17 = null;

        JaParser.fieldDeclaration_return fieldDeclaration18 = null;

        JaParser.modifier_return modifier19 = null;

        JaParser.voidMethodDeclaratorRest_return voidMethodDeclaratorRest22 = null;

        JaParser.modifier_return modifier23 = null;

        JaParser.formalParameters_return formalParameters25 = null;

        JaParser.constructorBody_return constructorBody26 = null;


        Object VOID20_tree=null;
        Object IDENTIFIER21_tree=null;
        Object IDENTIFIER24_tree=null;
        RewriteRuleTokenStream stream_VOID=new RewriteRuleTokenStream(adaptor,"token VOID");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_modifier=new RewriteRuleSubtreeStream(adaptor,"rule modifier");
        RewriteRuleSubtreeStream stream_constructorBody=new RewriteRuleSubtreeStream(adaptor,"rule constructorBody");
        RewriteRuleSubtreeStream stream_formalParameters=new RewriteRuleSubtreeStream(adaptor,"rule formalParameters");
        RewriteRuleSubtreeStream stream_fieldDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule fieldDeclaration");
        RewriteRuleSubtreeStream stream_voidMethodDeclaratorRest=new RewriteRuleSubtreeStream(adaptor,"rule voidMethodDeclaratorRest");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        RewriteRuleSubtreeStream stream_methodDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule methodDeclaration");
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:80:5: ( ( modifier type -> modifier type ) ( methodDeclaration[$modifier.pub, $type.t] -> ^( METHOD $memberDeclaration methodDeclaration ) | fieldDeclaration[(CommonTree)$modifier.tree, (CommonTree)$type.tree, $modifier.pub, $type.t] -> fieldDeclaration ) | modifier VOID IDENTIFIER voidMethodDeclaratorRest[$modifier.pub, VoidType.TYPE, $IDENTIFIER.text] -> ^( METHOD modifier VOID IDENTIFIER voidMethodDeclaratorRest ) | modifier ( IDENTIFIER formalParameters )=> IDENTIFIER formalParameters constructorBody -> ^( CONSTR modifier IDENTIFIER ( formalParameters )? ( constructorBody )? ) )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==PUBLIC) ) {
                switch ( input.LA(2) ) {
                case VOID:
                    {
                    alt6=2;
                    }
                    break;
                case IDENTIFIER:
                    {
                    int LA6_4 = input.LA(3);

                    if ( (LA6_4==IDENTIFIER||LA6_4==90) ) {
                        alt6=1;
                    }
                    else if ( (LA6_4==92) ) {
                        alt6=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 4, input);

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
                    alt6=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA6_0==PRIVATE) ) {
                switch ( input.LA(2) ) {
                case IDENTIFIER:
                    {
                    int LA6_4 = input.LA(3);

                    if ( (LA6_4==IDENTIFIER||LA6_4==90) ) {
                        alt6=1;
                    }
                    else if ( (LA6_4==92) ) {
                        alt6=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 4, input);

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
                    alt6=1;
                    }
                    break;
                case VOID:
                    {
                    alt6=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:80:9: ( modifier type -> modifier type ) ( methodDeclaration[$modifier.pub, $type.t] -> ^( METHOD $memberDeclaration methodDeclaration ) | fieldDeclaration[(CommonTree)$modifier.tree, (CommonTree)$type.tree, $modifier.pub, $type.t] -> fieldDeclaration )
                    {
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:80:9: ( modifier type -> modifier type )
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:80:10: modifier type
                    {
                    pushFollow(FOLLOW_modifier_in_memberDeclaration333);
                    modifier15=modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_modifier.add(modifier15.getTree());
                    pushFollow(FOLLOW_type_in_memberDeclaration335);
                    type16=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type16.getTree());


                    // AST REWRITE
                    // elements: modifier, type
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 80:24: -> modifier type
                    {
                        adaptor.addChild(root_0, stream_modifier.nextTree());
                        adaptor.addChild(root_0, stream_type.nextTree());

                    }

                    retval.tree = root_0;}
                    }

                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:81:7: ( methodDeclaration[$modifier.pub, $type.t] -> ^( METHOD $memberDeclaration methodDeclaration ) | fieldDeclaration[(CommonTree)$modifier.tree, (CommonTree)$type.tree, $modifier.pub, $type.t] -> fieldDeclaration )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==IDENTIFIER) ) {
                        int LA5_1 = input.LA(2);

                        if ( (LA5_1==92) ) {
                            alt5=1;
                        }
                        else if ( (LA5_1==EQ||LA5_1==86||(LA5_1>=89 && LA5_1<=90)) ) {
                            alt5=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;
                    }
                    switch (alt5) {
                        case 1 :
                            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:81:9: methodDeclaration[$modifier.pub, $type.t]
                            {
                            pushFollow(FOLLOW_methodDeclaration_in_memberDeclaration352);
                            methodDeclaration17=methodDeclaration((modifier15!=null?modifier15.pub:false), (type16!=null?type16.t:null));

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_methodDeclaration.add(methodDeclaration17.getTree());


                            // AST REWRITE
                            // elements: methodDeclaration, memberDeclaration
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 81:51: -> ^( METHOD $memberDeclaration methodDeclaration )
                            {
                                // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:81:54: ^( METHOD $memberDeclaration methodDeclaration )
                                {
                                Object root_1 = (Object)adaptor.nil();
                                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(METHOD, "METHOD"), root_1);

                                adaptor.addChild(root_1, stream_retval.nextTree());
                                adaptor.addChild(root_1, stream_methodDeclaration.nextTree());

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;}
                            }
                            break;
                        case 2 :
                            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:82:9: fieldDeclaration[(CommonTree)$modifier.tree, (CommonTree)$type.tree, $modifier.pub, $type.t]
                            {
                            pushFollow(FOLLOW_fieldDeclaration_in_memberDeclaration374);
                            fieldDeclaration18=fieldDeclaration((CommonTree)(modifier15!=null?((Object)modifier15.tree):null), (CommonTree)(type16!=null?((Object)type16.tree):null), (modifier15!=null?modifier15.pub:false), (type16!=null?type16.t:null));

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_fieldDeclaration.add(fieldDeclaration18.getTree());


                            // AST REWRITE
                            // elements: fieldDeclaration
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 82:102: -> fieldDeclaration
                            {
                                adaptor.addChild(root_0, stream_fieldDeclaration.nextTree());

                            }

                            retval.tree = root_0;}
                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:85:9: modifier VOID IDENTIFIER voidMethodDeclaratorRest[$modifier.pub, VoidType.TYPE, $IDENTIFIER.text]
                    {
                    pushFollow(FOLLOW_modifier_in_memberDeclaration405);
                    modifier19=modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_modifier.add(modifier19.getTree());
                    VOID20=(Token)match(input,VOID,FOLLOW_VOID_in_memberDeclaration407); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VOID.add(VOID20);

                    IDENTIFIER21=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_memberDeclaration409); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER21);

                    pushFollow(FOLLOW_voidMethodDeclaratorRest_in_memberDeclaration411);
                    voidMethodDeclaratorRest22=voidMethodDeclaratorRest((modifier19!=null?modifier19.pub:false), VoidType.TYPE, (IDENTIFIER21!=null?IDENTIFIER21.getText():null));

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_voidMethodDeclaratorRest.add(voidMethodDeclaratorRest22.getTree());


                    // AST REWRITE
                    // elements: VOID, voidMethodDeclaratorRest, IDENTIFIER, modifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 86:6: -> ^( METHOD modifier VOID IDENTIFIER voidMethodDeclaratorRest )
                    {
                        // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:86:9: ^( METHOD modifier VOID IDENTIFIER voidMethodDeclaratorRest )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(METHOD, "METHOD"), root_1);

                        adaptor.addChild(root_1, stream_modifier.nextTree());
                        adaptor.addChild(root_1, stream_VOID.nextNode());
                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        adaptor.addChild(root_1, stream_voidMethodDeclaratorRest.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:88:9: modifier ( IDENTIFIER formalParameters )=> IDENTIFIER formalParameters constructorBody
                    {
                    pushFollow(FOLLOW_modifier_in_memberDeclaration448);
                    modifier23=modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_modifier.add(modifier23.getTree());
                    IDENTIFIER24=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_memberDeclaration458); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER24);

                    pushFollow(FOLLOW_formalParameters_in_memberDeclaration460);
                    formalParameters25=formalParameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formalParameters.add(formalParameters25.getTree());
                    pushFollow(FOLLOW_constructorBody_in_memberDeclaration462);
                    constructorBody26=constructorBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_constructorBody.add(constructorBody26.getTree());
                    if ( state.backtracking==0 ) {
                       rt.addConstructor((modifier23!=null?modifier23.pub:false), (formalParameters25!=null?formalParameters25.args:null)); 
                    }


                    // AST REWRITE
                    // elements: constructorBody, IDENTIFIER, modifier, formalParameters
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 90:6: -> ^( CONSTR modifier IDENTIFIER ( formalParameters )? ( constructorBody )? )
                    {
                        // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:90:9: ^( CONSTR modifier IDENTIFIER ( formalParameters )? ( constructorBody )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONSTR, "CONSTR"), root_1);

                        adaptor.addChild(root_1, stream_modifier.nextTree());
                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:90:38: ( formalParameters )?
                        if ( stream_formalParameters.hasNext() ) {
                            adaptor.addChild(root_1, stream_formalParameters.nextTree());

                        }
                        stream_formalParameters.reset();
                        // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:90:56: ( constructorBody )?
                        if ( stream_constructorBody.hasNext() ) {
                            adaptor.addChild(root_1, stream_constructorBody.nextTree());

                        }
                        stream_constructorBody.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "memberDeclaration"

    public static class methodDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "methodDeclaration"
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:93:1: methodDeclaration[boolean pub, Type t] : IDENTIFIER formalParameters methodBody ;
    public final JaParser.methodDeclaration_return methodDeclaration(boolean pub, Type t) throws RecognitionException {
        JaParser.methodDeclaration_return retval = new JaParser.methodDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENTIFIER27=null;
        JaParser.formalParameters_return formalParameters28 = null;

        JaParser.methodBody_return methodBody29 = null;


        Object IDENTIFIER27_tree=null;

        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:94:5: ( IDENTIFIER formalParameters methodBody )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:94:9: IDENTIFIER formalParameters methodBody
            {
            root_0 = (Object)adaptor.nil();

            IDENTIFIER27=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_methodDeclaration511); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER27_tree = (Object)adaptor.create(IDENTIFIER27);
            adaptor.addChild(root_0, IDENTIFIER27_tree);
            }
            pushFollow(FOLLOW_formalParameters_in_methodDeclaration513);
            formalParameters28=formalParameters();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, formalParameters28.getTree());
            pushFollow(FOLLOW_methodBody_in_methodDeclaration515);
            methodBody29=methodBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, methodBody29.getTree());
            if ( state.backtracking==0 ) {
               rt.addMethod(pub, t, (IDENTIFIER27!=null?IDENTIFIER27.getText():null), (formalParameters28!=null?formalParameters28.args:null)); 
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "methodDeclaration"

    public static class fieldDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fieldDeclaration"
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:98:1: fieldDeclaration[CommonTree mod, CommonTree typ, boolean pub, Type t] : v1= variableDeclarator[$typ] ( ',' v2= variableDeclarator[$typ] )* ';' -> ( ^( FIELD variableDeclarator ) )+ ;
    public final JaParser.fieldDeclaration_return fieldDeclaration(CommonTree mod, CommonTree typ, boolean pub, Type t) throws RecognitionException {
        JaParser.fieldDeclaration_return retval = new JaParser.fieldDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal30=null;
        Token char_literal31=null;
        JaParser.variableDeclarator_return v1 = null;

        JaParser.variableDeclarator_return v2 = null;


        Object char_literal30_tree=null;
        Object char_literal31_tree=null;
        RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
        RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
        RewriteRuleSubtreeStream stream_variableDeclarator=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclarator");
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:99:5: (v1= variableDeclarator[$typ] ( ',' v2= variableDeclarator[$typ] )* ';' -> ( ^( FIELD variableDeclarator ) )+ )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:99:9: v1= variableDeclarator[$typ] ( ',' v2= variableDeclarator[$typ] )* ';'
            {
            pushFollow(FOLLOW_variableDeclarator_in_fieldDeclaration545);
            v1=variableDeclarator(typ);

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variableDeclarator.add(v1.getTree());
            if ( state.backtracking==0 ) {
               rt.addField((v1!=null?v1.varName:null), ParserHelper.createArrayType(t, (v1!=null?v1.arrayDim:0)), pub); 
            }
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:100:9: ( ',' v2= variableDeclarator[$typ] )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==89) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:100:10: ',' v2= variableDeclarator[$typ]
            	    {
            	    char_literal30=(Token)match(input,89,FOLLOW_89_in_fieldDeclaration565); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_89.add(char_literal30);

            	    pushFollow(FOLLOW_variableDeclarator_in_fieldDeclaration569);
            	    v2=variableDeclarator(typ);

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_variableDeclarator.add(v2.getTree());
            	    if ( state.backtracking==0 ) {
            	       rt.addField((v2!=null?v2.varName:null), ParserHelper.createArrayType(t, (v2!=null?v2.arrayDim:0)), pub); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            char_literal31=(Token)match(input,86,FOLLOW_86_in_fieldDeclaration586); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_86.add(char_literal31);



            // AST REWRITE
            // elements: variableDeclarator
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 102:9: -> ( ^( FIELD variableDeclarator ) )+
            {
                if ( !(stream_variableDeclarator.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_variableDeclarator.hasNext() ) {
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:102:12: ^( FIELD variableDeclarator )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FIELD, "FIELD"), root_1);

                    adaptor.addChild(root_1, mod);
                    adaptor.addChild(root_1, stream_variableDeclarator.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_variableDeclarator.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "fieldDeclaration"

    public static class voidMethodDeclaratorRest_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "voidMethodDeclaratorRest"
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:105:1: voidMethodDeclaratorRest[boolean pub, Type t, String methodName] : formalParameters methodBody ;
    public final JaParser.voidMethodDeclaratorRest_return voidMethodDeclaratorRest(boolean pub, Type t, String methodName) throws RecognitionException {
        JaParser.voidMethodDeclaratorRest_return retval = new JaParser.voidMethodDeclaratorRest_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.formalParameters_return formalParameters32 = null;

        JaParser.methodBody_return methodBody33 = null;



        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:106:5: ( formalParameters methodBody )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:106:7: formalParameters methodBody
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_formalParameters_in_voidMethodDeclaratorRest629);
            formalParameters32=formalParameters();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, formalParameters32.getTree());
            pushFollow(FOLLOW_methodBody_in_voidMethodDeclaratorRest631);
            methodBody33=methodBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, methodBody33.getTree());
            if ( state.backtracking==0 ) {
               rt.addMethod(pub, t, methodName, (formalParameters32!=null?formalParameters32.args:null)); 
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "voidMethodDeclaratorRest"

    public static class variableDeclarator_return extends ParserRuleReturnScope {
        public String varName;
        public int arrayDim;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variableDeclarator"
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:109:1: variableDeclarator[CommonTree typ] returns [String varName, int arrayDim] : variableDeclaratorId[$typ] ( '=' variableInitializer )? ;
    public final JaParser.variableDeclarator_return variableDeclarator(CommonTree typ) throws RecognitionException {
        JaParser.variableDeclarator_return retval = new JaParser.variableDeclarator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal35=null;
        JaParser.variableDeclaratorId_return variableDeclaratorId34 = null;

        JaParser.variableInitializer_return variableInitializer36 = null;


        Object char_literal35_tree=null;

        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:110:5: ( variableDeclaratorId[$typ] ( '=' variableInitializer )? )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:110:9: variableDeclaratorId[$typ] ( '=' variableInitializer )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_variableDeclaratorId_in_variableDeclarator657);
            variableDeclaratorId34=variableDeclaratorId(typ);

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaratorId34.getTree());
            if ( state.backtracking==0 ) {
               retval.varName = (variableDeclaratorId34!=null?input.toString(variableDeclaratorId34.start,variableDeclaratorId34.stop):null); retval.arrayDim = (variableDeclaratorId34!=null?variableDeclaratorId34.arrayDim:0); 
            }
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:110:123: ( '=' variableInitializer )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==EQ) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:110:124: '=' variableInitializer
                    {
                    char_literal35=(Token)match(input,EQ,FOLLOW_EQ_in_variableDeclarator663); if (state.failed) return retval;
                    pushFollow(FOLLOW_variableInitializer_in_variableDeclarator666);
                    variableInitializer36=variableInitializer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableInitializer36.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "variableDeclarator"

    public static class variableDeclaratorId_return extends ParserRuleReturnScope {
        public int arrayDim;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variableDeclaratorId"
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:113:1: variableDeclaratorId[CommonTree typ] returns [int arrayDim] : ( IDENTIFIER ->) (l+= '[' ']' -> ^( ARRAYTYPE $variableDeclaratorId) )* -> $variableDeclaratorId IDENTIFIER ;
    public final JaParser.variableDeclaratorId_return variableDeclaratorId(CommonTree typ) throws RecognitionException {
        JaParser.variableDeclaratorId_return retval = new JaParser.variableDeclaratorId_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENTIFIER37=null;
        Token char_literal38=null;
        Token l=null;
        List list_l=null;

        Object IDENTIFIER37_tree=null;
        Object char_literal38_tree=null;
        Object l_tree=null;
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");

        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:114:5: ( ( IDENTIFIER ->) (l+= '[' ']' -> ^( ARRAYTYPE $variableDeclaratorId) )* -> $variableDeclaratorId IDENTIFIER )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:114:9: ( IDENTIFIER ->) (l+= '[' ']' -> ^( ARRAYTYPE $variableDeclaratorId) )*
            {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:114:9: ( IDENTIFIER ->)
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:114:10: IDENTIFIER
            {
            IDENTIFIER37=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variableDeclaratorId699); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER37);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 114:21: ->
            {
                adaptor.addChild(root_0, typ);

            }

            retval.tree = root_0;}
            }

            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:114:32: (l+= '[' ']' -> ^( ARRAYTYPE $variableDeclaratorId) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==90) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:114:34: l+= '[' ']'
            	    {
            	    l=(Token)match(input,90,FOLLOW_90_in_variableDeclaratorId710); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_90.add(l);

            	    if (list_l==null) list_l=new ArrayList();
            	    list_l.add(l);

            	    char_literal38=(Token)match(input,91,FOLLOW_91_in_variableDeclaratorId712); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_91.add(char_literal38);



            	    // AST REWRITE
            	    // elements: variableDeclaratorId
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 114:45: -> ^( ARRAYTYPE $variableDeclaratorId)
            	    {
            	        // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:114:48: ^( ARRAYTYPE $variableDeclaratorId)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAYTYPE, "ARRAYTYPE"), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               if(list_l != null) retval.arrayDim = list_l.size(); 
            }


            // AST REWRITE
            // elements: variableDeclaratorId, IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 116:6: -> $variableDeclaratorId IDENTIFIER
            {
                adaptor.addChild(root_0, stream_retval.nextTree());
                adaptor.addChild(root_0, stream_IDENTIFIER.nextNode());

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "variableDeclaratorId"

    public static class variableInitializer_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variableInitializer"
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:119:1: variableInitializer : ( arrayInitializer | expression );
    public final JaParser.variableInitializer_return variableInitializer() throws RecognitionException {
        JaParser.variableInitializer_return retval = new JaParser.variableInitializer_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.arrayInitializer_return arrayInitializer39 = null;

        JaParser.expression_return expression40 = null;



        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:120:5: ( arrayInitializer | expression )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==87) ) {
                alt10=1;
            }
            else if ( (LA10_0==IDENTIFIER||LA10_0==VOID||(LA10_0>=CHAR && LA10_0<=NULLLITERAL)||LA10_0==NEW||(LA10_0>=PLUS && LA10_0<=MINUS)||LA10_0==92||(LA10_0>=103 && LA10_0<=105)) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:120:9: arrayInitializer
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_arrayInitializer_in_variableInitializer765);
                    arrayInitializer39=arrayInitializer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayInitializer39.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:121:9: expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expression_in_variableInitializer775);
                    expression40=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression40.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "variableInitializer"

    public static class arrayInitializer_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arrayInitializer"
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:124:1: arrayInitializer : lc= '{' ( variableInitializer ( ',' variableInitializer )* ( ',' )? )? '}' -> ^( ARRAYINIT[$lc, \"ARRAYINIT\"] ( variableInitializer )* ) ;
    public final JaParser.arrayInitializer_return arrayInitializer() throws RecognitionException {
        JaParser.arrayInitializer_return retval = new JaParser.arrayInitializer_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lc=null;
        Token char_literal42=null;
        Token char_literal44=null;
        Token char_literal45=null;
        JaParser.variableInitializer_return variableInitializer41 = null;

        JaParser.variableInitializer_return variableInitializer43 = null;


        Object lc_tree=null;
        Object char_literal42_tree=null;
        Object char_literal44_tree=null;
        Object char_literal45_tree=null;
        RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
        RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");
        RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
        RewriteRuleSubtreeStream stream_variableInitializer=new RewriteRuleSubtreeStream(adaptor,"rule variableInitializer");
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:125:5: (lc= '{' ( variableInitializer ( ',' variableInitializer )* ( ',' )? )? '}' -> ^( ARRAYINIT[$lc, \"ARRAYINIT\"] ( variableInitializer )* ) )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:125:9: lc= '{' ( variableInitializer ( ',' variableInitializer )* ( ',' )? )? '}'
            {
            lc=(Token)match(input,87,FOLLOW_87_in_arrayInitializer804); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_87.add(lc);

            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:125:16: ( variableInitializer ( ',' variableInitializer )* ( ',' )? )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==IDENTIFIER||LA13_0==VOID||(LA13_0>=CHAR && LA13_0<=NULLLITERAL)||LA13_0==NEW||(LA13_0>=PLUS && LA13_0<=MINUS)||LA13_0==87||LA13_0==92||(LA13_0>=103 && LA13_0<=105)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:125:17: variableInitializer ( ',' variableInitializer )* ( ',' )?
                    {
                    pushFollow(FOLLOW_variableInitializer_in_arrayInitializer807);
                    variableInitializer41=variableInitializer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_variableInitializer.add(variableInitializer41.getTree());
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:125:37: ( ',' variableInitializer )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==89) ) {
                            int LA11_1 = input.LA(2);

                            if ( (LA11_1==IDENTIFIER||LA11_1==VOID||(LA11_1>=CHAR && LA11_1<=NULLLITERAL)||LA11_1==NEW||(LA11_1>=PLUS && LA11_1<=MINUS)||LA11_1==87||LA11_1==92||(LA11_1>=103 && LA11_1<=105)) ) {
                                alt11=1;
                            }


                        }


                        switch (alt11) {
                    	case 1 :
                    	    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:125:38: ',' variableInitializer
                    	    {
                    	    char_literal42=(Token)match(input,89,FOLLOW_89_in_arrayInitializer810); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_89.add(char_literal42);

                    	    pushFollow(FOLLOW_variableInitializer_in_arrayInitializer812);
                    	    variableInitializer43=variableInitializer();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_variableInitializer.add(variableInitializer43.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:125:64: ( ',' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==89) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:125:65: ','
                            {
                            char_literal44=(Token)match(input,89,FOLLOW_89_in_arrayInitializer817); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_89.add(char_literal44);


                            }
                            break;

                    }


                    }
                    break;

            }

            char_literal45=(Token)match(input,88,FOLLOW_88_in_arrayInitializer824); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_88.add(char_literal45);



            // AST REWRITE
            // elements: variableInitializer
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 125:78: -> ^( ARRAYINIT[$lc, \"ARRAYINIT\"] ( variableInitializer )* )
            {
                // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:125:81: ^( ARRAYINIT[$lc, \"ARRAYINIT\"] ( variableInitializer )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAYINIT, lc, "ARRAYINIT"), root_1);

                // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:125:111: ( variableInitializer )*
                while ( stream_variableInitializer.hasNext() ) {
                    adaptor.addChild(root_1, stream_variableInitializer.nextTree());

                }
                stream_variableInitializer.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "arrayInitializer"

    public static class modifier_return extends ParserRuleReturnScope {
        public boolean pub;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "modifier"
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:128:1: modifier returns [boolean pub] : ( PUBLIC | PRIVATE );
    public final JaParser.modifier_return modifier() throws RecognitionException {
        JaParser.modifier_return retval = new JaParser.modifier_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PUBLIC46=null;
        Token PRIVATE47=null;

        Object PUBLIC46_tree=null;
        Object PRIVATE47_tree=null;

        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:129:5: ( PUBLIC | PRIVATE )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==PUBLIC) ) {
                alt14=1;
            }
            else if ( (LA14_0==PRIVATE) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:129:9: PUBLIC
                    {
                    root_0 = (Object)adaptor.nil();

                    PUBLIC46=(Token)match(input,PUBLIC,FOLLOW_PUBLIC_in_modifier858); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PUBLIC46_tree = (Object)adaptor.create(PUBLIC46);
                    adaptor.addChild(root_0, PUBLIC46_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.pub = true;  
                    }

                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:130:9: PRIVATE
                    {
                    root_0 = (Object)adaptor.nil();

                    PRIVATE47=(Token)match(input,PRIVATE,FOLLOW_PRIVATE_in_modifier871); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PRIVATE47_tree = (Object)adaptor.create(PRIVATE47);
                    adaptor.addChild(root_0, PRIVATE47_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.pub = false; 
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "modifier"

    public static class type_return extends ParserRuleReturnScope {
        public Type t;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:133:1: type returns [Type t] : ( nonPrimitiveType | primitiveType );
    public final JaParser.type_return type() throws RecognitionException {
        JaParser.type_return retval = new JaParser.type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.nonPrimitiveType_return nonPrimitiveType48 = null;

        JaParser.primitiveType_return primitiveType49 = null;



        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:134:5: ( nonPrimitiveType | primitiveType )
            int alt15=2;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:134:7: nonPrimitiveType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_nonPrimitiveType_in_type894);
                    nonPrimitiveType48=nonPrimitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nonPrimitiveType48.getTree());
                    if ( state.backtracking==0 ) {
                       retval.t = (nonPrimitiveType48!=null?nonPrimitiveType48.t:null); 
                    }

                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:135:7: primitiveType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primitiveType_in_type904);
                    primitiveType49=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType49.getTree());
                    if ( state.backtracking==0 ) {
                       retval.t = (primitiveType49!=null?primitiveType49.bs:null);   
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "type"

    public static class nonPrimitiveType_return extends ParserRuleReturnScope {
        public ComplexType t;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nonPrimitiveType"
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:138:1: nonPrimitiveType returns [ComplexType t] : ( ( classType -> classType ) (l+= '[' ']' -> ^( ARRAYTYPE $nonPrimitiveType) )* | ( primitiveType -> primitiveType ) (l+= '[' ']' -> ^( ARRAYTYPE $nonPrimitiveType) )+ );
    public final JaParser.nonPrimitiveType_return nonPrimitiveType() throws RecognitionException {
        JaParser.nonPrimitiveType_return retval = new JaParser.nonPrimitiveType_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal51=null;
        Token char_literal53=null;
        Token l=null;
        List list_l=null;
        JaParser.classType_return classType50 = null;

        JaParser.primitiveType_return primitiveType52 = null;


        Object char_literal51_tree=null;
        Object char_literal53_tree=null;
        Object l_tree=null;
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleSubtreeStream stream_primitiveType=new RewriteRuleSubtreeStream(adaptor,"rule primitiveType");
        RewriteRuleSubtreeStream stream_classType=new RewriteRuleSubtreeStream(adaptor,"rule classType");
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:139:5: ( ( classType -> classType ) (l+= '[' ']' -> ^( ARRAYTYPE $nonPrimitiveType) )* | ( primitiveType -> primitiveType ) (l+= '[' ']' -> ^( ARRAYTYPE $nonPrimitiveType) )+ )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==IDENTIFIER) ) {
                alt18=1;
            }
            else if ( ((LA18_0>=CHAR && LA18_0<=BOOLEAN)) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:139:7: ( classType -> classType ) (l+= '[' ']' -> ^( ARRAYTYPE $nonPrimitiveType) )*
                    {
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:139:7: ( classType -> classType )
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:139:8: classType
                    {
                    pushFollow(FOLLOW_classType_in_nonPrimitiveType931);
                    classType50=classType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_classType.add(classType50.getTree());


                    // AST REWRITE
                    // elements: classType
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 139:22: -> classType
                    {
                        adaptor.addChild(root_0, stream_classType.nextTree());

                    }

                    retval.tree = root_0;}
                    }

                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:139:40: (l+= '[' ']' -> ^( ARRAYTYPE $nonPrimitiveType) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==90) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:139:42: l+= '[' ']'
                    	    {
                    	    l=(Token)match(input,90,FOLLOW_90_in_nonPrimitiveType950); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_90.add(l);

                    	    if (list_l==null) list_l=new ArrayList();
                    	    list_l.add(l);

                    	    char_literal51=(Token)match(input,91,FOLLOW_91_in_nonPrimitiveType952); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_91.add(char_literal51);



                    	    // AST REWRITE
                    	    // elements: nonPrimitiveType
                    	    // token labels: 
                    	    // rule labels: retval
                    	    // token list labels: 
                    	    // rule list labels: 
                    	    // wildcard labels: 
                    	    if ( state.backtracking==0 ) {
                    	    retval.tree = root_0;
                    	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    	    root_0 = (Object)adaptor.nil();
                    	    // 139:53: -> ^( ARRAYTYPE $nonPrimitiveType)
                    	    {
                    	        // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:139:56: ^( ARRAYTYPE $nonPrimitiveType)
                    	        {
                    	        Object root_1 = (Object)adaptor.nil();
                    	        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAYTYPE, "ARRAYTYPE"), root_1);

                    	        adaptor.addChild(root_1, stream_retval.nextTree());

                    	        adaptor.addChild(root_0, root_1);
                    	        }

                    	    }

                    	    retval.tree = root_0;}
                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       if(list_l != null) retval.t = (ComplexType)ParserHelper.createArrayType((classType50!=null?classType50.t:null),      list_l.size());
                      	  else retval.t = (classType50!=null?classType50.t:null);
                      	
                    }

                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:144:7: ( primitiveType -> primitiveType ) (l+= '[' ']' -> ^( ARRAYTYPE $nonPrimitiveType) )+
                    {
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:144:7: ( primitiveType -> primitiveType )
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:144:8: primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_nonPrimitiveType981);
                    primitiveType52=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primitiveType.add(primitiveType52.getTree());


                    // AST REWRITE
                    // elements: primitiveType
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 144:22: -> primitiveType
                    {
                        adaptor.addChild(root_0, stream_primitiveType.nextTree());

                    }

                    retval.tree = root_0;}
                    }

                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:144:40: (l+= '[' ']' -> ^( ARRAYTYPE $nonPrimitiveType) )+
                    int cnt17=0;
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==90) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:144:42: l+= '[' ']'
                    	    {
                    	    l=(Token)match(input,90,FOLLOW_90_in_nonPrimitiveType992); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_90.add(l);

                    	    if (list_l==null) list_l=new ArrayList();
                    	    list_l.add(l);

                    	    char_literal53=(Token)match(input,91,FOLLOW_91_in_nonPrimitiveType994); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_91.add(char_literal53);



                    	    // AST REWRITE
                    	    // elements: nonPrimitiveType
                    	    // token labels: 
                    	    // rule labels: retval
                    	    // token list labels: 
                    	    // rule list labels: 
                    	    // wildcard labels: 
                    	    if ( state.backtracking==0 ) {
                    	    retval.tree = root_0;
                    	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    	    root_0 = (Object)adaptor.nil();
                    	    // 144:53: -> ^( ARRAYTYPE $nonPrimitiveType)
                    	    {
                    	        // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:144:56: ^( ARRAYTYPE $nonPrimitiveType)
                    	        {
                    	        Object root_1 = (Object)adaptor.nil();
                    	        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAYTYPE, "ARRAYTYPE"), root_1);

                    	        adaptor.addChild(root_1, stream_retval.nextTree());

                    	        adaptor.addChild(root_0, root_1);
                    	        }

                    	    }

                    	    retval.tree = root_0;}
                    	    }
                    	    break;

                    	default :
                    	    if ( cnt17 >= 1 ) break loop17;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(17, input);
                                throw eee;
                        }
                        cnt17++;
                    } while (true);

                    if ( state.backtracking==0 ) {
                       retval.t = (ComplexType)ParserHelper.createArrayType((primitiveType52!=null?primitiveType52.bs:null), list_l.size()); 
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "nonPrimitiveType"

    public static class classType_return extends ParserRuleReturnScope {
        public ReferenceType t;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classType"
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:148:1: classType returns [ReferenceType t] : IDENTIFIER ;
    public final JaParser.classType_return classType() throws RecognitionException {
        JaParser.classType_return retval = new JaParser.classType_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENTIFIER54=null;

        Object IDENTIFIER54_tree=null;

        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:149:5: ( IDENTIFIER )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:149:7: IDENTIFIER
            {
            root_0 = (Object)adaptor.nil();

            IDENTIFIER54=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classType1031); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER54_tree = (Object)adaptor.create(IDENTIFIER54);
            adaptor.addChild(root_0, IDENTIFIER54_tree);
            }
            if ( state.backtracking==0 ) {
               if(cTab.containsKey((IDENTIFIER54!=null?IDENTIFIER54.getText():null))) {
                      	     	retval.t = cTab.get((IDENTIFIER54!=null?IDENTIFIER54.getText():null));
                     		     } else {
              		     	retval.t = new ReferenceType((IDENTIFIER54!=null?IDENTIFIER54.getText():null));
              			cTab.put((IDENTIFIER54!=null?IDENTIFIER54.getText():null), retval.t);
              			todo.add((IDENTIFIER54!=null?IDENTIFIER54.getText():null));	
                     		     }
                     		   
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "classType"

    public static class primitiveType_return extends ParserRuleReturnScope {
        public BasicType bs;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primitiveType"
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:159:1: primitiveType returns [BasicType bs] : ( CHAR | BYTE | SHORT | INT | LONG | FLOAT | DOUBLE | BOOLEAN );
    public final JaParser.primitiveType_return primitiveType() throws RecognitionException {
        JaParser.primitiveType_return retval = new JaParser.primitiveType_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CHAR55=null;
        Token BYTE56=null;
        Token SHORT57=null;
        Token INT58=null;
        Token LONG59=null;
        Token FLOAT60=null;
        Token DOUBLE61=null;
        Token BOOLEAN62=null;

        Object CHAR55_tree=null;
        Object BYTE56_tree=null;
        Object SHORT57_tree=null;
        Object INT58_tree=null;
        Object LONG59_tree=null;
        Object FLOAT60_tree=null;
        Object DOUBLE61_tree=null;
        Object BOOLEAN62_tree=null;

        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:160:5: ( CHAR | BYTE | SHORT | INT | LONG | FLOAT | DOUBLE | BOOLEAN )
            int alt19=8;
            switch ( input.LA(1) ) {
            case CHAR:
                {
                alt19=1;
                }
                break;
            case BYTE:
                {
                alt19=2;
                }
                break;
            case SHORT:
                {
                alt19=3;
                }
                break;
            case INT:
                {
                alt19=4;
                }
                break;
            case LONG:
                {
                alt19=5;
                }
                break;
            case FLOAT:
                {
                alt19=6;
                }
                break;
            case DOUBLE:
                {
                alt19=7;
                }
                break;
            case BOOLEAN:
                {
                alt19=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:160:9: CHAR
                    {
                    root_0 = (Object)adaptor.nil();

                    CHAR55=(Token)match(input,CHAR,FOLLOW_CHAR_in_primitiveType1056); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CHAR55_tree = (Object)adaptor.create(CHAR55);
                    adaptor.addChild(root_0, CHAR55_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.bs = BasicType.CHAR;    
                    }

                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:161:9: BYTE
                    {
                    root_0 = (Object)adaptor.nil();

                    BYTE56=(Token)match(input,BYTE,FOLLOW_BYTE_in_primitiveType1071); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BYTE56_tree = (Object)adaptor.create(BYTE56);
                    adaptor.addChild(root_0, BYTE56_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.bs = BasicType.BYTE;    
                    }

                    }
                    break;
                case 3 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:162:9: SHORT
                    {
                    root_0 = (Object)adaptor.nil();

                    SHORT57=(Token)match(input,SHORT,FOLLOW_SHORT_in_primitiveType1086); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SHORT57_tree = (Object)adaptor.create(SHORT57);
                    adaptor.addChild(root_0, SHORT57_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.bs = BasicType.SHORT;   
                    }

                    }
                    break;
                case 4 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:163:9: INT
                    {
                    root_0 = (Object)adaptor.nil();

                    INT58=(Token)match(input,INT,FOLLOW_INT_in_primitiveType1100); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT58_tree = (Object)adaptor.create(INT58);
                    adaptor.addChild(root_0, INT58_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.bs = BasicType.INT;     
                    }

                    }
                    break;
                case 5 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:164:9: LONG
                    {
                    root_0 = (Object)adaptor.nil();

                    LONG59=(Token)match(input,LONG,FOLLOW_LONG_in_primitiveType1116); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LONG59_tree = (Object)adaptor.create(LONG59);
                    adaptor.addChild(root_0, LONG59_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.bs = BasicType.LONG;    
                    }

                    }
                    break;
                case 6 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:165:9: FLOAT
                    {
                    root_0 = (Object)adaptor.nil();

                    FLOAT60=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_primitiveType1131); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FLOAT60_tree = (Object)adaptor.create(FLOAT60);
                    adaptor.addChild(root_0, FLOAT60_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.bs = BasicType.FLOAT;   
                    }

                    }
                    break;
                case 7 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:166:9: DOUBLE
                    {
                    root_0 = (Object)adaptor.nil();

                    DOUBLE61=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_primitiveType1145); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOUBLE61_tree = (Object)adaptor.create(DOUBLE61);
                    adaptor.addChild(root_0, DOUBLE61_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.bs = BasicType.DOUBLE;  
                    }

                    }
                    break;
                case 8 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:167:9: BOOLEAN
                    {
                    root_0 = (Object)adaptor.nil();

                    BOOLEAN62=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_primitiveType1158); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BOOLEAN62_tree = (Object)adaptor.create(BOOLEAN62);
                    adaptor.addChild(root_0, BOOLEAN62_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.bs = BasicType.BOOLEAN; 
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "primitiveType"

    public static class formalParameters_return extends ParserRuleReturnScope {
        public ArrayList<Type> args;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formalParameters"
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:170:1: formalParameters returns [ArrayList<Type> args] : '(' ( formalParameterDecls[args] )? ')' -> {$formalParameterDecls.tree != null}? ^( FPARMS formalParameterDecls ) ->;
    public final JaParser.formalParameters_return formalParameters() throws RecognitionException {
        JaParser.formalParameters_return retval = new JaParser.formalParameters_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal63=null;
        Token char_literal65=null;
        JaParser.formalParameterDecls_return formalParameterDecls64 = null;


        Object char_literal63_tree=null;
        Object char_literal65_tree=null;
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleSubtreeStream stream_formalParameterDecls=new RewriteRuleSubtreeStream(adaptor,"rule formalParameterDecls");

        	ArrayList<Type> args = new ArrayList<Type>();

        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:174:5: ( '(' ( formalParameterDecls[args] )? ')' -> {$formalParameterDecls.tree != null}? ^( FPARMS formalParameterDecls ) ->)
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:174:9: '(' ( formalParameterDecls[args] )? ')'
            {
            char_literal63=(Token)match(input,92,FOLLOW_92_in_formalParameters1192); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_92.add(char_literal63);

            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:174:13: ( formalParameterDecls[args] )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==IDENTIFIER||(LA20_0>=CHAR && LA20_0<=BOOLEAN)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:174:13: formalParameterDecls[args]
                    {
                    pushFollow(FOLLOW_formalParameterDecls_in_formalParameters1194);
                    formalParameterDecls64=formalParameterDecls(args);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formalParameterDecls.add(formalParameterDecls64.getTree());

                    }
                    break;

            }

            char_literal65=(Token)match(input,93,FOLLOW_93_in_formalParameters1198); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_93.add(char_literal65);

            if ( state.backtracking==0 ) {
              retval.args = args;
            }


            // AST REWRITE
            // elements: formalParameterDecls
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 174:61: -> {$formalParameterDecls.tree != null}? ^( FPARMS formalParameterDecls )
            if ((formalParameterDecls64!=null?((Object)formalParameterDecls64.tree):null) != null) {
                // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:174:102: ^( FPARMS formalParameterDecls )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FPARMS, "FPARMS"), root_1);

                adaptor.addChild(root_1, stream_formalParameterDecls.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 175:16: ->
            {
                root_0 = null;
            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "formalParameters"

    public static class formalParameterDecls_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formalParameterDecls"
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:178:1: formalParameterDecls[ArrayList<Type> args] : type variableDeclaratorId[(CommonTree)$type.tree] ( ',' formalParameterDecls[args] )? -> ^( FPARM variableDeclaratorId ) ( formalParameterDecls )? ;
    public final JaParser.formalParameterDecls_return formalParameterDecls(ArrayList<Type> args) throws RecognitionException {
        JaParser.formalParameterDecls_return retval = new JaParser.formalParameterDecls_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal68=null;
        JaParser.type_return type66 = null;

        JaParser.variableDeclaratorId_return variableDeclaratorId67 = null;

        JaParser.formalParameterDecls_return formalParameterDecls69 = null;


        Object char_literal68_tree=null;
        RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
        RewriteRuleSubtreeStream stream_variableDeclaratorId=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaratorId");
        RewriteRuleSubtreeStream stream_formalParameterDecls=new RewriteRuleSubtreeStream(adaptor,"rule formalParameterDecls");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:179:5: ( type variableDeclaratorId[(CommonTree)$type.tree] ( ',' formalParameterDecls[args] )? -> ^( FPARM variableDeclaratorId ) ( formalParameterDecls )? )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:179:7: type variableDeclaratorId[(CommonTree)$type.tree] ( ',' formalParameterDecls[args] )?
            {
            pushFollow(FOLLOW_type_in_formalParameterDecls1250);
            type66=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type66.getTree());
            pushFollow(FOLLOW_variableDeclaratorId_in_formalParameterDecls1252);
            variableDeclaratorId67=variableDeclaratorId((CommonTree)(type66!=null?((Object)type66.tree):null));

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variableDeclaratorId.add(variableDeclaratorId67.getTree());
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:179:57: ( ',' formalParameterDecls[args] )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==89) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:179:58: ',' formalParameterDecls[args]
                    {
                    char_literal68=(Token)match(input,89,FOLLOW_89_in_formalParameterDecls1256); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_89.add(char_literal68);

                    pushFollow(FOLLOW_formalParameterDecls_in_formalParameterDecls1258);
                    formalParameterDecls69=formalParameterDecls(args);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formalParameterDecls.add(formalParameterDecls69.getTree());

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               args.add(ParserHelper.createArrayType((type66!=null?type66.t:null), (variableDeclaratorId67!=null?variableDeclaratorId67.arrayDim:0))); 
            }


            // AST REWRITE
            // elements: formalParameterDecls, variableDeclaratorId
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 181:6: -> ^( FPARM variableDeclaratorId ) ( formalParameterDecls )?
            {
                // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:181:9: ^( FPARM variableDeclaratorId )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FPARM, "FPARM"), root_1);

                adaptor.addChild(root_1, stream_variableDeclaratorId.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:181:39: ( formalParameterDecls )?
                if ( stream_formalParameterDecls.hasNext() ) {
                    adaptor.addChild(root_0, stream_formalParameterDecls.nextTree());

                }
                stream_formalParameterDecls.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "formalParameterDecls"

    public static class methodBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "methodBody"
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:186:1: methodBody : block -> ^( MBODY ( block )? ) ;
    public final JaParser.methodBody_return methodBody() throws RecognitionException {
        JaParser.methodBody_return retval = new JaParser.methodBody_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.block_return block70 = null;


        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:187:5: ( block -> ^( MBODY ( block )? ) )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:187:9: block
            {
            pushFollow(FOLLOW_block_in_methodBody1315);
            block70=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block70.getTree());


            // AST REWRITE
            // elements: block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 187:15: -> ^( MBODY ( block )? )
            {
                // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:187:18: ^( MBODY ( block )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MBODY, "MBODY"), root_1);

                // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:187:26: ( block )?
                if ( stream_block.hasNext() ) {
                    adaptor.addChild(root_1, stream_block.nextTree());

                }
                stream_block.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "methodBody"

    public static class constructorBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constructorBody"
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:190:1: constructorBody : '{' ( explicitConstructorInvocation )? ( blockStatement )* '}' -> ^( CBODY ( explicitConstructorInvocation )? ( blockStatement )* ) ;
    public final JaParser.constructorBody_return constructorBody() throws RecognitionException {
        JaParser.constructorBody_return retval = new JaParser.constructorBody_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal71=null;
        Token char_literal74=null;
        JaParser.explicitConstructorInvocation_return explicitConstructorInvocation72 = null;

        JaParser.blockStatement_return blockStatement73 = null;


        Object char_literal71_tree=null;
        Object char_literal74_tree=null;
        RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
        RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");
        RewriteRuleSubtreeStream stream_explicitConstructorInvocation=new RewriteRuleSubtreeStream(adaptor,"rule explicitConstructorInvocation");
        RewriteRuleSubtreeStream stream_blockStatement=new RewriteRuleSubtreeStream(adaptor,"rule blockStatement");
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:191:5: ( '{' ( explicitConstructorInvocation )? ( blockStatement )* '}' -> ^( CBODY ( explicitConstructorInvocation )? ( blockStatement )* ) )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:191:10: '{' ( explicitConstructorInvocation )? ( blockStatement )* '}'
            {
            char_literal71=(Token)match(input,87,FOLLOW_87_in_constructorBody1345); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_87.add(char_literal71);

            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:191:14: ( explicitConstructorInvocation )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==THIS) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==92) ) {
                    alt22=1;
                }
            }
            else if ( (LA22_0==SUPER) ) {
                int LA22_2 = input.LA(2);

                if ( (LA22_2==92) ) {
                    alt22=1;
                }
            }
            switch (alt22) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:191:14: explicitConstructorInvocation
                    {
                    pushFollow(FOLLOW_explicitConstructorInvocation_in_constructorBody1347);
                    explicitConstructorInvocation72=explicitConstructorInvocation();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_explicitConstructorInvocation.add(explicitConstructorInvocation72.getTree());

                    }
                    break;

            }

            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:191:45: ( blockStatement )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==IDENTIFIER||LA23_0==VOID||(LA23_0>=CHAR && LA23_0<=RETURN)||LA23_0==NEW||(LA23_0>=PLUS && LA23_0<=MINUS)||(LA23_0>=86 && LA23_0<=87)||LA23_0==92||(LA23_0>=103 && LA23_0<=105)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:191:45: blockStatement
            	    {
            	    pushFollow(FOLLOW_blockStatement_in_constructorBody1350);
            	    blockStatement73=blockStatement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_blockStatement.add(blockStatement73.getTree());

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            char_literal74=(Token)match(input,88,FOLLOW_88_in_constructorBody1353); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_88.add(char_literal74);



            // AST REWRITE
            // elements: blockStatement, explicitConstructorInvocation
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 191:65: -> ^( CBODY ( explicitConstructorInvocation )? ( blockStatement )* )
            {
                // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:191:68: ^( CBODY ( explicitConstructorInvocation )? ( blockStatement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CBODY, "CBODY"), root_1);

                // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:191:76: ( explicitConstructorInvocation )?
                if ( stream_explicitConstructorInvocation.hasNext() ) {
                    adaptor.addChild(root_1, stream_explicitConstructorInvocation.nextTree());

                }
                stream_explicitConstructorInvocation.reset();
                // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:191:107: ( blockStatement )*
                while ( stream_blockStatement.hasNext() ) {
                    adaptor.addChild(root_1, stream_blockStatement.nextTree());

                }
                stream_blockStatement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "constructorBody"

    public static class explicitConstructorInvocation_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "explicitConstructorInvocation"
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:194:1: explicitConstructorInvocation : ( ( THIS -> THIS ) | ( SUPER -> SUPER ) ) arguments ';' -> ^( CONSTRCALL $explicitConstructorInvocation ( arguments )? ) ;
    public final JaParser.explicitConstructorInvocation_return explicitConstructorInvocation() throws RecognitionException {
        JaParser.explicitConstructorInvocation_return retval = new JaParser.explicitConstructorInvocation_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token THIS75=null;
        Token SUPER76=null;
        Token char_literal78=null;
        JaParser.arguments_return arguments77 = null;


        Object THIS75_tree=null;
        Object SUPER76_tree=null;
        Object char_literal78_tree=null;
        RewriteRuleTokenStream stream_SUPER=new RewriteRuleTokenStream(adaptor,"token SUPER");
        RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
        RewriteRuleTokenStream stream_THIS=new RewriteRuleTokenStream(adaptor,"token THIS");
        RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:195:5: ( ( ( THIS -> THIS ) | ( SUPER -> SUPER ) ) arguments ';' -> ^( CONSTRCALL $explicitConstructorInvocation ( arguments )? ) )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:195:9: ( ( THIS -> THIS ) | ( SUPER -> SUPER ) ) arguments ';'
            {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:195:9: ( ( THIS -> THIS ) | ( SUPER -> SUPER ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==THIS) ) {
                alt24=1;
            }
            else if ( (LA24_0==SUPER) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:195:10: ( THIS -> THIS )
                    {
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:195:10: ( THIS -> THIS )
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:195:11: THIS
                    {
                    THIS75=(Token)match(input,THIS,FOLLOW_THIS_in_explicitConstructorInvocation1386); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIS.add(THIS75);



                    // AST REWRITE
                    // elements: THIS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 195:16: -> THIS
                    {
                        adaptor.addChild(root_0, stream_THIS.nextNode());

                    }

                    retval.tree = root_0;}
                    }


                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:195:27: ( SUPER -> SUPER )
                    {
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:195:27: ( SUPER -> SUPER )
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:195:28: SUPER
                    {
                    SUPER76=(Token)match(input,SUPER,FOLLOW_SUPER_in_explicitConstructorInvocation1396); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SUPER.add(SUPER76);



                    // AST REWRITE
                    // elements: SUPER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 195:34: -> SUPER
                    {
                        adaptor.addChild(root_0, stream_SUPER.nextNode());

                    }

                    retval.tree = root_0;}
                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_arguments_in_explicitConstructorInvocation1404);
            arguments77=arguments();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_arguments.add(arguments77.getTree());
            char_literal78=(Token)match(input,86,FOLLOW_86_in_explicitConstructorInvocation1406); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_86.add(char_literal78);



            // AST REWRITE
            // elements: explicitConstructorInvocation, arguments
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 195:59: -> ^( CONSTRCALL $explicitConstructorInvocation ( arguments )? )
            {
                // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:195:62: ^( CONSTRCALL $explicitConstructorInvocation ( arguments )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONSTRCALL, "CONSTRCALL"), root_1);

                adaptor.addChild(root_1, stream_retval.nextTree());
                // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:195:106: ( arguments )?
                if ( stream_arguments.hasNext() ) {
                    adaptor.addChild(root_1, stream_arguments.nextTree());

                }
                stream_arguments.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "explicitConstructorInvocation"

    public static class literal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "literal"
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:199:1: literal : ( INTLITERAL | LONGLITERAL | FLOATLITERAL | DOUBLELITERAL | CHARLITERAL | STRINGLITERAL | BOOLEANLITERAL | NULLLITERAL );
    public final JaParser.literal_return literal() throws RecognitionException {
        JaParser.literal_return retval = new JaParser.literal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set79=null;

        Object set79_tree=null;

        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:200:5: ( INTLITERAL | LONGLITERAL | FLOATLITERAL | DOUBLELITERAL | CHARLITERAL | STRINGLITERAL | BOOLEANLITERAL | NULLLITERAL )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:
            {
            root_0 = (Object)adaptor.nil();

            set79=(Token)input.LT(1);
            if ( (input.LA(1)>=INTLITERAL && input.LA(1)<=NULLLITERAL) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set79));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "literal"

    public static class block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "block"
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:212:1: block : '{' ( blockStatement )* '}' ;
    public final JaParser.block_return block() throws RecognitionException {
        JaParser.block_return retval = new JaParser.block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal80=null;
        Token char_literal82=null;
        JaParser.blockStatement_return blockStatement81 = null;


        Object char_literal80_tree=null;
        Object char_literal82_tree=null;

        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:213:5: ( '{' ( blockStatement )* '}' )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:213:9: '{' ( blockStatement )* '}'
            {
            root_0 = (Object)adaptor.nil();

            char_literal80=(Token)match(input,87,FOLLOW_87_in_block1530); if (state.failed) return retval;
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:213:14: ( blockStatement )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==IDENTIFIER||LA25_0==VOID||(LA25_0>=CHAR && LA25_0<=RETURN)||LA25_0==NEW||(LA25_0>=PLUS && LA25_0<=MINUS)||(LA25_0>=86 && LA25_0<=87)||LA25_0==92||(LA25_0>=103 && LA25_0<=105)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:213:14: blockStatement
            	    {
            	    pushFollow(FOLLOW_blockStatement_in_block1533);
            	    blockStatement81=blockStatement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, blockStatement81.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            char_literal82=(Token)match(input,88,FOLLOW_88_in_block1536); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "block"

    public static class blockStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "blockStatement"
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:216:1: blockStatement : ( localVariableDeclarationStatement | statement );
    public final JaParser.blockStatement_return blockStatement() throws RecognitionException {
        JaParser.blockStatement_return retval = new JaParser.blockStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.localVariableDeclarationStatement_return localVariableDeclarationStatement83 = null;

        JaParser.statement_return statement84 = null;



        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:217:5: ( localVariableDeclarationStatement | statement )
            int alt26=2;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:217:9: localVariableDeclarationStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_localVariableDeclarationStatement_in_blockStatement1560);
                    localVariableDeclarationStatement83=localVariableDeclarationStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, localVariableDeclarationStatement83.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:218:9: statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_statement_in_blockStatement1570);
                    statement84=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement84.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "blockStatement"

    public static class localVariableDeclarationStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "localVariableDeclarationStatement"
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:221:1: localVariableDeclarationStatement : localVariableDeclaration ';' ;
    public final JaParser.localVariableDeclarationStatement_return localVariableDeclarationStatement() throws RecognitionException {
        JaParser.localVariableDeclarationStatement_return retval = new JaParser.localVariableDeclarationStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal86=null;
        JaParser.localVariableDeclaration_return localVariableDeclaration85 = null;


        Object char_literal86_tree=null;

        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:222:5: ( localVariableDeclaration ';' )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:222:7: localVariableDeclaration ';'
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_localVariableDeclaration_in_localVariableDeclarationStatement1591);
            localVariableDeclaration85=localVariableDeclaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, localVariableDeclaration85.getTree());
            char_literal86=(Token)match(input,86,FOLLOW_86_in_localVariableDeclarationStatement1593); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "localVariableDeclarationStatement"

    public static class localVariableDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "localVariableDeclaration"
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:225:1: localVariableDeclaration : type variableDeclarator[(CommonTree)$type.tree] ( ',' variableDeclarator[(CommonTree)$type.tree] )* -> ( ^( VARDECL variableDeclarator ) )+ ;
    public final JaParser.localVariableDeclaration_return localVariableDeclaration() throws RecognitionException {
        JaParser.localVariableDeclaration_return retval = new JaParser.localVariableDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal89=null;
        JaParser.type_return type87 = null;

        JaParser.variableDeclarator_return variableDeclarator88 = null;

        JaParser.variableDeclarator_return variableDeclarator90 = null;


        Object char_literal89_tree=null;
        RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
        RewriteRuleSubtreeStream stream_variableDeclarator=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclarator");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:226:5: ( type variableDeclarator[(CommonTree)$type.tree] ( ',' variableDeclarator[(CommonTree)$type.tree] )* -> ( ^( VARDECL variableDeclarator ) )+ )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:226:7: type variableDeclarator[(CommonTree)$type.tree] ( ',' variableDeclarator[(CommonTree)$type.tree] )*
            {
            pushFollow(FOLLOW_type_in_localVariableDeclaration1611);
            type87=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type87.getTree());
            pushFollow(FOLLOW_variableDeclarator_in_localVariableDeclaration1613);
            variableDeclarator88=variableDeclarator((CommonTree)(type87!=null?((Object)type87.tree):null));

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variableDeclarator.add(variableDeclarator88.getTree());
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:226:55: ( ',' variableDeclarator[(CommonTree)$type.tree] )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==89) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:226:56: ',' variableDeclarator[(CommonTree)$type.tree]
            	    {
            	    char_literal89=(Token)match(input,89,FOLLOW_89_in_localVariableDeclaration1617); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_89.add(char_literal89);

            	    pushFollow(FOLLOW_variableDeclarator_in_localVariableDeclaration1619);
            	    variableDeclarator90=variableDeclarator((CommonTree)(type87!=null?((Object)type87.tree):null));

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_variableDeclarator.add(variableDeclarator90.getTree());

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);



            // AST REWRITE
            // elements: variableDeclarator
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 227:6: -> ( ^( VARDECL variableDeclarator ) )+
            {
                if ( !(stream_variableDeclarator.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_variableDeclarator.hasNext() ) {
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:227:9: ^( VARDECL variableDeclarator )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARDECL, "VARDECL"), root_1);

                    adaptor.addChild(root_1, stream_variableDeclarator.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_variableDeclarator.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "localVariableDeclaration"

    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:231:1: statement : ( block -> ^( BLOCK ( block )? ) | IF parExpression statement elseStmt -> ^( IF ^( CONDITION parExpression ) ^( THEN statement ) ( elseStmt )? ) | FOR '(' ( forInit )? ';' ( expression )? ';' ( forUpdate )? ')' statement -> ^( FOR ( ^( INIT forInit ) )? ( ^( CONDITION expression ) )? ( ^( UPDATE forUpdate ) )? statement ) | WHILE parExpression statement -> ^( WHILE ^( CONDITION parExpression ) statement ) | DO statement WHILE parExpression ';' -> ^( DOWHILE ^( CONDITION parExpression ) statement ) | RETURN ( expression )? ';' | ';' | statementExpression ';' -> ^( STMT statementExpression ) );
    public final JaParser.statement_return statement() throws RecognitionException {
        JaParser.statement_return retval = new JaParser.statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IF92=null;
        Token FOR96=null;
        Token char_literal97=null;
        Token char_literal99=null;
        Token char_literal101=null;
        Token char_literal103=null;
        Token WHILE105=null;
        Token DO108=null;
        Token WHILE110=null;
        Token char_literal112=null;
        Token RETURN113=null;
        Token char_literal115=null;
        Token char_literal116=null;
        Token char_literal118=null;
        JaParser.block_return block91 = null;

        JaParser.parExpression_return parExpression93 = null;

        JaParser.statement_return statement94 = null;

        JaParser.elseStmt_return elseStmt95 = null;

        JaParser.forInit_return forInit98 = null;

        JaParser.expression_return expression100 = null;

        JaParser.forUpdate_return forUpdate102 = null;

        JaParser.statement_return statement104 = null;

        JaParser.parExpression_return parExpression106 = null;

        JaParser.statement_return statement107 = null;

        JaParser.statement_return statement109 = null;

        JaParser.parExpression_return parExpression111 = null;

        JaParser.expression_return expression114 = null;

        JaParser.statementExpression_return statementExpression117 = null;


        Object IF92_tree=null;
        Object FOR96_tree=null;
        Object char_literal97_tree=null;
        Object char_literal99_tree=null;
        Object char_literal101_tree=null;
        Object char_literal103_tree=null;
        Object WHILE105_tree=null;
        Object DO108_tree=null;
        Object WHILE110_tree=null;
        Object char_literal112_tree=null;
        Object RETURN113_tree=null;
        Object char_literal115_tree=null;
        Object char_literal116_tree=null;
        Object char_literal118_tree=null;
        RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
        RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_parExpression=new RewriteRuleSubtreeStream(adaptor,"rule parExpression");
        RewriteRuleSubtreeStream stream_elseStmt=new RewriteRuleSubtreeStream(adaptor,"rule elseStmt");
        RewriteRuleSubtreeStream stream_statementExpression=new RewriteRuleSubtreeStream(adaptor,"rule statementExpression");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_forInit=new RewriteRuleSubtreeStream(adaptor,"rule forInit");
        RewriteRuleSubtreeStream stream_forUpdate=new RewriteRuleSubtreeStream(adaptor,"rule forUpdate");
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:232:5: ( block -> ^( BLOCK ( block )? ) | IF parExpression statement elseStmt -> ^( IF ^( CONDITION parExpression ) ^( THEN statement ) ( elseStmt )? ) | FOR '(' ( forInit )? ';' ( expression )? ';' ( forUpdate )? ')' statement -> ^( FOR ( ^( INIT forInit ) )? ( ^( CONDITION expression ) )? ( ^( UPDATE forUpdate ) )? statement ) | WHILE parExpression statement -> ^( WHILE ^( CONDITION parExpression ) statement ) | DO statement WHILE parExpression ';' -> ^( DOWHILE ^( CONDITION parExpression ) statement ) | RETURN ( expression )? ';' | ';' | statementExpression ';' -> ^( STMT statementExpression ) )
            int alt32=8;
            switch ( input.LA(1) ) {
            case 87:
                {
                alt32=1;
                }
                break;
            case IF:
                {
                alt32=2;
                }
                break;
            case FOR:
                {
                alt32=3;
                }
                break;
            case WHILE:
                {
                alt32=4;
                }
                break;
            case DO:
                {
                alt32=5;
                }
                break;
            case RETURN:
                {
                alt32=6;
                }
                break;
            case 86:
                {
                alt32=7;
                }
                break;
            case IDENTIFIER:
            case VOID:
            case CHAR:
            case BYTE:
            case SHORT:
            case INT:
            case LONG:
            case FLOAT:
            case DOUBLE:
            case BOOLEAN:
            case THIS:
            case SUPER:
            case INTLITERAL:
            case LONGLITERAL:
            case FLOATLITERAL:
            case DOUBLELITERAL:
            case CHARLITERAL:
            case STRINGLITERAL:
            case BOOLEANLITERAL:
            case NULLLITERAL:
            case NEW:
            case PLUS:
            case MINUS:
            case 92:
            case 103:
            case 104:
            case 105:
                {
                alt32=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:232:9: block
                    {
                    pushFollow(FOLLOW_block_in_statement1660);
                    block91=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block91.getTree());


                    // AST REWRITE
                    // elements: block
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 232:15: -> ^( BLOCK ( block )? )
                    {
                        // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:232:18: ^( BLOCK ( block )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);

                        // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:232:26: ( block )?
                        if ( stream_block.hasNext() ) {
                            adaptor.addChild(root_1, stream_block.nextTree());

                        }
                        stream_block.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:233:9: IF parExpression statement elseStmt
                    {
                    IF92=(Token)match(input,IF,FOLLOW_IF_in_statement1679); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF92);

                    pushFollow(FOLLOW_parExpression_in_statement1681);
                    parExpression93=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression93.getTree());
                    pushFollow(FOLLOW_statement_in_statement1683);
                    statement94=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement94.getTree());
                    pushFollow(FOLLOW_elseStmt_in_statement1685);
                    elseStmt95=elseStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_elseStmt.add(elseStmt95.getTree());


                    // AST REWRITE
                    // elements: parExpression, IF, statement, elseStmt
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 233:45: -> ^( IF ^( CONDITION parExpression ) ^( THEN statement ) ( elseStmt )? )
                    {
                        // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:233:48: ^( IF ^( CONDITION parExpression ) ^( THEN statement ) ( elseStmt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                        // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:233:53: ^( CONDITION parExpression )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONDITION, "CONDITION"), root_2);

                        adaptor.addChild(root_2, stream_parExpression.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:233:80: ^( THEN statement )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(THEN, "THEN"), root_2);

                        adaptor.addChild(root_2, stream_statement.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:233:98: ( elseStmt )?
                        if ( stream_elseStmt.hasNext() ) {
                            adaptor.addChild(root_1, stream_elseStmt.nextTree());

                        }
                        stream_elseStmt.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:234:9: FOR '(' ( forInit )? ';' ( expression )? ';' ( forUpdate )? ')' statement
                    {
                    FOR96=(Token)match(input,FOR,FOLLOW_FOR_in_statement1716); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOR.add(FOR96);

                    char_literal97=(Token)match(input,92,FOLLOW_92_in_statement1718); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_92.add(char_literal97);

                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:234:17: ( forInit )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==IDENTIFIER||LA28_0==VOID||(LA28_0>=CHAR && LA28_0<=NULLLITERAL)||LA28_0==NEW||(LA28_0>=PLUS && LA28_0<=MINUS)||LA28_0==92||(LA28_0>=103 && LA28_0<=105)) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:234:17: forInit
                            {
                            pushFollow(FOLLOW_forInit_in_statement1720);
                            forInit98=forInit();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_forInit.add(forInit98.getTree());

                            }
                            break;

                    }

                    char_literal99=(Token)match(input,86,FOLLOW_86_in_statement1723); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_86.add(char_literal99);

                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:234:30: ( expression )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==IDENTIFIER||LA29_0==VOID||(LA29_0>=CHAR && LA29_0<=NULLLITERAL)||LA29_0==NEW||(LA29_0>=PLUS && LA29_0<=MINUS)||LA29_0==92||(LA29_0>=103 && LA29_0<=105)) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:234:30: expression
                            {
                            pushFollow(FOLLOW_expression_in_statement1725);
                            expression100=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(expression100.getTree());

                            }
                            break;

                    }

                    char_literal101=(Token)match(input,86,FOLLOW_86_in_statement1728); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_86.add(char_literal101);

                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:234:46: ( forUpdate )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==IDENTIFIER||LA30_0==VOID||(LA30_0>=CHAR && LA30_0<=NULLLITERAL)||LA30_0==NEW||(LA30_0>=PLUS && LA30_0<=MINUS)||LA30_0==92||(LA30_0>=103 && LA30_0<=105)) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:234:46: forUpdate
                            {
                            pushFollow(FOLLOW_forUpdate_in_statement1730);
                            forUpdate102=forUpdate();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_forUpdate.add(forUpdate102.getTree());

                            }
                            break;

                    }

                    char_literal103=(Token)match(input,93,FOLLOW_93_in_statement1733); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_93.add(char_literal103);

                    pushFollow(FOLLOW_statement_in_statement1735);
                    statement104=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement104.getTree());


                    // AST REWRITE
                    // elements: statement, forInit, expression, FOR, forUpdate
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 235:7: -> ^( FOR ( ^( INIT forInit ) )? ( ^( CONDITION expression ) )? ( ^( UPDATE forUpdate ) )? statement )
                    {
                        // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:235:10: ^( FOR ( ^( INIT forInit ) )? ( ^( CONDITION expression ) )? ( ^( UPDATE forUpdate ) )? statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_FOR.nextNode(), root_1);

                        // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:235:16: ( ^( INIT forInit ) )?
                        if ( stream_forInit.hasNext() ) {
                            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:235:16: ^( INIT forInit )
                            {
                            Object root_2 = (Object)adaptor.nil();
                            root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(INIT, "INIT"), root_2);

                            adaptor.addChild(root_2, stream_forInit.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_forInit.reset();
                        // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:235:33: ( ^( CONDITION expression ) )?
                        if ( stream_expression.hasNext() ) {
                            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:235:33: ^( CONDITION expression )
                            {
                            Object root_2 = (Object)adaptor.nil();
                            root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONDITION, "CONDITION"), root_2);

                            adaptor.addChild(root_2, stream_expression.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_expression.reset();
                        // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:235:58: ( ^( UPDATE forUpdate ) )?
                        if ( stream_forUpdate.hasNext() ) {
                            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:235:58: ^( UPDATE forUpdate )
                            {
                            Object root_2 = (Object)adaptor.nil();
                            root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(UPDATE, "UPDATE"), root_2);

                            adaptor.addChild(root_2, stream_forUpdate.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_forUpdate.reset();
                        adaptor.addChild(root_1, stream_statement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:236:9: WHILE parExpression statement
                    {
                    WHILE105=(Token)match(input,WHILE,FOLLOW_WHILE_in_statement1786); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE.add(WHILE105);

                    pushFollow(FOLLOW_parExpression_in_statement1788);
                    parExpression106=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression106.getTree());
                    pushFollow(FOLLOW_statement_in_statement1790);
                    statement107=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement107.getTree());


                    // AST REWRITE
                    // elements: parExpression, statement, WHILE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 236:39: -> ^( WHILE ^( CONDITION parExpression ) statement )
                    {
                        // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:236:42: ^( WHILE ^( CONDITION parExpression ) statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_WHILE.nextNode(), root_1);

                        // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:236:50: ^( CONDITION parExpression )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONDITION, "CONDITION"), root_2);

                        adaptor.addChild(root_2, stream_parExpression.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_statement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:237:9: DO statement WHILE parExpression ';'
                    {
                    DO108=(Token)match(input,DO,FOLLOW_DO_in_statement1814); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DO.add(DO108);

                    pushFollow(FOLLOW_statement_in_statement1816);
                    statement109=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement109.getTree());
                    WHILE110=(Token)match(input,WHILE,FOLLOW_WHILE_in_statement1818); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE.add(WHILE110);

                    pushFollow(FOLLOW_parExpression_in_statement1820);
                    parExpression111=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression111.getTree());
                    char_literal112=(Token)match(input,86,FOLLOW_86_in_statement1822); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_86.add(char_literal112);



                    // AST REWRITE
                    // elements: parExpression, statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 237:46: -> ^( DOWHILE ^( CONDITION parExpression ) statement )
                    {
                        // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:237:49: ^( DOWHILE ^( CONDITION parExpression ) statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DOWHILE, "DOWHILE"), root_1);

                        // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:237:59: ^( CONDITION parExpression )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONDITION, "CONDITION"), root_2);

                        adaptor.addChild(root_2, stream_parExpression.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_statement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:238:9: RETURN ( expression )? ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    RETURN113=(Token)match(input,RETURN,FOLLOW_RETURN_in_statement1846); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RETURN113_tree = (Object)adaptor.create(RETURN113);
                    root_0 = (Object)adaptor.becomeRoot(RETURN113_tree, root_0);
                    }
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:238:17: ( expression )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==IDENTIFIER||LA31_0==VOID||(LA31_0>=CHAR && LA31_0<=NULLLITERAL)||LA31_0==NEW||(LA31_0>=PLUS && LA31_0<=MINUS)||LA31_0==92||(LA31_0>=103 && LA31_0<=105)) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:238:17: expression
                            {
                            pushFollow(FOLLOW_expression_in_statement1849);
                            expression114=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression114.getTree());

                            }
                            break;

                    }

                    char_literal115=(Token)match(input,86,FOLLOW_86_in_statement1852); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:239:9: ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal116=(Token)match(input,86,FOLLOW_86_in_statement1863); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:240:9: statementExpression ';'
                    {
                    pushFollow(FOLLOW_statementExpression_in_statement1875);
                    statementExpression117=statementExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementExpression.add(statementExpression117.getTree());
                    char_literal118=(Token)match(input,86,FOLLOW_86_in_statement1877); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_86.add(char_literal118);



                    // AST REWRITE
                    // elements: statementExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 240:33: -> ^( STMT statementExpression )
                    {
                        // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:240:36: ^( STMT statementExpression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(STMT, "STMT"), root_1);

                        adaptor.addChild(root_1, stream_statementExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class elseStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elseStmt"
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:243:1: elseStmt : ( ( ELSE )=> ELSE statement | );
    public final JaParser.elseStmt_return elseStmt() throws RecognitionException {
        JaParser.elseStmt_return retval = new JaParser.elseStmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ELSE119=null;
        JaParser.statement_return statement120 = null;


        Object ELSE119_tree=null;

        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:244:5: ( ( ELSE )=> ELSE statement | )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==ELSE) ) {
                int LA33_1 = input.LA(2);

                if ( (synpred2_Ja()) ) {
                    alt33=1;
                }
                else if ( (true) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA33_0==IDENTIFIER||LA33_0==VOID||(LA33_0>=CHAR && LA33_0<=RETURN)||LA33_0==NEW||(LA33_0>=PLUS && LA33_0<=MINUS)||(LA33_0>=86 && LA33_0<=88)||LA33_0==92||(LA33_0>=103 && LA33_0<=105)) ) {
                alt33=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:244:7: ( ELSE )=> ELSE statement
                    {
                    root_0 = (Object)adaptor.nil();

                    ELSE119=(Token)match(input,ELSE,FOLLOW_ELSE_in_elseStmt1912); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ELSE119_tree = (Object)adaptor.create(ELSE119);
                    root_0 = (Object)adaptor.becomeRoot(ELSE119_tree, root_0);
                    }
                    pushFollow(FOLLOW_statement_in_elseStmt1915);
                    statement120=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement120.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:246:5: 
                    {
                    root_0 = (Object)adaptor.nil();

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "elseStmt"

    public static class forInit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forInit"
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:248:1: forInit : ( localVariableDeclaration | expressionList );
    public final JaParser.forInit_return forInit() throws RecognitionException {
        JaParser.forInit_return retval = new JaParser.forInit_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.localVariableDeclaration_return localVariableDeclaration121 = null;

        JaParser.expressionList_return expressionList122 = null;



        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:249:5: ( localVariableDeclaration | expressionList )
            int alt34=2;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:249:9: localVariableDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_localVariableDeclaration_in_forInit1940);
                    localVariableDeclaration121=localVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, localVariableDeclaration121.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:250:9: expressionList
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expressionList_in_forInit1950);
                    expressionList122=expressionList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList122.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "forInit"

    public static class forUpdate_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forUpdate"
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:253:1: forUpdate : expressionList ;
    public final JaParser.forUpdate_return forUpdate() throws RecognitionException {
        JaParser.forUpdate_return retval = new JaParser.forUpdate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.expressionList_return expressionList123 = null;



        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:254:5: ( expressionList )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:254:9: expressionList
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expressionList_in_forUpdate1969);
            expressionList123=expressionList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList123.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "forUpdate"

    public static class parExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parExpression"
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:257:1: parExpression : '(' expression ')' ;
    public final JaParser.parExpression_return parExpression() throws RecognitionException {
        JaParser.parExpression_return retval = new JaParser.parExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal124=null;
        Token char_literal126=null;
        JaParser.expression_return expression125 = null;


        Object char_literal124_tree=null;
        Object char_literal126_tree=null;

        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:258:5: ( '(' expression ')' )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:258:9: '(' expression ')'
            {
            root_0 = (Object)adaptor.nil();

            char_literal124=(Token)match(input,92,FOLLOW_92_in_parExpression1988); if (state.failed) return retval;
            pushFollow(FOLLOW_expression_in_parExpression1991);
            expression125=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression125.getTree());
            char_literal126=(Token)match(input,93,FOLLOW_93_in_parExpression1993); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "parExpression"

    public static class expressionList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expressionList"
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:261:1: expressionList : expression ( ',' expression )* ;
    public final JaParser.expressionList_return expressionList() throws RecognitionException {
        JaParser.expressionList_return retval = new JaParser.expressionList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal128=null;
        JaParser.expression_return expression127 = null;

        JaParser.expression_return expression129 = null;


        Object char_literal128_tree=null;

        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:262:5: ( expression ( ',' expression )* )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:262:9: expression ( ',' expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expression_in_expressionList2017);
            expression127=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression127.getTree());
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:262:20: ( ',' expression )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==89) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:262:21: ',' expression
            	    {
            	    char_literal128=(Token)match(input,89,FOLLOW_89_in_expressionList2020); if (state.failed) return retval;
            	    pushFollow(FOLLOW_expression_in_expressionList2023);
            	    expression129=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression129.getTree());

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expressionList"

    public static class statementExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statementExpression"
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:265:1: statementExpression : expression ;
    public final JaParser.statementExpression_return statementExpression() throws RecognitionException {
        JaParser.statementExpression_return retval = new JaParser.statementExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.expression_return expression130 = null;



        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:266:5: ( expression )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:266:9: expression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expression_in_statementExpression2044);
            expression130=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression130.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statementExpression"

    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:273:1: expression : orExpression (ap= assignmentOperator expression )? -> {$ap.c == '='}? ^( EQ[$ap.tk, \"=\"] orExpression expression ) -> {$ap.c == '+'}? ^( EQ[$ap.tk, \"=\"] orExpression ^( PLUS[$ap.tk, \"+\"] orExpression expression ) ) -> {$ap.c == '-'}? ^( EQ[$ap.tk, \"=\"] orExpression ^( MINUS[$ap.tk, \"-\"] orExpression expression ) ) -> {$ap.c == '*'}? ^( EQ[$ap.tk, \"=\"] orExpression ^( STAR[$ap.tk, \"*\"] orExpression expression ) ) -> {$ap.c == '/'}? ^( EQ[$ap.tk, \"=\"] orExpression ^( SLASH[$ap.tk, \"/\"] orExpression expression ) ) -> orExpression ;
    public final JaParser.expression_return expression() throws RecognitionException {
        JaParser.expression_return retval = new JaParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.assignmentOperator_return ap = null;

        JaParser.orExpression_return orExpression131 = null;

        JaParser.expression_return expression132 = null;


        RewriteRuleSubtreeStream stream_assignmentOperator=new RewriteRuleSubtreeStream(adaptor,"rule assignmentOperator");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_orExpression=new RewriteRuleSubtreeStream(adaptor,"rule orExpression");
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:274:5: ( orExpression (ap= assignmentOperator expression )? -> {$ap.c == '='}? ^( EQ[$ap.tk, \"=\"] orExpression expression ) -> {$ap.c == '+'}? ^( EQ[$ap.tk, \"=\"] orExpression ^( PLUS[$ap.tk, \"+\"] orExpression expression ) ) -> {$ap.c == '-'}? ^( EQ[$ap.tk, \"=\"] orExpression ^( MINUS[$ap.tk, \"-\"] orExpression expression ) ) -> {$ap.c == '*'}? ^( EQ[$ap.tk, \"=\"] orExpression ^( STAR[$ap.tk, \"*\"] orExpression expression ) ) -> {$ap.c == '/'}? ^( EQ[$ap.tk, \"=\"] orExpression ^( SLASH[$ap.tk, \"/\"] orExpression expression ) ) -> orExpression )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:274:8: orExpression (ap= assignmentOperator expression )?
            {
            pushFollow(FOLLOW_orExpression_in_expression2067);
            orExpression131=orExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_orExpression.add(orExpression131.getTree());
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:274:21: (ap= assignmentOperator expression )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==EQ||(LA36_0>=94 && LA36_0<=97)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:274:23: ap= assignmentOperator expression
                    {
                    pushFollow(FOLLOW_assignmentOperator_in_expression2073);
                    ap=assignmentOperator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_assignmentOperator.add(ap.getTree());
                    pushFollow(FOLLOW_expression_in_expression2075);
                    expression132=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression132.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: orExpression, orExpression, expression, orExpression, orExpression, orExpression, orExpression, expression, orExpression, orExpression, expression, orExpression, expression, orExpression, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 274:58: -> {$ap.c == '='}? ^( EQ[$ap.tk, \"=\"] orExpression expression )
            if ((ap!=null?ap.c:0) == '=') {
                // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:274:77: ^( EQ[$ap.tk, \"=\"] orExpression expression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EQ, (ap!=null?ap.tk:null), "="), root_1);

                adaptor.addChild(root_1, stream_orExpression.nextTree());
                adaptor.addChild(root_1, stream_expression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 275:13: -> {$ap.c == '+'}? ^( EQ[$ap.tk, \"=\"] orExpression ^( PLUS[$ap.tk, \"+\"] orExpression expression ) )
            if ((ap!=null?ap.c:0) == '+') {
                // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:275:32: ^( EQ[$ap.tk, \"=\"] orExpression ^( PLUS[$ap.tk, \"+\"] orExpression expression ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EQ, (ap!=null?ap.tk:null), "="), root_1);

                adaptor.addChild(root_1, stream_orExpression.nextTree());
                // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:275:63: ^( PLUS[$ap.tk, \"+\"] orExpression expression )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(PLUS, (ap!=null?ap.tk:null), "+"), root_2);

                adaptor.addChild(root_2, stream_orExpression.nextTree());
                adaptor.addChild(root_2, stream_expression.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 276:13: -> {$ap.c == '-'}? ^( EQ[$ap.tk, \"=\"] orExpression ^( MINUS[$ap.tk, \"-\"] orExpression expression ) )
            if ((ap!=null?ap.c:0) == '-') {
                // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:276:32: ^( EQ[$ap.tk, \"=\"] orExpression ^( MINUS[$ap.tk, \"-\"] orExpression expression ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EQ, (ap!=null?ap.tk:null), "="), root_1);

                adaptor.addChild(root_1, stream_orExpression.nextTree());
                // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:276:63: ^( MINUS[$ap.tk, \"-\"] orExpression expression )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(MINUS, (ap!=null?ap.tk:null), "-"), root_2);

                adaptor.addChild(root_2, stream_orExpression.nextTree());
                adaptor.addChild(root_2, stream_expression.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 277:13: -> {$ap.c == '*'}? ^( EQ[$ap.tk, \"=\"] orExpression ^( STAR[$ap.tk, \"*\"] orExpression expression ) )
            if ((ap!=null?ap.c:0) == '*') {
                // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:277:32: ^( EQ[$ap.tk, \"=\"] orExpression ^( STAR[$ap.tk, \"*\"] orExpression expression ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EQ, (ap!=null?ap.tk:null), "="), root_1);

                adaptor.addChild(root_1, stream_orExpression.nextTree());
                // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:277:63: ^( STAR[$ap.tk, \"*\"] orExpression expression )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(STAR, (ap!=null?ap.tk:null), "*"), root_2);

                adaptor.addChild(root_2, stream_orExpression.nextTree());
                adaptor.addChild(root_2, stream_expression.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 278:13: -> {$ap.c == '/'}? ^( EQ[$ap.tk, \"=\"] orExpression ^( SLASH[$ap.tk, \"/\"] orExpression expression ) )
            if ((ap!=null?ap.c:0) == '/') {
                // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:278:32: ^( EQ[$ap.tk, \"=\"] orExpression ^( SLASH[$ap.tk, \"/\"] orExpression expression ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EQ, (ap!=null?ap.tk:null), "="), root_1);

                adaptor.addChild(root_1, stream_orExpression.nextTree());
                // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:278:63: ^( SLASH[$ap.tk, \"/\"] orExpression expression )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(SLASH, (ap!=null?ap.tk:null), "/"), root_2);

                adaptor.addChild(root_2, stream_orExpression.nextTree());
                adaptor.addChild(root_2, stream_expression.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 279:13: -> orExpression
            {
                adaptor.addChild(root_0, stream_orExpression.nextTree());

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class assignmentOperator_return extends ParserRuleReturnScope {
        public char c;
        public Token tk;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignmentOperator"
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:282:1: assignmentOperator returns [char c, Token tk] : (t= '=' | t= '+=' | t= '-=' | t= '*=' | t= '/=' );
    public final JaParser.assignmentOperator_return assignmentOperator() throws RecognitionException {
        JaParser.assignmentOperator_return retval = new JaParser.assignmentOperator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token t=null;

        Object t_tree=null;

        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:283:5: (t= '=' | t= '+=' | t= '-=' | t= '*=' | t= '/=' )
            int alt37=5;
            switch ( input.LA(1) ) {
            case EQ:
                {
                alt37=1;
                }
                break;
            case 94:
                {
                alt37=2;
                }
                break;
            case 95:
                {
                alt37=3;
                }
                break;
            case 96:
                {
                alt37=4;
                }
                break;
            case 97:
                {
                alt37=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:283:9: t= '='
                    {
                    root_0 = (Object)adaptor.nil();

                    t=(Token)match(input,EQ,FOLLOW_EQ_in_assignmentOperator2266); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    t_tree = (Object)adaptor.create(t);
                    adaptor.addChild(root_0, t_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.c = '='; retval.tk =t; 
                    }

                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:284:9: t= '+='
                    {
                    root_0 = (Object)adaptor.nil();

                    t=(Token)match(input,94,FOLLOW_94_in_assignmentOperator2281); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    t_tree = (Object)adaptor.create(t);
                    adaptor.addChild(root_0, t_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.c = '+'; retval.tk =t; 
                    }

                    }
                    break;
                case 3 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:285:9: t= '-='
                    {
                    root_0 = (Object)adaptor.nil();

                    t=(Token)match(input,95,FOLLOW_95_in_assignmentOperator2295); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    t_tree = (Object)adaptor.create(t);
                    adaptor.addChild(root_0, t_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.c = '-'; retval.tk =t; 
                    }

                    }
                    break;
                case 4 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:286:9: t= '*='
                    {
                    root_0 = (Object)adaptor.nil();

                    t=(Token)match(input,96,FOLLOW_96_in_assignmentOperator2309); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    t_tree = (Object)adaptor.create(t);
                    adaptor.addChild(root_0, t_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.c = '*'; retval.tk =t; 
                    }

                    }
                    break;
                case 5 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:287:9: t= '/='
                    {
                    root_0 = (Object)adaptor.nil();

                    t=(Token)match(input,97,FOLLOW_97_in_assignmentOperator2323); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    t_tree = (Object)adaptor.create(t);
                    adaptor.addChild(root_0, t_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.c = '/'; retval.tk =t; 
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "assignmentOperator"

    public static class orExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "orExpression"
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:290:1: orExpression : andExpression ( '||' andExpression )* ;
    public final JaParser.orExpression_return orExpression() throws RecognitionException {
        JaParser.orExpression_return retval = new JaParser.orExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal134=null;
        JaParser.andExpression_return andExpression133 = null;

        JaParser.andExpression_return andExpression135 = null;


        Object string_literal134_tree=null;

        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:291:5: ( andExpression ( '||' andExpression )* )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:291:9: andExpression ( '||' andExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_andExpression_in_orExpression2344);
            andExpression133=andExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, andExpression133.getTree());
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:291:23: ( '||' andExpression )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==98) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:291:25: '||' andExpression
            	    {
            	    string_literal134=(Token)match(input,98,FOLLOW_98_in_orExpression2348); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal134_tree = (Object)adaptor.create(string_literal134);
            	    root_0 = (Object)adaptor.becomeRoot(string_literal134_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_andExpression_in_orExpression2351);
            	    andExpression135=andExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, andExpression135.getTree());

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "orExpression"

    public static class andExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "andExpression"
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:294:1: andExpression : equalityExpression ( '&&' equalityExpression )* ;
    public final JaParser.andExpression_return andExpression() throws RecognitionException {
        JaParser.andExpression_return retval = new JaParser.andExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal137=null;
        JaParser.equalityExpression_return equalityExpression136 = null;

        JaParser.equalityExpression_return equalityExpression138 = null;


        Object string_literal137_tree=null;

        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:295:5: ( equalityExpression ( '&&' equalityExpression )* )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:295:9: equalityExpression ( '&&' equalityExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equalityExpression_in_andExpression2373);
            equalityExpression136=equalityExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression136.getTree());
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:295:28: ( '&&' equalityExpression )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==99) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:295:30: '&&' equalityExpression
            	    {
            	    string_literal137=(Token)match(input,99,FOLLOW_99_in_andExpression2377); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal137_tree = (Object)adaptor.create(string_literal137);
            	    root_0 = (Object)adaptor.becomeRoot(string_literal137_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_equalityExpression_in_andExpression2380);
            	    equalityExpression138=equalityExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression138.getTree());

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "andExpression"

    public static class equalityExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "equalityExpression"
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:298:1: equalityExpression : instanceOfExpression ( ( '==' | '!=' ) instanceOfExpression )* ;
    public final JaParser.equalityExpression_return equalityExpression() throws RecognitionException {
        JaParser.equalityExpression_return retval = new JaParser.equalityExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set140=null;
        JaParser.instanceOfExpression_return instanceOfExpression139 = null;

        JaParser.instanceOfExpression_return instanceOfExpression141 = null;


        Object set140_tree=null;

        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:299:5: ( instanceOfExpression ( ( '==' | '!=' ) instanceOfExpression )* )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:299:9: instanceOfExpression ( ( '==' | '!=' ) instanceOfExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_instanceOfExpression_in_equalityExpression2402);
            instanceOfExpression139=instanceOfExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, instanceOfExpression139.getTree());
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:299:30: ( ( '==' | '!=' ) instanceOfExpression )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( ((LA40_0>=100 && LA40_0<=101)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:299:32: ( '==' | '!=' ) instanceOfExpression
            	    {
            	    set140=(Token)input.LT(1);
            	    set140=(Token)input.LT(1);
            	    if ( (input.LA(1)>=100 && input.LA(1)<=101) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set140), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_instanceOfExpression_in_equalityExpression2415);
            	    instanceOfExpression141=instanceOfExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, instanceOfExpression141.getTree());

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "equalityExpression"

    public static class instanceOfExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "instanceOfExpression"
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:302:1: instanceOfExpression : relationalExpression ( INSTANCEOF type )? ;
    public final JaParser.instanceOfExpression_return instanceOfExpression() throws RecognitionException {
        JaParser.instanceOfExpression_return retval = new JaParser.instanceOfExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INSTANCEOF143=null;
        JaParser.relationalExpression_return relationalExpression142 = null;

        JaParser.type_return type144 = null;


        Object INSTANCEOF143_tree=null;

        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:303:5: ( relationalExpression ( INSTANCEOF type )? )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:303:9: relationalExpression ( INSTANCEOF type )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relationalExpression_in_instanceOfExpression2437);
            relationalExpression142=relationalExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression142.getTree());
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:303:30: ( INSTANCEOF type )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==INSTANCEOF) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:303:31: INSTANCEOF type
                    {
                    INSTANCEOF143=(Token)match(input,INSTANCEOF,FOLLOW_INSTANCEOF_in_instanceOfExpression2440); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INSTANCEOF143_tree = (Object)adaptor.create(INSTANCEOF143);
                    root_0 = (Object)adaptor.becomeRoot(INSTANCEOF143_tree, root_0);
                    }
                    pushFollow(FOLLOW_type_in_instanceOfExpression2443);
                    type144=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type144.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "instanceOfExpression"

    public static class relationalExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relationalExpression"
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:306:1: relationalExpression : additiveExpression ( COMPAREOP additiveExpression )* ;
    public final JaParser.relationalExpression_return relationalExpression() throws RecognitionException {
        JaParser.relationalExpression_return retval = new JaParser.relationalExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMPAREOP146=null;
        JaParser.additiveExpression_return additiveExpression145 = null;

        JaParser.additiveExpression_return additiveExpression147 = null;


        Object COMPAREOP146_tree=null;

        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:307:5: ( additiveExpression ( COMPAREOP additiveExpression )* )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:307:9: additiveExpression ( COMPAREOP additiveExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_additiveExpression_in_relationalExpression2464);
            additiveExpression145=additiveExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression145.getTree());
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:307:28: ( COMPAREOP additiveExpression )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==COMPAREOP) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:307:30: COMPAREOP additiveExpression
            	    {
            	    COMPAREOP146=(Token)match(input,COMPAREOP,FOLLOW_COMPAREOP_in_relationalExpression2468); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    COMPAREOP146_tree = (Object)adaptor.create(COMPAREOP146);
            	    root_0 = (Object)adaptor.becomeRoot(COMPAREOP146_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_additiveExpression_in_relationalExpression2471);
            	    additiveExpression147=additiveExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression147.getTree());

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "relationalExpression"

    public static class additiveExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "additiveExpression"
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:310:1: additiveExpression : multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )* ;
    public final JaParser.additiveExpression_return additiveExpression() throws RecognitionException {
        JaParser.additiveExpression_return retval = new JaParser.additiveExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set149=null;
        JaParser.multiplicativeExpression_return multiplicativeExpression148 = null;

        JaParser.multiplicativeExpression_return multiplicativeExpression150 = null;


        Object set149_tree=null;

        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:311:5: ( multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )* )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:311:9: multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression2493);
            multiplicativeExpression148=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression148.getTree());
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:311:34: ( ( '+' | '-' ) multiplicativeExpression )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=PLUS && LA43_0<=MINUS)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:311:36: ( '+' | '-' ) multiplicativeExpression
            	    {
            	    set149=(Token)input.LT(1);
            	    set149=(Token)input.LT(1);
            	    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set149), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression2506);
            	    multiplicativeExpression150=multiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression150.getTree());

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "additiveExpression"

    public static class multiplicativeExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiplicativeExpression"
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:314:1: multiplicativeExpression : unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )* ;
    public final JaParser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        JaParser.multiplicativeExpression_return retval = new JaParser.multiplicativeExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set152=null;
        JaParser.unaryExpression_return unaryExpression151 = null;

        JaParser.unaryExpression_return unaryExpression153 = null;


        Object set152_tree=null;

        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:315:5: ( unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )* )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:315:9: unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression2528);
            unaryExpression151=unaryExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression151.getTree());
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:315:25: ( ( '*' | '/' | '%' ) unaryExpression )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=STAR && LA44_0<=SLASH)||LA44_0==102) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:315:27: ( '*' | '/' | '%' ) unaryExpression
            	    {
            	    set152=(Token)input.LT(1);
            	    set152=(Token)input.LT(1);
            	    if ( (input.LA(1)>=STAR && input.LA(1)<=SLASH)||input.LA(1)==102 ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set152), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression2547);
            	    unaryExpression153=unaryExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression153.getTree());

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "multiplicativeExpression"

    public static class unaryExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unaryExpression"
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:318:1: unaryExpression : (up= '+' unaryExpression -> ^( UNARYPLUS[$up] unaryExpression ) | um= '-' unaryExpression -> ^( UNARYMINUS[$um] unaryExpression ) | pi= '++' unaryExpression -> ^( PREINC[$pi] unaryExpression ) | pd= '--' unaryExpression -> ^( PREDEC[$pd] unaryExpression ) | unaryExpressionNotPlusMinus );
    public final JaParser.unaryExpression_return unaryExpression() throws RecognitionException {
        JaParser.unaryExpression_return retval = new JaParser.unaryExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token up=null;
        Token um=null;
        Token pi=null;
        Token pd=null;
        JaParser.unaryExpression_return unaryExpression154 = null;

        JaParser.unaryExpression_return unaryExpression155 = null;

        JaParser.unaryExpression_return unaryExpression156 = null;

        JaParser.unaryExpression_return unaryExpression157 = null;

        JaParser.unaryExpressionNotPlusMinus_return unaryExpressionNotPlusMinus158 = null;


        Object up_tree=null;
        Object um_tree=null;
        Object pi_tree=null;
        Object pd_tree=null;
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleSubtreeStream stream_unaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule unaryExpression");
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:319:5: (up= '+' unaryExpression -> ^( UNARYPLUS[$up] unaryExpression ) | um= '-' unaryExpression -> ^( UNARYMINUS[$um] unaryExpression ) | pi= '++' unaryExpression -> ^( PREINC[$pi] unaryExpression ) | pd= '--' unaryExpression -> ^( PREDEC[$pd] unaryExpression ) | unaryExpressionNotPlusMinus )
            int alt45=5;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt45=1;
                }
                break;
            case MINUS:
                {
                alt45=2;
                }
                break;
            case 103:
                {
                alt45=3;
                }
                break;
            case 104:
                {
                alt45=4;
                }
                break;
            case IDENTIFIER:
            case VOID:
            case CHAR:
            case BYTE:
            case SHORT:
            case INT:
            case LONG:
            case FLOAT:
            case DOUBLE:
            case BOOLEAN:
            case THIS:
            case SUPER:
            case INTLITERAL:
            case LONGLITERAL:
            case FLOATLITERAL:
            case DOUBLELITERAL:
            case CHARLITERAL:
            case STRINGLITERAL:
            case BOOLEANLITERAL:
            case NULLLITERAL:
            case NEW:
            case 92:
            case 105:
                {
                alt45=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:319:9: up= '+' unaryExpression
                    {
                    up=(Token)match(input,PLUS,FOLLOW_PLUS_in_unaryExpression2575); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUS.add(up);

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression2577);
                    unaryExpression154=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression154.getTree());


                    // AST REWRITE
                    // elements: unaryExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 319:32: -> ^( UNARYPLUS[$up] unaryExpression )
                    {
                        // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:319:35: ^( UNARYPLUS[$up] unaryExpression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(UNARYPLUS, up), root_1);

                        adaptor.addChild(root_1, stream_unaryExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:320:9: um= '-' unaryExpression
                    {
                    um=(Token)match(input,MINUS,FOLLOW_MINUS_in_unaryExpression2600); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(um);

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression2602);
                    unaryExpression155=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression155.getTree());


                    // AST REWRITE
                    // elements: unaryExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 320:32: -> ^( UNARYMINUS[$um] unaryExpression )
                    {
                        // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:320:35: ^( UNARYMINUS[$um] unaryExpression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(UNARYMINUS, um), root_1);

                        adaptor.addChild(root_1, stream_unaryExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:321:9: pi= '++' unaryExpression
                    {
                    pi=(Token)match(input,103,FOLLOW_103_in_unaryExpression2623); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_103.add(pi);

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression2625);
                    unaryExpression156=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression156.getTree());


                    // AST REWRITE
                    // elements: unaryExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 321:33: -> ^( PREINC[$pi] unaryExpression )
                    {
                        // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:321:36: ^( PREINC[$pi] unaryExpression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PREINC, pi), root_1);

                        adaptor.addChild(root_1, stream_unaryExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:322:9: pd= '--' unaryExpression
                    {
                    pd=(Token)match(input,104,FOLLOW_104_in_unaryExpression2646); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_104.add(pd);

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression2648);
                    unaryExpression157=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression157.getTree());


                    // AST REWRITE
                    // elements: unaryExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 322:33: -> ^( PREDEC[$pd] unaryExpression )
                    {
                        // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:322:36: ^( PREDEC[$pd] unaryExpression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PREDEC, pd), root_1);

                        adaptor.addChild(root_1, stream_unaryExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:323:9: unaryExpressionNotPlusMinus
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression2667);
                    unaryExpressionNotPlusMinus158=unaryExpressionNotPlusMinus();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpressionNotPlusMinus158.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "unaryExpression"

    public static class unaryExpressionNotPlusMinus_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unaryExpressionNotPlusMinus"
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:326:1: unaryExpressionNotPlusMinus : ( '!' unaryExpression | ( '(' primitiveType ')' )=>lp= '(' primitiveType ')' unaryExpression -> ^( CAST[$lp, \"CAST\"] primitiveType unaryExpression ) | ( '(' nonPrimitiveType ')' unaryExpressionNotPlusMinus )=>lp= '(' nonPrimitiveType ')' unaryExpressionNotPlusMinus -> ^( CAST[$lp, \"CAST\"] nonPrimitiveType unaryExpressionNotPlusMinus ) | NEW creator | ( primary -> primary ) ( selector[(CommonTree)$unaryExpressionNotPlusMinus.tree] -> selector )* ( '++' -> ^( POSTINC $unaryExpressionNotPlusMinus) | '--' -> ^( POSTDEC $unaryExpressionNotPlusMinus) )? );
    public final JaParser.unaryExpressionNotPlusMinus_return unaryExpressionNotPlusMinus() throws RecognitionException {
        JaParser.unaryExpressionNotPlusMinus_return retval = new JaParser.unaryExpressionNotPlusMinus_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lp=null;
        Token char_literal159=null;
        Token char_literal162=null;
        Token char_literal165=null;
        Token NEW167=null;
        Token string_literal171=null;
        Token string_literal172=null;
        JaParser.unaryExpression_return unaryExpression160 = null;

        JaParser.primitiveType_return primitiveType161 = null;

        JaParser.unaryExpression_return unaryExpression163 = null;

        JaParser.nonPrimitiveType_return nonPrimitiveType164 = null;

        JaParser.unaryExpressionNotPlusMinus_return unaryExpressionNotPlusMinus166 = null;

        JaParser.creator_return creator168 = null;

        JaParser.primary_return primary169 = null;

        JaParser.selector_return selector170 = null;


        Object lp_tree=null;
        Object char_literal159_tree=null;
        Object char_literal162_tree=null;
        Object char_literal165_tree=null;
        Object NEW167_tree=null;
        Object string_literal171_tree=null;
        Object string_literal172_tree=null;
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleSubtreeStream stream_selector=new RewriteRuleSubtreeStream(adaptor,"rule selector");
        RewriteRuleSubtreeStream stream_primitiveType=new RewriteRuleSubtreeStream(adaptor,"rule primitiveType");
        RewriteRuleSubtreeStream stream_unaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule unaryExpression");
        RewriteRuleSubtreeStream stream_primary=new RewriteRuleSubtreeStream(adaptor,"rule primary");
        RewriteRuleSubtreeStream stream_unaryExpressionNotPlusMinus=new RewriteRuleSubtreeStream(adaptor,"rule unaryExpressionNotPlusMinus");
        RewriteRuleSubtreeStream stream_nonPrimitiveType=new RewriteRuleSubtreeStream(adaptor,"rule nonPrimitiveType");
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:327:5: ( '!' unaryExpression | ( '(' primitiveType ')' )=>lp= '(' primitiveType ')' unaryExpression -> ^( CAST[$lp, \"CAST\"] primitiveType unaryExpression ) | ( '(' nonPrimitiveType ')' unaryExpressionNotPlusMinus )=>lp= '(' nonPrimitiveType ')' unaryExpressionNotPlusMinus -> ^( CAST[$lp, \"CAST\"] nonPrimitiveType unaryExpressionNotPlusMinus ) | NEW creator | ( primary -> primary ) ( selector[(CommonTree)$unaryExpressionNotPlusMinus.tree] -> selector )* ( '++' -> ^( POSTINC $unaryExpressionNotPlusMinus) | '--' -> ^( POSTDEC $unaryExpressionNotPlusMinus) )? )
            int alt48=5;
            alt48 = dfa48.predict(input);
            switch (alt48) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:327:7: '!' unaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal159=(Token)match(input,105,FOLLOW_105_in_unaryExpressionNotPlusMinus2684); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal159_tree = (Object)adaptor.create(char_literal159);
                    root_0 = (Object)adaptor.becomeRoot(char_literal159_tree, root_0);
                    }
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus2687);
                    unaryExpression160=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression160.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:328:9: ( '(' primitiveType ')' )=>lp= '(' primitiveType ')' unaryExpression
                    {
                    lp=(Token)match(input,92,FOLLOW_92_in_unaryExpressionNotPlusMinus2710); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_92.add(lp);

                    pushFollow(FOLLOW_primitiveType_in_unaryExpressionNotPlusMinus2712);
                    primitiveType161=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primitiveType.add(primitiveType161.getTree());
                    char_literal162=(Token)match(input,93,FOLLOW_93_in_unaryExpressionNotPlusMinus2714); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_93.add(char_literal162);

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus2716);
                    unaryExpression163=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression163.getTree());


                    // AST REWRITE
                    // elements: unaryExpression, primitiveType
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 329:7: -> ^( CAST[$lp, \"CAST\"] primitiveType unaryExpression )
                    {
                        // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:329:10: ^( CAST[$lp, \"CAST\"] primitiveType unaryExpression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CAST, lp, "CAST"), root_1);

                        adaptor.addChild(root_1, stream_primitiveType.nextTree());
                        adaptor.addChild(root_1, stream_unaryExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:331:9: ( '(' nonPrimitiveType ')' unaryExpressionNotPlusMinus )=>lp= '(' nonPrimitiveType ')' unaryExpressionNotPlusMinus
                    {
                    lp=(Token)match(input,92,FOLLOW_92_in_unaryExpressionNotPlusMinus2763); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_92.add(lp);

                    pushFollow(FOLLOW_nonPrimitiveType_in_unaryExpressionNotPlusMinus2765);
                    nonPrimitiveType164=nonPrimitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_nonPrimitiveType.add(nonPrimitiveType164.getTree());
                    char_literal165=(Token)match(input,93,FOLLOW_93_in_unaryExpressionNotPlusMinus2768); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_93.add(char_literal165);

                    pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpressionNotPlusMinus2770);
                    unaryExpressionNotPlusMinus166=unaryExpressionNotPlusMinus();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpressionNotPlusMinus.add(unaryExpressionNotPlusMinus166.getTree());


                    // AST REWRITE
                    // elements: unaryExpressionNotPlusMinus, nonPrimitiveType
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 332:7: -> ^( CAST[$lp, \"CAST\"] nonPrimitiveType unaryExpressionNotPlusMinus )
                    {
                        // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:332:10: ^( CAST[$lp, \"CAST\"] nonPrimitiveType unaryExpressionNotPlusMinus )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CAST, lp, "CAST"), root_1);

                        adaptor.addChild(root_1, stream_nonPrimitiveType.nextTree());
                        adaptor.addChild(root_1, stream_unaryExpressionNotPlusMinus.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:333:9: NEW creator
                    {
                    root_0 = (Object)adaptor.nil();

                    NEW167=(Token)match(input,NEW,FOLLOW_NEW_in_unaryExpressionNotPlusMinus2797); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NEW167_tree = (Object)adaptor.create(NEW167);
                    root_0 = (Object)adaptor.becomeRoot(NEW167_tree, root_0);
                    }
                    pushFollow(FOLLOW_creator_in_unaryExpressionNotPlusMinus2800);
                    creator168=creator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, creator168.getTree());

                    }
                    break;
                case 5 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:334:9: ( primary -> primary ) ( selector[(CommonTree)$unaryExpressionNotPlusMinus.tree] -> selector )* ( '++' -> ^( POSTINC $unaryExpressionNotPlusMinus) | '--' -> ^( POSTDEC $unaryExpressionNotPlusMinus) )?
                    {
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:334:9: ( primary -> primary )
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:334:10: primary
                    {
                    pushFollow(FOLLOW_primary_in_unaryExpressionNotPlusMinus2811);
                    primary169=primary();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primary.add(primary169.getTree());


                    // AST REWRITE
                    // elements: primary
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 334:18: -> primary
                    {
                        adaptor.addChild(root_0, stream_primary.nextTree());

                    }

                    retval.tree = root_0;}
                    }

                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:334:31: ( selector[(CommonTree)$unaryExpressionNotPlusMinus.tree] -> selector )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==90||LA46_0==106) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:334:32: selector[(CommonTree)$unaryExpressionNotPlusMinus.tree]
                    	    {
                    	    pushFollow(FOLLOW_selector_in_unaryExpressionNotPlusMinus2820);
                    	    selector170=selector((CommonTree)((Object)retval.tree));

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_selector.add(selector170.getTree());


                    	    // AST REWRITE
                    	    // elements: selector
                    	    // token labels: 
                    	    // rule labels: retval
                    	    // token list labels: 
                    	    // rule list labels: 
                    	    // wildcard labels: 
                    	    if ( state.backtracking==0 ) {
                    	    retval.tree = root_0;
                    	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    	    root_0 = (Object)adaptor.nil();
                    	    // 334:88: -> selector
                    	    {
                    	        adaptor.addChild(root_0, stream_selector.nextTree());

                    	    }

                    	    retval.tree = root_0;}
                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);

                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:335:7: ( '++' -> ^( POSTINC $unaryExpressionNotPlusMinus) | '--' -> ^( POSTDEC $unaryExpressionNotPlusMinus) )?
                    int alt47=3;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==103) ) {
                        alt47=1;
                    }
                    else if ( (LA47_0==104) ) {
                        alt47=2;
                    }
                    switch (alt47) {
                        case 1 :
                            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:335:8: '++'
                            {
                            string_literal171=(Token)match(input,103,FOLLOW_103_in_unaryExpressionNotPlusMinus2837); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_103.add(string_literal171);



                            // AST REWRITE
                            // elements: unaryExpressionNotPlusMinus
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 335:13: -> ^( POSTINC $unaryExpressionNotPlusMinus)
                            {
                                // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:335:16: ^( POSTINC $unaryExpressionNotPlusMinus)
                                {
                                Object root_1 = (Object)adaptor.nil();
                                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(POSTINC, "POSTINC"), root_1);

                                adaptor.addChild(root_1, stream_retval.nextTree());

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;}
                            }
                            break;
                        case 2 :
                            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:335:58: '--'
                            {
                            string_literal172=(Token)match(input,104,FOLLOW_104_in_unaryExpressionNotPlusMinus2850); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_104.add(string_literal172);



                            // AST REWRITE
                            // elements: unaryExpressionNotPlusMinus
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 335:63: -> ^( POSTDEC $unaryExpressionNotPlusMinus)
                            {
                                // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:335:66: ^( POSTDEC $unaryExpressionNotPlusMinus)
                                {
                                Object root_1 = (Object)adaptor.nil();
                                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(POSTDEC, "POSTDEC"), root_1);

                                adaptor.addChild(root_1, stream_retval.nextTree());

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;}
                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "unaryExpressionNotPlusMinus"

    public static class primary_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primary"
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:339:1: primary : ( parExpression | THIS | SUPER superMemberAccess | literal | IDENTIFIER | ( IDENTIFIER -> IDENTIFIER ) ( '[' ']' -> ^( ARRAYTYPE $primary) )+ ( '.' CLASS -> ^( DOTCLASS $primary) ) | IDENTIFIER arguments -> ^( METHODCALL THIS IDENTIFIER ( arguments )? ) | IDENTIFIER '.' CLASS -> ^( DOTCLASS IDENTIFIER ) | ( primitiveType -> primitiveType ) ( '[' ']' -> ^( ARRAYTYPE $primary) )* ( '.' CLASS -> ^( DOTCLASS $primary) ) | VOID '.' CLASS -> ^( DOTCLASS VOID ) );
    public final JaParser.primary_return primary() throws RecognitionException {
        JaParser.primary_return retval = new JaParser.primary_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token THIS174=null;
        Token SUPER175=null;
        Token IDENTIFIER178=null;
        Token IDENTIFIER179=null;
        Token char_literal180=null;
        Token char_literal181=null;
        Token char_literal182=null;
        Token CLASS183=null;
        Token IDENTIFIER184=null;
        Token IDENTIFIER186=null;
        Token char_literal187=null;
        Token CLASS188=null;
        Token char_literal190=null;
        Token char_literal191=null;
        Token char_literal192=null;
        Token CLASS193=null;
        Token VOID194=null;
        Token char_literal195=null;
        Token CLASS196=null;
        JaParser.parExpression_return parExpression173 = null;

        JaParser.superMemberAccess_return superMemberAccess176 = null;

        JaParser.literal_return literal177 = null;

        JaParser.arguments_return arguments185 = null;

        JaParser.primitiveType_return primitiveType189 = null;


        Object THIS174_tree=null;
        Object SUPER175_tree=null;
        Object IDENTIFIER178_tree=null;
        Object IDENTIFIER179_tree=null;
        Object char_literal180_tree=null;
        Object char_literal181_tree=null;
        Object char_literal182_tree=null;
        Object CLASS183_tree=null;
        Object IDENTIFIER184_tree=null;
        Object IDENTIFIER186_tree=null;
        Object char_literal187_tree=null;
        Object CLASS188_tree=null;
        Object char_literal190_tree=null;
        Object char_literal191_tree=null;
        Object char_literal192_tree=null;
        Object CLASS193_tree=null;
        Object VOID194_tree=null;
        Object char_literal195_tree=null;
        Object CLASS196_tree=null;
        RewriteRuleTokenStream stream_CLASS=new RewriteRuleTokenStream(adaptor,"token CLASS");
        RewriteRuleTokenStream stream_VOID=new RewriteRuleTokenStream(adaptor,"token VOID");
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");
        RewriteRuleSubtreeStream stream_primitiveType=new RewriteRuleSubtreeStream(adaptor,"rule primitiveType");
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:340:5: ( parExpression | THIS | SUPER superMemberAccess | literal | IDENTIFIER | ( IDENTIFIER -> IDENTIFIER ) ( '[' ']' -> ^( ARRAYTYPE $primary) )+ ( '.' CLASS -> ^( DOTCLASS $primary) ) | IDENTIFIER arguments -> ^( METHODCALL THIS IDENTIFIER ( arguments )? ) | IDENTIFIER '.' CLASS -> ^( DOTCLASS IDENTIFIER ) | ( primitiveType -> primitiveType ) ( '[' ']' -> ^( ARRAYTYPE $primary) )* ( '.' CLASS -> ^( DOTCLASS $primary) ) | VOID '.' CLASS -> ^( DOTCLASS VOID ) )
            int alt51=10;
            alt51 = dfa51.predict(input);
            switch (alt51) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:340:9: parExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_parExpression_in_primary2887);
                    parExpression173=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parExpression173.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:341:9: THIS
                    {
                    root_0 = (Object)adaptor.nil();

                    THIS174=(Token)match(input,THIS,FOLLOW_THIS_in_primary2897); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    THIS174_tree = (Object)adaptor.create(THIS174);
                    adaptor.addChild(root_0, THIS174_tree);
                    }

                    }
                    break;
                case 3 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:342:9: SUPER superMemberAccess
                    {
                    root_0 = (Object)adaptor.nil();

                    SUPER175=(Token)match(input,SUPER,FOLLOW_SUPER_in_primary2908); if (state.failed) return retval;
                    pushFollow(FOLLOW_superMemberAccess_in_primary2911);
                    superMemberAccess176=superMemberAccess();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, superMemberAccess176.getTree());

                    }
                    break;
                case 4 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:343:9: literal
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_literal_in_primary2921);
                    literal177=literal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, literal177.getTree());

                    }
                    break;
                case 5 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:344:9: IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();

                    IDENTIFIER178=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary2931); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER178_tree = (Object)adaptor.create(IDENTIFIER178);
                    adaptor.addChild(root_0, IDENTIFIER178_tree);
                    }

                    }
                    break;
                case 6 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:345:9: ( IDENTIFIER -> IDENTIFIER ) ( '[' ']' -> ^( ARRAYTYPE $primary) )+ ( '.' CLASS -> ^( DOTCLASS $primary) )
                    {
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:345:9: ( IDENTIFIER -> IDENTIFIER )
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:345:10: IDENTIFIER
                    {
                    IDENTIFIER179=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary2942); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER179);



                    // AST REWRITE
                    // elements: IDENTIFIER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 345:21: -> IDENTIFIER
                    {
                        adaptor.addChild(root_0, stream_IDENTIFIER.nextNode());

                    }

                    retval.tree = root_0;}
                    }

                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:345:36: ( '[' ']' -> ^( ARRAYTYPE $primary) )+
                    int cnt49=0;
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==90) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:345:37: '[' ']'
                    	    {
                    	    char_literal180=(Token)match(input,90,FOLLOW_90_in_primary2950); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_90.add(char_literal180);

                    	    char_literal181=(Token)match(input,91,FOLLOW_91_in_primary2952); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_91.add(char_literal181);



                    	    // AST REWRITE
                    	    // elements: primary
                    	    // token labels: 
                    	    // rule labels: retval
                    	    // token list labels: 
                    	    // rule list labels: 
                    	    // wildcard labels: 
                    	    if ( state.backtracking==0 ) {
                    	    retval.tree = root_0;
                    	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    	    root_0 = (Object)adaptor.nil();
                    	    // 345:45: -> ^( ARRAYTYPE $primary)
                    	    {
                    	        // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:345:48: ^( ARRAYTYPE $primary)
                    	        {
                    	        Object root_1 = (Object)adaptor.nil();
                    	        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAYTYPE, "ARRAYTYPE"), root_1);

                    	        adaptor.addChild(root_1, stream_retval.nextTree());

                    	        adaptor.addChild(root_0, root_1);
                    	        }

                    	    }

                    	    retval.tree = root_0;}
                    	    }
                    	    break;

                    	default :
                    	    if ( cnt49 >= 1 ) break loop49;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(49, input);
                                throw eee;
                        }
                        cnt49++;
                    } while (true);

                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:345:72: ( '.' CLASS -> ^( DOTCLASS $primary) )
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:345:73: '.' CLASS
                    {
                    char_literal182=(Token)match(input,106,FOLLOW_106_in_primary2966); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_106.add(char_literal182);

                    CLASS183=(Token)match(input,CLASS,FOLLOW_CLASS_in_primary2968); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLASS.add(CLASS183);



                    // AST REWRITE
                    // elements: primary
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 345:83: -> ^( DOTCLASS $primary)
                    {
                        // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:345:86: ^( DOTCLASS $primary)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DOTCLASS, "DOTCLASS"), root_1);

                        adaptor.addChild(root_1, stream_retval.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }


                    }
                    break;
                case 7 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:346:8: IDENTIFIER arguments
                    {
                    IDENTIFIER184=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary2987); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER184);

                    pushFollow(FOLLOW_arguments_in_primary2990);
                    arguments185=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arguments.add(arguments185.getTree());


                    // AST REWRITE
                    // elements: arguments, IDENTIFIER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 346:30: -> ^( METHODCALL THIS IDENTIFIER ( arguments )? )
                    {
                        // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:346:33: ^( METHODCALL THIS IDENTIFIER ( arguments )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(METHODCALL, "METHODCALL"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(THIS, "THIS"));
                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:346:62: ( arguments )?
                        if ( stream_arguments.hasNext() ) {
                            adaptor.addChild(root_1, stream_arguments.nextTree());

                        }
                        stream_arguments.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:347:7: IDENTIFIER '.' CLASS
                    {
                    IDENTIFIER186=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary3011); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER186);

                    char_literal187=(Token)match(input,106,FOLLOW_106_in_primary3013); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_106.add(char_literal187);

                    CLASS188=(Token)match(input,CLASS,FOLLOW_CLASS_in_primary3015); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLASS.add(CLASS188);



                    // AST REWRITE
                    // elements: IDENTIFIER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 347:28: -> ^( DOTCLASS IDENTIFIER )
                    {
                        // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:347:31: ^( DOTCLASS IDENTIFIER )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DOTCLASS, "DOTCLASS"), root_1);

                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 9 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:348:9: ( primitiveType -> primitiveType ) ( '[' ']' -> ^( ARRAYTYPE $primary) )* ( '.' CLASS -> ^( DOTCLASS $primary) )
                    {
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:348:9: ( primitiveType -> primitiveType )
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:348:10: primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_primary3034);
                    primitiveType189=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primitiveType.add(primitiveType189.getTree());


                    // AST REWRITE
                    // elements: primitiveType
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 348:24: -> primitiveType
                    {
                        adaptor.addChild(root_0, stream_primitiveType.nextTree());

                    }

                    retval.tree = root_0;}
                    }

                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:348:42: ( '[' ']' -> ^( ARRAYTYPE $primary) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==90) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:348:43: '[' ']'
                    	    {
                    	    char_literal190=(Token)match(input,90,FOLLOW_90_in_primary3042); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_90.add(char_literal190);

                    	    char_literal191=(Token)match(input,91,FOLLOW_91_in_primary3044); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_91.add(char_literal191);



                    	    // AST REWRITE
                    	    // elements: primary
                    	    // token labels: 
                    	    // rule labels: retval
                    	    // token list labels: 
                    	    // rule list labels: 
                    	    // wildcard labels: 
                    	    if ( state.backtracking==0 ) {
                    	    retval.tree = root_0;
                    	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    	    root_0 = (Object)adaptor.nil();
                    	    // 348:51: -> ^( ARRAYTYPE $primary)
                    	    {
                    	        // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:348:54: ^( ARRAYTYPE $primary)
                    	        {
                    	        Object root_1 = (Object)adaptor.nil();
                    	        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAYTYPE, "ARRAYTYPE"), root_1);

                    	        adaptor.addChild(root_1, stream_retval.nextTree());

                    	        adaptor.addChild(root_0, root_1);
                    	        }

                    	    }

                    	    retval.tree = root_0;}
                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);

                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:348:78: ( '.' CLASS -> ^( DOTCLASS $primary) )
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:348:79: '.' CLASS
                    {
                    char_literal192=(Token)match(input,106,FOLLOW_106_in_primary3058); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_106.add(char_literal192);

                    CLASS193=(Token)match(input,CLASS,FOLLOW_CLASS_in_primary3060); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLASS.add(CLASS193);



                    // AST REWRITE
                    // elements: primary
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 348:89: -> ^( DOTCLASS $primary)
                    {
                        // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:348:92: ^( DOTCLASS $primary)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DOTCLASS, "DOTCLASS"), root_1);

                        adaptor.addChild(root_1, stream_retval.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }


                    }
                    break;
                case 10 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:349:9: VOID '.' CLASS
                    {
                    VOID194=(Token)match(input,VOID,FOLLOW_VOID_in_primary3080); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VOID.add(VOID194);

                    char_literal195=(Token)match(input,106,FOLLOW_106_in_primary3082); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_106.add(char_literal195);

                    CLASS196=(Token)match(input,CLASS,FOLLOW_CLASS_in_primary3084); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLASS.add(CLASS196);



                    // AST REWRITE
                    // elements: VOID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 349:24: -> ^( DOTCLASS VOID )
                    {
                        // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:349:27: ^( DOTCLASS VOID )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DOTCLASS, "DOTCLASS"), root_1);

                        adaptor.addChild(root_1, stream_VOID.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "primary"

    public static class selector_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "selector"
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:352:1: selector[CommonTree primary] : ( '.' IDENTIFIER -> ^( FIELDACCESS IDENTIFIER ) | '.' IDENTIFIER arguments -> ^( METHODCALL IDENTIFIER ( arguments )? ) | lb= '[' expression ']' -> ^( ARRAYACCESS[$lb, \"ARRAYACCESS\"] expression ) );
    public final JaParser.selector_return selector(CommonTree primary) throws RecognitionException {
        JaParser.selector_return retval = new JaParser.selector_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lb=null;
        Token char_literal197=null;
        Token IDENTIFIER198=null;
        Token char_literal199=null;
        Token IDENTIFIER200=null;
        Token char_literal203=null;
        JaParser.arguments_return arguments201 = null;

        JaParser.expression_return expression202 = null;


        Object lb_tree=null;
        Object char_literal197_tree=null;
        Object IDENTIFIER198_tree=null;
        Object char_literal199_tree=null;
        Object IDENTIFIER200_tree=null;
        Object char_literal203_tree=null;
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:353:5: ( '.' IDENTIFIER -> ^( FIELDACCESS IDENTIFIER ) | '.' IDENTIFIER arguments -> ^( METHODCALL IDENTIFIER ( arguments )? ) | lb= '[' expression ']' -> ^( ARRAYACCESS[$lb, \"ARRAYACCESS\"] expression ) )
            int alt52=3;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==106) ) {
                int LA52_1 = input.LA(2);

                if ( (LA52_1==IDENTIFIER) ) {
                    int LA52_3 = input.LA(3);

                    if ( (LA52_3==92) ) {
                        alt52=2;
                    }
                    else if ( (LA52_3==EOF||(LA52_3>=INSTANCEOF && LA52_3<=COMPAREOP)||(LA52_3>=EQ && LA52_3<=SLASH)||LA52_3==86||(LA52_3>=88 && LA52_3<=91)||(LA52_3>=93 && LA52_3<=104)||LA52_3==106) ) {
                        alt52=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 52, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 52, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA52_0==90) ) {
                alt52=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:353:9: '.' IDENTIFIER
                    {
                    char_literal197=(Token)match(input,106,FOLLOW_106_in_selector3117); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_106.add(char_literal197);

                    IDENTIFIER198=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_selector3119); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER198);



                    // AST REWRITE
                    // elements: IDENTIFIER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 353:24: -> ^( FIELDACCESS IDENTIFIER )
                    {
                        // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:353:27: ^( FIELDACCESS IDENTIFIER )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FIELDACCESS, "FIELDACCESS"), root_1);

                        adaptor.addChild(root_1, primary);
                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:354:7: '.' IDENTIFIER arguments
                    {
                    char_literal199=(Token)match(input,106,FOLLOW_106_in_selector3137); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_106.add(char_literal199);

                    IDENTIFIER200=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_selector3139); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER200);

                    pushFollow(FOLLOW_arguments_in_selector3141);
                    arguments201=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arguments.add(arguments201.getTree());


                    // AST REWRITE
                    // elements: IDENTIFIER, arguments
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 354:32: -> ^( METHODCALL IDENTIFIER ( arguments )? )
                    {
                        // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:354:35: ^( METHODCALL IDENTIFIER ( arguments )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(METHODCALL, "METHODCALL"), root_1);

                        adaptor.addChild(root_1, primary);
                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:354:70: ( arguments )?
                        if ( stream_arguments.hasNext() ) {
                            adaptor.addChild(root_1, stream_arguments.nextTree());

                        }
                        stream_arguments.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:357:9: lb= '[' expression ']'
                    {
                    lb=(Token)match(input,90,FOLLOW_90_in_selector3176); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_90.add(lb);

                    pushFollow(FOLLOW_expression_in_selector3178);
                    expression202=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression202.getTree());
                    char_literal203=(Token)match(input,91,FOLLOW_91_in_selector3180); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_91.add(char_literal203);



                    // AST REWRITE
                    // elements: expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 357:30: -> ^( ARRAYACCESS[$lb, \"ARRAYACCESS\"] expression )
                    {
                        // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:357:33: ^( ARRAYACCESS[$lb, \"ARRAYACCESS\"] expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAYACCESS, lb, "ARRAYACCESS"), root_1);

                        adaptor.addChild(root_1, primary);
                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "selector"

    public static class creator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "creator"
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:372:1: creator : createdName ( arrayCreatorRest[(CommonTree)$createdName.tree] -> arrayCreatorRest | classCreatorRest -> createdName ( classCreatorRest )? ) ;
    public final JaParser.creator_return creator() throws RecognitionException {
        JaParser.creator_return retval = new JaParser.creator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.createdName_return createdName204 = null;

        JaParser.arrayCreatorRest_return arrayCreatorRest205 = null;

        JaParser.classCreatorRest_return classCreatorRest206 = null;


        RewriteRuleSubtreeStream stream_createdName=new RewriteRuleSubtreeStream(adaptor,"rule createdName");
        RewriteRuleSubtreeStream stream_classCreatorRest=new RewriteRuleSubtreeStream(adaptor,"rule classCreatorRest");
        RewriteRuleSubtreeStream stream_arrayCreatorRest=new RewriteRuleSubtreeStream(adaptor,"rule arrayCreatorRest");
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:373:5: ( createdName ( arrayCreatorRest[(CommonTree)$createdName.tree] -> arrayCreatorRest | classCreatorRest -> createdName ( classCreatorRest )? ) )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:373:7: createdName ( arrayCreatorRest[(CommonTree)$createdName.tree] -> arrayCreatorRest | classCreatorRest -> createdName ( classCreatorRest )? )
            {
            pushFollow(FOLLOW_createdName_in_creator3210);
            createdName204=createdName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_createdName.add(createdName204.getTree());
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:373:19: ( arrayCreatorRest[(CommonTree)$createdName.tree] -> arrayCreatorRest | classCreatorRest -> createdName ( classCreatorRest )? )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==90) ) {
                alt53=1;
            }
            else if ( (LA53_0==92) ) {
                alt53=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:373:21: arrayCreatorRest[(CommonTree)$createdName.tree]
                    {
                    pushFollow(FOLLOW_arrayCreatorRest_in_creator3214);
                    arrayCreatorRest205=arrayCreatorRest((CommonTree)(createdName204!=null?((Object)createdName204.tree):null));

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arrayCreatorRest.add(arrayCreatorRest205.getTree());


                    // AST REWRITE
                    // elements: arrayCreatorRest
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 373:69: -> arrayCreatorRest
                    {
                        adaptor.addChild(root_0, stream_arrayCreatorRest.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:374:20: classCreatorRest
                    {
                    pushFollow(FOLLOW_classCreatorRest_in_creator3240);
                    classCreatorRest206=classCreatorRest();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_classCreatorRest.add(classCreatorRest206.getTree());


                    // AST REWRITE
                    // elements: classCreatorRest, createdName
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 374:37: -> createdName ( classCreatorRest )?
                    {
                        adaptor.addChild(root_0, stream_createdName.nextTree());
                        // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:374:52: ( classCreatorRest )?
                        if ( stream_classCreatorRest.hasNext() ) {
                            adaptor.addChild(root_0, stream_classCreatorRest.nextTree());

                        }
                        stream_classCreatorRest.reset();

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "creator"

    public static class createdName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "createdName"
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:377:1: createdName : ( classType | primitiveType );
    public final JaParser.createdName_return createdName() throws RecognitionException {
        JaParser.createdName_return retval = new JaParser.createdName_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.classType_return classType207 = null;

        JaParser.primitiveType_return primitiveType208 = null;



        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:378:5: ( classType | primitiveType )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==IDENTIFIER) ) {
                alt54=1;
            }
            else if ( ((LA54_0>=CHAR && LA54_0<=BOOLEAN)) ) {
                alt54=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:378:9: classType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_classType_in_createdName3269);
                    classType207=classType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classType207.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:379:9: primitiveType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primitiveType_in_createdName3279);
                    primitiveType208=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType208.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "createdName"

    public static class arrayCreatorRest_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arrayCreatorRest"
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:382:1: arrayCreatorRest[CommonTree createdName] : ( (lb= '[' ']' -> ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] ) ) ( (lb= '[' ']' ) -> ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] $arrayCreatorRest) )* ( arrayInitializer -> $arrayCreatorRest arrayInitializer ) | (lb= '[' expression ']' -> ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] expression ) ) ( (lb= '[' expression ']' ) -> ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] expression $arrayCreatorRest) )* ( (lb= '[' ']' ) -> ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] $arrayCreatorRest) )* );
    public final JaParser.arrayCreatorRest_return arrayCreatorRest(CommonTree createdName) throws RecognitionException {
        JaParser.arrayCreatorRest_return retval = new JaParser.arrayCreatorRest_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lb=null;
        Token char_literal209=null;
        Token char_literal210=null;
        Token char_literal213=null;
        Token char_literal215=null;
        Token char_literal216=null;
        JaParser.arrayInitializer_return arrayInitializer211 = null;

        JaParser.expression_return expression212 = null;

        JaParser.expression_return expression214 = null;


        Object lb_tree=null;
        Object char_literal209_tree=null;
        Object char_literal210_tree=null;
        Object char_literal213_tree=null;
        Object char_literal215_tree=null;
        Object char_literal216_tree=null;
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_arrayInitializer=new RewriteRuleSubtreeStream(adaptor,"rule arrayInitializer");
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:383:5: ( (lb= '[' ']' -> ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] ) ) ( (lb= '[' ']' ) -> ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] $arrayCreatorRest) )* ( arrayInitializer -> $arrayCreatorRest arrayInitializer ) | (lb= '[' expression ']' -> ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] expression ) ) ( (lb= '[' expression ']' ) -> ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] expression $arrayCreatorRest) )* ( (lb= '[' ']' ) -> ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] $arrayCreatorRest) )* )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==90) ) {
                int LA58_1 = input.LA(2);

                if ( (LA58_1==91) ) {
                    alt58=1;
                }
                else if ( (LA58_1==IDENTIFIER||LA58_1==VOID||(LA58_1>=CHAR && LA58_1<=NULLLITERAL)||LA58_1==NEW||(LA58_1>=PLUS && LA58_1<=MINUS)||LA58_1==92||(LA58_1>=103 && LA58_1<=105)) ) {
                    alt58=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 58, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:383:9: (lb= '[' ']' -> ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] ) ) ( (lb= '[' ']' ) -> ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] $arrayCreatorRest) )* ( arrayInitializer -> $arrayCreatorRest arrayInitializer )
                    {
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:383:9: (lb= '[' ']' -> ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] ) )
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:383:10: lb= '[' ']'
                    {
                    lb=(Token)match(input,90,FOLLOW_90_in_arrayCreatorRest3306); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_90.add(lb);

                    char_literal209=(Token)match(input,91,FOLLOW_91_in_arrayCreatorRest3307); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_91.add(char_literal209);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 383:20: -> ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] )
                    {
                        // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:383:23: ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAYTYPE, lb, "ARRAYTYPE"), root_1);

                        adaptor.addChild(root_1, createdName);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }

                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:383:71: ( (lb= '[' ']' ) -> ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] $arrayCreatorRest) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==90) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:383:73: (lb= '[' ']' )
                    	    {
                    	    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:383:73: (lb= '[' ']' )
                    	    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:383:74: lb= '[' ']'
                    	    {
                    	    lb=(Token)match(input,90,FOLLOW_90_in_arrayCreatorRest3325); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_90.add(lb);

                    	    char_literal210=(Token)match(input,91,FOLLOW_91_in_arrayCreatorRest3327); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_91.add(char_literal210);


                    	    }



                    	    // AST REWRITE
                    	    // elements: arrayCreatorRest
                    	    // token labels: 
                    	    // rule labels: retval
                    	    // token list labels: 
                    	    // rule list labels: 
                    	    // wildcard labels: 
                    	    if ( state.backtracking==0 ) {
                    	    retval.tree = root_0;
                    	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    	    root_0 = (Object)adaptor.nil();
                    	    // 383:86: -> ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] $arrayCreatorRest)
                    	    {
                    	        // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:383:89: ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] $arrayCreatorRest)
                    	        {
                    	        Object root_1 = (Object)adaptor.nil();
                    	        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAYTYPE, lb, "ARRAYTYPE"), root_1);

                    	        adaptor.addChild(root_1, stream_retval.nextTree());

                    	        adaptor.addChild(root_0, root_1);
                    	        }

                    	    }

                    	    retval.tree = root_0;}
                    	    }
                    	    break;

                    	default :
                    	    break loop55;
                        }
                    } while (true);

                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:384:7: ( arrayInitializer -> $arrayCreatorRest arrayInitializer )
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:384:8: arrayInitializer
                    {
                    pushFollow(FOLLOW_arrayInitializer_in_arrayCreatorRest3351);
                    arrayInitializer211=arrayInitializer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arrayInitializer.add(arrayInitializer211.getTree());


                    // AST REWRITE
                    // elements: arrayInitializer, arrayCreatorRest
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 384:26: -> $arrayCreatorRest arrayInitializer
                    {
                        adaptor.addChild(root_0, stream_retval.nextTree());
                        adaptor.addChild(root_0, stream_arrayInitializer.nextTree());

                    }

                    retval.tree = root_0;}
                    }


                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:385:7: (lb= '[' expression ']' -> ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] expression ) ) ( (lb= '[' expression ']' ) -> ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] expression $arrayCreatorRest) )* ( (lb= '[' ']' ) -> ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] $arrayCreatorRest) )*
                    {
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:385:7: (lb= '[' expression ']' -> ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] expression ) )
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:385:8: lb= '[' expression ']'
                    {
                    lb=(Token)match(input,90,FOLLOW_90_in_arrayCreatorRest3375); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_90.add(lb);

                    pushFollow(FOLLOW_expression_in_arrayCreatorRest3377);
                    expression212=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression212.getTree());
                    char_literal213=(Token)match(input,91,FOLLOW_91_in_arrayCreatorRest3379); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_91.add(char_literal213);



                    // AST REWRITE
                    // elements: expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 385:30: -> ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] expression )
                    {
                        // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:385:33: ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAYTYPE, lb, "ARRAYTYPE"), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        adaptor.addChild(root_1, createdName);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }

                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:385:91: ( (lb= '[' expression ']' ) -> ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] expression $arrayCreatorRest) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==90) ) {
                            int LA56_1 = input.LA(2);

                            if ( (LA56_1==IDENTIFIER||LA56_1==VOID||(LA56_1>=CHAR && LA56_1<=NULLLITERAL)||LA56_1==NEW||(LA56_1>=PLUS && LA56_1<=MINUS)||LA56_1==92||(LA56_1>=103 && LA56_1<=105)) ) {
                                alt56=1;
                            }


                        }


                        switch (alt56) {
                    	case 1 :
                    	    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:385:93: (lb= '[' expression ']' )
                    	    {
                    	    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:385:93: (lb= '[' expression ']' )
                    	    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:385:94: lb= '[' expression ']'
                    	    {
                    	    lb=(Token)match(input,90,FOLLOW_90_in_arrayCreatorRest3398); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_90.add(lb);

                    	    pushFollow(FOLLOW_expression_in_arrayCreatorRest3400);
                    	    expression214=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression214.getTree());
                    	    char_literal215=(Token)match(input,91,FOLLOW_91_in_arrayCreatorRest3402); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_91.add(char_literal215);


                    	    }



                    	    // AST REWRITE
                    	    // elements: expression, arrayCreatorRest
                    	    // token labels: 
                    	    // rule labels: retval
                    	    // token list labels: 
                    	    // rule list labels: 
                    	    // wildcard labels: 
                    	    if ( state.backtracking==0 ) {
                    	    retval.tree = root_0;
                    	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    	    root_0 = (Object)adaptor.nil();
                    	    // 385:117: -> ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] expression $arrayCreatorRest)
                    	    {
                    	        // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:385:120: ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] expression $arrayCreatorRest)
                    	        {
                    	        Object root_1 = (Object)adaptor.nil();
                    	        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAYTYPE, lb, "ARRAYTYPE"), root_1);

                    	        adaptor.addChild(root_1, stream_expression.nextTree());
                    	        adaptor.addChild(root_1, stream_retval.nextTree());

                    	        adaptor.addChild(root_0, root_1);
                    	        }

                    	    }

                    	    retval.tree = root_0;}
                    	    }
                    	    break;

                    	default :
                    	    break loop56;
                        }
                    } while (true);

                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:386:7: ( (lb= '[' ']' ) -> ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] $arrayCreatorRest) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==90) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:386:9: (lb= '[' ']' )
                    	    {
                    	    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:386:9: (lb= '[' ']' )
                    	    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:386:10: lb= '[' ']'
                    	    {
                    	    lb=(Token)match(input,90,FOLLOW_90_in_arrayCreatorRest3434); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_90.add(lb);

                    	    char_literal216=(Token)match(input,91,FOLLOW_91_in_arrayCreatorRest3435); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_91.add(char_literal216);


                    	    }



                    	    // AST REWRITE
                    	    // elements: arrayCreatorRest
                    	    // token labels: 
                    	    // rule labels: retval
                    	    // token list labels: 
                    	    // rule list labels: 
                    	    // wildcard labels: 
                    	    if ( state.backtracking==0 ) {
                    	    retval.tree = root_0;
                    	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    	    root_0 = (Object)adaptor.nil();
                    	    // 386:21: -> ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] $arrayCreatorRest)
                    	    {
                    	        // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:386:24: ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] $arrayCreatorRest)
                    	        {
                    	        Object root_1 = (Object)adaptor.nil();
                    	        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAYTYPE, lb, "ARRAYTYPE"), root_1);

                    	        adaptor.addChild(root_1, stream_retval.nextTree());

                    	        adaptor.addChild(root_0, root_1);
                    	        }

                    	    }

                    	    retval.tree = root_0;}
                    	    }
                    	    break;

                    	default :
                    	    break loop57;
                        }
                    } while (true);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "arrayCreatorRest"

    public static class classCreatorRest_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classCreatorRest"
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:389:1: classCreatorRest : arguments ;
    public final JaParser.classCreatorRest_return classCreatorRest() throws RecognitionException {
        JaParser.classCreatorRest_return retval = new JaParser.classCreatorRest_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.arguments_return arguments217 = null;



        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:390:5: ( arguments )
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:390:9: arguments
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_arguments_in_classCreatorRest3469);
            arguments217=arguments();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments217.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "classCreatorRest"

    public static class superMemberAccess_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "superMemberAccess"
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:393:1: superMemberAccess : ( '.' IDENTIFIER -> ^( FIELDACCESS SUPER IDENTIFIER ) | '.' IDENTIFIER arguments -> ^( METHODCALL SUPER IDENTIFIER ( arguments )? ) );
    public final JaParser.superMemberAccess_return superMemberAccess() throws RecognitionException {
        JaParser.superMemberAccess_return retval = new JaParser.superMemberAccess_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal218=null;
        Token IDENTIFIER219=null;
        Token char_literal220=null;
        Token IDENTIFIER221=null;
        JaParser.arguments_return arguments222 = null;


        Object char_literal218_tree=null;
        Object IDENTIFIER219_tree=null;
        Object char_literal220_tree=null;
        Object IDENTIFIER221_tree=null;
        RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:394:5: ( '.' IDENTIFIER -> ^( FIELDACCESS SUPER IDENTIFIER ) | '.' IDENTIFIER arguments -> ^( METHODCALL SUPER IDENTIFIER ( arguments )? ) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==106) ) {
                int LA59_1 = input.LA(2);

                if ( (LA59_1==IDENTIFIER) ) {
                    int LA59_2 = input.LA(3);

                    if ( (LA59_2==92) ) {
                        alt59=2;
                    }
                    else if ( (LA59_2==EOF||(LA59_2>=INSTANCEOF && LA59_2<=COMPAREOP)||(LA59_2>=EQ && LA59_2<=SLASH)||LA59_2==86||(LA59_2>=88 && LA59_2<=91)||(LA59_2>=93 && LA59_2<=104)||LA59_2==106) ) {
                        alt59=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 59, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 59, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:394:7: '.' IDENTIFIER
                    {
                    char_literal218=(Token)match(input,106,FOLLOW_106_in_superMemberAccess3493); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_106.add(char_literal218);

                    IDENTIFIER219=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_superMemberAccess3495); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER219);



                    // AST REWRITE
                    // elements: IDENTIFIER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 394:22: -> ^( FIELDACCESS SUPER IDENTIFIER )
                    {
                        // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:394:25: ^( FIELDACCESS SUPER IDENTIFIER )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FIELDACCESS, "FIELDACCESS"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(SUPER, "SUPER"));
                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:395:9: '.' IDENTIFIER arguments
                    {
                    char_literal220=(Token)match(input,106,FOLLOW_106_in_superMemberAccess3515); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_106.add(char_literal220);

                    IDENTIFIER221=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_superMemberAccess3517); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER221);

                    pushFollow(FOLLOW_arguments_in_superMemberAccess3519);
                    arguments222=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arguments.add(arguments222.getTree());


                    // AST REWRITE
                    // elements: arguments, IDENTIFIER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 395:34: -> ^( METHODCALL SUPER IDENTIFIER ( arguments )? )
                    {
                        // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:395:37: ^( METHODCALL SUPER IDENTIFIER ( arguments )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(METHODCALL, "METHODCALL"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(SUPER, "SUPER"));
                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:395:68: ( arguments )?
                        if ( stream_arguments.hasNext() ) {
                            adaptor.addChild(root_1, stream_arguments.nextTree());

                        }
                        stream_arguments.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "superMemberAccess"

    public static class arguments_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arguments"
    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:398:1: arguments : ( '(' ')' | '(' expressionList ')' -> ^( ARGUMENTS expressionList ) );
    public final JaParser.arguments_return arguments() throws RecognitionException {
        JaParser.arguments_return retval = new JaParser.arguments_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal223=null;
        Token char_literal224=null;
        Token char_literal225=null;
        Token char_literal227=null;
        JaParser.expressionList_return expressionList226 = null;


        Object char_literal223_tree=null;
        Object char_literal224_tree=null;
        Object char_literal225_tree=null;
        Object char_literal227_tree=null;
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");
        try {
            // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:399:5: ( '(' ')' | '(' expressionList ')' -> ^( ARGUMENTS expressionList ) )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==92) ) {
                int LA60_1 = input.LA(2);

                if ( (LA60_1==93) ) {
                    alt60=1;
                }
                else if ( (LA60_1==IDENTIFIER||LA60_1==VOID||(LA60_1>=CHAR && LA60_1<=NULLLITERAL)||LA60_1==NEW||(LA60_1>=PLUS && LA60_1<=MINUS)||LA60_1==92||(LA60_1>=103 && LA60_1<=105)) ) {
                    alt60=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 60, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:399:9: '(' ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal223=(Token)match(input,92,FOLLOW_92_in_arguments3552); if (state.failed) return retval;
                    char_literal224=(Token)match(input,93,FOLLOW_93_in_arguments3554); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:400:7: '(' expressionList ')'
                    {
                    char_literal225=(Token)match(input,92,FOLLOW_92_in_arguments3563); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_92.add(char_literal225);

                    pushFollow(FOLLOW_expressionList_in_arguments3565);
                    expressionList226=expressionList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expressionList.add(expressionList226.getTree());
                    char_literal227=(Token)match(input,93,FOLLOW_93_in_arguments3567); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_93.add(char_literal227);



                    // AST REWRITE
                    // elements: expressionList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 400:30: -> ^( ARGUMENTS expressionList )
                    {
                        // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:400:33: ^( ARGUMENTS expressionList )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGUMENTS, "ARGUMENTS"), root_1);

                        adaptor.addChild(root_1, stream_expressionList.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "arguments"

    // $ANTLR start synpred2_Ja
    public final void synpred2_Ja_fragment() throws RecognitionException {   
        // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:244:7: ( ELSE )
        // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:244:8: ELSE
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred2_Ja1907); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_Ja

    // $ANTLR start synpred3_Ja
    public final void synpred3_Ja_fragment() throws RecognitionException {   
        // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:328:9: ( '(' primitiveType ')' )
        // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:328:10: '(' primitiveType ')'
        {
        match(input,92,FOLLOW_92_in_synpred3_Ja2698); if (state.failed) return ;
        pushFollow(FOLLOW_primitiveType_in_synpred3_Ja2700);
        primitiveType();

        state._fsp--;
        if (state.failed) return ;
        match(input,93,FOLLOW_93_in_synpred3_Ja2702); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_Ja

    // $ANTLR start synpred4_Ja
    public final void synpred4_Ja_fragment() throws RecognitionException {   
        // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:331:9: ( '(' nonPrimitiveType ')' unaryExpressionNotPlusMinus )
        // D:\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:331:10: '(' nonPrimitiveType ')' unaryExpressionNotPlusMinus
        {
        match(input,92,FOLLOW_92_in_synpred4_Ja2749); if (state.failed) return ;
        pushFollow(FOLLOW_nonPrimitiveType_in_synpred4_Ja2751);
        nonPrimitiveType();

        state._fsp--;
        if (state.failed) return ;
        match(input,93,FOLLOW_93_in_synpred4_Ja2754); if (state.failed) return ;
        pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_synpred4_Ja2756);
        unaryExpressionNotPlusMinus();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_Ja

    // Delegated rules

    public final boolean synpred3_Ja() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_Ja_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_Ja() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_Ja_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_Ja() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_Ja_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA15 dfa15 = new DFA15(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA48 dfa48 = new DFA48(this);
    protected DFA51 dfa51 = new DFA51(this);
    static final String DFA15_eotS =
        "\13\uffff";
    static final String DFA15_eofS =
        "\13\uffff";
    static final String DFA15_minS =
        "\1\44\1\uffff\10\44\1\uffff";
    static final String DFA15_maxS =
        "\1\60\1\uffff\10\145\1\uffff";
    static final String DFA15_acceptS =
        "\1\uffff\1\1\10\uffff\1\2";
    static final String DFA15_specialS =
        "\13\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\1\4\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11",
            "",
            "\1\12\52\uffff\1\12\6\uffff\1\12\1\uffff\2\12\1\1\1\12\1\uffff"+
            "\11\12",
            "\1\12\52\uffff\1\12\6\uffff\1\12\1\uffff\2\12\1\1\1\12\1\uffff"+
            "\11\12",
            "\1\12\52\uffff\1\12\6\uffff\1\12\1\uffff\2\12\1\1\1\12\1\uffff"+
            "\11\12",
            "\1\12\52\uffff\1\12\6\uffff\1\12\1\uffff\2\12\1\1\1\12\1\uffff"+
            "\11\12",
            "\1\12\52\uffff\1\12\6\uffff\1\12\1\uffff\2\12\1\1\1\12\1\uffff"+
            "\11\12",
            "\1\12\52\uffff\1\12\6\uffff\1\12\1\uffff\2\12\1\1\1\12\1\uffff"+
            "\11\12",
            "\1\12\52\uffff\1\12\6\uffff\1\12\1\uffff\2\12\1\1\1\12\1\uffff"+
            "\11\12",
            "\1\12\52\uffff\1\12\6\uffff\1\12\1\uffff\2\12\1\1\1\12\1\uffff"+
            "\11\12",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "133:1: type returns [Type t] : ( nonPrimitiveType | primitiveType );";
        }
    }
    static final String DFA26_eotS =
        "\21\uffff";
    static final String DFA26_eofS =
        "\21\uffff";
    static final String DFA26_minS =
        "\12\44\1\uffff\1\44\1\uffff\1\133\2\44\1\133";
    static final String DFA26_maxS =
        "\1\151\11\152\1\uffff\1\151\1\uffff\1\133\2\152\1\133";
    static final String DFA26_acceptS =
        "\12\uffff\1\2\1\uffff\1\1\4\uffff";
    static final String DFA26_specialS =
        "\21\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\1\2\uffff\1\12\1\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
            "\17\12\3\uffff\1\12\14\uffff\2\12\4\uffff\2\12\4\uffff\1\12"+
            "\12\uffff\3\12",
            "\1\14\34\uffff\2\12\14\uffff\5\12\2\uffff\1\12\3\uffff\1\13"+
            "\1\uffff\1\12\1\uffff\13\12\1\uffff\1\12",
            "\1\14\65\uffff\1\15\17\uffff\1\12",
            "\1\14\65\uffff\1\15\17\uffff\1\12",
            "\1\14\65\uffff\1\15\17\uffff\1\12",
            "\1\14\65\uffff\1\15\17\uffff\1\12",
            "\1\14\65\uffff\1\15\17\uffff\1\12",
            "\1\14\65\uffff\1\15\17\uffff\1\12",
            "\1\14\65\uffff\1\15\17\uffff\1\12",
            "\1\14\65\uffff\1\15\17\uffff\1\12",
            "",
            "\1\12\2\uffff\1\12\1\uffff\22\12\10\uffff\1\12\14\uffff\2"+
            "\12\11\uffff\1\16\1\12\12\uffff\3\12",
            "",
            "\1\17",
            "\1\14\65\uffff\1\20\17\uffff\1\12",
            "\1\14\65\uffff\1\15\17\uffff\1\12",
            "\1\16"
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "216:1: blockStatement : ( localVariableDeclarationStatement | statement );";
        }
    }
    static final String DFA34_eotS =
        "\21\uffff";
    static final String DFA34_eofS =
        "\21\uffff";
    static final String DFA34_minS =
        "\12\44\1\uffff\1\44\1\uffff\1\133\2\44\1\133";
    static final String DFA34_maxS =
        "\1\151\11\152\1\uffff\1\151\1\uffff\1\133\2\152\1\133";
    static final String DFA34_acceptS =
        "\12\uffff\1\2\1\uffff\1\1\4\uffff";
    static final String DFA34_specialS =
        "\21\uffff}>";
    static final String[] DFA34_transitionS = {
            "\1\1\2\uffff\1\12\1\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
            "\12\12\10\uffff\1\12\14\uffff\2\12\12\uffff\1\12\12\uffff\3"+
            "\12",
            "\1\14\34\uffff\2\12\14\uffff\5\12\2\uffff\1\12\2\uffff\1\12"+
            "\1\13\1\uffff\1\12\1\uffff\13\12\1\uffff\1\12",
            "\1\14\65\uffff\1\15\17\uffff\1\12",
            "\1\14\65\uffff\1\15\17\uffff\1\12",
            "\1\14\65\uffff\1\15\17\uffff\1\12",
            "\1\14\65\uffff\1\15\17\uffff\1\12",
            "\1\14\65\uffff\1\15\17\uffff\1\12",
            "\1\14\65\uffff\1\15\17\uffff\1\12",
            "\1\14\65\uffff\1\15\17\uffff\1\12",
            "\1\14\65\uffff\1\15\17\uffff\1\12",
            "",
            "\1\12\2\uffff\1\12\1\uffff\22\12\10\uffff\1\12\14\uffff\2"+
            "\12\11\uffff\1\16\1\12\12\uffff\3\12",
            "",
            "\1\17",
            "\1\14\65\uffff\1\20\17\uffff\1\12",
            "\1\14\65\uffff\1\15\17\uffff\1\12",
            "\1\16"
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
            return "248:1: forInit : ( localVariableDeclaration | expressionList );";
        }
    }
    static final String DFA48_eotS =
        "\46\uffff";
    static final String DFA48_eofS =
        "\17\uffff\1\4\26\uffff";
    static final String DFA48_minS =
        "\1\44\1\uffff\1\44\2\uffff\1\101\10\132\2\44\1\uffff\1\133\1\132"+
        "\20\uffff\1\132\1\uffff\1\133";
    static final String DFA48_maxS =
        "\1\151\1\uffff\1\151\2\uffff\11\152\1\151\1\152\1\uffff\1\133\1"+
        "\152\20\uffff\1\152\1\uffff\1\133";
    static final String DFA48_acceptS =
        "\1\uffff\1\1\1\uffff\1\4\1\5\13\uffff\1\2\2\uffff\20\3\1\uffff"+
        "\1\3\1\uffff";
    static final String DFA48_specialS =
        "\6\uffff\1\10\1\6\1\3\1\5\1\1\1\2\1\11\1\0\1\uffff\1\4\2\uffff"+
        "\1\7\20\uffff\1\12\2\uffff}>";
    static final String[] DFA48_transitionS = {
            "\1\4\2\uffff\1\4\1\uffff\22\4\10\uffff\1\3\30\uffff\1\2\14"+
            "\uffff\1\1",
            "",
            "\1\5\2\uffff\1\4\1\uffff\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
            "\1\15\12\4\10\uffff\1\4\14\uffff\2\4\12\uffff\1\4\12\uffff\3"+
            "\4",
            "",
            "",
            "\2\4\14\uffff\5\4\6\uffff\1\16\1\uffff\1\4\1\17\13\4\1\uffff"+
            "\1\4",
            "\1\21\2\uffff\1\20\14\uffff\1\4",
            "\1\21\2\uffff\1\20\14\uffff\1\4",
            "\1\21\2\uffff\1\20\14\uffff\1\4",
            "\1\21\2\uffff\1\20\14\uffff\1\4",
            "\1\21\2\uffff\1\20\14\uffff\1\4",
            "\1\21\2\uffff\1\20\14\uffff\1\4",
            "\1\21\2\uffff\1\20\14\uffff\1\4",
            "\1\21\2\uffff\1\20\14\uffff\1\4",
            "\1\4\2\uffff\1\4\1\uffff\22\4\10\uffff\1\4\14\uffff\2\4\11"+
            "\uffff\1\22\1\4\12\uffff\3\4",
            "\1\31\2\uffff\1\42\1\uffff\1\32\1\33\1\34\1\35\1\36\1\37\1"+
            "\40\1\41\1\26\1\27\10\30\6\uffff\2\4\1\25\13\uffff\5\4\2\uffff"+
            "\1\4\1\uffff\4\4\1\24\14\4\1\23\1\4",
            "",
            "\1\43",
            "\1\45\2\uffff\1\44\14\uffff\1\4",
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
            "\1\21\2\uffff\1\44\14\uffff\1\4",
            "",
            "\1\22"
    };

    static final short[] DFA48_eot = DFA.unpackEncodedString(DFA48_eotS);
    static final short[] DFA48_eof = DFA.unpackEncodedString(DFA48_eofS);
    static final char[] DFA48_min = DFA.unpackEncodedStringToUnsignedChars(DFA48_minS);
    static final char[] DFA48_max = DFA.unpackEncodedStringToUnsignedChars(DFA48_maxS);
    static final short[] DFA48_accept = DFA.unpackEncodedString(DFA48_acceptS);
    static final short[] DFA48_special = DFA.unpackEncodedString(DFA48_specialS);
    static final short[][] DFA48_transition;

    static {
        int numStates = DFA48_transitionS.length;
        DFA48_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA48_transition[i] = DFA.unpackEncodedString(DFA48_transitionS[i]);
        }
    }

    class DFA48 extends DFA {

        public DFA48(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 48;
            this.eot = DFA48_eot;
            this.eof = DFA48_eof;
            this.min = DFA48_min;
            this.max = DFA48_max;
            this.accept = DFA48_accept;
            this.special = DFA48_special;
            this.transition = DFA48_transition;
        }
        public String getDescription() {
            return "326:1: unaryExpressionNotPlusMinus : ( '!' unaryExpression | ( '(' primitiveType ')' )=>lp= '(' primitiveType ')' unaryExpression -> ^( CAST[$lp, \"CAST\"] primitiveType unaryExpression ) | ( '(' nonPrimitiveType ')' unaryExpressionNotPlusMinus )=>lp= '(' nonPrimitiveType ')' unaryExpressionNotPlusMinus -> ^( CAST[$lp, \"CAST\"] nonPrimitiveType unaryExpressionNotPlusMinus ) | NEW creator | ( primary -> primary ) ( selector[(CommonTree)$unaryExpressionNotPlusMinus.tree] -> selector )* ( '++' -> ^( POSTINC $unaryExpressionNotPlusMinus) | '--' -> ^( POSTDEC $unaryExpressionNotPlusMinus) )? );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA48_13 = input.LA(1);

                         
                        int index48_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA48_13==90) ) {s = 17;}

                        else if ( (LA48_13==106) ) {s = 4;}

                        else if ( (LA48_13==93) && (synpred3_Ja())) {s = 16;}

                         
                        input.seek(index48_13);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA48_10 = input.LA(1);

                         
                        int index48_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA48_10==90) ) {s = 17;}

                        else if ( (LA48_10==93) && (synpred3_Ja())) {s = 16;}

                        else if ( (LA48_10==106) ) {s = 4;}

                         
                        input.seek(index48_10);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA48_11 = input.LA(1);

                         
                        int index48_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA48_11==93) && (synpred3_Ja())) {s = 16;}

                        else if ( (LA48_11==90) ) {s = 17;}

                        else if ( (LA48_11==106) ) {s = 4;}

                         
                        input.seek(index48_11);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA48_8 = input.LA(1);

                         
                        int index48_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA48_8==90) ) {s = 17;}

                        else if ( (LA48_8==93) && (synpred3_Ja())) {s = 16;}

                        else if ( (LA48_8==106) ) {s = 4;}

                         
                        input.seek(index48_8);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA48_15 = input.LA(1);

                         
                        int index48_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA48_15==EOF||(LA48_15>=INSTANCEOF && LA48_15<=COMPAREOP)||(LA48_15>=EQ && LA48_15<=SLASH)||LA48_15==86||(LA48_15>=88 && LA48_15<=91)||(LA48_15>=93 && LA48_15<=104)||LA48_15==106) ) {s = 4;}

                        else if ( (LA48_15==105) && (synpred4_Ja())) {s = 19;}

                        else if ( (LA48_15==92) && (synpred4_Ja())) {s = 20;}

                        else if ( (LA48_15==NEW) && (synpred4_Ja())) {s = 21;}

                        else if ( (LA48_15==THIS) && (synpred4_Ja())) {s = 22;}

                        else if ( (LA48_15==SUPER) && (synpred4_Ja())) {s = 23;}

                        else if ( ((LA48_15>=INTLITERAL && LA48_15<=NULLLITERAL)) && (synpred4_Ja())) {s = 24;}

                        else if ( (LA48_15==IDENTIFIER) && (synpred4_Ja())) {s = 25;}

                        else if ( (LA48_15==CHAR) && (synpred4_Ja())) {s = 26;}

                        else if ( (LA48_15==BYTE) && (synpred4_Ja())) {s = 27;}

                        else if ( (LA48_15==SHORT) && (synpred4_Ja())) {s = 28;}

                        else if ( (LA48_15==INT) && (synpred4_Ja())) {s = 29;}

                        else if ( (LA48_15==LONG) && (synpred4_Ja())) {s = 30;}

                        else if ( (LA48_15==FLOAT) && (synpred4_Ja())) {s = 31;}

                        else if ( (LA48_15==DOUBLE) && (synpred4_Ja())) {s = 32;}

                        else if ( (LA48_15==BOOLEAN) && (synpred4_Ja())) {s = 33;}

                        else if ( (LA48_15==VOID) && (synpred4_Ja())) {s = 34;}

                         
                        input.seek(index48_15);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA48_9 = input.LA(1);

                         
                        int index48_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA48_9==90) ) {s = 17;}

                        else if ( (LA48_9==106) ) {s = 4;}

                        else if ( (LA48_9==93) && (synpred3_Ja())) {s = 16;}

                         
                        input.seek(index48_9);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA48_7 = input.LA(1);

                         
                        int index48_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA48_7==93) && (synpred3_Ja())) {s = 16;}

                        else if ( (LA48_7==90) ) {s = 17;}

                        else if ( (LA48_7==106) ) {s = 4;}

                         
                        input.seek(index48_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA48_18 = input.LA(1);

                         
                        int index48_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA48_18==93) && (synpred4_Ja())) {s = 36;}

                        else if ( (LA48_18==90) ) {s = 37;}

                        else if ( (LA48_18==106) ) {s = 4;}

                         
                        input.seek(index48_18);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA48_6 = input.LA(1);

                         
                        int index48_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA48_6==93) && (synpred3_Ja())) {s = 16;}

                        else if ( (LA48_6==90) ) {s = 17;}

                        else if ( (LA48_6==106) ) {s = 4;}

                         
                        input.seek(index48_6);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA48_12 = input.LA(1);

                         
                        int index48_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA48_12==93) && (synpred3_Ja())) {s = 16;}

                        else if ( (LA48_12==90) ) {s = 17;}

                        else if ( (LA48_12==106) ) {s = 4;}

                         
                        input.seek(index48_12);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA48_35 = input.LA(1);

                         
                        int index48_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA48_35==93) && (synpred4_Ja())) {s = 36;}

                        else if ( (LA48_35==90) ) {s = 17;}

                        else if ( (LA48_35==106) ) {s = 4;}

                         
                        input.seek(index48_35);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 48, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA51_eotS =
        "\16\uffff";
    static final String DFA51_eofS =
        "\5\uffff\1\13\10\uffff";
    static final String DFA51_minS =
        "\1\44\4\uffff\1\101\2\uffff\1\43\1\44\4\uffff";
    static final String DFA51_maxS =
        "\1\134\4\uffff\1\152\2\uffff\1\44\1\151\4\uffff";
    static final String DFA51_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\11\1\12\2\uffff\1\7\1\5\1\10"+
        "\1\6";
    static final String DFA51_specialS =
        "\16\uffff}>";
    static final String[] DFA51_transitionS = {
            "\1\5\2\uffff\1\7\1\uffff\10\6\1\2\1\3\10\4\41\uffff\1\1",
            "",
            "",
            "",
            "",
            "\2\13\14\uffff\5\13\2\uffff\1\13\1\uffff\2\13\1\11\1\13\1"+
            "\12\14\13\1\uffff\1\10",
            "",
            "",
            "\1\14\1\13",
            "\1\13\2\uffff\1\13\1\uffff\22\13\10\uffff\1\13\14\uffff\2"+
            "\13\11\uffff\1\15\1\13\12\uffff\3\13",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA51_eot = DFA.unpackEncodedString(DFA51_eotS);
    static final short[] DFA51_eof = DFA.unpackEncodedString(DFA51_eofS);
    static final char[] DFA51_min = DFA.unpackEncodedStringToUnsignedChars(DFA51_minS);
    static final char[] DFA51_max = DFA.unpackEncodedStringToUnsignedChars(DFA51_maxS);
    static final short[] DFA51_accept = DFA.unpackEncodedString(DFA51_acceptS);
    static final short[] DFA51_special = DFA.unpackEncodedString(DFA51_specialS);
    static final short[][] DFA51_transition;

    static {
        int numStates = DFA51_transitionS.length;
        DFA51_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA51_transition[i] = DFA.unpackEncodedString(DFA51_transitionS[i]);
        }
    }

    class DFA51 extends DFA {

        public DFA51(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 51;
            this.eot = DFA51_eot;
            this.eof = DFA51_eof;
            this.min = DFA51_min;
            this.max = DFA51_max;
            this.accept = DFA51_accept;
            this.special = DFA51_special;
            this.transition = DFA51_transition;
        }
        public String getDescription() {
            return "339:1: primary : ( parExpression | THIS | SUPER superMemberAccess | literal | IDENTIFIER | ( IDENTIFIER -> IDENTIFIER ) ( '[' ']' -> ^( ARRAYTYPE $primary) )+ ( '.' CLASS -> ^( DOTCLASS $primary) ) | IDENTIFIER arguments -> ^( METHODCALL THIS IDENTIFIER ( arguments )? ) | IDENTIFIER '.' CLASS -> ^( DOTCLASS IDENTIFIER ) | ( primitiveType -> primitiveType ) ( '[' ']' -> ^( ARRAYTYPE $primary) )* ( '.' CLASS -> ^( DOTCLASS $primary) ) | VOID '.' CLASS -> ^( DOTCLASS VOID ) );";
        }
    }
 

    public static final BitSet FOLLOW_classDeclaration_in_compilationUnit158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_compilationUnit168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classModifier_in_classDeclaration191 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_CLASS_in_classDeclaration194 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classDeclaration197 = new BitSet(new long[]{0x0000002000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_EXTENDS_in_classDeclaration210 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_classType_in_classDeclaration213 = new BitSet(new long[]{0x0000002000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_classBody_in_classDeclaration232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PUBLIC_in_classModifier251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_classBody272 = new BitSet(new long[]{0x0000014000000000L,0x0000000001400000L});
    public static final BitSet FOLLOW_classBodyDeclaration_in_classBody275 = new BitSet(new long[]{0x0000014000000000L,0x0000000001400000L});
    public static final BitSet FOLLOW_88_in_classBody278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_classBodyDeclaration298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_memberDeclaration_in_classBodyDeclaration309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifier_in_memberDeclaration333 = new BitSet(new long[]{0x0001FE1000000000L});
    public static final BitSet FOLLOW_type_in_memberDeclaration335 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_methodDeclaration_in_memberDeclaration352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldDeclaration_in_memberDeclaration374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifier_in_memberDeclaration405 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_VOID_in_memberDeclaration407 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_memberDeclaration409 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_voidMethodDeclaratorRest_in_memberDeclaration411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifier_in_memberDeclaration448 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_memberDeclaration458 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_formalParameters_in_memberDeclaration460 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_constructorBody_in_memberDeclaration462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_methodDeclaration511 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_formalParameters_in_methodDeclaration513 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_methodBody_in_methodDeclaration515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclarator_in_fieldDeclaration545 = new BitSet(new long[]{0x0000000000000000L,0x0000000002400000L});
    public static final BitSet FOLLOW_89_in_fieldDeclaration565 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_variableDeclarator_in_fieldDeclaration569 = new BitSet(new long[]{0x0000000000000000L,0x0000000002400000L});
    public static final BitSet FOLLOW_86_in_fieldDeclaration586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formalParameters_in_voidMethodDeclaratorRest629 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_methodBody_in_voidMethodDeclaratorRest631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_variableDeclarator657 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_EQ_in_variableDeclarator663 = new BitSet(new long[]{0x07FFFE9000000000L,0x0000038010830008L});
    public static final BitSet FOLLOW_variableInitializer_in_variableDeclarator666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_variableDeclaratorId699 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_variableDeclaratorId710 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_variableDeclaratorId712 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_arrayInitializer_in_variableInitializer765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_variableInitializer775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_arrayInitializer804 = new BitSet(new long[]{0x07FFFE9000000000L,0x0000038011830008L});
    public static final BitSet FOLLOW_variableInitializer_in_arrayInitializer807 = new BitSet(new long[]{0x0000000000000000L,0x0000000003000000L});
    public static final BitSet FOLLOW_89_in_arrayInitializer810 = new BitSet(new long[]{0x07FFFE9000000000L,0x0000038010830008L});
    public static final BitSet FOLLOW_variableInitializer_in_arrayInitializer812 = new BitSet(new long[]{0x0000000000000000L,0x0000000003000000L});
    public static final BitSet FOLLOW_89_in_arrayInitializer817 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_arrayInitializer824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PUBLIC_in_modifier858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIVATE_in_modifier871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonPrimitiveType_in_type894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_type904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classType_in_nonPrimitiveType931 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_nonPrimitiveType950 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_nonPrimitiveType952 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_primitiveType_in_nonPrimitiveType981 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_nonPrimitiveType992 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_nonPrimitiveType994 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classType1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_primitiveType1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BYTE_in_primitiveType1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHORT_in_primitiveType1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_primitiveType1100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_in_primitiveType1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_primitiveType1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_primitiveType1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_primitiveType1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_formalParameters1192 = new BitSet(new long[]{0x0001FE1000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_formalParameterDecls_in_formalParameters1194 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_formalParameters1198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_formalParameterDecls1250 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_formalParameterDecls1252 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_formalParameterDecls1256 = new BitSet(new long[]{0x0001FE1000000000L});
    public static final BitSet FOLLOW_formalParameterDecls_in_formalParameterDecls1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_methodBody1315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_constructorBody1345 = new BitSet(new long[]{0xFFFFFE9000000000L,0x0000038011C30008L});
    public static final BitSet FOLLOW_explicitConstructorInvocation_in_constructorBody1347 = new BitSet(new long[]{0xFFFFFE9000000000L,0x0000038011C30008L});
    public static final BitSet FOLLOW_blockStatement_in_constructorBody1350 = new BitSet(new long[]{0xFFFFFE9000000000L,0x0000038011C30008L});
    public static final BitSet FOLLOW_88_in_constructorBody1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_explicitConstructorInvocation1386 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_SUPER_in_explicitConstructorInvocation1396 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_arguments_in_explicitConstructorInvocation1404 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_explicitConstructorInvocation1406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_literal0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_block1530 = new BitSet(new long[]{0xFFFFFE9000000000L,0x0000038011C30008L});
    public static final BitSet FOLLOW_blockStatement_in_block1533 = new BitSet(new long[]{0xFFFFFE9000000000L,0x0000038011C30008L});
    public static final BitSet FOLLOW_88_in_block1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localVariableDeclarationStatement_in_blockStatement1560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_blockStatement1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localVariableDeclaration_in_localVariableDeclarationStatement1591 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_localVariableDeclarationStatement1593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_localVariableDeclaration1611 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_variableDeclarator_in_localVariableDeclaration1613 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_localVariableDeclaration1617 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_variableDeclarator_in_localVariableDeclaration1619 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_block_in_statement1660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_statement1679 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_parExpression_in_statement1681 = new BitSet(new long[]{0xFFFFFE9000000000L,0x0000038010C30008L});
    public static final BitSet FOLLOW_statement_in_statement1683 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_elseStmt_in_statement1685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_statement1716 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_statement1718 = new BitSet(new long[]{0x07FFFE9000000000L,0x0000038010C30008L});
    public static final BitSet FOLLOW_forInit_in_statement1720 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_statement1723 = new BitSet(new long[]{0x07FFFE9000000000L,0x0000038010C30008L});
    public static final BitSet FOLLOW_expression_in_statement1725 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_statement1728 = new BitSet(new long[]{0x07FFFE9000000000L,0x0000038030830008L});
    public static final BitSet FOLLOW_forUpdate_in_statement1730 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_statement1733 = new BitSet(new long[]{0xFFFFFE9000000000L,0x0000038010C30008L});
    public static final BitSet FOLLOW_statement_in_statement1735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_statement1786 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_parExpression_in_statement1788 = new BitSet(new long[]{0xFFFFFE9000000000L,0x0000038010C30008L});
    public static final BitSet FOLLOW_statement_in_statement1790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_statement1814 = new BitSet(new long[]{0xFFFFFE9000000000L,0x0000038010C30008L});
    public static final BitSet FOLLOW_statement_in_statement1816 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_WHILE_in_statement1818 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_parExpression_in_statement1820 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_statement1822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_statement1846 = new BitSet(new long[]{0x07FFFE9000000000L,0x0000038010C30008L});
    public static final BitSet FOLLOW_expression_in_statement1849 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_statement1852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_statement1863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementExpression_in_statement1875 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_statement1877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_elseStmt1912 = new BitSet(new long[]{0xFFFFFE9000000000L,0x0000038010C30008L});
    public static final BitSet FOLLOW_statement_in_elseStmt1915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localVariableDeclaration_in_forInit1940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionList_in_forInit1950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionList_in_forUpdate1969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_parExpression1988 = new BitSet(new long[]{0x07FFFE9000000000L,0x0000038010830008L});
    public static final BitSet FOLLOW_expression_in_parExpression1991 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_parExpression1993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionList2017 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_expressionList2020 = new BitSet(new long[]{0x07FFFE9000000000L,0x0000038010830008L});
    public static final BitSet FOLLOW_expression_in_expressionList2023 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_expression_in_statementExpression2044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orExpression_in_expression2067 = new BitSet(new long[]{0x0000000000000002L,0x00000003C0008000L});
    public static final BitSet FOLLOW_assignmentOperator_in_expression2073 = new BitSet(new long[]{0x07FFFE9000000000L,0x0000038010830008L});
    public static final BitSet FOLLOW_expression_in_expression2075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_assignmentOperator2266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_assignmentOperator2281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_assignmentOperator2295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_assignmentOperator2309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_assignmentOperator2323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andExpression_in_orExpression2344 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_orExpression2348 = new BitSet(new long[]{0x07FFFE9000000000L,0x0000038010830008L});
    public static final BitSet FOLLOW_andExpression_in_orExpression2351 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_equalityExpression_in_andExpression2373 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_andExpression2377 = new BitSet(new long[]{0x07FFFE9000000000L,0x0000038010830008L});
    public static final BitSet FOLLOW_equalityExpression_in_andExpression2380 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000000L});
    public static final BitSet FOLLOW_instanceOfExpression_in_equalityExpression2402 = new BitSet(new long[]{0x0000000000000002L,0x0000003000000000L});
    public static final BitSet FOLLOW_set_in_equalityExpression2406 = new BitSet(new long[]{0x07FFFE9000000000L,0x0000038010830008L});
    public static final BitSet FOLLOW_instanceOfExpression_in_equalityExpression2415 = new BitSet(new long[]{0x0000000000000002L,0x0000003000000000L});
    public static final BitSet FOLLOW_relationalExpression_in_instanceOfExpression2437 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_INSTANCEOF_in_instanceOfExpression2440 = new BitSet(new long[]{0x0001FE1000000000L});
    public static final BitSet FOLLOW_type_in_instanceOfExpression2443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression2464 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_COMPAREOP_in_relationalExpression2468 = new BitSet(new long[]{0x07FFFE9000000000L,0x0000038010830008L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression2471 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression2493 = new BitSet(new long[]{0x0000000000000002L,0x0000000000030000L});
    public static final BitSet FOLLOW_set_in_additiveExpression2497 = new BitSet(new long[]{0x07FFFE9000000000L,0x0000038010830008L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression2506 = new BitSet(new long[]{0x0000000000000002L,0x0000000000030000L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression2528 = new BitSet(new long[]{0x0000000000000002L,0x00000040000C0000L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression2532 = new BitSet(new long[]{0x07FFFE9000000000L,0x0000038010830008L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression2547 = new BitSet(new long[]{0x0000000000000002L,0x00000040000C0000L});
    public static final BitSet FOLLOW_PLUS_in_unaryExpression2575 = new BitSet(new long[]{0x07FFFE9000000000L,0x0000038010830008L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression2577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unaryExpression2600 = new BitSet(new long[]{0x07FFFE9000000000L,0x0000038010830008L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression2602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_unaryExpression2623 = new BitSet(new long[]{0x07FFFE9000000000L,0x0000038010830008L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression2625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_unaryExpression2646 = new BitSet(new long[]{0x07FFFE9000000000L,0x0000038010830008L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression2648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression2667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_unaryExpressionNotPlusMinus2684 = new BitSet(new long[]{0x07FFFE9000000000L,0x0000038010830008L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus2687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_unaryExpressionNotPlusMinus2710 = new BitSet(new long[]{0x0001FE1000000000L});
    public static final BitSet FOLLOW_primitiveType_in_unaryExpressionNotPlusMinus2712 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_unaryExpressionNotPlusMinus2714 = new BitSet(new long[]{0x07FFFE9000000000L,0x0000038010830008L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus2716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_unaryExpressionNotPlusMinus2763 = new BitSet(new long[]{0x0001FE1000000000L});
    public static final BitSet FOLLOW_nonPrimitiveType_in_unaryExpressionNotPlusMinus2765 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_unaryExpressionNotPlusMinus2768 = new BitSet(new long[]{0x07FFFE9000000000L,0x0000038010830008L});
    public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpressionNotPlusMinus2770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_unaryExpressionNotPlusMinus2797 = new BitSet(new long[]{0x0001FE1000000000L});
    public static final BitSet FOLLOW_creator_in_unaryExpressionNotPlusMinus2800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_in_unaryExpressionNotPlusMinus2811 = new BitSet(new long[]{0x0000000000000002L,0x0000058004000000L});
    public static final BitSet FOLLOW_selector_in_unaryExpressionNotPlusMinus2820 = new BitSet(new long[]{0x0000000000000002L,0x0000058004000000L});
    public static final BitSet FOLLOW_103_in_unaryExpressionNotPlusMinus2837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_unaryExpressionNotPlusMinus2850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parExpression_in_primary2887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_primary2897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUPER_in_primary2908 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_superMemberAccess_in_primary2911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primary2921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_primary2931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_primary2942 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_primary2950 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_primary2952 = new BitSet(new long[]{0x0000000000000000L,0x0000040004000000L});
    public static final BitSet FOLLOW_106_in_primary2966 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_CLASS_in_primary2968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_primary2987 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_arguments_in_primary2990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_primary3011 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_primary3013 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_CLASS_in_primary3015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_primary3034 = new BitSet(new long[]{0x0000000000000000L,0x0000040004000000L});
    public static final BitSet FOLLOW_90_in_primary3042 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_primary3044 = new BitSet(new long[]{0x0000000000000000L,0x0000040004000000L});
    public static final BitSet FOLLOW_106_in_primary3058 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_CLASS_in_primary3060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_primary3080 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_primary3082 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_CLASS_in_primary3084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_selector3117 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_selector3119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_selector3137 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_selector3139 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_arguments_in_selector3141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_selector3176 = new BitSet(new long[]{0x07FFFE9000000000L,0x0000038010830008L});
    public static final BitSet FOLLOW_expression_in_selector3178 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_selector3180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createdName_in_creator3210 = new BitSet(new long[]{0x0000000000000000L,0x0000000014000000L});
    public static final BitSet FOLLOW_arrayCreatorRest_in_creator3214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classCreatorRest_in_creator3240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classType_in_createdName3269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_createdName3279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_arrayCreatorRest3306 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_arrayCreatorRest3307 = new BitSet(new long[]{0x0000000000000000L,0x0000000004800000L});
    public static final BitSet FOLLOW_90_in_arrayCreatorRest3325 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_arrayCreatorRest3327 = new BitSet(new long[]{0x0000000000000000L,0x0000000004800000L});
    public static final BitSet FOLLOW_arrayInitializer_in_arrayCreatorRest3351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_arrayCreatorRest3375 = new BitSet(new long[]{0x07FFFE9000000000L,0x0000038010830008L});
    public static final BitSet FOLLOW_expression_in_arrayCreatorRest3377 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_arrayCreatorRest3379 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_arrayCreatorRest3398 = new BitSet(new long[]{0x07FFFE9000000000L,0x0000038010830008L});
    public static final BitSet FOLLOW_expression_in_arrayCreatorRest3400 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_arrayCreatorRest3402 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_arrayCreatorRest3434 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_arrayCreatorRest3435 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_arguments_in_classCreatorRest3469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_superMemberAccess3493 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_superMemberAccess3495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_superMemberAccess3515 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_superMemberAccess3517 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_arguments_in_superMemberAccess3519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_arguments3552 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_arguments3554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_arguments3563 = new BitSet(new long[]{0x07FFFE9000000000L,0x0000038010830008L});
    public static final BitSet FOLLOW_expressionList_in_arguments3565 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_arguments3567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_synpred2_Ja1907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_synpred3_Ja2698 = new BitSet(new long[]{0x0001FE1000000000L});
    public static final BitSet FOLLOW_primitiveType_in_synpred3_Ja2700 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_synpred3_Ja2702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_synpred4_Ja2749 = new BitSet(new long[]{0x0001FE1000000000L});
    public static final BitSet FOLLOW_nonPrimitiveType_in_synpred4_Ja2751 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_synpred4_Ja2754 = new BitSet(new long[]{0x07FFFE9000000000L,0x0000038010830008L});
    public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_synpred4_Ja2756 = new BitSet(new long[]{0x0000000000000002L});

}