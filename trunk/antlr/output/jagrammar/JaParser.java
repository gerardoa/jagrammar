// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g 2010-10-01 12:32:09

	package jagrammar;
	
	import jagrammar.typehierarchy.*;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "METHODCALL", "CONSTRCALL", "FIELDACCESS", "ARRAYACCESS", "DOTCLASS", "ARRAYTYPE", "METHOD", "FIELD", "CONSTR", "FPARMS", "ARGUMENTS", "FPARM", "FMULTPARM", "MBODY", "CBODY", "VARDECL", "BLOCK", "STMT", "INIT", "CONDITION", "UPDATE", "DOWHILE", "THEN", "ARRAYINIT", "PREINC", "POSTINC", "PREDEC", "POSTDEC", "UNARYPLUS", "UNARYMINUS", "CAST", "CLASS", "IDENTIFIER", "EXTENDS", "PUBLIC", "VOID", "PRIVATE", "CHAR", "BYTE", "SHORT", "INT", "LONG", "FLOAT", "DOUBLE", "THIS", "SUPER", "INTLITERAL", "LONGLITERAL", "FLOATLITERAL", "DOUBLELITERAL", "CHARLITERAL", "STRINGLITERAL", "BOOLEANLITERAL", "NULLLITERAL", "IF", "FOR", "WHILE", "DO", "RETURN", "ELSE", "INSTANCEOF", "COMPAREOP", "NEW", "Digit", "IntegerNumber", "LongSuffix", "Exponent", "FloatingPointLiteral", "FloatSuffix", "DoubleSuffix", "EscapeSequence", "BOOLEAN", "WS", "COMMENT", "LINE_COMMENT", "EQ", "PLUS", "MINUS", "STAR", "SLASH", "Letter", "Currency", "';'", "'{'", "'}'", "','", "'['", "']'", "'('", "')'", "'...'", "'+='", "'-='", "'*='", "'/='", "'||'", "'&&'", "'=='", "'!='", "'%'", "'++'", "'--'", "'!'", "'.'"
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
    public static final int IntegerNumber=68;
    public static final int ARRAYINIT=27;
    public static final int PREDEC=30;
    public static final int FIELDACCESS=6;
    public static final int PRIVATE=40;
    public static final int Letter=84;
    public static final int INTLITERAL=50;
    public static final int CONDITION=23;
    public static final int T__96=96;
    public static final int PREINC=28;
    public static final int CBODY=18;
    public static final int MBODY=17;
    public static final int STRINGLITERAL=55;
    public static final int CHARLITERAL=54;
    public static final int PLUS=80;
    public static final int EXTENDS=37;
    public static final int POSTDEC=31;
    public static final int UNARYPLUS=32;
    public static final int SUPER=49;
    public static final int DOUBLELITERAL=53;
    public static final int ARGUMENTS=14;
    public static final int T__89=89;
    public static final int LongSuffix=69;
    public static final int WS=76;
    public static final int CHAR=41;
    public static final int EQ=79;
    public static final int NEW=66;
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
    public static final int COMMENT=77;
    public static final int T__99=99;
    public static final int THIS=48;
    public static final int T__103=103;
    public static final int CLASS=35;
    public static final int METHODCALL=4;
    public static final int T__97=97;
    public static final int RETURN=62;
    public static final int T__105=105;
    public static final int BYTE=42;
    public static final int IF=58;
    public static final int FPARMS=13;
    public static final int EOF=-1;
    public static final int FOR=59;
    public static final int STAR=82;
    public static final int T__102=102;

    // delegates
    // delegators

    public static final String[] ruleNames = new String[] {
        "invalidRule", "localVariableDeclaration", "unaryExpressionNotPlusMinus", 
        "explicitConstructorInvocation", "memberDeclaration", "arrayCreatorRest", 
        "forUpdate", "orExpression", "multiplicativeExpression", "variableInitializer", 
        "synpred2_Ja", "block", "equalityExpression", "methodBody", "classCreatorRest", 
        "expression", "classType", "classDeclaration", "synpred3_Ja", "methodDeclaration", 
        "variableDeclaratorId", "statementExpression", "nonPrimitiveType", 
        "classBody", "selector", "type", "instanceOfExpression", "synpred1_Ja", 
        "assignmentOperator", "compilationUnit", "arguments", "voidMethodDeclaratorRest", 
        "relationalExpression", "variableDeclarator", "formalParameterDecls", 
        "primitiveType", "constructorBody", "constantExpression", "creator", 
        "andExpression", "createdName", "parExpression", "blockStatement", 
        "elseStmt", "additiveExpression", "arrayInitializer", "forInit", 
        "primary", "formalParameters", "unaryExpression", "expressionList", 
        "synpred4_Ja", "classModifier", "fieldDeclaration", "localVariableDeclarationStatement", 
        "modifier", "literal", "classBodyDeclaration", "statement", "superMemberAccess", 
        "typeName"
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
        	
        	// ritorna un Type perche' potrebbe non restituire un ComplexType se dim e' uguale a 0
        	private Type createArrayType(Type t, int dim) {
        		for(int i=0; i < dim; i++) {
        			t = new ArrayType(t);
        		}
        		return t;
        	}


    public static class compilationUnit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "compilationUnit"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:54:1: compilationUnit : ( classDeclaration | ';' );
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
        dbg.location(54, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:55:5: ( classDeclaration | ';' )
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

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:55:8: classDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(55,24);
                    pushFollow(FOLLOW_classDeclaration_in_compilationUnit158);
                    classDeclaration1=classDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(classDeclaration1.getTree(), root_0);

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:56:7: ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(56,7);
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
        dbg.location(57, 5);

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:59:1: classDeclaration : classModifier CLASS IDENTIFIER ( EXTENDS classType )? classBody ;
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
        dbg.location(59, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:60:5: ( classModifier CLASS IDENTIFIER ( EXTENDS classType )? classBody )
            dbg.enterAlt(1);

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:60:9: classModifier CLASS IDENTIFIER ( EXTENDS classType )? classBody
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(60,22);
            pushFollow(FOLLOW_classModifier_in_classDeclaration191);
            classModifier3=classModifier();

            state._fsp--;
            if (state.failed) return retval;
            dbg.location(60,29);
            CLASS4=(Token)match(input,CLASS,FOLLOW_CLASS_in_classDeclaration194); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CLASS4_tree = (Object)adaptor.create(CLASS4);
            root_0 = (Object)adaptor.becomeRoot(CLASS4_tree, root_0);
            }
            dbg.location(60,31);
            IDENTIFIER5=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classDeclaration197); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER5_tree = (Object)adaptor.create(IDENTIFIER5);
            adaptor.addChild(root_0, IDENTIFIER5_tree);
            }
            dbg.location(60,42);
            if ( state.backtracking==0 ) {
               if(cTab.containsKey((IDENTIFIER5!=null?IDENTIFIER5.getText():null))) {
                  				    	   	rt = cTab.get((IDENTIFIER5!=null?IDENTIFIER5.getText():null));
                  					   } else {
                  					   	rt = new ReferenceType((IDENTIFIER5!=null?IDENTIFIER5.getText():null));
                  					   	cTab.put((IDENTIFIER5!=null?IDENTIFIER5.getText():null), rt);
                  					   }
                  					 
            }
            dbg.location(67,9);
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:67:9: ( EXTENDS classType )?
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

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:67:10: EXTENDS classType
                    {
                    dbg.location(67,17);
                    EXTENDS6=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_classDeclaration210); if (state.failed) return retval;
                    dbg.location(67,19);
                    pushFollow(FOLLOW_classType_in_classDeclaration213);
                    classType7=classType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classType7.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(2);}

            dbg.location(67,33);
            if ( state.backtracking==0 ) {
               rt.addSuperType((classType7!=null?classType7.t:null)); 
            }
            dbg.location(68,6);
            pushFollow(FOLLOW_classBody_in_classDeclaration231);
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
        dbg.location(69, 5);

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:71:1: classModifier : PUBLIC ;
    public final JaParser.classModifier_return classModifier() throws RecognitionException {
        JaParser.classModifier_return retval = new JaParser.classModifier_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PUBLIC9=null;

        Object PUBLIC9_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "classModifier");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(71, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:72:5: ( PUBLIC )
            dbg.enterAlt(1);

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:72:9: PUBLIC
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(72,9);
            PUBLIC9=(Token)match(input,PUBLIC,FOLLOW_PUBLIC_in_classModifier250); if (state.failed) return retval;
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
        dbg.location(73, 5);

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:75:1: classBody : '{' ( classBodyDeclaration )* '}' ;
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
        dbg.location(75, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:76:5: ( '{' ( classBodyDeclaration )* '}' )
            dbg.enterAlt(1);

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:76:9: '{' ( classBodyDeclaration )* '}'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(76,12);
            char_literal10=(Token)match(input,87,FOLLOW_87_in_classBody271); if (state.failed) return retval;
            dbg.location(76,14);
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:76:14: ( classBodyDeclaration )*
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

            	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:76:14: classBodyDeclaration
            	    {
            	    dbg.location(76,14);
            	    pushFollow(FOLLOW_classBodyDeclaration_in_classBody274);
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

            dbg.location(76,39);
            char_literal12=(Token)match(input,88,FOLLOW_88_in_classBody277); if (state.failed) return retval;

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:79:1: classBodyDeclaration : ( ';' | memberDeclaration );
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
        dbg.location(79, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:80:5: ( ';' | memberDeclaration )
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

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:80:9: ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(80,12);
                    char_literal13=(Token)match(input,86,FOLLOW_86_in_classBodyDeclaration297); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:81:9: memberDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(81,9);
                    pushFollow(FOLLOW_memberDeclaration_in_classBodyDeclaration308);
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
        dbg.location(82, 5);

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:84:1: memberDeclaration : ( ( modifier type -> modifier type ) ( methodDeclaration[$modifier.pub, $type.t] -> ^( METHOD $memberDeclaration methodDeclaration ) | fieldDeclaration[(CommonTree)$modifier.tree, (CommonTree)$type.tree, $modifier.pub, $type.t] -> fieldDeclaration ) | modifier VOID IDENTIFIER voidMethodDeclaratorRest[$modifier.pub, VoidType.TYPE, $IDENTIFIER.text] -> ^( METHOD modifier VOID IDENTIFIER voidMethodDeclaratorRest ) | modifier ( IDENTIFIER formalParameters )=> IDENTIFIER formalParameters constructorBody -> ^( CONSTR modifier IDENTIFIER ( formalParameters )? ( constructorBody )? ) );
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
        dbg.location(84, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:85:5: ( ( modifier type -> modifier type ) ( methodDeclaration[$modifier.pub, $type.t] -> ^( METHOD $memberDeclaration methodDeclaration ) | fieldDeclaration[(CommonTree)$modifier.tree, (CommonTree)$type.tree, $modifier.pub, $type.t] -> fieldDeclaration ) | modifier VOID IDENTIFIER voidMethodDeclaratorRest[$modifier.pub, VoidType.TYPE, $IDENTIFIER.text] -> ^( METHOD modifier VOID IDENTIFIER voidMethodDeclaratorRest ) | modifier ( IDENTIFIER formalParameters )=> IDENTIFIER formalParameters constructorBody -> ^( CONSTR modifier IDENTIFIER ( formalParameters )? ( constructorBody )? ) )
            int alt6=3;
            try { dbg.enterDecision(6);

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

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:85:9: ( modifier type -> modifier type ) ( methodDeclaration[$modifier.pub, $type.t] -> ^( METHOD $memberDeclaration methodDeclaration ) | fieldDeclaration[(CommonTree)$modifier.tree, (CommonTree)$type.tree, $modifier.pub, $type.t] -> fieldDeclaration )
                    {
                    dbg.location(85,9);
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:85:9: ( modifier type -> modifier type )
                    dbg.enterAlt(1);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:85:10: modifier type
                    {
                    dbg.location(85,10);
                    pushFollow(FOLLOW_modifier_in_memberDeclaration332);
                    modifier15=modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_modifier.add(modifier15.getTree());
                    dbg.location(85,19);
                    pushFollow(FOLLOW_type_in_memberDeclaration334);
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
                    // 85:24: -> modifier type
                    {
                        dbg.location(85,27);
                        adaptor.addChild(root_0, stream_modifier.nextTree());
                        dbg.location(85,36);
                        adaptor.addChild(root_0, stream_type.nextTree());

                    }

                    retval.tree = root_0;}
                    }

                    dbg.location(86,7);
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:86:7: ( methodDeclaration[$modifier.pub, $type.t] -> ^( METHOD $memberDeclaration methodDeclaration ) | fieldDeclaration[(CommonTree)$modifier.tree, (CommonTree)$type.tree, $modifier.pub, $type.t] -> fieldDeclaration )
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

                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:86:9: methodDeclaration[$modifier.pub, $type.t]
                            {
                            dbg.location(86,9);
                            pushFollow(FOLLOW_methodDeclaration_in_memberDeclaration351);
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
                            // 86:51: -> ^( METHOD $memberDeclaration methodDeclaration )
                            {
                                dbg.location(86,54);
                                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:86:54: ^( METHOD $memberDeclaration methodDeclaration )
                                {
                                Object root_1 = (Object)adaptor.nil();
                                dbg.location(86,56);
                                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(METHOD, "METHOD"), root_1);

                                dbg.location(86,63);
                                adaptor.addChild(root_1, stream_retval.nextTree());
                                dbg.location(86,82);
                                adaptor.addChild(root_1, stream_methodDeclaration.nextTree());

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;}
                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:87:9: fieldDeclaration[(CommonTree)$modifier.tree, (CommonTree)$type.tree, $modifier.pub, $type.t]
                            {
                            dbg.location(87,9);
                            pushFollow(FOLLOW_fieldDeclaration_in_memberDeclaration373);
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
                            // 87:102: -> fieldDeclaration
                            {
                                dbg.location(87,105);
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

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:90:9: modifier VOID IDENTIFIER voidMethodDeclaratorRest[$modifier.pub, VoidType.TYPE, $IDENTIFIER.text]
                    {
                    dbg.location(90,9);
                    pushFollow(FOLLOW_modifier_in_memberDeclaration404);
                    modifier19=modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_modifier.add(modifier19.getTree());
                    dbg.location(90,18);
                    VOID20=(Token)match(input,VOID,FOLLOW_VOID_in_memberDeclaration406); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VOID.add(VOID20);

                    dbg.location(90,23);
                    IDENTIFIER21=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_memberDeclaration408); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER21);

                    dbg.location(90,34);
                    pushFollow(FOLLOW_voidMethodDeclaratorRest_in_memberDeclaration410);
                    voidMethodDeclaratorRest22=voidMethodDeclaratorRest((modifier19!=null?modifier19.pub:false), VoidType.TYPE, (IDENTIFIER21!=null?IDENTIFIER21.getText():null));

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_voidMethodDeclaratorRest.add(voidMethodDeclaratorRest22.getTree());


                    // AST REWRITE
                    // elements: modifier, voidMethodDeclaratorRest, IDENTIFIER, VOID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 91:6: -> ^( METHOD modifier VOID IDENTIFIER voidMethodDeclaratorRest )
                    {
                        dbg.location(91,9);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:91:9: ^( METHOD modifier VOID IDENTIFIER voidMethodDeclaratorRest )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(91,11);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(METHOD, "METHOD"), root_1);

                        dbg.location(91,18);
                        adaptor.addChild(root_1, stream_modifier.nextTree());
                        dbg.location(91,27);
                        adaptor.addChild(root_1, stream_VOID.nextNode());
                        dbg.location(91,32);
                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        dbg.location(91,43);
                        adaptor.addChild(root_1, stream_voidMethodDeclaratorRest.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:93:9: modifier ( IDENTIFIER formalParameters )=> IDENTIFIER formalParameters constructorBody
                    {
                    dbg.location(93,9);
                    pushFollow(FOLLOW_modifier_in_memberDeclaration447);
                    modifier23=modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_modifier.add(modifier23.getTree());
                    dbg.location(93,51);
                    IDENTIFIER24=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_memberDeclaration457); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER24);

                    dbg.location(93,62);
                    pushFollow(FOLLOW_formalParameters_in_memberDeclaration459);
                    formalParameters25=formalParameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formalParameters.add(formalParameters25.getTree());
                    dbg.location(93,79);
                    pushFollow(FOLLOW_constructorBody_in_memberDeclaration461);
                    constructorBody26=constructorBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_constructorBody.add(constructorBody26.getTree());
                    dbg.location(94,6);
                    if ( state.backtracking==0 ) {
                       rt.addConstructor((modifier23!=null?modifier23.pub:false), (formalParameters25!=null?formalParameters25.args:null)); 
                    }


                    // AST REWRITE
                    // elements: IDENTIFIER, formalParameters, modifier, constructorBody
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 95:6: -> ^( CONSTR modifier IDENTIFIER ( formalParameters )? ( constructorBody )? )
                    {
                        dbg.location(95,9);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:95:9: ^( CONSTR modifier IDENTIFIER ( formalParameters )? ( constructorBody )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(95,11);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONSTR, "CONSTR"), root_1);

                        dbg.location(95,18);
                        adaptor.addChild(root_1, stream_modifier.nextTree());
                        dbg.location(95,27);
                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        dbg.location(95,38);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:95:38: ( formalParameters )?
                        if ( stream_formalParameters.hasNext() ) {
                            dbg.location(95,38);
                            adaptor.addChild(root_1, stream_formalParameters.nextTree());

                        }
                        stream_formalParameters.reset();
                        dbg.location(95,56);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:95:56: ( constructorBody )?
                        if ( stream_constructorBody.hasNext() ) {
                            dbg.location(95,56);
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
        dbg.location(96, 5);

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:98:1: methodDeclaration[boolean pub, Type t] : IDENTIFIER formalParameters methodBody ;
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
        dbg.location(98, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:99:5: ( IDENTIFIER formalParameters methodBody )
            dbg.enterAlt(1);

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:99:9: IDENTIFIER formalParameters methodBody
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(99,9);
            IDENTIFIER27=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_methodDeclaration510); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER27_tree = (Object)adaptor.create(IDENTIFIER27);
            adaptor.addChild(root_0, IDENTIFIER27_tree);
            }
            dbg.location(99,20);
            pushFollow(FOLLOW_formalParameters_in_methodDeclaration512);
            formalParameters28=formalParameters();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, formalParameters28.getTree());
            dbg.location(99,37);
            pushFollow(FOLLOW_methodBody_in_methodDeclaration514);
            methodBody29=methodBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, methodBody29.getTree());
            dbg.location(99,48);
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
        dbg.location(101, 5);

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:103:1: fieldDeclaration[CommonTree mod, CommonTree typ, boolean pub, Type t] : v1= variableDeclarator[$typ] ( ',' v2= variableDeclarator[$typ] )* ';' -> ( ^( FIELD variableDeclarator ) )+ ;
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
        dbg.location(103, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:104:5: (v1= variableDeclarator[$typ] ( ',' v2= variableDeclarator[$typ] )* ';' -> ( ^( FIELD variableDeclarator ) )+ )
            dbg.enterAlt(1);

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:104:9: v1= variableDeclarator[$typ] ( ',' v2= variableDeclarator[$typ] )* ';'
            {
            dbg.location(104,11);
            pushFollow(FOLLOW_variableDeclarator_in_fieldDeclaration544);
            v1=variableDeclarator(typ);

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variableDeclarator.add(v1.getTree());
            dbg.location(104,42);
            if ( state.backtracking==0 ) {
               rt.addField((v1!=null?v1.varName:null), createArrayType(t, (v1!=null?v1.arrayDim:0)), pub); 
            }
            dbg.location(105,9);
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:105:9: ( ',' v2= variableDeclarator[$typ] )*
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

            	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:105:10: ',' v2= variableDeclarator[$typ]
            	    {
            	    dbg.location(105,10);
            	    char_literal30=(Token)match(input,89,FOLLOW_89_in_fieldDeclaration564); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_89.add(char_literal30);

            	    dbg.location(105,16);
            	    pushFollow(FOLLOW_variableDeclarator_in_fieldDeclaration568);
            	    v2=variableDeclarator(typ);

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_variableDeclarator.add(v2.getTree());
            	    dbg.location(105,42);
            	    if ( state.backtracking==0 ) {
            	       rt.addField((v2!=null?v2.varName:null), createArrayType(t, (v2!=null?v2.arrayDim:0)), pub); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);
            } finally {dbg.exitSubRule(7);}

            dbg.location(106,12);
            char_literal31=(Token)match(input,86,FOLLOW_86_in_fieldDeclaration585); if (state.failed) return retval; 
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
            // 107:9: -> ( ^( FIELD variableDeclarator ) )+
            {
                dbg.location(107,12);
                if ( !(stream_variableDeclarator.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_variableDeclarator.hasNext() ) {
                    dbg.location(107,12);
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:107:12: ^( FIELD variableDeclarator )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    dbg.location(107,14);
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FIELD, "FIELD"), root_1);

                    dbg.location(107,20);
                    adaptor.addChild(root_1, mod);
                    dbg.location(107,27);
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
        dbg.location(108, 5);

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:110:1: voidMethodDeclaratorRest[boolean pub, Type t, String methodName] : formalParameters methodBody ;
    public final JaParser.voidMethodDeclaratorRest_return voidMethodDeclaratorRest(boolean pub, Type t, String methodName) throws RecognitionException {
        JaParser.voidMethodDeclaratorRest_return retval = new JaParser.voidMethodDeclaratorRest_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.formalParameters_return formalParameters32 = null;

        JaParser.methodBody_return methodBody33 = null;



        try { dbg.enterRule(getGrammarFileName(), "voidMethodDeclaratorRest");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(110, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:111:5: ( formalParameters methodBody )
            dbg.enterAlt(1);

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:111:7: formalParameters methodBody
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(111,7);
            pushFollow(FOLLOW_formalParameters_in_voidMethodDeclaratorRest628);
            formalParameters32=formalParameters();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, formalParameters32.getTree());
            dbg.location(111,24);
            pushFollow(FOLLOW_methodBody_in_voidMethodDeclaratorRest630);
            methodBody33=methodBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, methodBody33.getTree());
            dbg.location(111,35);
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
        dbg.location(112, 5);

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:114:1: variableDeclarator[CommonTree typ] returns [String varName, int arrayDim] : variableDeclaratorId[$typ] ( '=' variableInitializer )? ;
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
        dbg.location(114, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:115:5: ( variableDeclaratorId[$typ] ( '=' variableInitializer )? )
            dbg.enterAlt(1);

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:115:9: variableDeclaratorId[$typ] ( '=' variableInitializer )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(115,9);
            pushFollow(FOLLOW_variableDeclaratorId_in_variableDeclarator656);
            variableDeclaratorId34=variableDeclaratorId(typ);

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaratorId34.getTree());
            dbg.location(115,36);
            if ( state.backtracking==0 ) {
               retval.varName = (variableDeclaratorId34!=null?input.toString(variableDeclaratorId34.start,variableDeclaratorId34.stop):null); retval.arrayDim = (variableDeclaratorId34!=null?variableDeclaratorId34.arrayDim:0); 
            }
            dbg.location(115,123);
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:115:123: ( '=' variableInitializer )?
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

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:115:124: '=' variableInitializer
                    {
                    dbg.location(115,127);
                    char_literal35=(Token)match(input,EQ,FOLLOW_EQ_in_variableDeclarator662); if (state.failed) return retval;
                    dbg.location(115,129);
                    pushFollow(FOLLOW_variableInitializer_in_variableDeclarator665);
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
        dbg.location(116, 5);

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:118:1: variableDeclaratorId[CommonTree typ] returns [int arrayDim] : ( IDENTIFIER ->) (l+= '[' ']' -> ^( ARRAYTYPE $variableDeclaratorId) )* -> $variableDeclaratorId IDENTIFIER ;
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
        dbg.location(118, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:119:5: ( ( IDENTIFIER ->) (l+= '[' ']' -> ^( ARRAYTYPE $variableDeclaratorId) )* -> $variableDeclaratorId IDENTIFIER )
            dbg.enterAlt(1);

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:119:9: ( IDENTIFIER ->) (l+= '[' ']' -> ^( ARRAYTYPE $variableDeclaratorId) )*
            {
            dbg.location(119,9);
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:119:9: ( IDENTIFIER ->)
            dbg.enterAlt(1);

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:119:10: IDENTIFIER
            {
            dbg.location(119,10);
            IDENTIFIER37=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variableDeclaratorId698); if (state.failed) return retval; 
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
            // 119:21: ->
            {
                dbg.location(119,24);
                adaptor.addChild(root_0, typ);

            }

            retval.tree = root_0;}
            }

            dbg.location(119,32);
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:119:32: (l+= '[' ']' -> ^( ARRAYTYPE $variableDeclaratorId) )*
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

            	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:119:34: l+= '[' ']'
            	    {
            	    dbg.location(119,35);
            	    l=(Token)match(input,90,FOLLOW_90_in_variableDeclaratorId709); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_90.add(l);

            	    if (list_l==null) list_l=new ArrayList();
            	    list_l.add(l);

            	    dbg.location(119,41);
            	    char_literal38=(Token)match(input,91,FOLLOW_91_in_variableDeclaratorId711); if (state.failed) return retval; 
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
            	    // 119:45: -> ^( ARRAYTYPE $variableDeclaratorId)
            	    {
            	        dbg.location(119,48);
            	        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:119:48: ^( ARRAYTYPE $variableDeclaratorId)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        dbg.location(119,50);
            	        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAYTYPE, "ARRAYTYPE"), root_1);

            	        dbg.location(119,60);
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

            dbg.location(120,6);
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
            // 121:6: -> $variableDeclaratorId IDENTIFIER
            {
                dbg.location(121,10);
                adaptor.addChild(root_0, stream_retval.nextTree());
                dbg.location(121,32);
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
        dbg.location(122, 5);

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:124:1: variableInitializer : ( arrayInitializer | expression );
    public final JaParser.variableInitializer_return variableInitializer() throws RecognitionException {
        JaParser.variableInitializer_return retval = new JaParser.variableInitializer_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.arrayInitializer_return arrayInitializer39 = null;

        JaParser.expression_return expression40 = null;



        try { dbg.enterRule(getGrammarFileName(), "variableInitializer");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(124, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:125:5: ( arrayInitializer | expression )
            int alt10=2;
            try { dbg.enterDecision(10);

            int LA10_0 = input.LA(1);

            if ( (LA10_0==87) ) {
                alt10=1;
            }
            else if ( (LA10_0==IDENTIFIER||LA10_0==VOID||(LA10_0>=CHAR && LA10_0<=NULLLITERAL)||LA10_0==NEW||(LA10_0>=PLUS && LA10_0<=MINUS)||LA10_0==92||(LA10_0>=104 && LA10_0<=106)) ) {
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

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:125:9: arrayInitializer
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(125,9);
                    pushFollow(FOLLOW_arrayInitializer_in_variableInitializer764);
                    arrayInitializer39=arrayInitializer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayInitializer39.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:126:9: expression
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(126,9);
                    pushFollow(FOLLOW_expression_in_variableInitializer774);
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
        dbg.location(127, 5);

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:129:1: arrayInitializer : '{' ( variableInitializer ( ',' variableInitializer )* ( ',' )? )? '}' -> ^( ARRAYINIT variableInitializer ( variableInitializer )* ) ;
    public final JaParser.arrayInitializer_return arrayInitializer() throws RecognitionException {
        JaParser.arrayInitializer_return retval = new JaParser.arrayInitializer_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal41=null;
        Token char_literal43=null;
        Token char_literal45=null;
        Token char_literal46=null;
        JaParser.variableInitializer_return variableInitializer42 = null;

        JaParser.variableInitializer_return variableInitializer44 = null;


        Object char_literal41_tree=null;
        Object char_literal43_tree=null;
        Object char_literal45_tree=null;
        Object char_literal46_tree=null;
        RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
        RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");
        RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
        RewriteRuleSubtreeStream stream_variableInitializer=new RewriteRuleSubtreeStream(adaptor,"rule variableInitializer");
        try { dbg.enterRule(getGrammarFileName(), "arrayInitializer");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(129, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:130:5: ( '{' ( variableInitializer ( ',' variableInitializer )* ( ',' )? )? '}' -> ^( ARRAYINIT variableInitializer ( variableInitializer )* ) )
            dbg.enterAlt(1);

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:130:9: '{' ( variableInitializer ( ',' variableInitializer )* ( ',' )? )? '}'
            {
            dbg.location(130,9);
            char_literal41=(Token)match(input,87,FOLLOW_87_in_arrayInitializer801); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_87.add(char_literal41);

            dbg.location(130,13);
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:130:13: ( variableInitializer ( ',' variableInitializer )* ( ',' )? )?
            int alt13=2;
            try { dbg.enterSubRule(13);
            try { dbg.enterDecision(13);

            int LA13_0 = input.LA(1);

            if ( (LA13_0==IDENTIFIER||LA13_0==VOID||(LA13_0>=CHAR && LA13_0<=NULLLITERAL)||LA13_0==NEW||(LA13_0>=PLUS && LA13_0<=MINUS)||LA13_0==87||LA13_0==92||(LA13_0>=104 && LA13_0<=106)) ) {
                alt13=1;
            }
            } finally {dbg.exitDecision(13);}

            switch (alt13) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:130:14: variableInitializer ( ',' variableInitializer )* ( ',' )?
                    {
                    dbg.location(130,14);
                    pushFollow(FOLLOW_variableInitializer_in_arrayInitializer804);
                    variableInitializer42=variableInitializer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_variableInitializer.add(variableInitializer42.getTree());
                    dbg.location(130,34);
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:130:34: ( ',' variableInitializer )*
                    try { dbg.enterSubRule(11);

                    loop11:
                    do {
                        int alt11=2;
                        try { dbg.enterDecision(11);

                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==89) ) {
                            int LA11_1 = input.LA(2);

                            if ( (LA11_1==IDENTIFIER||LA11_1==VOID||(LA11_1>=CHAR && LA11_1<=NULLLITERAL)||LA11_1==NEW||(LA11_1>=PLUS && LA11_1<=MINUS)||LA11_1==87||LA11_1==92||(LA11_1>=104 && LA11_1<=106)) ) {
                                alt11=1;
                            }


                        }


                        } finally {dbg.exitDecision(11);}

                        switch (alt11) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:130:35: ',' variableInitializer
                    	    {
                    	    dbg.location(130,35);
                    	    char_literal43=(Token)match(input,89,FOLLOW_89_in_arrayInitializer807); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_89.add(char_literal43);

                    	    dbg.location(130,39);
                    	    pushFollow(FOLLOW_variableInitializer_in_arrayInitializer809);
                    	    variableInitializer44=variableInitializer();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_variableInitializer.add(variableInitializer44.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(11);}

                    dbg.location(130,61);
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:130:61: ( ',' )?
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

                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:130:62: ','
                            {
                            dbg.location(130,62);
                            char_literal45=(Token)match(input,89,FOLLOW_89_in_arrayInitializer814); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_89.add(char_literal45);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(12);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(13);}

            dbg.location(130,71);
            char_literal46=(Token)match(input,88,FOLLOW_88_in_arrayInitializer821); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_88.add(char_literal46);



            // AST REWRITE
            // elements: variableInitializer, variableInitializer
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 130:75: -> ^( ARRAYINIT variableInitializer ( variableInitializer )* )
            {
                dbg.location(130,78);
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:130:78: ^( ARRAYINIT variableInitializer ( variableInitializer )* )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(130,80);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAYINIT, "ARRAYINIT"), root_1);

                dbg.location(130,90);
                adaptor.addChild(root_1, stream_variableInitializer.nextTree());
                dbg.location(130,110);
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:130:110: ( variableInitializer )*
                while ( stream_variableInitializer.hasNext() ) {
                    dbg.location(130,111);
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
        dbg.location(131, 5);

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:133:1: modifier returns [boolean pub] : ( PUBLIC | PRIVATE );
    public final JaParser.modifier_return modifier() throws RecognitionException {
        JaParser.modifier_return retval = new JaParser.modifier_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PUBLIC47=null;
        Token PRIVATE48=null;

        Object PUBLIC47_tree=null;
        Object PRIVATE48_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "modifier");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(133, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:134:5: ( PUBLIC | PRIVATE )
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

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:134:9: PUBLIC
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(134,9);
                    PUBLIC47=(Token)match(input,PUBLIC,FOLLOW_PUBLIC_in_modifier858); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PUBLIC47_tree = (Object)adaptor.create(PUBLIC47);
                    adaptor.addChild(root_0, PUBLIC47_tree);
                    }
                    dbg.location(134,17);
                    if ( state.backtracking==0 ) {
                       retval.pub = true;  
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:135:9: PRIVATE
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(135,9);
                    PRIVATE48=(Token)match(input,PRIVATE,FOLLOW_PRIVATE_in_modifier871); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PRIVATE48_tree = (Object)adaptor.create(PRIVATE48);
                    adaptor.addChild(root_0, PRIVATE48_tree);
                    }
                    dbg.location(135,17);
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
        dbg.location(136, 5);

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:138:1: typeName : IDENTIFIER ;
    public final JaParser.typeName_return typeName() throws RecognitionException {
        JaParser.typeName_return retval = new JaParser.typeName_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENTIFIER49=null;

        Object IDENTIFIER49_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "typeName");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(138, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:139:5: ( IDENTIFIER )
            dbg.enterAlt(1);

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:139:9: IDENTIFIER
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(139,9);
            IDENTIFIER49=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_typeName892); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER49_tree = (Object)adaptor.create(IDENTIFIER49);
            adaptor.addChild(root_0, IDENTIFIER49_tree);
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
        dbg.location(140, 5);

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
        public Type t;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:142:1: type returns [Type t] : ( nonPrimitiveType | primitiveType );
    public final JaParser.type_return type() throws RecognitionException {
        JaParser.type_return retval = new JaParser.type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.nonPrimitiveType_return nonPrimitiveType50 = null;

        JaParser.primitiveType_return primitiveType51 = null;



        try { dbg.enterRule(getGrammarFileName(), "type");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(142, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:143:5: ( nonPrimitiveType | primitiveType )
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

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:143:7: nonPrimitiveType
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(143,7);
                    pushFollow(FOLLOW_nonPrimitiveType_in_type913);
                    nonPrimitiveType50=nonPrimitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nonPrimitiveType50.getTree());
                    dbg.location(143,24);
                    if ( state.backtracking==0 ) {
                       retval.t = (nonPrimitiveType50!=null?nonPrimitiveType50.t:null); 
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:144:7: primitiveType
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(144,7);
                    pushFollow(FOLLOW_primitiveType_in_type923);
                    primitiveType51=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType51.getTree());
                    dbg.location(144,23);
                    if ( state.backtracking==0 ) {
                       retval.t = (primitiveType51!=null?primitiveType51.bs:null);   
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
        dbg.location(145, 5);

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:147:1: nonPrimitiveType returns [ComplexType t] : ( ( classType -> classType ) (l+= '[' ']' -> ^( ARRAYTYPE $nonPrimitiveType) )* | ( primitiveType -> primitiveType ) (l+= '[' ']' -> ^( ARRAYTYPE $nonPrimitiveType) )+ );
    public final JaParser.nonPrimitiveType_return nonPrimitiveType() throws RecognitionException {
        JaParser.nonPrimitiveType_return retval = new JaParser.nonPrimitiveType_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal53=null;
        Token char_literal55=null;
        Token l=null;
        List list_l=null;
        JaParser.classType_return classType52 = null;

        JaParser.primitiveType_return primitiveType54 = null;


        Object char_literal53_tree=null;
        Object char_literal55_tree=null;
        Object l_tree=null;
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleSubtreeStream stream_primitiveType=new RewriteRuleSubtreeStream(adaptor,"rule primitiveType");
        RewriteRuleSubtreeStream stream_classType=new RewriteRuleSubtreeStream(adaptor,"rule classType");
        try { dbg.enterRule(getGrammarFileName(), "nonPrimitiveType");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(147, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:148:5: ( ( classType -> classType ) (l+= '[' ']' -> ^( ARRAYTYPE $nonPrimitiveType) )* | ( primitiveType -> primitiveType ) (l+= '[' ']' -> ^( ARRAYTYPE $nonPrimitiveType) )+ )
            int alt18=2;
            try { dbg.enterDecision(18);

            int LA18_0 = input.LA(1);

            if ( (LA18_0==IDENTIFIER) ) {
                alt18=1;
            }
            else if ( ((LA18_0>=CHAR && LA18_0<=DOUBLE)) ) {
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

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:148:7: ( classType -> classType ) (l+= '[' ']' -> ^( ARRAYTYPE $nonPrimitiveType) )*
                    {
                    dbg.location(148,7);
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:148:7: ( classType -> classType )
                    dbg.enterAlt(1);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:148:8: classType
                    {
                    dbg.location(148,8);
                    pushFollow(FOLLOW_classType_in_nonPrimitiveType950);
                    classType52=classType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_classType.add(classType52.getTree());


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
                    // 148:22: -> classType
                    {
                        dbg.location(148,25);
                        adaptor.addChild(root_0, stream_classType.nextTree());

                    }

                    retval.tree = root_0;}
                    }

                    dbg.location(148,40);
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:148:40: (l+= '[' ']' -> ^( ARRAYTYPE $nonPrimitiveType) )*
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

                    	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:148:42: l+= '[' ']'
                    	    {
                    	    dbg.location(148,43);
                    	    l=(Token)match(input,90,FOLLOW_90_in_nonPrimitiveType969); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_90.add(l);

                    	    if (list_l==null) list_l=new ArrayList();
                    	    list_l.add(l);

                    	    dbg.location(148,49);
                    	    char_literal53=(Token)match(input,91,FOLLOW_91_in_nonPrimitiveType971); if (state.failed) return retval; 
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
                    	    // 148:53: -> ^( ARRAYTYPE $nonPrimitiveType)
                    	    {
                    	        dbg.location(148,56);
                    	        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:148:56: ^( ARRAYTYPE $nonPrimitiveType)
                    	        {
                    	        Object root_1 = (Object)adaptor.nil();
                    	        dbg.location(148,58);
                    	        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAYTYPE, "ARRAYTYPE"), root_1);

                    	        dbg.location(148,68);
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

                    dbg.location(149,2);
                    if ( state.backtracking==0 ) {
                       if(list_l != null) retval.t = (ComplexType)createArrayType((classType52!=null?classType52.t:null),      list_l.size()); 
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:151:7: ( primitiveType -> primitiveType ) (l+= '[' ']' -> ^( ARRAYTYPE $nonPrimitiveType) )+
                    {
                    dbg.location(151,7);
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:151:7: ( primitiveType -> primitiveType )
                    dbg.enterAlt(1);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:151:8: primitiveType
                    {
                    dbg.location(151,8);
                    pushFollow(FOLLOW_primitiveType_in_nonPrimitiveType1000);
                    primitiveType54=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primitiveType.add(primitiveType54.getTree());


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
                    // 151:22: -> primitiveType
                    {
                        dbg.location(151,25);
                        adaptor.addChild(root_0, stream_primitiveType.nextTree());

                    }

                    retval.tree = root_0;}
                    }

                    dbg.location(151,40);
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:151:40: (l+= '[' ']' -> ^( ARRAYTYPE $nonPrimitiveType) )+
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

                    	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:151:42: l+= '[' ']'
                    	    {
                    	    dbg.location(151,43);
                    	    l=(Token)match(input,90,FOLLOW_90_in_nonPrimitiveType1011); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_90.add(l);

                    	    if (list_l==null) list_l=new ArrayList();
                    	    list_l.add(l);

                    	    dbg.location(151,49);
                    	    char_literal55=(Token)match(input,91,FOLLOW_91_in_nonPrimitiveType1013); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_91.add(char_literal55);



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
                    	    // 151:53: -> ^( ARRAYTYPE $nonPrimitiveType)
                    	    {
                    	        dbg.location(151,56);
                    	        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:151:56: ^( ARRAYTYPE $nonPrimitiveType)
                    	        {
                    	        Object root_1 = (Object)adaptor.nil();
                    	        dbg.location(151,58);
                    	        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAYTYPE, "ARRAYTYPE"), root_1);

                    	        dbg.location(151,68);
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

                    dbg.location(152,2);
                    if ( state.backtracking==0 ) {
                       if(list_l != null) retval.t = (ComplexType)createArrayType((primitiveType54!=null?primitiveType54.bs:null), list_l.size()); 
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
        dbg.location(153, 5);

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:155:1: classType returns [ReferenceType t] : IDENTIFIER ;
    public final JaParser.classType_return classType() throws RecognitionException {
        JaParser.classType_return retval = new JaParser.classType_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENTIFIER56=null;

        Object IDENTIFIER56_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "classType");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(155, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:156:5: ( IDENTIFIER )
            dbg.enterAlt(1);

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:156:7: IDENTIFIER
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(156,7);
            IDENTIFIER56=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classType1050); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER56_tree = (Object)adaptor.create(IDENTIFIER56);
            adaptor.addChild(root_0, IDENTIFIER56_tree);
            }
            dbg.location(156,18);
            if ( state.backtracking==0 ) {
               if(cTab.containsKey((IDENTIFIER56!=null?IDENTIFIER56.getText():null))) {
                      	     	retval.t = cTab.get((IDENTIFIER56!=null?IDENTIFIER56.getText():null));
                     		     } else {
              		     	retval.t = new ReferenceType((IDENTIFIER56!=null?IDENTIFIER56.getText():null));
              			cTab.put((IDENTIFIER56!=null?IDENTIFIER56.getText():null), retval.t);
              			todo.add((IDENTIFIER56!=null?IDENTIFIER56.getText():null));	
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
        dbg.location(164, 5);

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:166:1: primitiveType returns [BasicType bs] : ( CHAR | BYTE | SHORT | INT | LONG | FLOAT | DOUBLE );
    public final JaParser.primitiveType_return primitiveType() throws RecognitionException {
        JaParser.primitiveType_return retval = new JaParser.primitiveType_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CHAR57=null;
        Token BYTE58=null;
        Token SHORT59=null;
        Token INT60=null;
        Token LONG61=null;
        Token FLOAT62=null;
        Token DOUBLE63=null;

        Object CHAR57_tree=null;
        Object BYTE58_tree=null;
        Object SHORT59_tree=null;
        Object INT60_tree=null;
        Object LONG61_tree=null;
        Object FLOAT62_tree=null;
        Object DOUBLE63_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "primitiveType");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(166, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:167:5: ( CHAR | BYTE | SHORT | INT | LONG | FLOAT | DOUBLE )
            int alt19=7;
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

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:167:9: CHAR
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(167,9);
                    CHAR57=(Token)match(input,CHAR,FOLLOW_CHAR_in_primitiveType1075); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CHAR57_tree = (Object)adaptor.create(CHAR57);
                    adaptor.addChild(root_0, CHAR57_tree);
                    }
                    dbg.location(167,16);
                    if ( state.backtracking==0 ) {
                       retval.bs = BasicType.CHAR;   
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:168:9: BYTE
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(168,9);
                    BYTE58=(Token)match(input,BYTE,FOLLOW_BYTE_in_primitiveType1089); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BYTE58_tree = (Object)adaptor.create(BYTE58);
                    adaptor.addChild(root_0, BYTE58_tree);
                    }
                    dbg.location(168,16);
                    if ( state.backtracking==0 ) {
                       retval.bs = BasicType.BYTE;   
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:169:9: SHORT
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(169,9);
                    SHORT59=(Token)match(input,SHORT,FOLLOW_SHORT_in_primitiveType1103); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SHORT59_tree = (Object)adaptor.create(SHORT59);
                    adaptor.addChild(root_0, SHORT59_tree);
                    }
                    dbg.location(169,16);
                    if ( state.backtracking==0 ) {
                       retval.bs = BasicType.SHORT;  
                    }

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:170:9: INT
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(170,9);
                    INT60=(Token)match(input,INT,FOLLOW_INT_in_primitiveType1116); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT60_tree = (Object)adaptor.create(INT60);
                    adaptor.addChild(root_0, INT60_tree);
                    }
                    dbg.location(170,16);
                    if ( state.backtracking==0 ) {
                       retval.bs = BasicType.INT;    
                    }

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:171:9: LONG
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(171,9);
                    LONG61=(Token)match(input,LONG,FOLLOW_LONG_in_primitiveType1131); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LONG61_tree = (Object)adaptor.create(LONG61);
                    adaptor.addChild(root_0, LONG61_tree);
                    }
                    dbg.location(171,16);
                    if ( state.backtracking==0 ) {
                       retval.bs = BasicType.LONG;   
                    }

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:172:9: FLOAT
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(172,9);
                    FLOAT62=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_primitiveType1145); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FLOAT62_tree = (Object)adaptor.create(FLOAT62);
                    adaptor.addChild(root_0, FLOAT62_tree);
                    }
                    dbg.location(172,16);
                    if ( state.backtracking==0 ) {
                       retval.bs = BasicType.FLOAT;  
                    }

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:173:9: DOUBLE
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(173,9);
                    DOUBLE63=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_primitiveType1158); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOUBLE63_tree = (Object)adaptor.create(DOUBLE63);
                    adaptor.addChild(root_0, DOUBLE63_tree);
                    }
                    dbg.location(173,16);
                    if ( state.backtracking==0 ) {
                       retval.bs = BasicType.DOUBLE; 
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
        dbg.location(174, 5);

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:176:1: formalParameters returns [ArrayList<Type> args] : '(' ( formalParameterDecls[args] )? ')' -> {$formalParameterDecls.tree != null}? ^( FPARMS ( formalParameterDecls )? ) ->;
    public final JaParser.formalParameters_return formalParameters() throws RecognitionException {
        JaParser.formalParameters_return retval = new JaParser.formalParameters_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal64=null;
        Token char_literal66=null;
        JaParser.formalParameterDecls_return formalParameterDecls65 = null;


        Object char_literal64_tree=null;
        Object char_literal66_tree=null;
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleSubtreeStream stream_formalParameterDecls=new RewriteRuleSubtreeStream(adaptor,"rule formalParameterDecls");

        	ArrayList<Type> args = new ArrayList<Type>();

        try { dbg.enterRule(getGrammarFileName(), "formalParameters");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(176, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:180:5: ( '(' ( formalParameterDecls[args] )? ')' -> {$formalParameterDecls.tree != null}? ^( FPARMS ( formalParameterDecls )? ) ->)
            dbg.enterAlt(1);

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:180:9: '(' ( formalParameterDecls[args] )? ')'
            {
            dbg.location(180,9);
            char_literal64=(Token)match(input,92,FOLLOW_92_in_formalParameters1192); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_92.add(char_literal64);

            dbg.location(180,13);
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:180:13: ( formalParameterDecls[args] )?
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

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:180:13: formalParameterDecls[args]
                    {
                    dbg.location(180,13);
                    pushFollow(FOLLOW_formalParameterDecls_in_formalParameters1194);
                    formalParameterDecls65=formalParameterDecls(args);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formalParameterDecls.add(formalParameterDecls65.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(20);}

            dbg.location(180,41);
            char_literal66=(Token)match(input,93,FOLLOW_93_in_formalParameters1198); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_93.add(char_literal66);

            dbg.location(180,45);
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
            // 180:61: -> {$formalParameterDecls.tree != null}? ^( FPARMS ( formalParameterDecls )? )
            if ((formalParameterDecls65!=null?((Object)formalParameterDecls65.tree):null) != null) {
                dbg.location(180,102);
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:180:102: ^( FPARMS ( formalParameterDecls )? )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(180,104);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FPARMS, "FPARMS"), root_1);

                dbg.location(180,111);
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:180:111: ( formalParameterDecls )?
                if ( stream_formalParameterDecls.hasNext() ) {
                    dbg.location(180,111);
                    adaptor.addChild(root_1, stream_formalParameterDecls.nextTree());

                }
                stream_formalParameterDecls.reset();

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 181:16: ->
            {
                dbg.location(182,5);
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
        dbg.location(182, 5);

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:184:1: formalParameterDecls[ArrayList<Type> args] : ( type variableDeclaratorId[(CommonTree)$type.tree] ( ',' formalParameterDecls[args] )? -> ^( FPARM variableDeclaratorId ) ( formalParameterDecls )? | type '...' variableDeclaratorId[(CommonTree)$type.tree] -> ^( FMULTPARM variableDeclaratorId ) );
    public final JaParser.formalParameterDecls_return formalParameterDecls(ArrayList<Type> args) throws RecognitionException {
        JaParser.formalParameterDecls_return retval = new JaParser.formalParameterDecls_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal69=null;
        Token string_literal72=null;
        JaParser.type_return type67 = null;

        JaParser.variableDeclaratorId_return variableDeclaratorId68 = null;

        JaParser.formalParameterDecls_return formalParameterDecls70 = null;

        JaParser.type_return type71 = null;

        JaParser.variableDeclaratorId_return variableDeclaratorId73 = null;


        Object char_literal69_tree=null;
        Object string_literal72_tree=null;
        RewriteRuleTokenStream stream_94=new RewriteRuleTokenStream(adaptor,"token 94");
        RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
        RewriteRuleSubtreeStream stream_variableDeclaratorId=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaratorId");
        RewriteRuleSubtreeStream stream_formalParameterDecls=new RewriteRuleSubtreeStream(adaptor,"rule formalParameterDecls");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try { dbg.enterRule(getGrammarFileName(), "formalParameterDecls");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(184, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:185:5: ( type variableDeclaratorId[(CommonTree)$type.tree] ( ',' formalParameterDecls[args] )? -> ^( FPARM variableDeclaratorId ) ( formalParameterDecls )? | type '...' variableDeclaratorId[(CommonTree)$type.tree] -> ^( FMULTPARM variableDeclaratorId ) )
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

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:185:7: type variableDeclaratorId[(CommonTree)$type.tree] ( ',' formalParameterDecls[args] )?
                    {
                    dbg.location(185,7);
                    pushFollow(FOLLOW_type_in_formalParameterDecls1251);
                    type67=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type67.getTree());
                    dbg.location(185,12);
                    pushFollow(FOLLOW_variableDeclaratorId_in_formalParameterDecls1253);
                    variableDeclaratorId68=variableDeclaratorId((CommonTree)(type67!=null?((Object)type67.tree):null));

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_variableDeclaratorId.add(variableDeclaratorId68.getTree());
                    dbg.location(185,57);
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:185:57: ( ',' formalParameterDecls[args] )?
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

                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:185:58: ',' formalParameterDecls[args]
                            {
                            dbg.location(185,58);
                            char_literal69=(Token)match(input,89,FOLLOW_89_in_formalParameterDecls1257); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_89.add(char_literal69);

                            dbg.location(185,62);
                            pushFollow(FOLLOW_formalParameterDecls_in_formalParameterDecls1259);
                            formalParameterDecls70=formalParameterDecls(args);

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_formalParameterDecls.add(formalParameterDecls70.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(21);}

                    dbg.location(186,6);
                    if ( state.backtracking==0 ) {
                       args.add(createArrayType((type67!=null?type67.t:null), (variableDeclaratorId68!=null?variableDeclaratorId68.arrayDim:0))); 
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
                    // 187:6: -> ^( FPARM variableDeclaratorId ) ( formalParameterDecls )?
                    {
                        dbg.location(187,9);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:187:9: ^( FPARM variableDeclaratorId )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(187,11);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FPARM, "FPARM"), root_1);

                        dbg.location(187,17);
                        adaptor.addChild(root_1, stream_variableDeclaratorId.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }
                        dbg.location(187,39);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:187:39: ( formalParameterDecls )?
                        if ( stream_formalParameterDecls.hasNext() ) {
                            dbg.location(187,39);
                            adaptor.addChild(root_0, stream_formalParameterDecls.nextTree());

                        }
                        stream_formalParameterDecls.reset();

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:189:8: type '...' variableDeclaratorId[(CommonTree)$type.tree]
                    {
                    dbg.location(189,8);
                    pushFollow(FOLLOW_type_in_formalParameterDecls1301);
                    type71=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type71.getTree());
                    dbg.location(189,13);
                    string_literal72=(Token)match(input,94,FOLLOW_94_in_formalParameterDecls1303); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_94.add(string_literal72);

                    dbg.location(189,19);
                    pushFollow(FOLLOW_variableDeclaratorId_in_formalParameterDecls1305);
                    variableDeclaratorId73=variableDeclaratorId((CommonTree)(type71!=null?((Object)type71.tree):null));

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_variableDeclaratorId.add(variableDeclaratorId73.getTree());


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
                    // 189:64: -> ^( FMULTPARM variableDeclaratorId )
                    {
                        dbg.location(189,67);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:189:67: ^( FMULTPARM variableDeclaratorId )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(189,69);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FMULTPARM, "FMULTPARM"), root_1);

                        dbg.location(189,79);
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
        dbg.location(190, 5);

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:192:1: methodBody : block -> ^( MBODY ( block )? ) ;
    public final JaParser.methodBody_return methodBody() throws RecognitionException {
        JaParser.methodBody_return retval = new JaParser.methodBody_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.block_return block74 = null;


        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try { dbg.enterRule(getGrammarFileName(), "methodBody");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(192, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:193:5: ( block -> ^( MBODY ( block )? ) )
            dbg.enterAlt(1);

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:193:9: block
            {
            dbg.location(193,9);
            pushFollow(FOLLOW_block_in_methodBody1337);
            block74=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block74.getTree());


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
            // 193:15: -> ^( MBODY ( block )? )
            {
                dbg.location(193,18);
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:193:18: ^( MBODY ( block )? )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(193,20);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MBODY, "MBODY"), root_1);

                dbg.location(193,26);
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:193:26: ( block )?
                if ( stream_block.hasNext() ) {
                    dbg.location(193,26);
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
        dbg.location(194, 5);

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:196:1: constructorBody : '{' ( explicitConstructorInvocation )? ( blockStatement )* '}' -> ^( CBODY ( explicitConstructorInvocation )? ( blockStatement )* ) ;
    public final JaParser.constructorBody_return constructorBody() throws RecognitionException {
        JaParser.constructorBody_return retval = new JaParser.constructorBody_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal75=null;
        Token char_literal78=null;
        JaParser.explicitConstructorInvocation_return explicitConstructorInvocation76 = null;

        JaParser.blockStatement_return blockStatement77 = null;


        Object char_literal75_tree=null;
        Object char_literal78_tree=null;
        RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
        RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");
        RewriteRuleSubtreeStream stream_blockStatement=new RewriteRuleSubtreeStream(adaptor,"rule blockStatement");
        RewriteRuleSubtreeStream stream_explicitConstructorInvocation=new RewriteRuleSubtreeStream(adaptor,"rule explicitConstructorInvocation");
        try { dbg.enterRule(getGrammarFileName(), "constructorBody");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(196, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:197:5: ( '{' ( explicitConstructorInvocation )? ( blockStatement )* '}' -> ^( CBODY ( explicitConstructorInvocation )? ( blockStatement )* ) )
            dbg.enterAlt(1);

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:197:10: '{' ( explicitConstructorInvocation )? ( blockStatement )* '}'
            {
            dbg.location(197,10);
            char_literal75=(Token)match(input,87,FOLLOW_87_in_constructorBody1366); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_87.add(char_literal75);

            dbg.location(197,14);
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:197:14: ( explicitConstructorInvocation )?
            int alt23=2;
            try { dbg.enterSubRule(23);
            try { dbg.enterDecision(23);

            int LA23_0 = input.LA(1);

            if ( (LA23_0==THIS) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==92) ) {
                    alt23=1;
                }
            }
            else if ( (LA23_0==SUPER) ) {
                int LA23_2 = input.LA(2);

                if ( (LA23_2==92) ) {
                    alt23=1;
                }
            }
            } finally {dbg.exitDecision(23);}

            switch (alt23) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:197:14: explicitConstructorInvocation
                    {
                    dbg.location(197,14);
                    pushFollow(FOLLOW_explicitConstructorInvocation_in_constructorBody1368);
                    explicitConstructorInvocation76=explicitConstructorInvocation();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_explicitConstructorInvocation.add(explicitConstructorInvocation76.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(23);}

            dbg.location(197,45);
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:197:45: ( blockStatement )*
            try { dbg.enterSubRule(24);

            loop24:
            do {
                int alt24=2;
                try { dbg.enterDecision(24);

                int LA24_0 = input.LA(1);

                if ( (LA24_0==IDENTIFIER||LA24_0==VOID||(LA24_0>=CHAR && LA24_0<=RETURN)||LA24_0==NEW||(LA24_0>=PLUS && LA24_0<=MINUS)||(LA24_0>=86 && LA24_0<=87)||LA24_0==92||(LA24_0>=104 && LA24_0<=106)) ) {
                    alt24=1;
                }


                } finally {dbg.exitDecision(24);}

                switch (alt24) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:197:45: blockStatement
            	    {
            	    dbg.location(197,45);
            	    pushFollow(FOLLOW_blockStatement_in_constructorBody1371);
            	    blockStatement77=blockStatement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_blockStatement.add(blockStatement77.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);
            } finally {dbg.exitSubRule(24);}

            dbg.location(197,61);
            char_literal78=(Token)match(input,88,FOLLOW_88_in_constructorBody1374); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_88.add(char_literal78);



            // AST REWRITE
            // elements: explicitConstructorInvocation, blockStatement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 197:65: -> ^( CBODY ( explicitConstructorInvocation )? ( blockStatement )* )
            {
                dbg.location(197,68);
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:197:68: ^( CBODY ( explicitConstructorInvocation )? ( blockStatement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(197,70);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CBODY, "CBODY"), root_1);

                dbg.location(197,76);
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:197:76: ( explicitConstructorInvocation )?
                if ( stream_explicitConstructorInvocation.hasNext() ) {
                    dbg.location(197,76);
                    adaptor.addChild(root_1, stream_explicitConstructorInvocation.nextTree());

                }
                stream_explicitConstructorInvocation.reset();
                dbg.location(197,107);
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:197:107: ( blockStatement )*
                while ( stream_blockStatement.hasNext() ) {
                    dbg.location(197,107);
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
        dbg.location(198, 5);

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:200:1: explicitConstructorInvocation : ( ( THIS -> THIS ) | ( SUPER -> SUPER ) ) arguments ';' -> ^( CONSTRCALL $explicitConstructorInvocation ( arguments )? ) ;
    public final JaParser.explicitConstructorInvocation_return explicitConstructorInvocation() throws RecognitionException {
        JaParser.explicitConstructorInvocation_return retval = new JaParser.explicitConstructorInvocation_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token THIS79=null;
        Token SUPER80=null;
        Token char_literal82=null;
        JaParser.arguments_return arguments81 = null;


        Object THIS79_tree=null;
        Object SUPER80_tree=null;
        Object char_literal82_tree=null;
        RewriteRuleTokenStream stream_SUPER=new RewriteRuleTokenStream(adaptor,"token SUPER");
        RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
        RewriteRuleTokenStream stream_THIS=new RewriteRuleTokenStream(adaptor,"token THIS");
        RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");
        try { dbg.enterRule(getGrammarFileName(), "explicitConstructorInvocation");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(200, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:201:5: ( ( ( THIS -> THIS ) | ( SUPER -> SUPER ) ) arguments ';' -> ^( CONSTRCALL $explicitConstructorInvocation ( arguments )? ) )
            dbg.enterAlt(1);

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:201:9: ( ( THIS -> THIS ) | ( SUPER -> SUPER ) ) arguments ';'
            {
            dbg.location(201,9);
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:201:9: ( ( THIS -> THIS ) | ( SUPER -> SUPER ) )
            int alt25=2;
            try { dbg.enterSubRule(25);
            try { dbg.enterDecision(25);

            int LA25_0 = input.LA(1);

            if ( (LA25_0==THIS) ) {
                alt25=1;
            }
            else if ( (LA25_0==SUPER) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(25);}

            switch (alt25) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:201:10: ( THIS -> THIS )
                    {
                    dbg.location(201,10);
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:201:10: ( THIS -> THIS )
                    dbg.enterAlt(1);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:201:11: THIS
                    {
                    dbg.location(201,11);
                    THIS79=(Token)match(input,THIS,FOLLOW_THIS_in_explicitConstructorInvocation1407); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIS.add(THIS79);



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
                    // 201:16: -> THIS
                    {
                        dbg.location(201,19);
                        adaptor.addChild(root_0, stream_THIS.nextNode());

                    }

                    retval.tree = root_0;}
                    }


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:201:27: ( SUPER -> SUPER )
                    {
                    dbg.location(201,27);
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:201:27: ( SUPER -> SUPER )
                    dbg.enterAlt(1);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:201:28: SUPER
                    {
                    dbg.location(201,28);
                    SUPER80=(Token)match(input,SUPER,FOLLOW_SUPER_in_explicitConstructorInvocation1417); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SUPER.add(SUPER80);



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
                    // 201:34: -> SUPER
                    {
                        dbg.location(201,37);
                        adaptor.addChild(root_0, stream_SUPER.nextNode());

                    }

                    retval.tree = root_0;}
                    }


                    }
                    break;

            }
            } finally {dbg.exitSubRule(25);}

            dbg.location(201,45);
            pushFollow(FOLLOW_arguments_in_explicitConstructorInvocation1425);
            arguments81=arguments();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_arguments.add(arguments81.getTree());
            dbg.location(201,55);
            char_literal82=(Token)match(input,86,FOLLOW_86_in_explicitConstructorInvocation1427); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_86.add(char_literal82);



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
            // 201:59: -> ^( CONSTRCALL $explicitConstructorInvocation ( arguments )? )
            {
                dbg.location(201,62);
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:201:62: ^( CONSTRCALL $explicitConstructorInvocation ( arguments )? )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(201,64);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONSTRCALL, "CONSTRCALL"), root_1);

                dbg.location(201,75);
                adaptor.addChild(root_1, stream_retval.nextTree());
                dbg.location(201,106);
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:201:106: ( arguments )?
                if ( stream_arguments.hasNext() ) {
                    dbg.location(201,106);
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
        dbg.location(203, 5);

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:205:1: literal : ( INTLITERAL | LONGLITERAL | FLOATLITERAL | DOUBLELITERAL | CHARLITERAL | STRINGLITERAL | BOOLEANLITERAL | NULLLITERAL );
    public final JaParser.literal_return literal() throws RecognitionException {
        JaParser.literal_return retval = new JaParser.literal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set83=null;

        Object set83_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "literal");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(205, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:206:5: ( INTLITERAL | LONGLITERAL | FLOATLITERAL | DOUBLELITERAL | CHARLITERAL | STRINGLITERAL | BOOLEANLITERAL | NULLLITERAL )
            dbg.enterAlt(1);

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(206,5);
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
        dbg.location(214, 5);

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:218:1: block : '{' ( blockStatement )* '}' ;
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
        dbg.location(218, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:219:5: ( '{' ( blockStatement )* '}' )
            dbg.enterAlt(1);

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:219:9: '{' ( blockStatement )* '}'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(219,12);
            char_literal84=(Token)match(input,87,FOLLOW_87_in_block1551); if (state.failed) return retval;
            dbg.location(219,14);
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:219:14: ( blockStatement )*
            try { dbg.enterSubRule(26);

            loop26:
            do {
                int alt26=2;
                try { dbg.enterDecision(26);

                int LA26_0 = input.LA(1);

                if ( (LA26_0==IDENTIFIER||LA26_0==VOID||(LA26_0>=CHAR && LA26_0<=RETURN)||LA26_0==NEW||(LA26_0>=PLUS && LA26_0<=MINUS)||(LA26_0>=86 && LA26_0<=87)||LA26_0==92||(LA26_0>=104 && LA26_0<=106)) ) {
                    alt26=1;
                }


                } finally {dbg.exitDecision(26);}

                switch (alt26) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:219:14: blockStatement
            	    {
            	    dbg.location(219,14);
            	    pushFollow(FOLLOW_blockStatement_in_block1554);
            	    blockStatement85=blockStatement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, blockStatement85.getTree());

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);
            } finally {dbg.exitSubRule(26);}

            dbg.location(219,33);
            char_literal86=(Token)match(input,88,FOLLOW_88_in_block1557); if (state.failed) return retval;

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
        dbg.location(220, 5);

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:222:1: blockStatement : ( localVariableDeclarationStatement | statement );
    public final JaParser.blockStatement_return blockStatement() throws RecognitionException {
        JaParser.blockStatement_return retval = new JaParser.blockStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.localVariableDeclarationStatement_return localVariableDeclarationStatement87 = null;

        JaParser.statement_return statement88 = null;



        try { dbg.enterRule(getGrammarFileName(), "blockStatement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(222, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:223:5: ( localVariableDeclarationStatement | statement )
            int alt27=2;
            try { dbg.enterDecision(27);

            try {
                isCyclicDecision = true;
                alt27 = dfa27.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(27);}

            switch (alt27) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:223:9: localVariableDeclarationStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(223,9);
                    pushFollow(FOLLOW_localVariableDeclarationStatement_in_blockStatement1581);
                    localVariableDeclarationStatement87=localVariableDeclarationStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, localVariableDeclarationStatement87.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:224:9: statement
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(224,9);
                    pushFollow(FOLLOW_statement_in_blockStatement1591);
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
        dbg.location(225, 5);

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:227:1: localVariableDeclarationStatement : localVariableDeclaration ';' ;
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
        dbg.location(227, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:228:5: ( localVariableDeclaration ';' )
            dbg.enterAlt(1);

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:228:7: localVariableDeclaration ';'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(228,7);
            pushFollow(FOLLOW_localVariableDeclaration_in_localVariableDeclarationStatement1612);
            localVariableDeclaration89=localVariableDeclaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, localVariableDeclaration89.getTree());
            dbg.location(228,35);
            char_literal90=(Token)match(input,86,FOLLOW_86_in_localVariableDeclarationStatement1614); if (state.failed) return retval;

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
        dbg.location(229, 5);

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:231:1: localVariableDeclaration : type variableDeclarator[(CommonTree)$type.tree] ( ',' variableDeclarator[(CommonTree)$type.tree] )* -> ( ^( VARDECL variableDeclarator ) )+ ;
    public final JaParser.localVariableDeclaration_return localVariableDeclaration() throws RecognitionException {
        JaParser.localVariableDeclaration_return retval = new JaParser.localVariableDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal93=null;
        JaParser.type_return type91 = null;

        JaParser.variableDeclarator_return variableDeclarator92 = null;

        JaParser.variableDeclarator_return variableDeclarator94 = null;


        Object char_literal93_tree=null;
        RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        RewriteRuleSubtreeStream stream_variableDeclarator=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclarator");
        try { dbg.enterRule(getGrammarFileName(), "localVariableDeclaration");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(231, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:232:5: ( type variableDeclarator[(CommonTree)$type.tree] ( ',' variableDeclarator[(CommonTree)$type.tree] )* -> ( ^( VARDECL variableDeclarator ) )+ )
            dbg.enterAlt(1);

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:232:7: type variableDeclarator[(CommonTree)$type.tree] ( ',' variableDeclarator[(CommonTree)$type.tree] )*
            {
            dbg.location(232,7);
            pushFollow(FOLLOW_type_in_localVariableDeclaration1632);
            type91=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type91.getTree());
            dbg.location(232,12);
            pushFollow(FOLLOW_variableDeclarator_in_localVariableDeclaration1634);
            variableDeclarator92=variableDeclarator((CommonTree)(type91!=null?((Object)type91.tree):null));

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variableDeclarator.add(variableDeclarator92.getTree());
            dbg.location(232,55);
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:232:55: ( ',' variableDeclarator[(CommonTree)$type.tree] )*
            try { dbg.enterSubRule(28);

            loop28:
            do {
                int alt28=2;
                try { dbg.enterDecision(28);

                int LA28_0 = input.LA(1);

                if ( (LA28_0==89) ) {
                    alt28=1;
                }


                } finally {dbg.exitDecision(28);}

                switch (alt28) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:232:56: ',' variableDeclarator[(CommonTree)$type.tree]
            	    {
            	    dbg.location(232,56);
            	    char_literal93=(Token)match(input,89,FOLLOW_89_in_localVariableDeclaration1638); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_89.add(char_literal93);

            	    dbg.location(232,60);
            	    pushFollow(FOLLOW_variableDeclarator_in_localVariableDeclaration1640);
            	    variableDeclarator94=variableDeclarator((CommonTree)(type91!=null?((Object)type91.tree):null));

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_variableDeclarator.add(variableDeclarator94.getTree());

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);
            } finally {dbg.exitSubRule(28);}



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
            // 233:6: -> ( ^( VARDECL variableDeclarator ) )+
            {
                dbg.location(233,9);
                if ( !(stream_variableDeclarator.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_variableDeclarator.hasNext() ) {
                    dbg.location(233,9);
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:233:9: ^( VARDECL variableDeclarator )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    dbg.location(233,11);
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARDECL, "VARDECL"), root_1);

                    dbg.location(233,19);
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
        dbg.location(234, 5);

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:237:1: statement : ( block -> ^( BLOCK block ) | IF parExpression statement elseStmt -> ^( IF ^( CONDITION parExpression ) ^( THEN statement ) ( elseStmt )? ) | FOR '(' ( forInit )? ';' ( expression )? ';' ( forUpdate )? ')' statement -> ^( FOR ( ^( INIT forInit ) )? ( ^( CONDITION expression ) )? ( ^( UPDATE forUpdate ) )? statement ) | WHILE parExpression statement -> ^( WHILE ^( CONDITION parExpression ) statement ) | DO statement WHILE parExpression ';' -> ^( DOWHILE ^( CONDITION parExpression ) statement ) | RETURN ( expression )? ';' | ';' | statementExpression ';' -> ^( STMT statementExpression ) );
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
        dbg.location(237, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:238:5: ( block -> ^( BLOCK block ) | IF parExpression statement elseStmt -> ^( IF ^( CONDITION parExpression ) ^( THEN statement ) ( elseStmt )? ) | FOR '(' ( forInit )? ';' ( expression )? ';' ( forUpdate )? ')' statement -> ^( FOR ( ^( INIT forInit ) )? ( ^( CONDITION expression ) )? ( ^( UPDATE forUpdate ) )? statement ) | WHILE parExpression statement -> ^( WHILE ^( CONDITION parExpression ) statement ) | DO statement WHILE parExpression ';' -> ^( DOWHILE ^( CONDITION parExpression ) statement ) | RETURN ( expression )? ';' | ';' | statementExpression ';' -> ^( STMT statementExpression ) )
            int alt33=8;
            try { dbg.enterDecision(33);

            switch ( input.LA(1) ) {
            case 87:
                {
                alt33=1;
                }
                break;
            case IF:
                {
                alt33=2;
                }
                break;
            case FOR:
                {
                alt33=3;
                }
                break;
            case WHILE:
                {
                alt33=4;
                }
                break;
            case DO:
                {
                alt33=5;
                }
                break;
            case RETURN:
                {
                alt33=6;
                }
                break;
            case 86:
                {
                alt33=7;
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
            case 104:
            case 105:
            case 106:
                {
                alt33=8;
                }
                break;
            default:
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

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:238:9: block
                    {
                    dbg.location(238,9);
                    pushFollow(FOLLOW_block_in_statement1681);
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
                    // 238:15: -> ^( BLOCK block )
                    {
                        dbg.location(238,18);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:238:18: ^( BLOCK block )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(238,20);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);

                        dbg.location(238,26);
                        adaptor.addChild(root_1, stream_block.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:239:9: IF parExpression statement elseStmt
                    {
                    dbg.location(239,9);
                    IF96=(Token)match(input,IF,FOLLOW_IF_in_statement1699); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF96);

                    dbg.location(239,12);
                    pushFollow(FOLLOW_parExpression_in_statement1701);
                    parExpression97=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression97.getTree());
                    dbg.location(239,26);
                    pushFollow(FOLLOW_statement_in_statement1703);
                    statement98=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement98.getTree());
                    dbg.location(239,36);
                    pushFollow(FOLLOW_elseStmt_in_statement1705);
                    elseStmt99=elseStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_elseStmt.add(elseStmt99.getTree());


                    // AST REWRITE
                    // elements: elseStmt, parExpression, IF, statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 239:45: -> ^( IF ^( CONDITION parExpression ) ^( THEN statement ) ( elseStmt )? )
                    {
                        dbg.location(239,48);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:239:48: ^( IF ^( CONDITION parExpression ) ^( THEN statement ) ( elseStmt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(239,50);
                        root_1 = (Object)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                        dbg.location(239,53);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:239:53: ^( CONDITION parExpression )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(239,55);
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONDITION, "CONDITION"), root_2);

                        dbg.location(239,65);
                        adaptor.addChild(root_2, stream_parExpression.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        dbg.location(239,80);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:239:80: ^( THEN statement )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(239,82);
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(THEN, "THEN"), root_2);

                        dbg.location(239,87);
                        adaptor.addChild(root_2, stream_statement.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        dbg.location(239,98);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:239:98: ( elseStmt )?
                        if ( stream_elseStmt.hasNext() ) {
                            dbg.location(239,98);
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

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:240:9: FOR '(' ( forInit )? ';' ( expression )? ';' ( forUpdate )? ')' statement
                    {
                    dbg.location(240,9);
                    FOR100=(Token)match(input,FOR,FOLLOW_FOR_in_statement1736); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOR.add(FOR100);

                    dbg.location(240,13);
                    char_literal101=(Token)match(input,92,FOLLOW_92_in_statement1738); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_92.add(char_literal101);

                    dbg.location(240,17);
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:240:17: ( forInit )?
                    int alt29=2;
                    try { dbg.enterSubRule(29);
                    try { dbg.enterDecision(29);

                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==IDENTIFIER||LA29_0==VOID||(LA29_0>=CHAR && LA29_0<=NULLLITERAL)||LA29_0==NEW||(LA29_0>=PLUS && LA29_0<=MINUS)||LA29_0==92||(LA29_0>=104 && LA29_0<=106)) ) {
                        alt29=1;
                    }
                    } finally {dbg.exitDecision(29);}

                    switch (alt29) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:240:17: forInit
                            {
                            dbg.location(240,17);
                            pushFollow(FOLLOW_forInit_in_statement1740);
                            forInit102=forInit();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_forInit.add(forInit102.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(29);}

                    dbg.location(240,26);
                    char_literal103=(Token)match(input,86,FOLLOW_86_in_statement1743); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_86.add(char_literal103);

                    dbg.location(240,30);
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:240:30: ( expression )?
                    int alt30=2;
                    try { dbg.enterSubRule(30);
                    try { dbg.enterDecision(30);

                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==IDENTIFIER||LA30_0==VOID||(LA30_0>=CHAR && LA30_0<=NULLLITERAL)||LA30_0==NEW||(LA30_0>=PLUS && LA30_0<=MINUS)||LA30_0==92||(LA30_0>=104 && LA30_0<=106)) ) {
                        alt30=1;
                    }
                    } finally {dbg.exitDecision(30);}

                    switch (alt30) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:240:30: expression
                            {
                            dbg.location(240,30);
                            pushFollow(FOLLOW_expression_in_statement1745);
                            expression104=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(expression104.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(30);}

                    dbg.location(240,42);
                    char_literal105=(Token)match(input,86,FOLLOW_86_in_statement1748); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_86.add(char_literal105);

                    dbg.location(240,46);
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:240:46: ( forUpdate )?
                    int alt31=2;
                    try { dbg.enterSubRule(31);
                    try { dbg.enterDecision(31);

                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==IDENTIFIER||LA31_0==VOID||(LA31_0>=CHAR && LA31_0<=NULLLITERAL)||LA31_0==NEW||(LA31_0>=PLUS && LA31_0<=MINUS)||LA31_0==92||(LA31_0>=104 && LA31_0<=106)) ) {
                        alt31=1;
                    }
                    } finally {dbg.exitDecision(31);}

                    switch (alt31) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:240:46: forUpdate
                            {
                            dbg.location(240,46);
                            pushFollow(FOLLOW_forUpdate_in_statement1750);
                            forUpdate106=forUpdate();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_forUpdate.add(forUpdate106.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(31);}

                    dbg.location(240,57);
                    char_literal107=(Token)match(input,93,FOLLOW_93_in_statement1753); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_93.add(char_literal107);

                    dbg.location(240,61);
                    pushFollow(FOLLOW_statement_in_statement1755);
                    statement108=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement108.getTree());


                    // AST REWRITE
                    // elements: forInit, forUpdate, expression, statement, FOR
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 241:7: -> ^( FOR ( ^( INIT forInit ) )? ( ^( CONDITION expression ) )? ( ^( UPDATE forUpdate ) )? statement )
                    {
                        dbg.location(241,10);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:241:10: ^( FOR ( ^( INIT forInit ) )? ( ^( CONDITION expression ) )? ( ^( UPDATE forUpdate ) )? statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(241,12);
                        root_1 = (Object)adaptor.becomeRoot(stream_FOR.nextNode(), root_1);

                        dbg.location(241,16);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:241:16: ( ^( INIT forInit ) )?
                        if ( stream_forInit.hasNext() ) {
                            dbg.location(241,16);
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:241:16: ^( INIT forInit )
                            {
                            Object root_2 = (Object)adaptor.nil();
                            dbg.location(241,18);
                            root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(INIT, "INIT"), root_2);

                            dbg.location(241,23);
                            adaptor.addChild(root_2, stream_forInit.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_forInit.reset();
                        dbg.location(241,33);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:241:33: ( ^( CONDITION expression ) )?
                        if ( stream_expression.hasNext() ) {
                            dbg.location(241,33);
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:241:33: ^( CONDITION expression )
                            {
                            Object root_2 = (Object)adaptor.nil();
                            dbg.location(241,35);
                            root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONDITION, "CONDITION"), root_2);

                            dbg.location(241,45);
                            adaptor.addChild(root_2, stream_expression.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_expression.reset();
                        dbg.location(241,58);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:241:58: ( ^( UPDATE forUpdate ) )?
                        if ( stream_forUpdate.hasNext() ) {
                            dbg.location(241,58);
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:241:58: ^( UPDATE forUpdate )
                            {
                            Object root_2 = (Object)adaptor.nil();
                            dbg.location(241,60);
                            root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(UPDATE, "UPDATE"), root_2);

                            dbg.location(241,67);
                            adaptor.addChild(root_2, stream_forUpdate.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_forUpdate.reset();
                        dbg.location(241,79);
                        adaptor.addChild(root_1, stream_statement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:242:9: WHILE parExpression statement
                    {
                    dbg.location(242,9);
                    WHILE109=(Token)match(input,WHILE,FOLLOW_WHILE_in_statement1806); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE.add(WHILE109);

                    dbg.location(242,15);
                    pushFollow(FOLLOW_parExpression_in_statement1808);
                    parExpression110=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression110.getTree());
                    dbg.location(242,29);
                    pushFollow(FOLLOW_statement_in_statement1810);
                    statement111=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement111.getTree());


                    // AST REWRITE
                    // elements: statement, WHILE, parExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 242:39: -> ^( WHILE ^( CONDITION parExpression ) statement )
                    {
                        dbg.location(242,42);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:242:42: ^( WHILE ^( CONDITION parExpression ) statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(242,44);
                        root_1 = (Object)adaptor.becomeRoot(stream_WHILE.nextNode(), root_1);

                        dbg.location(242,50);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:242:50: ^( CONDITION parExpression )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(242,52);
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONDITION, "CONDITION"), root_2);

                        dbg.location(242,62);
                        adaptor.addChild(root_2, stream_parExpression.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        dbg.location(242,77);
                        adaptor.addChild(root_1, stream_statement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:243:9: DO statement WHILE parExpression ';'
                    {
                    dbg.location(243,9);
                    DO112=(Token)match(input,DO,FOLLOW_DO_in_statement1834); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DO.add(DO112);

                    dbg.location(243,12);
                    pushFollow(FOLLOW_statement_in_statement1836);
                    statement113=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement113.getTree());
                    dbg.location(243,22);
                    WHILE114=(Token)match(input,WHILE,FOLLOW_WHILE_in_statement1838); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE.add(WHILE114);

                    dbg.location(243,28);
                    pushFollow(FOLLOW_parExpression_in_statement1840);
                    parExpression115=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression115.getTree());
                    dbg.location(243,42);
                    char_literal116=(Token)match(input,86,FOLLOW_86_in_statement1842); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_86.add(char_literal116);



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
                    // 243:46: -> ^( DOWHILE ^( CONDITION parExpression ) statement )
                    {
                        dbg.location(243,49);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:243:49: ^( DOWHILE ^( CONDITION parExpression ) statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(243,51);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DOWHILE, "DOWHILE"), root_1);

                        dbg.location(243,59);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:243:59: ^( CONDITION parExpression )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(243,61);
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONDITION, "CONDITION"), root_2);

                        dbg.location(243,71);
                        adaptor.addChild(root_2, stream_parExpression.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        dbg.location(243,86);
                        adaptor.addChild(root_1, stream_statement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:244:9: RETURN ( expression )? ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(244,15);
                    RETURN117=(Token)match(input,RETURN,FOLLOW_RETURN_in_statement1866); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RETURN117_tree = (Object)adaptor.create(RETURN117);
                    root_0 = (Object)adaptor.becomeRoot(RETURN117_tree, root_0);
                    }
                    dbg.location(244,17);
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:244:17: ( expression )?
                    int alt32=2;
                    try { dbg.enterSubRule(32);
                    try { dbg.enterDecision(32);

                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==IDENTIFIER||LA32_0==VOID||(LA32_0>=CHAR && LA32_0<=NULLLITERAL)||LA32_0==NEW||(LA32_0>=PLUS && LA32_0<=MINUS)||LA32_0==92||(LA32_0>=104 && LA32_0<=106)) ) {
                        alt32=1;
                    }
                    } finally {dbg.exitDecision(32);}

                    switch (alt32) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:244:17: expression
                            {
                            dbg.location(244,17);
                            pushFollow(FOLLOW_expression_in_statement1869);
                            expression118=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression118.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(32);}

                    dbg.location(244,32);
                    char_literal119=(Token)match(input,86,FOLLOW_86_in_statement1872); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:245:9: ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(245,12);
                    char_literal120=(Token)match(input,86,FOLLOW_86_in_statement1883); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:246:9: statementExpression ';'
                    {
                    dbg.location(246,9);
                    pushFollow(FOLLOW_statementExpression_in_statement1895);
                    statementExpression121=statementExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementExpression.add(statementExpression121.getTree());
                    dbg.location(246,29);
                    char_literal122=(Token)match(input,86,FOLLOW_86_in_statement1897); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_86.add(char_literal122);



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
                    // 246:33: -> ^( STMT statementExpression )
                    {
                        dbg.location(246,36);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:246:36: ^( STMT statementExpression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(246,38);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(STMT, "STMT"), root_1);

                        dbg.location(246,43);
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
        dbg.location(247, 5);

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:249:1: elseStmt : ( ( ELSE )=> ELSE statement | );
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
        dbg.location(249, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:250:5: ( ( ELSE )=> ELSE statement | )
            int alt34=2;
            try { dbg.enterDecision(34);

            int LA34_0 = input.LA(1);

            if ( (LA34_0==ELSE) ) {
                int LA34_1 = input.LA(2);

                if ( (synpred2_Ja()) ) {
                    alt34=1;
                }
                else if ( (true) ) {
                    alt34=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else if ( (LA34_0==IDENTIFIER||LA34_0==VOID||(LA34_0>=CHAR && LA34_0<=RETURN)||LA34_0==NEW||(LA34_0>=PLUS && LA34_0<=MINUS)||(LA34_0>=86 && LA34_0<=88)||LA34_0==92||(LA34_0>=104 && LA34_0<=106)) ) {
                alt34=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(34);}

            switch (alt34) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:250:7: ( ELSE )=> ELSE statement
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(250,21);
                    ELSE123=(Token)match(input,ELSE,FOLLOW_ELSE_in_elseStmt1932); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ELSE123_tree = (Object)adaptor.create(ELSE123);
                    root_0 = (Object)adaptor.becomeRoot(ELSE123_tree, root_0);
                    }
                    dbg.location(250,23);
                    pushFollow(FOLLOW_statement_in_elseStmt1935);
                    statement124=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement124.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:252:5: 
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
        dbg.location(252, 5);

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:254:1: forInit : ( localVariableDeclaration | expressionList );
    public final JaParser.forInit_return forInit() throws RecognitionException {
        JaParser.forInit_return retval = new JaParser.forInit_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.localVariableDeclaration_return localVariableDeclaration125 = null;

        JaParser.expressionList_return expressionList126 = null;



        try { dbg.enterRule(getGrammarFileName(), "forInit");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(254, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:255:5: ( localVariableDeclaration | expressionList )
            int alt35=2;
            try { dbg.enterDecision(35);

            try {
                isCyclicDecision = true;
                alt35 = dfa35.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(35);}

            switch (alt35) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:255:9: localVariableDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(255,9);
                    pushFollow(FOLLOW_localVariableDeclaration_in_forInit1960);
                    localVariableDeclaration125=localVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, localVariableDeclaration125.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:256:9: expressionList
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(256,9);
                    pushFollow(FOLLOW_expressionList_in_forInit1970);
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
        dbg.location(257, 5);

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:259:1: forUpdate : expressionList ;
    public final JaParser.forUpdate_return forUpdate() throws RecognitionException {
        JaParser.forUpdate_return retval = new JaParser.forUpdate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.expressionList_return expressionList127 = null;



        try { dbg.enterRule(getGrammarFileName(), "forUpdate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(259, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:260:5: ( expressionList )
            dbg.enterAlt(1);

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:260:9: expressionList
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(260,9);
            pushFollow(FOLLOW_expressionList_in_forUpdate1989);
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
        dbg.location(261, 5);

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:263:1: parExpression : '(' expression ')' ;
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
        dbg.location(263, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:264:5: ( '(' expression ')' )
            dbg.enterAlt(1);

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:264:9: '(' expression ')'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(264,12);
            char_literal128=(Token)match(input,92,FOLLOW_92_in_parExpression2008); if (state.failed) return retval;
            dbg.location(264,14);
            pushFollow(FOLLOW_expression_in_parExpression2011);
            expression129=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression129.getTree());
            dbg.location(264,28);
            char_literal130=(Token)match(input,93,FOLLOW_93_in_parExpression2013); if (state.failed) return retval;

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
        dbg.location(265, 5);

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:267:1: expressionList : expression ( ',' expression )* ;
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
        dbg.location(267, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:268:5: ( expression ( ',' expression )* )
            dbg.enterAlt(1);

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:268:9: expression ( ',' expression )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(268,9);
            pushFollow(FOLLOW_expression_in_expressionList2037);
            expression131=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression131.getTree());
            dbg.location(268,20);
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:268:20: ( ',' expression )*
            try { dbg.enterSubRule(36);

            loop36:
            do {
                int alt36=2;
                try { dbg.enterDecision(36);

                int LA36_0 = input.LA(1);

                if ( (LA36_0==89) ) {
                    alt36=1;
                }


                } finally {dbg.exitDecision(36);}

                switch (alt36) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:268:21: ',' expression
            	    {
            	    dbg.location(268,24);
            	    char_literal132=(Token)match(input,89,FOLLOW_89_in_expressionList2040); if (state.failed) return retval;
            	    dbg.location(268,26);
            	    pushFollow(FOLLOW_expression_in_expressionList2043);
            	    expression133=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression133.getTree());

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);
            } finally {dbg.exitSubRule(36);}


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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:271:1: statementExpression : expression ;
    public final JaParser.statementExpression_return statementExpression() throws RecognitionException {
        JaParser.statementExpression_return retval = new JaParser.statementExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.expression_return expression134 = null;



        try { dbg.enterRule(getGrammarFileName(), "statementExpression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(271, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:272:5: ( expression )
            dbg.enterAlt(1);

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:272:9: expression
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(272,9);
            pushFollow(FOLLOW_expression_in_statementExpression2064);
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
        dbg.location(273, 5);

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:275:1: constantExpression : expression ;
    public final JaParser.constantExpression_return constantExpression() throws RecognitionException {
        JaParser.constantExpression_return retval = new JaParser.constantExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.expression_return expression135 = null;



        try { dbg.enterRule(getGrammarFileName(), "constantExpression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(275, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:276:5: ( expression )
            dbg.enterAlt(1);

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:276:9: expression
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(276,9);
            pushFollow(FOLLOW_expression_in_constantExpression2087);
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
        dbg.location(277, 5);

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:279:1: expression : orExpression (ap= assignmentOperator expression )? -> {$ap.c == '='}? ^( '=' orExpression expression ) -> {$ap.c == '+'}? ^( EQ orExpression ^( PLUS orExpression expression ) ) -> {$ap.c == '-'}? ^( EQ orExpression ^( MINUS orExpression expression ) ) -> {$ap.c == '*'}? ^( EQ orExpression ^( STAR orExpression expression ) ) -> {$ap.c == '/'}? ^( EQ orExpression ^( SLASH orExpression expression ) ) -> orExpression ;
    public final JaParser.expression_return expression() throws RecognitionException {
        JaParser.expression_return retval = new JaParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.assignmentOperator_return ap = null;

        JaParser.orExpression_return orExpression136 = null;

        JaParser.expression_return expression137 = null;


        RewriteRuleSubtreeStream stream_assignmentOperator=new RewriteRuleSubtreeStream(adaptor,"rule assignmentOperator");
        RewriteRuleSubtreeStream stream_orExpression=new RewriteRuleSubtreeStream(adaptor,"rule orExpression");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try { dbg.enterRule(getGrammarFileName(), "expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(279, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:280:5: ( orExpression (ap= assignmentOperator expression )? -> {$ap.c == '='}? ^( '=' orExpression expression ) -> {$ap.c == '+'}? ^( EQ orExpression ^( PLUS orExpression expression ) ) -> {$ap.c == '-'}? ^( EQ orExpression ^( MINUS orExpression expression ) ) -> {$ap.c == '*'}? ^( EQ orExpression ^( STAR orExpression expression ) ) -> {$ap.c == '/'}? ^( EQ orExpression ^( SLASH orExpression expression ) ) -> orExpression )
            dbg.enterAlt(1);

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:280:8: orExpression (ap= assignmentOperator expression )?
            {
            dbg.location(280,8);
            pushFollow(FOLLOW_orExpression_in_expression2109);
            orExpression136=orExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_orExpression.add(orExpression136.getTree());
            dbg.location(280,21);
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:280:21: (ap= assignmentOperator expression )?
            int alt37=2;
            try { dbg.enterSubRule(37);
            try { dbg.enterDecision(37);

            int LA37_0 = input.LA(1);

            if ( (LA37_0==EQ||(LA37_0>=95 && LA37_0<=98)) ) {
                alt37=1;
            }
            } finally {dbg.exitDecision(37);}

            switch (alt37) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:280:23: ap= assignmentOperator expression
                    {
                    dbg.location(280,25);
                    pushFollow(FOLLOW_assignmentOperator_in_expression2115);
                    ap=assignmentOperator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_assignmentOperator.add(ap.getTree());
                    dbg.location(280,45);
                    pushFollow(FOLLOW_expression_in_expression2117);
                    expression137=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression137.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(37);}



            // AST REWRITE
            // elements: orExpression, expression, expression, EQ, orExpression, expression, orExpression, orExpression, expression, orExpression, orExpression, orExpression, orExpression, orExpression, orExpression, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 280:58: -> {$ap.c == '='}? ^( '=' orExpression expression )
            if ((ap!=null?ap.c:0) == '=') {
                dbg.location(280,77);
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:280:77: ^( '=' orExpression expression )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(280,79);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EQ, "EQ"), root_1);

                dbg.location(280,83);
                adaptor.addChild(root_1, stream_orExpression.nextTree());
                dbg.location(280,96);
                adaptor.addChild(root_1, stream_expression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 281:13: -> {$ap.c == '+'}? ^( EQ orExpression ^( PLUS orExpression expression ) )
            if ((ap!=null?ap.c:0) == '+') {
                dbg.location(281,32);
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:281:32: ^( EQ orExpression ^( PLUS orExpression expression ) )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(281,34);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EQ, "EQ"), root_1);

                dbg.location(281,37);
                adaptor.addChild(root_1, stream_orExpression.nextTree());
                dbg.location(281,50);
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:281:50: ^( PLUS orExpression expression )
                {
                Object root_2 = (Object)adaptor.nil();
                dbg.location(281,52);
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(PLUS, "PLUS"), root_2);

                dbg.location(281,58);
                adaptor.addChild(root_2, stream_orExpression.nextTree());
                dbg.location(281,71);
                adaptor.addChild(root_2, stream_expression.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 282:13: -> {$ap.c == '-'}? ^( EQ orExpression ^( MINUS orExpression expression ) )
            if ((ap!=null?ap.c:0) == '-') {
                dbg.location(282,32);
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:282:32: ^( EQ orExpression ^( MINUS orExpression expression ) )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(282,34);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EQ, "EQ"), root_1);

                dbg.location(282,37);
                adaptor.addChild(root_1, stream_orExpression.nextTree());
                dbg.location(282,50);
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:282:50: ^( MINUS orExpression expression )
                {
                Object root_2 = (Object)adaptor.nil();
                dbg.location(282,52);
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(MINUS, "MINUS"), root_2);

                dbg.location(282,58);
                adaptor.addChild(root_2, stream_orExpression.nextTree());
                dbg.location(282,71);
                adaptor.addChild(root_2, stream_expression.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 283:13: -> {$ap.c == '*'}? ^( EQ orExpression ^( STAR orExpression expression ) )
            if ((ap!=null?ap.c:0) == '*') {
                dbg.location(283,32);
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:283:32: ^( EQ orExpression ^( STAR orExpression expression ) )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(283,34);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EQ, "EQ"), root_1);

                dbg.location(283,37);
                adaptor.addChild(root_1, stream_orExpression.nextTree());
                dbg.location(283,50);
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:283:50: ^( STAR orExpression expression )
                {
                Object root_2 = (Object)adaptor.nil();
                dbg.location(283,52);
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(STAR, "STAR"), root_2);

                dbg.location(283,58);
                adaptor.addChild(root_2, stream_orExpression.nextTree());
                dbg.location(283,71);
                adaptor.addChild(root_2, stream_expression.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 284:13: -> {$ap.c == '/'}? ^( EQ orExpression ^( SLASH orExpression expression ) )
            if ((ap!=null?ap.c:0) == '/') {
                dbg.location(284,32);
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:284:32: ^( EQ orExpression ^( SLASH orExpression expression ) )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(284,34);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EQ, "EQ"), root_1);

                dbg.location(284,37);
                adaptor.addChild(root_1, stream_orExpression.nextTree());
                dbg.location(284,50);
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:284:50: ^( SLASH orExpression expression )
                {
                Object root_2 = (Object)adaptor.nil();
                dbg.location(284,52);
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(SLASH, "SLASH"), root_2);

                dbg.location(284,58);
                adaptor.addChild(root_2, stream_orExpression.nextTree());
                dbg.location(284,71);
                adaptor.addChild(root_2, stream_expression.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 285:13: -> orExpression
            {
                dbg.location(285,17);
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
        dbg.location(286, 5);

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:288:1: assignmentOperator returns [char c] : ( '=' | '+=' | '-=' | '*=' | '/=' );
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
        dbg.location(288, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:289:5: ( '=' | '+=' | '-=' | '*=' | '/=' )
            int alt38=5;
            try { dbg.enterDecision(38);

            switch ( input.LA(1) ) {
            case EQ:
                {
                alt38=1;
                }
                break;
            case 95:
                {
                alt38=2;
                }
                break;
            case 96:
                {
                alt38=3;
                }
                break;
            case 97:
                {
                alt38=4;
                }
                break;
            case 98:
                {
                alt38=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(38);}

            switch (alt38) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:289:9: '='
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(289,9);
                    char_literal138=(Token)match(input,EQ,FOLLOW_EQ_in_assignmentOperator2297); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal138_tree = (Object)adaptor.create(char_literal138);
                    adaptor.addChild(root_0, char_literal138_tree);
                    }
                    dbg.location(289,14);
                    if ( state.backtracking==0 ) {
                       retval.c = '='; 
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:290:9: '+='
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(290,9);
                    string_literal139=(Token)match(input,95,FOLLOW_95_in_assignmentOperator2310); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal139_tree = (Object)adaptor.create(string_literal139);
                    adaptor.addChild(root_0, string_literal139_tree);
                    }
                    dbg.location(290,14);
                    if ( state.backtracking==0 ) {
                       retval.c = '+'; 
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:291:9: '-='
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(291,9);
                    string_literal140=(Token)match(input,96,FOLLOW_96_in_assignmentOperator2322); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal140_tree = (Object)adaptor.create(string_literal140);
                    adaptor.addChild(root_0, string_literal140_tree);
                    }
                    dbg.location(291,14);
                    if ( state.backtracking==0 ) {
                       retval.c = '-'; 
                    }

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:292:9: '*='
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(292,9);
                    string_literal141=(Token)match(input,97,FOLLOW_97_in_assignmentOperator2334); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal141_tree = (Object)adaptor.create(string_literal141);
                    adaptor.addChild(root_0, string_literal141_tree);
                    }
                    dbg.location(292,14);
                    if ( state.backtracking==0 ) {
                       retval.c = '*'; 
                    }

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:293:9: '/='
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(293,9);
                    string_literal142=(Token)match(input,98,FOLLOW_98_in_assignmentOperator2346); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal142_tree = (Object)adaptor.create(string_literal142);
                    adaptor.addChild(root_0, string_literal142_tree);
                    }
                    dbg.location(293,14);
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
        dbg.location(294, 5);

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:296:1: orExpression : andExpression ( '||' andExpression )* ;
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
        dbg.location(296, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:297:5: ( andExpression ( '||' andExpression )* )
            dbg.enterAlt(1);

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:297:9: andExpression ( '||' andExpression )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(297,9);
            pushFollow(FOLLOW_andExpression_in_orExpression2367);
            andExpression143=andExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, andExpression143.getTree());
            dbg.location(297,23);
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:297:23: ( '||' andExpression )*
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

            	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:297:25: '||' andExpression
            	    {
            	    dbg.location(297,29);
            	    string_literal144=(Token)match(input,99,FOLLOW_99_in_orExpression2371); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal144_tree = (Object)adaptor.create(string_literal144);
            	    root_0 = (Object)adaptor.becomeRoot(string_literal144_tree, root_0);
            	    }
            	    dbg.location(297,31);
            	    pushFollow(FOLLOW_andExpression_in_orExpression2374);
            	    andExpression145=andExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, andExpression145.getTree());

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
        dbg.location(298, 5);

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:300:1: andExpression : equalityExpression ( '&&' equalityExpression )* ;
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
        dbg.location(300, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:301:5: ( equalityExpression ( '&&' equalityExpression )* )
            dbg.enterAlt(1);

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:301:9: equalityExpression ( '&&' equalityExpression )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(301,9);
            pushFollow(FOLLOW_equalityExpression_in_andExpression2396);
            equalityExpression146=equalityExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression146.getTree());
            dbg.location(301,28);
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:301:28: ( '&&' equalityExpression )*
            try { dbg.enterSubRule(40);

            loop40:
            do {
                int alt40=2;
                try { dbg.enterDecision(40);

                int LA40_0 = input.LA(1);

                if ( (LA40_0==100) ) {
                    alt40=1;
                }


                } finally {dbg.exitDecision(40);}

                switch (alt40) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:301:30: '&&' equalityExpression
            	    {
            	    dbg.location(301,34);
            	    string_literal147=(Token)match(input,100,FOLLOW_100_in_andExpression2400); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal147_tree = (Object)adaptor.create(string_literal147);
            	    root_0 = (Object)adaptor.becomeRoot(string_literal147_tree, root_0);
            	    }
            	    dbg.location(301,36);
            	    pushFollow(FOLLOW_equalityExpression_in_andExpression2403);
            	    equalityExpression148=equalityExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression148.getTree());

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
        dbg.location(302, 5);

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:304:1: equalityExpression : instanceOfExpression ( ( '==' | '!=' ) instanceOfExpression )* ;
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
        dbg.location(304, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:305:5: ( instanceOfExpression ( ( '==' | '!=' ) instanceOfExpression )* )
            dbg.enterAlt(1);

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:305:9: instanceOfExpression ( ( '==' | '!=' ) instanceOfExpression )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(305,9);
            pushFollow(FOLLOW_instanceOfExpression_in_equalityExpression2425);
            instanceOfExpression149=instanceOfExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, instanceOfExpression149.getTree());
            dbg.location(305,30);
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:305:30: ( ( '==' | '!=' ) instanceOfExpression )*
            try { dbg.enterSubRule(41);

            loop41:
            do {
                int alt41=2;
                try { dbg.enterDecision(41);

                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=101 && LA41_0<=102)) ) {
                    alt41=1;
                }


                } finally {dbg.exitDecision(41);}

                switch (alt41) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:305:32: ( '==' | '!=' ) instanceOfExpression
            	    {
            	    dbg.location(305,32);
            	    set150=(Token)input.LT(1);
            	    set150=(Token)input.LT(1);
            	    if ( (input.LA(1)>=101 && input.LA(1)<=102) ) {
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

            	    dbg.location(305,47);
            	    pushFollow(FOLLOW_instanceOfExpression_in_equalityExpression2438);
            	    instanceOfExpression151=instanceOfExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, instanceOfExpression151.getTree());

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);
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
        dbg.location(306, 5);

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:308:1: instanceOfExpression : relationalExpression ( INSTANCEOF type )? ;
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
        dbg.location(308, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:309:5: ( relationalExpression ( INSTANCEOF type )? )
            dbg.enterAlt(1);

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:309:9: relationalExpression ( INSTANCEOF type )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(309,9);
            pushFollow(FOLLOW_relationalExpression_in_instanceOfExpression2460);
            relationalExpression152=relationalExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression152.getTree());
            dbg.location(309,30);
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:309:30: ( INSTANCEOF type )?
            int alt42=2;
            try { dbg.enterSubRule(42);
            try { dbg.enterDecision(42);

            int LA42_0 = input.LA(1);

            if ( (LA42_0==INSTANCEOF) ) {
                alt42=1;
            }
            } finally {dbg.exitDecision(42);}

            switch (alt42) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:309:31: INSTANCEOF type
                    {
                    dbg.location(309,41);
                    INSTANCEOF153=(Token)match(input,INSTANCEOF,FOLLOW_INSTANCEOF_in_instanceOfExpression2463); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INSTANCEOF153_tree = (Object)adaptor.create(INSTANCEOF153);
                    root_0 = (Object)adaptor.becomeRoot(INSTANCEOF153_tree, root_0);
                    }
                    dbg.location(309,43);
                    pushFollow(FOLLOW_type_in_instanceOfExpression2466);
                    type154=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type154.getTree());

                    }
                    break;

            }
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
        dbg.location(310, 5);

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:312:1: relationalExpression : additiveExpression ( COMPAREOP additiveExpression )* ;
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
        dbg.location(312, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:313:5: ( additiveExpression ( COMPAREOP additiveExpression )* )
            dbg.enterAlt(1);

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:313:9: additiveExpression ( COMPAREOP additiveExpression )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(313,9);
            pushFollow(FOLLOW_additiveExpression_in_relationalExpression2487);
            additiveExpression155=additiveExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression155.getTree());
            dbg.location(313,28);
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:313:28: ( COMPAREOP additiveExpression )*
            try { dbg.enterSubRule(43);

            loop43:
            do {
                int alt43=2;
                try { dbg.enterDecision(43);

                int LA43_0 = input.LA(1);

                if ( (LA43_0==COMPAREOP) ) {
                    alt43=1;
                }


                } finally {dbg.exitDecision(43);}

                switch (alt43) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:313:30: COMPAREOP additiveExpression
            	    {
            	    dbg.location(313,39);
            	    COMPAREOP156=(Token)match(input,COMPAREOP,FOLLOW_COMPAREOP_in_relationalExpression2491); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    COMPAREOP156_tree = (Object)adaptor.create(COMPAREOP156);
            	    root_0 = (Object)adaptor.becomeRoot(COMPAREOP156_tree, root_0);
            	    }
            	    dbg.location(313,41);
            	    pushFollow(FOLLOW_additiveExpression_in_relationalExpression2494);
            	    additiveExpression157=additiveExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression157.getTree());

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
        dbg.location(314, 5);

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:316:1: additiveExpression : multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )* ;
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
        dbg.location(316, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:317:5: ( multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )* )
            dbg.enterAlt(1);

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:317:9: multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(317,9);
            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression2516);
            multiplicativeExpression158=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression158.getTree());
            dbg.location(317,34);
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:317:34: ( ( '+' | '-' ) multiplicativeExpression )*
            try { dbg.enterSubRule(44);

            loop44:
            do {
                int alt44=2;
                try { dbg.enterDecision(44);

                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=PLUS && LA44_0<=MINUS)) ) {
                    alt44=1;
                }


                } finally {dbg.exitDecision(44);}

                switch (alt44) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:317:36: ( '+' | '-' ) multiplicativeExpression
            	    {
            	    dbg.location(317,36);
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

            	    dbg.location(317,49);
            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression2529);
            	    multiplicativeExpression160=multiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression160.getTree());

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
        dbg.location(318, 5);

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:320:1: multiplicativeExpression : unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )* ;
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
        dbg.location(320, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:321:5: ( unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )* )
            dbg.enterAlt(1);

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:321:9: unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(321,9);
            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression2551);
            unaryExpression161=unaryExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression161.getTree());
            dbg.location(321,25);
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:321:25: ( ( '*' | '/' | '%' ) unaryExpression )*
            try { dbg.enterSubRule(45);

            loop45:
            do {
                int alt45=2;
                try { dbg.enterDecision(45);

                int LA45_0 = input.LA(1);

                if ( ((LA45_0>=STAR && LA45_0<=SLASH)||LA45_0==103) ) {
                    alt45=1;
                }


                } finally {dbg.exitDecision(45);}

                switch (alt45) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:321:27: ( '*' | '/' | '%' ) unaryExpression
            	    {
            	    dbg.location(321,27);
            	    set162=(Token)input.LT(1);
            	    set162=(Token)input.LT(1);
            	    if ( (input.LA(1)>=STAR && input.LA(1)<=SLASH)||input.LA(1)==103 ) {
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

            	    dbg.location(321,48);
            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression2570);
            	    unaryExpression163=unaryExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression163.getTree());

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);
            } finally {dbg.exitSubRule(45);}


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
        dbg.location(322, 5);

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:324:1: unaryExpression : ( '+' unaryExpression -> ^( UNARYPLUS unaryExpression ) | '-' unaryExpression -> ^( UNARYMINUS unaryExpression ) | '++' unaryExpression -> ^( PREINC unaryExpression ) | '--' unaryExpression -> ^( PREDEC unaryExpression ) | unaryExpressionNotPlusMinus );
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
        RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
        RewriteRuleSubtreeStream stream_unaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule unaryExpression");
        try { dbg.enterRule(getGrammarFileName(), "unaryExpression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(324, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:325:5: ( '+' unaryExpression -> ^( UNARYPLUS unaryExpression ) | '-' unaryExpression -> ^( UNARYMINUS unaryExpression ) | '++' unaryExpression -> ^( PREINC unaryExpression ) | '--' unaryExpression -> ^( PREDEC unaryExpression ) | unaryExpressionNotPlusMinus )
            int alt46=5;
            try { dbg.enterDecision(46);

            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt46=1;
                }
                break;
            case MINUS:
                {
                alt46=2;
                }
                break;
            case 104:
                {
                alt46=3;
                }
                break;
            case 105:
                {
                alt46=4;
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
            case LONGLITERAL:
            case FLOATLITERAL:
            case DOUBLELITERAL:
            case CHARLITERAL:
            case STRINGLITERAL:
            case BOOLEANLITERAL:
            case NULLLITERAL:
            case NEW:
            case 92:
            case 106:
                {
                alt46=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(46);}

            switch (alt46) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:325:9: '+' unaryExpression
                    {
                    dbg.location(325,9);
                    char_literal164=(Token)match(input,PLUS,FOLLOW_PLUS_in_unaryExpression2596); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUS.add(char_literal164);

                    dbg.location(325,13);
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression2598);
                    unaryExpression165=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression165.getTree());


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
                    // 325:29: -> ^( UNARYPLUS unaryExpression )
                    {
                        dbg.location(325,32);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:325:32: ^( UNARYPLUS unaryExpression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(325,34);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(UNARYPLUS, "UNARYPLUS"), root_1);

                        dbg.location(325,45);
                        adaptor.addChild(root_1, stream_unaryExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:326:9: '-' unaryExpression
                    {
                    dbg.location(326,9);
                    char_literal166=(Token)match(input,MINUS,FOLLOW_MINUS_in_unaryExpression2618); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(char_literal166);

                    dbg.location(326,13);
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression2620);
                    unaryExpression167=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression167.getTree());


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
                    // 326:29: -> ^( UNARYMINUS unaryExpression )
                    {
                        dbg.location(326,32);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:326:32: ^( UNARYMINUS unaryExpression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(326,34);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(UNARYMINUS, "UNARYMINUS"), root_1);

                        dbg.location(326,45);
                        adaptor.addChild(root_1, stream_unaryExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:327:9: '++' unaryExpression
                    {
                    dbg.location(327,9);
                    string_literal168=(Token)match(input,104,FOLLOW_104_in_unaryExpression2638); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_104.add(string_literal168);

                    dbg.location(327,14);
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression2640);
                    unaryExpression169=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression169.getTree());


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
                    // 327:30: -> ^( PREINC unaryExpression )
                    {
                        dbg.location(327,33);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:327:33: ^( PREINC unaryExpression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(327,35);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PREINC, "PREINC"), root_1);

                        dbg.location(327,42);
                        adaptor.addChild(root_1, stream_unaryExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:328:9: '--' unaryExpression
                    {
                    dbg.location(328,9);
                    string_literal170=(Token)match(input,105,FOLLOW_105_in_unaryExpression2658); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_105.add(string_literal170);

                    dbg.location(328,14);
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression2660);
                    unaryExpression171=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression171.getTree());


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
                    // 328:30: -> ^( PREDEC unaryExpression )
                    {
                        dbg.location(328,33);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:328:33: ^( PREDEC unaryExpression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(328,35);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PREDEC, "PREDEC"), root_1);

                        dbg.location(328,42);
                        adaptor.addChild(root_1, stream_unaryExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:329:9: unaryExpressionNotPlusMinus
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(329,9);
                    pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression2678);
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
        dbg.location(330, 5);

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:332:1: unaryExpressionNotPlusMinus : ( '!' unaryExpression | ( '(' primitiveType ')' )=> '(' primitiveType ')' unaryExpression -> ^( CAST primitiveType unaryExpression ) | ( '(' nonPrimitiveType ')' unaryExpressionNotPlusMinus )=> '(' nonPrimitiveType ')' unaryExpressionNotPlusMinus -> ^( CAST nonPrimitiveType unaryExpressionNotPlusMinus ) | NEW creator | ( primary -> primary ) ( selector[(CommonTree)$unaryExpressionNotPlusMinus.tree] -> selector )* ( '++' -> ^( POSTINC $unaryExpressionNotPlusMinus) | '--' -> ^( POSTDEC $unaryExpressionNotPlusMinus) )? );
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
        Token string_literal187=null;
        Token string_literal188=null;
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
        Object string_literal187_tree=null;
        Object string_literal188_tree=null;
        RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
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
        dbg.location(332, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:333:5: ( '!' unaryExpression | ( '(' primitiveType ')' )=> '(' primitiveType ')' unaryExpression -> ^( CAST primitiveType unaryExpression ) | ( '(' nonPrimitiveType ')' unaryExpressionNotPlusMinus )=> '(' nonPrimitiveType ')' unaryExpressionNotPlusMinus -> ^( CAST nonPrimitiveType unaryExpressionNotPlusMinus ) | NEW creator | ( primary -> primary ) ( selector[(CommonTree)$unaryExpressionNotPlusMinus.tree] -> selector )* ( '++' -> ^( POSTINC $unaryExpressionNotPlusMinus) | '--' -> ^( POSTDEC $unaryExpressionNotPlusMinus) )? )
            int alt49=5;
            try { dbg.enterDecision(49);

            try {
                isCyclicDecision = true;
                alt49 = dfa49.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(49);}

            switch (alt49) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:333:7: '!' unaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(333,10);
                    char_literal173=(Token)match(input,106,FOLLOW_106_in_unaryExpressionNotPlusMinus2695); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal173_tree = (Object)adaptor.create(char_literal173);
                    root_0 = (Object)adaptor.becomeRoot(char_literal173_tree, root_0);
                    }
                    dbg.location(333,12);
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus2698);
                    unaryExpression174=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression174.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:334:9: ( '(' primitiveType ')' )=> '(' primitiveType ')' unaryExpression
                    {
                    dbg.location(334,37);
                    char_literal175=(Token)match(input,92,FOLLOW_92_in_unaryExpressionNotPlusMinus2719); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_92.add(char_literal175);

                    dbg.location(334,41);
                    pushFollow(FOLLOW_primitiveType_in_unaryExpressionNotPlusMinus2721);
                    primitiveType176=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primitiveType.add(primitiveType176.getTree());
                    dbg.location(334,55);
                    char_literal177=(Token)match(input,93,FOLLOW_93_in_unaryExpressionNotPlusMinus2723); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_93.add(char_literal177);

                    dbg.location(334,59);
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus2725);
                    unaryExpression178=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression178.getTree());


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
                    // 335:7: -> ^( CAST primitiveType unaryExpression )
                    {
                        dbg.location(335,10);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:335:10: ^( CAST primitiveType unaryExpression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(335,12);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CAST, "CAST"), root_1);

                        dbg.location(335,17);
                        adaptor.addChild(root_1, stream_primitiveType.nextTree());
                        dbg.location(335,31);
                        adaptor.addChild(root_1, stream_unaryExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:337:9: ( '(' nonPrimitiveType ')' unaryExpressionNotPlusMinus )=> '(' nonPrimitiveType ')' unaryExpressionNotPlusMinus
                    {
                    dbg.location(337,68);
                    char_literal179=(Token)match(input,92,FOLLOW_92_in_unaryExpressionNotPlusMinus2769); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_92.add(char_literal179);

                    dbg.location(337,72);
                    pushFollow(FOLLOW_nonPrimitiveType_in_unaryExpressionNotPlusMinus2771);
                    nonPrimitiveType180=nonPrimitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_nonPrimitiveType.add(nonPrimitiveType180.getTree());
                    dbg.location(337,90);
                    char_literal181=(Token)match(input,93,FOLLOW_93_in_unaryExpressionNotPlusMinus2774); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_93.add(char_literal181);

                    dbg.location(337,94);
                    pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpressionNotPlusMinus2776);
                    unaryExpressionNotPlusMinus182=unaryExpressionNotPlusMinus();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpressionNotPlusMinus.add(unaryExpressionNotPlusMinus182.getTree());


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
                    // 338:7: -> ^( CAST nonPrimitiveType unaryExpressionNotPlusMinus )
                    {
                        dbg.location(338,10);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:338:10: ^( CAST nonPrimitiveType unaryExpressionNotPlusMinus )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(338,12);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CAST, "CAST"), root_1);

                        dbg.location(338,17);
                        adaptor.addChild(root_1, stream_nonPrimitiveType.nextTree());
                        dbg.location(338,34);
                        adaptor.addChild(root_1, stream_unaryExpressionNotPlusMinus.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:339:9: NEW creator
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(339,12);
                    NEW183=(Token)match(input,NEW,FOLLOW_NEW_in_unaryExpressionNotPlusMinus2802); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NEW183_tree = (Object)adaptor.create(NEW183);
                    root_0 = (Object)adaptor.becomeRoot(NEW183_tree, root_0);
                    }
                    dbg.location(339,14);
                    pushFollow(FOLLOW_creator_in_unaryExpressionNotPlusMinus2805);
                    creator184=creator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, creator184.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:340:9: ( primary -> primary ) ( selector[(CommonTree)$unaryExpressionNotPlusMinus.tree] -> selector )* ( '++' -> ^( POSTINC $unaryExpressionNotPlusMinus) | '--' -> ^( POSTDEC $unaryExpressionNotPlusMinus) )?
                    {
                    dbg.location(340,9);
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:340:9: ( primary -> primary )
                    dbg.enterAlt(1);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:340:10: primary
                    {
                    dbg.location(340,10);
                    pushFollow(FOLLOW_primary_in_unaryExpressionNotPlusMinus2816);
                    primary185=primary();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primary.add(primary185.getTree());


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
                    // 340:18: -> primary
                    {
                        dbg.location(340,21);
                        adaptor.addChild(root_0, stream_primary.nextTree());

                    }

                    retval.tree = root_0;}
                    }

                    dbg.location(340,31);
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:340:31: ( selector[(CommonTree)$unaryExpressionNotPlusMinus.tree] -> selector )*
                    try { dbg.enterSubRule(47);

                    loop47:
                    do {
                        int alt47=2;
                        try { dbg.enterDecision(47);

                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==90||LA47_0==107) ) {
                            alt47=1;
                        }


                        } finally {dbg.exitDecision(47);}

                        switch (alt47) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:340:32: selector[(CommonTree)$unaryExpressionNotPlusMinus.tree]
                    	    {
                    	    dbg.location(340,32);
                    	    pushFollow(FOLLOW_selector_in_unaryExpressionNotPlusMinus2825);
                    	    selector186=selector((CommonTree)((Object)retval.tree));

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_selector.add(selector186.getTree());


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
                    	    // 340:88: -> selector
                    	    {
                    	        dbg.location(340,91);
                    	        adaptor.addChild(root_0, stream_selector.nextTree());

                    	    }

                    	    retval.tree = root_0;}
                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(47);}

                    dbg.location(341,7);
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:341:7: ( '++' -> ^( POSTINC $unaryExpressionNotPlusMinus) | '--' -> ^( POSTDEC $unaryExpressionNotPlusMinus) )?
                    int alt48=3;
                    try { dbg.enterSubRule(48);
                    try { dbg.enterDecision(48);

                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==104) ) {
                        alt48=1;
                    }
                    else if ( (LA48_0==105) ) {
                        alt48=2;
                    }
                    } finally {dbg.exitDecision(48);}

                    switch (alt48) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:341:8: '++'
                            {
                            dbg.location(341,8);
                            string_literal187=(Token)match(input,104,FOLLOW_104_in_unaryExpressionNotPlusMinus2842); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_104.add(string_literal187);



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
                            // 341:13: -> ^( POSTINC $unaryExpressionNotPlusMinus)
                            {
                                dbg.location(341,16);
                                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:341:16: ^( POSTINC $unaryExpressionNotPlusMinus)
                                {
                                Object root_1 = (Object)adaptor.nil();
                                dbg.location(341,18);
                                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(POSTINC, "POSTINC"), root_1);

                                dbg.location(341,26);
                                adaptor.addChild(root_1, stream_retval.nextTree());

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;}
                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:341:58: '--'
                            {
                            dbg.location(341,58);
                            string_literal188=(Token)match(input,105,FOLLOW_105_in_unaryExpressionNotPlusMinus2855); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_105.add(string_literal188);



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
                            // 341:63: -> ^( POSTDEC $unaryExpressionNotPlusMinus)
                            {
                                dbg.location(341,66);
                                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:341:66: ^( POSTDEC $unaryExpressionNotPlusMinus)
                                {
                                Object root_1 = (Object)adaptor.nil();
                                dbg.location(341,68);
                                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(POSTDEC, "POSTDEC"), root_1);

                                dbg.location(341,76);
                                adaptor.addChild(root_1, stream_retval.nextTree());

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;}
                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(48);}


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
        dbg.location(342, 5);

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:345:1: primary : ( parExpression | THIS | SUPER superMemberAccess | literal | IDENTIFIER | ( IDENTIFIER -> IDENTIFIER ) ( '[' ']' -> ^( ARRAYTYPE $primary) )+ ( '.' CLASS -> ^( DOTCLASS $primary) ) | IDENTIFIER arguments -> ^( METHODCALL IDENTIFIER ( arguments )? THIS ) | IDENTIFIER '.' CLASS -> ^( DOTCLASS IDENTIFIER ) | ( primitiveType -> primitiveType ) ( '[' ']' -> ^( ARRAYTYPE $primary) )* ( '.' CLASS -> ^( DOTCLASS $primary) ) | VOID '.' CLASS -> ^( DOTCLASS VOID ) );
    public final JaParser.primary_return primary() throws RecognitionException {
        JaParser.primary_return retval = new JaParser.primary_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token THIS190=null;
        Token SUPER191=null;
        Token IDENTIFIER194=null;
        Token IDENTIFIER195=null;
        Token char_literal196=null;
        Token char_literal197=null;
        Token char_literal198=null;
        Token CLASS199=null;
        Token IDENTIFIER200=null;
        Token IDENTIFIER202=null;
        Token char_literal203=null;
        Token CLASS204=null;
        Token char_literal206=null;
        Token char_literal207=null;
        Token char_literal208=null;
        Token CLASS209=null;
        Token VOID210=null;
        Token char_literal211=null;
        Token CLASS212=null;
        JaParser.parExpression_return parExpression189 = null;

        JaParser.superMemberAccess_return superMemberAccess192 = null;

        JaParser.literal_return literal193 = null;

        JaParser.arguments_return arguments201 = null;

        JaParser.primitiveType_return primitiveType205 = null;


        Object THIS190_tree=null;
        Object SUPER191_tree=null;
        Object IDENTIFIER194_tree=null;
        Object IDENTIFIER195_tree=null;
        Object char_literal196_tree=null;
        Object char_literal197_tree=null;
        Object char_literal198_tree=null;
        Object CLASS199_tree=null;
        Object IDENTIFIER200_tree=null;
        Object IDENTIFIER202_tree=null;
        Object char_literal203_tree=null;
        Object CLASS204_tree=null;
        Object char_literal206_tree=null;
        Object char_literal207_tree=null;
        Object char_literal208_tree=null;
        Object CLASS209_tree=null;
        Object VOID210_tree=null;
        Object char_literal211_tree=null;
        Object CLASS212_tree=null;
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleTokenStream stream_CLASS=new RewriteRuleTokenStream(adaptor,"token CLASS");
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleTokenStream stream_VOID=new RewriteRuleTokenStream(adaptor,"token VOID");
        RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");
        RewriteRuleSubtreeStream stream_primitiveType=new RewriteRuleSubtreeStream(adaptor,"rule primitiveType");
        try { dbg.enterRule(getGrammarFileName(), "primary");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(345, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:346:5: ( parExpression | THIS | SUPER superMemberAccess | literal | IDENTIFIER | ( IDENTIFIER -> IDENTIFIER ) ( '[' ']' -> ^( ARRAYTYPE $primary) )+ ( '.' CLASS -> ^( DOTCLASS $primary) ) | IDENTIFIER arguments -> ^( METHODCALL IDENTIFIER ( arguments )? THIS ) | IDENTIFIER '.' CLASS -> ^( DOTCLASS IDENTIFIER ) | ( primitiveType -> primitiveType ) ( '[' ']' -> ^( ARRAYTYPE $primary) )* ( '.' CLASS -> ^( DOTCLASS $primary) ) | VOID '.' CLASS -> ^( DOTCLASS VOID ) )
            int alt52=10;
            try { dbg.enterDecision(52);

            try {
                isCyclicDecision = true;
                alt52 = dfa52.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(52);}

            switch (alt52) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:346:9: parExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(346,9);
                    pushFollow(FOLLOW_parExpression_in_primary2892);
                    parExpression189=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parExpression189.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:347:9: THIS
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(347,9);
                    THIS190=(Token)match(input,THIS,FOLLOW_THIS_in_primary2902); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    THIS190_tree = (Object)adaptor.create(THIS190);
                    adaptor.addChild(root_0, THIS190_tree);
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:348:9: SUPER superMemberAccess
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(348,14);
                    SUPER191=(Token)match(input,SUPER,FOLLOW_SUPER_in_primary2913); if (state.failed) return retval;
                    dbg.location(348,16);
                    pushFollow(FOLLOW_superMemberAccess_in_primary2916);
                    superMemberAccess192=superMemberAccess();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, superMemberAccess192.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:349:9: literal
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(349,9);
                    pushFollow(FOLLOW_literal_in_primary2926);
                    literal193=literal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, literal193.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:350:9: IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(350,9);
                    IDENTIFIER194=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary2936); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER194_tree = (Object)adaptor.create(IDENTIFIER194);
                    adaptor.addChild(root_0, IDENTIFIER194_tree);
                    }

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:351:9: ( IDENTIFIER -> IDENTIFIER ) ( '[' ']' -> ^( ARRAYTYPE $primary) )+ ( '.' CLASS -> ^( DOTCLASS $primary) )
                    {
                    dbg.location(351,9);
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:351:9: ( IDENTIFIER -> IDENTIFIER )
                    dbg.enterAlt(1);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:351:10: IDENTIFIER
                    {
                    dbg.location(351,10);
                    IDENTIFIER195=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary2947); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER195);



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
                    // 351:21: -> IDENTIFIER
                    {
                        dbg.location(351,24);
                        adaptor.addChild(root_0, stream_IDENTIFIER.nextNode());

                    }

                    retval.tree = root_0;}
                    }

                    dbg.location(351,36);
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:351:36: ( '[' ']' -> ^( ARRAYTYPE $primary) )+
                    int cnt50=0;
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

                    	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:351:37: '[' ']'
                    	    {
                    	    dbg.location(351,37);
                    	    char_literal196=(Token)match(input,90,FOLLOW_90_in_primary2955); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_90.add(char_literal196);

                    	    dbg.location(351,41);
                    	    char_literal197=(Token)match(input,91,FOLLOW_91_in_primary2957); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_91.add(char_literal197);



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
                    	    // 351:45: -> ^( ARRAYTYPE $primary)
                    	    {
                    	        dbg.location(351,48);
                    	        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:351:48: ^( ARRAYTYPE $primary)
                    	        {
                    	        Object root_1 = (Object)adaptor.nil();
                    	        dbg.location(351,50);
                    	        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAYTYPE, "ARRAYTYPE"), root_1);

                    	        dbg.location(351,60);
                    	        adaptor.addChild(root_1, stream_retval.nextTree());

                    	        adaptor.addChild(root_0, root_1);
                    	        }

                    	    }

                    	    retval.tree = root_0;}
                    	    }
                    	    break;

                    	default :
                    	    if ( cnt50 >= 1 ) break loop50;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(50, input);
                                dbg.recognitionException(eee);

                                throw eee;
                        }
                        cnt50++;
                    } while (true);
                    } finally {dbg.exitSubRule(50);}

                    dbg.location(351,72);
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:351:72: ( '.' CLASS -> ^( DOTCLASS $primary) )
                    dbg.enterAlt(1);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:351:73: '.' CLASS
                    {
                    dbg.location(351,73);
                    char_literal198=(Token)match(input,107,FOLLOW_107_in_primary2971); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_107.add(char_literal198);

                    dbg.location(351,77);
                    CLASS199=(Token)match(input,CLASS,FOLLOW_CLASS_in_primary2973); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLASS.add(CLASS199);



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
                    // 351:83: -> ^( DOTCLASS $primary)
                    {
                        dbg.location(351,86);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:351:86: ^( DOTCLASS $primary)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(351,88);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DOTCLASS, "DOTCLASS"), root_1);

                        dbg.location(351,97);
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

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:352:8: IDENTIFIER arguments
                    {
                    dbg.location(352,8);
                    IDENTIFIER200=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary2992); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER200);

                    dbg.location(352,20);
                    pushFollow(FOLLOW_arguments_in_primary2995);
                    arguments201=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arguments.add(arguments201.getTree());


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
                    // 352:30: -> ^( METHODCALL IDENTIFIER ( arguments )? THIS )
                    {
                        dbg.location(352,33);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:352:33: ^( METHODCALL IDENTIFIER ( arguments )? THIS )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(352,35);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(METHODCALL, "METHODCALL"), root_1);

                        dbg.location(352,46);
                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        dbg.location(352,57);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:352:57: ( arguments )?
                        if ( stream_arguments.hasNext() ) {
                            dbg.location(352,57);
                            adaptor.addChild(root_1, stream_arguments.nextTree());

                        }
                        stream_arguments.reset();
                        dbg.location(352,68);
                        adaptor.addChild(root_1, (Object)adaptor.create(THIS, "THIS"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:353:7: IDENTIFIER '.' CLASS
                    {
                    dbg.location(353,7);
                    IDENTIFIER202=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary3016); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER202);

                    dbg.location(353,18);
                    char_literal203=(Token)match(input,107,FOLLOW_107_in_primary3018); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_107.add(char_literal203);

                    dbg.location(353,22);
                    CLASS204=(Token)match(input,CLASS,FOLLOW_CLASS_in_primary3020); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLASS.add(CLASS204);



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
                    // 353:28: -> ^( DOTCLASS IDENTIFIER )
                    {
                        dbg.location(353,31);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:353:31: ^( DOTCLASS IDENTIFIER )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(353,33);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DOTCLASS, "DOTCLASS"), root_1);

                        dbg.location(353,42);
                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:354:9: ( primitiveType -> primitiveType ) ( '[' ']' -> ^( ARRAYTYPE $primary) )* ( '.' CLASS -> ^( DOTCLASS $primary) )
                    {
                    dbg.location(354,9);
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:354:9: ( primitiveType -> primitiveType )
                    dbg.enterAlt(1);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:354:10: primitiveType
                    {
                    dbg.location(354,10);
                    pushFollow(FOLLOW_primitiveType_in_primary3039);
                    primitiveType205=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primitiveType.add(primitiveType205.getTree());


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
                    // 354:24: -> primitiveType
                    {
                        dbg.location(354,27);
                        adaptor.addChild(root_0, stream_primitiveType.nextTree());

                    }

                    retval.tree = root_0;}
                    }

                    dbg.location(354,42);
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:354:42: ( '[' ']' -> ^( ARRAYTYPE $primary) )*
                    try { dbg.enterSubRule(51);

                    loop51:
                    do {
                        int alt51=2;
                        try { dbg.enterDecision(51);

                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==90) ) {
                            alt51=1;
                        }


                        } finally {dbg.exitDecision(51);}

                        switch (alt51) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:354:43: '[' ']'
                    	    {
                    	    dbg.location(354,43);
                    	    char_literal206=(Token)match(input,90,FOLLOW_90_in_primary3047); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_90.add(char_literal206);

                    	    dbg.location(354,47);
                    	    char_literal207=(Token)match(input,91,FOLLOW_91_in_primary3049); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_91.add(char_literal207);



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
                    	    // 354:51: -> ^( ARRAYTYPE $primary)
                    	    {
                    	        dbg.location(354,54);
                    	        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:354:54: ^( ARRAYTYPE $primary)
                    	        {
                    	        Object root_1 = (Object)adaptor.nil();
                    	        dbg.location(354,56);
                    	        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAYTYPE, "ARRAYTYPE"), root_1);

                    	        dbg.location(354,66);
                    	        adaptor.addChild(root_1, stream_retval.nextTree());

                    	        adaptor.addChild(root_0, root_1);
                    	        }

                    	    }

                    	    retval.tree = root_0;}
                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(51);}

                    dbg.location(354,78);
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:354:78: ( '.' CLASS -> ^( DOTCLASS $primary) )
                    dbg.enterAlt(1);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:354:79: '.' CLASS
                    {
                    dbg.location(354,79);
                    char_literal208=(Token)match(input,107,FOLLOW_107_in_primary3063); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_107.add(char_literal208);

                    dbg.location(354,83);
                    CLASS209=(Token)match(input,CLASS,FOLLOW_CLASS_in_primary3065); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLASS.add(CLASS209);



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
                    // 354:89: -> ^( DOTCLASS $primary)
                    {
                        dbg.location(354,92);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:354:92: ^( DOTCLASS $primary)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(354,94);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DOTCLASS, "DOTCLASS"), root_1);

                        dbg.location(354,103);
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

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:355:9: VOID '.' CLASS
                    {
                    dbg.location(355,9);
                    VOID210=(Token)match(input,VOID,FOLLOW_VOID_in_primary3085); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VOID.add(VOID210);

                    dbg.location(355,14);
                    char_literal211=(Token)match(input,107,FOLLOW_107_in_primary3087); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_107.add(char_literal211);

                    dbg.location(355,18);
                    CLASS212=(Token)match(input,CLASS,FOLLOW_CLASS_in_primary3089); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLASS.add(CLASS212);



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
                    // 355:24: -> ^( DOTCLASS VOID )
                    {
                        dbg.location(355,27);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:355:27: ^( DOTCLASS VOID )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(355,29);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DOTCLASS, "DOTCLASS"), root_1);

                        dbg.location(355,38);
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
        dbg.location(356, 5);

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:358:1: selector[CommonTree primary] : ( '.' IDENTIFIER -> ^( FIELDACCESS IDENTIFIER ) | '.' IDENTIFIER arguments -> ^( METHODCALL IDENTIFIER ( arguments )? ) | '[' expression ']' -> ^( ARRAYACCESS expression ) );
    public final JaParser.selector_return selector(CommonTree primary) throws RecognitionException {
        JaParser.selector_return retval = new JaParser.selector_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal213=null;
        Token IDENTIFIER214=null;
        Token char_literal215=null;
        Token IDENTIFIER216=null;
        Token char_literal218=null;
        Token char_literal220=null;
        JaParser.arguments_return arguments217 = null;

        JaParser.expression_return expression219 = null;


        Object char_literal213_tree=null;
        Object IDENTIFIER214_tree=null;
        Object char_literal215_tree=null;
        Object IDENTIFIER216_tree=null;
        Object char_literal218_tree=null;
        Object char_literal220_tree=null;
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try { dbg.enterRule(getGrammarFileName(), "selector");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(358, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:359:5: ( '.' IDENTIFIER -> ^( FIELDACCESS IDENTIFIER ) | '.' IDENTIFIER arguments -> ^( METHODCALL IDENTIFIER ( arguments )? ) | '[' expression ']' -> ^( ARRAYACCESS expression ) )
            int alt53=3;
            try { dbg.enterDecision(53);

            int LA53_0 = input.LA(1);

            if ( (LA53_0==107) ) {
                int LA53_1 = input.LA(2);

                if ( (LA53_1==IDENTIFIER) ) {
                    int LA53_3 = input.LA(3);

                    if ( (LA53_3==92) ) {
                        alt53=2;
                    }
                    else if ( (LA53_3==EOF||(LA53_3>=INSTANCEOF && LA53_3<=COMPAREOP)||(LA53_3>=EQ && LA53_3<=SLASH)||LA53_3==86||(LA53_3>=88 && LA53_3<=91)||LA53_3==93||(LA53_3>=95 && LA53_3<=105)||LA53_3==107) ) {
                        alt53=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 53, 3, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else if ( (LA53_0==90) ) {
                alt53=3;
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

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:359:9: '.' IDENTIFIER
                    {
                    dbg.location(359,9);
                    char_literal213=(Token)match(input,107,FOLLOW_107_in_selector3122); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_107.add(char_literal213);

                    dbg.location(359,13);
                    IDENTIFIER214=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_selector3124); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER214);



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
                    // 359:24: -> ^( FIELDACCESS IDENTIFIER )
                    {
                        dbg.location(359,27);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:359:27: ^( FIELDACCESS IDENTIFIER )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(359,29);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FIELDACCESS, "FIELDACCESS"), root_1);

                        dbg.location(359,41);
                        adaptor.addChild(root_1, primary);
                        dbg.location(359,52);
                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:360:7: '.' IDENTIFIER arguments
                    {
                    dbg.location(360,7);
                    char_literal215=(Token)match(input,107,FOLLOW_107_in_selector3142); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_107.add(char_literal215);

                    dbg.location(360,11);
                    IDENTIFIER216=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_selector3144); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER216);

                    dbg.location(360,22);
                    pushFollow(FOLLOW_arguments_in_selector3146);
                    arguments217=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arguments.add(arguments217.getTree());


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
                    // 360:32: -> ^( METHODCALL IDENTIFIER ( arguments )? )
                    {
                        dbg.location(360,35);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:360:35: ^( METHODCALL IDENTIFIER ( arguments )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(360,37);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(METHODCALL, "METHODCALL"), root_1);

                        dbg.location(360,48);
                        adaptor.addChild(root_1, primary);
                        dbg.location(360,59);
                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        dbg.location(360,70);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:360:70: ( arguments )?
                        if ( stream_arguments.hasNext() ) {
                            dbg.location(360,70);
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

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:363:9: '[' expression ']'
                    {
                    dbg.location(363,9);
                    char_literal218=(Token)match(input,90,FOLLOW_90_in_selector3179); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_90.add(char_literal218);

                    dbg.location(363,13);
                    pushFollow(FOLLOW_expression_in_selector3181);
                    expression219=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression219.getTree());
                    dbg.location(363,24);
                    char_literal220=(Token)match(input,91,FOLLOW_91_in_selector3183); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_91.add(char_literal220);



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
                    // 363:27: -> ^( ARRAYACCESS expression )
                    {
                        dbg.location(363,30);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:363:30: ^( ARRAYACCESS expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(363,32);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAYACCESS, "ARRAYACCESS"), root_1);

                        dbg.location(363,44);
                        adaptor.addChild(root_1, primary);
                        dbg.location(363,55);
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
        dbg.location(364, 5);

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:378:1: creator : createdName ( arrayCreatorRest[(CommonTree)$createdName.tree] | classCreatorRest[(CommonTree)$createdName.tree] ) ;
    public final JaParser.creator_return creator() throws RecognitionException {
        JaParser.creator_return retval = new JaParser.creator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.createdName_return createdName221 = null;

        JaParser.arrayCreatorRest_return arrayCreatorRest222 = null;

        JaParser.classCreatorRest_return classCreatorRest223 = null;



        try { dbg.enterRule(getGrammarFileName(), "creator");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(378, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:379:5: ( createdName ( arrayCreatorRest[(CommonTree)$createdName.tree] | classCreatorRest[(CommonTree)$createdName.tree] ) )
            dbg.enterAlt(1);

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:379:7: createdName ( arrayCreatorRest[(CommonTree)$createdName.tree] | classCreatorRest[(CommonTree)$createdName.tree] )
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(379,18);
            pushFollow(FOLLOW_createdName_in_creator3212);
            createdName221=createdName();

            state._fsp--;
            if (state.failed) return retval;
            dbg.location(379,20);
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:379:20: ( arrayCreatorRest[(CommonTree)$createdName.tree] | classCreatorRest[(CommonTree)$createdName.tree] )
            int alt54=2;
            try { dbg.enterSubRule(54);
            try { dbg.enterDecision(54);

            int LA54_0 = input.LA(1);

            if ( (LA54_0==90) ) {
                alt54=1;
            }
            else if ( (LA54_0==92) ) {
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

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:379:21: arrayCreatorRest[(CommonTree)$createdName.tree]
                    {
                    dbg.location(379,21);
                    pushFollow(FOLLOW_arrayCreatorRest_in_creator3216);
                    arrayCreatorRest222=arrayCreatorRest((CommonTree)(createdName221!=null?((Object)createdName221.tree):null));

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayCreatorRest222.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:379:71: classCreatorRest[(CommonTree)$createdName.tree]
                    {
                    dbg.location(379,71);
                    pushFollow(FOLLOW_classCreatorRest_in_creator3221);
                    classCreatorRest223=classCreatorRest((CommonTree)(createdName221!=null?((Object)createdName221.tree):null));

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classCreatorRest223.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(54);}


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
        dbg.location(380, 5);

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:382:1: createdName : ( classType | primitiveType );
    public final JaParser.createdName_return createdName() throws RecognitionException {
        JaParser.createdName_return retval = new JaParser.createdName_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.classType_return classType224 = null;

        JaParser.primitiveType_return primitiveType225 = null;



        try { dbg.enterRule(getGrammarFileName(), "createdName");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(382, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:383:5: ( classType | primitiveType )
            int alt55=2;
            try { dbg.enterDecision(55);

            int LA55_0 = input.LA(1);

            if ( (LA55_0==IDENTIFIER) ) {
                alt55=1;
            }
            else if ( ((LA55_0>=CHAR && LA55_0<=DOUBLE)) ) {
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

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:383:9: classType
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(383,9);
                    pushFollow(FOLLOW_classType_in_createdName3243);
                    classType224=classType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classType224.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:384:9: primitiveType
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(384,9);
                    pushFollow(FOLLOW_primitiveType_in_createdName3253);
                    primitiveType225=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType225.getTree());

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
        dbg.location(385, 5);

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:387:1: arrayCreatorRest[CommonTree type] : ( ( '[' ']' -> ^( ARRAYTYPE ) ) ( ( '[' ']' ) -> ^( ARRAYTYPE $arrayCreatorRest) )* ( arrayInitializer -> $arrayCreatorRest arrayInitializer ) | ( '[' expression ']' -> ^( ARRAYTYPE expression ) ) ( ( '[' expression ']' ) -> ^( ARRAYTYPE $arrayCreatorRest expression ) )* );
    public final JaParser.arrayCreatorRest_return arrayCreatorRest(CommonTree type) throws RecognitionException {
        JaParser.arrayCreatorRest_return retval = new JaParser.arrayCreatorRest_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal226=null;
        Token char_literal227=null;
        Token char_literal228=null;
        Token char_literal229=null;
        Token char_literal231=null;
        Token char_literal233=null;
        Token char_literal234=null;
        Token char_literal236=null;
        JaParser.arrayInitializer_return arrayInitializer230 = null;

        JaParser.expression_return expression232 = null;

        JaParser.expression_return expression235 = null;


        Object char_literal226_tree=null;
        Object char_literal227_tree=null;
        Object char_literal228_tree=null;
        Object char_literal229_tree=null;
        Object char_literal231_tree=null;
        Object char_literal233_tree=null;
        Object char_literal234_tree=null;
        Object char_literal236_tree=null;
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleSubtreeStream stream_arrayInitializer=new RewriteRuleSubtreeStream(adaptor,"rule arrayInitializer");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try { dbg.enterRule(getGrammarFileName(), "arrayCreatorRest");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(387, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:388:5: ( ( '[' ']' -> ^( ARRAYTYPE ) ) ( ( '[' ']' ) -> ^( ARRAYTYPE $arrayCreatorRest) )* ( arrayInitializer -> $arrayCreatorRest arrayInitializer ) | ( '[' expression ']' -> ^( ARRAYTYPE expression ) ) ( ( '[' expression ']' ) -> ^( ARRAYTYPE $arrayCreatorRest expression ) )* )
            int alt58=2;
            try { dbg.enterDecision(58);

            int LA58_0 = input.LA(1);

            if ( (LA58_0==90) ) {
                int LA58_1 = input.LA(2);

                if ( (LA58_1==91) ) {
                    alt58=1;
                }
                else if ( (LA58_1==IDENTIFIER||LA58_1==VOID||(LA58_1>=CHAR && LA58_1<=NULLLITERAL)||LA58_1==NEW||(LA58_1>=PLUS && LA58_1<=MINUS)||LA58_1==92||(LA58_1>=104 && LA58_1<=106)) ) {
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

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:388:9: ( '[' ']' -> ^( ARRAYTYPE ) ) ( ( '[' ']' ) -> ^( ARRAYTYPE $arrayCreatorRest) )* ( arrayInitializer -> $arrayCreatorRest arrayInitializer )
                    {
                    dbg.location(388,9);
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:388:9: ( '[' ']' -> ^( ARRAYTYPE ) )
                    dbg.enterAlt(1);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:388:10: '[' ']'
                    {
                    dbg.location(388,10);
                    char_literal226=(Token)match(input,90,FOLLOW_90_in_arrayCreatorRest3278); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_90.add(char_literal226);

                    dbg.location(388,13);
                    char_literal227=(Token)match(input,91,FOLLOW_91_in_arrayCreatorRest3279); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_91.add(char_literal227);



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
                    // 388:17: -> ^( ARRAYTYPE )
                    {
                        dbg.location(388,20);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:388:20: ^( ARRAYTYPE )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(388,22);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAYTYPE, "ARRAYTYPE"), root_1);

                        dbg.location(388,33);
                        adaptor.addChild(root_1, type);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }

                    dbg.location(388,43);
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:388:43: ( ( '[' ']' ) -> ^( ARRAYTYPE $arrayCreatorRest) )*
                    try { dbg.enterSubRule(56);

                    loop56:
                    do {
                        int alt56=2;
                        try { dbg.enterDecision(56);

                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==90) ) {
                            alt56=1;
                        }


                        } finally {dbg.exitDecision(56);}

                        switch (alt56) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:388:45: ( '[' ']' )
                    	    {
                    	    dbg.location(388,45);
                    	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:388:45: ( '[' ']' )
                    	    dbg.enterAlt(1);

                    	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:388:46: '[' ']'
                    	    {
                    	    dbg.location(388,46);
                    	    char_literal228=(Token)match(input,90,FOLLOW_90_in_arrayCreatorRest3294); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_90.add(char_literal228);

                    	    dbg.location(388,50);
                    	    char_literal229=(Token)match(input,91,FOLLOW_91_in_arrayCreatorRest3296); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_91.add(char_literal229);


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
                    	    // 388:55: -> ^( ARRAYTYPE $arrayCreatorRest)
                    	    {
                    	        dbg.location(388,58);
                    	        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:388:58: ^( ARRAYTYPE $arrayCreatorRest)
                    	        {
                    	        Object root_1 = (Object)adaptor.nil();
                    	        dbg.location(388,60);
                    	        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAYTYPE, "ARRAYTYPE"), root_1);

                    	        dbg.location(388,70);
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

                    dbg.location(389,7);
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:389:7: ( arrayInitializer -> $arrayCreatorRest arrayInitializer )
                    dbg.enterAlt(1);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:389:8: arrayInitializer
                    {
                    dbg.location(389,8);
                    pushFollow(FOLLOW_arrayInitializer_in_arrayCreatorRest3319);
                    arrayInitializer230=arrayInitializer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arrayInitializer.add(arrayInitializer230.getTree());


                    // AST REWRITE
                    // elements: arrayCreatorRest, arrayInitializer
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 389:26: -> $arrayCreatorRest arrayInitializer
                    {
                        dbg.location(389,29);
                        adaptor.addChild(root_0, stream_retval.nextTree());
                        dbg.location(389,47);
                        adaptor.addChild(root_0, stream_arrayInitializer.nextTree());

                    }

                    retval.tree = root_0;}
                    }


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:390:7: ( '[' expression ']' -> ^( ARRAYTYPE expression ) ) ( ( '[' expression ']' ) -> ^( ARRAYTYPE $arrayCreatorRest expression ) )*
                    {
                    dbg.location(390,7);
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:390:7: ( '[' expression ']' -> ^( ARRAYTYPE expression ) )
                    dbg.enterAlt(1);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:390:8: '[' expression ']'
                    {
                    dbg.location(390,8);
                    char_literal231=(Token)match(input,90,FOLLOW_90_in_arrayCreatorRest3341); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_90.add(char_literal231);

                    dbg.location(390,12);
                    pushFollow(FOLLOW_expression_in_arrayCreatorRest3343);
                    expression232=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression232.getTree());
                    dbg.location(390,23);
                    char_literal233=(Token)match(input,91,FOLLOW_91_in_arrayCreatorRest3345); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_91.add(char_literal233);



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
                    // 390:27: -> ^( ARRAYTYPE expression )
                    {
                        dbg.location(390,30);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:390:30: ^( ARRAYTYPE expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(390,32);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAYTYPE, "ARRAYTYPE"), root_1);

                        dbg.location(390,43);
                        adaptor.addChild(root_1, type);
                        dbg.location(390,51);
                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }

                    dbg.location(390,64);
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:390:64: ( ( '[' expression ']' ) -> ^( ARRAYTYPE $arrayCreatorRest expression ) )*
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

                    	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:390:66: ( '[' expression ']' )
                    	    {
                    	    dbg.location(390,66);
                    	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:390:66: ( '[' expression ']' )
                    	    dbg.enterAlt(1);

                    	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:390:67: '[' expression ']'
                    	    {
                    	    dbg.location(390,67);
                    	    char_literal234=(Token)match(input,90,FOLLOW_90_in_arrayCreatorRest3362); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_90.add(char_literal234);

                    	    dbg.location(390,71);
                    	    pushFollow(FOLLOW_expression_in_arrayCreatorRest3364);
                    	    expression235=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression235.getTree());
                    	    dbg.location(390,82);
                    	    char_literal236=(Token)match(input,91,FOLLOW_91_in_arrayCreatorRest3366); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_91.add(char_literal236);


                    	    }



                    	    // AST REWRITE
                    	    // elements: arrayCreatorRest, expression
                    	    // token labels: 
                    	    // rule labels: retval
                    	    // token list labels: 
                    	    // rule list labels: 
                    	    // wildcard labels: 
                    	    if ( state.backtracking==0 ) {
                    	    retval.tree = root_0;
                    	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    	    root_0 = (Object)adaptor.nil();
                    	    // 390:87: -> ^( ARRAYTYPE $arrayCreatorRest expression )
                    	    {
                    	        dbg.location(390,90);
                    	        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:390:90: ^( ARRAYTYPE $arrayCreatorRest expression )
                    	        {
                    	        Object root_1 = (Object)adaptor.nil();
                    	        dbg.location(390,92);
                    	        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAYTYPE, "ARRAYTYPE"), root_1);

                    	        dbg.location(390,102);
                    	        adaptor.addChild(root_1, stream_retval.nextTree());
                    	        dbg.location(390,120);
                    	        adaptor.addChild(root_1, stream_expression.nextTree());

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
        dbg.location(391, 5);

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:393:1: classCreatorRest[CommonTree type] : arguments -> arguments ;
    public final JaParser.classCreatorRest_return classCreatorRest(CommonTree type) throws RecognitionException {
        JaParser.classCreatorRest_return retval = new JaParser.classCreatorRest_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.arguments_return arguments237 = null;


        RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");
        try { dbg.enterRule(getGrammarFileName(), "classCreatorRest");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(393, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:394:5: ( arguments -> arguments )
            dbg.enterAlt(1);

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:394:9: arguments
            {
            dbg.location(394,9);
            pushFollow(FOLLOW_arguments_in_classCreatorRest3404);
            arguments237=arguments();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_arguments.add(arguments237.getTree());


            // AST REWRITE
            // elements: arguments
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 394:19: -> arguments
            {
                dbg.location(394,22);
                adaptor.addChild(root_0, type);
                dbg.location(394,30);
                adaptor.addChild(root_0, stream_arguments.nextTree());

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
        dbg.location(395, 5);

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:397:1: superMemberAccess : ( '.' IDENTIFIER -> ^( FIELDACCESS SUPER IDENTIFIER ) | '.' IDENTIFIER arguments -> ^( METHODCALL SUPER IDENTIFIER ( arguments )? ) );
    public final JaParser.superMemberAccess_return superMemberAccess() throws RecognitionException {
        JaParser.superMemberAccess_return retval = new JaParser.superMemberAccess_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal238=null;
        Token IDENTIFIER239=null;
        Token char_literal240=null;
        Token IDENTIFIER241=null;
        JaParser.arguments_return arguments242 = null;


        Object char_literal238_tree=null;
        Object IDENTIFIER239_tree=null;
        Object char_literal240_tree=null;
        Object IDENTIFIER241_tree=null;
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");
        try { dbg.enterRule(getGrammarFileName(), "superMemberAccess");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(397, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:398:5: ( '.' IDENTIFIER -> ^( FIELDACCESS SUPER IDENTIFIER ) | '.' IDENTIFIER arguments -> ^( METHODCALL SUPER IDENTIFIER ( arguments )? ) )
            int alt59=2;
            try { dbg.enterDecision(59);

            int LA59_0 = input.LA(1);

            if ( (LA59_0==107) ) {
                int LA59_1 = input.LA(2);

                if ( (LA59_1==IDENTIFIER) ) {
                    int LA59_2 = input.LA(3);

                    if ( (LA59_2==92) ) {
                        alt59=2;
                    }
                    else if ( (LA59_2==EOF||(LA59_2>=INSTANCEOF && LA59_2<=COMPAREOP)||(LA59_2>=EQ && LA59_2<=SLASH)||LA59_2==86||(LA59_2>=88 && LA59_2<=91)||LA59_2==93||(LA59_2>=95 && LA59_2<=105)||LA59_2==107) ) {
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

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:398:7: '.' IDENTIFIER
                    {
                    dbg.location(398,7);
                    char_literal238=(Token)match(input,107,FOLLOW_107_in_superMemberAccess3434); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_107.add(char_literal238);

                    dbg.location(398,11);
                    IDENTIFIER239=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_superMemberAccess3436); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER239);



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
                    // 398:22: -> ^( FIELDACCESS SUPER IDENTIFIER )
                    {
                        dbg.location(398,25);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:398:25: ^( FIELDACCESS SUPER IDENTIFIER )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(398,27);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FIELDACCESS, "FIELDACCESS"), root_1);

                        dbg.location(398,39);
                        adaptor.addChild(root_1, (Object)adaptor.create(SUPER, "SUPER"));
                        dbg.location(398,45);
                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:399:9: '.' IDENTIFIER arguments
                    {
                    dbg.location(399,9);
                    char_literal240=(Token)match(input,107,FOLLOW_107_in_superMemberAccess3456); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_107.add(char_literal240);

                    dbg.location(399,13);
                    IDENTIFIER241=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_superMemberAccess3458); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER241);

                    dbg.location(399,24);
                    pushFollow(FOLLOW_arguments_in_superMemberAccess3460);
                    arguments242=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arguments.add(arguments242.getTree());


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
                    // 399:34: -> ^( METHODCALL SUPER IDENTIFIER ( arguments )? )
                    {
                        dbg.location(399,37);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:399:37: ^( METHODCALL SUPER IDENTIFIER ( arguments )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(399,40);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(METHODCALL, "METHODCALL"), root_1);

                        dbg.location(399,51);
                        adaptor.addChild(root_1, (Object)adaptor.create(SUPER, "SUPER"));
                        dbg.location(399,57);
                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        dbg.location(399,68);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:399:68: ( arguments )?
                        if ( stream_arguments.hasNext() ) {
                            dbg.location(399,68);
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
        dbg.location(400, 5);

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:402:1: arguments : ( '(' ')' | '(' expressionList ')' -> ^( ARGUMENTS expressionList ) );
    public final JaParser.arguments_return arguments() throws RecognitionException {
        JaParser.arguments_return retval = new JaParser.arguments_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal243=null;
        Token char_literal244=null;
        Token char_literal245=null;
        Token char_literal247=null;
        JaParser.expressionList_return expressionList246 = null;


        Object char_literal243_tree=null;
        Object char_literal244_tree=null;
        Object char_literal245_tree=null;
        Object char_literal247_tree=null;
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");
        try { dbg.enterRule(getGrammarFileName(), "arguments");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(402, 1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:403:5: ( '(' ')' | '(' expressionList ')' -> ^( ARGUMENTS expressionList ) )
            int alt60=2;
            try { dbg.enterDecision(60);

            int LA60_0 = input.LA(1);

            if ( (LA60_0==92) ) {
                int LA60_1 = input.LA(2);

                if ( (LA60_1==93) ) {
                    alt60=1;
                }
                else if ( (LA60_1==IDENTIFIER||LA60_1==VOID||(LA60_1>=CHAR && LA60_1<=NULLLITERAL)||LA60_1==NEW||(LA60_1>=PLUS && LA60_1<=MINUS)||LA60_1==92||(LA60_1>=104 && LA60_1<=106)) ) {
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

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:403:9: '(' ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(403,12);
                    char_literal243=(Token)match(input,92,FOLLOW_92_in_arguments3493); if (state.failed) return retval;
                    dbg.location(403,16);
                    char_literal244=(Token)match(input,93,FOLLOW_93_in_arguments3495); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:404:7: '(' expressionList ')'
                    {
                    dbg.location(404,7);
                    char_literal245=(Token)match(input,92,FOLLOW_92_in_arguments3504); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_92.add(char_literal245);

                    dbg.location(404,11);
                    pushFollow(FOLLOW_expressionList_in_arguments3506);
                    expressionList246=expressionList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expressionList.add(expressionList246.getTree());
                    dbg.location(404,26);
                    char_literal247=(Token)match(input,93,FOLLOW_93_in_arguments3508); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_93.add(char_literal247);



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
                    // 404:30: -> ^( ARGUMENTS expressionList )
                    {
                        dbg.location(404,33);
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:404:33: ^( ARGUMENTS expressionList )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(404,35);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGUMENTS, "ARGUMENTS"), root_1);

                        dbg.location(404,45);
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
        dbg.location(405, 5);

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
        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:250:7: ( ELSE )
        dbg.enterAlt(1);

        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:250:8: ELSE
        {
        dbg.location(250,8);
        match(input,ELSE,FOLLOW_ELSE_in_synpred2_Ja1927); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_Ja

    // $ANTLR start synpred3_Ja
    public final void synpred3_Ja_fragment() throws RecognitionException {   
        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:334:9: ( '(' primitiveType ')' )
        dbg.enterAlt(1);

        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:334:10: '(' primitiveType ')'
        {
        dbg.location(334,10);
        match(input,92,FOLLOW_92_in_synpred3_Ja2709); if (state.failed) return ;
        dbg.location(334,14);
        pushFollow(FOLLOW_primitiveType_in_synpred3_Ja2711);
        primitiveType();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(334,28);
        match(input,93,FOLLOW_93_in_synpred3_Ja2713); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_Ja

    // $ANTLR start synpred4_Ja
    public final void synpred4_Ja_fragment() throws RecognitionException {   
        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:337:9: ( '(' nonPrimitiveType ')' unaryExpressionNotPlusMinus )
        dbg.enterAlt(1);

        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:337:10: '(' nonPrimitiveType ')' unaryExpressionNotPlusMinus
        {
        dbg.location(337,10);
        match(input,92,FOLLOW_92_in_synpred4_Ja2757); if (state.failed) return ;
        dbg.location(337,14);
        pushFollow(FOLLOW_nonPrimitiveType_in_synpred4_Ja2759);
        nonPrimitiveType();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(337,32);
        match(input,93,FOLLOW_93_in_synpred4_Ja2762); if (state.failed) return ;
        dbg.location(337,36);
        pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_synpred4_Ja2764);
        unaryExpressionNotPlusMinus();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_Ja

    // Delegated rules

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


    protected DFA15 dfa15 = new DFA15(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA49 dfa49 = new DFA49(this);
    protected DFA52 dfa52 = new DFA52(this);
    static final String DFA15_eotS =
        "\12\uffff";
    static final String DFA15_eofS =
        "\2\uffff\7\11\1\uffff";
    static final String DFA15_minS =
        "\1\44\1\uffff\7\44\1\uffff";
    static final String DFA15_maxS =
        "\1\57\1\uffff\7\146\1\uffff";
    static final String DFA15_acceptS =
        "\1\uffff\1\1\7\uffff\1\2";
    static final String DFA15_specialS =
        "\12\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\1\4\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10",
            "",
            "\1\11\52\uffff\1\11\6\uffff\1\11\1\uffff\2\11\1\1\1\11\1\uffff"+
            "\12\11",
            "\1\11\52\uffff\1\11\6\uffff\1\11\1\uffff\2\11\1\1\1\11\1\uffff"+
            "\12\11",
            "\1\11\52\uffff\1\11\6\uffff\1\11\1\uffff\2\11\1\1\1\11\1\uffff"+
            "\12\11",
            "\1\11\52\uffff\1\11\6\uffff\1\11\1\uffff\2\11\1\1\1\11\1\uffff"+
            "\12\11",
            "\1\11\52\uffff\1\11\6\uffff\1\11\1\uffff\2\11\1\1\1\11\1\uffff"+
            "\12\11",
            "\1\11\52\uffff\1\11\6\uffff\1\11\1\uffff\2\11\1\1\1\11\1\uffff"+
            "\12\11",
            "\1\11\52\uffff\1\11\6\uffff\1\11\1\uffff\2\11\1\1\1\11\1\uffff"+
            "\12\11",
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
            return "142:1: type returns [Type t] : ( nonPrimitiveType | primitiveType );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA22_eotS =
        "\17\uffff";
    static final String DFA22_eofS =
        "\17\uffff";
    static final String DFA22_minS =
        "\11\44\1\133\2\uffff\1\133\2\44";
    static final String DFA22_maxS =
        "\1\57\10\136\1\133\2\uffff\1\133\2\136";
    static final String DFA22_acceptS =
        "\12\uffff\1\2\1\1\3\uffff";
    static final String DFA22_specialS =
        "\17\uffff}>";
    static final String[] DFA22_transitionS = {
            "\1\1\4\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10",
            "\1\13\65\uffff\1\11\3\uffff\1\12",
            "\1\13\65\uffff\1\14\3\uffff\1\12",
            "\1\13\65\uffff\1\14\3\uffff\1\12",
            "\1\13\65\uffff\1\14\3\uffff\1\12",
            "\1\13\65\uffff\1\14\3\uffff\1\12",
            "\1\13\65\uffff\1\14\3\uffff\1\12",
            "\1\13\65\uffff\1\14\3\uffff\1\12",
            "\1\13\65\uffff\1\14\3\uffff\1\12",
            "\1\15",
            "",
            "",
            "\1\16",
            "\1\13\65\uffff\1\11\3\uffff\1\12",
            "\1\13\65\uffff\1\14\3\uffff\1\12"
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
            return "184:1: formalParameterDecls[ArrayList<Type> args] : ( type variableDeclaratorId[(CommonTree)$type.tree] ( ',' formalParameterDecls[args] )? -> ^( FPARM variableDeclaratorId ) ( formalParameterDecls )? | type '...' variableDeclaratorId[(CommonTree)$type.tree] -> ^( FMULTPARM variableDeclaratorId ) );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA27_eotS =
        "\20\uffff";
    static final String DFA27_eofS =
        "\20\uffff";
    static final String DFA27_minS =
        "\11\44\1\uffff\1\44\1\uffff\1\133\2\44\1\133";
    static final String DFA27_maxS =
        "\1\152\10\153\1\uffff\1\152\1\uffff\1\133\2\153\1\133";
    static final String DFA27_acceptS =
        "\11\uffff\1\2\1\uffff\1\1\4\uffff";
    static final String DFA27_specialS =
        "\20\uffff}>";
    static final String[] DFA27_transitionS = {
            "\1\1\2\uffff\1\11\1\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\17\11"+
            "\3\uffff\1\11\15\uffff\2\11\4\uffff\2\11\4\uffff\1\11\13\uffff"+
            "\3\11",
            "\1\13\33\uffff\2\11\15\uffff\5\11\2\uffff\1\11\3\uffff\1\12"+
            "\1\uffff\1\11\2\uffff\13\11\1\uffff\1\11",
            "\1\13\65\uffff\1\14\20\uffff\1\11",
            "\1\13\65\uffff\1\14\20\uffff\1\11",
            "\1\13\65\uffff\1\14\20\uffff\1\11",
            "\1\13\65\uffff\1\14\20\uffff\1\11",
            "\1\13\65\uffff\1\14\20\uffff\1\11",
            "\1\13\65\uffff\1\14\20\uffff\1\11",
            "\1\13\65\uffff\1\14\20\uffff\1\11",
            "",
            "\1\11\2\uffff\1\11\1\uffff\21\11\10\uffff\1\11\15\uffff\2\11"+
            "\11\uffff\1\15\1\11\13\uffff\3\11",
            "",
            "\1\16",
            "\1\13\65\uffff\1\17\20\uffff\1\11",
            "\1\13\65\uffff\1\14\20\uffff\1\11",
            "\1\15"
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "222:1: blockStatement : ( localVariableDeclarationStatement | statement );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA35_eotS =
        "\20\uffff";
    static final String DFA35_eofS =
        "\20\uffff";
    static final String DFA35_minS =
        "\11\44\1\uffff\1\44\1\uffff\1\133\2\44\1\133";
    static final String DFA35_maxS =
        "\1\152\10\153\1\uffff\1\152\1\uffff\1\133\2\153\1\133";
    static final String DFA35_acceptS =
        "\11\uffff\1\2\1\uffff\1\1\4\uffff";
    static final String DFA35_specialS =
        "\20\uffff}>";
    static final String[] DFA35_transitionS = {
            "\1\1\2\uffff\1\11\1\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\12\11"+
            "\10\uffff\1\11\15\uffff\2\11\12\uffff\1\11\13\uffff\3\11",
            "\1\13\33\uffff\2\11\15\uffff\5\11\2\uffff\1\11\2\uffff\1\11"+
            "\1\12\1\uffff\1\11\2\uffff\13\11\1\uffff\1\11",
            "\1\13\65\uffff\1\14\20\uffff\1\11",
            "\1\13\65\uffff\1\14\20\uffff\1\11",
            "\1\13\65\uffff\1\14\20\uffff\1\11",
            "\1\13\65\uffff\1\14\20\uffff\1\11",
            "\1\13\65\uffff\1\14\20\uffff\1\11",
            "\1\13\65\uffff\1\14\20\uffff\1\11",
            "\1\13\65\uffff\1\14\20\uffff\1\11",
            "",
            "\1\11\2\uffff\1\11\1\uffff\21\11\10\uffff\1\11\15\uffff\2\11"+
            "\11\uffff\1\15\1\11\13\uffff\3\11",
            "",
            "\1\16",
            "\1\13\65\uffff\1\17\20\uffff\1\11",
            "\1\13\65\uffff\1\14\20\uffff\1\11",
            "\1\15"
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
            return "254:1: forInit : ( localVariableDeclaration | expressionList );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA49_eotS =
        "\44\uffff";
    static final String DFA49_eofS =
        "\16\uffff\1\4\25\uffff";
    static final String DFA49_minS =
        "\1\44\1\uffff\1\44\2\uffff\1\100\7\132\2\44\1\133\1\uffff\1\132"+
        "\17\uffff\1\132\1\uffff\1\133";
    static final String DFA49_maxS =
        "\1\152\1\uffff\1\152\2\uffff\10\153\1\152\1\153\1\133\1\uffff\1"+
        "\153\17\uffff\1\153\1\uffff\1\133";
    static final String DFA49_acceptS =
        "\1\uffff\1\1\1\uffff\1\4\1\5\13\uffff\1\2\1\uffff\17\3\1\uffff\1"+
        "\3\1\uffff";
    static final String DFA49_specialS =
        "\6\uffff\1\1\1\5\1\0\1\3\1\6\1\10\1\2\1\uffff\1\4\2\uffff\1\11\17"+
        "\uffff\1\7\2\uffff}>";
    static final String[] DFA49_transitionS = {
            "\1\4\2\uffff\1\4\1\uffff\21\4\10\uffff\1\3\31\uffff\1\2\15\uffff"+
            "\1\1",
            "",
            "\1\5\2\uffff\1\4\1\uffff\1\6\1\7\1\10\1\11\1\12\1\13\1\14\12"+
            "\4\10\uffff\1\4\15\uffff\2\4\12\uffff\1\4\13\uffff\3\4",
            "",
            "",
            "\2\4\15\uffff\5\4\6\uffff\1\15\1\uffff\1\4\1\16\1\uffff\13"+
            "\4\1\uffff\1\4",
            "\1\17\2\uffff\1\20\15\uffff\1\4",
            "\1\17\2\uffff\1\20\15\uffff\1\4",
            "\1\17\2\uffff\1\20\15\uffff\1\4",
            "\1\17\2\uffff\1\20\15\uffff\1\4",
            "\1\17\2\uffff\1\20\15\uffff\1\4",
            "\1\17\2\uffff\1\20\15\uffff\1\4",
            "\1\17\2\uffff\1\20\15\uffff\1\4",
            "\1\4\2\uffff\1\4\1\uffff\21\4\10\uffff\1\4\15\uffff\2\4\11"+
            "\uffff\1\21\1\4\13\uffff\3\4",
            "\1\30\2\uffff\1\40\1\uffff\1\31\1\32\1\33\1\34\1\35\1\36\1"+
            "\37\1\25\1\26\10\27\6\uffff\2\4\1\24\14\uffff\5\4\2\uffff\1"+
            "\4\1\uffff\4\4\1\23\1\4\1\uffff\13\4\1\22\1\4",
            "\1\41",
            "",
            "\1\43\2\uffff\1\42\15\uffff\1\4",
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
            "\1\17\2\uffff\1\42\15\uffff\1\4",
            "",
            "\1\21"
    };

    static final short[] DFA49_eot = DFA.unpackEncodedString(DFA49_eotS);
    static final short[] DFA49_eof = DFA.unpackEncodedString(DFA49_eofS);
    static final char[] DFA49_min = DFA.unpackEncodedStringToUnsignedChars(DFA49_minS);
    static final char[] DFA49_max = DFA.unpackEncodedStringToUnsignedChars(DFA49_maxS);
    static final short[] DFA49_accept = DFA.unpackEncodedString(DFA49_acceptS);
    static final short[] DFA49_special = DFA.unpackEncodedString(DFA49_specialS);
    static final short[][] DFA49_transition;

    static {
        int numStates = DFA49_transitionS.length;
        DFA49_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA49_transition[i] = DFA.unpackEncodedString(DFA49_transitionS[i]);
        }
    }

    class DFA49 extends DFA {

        public DFA49(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 49;
            this.eot = DFA49_eot;
            this.eof = DFA49_eof;
            this.min = DFA49_min;
            this.max = DFA49_max;
            this.accept = DFA49_accept;
            this.special = DFA49_special;
            this.transition = DFA49_transition;
        }
        public String getDescription() {
            return "332:1: unaryExpressionNotPlusMinus : ( '!' unaryExpression | ( '(' primitiveType ')' )=> '(' primitiveType ')' unaryExpression -> ^( CAST primitiveType unaryExpression ) | ( '(' nonPrimitiveType ')' unaryExpressionNotPlusMinus )=> '(' nonPrimitiveType ')' unaryExpressionNotPlusMinus -> ^( CAST nonPrimitiveType unaryExpressionNotPlusMinus ) | NEW creator | ( primary -> primary ) ( selector[(CommonTree)$unaryExpressionNotPlusMinus.tree] -> selector )* ( '++' -> ^( POSTINC $unaryExpressionNotPlusMinus) | '--' -> ^( POSTDEC $unaryExpressionNotPlusMinus) )? );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA49_8 = input.LA(1);

                         
                        int index49_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA49_8==90) ) {s = 15;}

                        else if ( (LA49_8==107) ) {s = 4;}

                        else if ( (LA49_8==93) && (synpred3_Ja())) {s = 16;}

                         
                        input.seek(index49_8);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA49_6 = input.LA(1);

                         
                        int index49_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA49_6==90) ) {s = 15;}

                        else if ( (LA49_6==93) && (synpred3_Ja())) {s = 16;}

                        else if ( (LA49_6==107) ) {s = 4;}

                         
                        input.seek(index49_6);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA49_12 = input.LA(1);

                         
                        int index49_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA49_12==90) ) {s = 15;}

                        else if ( (LA49_12==107) ) {s = 4;}

                        else if ( (LA49_12==93) && (synpred3_Ja())) {s = 16;}

                         
                        input.seek(index49_12);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA49_9 = input.LA(1);

                         
                        int index49_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA49_9==90) ) {s = 15;}

                        else if ( (LA49_9==107) ) {s = 4;}

                        else if ( (LA49_9==93) && (synpred3_Ja())) {s = 16;}

                         
                        input.seek(index49_9);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA49_14 = input.LA(1);

                         
                        int index49_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA49_14==EOF||(LA49_14>=INSTANCEOF && LA49_14<=COMPAREOP)||(LA49_14>=EQ && LA49_14<=SLASH)||LA49_14==86||(LA49_14>=88 && LA49_14<=91)||LA49_14==93||(LA49_14>=95 && LA49_14<=105)||LA49_14==107) ) {s = 4;}

                        else if ( (LA49_14==106) && (synpred4_Ja())) {s = 18;}

                        else if ( (LA49_14==92) && (synpred4_Ja())) {s = 19;}

                        else if ( (LA49_14==NEW) && (synpred4_Ja())) {s = 20;}

                        else if ( (LA49_14==THIS) && (synpred4_Ja())) {s = 21;}

                        else if ( (LA49_14==SUPER) && (synpred4_Ja())) {s = 22;}

                        else if ( ((LA49_14>=INTLITERAL && LA49_14<=NULLLITERAL)) && (synpred4_Ja())) {s = 23;}

                        else if ( (LA49_14==IDENTIFIER) && (synpred4_Ja())) {s = 24;}

                        else if ( (LA49_14==CHAR) && (synpred4_Ja())) {s = 25;}

                        else if ( (LA49_14==BYTE) && (synpred4_Ja())) {s = 26;}

                        else if ( (LA49_14==SHORT) && (synpred4_Ja())) {s = 27;}

                        else if ( (LA49_14==INT) && (synpred4_Ja())) {s = 28;}

                        else if ( (LA49_14==LONG) && (synpred4_Ja())) {s = 29;}

                        else if ( (LA49_14==FLOAT) && (synpred4_Ja())) {s = 30;}

                        else if ( (LA49_14==DOUBLE) && (synpred4_Ja())) {s = 31;}

                        else if ( (LA49_14==VOID) && (synpred4_Ja())) {s = 32;}

                         
                        input.seek(index49_14);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA49_7 = input.LA(1);

                         
                        int index49_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA49_7==90) ) {s = 15;}

                        else if ( (LA49_7==93) && (synpred3_Ja())) {s = 16;}

                        else if ( (LA49_7==107) ) {s = 4;}

                         
                        input.seek(index49_7);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA49_10 = input.LA(1);

                         
                        int index49_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA49_10==93) && (synpred3_Ja())) {s = 16;}

                        else if ( (LA49_10==90) ) {s = 15;}

                        else if ( (LA49_10==107) ) {s = 4;}

                         
                        input.seek(index49_10);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA49_33 = input.LA(1);

                         
                        int index49_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA49_33==93) && (synpred4_Ja())) {s = 34;}

                        else if ( (LA49_33==90) ) {s = 15;}

                        else if ( (LA49_33==107) ) {s = 4;}

                         
                        input.seek(index49_33);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA49_11 = input.LA(1);

                         
                        int index49_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA49_11==90) ) {s = 15;}

                        else if ( (LA49_11==107) ) {s = 4;}

                        else if ( (LA49_11==93) && (synpred3_Ja())) {s = 16;}

                         
                        input.seek(index49_11);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA49_17 = input.LA(1);

                         
                        int index49_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA49_17==93) && (synpred4_Ja())) {s = 34;}

                        else if ( (LA49_17==90) ) {s = 35;}

                        else if ( (LA49_17==107) ) {s = 4;}

                         
                        input.seek(index49_17);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 49, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA52_eotS =
        "\16\uffff";
    static final String DFA52_eofS =
        "\5\uffff\1\13\10\uffff";
    static final String DFA52_minS =
        "\1\44\4\uffff\1\100\2\uffff\1\43\1\uffff\1\44\3\uffff";
    static final String DFA52_maxS =
        "\1\134\4\uffff\1\153\2\uffff\1\44\1\uffff\1\152\3\uffff";
    static final String DFA52_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\11\1\12\1\uffff\1\7\1\uffff\1"+
        "\5\1\10\1\6";
    static final String DFA52_specialS =
        "\16\uffff}>";
    static final String[] DFA52_transitionS = {
            "\1\5\2\uffff\1\7\1\uffff\7\6\1\2\1\3\10\4\42\uffff\1\1",
            "",
            "",
            "",
            "",
            "\2\13\15\uffff\5\13\2\uffff\1\13\1\uffff\2\13\1\12\1\13\1\11"+
            "\1\13\1\uffff\13\13\1\uffff\1\10",
            "",
            "",
            "\1\14\1\13",
            "",
            "\1\13\2\uffff\1\13\1\uffff\21\13\10\uffff\1\13\15\uffff\2\13"+
            "\11\uffff\1\15\1\13\13\uffff\3\13",
            "",
            "",
            ""
    };

    static final short[] DFA52_eot = DFA.unpackEncodedString(DFA52_eotS);
    static final short[] DFA52_eof = DFA.unpackEncodedString(DFA52_eofS);
    static final char[] DFA52_min = DFA.unpackEncodedStringToUnsignedChars(DFA52_minS);
    static final char[] DFA52_max = DFA.unpackEncodedStringToUnsignedChars(DFA52_maxS);
    static final short[] DFA52_accept = DFA.unpackEncodedString(DFA52_acceptS);
    static final short[] DFA52_special = DFA.unpackEncodedString(DFA52_specialS);
    static final short[][] DFA52_transition;

    static {
        int numStates = DFA52_transitionS.length;
        DFA52_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA52_transition[i] = DFA.unpackEncodedString(DFA52_transitionS[i]);
        }
    }

    class DFA52 extends DFA {

        public DFA52(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 52;
            this.eot = DFA52_eot;
            this.eof = DFA52_eof;
            this.min = DFA52_min;
            this.max = DFA52_max;
            this.accept = DFA52_accept;
            this.special = DFA52_special;
            this.transition = DFA52_transition;
        }
        public String getDescription() {
            return "345:1: primary : ( parExpression | THIS | SUPER superMemberAccess | literal | IDENTIFIER | ( IDENTIFIER -> IDENTIFIER ) ( '[' ']' -> ^( ARRAYTYPE $primary) )+ ( '.' CLASS -> ^( DOTCLASS $primary) ) | IDENTIFIER arguments -> ^( METHODCALL IDENTIFIER ( arguments )? THIS ) | IDENTIFIER '.' CLASS -> ^( DOTCLASS IDENTIFIER ) | ( primitiveType -> primitiveType ) ( '[' ']' -> ^( ARRAYTYPE $primary) )* ( '.' CLASS -> ^( DOTCLASS $primary) ) | VOID '.' CLASS -> ^( DOTCLASS VOID ) );";
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
    public static final BitSet FOLLOW_classBody_in_classDeclaration231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PUBLIC_in_classModifier250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_classBody271 = new BitSet(new long[]{0x0000014000000000L,0x0000000001400000L});
    public static final BitSet FOLLOW_classBodyDeclaration_in_classBody274 = new BitSet(new long[]{0x0000014000000000L,0x0000000001400000L});
    public static final BitSet FOLLOW_88_in_classBody277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_classBodyDeclaration297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_memberDeclaration_in_classBodyDeclaration308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifier_in_memberDeclaration332 = new BitSet(new long[]{0x0000FE1000000000L});
    public static final BitSet FOLLOW_type_in_memberDeclaration334 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_methodDeclaration_in_memberDeclaration351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldDeclaration_in_memberDeclaration373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifier_in_memberDeclaration404 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_VOID_in_memberDeclaration406 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_memberDeclaration408 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_voidMethodDeclaratorRest_in_memberDeclaration410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifier_in_memberDeclaration447 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_memberDeclaration457 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_formalParameters_in_memberDeclaration459 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_constructorBody_in_memberDeclaration461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_methodDeclaration510 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_formalParameters_in_methodDeclaration512 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_methodBody_in_methodDeclaration514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclarator_in_fieldDeclaration544 = new BitSet(new long[]{0x0000000000000000L,0x0000000002400000L});
    public static final BitSet FOLLOW_89_in_fieldDeclaration564 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_variableDeclarator_in_fieldDeclaration568 = new BitSet(new long[]{0x0000000000000000L,0x0000000002400000L});
    public static final BitSet FOLLOW_86_in_fieldDeclaration585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formalParameters_in_voidMethodDeclaratorRest628 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_methodBody_in_voidMethodDeclaratorRest630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_variableDeclarator656 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_EQ_in_variableDeclarator662 = new BitSet(new long[]{0x03FFFE9000000000L,0x0000070010830004L});
    public static final BitSet FOLLOW_variableInitializer_in_variableDeclarator665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_variableDeclaratorId698 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_variableDeclaratorId709 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_variableDeclaratorId711 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_arrayInitializer_in_variableInitializer764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_variableInitializer774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_arrayInitializer801 = new BitSet(new long[]{0x03FFFE9000000000L,0x0000070011830004L});
    public static final BitSet FOLLOW_variableInitializer_in_arrayInitializer804 = new BitSet(new long[]{0x0000000000000000L,0x0000000003000000L});
    public static final BitSet FOLLOW_89_in_arrayInitializer807 = new BitSet(new long[]{0x03FFFE9000000000L,0x0000070010830004L});
    public static final BitSet FOLLOW_variableInitializer_in_arrayInitializer809 = new BitSet(new long[]{0x0000000000000000L,0x0000000003000000L});
    public static final BitSet FOLLOW_89_in_arrayInitializer814 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_arrayInitializer821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PUBLIC_in_modifier858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIVATE_in_modifier871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_typeName892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonPrimitiveType_in_type913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_type923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classType_in_nonPrimitiveType950 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_nonPrimitiveType969 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_nonPrimitiveType971 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_primitiveType_in_nonPrimitiveType1000 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_nonPrimitiveType1011 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_nonPrimitiveType1013 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classType1050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_primitiveType1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BYTE_in_primitiveType1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHORT_in_primitiveType1103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_primitiveType1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_in_primitiveType1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_primitiveType1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_primitiveType1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_formalParameters1192 = new BitSet(new long[]{0x0000FE1000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_formalParameterDecls_in_formalParameters1194 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_formalParameters1198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_formalParameterDecls1251 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_formalParameterDecls1253 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_formalParameterDecls1257 = new BitSet(new long[]{0x0000FE1000000000L});
    public static final BitSet FOLLOW_formalParameterDecls_in_formalParameterDecls1259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_formalParameterDecls1301 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_formalParameterDecls1303 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_formalParameterDecls1305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_methodBody1337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_constructorBody1366 = new BitSet(new long[]{0x7FFFFE9000000000L,0x0000070011C30004L});
    public static final BitSet FOLLOW_explicitConstructorInvocation_in_constructorBody1368 = new BitSet(new long[]{0x7FFFFE9000000000L,0x0000070011C30004L});
    public static final BitSet FOLLOW_blockStatement_in_constructorBody1371 = new BitSet(new long[]{0x7FFFFE9000000000L,0x0000070011C30004L});
    public static final BitSet FOLLOW_88_in_constructorBody1374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_explicitConstructorInvocation1407 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_SUPER_in_explicitConstructorInvocation1417 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_arguments_in_explicitConstructorInvocation1425 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_explicitConstructorInvocation1427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_literal0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_block1551 = new BitSet(new long[]{0x7FFFFE9000000000L,0x0000070011C30004L});
    public static final BitSet FOLLOW_blockStatement_in_block1554 = new BitSet(new long[]{0x7FFFFE9000000000L,0x0000070011C30004L});
    public static final BitSet FOLLOW_88_in_block1557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localVariableDeclarationStatement_in_blockStatement1581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_blockStatement1591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localVariableDeclaration_in_localVariableDeclarationStatement1612 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_localVariableDeclarationStatement1614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_localVariableDeclaration1632 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_variableDeclarator_in_localVariableDeclaration1634 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_localVariableDeclaration1638 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_variableDeclarator_in_localVariableDeclaration1640 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_block_in_statement1681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_statement1699 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_parExpression_in_statement1701 = new BitSet(new long[]{0x7FFFFE9000000000L,0x0000070010C30004L});
    public static final BitSet FOLLOW_statement_in_statement1703 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_elseStmt_in_statement1705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_statement1736 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_statement1738 = new BitSet(new long[]{0x03FFFE9000000000L,0x0000070010C30004L});
    public static final BitSet FOLLOW_forInit_in_statement1740 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_statement1743 = new BitSet(new long[]{0x03FFFE9000000000L,0x0000070010C30004L});
    public static final BitSet FOLLOW_expression_in_statement1745 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_statement1748 = new BitSet(new long[]{0x03FFFE9000000000L,0x0000070030830004L});
    public static final BitSet FOLLOW_forUpdate_in_statement1750 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_statement1753 = new BitSet(new long[]{0x7FFFFE9000000000L,0x0000070010C30004L});
    public static final BitSet FOLLOW_statement_in_statement1755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_statement1806 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_parExpression_in_statement1808 = new BitSet(new long[]{0x7FFFFE9000000000L,0x0000070010C30004L});
    public static final BitSet FOLLOW_statement_in_statement1810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_statement1834 = new BitSet(new long[]{0x7FFFFE9000000000L,0x0000070010C30004L});
    public static final BitSet FOLLOW_statement_in_statement1836 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_WHILE_in_statement1838 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_parExpression_in_statement1840 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_statement1842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_statement1866 = new BitSet(new long[]{0x03FFFE9000000000L,0x0000070010C30004L});
    public static final BitSet FOLLOW_expression_in_statement1869 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_statement1872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_statement1883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementExpression_in_statement1895 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_statement1897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_elseStmt1932 = new BitSet(new long[]{0x7FFFFE9000000000L,0x0000070010C30004L});
    public static final BitSet FOLLOW_statement_in_elseStmt1935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localVariableDeclaration_in_forInit1960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionList_in_forInit1970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionList_in_forUpdate1989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_parExpression2008 = new BitSet(new long[]{0x03FFFE9000000000L,0x0000070010830004L});
    public static final BitSet FOLLOW_expression_in_parExpression2011 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_parExpression2013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionList2037 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_expressionList2040 = new BitSet(new long[]{0x03FFFE9000000000L,0x0000070010830004L});
    public static final BitSet FOLLOW_expression_in_expressionList2043 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_expression_in_statementExpression2064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_constantExpression2087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orExpression_in_expression2109 = new BitSet(new long[]{0x0000000000000002L,0x0000000780008000L});
    public static final BitSet FOLLOW_assignmentOperator_in_expression2115 = new BitSet(new long[]{0x03FFFE9000000000L,0x0000070010830004L});
    public static final BitSet FOLLOW_expression_in_expression2117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_assignmentOperator2297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_assignmentOperator2310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_assignmentOperator2322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_assignmentOperator2334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_assignmentOperator2346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andExpression_in_orExpression2367 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_orExpression2371 = new BitSet(new long[]{0x03FFFE9000000000L,0x0000070010830004L});
    public static final BitSet FOLLOW_andExpression_in_orExpression2374 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000000L});
    public static final BitSet FOLLOW_equalityExpression_in_andExpression2396 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
    public static final BitSet FOLLOW_100_in_andExpression2400 = new BitSet(new long[]{0x03FFFE9000000000L,0x0000070010830004L});
    public static final BitSet FOLLOW_equalityExpression_in_andExpression2403 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
    public static final BitSet FOLLOW_instanceOfExpression_in_equalityExpression2425 = new BitSet(new long[]{0x0000000000000002L,0x0000006000000000L});
    public static final BitSet FOLLOW_set_in_equalityExpression2429 = new BitSet(new long[]{0x03FFFE9000000000L,0x0000070010830004L});
    public static final BitSet FOLLOW_instanceOfExpression_in_equalityExpression2438 = new BitSet(new long[]{0x0000000000000002L,0x0000006000000000L});
    public static final BitSet FOLLOW_relationalExpression_in_instanceOfExpression2460 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_INSTANCEOF_in_instanceOfExpression2463 = new BitSet(new long[]{0x0000FE1000000000L});
    public static final BitSet FOLLOW_type_in_instanceOfExpression2466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression2487 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_COMPAREOP_in_relationalExpression2491 = new BitSet(new long[]{0x03FFFE9000000000L,0x0000070010830004L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression2494 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression2516 = new BitSet(new long[]{0x0000000000000002L,0x0000000000030000L});
    public static final BitSet FOLLOW_set_in_additiveExpression2520 = new BitSet(new long[]{0x03FFFE9000000000L,0x0000070010830004L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression2529 = new BitSet(new long[]{0x0000000000000002L,0x0000000000030000L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression2551 = new BitSet(new long[]{0x0000000000000002L,0x00000080000C0000L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression2555 = new BitSet(new long[]{0x03FFFE9000000000L,0x0000070010830004L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression2570 = new BitSet(new long[]{0x0000000000000002L,0x00000080000C0000L});
    public static final BitSet FOLLOW_PLUS_in_unaryExpression2596 = new BitSet(new long[]{0x03FFFE9000000000L,0x0000070010830004L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression2598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unaryExpression2618 = new BitSet(new long[]{0x03FFFE9000000000L,0x0000070010830004L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression2620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_unaryExpression2638 = new BitSet(new long[]{0x03FFFE9000000000L,0x0000070010830004L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression2640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_unaryExpression2658 = new BitSet(new long[]{0x03FFFE9000000000L,0x0000070010830004L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression2660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression2678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_unaryExpressionNotPlusMinus2695 = new BitSet(new long[]{0x03FFFE9000000000L,0x0000070010830004L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus2698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_unaryExpressionNotPlusMinus2719 = new BitSet(new long[]{0x0000FE1000000000L});
    public static final BitSet FOLLOW_primitiveType_in_unaryExpressionNotPlusMinus2721 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_unaryExpressionNotPlusMinus2723 = new BitSet(new long[]{0x03FFFE9000000000L,0x0000070010830004L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus2725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_unaryExpressionNotPlusMinus2769 = new BitSet(new long[]{0x0000FE1000000000L});
    public static final BitSet FOLLOW_nonPrimitiveType_in_unaryExpressionNotPlusMinus2771 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_unaryExpressionNotPlusMinus2774 = new BitSet(new long[]{0x03FFFE9000000000L,0x0000070010830004L});
    public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpressionNotPlusMinus2776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_unaryExpressionNotPlusMinus2802 = new BitSet(new long[]{0x0000FE1000000000L});
    public static final BitSet FOLLOW_creator_in_unaryExpressionNotPlusMinus2805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_in_unaryExpressionNotPlusMinus2816 = new BitSet(new long[]{0x0000000000000002L,0x00000B0004000000L});
    public static final BitSet FOLLOW_selector_in_unaryExpressionNotPlusMinus2825 = new BitSet(new long[]{0x0000000000000002L,0x00000B0004000000L});
    public static final BitSet FOLLOW_104_in_unaryExpressionNotPlusMinus2842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_unaryExpressionNotPlusMinus2855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parExpression_in_primary2892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_primary2902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUPER_in_primary2913 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_superMemberAccess_in_primary2916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primary2926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_primary2936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_primary2947 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_primary2955 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_primary2957 = new BitSet(new long[]{0x0000000000000000L,0x0000080004000000L});
    public static final BitSet FOLLOW_107_in_primary2971 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_CLASS_in_primary2973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_primary2992 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_arguments_in_primary2995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_primary3016 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_primary3018 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_CLASS_in_primary3020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_primary3039 = new BitSet(new long[]{0x0000000000000000L,0x0000080004000000L});
    public static final BitSet FOLLOW_90_in_primary3047 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_primary3049 = new BitSet(new long[]{0x0000000000000000L,0x0000080004000000L});
    public static final BitSet FOLLOW_107_in_primary3063 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_CLASS_in_primary3065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_primary3085 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_primary3087 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_CLASS_in_primary3089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_selector3122 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_selector3124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_selector3142 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_selector3144 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_arguments_in_selector3146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_selector3179 = new BitSet(new long[]{0x03FFFE9000000000L,0x0000070010830004L});
    public static final BitSet FOLLOW_expression_in_selector3181 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_selector3183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createdName_in_creator3212 = new BitSet(new long[]{0x0000000000000000L,0x0000000014000000L});
    public static final BitSet FOLLOW_arrayCreatorRest_in_creator3216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classCreatorRest_in_creator3221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classType_in_createdName3243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_createdName3253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_arrayCreatorRest3278 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_arrayCreatorRest3279 = new BitSet(new long[]{0x0000000000000000L,0x0000000004800000L});
    public static final BitSet FOLLOW_90_in_arrayCreatorRest3294 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_arrayCreatorRest3296 = new BitSet(new long[]{0x0000000000000000L,0x0000000004800000L});
    public static final BitSet FOLLOW_arrayInitializer_in_arrayCreatorRest3319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_arrayCreatorRest3341 = new BitSet(new long[]{0x03FFFE9000000000L,0x0000070010830004L});
    public static final BitSet FOLLOW_expression_in_arrayCreatorRest3343 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_arrayCreatorRest3345 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_arrayCreatorRest3362 = new BitSet(new long[]{0x03FFFE9000000000L,0x0000070010830004L});
    public static final BitSet FOLLOW_expression_in_arrayCreatorRest3364 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_arrayCreatorRest3366 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_arguments_in_classCreatorRest3404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_superMemberAccess3434 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_superMemberAccess3436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_superMemberAccess3456 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_superMemberAccess3458 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_arguments_in_superMemberAccess3460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_arguments3493 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_arguments3495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_arguments3504 = new BitSet(new long[]{0x03FFFE9000000000L,0x0000070010830004L});
    public static final BitSet FOLLOW_expressionList_in_arguments3506 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_arguments3508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_synpred2_Ja1927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_synpred3_Ja2709 = new BitSet(new long[]{0x0000FE1000000000L});
    public static final BitSet FOLLOW_primitiveType_in_synpred3_Ja2711 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_synpred3_Ja2713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_synpred4_Ja2757 = new BitSet(new long[]{0x0000FE1000000000L});
    public static final BitSet FOLLOW_nonPrimitiveType_in_synpred4_Ja2759 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_synpred4_Ja2762 = new BitSet(new long[]{0x03FFFE9000000000L,0x0000070010830004L});
    public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_synpred4_Ja2764 = new BitSet(new long[]{0x0000000000000002L});

}