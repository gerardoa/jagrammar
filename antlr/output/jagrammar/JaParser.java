// $ANTLR 3.2 Sep 23, 2009 12:02:23 H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g 2010-06-27 12:18:50

	package jagrammar;
	
	import jagrammar.typehierarchy.*;
	import java.util.Queue;
	//import java.util.Map; già importato da antlr


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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "METHODCALL", "FIELDACCESS", "ARRAYACCESS", "DOTCLASS", "ARRAYTYPE", "METHOD", "FIELD", "CONSTR", "FPARMS", "FPARM", "FMULTPARM", "MBODY", "VARDECL", "BLOCK", "STMT", "INIT", "CONDITION", "UPDATE", "DOWHILE", "THEN", "CLASS", "IDENTIFIER", "EXTENDS", "PUBLIC", "VOID", "PRIVATE", "CHAR", "BYTE", "SHORT", "INT", "LONG", "FLOAT", "DOUBLE", "THIS", "SUPER", "INTLITERAL", "FloatingPointLiteral", "CHARLITERAL", "STRINGLITERAL", "BOOLEANLITERAL", "NULLLITERAL", "IF", "FOR", "WHILE", "DO", "RETURN", "ELSE", "INSTANCEOF", "COMPAREOP", "NEW", "Digit", "IntegerNumber", "LongSuffix", "LONGLITERAL", "Exponent", "FloatSuffix", "DoubleSuffix", "FLOATLITERAL", "DOUBLELITERAL", "EscapeSequence", "BOOLEAN", "WS", "COMMENT", "LINE_COMMENT", "EQ", "PLUS", "MINUS", "STAR", "SLASH", "Letter", "Currency", "';'", "'{'", "'}'", "','", "'['", "']'", "'('", "')'", "'...'", "'+='", "'-='", "'*='", "'/='", "'||'", "'&&'", "'=='", "'!='", "'%'", "'++'", "'--'", "'!'", "'.'"
    };
    public static final int FMULTPARM=14;
    public static final int STAR=71;
    public static final int WHILE=47;
    public static final int CHAR=30;
    public static final int BOOLEANLITERAL=43;
    public static final int NEW=53;
    public static final int DO=48;
    public static final int CONDITION=20;
    public static final int EOF=-1;
    public static final int Currency=74;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__90=90;
    public static final int FloatSuffix=59;
    public static final int THIS=37;
    public static final int RETURN=49;
    public static final int DOUBLE=36;
    public static final int VOID=28;
    public static final int SUPER=38;
    public static final int EQ=68;
    public static final int COMMENT=66;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int LINE_COMMENT=67;
    public static final int PRIVATE=29;
    public static final int ELSE=50;
    public static final int DOUBLELITERAL=62;
    public static final int INT=33;
    public static final int T__85=85;
    public static final int INTLITERAL=39;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int LongSuffix=56;
    public static final int LONGLITERAL=57;
    public static final int FIELDACCESS=5;
    public static final int WS=65;
    public static final int FloatingPointLiteral=40;
    public static final int CHARLITERAL=41;
    public static final int FPARM=13;
    public static final int FIELD=10;
    public static final int METHODCALL=4;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int INIT=19;
    public static final int Letter=73;
    public static final int EscapeSequence=63;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int CLASS=24;
    public static final int STMT=18;
    public static final int IntegerNumber=55;
    public static final int MBODY=15;
    public static final int UPDATE=21;
    public static final int ARRAYTYPE=8;
    public static final int FOR=46;
    public static final int Exponent=58;
    public static final int FLOAT=35;
    public static final int VARDECL=16;
    public static final int DOTCLASS=7;
    public static final int CONSTR=11;
    public static final int IF=45;
    public static final int SLASH=72;
    public static final int BOOLEAN=64;
    public static final int THEN=23;
    public static final int NULLLITERAL=44;
    public static final int IDENTIFIER=25;
    public static final int ARRAYACCESS=6;
    public static final int PLUS=69;
    public static final int BYTE=31;
    public static final int SHORT=32;
    public static final int FPARMS=12;
    public static final int INSTANCEOF=51;
    public static final int MINUS=70;
    public static final int Digit=54;
    public static final int DoubleSuffix=60;
    public static final int STRINGLITERAL=42;
    public static final int BLOCK=17;
    public static final int LONG=34;
    public static final int EXTENDS=26;
    public static final int PUBLIC=27;
    public static final int FLOATLITERAL=61;
    public static final int METHOD=9;
    public static final int COMPAREOP=52;
    public static final int DOWHILE=22;

    // delegates
    // delegators

    public static final String[] ruleNames = new String[] {
        "invalidRule", "classBodyDeclaration", "statement", "block", "assignmentOperator", 
        "creator", "expression", "methodBody", "compilationUnit", "fieldDeclaration", 
        "synpred2_Ja", "methodDeclaratorRest", "forInit", "identifierSuffix", 
        "blockStatement", "localVariableDeclaration", "orExpression", "primary", 
        "unaryExpression", "arrayCreatorRest", "synpred1_Ja", "forUpdate", 
        "classModifier", "formalParameters", "variableDeclaratorId", "localVariableDeclarationStatement", 
        "classDeclaration", "classType", "additiveExpression", "synpred4_Ja", 
        "nonPrimitiveType", "arguments", "memberDeclaration", "multiplicativeExpression", 
        "parExpression", "equalityExpression", "synpred3_Ja", "selector", 
        "primitiveType", "classBody", "variableInitializer", "elseStmt", 
        "methodDeclaration", "variableDeclarator", "relationalExpression", 
        "andExpression", "statementExpression", "arrayInitializer", "voidMethodDeclaratorRest", 
        "literal", "classCreatorRest", "formalParameterDecls", "createdName", 
        "superMemberAccess", "expressionList", "unaryExpressionNotPlusMinus", 
        "instanceOfExpression", "explicitConstructorInvocation", "constructorBody", 
        "typeName", "type", "modifier", "constantExpression"
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
    public String getGrammarFileName() { return "H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g"; }


    	private Queue todo;
    	private Map classTable;
    	private ReferenceType rt;
    	
    	public void setQueue(Queue q){
            	todo = q;
        	}
        	
        	public void setClassTable(Map m){
            	classTable = m;
        	}
        	
        	public void setReferenceType(ReferenceType refType) {
        		rt = refType;
        	}


    public static class compilationUnit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "compilationUnit"
    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:41:1: compilationUnit : ( classDeclaration | ';' );
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
        dbg.location(41, 1);

        try {
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:42:5: ( classDeclaration | ';' )
            int alt1=2;
            try { dbg.enterDecision(1);

            int LA1_0 = input.LA(1);

            if ( (LA1_0==PUBLIC) ) {
                alt1=1;
            }
            else if ( (LA1_0==75) ) {
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

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:42:8: classDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(42,24);
                    pushFollow(FOLLOW_classDeclaration_in_compilationUnit119);
                    classDeclaration1=classDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(classDeclaration1.getTree(), root_0);

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:43:7: ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(43,7);
                    char_literal2=(Token)match(input,75,FOLLOW_75_in_compilationUnit129); if (state.failed) return retval;
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
        dbg.location(44, 5);

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
    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:46:1: classDeclaration : classModifier CLASS IDENTIFIER ( EXTENDS type )? classBody ;
    public final JaParser.classDeclaration_return classDeclaration() throws RecognitionException {
        JaParser.classDeclaration_return retval = new JaParser.classDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CLASS4=null;
        Token IDENTIFIER5=null;
        Token EXTENDS6=null;
        JaParser.classModifier_return classModifier3 = null;

        JaParser.type_return type7 = null;

        JaParser.classBody_return classBody8 = null;


        Object CLASS4_tree=null;
        Object IDENTIFIER5_tree=null;
        Object EXTENDS6_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "classDeclaration");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(46, 1);

        try {
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:47:5: ( classModifier CLASS IDENTIFIER ( EXTENDS type )? classBody )
            dbg.enterAlt(1);

            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:47:9: classModifier CLASS IDENTIFIER ( EXTENDS type )? classBody
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(47,22);
            pushFollow(FOLLOW_classModifier_in_classDeclaration152);
            classModifier3=classModifier();

            state._fsp--;
            if (state.failed) return retval;
            dbg.location(47,29);
            CLASS4=(Token)match(input,CLASS,FOLLOW_CLASS_in_classDeclaration155); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CLASS4_tree = (Object)adaptor.create(CLASS4);
            root_0 = (Object)adaptor.becomeRoot(CLASS4_tree, root_0);
            }
            dbg.location(47,31);
            IDENTIFIER5=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classDeclaration158); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER5_tree = (Object)adaptor.create(IDENTIFIER5);
            adaptor.addChild(root_0, IDENTIFIER5_tree);
            }
            dbg.location(48,9);
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:48:9: ( EXTENDS type )?
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

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:48:10: EXTENDS type
                    {
                    dbg.location(48,17);
                    EXTENDS6=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_classDeclaration169); if (state.failed) return retval;
                    dbg.location(48,19);
                    pushFollow(FOLLOW_type_in_classDeclaration172);
                    type7=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type7.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(2);}

            dbg.location(49,9);
            pushFollow(FOLLOW_classBody_in_classDeclaration184);
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
        dbg.location(50, 5);

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
    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:52:1: classModifier : PUBLIC ;
    public final JaParser.classModifier_return classModifier() throws RecognitionException {
        JaParser.classModifier_return retval = new JaParser.classModifier_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PUBLIC9=null;

        Object PUBLIC9_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "classModifier");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(52, 1);

        try {
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:53:5: ( PUBLIC )
            dbg.enterAlt(1);

            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:54:9: PUBLIC
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(54,9);
            PUBLIC9=(Token)match(input,PUBLIC,FOLLOW_PUBLIC_in_classModifier211); if (state.failed) return retval;
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
        dbg.location(55, 5);

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
    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:61:1: classBody : '{' ( classBodyDeclaration )* '}' ;
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
        dbg.location(61, 1);

        try {
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:62:5: ( '{' ( classBodyDeclaration )* '}' )
            dbg.enterAlt(1);

            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:62:9: '{' ( classBodyDeclaration )* '}'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(62,12);
            char_literal10=(Token)match(input,76,FOLLOW_76_in_classBody240); if (state.failed) return retval;
            dbg.location(62,14);
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:62:14: ( classBodyDeclaration )*
            try { dbg.enterSubRule(3);

            loop3:
            do {
                int alt3=2;
                try { dbg.enterDecision(3);

                int LA3_0 = input.LA(1);

                if ( (LA3_0==PUBLIC||LA3_0==PRIVATE||LA3_0==75) ) {
                    alt3=1;
                }


                } finally {dbg.exitDecision(3);}

                switch (alt3) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:62:14: classBodyDeclaration
            	    {
            	    dbg.location(62,14);
            	    pushFollow(FOLLOW_classBodyDeclaration_in_classBody243);
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

            dbg.location(62,39);
            char_literal12=(Token)match(input,77,FOLLOW_77_in_classBody246); if (state.failed) return retval;

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
        dbg.location(63, 5);

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
    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:65:1: classBodyDeclaration : ( ';' | memberDeclaration );
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
        dbg.location(65, 1);

        try {
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:66:5: ( ';' | memberDeclaration )
            int alt4=2;
            try { dbg.enterDecision(4);

            int LA4_0 = input.LA(1);

            if ( (LA4_0==75) ) {
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

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:66:9: ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(66,12);
                    char_literal13=(Token)match(input,75,FOLLOW_75_in_classBodyDeclaration266); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:67:9: memberDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(67,9);
                    pushFollow(FOLLOW_memberDeclaration_in_classBodyDeclaration277);
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
        dbg.location(68, 5);

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
    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:70:1: memberDeclaration : ( ( modifier type -> modifier type ) ( methodDeclaration -> ^( METHOD $memberDeclaration methodDeclaration ) | fieldDeclaration[(CommonTree)$memberDeclaration.tree] -> fieldDeclaration ) | modifier VOID IDENTIFIER voidMethodDeclaratorRest -> ^( METHOD modifier VOID IDENTIFIER voidMethodDeclaratorRest ) | modifier ( IDENTIFIER formalParameters )=> IDENTIFIER formalParameters constructorBody -> ^( CONSTR modifier IDENTIFIER formalParameters constructorBody ) );
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
        try { dbg.enterRule(getGrammarFileName(), "memberDeclaration");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(70, 1);

        try {
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:71:5: ( ( modifier type -> modifier type ) ( methodDeclaration -> ^( METHOD $memberDeclaration methodDeclaration ) | fieldDeclaration[(CommonTree)$memberDeclaration.tree] -> fieldDeclaration ) | modifier VOID IDENTIFIER voidMethodDeclaratorRest -> ^( METHOD modifier VOID IDENTIFIER voidMethodDeclaratorRest ) | modifier ( IDENTIFIER formalParameters )=> IDENTIFIER formalParameters constructorBody -> ^( CONSTR modifier IDENTIFIER formalParameters constructorBody ) )
            int alt6=3;
            try { dbg.enterDecision(6);

            int LA6_0 = input.LA(1);

            if ( (LA6_0==PUBLIC||LA6_0==PRIVATE) ) {
                switch ( input.LA(2) ) {
                case IDENTIFIER:
                    {
                    int LA6_2 = input.LA(3);

                    if ( (LA6_2==IDENTIFIER||LA6_2==79) ) {
                        alt6=1;
                    }
                    else if ( (LA6_2==81) ) {
                        alt6=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 2, input);

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

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:71:9: ( modifier type -> modifier type ) ( methodDeclaration -> ^( METHOD $memberDeclaration methodDeclaration ) | fieldDeclaration[(CommonTree)$memberDeclaration.tree] -> fieldDeclaration )
                    {
                    dbg.location(71,9);
                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:71:9: ( modifier type -> modifier type )
                    dbg.enterAlt(1);

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:71:10: modifier type
                    {
                    dbg.location(71,10);
                    pushFollow(FOLLOW_modifier_in_memberDeclaration301);
                    modifier15=modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_modifier.add(modifier15.getTree());
                    dbg.location(71,19);
                    pushFollow(FOLLOW_type_in_memberDeclaration303);
                    type16=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type16.getTree());


                    // AST REWRITE
                    // elements: type, modifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 71:24: -> modifier type
                    {
                        dbg.location(71,27);
                        adaptor.addChild(root_0, stream_modifier.nextTree());
                        dbg.location(71,36);
                        adaptor.addChild(root_0, stream_type.nextTree());

                    }

                    retval.tree = root_0;}
                    }

                    dbg.location(71,41);
                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:71:41: ( methodDeclaration -> ^( METHOD $memberDeclaration methodDeclaration ) | fieldDeclaration[(CommonTree)$memberDeclaration.tree] -> fieldDeclaration )
                    int alt5=2;
                    try { dbg.enterSubRule(5);
                    try { dbg.enterDecision(5);

                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==IDENTIFIER) ) {
                        int LA5_1 = input.LA(2);

                        if ( (LA5_1==81) ) {
                            alt5=1;
                        }
                        else if ( (LA5_1==EQ||LA5_1==75||(LA5_1>=78 && LA5_1<=79)) ) {
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

                            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:71:42: methodDeclaration
                            {
                            dbg.location(71,42);
                            pushFollow(FOLLOW_methodDeclaration_in_memberDeclaration312);
                            methodDeclaration17=methodDeclaration();

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
                            // 71:60: -> ^( METHOD $memberDeclaration methodDeclaration )
                            {
                                dbg.location(71,63);
                                // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:71:63: ^( METHOD $memberDeclaration methodDeclaration )
                                {
                                Object root_1 = (Object)adaptor.nil();
                                dbg.location(71,65);
                                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(METHOD, "METHOD"), root_1);

                                dbg.location(71,72);
                                adaptor.addChild(root_1, stream_retval.nextTree());
                                dbg.location(71,91);
                                adaptor.addChild(root_1, stream_methodDeclaration.nextTree());

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;}
                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:72:12: fieldDeclaration[(CommonTree)$memberDeclaration.tree]
                            {
                            dbg.location(72,12);
                            pushFollow(FOLLOW_fieldDeclaration_in_memberDeclaration336);
                            fieldDeclaration18=fieldDeclaration((CommonTree)((Object)retval.tree));

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
                            // 72:66: -> fieldDeclaration
                            {
                                dbg.location(72,69);
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

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:74:9: modifier VOID IDENTIFIER voidMethodDeclaratorRest
                    {
                    dbg.location(74,9);
                    pushFollow(FOLLOW_modifier_in_memberDeclaration363);
                    modifier19=modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_modifier.add(modifier19.getTree());
                    dbg.location(74,18);
                    VOID20=(Token)match(input,VOID,FOLLOW_VOID_in_memberDeclaration365); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VOID.add(VOID20);

                    dbg.location(74,23);
                    IDENTIFIER21=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_memberDeclaration367); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER21);

                    dbg.location(74,34);
                    pushFollow(FOLLOW_voidMethodDeclaratorRest_in_memberDeclaration369);
                    voidMethodDeclaratorRest22=voidMethodDeclaratorRest();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_voidMethodDeclaratorRest.add(voidMethodDeclaratorRest22.getTree());


                    // AST REWRITE
                    // elements: voidMethodDeclaratorRest, IDENTIFIER, VOID, modifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 74:59: -> ^( METHOD modifier VOID IDENTIFIER voidMethodDeclaratorRest )
                    {
                        dbg.location(74,62);
                        // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:74:62: ^( METHOD modifier VOID IDENTIFIER voidMethodDeclaratorRest )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(74,64);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(METHOD, "METHOD"), root_1);

                        dbg.location(74,71);
                        adaptor.addChild(root_1, stream_modifier.nextTree());
                        dbg.location(74,80);
                        adaptor.addChild(root_1, stream_VOID.nextNode());
                        dbg.location(74,85);
                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        dbg.location(74,96);
                        adaptor.addChild(root_1, stream_voidMethodDeclaratorRest.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:75:9: modifier ( IDENTIFIER formalParameters )=> IDENTIFIER formalParameters constructorBody
                    {
                    dbg.location(75,9);
                    pushFollow(FOLLOW_modifier_in_memberDeclaration393);
                    modifier23=modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_modifier.add(modifier23.getTree());
                    dbg.location(75,51);
                    IDENTIFIER24=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_memberDeclaration403); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER24);

                    dbg.location(75,62);
                    pushFollow(FOLLOW_formalParameters_in_memberDeclaration405);
                    formalParameters25=formalParameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formalParameters.add(formalParameters25.getTree());
                    dbg.location(75,79);
                    pushFollow(FOLLOW_constructorBody_in_memberDeclaration407);
                    constructorBody26=constructorBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_constructorBody.add(constructorBody26.getTree());


                    // AST REWRITE
                    // elements: modifier, IDENTIFIER, constructorBody, formalParameters
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 76:6: -> ^( CONSTR modifier IDENTIFIER formalParameters constructorBody )
                    {
                        dbg.location(76,9);
                        // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:76:9: ^( CONSTR modifier IDENTIFIER formalParameters constructorBody )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(76,11);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONSTR, "CONSTR"), root_1);

                        dbg.location(76,18);
                        adaptor.addChild(root_1, stream_modifier.nextTree());
                        dbg.location(76,27);
                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        dbg.location(76,38);
                        adaptor.addChild(root_1, stream_formalParameters.nextTree());
                        dbg.location(76,55);
                        adaptor.addChild(root_1, stream_constructorBody.nextTree());

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
        dbg.location(77, 5);

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
    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:79:1: methodDeclaration : IDENTIFIER methodDeclaratorRest ;
    public final JaParser.methodDeclaration_return methodDeclaration() throws RecognitionException {
        JaParser.methodDeclaration_return retval = new JaParser.methodDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENTIFIER27=null;
        JaParser.methodDeclaratorRest_return methodDeclaratorRest28 = null;


        Object IDENTIFIER27_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "methodDeclaration");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(79, 1);

        try {
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:80:5: ( IDENTIFIER methodDeclaratorRest )
            dbg.enterAlt(1);

            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:80:9: IDENTIFIER methodDeclaratorRest
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(80,9);
            IDENTIFIER27=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_methodDeclaration446); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER27_tree = (Object)adaptor.create(IDENTIFIER27);
            adaptor.addChild(root_0, IDENTIFIER27_tree);
            }
            dbg.location(80,20);
            pushFollow(FOLLOW_methodDeclaratorRest_in_methodDeclaration448);
            methodDeclaratorRest28=methodDeclaratorRest();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, methodDeclaratorRest28.getTree());

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
        dbg.location(81, 5);

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
    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:83:1: fieldDeclaration[CommonTree modAndTyp] : variableDeclarator ( ',' variableDeclarator )* ';' -> ( ^( FIELD variableDeclarator ) )+ ;
    public final JaParser.fieldDeclaration_return fieldDeclaration(CommonTree modAndTyp) throws RecognitionException {
        JaParser.fieldDeclaration_return retval = new JaParser.fieldDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal30=null;
        Token char_literal32=null;
        JaParser.variableDeclarator_return variableDeclarator29 = null;

        JaParser.variableDeclarator_return variableDeclarator31 = null;


        Object char_literal30_tree=null;
        Object char_literal32_tree=null;
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleSubtreeStream stream_variableDeclarator=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclarator");
        try { dbg.enterRule(getGrammarFileName(), "fieldDeclaration");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(83, 1);

        try {
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:84:5: ( variableDeclarator ( ',' variableDeclarator )* ';' -> ( ^( FIELD variableDeclarator ) )+ )
            dbg.enterAlt(1);

            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:84:9: variableDeclarator ( ',' variableDeclarator )* ';'
            {
            dbg.location(84,9);
            pushFollow(FOLLOW_variableDeclarator_in_fieldDeclaration468);
            variableDeclarator29=variableDeclarator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variableDeclarator.add(variableDeclarator29.getTree());
            dbg.location(84,28);
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:84:28: ( ',' variableDeclarator )*
            try { dbg.enterSubRule(7);

            loop7:
            do {
                int alt7=2;
                try { dbg.enterDecision(7);

                int LA7_0 = input.LA(1);

                if ( (LA7_0==78) ) {
                    alt7=1;
                }


                } finally {dbg.exitDecision(7);}

                switch (alt7) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:84:29: ',' variableDeclarator
            	    {
            	    dbg.location(84,29);
            	    char_literal30=(Token)match(input,78,FOLLOW_78_in_fieldDeclaration471); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_78.add(char_literal30);

            	    dbg.location(84,33);
            	    pushFollow(FOLLOW_variableDeclarator_in_fieldDeclaration473);
            	    variableDeclarator31=variableDeclarator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_variableDeclarator.add(variableDeclarator31.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);
            } finally {dbg.exitSubRule(7);}

            dbg.location(84,54);
            char_literal32=(Token)match(input,75,FOLLOW_75_in_fieldDeclaration477); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_75.add(char_literal32);



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
            // 84:58: -> ( ^( FIELD variableDeclarator ) )+
            {
                dbg.location(84,61);
                if ( !(stream_variableDeclarator.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_variableDeclarator.hasNext() ) {
                    dbg.location(84,61);
                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:84:61: ^( FIELD variableDeclarator )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    dbg.location(84,63);
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FIELD, "FIELD"), root_1);

                    dbg.location(84,69);
                    adaptor.addChild(root_1, modAndTyp);
                    dbg.location(84,82);
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
        dbg.location(85, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "fieldDeclaration");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "fieldDeclaration"

    public static class methodDeclaratorRest_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "methodDeclaratorRest"
    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:87:1: methodDeclaratorRest : formalParameters ( methodBody | ';' ) ;
    public final JaParser.methodDeclaratorRest_return methodDeclaratorRest() throws RecognitionException {
        JaParser.methodDeclaratorRest_return retval = new JaParser.methodDeclaratorRest_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal35=null;
        JaParser.formalParameters_return formalParameters33 = null;

        JaParser.methodBody_return methodBody34 = null;


        Object char_literal35_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "methodDeclaratorRest");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(87, 1);

        try {
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:88:5: ( formalParameters ( methodBody | ';' ) )
            dbg.enterAlt(1);

            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:88:9: formalParameters ( methodBody | ';' )
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(88,9);
            pushFollow(FOLLOW_formalParameters_in_methodDeclaratorRest512);
            formalParameters33=formalParameters();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, formalParameters33.getTree());
            dbg.location(89,9);
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:89:9: ( methodBody | ';' )
            int alt8=2;
            try { dbg.enterSubRule(8);
            try { dbg.enterDecision(8);

            int LA8_0 = input.LA(1);

            if ( (LA8_0==76) ) {
                alt8=1;
            }
            else if ( (LA8_0==75) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(8);}

            switch (alt8) {
                case 1 :
                    dbg.enterAlt(1);

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:89:13: methodBody
                    {
                    dbg.location(89,13);
                    pushFollow(FOLLOW_methodBody_in_methodDeclaratorRest526);
                    methodBody34=methodBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, methodBody34.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:90:13: ';'
                    {
                    dbg.location(90,13);
                    char_literal35=(Token)match(input,75,FOLLOW_75_in_methodDeclaratorRest540); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal35_tree = (Object)adaptor.create(char_literal35);
                    adaptor.addChild(root_0, char_literal35_tree);
                    }

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
        dbg.location(92, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "methodDeclaratorRest");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "methodDeclaratorRest"

    public static class voidMethodDeclaratorRest_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "voidMethodDeclaratorRest"
    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:95:1: voidMethodDeclaratorRest : formalParameters ( methodBody | ';' ) ;
    public final JaParser.voidMethodDeclaratorRest_return voidMethodDeclaratorRest() throws RecognitionException {
        JaParser.voidMethodDeclaratorRest_return retval = new JaParser.voidMethodDeclaratorRest_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal38=null;
        JaParser.formalParameters_return formalParameters36 = null;

        JaParser.methodBody_return methodBody37 = null;


        Object char_literal38_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "voidMethodDeclaratorRest");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(95, 1);

        try {
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:96:5: ( formalParameters ( methodBody | ';' ) )
            dbg.enterAlt(1);

            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:96:9: formalParameters ( methodBody | ';' )
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(96,9);
            pushFollow(FOLLOW_formalParameters_in_voidMethodDeclaratorRest574);
            formalParameters36=formalParameters();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, formalParameters36.getTree());
            dbg.location(97,9);
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:97:9: ( methodBody | ';' )
            int alt9=2;
            try { dbg.enterSubRule(9);
            try { dbg.enterDecision(9);

            int LA9_0 = input.LA(1);

            if ( (LA9_0==76) ) {
                alt9=1;
            }
            else if ( (LA9_0==75) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(9);}

            switch (alt9) {
                case 1 :
                    dbg.enterAlt(1);

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:97:13: methodBody
                    {
                    dbg.location(97,13);
                    pushFollow(FOLLOW_methodBody_in_voidMethodDeclaratorRest588);
                    methodBody37=methodBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, methodBody37.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:98:13: ';'
                    {
                    dbg.location(98,13);
                    char_literal38=(Token)match(input,75,FOLLOW_75_in_voidMethodDeclaratorRest602); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal38_tree = (Object)adaptor.create(char_literal38);
                    adaptor.addChild(root_0, char_literal38_tree);
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(9);}


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
        dbg.location(100, 5);

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
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variableDeclarator"
    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:102:1: variableDeclarator : variableDeclaratorId ( '=' variableInitializer )? ;
    public final JaParser.variableDeclarator_return variableDeclarator() throws RecognitionException {
        JaParser.variableDeclarator_return retval = new JaParser.variableDeclarator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal40=null;
        JaParser.variableDeclaratorId_return variableDeclaratorId39 = null;

        JaParser.variableInitializer_return variableInitializer41 = null;


        Object char_literal40_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "variableDeclarator");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(102, 1);

        try {
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:103:5: ( variableDeclaratorId ( '=' variableInitializer )? )
            dbg.enterAlt(1);

            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:103:9: variableDeclaratorId ( '=' variableInitializer )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(103,9);
            pushFollow(FOLLOW_variableDeclaratorId_in_variableDeclarator631);
            variableDeclaratorId39=variableDeclaratorId();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaratorId39.getTree());
            dbg.location(103,30);
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:103:30: ( '=' variableInitializer )?
            int alt10=2;
            try { dbg.enterSubRule(10);
            try { dbg.enterDecision(10);

            int LA10_0 = input.LA(1);

            if ( (LA10_0==EQ) ) {
                alt10=1;
            }
            } finally {dbg.exitDecision(10);}

            switch (alt10) {
                case 1 :
                    dbg.enterAlt(1);

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:103:31: '=' variableInitializer
                    {
                    dbg.location(103,34);
                    char_literal40=(Token)match(input,EQ,FOLLOW_EQ_in_variableDeclarator634); if (state.failed) return retval;
                    dbg.location(103,36);
                    pushFollow(FOLLOW_variableInitializer_in_variableDeclarator637);
                    variableInitializer41=variableInitializer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableInitializer41.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(10);}


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
        dbg.location(104, 5);

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
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variableDeclaratorId"
    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:106:1: variableDeclaratorId : IDENTIFIER ( '[' ']' )* ;
    public final JaParser.variableDeclaratorId_return variableDeclaratorId() throws RecognitionException {
        JaParser.variableDeclaratorId_return retval = new JaParser.variableDeclaratorId_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENTIFIER42=null;
        Token char_literal43=null;
        Token char_literal44=null;

        Object IDENTIFIER42_tree=null;
        Object char_literal43_tree=null;
        Object char_literal44_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "variableDeclaratorId");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(106, 1);

        try {
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:107:5: ( IDENTIFIER ( '[' ']' )* )
            dbg.enterAlt(1);

            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:107:9: IDENTIFIER ( '[' ']' )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(107,9);
            IDENTIFIER42=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variableDeclaratorId663); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER42_tree = (Object)adaptor.create(IDENTIFIER42);
            adaptor.addChild(root_0, IDENTIFIER42_tree);
            }
            dbg.location(107,20);
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:107:20: ( '[' ']' )*
            try { dbg.enterSubRule(11);

            loop11:
            do {
                int alt11=2;
                try { dbg.enterDecision(11);

                int LA11_0 = input.LA(1);

                if ( (LA11_0==79) ) {
                    alt11=1;
                }


                } finally {dbg.exitDecision(11);}

                switch (alt11) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:107:21: '[' ']'
            	    {
            	    dbg.location(107,21);
            	    char_literal43=(Token)match(input,79,FOLLOW_79_in_variableDeclaratorId666); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal43_tree = (Object)adaptor.create(char_literal43);
            	    adaptor.addChild(root_0, char_literal43_tree);
            	    }
            	    dbg.location(107,25);
            	    char_literal44=(Token)match(input,80,FOLLOW_80_in_variableDeclaratorId668); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal44_tree = (Object)adaptor.create(char_literal44);
            	    adaptor.addChild(root_0, char_literal44_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);
            } finally {dbg.exitSubRule(11);}


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
        dbg.location(108, 5);

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
    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:110:1: variableInitializer : ( arrayInitializer | expression );
    public final JaParser.variableInitializer_return variableInitializer() throws RecognitionException {
        JaParser.variableInitializer_return retval = new JaParser.variableInitializer_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.arrayInitializer_return arrayInitializer45 = null;

        JaParser.expression_return expression46 = null;



        try { dbg.enterRule(getGrammarFileName(), "variableInitializer");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(110, 1);

        try {
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:111:5: ( arrayInitializer | expression )
            int alt12=2;
            try { dbg.enterDecision(12);

            int LA12_0 = input.LA(1);

            if ( (LA12_0==76) ) {
                alt12=1;
            }
            else if ( (LA12_0==IDENTIFIER||LA12_0==VOID||(LA12_0>=CHAR && LA12_0<=NULLLITERAL)||LA12_0==NEW||(LA12_0>=PLUS && LA12_0<=MINUS)||LA12_0==81||(LA12_0>=93 && LA12_0<=95)) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(12);}

            switch (alt12) {
                case 1 :
                    dbg.enterAlt(1);

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:111:9: arrayInitializer
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(111,9);
                    pushFollow(FOLLOW_arrayInitializer_in_variableInitializer689);
                    arrayInitializer45=arrayInitializer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayInitializer45.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:112:9: expression
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(112,9);
                    pushFollow(FOLLOW_expression_in_variableInitializer699);
                    expression46=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression46.getTree());

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
        dbg.location(113, 5);

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
    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:115:1: arrayInitializer : '{' ( variableInitializer ( ',' variableInitializer )* ( ',' )? )? '}' ;
    public final JaParser.arrayInitializer_return arrayInitializer() throws RecognitionException {
        JaParser.arrayInitializer_return retval = new JaParser.arrayInitializer_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal47=null;
        Token char_literal49=null;
        Token char_literal51=null;
        Token char_literal52=null;
        JaParser.variableInitializer_return variableInitializer48 = null;

        JaParser.variableInitializer_return variableInitializer50 = null;


        Object char_literal47_tree=null;
        Object char_literal49_tree=null;
        Object char_literal51_tree=null;
        Object char_literal52_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "arrayInitializer");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(115, 1);

        try {
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:116:5: ( '{' ( variableInitializer ( ',' variableInitializer )* ( ',' )? )? '}' )
            dbg.enterAlt(1);

            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:116:9: '{' ( variableInitializer ( ',' variableInitializer )* ( ',' )? )? '}'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(116,9);
            char_literal47=(Token)match(input,76,FOLLOW_76_in_arrayInitializer726); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal47_tree = (Object)adaptor.create(char_literal47);
            adaptor.addChild(root_0, char_literal47_tree);
            }
            dbg.location(116,13);
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:116:13: ( variableInitializer ( ',' variableInitializer )* ( ',' )? )?
            int alt15=2;
            try { dbg.enterSubRule(15);
            try { dbg.enterDecision(15);

            int LA15_0 = input.LA(1);

            if ( (LA15_0==IDENTIFIER||LA15_0==VOID||(LA15_0>=CHAR && LA15_0<=NULLLITERAL)||LA15_0==NEW||(LA15_0>=PLUS && LA15_0<=MINUS)||LA15_0==76||LA15_0==81||(LA15_0>=93 && LA15_0<=95)) ) {
                alt15=1;
            }
            } finally {dbg.exitDecision(15);}

            switch (alt15) {
                case 1 :
                    dbg.enterAlt(1);

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:116:14: variableInitializer ( ',' variableInitializer )* ( ',' )?
                    {
                    dbg.location(116,14);
                    pushFollow(FOLLOW_variableInitializer_in_arrayInitializer729);
                    variableInitializer48=variableInitializer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableInitializer48.getTree());
                    dbg.location(116,34);
                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:116:34: ( ',' variableInitializer )*
                    try { dbg.enterSubRule(13);

                    loop13:
                    do {
                        int alt13=2;
                        try { dbg.enterDecision(13);

                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==78) ) {
                            int LA13_1 = input.LA(2);

                            if ( (LA13_1==IDENTIFIER||LA13_1==VOID||(LA13_1>=CHAR && LA13_1<=NULLLITERAL)||LA13_1==NEW||(LA13_1>=PLUS && LA13_1<=MINUS)||LA13_1==76||LA13_1==81||(LA13_1>=93 && LA13_1<=95)) ) {
                                alt13=1;
                            }


                        }


                        } finally {dbg.exitDecision(13);}

                        switch (alt13) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:116:35: ',' variableInitializer
                    	    {
                    	    dbg.location(116,35);
                    	    char_literal49=(Token)match(input,78,FOLLOW_78_in_arrayInitializer732); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal49_tree = (Object)adaptor.create(char_literal49);
                    	    adaptor.addChild(root_0, char_literal49_tree);
                    	    }
                    	    dbg.location(116,39);
                    	    pushFollow(FOLLOW_variableInitializer_in_arrayInitializer734);
                    	    variableInitializer50=variableInitializer();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableInitializer50.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(13);}

                    dbg.location(116,61);
                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:116:61: ( ',' )?
                    int alt14=2;
                    try { dbg.enterSubRule(14);
                    try { dbg.enterDecision(14);

                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==78) ) {
                        alt14=1;
                    }
                    } finally {dbg.exitDecision(14);}

                    switch (alt14) {
                        case 1 :
                            dbg.enterAlt(1);

                            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:116:62: ','
                            {
                            dbg.location(116,62);
                            char_literal51=(Token)match(input,78,FOLLOW_78_in_arrayInitializer739); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal51_tree = (Object)adaptor.create(char_literal51);
                            adaptor.addChild(root_0, char_literal51_tree);
                            }

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(14);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(15);}

            dbg.location(116,71);
            char_literal52=(Token)match(input,77,FOLLOW_77_in_arrayInitializer746); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal52_tree = (Object)adaptor.create(char_literal52);
            adaptor.addChild(root_0, char_literal52_tree);
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
        dbg.location(117, 5);

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
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "modifier"
    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:119:1: modifier : ( PUBLIC | PRIVATE );
    public final JaParser.modifier_return modifier() throws RecognitionException {
        JaParser.modifier_return retval = new JaParser.modifier_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set53=null;

        Object set53_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "modifier");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(119, 1);

        try {
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:120:5: ( PUBLIC | PRIVATE )
            dbg.enterAlt(1);

            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(120,5);
            set53=(Token)input.LT(1);
            if ( input.LA(1)==PUBLIC||input.LA(1)==PRIVATE ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set53));
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
        dbg.location(122, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "modifier");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "modifier"

    public static class typeName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeName"
    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:124:1: typeName : IDENTIFIER ;
    public final JaParser.typeName_return typeName() throws RecognitionException {
        JaParser.typeName_return retval = new JaParser.typeName_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENTIFIER54=null;

        Object IDENTIFIER54_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "typeName");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(124, 1);

        try {
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:125:5: ( IDENTIFIER )
            dbg.enterAlt(1);

            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:125:9: IDENTIFIER
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(125,9);
            IDENTIFIER54=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_typeName794); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER54_tree = (Object)adaptor.create(IDENTIFIER54);
            adaptor.addChild(root_0, IDENTIFIER54_tree);
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
        dbg.location(126, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "typeName");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "typeName"

    public static class type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:128:1: type : ( nonPrimitiveType | primitiveType );
    public final JaParser.type_return type() throws RecognitionException {
        JaParser.type_return retval = new JaParser.type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.nonPrimitiveType_return nonPrimitiveType55 = null;

        JaParser.primitiveType_return primitiveType56 = null;



        try { dbg.enterRule(getGrammarFileName(), "type");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(128, 1);

        try {
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:129:2: ( nonPrimitiveType | primitiveType )
            int alt16=2;
            try { dbg.enterDecision(16);

            int LA16_0 = input.LA(1);

            if ( (LA16_0==IDENTIFIER) ) {
                alt16=1;
            }
            else if ( ((LA16_0>=CHAR && LA16_0<=DOUBLE)) ) {
                int LA16_2 = input.LA(2);

                if ( (LA16_2==79) ) {
                    alt16=1;
                }
                else if ( (LA16_2==EOF||LA16_2==IDENTIFIER||LA16_2==EQ||(LA16_2>=75 && LA16_2<=78)||LA16_2==80||(LA16_2>=82 && LA16_2<=91)) ) {
                    alt16=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(16);}

            switch (alt16) {
                case 1 :
                    dbg.enterAlt(1);

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:129:4: nonPrimitiveType
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(129,4);
                    pushFollow(FOLLOW_nonPrimitiveType_in_type808);
                    nonPrimitiveType55=nonPrimitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nonPrimitiveType55.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:130:4: primitiveType
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(130,4);
                    pushFollow(FOLLOW_primitiveType_in_type813);
                    primitiveType56=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType56.getTree());

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
        dbg.location(131, 2);

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
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nonPrimitiveType"
    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:133:1: nonPrimitiveType : ( classType ( '[' ']' )* | primitiveType ( '[' ']' )+ );
    public final JaParser.nonPrimitiveType_return nonPrimitiveType() throws RecognitionException {
        JaParser.nonPrimitiveType_return retval = new JaParser.nonPrimitiveType_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal58=null;
        Token char_literal59=null;
        Token char_literal61=null;
        Token char_literal62=null;
        JaParser.classType_return classType57 = null;

        JaParser.primitiveType_return primitiveType60 = null;


        Object char_literal58_tree=null;
        Object char_literal59_tree=null;
        Object char_literal61_tree=null;
        Object char_literal62_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nonPrimitiveType");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(133, 1);

        try {
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:134:2: ( classType ( '[' ']' )* | primitiveType ( '[' ']' )+ )
            int alt19=2;
            try { dbg.enterDecision(19);

            int LA19_0 = input.LA(1);

            if ( (LA19_0==IDENTIFIER) ) {
                alt19=1;
            }
            else if ( ((LA19_0>=CHAR && LA19_0<=DOUBLE)) ) {
                alt19=2;
            }
            else {
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

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:134:4: classType ( '[' ']' )*
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(134,4);
                    pushFollow(FOLLOW_classType_in_nonPrimitiveType825);
                    classType57=classType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classType57.getTree());
                    dbg.location(134,14);
                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:134:14: ( '[' ']' )*
                    try { dbg.enterSubRule(17);

                    loop17:
                    do {
                        int alt17=2;
                        try { dbg.enterDecision(17);

                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==79) ) {
                            alt17=1;
                        }


                        } finally {dbg.exitDecision(17);}

                        switch (alt17) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:134:15: '[' ']'
                    	    {
                    	    dbg.location(134,15);
                    	    char_literal58=(Token)match(input,79,FOLLOW_79_in_nonPrimitiveType828); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal58_tree = (Object)adaptor.create(char_literal58);
                    	    adaptor.addChild(root_0, char_literal58_tree);
                    	    }
                    	    dbg.location(134,19);
                    	    char_literal59=(Token)match(input,80,FOLLOW_80_in_nonPrimitiveType830); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal59_tree = (Object)adaptor.create(char_literal59);
                    	    adaptor.addChild(root_0, char_literal59_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(17);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:135:4: primitiveType ( '[' ']' )+
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(135,4);
                    pushFollow(FOLLOW_primitiveType_in_nonPrimitiveType837);
                    primitiveType60=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType60.getTree());
                    dbg.location(135,18);
                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:135:18: ( '[' ']' )+
                    int cnt18=0;
                    try { dbg.enterSubRule(18);

                    loop18:
                    do {
                        int alt18=2;
                        try { dbg.enterDecision(18);

                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==79) ) {
                            alt18=1;
                        }


                        } finally {dbg.exitDecision(18);}

                        switch (alt18) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:135:19: '[' ']'
                    	    {
                    	    dbg.location(135,19);
                    	    char_literal61=(Token)match(input,79,FOLLOW_79_in_nonPrimitiveType840); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal61_tree = (Object)adaptor.create(char_literal61);
                    	    adaptor.addChild(root_0, char_literal61_tree);
                    	    }
                    	    dbg.location(135,23);
                    	    char_literal62=(Token)match(input,80,FOLLOW_80_in_nonPrimitiveType842); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal62_tree = (Object)adaptor.create(char_literal62);
                    	    adaptor.addChild(root_0, char_literal62_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt18 >= 1 ) break loop18;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(18, input);
                                dbg.recognitionException(eee);

                                throw eee;
                        }
                        cnt18++;
                    } while (true);
                    } finally {dbg.exitSubRule(18);}


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
        dbg.location(136, 2);

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
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classType"
    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:138:1: classType : IDENTIFIER ;
    public final JaParser.classType_return classType() throws RecognitionException {
        JaParser.classType_return retval = new JaParser.classType_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENTIFIER63=null;

        Object IDENTIFIER63_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "classType");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(138, 1);

        try {
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:139:2: ( IDENTIFIER )
            dbg.enterAlt(1);

            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:139:4: IDENTIFIER
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(139,4);
            IDENTIFIER63=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classType855); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER63_tree = (Object)adaptor.create(IDENTIFIER63);
            adaptor.addChild(root_0, IDENTIFIER63_tree);
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
        dbg.location(140, 2);

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
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primitiveType"
    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:142:1: primitiveType : ( CHAR | BYTE | SHORT | INT | LONG | FLOAT | DOUBLE );
    public final JaParser.primitiveType_return primitiveType() throws RecognitionException {
        JaParser.primitiveType_return retval = new JaParser.primitiveType_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set64=null;

        Object set64_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "primitiveType");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(142, 1);

        try {
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:143:5: ( CHAR | BYTE | SHORT | INT | LONG | FLOAT | DOUBLE )
            dbg.enterAlt(1);

            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(143,5);
            set64=(Token)input.LT(1);
            if ( (input.LA(1)>=CHAR && input.LA(1)<=DOUBLE) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set64));
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
        dbg.location(150, 5);

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
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formalParameters"
    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:152:1: formalParameters : '(' ( formalParameterDecls )? ')' -> {$formalParameterDecls.tree != null}? ^( FPARMS ( formalParameterDecls )? ) ->;
    public final JaParser.formalParameters_return formalParameters() throws RecognitionException {
        JaParser.formalParameters_return retval = new JaParser.formalParameters_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal65=null;
        Token char_literal67=null;
        JaParser.formalParameterDecls_return formalParameterDecls66 = null;


        Object char_literal65_tree=null;
        Object char_literal67_tree=null;
        RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
        RewriteRuleSubtreeStream stream_formalParameterDecls=new RewriteRuleSubtreeStream(adaptor,"rule formalParameterDecls");
        try { dbg.enterRule(getGrammarFileName(), "formalParameters");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(152, 1);

        try {
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:153:5: ( '(' ( formalParameterDecls )? ')' -> {$formalParameterDecls.tree != null}? ^( FPARMS ( formalParameterDecls )? ) ->)
            dbg.enterAlt(1);

            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:153:9: '(' ( formalParameterDecls )? ')'
            {
            dbg.location(153,9);
            char_literal65=(Token)match(input,81,FOLLOW_81_in_formalParameters954); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_81.add(char_literal65);

            dbg.location(153,13);
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:153:13: ( formalParameterDecls )?
            int alt20=2;
            try { dbg.enterSubRule(20);
            try { dbg.enterDecision(20);

            int LA20_0 = input.LA(1);

            if ( (LA20_0==IDENTIFIER||(LA20_0>=CHAR && LA20_0<=DOUBLE)) ) {
                alt20=1;
            }
            } finally {dbg.exitDecision(20);}

            switch (alt20) {
                case 1 :
                    dbg.enterAlt(1);

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:153:13: formalParameterDecls
                    {
                    dbg.location(153,13);
                    pushFollow(FOLLOW_formalParameterDecls_in_formalParameters956);
                    formalParameterDecls66=formalParameterDecls();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formalParameterDecls.add(formalParameterDecls66.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(20);}

            dbg.location(153,35);
            char_literal67=(Token)match(input,82,FOLLOW_82_in_formalParameters959); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_82.add(char_literal67);



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
            // 153:39: -> {$formalParameterDecls.tree != null}? ^( FPARMS ( formalParameterDecls )? )
            if ((formalParameterDecls66!=null?((Object)formalParameterDecls66.tree):null) != null) {
                dbg.location(153,80);
                // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:153:80: ^( FPARMS ( formalParameterDecls )? )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(153,82);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FPARMS, "FPARMS"), root_1);

                dbg.location(153,89);
                // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:153:89: ( formalParameterDecls )?
                if ( stream_formalParameterDecls.hasNext() ) {
                    dbg.location(153,89);
                    adaptor.addChild(root_1, stream_formalParameterDecls.nextTree());

                }
                stream_formalParameterDecls.reset();

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 154:15: ->
            {
                dbg.location(155,5);
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
        dbg.location(155, 5);

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
    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:157:1: formalParameterDecls : ( type variableDeclaratorId ( ',' formalParameterDecls )? -> ^( FPARM type variableDeclaratorId ) ( formalParameterDecls )? | type '...' variableDeclaratorId -> ^( FMULTPARM type variableDeclaratorId ) );
    public final JaParser.formalParameterDecls_return formalParameterDecls() throws RecognitionException {
        JaParser.formalParameterDecls_return retval = new JaParser.formalParameterDecls_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal70=null;
        Token string_literal73=null;
        JaParser.type_return type68 = null;

        JaParser.variableDeclaratorId_return variableDeclaratorId69 = null;

        JaParser.formalParameterDecls_return formalParameterDecls71 = null;

        JaParser.type_return type72 = null;

        JaParser.variableDeclaratorId_return variableDeclaratorId74 = null;


        Object char_literal70_tree=null;
        Object string_literal73_tree=null;
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleSubtreeStream stream_variableDeclaratorId=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaratorId");
        RewriteRuleSubtreeStream stream_formalParameterDecls=new RewriteRuleSubtreeStream(adaptor,"rule formalParameterDecls");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try { dbg.enterRule(getGrammarFileName(), "formalParameterDecls");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(157, 1);

        try {
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:158:5: ( type variableDeclaratorId ( ',' formalParameterDecls )? -> ^( FPARM type variableDeclaratorId ) ( formalParameterDecls )? | type '...' variableDeclaratorId -> ^( FMULTPARM type variableDeclaratorId ) )
            int alt22=2;
            try { dbg.enterDecision(22);

            try {
                isCyclicDecision = true;
                alt22 = dfa22.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(22);}

            switch (alt22) {
                case 1 :
                    dbg.enterAlt(1);

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:158:8: type variableDeclaratorId ( ',' formalParameterDecls )?
                    {
                    dbg.location(158,8);
                    pushFollow(FOLLOW_type_in_formalParameterDecls1008);
                    type68=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type68.getTree());
                    dbg.location(158,13);
                    pushFollow(FOLLOW_variableDeclaratorId_in_formalParameterDecls1010);
                    variableDeclaratorId69=variableDeclaratorId();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_variableDeclaratorId.add(variableDeclaratorId69.getTree());
                    dbg.location(158,34);
                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:158:34: ( ',' formalParameterDecls )?
                    int alt21=2;
                    try { dbg.enterSubRule(21);
                    try { dbg.enterDecision(21);

                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==78) ) {
                        alt21=1;
                    }
                    } finally {dbg.exitDecision(21);}

                    switch (alt21) {
                        case 1 :
                            dbg.enterAlt(1);

                            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:158:35: ',' formalParameterDecls
                            {
                            dbg.location(158,35);
                            char_literal70=(Token)match(input,78,FOLLOW_78_in_formalParameterDecls1013); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_78.add(char_literal70);

                            dbg.location(158,39);
                            pushFollow(FOLLOW_formalParameterDecls_in_formalParameterDecls1015);
                            formalParameterDecls71=formalParameterDecls();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_formalParameterDecls.add(formalParameterDecls71.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(21);}



                    // AST REWRITE
                    // elements: variableDeclaratorId, type, formalParameterDecls
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 158:62: -> ^( FPARM type variableDeclaratorId ) ( formalParameterDecls )?
                    {
                        dbg.location(158,65);
                        // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:158:65: ^( FPARM type variableDeclaratorId )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(158,67);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FPARM, "FPARM"), root_1);

                        dbg.location(158,73);
                        adaptor.addChild(root_1, stream_type.nextTree());
                        dbg.location(158,78);
                        adaptor.addChild(root_1, stream_variableDeclaratorId.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }
                        dbg.location(158,100);
                        // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:158:100: ( formalParameterDecls )?
                        if ( stream_formalParameterDecls.hasNext() ) {
                            dbg.location(158,100);
                            adaptor.addChild(root_0, stream_formalParameterDecls.nextTree());

                        }
                        stream_formalParameterDecls.reset();

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:159:8: type '...' variableDeclaratorId
                    {
                    dbg.location(159,8);
                    pushFollow(FOLLOW_type_in_formalParameterDecls1039);
                    type72=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type72.getTree());
                    dbg.location(159,13);
                    string_literal73=(Token)match(input,83,FOLLOW_83_in_formalParameterDecls1041); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_83.add(string_literal73);

                    dbg.location(159,19);
                    pushFollow(FOLLOW_variableDeclaratorId_in_formalParameterDecls1043);
                    variableDeclaratorId74=variableDeclaratorId();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_variableDeclaratorId.add(variableDeclaratorId74.getTree());


                    // AST REWRITE
                    // elements: type, variableDeclaratorId
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 159:40: -> ^( FMULTPARM type variableDeclaratorId )
                    {
                        dbg.location(159,43);
                        // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:159:43: ^( FMULTPARM type variableDeclaratorId )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(159,45);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FMULTPARM, "FMULTPARM"), root_1);

                        dbg.location(159,55);
                        adaptor.addChild(root_1, stream_type.nextTree());
                        dbg.location(159,60);
                        adaptor.addChild(root_1, stream_variableDeclaratorId.nextTree());

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
        dbg.location(160, 5);

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
    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:162:1: methodBody : block -> ^( MBODY block ) ;
    public final JaParser.methodBody_return methodBody() throws RecognitionException {
        JaParser.methodBody_return retval = new JaParser.methodBody_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.block_return block75 = null;


        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try { dbg.enterRule(getGrammarFileName(), "methodBody");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(162, 1);

        try {
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:163:5: ( block -> ^( MBODY block ) )
            dbg.enterAlt(1);

            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:163:9: block
            {
            dbg.location(163,9);
            pushFollow(FOLLOW_block_in_methodBody1076);
            block75=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block75.getTree());


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
            // 163:15: -> ^( MBODY block )
            {
                dbg.location(163,18);
                // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:163:18: ^( MBODY block )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(163,20);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MBODY, "MBODY"), root_1);

                dbg.location(163,26);
                adaptor.addChild(root_1, stream_block.nextTree());

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
        dbg.location(164, 5);

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
    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:166:1: constructorBody : '{' ( explicitConstructorInvocation )? ( blockStatement )* '}' ;
    public final JaParser.constructorBody_return constructorBody() throws RecognitionException {
        JaParser.constructorBody_return retval = new JaParser.constructorBody_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal76=null;
        Token char_literal79=null;
        JaParser.explicitConstructorInvocation_return explicitConstructorInvocation77 = null;

        JaParser.blockStatement_return blockStatement78 = null;


        Object char_literal76_tree=null;
        Object char_literal79_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "constructorBody");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(166, 1);

        try {
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:167:5: ( '{' ( explicitConstructorInvocation )? ( blockStatement )* '}' )
            dbg.enterAlt(1);

            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:167:9: '{' ( explicitConstructorInvocation )? ( blockStatement )* '}'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(167,9);
            char_literal76=(Token)match(input,76,FOLLOW_76_in_constructorBody1103); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal76_tree = (Object)adaptor.create(char_literal76);
            adaptor.addChild(root_0, char_literal76_tree);
            }
            dbg.location(167,13);
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:167:13: ( explicitConstructorInvocation )?
            int alt23=2;
            try { dbg.enterSubRule(23);
            try { dbg.enterDecision(23);

            int LA23_0 = input.LA(1);

            if ( (LA23_0==THIS) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==81) ) {
                    alt23=1;
                }
            }
            else if ( (LA23_0==SUPER) ) {
                int LA23_3 = input.LA(2);

                if ( (LA23_3==81) ) {
                    alt23=1;
                }
            }
            } finally {dbg.exitDecision(23);}

            switch (alt23) {
                case 1 :
                    dbg.enterAlt(1);

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:167:13: explicitConstructorInvocation
                    {
                    dbg.location(167,13);
                    pushFollow(FOLLOW_explicitConstructorInvocation_in_constructorBody1105);
                    explicitConstructorInvocation77=explicitConstructorInvocation();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, explicitConstructorInvocation77.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(23);}

            dbg.location(167,44);
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:167:44: ( blockStatement )*
            try { dbg.enterSubRule(24);

            loop24:
            do {
                int alt24=2;
                try { dbg.enterDecision(24);

                int LA24_0 = input.LA(1);

                if ( (LA24_0==IDENTIFIER||LA24_0==VOID||(LA24_0>=CHAR && LA24_0<=RETURN)||LA24_0==NEW||(LA24_0>=PLUS && LA24_0<=MINUS)||(LA24_0>=75 && LA24_0<=76)||LA24_0==81||(LA24_0>=93 && LA24_0<=95)) ) {
                    alt24=1;
                }


                } finally {dbg.exitDecision(24);}

                switch (alt24) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:167:44: blockStatement
            	    {
            	    dbg.location(167,44);
            	    pushFollow(FOLLOW_blockStatement_in_constructorBody1108);
            	    blockStatement78=blockStatement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, blockStatement78.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);
            } finally {dbg.exitSubRule(24);}

            dbg.location(167,60);
            char_literal79=(Token)match(input,77,FOLLOW_77_in_constructorBody1111); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal79_tree = (Object)adaptor.create(char_literal79);
            adaptor.addChild(root_0, char_literal79_tree);
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
        dbg.location(168, 5);

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
    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:170:1: explicitConstructorInvocation : ( THIS | SUPER ) arguments ';' ;
    public final JaParser.explicitConstructorInvocation_return explicitConstructorInvocation() throws RecognitionException {
        JaParser.explicitConstructorInvocation_return retval = new JaParser.explicitConstructorInvocation_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set80=null;
        Token char_literal82=null;
        JaParser.arguments_return arguments81 = null;


        Object set80_tree=null;
        Object char_literal82_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "explicitConstructorInvocation");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(170, 1);

        try {
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:171:5: ( ( THIS | SUPER ) arguments ';' )
            dbg.enterAlt(1);

            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:171:9: ( THIS | SUPER ) arguments ';'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(171,9);
            set80=(Token)input.LT(1);
            if ( (input.LA(1)>=THIS && input.LA(1)<=SUPER) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set80));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }

            dbg.location(171,24);
            pushFollow(FOLLOW_arguments_in_explicitConstructorInvocation1138);
            arguments81=arguments();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments81.getTree());
            dbg.location(171,34);
            char_literal82=(Token)match(input,75,FOLLOW_75_in_explicitConstructorInvocation1140); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal82_tree = (Object)adaptor.create(char_literal82);
            adaptor.addChild(root_0, char_literal82_tree);
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
        dbg.location(173, 5);

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
    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:175:1: literal : ( INTLITERAL | FloatingPointLiteral | CHARLITERAL | STRINGLITERAL | BOOLEANLITERAL | NULLLITERAL );
    public final JaParser.literal_return literal() throws RecognitionException {
        JaParser.literal_return retval = new JaParser.literal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set83=null;

        Object set83_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "literal");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(175, 1);

        try {
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:176:5: ( INTLITERAL | FloatingPointLiteral | CHARLITERAL | STRINGLITERAL | BOOLEANLITERAL | NULLLITERAL )
            dbg.enterAlt(1);

            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(176,5);
            set83=(Token)input.LT(1);
            if ( (input.LA(1)>=INTLITERAL && input.LA(1)<=NULLLITERAL) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set83));
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
        dbg.location(182, 5);

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
    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:187:1: block : '{' ( blockStatement )* '}' ;
    public final JaParser.block_return block() throws RecognitionException {
        JaParser.block_return retval = new JaParser.block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal84=null;
        Token char_literal86=null;
        JaParser.blockStatement_return blockStatement85 = null;


        Object char_literal84_tree=null;
        Object char_literal86_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "block");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(187, 1);

        try {
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:188:5: ( '{' ( blockStatement )* '}' )
            dbg.enterAlt(1);

            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:188:9: '{' ( blockStatement )* '}'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(188,12);
            char_literal84=(Token)match(input,76,FOLLOW_76_in_block1237); if (state.failed) return retval;
            dbg.location(188,14);
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:188:14: ( blockStatement )*
            try { dbg.enterSubRule(25);

            loop25:
            do {
                int alt25=2;
                try { dbg.enterDecision(25);

                int LA25_0 = input.LA(1);

                if ( (LA25_0==IDENTIFIER||LA25_0==VOID||(LA25_0>=CHAR && LA25_0<=RETURN)||LA25_0==NEW||(LA25_0>=PLUS && LA25_0<=MINUS)||(LA25_0>=75 && LA25_0<=76)||LA25_0==81||(LA25_0>=93 && LA25_0<=95)) ) {
                    alt25=1;
                }


                } finally {dbg.exitDecision(25);}

                switch (alt25) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:188:14: blockStatement
            	    {
            	    dbg.location(188,14);
            	    pushFollow(FOLLOW_blockStatement_in_block1240);
            	    blockStatement85=blockStatement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, blockStatement85.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);
            } finally {dbg.exitSubRule(25);}

            dbg.location(188,33);
            char_literal86=(Token)match(input,77,FOLLOW_77_in_block1243); if (state.failed) return retval;

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
        dbg.location(189, 5);

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
    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:191:1: blockStatement : ( localVariableDeclarationStatement | statement );
    public final JaParser.blockStatement_return blockStatement() throws RecognitionException {
        JaParser.blockStatement_return retval = new JaParser.blockStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.localVariableDeclarationStatement_return localVariableDeclarationStatement87 = null;

        JaParser.statement_return statement88 = null;



        try { dbg.enterRule(getGrammarFileName(), "blockStatement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(191, 1);

        try {
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:192:5: ( localVariableDeclarationStatement | statement )
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

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:192:9: localVariableDeclarationStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(192,9);
                    pushFollow(FOLLOW_localVariableDeclarationStatement_in_blockStatement1267);
                    localVariableDeclarationStatement87=localVariableDeclarationStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, localVariableDeclarationStatement87.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:193:9: statement
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(193,9);
                    pushFollow(FOLLOW_statement_in_blockStatement1277);
                    statement88=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement88.getTree());

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
        dbg.location(194, 5);

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
    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:196:1: localVariableDeclarationStatement : localVariableDeclaration ';' ;
    public final JaParser.localVariableDeclarationStatement_return localVariableDeclarationStatement() throws RecognitionException {
        JaParser.localVariableDeclarationStatement_return retval = new JaParser.localVariableDeclarationStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal90=null;
        JaParser.localVariableDeclaration_return localVariableDeclaration89 = null;


        Object char_literal90_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "localVariableDeclarationStatement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(196, 1);

        try {
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:197:5: ( localVariableDeclaration ';' )
            dbg.enterAlt(1);

            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:197:10: localVariableDeclaration ';'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(197,10);
            pushFollow(FOLLOW_localVariableDeclaration_in_localVariableDeclarationStatement1301);
            localVariableDeclaration89=localVariableDeclaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, localVariableDeclaration89.getTree());
            dbg.location(197,38);
            char_literal90=(Token)match(input,75,FOLLOW_75_in_localVariableDeclarationStatement1303); if (state.failed) return retval;

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
        dbg.location(198, 5);

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
    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:200:1: localVariableDeclaration : type variableDeclarator ( ',' variableDeclarator )* -> ( ^( VARDECL type variableDeclarator ) )+ ;
    public final JaParser.localVariableDeclaration_return localVariableDeclaration() throws RecognitionException {
        JaParser.localVariableDeclaration_return retval = new JaParser.localVariableDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal93=null;
        JaParser.type_return type91 = null;

        JaParser.variableDeclarator_return variableDeclarator92 = null;

        JaParser.variableDeclarator_return variableDeclarator94 = null;


        Object char_literal93_tree=null;
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleSubtreeStream stream_variableDeclarator=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclarator");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try { dbg.enterRule(getGrammarFileName(), "localVariableDeclaration");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(200, 1);

        try {
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:201:5: ( type variableDeclarator ( ',' variableDeclarator )* -> ( ^( VARDECL type variableDeclarator ) )+ )
            dbg.enterAlt(1);

            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:201:9: type variableDeclarator ( ',' variableDeclarator )*
            {
            dbg.location(201,9);
            pushFollow(FOLLOW_type_in_localVariableDeclaration1323);
            type91=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type91.getTree());
            dbg.location(201,14);
            pushFollow(FOLLOW_variableDeclarator_in_localVariableDeclaration1325);
            variableDeclarator92=variableDeclarator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variableDeclarator.add(variableDeclarator92.getTree());
            dbg.location(201,33);
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:201:33: ( ',' variableDeclarator )*
            try { dbg.enterSubRule(27);

            loop27:
            do {
                int alt27=2;
                try { dbg.enterDecision(27);

                int LA27_0 = input.LA(1);

                if ( (LA27_0==78) ) {
                    alt27=1;
                }


                } finally {dbg.exitDecision(27);}

                switch (alt27) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:201:34: ',' variableDeclarator
            	    {
            	    dbg.location(201,34);
            	    char_literal93=(Token)match(input,78,FOLLOW_78_in_localVariableDeclaration1328); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_78.add(char_literal93);

            	    dbg.location(201,38);
            	    pushFollow(FOLLOW_variableDeclarator_in_localVariableDeclaration1330);
            	    variableDeclarator94=variableDeclarator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_variableDeclarator.add(variableDeclarator94.getTree());

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);
            } finally {dbg.exitSubRule(27);}



            // AST REWRITE
            // elements: variableDeclarator, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 201:59: -> ( ^( VARDECL type variableDeclarator ) )+
            {
                dbg.location(201,62);
                if ( !(stream_variableDeclarator.hasNext()||stream_type.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_variableDeclarator.hasNext()||stream_type.hasNext() ) {
                    dbg.location(201,62);
                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:201:62: ^( VARDECL type variableDeclarator )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    dbg.location(201,64);
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARDECL, "VARDECL"), root_1);

                    dbg.location(201,72);
                    adaptor.addChild(root_1, stream_type.nextTree());
                    dbg.location(201,77);
                    adaptor.addChild(root_1, stream_variableDeclarator.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_variableDeclarator.reset();
                stream_type.reset();

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
        dbg.location(202, 5);

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
    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:205:1: statement : ( block -> ^( BLOCK block ) | IF parExpression statement elseStmt -> ^( IF ^( CONDITION parExpression ) ^( THEN statement ) ( elseStmt )? ) | FOR '(' ( forInit )? ';' ( expression )? ';' ( forUpdate )? ')' statement -> ^( FOR ( ^( INIT forInit ) )? ( ^( CONDITION expression ) )? ( ^( UPDATE forUpdate ) )? statement ) | WHILE parExpression statement -> ^( WHILE ^( CONDITION parExpression ) statement ) | DO statement WHILE parExpression ';' -> ^( DOWHILE ^( CONDITION parExpression ) statement ) | RETURN ( expression )? ';' | ';' | statementExpression ';' -> ^( STMT statementExpression ) );
    public final JaParser.statement_return statement() throws RecognitionException {
        JaParser.statement_return retval = new JaParser.statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IF96=null;
        Token FOR100=null;
        Token char_literal101=null;
        Token char_literal103=null;
        Token char_literal105=null;
        Token char_literal107=null;
        Token WHILE109=null;
        Token DO112=null;
        Token WHILE114=null;
        Token char_literal116=null;
        Token RETURN117=null;
        Token char_literal119=null;
        Token char_literal120=null;
        Token char_literal122=null;
        JaParser.block_return block95 = null;

        JaParser.parExpression_return parExpression97 = null;

        JaParser.statement_return statement98 = null;

        JaParser.elseStmt_return elseStmt99 = null;

        JaParser.forInit_return forInit102 = null;

        JaParser.expression_return expression104 = null;

        JaParser.forUpdate_return forUpdate106 = null;

        JaParser.statement_return statement108 = null;

        JaParser.parExpression_return parExpression110 = null;

        JaParser.statement_return statement111 = null;

        JaParser.statement_return statement113 = null;

        JaParser.parExpression_return parExpression115 = null;

        JaParser.expression_return expression118 = null;

        JaParser.statementExpression_return statementExpression121 = null;


        Object IF96_tree=null;
        Object FOR100_tree=null;
        Object char_literal101_tree=null;
        Object char_literal103_tree=null;
        Object char_literal105_tree=null;
        Object char_literal107_tree=null;
        Object WHILE109_tree=null;
        Object DO112_tree=null;
        Object WHILE114_tree=null;
        Object char_literal116_tree=null;
        Object RETURN117_tree=null;
        Object char_literal119_tree=null;
        Object char_literal120_tree=null;
        Object char_literal122_tree=null;
        RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
        RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_parExpression=new RewriteRuleSubtreeStream(adaptor,"rule parExpression");
        RewriteRuleSubtreeStream stream_elseStmt=new RewriteRuleSubtreeStream(adaptor,"rule elseStmt");
        RewriteRuleSubtreeStream stream_statementExpression=new RewriteRuleSubtreeStream(adaptor,"rule statementExpression");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_forInit=new RewriteRuleSubtreeStream(adaptor,"rule forInit");
        RewriteRuleSubtreeStream stream_forUpdate=new RewriteRuleSubtreeStream(adaptor,"rule forUpdate");
        try { dbg.enterRule(getGrammarFileName(), "statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(205, 1);

        try {
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:206:5: ( block -> ^( BLOCK block ) | IF parExpression statement elseStmt -> ^( IF ^( CONDITION parExpression ) ^( THEN statement ) ( elseStmt )? ) | FOR '(' ( forInit )? ';' ( expression )? ';' ( forUpdate )? ')' statement -> ^( FOR ( ^( INIT forInit ) )? ( ^( CONDITION expression ) )? ( ^( UPDATE forUpdate ) )? statement ) | WHILE parExpression statement -> ^( WHILE ^( CONDITION parExpression ) statement ) | DO statement WHILE parExpression ';' -> ^( DOWHILE ^( CONDITION parExpression ) statement ) | RETURN ( expression )? ';' | ';' | statementExpression ';' -> ^( STMT statementExpression ) )
            int alt32=8;
            try { dbg.enterDecision(32);

            switch ( input.LA(1) ) {
            case 76:
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
            case 75:
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
            case THIS:
            case SUPER:
            case INTLITERAL:
            case FloatingPointLiteral:
            case CHARLITERAL:
            case STRINGLITERAL:
            case BOOLEANLITERAL:
            case NULLLITERAL:
            case NEW:
            case PLUS:
            case MINUS:
            case 81:
            case 93:
            case 94:
            case 95:
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

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:206:9: block
                    {
                    dbg.location(206,9);
                    pushFollow(FOLLOW_block_in_statement1366);
                    block95=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block95.getTree());


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
                    // 206:15: -> ^( BLOCK block )
                    {
                        dbg.location(206,18);
                        // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:206:18: ^( BLOCK block )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(206,20);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);

                        dbg.location(206,26);
                        adaptor.addChild(root_1, stream_block.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:207:9: IF parExpression statement elseStmt
                    {
                    dbg.location(207,9);
                    IF96=(Token)match(input,IF,FOLLOW_IF_in_statement1384); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF96);

                    dbg.location(207,12);
                    pushFollow(FOLLOW_parExpression_in_statement1386);
                    parExpression97=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression97.getTree());
                    dbg.location(207,26);
                    pushFollow(FOLLOW_statement_in_statement1388);
                    statement98=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement98.getTree());
                    dbg.location(207,36);
                    pushFollow(FOLLOW_elseStmt_in_statement1390);
                    elseStmt99=elseStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_elseStmt.add(elseStmt99.getTree());


                    // AST REWRITE
                    // elements: elseStmt, statement, IF, parExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 207:45: -> ^( IF ^( CONDITION parExpression ) ^( THEN statement ) ( elseStmt )? )
                    {
                        dbg.location(207,48);
                        // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:207:48: ^( IF ^( CONDITION parExpression ) ^( THEN statement ) ( elseStmt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(207,50);
                        root_1 = (Object)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                        dbg.location(207,53);
                        // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:207:53: ^( CONDITION parExpression )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(207,55);
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONDITION, "CONDITION"), root_2);

                        dbg.location(207,65);
                        adaptor.addChild(root_2, stream_parExpression.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        dbg.location(207,80);
                        // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:207:80: ^( THEN statement )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(207,82);
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(THEN, "THEN"), root_2);

                        dbg.location(207,87);
                        adaptor.addChild(root_2, stream_statement.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        dbg.location(207,98);
                        // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:207:98: ( elseStmt )?
                        if ( stream_elseStmt.hasNext() ) {
                            dbg.location(207,98);
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

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:208:9: FOR '(' ( forInit )? ';' ( expression )? ';' ( forUpdate )? ')' statement
                    {
                    dbg.location(208,9);
                    FOR100=(Token)match(input,FOR,FOLLOW_FOR_in_statement1421); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOR.add(FOR100);

                    dbg.location(208,13);
                    char_literal101=(Token)match(input,81,FOLLOW_81_in_statement1423); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_81.add(char_literal101);

                    dbg.location(208,17);
                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:208:17: ( forInit )?
                    int alt28=2;
                    try { dbg.enterSubRule(28);
                    try { dbg.enterDecision(28);

                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==IDENTIFIER||LA28_0==VOID||(LA28_0>=CHAR && LA28_0<=NULLLITERAL)||LA28_0==NEW||(LA28_0>=PLUS && LA28_0<=MINUS)||LA28_0==81||(LA28_0>=93 && LA28_0<=95)) ) {
                        alt28=1;
                    }
                    } finally {dbg.exitDecision(28);}

                    switch (alt28) {
                        case 1 :
                            dbg.enterAlt(1);

                            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:208:17: forInit
                            {
                            dbg.location(208,17);
                            pushFollow(FOLLOW_forInit_in_statement1425);
                            forInit102=forInit();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_forInit.add(forInit102.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(28);}

                    dbg.location(208,26);
                    char_literal103=(Token)match(input,75,FOLLOW_75_in_statement1428); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_75.add(char_literal103);

                    dbg.location(208,30);
                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:208:30: ( expression )?
                    int alt29=2;
                    try { dbg.enterSubRule(29);
                    try { dbg.enterDecision(29);

                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==IDENTIFIER||LA29_0==VOID||(LA29_0>=CHAR && LA29_0<=NULLLITERAL)||LA29_0==NEW||(LA29_0>=PLUS && LA29_0<=MINUS)||LA29_0==81||(LA29_0>=93 && LA29_0<=95)) ) {
                        alt29=1;
                    }
                    } finally {dbg.exitDecision(29);}

                    switch (alt29) {
                        case 1 :
                            dbg.enterAlt(1);

                            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:208:30: expression
                            {
                            dbg.location(208,30);
                            pushFollow(FOLLOW_expression_in_statement1430);
                            expression104=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(expression104.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(29);}

                    dbg.location(208,42);
                    char_literal105=(Token)match(input,75,FOLLOW_75_in_statement1433); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_75.add(char_literal105);

                    dbg.location(208,46);
                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:208:46: ( forUpdate )?
                    int alt30=2;
                    try { dbg.enterSubRule(30);
                    try { dbg.enterDecision(30);

                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==IDENTIFIER||LA30_0==VOID||(LA30_0>=CHAR && LA30_0<=NULLLITERAL)||LA30_0==NEW||(LA30_0>=PLUS && LA30_0<=MINUS)||LA30_0==81||(LA30_0>=93 && LA30_0<=95)) ) {
                        alt30=1;
                    }
                    } finally {dbg.exitDecision(30);}

                    switch (alt30) {
                        case 1 :
                            dbg.enterAlt(1);

                            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:208:46: forUpdate
                            {
                            dbg.location(208,46);
                            pushFollow(FOLLOW_forUpdate_in_statement1435);
                            forUpdate106=forUpdate();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_forUpdate.add(forUpdate106.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(30);}

                    dbg.location(208,57);
                    char_literal107=(Token)match(input,82,FOLLOW_82_in_statement1438); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_82.add(char_literal107);

                    dbg.location(208,61);
                    pushFollow(FOLLOW_statement_in_statement1440);
                    statement108=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement108.getTree());


                    // AST REWRITE
                    // elements: expression, forInit, FOR, statement, forUpdate
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 209:6: -> ^( FOR ( ^( INIT forInit ) )? ( ^( CONDITION expression ) )? ( ^( UPDATE forUpdate ) )? statement )
                    {
                        dbg.location(209,9);
                        // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:209:9: ^( FOR ( ^( INIT forInit ) )? ( ^( CONDITION expression ) )? ( ^( UPDATE forUpdate ) )? statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(209,11);
                        root_1 = (Object)adaptor.becomeRoot(stream_FOR.nextNode(), root_1);

                        dbg.location(209,15);
                        // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:209:15: ( ^( INIT forInit ) )?
                        if ( stream_forInit.hasNext() ) {
                            dbg.location(209,15);
                            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:209:15: ^( INIT forInit )
                            {
                            Object root_2 = (Object)adaptor.nil();
                            dbg.location(209,17);
                            root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(INIT, "INIT"), root_2);

                            dbg.location(209,22);
                            adaptor.addChild(root_2, stream_forInit.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_forInit.reset();
                        dbg.location(209,32);
                        // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:209:32: ( ^( CONDITION expression ) )?
                        if ( stream_expression.hasNext() ) {
                            dbg.location(209,32);
                            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:209:32: ^( CONDITION expression )
                            {
                            Object root_2 = (Object)adaptor.nil();
                            dbg.location(209,34);
                            root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONDITION, "CONDITION"), root_2);

                            dbg.location(209,44);
                            adaptor.addChild(root_2, stream_expression.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_expression.reset();
                        dbg.location(209,57);
                        // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:209:57: ( ^( UPDATE forUpdate ) )?
                        if ( stream_forUpdate.hasNext() ) {
                            dbg.location(209,57);
                            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:209:57: ^( UPDATE forUpdate )
                            {
                            Object root_2 = (Object)adaptor.nil();
                            dbg.location(209,59);
                            root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(UPDATE, "UPDATE"), root_2);

                            dbg.location(209,66);
                            adaptor.addChild(root_2, stream_forUpdate.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_forUpdate.reset();
                        dbg.location(209,78);
                        adaptor.addChild(root_1, stream_statement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:210:9: WHILE parExpression statement
                    {
                    dbg.location(210,9);
                    WHILE109=(Token)match(input,WHILE,FOLLOW_WHILE_in_statement1486); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE.add(WHILE109);

                    dbg.location(210,15);
                    pushFollow(FOLLOW_parExpression_in_statement1488);
                    parExpression110=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression110.getTree());
                    dbg.location(210,29);
                    pushFollow(FOLLOW_statement_in_statement1490);
                    statement111=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement111.getTree());


                    // AST REWRITE
                    // elements: statement, parExpression, WHILE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 210:39: -> ^( WHILE ^( CONDITION parExpression ) statement )
                    {
                        dbg.location(210,42);
                        // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:210:42: ^( WHILE ^( CONDITION parExpression ) statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(210,44);
                        root_1 = (Object)adaptor.becomeRoot(stream_WHILE.nextNode(), root_1);

                        dbg.location(210,50);
                        // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:210:50: ^( CONDITION parExpression )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(210,52);
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONDITION, "CONDITION"), root_2);

                        dbg.location(210,62);
                        adaptor.addChild(root_2, stream_parExpression.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        dbg.location(210,77);
                        adaptor.addChild(root_1, stream_statement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:211:9: DO statement WHILE parExpression ';'
                    {
                    dbg.location(211,9);
                    DO112=(Token)match(input,DO,FOLLOW_DO_in_statement1514); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DO.add(DO112);

                    dbg.location(211,12);
                    pushFollow(FOLLOW_statement_in_statement1516);
                    statement113=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement113.getTree());
                    dbg.location(211,22);
                    WHILE114=(Token)match(input,WHILE,FOLLOW_WHILE_in_statement1518); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE.add(WHILE114);

                    dbg.location(211,28);
                    pushFollow(FOLLOW_parExpression_in_statement1520);
                    parExpression115=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression115.getTree());
                    dbg.location(211,42);
                    char_literal116=(Token)match(input,75,FOLLOW_75_in_statement1522); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_75.add(char_literal116);



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
                    // 211:46: -> ^( DOWHILE ^( CONDITION parExpression ) statement )
                    {
                        dbg.location(211,49);
                        // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:211:49: ^( DOWHILE ^( CONDITION parExpression ) statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(211,51);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DOWHILE, "DOWHILE"), root_1);

                        dbg.location(211,59);
                        // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:211:59: ^( CONDITION parExpression )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(211,61);
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONDITION, "CONDITION"), root_2);

                        dbg.location(211,71);
                        adaptor.addChild(root_2, stream_parExpression.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        dbg.location(211,86);
                        adaptor.addChild(root_1, stream_statement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:212:9: RETURN ( expression )? ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(212,15);
                    RETURN117=(Token)match(input,RETURN,FOLLOW_RETURN_in_statement1546); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RETURN117_tree = (Object)adaptor.create(RETURN117);
                    root_0 = (Object)adaptor.becomeRoot(RETURN117_tree, root_0);
                    }
                    dbg.location(212,17);
                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:212:17: ( expression )?
                    int alt31=2;
                    try { dbg.enterSubRule(31);
                    try { dbg.enterDecision(31);

                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==IDENTIFIER||LA31_0==VOID||(LA31_0>=CHAR && LA31_0<=NULLLITERAL)||LA31_0==NEW||(LA31_0>=PLUS && LA31_0<=MINUS)||LA31_0==81||(LA31_0>=93 && LA31_0<=95)) ) {
                        alt31=1;
                    }
                    } finally {dbg.exitDecision(31);}

                    switch (alt31) {
                        case 1 :
                            dbg.enterAlt(1);

                            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:212:17: expression
                            {
                            dbg.location(212,17);
                            pushFollow(FOLLOW_expression_in_statement1549);
                            expression118=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression118.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(31);}

                    dbg.location(212,32);
                    char_literal119=(Token)match(input,75,FOLLOW_75_in_statement1552); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:213:9: ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(213,12);
                    char_literal120=(Token)match(input,75,FOLLOW_75_in_statement1563); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:214:9: statementExpression ';'
                    {
                    dbg.location(214,9);
                    pushFollow(FOLLOW_statementExpression_in_statement1575);
                    statementExpression121=statementExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementExpression.add(statementExpression121.getTree());
                    dbg.location(214,29);
                    char_literal122=(Token)match(input,75,FOLLOW_75_in_statement1577); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_75.add(char_literal122);



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
                    // 214:33: -> ^( STMT statementExpression )
                    {
                        dbg.location(214,36);
                        // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:214:36: ^( STMT statementExpression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(214,38);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(STMT, "STMT"), root_1);

                        dbg.location(214,43);
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
        dbg.location(215, 5);

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
    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:217:1: elseStmt : ( ( ELSE )=> ELSE statement | );
    public final JaParser.elseStmt_return elseStmt() throws RecognitionException {
        JaParser.elseStmt_return retval = new JaParser.elseStmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ELSE123=null;
        JaParser.statement_return statement124 = null;


        Object ELSE123_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "elseStmt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(217, 1);

        try {
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:217:9: ( ( ELSE )=> ELSE statement | )
            int alt33=2;
            try { dbg.enterDecision(33);

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

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else if ( (LA33_0==IDENTIFIER||LA33_0==VOID||(LA33_0>=CHAR && LA33_0<=RETURN)||LA33_0==NEW||(LA33_0>=PLUS && LA33_0<=MINUS)||(LA33_0>=75 && LA33_0<=77)||LA33_0==81||(LA33_0>=93 && LA33_0<=95)) ) {
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

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:218:2: ( ELSE )=> ELSE statement
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(218,16);
                    ELSE123=(Token)match(input,ELSE,FOLLOW_ELSE_in_elseStmt1609); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ELSE123_tree = (Object)adaptor.create(ELSE123);
                    root_0 = (Object)adaptor.becomeRoot(ELSE123_tree, root_0);
                    }
                    dbg.location(218,18);
                    pushFollow(FOLLOW_statement_in_elseStmt1612);
                    statement124=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement124.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:220:2: 
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
        dbg.location(220, 2);

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
    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:227:1: forInit : ( localVariableDeclaration | expressionList );
    public final JaParser.forInit_return forInit() throws RecognitionException {
        JaParser.forInit_return retval = new JaParser.forInit_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.localVariableDeclaration_return localVariableDeclaration125 = null;

        JaParser.expressionList_return expressionList126 = null;



        try { dbg.enterRule(getGrammarFileName(), "forInit");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(227, 1);

        try {
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:228:5: ( localVariableDeclaration | expressionList )
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

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:228:9: localVariableDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(228,9);
                    pushFollow(FOLLOW_localVariableDeclaration_in_forInit1637);
                    localVariableDeclaration125=localVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, localVariableDeclaration125.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:229:9: expressionList
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(229,9);
                    pushFollow(FOLLOW_expressionList_in_forInit1647);
                    expressionList126=expressionList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList126.getTree());

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
        dbg.location(230, 5);

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
    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:232:1: forUpdate : expressionList ;
    public final JaParser.forUpdate_return forUpdate() throws RecognitionException {
        JaParser.forUpdate_return retval = new JaParser.forUpdate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.expressionList_return expressionList127 = null;



        try { dbg.enterRule(getGrammarFileName(), "forUpdate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(232, 1);

        try {
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:233:5: ( expressionList )
            dbg.enterAlt(1);

            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:233:9: expressionList
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(233,9);
            pushFollow(FOLLOW_expressionList_in_forUpdate1666);
            expressionList127=expressionList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList127.getTree());

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
        dbg.location(234, 5);

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
    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:238:1: parExpression : '(' expression ')' ;
    public final JaParser.parExpression_return parExpression() throws RecognitionException {
        JaParser.parExpression_return retval = new JaParser.parExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal128=null;
        Token char_literal130=null;
        JaParser.expression_return expression129 = null;


        Object char_literal128_tree=null;
        Object char_literal130_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "parExpression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(238, 1);

        try {
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:239:5: ( '(' expression ')' )
            dbg.enterAlt(1);

            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:239:9: '(' expression ')'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(239,12);
            char_literal128=(Token)match(input,81,FOLLOW_81_in_parExpression1687); if (state.failed) return retval;
            dbg.location(239,14);
            pushFollow(FOLLOW_expression_in_parExpression1690);
            expression129=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression129.getTree());
            dbg.location(239,28);
            char_literal130=(Token)match(input,82,FOLLOW_82_in_parExpression1692); if (state.failed) return retval;

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
        dbg.location(240, 5);

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
    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:242:1: expressionList : expression ( ',' expression )* ;
    public final JaParser.expressionList_return expressionList() throws RecognitionException {
        JaParser.expressionList_return retval = new JaParser.expressionList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal132=null;
        JaParser.expression_return expression131 = null;

        JaParser.expression_return expression133 = null;


        Object char_literal132_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "expressionList");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(242, 1);

        try {
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:243:5: ( expression ( ',' expression )* )
            dbg.enterAlt(1);

            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:243:9: expression ( ',' expression )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(243,9);
            pushFollow(FOLLOW_expression_in_expressionList1716);
            expression131=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression131.getTree());
            dbg.location(243,20);
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:243:20: ( ',' expression )*
            try { dbg.enterSubRule(35);

            loop35:
            do {
                int alt35=2;
                try { dbg.enterDecision(35);

                int LA35_0 = input.LA(1);

                if ( (LA35_0==78) ) {
                    alt35=1;
                }


                } finally {dbg.exitDecision(35);}

                switch (alt35) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:243:21: ',' expression
            	    {
            	    dbg.location(243,21);
            	    char_literal132=(Token)match(input,78,FOLLOW_78_in_expressionList1719); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal132_tree = (Object)adaptor.create(char_literal132);
            	    adaptor.addChild(root_0, char_literal132_tree);
            	    }
            	    dbg.location(243,25);
            	    pushFollow(FOLLOW_expression_in_expressionList1721);
            	    expression133=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression133.getTree());

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
        dbg.location(244, 5);

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
    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:246:1: statementExpression : expression ;
    public final JaParser.statementExpression_return statementExpression() throws RecognitionException {
        JaParser.statementExpression_return retval = new JaParser.statementExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.expression_return expression134 = null;



        try { dbg.enterRule(getGrammarFileName(), "statementExpression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(246, 1);

        try {
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:247:5: ( expression )
            dbg.enterAlt(1);

            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:247:9: expression
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(247,9);
            pushFollow(FOLLOW_expression_in_statementExpression1742);
            expression134=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression134.getTree());

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
        dbg.location(248, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "statementExpression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "statementExpression"

    public static class constantExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constantExpression"
    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:250:1: constantExpression : expression ;
    public final JaParser.constantExpression_return constantExpression() throws RecognitionException {
        JaParser.constantExpression_return retval = new JaParser.constantExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.expression_return expression135 = null;



        try { dbg.enterRule(getGrammarFileName(), "constantExpression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(250, 1);

        try {
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:251:5: ( expression )
            dbg.enterAlt(1);

            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:251:9: expression
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(251,9);
            pushFollow(FOLLOW_expression_in_constantExpression1765);
            expression135=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression135.getTree());

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
        dbg.location(252, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "constantExpression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "constantExpression"

    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:254:1: expression : orExpression (ap= assignmentOperator expression )? -> {$ap.c == '='}? ^( '=' orExpression expression ) -> {$ap.c == '+'}? ^( EQ orExpression ^( PLUS orExpression expression ) ) -> {$ap.c == '-'}? ^( EQ orExpression ^( MINUS orExpression expression ) ) -> {$ap.c == '*'}? ^( EQ orExpression ^( STAR orExpression expression ) ) -> {$ap.c == '/'}? ^( EQ orExpression ^( SLASH orExpression expression ) ) -> orExpression ;
    public final JaParser.expression_return expression() throws RecognitionException {
        JaParser.expression_return retval = new JaParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.assignmentOperator_return ap = null;

        JaParser.orExpression_return orExpression136 = null;

        JaParser.expression_return expression137 = null;


        RewriteRuleSubtreeStream stream_assignmentOperator=new RewriteRuleSubtreeStream(adaptor,"rule assignmentOperator");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_orExpression=new RewriteRuleSubtreeStream(adaptor,"rule orExpression");
        try { dbg.enterRule(getGrammarFileName(), "expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(254, 1);

        try {
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:255:5: ( orExpression (ap= assignmentOperator expression )? -> {$ap.c == '='}? ^( '=' orExpression expression ) -> {$ap.c == '+'}? ^( EQ orExpression ^( PLUS orExpression expression ) ) -> {$ap.c == '-'}? ^( EQ orExpression ^( MINUS orExpression expression ) ) -> {$ap.c == '*'}? ^( EQ orExpression ^( STAR orExpression expression ) ) -> {$ap.c == '/'}? ^( EQ orExpression ^( SLASH orExpression expression ) ) -> orExpression )
            dbg.enterAlt(1);

            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:255:8: orExpression (ap= assignmentOperator expression )?
            {
            dbg.location(255,8);
            pushFollow(FOLLOW_orExpression_in_expression1787);
            orExpression136=orExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_orExpression.add(orExpression136.getTree());
            dbg.location(255,21);
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:255:21: (ap= assignmentOperator expression )?
            int alt36=2;
            try { dbg.enterSubRule(36);
            try { dbg.enterDecision(36);

            int LA36_0 = input.LA(1);

            if ( (LA36_0==EQ||(LA36_0>=84 && LA36_0<=87)) ) {
                alt36=1;
            }
            } finally {dbg.exitDecision(36);}

            switch (alt36) {
                case 1 :
                    dbg.enterAlt(1);

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:255:23: ap= assignmentOperator expression
                    {
                    dbg.location(255,25);
                    pushFollow(FOLLOW_assignmentOperator_in_expression1793);
                    ap=assignmentOperator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_assignmentOperator.add(ap.getTree());
                    dbg.location(255,45);
                    pushFollow(FOLLOW_expression_in_expression1795);
                    expression137=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression137.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(36);}



            // AST REWRITE
            // elements: expression, orExpression, orExpression, orExpression, orExpression, orExpression, orExpression, orExpression, expression, EQ, expression, orExpression, orExpression, orExpression, expression, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 255:58: -> {$ap.c == '='}? ^( '=' orExpression expression )
            if ((ap!=null?ap.c:0) == '=') {
                dbg.location(255,77);
                // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:255:77: ^( '=' orExpression expression )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(255,79);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EQ, "EQ"), root_1);

                dbg.location(255,83);
                adaptor.addChild(root_1, stream_orExpression.nextTree());
                dbg.location(255,96);
                adaptor.addChild(root_1, stream_expression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 256:13: -> {$ap.c == '+'}? ^( EQ orExpression ^( PLUS orExpression expression ) )
            if ((ap!=null?ap.c:0) == '+') {
                dbg.location(256,32);
                // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:256:32: ^( EQ orExpression ^( PLUS orExpression expression ) )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(256,34);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EQ, "EQ"), root_1);

                dbg.location(256,37);
                adaptor.addChild(root_1, stream_orExpression.nextTree());
                dbg.location(256,50);
                // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:256:50: ^( PLUS orExpression expression )
                {
                Object root_2 = (Object)adaptor.nil();
                dbg.location(256,52);
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(PLUS, "PLUS"), root_2);

                dbg.location(256,58);
                adaptor.addChild(root_2, stream_orExpression.nextTree());
                dbg.location(256,71);
                adaptor.addChild(root_2, stream_expression.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 257:13: -> {$ap.c == '-'}? ^( EQ orExpression ^( MINUS orExpression expression ) )
            if ((ap!=null?ap.c:0) == '-') {
                dbg.location(257,32);
                // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:257:32: ^( EQ orExpression ^( MINUS orExpression expression ) )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(257,34);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EQ, "EQ"), root_1);

                dbg.location(257,37);
                adaptor.addChild(root_1, stream_orExpression.nextTree());
                dbg.location(257,50);
                // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:257:50: ^( MINUS orExpression expression )
                {
                Object root_2 = (Object)adaptor.nil();
                dbg.location(257,52);
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(MINUS, "MINUS"), root_2);

                dbg.location(257,58);
                adaptor.addChild(root_2, stream_orExpression.nextTree());
                dbg.location(257,71);
                adaptor.addChild(root_2, stream_expression.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 258:13: -> {$ap.c == '*'}? ^( EQ orExpression ^( STAR orExpression expression ) )
            if ((ap!=null?ap.c:0) == '*') {
                dbg.location(258,32);
                // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:258:32: ^( EQ orExpression ^( STAR orExpression expression ) )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(258,34);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EQ, "EQ"), root_1);

                dbg.location(258,37);
                adaptor.addChild(root_1, stream_orExpression.nextTree());
                dbg.location(258,50);
                // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:258:50: ^( STAR orExpression expression )
                {
                Object root_2 = (Object)adaptor.nil();
                dbg.location(258,52);
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(STAR, "STAR"), root_2);

                dbg.location(258,58);
                adaptor.addChild(root_2, stream_orExpression.nextTree());
                dbg.location(258,71);
                adaptor.addChild(root_2, stream_expression.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 259:13: -> {$ap.c == '/'}? ^( EQ orExpression ^( SLASH orExpression expression ) )
            if ((ap!=null?ap.c:0) == '/') {
                dbg.location(259,32);
                // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:259:32: ^( EQ orExpression ^( SLASH orExpression expression ) )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(259,34);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EQ, "EQ"), root_1);

                dbg.location(259,37);
                adaptor.addChild(root_1, stream_orExpression.nextTree());
                dbg.location(259,50);
                // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:259:50: ^( SLASH orExpression expression )
                {
                Object root_2 = (Object)adaptor.nil();
                dbg.location(259,52);
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(SLASH, "SLASH"), root_2);

                dbg.location(259,58);
                adaptor.addChild(root_2, stream_orExpression.nextTree());
                dbg.location(259,71);
                adaptor.addChild(root_2, stream_expression.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 260:13: -> orExpression
            {
                dbg.location(260,17);
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
        dbg.location(261, 5);

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
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignmentOperator"
    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:263:1: assignmentOperator returns [char c] : ( '=' | '+=' | '-=' | '*=' | '/=' );
    public final JaParser.assignmentOperator_return assignmentOperator() throws RecognitionException {
        JaParser.assignmentOperator_return retval = new JaParser.assignmentOperator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal138=null;
        Token string_literal139=null;
        Token string_literal140=null;
        Token string_literal141=null;
        Token string_literal142=null;

        Object char_literal138_tree=null;
        Object string_literal139_tree=null;
        Object string_literal140_tree=null;
        Object string_literal141_tree=null;
        Object string_literal142_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "assignmentOperator");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(263, 1);

        try {
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:264:5: ( '=' | '+=' | '-=' | '*=' | '/=' )
            int alt37=5;
            try { dbg.enterDecision(37);

            switch ( input.LA(1) ) {
            case EQ:
                {
                alt37=1;
                }
                break;
            case 84:
                {
                alt37=2;
                }
                break;
            case 85:
                {
                alt37=3;
                }
                break;
            case 86:
                {
                alt37=4;
                }
                break;
            case 87:
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

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:264:9: '='
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(264,9);
                    char_literal138=(Token)match(input,EQ,FOLLOW_EQ_in_assignmentOperator1975); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal138_tree = (Object)adaptor.create(char_literal138);
                    adaptor.addChild(root_0, char_literal138_tree);
                    }
                    dbg.location(264,13);
                    if ( state.backtracking==0 ) {
                      retval.c = '='; 
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:265:9: '+='
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(265,9);
                    string_literal139=(Token)match(input,84,FOLLOW_84_in_assignmentOperator1988); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal139_tree = (Object)adaptor.create(string_literal139);
                    adaptor.addChild(root_0, string_literal139_tree);
                    }
                    dbg.location(265,14);
                    if ( state.backtracking==0 ) {
                      retval.c = '+';
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:266:9: '-='
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(266,9);
                    string_literal140=(Token)match(input,85,FOLLOW_85_in_assignmentOperator2001); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal140_tree = (Object)adaptor.create(string_literal140);
                    adaptor.addChild(root_0, string_literal140_tree);
                    }
                    dbg.location(266,14);
                    if ( state.backtracking==0 ) {
                      retval.c = '-';
                    }

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:267:9: '*='
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(267,9);
                    string_literal141=(Token)match(input,86,FOLLOW_86_in_assignmentOperator2013); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal141_tree = (Object)adaptor.create(string_literal141);
                    adaptor.addChild(root_0, string_literal141_tree);
                    }
                    dbg.location(267,14);
                    if ( state.backtracking==0 ) {
                      retval.c = '*';
                    }

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:268:9: '/='
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(268,9);
                    string_literal142=(Token)match(input,87,FOLLOW_87_in_assignmentOperator2025); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal142_tree = (Object)adaptor.create(string_literal142);
                    adaptor.addChild(root_0, string_literal142_tree);
                    }
                    dbg.location(268,14);
                    if ( state.backtracking==0 ) {
                      retval.c = '/';
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
        dbg.location(269, 5);

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
    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:271:1: orExpression : andExpression ( '||' andExpression )* ;
    public final JaParser.orExpression_return orExpression() throws RecognitionException {
        JaParser.orExpression_return retval = new JaParser.orExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal144=null;
        JaParser.andExpression_return andExpression143 = null;

        JaParser.andExpression_return andExpression145 = null;


        Object string_literal144_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "orExpression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(271, 1);

        try {
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:272:5: ( andExpression ( '||' andExpression )* )
            dbg.enterAlt(1);

            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:272:9: andExpression ( '||' andExpression )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(272,9);
            pushFollow(FOLLOW_andExpression_in_orExpression2046);
            andExpression143=andExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, andExpression143.getTree());
            dbg.location(272,23);
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:272:23: ( '||' andExpression )*
            try { dbg.enterSubRule(38);

            loop38:
            do {
                int alt38=2;
                try { dbg.enterDecision(38);

                int LA38_0 = input.LA(1);

                if ( (LA38_0==88) ) {
                    alt38=1;
                }


                } finally {dbg.exitDecision(38);}

                switch (alt38) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:272:25: '||' andExpression
            	    {
            	    dbg.location(272,29);
            	    string_literal144=(Token)match(input,88,FOLLOW_88_in_orExpression2050); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal144_tree = (Object)adaptor.create(string_literal144);
            	    root_0 = (Object)adaptor.becomeRoot(string_literal144_tree, root_0);
            	    }
            	    dbg.location(272,31);
            	    pushFollow(FOLLOW_andExpression_in_orExpression2053);
            	    andExpression145=andExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, andExpression145.getTree());

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
        dbg.location(273, 5);

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
    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:275:1: andExpression : equalityExpression ( '&&' equalityExpression )* ;
    public final JaParser.andExpression_return andExpression() throws RecognitionException {
        JaParser.andExpression_return retval = new JaParser.andExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal147=null;
        JaParser.equalityExpression_return equalityExpression146 = null;

        JaParser.equalityExpression_return equalityExpression148 = null;


        Object string_literal147_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "andExpression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(275, 1);

        try {
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:276:5: ( equalityExpression ( '&&' equalityExpression )* )
            dbg.enterAlt(1);

            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:276:9: equalityExpression ( '&&' equalityExpression )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(276,9);
            pushFollow(FOLLOW_equalityExpression_in_andExpression2075);
            equalityExpression146=equalityExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression146.getTree());
            dbg.location(276,28);
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:276:28: ( '&&' equalityExpression )*
            try { dbg.enterSubRule(39);

            loop39:
            do {
                int alt39=2;
                try { dbg.enterDecision(39);

                int LA39_0 = input.LA(1);

                if ( (LA39_0==89) ) {
                    alt39=1;
                }


                } finally {dbg.exitDecision(39);}

                switch (alt39) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:276:30: '&&' equalityExpression
            	    {
            	    dbg.location(276,34);
            	    string_literal147=(Token)match(input,89,FOLLOW_89_in_andExpression2079); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal147_tree = (Object)adaptor.create(string_literal147);
            	    root_0 = (Object)adaptor.becomeRoot(string_literal147_tree, root_0);
            	    }
            	    dbg.location(276,36);
            	    pushFollow(FOLLOW_equalityExpression_in_andExpression2082);
            	    equalityExpression148=equalityExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression148.getTree());

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
        dbg.location(277, 5);

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
    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:279:1: equalityExpression : instanceOfExpression ( ( '==' | '!=' ) instanceOfExpression )* ;
    public final JaParser.equalityExpression_return equalityExpression() throws RecognitionException {
        JaParser.equalityExpression_return retval = new JaParser.equalityExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set150=null;
        JaParser.instanceOfExpression_return instanceOfExpression149 = null;

        JaParser.instanceOfExpression_return instanceOfExpression151 = null;


        Object set150_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "equalityExpression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(279, 1);

        try {
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:280:5: ( instanceOfExpression ( ( '==' | '!=' ) instanceOfExpression )* )
            dbg.enterAlt(1);

            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:280:9: instanceOfExpression ( ( '==' | '!=' ) instanceOfExpression )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(280,9);
            pushFollow(FOLLOW_instanceOfExpression_in_equalityExpression2104);
            instanceOfExpression149=instanceOfExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, instanceOfExpression149.getTree());
            dbg.location(280,30);
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:280:30: ( ( '==' | '!=' ) instanceOfExpression )*
            try { dbg.enterSubRule(40);

            loop40:
            do {
                int alt40=2;
                try { dbg.enterDecision(40);

                int LA40_0 = input.LA(1);

                if ( ((LA40_0>=90 && LA40_0<=91)) ) {
                    alt40=1;
                }


                } finally {dbg.exitDecision(40);}

                switch (alt40) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:280:32: ( '==' | '!=' ) instanceOfExpression
            	    {
            	    dbg.location(280,32);
            	    set150=(Token)input.LT(1);
            	    set150=(Token)input.LT(1);
            	    if ( (input.LA(1)>=90 && input.LA(1)<=91) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set150), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(280,47);
            	    pushFollow(FOLLOW_instanceOfExpression_in_equalityExpression2117);
            	    instanceOfExpression151=instanceOfExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, instanceOfExpression151.getTree());

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
        dbg.location(281, 5);

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
    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:283:1: instanceOfExpression : relationalExpression ( INSTANCEOF type )? ;
    public final JaParser.instanceOfExpression_return instanceOfExpression() throws RecognitionException {
        JaParser.instanceOfExpression_return retval = new JaParser.instanceOfExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INSTANCEOF153=null;
        JaParser.relationalExpression_return relationalExpression152 = null;

        JaParser.type_return type154 = null;


        Object INSTANCEOF153_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "instanceOfExpression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(283, 1);

        try {
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:284:5: ( relationalExpression ( INSTANCEOF type )? )
            dbg.enterAlt(1);

            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:284:9: relationalExpression ( INSTANCEOF type )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(284,9);
            pushFollow(FOLLOW_relationalExpression_in_instanceOfExpression2139);
            relationalExpression152=relationalExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression152.getTree());
            dbg.location(284,30);
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:284:30: ( INSTANCEOF type )?
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

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:284:31: INSTANCEOF type
                    {
                    dbg.location(284,41);
                    INSTANCEOF153=(Token)match(input,INSTANCEOF,FOLLOW_INSTANCEOF_in_instanceOfExpression2142); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INSTANCEOF153_tree = (Object)adaptor.create(INSTANCEOF153);
                    root_0 = (Object)adaptor.becomeRoot(INSTANCEOF153_tree, root_0);
                    }
                    dbg.location(284,43);
                    pushFollow(FOLLOW_type_in_instanceOfExpression2145);
                    type154=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type154.getTree());

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
        dbg.location(285, 5);

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
    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:287:1: relationalExpression : additiveExpression ( COMPAREOP additiveExpression )* ;
    public final JaParser.relationalExpression_return relationalExpression() throws RecognitionException {
        JaParser.relationalExpression_return retval = new JaParser.relationalExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMPAREOP156=null;
        JaParser.additiveExpression_return additiveExpression155 = null;

        JaParser.additiveExpression_return additiveExpression157 = null;


        Object COMPAREOP156_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "relationalExpression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(287, 1);

        try {
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:288:5: ( additiveExpression ( COMPAREOP additiveExpression )* )
            dbg.enterAlt(1);

            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:288:9: additiveExpression ( COMPAREOP additiveExpression )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(288,9);
            pushFollow(FOLLOW_additiveExpression_in_relationalExpression2166);
            additiveExpression155=additiveExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression155.getTree());
            dbg.location(288,28);
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:288:28: ( COMPAREOP additiveExpression )*
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

            	    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:288:30: COMPAREOP additiveExpression
            	    {
            	    dbg.location(288,39);
            	    COMPAREOP156=(Token)match(input,COMPAREOP,FOLLOW_COMPAREOP_in_relationalExpression2170); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    COMPAREOP156_tree = (Object)adaptor.create(COMPAREOP156);
            	    root_0 = (Object)adaptor.becomeRoot(COMPAREOP156_tree, root_0);
            	    }
            	    dbg.location(288,41);
            	    pushFollow(FOLLOW_additiveExpression_in_relationalExpression2173);
            	    additiveExpression157=additiveExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression157.getTree());

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
        dbg.location(289, 5);

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
    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:291:1: additiveExpression : multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )* ;
    public final JaParser.additiveExpression_return additiveExpression() throws RecognitionException {
        JaParser.additiveExpression_return retval = new JaParser.additiveExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set159=null;
        JaParser.multiplicativeExpression_return multiplicativeExpression158 = null;

        JaParser.multiplicativeExpression_return multiplicativeExpression160 = null;


        Object set159_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "additiveExpression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(291, 1);

        try {
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:292:5: ( multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )* )
            dbg.enterAlt(1);

            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:292:9: multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(292,9);
            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression2195);
            multiplicativeExpression158=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression158.getTree());
            dbg.location(292,34);
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:292:34: ( ( '+' | '-' ) multiplicativeExpression )*
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

            	    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:292:36: ( '+' | '-' ) multiplicativeExpression
            	    {
            	    dbg.location(292,36);
            	    set159=(Token)input.LT(1);
            	    set159=(Token)input.LT(1);
            	    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set159), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(292,49);
            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression2208);
            	    multiplicativeExpression160=multiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression160.getTree());

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
        dbg.location(293, 5);

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
    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:295:1: multiplicativeExpression : unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )* ;
    public final JaParser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        JaParser.multiplicativeExpression_return retval = new JaParser.multiplicativeExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set162=null;
        JaParser.unaryExpression_return unaryExpression161 = null;

        JaParser.unaryExpression_return unaryExpression163 = null;


        Object set162_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "multiplicativeExpression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(295, 1);

        try {
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:296:5: ( unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )* )
            dbg.enterAlt(1);

            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:296:9: unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(296,9);
            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression2230);
            unaryExpression161=unaryExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression161.getTree());
            dbg.location(296,25);
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:296:25: ( ( '*' | '/' | '%' ) unaryExpression )*
            try { dbg.enterSubRule(44);

            loop44:
            do {
                int alt44=2;
                try { dbg.enterDecision(44);

                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=STAR && LA44_0<=SLASH)||LA44_0==92) ) {
                    alt44=1;
                }


                } finally {dbg.exitDecision(44);}

                switch (alt44) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:296:27: ( '*' | '/' | '%' ) unaryExpression
            	    {
            	    dbg.location(296,27);
            	    set162=(Token)input.LT(1);
            	    set162=(Token)input.LT(1);
            	    if ( (input.LA(1)>=STAR && input.LA(1)<=SLASH)||input.LA(1)==92 ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set162), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(296,48);
            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression2249);
            	    unaryExpression163=unaryExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression163.getTree());

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
        dbg.location(297, 5);

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
    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:299:1: unaryExpression : ( '+' unaryExpression | '-' unaryExpression | '++' unaryExpression | '--' unaryExpression | unaryExpressionNotPlusMinus );
    public final JaParser.unaryExpression_return unaryExpression() throws RecognitionException {
        JaParser.unaryExpression_return retval = new JaParser.unaryExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal164=null;
        Token char_literal166=null;
        Token string_literal168=null;
        Token string_literal170=null;
        JaParser.unaryExpression_return unaryExpression165 = null;

        JaParser.unaryExpression_return unaryExpression167 = null;

        JaParser.unaryExpression_return unaryExpression169 = null;

        JaParser.unaryExpression_return unaryExpression171 = null;

        JaParser.unaryExpressionNotPlusMinus_return unaryExpressionNotPlusMinus172 = null;


        Object char_literal164_tree=null;
        Object char_literal166_tree=null;
        Object string_literal168_tree=null;
        Object string_literal170_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "unaryExpression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(299, 1);

        try {
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:300:5: ( '+' unaryExpression | '-' unaryExpression | '++' unaryExpression | '--' unaryExpression | unaryExpressionNotPlusMinus )
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
            case 93:
                {
                alt45=3;
                }
                break;
            case 94:
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
            case THIS:
            case SUPER:
            case INTLITERAL:
            case FloatingPointLiteral:
            case CHARLITERAL:
            case STRINGLITERAL:
            case BOOLEANLITERAL:
            case NULLLITERAL:
            case NEW:
            case 81:
            case 95:
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

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:300:9: '+' unaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(300,9);
                    char_literal164=(Token)match(input,PLUS,FOLLOW_PLUS_in_unaryExpression2275); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal164_tree = (Object)adaptor.create(char_literal164);
                    adaptor.addChild(root_0, char_literal164_tree);
                    }
                    dbg.location(300,13);
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression2277);
                    unaryExpression165=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression165.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:301:9: '-' unaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(301,9);
                    char_literal166=(Token)match(input,MINUS,FOLLOW_MINUS_in_unaryExpression2287); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal166_tree = (Object)adaptor.create(char_literal166);
                    adaptor.addChild(root_0, char_literal166_tree);
                    }
                    dbg.location(301,13);
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression2289);
                    unaryExpression167=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression167.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:302:9: '++' unaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(302,9);
                    string_literal168=(Token)match(input,93,FOLLOW_93_in_unaryExpression2299); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal168_tree = (Object)adaptor.create(string_literal168);
                    adaptor.addChild(root_0, string_literal168_tree);
                    }
                    dbg.location(302,14);
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression2301);
                    unaryExpression169=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression169.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:303:9: '--' unaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(303,9);
                    string_literal170=(Token)match(input,94,FOLLOW_94_in_unaryExpression2311); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal170_tree = (Object)adaptor.create(string_literal170);
                    adaptor.addChild(root_0, string_literal170_tree);
                    }
                    dbg.location(303,14);
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression2313);
                    unaryExpression171=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression171.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:304:9: unaryExpressionNotPlusMinus
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(304,9);
                    pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression2323);
                    unaryExpressionNotPlusMinus172=unaryExpressionNotPlusMinus();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpressionNotPlusMinus172.getTree());

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
        dbg.location(305, 5);

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
    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:307:1: unaryExpressionNotPlusMinus : ( '!' unaryExpression | ( '(' primitiveType ')' )=> '(' primitiveType ')' unaryExpression | ( '(' nonPrimitiveType ')' unaryExpressionNotPlusMinus )=> '(' nonPrimitiveType ')' unaryExpressionNotPlusMinus | NEW creator | primary ( selector )* ( '++' | '--' )? );
    public final JaParser.unaryExpressionNotPlusMinus_return unaryExpressionNotPlusMinus() throws RecognitionException {
        JaParser.unaryExpressionNotPlusMinus_return retval = new JaParser.unaryExpressionNotPlusMinus_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal173=null;
        Token char_literal175=null;
        Token char_literal177=null;
        Token char_literal179=null;
        Token char_literal181=null;
        Token NEW183=null;
        Token set187=null;
        JaParser.unaryExpression_return unaryExpression174 = null;

        JaParser.primitiveType_return primitiveType176 = null;

        JaParser.unaryExpression_return unaryExpression178 = null;

        JaParser.nonPrimitiveType_return nonPrimitiveType180 = null;

        JaParser.unaryExpressionNotPlusMinus_return unaryExpressionNotPlusMinus182 = null;

        JaParser.creator_return creator184 = null;

        JaParser.primary_return primary185 = null;

        JaParser.selector_return selector186 = null;


        Object char_literal173_tree=null;
        Object char_literal175_tree=null;
        Object char_literal177_tree=null;
        Object char_literal179_tree=null;
        Object char_literal181_tree=null;
        Object NEW183_tree=null;
        Object set187_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "unaryExpressionNotPlusMinus");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(307, 1);

        try {
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:308:5: ( '!' unaryExpression | ( '(' primitiveType ')' )=> '(' primitiveType ')' unaryExpression | ( '(' nonPrimitiveType ')' unaryExpressionNotPlusMinus )=> '(' nonPrimitiveType ')' unaryExpressionNotPlusMinus | NEW creator | primary ( selector )* ( '++' | '--' )? )
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

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:308:7: '!' unaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(308,7);
                    char_literal173=(Token)match(input,95,FOLLOW_95_in_unaryExpressionNotPlusMinus2340); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal173_tree = (Object)adaptor.create(char_literal173);
                    adaptor.addChild(root_0, char_literal173_tree);
                    }
                    dbg.location(308,11);
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus2342);
                    unaryExpression174=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression174.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:309:9: ( '(' primitiveType ')' )=> '(' primitiveType ')' unaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(309,37);
                    char_literal175=(Token)match(input,81,FOLLOW_81_in_unaryExpressionNotPlusMinus2363); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal175_tree = (Object)adaptor.create(char_literal175);
                    adaptor.addChild(root_0, char_literal175_tree);
                    }
                    dbg.location(309,41);
                    pushFollow(FOLLOW_primitiveType_in_unaryExpressionNotPlusMinus2365);
                    primitiveType176=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType176.getTree());
                    dbg.location(309,55);
                    char_literal177=(Token)match(input,82,FOLLOW_82_in_unaryExpressionNotPlusMinus2367); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal177_tree = (Object)adaptor.create(char_literal177);
                    adaptor.addChild(root_0, char_literal177_tree);
                    }
                    dbg.location(309,59);
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus2369);
                    unaryExpression178=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression178.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:311:9: ( '(' nonPrimitiveType ')' unaryExpressionNotPlusMinus )=> '(' nonPrimitiveType ')' unaryExpressionNotPlusMinus
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(311,68);
                    char_literal179=(Token)match(input,81,FOLLOW_81_in_unaryExpressionNotPlusMinus2397); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal179_tree = (Object)adaptor.create(char_literal179);
                    adaptor.addChild(root_0, char_literal179_tree);
                    }
                    dbg.location(311,72);
                    pushFollow(FOLLOW_nonPrimitiveType_in_unaryExpressionNotPlusMinus2399);
                    nonPrimitiveType180=nonPrimitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nonPrimitiveType180.getTree());
                    dbg.location(311,90);
                    char_literal181=(Token)match(input,82,FOLLOW_82_in_unaryExpressionNotPlusMinus2402); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal181_tree = (Object)adaptor.create(char_literal181);
                    adaptor.addChild(root_0, char_literal181_tree);
                    }
                    dbg.location(311,94);
                    pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpressionNotPlusMinus2404);
                    unaryExpressionNotPlusMinus182=unaryExpressionNotPlusMinus();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpressionNotPlusMinus182.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:312:9: NEW creator
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(312,9);
                    NEW183=(Token)match(input,NEW,FOLLOW_NEW_in_unaryExpressionNotPlusMinus2414); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NEW183_tree = (Object)adaptor.create(NEW183);
                    adaptor.addChild(root_0, NEW183_tree);
                    }
                    dbg.location(312,13);
                    pushFollow(FOLLOW_creator_in_unaryExpressionNotPlusMinus2416);
                    creator184=creator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, creator184.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:313:9: primary ( selector )* ( '++' | '--' )?
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(313,9);
                    pushFollow(FOLLOW_primary_in_unaryExpressionNotPlusMinus2426);
                    primary185=primary();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primary185.getTree());
                    dbg.location(313,26);
                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:313:26: ( selector )*
                    try { dbg.enterSubRule(46);

                    loop46:
                    do {
                        int alt46=2;
                        try { dbg.enterDecision(46);

                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==79||LA46_0==96) ) {
                            alt46=1;
                        }


                        } finally {dbg.exitDecision(46);}

                        switch (alt46) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:313:26: selector
                    	    {
                    	    dbg.location(313,26);
                    	    pushFollow(FOLLOW_selector_in_unaryExpressionNotPlusMinus2429);
                    	    selector186=selector();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(selector186.getTree(), root_0);

                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(46);}

                    dbg.location(313,29);
                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:313:29: ( '++' | '--' )?
                    int alt47=2;
                    try { dbg.enterSubRule(47);
                    try { dbg.enterDecision(47);

                    int LA47_0 = input.LA(1);

                    if ( ((LA47_0>=93 && LA47_0<=94)) ) {
                        alt47=1;
                    }
                    } finally {dbg.exitDecision(47);}

                    switch (alt47) {
                        case 1 :
                            dbg.enterAlt(1);

                            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:
                            {
                            dbg.location(313,29);
                            set187=(Token)input.LT(1);
                            if ( (input.LA(1)>=93 && input.LA(1)<=94) ) {
                                input.consume();
                                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set187));
                                state.errorRecovery=false;state.failed=false;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                dbg.recognitionException(mse);
                                throw mse;
                            }


                            }
                            break;

                    }
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
        dbg.location(317, 5);

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
    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:320:1: primary : ( parExpression | THIS | SUPER superMemberAccess | literal | IDENTIFIER | ( IDENTIFIER -> IDENTIFIER ) ( '[' ']' -> ^( ARRAYTYPE $primary) )+ ( '.' CLASS -> ^( DOTCLASS $primary) ) | IDENTIFIER arguments -> ^( METHODCALL IDENTIFIER arguments THIS ) | IDENTIFIER '.' CLASS -> ^( DOTCLASS IDENTIFIER ) | ( primitiveType -> primitiveType ) ( '[' ']' -> ^( ARRAYTYPE $primary) )* ( '.' CLASS -> ^( DOTCLASS $primary) ) | VOID '.' CLASS -> ^( DOTCLASS VOID ) );
    public final JaParser.primary_return primary() throws RecognitionException {
        JaParser.primary_return retval = new JaParser.primary_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token THIS189=null;
        Token SUPER190=null;
        Token IDENTIFIER193=null;
        Token IDENTIFIER194=null;
        Token char_literal195=null;
        Token char_literal196=null;
        Token char_literal197=null;
        Token CLASS198=null;
        Token IDENTIFIER199=null;
        Token IDENTIFIER201=null;
        Token char_literal202=null;
        Token CLASS203=null;
        Token char_literal205=null;
        Token char_literal206=null;
        Token char_literal207=null;
        Token CLASS208=null;
        Token VOID209=null;
        Token char_literal210=null;
        Token CLASS211=null;
        JaParser.parExpression_return parExpression188 = null;

        JaParser.superMemberAccess_return superMemberAccess191 = null;

        JaParser.literal_return literal192 = null;

        JaParser.arguments_return arguments200 = null;

        JaParser.primitiveType_return primitiveType204 = null;


        Object THIS189_tree=null;
        Object SUPER190_tree=null;
        Object IDENTIFIER193_tree=null;
        Object IDENTIFIER194_tree=null;
        Object char_literal195_tree=null;
        Object char_literal196_tree=null;
        Object char_literal197_tree=null;
        Object CLASS198_tree=null;
        Object IDENTIFIER199_tree=null;
        Object IDENTIFIER201_tree=null;
        Object char_literal202_tree=null;
        Object CLASS203_tree=null;
        Object char_literal205_tree=null;
        Object char_literal206_tree=null;
        Object char_literal207_tree=null;
        Object CLASS208_tree=null;
        Object VOID209_tree=null;
        Object char_literal210_tree=null;
        Object CLASS211_tree=null;
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
        RewriteRuleTokenStream stream_CLASS=new RewriteRuleTokenStream(adaptor,"token CLASS");
        RewriteRuleTokenStream stream_VOID=new RewriteRuleTokenStream(adaptor,"token VOID");
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");
        RewriteRuleSubtreeStream stream_primitiveType=new RewriteRuleSubtreeStream(adaptor,"rule primitiveType");
        try { dbg.enterRule(getGrammarFileName(), "primary");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(320, 1);

        try {
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:321:5: ( parExpression | THIS | SUPER superMemberAccess | literal | IDENTIFIER | ( IDENTIFIER -> IDENTIFIER ) ( '[' ']' -> ^( ARRAYTYPE $primary) )+ ( '.' CLASS -> ^( DOTCLASS $primary) ) | IDENTIFIER arguments -> ^( METHODCALL IDENTIFIER arguments THIS ) | IDENTIFIER '.' CLASS -> ^( DOTCLASS IDENTIFIER ) | ( primitiveType -> primitiveType ) ( '[' ']' -> ^( ARRAYTYPE $primary) )* ( '.' CLASS -> ^( DOTCLASS $primary) ) | VOID '.' CLASS -> ^( DOTCLASS VOID ) )
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

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:321:9: parExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(321,9);
                    pushFollow(FOLLOW_parExpression_in_primary2493);
                    parExpression188=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parExpression188.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:322:9: THIS
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(322,9);
                    THIS189=(Token)match(input,THIS,FOLLOW_THIS_in_primary2503); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    THIS189_tree = (Object)adaptor.create(THIS189);
                    adaptor.addChild(root_0, THIS189_tree);
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:323:9: SUPER superMemberAccess
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(323,14);
                    SUPER190=(Token)match(input,SUPER,FOLLOW_SUPER_in_primary2514); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SUPER190_tree = (Object)adaptor.create(SUPER190);
                    root_0 = (Object)adaptor.becomeRoot(SUPER190_tree, root_0);
                    }
                    dbg.location(323,16);
                    pushFollow(FOLLOW_superMemberAccess_in_primary2517);
                    superMemberAccess191=superMemberAccess();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, superMemberAccess191.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:324:9: literal
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(324,9);
                    pushFollow(FOLLOW_literal_in_primary2527);
                    literal192=literal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, literal192.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:325:9: IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(325,9);
                    IDENTIFIER193=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary2537); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER193_tree = (Object)adaptor.create(IDENTIFIER193);
                    adaptor.addChild(root_0, IDENTIFIER193_tree);
                    }

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:326:9: ( IDENTIFIER -> IDENTIFIER ) ( '[' ']' -> ^( ARRAYTYPE $primary) )+ ( '.' CLASS -> ^( DOTCLASS $primary) )
                    {
                    dbg.location(326,9);
                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:326:9: ( IDENTIFIER -> IDENTIFIER )
                    dbg.enterAlt(1);

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:326:10: IDENTIFIER
                    {
                    dbg.location(326,10);
                    IDENTIFIER194=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary2548); if (state.failed) return retval; 
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
                    // 326:21: -> IDENTIFIER
                    {
                        dbg.location(326,24);
                        adaptor.addChild(root_0, stream_IDENTIFIER.nextNode());

                    }

                    retval.tree = root_0;}
                    }

                    dbg.location(326,36);
                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:326:36: ( '[' ']' -> ^( ARRAYTYPE $primary) )+
                    int cnt49=0;
                    try { dbg.enterSubRule(49);

                    loop49:
                    do {
                        int alt49=2;
                        try { dbg.enterDecision(49);

                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==79) ) {
                            alt49=1;
                        }


                        } finally {dbg.exitDecision(49);}

                        switch (alt49) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:326:37: '[' ']'
                    	    {
                    	    dbg.location(326,37);
                    	    char_literal195=(Token)match(input,79,FOLLOW_79_in_primary2556); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_79.add(char_literal195);

                    	    dbg.location(326,41);
                    	    char_literal196=(Token)match(input,80,FOLLOW_80_in_primary2558); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_80.add(char_literal196);



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
                    	    // 326:45: -> ^( ARRAYTYPE $primary)
                    	    {
                    	        dbg.location(326,48);
                    	        // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:326:48: ^( ARRAYTYPE $primary)
                    	        {
                    	        Object root_1 = (Object)adaptor.nil();
                    	        dbg.location(326,50);
                    	        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAYTYPE, "ARRAYTYPE"), root_1);

                    	        dbg.location(326,60);
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

                    dbg.location(326,72);
                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:326:72: ( '.' CLASS -> ^( DOTCLASS $primary) )
                    dbg.enterAlt(1);

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:326:73: '.' CLASS
                    {
                    dbg.location(326,73);
                    char_literal197=(Token)match(input,96,FOLLOW_96_in_primary2572); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_96.add(char_literal197);

                    dbg.location(326,77);
                    CLASS198=(Token)match(input,CLASS,FOLLOW_CLASS_in_primary2574); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLASS.add(CLASS198);



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
                    // 326:83: -> ^( DOTCLASS $primary)
                    {
                        dbg.location(326,86);
                        // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:326:86: ^( DOTCLASS $primary)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(326,88);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DOTCLASS, "DOTCLASS"), root_1);

                        dbg.location(326,97);
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

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:327:8: IDENTIFIER arguments
                    {
                    dbg.location(327,8);
                    IDENTIFIER199=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary2593); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER199);

                    dbg.location(327,20);
                    pushFollow(FOLLOW_arguments_in_primary2596);
                    arguments200=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arguments.add(arguments200.getTree());


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
                    // 327:30: -> ^( METHODCALL IDENTIFIER arguments THIS )
                    {
                        dbg.location(327,33);
                        // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:327:33: ^( METHODCALL IDENTIFIER arguments THIS )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(327,35);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(METHODCALL, "METHODCALL"), root_1);

                        dbg.location(327,46);
                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        dbg.location(327,57);
                        adaptor.addChild(root_1, stream_arguments.nextTree());
                        dbg.location(327,67);
                        adaptor.addChild(root_1, (Object)adaptor.create(THIS, "THIS"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:328:7: IDENTIFIER '.' CLASS
                    {
                    dbg.location(328,7);
                    IDENTIFIER201=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary2616); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER201);

                    dbg.location(328,18);
                    char_literal202=(Token)match(input,96,FOLLOW_96_in_primary2618); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_96.add(char_literal202);

                    dbg.location(328,22);
                    CLASS203=(Token)match(input,CLASS,FOLLOW_CLASS_in_primary2620); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLASS.add(CLASS203);



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
                    // 328:28: -> ^( DOTCLASS IDENTIFIER )
                    {
                        dbg.location(328,31);
                        // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:328:31: ^( DOTCLASS IDENTIFIER )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(328,33);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DOTCLASS, "DOTCLASS"), root_1);

                        dbg.location(328,42);
                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:329:9: ( primitiveType -> primitiveType ) ( '[' ']' -> ^( ARRAYTYPE $primary) )* ( '.' CLASS -> ^( DOTCLASS $primary) )
                    {
                    dbg.location(329,9);
                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:329:9: ( primitiveType -> primitiveType )
                    dbg.enterAlt(1);

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:329:10: primitiveType
                    {
                    dbg.location(329,10);
                    pushFollow(FOLLOW_primitiveType_in_primary2639);
                    primitiveType204=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primitiveType.add(primitiveType204.getTree());


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
                    // 329:24: -> primitiveType
                    {
                        dbg.location(329,27);
                        adaptor.addChild(root_0, stream_primitiveType.nextTree());

                    }

                    retval.tree = root_0;}
                    }

                    dbg.location(329,42);
                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:329:42: ( '[' ']' -> ^( ARRAYTYPE $primary) )*
                    try { dbg.enterSubRule(50);

                    loop50:
                    do {
                        int alt50=2;
                        try { dbg.enterDecision(50);

                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==79) ) {
                            alt50=1;
                        }


                        } finally {dbg.exitDecision(50);}

                        switch (alt50) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:329:43: '[' ']'
                    	    {
                    	    dbg.location(329,43);
                    	    char_literal205=(Token)match(input,79,FOLLOW_79_in_primary2647); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_79.add(char_literal205);

                    	    dbg.location(329,47);
                    	    char_literal206=(Token)match(input,80,FOLLOW_80_in_primary2649); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_80.add(char_literal206);



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
                    	    // 329:51: -> ^( ARRAYTYPE $primary)
                    	    {
                    	        dbg.location(329,54);
                    	        // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:329:54: ^( ARRAYTYPE $primary)
                    	        {
                    	        Object root_1 = (Object)adaptor.nil();
                    	        dbg.location(329,56);
                    	        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAYTYPE, "ARRAYTYPE"), root_1);

                    	        dbg.location(329,66);
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

                    dbg.location(329,78);
                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:329:78: ( '.' CLASS -> ^( DOTCLASS $primary) )
                    dbg.enterAlt(1);

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:329:79: '.' CLASS
                    {
                    dbg.location(329,79);
                    char_literal207=(Token)match(input,96,FOLLOW_96_in_primary2663); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_96.add(char_literal207);

                    dbg.location(329,83);
                    CLASS208=(Token)match(input,CLASS,FOLLOW_CLASS_in_primary2665); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLASS.add(CLASS208);



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
                    // 329:89: -> ^( DOTCLASS $primary)
                    {
                        dbg.location(329,92);
                        // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:329:92: ^( DOTCLASS $primary)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(329,94);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DOTCLASS, "DOTCLASS"), root_1);

                        dbg.location(329,103);
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

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:330:9: VOID '.' CLASS
                    {
                    dbg.location(330,9);
                    VOID209=(Token)match(input,VOID,FOLLOW_VOID_in_primary2685); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VOID.add(VOID209);

                    dbg.location(330,14);
                    char_literal210=(Token)match(input,96,FOLLOW_96_in_primary2687); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_96.add(char_literal210);

                    dbg.location(330,18);
                    CLASS211=(Token)match(input,CLASS,FOLLOW_CLASS_in_primary2689); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLASS.add(CLASS211);



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
                    // 330:24: -> ^( DOTCLASS VOID )
                    {
                        dbg.location(330,27);
                        // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:330:27: ^( DOTCLASS VOID )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(330,29);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DOTCLASS, "DOTCLASS"), root_1);

                        dbg.location(330,38);
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
        dbg.location(331, 5);

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
    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:333:1: selector : ( '.' IDENTIFIER -> ^( FIELDACCESS IDENTIFIER ) | '.' IDENTIFIER arguments -> ^( METHODCALL IDENTIFIER ( arguments )? ) | '[' expression ']' -> ^( ARRAYACCESS expression ) );
    public final JaParser.selector_return selector() throws RecognitionException {
        JaParser.selector_return retval = new JaParser.selector_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal212=null;
        Token IDENTIFIER213=null;
        Token char_literal214=null;
        Token IDENTIFIER215=null;
        Token char_literal217=null;
        Token char_literal219=null;
        JaParser.arguments_return arguments216 = null;

        JaParser.expression_return expression218 = null;


        Object char_literal212_tree=null;
        Object IDENTIFIER213_tree=null;
        Object char_literal214_tree=null;
        Object IDENTIFIER215_tree=null;
        Object char_literal217_tree=null;
        Object char_literal219_tree=null;
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");
        try { dbg.enterRule(getGrammarFileName(), "selector");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(333, 1);

        try {
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:334:5: ( '.' IDENTIFIER -> ^( FIELDACCESS IDENTIFIER ) | '.' IDENTIFIER arguments -> ^( METHODCALL IDENTIFIER ( arguments )? ) | '[' expression ']' -> ^( ARRAYACCESS expression ) )
            int alt52=3;
            try { dbg.enterDecision(52);

            int LA52_0 = input.LA(1);

            if ( (LA52_0==96) ) {
                int LA52_1 = input.LA(2);

                if ( (LA52_1==IDENTIFIER) ) {
                    int LA52_3 = input.LA(3);

                    if ( (LA52_3==81) ) {
                        alt52=2;
                    }
                    else if ( (LA52_3==EOF||(LA52_3>=INSTANCEOF && LA52_3<=COMPAREOP)||(LA52_3>=EQ && LA52_3<=SLASH)||LA52_3==75||(LA52_3>=77 && LA52_3<=80)||LA52_3==82||(LA52_3>=84 && LA52_3<=94)||LA52_3==96) ) {
                        alt52=1;
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
            else if ( (LA52_0==79) ) {
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

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:334:9: '.' IDENTIFIER
                    {
                    dbg.location(334,9);
                    char_literal212=(Token)match(input,96,FOLLOW_96_in_selector2720); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_96.add(char_literal212);

                    dbg.location(334,13);
                    IDENTIFIER213=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_selector2722); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER213);



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
                    // 334:24: -> ^( FIELDACCESS IDENTIFIER )
                    {
                        dbg.location(334,27);
                        // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:334:27: ^( FIELDACCESS IDENTIFIER )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(334,29);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FIELDACCESS, "FIELDACCESS"), root_1);

                        dbg.location(334,41);
                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:335:7: '.' IDENTIFIER arguments
                    {
                    dbg.location(335,7);
                    char_literal214=(Token)match(input,96,FOLLOW_96_in_selector2738); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_96.add(char_literal214);

                    dbg.location(335,11);
                    IDENTIFIER215=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_selector2740); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER215);

                    dbg.location(335,22);
                    pushFollow(FOLLOW_arguments_in_selector2742);
                    arguments216=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arguments.add(arguments216.getTree());


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
                    // 335:32: -> ^( METHODCALL IDENTIFIER ( arguments )? )
                    {
                        dbg.location(335,35);
                        // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:335:35: ^( METHODCALL IDENTIFIER ( arguments )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(335,37);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(METHODCALL, "METHODCALL"), root_1);

                        dbg.location(335,48);
                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        dbg.location(335,59);
                        // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:335:59: ( arguments )?
                        if ( stream_arguments.hasNext() ) {
                            dbg.location(335,59);
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

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:338:9: '[' expression ']'
                    {
                    dbg.location(338,9);
                    char_literal217=(Token)match(input,79,FOLLOW_79_in_selector2773); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_79.add(char_literal217);

                    dbg.location(338,13);
                    pushFollow(FOLLOW_expression_in_selector2775);
                    expression218=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression218.getTree());
                    dbg.location(338,24);
                    char_literal219=(Token)match(input,80,FOLLOW_80_in_selector2777); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_80.add(char_literal219);



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
                    // 338:27: -> ^( ARRAYACCESS expression )
                    {
                        dbg.location(338,30);
                        // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:338:30: ^( ARRAYACCESS expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(338,32);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAYACCESS, "ARRAYACCESS"), root_1);

                        dbg.location(338,44);
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
        dbg.location(339, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "selector");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "selector"

    public static class identifierSuffix_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "identifierSuffix"
    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:341:1: identifierSuffix : ( ( '[' ']' )+ '.' CLASS | arguments | '.' CLASS );
    public final JaParser.identifierSuffix_return identifierSuffix() throws RecognitionException {
        JaParser.identifierSuffix_return retval = new JaParser.identifierSuffix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal220=null;
        Token char_literal221=null;
        Token char_literal222=null;
        Token CLASS223=null;
        Token char_literal225=null;
        Token CLASS226=null;
        JaParser.arguments_return arguments224 = null;


        Object char_literal220_tree=null;
        Object char_literal221_tree=null;
        Object char_literal222_tree=null;
        Object CLASS223_tree=null;
        Object char_literal225_tree=null;
        Object CLASS226_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "identifierSuffix");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(341, 1);

        try {
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:342:5: ( ( '[' ']' )+ '.' CLASS | arguments | '.' CLASS )
            int alt54=3;
            try { dbg.enterDecision(54);

            switch ( input.LA(1) ) {
            case 79:
                {
                alt54=1;
                }
                break;
            case 81:
                {
                alt54=2;
                }
                break;
            case 96:
                {
                alt54=3;
                }
                break;
            default:
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

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:342:9: ( '[' ']' )+ '.' CLASS
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(342,9);
                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:342:9: ( '[' ']' )+
                    int cnt53=0;
                    try { dbg.enterSubRule(53);

                    loop53:
                    do {
                        int alt53=2;
                        try { dbg.enterDecision(53);

                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==79) ) {
                            alt53=1;
                        }


                        } finally {dbg.exitDecision(53);}

                        switch (alt53) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:342:10: '[' ']'
                    	    {
                    	    dbg.location(342,10);
                    	    char_literal220=(Token)match(input,79,FOLLOW_79_in_identifierSuffix2804); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal220_tree = (Object)adaptor.create(char_literal220);
                    	    adaptor.addChild(root_0, char_literal220_tree);
                    	    }
                    	    dbg.location(342,14);
                    	    char_literal221=(Token)match(input,80,FOLLOW_80_in_identifierSuffix2806); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal221_tree = (Object)adaptor.create(char_literal221);
                    	    adaptor.addChild(root_0, char_literal221_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt53 >= 1 ) break loop53;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(53, input);
                                dbg.recognitionException(eee);

                                throw eee;
                        }
                        cnt53++;
                    } while (true);
                    } finally {dbg.exitSubRule(53);}

                    dbg.location(342,20);
                    char_literal222=(Token)match(input,96,FOLLOW_96_in_identifierSuffix2810); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal222_tree = (Object)adaptor.create(char_literal222);
                    adaptor.addChild(root_0, char_literal222_tree);
                    }
                    dbg.location(342,24);
                    CLASS223=(Token)match(input,CLASS,FOLLOW_CLASS_in_identifierSuffix2812); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CLASS223_tree = (Object)adaptor.create(CLASS223);
                    adaptor.addChild(root_0, CLASS223_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:344:9: arguments
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(344,9);
                    pushFollow(FOLLOW_arguments_in_identifierSuffix2827);
                    arguments224=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments224.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:345:9: '.' CLASS
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(345,9);
                    char_literal225=(Token)match(input,96,FOLLOW_96_in_identifierSuffix2837); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal225_tree = (Object)adaptor.create(char_literal225);
                    adaptor.addChild(root_0, char_literal225_tree);
                    }
                    dbg.location(345,13);
                    CLASS226=(Token)match(input,CLASS,FOLLOW_CLASS_in_identifierSuffix2839); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CLASS226_tree = (Object)adaptor.create(CLASS226);
                    adaptor.addChild(root_0, CLASS226_tree);
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
        dbg.location(348, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "identifierSuffix");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "identifierSuffix"

    public static class creator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "creator"
    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:350:1: creator : createdName ( arrayCreatorRest | classCreatorRest ) ;
    public final JaParser.creator_return creator() throws RecognitionException {
        JaParser.creator_return retval = new JaParser.creator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.createdName_return createdName227 = null;

        JaParser.arrayCreatorRest_return arrayCreatorRest228 = null;

        JaParser.classCreatorRest_return classCreatorRest229 = null;



        try { dbg.enterRule(getGrammarFileName(), "creator");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(350, 1);

        try {
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:351:5: ( createdName ( arrayCreatorRest | classCreatorRest ) )
            dbg.enterAlt(1);

            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:351:8: createdName ( arrayCreatorRest | classCreatorRest )
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(351,8);
            pushFollow(FOLLOW_createdName_in_creator2867);
            createdName227=createdName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, createdName227.getTree());
            dbg.location(351,20);
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:351:20: ( arrayCreatorRest | classCreatorRest )
            int alt55=2;
            try { dbg.enterSubRule(55);
            try { dbg.enterDecision(55);

            int LA55_0 = input.LA(1);

            if ( (LA55_0==79) ) {
                alt55=1;
            }
            else if ( (LA55_0==81) ) {
                alt55=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(55);}

            switch (alt55) {
                case 1 :
                    dbg.enterAlt(1);

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:351:21: arrayCreatorRest
                    {
                    dbg.location(351,21);
                    pushFollow(FOLLOW_arrayCreatorRest_in_creator2870);
                    arrayCreatorRest228=arrayCreatorRest();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayCreatorRest228.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:351:40: classCreatorRest
                    {
                    dbg.location(351,40);
                    pushFollow(FOLLOW_classCreatorRest_in_creator2874);
                    classCreatorRest229=classCreatorRest();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classCreatorRest229.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(55);}


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
        dbg.location(352, 5);

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
    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:354:1: createdName : ( classType | primitiveType );
    public final JaParser.createdName_return createdName() throws RecognitionException {
        JaParser.createdName_return retval = new JaParser.createdName_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.classType_return classType230 = null;

        JaParser.primitiveType_return primitiveType231 = null;



        try { dbg.enterRule(getGrammarFileName(), "createdName");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(354, 1);

        try {
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:355:5: ( classType | primitiveType )
            int alt56=2;
            try { dbg.enterDecision(56);

            int LA56_0 = input.LA(1);

            if ( (LA56_0==IDENTIFIER) ) {
                alt56=1;
            }
            else if ( ((LA56_0>=CHAR && LA56_0<=DOUBLE)) ) {
                alt56=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(56);}

            switch (alt56) {
                case 1 :
                    dbg.enterAlt(1);

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:355:9: classType
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(355,9);
                    pushFollow(FOLLOW_classType_in_createdName2894);
                    classType230=classType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classType230.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:356:9: primitiveType
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(356,9);
                    pushFollow(FOLLOW_primitiveType_in_createdName2904);
                    primitiveType231=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType231.getTree());

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
        dbg.location(357, 5);

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
    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:359:1: arrayCreatorRest : ( '[' ']' ( '[' ']' )* arrayInitializer | '[' expression ']' ( '[' expression ']' )* );
    public final JaParser.arrayCreatorRest_return arrayCreatorRest() throws RecognitionException {
        JaParser.arrayCreatorRest_return retval = new JaParser.arrayCreatorRest_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal232=null;
        Token char_literal233=null;
        Token char_literal234=null;
        Token char_literal235=null;
        Token char_literal237=null;
        Token char_literal239=null;
        Token char_literal240=null;
        Token char_literal242=null;
        JaParser.arrayInitializer_return arrayInitializer236 = null;

        JaParser.expression_return expression238 = null;

        JaParser.expression_return expression241 = null;


        Object char_literal232_tree=null;
        Object char_literal233_tree=null;
        Object char_literal234_tree=null;
        Object char_literal235_tree=null;
        Object char_literal237_tree=null;
        Object char_literal239_tree=null;
        Object char_literal240_tree=null;
        Object char_literal242_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "arrayCreatorRest");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(359, 1);

        try {
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:360:5: ( '[' ']' ( '[' ']' )* arrayInitializer | '[' expression ']' ( '[' expression ']' )* )
            int alt59=2;
            try { dbg.enterDecision(59);

            int LA59_0 = input.LA(1);

            if ( (LA59_0==79) ) {
                int LA59_1 = input.LA(2);

                if ( (LA59_1==80) ) {
                    alt59=1;
                }
                else if ( (LA59_1==IDENTIFIER||LA59_1==VOID||(LA59_1>=CHAR && LA59_1<=NULLLITERAL)||LA59_1==NEW||(LA59_1>=PLUS && LA59_1<=MINUS)||LA59_1==81||(LA59_1>=93 && LA59_1<=95)) ) {
                    alt59=2;
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

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:360:9: '[' ']' ( '[' ']' )* arrayInitializer
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(360,9);
                    char_literal232=(Token)match(input,79,FOLLOW_79_in_arrayCreatorRest2927); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal232_tree = (Object)adaptor.create(char_literal232);
                    adaptor.addChild(root_0, char_literal232_tree);
                    }
                    dbg.location(360,12);
                    char_literal233=(Token)match(input,80,FOLLOW_80_in_arrayCreatorRest2928); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal233_tree = (Object)adaptor.create(char_literal233);
                    adaptor.addChild(root_0, char_literal233_tree);
                    }
                    dbg.location(360,16);
                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:360:16: ( '[' ']' )*
                    try { dbg.enterSubRule(57);

                    loop57:
                    do {
                        int alt57=2;
                        try { dbg.enterDecision(57);

                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==79) ) {
                            alt57=1;
                        }


                        } finally {dbg.exitDecision(57);}

                        switch (alt57) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:360:17: '[' ']'
                    	    {
                    	    dbg.location(360,17);
                    	    char_literal234=(Token)match(input,79,FOLLOW_79_in_arrayCreatorRest2931); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal234_tree = (Object)adaptor.create(char_literal234);
                    	    adaptor.addChild(root_0, char_literal234_tree);
                    	    }
                    	    dbg.location(360,21);
                    	    char_literal235=(Token)match(input,80,FOLLOW_80_in_arrayCreatorRest2933); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal235_tree = (Object)adaptor.create(char_literal235);
                    	    adaptor.addChild(root_0, char_literal235_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop57;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(57);}

                    dbg.location(360,27);
                    pushFollow(FOLLOW_arrayInitializer_in_arrayCreatorRest2937);
                    arrayInitializer236=arrayInitializer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayInitializer236.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:361:7: '[' expression ']' ( '[' expression ']' )*
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(361,7);
                    char_literal237=(Token)match(input,79,FOLLOW_79_in_arrayCreatorRest2945); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal237_tree = (Object)adaptor.create(char_literal237);
                    adaptor.addChild(root_0, char_literal237_tree);
                    }
                    dbg.location(361,11);
                    pushFollow(FOLLOW_expression_in_arrayCreatorRest2947);
                    expression238=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression238.getTree());
                    dbg.location(361,22);
                    char_literal239=(Token)match(input,80,FOLLOW_80_in_arrayCreatorRest2949); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal239_tree = (Object)adaptor.create(char_literal239);
                    adaptor.addChild(root_0, char_literal239_tree);
                    }
                    dbg.location(361,26);
                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:361:26: ( '[' expression ']' )*
                    try { dbg.enterSubRule(58);

                    loop58:
                    do {
                        int alt58=2;
                        try { dbg.enterDecision(58);

                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==79) ) {
                            alt58=1;
                        }


                        } finally {dbg.exitDecision(58);}

                        switch (alt58) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:361:27: '[' expression ']'
                    	    {
                    	    dbg.location(361,27);
                    	    char_literal240=(Token)match(input,79,FOLLOW_79_in_arrayCreatorRest2952); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal240_tree = (Object)adaptor.create(char_literal240);
                    	    adaptor.addChild(root_0, char_literal240_tree);
                    	    }
                    	    dbg.location(361,31);
                    	    pushFollow(FOLLOW_expression_in_arrayCreatorRest2954);
                    	    expression241=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression241.getTree());
                    	    dbg.location(361,42);
                    	    char_literal242=(Token)match(input,80,FOLLOW_80_in_arrayCreatorRest2956); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal242_tree = (Object)adaptor.create(char_literal242);
                    	    adaptor.addChild(root_0, char_literal242_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop58;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(58);}


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
        dbg.location(362, 5);

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
    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:364:1: classCreatorRest : arguments ;
    public final JaParser.classCreatorRest_return classCreatorRest() throws RecognitionException {
        JaParser.classCreatorRest_return retval = new JaParser.classCreatorRest_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.arguments_return arguments243 = null;



        try { dbg.enterRule(getGrammarFileName(), "classCreatorRest");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(364, 1);

        try {
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:365:5: ( arguments )
            dbg.enterAlt(1);

            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:365:9: arguments
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(365,9);
            pushFollow(FOLLOW_arguments_in_classCreatorRest2979);
            arguments243=arguments();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments243.getTree());

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
        dbg.location(366, 5);

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
    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:368:1: superMemberAccess : '.' IDENTIFIER ( arguments )? ;
    public final JaParser.superMemberAccess_return superMemberAccess() throws RecognitionException {
        JaParser.superMemberAccess_return retval = new JaParser.superMemberAccess_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal244=null;
        Token IDENTIFIER245=null;
        JaParser.arguments_return arguments246 = null;


        Object char_literal244_tree=null;
        Object IDENTIFIER245_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "superMemberAccess");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(368, 1);

        try {
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:369:2: ( '.' IDENTIFIER ( arguments )? )
            dbg.enterAlt(1);

            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:370:2: '.' IDENTIFIER ( arguments )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(370,2);
            char_literal244=(Token)match(input,96,FOLLOW_96_in_superMemberAccess3001); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal244_tree = (Object)adaptor.create(char_literal244);
            adaptor.addChild(root_0, char_literal244_tree);
            }
            dbg.location(370,6);
            IDENTIFIER245=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_superMemberAccess3003); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER245_tree = (Object)adaptor.create(IDENTIFIER245);
            adaptor.addChild(root_0, IDENTIFIER245_tree);
            }
            dbg.location(370,17);
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:370:17: ( arguments )?
            int alt60=2;
            try { dbg.enterSubRule(60);
            try { dbg.enterDecision(60);

            int LA60_0 = input.LA(1);

            if ( (LA60_0==81) ) {
                alt60=1;
            }
            } finally {dbg.exitDecision(60);}

            switch (alt60) {
                case 1 :
                    dbg.enterAlt(1);

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:370:17: arguments
                    {
                    dbg.location(370,17);
                    pushFollow(FOLLOW_arguments_in_superMemberAccess3005);
                    arguments246=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments246.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(60);}


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
        dbg.location(371, 2);

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
    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:373:1: arguments : '(' ( expressionList )? ')' ;
    public final JaParser.arguments_return arguments() throws RecognitionException {
        JaParser.arguments_return retval = new JaParser.arguments_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal247=null;
        Token char_literal249=null;
        JaParser.expressionList_return expressionList248 = null;


        Object char_literal247_tree=null;
        Object char_literal249_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "arguments");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(373, 1);

        try {
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:374:5: ( '(' ( expressionList )? ')' )
            dbg.enterAlt(1);

            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:374:9: '(' ( expressionList )? ')'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(374,12);
            char_literal247=(Token)match(input,81,FOLLOW_81_in_arguments3023); if (state.failed) return retval;
            dbg.location(374,14);
            // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:374:14: ( expressionList )?
            int alt61=2;
            try { dbg.enterSubRule(61);
            try { dbg.enterDecision(61);

            int LA61_0 = input.LA(1);

            if ( (LA61_0==IDENTIFIER||LA61_0==VOID||(LA61_0>=CHAR && LA61_0<=NULLLITERAL)||LA61_0==NEW||(LA61_0>=PLUS && LA61_0<=MINUS)||LA61_0==81||(LA61_0>=93 && LA61_0<=95)) ) {
                alt61=1;
            }
            } finally {dbg.exitDecision(61);}

            switch (alt61) {
                case 1 :
                    dbg.enterAlt(1);

                    // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:374:14: expressionList
                    {
                    dbg.location(374,14);
                    pushFollow(FOLLOW_expressionList_in_arguments3026);
                    expressionList248=expressionList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList248.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(61);}

            dbg.location(374,33);
            char_literal249=(Token)match(input,82,FOLLOW_82_in_arguments3029); if (state.failed) return retval;

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
        dbg.location(375, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "arguments");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "arguments"

    // $ANTLR start synpred2_Ja
    public final void synpred2_Ja_fragment() throws RecognitionException {   
        // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:218:2: ( ELSE )
        dbg.enterAlt(1);

        // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:218:3: ELSE
        {
        dbg.location(218,3);
        match(input,ELSE,FOLLOW_ELSE_in_synpred2_Ja1604); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_Ja

    // $ANTLR start synpred3_Ja
    public final void synpred3_Ja_fragment() throws RecognitionException {   
        // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:309:9: ( '(' primitiveType ')' )
        dbg.enterAlt(1);

        // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:309:10: '(' primitiveType ')'
        {
        dbg.location(309,10);
        match(input,81,FOLLOW_81_in_synpred3_Ja2353); if (state.failed) return ;
        dbg.location(309,14);
        pushFollow(FOLLOW_primitiveType_in_synpred3_Ja2355);
        primitiveType();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(309,28);
        match(input,82,FOLLOW_82_in_synpred3_Ja2357); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_Ja

    // $ANTLR start synpred4_Ja
    public final void synpred4_Ja_fragment() throws RecognitionException {   
        // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:311:9: ( '(' nonPrimitiveType ')' unaryExpressionNotPlusMinus )
        dbg.enterAlt(1);

        // H:\\Sync\\Documenti\\Gerardo\\Universita\\Magistrale\\1° Anno\\Compilatori\\jagrammar\\antlr\\Ja.g:311:10: '(' nonPrimitiveType ')' unaryExpressionNotPlusMinus
        {
        dbg.location(311,10);
        match(input,81,FOLLOW_81_in_synpred4_Ja2385); if (state.failed) return ;
        dbg.location(311,14);
        pushFollow(FOLLOW_nonPrimitiveType_in_synpred4_Ja2387);
        nonPrimitiveType();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(311,32);
        match(input,82,FOLLOW_82_in_synpred4_Ja2390); if (state.failed) return ;
        dbg.location(311,36);
        pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_synpred4_Ja2392);
        unaryExpressionNotPlusMinus();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_Ja

    // Delegated rules

    public final boolean synpred3_Ja() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred3_Ja_fragment(); // can never throw exception
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
    public final boolean synpred4_Ja() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred4_Ja_fragment(); // can never throw exception
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
    public final boolean synpred2_Ja() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred2_Ja_fragment(); // can never throw exception
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


    protected DFA22 dfa22 = new DFA22(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA48 dfa48 = new DFA48(this);
    protected DFA51 dfa51 = new DFA51(this);
    static final String DFA22_eotS =
        "\11\uffff";
    static final String DFA22_eofS =
        "\11\uffff";
    static final String DFA22_minS =
        "\3\31\1\120\2\uffff\1\120\2\31";
    static final String DFA22_maxS =
        "\1\44\2\123\1\120\2\uffff\1\120\2\123";
    static final String DFA22_acceptS =
        "\4\uffff\1\2\1\1\3\uffff";
    static final String DFA22_specialS =
        "\11\uffff}>";
    static final String[] DFA22_transitionS = {
            "\1\1\4\uffff\7\2",
            "\1\5\65\uffff\1\3\3\uffff\1\4",
            "\1\5\65\uffff\1\6\3\uffff\1\4",
            "\1\7",
            "",
            "",
            "\1\10",
            "\1\5\65\uffff\1\3\3\uffff\1\4",
            "\1\5\65\uffff\1\6\3\uffff\1\4"
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "157:1: formalParameterDecls : ( type variableDeclaratorId ( ',' formalParameterDecls )? -> ^( FPARM type variableDeclaratorId ) ( formalParameterDecls )? | type '...' variableDeclaratorId -> ^( FMULTPARM type variableDeclaratorId ) );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA26_eotS =
        "\12\uffff";
    static final String DFA26_eofS =
        "\12\uffff";
    static final String DFA26_minS =
        "\3\31\1\uffff\1\31\1\uffff\1\120\2\31\1\120";
    static final String DFA26_maxS =
        "\1\137\2\140\1\uffff\1\137\1\uffff\1\120\2\140\1\120";
    static final String DFA26_acceptS =
        "\3\uffff\1\2\1\uffff\1\1\4\uffff";
    static final String DFA26_specialS =
        "\12\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\1\2\uffff\1\3\1\uffff\7\2\15\3\3\uffff\1\3\17\uffff\2\3"+
            "\4\uffff\2\3\4\uffff\1\3\13\uffff\3\3",
            "\1\5\31\uffff\2\3\17\uffff\5\3\2\uffff\1\3\3\uffff\1\4\1\uffff"+
            "\1\3\2\uffff\13\3\1\uffff\1\3",
            "\1\5\65\uffff\1\6\20\uffff\1\3",
            "",
            "\1\3\2\uffff\1\3\1\uffff\17\3\10\uffff\1\3\17\uffff\2\3\11"+
            "\uffff\1\7\1\3\13\uffff\3\3",
            "",
            "\1\10",
            "\1\5\65\uffff\1\11\20\uffff\1\3",
            "\1\5\65\uffff\1\6\20\uffff\1\3",
            "\1\7"
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
            return "191:1: blockStatement : ( localVariableDeclarationStatement | statement );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA34_eotS =
        "\12\uffff";
    static final String DFA34_eofS =
        "\12\uffff";
    static final String DFA34_minS =
        "\3\31\1\uffff\1\31\1\uffff\1\120\2\31\1\120";
    static final String DFA34_maxS =
        "\1\137\2\140\1\uffff\1\137\1\uffff\1\120\2\140\1\120";
    static final String DFA34_acceptS =
        "\3\uffff\1\2\1\uffff\1\1\4\uffff";
    static final String DFA34_specialS =
        "\12\uffff}>";
    static final String[] DFA34_transitionS = {
            "\1\1\2\uffff\1\3\1\uffff\7\2\10\3\10\uffff\1\3\17\uffff\2\3"+
            "\12\uffff\1\3\13\uffff\3\3",
            "\1\5\31\uffff\2\3\17\uffff\5\3\2\uffff\1\3\2\uffff\1\3\1\4"+
            "\1\uffff\1\3\2\uffff\13\3\1\uffff\1\3",
            "\1\5\65\uffff\1\6\20\uffff\1\3",
            "",
            "\1\3\2\uffff\1\3\1\uffff\17\3\10\uffff\1\3\17\uffff\2\3\11"+
            "\uffff\1\7\1\3\13\uffff\3\3",
            "",
            "\1\10",
            "\1\5\65\uffff\1\11\20\uffff\1\3",
            "\1\5\65\uffff\1\6\20\uffff\1\3",
            "\1\7"
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
            return "227:1: forInit : ( localVariableDeclaration | expressionList );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA48_eotS =
        "\30\uffff";
    static final String DFA48_eofS =
        "\10\uffff\1\4\17\uffff";
    static final String DFA48_minS =
        "\1\31\1\uffff\1\31\2\uffff\1\63\1\117\2\31\1\uffff\1\120\1\117"+
        "\11\uffff\1\117\1\120\1\uffff";
    static final String DFA48_maxS =
        "\1\137\1\uffff\1\137\2\uffff\2\140\1\137\1\140\1\uffff\1\120\1"+
        "\140\11\uffff\1\140\1\120\1\uffff";
    static final String DFA48_acceptS =
        "\1\uffff\1\1\1\uffff\1\4\1\5\4\uffff\1\2\2\uffff\11\3\2\uffff\1"+
        "\3";
    static final String DFA48_specialS =
        "\6\uffff\1\0\1\uffff\1\3\2\uffff\1\2\11\uffff\1\1\2\uffff}>";
    static final String[] DFA48_transitionS = {
            "\1\4\2\uffff\1\4\1\uffff\17\4\10\uffff\1\3\33\uffff\1\2\15"+
            "\uffff\1\1",
            "",
            "\1\5\2\uffff\1\4\1\uffff\7\6\10\4\10\uffff\1\4\17\uffff\2"+
            "\4\12\uffff\1\4\13\uffff\3\4",
            "",
            "",
            "\2\4\17\uffff\5\4\6\uffff\1\7\1\uffff\1\4\1\10\1\uffff\13"+
            "\4\1\uffff\1\4",
            "\1\12\2\uffff\1\11\15\uffff\1\4",
            "\1\4\2\uffff\1\4\1\uffff\17\4\10\uffff\1\4\17\uffff\2\4\11"+
            "\uffff\1\13\1\4\13\uffff\3\4",
            "\1\22\2\uffff\1\24\1\uffff\7\23\1\17\1\20\6\21\6\uffff\2\4"+
            "\1\16\16\uffff\5\4\2\uffff\1\4\1\uffff\4\4\1\15\1\4\1\uffff"+
            "\13\4\1\14\1\4",
            "",
            "\1\25",
            "\1\26\2\uffff\1\27\15\uffff\1\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\12\2\uffff\1\27\15\uffff\1\4",
            "\1\13",
            ""
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
            return "307:1: unaryExpressionNotPlusMinus : ( '!' unaryExpression | ( '(' primitiveType ')' )=> '(' primitiveType ')' unaryExpression | ( '(' nonPrimitiveType ')' unaryExpressionNotPlusMinus )=> '(' nonPrimitiveType ')' unaryExpressionNotPlusMinus | NEW creator | primary ( selector )* ( '++' | '--' )? );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA48_6 = input.LA(1);

                         
                        int index48_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA48_6==82) && (synpred3_Ja())) {s = 9;}

                        else if ( (LA48_6==79) ) {s = 10;}

                        else if ( (LA48_6==96) ) {s = 4;}

                         
                        input.seek(index48_6);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA48_21 = input.LA(1);

                         
                        int index48_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA48_21==82) && (synpred4_Ja())) {s = 23;}

                        else if ( (LA48_21==79) ) {s = 10;}

                        else if ( (LA48_21==96) ) {s = 4;}

                         
                        input.seek(index48_21);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA48_11 = input.LA(1);

                         
                        int index48_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA48_11==96) ) {s = 4;}

                        else if ( (LA48_11==79) ) {s = 22;}

                        else if ( (LA48_11==82) && (synpred4_Ja())) {s = 23;}

                         
                        input.seek(index48_11);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA48_8 = input.LA(1);

                         
                        int index48_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA48_8==EOF||(LA48_8>=INSTANCEOF && LA48_8<=COMPAREOP)||(LA48_8>=EQ && LA48_8<=SLASH)||LA48_8==75||(LA48_8>=77 && LA48_8<=80)||LA48_8==82||(LA48_8>=84 && LA48_8<=94)||LA48_8==96) ) {s = 4;}

                        else if ( (LA48_8==95) && (synpred4_Ja())) {s = 12;}

                        else if ( (LA48_8==81) && (synpred4_Ja())) {s = 13;}

                        else if ( (LA48_8==NEW) && (synpred4_Ja())) {s = 14;}

                        else if ( (LA48_8==THIS) && (synpred4_Ja())) {s = 15;}

                        else if ( (LA48_8==SUPER) && (synpred4_Ja())) {s = 16;}

                        else if ( ((LA48_8>=INTLITERAL && LA48_8<=NULLLITERAL)) && (synpred4_Ja())) {s = 17;}

                        else if ( (LA48_8==IDENTIFIER) && (synpred4_Ja())) {s = 18;}

                        else if ( ((LA48_8>=CHAR && LA48_8<=DOUBLE)) && (synpred4_Ja())) {s = 19;}

                        else if ( (LA48_8==VOID) && (synpred4_Ja())) {s = 20;}

                         
                        input.seek(index48_8);
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
        "\1\31\4\uffff\1\63\2\uffff\1\30\1\uffff\1\31\3\uffff";
    static final String DFA51_maxS =
        "\1\121\4\uffff\1\140\2\uffff\1\31\1\uffff\1\137\3\uffff";
    static final String DFA51_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\11\1\12\1\uffff\1\7\1\uffff"+
        "\1\5\1\10\1\6";
    static final String DFA51_specialS =
        "\16\uffff}>";
    static final String[] DFA51_transitionS = {
            "\1\5\2\uffff\1\7\1\uffff\7\6\1\2\1\3\6\4\44\uffff\1\1",
            "",
            "",
            "",
            "",
            "\2\13\17\uffff\5\13\2\uffff\1\13\1\uffff\2\13\1\12\1\13\1"+
            "\11\1\13\1\uffff\13\13\1\uffff\1\10",
            "",
            "",
            "\1\14\1\13",
            "",
            "\1\13\2\uffff\1\13\1\uffff\17\13\10\uffff\1\13\17\uffff\2"+
            "\13\11\uffff\1\15\1\13\13\uffff\3\13",
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
            return "320:1: primary : ( parExpression | THIS | SUPER superMemberAccess | literal | IDENTIFIER | ( IDENTIFIER -> IDENTIFIER ) ( '[' ']' -> ^( ARRAYTYPE $primary) )+ ( '.' CLASS -> ^( DOTCLASS $primary) ) | IDENTIFIER arguments -> ^( METHODCALL IDENTIFIER arguments THIS ) | IDENTIFIER '.' CLASS -> ^( DOTCLASS IDENTIFIER ) | ( primitiveType -> primitiveType ) ( '[' ']' -> ^( ARRAYTYPE $primary) )* ( '.' CLASS -> ^( DOTCLASS $primary) ) | VOID '.' CLASS -> ^( DOTCLASS VOID ) );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
 

    public static final BitSet FOLLOW_classDeclaration_in_compilationUnit119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_compilationUnit129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classModifier_in_classDeclaration152 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_CLASS_in_classDeclaration155 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classDeclaration158 = new BitSet(new long[]{0x0000000004000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_EXTENDS_in_classDeclaration169 = new BitSet(new long[]{0x0000001FC2000000L});
    public static final BitSet FOLLOW_type_in_classDeclaration172 = new BitSet(new long[]{0x0000000004000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_classBody_in_classDeclaration184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PUBLIC_in_classModifier211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_classBody240 = new BitSet(new long[]{0x0000000028000000L,0x0000000000002800L});
    public static final BitSet FOLLOW_classBodyDeclaration_in_classBody243 = new BitSet(new long[]{0x0000000028000000L,0x0000000000002800L});
    public static final BitSet FOLLOW_77_in_classBody246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_classBodyDeclaration266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_memberDeclaration_in_classBodyDeclaration277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifier_in_memberDeclaration301 = new BitSet(new long[]{0x0000001FC2000000L});
    public static final BitSet FOLLOW_type_in_memberDeclaration303 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_methodDeclaration_in_memberDeclaration312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldDeclaration_in_memberDeclaration336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifier_in_memberDeclaration363 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_VOID_in_memberDeclaration365 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_memberDeclaration367 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_voidMethodDeclaratorRest_in_memberDeclaration369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifier_in_memberDeclaration393 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_memberDeclaration403 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_formalParameters_in_memberDeclaration405 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_constructorBody_in_memberDeclaration407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_methodDeclaration446 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_methodDeclaratorRest_in_methodDeclaration448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclarator_in_fieldDeclaration468 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004800L});
    public static final BitSet FOLLOW_78_in_fieldDeclaration471 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_variableDeclarator_in_fieldDeclaration473 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004800L});
    public static final BitSet FOLLOW_75_in_fieldDeclaration477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formalParameters_in_methodDeclaratorRest512 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_methodBody_in_methodDeclaratorRest526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_methodDeclaratorRest540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formalParameters_in_voidMethodDeclaratorRest574 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_methodBody_in_voidMethodDeclaratorRest588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_voidMethodDeclaratorRest602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_variableDeclarator631 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_EQ_in_variableDeclarator634 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_variableInitializer_in_variableDeclarator637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_variableDeclaratorId663 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_variableDeclaratorId666 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_variableDeclaratorId668 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_arrayInitializer_in_variableInitializer689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_variableInitializer699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_arrayInitializer726 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0023060L});
    public static final BitSet FOLLOW_variableInitializer_in_arrayInitializer729 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_78_in_arrayInitializer732 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_variableInitializer_in_arrayInitializer734 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_78_in_arrayInitializer739 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_arrayInitializer746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_modifier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_typeName794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonPrimitiveType_in_type808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_type813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classType_in_nonPrimitiveType825 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_nonPrimitiveType828 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_nonPrimitiveType830 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_primitiveType_in_nonPrimitiveType837 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_nonPrimitiveType840 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_nonPrimitiveType842 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classType855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_primitiveType0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_formalParameters954 = new BitSet(new long[]{0x0000001FC2000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_formalParameterDecls_in_formalParameters956 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_formalParameters959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_formalParameterDecls1008 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_formalParameterDecls1010 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_formalParameterDecls1013 = new BitSet(new long[]{0x0000001FC2000000L});
    public static final BitSet FOLLOW_formalParameterDecls_in_formalParameterDecls1015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_formalParameterDecls1039 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_formalParameterDecls1041 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_formalParameterDecls1043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_methodBody1076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_constructorBody1103 = new BitSet(new long[]{0x0023FFFFD2000000L,0x00000000E0023860L});
    public static final BitSet FOLLOW_explicitConstructorInvocation_in_constructorBody1105 = new BitSet(new long[]{0x0023FFFFD2000000L,0x00000000E0023860L});
    public static final BitSet FOLLOW_blockStatement_in_constructorBody1108 = new BitSet(new long[]{0x0023FFFFD2000000L,0x00000000E0023860L});
    public static final BitSet FOLLOW_77_in_constructorBody1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_explicitConstructorInvocation1130 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_arguments_in_explicitConstructorInvocation1138 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_explicitConstructorInvocation1140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_literal0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_block1237 = new BitSet(new long[]{0x0023FFFFD2000000L,0x00000000E0023860L});
    public static final BitSet FOLLOW_blockStatement_in_block1240 = new BitSet(new long[]{0x0023FFFFD2000000L,0x00000000E0023860L});
    public static final BitSet FOLLOW_77_in_block1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localVariableDeclarationStatement_in_blockStatement1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_blockStatement1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localVariableDeclaration_in_localVariableDeclarationStatement1301 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_localVariableDeclarationStatement1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_localVariableDeclaration1323 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_variableDeclarator_in_localVariableDeclaration1325 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_localVariableDeclaration1328 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_variableDeclarator_in_localVariableDeclaration1330 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_block_in_statement1366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_statement1384 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_parExpression_in_statement1386 = new BitSet(new long[]{0x0023FFFFD2000000L,0x00000000E0021860L});
    public static final BitSet FOLLOW_statement_in_statement1388 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_elseStmt_in_statement1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_statement1421 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_statement1423 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021860L});
    public static final BitSet FOLLOW_forInit_in_statement1425 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_statement1428 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021860L});
    public static final BitSet FOLLOW_expression_in_statement1430 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_statement1433 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0061060L});
    public static final BitSet FOLLOW_forUpdate_in_statement1435 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_statement1438 = new BitSet(new long[]{0x0023FFFFD2000000L,0x00000000E0021860L});
    public static final BitSet FOLLOW_statement_in_statement1440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_statement1486 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_parExpression_in_statement1488 = new BitSet(new long[]{0x0023FFFFD2000000L,0x00000000E0021860L});
    public static final BitSet FOLLOW_statement_in_statement1490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_statement1514 = new BitSet(new long[]{0x0023FFFFD2000000L,0x00000000E0021860L});
    public static final BitSet FOLLOW_statement_in_statement1516 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_WHILE_in_statement1518 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_parExpression_in_statement1520 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_statement1522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_statement1546 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021860L});
    public static final BitSet FOLLOW_expression_in_statement1549 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_statement1552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_statement1563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementExpression_in_statement1575 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_statement1577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_elseStmt1609 = new BitSet(new long[]{0x0023FFFFD2000000L,0x00000000E0021860L});
    public static final BitSet FOLLOW_statement_in_elseStmt1612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localVariableDeclaration_in_forInit1637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionList_in_forInit1647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionList_in_forUpdate1666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_parExpression1687 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_expression_in_parExpression1690 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_parExpression1692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionList1716 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_expressionList1719 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_expression_in_expressionList1721 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_expression_in_statementExpression1742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_constantExpression1765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orExpression_in_expression1787 = new BitSet(new long[]{0x0000000000000002L,0x0000000000F00010L});
    public static final BitSet FOLLOW_assignmentOperator_in_expression1793 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_expression_in_expression1795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_assignmentOperator1975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_assignmentOperator1988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_assignmentOperator2001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_assignmentOperator2013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_assignmentOperator2025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andExpression_in_orExpression2046 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_orExpression2050 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_andExpression_in_orExpression2053 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_equalityExpression_in_andExpression2075 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_andExpression2079 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_equalityExpression_in_andExpression2082 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_instanceOfExpression_in_equalityExpression2104 = new BitSet(new long[]{0x0000000000000002L,0x000000000C000000L});
    public static final BitSet FOLLOW_set_in_equalityExpression2108 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_instanceOfExpression_in_equalityExpression2117 = new BitSet(new long[]{0x0000000000000002L,0x000000000C000000L});
    public static final BitSet FOLLOW_relationalExpression_in_instanceOfExpression2139 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_INSTANCEOF_in_instanceOfExpression2142 = new BitSet(new long[]{0x0000001FC2000000L});
    public static final BitSet FOLLOW_type_in_instanceOfExpression2145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression2166 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_COMPAREOP_in_relationalExpression2170 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression2173 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression2195 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000060L});
    public static final BitSet FOLLOW_set_in_additiveExpression2199 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression2208 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000060L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression2230 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000180L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression2234 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression2249 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000180L});
    public static final BitSet FOLLOW_PLUS_in_unaryExpression2275 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression2277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unaryExpression2287 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression2289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_unaryExpression2299 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression2301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_unaryExpression2311 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression2313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression2323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_unaryExpressionNotPlusMinus2340 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus2342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_unaryExpressionNotPlusMinus2363 = new BitSet(new long[]{0x0000001FC2000000L});
    public static final BitSet FOLLOW_primitiveType_in_unaryExpressionNotPlusMinus2365 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_unaryExpressionNotPlusMinus2367 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus2369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_unaryExpressionNotPlusMinus2397 = new BitSet(new long[]{0x0000001FC2000000L});
    public static final BitSet FOLLOW_nonPrimitiveType_in_unaryExpressionNotPlusMinus2399 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_unaryExpressionNotPlusMinus2402 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpressionNotPlusMinus2404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_unaryExpressionNotPlusMinus2414 = new BitSet(new long[]{0x0000001FC2000000L});
    public static final BitSet FOLLOW_creator_in_unaryExpressionNotPlusMinus2416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_in_unaryExpressionNotPlusMinus2426 = new BitSet(new long[]{0x0000000000000002L,0x0000000160008000L});
    public static final BitSet FOLLOW_selector_in_unaryExpressionNotPlusMinus2429 = new BitSet(new long[]{0x0000000000000002L,0x0000000160008000L});
    public static final BitSet FOLLOW_set_in_unaryExpressionNotPlusMinus2433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parExpression_in_primary2493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_primary2503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUPER_in_primary2514 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_superMemberAccess_in_primary2517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primary2527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_primary2537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_primary2548 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_primary2556 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_primary2558 = new BitSet(new long[]{0x0000000000000000L,0x0000000100008000L});
    public static final BitSet FOLLOW_96_in_primary2572 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_CLASS_in_primary2574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_primary2593 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_arguments_in_primary2596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_primary2616 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_primary2618 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_CLASS_in_primary2620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_primary2639 = new BitSet(new long[]{0x0000000000000000L,0x0000000100008000L});
    public static final BitSet FOLLOW_79_in_primary2647 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_primary2649 = new BitSet(new long[]{0x0000000000000000L,0x0000000100008000L});
    public static final BitSet FOLLOW_96_in_primary2663 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_CLASS_in_primary2665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_primary2685 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_primary2687 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_CLASS_in_primary2689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_selector2720 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_selector2722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_selector2738 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_selector2740 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_arguments_in_selector2742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_selector2773 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_expression_in_selector2775 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_selector2777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_identifierSuffix2804 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_identifierSuffix2806 = new BitSet(new long[]{0x0000000000000000L,0x0000000100008000L});
    public static final BitSet FOLLOW_96_in_identifierSuffix2810 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_CLASS_in_identifierSuffix2812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arguments_in_identifierSuffix2827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_identifierSuffix2837 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_CLASS_in_identifierSuffix2839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createdName_in_creator2867 = new BitSet(new long[]{0x0000000000000000L,0x0000000000028000L});
    public static final BitSet FOLLOW_arrayCreatorRest_in_creator2870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classCreatorRest_in_creator2874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classType_in_createdName2894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_createdName2904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_arrayCreatorRest2927 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_arrayCreatorRest2928 = new BitSet(new long[]{0x0000000000000000L,0x0000000000009000L});
    public static final BitSet FOLLOW_79_in_arrayCreatorRest2931 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_arrayCreatorRest2933 = new BitSet(new long[]{0x0000000000000000L,0x0000000000009000L});
    public static final BitSet FOLLOW_arrayInitializer_in_arrayCreatorRest2937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_arrayCreatorRest2945 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_expression_in_arrayCreatorRest2947 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_arrayCreatorRest2949 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_arrayCreatorRest2952 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_expression_in_arrayCreatorRest2954 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_arrayCreatorRest2956 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_arguments_in_classCreatorRest2979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_superMemberAccess3001 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_superMemberAccess3003 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_arguments_in_superMemberAccess3005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_arguments3023 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0061060L});
    public static final BitSet FOLLOW_expressionList_in_arguments3026 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_arguments3029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_synpred2_Ja1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_synpred3_Ja2353 = new BitSet(new long[]{0x0000001FC2000000L});
    public static final BitSet FOLLOW_primitiveType_in_synpred3_Ja2355 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_synpred3_Ja2357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_synpred4_Ja2385 = new BitSet(new long[]{0x0000001FC2000000L});
    public static final BitSet FOLLOW_nonPrimitiveType_in_synpred4_Ja2387 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_synpred4_Ja2390 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_synpred4_Ja2392 = new BitSet(new long[]{0x0000000000000002L});

}