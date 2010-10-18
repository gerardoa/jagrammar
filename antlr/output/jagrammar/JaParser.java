// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g 2010-10-15 13:31:51

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
import org.antlr.runtime.debug.*;
import java.io.IOException;

import org.antlr.runtime.tree.*;

public class JaParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "METHODCALL", "CONSTRCALL", "FIELDACCESS", "ARRAYACCESS", "DOTCLASS", "ARRAYTYPE", "METHOD", "FIELD", "CONSTR", "FPARMS", "ARGUMENTS", "FPARM", "FMULTPARM", "MBODY", "CBODY", "VARDECL", "BLOCK", "STMT", "INIT", "CONDITION", "UPDATE", "DOWHILE", "THEN", "ARRAYINIT", "PREINC", "POSTINC", "PREDEC", "POSTDEC", "UNARYPLUS", "UNARYMINUS", "CAST", "CLASS", "IDENTIFIER", "EXTENDS", "PUBLIC", "VOID", "PRIVATE", "CHAR", "BYTE", "SHORT", "INT", "LONG", "FLOAT", "DOUBLE", "BOOLEAN", "THIS", "SUPER", "INTLITERAL", "LONGLITERAL", "FLOATLITERAL", "DOUBLELITERAL", "CHARLITERAL", "STRINGLITERAL", "BOOLEANLITERAL", "NULLLITERAL", "IF", "FOR", "WHILE", "DO", "RETURN", "ELSE", "INSTANCEOF", "COMPAREOP", "NEW", "Digit", "IntegerNumber", "LongSuffix", "Exponent", "FloatingPointLiteral", "FloatSuffix", "DoubleSuffix", "EscapeSequence", "WS", "COMMENT", "LINE_COMMENT", "EQ", "PLUS", "MINUS", "STAR", "SLASH", "Letter", "Currency", "';'", "'{'", "'}'", "','", "'['", "']'", "'('", "')'", "'+='", "'-='", "'*='", "'/='", "'||'", "'&&'", "'=='", "'!='", "'%'", "'++'", "'--'", "'!'", "'.'"
    };
    public static final int STMT=21;
    public static final int MINUS=81;
    public static final int CONSTR=12;
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
    public static final int T__96=96;
    public static final int PREINC=28;
    public static final int CBODY=18;
    public static final int MBODY=17;
    public static final int STRINGLITERAL=56;
    public static final int CHARLITERAL=55;
    public static final int PLUS=80;
    public static final int EXTENDS=37;
    public static final int POSTDEC=31;
    public static final int UNARYPLUS=32;
    public static final int SUPER=50;
    public static final int DOUBLELITERAL=54;
    public static final int ARGUMENTS=14;
    public static final int T__89=89;
    public static final int LongSuffix=70;
    public static final int WS=76;
    public static final int CHAR=41;
    public static final int EQ=79;
    public static final int NEW=67;
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
    public static final int COMMENT=77;
    public static final int T__99=99;
    public static final int THIS=49;
    public static final int T__103=103;
    public static final int CLASS=35;
    public static final int METHODCALL=4;
    public static final int T__97=97;
    public static final int RETURN=63;
    public static final int T__105=105;
    public static final int BYTE=42;
    public static final int IF=59;
    public static final int FPARMS=13;
    public static final int EOF=-1;
    public static final int FOR=60;
    public static final int STAR=82;
    public static final int T__102=102;

    // delegates
    // delegators

    public static final String[] ruleNames = new String[] {
        "invalidRule", "assignmentOperator", "forInit", "statement", "classCreatorRest", 
        "variableDeclaratorId", "andExpression", "primary", "statementExpression", 
        "block", "formalParameters", "arrayCreatorRest", "classModifier", 
        "classDeclaration", "fieldDeclaration", "blockStatement", "modifier", 
        "methodBody", "createdName", "synpred1_Ja", "constructorBody", "unaryExpressionNotPlusMinus", 
        "superMemberAccess", "primitiveType", "nonPrimitiveType", "elseStmt", 
        "parExpression", "classBodyDeclaration", "type", "arrayInitializer", 
        "classType", "unaryExpression", "explicitConstructorInvocation", 
        "multiplicativeExpression", "literal", "voidMethodDeclaratorRest", 
        "classBody", "compilationUnit", "variableDeclarator", "localVariableDeclaration", 
        "instanceOfExpression", "arguments", "formalParameterDecls", "expressionList", 
        "methodDeclaration", "localVariableDeclarationStatement", "orExpression", 
        "equalityExpression", "relationalExpression", "forUpdate", "additiveExpression", 
        "memberDeclaration", "variableInitializer", "selector", "expression", 
        "creator"
    };
     
        public int ruleLevel = 0;
        public int getRuleLevel() { return ruleLevel; }
        public void incRuleLevel() { ruleLevel++; }
        public void decRuleLevel() { ruleLevel--; }
        public JaParser(TokenStream input) {
            this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
        }
        public JaParser(TokenStream input, int port, RecognizerSharedState state) {
            super(input, state);
            DebugEventSocketProxy proxy =
                new DebugEventSocketProxy(this,port,adaptor);
            setDebugListener(proxy);
            setTokenStream(new DebugTokenStream(input,proxy));
            try {
                proxy.handshake();
            }
            catch (IOException ioe) {
                reportError(ioe);
            }
            TreeAdaptor adap = new CommonTreeAdaptor();
            setTreeAdaptor(adap);
            proxy.setTreeAdaptor(adap);
        }
    public JaParser(TokenStream input, DebugEventListener dbg) {
        super(input, dbg);

         
        TreeAdaptor adap = new CommonTreeAdaptor();
        setTreeAdaptor(adap);

    }
    protected boolean evalPredicate(boolean result, String predicate) {
        dbg.semanticPredicate(result, predicate);
        return result;
    }

    protected DebugTreeAdaptor adaptor;
    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = new DebugTreeAdaptor(dbg,adaptor);

    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }


    public String[] getTokenNames() { return JaParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g"; }

            
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:47:1: compilationUnit : ( classDeclaration | ';' );
    public final JaParser.compilationUnit_return compilationUnit() throws RecognitionException {
        JaParser.compilationUnit_return retval = new JaParser.compilationUnit_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal2=null;
        JaParser.classDeclaration_return classDeclaration1 = null;


        Object char_literal2_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "compilationUnit");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(47, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:48:5: ( classDeclaration | ';' )
            int alt1=2;
            try { dbg.enterDecision(1);

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

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(1);}

            switch (alt1) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:48:8: classDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(48,24);
                    pushFollow(FOLLOW_classDeclaration_in_compilationUnit158);
                    classDeclaration1=classDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(classDeclaration1.getTree(), root_0);

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:49:7: ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(49,7);
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
        dbg.location(50, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "compilationUnit");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "compilationUnit"

    public static class classDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classDeclaration"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:52:1: classDeclaration : classModifier CLASS IDENTIFIER ( EXTENDS classType )? classBody ;
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

        try { dbg.enterRule(getGrammarFileName(), "classDeclaration");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(52, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:53:5: ( classModifier CLASS IDENTIFIER ( EXTENDS classType )? classBody )
            dbg.enterAlt(1);

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:53:9: classModifier CLASS IDENTIFIER ( EXTENDS classType )? classBody
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(53,22);
            pushFollow(FOLLOW_classModifier_in_classDeclaration191);
            classModifier3=classModifier();

            state._fsp--;
            if (state.failed) return retval;
            dbg.location(53,29);
            CLASS4=(Token)match(input,CLASS,FOLLOW_CLASS_in_classDeclaration194); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CLASS4_tree = (Object)adaptor.create(CLASS4);
            root_0 = (Object)adaptor.becomeRoot(CLASS4_tree, root_0);
            }
            dbg.location(53,31);
            IDENTIFIER5=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classDeclaration197); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER5_tree = (Object)adaptor.create(IDENTIFIER5);
            adaptor.addChild(root_0, IDENTIFIER5_tree);
            }
            dbg.location(53,42);
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
            dbg.location(62,9);
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:62:9: ( EXTENDS classType )?
            int alt2=2;
            try { dbg.enterSubRule(2);
            try { dbg.enterDecision(2);

            int LA2_0 = input.LA(1);

            if ( (LA2_0==EXTENDS) ) {
                alt2=1;
            }
            } finally {dbg.exitDecision(2);}

            switch (alt2) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:62:10: EXTENDS classType
                    {
                    dbg.location(62,17);
                    EXTENDS6=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_classDeclaration210); if (state.failed) return retval;
                    dbg.location(62,19);
                    pushFollow(FOLLOW_classType_in_classDeclaration213);
                    classType7=classType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classType7.getTree());
                    dbg.location(62,29);
                    if ( state.backtracking==0 ) {
                       rt.addSuperType((classType7!=null?classType7.t:null)); 
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(2);}

            dbg.location(63,6);
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
        dbg.location(64, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "classDeclaration");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "classDeclaration"

    public static class classModifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classModifier"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:66:1: classModifier : PUBLIC ;
    public final JaParser.classModifier_return classModifier() throws RecognitionException {
        JaParser.classModifier_return retval = new JaParser.classModifier_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PUBLIC9=null;

        Object PUBLIC9_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "classModifier");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(66, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:67:5: ( PUBLIC )
            dbg.enterAlt(1);

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:67:9: PUBLIC
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(67,9);
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
        dbg.location(68, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "classModifier");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "classModifier"

    public static class classBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classBody"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:70:1: classBody : '{' ( classBodyDeclaration )* '}' ;
    public final JaParser.classBody_return classBody() throws RecognitionException {
        JaParser.classBody_return retval = new JaParser.classBody_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal10=null;
        Token char_literal12=null;
        JaParser.classBodyDeclaration_return classBodyDeclaration11 = null;


        Object char_literal10_tree=null;
        Object char_literal12_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "classBody");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(70, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:71:5: ( '{' ( classBodyDeclaration )* '}' )
            dbg.enterAlt(1);

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:71:9: '{' ( classBodyDeclaration )* '}'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(71,12);
            char_literal10=(Token)match(input,87,FOLLOW_87_in_classBody272); if (state.failed) return retval;
            dbg.location(71,14);
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:71:14: ( classBodyDeclaration )*
            try { dbg.enterSubRule(3);

            loop3:
            do {
                int alt3=2;
                try { dbg.enterDecision(3);

                int LA3_0 = input.LA(1);

                if ( (LA3_0==PUBLIC||LA3_0==PRIVATE||LA3_0==86) ) {
                    alt3=1;
                }


                } finally {dbg.exitDecision(3);}

                switch (alt3) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:71:14: classBodyDeclaration
            	    {
            	    dbg.location(71,14);
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
            } finally {dbg.exitSubRule(3);}

            dbg.location(71,39);
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
        dbg.location(72, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "classBody");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "classBody"

    public static class classBodyDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classBodyDeclaration"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:74:1: classBodyDeclaration : ( ';' | memberDeclaration );
    public final JaParser.classBodyDeclaration_return classBodyDeclaration() throws RecognitionException {
        JaParser.classBodyDeclaration_return retval = new JaParser.classBodyDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal13=null;
        JaParser.memberDeclaration_return memberDeclaration14 = null;


        Object char_literal13_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "classBodyDeclaration");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(74, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:75:5: ( ';' | memberDeclaration )
            int alt4=2;
            try { dbg.enterDecision(4);

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

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(4);}

            switch (alt4) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:75:9: ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(75,12);
                    char_literal13=(Token)match(input,86,FOLLOW_86_in_classBodyDeclaration298); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:76:9: memberDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(76,9);
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
        dbg.location(77, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "classBodyDeclaration");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "classBodyDeclaration"

    public static class memberDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "memberDeclaration"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:79:1: memberDeclaration : ( ( modifier type -> modifier type ) ( methodDeclaration[$modifier.pub, $type.t] -> ^( METHOD $memberDeclaration methodDeclaration ) | fieldDeclaration[(CommonTree)$modifier.tree, (CommonTree)$type.tree, $modifier.pub, $type.t] -> fieldDeclaration ) | modifier VOID IDENTIFIER voidMethodDeclaratorRest[$modifier.pub, VoidType.TYPE, $IDENTIFIER.text] -> ^( METHOD modifier VOID IDENTIFIER voidMethodDeclaratorRest ) | modifier IDENTIFIER formalParameters constructorBody -> ^( CONSTR modifier IDENTIFIER ( formalParameters )? ( constructorBody )? ) );
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
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_VOID=new RewriteRuleTokenStream(adaptor,"token VOID");
        RewriteRuleSubtreeStream stream_formalParameters=new RewriteRuleSubtreeStream(adaptor,"rule formalParameters");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        RewriteRuleSubtreeStream stream_modifier=new RewriteRuleSubtreeStream(adaptor,"rule modifier");
        RewriteRuleSubtreeStream stream_fieldDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule fieldDeclaration");
        RewriteRuleSubtreeStream stream_voidMethodDeclaratorRest=new RewriteRuleSubtreeStream(adaptor,"rule voidMethodDeclaratorRest");
        RewriteRuleSubtreeStream stream_constructorBody=new RewriteRuleSubtreeStream(adaptor,"rule constructorBody");
        RewriteRuleSubtreeStream stream_methodDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule methodDeclaration");
        try { dbg.enterRule(getGrammarFileName(), "memberDeclaration");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(79, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:80:5: ( ( modifier type -> modifier type ) ( methodDeclaration[$modifier.pub, $type.t] -> ^( METHOD $memberDeclaration methodDeclaration ) | fieldDeclaration[(CommonTree)$modifier.tree, (CommonTree)$type.tree, $modifier.pub, $type.t] -> fieldDeclaration ) | modifier VOID IDENTIFIER voidMethodDeclaratorRest[$modifier.pub, VoidType.TYPE, $IDENTIFIER.text] -> ^( METHOD modifier VOID IDENTIFIER voidMethodDeclaratorRest ) | modifier IDENTIFIER formalParameters constructorBody -> ^( CONSTR modifier IDENTIFIER ( formalParameters )? ( constructorBody )? ) )
            int alt6=3;
            try { dbg.enterDecision(6);

            int LA6_0 = input.LA(1);

            if ( (LA6_0==PUBLIC) ) {
                switch ( input.LA(2) ) {
                case IDENTIFIER:
                    {
                    int LA6_3 = input.LA(3);

                    if ( (LA6_3==IDENTIFIER||LA6_3==90) ) {
                        alt6=1;
                    }
                    else if ( (LA6_3==92) ) {
                        alt6=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 3, input);

                        dbg.recognitionException(nvae);
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
                        new NoViableAltException("", 6, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }

            }
            else if ( (LA6_0==PRIVATE) ) {
                switch ( input.LA(2) ) {
                case IDENTIFIER:
                    {
                    int LA6_3 = input.LA(3);

                    if ( (LA6_3==IDENTIFIER||LA6_3==90) ) {
                        alt6=1;
                    }
                    else if ( (LA6_3==92) ) {
                        alt6=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 3, input);

                        dbg.recognitionException(nvae);
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

                    dbg.recognitionException(nvae);
                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(6);}

            switch (alt6) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:80:9: ( modifier type -> modifier type ) ( methodDeclaration[$modifier.pub, $type.t] -> ^( METHOD $memberDeclaration methodDeclaration ) | fieldDeclaration[(CommonTree)$modifier.tree, (CommonTree)$type.tree, $modifier.pub, $type.t] -> fieldDeclaration )
                    {
                    dbg.location(80,9);
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:80:9: ( modifier type -> modifier type )
                    dbg.enterAlt(1);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:80:10: modifier type
                    {
                    dbg.location(80,10);
                    pushFollow(FOLLOW_modifier_in_memberDeclaration333);
                    modifier15=modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_modifier.add(modifier15.getTree());
                    dbg.location(80,19);
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
                        dbg.location(80,27);
                        adaptor.addChild(root_0, stream_modifier.nextTree());
                        dbg.location(80,36);
                        adaptor.addChild(root_0, stream_type.nextTree());

                    }

                    retval.tree = root_0;}
                    }

                    dbg.location(81,7);
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:81:7: ( methodDeclaration[$modifier.pub, $type.t] -> ^( METHOD $memberDeclaration methodDeclaration ) | fieldDeclaration[(CommonTree)$modifier.tree, (CommonTree)$type.tree, $modifier.pub, $type.t] -> fieldDeclaration )
                    int alt5=2;
                    try { dbg.enterSubRule(5);
                    try { dbg.enterDecision(5);

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

                            dbg.recognitionException(nvae);
                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(5);}

                    switch (alt5) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:81:9: methodDeclaration[$modifier.pub, $type.t]
                            {
                            dbg.location(81,9);
                            pushFollow(FOLLOW_methodDeclaration_in_memberDeclaration352);
                            methodDeclaration17=methodDeclaration((modifier15!=null?modifier15.pub:false), (type16!=null?type16.t:null));

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_methodDeclaration.add(methodDeclaration17.getTree());


                            // AST REWRITE
                            // elements: memberDeclaration, methodDeclaration
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
                                dbg.location(81,54);
                                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:81:54: ^( METHOD $memberDeclaration methodDeclaration )
                                {
                                Object root_1 = (Object)adaptor.nil();
                                dbg.location(81,56);
                                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(METHOD, "METHOD"), root_1);

                                dbg.location(81,63);
                                adaptor.addChild(root_1, stream_retval.nextTree());
                                dbg.location(81,82);
                                adaptor.addChild(root_1, stream_methodDeclaration.nextTree());

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;}
                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:82:9: fieldDeclaration[(CommonTree)$modifier.tree, (CommonTree)$type.tree, $modifier.pub, $type.t]
                            {
                            dbg.location(82,9);
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
                                dbg.location(82,105);
                                adaptor.addChild(root_0, stream_fieldDeclaration.nextTree());

                            }

                            retval.tree = root_0;}
                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(5);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:85:9: modifier VOID IDENTIFIER voidMethodDeclaratorRest[$modifier.pub, VoidType.TYPE, $IDENTIFIER.text]
                    {
                    dbg.location(85,9);
                    pushFollow(FOLLOW_modifier_in_memberDeclaration405);
                    modifier19=modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_modifier.add(modifier19.getTree());
                    dbg.location(85,18);
                    VOID20=(Token)match(input,VOID,FOLLOW_VOID_in_memberDeclaration407); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VOID.add(VOID20);

                    dbg.location(85,23);
                    IDENTIFIER21=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_memberDeclaration409); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER21);

                    dbg.location(85,34);
                    pushFollow(FOLLOW_voidMethodDeclaratorRest_in_memberDeclaration411);
                    voidMethodDeclaratorRest22=voidMethodDeclaratorRest((modifier19!=null?modifier19.pub:false), VoidType.TYPE, (IDENTIFIER21!=null?IDENTIFIER21.getText():null));

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_voidMethodDeclaratorRest.add(voidMethodDeclaratorRest22.getTree());


                    // AST REWRITE
                    // elements: modifier, IDENTIFIER, voidMethodDeclaratorRest, VOID
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
                        dbg.location(86,9);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:86:9: ^( METHOD modifier VOID IDENTIFIER voidMethodDeclaratorRest )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(86,11);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(METHOD, "METHOD"), root_1);

                        dbg.location(86,18);
                        adaptor.addChild(root_1, stream_modifier.nextTree());
                        dbg.location(86,27);
                        adaptor.addChild(root_1, stream_VOID.nextNode());
                        dbg.location(86,32);
                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        dbg.location(86,43);
                        adaptor.addChild(root_1, stream_voidMethodDeclaratorRest.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:88:9: modifier IDENTIFIER formalParameters constructorBody
                    {
                    dbg.location(88,9);
                    pushFollow(FOLLOW_modifier_in_memberDeclaration448);
                    modifier23=modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_modifier.add(modifier23.getTree());
                    dbg.location(88,18);
                    IDENTIFIER24=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_memberDeclaration450); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER24);

                    dbg.location(88,29);
                    pushFollow(FOLLOW_formalParameters_in_memberDeclaration452);
                    formalParameters25=formalParameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formalParameters.add(formalParameters25.getTree());
                    dbg.location(88,46);
                    pushFollow(FOLLOW_constructorBody_in_memberDeclaration454);
                    constructorBody26=constructorBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_constructorBody.add(constructorBody26.getTree());
                    dbg.location(89,6);
                    if ( state.backtracking==0 ) {
                       rt.addConstructor((modifier23!=null?modifier23.pub:false), (formalParameters25!=null?formalParameters25.args:null)); 
                    }


                    // AST REWRITE
                    // elements: IDENTIFIER, modifier, constructorBody, formalParameters
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
                        dbg.location(90,9);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:90:9: ^( CONSTR modifier IDENTIFIER ( formalParameters )? ( constructorBody )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(90,11);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONSTR, "CONSTR"), root_1);

                        dbg.location(90,18);
                        adaptor.addChild(root_1, stream_modifier.nextTree());
                        dbg.location(90,27);
                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        dbg.location(90,38);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:90:38: ( formalParameters )?
                        if ( stream_formalParameters.hasNext() ) {
                            dbg.location(90,38);
                            adaptor.addChild(root_1, stream_formalParameters.nextTree());

                        }
                        stream_formalParameters.reset();
                        dbg.location(90,56);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:90:56: ( constructorBody )?
                        if ( stream_constructorBody.hasNext() ) {
                            dbg.location(90,56);
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
        dbg.location(91, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "memberDeclaration");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "memberDeclaration"

    public static class methodDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "methodDeclaration"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:93:1: methodDeclaration[boolean pub, Type t] : IDENTIFIER formalParameters methodBody ;
    public final JaParser.methodDeclaration_return methodDeclaration(boolean pub, Type t) throws RecognitionException {
        JaParser.methodDeclaration_return retval = new JaParser.methodDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENTIFIER27=null;
        JaParser.formalParameters_return formalParameters28 = null;

        JaParser.methodBody_return methodBody29 = null;


        Object IDENTIFIER27_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "methodDeclaration");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(93, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:94:5: ( IDENTIFIER formalParameters methodBody )
            dbg.enterAlt(1);

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:94:9: IDENTIFIER formalParameters methodBody
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(94,9);
            IDENTIFIER27=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_methodDeclaration503); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER27_tree = (Object)adaptor.create(IDENTIFIER27);
            adaptor.addChild(root_0, IDENTIFIER27_tree);
            }
            dbg.location(94,20);
            pushFollow(FOLLOW_formalParameters_in_methodDeclaration505);
            formalParameters28=formalParameters();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, formalParameters28.getTree());
            dbg.location(94,37);
            pushFollow(FOLLOW_methodBody_in_methodDeclaration507);
            methodBody29=methodBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, methodBody29.getTree());
            dbg.location(94,48);
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
        dbg.location(96, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "methodDeclaration");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "methodDeclaration"

    public static class fieldDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fieldDeclaration"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:98:1: fieldDeclaration[CommonTree mod, CommonTree typ, boolean pub, Type t] : v1= variableDeclarator[$typ] ( ',' v2= variableDeclarator[$typ] )* ';' -> ( ^( FIELD variableDeclarator ) )+ ;
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
        try { dbg.enterRule(getGrammarFileName(), "fieldDeclaration");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(98, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:99:5: (v1= variableDeclarator[$typ] ( ',' v2= variableDeclarator[$typ] )* ';' -> ( ^( FIELD variableDeclarator ) )+ )
            dbg.enterAlt(1);

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:99:9: v1= variableDeclarator[$typ] ( ',' v2= variableDeclarator[$typ] )* ';'
            {
            dbg.location(99,11);
            pushFollow(FOLLOW_variableDeclarator_in_fieldDeclaration537);
            v1=variableDeclarator(typ);

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variableDeclarator.add(v1.getTree());
            dbg.location(99,42);
            if ( state.backtracking==0 ) {
               rt.addField((v1!=null?v1.varName:null), ParserHelper.createArrayType(t, (v1!=null?v1.arrayDim:0)), pub); 
            }
            dbg.location(100,9);
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:100:9: ( ',' v2= variableDeclarator[$typ] )*
            try { dbg.enterSubRule(7);

            loop7:
            do {
                int alt7=2;
                try { dbg.enterDecision(7);

                int LA7_0 = input.LA(1);

                if ( (LA7_0==89) ) {
                    alt7=1;
                }


                } finally {dbg.exitDecision(7);}

                switch (alt7) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:100:10: ',' v2= variableDeclarator[$typ]
            	    {
            	    dbg.location(100,10);
            	    char_literal30=(Token)match(input,89,FOLLOW_89_in_fieldDeclaration557); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_89.add(char_literal30);

            	    dbg.location(100,16);
            	    pushFollow(FOLLOW_variableDeclarator_in_fieldDeclaration561);
            	    v2=variableDeclarator(typ);

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_variableDeclarator.add(v2.getTree());
            	    dbg.location(100,42);
            	    if ( state.backtracking==0 ) {
            	       rt.addField((v2!=null?v2.varName:null), ParserHelper.createArrayType(t, (v2!=null?v2.arrayDim:0)), pub); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);
            } finally {dbg.exitSubRule(7);}

            dbg.location(101,12);
            char_literal31=(Token)match(input,86,FOLLOW_86_in_fieldDeclaration578); if (state.failed) return retval; 
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
                dbg.location(102,12);
                if ( !(stream_variableDeclarator.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_variableDeclarator.hasNext() ) {
                    dbg.location(102,12);
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:102:12: ^( FIELD variableDeclarator )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    dbg.location(102,14);
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FIELD, "FIELD"), root_1);

                    dbg.location(102,20);
                    adaptor.addChild(root_1, mod);
                    dbg.location(102,27);
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
        dbg.location(103, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "fieldDeclaration");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "fieldDeclaration"

    public static class voidMethodDeclaratorRest_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "voidMethodDeclaratorRest"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:105:1: voidMethodDeclaratorRest[boolean pub, Type t, String methodName] : formalParameters methodBody ;
    public final JaParser.voidMethodDeclaratorRest_return voidMethodDeclaratorRest(boolean pub, Type t, String methodName) throws RecognitionException {
        JaParser.voidMethodDeclaratorRest_return retval = new JaParser.voidMethodDeclaratorRest_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.formalParameters_return formalParameters32 = null;

        JaParser.methodBody_return methodBody33 = null;



        try { dbg.enterRule(getGrammarFileName(), "voidMethodDeclaratorRest");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(105, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:106:5: ( formalParameters methodBody )
            dbg.enterAlt(1);

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:106:7: formalParameters methodBody
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(106,7);
            pushFollow(FOLLOW_formalParameters_in_voidMethodDeclaratorRest621);
            formalParameters32=formalParameters();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, formalParameters32.getTree());
            dbg.location(106,24);
            pushFollow(FOLLOW_methodBody_in_voidMethodDeclaratorRest623);
            methodBody33=methodBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, methodBody33.getTree());
            dbg.location(106,35);
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
        dbg.location(107, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "voidMethodDeclaratorRest");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:109:1: variableDeclarator[CommonTree typ] returns [String varName, int arrayDim] : variableDeclaratorId[$typ] ( '=' variableInitializer )? ;
    public final JaParser.variableDeclarator_return variableDeclarator(CommonTree typ) throws RecognitionException {
        JaParser.variableDeclarator_return retval = new JaParser.variableDeclarator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal35=null;
        JaParser.variableDeclaratorId_return variableDeclaratorId34 = null;

        JaParser.variableInitializer_return variableInitializer36 = null;


        Object char_literal35_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "variableDeclarator");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(109, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:110:5: ( variableDeclaratorId[$typ] ( '=' variableInitializer )? )
            dbg.enterAlt(1);

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:110:9: variableDeclaratorId[$typ] ( '=' variableInitializer )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(110,9);
            pushFollow(FOLLOW_variableDeclaratorId_in_variableDeclarator649);
            variableDeclaratorId34=variableDeclaratorId(typ);

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaratorId34.getTree());
            dbg.location(110,36);
            if ( state.backtracking==0 ) {
               retval.varName = (variableDeclaratorId34!=null?input.toString(variableDeclaratorId34.start,variableDeclaratorId34.stop):null); retval.arrayDim = (variableDeclaratorId34!=null?variableDeclaratorId34.arrayDim:0); 
            }
            dbg.location(110,123);
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:110:123: ( '=' variableInitializer )?
            int alt8=2;
            try { dbg.enterSubRule(8);
            try { dbg.enterDecision(8);

            int LA8_0 = input.LA(1);

            if ( (LA8_0==EQ) ) {
                alt8=1;
            }
            } finally {dbg.exitDecision(8);}

            switch (alt8) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:110:124: '=' variableInitializer
                    {
                    dbg.location(110,127);
                    char_literal35=(Token)match(input,EQ,FOLLOW_EQ_in_variableDeclarator655); if (state.failed) return retval;
                    dbg.location(110,129);
                    pushFollow(FOLLOW_variableInitializer_in_variableDeclarator658);
                    variableInitializer36=variableInitializer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableInitializer36.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(8);}


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
        dbg.location(111, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "variableDeclarator");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:113:1: variableDeclaratorId[CommonTree typ] returns [int arrayDim] : ( IDENTIFIER ->) (l+= '[' ']' -> ^( ARRAYTYPE $variableDeclaratorId) )* -> $variableDeclaratorId IDENTIFIER ;
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
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");

        try { dbg.enterRule(getGrammarFileName(), "variableDeclaratorId");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(113, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:114:5: ( ( IDENTIFIER ->) (l+= '[' ']' -> ^( ARRAYTYPE $variableDeclaratorId) )* -> $variableDeclaratorId IDENTIFIER )
            dbg.enterAlt(1);

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:114:9: ( IDENTIFIER ->) (l+= '[' ']' -> ^( ARRAYTYPE $variableDeclaratorId) )*
            {
            dbg.location(114,9);
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:114:9: ( IDENTIFIER ->)
            dbg.enterAlt(1);

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:114:10: IDENTIFIER
            {
            dbg.location(114,10);
            IDENTIFIER37=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variableDeclaratorId691); if (state.failed) return retval; 
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
                dbg.location(114,24);
                adaptor.addChild(root_0, typ);

            }

            retval.tree = root_0;}
            }

            dbg.location(114,32);
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:114:32: (l+= '[' ']' -> ^( ARRAYTYPE $variableDeclaratorId) )*
            try { dbg.enterSubRule(9);

            loop9:
            do {
                int alt9=2;
                try { dbg.enterDecision(9);

                int LA9_0 = input.LA(1);

                if ( (LA9_0==90) ) {
                    alt9=1;
                }


                } finally {dbg.exitDecision(9);}

                switch (alt9) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:114:34: l+= '[' ']'
            	    {
            	    dbg.location(114,35);
            	    l=(Token)match(input,90,FOLLOW_90_in_variableDeclaratorId702); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_90.add(l);

            	    if (list_l==null) list_l=new ArrayList();
            	    list_l.add(l);

            	    dbg.location(114,41);
            	    char_literal38=(Token)match(input,91,FOLLOW_91_in_variableDeclaratorId704); if (state.failed) return retval; 
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
            	        dbg.location(114,48);
            	        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:114:48: ^( ARRAYTYPE $variableDeclaratorId)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        dbg.location(114,50);
            	        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAYTYPE, "ARRAYTYPE"), root_1);

            	        dbg.location(114,60);
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
            } finally {dbg.exitSubRule(9);}

            dbg.location(115,6);
            if ( state.backtracking==0 ) {
               if(list_l != null) retval.arrayDim = list_l.size(); 
            }


            // AST REWRITE
            // elements: IDENTIFIER, variableDeclaratorId
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
                dbg.location(116,10);
                adaptor.addChild(root_0, stream_retval.nextTree());
                dbg.location(116,32);
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
        dbg.location(117, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "variableDeclaratorId");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "variableDeclaratorId"

    public static class variableInitializer_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variableInitializer"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:119:1: variableInitializer : ( arrayInitializer | expression );
    public final JaParser.variableInitializer_return variableInitializer() throws RecognitionException {
        JaParser.variableInitializer_return retval = new JaParser.variableInitializer_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.arrayInitializer_return arrayInitializer39 = null;

        JaParser.expression_return expression40 = null;



        try { dbg.enterRule(getGrammarFileName(), "variableInitializer");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(119, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:120:5: ( arrayInitializer | expression )
            int alt10=2;
            try { dbg.enterDecision(10);

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

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(10);}

            switch (alt10) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:120:9: arrayInitializer
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(120,9);
                    pushFollow(FOLLOW_arrayInitializer_in_variableInitializer757);
                    arrayInitializer39=arrayInitializer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayInitializer39.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:121:9: expression
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(121,9);
                    pushFollow(FOLLOW_expression_in_variableInitializer767);
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
        dbg.location(122, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "variableInitializer");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "variableInitializer"

    public static class arrayInitializer_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arrayInitializer"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:124:1: arrayInitializer : lc= '{' ( variableInitializer ( ',' variableInitializer )* ( ',' )? )? '}' -> ^( ARRAYINIT[$lc, \"ARRAYINIT\"] ( variableInitializer )* ) ;
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
        try { dbg.enterRule(getGrammarFileName(), "arrayInitializer");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(124, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:125:5: (lc= '{' ( variableInitializer ( ',' variableInitializer )* ( ',' )? )? '}' -> ^( ARRAYINIT[$lc, \"ARRAYINIT\"] ( variableInitializer )* ) )
            dbg.enterAlt(1);

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:125:9: lc= '{' ( variableInitializer ( ',' variableInitializer )* ( ',' )? )? '}'
            {
            dbg.location(125,11);
            lc=(Token)match(input,87,FOLLOW_87_in_arrayInitializer796); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_87.add(lc);

            dbg.location(125,16);
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:125:16: ( variableInitializer ( ',' variableInitializer )* ( ',' )? )?
            int alt13=2;
            try { dbg.enterSubRule(13);
            try { dbg.enterDecision(13);

            int LA13_0 = input.LA(1);

            if ( (LA13_0==IDENTIFIER||LA13_0==VOID||(LA13_0>=CHAR && LA13_0<=NULLLITERAL)||LA13_0==NEW||(LA13_0>=PLUS && LA13_0<=MINUS)||LA13_0==87||LA13_0==92||(LA13_0>=103 && LA13_0<=105)) ) {
                alt13=1;
            }
            } finally {dbg.exitDecision(13);}

            switch (alt13) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:125:17: variableInitializer ( ',' variableInitializer )* ( ',' )?
                    {
                    dbg.location(125,17);
                    pushFollow(FOLLOW_variableInitializer_in_arrayInitializer799);
                    variableInitializer41=variableInitializer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_variableInitializer.add(variableInitializer41.getTree());
                    dbg.location(125,37);
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:125:37: ( ',' variableInitializer )*
                    try { dbg.enterSubRule(11);

                    loop11:
                    do {
                        int alt11=2;
                        try { dbg.enterDecision(11);

                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==89) ) {
                            int LA11_1 = input.LA(2);

                            if ( (LA11_1==IDENTIFIER||LA11_1==VOID||(LA11_1>=CHAR && LA11_1<=NULLLITERAL)||LA11_1==NEW||(LA11_1>=PLUS && LA11_1<=MINUS)||LA11_1==87||LA11_1==92||(LA11_1>=103 && LA11_1<=105)) ) {
                                alt11=1;
                            }


                        }


                        } finally {dbg.exitDecision(11);}

                        switch (alt11) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:125:38: ',' variableInitializer
                    	    {
                    	    dbg.location(125,38);
                    	    char_literal42=(Token)match(input,89,FOLLOW_89_in_arrayInitializer802); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_89.add(char_literal42);

                    	    dbg.location(125,42);
                    	    pushFollow(FOLLOW_variableInitializer_in_arrayInitializer804);
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
                    } finally {dbg.exitSubRule(11);}

                    dbg.location(125,64);
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:125:64: ( ',' )?
                    int alt12=2;
                    try { dbg.enterSubRule(12);
                    try { dbg.enterDecision(12);

                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==89) ) {
                        alt12=1;
                    }
                    } finally {dbg.exitDecision(12);}

                    switch (alt12) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:125:65: ','
                            {
                            dbg.location(125,65);
                            char_literal44=(Token)match(input,89,FOLLOW_89_in_arrayInitializer809); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_89.add(char_literal44);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(12);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(13);}

            dbg.location(125,74);
            char_literal45=(Token)match(input,88,FOLLOW_88_in_arrayInitializer816); if (state.failed) return retval; 
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
                dbg.location(125,81);
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:125:81: ^( ARRAYINIT[$lc, \"ARRAYINIT\"] ( variableInitializer )* )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(125,83);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAYINIT, lc, "ARRAYINIT"), root_1);

                dbg.location(125,111);
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:125:111: ( variableInitializer )*
                while ( stream_variableInitializer.hasNext() ) {
                    dbg.location(125,111);
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
        dbg.location(126, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "arrayInitializer");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:128:1: modifier returns [boolean pub] : ( PUBLIC | PRIVATE );
    public final JaParser.modifier_return modifier() throws RecognitionException {
        JaParser.modifier_return retval = new JaParser.modifier_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PUBLIC46=null;
        Token PRIVATE47=null;

        Object PUBLIC46_tree=null;
        Object PRIVATE47_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "modifier");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(128, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:129:5: ( PUBLIC | PRIVATE )
            int alt14=2;
            try { dbg.enterDecision(14);

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

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(14);}

            switch (alt14) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:129:9: PUBLIC
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(129,9);
                    PUBLIC46=(Token)match(input,PUBLIC,FOLLOW_PUBLIC_in_modifier850); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PUBLIC46_tree = (Object)adaptor.create(PUBLIC46);
                    adaptor.addChild(root_0, PUBLIC46_tree);
                    }
                    dbg.location(129,17);
                    if ( state.backtracking==0 ) {
                       retval.pub = true;  
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:130:9: PRIVATE
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(130,9);
                    PRIVATE47=(Token)match(input,PRIVATE,FOLLOW_PRIVATE_in_modifier863); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PRIVATE47_tree = (Object)adaptor.create(PRIVATE47);
                    adaptor.addChild(root_0, PRIVATE47_tree);
                    }
                    dbg.location(130,17);
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
        dbg.location(131, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "modifier");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:133:1: type returns [Type t] : ( nonPrimitiveType | primitiveType );
    public final JaParser.type_return type() throws RecognitionException {
        JaParser.type_return retval = new JaParser.type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.nonPrimitiveType_return nonPrimitiveType48 = null;

        JaParser.primitiveType_return primitiveType49 = null;



        try { dbg.enterRule(getGrammarFileName(), "type");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(133, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:134:5: ( nonPrimitiveType | primitiveType )
            int alt15=2;
            try { dbg.enterDecision(15);

            try {
                isCyclicDecision = true;
                alt15 = dfa15.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(15);}

            switch (alt15) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:134:7: nonPrimitiveType
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(134,7);
                    pushFollow(FOLLOW_nonPrimitiveType_in_type886);
                    nonPrimitiveType48=nonPrimitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nonPrimitiveType48.getTree());
                    dbg.location(134,24);
                    if ( state.backtracking==0 ) {
                       retval.t = (nonPrimitiveType48!=null?nonPrimitiveType48.t:null); 
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:135:7: primitiveType
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(135,7);
                    pushFollow(FOLLOW_primitiveType_in_type896);
                    primitiveType49=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType49.getTree());
                    dbg.location(135,23);
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
        dbg.location(136, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "type");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:138:1: nonPrimitiveType returns [ComplexType t] : ( ( classType -> classType ) (l+= '[' ']' -> ^( ARRAYTYPE $nonPrimitiveType) )* | ( primitiveType -> primitiveType ) (l+= '[' ']' -> ^( ARRAYTYPE $nonPrimitiveType) )+ );
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
        try { dbg.enterRule(getGrammarFileName(), "nonPrimitiveType");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(138, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:139:5: ( ( classType -> classType ) (l+= '[' ']' -> ^( ARRAYTYPE $nonPrimitiveType) )* | ( primitiveType -> primitiveType ) (l+= '[' ']' -> ^( ARRAYTYPE $nonPrimitiveType) )+ )
            int alt18=2;
            try { dbg.enterDecision(18);

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

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(18);}

            switch (alt18) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:139:7: ( classType -> classType ) (l+= '[' ']' -> ^( ARRAYTYPE $nonPrimitiveType) )*
                    {
                    dbg.location(139,7);
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:139:7: ( classType -> classType )
                    dbg.enterAlt(1);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:139:8: classType
                    {
                    dbg.location(139,8);
                    pushFollow(FOLLOW_classType_in_nonPrimitiveType923);
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
                        dbg.location(139,25);
                        adaptor.addChild(root_0, stream_classType.nextTree());

                    }

                    retval.tree = root_0;}
                    }

                    dbg.location(139,40);
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:139:40: (l+= '[' ']' -> ^( ARRAYTYPE $nonPrimitiveType) )*
                    try { dbg.enterSubRule(16);

                    loop16:
                    do {
                        int alt16=2;
                        try { dbg.enterDecision(16);

                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==90) ) {
                            alt16=1;
                        }


                        } finally {dbg.exitDecision(16);}

                        switch (alt16) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:139:42: l+= '[' ']'
                    	    {
                    	    dbg.location(139,43);
                    	    l=(Token)match(input,90,FOLLOW_90_in_nonPrimitiveType942); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_90.add(l);

                    	    if (list_l==null) list_l=new ArrayList();
                    	    list_l.add(l);

                    	    dbg.location(139,49);
                    	    char_literal51=(Token)match(input,91,FOLLOW_91_in_nonPrimitiveType944); if (state.failed) return retval; 
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
                    	        dbg.location(139,56);
                    	        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:139:56: ^( ARRAYTYPE $nonPrimitiveType)
                    	        {
                    	        Object root_1 = (Object)adaptor.nil();
                    	        dbg.location(139,58);
                    	        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAYTYPE, "ARRAYTYPE"), root_1);

                    	        dbg.location(139,68);
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
                    } finally {dbg.exitSubRule(16);}

                    dbg.location(140,2);
                    if ( state.backtracking==0 ) {
                       if(list_l != null) retval.t = (ComplexType)ParserHelper.createArrayType((classType50!=null?classType50.t:null),      list_l.size());
                      	  else retval.t = (classType50!=null?classType50.t:null);
                      	
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:144:7: ( primitiveType -> primitiveType ) (l+= '[' ']' -> ^( ARRAYTYPE $nonPrimitiveType) )+
                    {
                    dbg.location(144,7);
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:144:7: ( primitiveType -> primitiveType )
                    dbg.enterAlt(1);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:144:8: primitiveType
                    {
                    dbg.location(144,8);
                    pushFollow(FOLLOW_primitiveType_in_nonPrimitiveType973);
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
                        dbg.location(144,25);
                        adaptor.addChild(root_0, stream_primitiveType.nextTree());

                    }

                    retval.tree = root_0;}
                    }

                    dbg.location(144,40);
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:144:40: (l+= '[' ']' -> ^( ARRAYTYPE $nonPrimitiveType) )+
                    int cnt17=0;
                    try { dbg.enterSubRule(17);

                    loop17:
                    do {
                        int alt17=2;
                        try { dbg.enterDecision(17);

                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==90) ) {
                            alt17=1;
                        }


                        } finally {dbg.exitDecision(17);}

                        switch (alt17) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:144:42: l+= '[' ']'
                    	    {
                    	    dbg.location(144,43);
                    	    l=(Token)match(input,90,FOLLOW_90_in_nonPrimitiveType984); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_90.add(l);

                    	    if (list_l==null) list_l=new ArrayList();
                    	    list_l.add(l);

                    	    dbg.location(144,49);
                    	    char_literal53=(Token)match(input,91,FOLLOW_91_in_nonPrimitiveType986); if (state.failed) return retval; 
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
                    	        dbg.location(144,56);
                    	        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:144:56: ^( ARRAYTYPE $nonPrimitiveType)
                    	        {
                    	        Object root_1 = (Object)adaptor.nil();
                    	        dbg.location(144,58);
                    	        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAYTYPE, "ARRAYTYPE"), root_1);

                    	        dbg.location(144,68);
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
                                dbg.recognitionException(eee);

                                throw eee;
                        }
                        cnt17++;
                    } while (true);
                    } finally {dbg.exitSubRule(17);}

                    dbg.location(145,2);
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
        dbg.location(146, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nonPrimitiveType");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:148:1: classType returns [ReferenceType t] : IDENTIFIER ;
    public final JaParser.classType_return classType() throws RecognitionException {
        JaParser.classType_return retval = new JaParser.classType_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENTIFIER54=null;

        Object IDENTIFIER54_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "classType");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(148, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:149:5: ( IDENTIFIER )
            dbg.enterAlt(1);

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:149:7: IDENTIFIER
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(149,7);
            IDENTIFIER54=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classType1023); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER54_tree = (Object)adaptor.create(IDENTIFIER54);
            adaptor.addChild(root_0, IDENTIFIER54_tree);
            }
            dbg.location(149,18);
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
        dbg.location(157, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "classType");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:159:1: primitiveType returns [BasicType bs] : ( CHAR | BYTE | SHORT | INT | LONG | FLOAT | DOUBLE | BOOLEAN );
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

        try { dbg.enterRule(getGrammarFileName(), "primitiveType");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(159, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:160:5: ( CHAR | BYTE | SHORT | INT | LONG | FLOAT | DOUBLE | BOOLEAN )
            int alt19=8;
            try { dbg.enterDecision(19);

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

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(19);}

            switch (alt19) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:160:9: CHAR
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(160,9);
                    CHAR55=(Token)match(input,CHAR,FOLLOW_CHAR_in_primitiveType1048); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CHAR55_tree = (Object)adaptor.create(CHAR55);
                    adaptor.addChild(root_0, CHAR55_tree);
                    }
                    dbg.location(160,17);
                    if ( state.backtracking==0 ) {
                       retval.bs = BasicType.CHAR;    
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:161:9: BYTE
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(161,9);
                    BYTE56=(Token)match(input,BYTE,FOLLOW_BYTE_in_primitiveType1063); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BYTE56_tree = (Object)adaptor.create(BYTE56);
                    adaptor.addChild(root_0, BYTE56_tree);
                    }
                    dbg.location(161,17);
                    if ( state.backtracking==0 ) {
                       retval.bs = BasicType.BYTE;    
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:162:9: SHORT
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(162,9);
                    SHORT57=(Token)match(input,SHORT,FOLLOW_SHORT_in_primitiveType1078); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SHORT57_tree = (Object)adaptor.create(SHORT57);
                    adaptor.addChild(root_0, SHORT57_tree);
                    }
                    dbg.location(162,17);
                    if ( state.backtracking==0 ) {
                       retval.bs = BasicType.SHORT;   
                    }

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:163:9: INT
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(163,9);
                    INT58=(Token)match(input,INT,FOLLOW_INT_in_primitiveType1092); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT58_tree = (Object)adaptor.create(INT58);
                    adaptor.addChild(root_0, INT58_tree);
                    }
                    dbg.location(163,17);
                    if ( state.backtracking==0 ) {
                       retval.bs = BasicType.INT;     
                    }

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:164:9: LONG
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(164,9);
                    LONG59=(Token)match(input,LONG,FOLLOW_LONG_in_primitiveType1108); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LONG59_tree = (Object)adaptor.create(LONG59);
                    adaptor.addChild(root_0, LONG59_tree);
                    }
                    dbg.location(164,17);
                    if ( state.backtracking==0 ) {
                       retval.bs = BasicType.LONG;    
                    }

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:165:9: FLOAT
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(165,9);
                    FLOAT60=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_primitiveType1123); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FLOAT60_tree = (Object)adaptor.create(FLOAT60);
                    adaptor.addChild(root_0, FLOAT60_tree);
                    }
                    dbg.location(165,17);
                    if ( state.backtracking==0 ) {
                       retval.bs = BasicType.FLOAT;   
                    }

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:166:9: DOUBLE
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(166,9);
                    DOUBLE61=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_primitiveType1137); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOUBLE61_tree = (Object)adaptor.create(DOUBLE61);
                    adaptor.addChild(root_0, DOUBLE61_tree);
                    }
                    dbg.location(166,17);
                    if ( state.backtracking==0 ) {
                       retval.bs = BasicType.DOUBLE;  
                    }

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:167:9: BOOLEAN
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(167,9);
                    BOOLEAN62=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_primitiveType1150); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BOOLEAN62_tree = (Object)adaptor.create(BOOLEAN62);
                    adaptor.addChild(root_0, BOOLEAN62_tree);
                    }
                    dbg.location(167,17);
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
        dbg.location(168, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "primitiveType");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:170:1: formalParameters returns [ArrayList<Type> args] : '(' ( formalParameterDecls[args] )? ')' -> {$formalParameterDecls.tree != null}? ^( FPARMS formalParameterDecls ) ->;
    public final JaParser.formalParameters_return formalParameters() throws RecognitionException {
        JaParser.formalParameters_return retval = new JaParser.formalParameters_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal63=null;
        Token char_literal65=null;
        JaParser.formalParameterDecls_return formalParameterDecls64 = null;


        Object char_literal63_tree=null;
        Object char_literal65_tree=null;
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleSubtreeStream stream_formalParameterDecls=new RewriteRuleSubtreeStream(adaptor,"rule formalParameterDecls");

        	ArrayList<Type> args = new ArrayList<Type>();

        try { dbg.enterRule(getGrammarFileName(), "formalParameters");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(170, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:174:5: ( '(' ( formalParameterDecls[args] )? ')' -> {$formalParameterDecls.tree != null}? ^( FPARMS formalParameterDecls ) ->)
            dbg.enterAlt(1);

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:174:9: '(' ( formalParameterDecls[args] )? ')'
            {
            dbg.location(174,9);
            char_literal63=(Token)match(input,92,FOLLOW_92_in_formalParameters1184); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_92.add(char_literal63);

            dbg.location(174,13);
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:174:13: ( formalParameterDecls[args] )?
            int alt20=2;
            try { dbg.enterSubRule(20);
            try { dbg.enterDecision(20);

            int LA20_0 = input.LA(1);

            if ( (LA20_0==IDENTIFIER||(LA20_0>=CHAR && LA20_0<=BOOLEAN)) ) {
                alt20=1;
            }
            } finally {dbg.exitDecision(20);}

            switch (alt20) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:174:13: formalParameterDecls[args]
                    {
                    dbg.location(174,13);
                    pushFollow(FOLLOW_formalParameterDecls_in_formalParameters1186);
                    formalParameterDecls64=formalParameterDecls(args);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formalParameterDecls.add(formalParameterDecls64.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(20);}

            dbg.location(174,41);
            char_literal65=(Token)match(input,93,FOLLOW_93_in_formalParameters1190); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_93.add(char_literal65);

            dbg.location(174,45);
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
                dbg.location(174,102);
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:174:102: ^( FPARMS formalParameterDecls )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(174,104);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FPARMS, "FPARMS"), root_1);

                dbg.location(174,111);
                adaptor.addChild(root_1, stream_formalParameterDecls.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 175:16: ->
            {
                dbg.location(176,5);
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
        dbg.location(176, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "formalParameters");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "formalParameters"

    public static class formalParameterDecls_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formalParameterDecls"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:178:1: formalParameterDecls[ArrayList<Type> args] : type variableDeclaratorId[(CommonTree)$type.tree] ( ',' formalParameterDecls[args] )? -> ^( FPARM variableDeclaratorId ) ( formalParameterDecls )? ;
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
        try { dbg.enterRule(getGrammarFileName(), "formalParameterDecls");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(178, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:179:5: ( type variableDeclaratorId[(CommonTree)$type.tree] ( ',' formalParameterDecls[args] )? -> ^( FPARM variableDeclaratorId ) ( formalParameterDecls )? )
            dbg.enterAlt(1);

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:179:7: type variableDeclaratorId[(CommonTree)$type.tree] ( ',' formalParameterDecls[args] )?
            {
            dbg.location(179,7);
            pushFollow(FOLLOW_type_in_formalParameterDecls1242);
            type66=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type66.getTree());
            dbg.location(179,12);
            pushFollow(FOLLOW_variableDeclaratorId_in_formalParameterDecls1244);
            variableDeclaratorId67=variableDeclaratorId((CommonTree)(type66!=null?((Object)type66.tree):null));

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variableDeclaratorId.add(variableDeclaratorId67.getTree());
            dbg.location(179,57);
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:179:57: ( ',' formalParameterDecls[args] )?
            int alt21=2;
            try { dbg.enterSubRule(21);
            try { dbg.enterDecision(21);

            int LA21_0 = input.LA(1);

            if ( (LA21_0==89) ) {
                alt21=1;
            }
            } finally {dbg.exitDecision(21);}

            switch (alt21) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:179:58: ',' formalParameterDecls[args]
                    {
                    dbg.location(179,58);
                    char_literal68=(Token)match(input,89,FOLLOW_89_in_formalParameterDecls1248); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_89.add(char_literal68);

                    dbg.location(179,62);
                    pushFollow(FOLLOW_formalParameterDecls_in_formalParameterDecls1250);
                    formalParameterDecls69=formalParameterDecls(args);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formalParameterDecls.add(formalParameterDecls69.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(21);}

            dbg.location(180,6);
            if ( state.backtracking==0 ) {
               args.add(ParserHelper.createArrayType((type66!=null?type66.t:null), (variableDeclaratorId67!=null?variableDeclaratorId67.arrayDim:0))); 
            }


            // AST REWRITE
            // elements: variableDeclaratorId, formalParameterDecls
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
                dbg.location(181,9);
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:181:9: ^( FPARM variableDeclaratorId )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(181,11);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FPARM, "FPARM"), root_1);

                dbg.location(181,17);
                adaptor.addChild(root_1, stream_variableDeclaratorId.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                dbg.location(181,39);
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:181:39: ( formalParameterDecls )?
                if ( stream_formalParameterDecls.hasNext() ) {
                    dbg.location(181,39);
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
        dbg.location(184, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "formalParameterDecls");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "formalParameterDecls"

    public static class methodBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "methodBody"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:186:1: methodBody : block -> ^( MBODY ( block )? ) ;
    public final JaParser.methodBody_return methodBody() throws RecognitionException {
        JaParser.methodBody_return retval = new JaParser.methodBody_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.block_return block70 = null;


        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try { dbg.enterRule(getGrammarFileName(), "methodBody");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(186, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:187:5: ( block -> ^( MBODY ( block )? ) )
            dbg.enterAlt(1);

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:187:9: block
            {
            dbg.location(187,9);
            pushFollow(FOLLOW_block_in_methodBody1307);
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
                dbg.location(187,18);
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:187:18: ^( MBODY ( block )? )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(187,20);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MBODY, "MBODY"), root_1);

                dbg.location(187,26);
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:187:26: ( block )?
                if ( stream_block.hasNext() ) {
                    dbg.location(187,26);
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
        dbg.location(188, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "methodBody");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "methodBody"

    public static class constructorBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constructorBody"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:190:1: constructorBody : '{' ( explicitConstructorInvocation )? ( blockStatement )* '}' -> ^( CBODY ( explicitConstructorInvocation )? ( blockStatement )* ) ;
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
        RewriteRuleSubtreeStream stream_blockStatement=new RewriteRuleSubtreeStream(adaptor,"rule blockStatement");
        RewriteRuleSubtreeStream stream_explicitConstructorInvocation=new RewriteRuleSubtreeStream(adaptor,"rule explicitConstructorInvocation");
        try { dbg.enterRule(getGrammarFileName(), "constructorBody");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(190, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:191:5: ( '{' ( explicitConstructorInvocation )? ( blockStatement )* '}' -> ^( CBODY ( explicitConstructorInvocation )? ( blockStatement )* ) )
            dbg.enterAlt(1);

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:191:10: '{' ( explicitConstructorInvocation )? ( blockStatement )* '}'
            {
            dbg.location(191,10);
            char_literal71=(Token)match(input,87,FOLLOW_87_in_constructorBody1337); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_87.add(char_literal71);

            dbg.location(191,14);
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:191:14: ( explicitConstructorInvocation )?
            int alt22=2;
            try { dbg.enterSubRule(22);
            try { dbg.enterDecision(22);

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
            } finally {dbg.exitDecision(22);}

            switch (alt22) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:191:14: explicitConstructorInvocation
                    {
                    dbg.location(191,14);
                    pushFollow(FOLLOW_explicitConstructorInvocation_in_constructorBody1339);
                    explicitConstructorInvocation72=explicitConstructorInvocation();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_explicitConstructorInvocation.add(explicitConstructorInvocation72.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(22);}

            dbg.location(191,45);
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:191:45: ( blockStatement )*
            try { dbg.enterSubRule(23);

            loop23:
            do {
                int alt23=2;
                try { dbg.enterDecision(23);

                int LA23_0 = input.LA(1);

                if ( (LA23_0==IDENTIFIER||LA23_0==VOID||(LA23_0>=CHAR && LA23_0<=RETURN)||LA23_0==NEW||(LA23_0>=PLUS && LA23_0<=MINUS)||(LA23_0>=86 && LA23_0<=87)||LA23_0==92||(LA23_0>=103 && LA23_0<=105)) ) {
                    alt23=1;
                }


                } finally {dbg.exitDecision(23);}

                switch (alt23) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:191:45: blockStatement
            	    {
            	    dbg.location(191,45);
            	    pushFollow(FOLLOW_blockStatement_in_constructorBody1342);
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
            } finally {dbg.exitSubRule(23);}

            dbg.location(191,61);
            char_literal74=(Token)match(input,88,FOLLOW_88_in_constructorBody1345); if (state.failed) return retval; 
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
                dbg.location(191,68);
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:191:68: ^( CBODY ( explicitConstructorInvocation )? ( blockStatement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(191,70);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CBODY, "CBODY"), root_1);

                dbg.location(191,76);
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:191:76: ( explicitConstructorInvocation )?
                if ( stream_explicitConstructorInvocation.hasNext() ) {
                    dbg.location(191,76);
                    adaptor.addChild(root_1, stream_explicitConstructorInvocation.nextTree());

                }
                stream_explicitConstructorInvocation.reset();
                dbg.location(191,107);
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:191:107: ( blockStatement )*
                while ( stream_blockStatement.hasNext() ) {
                    dbg.location(191,107);
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
        dbg.location(192, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "constructorBody");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "constructorBody"

    public static class explicitConstructorInvocation_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "explicitConstructorInvocation"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:194:1: explicitConstructorInvocation : ( ( THIS -> THIS ) | ( SUPER -> SUPER ) ) arguments ';' -> ^( CONSTRCALL $explicitConstructorInvocation ( arguments )? ) ;
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
        try { dbg.enterRule(getGrammarFileName(), "explicitConstructorInvocation");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(194, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:195:5: ( ( ( THIS -> THIS ) | ( SUPER -> SUPER ) ) arguments ';' -> ^( CONSTRCALL $explicitConstructorInvocation ( arguments )? ) )
            dbg.enterAlt(1);

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:195:9: ( ( THIS -> THIS ) | ( SUPER -> SUPER ) ) arguments ';'
            {
            dbg.location(195,9);
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:195:9: ( ( THIS -> THIS ) | ( SUPER -> SUPER ) )
            int alt24=2;
            try { dbg.enterSubRule(24);
            try { dbg.enterDecision(24);

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

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(24);}

            switch (alt24) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:195:10: ( THIS -> THIS )
                    {
                    dbg.location(195,10);
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:195:10: ( THIS -> THIS )
                    dbg.enterAlt(1);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:195:11: THIS
                    {
                    dbg.location(195,11);
                    THIS75=(Token)match(input,THIS,FOLLOW_THIS_in_explicitConstructorInvocation1378); if (state.failed) return retval; 
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
                        dbg.location(195,19);
                        adaptor.addChild(root_0, stream_THIS.nextNode());

                    }

                    retval.tree = root_0;}
                    }


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:195:27: ( SUPER -> SUPER )
                    {
                    dbg.location(195,27);
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:195:27: ( SUPER -> SUPER )
                    dbg.enterAlt(1);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:195:28: SUPER
                    {
                    dbg.location(195,28);
                    SUPER76=(Token)match(input,SUPER,FOLLOW_SUPER_in_explicitConstructorInvocation1388); if (state.failed) return retval; 
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
                        dbg.location(195,37);
                        adaptor.addChild(root_0, stream_SUPER.nextNode());

                    }

                    retval.tree = root_0;}
                    }


                    }
                    break;

            }
            } finally {dbg.exitSubRule(24);}

            dbg.location(195,45);
            pushFollow(FOLLOW_arguments_in_explicitConstructorInvocation1396);
            arguments77=arguments();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_arguments.add(arguments77.getTree());
            dbg.location(195,55);
            char_literal78=(Token)match(input,86,FOLLOW_86_in_explicitConstructorInvocation1398); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_86.add(char_literal78);



            // AST REWRITE
            // elements: arguments, explicitConstructorInvocation
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
                dbg.location(195,62);
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:195:62: ^( CONSTRCALL $explicitConstructorInvocation ( arguments )? )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(195,64);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONSTRCALL, "CONSTRCALL"), root_1);

                dbg.location(195,75);
                adaptor.addChild(root_1, stream_retval.nextTree());
                dbg.location(195,106);
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:195:106: ( arguments )?
                if ( stream_arguments.hasNext() ) {
                    dbg.location(195,106);
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
        dbg.location(197, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "explicitConstructorInvocation");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "explicitConstructorInvocation"

    public static class literal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "literal"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:199:1: literal : ( INTLITERAL | LONGLITERAL | FLOATLITERAL | DOUBLELITERAL | CHARLITERAL | STRINGLITERAL | BOOLEANLITERAL | NULLLITERAL );
    public final JaParser.literal_return literal() throws RecognitionException {
        JaParser.literal_return retval = new JaParser.literal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set79=null;

        Object set79_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "literal");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(199, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:200:5: ( INTLITERAL | LONGLITERAL | FLOATLITERAL | DOUBLELITERAL | CHARLITERAL | STRINGLITERAL | BOOLEANLITERAL | NULLLITERAL )
            dbg.enterAlt(1);

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(200,5);
            set79=(Token)input.LT(1);
            if ( (input.LA(1)>=INTLITERAL && input.LA(1)<=NULLLITERAL) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set79));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
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
        dbg.location(208, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "literal");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "literal"

    public static class block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "block"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:212:1: block : '{' ( blockStatement )* '}' ;
    public final JaParser.block_return block() throws RecognitionException {
        JaParser.block_return retval = new JaParser.block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal80=null;
        Token char_literal82=null;
        JaParser.blockStatement_return blockStatement81 = null;


        Object char_literal80_tree=null;
        Object char_literal82_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "block");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(212, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:213:5: ( '{' ( blockStatement )* '}' )
            dbg.enterAlt(1);

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:213:9: '{' ( blockStatement )* '}'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(213,12);
            char_literal80=(Token)match(input,87,FOLLOW_87_in_block1522); if (state.failed) return retval;
            dbg.location(213,14);
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:213:14: ( blockStatement )*
            try { dbg.enterSubRule(25);

            loop25:
            do {
                int alt25=2;
                try { dbg.enterDecision(25);

                int LA25_0 = input.LA(1);

                if ( (LA25_0==IDENTIFIER||LA25_0==VOID||(LA25_0>=CHAR && LA25_0<=RETURN)||LA25_0==NEW||(LA25_0>=PLUS && LA25_0<=MINUS)||(LA25_0>=86 && LA25_0<=87)||LA25_0==92||(LA25_0>=103 && LA25_0<=105)) ) {
                    alt25=1;
                }


                } finally {dbg.exitDecision(25);}

                switch (alt25) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:213:14: blockStatement
            	    {
            	    dbg.location(213,14);
            	    pushFollow(FOLLOW_blockStatement_in_block1525);
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
            } finally {dbg.exitSubRule(25);}

            dbg.location(213,33);
            char_literal82=(Token)match(input,88,FOLLOW_88_in_block1528); if (state.failed) return retval;

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
        dbg.location(214, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "block");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "block"

    public static class blockStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "blockStatement"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:216:1: blockStatement : ( localVariableDeclarationStatement | statement );
    public final JaParser.blockStatement_return blockStatement() throws RecognitionException {
        JaParser.blockStatement_return retval = new JaParser.blockStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.localVariableDeclarationStatement_return localVariableDeclarationStatement83 = null;

        JaParser.statement_return statement84 = null;



        try { dbg.enterRule(getGrammarFileName(), "blockStatement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(216, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:217:5: ( localVariableDeclarationStatement | statement )
            int alt26=2;
            try { dbg.enterDecision(26);

            try {
                isCyclicDecision = true;
                alt26 = dfa26.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(26);}

            switch (alt26) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:217:9: localVariableDeclarationStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(217,9);
                    pushFollow(FOLLOW_localVariableDeclarationStatement_in_blockStatement1552);
                    localVariableDeclarationStatement83=localVariableDeclarationStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, localVariableDeclarationStatement83.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:218:9: statement
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(218,9);
                    pushFollow(FOLLOW_statement_in_blockStatement1562);
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
        dbg.location(219, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "blockStatement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "blockStatement"

    public static class localVariableDeclarationStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "localVariableDeclarationStatement"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:221:1: localVariableDeclarationStatement : localVariableDeclaration ';' ;
    public final JaParser.localVariableDeclarationStatement_return localVariableDeclarationStatement() throws RecognitionException {
        JaParser.localVariableDeclarationStatement_return retval = new JaParser.localVariableDeclarationStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal86=null;
        JaParser.localVariableDeclaration_return localVariableDeclaration85 = null;


        Object char_literal86_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "localVariableDeclarationStatement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(221, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:222:5: ( localVariableDeclaration ';' )
            dbg.enterAlt(1);

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:222:7: localVariableDeclaration ';'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(222,7);
            pushFollow(FOLLOW_localVariableDeclaration_in_localVariableDeclarationStatement1583);
            localVariableDeclaration85=localVariableDeclaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, localVariableDeclaration85.getTree());
            dbg.location(222,35);
            char_literal86=(Token)match(input,86,FOLLOW_86_in_localVariableDeclarationStatement1585); if (state.failed) return retval;

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
        dbg.location(223, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "localVariableDeclarationStatement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "localVariableDeclarationStatement"

    public static class localVariableDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "localVariableDeclaration"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:225:1: localVariableDeclaration : type variableDeclarator[(CommonTree)$type.tree] ( ',' variableDeclarator[(CommonTree)$type.tree] )* -> ( ^( VARDECL variableDeclarator ) )+ ;
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
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        RewriteRuleSubtreeStream stream_variableDeclarator=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclarator");
        try { dbg.enterRule(getGrammarFileName(), "localVariableDeclaration");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(225, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:226:5: ( type variableDeclarator[(CommonTree)$type.tree] ( ',' variableDeclarator[(CommonTree)$type.tree] )* -> ( ^( VARDECL variableDeclarator ) )+ )
            dbg.enterAlt(1);

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:226:7: type variableDeclarator[(CommonTree)$type.tree] ( ',' variableDeclarator[(CommonTree)$type.tree] )*
            {
            dbg.location(226,7);
            pushFollow(FOLLOW_type_in_localVariableDeclaration1603);
            type87=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type87.getTree());
            dbg.location(226,12);
            pushFollow(FOLLOW_variableDeclarator_in_localVariableDeclaration1605);
            variableDeclarator88=variableDeclarator((CommonTree)(type87!=null?((Object)type87.tree):null));

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variableDeclarator.add(variableDeclarator88.getTree());
            dbg.location(226,55);
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:226:55: ( ',' variableDeclarator[(CommonTree)$type.tree] )*
            try { dbg.enterSubRule(27);

            loop27:
            do {
                int alt27=2;
                try { dbg.enterDecision(27);

                int LA27_0 = input.LA(1);

                if ( (LA27_0==89) ) {
                    alt27=1;
                }


                } finally {dbg.exitDecision(27);}

                switch (alt27) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:226:56: ',' variableDeclarator[(CommonTree)$type.tree]
            	    {
            	    dbg.location(226,56);
            	    char_literal89=(Token)match(input,89,FOLLOW_89_in_localVariableDeclaration1609); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_89.add(char_literal89);

            	    dbg.location(226,60);
            	    pushFollow(FOLLOW_variableDeclarator_in_localVariableDeclaration1611);
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
            } finally {dbg.exitSubRule(27);}



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
                dbg.location(227,9);
                if ( !(stream_variableDeclarator.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_variableDeclarator.hasNext() ) {
                    dbg.location(227,9);
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:227:9: ^( VARDECL variableDeclarator )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    dbg.location(227,11);
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARDECL, "VARDECL"), root_1);

                    dbg.location(227,19);
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
        dbg.location(228, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "localVariableDeclaration");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "localVariableDeclaration"

    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:231:1: statement : ( block -> ^( BLOCK ( block )? ) | tk= IF parExpression statement elseStmt -> ^( IF ^( CONDITION[$tk, \"CONDITION\"] parExpression ) ( ^( THEN statement ) )? ( elseStmt )? ) | FOR lp= '(' ( forInit )? ';' ( expression )? ';' ( forUpdate )? ')' statement -> ^( FOR ( ^( INIT forInit ) )? ( ^( CONDITION[$lp, \"CONDITION\"] expression ) )? ( ^( UPDATE forUpdate ) )? statement ) | tk= WHILE parExpression statement -> ^( WHILE ^( CONDITION[$tk, \"CONDITION\"] parExpression ) statement ) | DO statement tk= WHILE parExpression ';' -> ^( DOWHILE ^( CONDITION[$tk, \"CONDITION\"] parExpression ) statement ) | RETURN ( expression )? ';' | ';' | statementExpression ';' -> ^( STMT statementExpression ) );
    public final JaParser.statement_return statement() throws RecognitionException {
        JaParser.statement_return retval = new JaParser.statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token tk=null;
        Token lp=null;
        Token FOR95=null;
        Token char_literal97=null;
        Token char_literal99=null;
        Token char_literal101=null;
        Token DO105=null;
        Token char_literal108=null;
        Token RETURN109=null;
        Token char_literal111=null;
        Token char_literal112=null;
        Token char_literal114=null;
        JaParser.block_return block91 = null;

        JaParser.parExpression_return parExpression92 = null;

        JaParser.statement_return statement93 = null;

        JaParser.elseStmt_return elseStmt94 = null;

        JaParser.forInit_return forInit96 = null;

        JaParser.expression_return expression98 = null;

        JaParser.forUpdate_return forUpdate100 = null;

        JaParser.statement_return statement102 = null;

        JaParser.parExpression_return parExpression103 = null;

        JaParser.statement_return statement104 = null;

        JaParser.statement_return statement106 = null;

        JaParser.parExpression_return parExpression107 = null;

        JaParser.expression_return expression110 = null;

        JaParser.statementExpression_return statementExpression113 = null;


        Object tk_tree=null;
        Object lp_tree=null;
        Object FOR95_tree=null;
        Object char_literal97_tree=null;
        Object char_literal99_tree=null;
        Object char_literal101_tree=null;
        Object DO105_tree=null;
        Object char_literal108_tree=null;
        Object RETURN109_tree=null;
        Object char_literal111_tree=null;
        Object char_literal112_tree=null;
        Object char_literal114_tree=null;
        RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
        RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleSubtreeStream stream_parExpression=new RewriteRuleSubtreeStream(adaptor,"rule parExpression");
        RewriteRuleSubtreeStream stream_statementExpression=new RewriteRuleSubtreeStream(adaptor,"rule statementExpression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_forUpdate=new RewriteRuleSubtreeStream(adaptor,"rule forUpdate");
        RewriteRuleSubtreeStream stream_forInit=new RewriteRuleSubtreeStream(adaptor,"rule forInit");
        RewriteRuleSubtreeStream stream_elseStmt=new RewriteRuleSubtreeStream(adaptor,"rule elseStmt");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try { dbg.enterRule(getGrammarFileName(), "statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(231, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:232:5: ( block -> ^( BLOCK ( block )? ) | tk= IF parExpression statement elseStmt -> ^( IF ^( CONDITION[$tk, \"CONDITION\"] parExpression ) ( ^( THEN statement ) )? ( elseStmt )? ) | FOR lp= '(' ( forInit )? ';' ( expression )? ';' ( forUpdate )? ')' statement -> ^( FOR ( ^( INIT forInit ) )? ( ^( CONDITION[$lp, \"CONDITION\"] expression ) )? ( ^( UPDATE forUpdate ) )? statement ) | tk= WHILE parExpression statement -> ^( WHILE ^( CONDITION[$tk, \"CONDITION\"] parExpression ) statement ) | DO statement tk= WHILE parExpression ';' -> ^( DOWHILE ^( CONDITION[$tk, \"CONDITION\"] parExpression ) statement ) | RETURN ( expression )? ';' | ';' | statementExpression ';' -> ^( STMT statementExpression ) )
            int alt32=8;
            try { dbg.enterDecision(32);

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

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(32);}

            switch (alt32) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:232:9: block
                    {
                    dbg.location(232,9);
                    pushFollow(FOLLOW_block_in_statement1652);
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
                        dbg.location(232,18);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:232:18: ^( BLOCK ( block )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(232,20);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);

                        dbg.location(232,26);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:232:26: ( block )?
                        if ( stream_block.hasNext() ) {
                            dbg.location(232,26);
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
                    dbg.enterAlt(2);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:233:9: tk= IF parExpression statement elseStmt
                    {
                    dbg.location(233,11);
                    tk=(Token)match(input,IF,FOLLOW_IF_in_statement1673); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(tk);

                    dbg.location(233,15);
                    pushFollow(FOLLOW_parExpression_in_statement1675);
                    parExpression92=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression92.getTree());
                    dbg.location(233,29);
                    pushFollow(FOLLOW_statement_in_statement1677);
                    statement93=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement93.getTree());
                    dbg.location(233,39);
                    pushFollow(FOLLOW_elseStmt_in_statement1679);
                    elseStmt94=elseStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_elseStmt.add(elseStmt94.getTree());


                    // AST REWRITE
                    // elements: statement, IF, elseStmt, parExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 233:48: -> ^( IF ^( CONDITION[$tk, \"CONDITION\"] parExpression ) ( ^( THEN statement ) )? ( elseStmt )? )
                    {
                        dbg.location(233,51);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:233:51: ^( IF ^( CONDITION[$tk, \"CONDITION\"] parExpression ) ( ^( THEN statement ) )? ( elseStmt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(233,53);
                        root_1 = (Object)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                        dbg.location(233,56);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:233:56: ^( CONDITION[$tk, \"CONDITION\"] parExpression )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(233,58);
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONDITION, tk, "CONDITION"), root_2);

                        dbg.location(233,86);
                        adaptor.addChild(root_2, stream_parExpression.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        dbg.location(233,101);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:233:101: ( ^( THEN statement ) )?
                        if ( stream_statement.hasNext() ) {
                            dbg.location(233,102);
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:233:102: ^( THEN statement )
                            {
                            Object root_2 = (Object)adaptor.nil();
                            dbg.location(233,104);
                            root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(THEN, "THEN"), root_2);

                            dbg.location(233,109);
                            adaptor.addChild(root_2, stream_statement.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_statement.reset();
                        dbg.location(233,122);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:233:122: ( elseStmt )?
                        if ( stream_elseStmt.hasNext() ) {
                            dbg.location(233,122);
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
                    dbg.enterAlt(3);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:234:9: FOR lp= '(' ( forInit )? ';' ( expression )? ';' ( forUpdate )? ')' statement
                    {
                    dbg.location(234,9);
                    FOR95=(Token)match(input,FOR,FOLLOW_FOR_in_statement1714); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOR.add(FOR95);

                    dbg.location(234,15);
                    lp=(Token)match(input,92,FOLLOW_92_in_statement1718); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_92.add(lp);

                    dbg.location(234,20);
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:234:20: ( forInit )?
                    int alt28=2;
                    try { dbg.enterSubRule(28);
                    try { dbg.enterDecision(28);

                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==IDENTIFIER||LA28_0==VOID||(LA28_0>=CHAR && LA28_0<=NULLLITERAL)||LA28_0==NEW||(LA28_0>=PLUS && LA28_0<=MINUS)||LA28_0==92||(LA28_0>=103 && LA28_0<=105)) ) {
                        alt28=1;
                    }
                    } finally {dbg.exitDecision(28);}

                    switch (alt28) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:234:20: forInit
                            {
                            dbg.location(234,20);
                            pushFollow(FOLLOW_forInit_in_statement1720);
                            forInit96=forInit();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_forInit.add(forInit96.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(28);}

                    dbg.location(234,29);
                    char_literal97=(Token)match(input,86,FOLLOW_86_in_statement1723); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_86.add(char_literal97);

                    dbg.location(234,33);
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:234:33: ( expression )?
                    int alt29=2;
                    try { dbg.enterSubRule(29);
                    try { dbg.enterDecision(29);

                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==IDENTIFIER||LA29_0==VOID||(LA29_0>=CHAR && LA29_0<=NULLLITERAL)||LA29_0==NEW||(LA29_0>=PLUS && LA29_0<=MINUS)||LA29_0==92||(LA29_0>=103 && LA29_0<=105)) ) {
                        alt29=1;
                    }
                    } finally {dbg.exitDecision(29);}

                    switch (alt29) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:234:33: expression
                            {
                            dbg.location(234,33);
                            pushFollow(FOLLOW_expression_in_statement1725);
                            expression98=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(expression98.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(29);}

                    dbg.location(234,45);
                    char_literal99=(Token)match(input,86,FOLLOW_86_in_statement1728); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_86.add(char_literal99);

                    dbg.location(234,49);
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:234:49: ( forUpdate )?
                    int alt30=2;
                    try { dbg.enterSubRule(30);
                    try { dbg.enterDecision(30);

                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==IDENTIFIER||LA30_0==VOID||(LA30_0>=CHAR && LA30_0<=NULLLITERAL)||LA30_0==NEW||(LA30_0>=PLUS && LA30_0<=MINUS)||LA30_0==92||(LA30_0>=103 && LA30_0<=105)) ) {
                        alt30=1;
                    }
                    } finally {dbg.exitDecision(30);}

                    switch (alt30) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:234:49: forUpdate
                            {
                            dbg.location(234,49);
                            pushFollow(FOLLOW_forUpdate_in_statement1730);
                            forUpdate100=forUpdate();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_forUpdate.add(forUpdate100.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(30);}

                    dbg.location(234,60);
                    char_literal101=(Token)match(input,93,FOLLOW_93_in_statement1733); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_93.add(char_literal101);

                    dbg.location(234,64);
                    pushFollow(FOLLOW_statement_in_statement1735);
                    statement102=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement102.getTree());


                    // AST REWRITE
                    // elements: forInit, statement, FOR, expression, forUpdate
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 235:7: -> ^( FOR ( ^( INIT forInit ) )? ( ^( CONDITION[$lp, \"CONDITION\"] expression ) )? ( ^( UPDATE forUpdate ) )? statement )
                    {
                        dbg.location(235,10);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:235:10: ^( FOR ( ^( INIT forInit ) )? ( ^( CONDITION[$lp, \"CONDITION\"] expression ) )? ( ^( UPDATE forUpdate ) )? statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(235,12);
                        root_1 = (Object)adaptor.becomeRoot(stream_FOR.nextNode(), root_1);

                        dbg.location(235,16);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:235:16: ( ^( INIT forInit ) )?
                        if ( stream_forInit.hasNext() ) {
                            dbg.location(235,16);
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:235:16: ^( INIT forInit )
                            {
                            Object root_2 = (Object)adaptor.nil();
                            dbg.location(235,18);
                            root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(INIT, "INIT"), root_2);

                            dbg.location(235,23);
                            adaptor.addChild(root_2, stream_forInit.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_forInit.reset();
                        dbg.location(235,33);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:235:33: ( ^( CONDITION[$lp, \"CONDITION\"] expression ) )?
                        if ( stream_expression.hasNext() ) {
                            dbg.location(235,33);
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:235:33: ^( CONDITION[$lp, \"CONDITION\"] expression )
                            {
                            Object root_2 = (Object)adaptor.nil();
                            dbg.location(235,35);
                            root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONDITION, lp, "CONDITION"), root_2);

                            dbg.location(235,63);
                            adaptor.addChild(root_2, stream_expression.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_expression.reset();
                        dbg.location(235,76);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:235:76: ( ^( UPDATE forUpdate ) )?
                        if ( stream_forUpdate.hasNext() ) {
                            dbg.location(235,76);
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:235:76: ^( UPDATE forUpdate )
                            {
                            Object root_2 = (Object)adaptor.nil();
                            dbg.location(235,78);
                            root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(UPDATE, "UPDATE"), root_2);

                            dbg.location(235,85);
                            adaptor.addChild(root_2, stream_forUpdate.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_forUpdate.reset();
                        dbg.location(235,97);
                        adaptor.addChild(root_1, stream_statement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:236:9: tk= WHILE parExpression statement
                    {
                    dbg.location(236,11);
                    tk=(Token)match(input,WHILE,FOLLOW_WHILE_in_statement1789); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE.add(tk);

                    dbg.location(236,18);
                    pushFollow(FOLLOW_parExpression_in_statement1791);
                    parExpression103=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression103.getTree());
                    dbg.location(236,32);
                    pushFollow(FOLLOW_statement_in_statement1793);
                    statement104=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement104.getTree());


                    // AST REWRITE
                    // elements: parExpression, WHILE, statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 236:42: -> ^( WHILE ^( CONDITION[$tk, \"CONDITION\"] parExpression ) statement )
                    {
                        dbg.location(236,45);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:236:45: ^( WHILE ^( CONDITION[$tk, \"CONDITION\"] parExpression ) statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(236,47);
                        root_1 = (Object)adaptor.becomeRoot(stream_WHILE.nextNode(), root_1);

                        dbg.location(236,53);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:236:53: ^( CONDITION[$tk, \"CONDITION\"] parExpression )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(236,55);
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONDITION, tk, "CONDITION"), root_2);

                        dbg.location(236,83);
                        adaptor.addChild(root_2, stream_parExpression.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        dbg.location(236,98);
                        adaptor.addChild(root_1, stream_statement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:237:9: DO statement tk= WHILE parExpression ';'
                    {
                    dbg.location(237,9);
                    DO105=(Token)match(input,DO,FOLLOW_DO_in_statement1818); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DO.add(DO105);

                    dbg.location(237,12);
                    pushFollow(FOLLOW_statement_in_statement1820);
                    statement106=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement106.getTree());
                    dbg.location(237,24);
                    tk=(Token)match(input,WHILE,FOLLOW_WHILE_in_statement1824); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE.add(tk);

                    dbg.location(237,31);
                    pushFollow(FOLLOW_parExpression_in_statement1826);
                    parExpression107=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression107.getTree());
                    dbg.location(237,45);
                    char_literal108=(Token)match(input,86,FOLLOW_86_in_statement1828); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_86.add(char_literal108);



                    // AST REWRITE
                    // elements: statement, parExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 237:49: -> ^( DOWHILE ^( CONDITION[$tk, \"CONDITION\"] parExpression ) statement )
                    {
                        dbg.location(237,52);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:237:52: ^( DOWHILE ^( CONDITION[$tk, \"CONDITION\"] parExpression ) statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(237,54);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DOWHILE, "DOWHILE"), root_1);

                        dbg.location(237,62);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:237:62: ^( CONDITION[$tk, \"CONDITION\"] parExpression )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(237,64);
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONDITION, tk, "CONDITION"), root_2);

                        dbg.location(237,92);
                        adaptor.addChild(root_2, stream_parExpression.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        dbg.location(237,107);
                        adaptor.addChild(root_1, stream_statement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:238:9: RETURN ( expression )? ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(238,15);
                    RETURN109=(Token)match(input,RETURN,FOLLOW_RETURN_in_statement1853); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RETURN109_tree = (Object)adaptor.create(RETURN109);
                    root_0 = (Object)adaptor.becomeRoot(RETURN109_tree, root_0);
                    }
                    dbg.location(238,17);
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:238:17: ( expression )?
                    int alt31=2;
                    try { dbg.enterSubRule(31);
                    try { dbg.enterDecision(31);

                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==IDENTIFIER||LA31_0==VOID||(LA31_0>=CHAR && LA31_0<=NULLLITERAL)||LA31_0==NEW||(LA31_0>=PLUS && LA31_0<=MINUS)||LA31_0==92||(LA31_0>=103 && LA31_0<=105)) ) {
                        alt31=1;
                    }
                    } finally {dbg.exitDecision(31);}

                    switch (alt31) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:238:17: expression
                            {
                            dbg.location(238,17);
                            pushFollow(FOLLOW_expression_in_statement1856);
                            expression110=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression110.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(31);}

                    dbg.location(238,32);
                    char_literal111=(Token)match(input,86,FOLLOW_86_in_statement1859); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:239:9: ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(239,12);
                    char_literal112=(Token)match(input,86,FOLLOW_86_in_statement1870); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:240:9: statementExpression ';'
                    {
                    dbg.location(240,9);
                    pushFollow(FOLLOW_statementExpression_in_statement1882);
                    statementExpression113=statementExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementExpression.add(statementExpression113.getTree());
                    dbg.location(240,29);
                    char_literal114=(Token)match(input,86,FOLLOW_86_in_statement1884); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_86.add(char_literal114);



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
                        dbg.location(240,36);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:240:36: ^( STMT statementExpression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(240,38);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(STMT, "STMT"), root_1);

                        dbg.location(240,43);
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
        dbg.location(241, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "statement"

    public static class elseStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elseStmt"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:243:1: elseStmt : ( ( ELSE )=> ELSE statement | );
    public final JaParser.elseStmt_return elseStmt() throws RecognitionException {
        JaParser.elseStmt_return retval = new JaParser.elseStmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ELSE115=null;
        JaParser.statement_return statement116 = null;


        Object ELSE115_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "elseStmt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(243, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:244:5: ( ( ELSE )=> ELSE statement | )
            int alt33=2;
            try { dbg.enterDecision(33);

            int LA33_0 = input.LA(1);

            if ( (LA33_0==ELSE) ) {
                int LA33_1 = input.LA(2);

                if ( (synpred1_Ja()) ) {
                    alt33=1;
                }
                else if ( (true) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 1, input);

                    dbg.recognitionException(nvae);
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

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(33);}

            switch (alt33) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:244:7: ( ELSE )=> ELSE statement
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(244,21);
                    ELSE115=(Token)match(input,ELSE,FOLLOW_ELSE_in_elseStmt1919); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ELSE115_tree = (Object)adaptor.create(ELSE115);
                    root_0 = (Object)adaptor.becomeRoot(ELSE115_tree, root_0);
                    }
                    dbg.location(244,23);
                    pushFollow(FOLLOW_statement_in_elseStmt1922);
                    statement116=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement116.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:246:5: 
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
        dbg.location(246, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "elseStmt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "elseStmt"

    public static class forInit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forInit"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:248:1: forInit : ( localVariableDeclaration | expressionList );
    public final JaParser.forInit_return forInit() throws RecognitionException {
        JaParser.forInit_return retval = new JaParser.forInit_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.localVariableDeclaration_return localVariableDeclaration117 = null;

        JaParser.expressionList_return expressionList118 = null;



        try { dbg.enterRule(getGrammarFileName(), "forInit");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(248, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:249:5: ( localVariableDeclaration | expressionList )
            int alt34=2;
            try { dbg.enterDecision(34);

            try {
                isCyclicDecision = true;
                alt34 = dfa34.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(34);}

            switch (alt34) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:249:9: localVariableDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(249,9);
                    pushFollow(FOLLOW_localVariableDeclaration_in_forInit1947);
                    localVariableDeclaration117=localVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, localVariableDeclaration117.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:250:9: expressionList
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(250,9);
                    pushFollow(FOLLOW_expressionList_in_forInit1957);
                    expressionList118=expressionList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList118.getTree());

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
        dbg.location(251, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "forInit");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "forInit"

    public static class forUpdate_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forUpdate"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:253:1: forUpdate : expressionList ;
    public final JaParser.forUpdate_return forUpdate() throws RecognitionException {
        JaParser.forUpdate_return retval = new JaParser.forUpdate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.expressionList_return expressionList119 = null;



        try { dbg.enterRule(getGrammarFileName(), "forUpdate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(253, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:254:5: ( expressionList )
            dbg.enterAlt(1);

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:254:9: expressionList
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(254,9);
            pushFollow(FOLLOW_expressionList_in_forUpdate1976);
            expressionList119=expressionList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList119.getTree());

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
        dbg.location(255, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "forUpdate");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "forUpdate"

    public static class parExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parExpression"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:257:1: parExpression : '(' expression ')' ;
    public final JaParser.parExpression_return parExpression() throws RecognitionException {
        JaParser.parExpression_return retval = new JaParser.parExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal120=null;
        Token char_literal122=null;
        JaParser.expression_return expression121 = null;


        Object char_literal120_tree=null;
        Object char_literal122_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "parExpression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(257, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:258:5: ( '(' expression ')' )
            dbg.enterAlt(1);

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:258:9: '(' expression ')'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(258,12);
            char_literal120=(Token)match(input,92,FOLLOW_92_in_parExpression1995); if (state.failed) return retval;
            dbg.location(258,14);
            pushFollow(FOLLOW_expression_in_parExpression1998);
            expression121=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression121.getTree());
            dbg.location(258,28);
            char_literal122=(Token)match(input,93,FOLLOW_93_in_parExpression2000); if (state.failed) return retval;

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
        dbg.location(259, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "parExpression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "parExpression"

    public static class expressionList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expressionList"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:261:1: expressionList : expression ( ',' expression )* ;
    public final JaParser.expressionList_return expressionList() throws RecognitionException {
        JaParser.expressionList_return retval = new JaParser.expressionList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal124=null;
        JaParser.expression_return expression123 = null;

        JaParser.expression_return expression125 = null;


        Object char_literal124_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "expressionList");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(261, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:262:5: ( expression ( ',' expression )* )
            dbg.enterAlt(1);

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:262:9: expression ( ',' expression )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(262,9);
            pushFollow(FOLLOW_expression_in_expressionList2024);
            expression123=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression123.getTree());
            dbg.location(262,20);
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:262:20: ( ',' expression )*
            try { dbg.enterSubRule(35);

            loop35:
            do {
                int alt35=2;
                try { dbg.enterDecision(35);

                int LA35_0 = input.LA(1);

                if ( (LA35_0==89) ) {
                    alt35=1;
                }


                } finally {dbg.exitDecision(35);}

                switch (alt35) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:262:21: ',' expression
            	    {
            	    dbg.location(262,24);
            	    char_literal124=(Token)match(input,89,FOLLOW_89_in_expressionList2027); if (state.failed) return retval;
            	    dbg.location(262,26);
            	    pushFollow(FOLLOW_expression_in_expressionList2030);
            	    expression125=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression125.getTree());

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);
            } finally {dbg.exitSubRule(35);}


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
        dbg.location(263, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expressionList");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "expressionList"

    public static class statementExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statementExpression"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:265:1: statementExpression : expression ;
    public final JaParser.statementExpression_return statementExpression() throws RecognitionException {
        JaParser.statementExpression_return retval = new JaParser.statementExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.expression_return expression126 = null;



        try { dbg.enterRule(getGrammarFileName(), "statementExpression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(265, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:266:5: ( expression )
            dbg.enterAlt(1);

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:266:9: expression
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(266,9);
            pushFollow(FOLLOW_expression_in_statementExpression2051);
            expression126=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression126.getTree());

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
        dbg.location(267, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "statementExpression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "statementExpression"

    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:269:1: expression : orExpression (ap= assignmentOperator expression )? -> {$ap.c == '='}? ^( EQ[$ap.tk, \"=\"] orExpression expression ) -> {$ap.c == '+'}? ^( EQ[$ap.tk, \"=\"] orExpression ^( PLUS[$ap.tk, \"+\"] orExpression expression ) ) -> {$ap.c == '-'}? ^( EQ[$ap.tk, \"=\"] orExpression ^( MINUS[$ap.tk, \"-\"] orExpression expression ) ) -> {$ap.c == '*'}? ^( EQ[$ap.tk, \"=\"] orExpression ^( STAR[$ap.tk, \"*\"] orExpression expression ) ) -> {$ap.c == '/'}? ^( EQ[$ap.tk, \"=\"] orExpression ^( SLASH[$ap.tk, \"/\"] orExpression expression ) ) -> orExpression ;
    public final JaParser.expression_return expression() throws RecognitionException {
        JaParser.expression_return retval = new JaParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.assignmentOperator_return ap = null;

        JaParser.orExpression_return orExpression127 = null;

        JaParser.expression_return expression128 = null;


        RewriteRuleSubtreeStream stream_assignmentOperator=new RewriteRuleSubtreeStream(adaptor,"rule assignmentOperator");
        RewriteRuleSubtreeStream stream_orExpression=new RewriteRuleSubtreeStream(adaptor,"rule orExpression");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try { dbg.enterRule(getGrammarFileName(), "expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(269, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:270:5: ( orExpression (ap= assignmentOperator expression )? -> {$ap.c == '='}? ^( EQ[$ap.tk, \"=\"] orExpression expression ) -> {$ap.c == '+'}? ^( EQ[$ap.tk, \"=\"] orExpression ^( PLUS[$ap.tk, \"+\"] orExpression expression ) ) -> {$ap.c == '-'}? ^( EQ[$ap.tk, \"=\"] orExpression ^( MINUS[$ap.tk, \"-\"] orExpression expression ) ) -> {$ap.c == '*'}? ^( EQ[$ap.tk, \"=\"] orExpression ^( STAR[$ap.tk, \"*\"] orExpression expression ) ) -> {$ap.c == '/'}? ^( EQ[$ap.tk, \"=\"] orExpression ^( SLASH[$ap.tk, \"/\"] orExpression expression ) ) -> orExpression )
            dbg.enterAlt(1);

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:270:8: orExpression (ap= assignmentOperator expression )?
            {
            dbg.location(270,8);
            pushFollow(FOLLOW_orExpression_in_expression2070);
            orExpression127=orExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_orExpression.add(orExpression127.getTree());
            dbg.location(270,21);
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:270:21: (ap= assignmentOperator expression )?
            int alt36=2;
            try { dbg.enterSubRule(36);
            try { dbg.enterDecision(36);

            int LA36_0 = input.LA(1);

            if ( (LA36_0==EQ||(LA36_0>=94 && LA36_0<=97)) ) {
                alt36=1;
            }
            } finally {dbg.exitDecision(36);}

            switch (alt36) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:270:23: ap= assignmentOperator expression
                    {
                    dbg.location(270,25);
                    pushFollow(FOLLOW_assignmentOperator_in_expression2076);
                    ap=assignmentOperator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_assignmentOperator.add(ap.getTree());
                    dbg.location(270,45);
                    pushFollow(FOLLOW_expression_in_expression2078);
                    expression128=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression128.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(36);}



            // AST REWRITE
            // elements: orExpression, orExpression, orExpression, expression, orExpression, orExpression, orExpression, expression, expression, expression, orExpression, orExpression, orExpression, expression, orExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 270:58: -> {$ap.c == '='}? ^( EQ[$ap.tk, \"=\"] orExpression expression )
            if ((ap!=null?ap.c:0) == '=') {
                dbg.location(270,77);
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:270:77: ^( EQ[$ap.tk, \"=\"] orExpression expression )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(270,79);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EQ, (ap!=null?ap.tk:null), "="), root_1);

                dbg.location(270,95);
                adaptor.addChild(root_1, stream_orExpression.nextTree());
                dbg.location(270,108);
                adaptor.addChild(root_1, stream_expression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 271:13: -> {$ap.c == '+'}? ^( EQ[$ap.tk, \"=\"] orExpression ^( PLUS[$ap.tk, \"+\"] orExpression expression ) )
            if ((ap!=null?ap.c:0) == '+') {
                dbg.location(271,32);
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:271:32: ^( EQ[$ap.tk, \"=\"] orExpression ^( PLUS[$ap.tk, \"+\"] orExpression expression ) )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(271,34);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EQ, (ap!=null?ap.tk:null), "="), root_1);

                dbg.location(271,50);
                adaptor.addChild(root_1, stream_orExpression.nextTree());
                dbg.location(271,63);
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:271:63: ^( PLUS[$ap.tk, \"+\"] orExpression expression )
                {
                Object root_2 = (Object)adaptor.nil();
                dbg.location(271,65);
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(PLUS, (ap!=null?ap.tk:null), "+"), root_2);

                dbg.location(271,84);
                adaptor.addChild(root_2, stream_orExpression.nextTree());
                dbg.location(271,97);
                adaptor.addChild(root_2, stream_expression.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 272:13: -> {$ap.c == '-'}? ^( EQ[$ap.tk, \"=\"] orExpression ^( MINUS[$ap.tk, \"-\"] orExpression expression ) )
            if ((ap!=null?ap.c:0) == '-') {
                dbg.location(272,32);
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:272:32: ^( EQ[$ap.tk, \"=\"] orExpression ^( MINUS[$ap.tk, \"-\"] orExpression expression ) )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(272,34);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EQ, (ap!=null?ap.tk:null), "="), root_1);

                dbg.location(272,50);
                adaptor.addChild(root_1, stream_orExpression.nextTree());
                dbg.location(272,63);
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:272:63: ^( MINUS[$ap.tk, \"-\"] orExpression expression )
                {
                Object root_2 = (Object)adaptor.nil();
                dbg.location(272,65);
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(MINUS, (ap!=null?ap.tk:null), "-"), root_2);

                dbg.location(272,84);
                adaptor.addChild(root_2, stream_orExpression.nextTree());
                dbg.location(272,97);
                adaptor.addChild(root_2, stream_expression.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 273:13: -> {$ap.c == '*'}? ^( EQ[$ap.tk, \"=\"] orExpression ^( STAR[$ap.tk, \"*\"] orExpression expression ) )
            if ((ap!=null?ap.c:0) == '*') {
                dbg.location(273,32);
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:273:32: ^( EQ[$ap.tk, \"=\"] orExpression ^( STAR[$ap.tk, \"*\"] orExpression expression ) )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(273,34);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EQ, (ap!=null?ap.tk:null), "="), root_1);

                dbg.location(273,50);
                adaptor.addChild(root_1, stream_orExpression.nextTree());
                dbg.location(273,63);
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:273:63: ^( STAR[$ap.tk, \"*\"] orExpression expression )
                {
                Object root_2 = (Object)adaptor.nil();
                dbg.location(273,65);
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(STAR, (ap!=null?ap.tk:null), "*"), root_2);

                dbg.location(273,84);
                adaptor.addChild(root_2, stream_orExpression.nextTree());
                dbg.location(273,97);
                adaptor.addChild(root_2, stream_expression.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 274:13: -> {$ap.c == '/'}? ^( EQ[$ap.tk, \"=\"] orExpression ^( SLASH[$ap.tk, \"/\"] orExpression expression ) )
            if ((ap!=null?ap.c:0) == '/') {
                dbg.location(274,32);
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:274:32: ^( EQ[$ap.tk, \"=\"] orExpression ^( SLASH[$ap.tk, \"/\"] orExpression expression ) )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(274,34);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EQ, (ap!=null?ap.tk:null), "="), root_1);

                dbg.location(274,50);
                adaptor.addChild(root_1, stream_orExpression.nextTree());
                dbg.location(274,63);
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:274:63: ^( SLASH[$ap.tk, \"/\"] orExpression expression )
                {
                Object root_2 = (Object)adaptor.nil();
                dbg.location(274,65);
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(SLASH, (ap!=null?ap.tk:null), "/"), root_2);

                dbg.location(274,84);
                adaptor.addChild(root_2, stream_orExpression.nextTree());
                dbg.location(274,97);
                adaptor.addChild(root_2, stream_expression.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 275:13: -> orExpression
            {
                dbg.location(275,17);
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
        dbg.location(276, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:278:1: assignmentOperator returns [char c, Token tk] : (t= '=' | t= '+=' | t= '-=' | t= '*=' | t= '/=' );
    public final JaParser.assignmentOperator_return assignmentOperator() throws RecognitionException {
        JaParser.assignmentOperator_return retval = new JaParser.assignmentOperator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token t=null;

        Object t_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "assignmentOperator");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(278, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:279:5: (t= '=' | t= '+=' | t= '-=' | t= '*=' | t= '/=' )
            int alt37=5;
            try { dbg.enterDecision(37);

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

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(37);}

            switch (alt37) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:279:9: t= '='
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(279,10);
                    t=(Token)match(input,EQ,FOLLOW_EQ_in_assignmentOperator2269); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    t_tree = (Object)adaptor.create(t);
                    adaptor.addChild(root_0, t_tree);
                    }
                    dbg.location(279,16);
                    if ( state.backtracking==0 ) {
                       retval.c = '='; retval.tk =t; 
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:280:9: t= '+='
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(280,10);
                    t=(Token)match(input,94,FOLLOW_94_in_assignmentOperator2284); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    t_tree = (Object)adaptor.create(t);
                    adaptor.addChild(root_0, t_tree);
                    }
                    dbg.location(280,16);
                    if ( state.backtracking==0 ) {
                       retval.c = '+'; retval.tk =t; 
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:281:9: t= '-='
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(281,10);
                    t=(Token)match(input,95,FOLLOW_95_in_assignmentOperator2298); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    t_tree = (Object)adaptor.create(t);
                    adaptor.addChild(root_0, t_tree);
                    }
                    dbg.location(281,16);
                    if ( state.backtracking==0 ) {
                       retval.c = '-'; retval.tk =t; 
                    }

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:282:9: t= '*='
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(282,10);
                    t=(Token)match(input,96,FOLLOW_96_in_assignmentOperator2312); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    t_tree = (Object)adaptor.create(t);
                    adaptor.addChild(root_0, t_tree);
                    }
                    dbg.location(282,16);
                    if ( state.backtracking==0 ) {
                       retval.c = '*'; retval.tk =t; 
                    }

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:283:9: t= '/='
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(283,10);
                    t=(Token)match(input,97,FOLLOW_97_in_assignmentOperator2326); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    t_tree = (Object)adaptor.create(t);
                    adaptor.addChild(root_0, t_tree);
                    }
                    dbg.location(283,16);
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
        dbg.location(284, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "assignmentOperator");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "assignmentOperator"

    public static class orExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "orExpression"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:286:1: orExpression : andExpression ( '||' andExpression )* ;
    public final JaParser.orExpression_return orExpression() throws RecognitionException {
        JaParser.orExpression_return retval = new JaParser.orExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal130=null;
        JaParser.andExpression_return andExpression129 = null;

        JaParser.andExpression_return andExpression131 = null;


        Object string_literal130_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "orExpression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(286, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:287:5: ( andExpression ( '||' andExpression )* )
            dbg.enterAlt(1);

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:287:9: andExpression ( '||' andExpression )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(287,9);
            pushFollow(FOLLOW_andExpression_in_orExpression2347);
            andExpression129=andExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, andExpression129.getTree());
            dbg.location(287,23);
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:287:23: ( '||' andExpression )*
            try { dbg.enterSubRule(38);

            loop38:
            do {
                int alt38=2;
                try { dbg.enterDecision(38);

                int LA38_0 = input.LA(1);

                if ( (LA38_0==98) ) {
                    alt38=1;
                }


                } finally {dbg.exitDecision(38);}

                switch (alt38) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:287:25: '||' andExpression
            	    {
            	    dbg.location(287,29);
            	    string_literal130=(Token)match(input,98,FOLLOW_98_in_orExpression2351); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal130_tree = (Object)adaptor.create(string_literal130);
            	    root_0 = (Object)adaptor.becomeRoot(string_literal130_tree, root_0);
            	    }
            	    dbg.location(287,31);
            	    pushFollow(FOLLOW_andExpression_in_orExpression2354);
            	    andExpression131=andExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, andExpression131.getTree());

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);
            } finally {dbg.exitSubRule(38);}


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
        dbg.location(288, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "orExpression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "orExpression"

    public static class andExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "andExpression"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:290:1: andExpression : equalityExpression ( '&&' equalityExpression )* ;
    public final JaParser.andExpression_return andExpression() throws RecognitionException {
        JaParser.andExpression_return retval = new JaParser.andExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal133=null;
        JaParser.equalityExpression_return equalityExpression132 = null;

        JaParser.equalityExpression_return equalityExpression134 = null;


        Object string_literal133_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "andExpression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(290, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:291:5: ( equalityExpression ( '&&' equalityExpression )* )
            dbg.enterAlt(1);

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:291:9: equalityExpression ( '&&' equalityExpression )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(291,9);
            pushFollow(FOLLOW_equalityExpression_in_andExpression2376);
            equalityExpression132=equalityExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression132.getTree());
            dbg.location(291,28);
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:291:28: ( '&&' equalityExpression )*
            try { dbg.enterSubRule(39);

            loop39:
            do {
                int alt39=2;
                try { dbg.enterDecision(39);

                int LA39_0 = input.LA(1);

                if ( (LA39_0==99) ) {
                    alt39=1;
                }


                } finally {dbg.exitDecision(39);}

                switch (alt39) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:291:30: '&&' equalityExpression
            	    {
            	    dbg.location(291,34);
            	    string_literal133=(Token)match(input,99,FOLLOW_99_in_andExpression2380); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal133_tree = (Object)adaptor.create(string_literal133);
            	    root_0 = (Object)adaptor.becomeRoot(string_literal133_tree, root_0);
            	    }
            	    dbg.location(291,36);
            	    pushFollow(FOLLOW_equalityExpression_in_andExpression2383);
            	    equalityExpression134=equalityExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression134.getTree());

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);
            } finally {dbg.exitSubRule(39);}


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
        dbg.location(292, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "andExpression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "andExpression"

    public static class equalityExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "equalityExpression"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:294:1: equalityExpression : instanceOfExpression ( ( '==' | '!=' ) instanceOfExpression )* ;
    public final JaParser.equalityExpression_return equalityExpression() throws RecognitionException {
        JaParser.equalityExpression_return retval = new JaParser.equalityExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set136=null;
        JaParser.instanceOfExpression_return instanceOfExpression135 = null;

        JaParser.instanceOfExpression_return instanceOfExpression137 = null;


        Object set136_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "equalityExpression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(294, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:295:5: ( instanceOfExpression ( ( '==' | '!=' ) instanceOfExpression )* )
            dbg.enterAlt(1);

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:295:9: instanceOfExpression ( ( '==' | '!=' ) instanceOfExpression )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(295,9);
            pushFollow(FOLLOW_instanceOfExpression_in_equalityExpression2405);
            instanceOfExpression135=instanceOfExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, instanceOfExpression135.getTree());
            dbg.location(295,30);
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:295:30: ( ( '==' | '!=' ) instanceOfExpression )*
            try { dbg.enterSubRule(40);

            loop40:
            do {
                int alt40=2;
                try { dbg.enterDecision(40);

                int LA40_0 = input.LA(1);

                if ( ((LA40_0>=100 && LA40_0<=101)) ) {
                    alt40=1;
                }


                } finally {dbg.exitDecision(40);}

                switch (alt40) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:295:32: ( '==' | '!=' ) instanceOfExpression
            	    {
            	    dbg.location(295,32);
            	    set136=(Token)input.LT(1);
            	    set136=(Token)input.LT(1);
            	    if ( (input.LA(1)>=100 && input.LA(1)<=101) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set136), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(295,47);
            	    pushFollow(FOLLOW_instanceOfExpression_in_equalityExpression2418);
            	    instanceOfExpression137=instanceOfExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, instanceOfExpression137.getTree());

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);
            } finally {dbg.exitSubRule(40);}


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
        dbg.location(296, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "equalityExpression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "equalityExpression"

    public static class instanceOfExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "instanceOfExpression"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:298:1: instanceOfExpression : relationalExpression ( INSTANCEOF type )? ;
    public final JaParser.instanceOfExpression_return instanceOfExpression() throws RecognitionException {
        JaParser.instanceOfExpression_return retval = new JaParser.instanceOfExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INSTANCEOF139=null;
        JaParser.relationalExpression_return relationalExpression138 = null;

        JaParser.type_return type140 = null;


        Object INSTANCEOF139_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "instanceOfExpression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(298, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:299:5: ( relationalExpression ( INSTANCEOF type )? )
            dbg.enterAlt(1);

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:299:9: relationalExpression ( INSTANCEOF type )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(299,9);
            pushFollow(FOLLOW_relationalExpression_in_instanceOfExpression2440);
            relationalExpression138=relationalExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression138.getTree());
            dbg.location(299,30);
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:299:30: ( INSTANCEOF type )?
            int alt41=2;
            try { dbg.enterSubRule(41);
            try { dbg.enterDecision(41);

            int LA41_0 = input.LA(1);

            if ( (LA41_0==INSTANCEOF) ) {
                alt41=1;
            }
            } finally {dbg.exitDecision(41);}

            switch (alt41) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:299:31: INSTANCEOF type
                    {
                    dbg.location(299,41);
                    INSTANCEOF139=(Token)match(input,INSTANCEOF,FOLLOW_INSTANCEOF_in_instanceOfExpression2443); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INSTANCEOF139_tree = (Object)adaptor.create(INSTANCEOF139);
                    root_0 = (Object)adaptor.becomeRoot(INSTANCEOF139_tree, root_0);
                    }
                    dbg.location(299,43);
                    pushFollow(FOLLOW_type_in_instanceOfExpression2446);
                    type140=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type140.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(41);}


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
        dbg.location(300, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "instanceOfExpression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "instanceOfExpression"

    public static class relationalExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relationalExpression"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:302:1: relationalExpression : additiveExpression ( COMPAREOP additiveExpression )* ;
    public final JaParser.relationalExpression_return relationalExpression() throws RecognitionException {
        JaParser.relationalExpression_return retval = new JaParser.relationalExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMPAREOP142=null;
        JaParser.additiveExpression_return additiveExpression141 = null;

        JaParser.additiveExpression_return additiveExpression143 = null;


        Object COMPAREOP142_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "relationalExpression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(302, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:303:5: ( additiveExpression ( COMPAREOP additiveExpression )* )
            dbg.enterAlt(1);

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:303:9: additiveExpression ( COMPAREOP additiveExpression )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(303,9);
            pushFollow(FOLLOW_additiveExpression_in_relationalExpression2467);
            additiveExpression141=additiveExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression141.getTree());
            dbg.location(303,28);
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:303:28: ( COMPAREOP additiveExpression )*
            try { dbg.enterSubRule(42);

            loop42:
            do {
                int alt42=2;
                try { dbg.enterDecision(42);

                int LA42_0 = input.LA(1);

                if ( (LA42_0==COMPAREOP) ) {
                    alt42=1;
                }


                } finally {dbg.exitDecision(42);}

                switch (alt42) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:303:30: COMPAREOP additiveExpression
            	    {
            	    dbg.location(303,39);
            	    COMPAREOP142=(Token)match(input,COMPAREOP,FOLLOW_COMPAREOP_in_relationalExpression2471); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    COMPAREOP142_tree = (Object)adaptor.create(COMPAREOP142);
            	    root_0 = (Object)adaptor.becomeRoot(COMPAREOP142_tree, root_0);
            	    }
            	    dbg.location(303,41);
            	    pushFollow(FOLLOW_additiveExpression_in_relationalExpression2474);
            	    additiveExpression143=additiveExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression143.getTree());

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);
            } finally {dbg.exitSubRule(42);}


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
        dbg.location(304, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "relationalExpression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "relationalExpression"

    public static class additiveExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "additiveExpression"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:306:1: additiveExpression : multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )* ;
    public final JaParser.additiveExpression_return additiveExpression() throws RecognitionException {
        JaParser.additiveExpression_return retval = new JaParser.additiveExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set145=null;
        JaParser.multiplicativeExpression_return multiplicativeExpression144 = null;

        JaParser.multiplicativeExpression_return multiplicativeExpression146 = null;


        Object set145_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "additiveExpression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(306, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:307:5: ( multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )* )
            dbg.enterAlt(1);

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:307:9: multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(307,9);
            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression2496);
            multiplicativeExpression144=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression144.getTree());
            dbg.location(307,34);
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:307:34: ( ( '+' | '-' ) multiplicativeExpression )*
            try { dbg.enterSubRule(43);

            loop43:
            do {
                int alt43=2;
                try { dbg.enterDecision(43);

                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=PLUS && LA43_0<=MINUS)) ) {
                    alt43=1;
                }


                } finally {dbg.exitDecision(43);}

                switch (alt43) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:307:36: ( '+' | '-' ) multiplicativeExpression
            	    {
            	    dbg.location(307,36);
            	    set145=(Token)input.LT(1);
            	    set145=(Token)input.LT(1);
            	    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set145), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(307,49);
            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression2509);
            	    multiplicativeExpression146=multiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression146.getTree());

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);
            } finally {dbg.exitSubRule(43);}


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
        dbg.location(308, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "additiveExpression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "additiveExpression"

    public static class multiplicativeExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiplicativeExpression"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:310:1: multiplicativeExpression : unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )* ;
    public final JaParser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        JaParser.multiplicativeExpression_return retval = new JaParser.multiplicativeExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set148=null;
        JaParser.unaryExpression_return unaryExpression147 = null;

        JaParser.unaryExpression_return unaryExpression149 = null;


        Object set148_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "multiplicativeExpression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(310, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:311:5: ( unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )* )
            dbg.enterAlt(1);

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:311:9: unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(311,9);
            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression2531);
            unaryExpression147=unaryExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression147.getTree());
            dbg.location(311,25);
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:311:25: ( ( '*' | '/' | '%' ) unaryExpression )*
            try { dbg.enterSubRule(44);

            loop44:
            do {
                int alt44=2;
                try { dbg.enterDecision(44);

                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=STAR && LA44_0<=SLASH)||LA44_0==102) ) {
                    alt44=1;
                }


                } finally {dbg.exitDecision(44);}

                switch (alt44) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:311:27: ( '*' | '/' | '%' ) unaryExpression
            	    {
            	    dbg.location(311,27);
            	    set148=(Token)input.LT(1);
            	    set148=(Token)input.LT(1);
            	    if ( (input.LA(1)>=STAR && input.LA(1)<=SLASH)||input.LA(1)==102 ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set148), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(311,48);
            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression2550);
            	    unaryExpression149=unaryExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression149.getTree());

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);
            } finally {dbg.exitSubRule(44);}


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
        dbg.location(312, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "multiplicativeExpression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "multiplicativeExpression"

    public static class unaryExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unaryExpression"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:314:1: unaryExpression : (up= '+' unaryExpression -> ^( UNARYPLUS[$up] unaryExpression ) | um= '-' unaryExpression -> ^( UNARYMINUS[$um] unaryExpression ) | pi= '++' unaryExpression -> ^( PREINC[$pi] unaryExpression ) | pd= '--' unaryExpression -> ^( PREDEC[$pd] unaryExpression ) | unaryExpressionNotPlusMinus );
    public final JaParser.unaryExpression_return unaryExpression() throws RecognitionException {
        JaParser.unaryExpression_return retval = new JaParser.unaryExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token up=null;
        Token um=null;
        Token pi=null;
        Token pd=null;
        JaParser.unaryExpression_return unaryExpression150 = null;

        JaParser.unaryExpression_return unaryExpression151 = null;

        JaParser.unaryExpression_return unaryExpression152 = null;

        JaParser.unaryExpression_return unaryExpression153 = null;

        JaParser.unaryExpressionNotPlusMinus_return unaryExpressionNotPlusMinus154 = null;


        Object up_tree=null;
        Object um_tree=null;
        Object pi_tree=null;
        Object pd_tree=null;
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
        RewriteRuleSubtreeStream stream_unaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule unaryExpression");
        try { dbg.enterRule(getGrammarFileName(), "unaryExpression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(314, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:315:5: (up= '+' unaryExpression -> ^( UNARYPLUS[$up] unaryExpression ) | um= '-' unaryExpression -> ^( UNARYMINUS[$um] unaryExpression ) | pi= '++' unaryExpression -> ^( PREINC[$pi] unaryExpression ) | pd= '--' unaryExpression -> ^( PREDEC[$pd] unaryExpression ) | unaryExpressionNotPlusMinus )
            int alt45=5;
            try { dbg.enterDecision(45);

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

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(45);}

            switch (alt45) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:315:9: up= '+' unaryExpression
                    {
                    dbg.location(315,11);
                    up=(Token)match(input,PLUS,FOLLOW_PLUS_in_unaryExpression2578); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUS.add(up);

                    dbg.location(315,16);
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression2580);
                    unaryExpression150=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression150.getTree());


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
                    // 315:32: -> ^( UNARYPLUS[$up] unaryExpression )
                    {
                        dbg.location(315,35);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:315:35: ^( UNARYPLUS[$up] unaryExpression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(315,37);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(UNARYPLUS, up), root_1);

                        dbg.location(315,53);
                        adaptor.addChild(root_1, stream_unaryExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:316:9: um= '-' unaryExpression
                    {
                    dbg.location(316,11);
                    um=(Token)match(input,MINUS,FOLLOW_MINUS_in_unaryExpression2603); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(um);

                    dbg.location(316,16);
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression2605);
                    unaryExpression151=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression151.getTree());


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
                    // 316:32: -> ^( UNARYMINUS[$um] unaryExpression )
                    {
                        dbg.location(316,35);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:316:35: ^( UNARYMINUS[$um] unaryExpression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(316,37);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(UNARYMINUS, um), root_1);

                        dbg.location(316,53);
                        adaptor.addChild(root_1, stream_unaryExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:317:9: pi= '++' unaryExpression
                    {
                    dbg.location(317,11);
                    pi=(Token)match(input,103,FOLLOW_103_in_unaryExpression2626); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_103.add(pi);

                    dbg.location(317,17);
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression2628);
                    unaryExpression152=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression152.getTree());


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
                    // 317:33: -> ^( PREINC[$pi] unaryExpression )
                    {
                        dbg.location(317,36);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:317:36: ^( PREINC[$pi] unaryExpression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(317,38);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PREINC, pi), root_1);

                        dbg.location(317,50);
                        adaptor.addChild(root_1, stream_unaryExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:318:9: pd= '--' unaryExpression
                    {
                    dbg.location(318,11);
                    pd=(Token)match(input,104,FOLLOW_104_in_unaryExpression2649); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_104.add(pd);

                    dbg.location(318,17);
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression2651);
                    unaryExpression153=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression153.getTree());


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
                    // 318:33: -> ^( PREDEC[$pd] unaryExpression )
                    {
                        dbg.location(318,36);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:318:36: ^( PREDEC[$pd] unaryExpression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(318,38);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PREDEC, pd), root_1);

                        dbg.location(318,50);
                        adaptor.addChild(root_1, stream_unaryExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:319:9: unaryExpressionNotPlusMinus
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(319,9);
                    pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression2670);
                    unaryExpressionNotPlusMinus154=unaryExpressionNotPlusMinus();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpressionNotPlusMinus154.getTree());

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
        dbg.location(320, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "unaryExpression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "unaryExpression"

    public static class unaryExpressionNotPlusMinus_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unaryExpressionNotPlusMinus"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:322:1: unaryExpressionNotPlusMinus : ( '!' unaryExpression | lp= '(' primitiveType ')' unaryExpression -> ^( CAST[$lp, \"CAST\"] primitiveType unaryExpression ) | lp= '(' nonPrimitiveType ')' unaryExpressionNotPlusMinus -> ^( CAST[$lp, \"CAST\"] nonPrimitiveType unaryExpressionNotPlusMinus ) | NEW creator | ( primary -> primary ) ( selector[(CommonTree)$unaryExpressionNotPlusMinus.tree] -> selector )* ( '++' -> ^( POSTINC $unaryExpressionNotPlusMinus) | '--' -> ^( POSTDEC $unaryExpressionNotPlusMinus) )* );
    public final JaParser.unaryExpressionNotPlusMinus_return unaryExpressionNotPlusMinus() throws RecognitionException {
        JaParser.unaryExpressionNotPlusMinus_return retval = new JaParser.unaryExpressionNotPlusMinus_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lp=null;
        Token char_literal155=null;
        Token char_literal158=null;
        Token char_literal161=null;
        Token NEW163=null;
        Token string_literal167=null;
        Token string_literal168=null;
        JaParser.unaryExpression_return unaryExpression156 = null;

        JaParser.primitiveType_return primitiveType157 = null;

        JaParser.unaryExpression_return unaryExpression159 = null;

        JaParser.nonPrimitiveType_return nonPrimitiveType160 = null;

        JaParser.unaryExpressionNotPlusMinus_return unaryExpressionNotPlusMinus162 = null;

        JaParser.creator_return creator164 = null;

        JaParser.primary_return primary165 = null;

        JaParser.selector_return selector166 = null;


        Object lp_tree=null;
        Object char_literal155_tree=null;
        Object char_literal158_tree=null;
        Object char_literal161_tree=null;
        Object NEW163_tree=null;
        Object string_literal167_tree=null;
        Object string_literal168_tree=null;
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleSubtreeStream stream_unaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule unaryExpression");
        RewriteRuleSubtreeStream stream_primary=new RewriteRuleSubtreeStream(adaptor,"rule primary");
        RewriteRuleSubtreeStream stream_selector=new RewriteRuleSubtreeStream(adaptor,"rule selector");
        RewriteRuleSubtreeStream stream_unaryExpressionNotPlusMinus=new RewriteRuleSubtreeStream(adaptor,"rule unaryExpressionNotPlusMinus");
        RewriteRuleSubtreeStream stream_nonPrimitiveType=new RewriteRuleSubtreeStream(adaptor,"rule nonPrimitiveType");
        RewriteRuleSubtreeStream stream_primitiveType=new RewriteRuleSubtreeStream(adaptor,"rule primitiveType");
        try { dbg.enterRule(getGrammarFileName(), "unaryExpressionNotPlusMinus");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(322, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:323:5: ( '!' unaryExpression | lp= '(' primitiveType ')' unaryExpression -> ^( CAST[$lp, \"CAST\"] primitiveType unaryExpression ) | lp= '(' nonPrimitiveType ')' unaryExpressionNotPlusMinus -> ^( CAST[$lp, \"CAST\"] nonPrimitiveType unaryExpressionNotPlusMinus ) | NEW creator | ( primary -> primary ) ( selector[(CommonTree)$unaryExpressionNotPlusMinus.tree] -> selector )* ( '++' -> ^( POSTINC $unaryExpressionNotPlusMinus) | '--' -> ^( POSTDEC $unaryExpressionNotPlusMinus) )* )
            int alt48=5;
            try { dbg.enterDecision(48);

            try {
                isCyclicDecision = true;
                alt48 = dfa48.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(48);}

            switch (alt48) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:323:7: '!' unaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(323,10);
                    char_literal155=(Token)match(input,105,FOLLOW_105_in_unaryExpressionNotPlusMinus2687); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal155_tree = (Object)adaptor.create(char_literal155);
                    root_0 = (Object)adaptor.becomeRoot(char_literal155_tree, root_0);
                    }
                    dbg.location(323,12);
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus2690);
                    unaryExpression156=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression156.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:324:9: lp= '(' primitiveType ')' unaryExpression
                    {
                    dbg.location(324,11);
                    lp=(Token)match(input,92,FOLLOW_92_in_unaryExpressionNotPlusMinus2702); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_92.add(lp);

                    dbg.location(324,16);
                    pushFollow(FOLLOW_primitiveType_in_unaryExpressionNotPlusMinus2704);
                    primitiveType157=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primitiveType.add(primitiveType157.getTree());
                    dbg.location(324,30);
                    char_literal158=(Token)match(input,93,FOLLOW_93_in_unaryExpressionNotPlusMinus2706); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_93.add(char_literal158);

                    dbg.location(324,34);
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus2708);
                    unaryExpression159=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression159.getTree());


                    // AST REWRITE
                    // elements: primitiveType, unaryExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 325:7: -> ^( CAST[$lp, \"CAST\"] primitiveType unaryExpression )
                    {
                        dbg.location(325,10);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:325:10: ^( CAST[$lp, \"CAST\"] primitiveType unaryExpression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(325,12);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CAST, lp, "CAST"), root_1);

                        dbg.location(325,30);
                        adaptor.addChild(root_1, stream_primitiveType.nextTree());
                        dbg.location(325,44);
                        adaptor.addChild(root_1, stream_unaryExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:327:9: lp= '(' nonPrimitiveType ')' unaryExpressionNotPlusMinus
                    {
                    dbg.location(327,11);
                    lp=(Token)match(input,92,FOLLOW_92_in_unaryExpressionNotPlusMinus2742); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_92.add(lp);

                    dbg.location(327,16);
                    pushFollow(FOLLOW_nonPrimitiveType_in_unaryExpressionNotPlusMinus2744);
                    nonPrimitiveType160=nonPrimitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_nonPrimitiveType.add(nonPrimitiveType160.getTree());
                    dbg.location(327,34);
                    char_literal161=(Token)match(input,93,FOLLOW_93_in_unaryExpressionNotPlusMinus2747); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_93.add(char_literal161);

                    dbg.location(327,38);
                    pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpressionNotPlusMinus2749);
                    unaryExpressionNotPlusMinus162=unaryExpressionNotPlusMinus();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpressionNotPlusMinus.add(unaryExpressionNotPlusMinus162.getTree());


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
                    // 328:7: -> ^( CAST[$lp, \"CAST\"] nonPrimitiveType unaryExpressionNotPlusMinus )
                    {
                        dbg.location(328,10);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:328:10: ^( CAST[$lp, \"CAST\"] nonPrimitiveType unaryExpressionNotPlusMinus )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(328,12);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CAST, lp, "CAST"), root_1);

                        dbg.location(328,30);
                        adaptor.addChild(root_1, stream_nonPrimitiveType.nextTree());
                        dbg.location(328,47);
                        adaptor.addChild(root_1, stream_unaryExpressionNotPlusMinus.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:329:9: NEW creator
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(329,12);
                    NEW163=(Token)match(input,NEW,FOLLOW_NEW_in_unaryExpressionNotPlusMinus2776); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NEW163_tree = (Object)adaptor.create(NEW163);
                    root_0 = (Object)adaptor.becomeRoot(NEW163_tree, root_0);
                    }
                    dbg.location(329,14);
                    pushFollow(FOLLOW_creator_in_unaryExpressionNotPlusMinus2779);
                    creator164=creator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, creator164.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:330:9: ( primary -> primary ) ( selector[(CommonTree)$unaryExpressionNotPlusMinus.tree] -> selector )* ( '++' -> ^( POSTINC $unaryExpressionNotPlusMinus) | '--' -> ^( POSTDEC $unaryExpressionNotPlusMinus) )*
                    {
                    dbg.location(330,9);
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:330:9: ( primary -> primary )
                    dbg.enterAlt(1);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:330:10: primary
                    {
                    dbg.location(330,10);
                    pushFollow(FOLLOW_primary_in_unaryExpressionNotPlusMinus2790);
                    primary165=primary();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primary.add(primary165.getTree());


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
                    // 330:18: -> primary
                    {
                        dbg.location(330,21);
                        adaptor.addChild(root_0, stream_primary.nextTree());

                    }

                    retval.tree = root_0;}
                    }

                    dbg.location(330,31);
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:330:31: ( selector[(CommonTree)$unaryExpressionNotPlusMinus.tree] -> selector )*
                    try { dbg.enterSubRule(46);

                    loop46:
                    do {
                        int alt46=2;
                        try { dbg.enterDecision(46);

                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==90||LA46_0==106) ) {
                            alt46=1;
                        }


                        } finally {dbg.exitDecision(46);}

                        switch (alt46) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:330:32: selector[(CommonTree)$unaryExpressionNotPlusMinus.tree]
                    	    {
                    	    dbg.location(330,32);
                    	    pushFollow(FOLLOW_selector_in_unaryExpressionNotPlusMinus2799);
                    	    selector166=selector((CommonTree)((Object)retval.tree));

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_selector.add(selector166.getTree());


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
                    	    // 330:88: -> selector
                    	    {
                    	        dbg.location(330,91);
                    	        adaptor.addChild(root_0, stream_selector.nextTree());

                    	    }

                    	    retval.tree = root_0;}
                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(46);}

                    dbg.location(331,7);
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:331:7: ( '++' -> ^( POSTINC $unaryExpressionNotPlusMinus) | '--' -> ^( POSTDEC $unaryExpressionNotPlusMinus) )*
                    try { dbg.enterSubRule(47);

                    loop47:
                    do {
                        int alt47=3;
                        try { dbg.enterDecision(47);

                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==103) ) {
                            alt47=1;
                        }
                        else if ( (LA47_0==104) ) {
                            alt47=2;
                        }


                        } finally {dbg.exitDecision(47);}

                        switch (alt47) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:331:8: '++'
                    	    {
                    	    dbg.location(331,8);
                    	    string_literal167=(Token)match(input,103,FOLLOW_103_in_unaryExpressionNotPlusMinus2816); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_103.add(string_literal167);



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
                    	    // 331:13: -> ^( POSTINC $unaryExpressionNotPlusMinus)
                    	    {
                    	        dbg.location(331,16);
                    	        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:331:16: ^( POSTINC $unaryExpressionNotPlusMinus)
                    	        {
                    	        Object root_1 = (Object)adaptor.nil();
                    	        dbg.location(331,18);
                    	        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(POSTINC, "POSTINC"), root_1);

                    	        dbg.location(331,26);
                    	        adaptor.addChild(root_1, stream_retval.nextTree());

                    	        adaptor.addChild(root_0, root_1);
                    	        }

                    	    }

                    	    retval.tree = root_0;}
                    	    }
                    	    break;
                    	case 2 :
                    	    dbg.enterAlt(2);

                    	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:331:58: '--'
                    	    {
                    	    dbg.location(331,58);
                    	    string_literal168=(Token)match(input,104,FOLLOW_104_in_unaryExpressionNotPlusMinus2829); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_104.add(string_literal168);



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
                    	    // 331:63: -> ^( POSTDEC $unaryExpressionNotPlusMinus)
                    	    {
                    	        dbg.location(331,66);
                    	        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:331:66: ^( POSTDEC $unaryExpressionNotPlusMinus)
                    	        {
                    	        Object root_1 = (Object)adaptor.nil();
                    	        dbg.location(331,68);
                    	        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(POSTDEC, "POSTDEC"), root_1);

                    	        dbg.location(331,76);
                    	        adaptor.addChild(root_1, stream_retval.nextTree());

                    	        adaptor.addChild(root_0, root_1);
                    	        }

                    	    }

                    	    retval.tree = root_0;}
                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(47);}


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
        dbg.location(332, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "unaryExpressionNotPlusMinus");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "unaryExpressionNotPlusMinus"

    public static class primary_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primary"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:335:1: primary : ( parExpression | THIS | SUPER superMemberAccess | literal | IDENTIFIER | ( IDENTIFIER -> IDENTIFIER ) ( '[' ']' -> ^( ARRAYTYPE $primary) )+ ( '.' CLASS -> ^( DOTCLASS $primary) ) | IDENTIFIER arguments -> ^( METHODCALL THIS IDENTIFIER ( arguments )? ) | IDENTIFIER '.' CLASS -> ^( DOTCLASS IDENTIFIER ) | ( primitiveType -> primitiveType ) ( '[' ']' -> ^( ARRAYTYPE $primary) )* ( '.' CLASS -> ^( DOTCLASS $primary) ) | VOID '.' CLASS -> ^( DOTCLASS VOID ) );
    public final JaParser.primary_return primary() throws RecognitionException {
        JaParser.primary_return retval = new JaParser.primary_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token THIS170=null;
        Token SUPER171=null;
        Token IDENTIFIER174=null;
        Token IDENTIFIER175=null;
        Token char_literal176=null;
        Token char_literal177=null;
        Token char_literal178=null;
        Token CLASS179=null;
        Token IDENTIFIER180=null;
        Token IDENTIFIER182=null;
        Token char_literal183=null;
        Token CLASS184=null;
        Token char_literal186=null;
        Token char_literal187=null;
        Token char_literal188=null;
        Token CLASS189=null;
        Token VOID190=null;
        Token char_literal191=null;
        Token CLASS192=null;
        JaParser.parExpression_return parExpression169 = null;

        JaParser.superMemberAccess_return superMemberAccess172 = null;

        JaParser.literal_return literal173 = null;

        JaParser.arguments_return arguments181 = null;

        JaParser.primitiveType_return primitiveType185 = null;


        Object THIS170_tree=null;
        Object SUPER171_tree=null;
        Object IDENTIFIER174_tree=null;
        Object IDENTIFIER175_tree=null;
        Object char_literal176_tree=null;
        Object char_literal177_tree=null;
        Object char_literal178_tree=null;
        Object CLASS179_tree=null;
        Object IDENTIFIER180_tree=null;
        Object IDENTIFIER182_tree=null;
        Object char_literal183_tree=null;
        Object CLASS184_tree=null;
        Object char_literal186_tree=null;
        Object char_literal187_tree=null;
        Object char_literal188_tree=null;
        Object CLASS189_tree=null;
        Object VOID190_tree=null;
        Object char_literal191_tree=null;
        Object CLASS192_tree=null;
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleTokenStream stream_CLASS=new RewriteRuleTokenStream(adaptor,"token CLASS");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleTokenStream stream_VOID=new RewriteRuleTokenStream(adaptor,"token VOID");
        RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
        RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");
        RewriteRuleSubtreeStream stream_primitiveType=new RewriteRuleSubtreeStream(adaptor,"rule primitiveType");
        try { dbg.enterRule(getGrammarFileName(), "primary");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(335, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:336:5: ( parExpression | THIS | SUPER superMemberAccess | literal | IDENTIFIER | ( IDENTIFIER -> IDENTIFIER ) ( '[' ']' -> ^( ARRAYTYPE $primary) )+ ( '.' CLASS -> ^( DOTCLASS $primary) ) | IDENTIFIER arguments -> ^( METHODCALL THIS IDENTIFIER ( arguments )? ) | IDENTIFIER '.' CLASS -> ^( DOTCLASS IDENTIFIER ) | ( primitiveType -> primitiveType ) ( '[' ']' -> ^( ARRAYTYPE $primary) )* ( '.' CLASS -> ^( DOTCLASS $primary) ) | VOID '.' CLASS -> ^( DOTCLASS VOID ) )
            int alt51=10;
            try { dbg.enterDecision(51);

            try {
                isCyclicDecision = true;
                alt51 = dfa51.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(51);}

            switch (alt51) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:336:9: parExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(336,9);
                    pushFollow(FOLLOW_parExpression_in_primary2866);
                    parExpression169=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parExpression169.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:337:9: THIS
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(337,9);
                    THIS170=(Token)match(input,THIS,FOLLOW_THIS_in_primary2876); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    THIS170_tree = (Object)adaptor.create(THIS170);
                    adaptor.addChild(root_0, THIS170_tree);
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:338:9: SUPER superMemberAccess
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(338,14);
                    SUPER171=(Token)match(input,SUPER,FOLLOW_SUPER_in_primary2887); if (state.failed) return retval;
                    dbg.location(338,16);
                    pushFollow(FOLLOW_superMemberAccess_in_primary2890);
                    superMemberAccess172=superMemberAccess();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, superMemberAccess172.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:339:9: literal
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(339,9);
                    pushFollow(FOLLOW_literal_in_primary2900);
                    literal173=literal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, literal173.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:340:9: IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(340,9);
                    IDENTIFIER174=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary2910); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER174_tree = (Object)adaptor.create(IDENTIFIER174);
                    adaptor.addChild(root_0, IDENTIFIER174_tree);
                    }

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:341:9: ( IDENTIFIER -> IDENTIFIER ) ( '[' ']' -> ^( ARRAYTYPE $primary) )+ ( '.' CLASS -> ^( DOTCLASS $primary) )
                    {
                    dbg.location(341,9);
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:341:9: ( IDENTIFIER -> IDENTIFIER )
                    dbg.enterAlt(1);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:341:10: IDENTIFIER
                    {
                    dbg.location(341,10);
                    IDENTIFIER175=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary2921); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER175);



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
                    // 341:21: -> IDENTIFIER
                    {
                        dbg.location(341,24);
                        adaptor.addChild(root_0, stream_IDENTIFIER.nextNode());

                    }

                    retval.tree = root_0;}
                    }

                    dbg.location(341,36);
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:341:36: ( '[' ']' -> ^( ARRAYTYPE $primary) )+
                    int cnt49=0;
                    try { dbg.enterSubRule(49);

                    loop49:
                    do {
                        int alt49=2;
                        try { dbg.enterDecision(49);

                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==90) ) {
                            alt49=1;
                        }


                        } finally {dbg.exitDecision(49);}

                        switch (alt49) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:341:37: '[' ']'
                    	    {
                    	    dbg.location(341,37);
                    	    char_literal176=(Token)match(input,90,FOLLOW_90_in_primary2929); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_90.add(char_literal176);

                    	    dbg.location(341,41);
                    	    char_literal177=(Token)match(input,91,FOLLOW_91_in_primary2931); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_91.add(char_literal177);



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
                    	    // 341:45: -> ^( ARRAYTYPE $primary)
                    	    {
                    	        dbg.location(341,48);
                    	        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:341:48: ^( ARRAYTYPE $primary)
                    	        {
                    	        Object root_1 = (Object)adaptor.nil();
                    	        dbg.location(341,50);
                    	        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAYTYPE, "ARRAYTYPE"), root_1);

                    	        dbg.location(341,60);
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
                                dbg.recognitionException(eee);

                                throw eee;
                        }
                        cnt49++;
                    } while (true);
                    } finally {dbg.exitSubRule(49);}

                    dbg.location(341,72);
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:341:72: ( '.' CLASS -> ^( DOTCLASS $primary) )
                    dbg.enterAlt(1);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:341:73: '.' CLASS
                    {
                    dbg.location(341,73);
                    char_literal178=(Token)match(input,106,FOLLOW_106_in_primary2945); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_106.add(char_literal178);

                    dbg.location(341,77);
                    CLASS179=(Token)match(input,CLASS,FOLLOW_CLASS_in_primary2947); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLASS.add(CLASS179);



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
                    // 341:83: -> ^( DOTCLASS $primary)
                    {
                        dbg.location(341,86);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:341:86: ^( DOTCLASS $primary)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(341,88);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DOTCLASS, "DOTCLASS"), root_1);

                        dbg.location(341,97);
                        adaptor.addChild(root_1, stream_retval.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }


                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:342:8: IDENTIFIER arguments
                    {
                    dbg.location(342,8);
                    IDENTIFIER180=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary2966); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER180);

                    dbg.location(342,20);
                    pushFollow(FOLLOW_arguments_in_primary2969);
                    arguments181=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arguments.add(arguments181.getTree());


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
                    // 342:30: -> ^( METHODCALL THIS IDENTIFIER ( arguments )? )
                    {
                        dbg.location(342,33);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:342:33: ^( METHODCALL THIS IDENTIFIER ( arguments )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(342,35);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(METHODCALL, "METHODCALL"), root_1);

                        dbg.location(342,46);
                        adaptor.addChild(root_1, (Object)adaptor.create(THIS, "THIS"));
                        dbg.location(342,51);
                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        dbg.location(342,62);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:342:62: ( arguments )?
                        if ( stream_arguments.hasNext() ) {
                            dbg.location(342,62);
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
                    dbg.enterAlt(8);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:343:7: IDENTIFIER '.' CLASS
                    {
                    dbg.location(343,7);
                    IDENTIFIER182=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary2990); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER182);

                    dbg.location(343,18);
                    char_literal183=(Token)match(input,106,FOLLOW_106_in_primary2992); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_106.add(char_literal183);

                    dbg.location(343,22);
                    CLASS184=(Token)match(input,CLASS,FOLLOW_CLASS_in_primary2994); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLASS.add(CLASS184);



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
                    // 343:28: -> ^( DOTCLASS IDENTIFIER )
                    {
                        dbg.location(343,31);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:343:31: ^( DOTCLASS IDENTIFIER )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(343,33);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DOTCLASS, "DOTCLASS"), root_1);

                        dbg.location(343,42);
                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:344:9: ( primitiveType -> primitiveType ) ( '[' ']' -> ^( ARRAYTYPE $primary) )* ( '.' CLASS -> ^( DOTCLASS $primary) )
                    {
                    dbg.location(344,9);
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:344:9: ( primitiveType -> primitiveType )
                    dbg.enterAlt(1);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:344:10: primitiveType
                    {
                    dbg.location(344,10);
                    pushFollow(FOLLOW_primitiveType_in_primary3013);
                    primitiveType185=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primitiveType.add(primitiveType185.getTree());


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
                    // 344:24: -> primitiveType
                    {
                        dbg.location(344,27);
                        adaptor.addChild(root_0, stream_primitiveType.nextTree());

                    }

                    retval.tree = root_0;}
                    }

                    dbg.location(344,42);
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:344:42: ( '[' ']' -> ^( ARRAYTYPE $primary) )*
                    try { dbg.enterSubRule(50);

                    loop50:
                    do {
                        int alt50=2;
                        try { dbg.enterDecision(50);

                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==90) ) {
                            alt50=1;
                        }


                        } finally {dbg.exitDecision(50);}

                        switch (alt50) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:344:43: '[' ']'
                    	    {
                    	    dbg.location(344,43);
                    	    char_literal186=(Token)match(input,90,FOLLOW_90_in_primary3021); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_90.add(char_literal186);

                    	    dbg.location(344,47);
                    	    char_literal187=(Token)match(input,91,FOLLOW_91_in_primary3023); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_91.add(char_literal187);



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
                    	    // 344:51: -> ^( ARRAYTYPE $primary)
                    	    {
                    	        dbg.location(344,54);
                    	        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:344:54: ^( ARRAYTYPE $primary)
                    	        {
                    	        Object root_1 = (Object)adaptor.nil();
                    	        dbg.location(344,56);
                    	        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAYTYPE, "ARRAYTYPE"), root_1);

                    	        dbg.location(344,66);
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
                    } finally {dbg.exitSubRule(50);}

                    dbg.location(344,78);
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:344:78: ( '.' CLASS -> ^( DOTCLASS $primary) )
                    dbg.enterAlt(1);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:344:79: '.' CLASS
                    {
                    dbg.location(344,79);
                    char_literal188=(Token)match(input,106,FOLLOW_106_in_primary3037); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_106.add(char_literal188);

                    dbg.location(344,83);
                    CLASS189=(Token)match(input,CLASS,FOLLOW_CLASS_in_primary3039); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLASS.add(CLASS189);



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
                    // 344:89: -> ^( DOTCLASS $primary)
                    {
                        dbg.location(344,92);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:344:92: ^( DOTCLASS $primary)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(344,94);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DOTCLASS, "DOTCLASS"), root_1);

                        dbg.location(344,103);
                        adaptor.addChild(root_1, stream_retval.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }


                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:345:9: VOID '.' CLASS
                    {
                    dbg.location(345,9);
                    VOID190=(Token)match(input,VOID,FOLLOW_VOID_in_primary3059); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VOID.add(VOID190);

                    dbg.location(345,14);
                    char_literal191=(Token)match(input,106,FOLLOW_106_in_primary3061); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_106.add(char_literal191);

                    dbg.location(345,18);
                    CLASS192=(Token)match(input,CLASS,FOLLOW_CLASS_in_primary3063); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLASS.add(CLASS192);



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
                    // 345:24: -> ^( DOTCLASS VOID )
                    {
                        dbg.location(345,27);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:345:27: ^( DOTCLASS VOID )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(345,29);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DOTCLASS, "DOTCLASS"), root_1);

                        dbg.location(345,38);
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
        dbg.location(346, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "primary");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "primary"

    public static class selector_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "selector"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:348:1: selector[CommonTree primary] : ( '.' IDENTIFIER -> ^( FIELDACCESS IDENTIFIER ) | '.' IDENTIFIER arguments -> ^( METHODCALL IDENTIFIER ( arguments )? ) | lb= '[' expression ']' -> ^( ARRAYACCESS[$lb, \"ARRAYACCESS\"] expression ) );
    public final JaParser.selector_return selector(CommonTree primary) throws RecognitionException {
        JaParser.selector_return retval = new JaParser.selector_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lb=null;
        Token char_literal193=null;
        Token IDENTIFIER194=null;
        Token char_literal195=null;
        Token IDENTIFIER196=null;
        Token char_literal199=null;
        JaParser.arguments_return arguments197 = null;

        JaParser.expression_return expression198 = null;


        Object lb_tree=null;
        Object char_literal193_tree=null;
        Object IDENTIFIER194_tree=null;
        Object char_literal195_tree=null;
        Object IDENTIFIER196_tree=null;
        Object char_literal199_tree=null;
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
        RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try { dbg.enterRule(getGrammarFileName(), "selector");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(348, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:349:5: ( '.' IDENTIFIER -> ^( FIELDACCESS IDENTIFIER ) | '.' IDENTIFIER arguments -> ^( METHODCALL IDENTIFIER ( arguments )? ) | lb= '[' expression ']' -> ^( ARRAYACCESS[$lb, \"ARRAYACCESS\"] expression ) )
            int alt52=3;
            try { dbg.enterDecision(52);

            int LA52_0 = input.LA(1);

            if ( (LA52_0==106) ) {
                int LA52_1 = input.LA(2);

                if ( (LA52_1==IDENTIFIER) ) {
                    int LA52_3 = input.LA(3);

                    if ( ((LA52_3>=INSTANCEOF && LA52_3<=COMPAREOP)||(LA52_3>=EQ && LA52_3<=SLASH)||LA52_3==86||(LA52_3>=88 && LA52_3<=91)||(LA52_3>=93 && LA52_3<=104)||LA52_3==106) ) {
                        alt52=1;
                    }
                    else if ( (LA52_3==92) ) {
                        alt52=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 52, 3, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 52, 1, input);

                    dbg.recognitionException(nvae);
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

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(52);}

            switch (alt52) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:349:9: '.' IDENTIFIER
                    {
                    dbg.location(349,9);
                    char_literal193=(Token)match(input,106,FOLLOW_106_in_selector3096); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_106.add(char_literal193);

                    dbg.location(349,13);
                    IDENTIFIER194=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_selector3098); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER194);



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
                    // 349:24: -> ^( FIELDACCESS IDENTIFIER )
                    {
                        dbg.location(349,27);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:349:27: ^( FIELDACCESS IDENTIFIER )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(349,29);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FIELDACCESS, "FIELDACCESS"), root_1);

                        dbg.location(349,41);
                        adaptor.addChild(root_1, primary);
                        dbg.location(349,52);
                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:350:7: '.' IDENTIFIER arguments
                    {
                    dbg.location(350,7);
                    char_literal195=(Token)match(input,106,FOLLOW_106_in_selector3116); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_106.add(char_literal195);

                    dbg.location(350,11);
                    IDENTIFIER196=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_selector3118); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER196);

                    dbg.location(350,22);
                    pushFollow(FOLLOW_arguments_in_selector3120);
                    arguments197=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arguments.add(arguments197.getTree());


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
                    // 350:32: -> ^( METHODCALL IDENTIFIER ( arguments )? )
                    {
                        dbg.location(350,35);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:350:35: ^( METHODCALL IDENTIFIER ( arguments )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(350,37);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(METHODCALL, "METHODCALL"), root_1);

                        dbg.location(350,48);
                        adaptor.addChild(root_1, primary);
                        dbg.location(350,59);
                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        dbg.location(350,70);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:350:70: ( arguments )?
                        if ( stream_arguments.hasNext() ) {
                            dbg.location(350,70);
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
                    dbg.enterAlt(3);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:353:9: lb= '[' expression ']'
                    {
                    dbg.location(353,11);
                    lb=(Token)match(input,90,FOLLOW_90_in_selector3155); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_90.add(lb);

                    dbg.location(353,16);
                    pushFollow(FOLLOW_expression_in_selector3157);
                    expression198=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression198.getTree());
                    dbg.location(353,27);
                    char_literal199=(Token)match(input,91,FOLLOW_91_in_selector3159); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_91.add(char_literal199);



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
                    // 353:30: -> ^( ARRAYACCESS[$lb, \"ARRAYACCESS\"] expression )
                    {
                        dbg.location(353,33);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:353:33: ^( ARRAYACCESS[$lb, \"ARRAYACCESS\"] expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(353,35);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAYACCESS, lb, "ARRAYACCESS"), root_1);

                        dbg.location(353,67);
                        adaptor.addChild(root_1, primary);
                        dbg.location(353,78);
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
        dbg.location(354, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "selector");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "selector"

    public static class creator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "creator"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:368:1: creator : createdName ( arrayCreatorRest[(CommonTree)$createdName.tree] -> arrayCreatorRest | classCreatorRest -> createdName ( classCreatorRest )? ) ;
    public final JaParser.creator_return creator() throws RecognitionException {
        JaParser.creator_return retval = new JaParser.creator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.createdName_return createdName200 = null;

        JaParser.arrayCreatorRest_return arrayCreatorRest201 = null;

        JaParser.classCreatorRest_return classCreatorRest202 = null;


        RewriteRuleSubtreeStream stream_createdName=new RewriteRuleSubtreeStream(adaptor,"rule createdName");
        RewriteRuleSubtreeStream stream_arrayCreatorRest=new RewriteRuleSubtreeStream(adaptor,"rule arrayCreatorRest");
        RewriteRuleSubtreeStream stream_classCreatorRest=new RewriteRuleSubtreeStream(adaptor,"rule classCreatorRest");
        try { dbg.enterRule(getGrammarFileName(), "creator");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(368, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:369:5: ( createdName ( arrayCreatorRest[(CommonTree)$createdName.tree] -> arrayCreatorRest | classCreatorRest -> createdName ( classCreatorRest )? ) )
            dbg.enterAlt(1);

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:369:7: createdName ( arrayCreatorRest[(CommonTree)$createdName.tree] -> arrayCreatorRest | classCreatorRest -> createdName ( classCreatorRest )? )
            {
            dbg.location(369,7);
            pushFollow(FOLLOW_createdName_in_creator3189);
            createdName200=createdName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_createdName.add(createdName200.getTree());
            dbg.location(369,19);
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:369:19: ( arrayCreatorRest[(CommonTree)$createdName.tree] -> arrayCreatorRest | classCreatorRest -> createdName ( classCreatorRest )? )
            int alt53=2;
            try { dbg.enterSubRule(53);
            try { dbg.enterDecision(53);

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

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(53);}

            switch (alt53) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:369:21: arrayCreatorRest[(CommonTree)$createdName.tree]
                    {
                    dbg.location(369,21);
                    pushFollow(FOLLOW_arrayCreatorRest_in_creator3193);
                    arrayCreatorRest201=arrayCreatorRest((CommonTree)(createdName200!=null?((Object)createdName200.tree):null));

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arrayCreatorRest.add(arrayCreatorRest201.getTree());


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
                    // 369:69: -> arrayCreatorRest
                    {
                        dbg.location(369,72);
                        adaptor.addChild(root_0, stream_arrayCreatorRest.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:370:20: classCreatorRest
                    {
                    dbg.location(370,20);
                    pushFollow(FOLLOW_classCreatorRest_in_creator3219);
                    classCreatorRest202=classCreatorRest();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_classCreatorRest.add(classCreatorRest202.getTree());


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
                    // 370:37: -> createdName ( classCreatorRest )?
                    {
                        dbg.location(370,40);
                        adaptor.addChild(root_0, stream_createdName.nextTree());
                        dbg.location(370,52);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:370:52: ( classCreatorRest )?
                        if ( stream_classCreatorRest.hasNext() ) {
                            dbg.location(370,52);
                            adaptor.addChild(root_0, stream_classCreatorRest.nextTree());

                        }
                        stream_classCreatorRest.reset();

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            } finally {dbg.exitSubRule(53);}


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
        dbg.location(371, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "creator");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "creator"

    public static class createdName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "createdName"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:373:1: createdName : ( classType | primitiveType );
    public final JaParser.createdName_return createdName() throws RecognitionException {
        JaParser.createdName_return retval = new JaParser.createdName_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.classType_return classType203 = null;

        JaParser.primitiveType_return primitiveType204 = null;



        try { dbg.enterRule(getGrammarFileName(), "createdName");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(373, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:374:5: ( classType | primitiveType )
            int alt54=2;
            try { dbg.enterDecision(54);

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

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(54);}

            switch (alt54) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:374:9: classType
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(374,9);
                    pushFollow(FOLLOW_classType_in_createdName3248);
                    classType203=classType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classType203.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:375:9: primitiveType
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(375,9);
                    pushFollow(FOLLOW_primitiveType_in_createdName3258);
                    primitiveType204=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType204.getTree());

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
        dbg.location(376, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "createdName");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "createdName"

    public static class arrayCreatorRest_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arrayCreatorRest"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:378:1: arrayCreatorRest[CommonTree createdName] : ( (lb= '[' ']' -> ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] ) ) ( (lb= '[' ']' ) -> ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] $arrayCreatorRest) )* ( arrayInitializer -> $arrayCreatorRest arrayInitializer ) | (lb= '[' expression ']' -> ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] expression ) ) ( (lb= '[' expression ']' ) -> ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] expression $arrayCreatorRest) )* ( (lb= '[' ']' ) -> ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] $arrayCreatorRest) )* );
    public final JaParser.arrayCreatorRest_return arrayCreatorRest(CommonTree createdName) throws RecognitionException {
        JaParser.arrayCreatorRest_return retval = new JaParser.arrayCreatorRest_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lb=null;
        Token char_literal205=null;
        Token char_literal206=null;
        Token char_literal209=null;
        Token char_literal211=null;
        Token char_literal212=null;
        JaParser.arrayInitializer_return arrayInitializer207 = null;

        JaParser.expression_return expression208 = null;

        JaParser.expression_return expression210 = null;


        Object lb_tree=null;
        Object char_literal205_tree=null;
        Object char_literal206_tree=null;
        Object char_literal209_tree=null;
        Object char_literal211_tree=null;
        Object char_literal212_tree=null;
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleSubtreeStream stream_arrayInitializer=new RewriteRuleSubtreeStream(adaptor,"rule arrayInitializer");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try { dbg.enterRule(getGrammarFileName(), "arrayCreatorRest");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(378, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:379:5: ( (lb= '[' ']' -> ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] ) ) ( (lb= '[' ']' ) -> ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] $arrayCreatorRest) )* ( arrayInitializer -> $arrayCreatorRest arrayInitializer ) | (lb= '[' expression ']' -> ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] expression ) ) ( (lb= '[' expression ']' ) -> ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] expression $arrayCreatorRest) )* ( (lb= '[' ']' ) -> ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] $arrayCreatorRest) )* )
            int alt58=2;
            try { dbg.enterDecision(58);

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

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(58);}

            switch (alt58) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:379:9: (lb= '[' ']' -> ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] ) ) ( (lb= '[' ']' ) -> ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] $arrayCreatorRest) )* ( arrayInitializer -> $arrayCreatorRest arrayInitializer )
                    {
                    dbg.location(379,9);
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:379:9: (lb= '[' ']' -> ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] ) )
                    dbg.enterAlt(1);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:379:10: lb= '[' ']'
                    {
                    dbg.location(379,12);
                    lb=(Token)match(input,90,FOLLOW_90_in_arrayCreatorRest3285); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_90.add(lb);

                    dbg.location(379,16);
                    char_literal205=(Token)match(input,91,FOLLOW_91_in_arrayCreatorRest3286); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_91.add(char_literal205);



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
                    // 379:20: -> ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] )
                    {
                        dbg.location(379,23);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:379:23: ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(379,25);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAYTYPE, lb, "ARRAYTYPE"), root_1);

                        dbg.location(379,54);
                        adaptor.addChild(root_1, createdName);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }

                    dbg.location(379,71);
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:379:71: ( (lb= '[' ']' ) -> ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] $arrayCreatorRest) )*
                    try { dbg.enterSubRule(55);

                    loop55:
                    do {
                        int alt55=2;
                        try { dbg.enterDecision(55);

                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==90) ) {
                            alt55=1;
                        }


                        } finally {dbg.exitDecision(55);}

                        switch (alt55) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:379:73: (lb= '[' ']' )
                    	    {
                    	    dbg.location(379,73);
                    	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:379:73: (lb= '[' ']' )
                    	    dbg.enterAlt(1);

                    	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:379:74: lb= '[' ']'
                    	    {
                    	    dbg.location(379,76);
                    	    lb=(Token)match(input,90,FOLLOW_90_in_arrayCreatorRest3304); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_90.add(lb);

                    	    dbg.location(379,81);
                    	    char_literal206=(Token)match(input,91,FOLLOW_91_in_arrayCreatorRest3306); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_91.add(char_literal206);


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
                    	    // 379:86: -> ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] $arrayCreatorRest)
                    	    {
                    	        dbg.location(379,89);
                    	        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:379:89: ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] $arrayCreatorRest)
                    	        {
                    	        Object root_1 = (Object)adaptor.nil();
                    	        dbg.location(379,91);
                    	        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAYTYPE, lb, "ARRAYTYPE"), root_1);

                    	        dbg.location(379,119);
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
                    } finally {dbg.exitSubRule(55);}

                    dbg.location(380,7);
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:380:7: ( arrayInitializer -> $arrayCreatorRest arrayInitializer )
                    dbg.enterAlt(1);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:380:8: arrayInitializer
                    {
                    dbg.location(380,8);
                    pushFollow(FOLLOW_arrayInitializer_in_arrayCreatorRest3330);
                    arrayInitializer207=arrayInitializer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arrayInitializer.add(arrayInitializer207.getTree());


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
                    // 380:26: -> $arrayCreatorRest arrayInitializer
                    {
                        dbg.location(380,29);
                        adaptor.addChild(root_0, stream_retval.nextTree());
                        dbg.location(380,47);
                        adaptor.addChild(root_0, stream_arrayInitializer.nextTree());

                    }

                    retval.tree = root_0;}
                    }


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:381:7: (lb= '[' expression ']' -> ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] expression ) ) ( (lb= '[' expression ']' ) -> ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] expression $arrayCreatorRest) )* ( (lb= '[' ']' ) -> ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] $arrayCreatorRest) )*
                    {
                    dbg.location(381,7);
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:381:7: (lb= '[' expression ']' -> ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] expression ) )
                    dbg.enterAlt(1);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:381:8: lb= '[' expression ']'
                    {
                    dbg.location(381,10);
                    lb=(Token)match(input,90,FOLLOW_90_in_arrayCreatorRest3354); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_90.add(lb);

                    dbg.location(381,15);
                    pushFollow(FOLLOW_expression_in_arrayCreatorRest3356);
                    expression208=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression208.getTree());
                    dbg.location(381,26);
                    char_literal209=(Token)match(input,91,FOLLOW_91_in_arrayCreatorRest3358); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_91.add(char_literal209);



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
                    // 381:30: -> ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] expression )
                    {
                        dbg.location(381,33);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:381:33: ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(381,35);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAYTYPE, lb, "ARRAYTYPE"), root_1);

                        dbg.location(381,63);
                        adaptor.addChild(root_1, stream_expression.nextTree());
                        dbg.location(381,74);
                        adaptor.addChild(root_1, createdName);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }

                    dbg.location(381,91);
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:381:91: ( (lb= '[' expression ']' ) -> ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] expression $arrayCreatorRest) )*
                    try { dbg.enterSubRule(56);

                    loop56:
                    do {
                        int alt56=2;
                        try { dbg.enterDecision(56);

                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==90) ) {
                            int LA56_1 = input.LA(2);

                            if ( (LA56_1==IDENTIFIER||LA56_1==VOID||(LA56_1>=CHAR && LA56_1<=NULLLITERAL)||LA56_1==NEW||(LA56_1>=PLUS && LA56_1<=MINUS)||LA56_1==92||(LA56_1>=103 && LA56_1<=105)) ) {
                                alt56=1;
                            }


                        }


                        } finally {dbg.exitDecision(56);}

                        switch (alt56) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:381:93: (lb= '[' expression ']' )
                    	    {
                    	    dbg.location(381,93);
                    	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:381:93: (lb= '[' expression ']' )
                    	    dbg.enterAlt(1);

                    	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:381:94: lb= '[' expression ']'
                    	    {
                    	    dbg.location(381,96);
                    	    lb=(Token)match(input,90,FOLLOW_90_in_arrayCreatorRest3377); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_90.add(lb);

                    	    dbg.location(381,101);
                    	    pushFollow(FOLLOW_expression_in_arrayCreatorRest3379);
                    	    expression210=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression210.getTree());
                    	    dbg.location(381,112);
                    	    char_literal211=(Token)match(input,91,FOLLOW_91_in_arrayCreatorRest3381); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_91.add(char_literal211);


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
                    	    // 381:117: -> ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] expression $arrayCreatorRest)
                    	    {
                    	        dbg.location(381,120);
                    	        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:381:120: ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] expression $arrayCreatorRest)
                    	        {
                    	        Object root_1 = (Object)adaptor.nil();
                    	        dbg.location(381,122);
                    	        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAYTYPE, lb, "ARRAYTYPE"), root_1);

                    	        dbg.location(381,150);
                    	        adaptor.addChild(root_1, stream_expression.nextTree());
                    	        dbg.location(381,161);
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
                    } finally {dbg.exitSubRule(56);}

                    dbg.location(382,7);
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:382:7: ( (lb= '[' ']' ) -> ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] $arrayCreatorRest) )*
                    try { dbg.enterSubRule(57);

                    loop57:
                    do {
                        int alt57=2;
                        try { dbg.enterDecision(57);

                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==90) ) {
                            alt57=1;
                        }


                        } finally {dbg.exitDecision(57);}

                        switch (alt57) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:382:9: (lb= '[' ']' )
                    	    {
                    	    dbg.location(382,9);
                    	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:382:9: (lb= '[' ']' )
                    	    dbg.enterAlt(1);

                    	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:382:10: lb= '[' ']'
                    	    {
                    	    dbg.location(382,12);
                    	    lb=(Token)match(input,90,FOLLOW_90_in_arrayCreatorRest3413); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_90.add(lb);

                    	    dbg.location(382,16);
                    	    char_literal212=(Token)match(input,91,FOLLOW_91_in_arrayCreatorRest3414); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_91.add(char_literal212);


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
                    	    // 382:21: -> ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] $arrayCreatorRest)
                    	    {
                    	        dbg.location(382,24);
                    	        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:382:24: ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] $arrayCreatorRest)
                    	        {
                    	        Object root_1 = (Object)adaptor.nil();
                    	        dbg.location(382,26);
                    	        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAYTYPE, lb, "ARRAYTYPE"), root_1);

                    	        dbg.location(382,54);
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
                    } finally {dbg.exitSubRule(57);}


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
        dbg.location(383, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "arrayCreatorRest");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "arrayCreatorRest"

    public static class classCreatorRest_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classCreatorRest"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:385:1: classCreatorRest : arguments ;
    public final JaParser.classCreatorRest_return classCreatorRest() throws RecognitionException {
        JaParser.classCreatorRest_return retval = new JaParser.classCreatorRest_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.arguments_return arguments213 = null;



        try { dbg.enterRule(getGrammarFileName(), "classCreatorRest");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(385, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:386:5: ( arguments )
            dbg.enterAlt(1);

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:386:9: arguments
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(386,9);
            pushFollow(FOLLOW_arguments_in_classCreatorRest3448);
            arguments213=arguments();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments213.getTree());

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
        dbg.location(387, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "classCreatorRest");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "classCreatorRest"

    public static class superMemberAccess_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "superMemberAccess"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:389:1: superMemberAccess : ( '.' IDENTIFIER -> ^( FIELDACCESS SUPER IDENTIFIER ) | '.' IDENTIFIER arguments -> ^( METHODCALL SUPER IDENTIFIER ( arguments )? ) );
    public final JaParser.superMemberAccess_return superMemberAccess() throws RecognitionException {
        JaParser.superMemberAccess_return retval = new JaParser.superMemberAccess_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal214=null;
        Token IDENTIFIER215=null;
        Token char_literal216=null;
        Token IDENTIFIER217=null;
        JaParser.arguments_return arguments218 = null;


        Object char_literal214_tree=null;
        Object IDENTIFIER215_tree=null;
        Object char_literal216_tree=null;
        Object IDENTIFIER217_tree=null;
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
        RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");
        try { dbg.enterRule(getGrammarFileName(), "superMemberAccess");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(389, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:390:5: ( '.' IDENTIFIER -> ^( FIELDACCESS SUPER IDENTIFIER ) | '.' IDENTIFIER arguments -> ^( METHODCALL SUPER IDENTIFIER ( arguments )? ) )
            int alt59=2;
            try { dbg.enterDecision(59);

            int LA59_0 = input.LA(1);

            if ( (LA59_0==106) ) {
                int LA59_1 = input.LA(2);

                if ( (LA59_1==IDENTIFIER) ) {
                    int LA59_2 = input.LA(3);

                    if ( (LA59_2==92) ) {
                        alt59=2;
                    }
                    else if ( ((LA59_2>=INSTANCEOF && LA59_2<=COMPAREOP)||(LA59_2>=EQ && LA59_2<=SLASH)||LA59_2==86||(LA59_2>=88 && LA59_2<=91)||(LA59_2>=93 && LA59_2<=104)||LA59_2==106) ) {
                        alt59=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 59, 2, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 59, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(59);}

            switch (alt59) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:390:7: '.' IDENTIFIER
                    {
                    dbg.location(390,7);
                    char_literal214=(Token)match(input,106,FOLLOW_106_in_superMemberAccess3472); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_106.add(char_literal214);

                    dbg.location(390,11);
                    IDENTIFIER215=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_superMemberAccess3474); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER215);



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
                    // 390:22: -> ^( FIELDACCESS SUPER IDENTIFIER )
                    {
                        dbg.location(390,25);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:390:25: ^( FIELDACCESS SUPER IDENTIFIER )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(390,27);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FIELDACCESS, "FIELDACCESS"), root_1);

                        dbg.location(390,39);
                        adaptor.addChild(root_1, (Object)adaptor.create(SUPER, "SUPER"));
                        dbg.location(390,45);
                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:391:9: '.' IDENTIFIER arguments
                    {
                    dbg.location(391,9);
                    char_literal216=(Token)match(input,106,FOLLOW_106_in_superMemberAccess3494); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_106.add(char_literal216);

                    dbg.location(391,13);
                    IDENTIFIER217=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_superMemberAccess3496); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER217);

                    dbg.location(391,24);
                    pushFollow(FOLLOW_arguments_in_superMemberAccess3498);
                    arguments218=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arguments.add(arguments218.getTree());


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
                    // 391:34: -> ^( METHODCALL SUPER IDENTIFIER ( arguments )? )
                    {
                        dbg.location(391,37);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:391:37: ^( METHODCALL SUPER IDENTIFIER ( arguments )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(391,40);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(METHODCALL, "METHODCALL"), root_1);

                        dbg.location(391,51);
                        adaptor.addChild(root_1, (Object)adaptor.create(SUPER, "SUPER"));
                        dbg.location(391,57);
                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        dbg.location(391,68);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:391:68: ( arguments )?
                        if ( stream_arguments.hasNext() ) {
                            dbg.location(391,68);
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
        dbg.location(392, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "superMemberAccess");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "superMemberAccess"

    public static class arguments_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arguments"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:394:1: arguments : ( '(' ')' | '(' expressionList ')' -> ^( ARGUMENTS expressionList ) );
    public final JaParser.arguments_return arguments() throws RecognitionException {
        JaParser.arguments_return retval = new JaParser.arguments_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal219=null;
        Token char_literal220=null;
        Token char_literal221=null;
        Token char_literal223=null;
        JaParser.expressionList_return expressionList222 = null;


        Object char_literal219_tree=null;
        Object char_literal220_tree=null;
        Object char_literal221_tree=null;
        Object char_literal223_tree=null;
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");
        try { dbg.enterRule(getGrammarFileName(), "arguments");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(394, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:395:5: ( '(' ')' | '(' expressionList ')' -> ^( ARGUMENTS expressionList ) )
            int alt60=2;
            try { dbg.enterDecision(60);

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

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(60);}

            switch (alt60) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:395:9: '(' ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(395,12);
                    char_literal219=(Token)match(input,92,FOLLOW_92_in_arguments3531); if (state.failed) return retval;
                    dbg.location(395,16);
                    char_literal220=(Token)match(input,93,FOLLOW_93_in_arguments3533); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:396:7: '(' expressionList ')'
                    {
                    dbg.location(396,7);
                    char_literal221=(Token)match(input,92,FOLLOW_92_in_arguments3542); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_92.add(char_literal221);

                    dbg.location(396,11);
                    pushFollow(FOLLOW_expressionList_in_arguments3544);
                    expressionList222=expressionList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expressionList.add(expressionList222.getTree());
                    dbg.location(396,26);
                    char_literal223=(Token)match(input,93,FOLLOW_93_in_arguments3546); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_93.add(char_literal223);



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
                    // 396:30: -> ^( ARGUMENTS expressionList )
                    {
                        dbg.location(396,33);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:396:33: ^( ARGUMENTS expressionList )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(396,35);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGUMENTS, "ARGUMENTS"), root_1);

                        dbg.location(396,45);
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
        dbg.location(397, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "arguments");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "arguments"

    // $ANTLR start synpred1_Ja
    public final void synpred1_Ja_fragment() throws RecognitionException {   
        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:244:7: ( ELSE )
        dbg.enterAlt(1);

        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:244:8: ELSE
        {
        dbg.location(244,8);
        match(input,ELSE,FOLLOW_ELSE_in_synpred1_Ja1914); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_Ja

    // Delegated rules

    public final boolean synpred1_Ja() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred1_Ja_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
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
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
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
            "\1\12\2\uffff\1\12\1\uffff\22\12\10\uffff\1\12\14\uffff\2\12"+
            "\11\uffff\1\16\1\12\12\uffff\3\12",
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
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
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
            "\1\12\2\uffff\1\12\1\uffff\22\12\10\uffff\1\12\14\uffff\2\12"+
            "\11\uffff\1\16\1\12\12\uffff\3\12",
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
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA48_eotS =
        "\26\uffff";
    static final String DFA48_eofS =
        "\26\uffff";
    static final String DFA48_minS =
        "\1\44\1\uffff\1\44\2\uffff\1\101\10\132\2\44\1\133\1\uffff\1\132"+
        "\1\uffff\1\132\1\133";
    static final String DFA48_maxS =
        "\1\151\1\uffff\1\151\2\uffff\11\152\1\151\1\152\1\133\1\uffff\1"+
        "\152\1\uffff\1\152\1\133";
    static final String DFA48_acceptS =
        "\1\uffff\1\1\1\uffff\1\4\1\5\14\uffff\1\2\1\uffff\1\3\2\uffff";
    static final String DFA48_specialS =
        "\26\uffff}>";
    static final String[] DFA48_transitionS = {
            "\1\4\2\uffff\1\4\1\uffff\22\4\10\uffff\1\3\30\uffff\1\2\14\uffff"+
            "\1\1",
            "",
            "\1\5\2\uffff\1\4\1\uffff\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
            "\15\12\4\10\uffff\1\4\14\uffff\2\4\12\uffff\1\4\12\uffff\3\4",
            "",
            "",
            "\2\4\14\uffff\5\4\6\uffff\1\16\1\uffff\1\4\1\17\13\4\1\uffff"+
            "\1\4",
            "\1\20\2\uffff\1\21\14\uffff\1\4",
            "\1\20\2\uffff\1\21\14\uffff\1\4",
            "\1\20\2\uffff\1\21\14\uffff\1\4",
            "\1\20\2\uffff\1\21\14\uffff\1\4",
            "\1\20\2\uffff\1\21\14\uffff\1\4",
            "\1\20\2\uffff\1\21\14\uffff\1\4",
            "\1\20\2\uffff\1\21\14\uffff\1\4",
            "\1\20\2\uffff\1\21\14\uffff\1\4",
            "\1\4\2\uffff\1\4\1\uffff\22\4\10\uffff\1\4\14\uffff\2\4\11"+
            "\uffff\1\22\1\4\12\uffff\3\4",
            "\1\23\2\uffff\1\23\1\uffff\22\23\6\uffff\2\4\1\23\13\uffff"+
            "\5\4\2\uffff\1\4\1\uffff\4\4\1\23\14\4\1\23\1\4",
            "\1\24",
            "",
            "\1\25\2\uffff\1\23\14\uffff\1\4",
            "",
            "\1\20\2\uffff\1\23\14\uffff\1\4",
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
            return "322:1: unaryExpressionNotPlusMinus : ( '!' unaryExpression | lp= '(' primitiveType ')' unaryExpression -> ^( CAST[$lp, \"CAST\"] primitiveType unaryExpression ) | lp= '(' nonPrimitiveType ')' unaryExpressionNotPlusMinus -> ^( CAST[$lp, \"CAST\"] nonPrimitiveType unaryExpressionNotPlusMinus ) | NEW creator | ( primary -> primary ) ( selector[(CommonTree)$unaryExpressionNotPlusMinus.tree] -> selector )* ( '++' -> ^( POSTINC $unaryExpressionNotPlusMinus) | '--' -> ^( POSTDEC $unaryExpressionNotPlusMinus) )* );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA51_eotS =
        "\16\uffff";
    static final String DFA51_eofS =
        "\16\uffff";
    static final String DFA51_minS =
        "\1\44\4\uffff\1\101\2\uffff\1\43\1\uffff\1\44\3\uffff";
    static final String DFA51_maxS =
        "\1\134\4\uffff\1\152\2\uffff\1\44\1\uffff\1\151\3\uffff";
    static final String DFA51_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\11\1\12\1\uffff\1\7\1\uffff\1"+
        "\5\1\10\1\6";
    static final String DFA51_specialS =
        "\16\uffff}>";
    static final String[] DFA51_transitionS = {
            "\1\5\2\uffff\1\7\1\uffff\10\6\1\2\1\3\10\4\41\uffff\1\1",
            "",
            "",
            "",
            "",
            "\2\13\14\uffff\5\13\2\uffff\1\13\1\uffff\2\13\1\12\1\13\1\11"+
            "\14\13\1\uffff\1\10",
            "",
            "",
            "\1\14\1\13",
            "",
            "\1\13\2\uffff\1\13\1\uffff\22\13\10\uffff\1\13\14\uffff\2\13"+
            "\11\uffff\1\15\1\13\12\uffff\3\13",
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
            return "335:1: primary : ( parExpression | THIS | SUPER superMemberAccess | literal | IDENTIFIER | ( IDENTIFIER -> IDENTIFIER ) ( '[' ']' -> ^( ARRAYTYPE $primary) )+ ( '.' CLASS -> ^( DOTCLASS $primary) ) | IDENTIFIER arguments -> ^( METHODCALL THIS IDENTIFIER ( arguments )? ) | IDENTIFIER '.' CLASS -> ^( DOTCLASS IDENTIFIER ) | ( primitiveType -> primitiveType ) ( '[' ']' -> ^( ARRAYTYPE $primary) )* ( '.' CLASS -> ^( DOTCLASS $primary) ) | VOID '.' CLASS -> ^( DOTCLASS VOID ) );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
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
    public static final BitSet FOLLOW_IDENTIFIER_in_memberDeclaration450 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_formalParameters_in_memberDeclaration452 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_constructorBody_in_memberDeclaration454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_methodDeclaration503 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_formalParameters_in_methodDeclaration505 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_methodBody_in_methodDeclaration507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclarator_in_fieldDeclaration537 = new BitSet(new long[]{0x0000000000000000L,0x0000000002400000L});
    public static final BitSet FOLLOW_89_in_fieldDeclaration557 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_variableDeclarator_in_fieldDeclaration561 = new BitSet(new long[]{0x0000000000000000L,0x0000000002400000L});
    public static final BitSet FOLLOW_86_in_fieldDeclaration578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formalParameters_in_voidMethodDeclaratorRest621 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_methodBody_in_voidMethodDeclaratorRest623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_variableDeclarator649 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_EQ_in_variableDeclarator655 = new BitSet(new long[]{0x07FFFE9000000000L,0x0000038010830008L});
    public static final BitSet FOLLOW_variableInitializer_in_variableDeclarator658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_variableDeclaratorId691 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_variableDeclaratorId702 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_variableDeclaratorId704 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_arrayInitializer_in_variableInitializer757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_variableInitializer767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_arrayInitializer796 = new BitSet(new long[]{0x07FFFE9000000000L,0x0000038011830008L});
    public static final BitSet FOLLOW_variableInitializer_in_arrayInitializer799 = new BitSet(new long[]{0x0000000000000000L,0x0000000003000000L});
    public static final BitSet FOLLOW_89_in_arrayInitializer802 = new BitSet(new long[]{0x07FFFE9000000000L,0x0000038010830008L});
    public static final BitSet FOLLOW_variableInitializer_in_arrayInitializer804 = new BitSet(new long[]{0x0000000000000000L,0x0000000003000000L});
    public static final BitSet FOLLOW_89_in_arrayInitializer809 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_arrayInitializer816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PUBLIC_in_modifier850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIVATE_in_modifier863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonPrimitiveType_in_type886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_type896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classType_in_nonPrimitiveType923 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_nonPrimitiveType942 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_nonPrimitiveType944 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_primitiveType_in_nonPrimitiveType973 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_nonPrimitiveType984 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_nonPrimitiveType986 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classType1023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_primitiveType1048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BYTE_in_primitiveType1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHORT_in_primitiveType1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_primitiveType1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_in_primitiveType1108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_primitiveType1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_primitiveType1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_primitiveType1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_formalParameters1184 = new BitSet(new long[]{0x0001FE1000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_formalParameterDecls_in_formalParameters1186 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_formalParameters1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_formalParameterDecls1242 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_formalParameterDecls1244 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_formalParameterDecls1248 = new BitSet(new long[]{0x0001FE1000000000L});
    public static final BitSet FOLLOW_formalParameterDecls_in_formalParameterDecls1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_methodBody1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_constructorBody1337 = new BitSet(new long[]{0xFFFFFE9000000000L,0x0000038011C30008L});
    public static final BitSet FOLLOW_explicitConstructorInvocation_in_constructorBody1339 = new BitSet(new long[]{0xFFFFFE9000000000L,0x0000038011C30008L});
    public static final BitSet FOLLOW_blockStatement_in_constructorBody1342 = new BitSet(new long[]{0xFFFFFE9000000000L,0x0000038011C30008L});
    public static final BitSet FOLLOW_88_in_constructorBody1345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_explicitConstructorInvocation1378 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_SUPER_in_explicitConstructorInvocation1388 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_arguments_in_explicitConstructorInvocation1396 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_explicitConstructorInvocation1398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_literal0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_block1522 = new BitSet(new long[]{0xFFFFFE9000000000L,0x0000038011C30008L});
    public static final BitSet FOLLOW_blockStatement_in_block1525 = new BitSet(new long[]{0xFFFFFE9000000000L,0x0000038011C30008L});
    public static final BitSet FOLLOW_88_in_block1528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localVariableDeclarationStatement_in_blockStatement1552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_blockStatement1562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localVariableDeclaration_in_localVariableDeclarationStatement1583 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_localVariableDeclarationStatement1585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_localVariableDeclaration1603 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_variableDeclarator_in_localVariableDeclaration1605 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_localVariableDeclaration1609 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_variableDeclarator_in_localVariableDeclaration1611 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_block_in_statement1652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_statement1673 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_parExpression_in_statement1675 = new BitSet(new long[]{0xFFFFFE9000000000L,0x0000038010C30008L});
    public static final BitSet FOLLOW_statement_in_statement1677 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_elseStmt_in_statement1679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_statement1714 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_statement1718 = new BitSet(new long[]{0x07FFFE9000000000L,0x0000038010C30008L});
    public static final BitSet FOLLOW_forInit_in_statement1720 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_statement1723 = new BitSet(new long[]{0x07FFFE9000000000L,0x0000038010C30008L});
    public static final BitSet FOLLOW_expression_in_statement1725 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_statement1728 = new BitSet(new long[]{0x07FFFE9000000000L,0x0000038030830008L});
    public static final BitSet FOLLOW_forUpdate_in_statement1730 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_statement1733 = new BitSet(new long[]{0xFFFFFE9000000000L,0x0000038010C30008L});
    public static final BitSet FOLLOW_statement_in_statement1735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_statement1789 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_parExpression_in_statement1791 = new BitSet(new long[]{0xFFFFFE9000000000L,0x0000038010C30008L});
    public static final BitSet FOLLOW_statement_in_statement1793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_statement1818 = new BitSet(new long[]{0xFFFFFE9000000000L,0x0000038010C30008L});
    public static final BitSet FOLLOW_statement_in_statement1820 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_WHILE_in_statement1824 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_parExpression_in_statement1826 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_statement1828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_statement1853 = new BitSet(new long[]{0x07FFFE9000000000L,0x0000038010C30008L});
    public static final BitSet FOLLOW_expression_in_statement1856 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_statement1859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_statement1870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementExpression_in_statement1882 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_statement1884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_elseStmt1919 = new BitSet(new long[]{0xFFFFFE9000000000L,0x0000038010C30008L});
    public static final BitSet FOLLOW_statement_in_elseStmt1922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localVariableDeclaration_in_forInit1947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionList_in_forInit1957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionList_in_forUpdate1976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_parExpression1995 = new BitSet(new long[]{0x07FFFE9000000000L,0x0000038010830008L});
    public static final BitSet FOLLOW_expression_in_parExpression1998 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_parExpression2000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionList2024 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_expressionList2027 = new BitSet(new long[]{0x07FFFE9000000000L,0x0000038010830008L});
    public static final BitSet FOLLOW_expression_in_expressionList2030 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_expression_in_statementExpression2051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orExpression_in_expression2070 = new BitSet(new long[]{0x0000000000000002L,0x00000003C0008000L});
    public static final BitSet FOLLOW_assignmentOperator_in_expression2076 = new BitSet(new long[]{0x07FFFE9000000000L,0x0000038010830008L});
    public static final BitSet FOLLOW_expression_in_expression2078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_assignmentOperator2269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_assignmentOperator2284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_assignmentOperator2298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_assignmentOperator2312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_assignmentOperator2326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andExpression_in_orExpression2347 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_orExpression2351 = new BitSet(new long[]{0x07FFFE9000000000L,0x0000038010830008L});
    public static final BitSet FOLLOW_andExpression_in_orExpression2354 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_equalityExpression_in_andExpression2376 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_andExpression2380 = new BitSet(new long[]{0x07FFFE9000000000L,0x0000038010830008L});
    public static final BitSet FOLLOW_equalityExpression_in_andExpression2383 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000000L});
    public static final BitSet FOLLOW_instanceOfExpression_in_equalityExpression2405 = new BitSet(new long[]{0x0000000000000002L,0x0000003000000000L});
    public static final BitSet FOLLOW_set_in_equalityExpression2409 = new BitSet(new long[]{0x07FFFE9000000000L,0x0000038010830008L});
    public static final BitSet FOLLOW_instanceOfExpression_in_equalityExpression2418 = new BitSet(new long[]{0x0000000000000002L,0x0000003000000000L});
    public static final BitSet FOLLOW_relationalExpression_in_instanceOfExpression2440 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_INSTANCEOF_in_instanceOfExpression2443 = new BitSet(new long[]{0x0001FE1000000000L});
    public static final BitSet FOLLOW_type_in_instanceOfExpression2446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression2467 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_COMPAREOP_in_relationalExpression2471 = new BitSet(new long[]{0x07FFFE9000000000L,0x0000038010830008L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression2474 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression2496 = new BitSet(new long[]{0x0000000000000002L,0x0000000000030000L});
    public static final BitSet FOLLOW_set_in_additiveExpression2500 = new BitSet(new long[]{0x07FFFE9000000000L,0x0000038010830008L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression2509 = new BitSet(new long[]{0x0000000000000002L,0x0000000000030000L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression2531 = new BitSet(new long[]{0x0000000000000002L,0x00000040000C0000L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression2535 = new BitSet(new long[]{0x07FFFE9000000000L,0x0000038010830008L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression2550 = new BitSet(new long[]{0x0000000000000002L,0x00000040000C0000L});
    public static final BitSet FOLLOW_PLUS_in_unaryExpression2578 = new BitSet(new long[]{0x07FFFE9000000000L,0x0000038010830008L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression2580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unaryExpression2603 = new BitSet(new long[]{0x07FFFE9000000000L,0x0000038010830008L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression2605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_unaryExpression2626 = new BitSet(new long[]{0x07FFFE9000000000L,0x0000038010830008L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression2628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_unaryExpression2649 = new BitSet(new long[]{0x07FFFE9000000000L,0x0000038010830008L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression2651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression2670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_unaryExpressionNotPlusMinus2687 = new BitSet(new long[]{0x07FFFE9000000000L,0x0000038010830008L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus2690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_unaryExpressionNotPlusMinus2702 = new BitSet(new long[]{0x0001FE1000000000L});
    public static final BitSet FOLLOW_primitiveType_in_unaryExpressionNotPlusMinus2704 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_unaryExpressionNotPlusMinus2706 = new BitSet(new long[]{0x07FFFE9000000000L,0x0000038010830008L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus2708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_unaryExpressionNotPlusMinus2742 = new BitSet(new long[]{0x0001FE1000000000L});
    public static final BitSet FOLLOW_nonPrimitiveType_in_unaryExpressionNotPlusMinus2744 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_unaryExpressionNotPlusMinus2747 = new BitSet(new long[]{0x07FFFE9000000000L,0x0000038010830008L});
    public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpressionNotPlusMinus2749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_unaryExpressionNotPlusMinus2776 = new BitSet(new long[]{0x0001FE1000000000L});
    public static final BitSet FOLLOW_creator_in_unaryExpressionNotPlusMinus2779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_in_unaryExpressionNotPlusMinus2790 = new BitSet(new long[]{0x0000000000000002L,0x0000058004000000L});
    public static final BitSet FOLLOW_selector_in_unaryExpressionNotPlusMinus2799 = new BitSet(new long[]{0x0000000000000002L,0x0000058004000000L});
    public static final BitSet FOLLOW_103_in_unaryExpressionNotPlusMinus2816 = new BitSet(new long[]{0x0000000000000002L,0x0000018000000000L});
    public static final BitSet FOLLOW_104_in_unaryExpressionNotPlusMinus2829 = new BitSet(new long[]{0x0000000000000002L,0x0000018000000000L});
    public static final BitSet FOLLOW_parExpression_in_primary2866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_primary2876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUPER_in_primary2887 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_superMemberAccess_in_primary2890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primary2900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_primary2910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_primary2921 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_primary2929 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_primary2931 = new BitSet(new long[]{0x0000000000000000L,0x0000040004000000L});
    public static final BitSet FOLLOW_106_in_primary2945 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_CLASS_in_primary2947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_primary2966 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_arguments_in_primary2969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_primary2990 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_primary2992 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_CLASS_in_primary2994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_primary3013 = new BitSet(new long[]{0x0000000000000000L,0x0000040004000000L});
    public static final BitSet FOLLOW_90_in_primary3021 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_primary3023 = new BitSet(new long[]{0x0000000000000000L,0x0000040004000000L});
    public static final BitSet FOLLOW_106_in_primary3037 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_CLASS_in_primary3039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_primary3059 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_primary3061 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_CLASS_in_primary3063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_selector3096 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_selector3098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_selector3116 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_selector3118 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_arguments_in_selector3120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_selector3155 = new BitSet(new long[]{0x07FFFE9000000000L,0x0000038010830008L});
    public static final BitSet FOLLOW_expression_in_selector3157 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_selector3159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createdName_in_creator3189 = new BitSet(new long[]{0x0000000000000000L,0x0000000014000000L});
    public static final BitSet FOLLOW_arrayCreatorRest_in_creator3193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classCreatorRest_in_creator3219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classType_in_createdName3248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_createdName3258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_arrayCreatorRest3285 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_arrayCreatorRest3286 = new BitSet(new long[]{0x0000000000000000L,0x0000000004800000L});
    public static final BitSet FOLLOW_90_in_arrayCreatorRest3304 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_arrayCreatorRest3306 = new BitSet(new long[]{0x0000000000000000L,0x0000000004800000L});
    public static final BitSet FOLLOW_arrayInitializer_in_arrayCreatorRest3330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_arrayCreatorRest3354 = new BitSet(new long[]{0x07FFFE9000000000L,0x0000038010830008L});
    public static final BitSet FOLLOW_expression_in_arrayCreatorRest3356 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_arrayCreatorRest3358 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_arrayCreatorRest3377 = new BitSet(new long[]{0x07FFFE9000000000L,0x0000038010830008L});
    public static final BitSet FOLLOW_expression_in_arrayCreatorRest3379 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_arrayCreatorRest3381 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_arrayCreatorRest3413 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_arrayCreatorRest3414 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_arguments_in_classCreatorRest3448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_superMemberAccess3472 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_superMemberAccess3474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_superMemberAccess3494 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_superMemberAccess3496 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_arguments_in_superMemberAccess3498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_arguments3531 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_arguments3533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_arguments3542 = new BitSet(new long[]{0x07FFFE9000000000L,0x0000038010830008L});
    public static final BitSet FOLLOW_expressionList_in_arguments3544 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_arguments3546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_synpred1_Ja1914 = new BitSet(new long[]{0x0000000000000002L});

}