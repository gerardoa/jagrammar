// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g 2010-07-04 17:41:30

	package jagrammar;
	
	import jagrammar.typehierarchy.*;
	import java.util.Queue;
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
    public String getGrammarFileName() { return "C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g"; }


    	private Queue<String> todo;
    	private Map<String, ReferenceType> cTab;
    	private ReferenceType rt;
    	
    	public void setQueue(Queue<String> q){
            	todo = q;
        	}
        	
        	public void setClassTable(Map<String, ReferenceType> m){
            	cTab = m;
        	}
        	
        	public ReferenceType getReferenceType() {
        		return rt;
        	}
        	
        	private ComplexType createArrayType(Type t, int dim) {
        		for(int i=0; i < dim; i++) {
        			t = new ArrayType(t);
        		}
        		// siamo sicuri che per BasicType dim  > 0 dunque entra nel for
        		return (ComplexType)t;
        	}


    public static class compilationUnit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "compilationUnit"
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:49:1: compilationUnit : ( classDeclaration | ';' );
    public final JaParser.compilationUnit_return compilationUnit() throws RecognitionException {
        JaParser.compilationUnit_return retval = new JaParser.compilationUnit_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal2=null;
        JaParser.classDeclaration_return classDeclaration1 = null;


        Object char_literal2_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:50:5: ( classDeclaration | ';' )
            int alt1=2;
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

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:50:8: classDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_classDeclaration_in_compilationUnit119);
                    classDeclaration1=classDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(classDeclaration1.getTree(), root_0);

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:51:7: ';'
                    {
                    root_0 = (Object)adaptor.nil();

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
        return retval;
    }
    // $ANTLR end "compilationUnit"

    public static class classDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classDeclaration"
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:54:1: classDeclaration : classModifier CLASS IDENTIFIER ( EXTENDS type )? classBody ;
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

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:55:5: ( classModifier CLASS IDENTIFIER ( EXTENDS type )? classBody )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:55:9: classModifier CLASS IDENTIFIER ( EXTENDS type )? classBody
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_classModifier_in_classDeclaration152);
            classModifier3=classModifier();

            state._fsp--;
            if (state.failed) return retval;
            CLASS4=(Token)match(input,CLASS,FOLLOW_CLASS_in_classDeclaration155); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CLASS4_tree = (Object)adaptor.create(CLASS4);
            root_0 = (Object)adaptor.becomeRoot(CLASS4_tree, root_0);
            }
            IDENTIFIER5=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classDeclaration158); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER5_tree = (Object)adaptor.create(IDENTIFIER5);
            adaptor.addChild(root_0, IDENTIFIER5_tree);
            }
            if ( state.backtracking==0 ) {
               if(cTab.containsKey((IDENTIFIER5!=null?IDENTIFIER5.getText():null))) {
                  						 rt = cTab.get((IDENTIFIER5!=null?IDENTIFIER5.getText():null));
                  					   } else {
                  					   	rt = new ReferenceType((IDENTIFIER5!=null?IDENTIFIER5.getText():null));
                  					   	cTab.put((IDENTIFIER5!=null?IDENTIFIER5.getText():null), rt);
                  					   }
                  					 
            }
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:62:10: ( EXTENDS type )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==EXTENDS) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:62:11: EXTENDS type
                    {
                    EXTENDS6=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_classDeclaration172); if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_classDeclaration175);
                    type7=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type7.getTree());
                    if ( state.backtracking==0 ) {
                      if(cTab.containsKey((type7!=null?input.toString(type7.start,type7.stop):null))) {
                      	        			rt.addSuperType(cTab.get((type7!=null?input.toString(type7.start,type7.stop):null)));
                              			} else {
                              				ReferenceType superRt = new ReferenceType((type7!=null?input.toString(type7.start,type7.stop):null));
                              				rt.addSuperType(superRt);
                              				cTab.put((type7!=null?input.toString(type7.start,type7.stop):null), superRt);
                              				todo.add((type7!=null?input.toString(type7.start,type7.stop):null));	
                              			}
                              		
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_classBody_in_classDeclaration189);
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:74:1: classModifier : PUBLIC ;
    public final JaParser.classModifier_return classModifier() throws RecognitionException {
        JaParser.classModifier_return retval = new JaParser.classModifier_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PUBLIC9=null;

        Object PUBLIC9_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:75:5: ( PUBLIC )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:76:9: PUBLIC
            {
            root_0 = (Object)adaptor.nil();

            PUBLIC9=(Token)match(input,PUBLIC,FOLLOW_PUBLIC_in_classModifier216); if (state.failed) return retval;
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:83:1: classBody : '{' ( classBodyDeclaration )* '}' ;
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
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:84:5: ( '{' ( classBodyDeclaration )* '}' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:84:9: '{' ( classBodyDeclaration )* '}'
            {
            root_0 = (Object)adaptor.nil();

            char_literal10=(Token)match(input,76,FOLLOW_76_in_classBody245); if (state.failed) return retval;
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:84:14: ( classBodyDeclaration )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==PUBLIC||LA3_0==PRIVATE||LA3_0==75) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:84:14: classBodyDeclaration
            	    {
            	    pushFollow(FOLLOW_classBodyDeclaration_in_classBody248);
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

            char_literal12=(Token)match(input,77,FOLLOW_77_in_classBody251); if (state.failed) return retval;

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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:87:1: classBodyDeclaration : ( ';' | memberDeclaration );
    public final JaParser.classBodyDeclaration_return classBodyDeclaration() throws RecognitionException {
        JaParser.classBodyDeclaration_return retval = new JaParser.classBodyDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal13=null;
        JaParser.memberDeclaration_return memberDeclaration14 = null;


        Object char_literal13_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:88:5: ( ';' | memberDeclaration )
            int alt4=2;
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

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:88:9: ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal13=(Token)match(input,75,FOLLOW_75_in_classBodyDeclaration271); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:89:9: memberDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_memberDeclaration_in_classBodyDeclaration282);
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:92:1: memberDeclaration : ( ( modifier type -> modifier type ) ( methodDeclaration -> ^( METHOD $memberDeclaration methodDeclaration ) | fieldDeclaration[(CommonTree)$memberDeclaration.tree] -> fieldDeclaration ) | modifier VOID IDENTIFIER voidMethodDeclaratorRest -> ^( METHOD modifier VOID IDENTIFIER voidMethodDeclaratorRest ) | modifier ( IDENTIFIER formalParameters )=> IDENTIFIER formalParameters constructorBody -> ^( CONSTR modifier IDENTIFIER formalParameters constructorBody ) );
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
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:93:5: ( ( modifier type -> modifier type ) ( methodDeclaration -> ^( METHOD $memberDeclaration methodDeclaration ) | fieldDeclaration[(CommonTree)$memberDeclaration.tree] -> fieldDeclaration ) | modifier VOID IDENTIFIER voidMethodDeclaratorRest -> ^( METHOD modifier VOID IDENTIFIER voidMethodDeclaratorRest ) | modifier ( IDENTIFIER formalParameters )=> IDENTIFIER formalParameters constructorBody -> ^( CONSTR modifier IDENTIFIER formalParameters constructorBody ) )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==PUBLIC||LA6_0==PRIVATE) ) {
                switch ( input.LA(2) ) {
                case IDENTIFIER:
                    {
                    int LA6_2 = input.LA(3);

                    if ( (LA6_2==81) ) {
                        alt6=3;
                    }
                    else if ( (LA6_2==IDENTIFIER||LA6_2==79) ) {
                        alt6=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 2, input);

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
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:93:9: ( modifier type -> modifier type ) ( methodDeclaration -> ^( METHOD $memberDeclaration methodDeclaration ) | fieldDeclaration[(CommonTree)$memberDeclaration.tree] -> fieldDeclaration )
                    {
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:93:9: ( modifier type -> modifier type )
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:93:10: modifier type
                    {
                    pushFollow(FOLLOW_modifier_in_memberDeclaration306);
                    modifier15=modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_modifier.add(modifier15.getTree());
                    pushFollow(FOLLOW_type_in_memberDeclaration308);
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
                    // 93:24: -> modifier type
                    {
                        adaptor.addChild(root_0, stream_modifier.nextTree());
                        adaptor.addChild(root_0, stream_type.nextTree());

                    }

                    retval.tree = root_0;}
                    }

                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:93:41: ( methodDeclaration -> ^( METHOD $memberDeclaration methodDeclaration ) | fieldDeclaration[(CommonTree)$memberDeclaration.tree] -> fieldDeclaration )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==IDENTIFIER) ) {
                        int LA5_1 = input.LA(2);

                        if ( (LA5_1==EQ||LA5_1==75||(LA5_1>=78 && LA5_1<=79)) ) {
                            alt5=2;
                        }
                        else if ( (LA5_1==81) ) {
                            alt5=1;
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
                            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:93:42: methodDeclaration
                            {
                            pushFollow(FOLLOW_methodDeclaration_in_memberDeclaration317);
                            methodDeclaration17=methodDeclaration();

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
                            // 93:60: -> ^( METHOD $memberDeclaration methodDeclaration )
                            {
                                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:93:63: ^( METHOD $memberDeclaration methodDeclaration )
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
                            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:94:12: fieldDeclaration[(CommonTree)$memberDeclaration.tree]
                            {
                            pushFollow(FOLLOW_fieldDeclaration_in_memberDeclaration341);
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
                            // 94:66: -> fieldDeclaration
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
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:96:9: modifier VOID IDENTIFIER voidMethodDeclaratorRest
                    {
                    pushFollow(FOLLOW_modifier_in_memberDeclaration368);
                    modifier19=modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_modifier.add(modifier19.getTree());
                    VOID20=(Token)match(input,VOID,FOLLOW_VOID_in_memberDeclaration370); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VOID.add(VOID20);

                    IDENTIFIER21=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_memberDeclaration372); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER21);

                    pushFollow(FOLLOW_voidMethodDeclaratorRest_in_memberDeclaration374);
                    voidMethodDeclaratorRest22=voidMethodDeclaratorRest();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_voidMethodDeclaratorRest.add(voidMethodDeclaratorRest22.getTree());


                    // AST REWRITE
                    // elements: modifier, voidMethodDeclaratorRest, VOID, IDENTIFIER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 96:59: -> ^( METHOD modifier VOID IDENTIFIER voidMethodDeclaratorRest )
                    {
                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:96:62: ^( METHOD modifier VOID IDENTIFIER voidMethodDeclaratorRest )
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
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:97:9: modifier ( IDENTIFIER formalParameters )=> IDENTIFIER formalParameters constructorBody
                    {
                    pushFollow(FOLLOW_modifier_in_memberDeclaration398);
                    modifier23=modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_modifier.add(modifier23.getTree());
                    IDENTIFIER24=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_memberDeclaration408); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER24);

                    pushFollow(FOLLOW_formalParameters_in_memberDeclaration410);
                    formalParameters25=formalParameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formalParameters.add(formalParameters25.getTree());
                    pushFollow(FOLLOW_constructorBody_in_memberDeclaration412);
                    constructorBody26=constructorBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_constructorBody.add(constructorBody26.getTree());


                    // AST REWRITE
                    // elements: constructorBody, formalParameters, IDENTIFIER, modifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 98:6: -> ^( CONSTR modifier IDENTIFIER formalParameters constructorBody )
                    {
                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:98:9: ^( CONSTR modifier IDENTIFIER formalParameters constructorBody )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONSTR, "CONSTR"), root_1);

                        adaptor.addChild(root_1, stream_modifier.nextTree());
                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        adaptor.addChild(root_1, stream_formalParameters.nextTree());
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
        return retval;
    }
    // $ANTLR end "memberDeclaration"

    public static class methodDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "methodDeclaration"
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:101:1: methodDeclaration : IDENTIFIER formalParameters ( methodBody | ';' ) ;
    public final JaParser.methodDeclaration_return methodDeclaration() throws RecognitionException {
        JaParser.methodDeclaration_return retval = new JaParser.methodDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENTIFIER27=null;
        Token char_literal30=null;
        JaParser.formalParameters_return formalParameters28 = null;

        JaParser.methodBody_return methodBody29 = null;


        Object IDENTIFIER27_tree=null;
        Object char_literal30_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:102:5: ( IDENTIFIER formalParameters ( methodBody | ';' ) )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:102:9: IDENTIFIER formalParameters ( methodBody | ';' )
            {
            root_0 = (Object)adaptor.nil();

            IDENTIFIER27=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_methodDeclaration451); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER27_tree = (Object)adaptor.create(IDENTIFIER27);
            adaptor.addChild(root_0, IDENTIFIER27_tree);
            }
            pushFollow(FOLLOW_formalParameters_in_methodDeclaration453);
            formalParameters28=formalParameters();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, formalParameters28.getTree());
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:103:9: ( methodBody | ';' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==76) ) {
                alt7=1;
            }
            else if ( (LA7_0==75) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:103:13: methodBody
                    {
                    pushFollow(FOLLOW_methodBody_in_methodDeclaration467);
                    methodBody29=methodBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, methodBody29.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:104:13: ';'
                    {
                    char_literal30=(Token)match(input,75,FOLLOW_75_in_methodDeclaration481); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal30_tree = (Object)adaptor.create(char_literal30);
                    adaptor.addChild(root_0, char_literal30_tree);
                    }

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
    // $ANTLR end "methodDeclaration"

    public static class fieldDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fieldDeclaration"
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:108:1: fieldDeclaration[CommonTree modAndTyp] : variableDeclarator ( ',' variableDeclarator )* ';' -> ( ^( FIELD variableDeclarator ) )+ ;
    public final JaParser.fieldDeclaration_return fieldDeclaration(CommonTree modAndTyp) throws RecognitionException {
        JaParser.fieldDeclaration_return retval = new JaParser.fieldDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal32=null;
        Token char_literal34=null;
        JaParser.variableDeclarator_return variableDeclarator31 = null;

        JaParser.variableDeclarator_return variableDeclarator33 = null;


        Object char_literal32_tree=null;
        Object char_literal34_tree=null;
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleSubtreeStream stream_variableDeclarator=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclarator");
        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:109:5: ( variableDeclarator ( ',' variableDeclarator )* ';' -> ( ^( FIELD variableDeclarator ) )+ )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:109:9: variableDeclarator ( ',' variableDeclarator )* ';'
            {
            pushFollow(FOLLOW_variableDeclarator_in_fieldDeclaration511);
            variableDeclarator31=variableDeclarator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variableDeclarator.add(variableDeclarator31.getTree());
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:109:28: ( ',' variableDeclarator )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==78) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:109:29: ',' variableDeclarator
            	    {
            	    char_literal32=(Token)match(input,78,FOLLOW_78_in_fieldDeclaration514); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_78.add(char_literal32);

            	    pushFollow(FOLLOW_variableDeclarator_in_fieldDeclaration516);
            	    variableDeclarator33=variableDeclarator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_variableDeclarator.add(variableDeclarator33.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            char_literal34=(Token)match(input,75,FOLLOW_75_in_fieldDeclaration520); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_75.add(char_literal34);



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
            // 109:58: -> ( ^( FIELD variableDeclarator ) )+
            {
                if ( !(stream_variableDeclarator.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_variableDeclarator.hasNext() ) {
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:109:61: ^( FIELD variableDeclarator )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FIELD, "FIELD"), root_1);

                    adaptor.addChild(root_1, modAndTyp);
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:112:1: voidMethodDeclaratorRest : formalParameters ( methodBody | ';' ) ;
    public final JaParser.voidMethodDeclaratorRest_return voidMethodDeclaratorRest() throws RecognitionException {
        JaParser.voidMethodDeclaratorRest_return retval = new JaParser.voidMethodDeclaratorRest_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal37=null;
        JaParser.formalParameters_return formalParameters35 = null;

        JaParser.methodBody_return methodBody36 = null;


        Object char_literal37_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:113:5: ( formalParameters ( methodBody | ';' ) )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:113:9: formalParameters ( methodBody | ';' )
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_formalParameters_in_voidMethodDeclaratorRest555);
            formalParameters35=formalParameters();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, formalParameters35.getTree());
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:114:9: ( methodBody | ';' )
            int alt9=2;
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

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:114:13: methodBody
                    {
                    pushFollow(FOLLOW_methodBody_in_voidMethodDeclaratorRest569);
                    methodBody36=methodBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, methodBody36.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:115:13: ';'
                    {
                    char_literal37=(Token)match(input,75,FOLLOW_75_in_voidMethodDeclaratorRest583); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal37_tree = (Object)adaptor.create(char_literal37);
                    adaptor.addChild(root_0, char_literal37_tree);
                    }

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
    // $ANTLR end "voidMethodDeclaratorRest"

    public static class variableDeclarator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variableDeclarator"
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:119:1: variableDeclarator : variableDeclaratorId ( '=' variableInitializer )? ;
    public final JaParser.variableDeclarator_return variableDeclarator() throws RecognitionException {
        JaParser.variableDeclarator_return retval = new JaParser.variableDeclarator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal39=null;
        JaParser.variableDeclaratorId_return variableDeclaratorId38 = null;

        JaParser.variableInitializer_return variableInitializer40 = null;


        Object char_literal39_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:120:5: ( variableDeclaratorId ( '=' variableInitializer )? )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:120:9: variableDeclaratorId ( '=' variableInitializer )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_variableDeclaratorId_in_variableDeclarator612);
            variableDeclaratorId38=variableDeclaratorId();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaratorId38.getTree());
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:120:30: ( '=' variableInitializer )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==EQ) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:120:31: '=' variableInitializer
                    {
                    char_literal39=(Token)match(input,EQ,FOLLOW_EQ_in_variableDeclarator615); if (state.failed) return retval;
                    pushFollow(FOLLOW_variableInitializer_in_variableDeclarator618);
                    variableInitializer40=variableInitializer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableInitializer40.getTree());

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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:123:1: variableDeclaratorId returns [int arrayDim] : IDENTIFIER (l+= '[' ']' )* ;
    public final JaParser.variableDeclaratorId_return variableDeclaratorId() throws RecognitionException {
        JaParser.variableDeclaratorId_return retval = new JaParser.variableDeclaratorId_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENTIFIER41=null;
        Token char_literal42=null;
        Token l=null;
        List list_l=null;

        Object IDENTIFIER41_tree=null;
        Object char_literal42_tree=null;
        Object l_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:124:5: ( IDENTIFIER (l+= '[' ']' )* )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:124:9: IDENTIFIER (l+= '[' ']' )*
            {
            root_0 = (Object)adaptor.nil();

            IDENTIFIER41=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variableDeclaratorId649); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER41_tree = (Object)adaptor.create(IDENTIFIER41);
            adaptor.addChild(root_0, IDENTIFIER41_tree);
            }
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:124:20: (l+= '[' ']' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==79) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:124:21: l+= '[' ']'
            	    {
            	    l=(Token)match(input,79,FOLLOW_79_in_variableDeclaratorId654); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    l_tree = (Object)adaptor.create(l);
            	    adaptor.addChild(root_0, l_tree);
            	    }
            	    if (list_l==null) list_l=new ArrayList();
            	    list_l.add(l);

            	    char_literal42=(Token)match(input,80,FOLLOW_80_in_variableDeclaratorId656); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal42_tree = (Object)adaptor.create(char_literal42);
            	    adaptor.addChild(root_0, char_literal42_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
              retval.arrayDim = list_l.size();
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
    // $ANTLR end "variableDeclaratorId"

    public static class variableInitializer_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variableInitializer"
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:127:1: variableInitializer : ( arrayInitializer | expression );
    public final JaParser.variableInitializer_return variableInitializer() throws RecognitionException {
        JaParser.variableInitializer_return retval = new JaParser.variableInitializer_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.arrayInitializer_return arrayInitializer43 = null;

        JaParser.expression_return expression44 = null;



        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:128:5: ( arrayInitializer | expression )
            int alt12=2;
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

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:128:9: arrayInitializer
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_arrayInitializer_in_variableInitializer680);
                    arrayInitializer43=arrayInitializer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayInitializer43.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:129:9: expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expression_in_variableInitializer690);
                    expression44=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression44.getTree());

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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:132:1: arrayInitializer : '{' ( variableInitializer ( ',' variableInitializer )* ( ',' )? )? '}' ;
    public final JaParser.arrayInitializer_return arrayInitializer() throws RecognitionException {
        JaParser.arrayInitializer_return retval = new JaParser.arrayInitializer_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal45=null;
        Token char_literal47=null;
        Token char_literal49=null;
        Token char_literal50=null;
        JaParser.variableInitializer_return variableInitializer46 = null;

        JaParser.variableInitializer_return variableInitializer48 = null;


        Object char_literal45_tree=null;
        Object char_literal47_tree=null;
        Object char_literal49_tree=null;
        Object char_literal50_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:133:5: ( '{' ( variableInitializer ( ',' variableInitializer )* ( ',' )? )? '}' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:133:9: '{' ( variableInitializer ( ',' variableInitializer )* ( ',' )? )? '}'
            {
            root_0 = (Object)adaptor.nil();

            char_literal45=(Token)match(input,76,FOLLOW_76_in_arrayInitializer717); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal45_tree = (Object)adaptor.create(char_literal45);
            adaptor.addChild(root_0, char_literal45_tree);
            }
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:133:13: ( variableInitializer ( ',' variableInitializer )* ( ',' )? )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==IDENTIFIER||LA15_0==VOID||(LA15_0>=CHAR && LA15_0<=NULLLITERAL)||LA15_0==NEW||(LA15_0>=PLUS && LA15_0<=MINUS)||LA15_0==76||LA15_0==81||(LA15_0>=93 && LA15_0<=95)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:133:14: variableInitializer ( ',' variableInitializer )* ( ',' )?
                    {
                    pushFollow(FOLLOW_variableInitializer_in_arrayInitializer720);
                    variableInitializer46=variableInitializer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableInitializer46.getTree());
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:133:34: ( ',' variableInitializer )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==78) ) {
                            int LA13_1 = input.LA(2);

                            if ( (LA13_1==IDENTIFIER||LA13_1==VOID||(LA13_1>=CHAR && LA13_1<=NULLLITERAL)||LA13_1==NEW||(LA13_1>=PLUS && LA13_1<=MINUS)||LA13_1==76||LA13_1==81||(LA13_1>=93 && LA13_1<=95)) ) {
                                alt13=1;
                            }


                        }


                        switch (alt13) {
                    	case 1 :
                    	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:133:35: ',' variableInitializer
                    	    {
                    	    char_literal47=(Token)match(input,78,FOLLOW_78_in_arrayInitializer723); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal47_tree = (Object)adaptor.create(char_literal47);
                    	    adaptor.addChild(root_0, char_literal47_tree);
                    	    }
                    	    pushFollow(FOLLOW_variableInitializer_in_arrayInitializer725);
                    	    variableInitializer48=variableInitializer();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableInitializer48.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:133:61: ( ',' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==78) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:133:62: ','
                            {
                            char_literal49=(Token)match(input,78,FOLLOW_78_in_arrayInitializer730); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal49_tree = (Object)adaptor.create(char_literal49);
                            adaptor.addChild(root_0, char_literal49_tree);
                            }

                            }
                            break;

                    }


                    }
                    break;

            }

            char_literal50=(Token)match(input,77,FOLLOW_77_in_arrayInitializer737); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal50_tree = (Object)adaptor.create(char_literal50);
            adaptor.addChild(root_0, char_literal50_tree);
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
    // $ANTLR end "arrayInitializer"

    public static class modifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "modifier"
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:136:1: modifier : ( PUBLIC | PRIVATE );
    public final JaParser.modifier_return modifier() throws RecognitionException {
        JaParser.modifier_return retval = new JaParser.modifier_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set51=null;

        Object set51_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:137:5: ( PUBLIC | PRIVATE )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:
            {
            root_0 = (Object)adaptor.nil();

            set51=(Token)input.LT(1);
            if ( input.LA(1)==PUBLIC||input.LA(1)==PRIVATE ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set51));
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
    // $ANTLR end "modifier"

    public static class typeName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeName"
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:141:1: typeName : IDENTIFIER ;
    public final JaParser.typeName_return typeName() throws RecognitionException {
        JaParser.typeName_return retval = new JaParser.typeName_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENTIFIER52=null;

        Object IDENTIFIER52_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:142:5: ( IDENTIFIER )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:142:9: IDENTIFIER
            {
            root_0 = (Object)adaptor.nil();

            IDENTIFIER52=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_typeName785); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER52_tree = (Object)adaptor.create(IDENTIFIER52);
            adaptor.addChild(root_0, IDENTIFIER52_tree);
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
    // $ANTLR end "typeName"

    public static class type_return extends ParserRuleReturnScope {
        public Type t;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:145:1: type returns [Type t] : ( nonPrimitiveType | primitiveType );
    public final JaParser.type_return type() throws RecognitionException {
        JaParser.type_return retval = new JaParser.type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.nonPrimitiveType_return nonPrimitiveType53 = null;

        JaParser.primitiveType_return primitiveType54 = null;



        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:146:2: ( nonPrimitiveType | primitiveType )
            int alt16=2;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:146:4: nonPrimitiveType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_nonPrimitiveType_in_type803);
                    nonPrimitiveType53=nonPrimitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nonPrimitiveType53.getTree());
                    if ( state.backtracking==0 ) {
                      retval.t =(nonPrimitiveType53!=null?nonPrimitiveType53.t:null);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:147:4: primitiveType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primitiveType_in_type810);
                    primitiveType54=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType54.getTree());
                    if ( state.backtracking==0 ) {
                      retval.t =(primitiveType54!=null?primitiveType54.bs:null);
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:150:1: nonPrimitiveType returns [ComplexType t] : ( classType (l+= '[' ']' )* | primitiveType (l+= '[' ']' )+ );
    public final JaParser.nonPrimitiveType_return nonPrimitiveType() throws RecognitionException {
        JaParser.nonPrimitiveType_return retval = new JaParser.nonPrimitiveType_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal56=null;
        Token char_literal58=null;
        Token l=null;
        List list_l=null;
        JaParser.classType_return classType55 = null;

        JaParser.primitiveType_return primitiveType57 = null;


        Object char_literal56_tree=null;
        Object char_literal58_tree=null;
        Object l_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:151:2: ( classType (l+= '[' ']' )* | primitiveType (l+= '[' ']' )+ )
            int alt19=2;
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

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:151:4: classType (l+= '[' ']' )*
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_classType_in_nonPrimitiveType828);
                    classType55=classType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classType55.getTree());
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:151:14: (l+= '[' ']' )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==79) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:151:15: l+= '[' ']'
                    	    {
                    	    l=(Token)match(input,79,FOLLOW_79_in_nonPrimitiveType833); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    l_tree = (Object)adaptor.create(l);
                    	    adaptor.addChild(root_0, l_tree);
                    	    }
                    	    if (list_l==null) list_l=new ArrayList();
                    	    list_l.add(l);

                    	    char_literal56=(Token)match(input,80,FOLLOW_80_in_nonPrimitiveType835); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal56_tree = (Object)adaptor.create(char_literal56);
                    	    adaptor.addChild(root_0, char_literal56_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                      retval.t = createArrayType((classType55!=null?classType55.t:null), list_l.size());
                    }

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:152:4: primitiveType (l+= '[' ']' )+
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primitiveType_in_nonPrimitiveType844);
                    primitiveType57=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType57.getTree());
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:152:18: (l+= '[' ']' )+
                    int cnt18=0;
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==79) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:152:19: l+= '[' ']'
                    	    {
                    	    l=(Token)match(input,79,FOLLOW_79_in_nonPrimitiveType849); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    l_tree = (Object)adaptor.create(l);
                    	    adaptor.addChild(root_0, l_tree);
                    	    }
                    	    if (list_l==null) list_l=new ArrayList();
                    	    list_l.add(l);

                    	    char_literal58=(Token)match(input,80,FOLLOW_80_in_nonPrimitiveType851); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal58_tree = (Object)adaptor.create(char_literal58);
                    	    adaptor.addChild(root_0, char_literal58_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt18 >= 1 ) break loop18;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(18, input);
                                throw eee;
                        }
                        cnt18++;
                    } while (true);

                    if ( state.backtracking==0 ) {
                      retval.t = createArrayType((primitiveType57!=null?primitiveType57.bs:null), list_l.size());
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:155:1: classType returns [ReferenceType t] : IDENTIFIER ;
    public final JaParser.classType_return classType() throws RecognitionException {
        JaParser.classType_return retval = new JaParser.classType_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENTIFIER59=null;

        Object IDENTIFIER59_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:156:2: ( IDENTIFIER )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:156:4: IDENTIFIER
            {
            root_0 = (Object)adaptor.nil();

            IDENTIFIER59=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classType870); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER59_tree = (Object)adaptor.create(IDENTIFIER59);
            adaptor.addChild(root_0, IDENTIFIER59_tree);
            }
            if ( state.backtracking==0 ) {
               if(cTab.containsKey((IDENTIFIER59!=null?IDENTIFIER59.getText():null))) {
              	        			retval.t = cTab.get((IDENTIFIER59!=null?IDENTIFIER59.getText():null));
                      			} else {
                      				retval.t = new ReferenceType((IDENTIFIER59!=null?IDENTIFIER59.getText():null));
                      				cTab.put((IDENTIFIER59!=null?IDENTIFIER59.getText():null), retval.t);
                      				todo.add((IDENTIFIER59!=null?IDENTIFIER59.getText():null));	
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:166:1: primitiveType returns [BasicType bs] : ( CHAR | BYTE | SHORT | INT | LONG | FLOAT | DOUBLE );
    public final JaParser.primitiveType_return primitiveType() throws RecognitionException {
        JaParser.primitiveType_return retval = new JaParser.primitiveType_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CHAR60=null;
        Token BYTE61=null;
        Token SHORT62=null;
        Token INT63=null;
        Token LONG64=null;
        Token FLOAT65=null;
        Token DOUBLE66=null;

        Object CHAR60_tree=null;
        Object BYTE61_tree=null;
        Object SHORT62_tree=null;
        Object INT63_tree=null;
        Object LONG64_tree=null;
        Object FLOAT65_tree=null;
        Object DOUBLE66_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:167:5: ( CHAR | BYTE | SHORT | INT | LONG | FLOAT | DOUBLE )
            int alt20=7;
            switch ( input.LA(1) ) {
            case CHAR:
                {
                alt20=1;
                }
                break;
            case BYTE:
                {
                alt20=2;
                }
                break;
            case SHORT:
                {
                alt20=3;
                }
                break;
            case INT:
                {
                alt20=4;
                }
                break;
            case LONG:
                {
                alt20=5;
                }
                break;
            case FLOAT:
                {
                alt20=6;
                }
                break;
            case DOUBLE:
                {
                alt20=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:167:9: CHAR
                    {
                    root_0 = (Object)adaptor.nil();

                    CHAR60=(Token)match(input,CHAR,FOLLOW_CHAR_in_primitiveType892); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CHAR60_tree = (Object)adaptor.create(CHAR60);
                    adaptor.addChild(root_0, CHAR60_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.bs =BasicType.CHAR;
                    }

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:168:9: BYTE
                    {
                    root_0 = (Object)adaptor.nil();

                    BYTE61=(Token)match(input,BYTE,FOLLOW_BYTE_in_primitiveType904); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BYTE61_tree = (Object)adaptor.create(BYTE61);
                    adaptor.addChild(root_0, BYTE61_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.bs =BasicType.BYTE;
                    }

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:169:9: SHORT
                    {
                    root_0 = (Object)adaptor.nil();

                    SHORT62=(Token)match(input,SHORT,FOLLOW_SHORT_in_primitiveType916); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SHORT62_tree = (Object)adaptor.create(SHORT62);
                    adaptor.addChild(root_0, SHORT62_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.bs =BasicType.SHORT;
                    }

                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:170:9: INT
                    {
                    root_0 = (Object)adaptor.nil();

                    INT63=(Token)match(input,INT,FOLLOW_INT_in_primitiveType928); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT63_tree = (Object)adaptor.create(INT63);
                    adaptor.addChild(root_0, INT63_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.bs =BasicType.INT;
                    }

                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:171:9: LONG
                    {
                    root_0 = (Object)adaptor.nil();

                    LONG64=(Token)match(input,LONG,FOLLOW_LONG_in_primitiveType940); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LONG64_tree = (Object)adaptor.create(LONG64);
                    adaptor.addChild(root_0, LONG64_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.bs =BasicType.LONG;
                    }

                    }
                    break;
                case 6 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:172:9: FLOAT
                    {
                    root_0 = (Object)adaptor.nil();

                    FLOAT65=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_primitiveType952); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FLOAT65_tree = (Object)adaptor.create(FLOAT65);
                    adaptor.addChild(root_0, FLOAT65_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.bs =BasicType.FLOAT;
                    }

                    }
                    break;
                case 7 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:173:9: DOUBLE
                    {
                    root_0 = (Object)adaptor.nil();

                    DOUBLE66=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_primitiveType964); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOUBLE66_tree = (Object)adaptor.create(DOUBLE66);
                    adaptor.addChild(root_0, DOUBLE66_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.bs =BasicType.DOUBLE;
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
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formalParameters"
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:176:1: formalParameters : '(' ( formalParameterDecls )? ')' -> {$formalParameterDecls.tree != null}? ^( FPARMS ( formalParameterDecls )? ) ->;
    public final JaParser.formalParameters_return formalParameters() throws RecognitionException {
        JaParser.formalParameters_return retval = new JaParser.formalParameters_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal67=null;
        Token char_literal69=null;
        JaParser.formalParameterDecls_return formalParameterDecls68 = null;


        Object char_literal67_tree=null;
        Object char_literal69_tree=null;
        RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
        RewriteRuleSubtreeStream stream_formalParameterDecls=new RewriteRuleSubtreeStream(adaptor,"rule formalParameterDecls");

        	ArrayList<Type> args = new ArrayList<Type>();

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:180:5: ( '(' ( formalParameterDecls )? ')' -> {$formalParameterDecls.tree != null}? ^( FPARMS ( formalParameterDecls )? ) ->)
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:180:9: '(' ( formalParameterDecls )? ')'
            {
            char_literal67=(Token)match(input,81,FOLLOW_81_in_formalParameters994); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_81.add(char_literal67);

            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:180:13: ( formalParameterDecls )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==IDENTIFIER||(LA21_0>=CHAR && LA21_0<=DOUBLE)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:180:13: formalParameterDecls
                    {
                    pushFollow(FOLLOW_formalParameterDecls_in_formalParameters996);
                    formalParameterDecls68=formalParameterDecls();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formalParameterDecls.add(formalParameterDecls68.getTree());

                    }
                    break;

            }

            char_literal69=(Token)match(input,82,FOLLOW_82_in_formalParameters1000); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_82.add(char_literal69);



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
            // 180:50: -> {$formalParameterDecls.tree != null}? ^( FPARMS ( formalParameterDecls )? )
            if ((formalParameterDecls68!=null?((Object)formalParameterDecls68.tree):null) != null) {
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:180:91: ^( FPARMS ( formalParameterDecls )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FPARMS, "FPARMS"), root_1);

                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:180:100: ( formalParameterDecls )?
                if ( stream_formalParameterDecls.hasNext() ) {
                    adaptor.addChild(root_1, stream_formalParameterDecls.nextTree());

                }
                stream_formalParameterDecls.reset();

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 181:15: ->
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:184:1: formalParameterDecls : ( type variableDeclaratorId ( ',' formalParameterDecls )? -> ^( FPARM type variableDeclaratorId ) ( formalParameterDecls )? | type '...' variableDeclaratorId -> ^( FMULTPARM type variableDeclaratorId ) );
    public final JaParser.formalParameterDecls_return formalParameterDecls() throws RecognitionException {
        JaParser.formalParameterDecls_return retval = new JaParser.formalParameterDecls_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal72=null;
        Token string_literal75=null;
        JaParser.type_return type70 = null;

        JaParser.variableDeclaratorId_return variableDeclaratorId71 = null;

        JaParser.formalParameterDecls_return formalParameterDecls73 = null;

        JaParser.type_return type74 = null;

        JaParser.variableDeclaratorId_return variableDeclaratorId76 = null;


        Object char_literal72_tree=null;
        Object string_literal75_tree=null;
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleSubtreeStream stream_variableDeclaratorId=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaratorId");
        RewriteRuleSubtreeStream stream_formalParameterDecls=new RewriteRuleSubtreeStream(adaptor,"rule formalParameterDecls");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:185:5: ( type variableDeclaratorId ( ',' formalParameterDecls )? -> ^( FPARM type variableDeclaratorId ) ( formalParameterDecls )? | type '...' variableDeclaratorId -> ^( FMULTPARM type variableDeclaratorId ) )
            int alt23=2;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:185:8: type variableDeclaratorId ( ',' formalParameterDecls )?
                    {
                    pushFollow(FOLLOW_type_in_formalParameterDecls1049);
                    type70=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type70.getTree());
                    pushFollow(FOLLOW_variableDeclaratorId_in_formalParameterDecls1051);
                    variableDeclaratorId71=variableDeclaratorId();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_variableDeclaratorId.add(variableDeclaratorId71.getTree());
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:185:34: ( ',' formalParameterDecls )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==78) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:185:35: ',' formalParameterDecls
                            {
                            char_literal72=(Token)match(input,78,FOLLOW_78_in_formalParameterDecls1054); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_78.add(char_literal72);

                            pushFollow(FOLLOW_formalParameterDecls_in_formalParameterDecls1056);
                            formalParameterDecls73=formalParameterDecls();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_formalParameterDecls.add(formalParameterDecls73.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: type, formalParameterDecls, variableDeclaratorId
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 192:6: -> ^( FPARM type variableDeclaratorId ) ( formalParameterDecls )?
                    {
                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:192:9: ^( FPARM type variableDeclaratorId )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FPARM, "FPARM"), root_1);

                        adaptor.addChild(root_1, stream_type.nextTree());
                        adaptor.addChild(root_1, stream_variableDeclaratorId.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }
                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:192:44: ( formalParameterDecls )?
                        if ( stream_formalParameterDecls.hasNext() ) {
                            adaptor.addChild(root_0, stream_formalParameterDecls.nextTree());

                        }
                        stream_formalParameterDecls.reset();

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:193:8: type '...' variableDeclaratorId
                    {
                    pushFollow(FOLLOW_type_in_formalParameterDecls1092);
                    type74=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type74.getTree());
                    string_literal75=(Token)match(input,83,FOLLOW_83_in_formalParameterDecls1094); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_83.add(string_literal75);

                    pushFollow(FOLLOW_variableDeclaratorId_in_formalParameterDecls1096);
                    variableDeclaratorId76=variableDeclaratorId();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_variableDeclaratorId.add(variableDeclaratorId76.getTree());


                    // AST REWRITE
                    // elements: variableDeclaratorId, type
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 193:40: -> ^( FMULTPARM type variableDeclaratorId )
                    {
                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:193:43: ^( FMULTPARM type variableDeclaratorId )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FMULTPARM, "FMULTPARM"), root_1);

                        adaptor.addChild(root_1, stream_type.nextTree());
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
        return retval;
    }
    // $ANTLR end "formalParameterDecls"

    public static class methodBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "methodBody"
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:196:1: methodBody : block -> ^( MBODY block ) ;
    public final JaParser.methodBody_return methodBody() throws RecognitionException {
        JaParser.methodBody_return retval = new JaParser.methodBody_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.block_return block77 = null;


        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:197:5: ( block -> ^( MBODY block ) )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:197:9: block
            {
            pushFollow(FOLLOW_block_in_methodBody1129);
            block77=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block77.getTree());


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
            // 197:15: -> ^( MBODY block )
            {
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:197:18: ^( MBODY block )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MBODY, "MBODY"), root_1);

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
        return retval;
    }
    // $ANTLR end "methodBody"

    public static class constructorBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constructorBody"
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:200:1: constructorBody : '{' ( explicitConstructorInvocation )? ( blockStatement )* '}' ;
    public final JaParser.constructorBody_return constructorBody() throws RecognitionException {
        JaParser.constructorBody_return retval = new JaParser.constructorBody_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal78=null;
        Token char_literal81=null;
        JaParser.explicitConstructorInvocation_return explicitConstructorInvocation79 = null;

        JaParser.blockStatement_return blockStatement80 = null;


        Object char_literal78_tree=null;
        Object char_literal81_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:201:5: ( '{' ( explicitConstructorInvocation )? ( blockStatement )* '}' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:201:9: '{' ( explicitConstructorInvocation )? ( blockStatement )* '}'
            {
            root_0 = (Object)adaptor.nil();

            char_literal78=(Token)match(input,76,FOLLOW_76_in_constructorBody1156); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal78_tree = (Object)adaptor.create(char_literal78);
            adaptor.addChild(root_0, char_literal78_tree);
            }
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:201:13: ( explicitConstructorInvocation )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==THIS) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==81) ) {
                    alt24=1;
                }
            }
            else if ( (LA24_0==SUPER) ) {
                int LA24_3 = input.LA(2);

                if ( (LA24_3==81) ) {
                    alt24=1;
                }
            }
            switch (alt24) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:201:13: explicitConstructorInvocation
                    {
                    pushFollow(FOLLOW_explicitConstructorInvocation_in_constructorBody1158);
                    explicitConstructorInvocation79=explicitConstructorInvocation();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, explicitConstructorInvocation79.getTree());

                    }
                    break;

            }

            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:201:44: ( blockStatement )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==IDENTIFIER||LA25_0==VOID||(LA25_0>=CHAR && LA25_0<=RETURN)||LA25_0==NEW||(LA25_0>=PLUS && LA25_0<=MINUS)||(LA25_0>=75 && LA25_0<=76)||LA25_0==81||(LA25_0>=93 && LA25_0<=95)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:201:44: blockStatement
            	    {
            	    pushFollow(FOLLOW_blockStatement_in_constructorBody1161);
            	    blockStatement80=blockStatement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, blockStatement80.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            char_literal81=(Token)match(input,77,FOLLOW_77_in_constructorBody1164); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal81_tree = (Object)adaptor.create(char_literal81);
            adaptor.addChild(root_0, char_literal81_tree);
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
    // $ANTLR end "constructorBody"

    public static class explicitConstructorInvocation_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "explicitConstructorInvocation"
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:204:1: explicitConstructorInvocation : ( THIS | SUPER ) arguments ';' ;
    public final JaParser.explicitConstructorInvocation_return explicitConstructorInvocation() throws RecognitionException {
        JaParser.explicitConstructorInvocation_return retval = new JaParser.explicitConstructorInvocation_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set82=null;
        Token char_literal84=null;
        JaParser.arguments_return arguments83 = null;


        Object set82_tree=null;
        Object char_literal84_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:205:5: ( ( THIS | SUPER ) arguments ';' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:205:9: ( THIS | SUPER ) arguments ';'
            {
            root_0 = (Object)adaptor.nil();

            set82=(Token)input.LT(1);
            if ( (input.LA(1)>=THIS && input.LA(1)<=SUPER) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set82));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            pushFollow(FOLLOW_arguments_in_explicitConstructorInvocation1191);
            arguments83=arguments();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments83.getTree());
            char_literal84=(Token)match(input,75,FOLLOW_75_in_explicitConstructorInvocation1193); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal84_tree = (Object)adaptor.create(char_literal84);
            adaptor.addChild(root_0, char_literal84_tree);
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
    // $ANTLR end "explicitConstructorInvocation"

    public static class literal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "literal"
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:209:1: literal : ( INTLITERAL | FloatingPointLiteral | CHARLITERAL | STRINGLITERAL | BOOLEANLITERAL | NULLLITERAL );
    public final JaParser.literal_return literal() throws RecognitionException {
        JaParser.literal_return retval = new JaParser.literal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set85=null;

        Object set85_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:210:5: ( INTLITERAL | FloatingPointLiteral | CHARLITERAL | STRINGLITERAL | BOOLEANLITERAL | NULLLITERAL )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:
            {
            root_0 = (Object)adaptor.nil();

            set85=(Token)input.LT(1);
            if ( (input.LA(1)>=INTLITERAL && input.LA(1)<=NULLLITERAL) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set85));
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:221:1: block : '{' ( blockStatement )* '}' ;
    public final JaParser.block_return block() throws RecognitionException {
        JaParser.block_return retval = new JaParser.block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal86=null;
        Token char_literal88=null;
        JaParser.blockStatement_return blockStatement87 = null;


        Object char_literal86_tree=null;
        Object char_literal88_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:222:5: ( '{' ( blockStatement )* '}' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:222:9: '{' ( blockStatement )* '}'
            {
            root_0 = (Object)adaptor.nil();

            char_literal86=(Token)match(input,76,FOLLOW_76_in_block1290); if (state.failed) return retval;
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:222:14: ( blockStatement )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==IDENTIFIER||LA26_0==VOID||(LA26_0>=CHAR && LA26_0<=RETURN)||LA26_0==NEW||(LA26_0>=PLUS && LA26_0<=MINUS)||(LA26_0>=75 && LA26_0<=76)||LA26_0==81||(LA26_0>=93 && LA26_0<=95)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:222:14: blockStatement
            	    {
            	    pushFollow(FOLLOW_blockStatement_in_block1293);
            	    blockStatement87=blockStatement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, blockStatement87.getTree());

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            char_literal88=(Token)match(input,77,FOLLOW_77_in_block1296); if (state.failed) return retval;

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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:225:1: blockStatement : ( localVariableDeclarationStatement | statement );
    public final JaParser.blockStatement_return blockStatement() throws RecognitionException {
        JaParser.blockStatement_return retval = new JaParser.blockStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.localVariableDeclarationStatement_return localVariableDeclarationStatement89 = null;

        JaParser.statement_return statement90 = null;



        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:226:5: ( localVariableDeclarationStatement | statement )
            int alt27=2;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:226:9: localVariableDeclarationStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_localVariableDeclarationStatement_in_blockStatement1320);
                    localVariableDeclarationStatement89=localVariableDeclarationStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, localVariableDeclarationStatement89.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:227:9: statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_statement_in_blockStatement1330);
                    statement90=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement90.getTree());

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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:230:1: localVariableDeclarationStatement : localVariableDeclaration ';' ;
    public final JaParser.localVariableDeclarationStatement_return localVariableDeclarationStatement() throws RecognitionException {
        JaParser.localVariableDeclarationStatement_return retval = new JaParser.localVariableDeclarationStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal92=null;
        JaParser.localVariableDeclaration_return localVariableDeclaration91 = null;


        Object char_literal92_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:231:5: ( localVariableDeclaration ';' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:231:10: localVariableDeclaration ';'
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_localVariableDeclaration_in_localVariableDeclarationStatement1354);
            localVariableDeclaration91=localVariableDeclaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, localVariableDeclaration91.getTree());
            char_literal92=(Token)match(input,75,FOLLOW_75_in_localVariableDeclarationStatement1356); if (state.failed) return retval;

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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:234:1: localVariableDeclaration : type variableDeclarator ( ',' variableDeclarator )* -> ( ^( VARDECL type variableDeclarator ) )+ ;
    public final JaParser.localVariableDeclaration_return localVariableDeclaration() throws RecognitionException {
        JaParser.localVariableDeclaration_return retval = new JaParser.localVariableDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal95=null;
        JaParser.type_return type93 = null;

        JaParser.variableDeclarator_return variableDeclarator94 = null;

        JaParser.variableDeclarator_return variableDeclarator96 = null;


        Object char_literal95_tree=null;
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleSubtreeStream stream_variableDeclarator=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclarator");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:235:5: ( type variableDeclarator ( ',' variableDeclarator )* -> ( ^( VARDECL type variableDeclarator ) )+ )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:235:9: type variableDeclarator ( ',' variableDeclarator )*
            {
            pushFollow(FOLLOW_type_in_localVariableDeclaration1376);
            type93=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type93.getTree());
            pushFollow(FOLLOW_variableDeclarator_in_localVariableDeclaration1378);
            variableDeclarator94=variableDeclarator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variableDeclarator.add(variableDeclarator94.getTree());
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:235:33: ( ',' variableDeclarator )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==78) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:235:34: ',' variableDeclarator
            	    {
            	    char_literal95=(Token)match(input,78,FOLLOW_78_in_localVariableDeclaration1381); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_78.add(char_literal95);

            	    pushFollow(FOLLOW_variableDeclarator_in_localVariableDeclaration1383);
            	    variableDeclarator96=variableDeclarator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_variableDeclarator.add(variableDeclarator96.getTree());

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);



            // AST REWRITE
            // elements: type, variableDeclarator
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 235:59: -> ( ^( VARDECL type variableDeclarator ) )+
            {
                if ( !(stream_type.hasNext()||stream_variableDeclarator.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_type.hasNext()||stream_variableDeclarator.hasNext() ) {
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:235:62: ^( VARDECL type variableDeclarator )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARDECL, "VARDECL"), root_1);

                    adaptor.addChild(root_1, stream_type.nextTree());
                    adaptor.addChild(root_1, stream_variableDeclarator.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_type.reset();
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:239:1: statement : ( block -> ^( BLOCK block ) | IF parExpression statement elseStmt -> ^( IF ^( CONDITION parExpression ) ^( THEN statement ) ( elseStmt )? ) | FOR '(' ( forInit )? ';' ( expression )? ';' ( forUpdate )? ')' statement -> ^( FOR ( ^( INIT forInit ) )? ( ^( CONDITION expression ) )? ( ^( UPDATE forUpdate ) )? statement ) | WHILE parExpression statement -> ^( WHILE ^( CONDITION parExpression ) statement ) | DO statement WHILE parExpression ';' -> ^( DOWHILE ^( CONDITION parExpression ) statement ) | RETURN ( expression )? ';' | ';' | statementExpression ';' -> ^( STMT statementExpression ) );
    public final JaParser.statement_return statement() throws RecognitionException {
        JaParser.statement_return retval = new JaParser.statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IF98=null;
        Token FOR102=null;
        Token char_literal103=null;
        Token char_literal105=null;
        Token char_literal107=null;
        Token char_literal109=null;
        Token WHILE111=null;
        Token DO114=null;
        Token WHILE116=null;
        Token char_literal118=null;
        Token RETURN119=null;
        Token char_literal121=null;
        Token char_literal122=null;
        Token char_literal124=null;
        JaParser.block_return block97 = null;

        JaParser.parExpression_return parExpression99 = null;

        JaParser.statement_return statement100 = null;

        JaParser.elseStmt_return elseStmt101 = null;

        JaParser.forInit_return forInit104 = null;

        JaParser.expression_return expression106 = null;

        JaParser.forUpdate_return forUpdate108 = null;

        JaParser.statement_return statement110 = null;

        JaParser.parExpression_return parExpression112 = null;

        JaParser.statement_return statement113 = null;

        JaParser.statement_return statement115 = null;

        JaParser.parExpression_return parExpression117 = null;

        JaParser.expression_return expression120 = null;

        JaParser.statementExpression_return statementExpression123 = null;


        Object IF98_tree=null;
        Object FOR102_tree=null;
        Object char_literal103_tree=null;
        Object char_literal105_tree=null;
        Object char_literal107_tree=null;
        Object char_literal109_tree=null;
        Object WHILE111_tree=null;
        Object DO114_tree=null;
        Object WHILE116_tree=null;
        Object char_literal118_tree=null;
        Object RETURN119_tree=null;
        Object char_literal121_tree=null;
        Object char_literal122_tree=null;
        Object char_literal124_tree=null;
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
        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:240:5: ( block -> ^( BLOCK block ) | IF parExpression statement elseStmt -> ^( IF ^( CONDITION parExpression ) ^( THEN statement ) ( elseStmt )? ) | FOR '(' ( forInit )? ';' ( expression )? ';' ( forUpdate )? ')' statement -> ^( FOR ( ^( INIT forInit ) )? ( ^( CONDITION expression ) )? ( ^( UPDATE forUpdate ) )? statement ) | WHILE parExpression statement -> ^( WHILE ^( CONDITION parExpression ) statement ) | DO statement WHILE parExpression ';' -> ^( DOWHILE ^( CONDITION parExpression ) statement ) | RETURN ( expression )? ';' | ';' | statementExpression ';' -> ^( STMT statementExpression ) )
            int alt33=8;
            switch ( input.LA(1) ) {
            case 76:
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
            case 75:
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
                alt33=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:240:9: block
                    {
                    pushFollow(FOLLOW_block_in_statement1419);
                    block97=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block97.getTree());


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
                    // 240:15: -> ^( BLOCK block )
                    {
                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:240:18: ^( BLOCK block )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);

                        adaptor.addChild(root_1, stream_block.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:241:9: IF parExpression statement elseStmt
                    {
                    IF98=(Token)match(input,IF,FOLLOW_IF_in_statement1437); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF98);

                    pushFollow(FOLLOW_parExpression_in_statement1439);
                    parExpression99=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression99.getTree());
                    pushFollow(FOLLOW_statement_in_statement1441);
                    statement100=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement100.getTree());
                    pushFollow(FOLLOW_elseStmt_in_statement1443);
                    elseStmt101=elseStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_elseStmt.add(elseStmt101.getTree());


                    // AST REWRITE
                    // elements: elseStmt, statement, parExpression, IF
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 241:45: -> ^( IF ^( CONDITION parExpression ) ^( THEN statement ) ( elseStmt )? )
                    {
                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:241:48: ^( IF ^( CONDITION parExpression ) ^( THEN statement ) ( elseStmt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:241:53: ^( CONDITION parExpression )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONDITION, "CONDITION"), root_2);

                        adaptor.addChild(root_2, stream_parExpression.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:241:80: ^( THEN statement )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(THEN, "THEN"), root_2);

                        adaptor.addChild(root_2, stream_statement.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:241:98: ( elseStmt )?
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
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:242:9: FOR '(' ( forInit )? ';' ( expression )? ';' ( forUpdate )? ')' statement
                    {
                    FOR102=(Token)match(input,FOR,FOLLOW_FOR_in_statement1474); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOR.add(FOR102);

                    char_literal103=(Token)match(input,81,FOLLOW_81_in_statement1476); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_81.add(char_literal103);

                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:242:17: ( forInit )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==IDENTIFIER||LA29_0==VOID||(LA29_0>=CHAR && LA29_0<=NULLLITERAL)||LA29_0==NEW||(LA29_0>=PLUS && LA29_0<=MINUS)||LA29_0==81||(LA29_0>=93 && LA29_0<=95)) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:242:17: forInit
                            {
                            pushFollow(FOLLOW_forInit_in_statement1478);
                            forInit104=forInit();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_forInit.add(forInit104.getTree());

                            }
                            break;

                    }

                    char_literal105=(Token)match(input,75,FOLLOW_75_in_statement1481); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_75.add(char_literal105);

                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:242:30: ( expression )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==IDENTIFIER||LA30_0==VOID||(LA30_0>=CHAR && LA30_0<=NULLLITERAL)||LA30_0==NEW||(LA30_0>=PLUS && LA30_0<=MINUS)||LA30_0==81||(LA30_0>=93 && LA30_0<=95)) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:242:30: expression
                            {
                            pushFollow(FOLLOW_expression_in_statement1483);
                            expression106=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(expression106.getTree());

                            }
                            break;

                    }

                    char_literal107=(Token)match(input,75,FOLLOW_75_in_statement1486); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_75.add(char_literal107);

                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:242:46: ( forUpdate )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==IDENTIFIER||LA31_0==VOID||(LA31_0>=CHAR && LA31_0<=NULLLITERAL)||LA31_0==NEW||(LA31_0>=PLUS && LA31_0<=MINUS)||LA31_0==81||(LA31_0>=93 && LA31_0<=95)) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:242:46: forUpdate
                            {
                            pushFollow(FOLLOW_forUpdate_in_statement1488);
                            forUpdate108=forUpdate();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_forUpdate.add(forUpdate108.getTree());

                            }
                            break;

                    }

                    char_literal109=(Token)match(input,82,FOLLOW_82_in_statement1491); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_82.add(char_literal109);

                    pushFollow(FOLLOW_statement_in_statement1493);
                    statement110=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement110.getTree());


                    // AST REWRITE
                    // elements: expression, FOR, forInit, statement, forUpdate
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 243:6: -> ^( FOR ( ^( INIT forInit ) )? ( ^( CONDITION expression ) )? ( ^( UPDATE forUpdate ) )? statement )
                    {
                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:243:9: ^( FOR ( ^( INIT forInit ) )? ( ^( CONDITION expression ) )? ( ^( UPDATE forUpdate ) )? statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_FOR.nextNode(), root_1);

                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:243:15: ( ^( INIT forInit ) )?
                        if ( stream_forInit.hasNext() ) {
                            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:243:15: ^( INIT forInit )
                            {
                            Object root_2 = (Object)adaptor.nil();
                            root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(INIT, "INIT"), root_2);

                            adaptor.addChild(root_2, stream_forInit.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_forInit.reset();
                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:243:32: ( ^( CONDITION expression ) )?
                        if ( stream_expression.hasNext() ) {
                            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:243:32: ^( CONDITION expression )
                            {
                            Object root_2 = (Object)adaptor.nil();
                            root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONDITION, "CONDITION"), root_2);

                            adaptor.addChild(root_2, stream_expression.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_expression.reset();
                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:243:57: ( ^( UPDATE forUpdate ) )?
                        if ( stream_forUpdate.hasNext() ) {
                            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:243:57: ^( UPDATE forUpdate )
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
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:244:9: WHILE parExpression statement
                    {
                    WHILE111=(Token)match(input,WHILE,FOLLOW_WHILE_in_statement1539); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE.add(WHILE111);

                    pushFollow(FOLLOW_parExpression_in_statement1541);
                    parExpression112=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression112.getTree());
                    pushFollow(FOLLOW_statement_in_statement1543);
                    statement113=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement113.getTree());


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
                    // 244:39: -> ^( WHILE ^( CONDITION parExpression ) statement )
                    {
                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:244:42: ^( WHILE ^( CONDITION parExpression ) statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_WHILE.nextNode(), root_1);

                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:244:50: ^( CONDITION parExpression )
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
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:245:9: DO statement WHILE parExpression ';'
                    {
                    DO114=(Token)match(input,DO,FOLLOW_DO_in_statement1567); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DO.add(DO114);

                    pushFollow(FOLLOW_statement_in_statement1569);
                    statement115=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement115.getTree());
                    WHILE116=(Token)match(input,WHILE,FOLLOW_WHILE_in_statement1571); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE.add(WHILE116);

                    pushFollow(FOLLOW_parExpression_in_statement1573);
                    parExpression117=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression117.getTree());
                    char_literal118=(Token)match(input,75,FOLLOW_75_in_statement1575); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_75.add(char_literal118);



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
                    // 245:46: -> ^( DOWHILE ^( CONDITION parExpression ) statement )
                    {
                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:245:49: ^( DOWHILE ^( CONDITION parExpression ) statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DOWHILE, "DOWHILE"), root_1);

                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:245:59: ^( CONDITION parExpression )
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
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:246:9: RETURN ( expression )? ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    RETURN119=(Token)match(input,RETURN,FOLLOW_RETURN_in_statement1599); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RETURN119_tree = (Object)adaptor.create(RETURN119);
                    root_0 = (Object)adaptor.becomeRoot(RETURN119_tree, root_0);
                    }
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:246:17: ( expression )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==IDENTIFIER||LA32_0==VOID||(LA32_0>=CHAR && LA32_0<=NULLLITERAL)||LA32_0==NEW||(LA32_0>=PLUS && LA32_0<=MINUS)||LA32_0==81||(LA32_0>=93 && LA32_0<=95)) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:246:17: expression
                            {
                            pushFollow(FOLLOW_expression_in_statement1602);
                            expression120=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression120.getTree());

                            }
                            break;

                    }

                    char_literal121=(Token)match(input,75,FOLLOW_75_in_statement1605); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:247:9: ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal122=(Token)match(input,75,FOLLOW_75_in_statement1616); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:248:9: statementExpression ';'
                    {
                    pushFollow(FOLLOW_statementExpression_in_statement1628);
                    statementExpression123=statementExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementExpression.add(statementExpression123.getTree());
                    char_literal124=(Token)match(input,75,FOLLOW_75_in_statement1630); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_75.add(char_literal124);



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
                    // 248:33: -> ^( STMT statementExpression )
                    {
                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:248:36: ^( STMT statementExpression )
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:251:1: elseStmt : ( ( ELSE )=> ELSE statement | );
    public final JaParser.elseStmt_return elseStmt() throws RecognitionException {
        JaParser.elseStmt_return retval = new JaParser.elseStmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ELSE125=null;
        JaParser.statement_return statement126 = null;


        Object ELSE125_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:251:9: ( ( ELSE )=> ELSE statement | )
            int alt34=2;
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

                    throw nvae;
                }
            }
            else if ( (LA34_0==IDENTIFIER||LA34_0==VOID||(LA34_0>=CHAR && LA34_0<=RETURN)||LA34_0==NEW||(LA34_0>=PLUS && LA34_0<=MINUS)||(LA34_0>=75 && LA34_0<=77)||LA34_0==81||(LA34_0>=93 && LA34_0<=95)) ) {
                alt34=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:252:2: ( ELSE )=> ELSE statement
                    {
                    root_0 = (Object)adaptor.nil();

                    ELSE125=(Token)match(input,ELSE,FOLLOW_ELSE_in_elseStmt1662); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ELSE125_tree = (Object)adaptor.create(ELSE125);
                    root_0 = (Object)adaptor.becomeRoot(ELSE125_tree, root_0);
                    }
                    pushFollow(FOLLOW_statement_in_elseStmt1665);
                    statement126=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement126.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:254:2: 
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:261:1: forInit : ( localVariableDeclaration | expressionList );
    public final JaParser.forInit_return forInit() throws RecognitionException {
        JaParser.forInit_return retval = new JaParser.forInit_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.localVariableDeclaration_return localVariableDeclaration127 = null;

        JaParser.expressionList_return expressionList128 = null;



        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:262:5: ( localVariableDeclaration | expressionList )
            int alt35=2;
            alt35 = dfa35.predict(input);
            switch (alt35) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:262:9: localVariableDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_localVariableDeclaration_in_forInit1690);
                    localVariableDeclaration127=localVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, localVariableDeclaration127.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:263:9: expressionList
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expressionList_in_forInit1700);
                    expressionList128=expressionList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList128.getTree());

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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:266:1: forUpdate : expressionList ;
    public final JaParser.forUpdate_return forUpdate() throws RecognitionException {
        JaParser.forUpdate_return retval = new JaParser.forUpdate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.expressionList_return expressionList129 = null;



        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:267:5: ( expressionList )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:267:9: expressionList
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expressionList_in_forUpdate1719);
            expressionList129=expressionList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList129.getTree());

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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:272:1: parExpression : '(' expression ')' ;
    public final JaParser.parExpression_return parExpression() throws RecognitionException {
        JaParser.parExpression_return retval = new JaParser.parExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal130=null;
        Token char_literal132=null;
        JaParser.expression_return expression131 = null;


        Object char_literal130_tree=null;
        Object char_literal132_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:273:5: ( '(' expression ')' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:273:9: '(' expression ')'
            {
            root_0 = (Object)adaptor.nil();

            char_literal130=(Token)match(input,81,FOLLOW_81_in_parExpression1740); if (state.failed) return retval;
            pushFollow(FOLLOW_expression_in_parExpression1743);
            expression131=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression131.getTree());
            char_literal132=(Token)match(input,82,FOLLOW_82_in_parExpression1745); if (state.failed) return retval;

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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:276:1: expressionList : expression ( ',' expression )* ;
    public final JaParser.expressionList_return expressionList() throws RecognitionException {
        JaParser.expressionList_return retval = new JaParser.expressionList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal134=null;
        JaParser.expression_return expression133 = null;

        JaParser.expression_return expression135 = null;


        Object char_literal134_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:277:5: ( expression ( ',' expression )* )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:277:9: expression ( ',' expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expression_in_expressionList1769);
            expression133=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression133.getTree());
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:277:20: ( ',' expression )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==78) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:277:21: ',' expression
            	    {
            	    char_literal134=(Token)match(input,78,FOLLOW_78_in_expressionList1772); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal134_tree = (Object)adaptor.create(char_literal134);
            	    adaptor.addChild(root_0, char_literal134_tree);
            	    }
            	    pushFollow(FOLLOW_expression_in_expressionList1774);
            	    expression135=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression135.getTree());

            	    }
            	    break;

            	default :
            	    break loop36;
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:280:1: statementExpression : expression ;
    public final JaParser.statementExpression_return statementExpression() throws RecognitionException {
        JaParser.statementExpression_return retval = new JaParser.statementExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.expression_return expression136 = null;



        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:281:5: ( expression )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:281:9: expression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expression_in_statementExpression1795);
            expression136=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression136.getTree());

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

    public static class constantExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constantExpression"
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:284:1: constantExpression : expression ;
    public final JaParser.constantExpression_return constantExpression() throws RecognitionException {
        JaParser.constantExpression_return retval = new JaParser.constantExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.expression_return expression137 = null;



        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:285:5: ( expression )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:285:9: expression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expression_in_constantExpression1818);
            expression137=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression137.getTree());

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
    // $ANTLR end "constantExpression"

    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:288:1: expression : orExpression (ap= assignmentOperator expression )? -> {$ap.c == '='}? ^( '=' orExpression expression ) -> {$ap.c == '+'}? ^( EQ orExpression ^( PLUS orExpression expression ) ) -> {$ap.c == '-'}? ^( EQ orExpression ^( MINUS orExpression expression ) ) -> {$ap.c == '*'}? ^( EQ orExpression ^( STAR orExpression expression ) ) -> {$ap.c == '/'}? ^( EQ orExpression ^( SLASH orExpression expression ) ) -> orExpression ;
    public final JaParser.expression_return expression() throws RecognitionException {
        JaParser.expression_return retval = new JaParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.assignmentOperator_return ap = null;

        JaParser.orExpression_return orExpression138 = null;

        JaParser.expression_return expression139 = null;


        RewriteRuleSubtreeStream stream_assignmentOperator=new RewriteRuleSubtreeStream(adaptor,"rule assignmentOperator");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_orExpression=new RewriteRuleSubtreeStream(adaptor,"rule orExpression");
        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:289:5: ( orExpression (ap= assignmentOperator expression )? -> {$ap.c == '='}? ^( '=' orExpression expression ) -> {$ap.c == '+'}? ^( EQ orExpression ^( PLUS orExpression expression ) ) -> {$ap.c == '-'}? ^( EQ orExpression ^( MINUS orExpression expression ) ) -> {$ap.c == '*'}? ^( EQ orExpression ^( STAR orExpression expression ) ) -> {$ap.c == '/'}? ^( EQ orExpression ^( SLASH orExpression expression ) ) -> orExpression )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:289:8: orExpression (ap= assignmentOperator expression )?
            {
            pushFollow(FOLLOW_orExpression_in_expression1840);
            orExpression138=orExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_orExpression.add(orExpression138.getTree());
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:289:21: (ap= assignmentOperator expression )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==EQ||(LA37_0>=84 && LA37_0<=87)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:289:23: ap= assignmentOperator expression
                    {
                    pushFollow(FOLLOW_assignmentOperator_in_expression1846);
                    ap=assignmentOperator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_assignmentOperator.add(ap.getTree());
                    pushFollow(FOLLOW_expression_in_expression1848);
                    expression139=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression139.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: orExpression, orExpression, orExpression, EQ, orExpression, orExpression, expression, orExpression, expression, expression, orExpression, expression, expression, orExpression, orExpression, orExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 289:58: -> {$ap.c == '='}? ^( '=' orExpression expression )
            if ((ap!=null?ap.c:0) == '=') {
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:289:77: ^( '=' orExpression expression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EQ, "EQ"), root_1);

                adaptor.addChild(root_1, stream_orExpression.nextTree());
                adaptor.addChild(root_1, stream_expression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 290:13: -> {$ap.c == '+'}? ^( EQ orExpression ^( PLUS orExpression expression ) )
            if ((ap!=null?ap.c:0) == '+') {
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:290:32: ^( EQ orExpression ^( PLUS orExpression expression ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EQ, "EQ"), root_1);

                adaptor.addChild(root_1, stream_orExpression.nextTree());
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:290:50: ^( PLUS orExpression expression )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(PLUS, "PLUS"), root_2);

                adaptor.addChild(root_2, stream_orExpression.nextTree());
                adaptor.addChild(root_2, stream_expression.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 291:13: -> {$ap.c == '-'}? ^( EQ orExpression ^( MINUS orExpression expression ) )
            if ((ap!=null?ap.c:0) == '-') {
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:291:32: ^( EQ orExpression ^( MINUS orExpression expression ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EQ, "EQ"), root_1);

                adaptor.addChild(root_1, stream_orExpression.nextTree());
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:291:50: ^( MINUS orExpression expression )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(MINUS, "MINUS"), root_2);

                adaptor.addChild(root_2, stream_orExpression.nextTree());
                adaptor.addChild(root_2, stream_expression.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 292:13: -> {$ap.c == '*'}? ^( EQ orExpression ^( STAR orExpression expression ) )
            if ((ap!=null?ap.c:0) == '*') {
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:292:32: ^( EQ orExpression ^( STAR orExpression expression ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EQ, "EQ"), root_1);

                adaptor.addChild(root_1, stream_orExpression.nextTree());
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:292:50: ^( STAR orExpression expression )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(STAR, "STAR"), root_2);

                adaptor.addChild(root_2, stream_orExpression.nextTree());
                adaptor.addChild(root_2, stream_expression.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 293:13: -> {$ap.c == '/'}? ^( EQ orExpression ^( SLASH orExpression expression ) )
            if ((ap!=null?ap.c:0) == '/') {
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:293:32: ^( EQ orExpression ^( SLASH orExpression expression ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EQ, "EQ"), root_1);

                adaptor.addChild(root_1, stream_orExpression.nextTree());
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:293:50: ^( SLASH orExpression expression )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(SLASH, "SLASH"), root_2);

                adaptor.addChild(root_2, stream_orExpression.nextTree());
                adaptor.addChild(root_2, stream_expression.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 294:13: -> orExpression
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
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignmentOperator"
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:297:1: assignmentOperator returns [char c] : ( '=' | '+=' | '-=' | '*=' | '/=' );
    public final JaParser.assignmentOperator_return assignmentOperator() throws RecognitionException {
        JaParser.assignmentOperator_return retval = new JaParser.assignmentOperator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal140=null;
        Token string_literal141=null;
        Token string_literal142=null;
        Token string_literal143=null;
        Token string_literal144=null;

        Object char_literal140_tree=null;
        Object string_literal141_tree=null;
        Object string_literal142_tree=null;
        Object string_literal143_tree=null;
        Object string_literal144_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:298:5: ( '=' | '+=' | '-=' | '*=' | '/=' )
            int alt38=5;
            switch ( input.LA(1) ) {
            case EQ:
                {
                alt38=1;
                }
                break;
            case 84:
                {
                alt38=2;
                }
                break;
            case 85:
                {
                alt38=3;
                }
                break;
            case 86:
                {
                alt38=4;
                }
                break;
            case 87:
                {
                alt38=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:298:9: '='
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal140=(Token)match(input,EQ,FOLLOW_EQ_in_assignmentOperator2028); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal140_tree = (Object)adaptor.create(char_literal140);
                    adaptor.addChild(root_0, char_literal140_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.c = '='; 
                    }

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:299:9: '+='
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal141=(Token)match(input,84,FOLLOW_84_in_assignmentOperator2041); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal141_tree = (Object)adaptor.create(string_literal141);
                    adaptor.addChild(root_0, string_literal141_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.c = '+';
                    }

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:300:9: '-='
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal142=(Token)match(input,85,FOLLOW_85_in_assignmentOperator2054); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal142_tree = (Object)adaptor.create(string_literal142);
                    adaptor.addChild(root_0, string_literal142_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.c = '-';
                    }

                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:301:9: '*='
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal143=(Token)match(input,86,FOLLOW_86_in_assignmentOperator2066); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal143_tree = (Object)adaptor.create(string_literal143);
                    adaptor.addChild(root_0, string_literal143_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.c = '*';
                    }

                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:302:9: '/='
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal144=(Token)match(input,87,FOLLOW_87_in_assignmentOperator2078); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal144_tree = (Object)adaptor.create(string_literal144);
                    adaptor.addChild(root_0, string_literal144_tree);
                    }
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
        return retval;
    }
    // $ANTLR end "assignmentOperator"

    public static class orExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "orExpression"
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:305:1: orExpression : andExpression ( '||' andExpression )* ;
    public final JaParser.orExpression_return orExpression() throws RecognitionException {
        JaParser.orExpression_return retval = new JaParser.orExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal146=null;
        JaParser.andExpression_return andExpression145 = null;

        JaParser.andExpression_return andExpression147 = null;


        Object string_literal146_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:306:5: ( andExpression ( '||' andExpression )* )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:306:9: andExpression ( '||' andExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_andExpression_in_orExpression2099);
            andExpression145=andExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, andExpression145.getTree());
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:306:23: ( '||' andExpression )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==88) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:306:25: '||' andExpression
            	    {
            	    string_literal146=(Token)match(input,88,FOLLOW_88_in_orExpression2103); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal146_tree = (Object)adaptor.create(string_literal146);
            	    root_0 = (Object)adaptor.becomeRoot(string_literal146_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_andExpression_in_orExpression2106);
            	    andExpression147=andExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, andExpression147.getTree());

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
    // $ANTLR end "orExpression"

    public static class andExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "andExpression"
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:309:1: andExpression : equalityExpression ( '&&' equalityExpression )* ;
    public final JaParser.andExpression_return andExpression() throws RecognitionException {
        JaParser.andExpression_return retval = new JaParser.andExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal149=null;
        JaParser.equalityExpression_return equalityExpression148 = null;

        JaParser.equalityExpression_return equalityExpression150 = null;


        Object string_literal149_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:310:5: ( equalityExpression ( '&&' equalityExpression )* )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:310:9: equalityExpression ( '&&' equalityExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equalityExpression_in_andExpression2128);
            equalityExpression148=equalityExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression148.getTree());
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:310:28: ( '&&' equalityExpression )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==89) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:310:30: '&&' equalityExpression
            	    {
            	    string_literal149=(Token)match(input,89,FOLLOW_89_in_andExpression2132); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal149_tree = (Object)adaptor.create(string_literal149);
            	    root_0 = (Object)adaptor.becomeRoot(string_literal149_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_equalityExpression_in_andExpression2135);
            	    equalityExpression150=equalityExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression150.getTree());

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
    // $ANTLR end "andExpression"

    public static class equalityExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "equalityExpression"
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:313:1: equalityExpression : instanceOfExpression ( ( '==' | '!=' ) instanceOfExpression )* ;
    public final JaParser.equalityExpression_return equalityExpression() throws RecognitionException {
        JaParser.equalityExpression_return retval = new JaParser.equalityExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set152=null;
        JaParser.instanceOfExpression_return instanceOfExpression151 = null;

        JaParser.instanceOfExpression_return instanceOfExpression153 = null;


        Object set152_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:314:5: ( instanceOfExpression ( ( '==' | '!=' ) instanceOfExpression )* )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:314:9: instanceOfExpression ( ( '==' | '!=' ) instanceOfExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_instanceOfExpression_in_equalityExpression2157);
            instanceOfExpression151=instanceOfExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, instanceOfExpression151.getTree());
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:314:30: ( ( '==' | '!=' ) instanceOfExpression )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=90 && LA41_0<=91)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:314:32: ( '==' | '!=' ) instanceOfExpression
            	    {
            	    set152=(Token)input.LT(1);
            	    set152=(Token)input.LT(1);
            	    if ( (input.LA(1)>=90 && input.LA(1)<=91) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set152), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_instanceOfExpression_in_equalityExpression2170);
            	    instanceOfExpression153=instanceOfExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, instanceOfExpression153.getTree());

            	    }
            	    break;

            	default :
            	    break loop41;
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:317:1: instanceOfExpression : relationalExpression ( INSTANCEOF type )? ;
    public final JaParser.instanceOfExpression_return instanceOfExpression() throws RecognitionException {
        JaParser.instanceOfExpression_return retval = new JaParser.instanceOfExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INSTANCEOF155=null;
        JaParser.relationalExpression_return relationalExpression154 = null;

        JaParser.type_return type156 = null;


        Object INSTANCEOF155_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:318:5: ( relationalExpression ( INSTANCEOF type )? )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:318:9: relationalExpression ( INSTANCEOF type )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relationalExpression_in_instanceOfExpression2192);
            relationalExpression154=relationalExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression154.getTree());
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:318:30: ( INSTANCEOF type )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==INSTANCEOF) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:318:31: INSTANCEOF type
                    {
                    INSTANCEOF155=(Token)match(input,INSTANCEOF,FOLLOW_INSTANCEOF_in_instanceOfExpression2195); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INSTANCEOF155_tree = (Object)adaptor.create(INSTANCEOF155);
                    root_0 = (Object)adaptor.becomeRoot(INSTANCEOF155_tree, root_0);
                    }
                    pushFollow(FOLLOW_type_in_instanceOfExpression2198);
                    type156=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type156.getTree());

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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:321:1: relationalExpression : additiveExpression ( COMPAREOP additiveExpression )* ;
    public final JaParser.relationalExpression_return relationalExpression() throws RecognitionException {
        JaParser.relationalExpression_return retval = new JaParser.relationalExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMPAREOP158=null;
        JaParser.additiveExpression_return additiveExpression157 = null;

        JaParser.additiveExpression_return additiveExpression159 = null;


        Object COMPAREOP158_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:322:5: ( additiveExpression ( COMPAREOP additiveExpression )* )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:322:9: additiveExpression ( COMPAREOP additiveExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_additiveExpression_in_relationalExpression2219);
            additiveExpression157=additiveExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression157.getTree());
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:322:28: ( COMPAREOP additiveExpression )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==COMPAREOP) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:322:30: COMPAREOP additiveExpression
            	    {
            	    COMPAREOP158=(Token)match(input,COMPAREOP,FOLLOW_COMPAREOP_in_relationalExpression2223); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    COMPAREOP158_tree = (Object)adaptor.create(COMPAREOP158);
            	    root_0 = (Object)adaptor.becomeRoot(COMPAREOP158_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_additiveExpression_in_relationalExpression2226);
            	    additiveExpression159=additiveExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression159.getTree());

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
    // $ANTLR end "relationalExpression"

    public static class additiveExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "additiveExpression"
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:325:1: additiveExpression : multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )* ;
    public final JaParser.additiveExpression_return additiveExpression() throws RecognitionException {
        JaParser.additiveExpression_return retval = new JaParser.additiveExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set161=null;
        JaParser.multiplicativeExpression_return multiplicativeExpression160 = null;

        JaParser.multiplicativeExpression_return multiplicativeExpression162 = null;


        Object set161_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:326:5: ( multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )* )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:326:9: multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression2248);
            multiplicativeExpression160=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression160.getTree());
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:326:34: ( ( '+' | '-' ) multiplicativeExpression )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=PLUS && LA44_0<=MINUS)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:326:36: ( '+' | '-' ) multiplicativeExpression
            	    {
            	    set161=(Token)input.LT(1);
            	    set161=(Token)input.LT(1);
            	    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set161), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression2261);
            	    multiplicativeExpression162=multiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression162.getTree());

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
    // $ANTLR end "additiveExpression"

    public static class multiplicativeExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiplicativeExpression"
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:329:1: multiplicativeExpression : unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )* ;
    public final JaParser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        JaParser.multiplicativeExpression_return retval = new JaParser.multiplicativeExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set164=null;
        JaParser.unaryExpression_return unaryExpression163 = null;

        JaParser.unaryExpression_return unaryExpression165 = null;


        Object set164_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:330:5: ( unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )* )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:330:9: unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression2283);
            unaryExpression163=unaryExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression163.getTree());
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:330:25: ( ( '*' | '/' | '%' ) unaryExpression )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0>=STAR && LA45_0<=SLASH)||LA45_0==92) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:330:27: ( '*' | '/' | '%' ) unaryExpression
            	    {
            	    set164=(Token)input.LT(1);
            	    set164=(Token)input.LT(1);
            	    if ( (input.LA(1)>=STAR && input.LA(1)<=SLASH)||input.LA(1)==92 ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set164), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression2302);
            	    unaryExpression165=unaryExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression165.getTree());

            	    }
            	    break;

            	default :
            	    break loop45;
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:333:1: unaryExpression : ( '+' unaryExpression | '-' unaryExpression | '++' unaryExpression | '--' unaryExpression | unaryExpressionNotPlusMinus );
    public final JaParser.unaryExpression_return unaryExpression() throws RecognitionException {
        JaParser.unaryExpression_return retval = new JaParser.unaryExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal166=null;
        Token char_literal168=null;
        Token string_literal170=null;
        Token string_literal172=null;
        JaParser.unaryExpression_return unaryExpression167 = null;

        JaParser.unaryExpression_return unaryExpression169 = null;

        JaParser.unaryExpression_return unaryExpression171 = null;

        JaParser.unaryExpression_return unaryExpression173 = null;

        JaParser.unaryExpressionNotPlusMinus_return unaryExpressionNotPlusMinus174 = null;


        Object char_literal166_tree=null;
        Object char_literal168_tree=null;
        Object string_literal170_tree=null;
        Object string_literal172_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:334:5: ( '+' unaryExpression | '-' unaryExpression | '++' unaryExpression | '--' unaryExpression | unaryExpressionNotPlusMinus )
            int alt46=5;
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
            case 93:
                {
                alt46=3;
                }
                break;
            case 94:
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
            case FloatingPointLiteral:
            case CHARLITERAL:
            case STRINGLITERAL:
            case BOOLEANLITERAL:
            case NULLLITERAL:
            case NEW:
            case 81:
            case 95:
                {
                alt46=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:334:9: '+' unaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal166=(Token)match(input,PLUS,FOLLOW_PLUS_in_unaryExpression2328); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal166_tree = (Object)adaptor.create(char_literal166);
                    adaptor.addChild(root_0, char_literal166_tree);
                    }
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression2330);
                    unaryExpression167=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression167.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:335:9: '-' unaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal168=(Token)match(input,MINUS,FOLLOW_MINUS_in_unaryExpression2340); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal168_tree = (Object)adaptor.create(char_literal168);
                    adaptor.addChild(root_0, char_literal168_tree);
                    }
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression2342);
                    unaryExpression169=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression169.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:336:9: '++' unaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal170=(Token)match(input,93,FOLLOW_93_in_unaryExpression2352); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal170_tree = (Object)adaptor.create(string_literal170);
                    adaptor.addChild(root_0, string_literal170_tree);
                    }
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression2354);
                    unaryExpression171=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression171.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:337:9: '--' unaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal172=(Token)match(input,94,FOLLOW_94_in_unaryExpression2364); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal172_tree = (Object)adaptor.create(string_literal172);
                    adaptor.addChild(root_0, string_literal172_tree);
                    }
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression2366);
                    unaryExpression173=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression173.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:338:9: unaryExpressionNotPlusMinus
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression2376);
                    unaryExpressionNotPlusMinus174=unaryExpressionNotPlusMinus();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpressionNotPlusMinus174.getTree());

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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:341:1: unaryExpressionNotPlusMinus : ( '!' unaryExpression | ( '(' primitiveType ')' )=> '(' primitiveType ')' unaryExpression | ( '(' nonPrimitiveType ')' unaryExpressionNotPlusMinus )=> '(' nonPrimitiveType ')' unaryExpressionNotPlusMinus | NEW creator | primary ( selector )* ( '++' | '--' )? );
    public final JaParser.unaryExpressionNotPlusMinus_return unaryExpressionNotPlusMinus() throws RecognitionException {
        JaParser.unaryExpressionNotPlusMinus_return retval = new JaParser.unaryExpressionNotPlusMinus_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal175=null;
        Token char_literal177=null;
        Token char_literal179=null;
        Token char_literal181=null;
        Token char_literal183=null;
        Token NEW185=null;
        Token set189=null;
        JaParser.unaryExpression_return unaryExpression176 = null;

        JaParser.primitiveType_return primitiveType178 = null;

        JaParser.unaryExpression_return unaryExpression180 = null;

        JaParser.nonPrimitiveType_return nonPrimitiveType182 = null;

        JaParser.unaryExpressionNotPlusMinus_return unaryExpressionNotPlusMinus184 = null;

        JaParser.creator_return creator186 = null;

        JaParser.primary_return primary187 = null;

        JaParser.selector_return selector188 = null;


        Object char_literal175_tree=null;
        Object char_literal177_tree=null;
        Object char_literal179_tree=null;
        Object char_literal181_tree=null;
        Object char_literal183_tree=null;
        Object NEW185_tree=null;
        Object set189_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:342:5: ( '!' unaryExpression | ( '(' primitiveType ')' )=> '(' primitiveType ')' unaryExpression | ( '(' nonPrimitiveType ')' unaryExpressionNotPlusMinus )=> '(' nonPrimitiveType ')' unaryExpressionNotPlusMinus | NEW creator | primary ( selector )* ( '++' | '--' )? )
            int alt49=5;
            alt49 = dfa49.predict(input);
            switch (alt49) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:342:7: '!' unaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal175=(Token)match(input,95,FOLLOW_95_in_unaryExpressionNotPlusMinus2393); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal175_tree = (Object)adaptor.create(char_literal175);
                    adaptor.addChild(root_0, char_literal175_tree);
                    }
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus2395);
                    unaryExpression176=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression176.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:343:9: ( '(' primitiveType ')' )=> '(' primitiveType ')' unaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal177=(Token)match(input,81,FOLLOW_81_in_unaryExpressionNotPlusMinus2416); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal177_tree = (Object)adaptor.create(char_literal177);
                    adaptor.addChild(root_0, char_literal177_tree);
                    }
                    pushFollow(FOLLOW_primitiveType_in_unaryExpressionNotPlusMinus2418);
                    primitiveType178=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType178.getTree());
                    char_literal179=(Token)match(input,82,FOLLOW_82_in_unaryExpressionNotPlusMinus2420); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal179_tree = (Object)adaptor.create(char_literal179);
                    adaptor.addChild(root_0, char_literal179_tree);
                    }
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus2422);
                    unaryExpression180=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression180.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:345:9: ( '(' nonPrimitiveType ')' unaryExpressionNotPlusMinus )=> '(' nonPrimitiveType ')' unaryExpressionNotPlusMinus
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal181=(Token)match(input,81,FOLLOW_81_in_unaryExpressionNotPlusMinus2450); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal181_tree = (Object)adaptor.create(char_literal181);
                    adaptor.addChild(root_0, char_literal181_tree);
                    }
                    pushFollow(FOLLOW_nonPrimitiveType_in_unaryExpressionNotPlusMinus2452);
                    nonPrimitiveType182=nonPrimitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nonPrimitiveType182.getTree());
                    char_literal183=(Token)match(input,82,FOLLOW_82_in_unaryExpressionNotPlusMinus2455); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal183_tree = (Object)adaptor.create(char_literal183);
                    adaptor.addChild(root_0, char_literal183_tree);
                    }
                    pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpressionNotPlusMinus2457);
                    unaryExpressionNotPlusMinus184=unaryExpressionNotPlusMinus();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpressionNotPlusMinus184.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:346:9: NEW creator
                    {
                    root_0 = (Object)adaptor.nil();

                    NEW185=(Token)match(input,NEW,FOLLOW_NEW_in_unaryExpressionNotPlusMinus2467); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NEW185_tree = (Object)adaptor.create(NEW185);
                    adaptor.addChild(root_0, NEW185_tree);
                    }
                    pushFollow(FOLLOW_creator_in_unaryExpressionNotPlusMinus2469);
                    creator186=creator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, creator186.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:347:9: primary ( selector )* ( '++' | '--' )?
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primary_in_unaryExpressionNotPlusMinus2479);
                    primary187=primary();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primary187.getTree());
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:347:26: ( selector )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==79||LA47_0==96) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:347:26: selector
                    	    {
                    	    pushFollow(FOLLOW_selector_in_unaryExpressionNotPlusMinus2482);
                    	    selector188=selector();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(selector188.getTree(), root_0);

                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);

                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:347:29: ( '++' | '--' )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( ((LA48_0>=93 && LA48_0<=94)) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:
                            {
                            set189=(Token)input.LT(1);
                            if ( (input.LA(1)>=93 && input.LA(1)<=94) ) {
                                input.consume();
                                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set189));
                                state.errorRecovery=false;state.failed=false;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:354:1: primary : ( parExpression | THIS | SUPER superMemberAccess | literal | IDENTIFIER | ( IDENTIFIER -> IDENTIFIER ) ( '[' ']' -> ^( ARRAYTYPE $primary) )+ ( '.' CLASS -> ^( DOTCLASS $primary) ) | IDENTIFIER arguments -> ^( METHODCALL IDENTIFIER arguments THIS ) | IDENTIFIER '.' CLASS -> ^( DOTCLASS IDENTIFIER ) | ( primitiveType -> primitiveType ) ( '[' ']' -> ^( ARRAYTYPE $primary) )* ( '.' CLASS -> ^( DOTCLASS $primary) ) | VOID '.' CLASS -> ^( DOTCLASS VOID ) );
    public final JaParser.primary_return primary() throws RecognitionException {
        JaParser.primary_return retval = new JaParser.primary_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token THIS191=null;
        Token SUPER192=null;
        Token IDENTIFIER195=null;
        Token IDENTIFIER196=null;
        Token char_literal197=null;
        Token char_literal198=null;
        Token char_literal199=null;
        Token CLASS200=null;
        Token IDENTIFIER201=null;
        Token IDENTIFIER203=null;
        Token char_literal204=null;
        Token CLASS205=null;
        Token char_literal207=null;
        Token char_literal208=null;
        Token char_literal209=null;
        Token CLASS210=null;
        Token VOID211=null;
        Token char_literal212=null;
        Token CLASS213=null;
        JaParser.parExpression_return parExpression190 = null;

        JaParser.superMemberAccess_return superMemberAccess193 = null;

        JaParser.literal_return literal194 = null;

        JaParser.arguments_return arguments202 = null;

        JaParser.primitiveType_return primitiveType206 = null;


        Object THIS191_tree=null;
        Object SUPER192_tree=null;
        Object IDENTIFIER195_tree=null;
        Object IDENTIFIER196_tree=null;
        Object char_literal197_tree=null;
        Object char_literal198_tree=null;
        Object char_literal199_tree=null;
        Object CLASS200_tree=null;
        Object IDENTIFIER201_tree=null;
        Object IDENTIFIER203_tree=null;
        Object char_literal204_tree=null;
        Object CLASS205_tree=null;
        Object char_literal207_tree=null;
        Object char_literal208_tree=null;
        Object char_literal209_tree=null;
        Object CLASS210_tree=null;
        Object VOID211_tree=null;
        Object char_literal212_tree=null;
        Object CLASS213_tree=null;
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
        RewriteRuleTokenStream stream_CLASS=new RewriteRuleTokenStream(adaptor,"token CLASS");
        RewriteRuleTokenStream stream_VOID=new RewriteRuleTokenStream(adaptor,"token VOID");
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");
        RewriteRuleSubtreeStream stream_primitiveType=new RewriteRuleSubtreeStream(adaptor,"rule primitiveType");
        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:355:5: ( parExpression | THIS | SUPER superMemberAccess | literal | IDENTIFIER | ( IDENTIFIER -> IDENTIFIER ) ( '[' ']' -> ^( ARRAYTYPE $primary) )+ ( '.' CLASS -> ^( DOTCLASS $primary) ) | IDENTIFIER arguments -> ^( METHODCALL IDENTIFIER arguments THIS ) | IDENTIFIER '.' CLASS -> ^( DOTCLASS IDENTIFIER ) | ( primitiveType -> primitiveType ) ( '[' ']' -> ^( ARRAYTYPE $primary) )* ( '.' CLASS -> ^( DOTCLASS $primary) ) | VOID '.' CLASS -> ^( DOTCLASS VOID ) )
            int alt52=10;
            alt52 = dfa52.predict(input);
            switch (alt52) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:355:9: parExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_parExpression_in_primary2546);
                    parExpression190=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parExpression190.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:356:9: THIS
                    {
                    root_0 = (Object)adaptor.nil();

                    THIS191=(Token)match(input,THIS,FOLLOW_THIS_in_primary2556); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    THIS191_tree = (Object)adaptor.create(THIS191);
                    adaptor.addChild(root_0, THIS191_tree);
                    }

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:357:9: SUPER superMemberAccess
                    {
                    root_0 = (Object)adaptor.nil();

                    SUPER192=(Token)match(input,SUPER,FOLLOW_SUPER_in_primary2567); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SUPER192_tree = (Object)adaptor.create(SUPER192);
                    root_0 = (Object)adaptor.becomeRoot(SUPER192_tree, root_0);
                    }
                    pushFollow(FOLLOW_superMemberAccess_in_primary2570);
                    superMemberAccess193=superMemberAccess();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, superMemberAccess193.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:358:9: literal
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_literal_in_primary2580);
                    literal194=literal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, literal194.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:359:9: IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();

                    IDENTIFIER195=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary2590); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER195_tree = (Object)adaptor.create(IDENTIFIER195);
                    adaptor.addChild(root_0, IDENTIFIER195_tree);
                    }

                    }
                    break;
                case 6 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:360:9: ( IDENTIFIER -> IDENTIFIER ) ( '[' ']' -> ^( ARRAYTYPE $primary) )+ ( '.' CLASS -> ^( DOTCLASS $primary) )
                    {
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:360:9: ( IDENTIFIER -> IDENTIFIER )
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:360:10: IDENTIFIER
                    {
                    IDENTIFIER196=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary2601); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER196);



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
                    // 360:21: -> IDENTIFIER
                    {
                        adaptor.addChild(root_0, stream_IDENTIFIER.nextNode());

                    }

                    retval.tree = root_0;}
                    }

                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:360:36: ( '[' ']' -> ^( ARRAYTYPE $primary) )+
                    int cnt50=0;
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==79) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:360:37: '[' ']'
                    	    {
                    	    char_literal197=(Token)match(input,79,FOLLOW_79_in_primary2609); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_79.add(char_literal197);

                    	    char_literal198=(Token)match(input,80,FOLLOW_80_in_primary2611); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_80.add(char_literal198);



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
                    	    // 360:45: -> ^( ARRAYTYPE $primary)
                    	    {
                    	        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:360:48: ^( ARRAYTYPE $primary)
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
                    	    if ( cnt50 >= 1 ) break loop50;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(50, input);
                                throw eee;
                        }
                        cnt50++;
                    } while (true);

                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:360:72: ( '.' CLASS -> ^( DOTCLASS $primary) )
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:360:73: '.' CLASS
                    {
                    char_literal199=(Token)match(input,96,FOLLOW_96_in_primary2625); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_96.add(char_literal199);

                    CLASS200=(Token)match(input,CLASS,FOLLOW_CLASS_in_primary2627); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLASS.add(CLASS200);



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
                    // 360:83: -> ^( DOTCLASS $primary)
                    {
                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:360:86: ^( DOTCLASS $primary)
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
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:361:8: IDENTIFIER arguments
                    {
                    IDENTIFIER201=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary2646); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER201);

                    pushFollow(FOLLOW_arguments_in_primary2649);
                    arguments202=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arguments.add(arguments202.getTree());


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
                    // 361:30: -> ^( METHODCALL IDENTIFIER arguments THIS )
                    {
                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:361:33: ^( METHODCALL IDENTIFIER arguments THIS )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(METHODCALL, "METHODCALL"), root_1);

                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        adaptor.addChild(root_1, stream_arguments.nextTree());
                        adaptor.addChild(root_1, (Object)adaptor.create(THIS, "THIS"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:362:7: IDENTIFIER '.' CLASS
                    {
                    IDENTIFIER203=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary2669); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER203);

                    char_literal204=(Token)match(input,96,FOLLOW_96_in_primary2671); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_96.add(char_literal204);

                    CLASS205=(Token)match(input,CLASS,FOLLOW_CLASS_in_primary2673); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLASS.add(CLASS205);



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
                    // 362:28: -> ^( DOTCLASS IDENTIFIER )
                    {
                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:362:31: ^( DOTCLASS IDENTIFIER )
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
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:363:9: ( primitiveType -> primitiveType ) ( '[' ']' -> ^( ARRAYTYPE $primary) )* ( '.' CLASS -> ^( DOTCLASS $primary) )
                    {
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:363:9: ( primitiveType -> primitiveType )
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:363:10: primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_primary2692);
                    primitiveType206=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primitiveType.add(primitiveType206.getTree());


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
                    // 363:24: -> primitiveType
                    {
                        adaptor.addChild(root_0, stream_primitiveType.nextTree());

                    }

                    retval.tree = root_0;}
                    }

                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:363:42: ( '[' ']' -> ^( ARRAYTYPE $primary) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==79) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:363:43: '[' ']'
                    	    {
                    	    char_literal207=(Token)match(input,79,FOLLOW_79_in_primary2700); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_79.add(char_literal207);

                    	    char_literal208=(Token)match(input,80,FOLLOW_80_in_primary2702); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_80.add(char_literal208);



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
                    	    // 363:51: -> ^( ARRAYTYPE $primary)
                    	    {
                    	        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:363:54: ^( ARRAYTYPE $primary)
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
                    	    break loop51;
                        }
                    } while (true);

                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:363:78: ( '.' CLASS -> ^( DOTCLASS $primary) )
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:363:79: '.' CLASS
                    {
                    char_literal209=(Token)match(input,96,FOLLOW_96_in_primary2716); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_96.add(char_literal209);

                    CLASS210=(Token)match(input,CLASS,FOLLOW_CLASS_in_primary2718); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLASS.add(CLASS210);



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
                    // 363:89: -> ^( DOTCLASS $primary)
                    {
                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:363:92: ^( DOTCLASS $primary)
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
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:364:9: VOID '.' CLASS
                    {
                    VOID211=(Token)match(input,VOID,FOLLOW_VOID_in_primary2738); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VOID.add(VOID211);

                    char_literal212=(Token)match(input,96,FOLLOW_96_in_primary2740); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_96.add(char_literal212);

                    CLASS213=(Token)match(input,CLASS,FOLLOW_CLASS_in_primary2742); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLASS.add(CLASS213);



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
                    // 364:24: -> ^( DOTCLASS VOID )
                    {
                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:364:27: ^( DOTCLASS VOID )
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:367:1: selector : ( '.' IDENTIFIER -> ^( FIELDACCESS IDENTIFIER ) | '.' IDENTIFIER arguments -> ^( METHODCALL IDENTIFIER ( arguments )? ) | '[' expression ']' -> ^( ARRAYACCESS expression ) );
    public final JaParser.selector_return selector() throws RecognitionException {
        JaParser.selector_return retval = new JaParser.selector_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal214=null;
        Token IDENTIFIER215=null;
        Token char_literal216=null;
        Token IDENTIFIER217=null;
        Token char_literal219=null;
        Token char_literal221=null;
        JaParser.arguments_return arguments218 = null;

        JaParser.expression_return expression220 = null;


        Object char_literal214_tree=null;
        Object IDENTIFIER215_tree=null;
        Object char_literal216_tree=null;
        Object IDENTIFIER217_tree=null;
        Object char_literal219_tree=null;
        Object char_literal221_tree=null;
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");
        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:368:5: ( '.' IDENTIFIER -> ^( FIELDACCESS IDENTIFIER ) | '.' IDENTIFIER arguments -> ^( METHODCALL IDENTIFIER ( arguments )? ) | '[' expression ']' -> ^( ARRAYACCESS expression ) )
            int alt53=3;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==96) ) {
                int LA53_1 = input.LA(2);

                if ( (LA53_1==IDENTIFIER) ) {
                    int LA53_3 = input.LA(3);

                    if ( (LA53_3==81) ) {
                        alt53=2;
                    }
                    else if ( (LA53_3==EOF||(LA53_3>=INSTANCEOF && LA53_3<=COMPAREOP)||(LA53_3>=EQ && LA53_3<=SLASH)||LA53_3==75||(LA53_3>=77 && LA53_3<=80)||LA53_3==82||(LA53_3>=84 && LA53_3<=94)||LA53_3==96) ) {
                        alt53=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 53, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA53_0==79) ) {
                alt53=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:368:9: '.' IDENTIFIER
                    {
                    char_literal214=(Token)match(input,96,FOLLOW_96_in_selector2773); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_96.add(char_literal214);

                    IDENTIFIER215=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_selector2775); if (state.failed) return retval; 
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
                    // 368:24: -> ^( FIELDACCESS IDENTIFIER )
                    {
                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:368:27: ^( FIELDACCESS IDENTIFIER )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FIELDACCESS, "FIELDACCESS"), root_1);

                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:369:7: '.' IDENTIFIER arguments
                    {
                    char_literal216=(Token)match(input,96,FOLLOW_96_in_selector2791); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_96.add(char_literal216);

                    IDENTIFIER217=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_selector2793); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER217);

                    pushFollow(FOLLOW_arguments_in_selector2795);
                    arguments218=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arguments.add(arguments218.getTree());


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
                    // 369:32: -> ^( METHODCALL IDENTIFIER ( arguments )? )
                    {
                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:369:35: ^( METHODCALL IDENTIFIER ( arguments )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(METHODCALL, "METHODCALL"), root_1);

                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:369:59: ( arguments )?
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
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:372:9: '[' expression ']'
                    {
                    char_literal219=(Token)match(input,79,FOLLOW_79_in_selector2826); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_79.add(char_literal219);

                    pushFollow(FOLLOW_expression_in_selector2828);
                    expression220=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression220.getTree());
                    char_literal221=(Token)match(input,80,FOLLOW_80_in_selector2830); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_80.add(char_literal221);



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
                    // 372:27: -> ^( ARRAYACCESS expression )
                    {
                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:372:30: ^( ARRAYACCESS expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAYACCESS, "ARRAYACCESS"), root_1);

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

    public static class identifierSuffix_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "identifierSuffix"
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:375:1: identifierSuffix : ( ( '[' ']' )+ '.' CLASS | arguments | '.' CLASS );
    public final JaParser.identifierSuffix_return identifierSuffix() throws RecognitionException {
        JaParser.identifierSuffix_return retval = new JaParser.identifierSuffix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal222=null;
        Token char_literal223=null;
        Token char_literal224=null;
        Token CLASS225=null;
        Token char_literal227=null;
        Token CLASS228=null;
        JaParser.arguments_return arguments226 = null;


        Object char_literal222_tree=null;
        Object char_literal223_tree=null;
        Object char_literal224_tree=null;
        Object CLASS225_tree=null;
        Object char_literal227_tree=null;
        Object CLASS228_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:376:5: ( ( '[' ']' )+ '.' CLASS | arguments | '.' CLASS )
            int alt55=3;
            switch ( input.LA(1) ) {
            case 79:
                {
                alt55=1;
                }
                break;
            case 81:
                {
                alt55=2;
                }
                break;
            case 96:
                {
                alt55=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:376:9: ( '[' ']' )+ '.' CLASS
                    {
                    root_0 = (Object)adaptor.nil();

                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:376:9: ( '[' ']' )+
                    int cnt54=0;
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==79) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:376:10: '[' ']'
                    	    {
                    	    char_literal222=(Token)match(input,79,FOLLOW_79_in_identifierSuffix2857); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal222_tree = (Object)adaptor.create(char_literal222);
                    	    adaptor.addChild(root_0, char_literal222_tree);
                    	    }
                    	    char_literal223=(Token)match(input,80,FOLLOW_80_in_identifierSuffix2859); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal223_tree = (Object)adaptor.create(char_literal223);
                    	    adaptor.addChild(root_0, char_literal223_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt54 >= 1 ) break loop54;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(54, input);
                                throw eee;
                        }
                        cnt54++;
                    } while (true);

                    char_literal224=(Token)match(input,96,FOLLOW_96_in_identifierSuffix2863); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal224_tree = (Object)adaptor.create(char_literal224);
                    adaptor.addChild(root_0, char_literal224_tree);
                    }
                    CLASS225=(Token)match(input,CLASS,FOLLOW_CLASS_in_identifierSuffix2865); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CLASS225_tree = (Object)adaptor.create(CLASS225);
                    adaptor.addChild(root_0, CLASS225_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:378:9: arguments
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_arguments_in_identifierSuffix2880);
                    arguments226=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments226.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:379:9: '.' CLASS
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal227=(Token)match(input,96,FOLLOW_96_in_identifierSuffix2890); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal227_tree = (Object)adaptor.create(char_literal227);
                    adaptor.addChild(root_0, char_literal227_tree);
                    }
                    CLASS228=(Token)match(input,CLASS,FOLLOW_CLASS_in_identifierSuffix2892); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CLASS228_tree = (Object)adaptor.create(CLASS228);
                    adaptor.addChild(root_0, CLASS228_tree);
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
    // $ANTLR end "identifierSuffix"

    public static class creator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "creator"
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:384:1: creator : createdName ( arrayCreatorRest | classCreatorRest ) ;
    public final JaParser.creator_return creator() throws RecognitionException {
        JaParser.creator_return retval = new JaParser.creator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.createdName_return createdName229 = null;

        JaParser.arrayCreatorRest_return arrayCreatorRest230 = null;

        JaParser.classCreatorRest_return classCreatorRest231 = null;



        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:385:5: ( createdName ( arrayCreatorRest | classCreatorRest ) )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:385:8: createdName ( arrayCreatorRest | classCreatorRest )
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_createdName_in_creator2920);
            createdName229=createdName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, createdName229.getTree());
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:385:20: ( arrayCreatorRest | classCreatorRest )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==79) ) {
                alt56=1;
            }
            else if ( (LA56_0==81) ) {
                alt56=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:385:21: arrayCreatorRest
                    {
                    pushFollow(FOLLOW_arrayCreatorRest_in_creator2923);
                    arrayCreatorRest230=arrayCreatorRest();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayCreatorRest230.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:385:40: classCreatorRest
                    {
                    pushFollow(FOLLOW_classCreatorRest_in_creator2927);
                    classCreatorRest231=classCreatorRest();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classCreatorRest231.getTree());

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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:388:1: createdName : ( classType | primitiveType );
    public final JaParser.createdName_return createdName() throws RecognitionException {
        JaParser.createdName_return retval = new JaParser.createdName_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.classType_return classType232 = null;

        JaParser.primitiveType_return primitiveType233 = null;



        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:389:5: ( classType | primitiveType )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==IDENTIFIER) ) {
                alt57=1;
            }
            else if ( ((LA57_0>=CHAR && LA57_0<=DOUBLE)) ) {
                alt57=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:389:9: classType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_classType_in_createdName2947);
                    classType232=classType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classType232.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:390:9: primitiveType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primitiveType_in_createdName2957);
                    primitiveType233=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType233.getTree());

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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:393:1: arrayCreatorRest : ( '[' ']' ( '[' ']' )* arrayInitializer | '[' expression ']' ( '[' expression ']' )* );
    public final JaParser.arrayCreatorRest_return arrayCreatorRest() throws RecognitionException {
        JaParser.arrayCreatorRest_return retval = new JaParser.arrayCreatorRest_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal234=null;
        Token char_literal235=null;
        Token char_literal236=null;
        Token char_literal237=null;
        Token char_literal239=null;
        Token char_literal241=null;
        Token char_literal242=null;
        Token char_literal244=null;
        JaParser.arrayInitializer_return arrayInitializer238 = null;

        JaParser.expression_return expression240 = null;

        JaParser.expression_return expression243 = null;


        Object char_literal234_tree=null;
        Object char_literal235_tree=null;
        Object char_literal236_tree=null;
        Object char_literal237_tree=null;
        Object char_literal239_tree=null;
        Object char_literal241_tree=null;
        Object char_literal242_tree=null;
        Object char_literal244_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:394:5: ( '[' ']' ( '[' ']' )* arrayInitializer | '[' expression ']' ( '[' expression ']' )* )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==79) ) {
                int LA60_1 = input.LA(2);

                if ( (LA60_1==80) ) {
                    alt60=1;
                }
                else if ( (LA60_1==IDENTIFIER||LA60_1==VOID||(LA60_1>=CHAR && LA60_1<=NULLLITERAL)||LA60_1==NEW||(LA60_1>=PLUS && LA60_1<=MINUS)||LA60_1==81||(LA60_1>=93 && LA60_1<=95)) ) {
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
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:394:9: '[' ']' ( '[' ']' )* arrayInitializer
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal234=(Token)match(input,79,FOLLOW_79_in_arrayCreatorRest2980); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal234_tree = (Object)adaptor.create(char_literal234);
                    adaptor.addChild(root_0, char_literal234_tree);
                    }
                    char_literal235=(Token)match(input,80,FOLLOW_80_in_arrayCreatorRest2981); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal235_tree = (Object)adaptor.create(char_literal235);
                    adaptor.addChild(root_0, char_literal235_tree);
                    }
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:394:16: ( '[' ']' )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==79) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:394:17: '[' ']'
                    	    {
                    	    char_literal236=(Token)match(input,79,FOLLOW_79_in_arrayCreatorRest2984); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal236_tree = (Object)adaptor.create(char_literal236);
                    	    adaptor.addChild(root_0, char_literal236_tree);
                    	    }
                    	    char_literal237=(Token)match(input,80,FOLLOW_80_in_arrayCreatorRest2986); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal237_tree = (Object)adaptor.create(char_literal237);
                    	    adaptor.addChild(root_0, char_literal237_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop58;
                        }
                    } while (true);

                    pushFollow(FOLLOW_arrayInitializer_in_arrayCreatorRest2990);
                    arrayInitializer238=arrayInitializer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayInitializer238.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:395:7: '[' expression ']' ( '[' expression ']' )*
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal239=(Token)match(input,79,FOLLOW_79_in_arrayCreatorRest2998); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal239_tree = (Object)adaptor.create(char_literal239);
                    adaptor.addChild(root_0, char_literal239_tree);
                    }
                    pushFollow(FOLLOW_expression_in_arrayCreatorRest3000);
                    expression240=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression240.getTree());
                    char_literal241=(Token)match(input,80,FOLLOW_80_in_arrayCreatorRest3002); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal241_tree = (Object)adaptor.create(char_literal241);
                    adaptor.addChild(root_0, char_literal241_tree);
                    }
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:395:26: ( '[' expression ']' )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==79) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:395:27: '[' expression ']'
                    	    {
                    	    char_literal242=(Token)match(input,79,FOLLOW_79_in_arrayCreatorRest3005); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal242_tree = (Object)adaptor.create(char_literal242);
                    	    adaptor.addChild(root_0, char_literal242_tree);
                    	    }
                    	    pushFollow(FOLLOW_expression_in_arrayCreatorRest3007);
                    	    expression243=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression243.getTree());
                    	    char_literal244=(Token)match(input,80,FOLLOW_80_in_arrayCreatorRest3009); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal244_tree = (Object)adaptor.create(char_literal244);
                    	    adaptor.addChild(root_0, char_literal244_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop59;
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:398:1: classCreatorRest : arguments ;
    public final JaParser.classCreatorRest_return classCreatorRest() throws RecognitionException {
        JaParser.classCreatorRest_return retval = new JaParser.classCreatorRest_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.arguments_return arguments245 = null;



        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:399:5: ( arguments )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:399:9: arguments
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_arguments_in_classCreatorRest3032);
            arguments245=arguments();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments245.getTree());

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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:402:1: superMemberAccess : '.' IDENTIFIER ( arguments )? ;
    public final JaParser.superMemberAccess_return superMemberAccess() throws RecognitionException {
        JaParser.superMemberAccess_return retval = new JaParser.superMemberAccess_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal246=null;
        Token IDENTIFIER247=null;
        JaParser.arguments_return arguments248 = null;


        Object char_literal246_tree=null;
        Object IDENTIFIER247_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:403:2: ( '.' IDENTIFIER ( arguments )? )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:404:2: '.' IDENTIFIER ( arguments )?
            {
            root_0 = (Object)adaptor.nil();

            char_literal246=(Token)match(input,96,FOLLOW_96_in_superMemberAccess3054); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal246_tree = (Object)adaptor.create(char_literal246);
            adaptor.addChild(root_0, char_literal246_tree);
            }
            IDENTIFIER247=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_superMemberAccess3056); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER247_tree = (Object)adaptor.create(IDENTIFIER247);
            adaptor.addChild(root_0, IDENTIFIER247_tree);
            }
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:404:17: ( arguments )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==81) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:404:17: arguments
                    {
                    pushFollow(FOLLOW_arguments_in_superMemberAccess3058);
                    arguments248=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments248.getTree());

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
    // $ANTLR end "superMemberAccess"

    public static class arguments_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arguments"
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:407:1: arguments : '(' ( expressionList )? ')' ;
    public final JaParser.arguments_return arguments() throws RecognitionException {
        JaParser.arguments_return retval = new JaParser.arguments_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal249=null;
        Token char_literal251=null;
        JaParser.expressionList_return expressionList250 = null;


        Object char_literal249_tree=null;
        Object char_literal251_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:408:5: ( '(' ( expressionList )? ')' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:408:9: '(' ( expressionList )? ')'
            {
            root_0 = (Object)adaptor.nil();

            char_literal249=(Token)match(input,81,FOLLOW_81_in_arguments3076); if (state.failed) return retval;
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:408:14: ( expressionList )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==IDENTIFIER||LA62_0==VOID||(LA62_0>=CHAR && LA62_0<=NULLLITERAL)||LA62_0==NEW||(LA62_0>=PLUS && LA62_0<=MINUS)||LA62_0==81||(LA62_0>=93 && LA62_0<=95)) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:408:14: expressionList
                    {
                    pushFollow(FOLLOW_expressionList_in_arguments3079);
                    expressionList250=expressionList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList250.getTree());

                    }
                    break;

            }

            char_literal251=(Token)match(input,82,FOLLOW_82_in_arguments3082); if (state.failed) return retval;

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
        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:252:2: ( ELSE )
        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:252:3: ELSE
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred2_Ja1657); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_Ja

    // $ANTLR start synpred3_Ja
    public final void synpred3_Ja_fragment() throws RecognitionException {   
        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:343:9: ( '(' primitiveType ')' )
        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:343:10: '(' primitiveType ')'
        {
        match(input,81,FOLLOW_81_in_synpred3_Ja2406); if (state.failed) return ;
        pushFollow(FOLLOW_primitiveType_in_synpred3_Ja2408);
        primitiveType();

        state._fsp--;
        if (state.failed) return ;
        match(input,82,FOLLOW_82_in_synpred3_Ja2410); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_Ja

    // $ANTLR start synpred4_Ja
    public final void synpred4_Ja_fragment() throws RecognitionException {   
        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:345:9: ( '(' nonPrimitiveType ')' unaryExpressionNotPlusMinus )
        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:345:10: '(' nonPrimitiveType ')' unaryExpressionNotPlusMinus
        {
        match(input,81,FOLLOW_81_in_synpred4_Ja2438); if (state.failed) return ;
        pushFollow(FOLLOW_nonPrimitiveType_in_synpred4_Ja2440);
        nonPrimitiveType();

        state._fsp--;
        if (state.failed) return ;
        match(input,82,FOLLOW_82_in_synpred4_Ja2443); if (state.failed) return ;
        pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_synpred4_Ja2445);
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


    protected DFA16 dfa16 = new DFA16(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA49 dfa49 = new DFA49(this);
    protected DFA52 dfa52 = new DFA52(this);
    static final String DFA16_eotS =
        "\12\uffff";
    static final String DFA16_eofS =
        "\2\uffff\7\11\1\uffff";
    static final String DFA16_minS =
        "\1\31\1\uffff\7\31\1\uffff";
    static final String DFA16_maxS =
        "\1\44\1\uffff\7\133\1\uffff";
    static final String DFA16_acceptS =
        "\1\uffff\1\1\7\uffff\1\2";
    static final String DFA16_specialS =
        "\12\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\1\4\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10",
            "",
            "\1\11\52\uffff\1\11\6\uffff\4\11\1\1\1\11\1\uffff\12\11",
            "\1\11\52\uffff\1\11\6\uffff\4\11\1\1\1\11\1\uffff\12\11",
            "\1\11\52\uffff\1\11\6\uffff\4\11\1\1\1\11\1\uffff\12\11",
            "\1\11\52\uffff\1\11\6\uffff\4\11\1\1\1\11\1\uffff\12\11",
            "\1\11\52\uffff\1\11\6\uffff\4\11\1\1\1\11\1\uffff\12\11",
            "\1\11\52\uffff\1\11\6\uffff\4\11\1\1\1\11\1\uffff\12\11",
            "\1\11\52\uffff\1\11\6\uffff\4\11\1\1\1\11\1\uffff\12\11",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "145:1: type returns [Type t] : ( nonPrimitiveType | primitiveType );";
        }
    }
    static final String DFA23_eotS =
        "\17\uffff";
    static final String DFA23_eofS =
        "\17\uffff";
    static final String DFA23_minS =
        "\11\31\1\120\2\uffff\1\120\2\31";
    static final String DFA23_maxS =
        "\1\44\10\123\1\120\2\uffff\1\120\2\123";
    static final String DFA23_acceptS =
        "\12\uffff\1\1\1\2\3\uffff";
    static final String DFA23_specialS =
        "\17\uffff}>";
    static final String[] DFA23_transitionS = {
            "\1\1\4\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10",
            "\1\12\65\uffff\1\11\3\uffff\1\13",
            "\1\12\65\uffff\1\14\3\uffff\1\13",
            "\1\12\65\uffff\1\14\3\uffff\1\13",
            "\1\12\65\uffff\1\14\3\uffff\1\13",
            "\1\12\65\uffff\1\14\3\uffff\1\13",
            "\1\12\65\uffff\1\14\3\uffff\1\13",
            "\1\12\65\uffff\1\14\3\uffff\1\13",
            "\1\12\65\uffff\1\14\3\uffff\1\13",
            "\1\15",
            "",
            "",
            "\1\16",
            "\1\12\65\uffff\1\11\3\uffff\1\13",
            "\1\12\65\uffff\1\14\3\uffff\1\13"
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "184:1: formalParameterDecls : ( type variableDeclaratorId ( ',' formalParameterDecls )? -> ^( FPARM type variableDeclaratorId ) ( formalParameterDecls )? | type '...' variableDeclaratorId -> ^( FMULTPARM type variableDeclaratorId ) );";
        }
    }
    static final String DFA27_eotS =
        "\20\uffff";
    static final String DFA27_eofS =
        "\20\uffff";
    static final String DFA27_minS =
        "\11\31\1\uffff\1\31\1\uffff\1\120\2\31\1\120";
    static final String DFA27_maxS =
        "\1\137\10\140\1\uffff\1\137\1\uffff\1\120\2\140\1\120";
    static final String DFA27_acceptS =
        "\11\uffff\1\2\1\uffff\1\1\4\uffff";
    static final String DFA27_specialS =
        "\20\uffff}>";
    static final String[] DFA27_transitionS = {
            "\1\1\2\uffff\1\11\1\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\15\11"+
            "\3\uffff\1\11\17\uffff\2\11\4\uffff\2\11\4\uffff\1\11\13\uffff"+
            "\3\11",
            "\1\13\31\uffff\2\11\17\uffff\5\11\2\uffff\1\11\3\uffff\1\12"+
            "\1\uffff\1\11\2\uffff\13\11\1\uffff\1\11",
            "\1\13\65\uffff\1\14\20\uffff\1\11",
            "\1\13\65\uffff\1\14\20\uffff\1\11",
            "\1\13\65\uffff\1\14\20\uffff\1\11",
            "\1\13\65\uffff\1\14\20\uffff\1\11",
            "\1\13\65\uffff\1\14\20\uffff\1\11",
            "\1\13\65\uffff\1\14\20\uffff\1\11",
            "\1\13\65\uffff\1\14\20\uffff\1\11",
            "",
            "\1\11\2\uffff\1\11\1\uffff\17\11\10\uffff\1\11\17\uffff\2"+
            "\11\11\uffff\1\15\1\11\13\uffff\3\11",
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
            return "225:1: blockStatement : ( localVariableDeclarationStatement | statement );";
        }
    }
    static final String DFA35_eotS =
        "\20\uffff";
    static final String DFA35_eofS =
        "\20\uffff";
    static final String DFA35_minS =
        "\11\31\1\uffff\1\31\1\uffff\1\120\2\31\1\120";
    static final String DFA35_maxS =
        "\1\137\10\140\1\uffff\1\137\1\uffff\1\120\2\140\1\120";
    static final String DFA35_acceptS =
        "\11\uffff\1\2\1\uffff\1\1\4\uffff";
    static final String DFA35_specialS =
        "\20\uffff}>";
    static final String[] DFA35_transitionS = {
            "\1\1\2\uffff\1\11\1\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\10\11"+
            "\10\uffff\1\11\17\uffff\2\11\12\uffff\1\11\13\uffff\3\11",
            "\1\13\31\uffff\2\11\17\uffff\5\11\2\uffff\1\11\2\uffff\1\11"+
            "\1\12\1\uffff\1\11\2\uffff\13\11\1\uffff\1\11",
            "\1\13\65\uffff\1\14\20\uffff\1\11",
            "\1\13\65\uffff\1\14\20\uffff\1\11",
            "\1\13\65\uffff\1\14\20\uffff\1\11",
            "\1\13\65\uffff\1\14\20\uffff\1\11",
            "\1\13\65\uffff\1\14\20\uffff\1\11",
            "\1\13\65\uffff\1\14\20\uffff\1\11",
            "\1\13\65\uffff\1\14\20\uffff\1\11",
            "",
            "\1\11\2\uffff\1\11\1\uffff\17\11\10\uffff\1\11\17\uffff\2"+
            "\11\11\uffff\1\15\1\11\13\uffff\3\11",
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
            return "261:1: forInit : ( localVariableDeclaration | expressionList );";
        }
    }
    static final String DFA49_eotS =
        "\44\uffff";
    static final String DFA49_eofS =
        "\16\uffff\1\4\25\uffff";
    static final String DFA49_minS =
        "\1\31\1\uffff\1\31\2\uffff\1\63\7\117\2\31\1\uffff\1\120\1\117"+
        "\17\uffff\1\117\1\120\1\uffff";
    static final String DFA49_maxS =
        "\1\137\1\uffff\1\137\2\uffff\10\140\1\137\1\140\1\uffff\1\120\1"+
        "\140\17\uffff\1\140\1\120\1\uffff";
    static final String DFA49_acceptS =
        "\1\uffff\1\1\1\uffff\1\4\1\5\12\uffff\1\2\2\uffff\17\3\2\uffff"+
        "\1\3";
    static final String DFA49_specialS =
        "\6\uffff\1\10\1\6\1\0\1\7\1\3\1\2\1\5\1\uffff\1\4\2\uffff\1\11"+
        "\17\uffff\1\1\2\uffff}>";
    static final String[] DFA49_transitionS = {
            "\1\4\2\uffff\1\4\1\uffff\17\4\10\uffff\1\3\33\uffff\1\2\15"+
            "\uffff\1\1",
            "",
            "\1\5\2\uffff\1\4\1\uffff\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
            "\10\4\10\uffff\1\4\17\uffff\2\4\12\uffff\1\4\13\uffff\3\4",
            "",
            "",
            "\2\4\17\uffff\5\4\6\uffff\1\15\1\uffff\1\4\1\16\1\uffff\13"+
            "\4\1\uffff\1\4",
            "\1\20\2\uffff\1\17\15\uffff\1\4",
            "\1\20\2\uffff\1\17\15\uffff\1\4",
            "\1\20\2\uffff\1\17\15\uffff\1\4",
            "\1\20\2\uffff\1\17\15\uffff\1\4",
            "\1\20\2\uffff\1\17\15\uffff\1\4",
            "\1\20\2\uffff\1\17\15\uffff\1\4",
            "\1\20\2\uffff\1\17\15\uffff\1\4",
            "\1\4\2\uffff\1\4\1\uffff\17\4\10\uffff\1\4\17\uffff\2\4\11"+
            "\uffff\1\21\1\4\13\uffff\3\4",
            "\1\30\2\uffff\1\40\1\uffff\1\31\1\32\1\33\1\34\1\35\1\36\1"+
            "\37\1\25\1\26\6\27\6\uffff\2\4\1\24\16\uffff\5\4\2\uffff\1\4"+
            "\1\uffff\4\4\1\23\1\4\1\uffff\13\4\1\22\1\4",
            "",
            "\1\41",
            "\1\42\2\uffff\1\43\15\uffff\1\4",
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
            "\1\20\2\uffff\1\43\15\uffff\1\4",
            "\1\21",
            ""
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
            return "341:1: unaryExpressionNotPlusMinus : ( '!' unaryExpression | ( '(' primitiveType ')' )=> '(' primitiveType ')' unaryExpression | ( '(' nonPrimitiveType ')' unaryExpressionNotPlusMinus )=> '(' nonPrimitiveType ')' unaryExpressionNotPlusMinus | NEW creator | primary ( selector )* ( '++' | '--' )? );";
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
                        if ( (LA49_8==79) ) {s = 16;}

                        else if ( (LA49_8==96) ) {s = 4;}

                        else if ( (LA49_8==82) && (synpred3_Ja())) {s = 15;}

                         
                        input.seek(index49_8);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA49_33 = input.LA(1);

                         
                        int index49_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA49_33==96) ) {s = 4;}

                        else if ( (LA49_33==79) ) {s = 16;}

                        else if ( (LA49_33==82) && (synpred4_Ja())) {s = 35;}

                         
                        input.seek(index49_33);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA49_11 = input.LA(1);

                         
                        int index49_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA49_11==82) && (synpred3_Ja())) {s = 15;}

                        else if ( (LA49_11==79) ) {s = 16;}

                        else if ( (LA49_11==96) ) {s = 4;}

                         
                        input.seek(index49_11);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA49_10 = input.LA(1);

                         
                        int index49_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA49_10==82) && (synpred3_Ja())) {s = 15;}

                        else if ( (LA49_10==79) ) {s = 16;}

                        else if ( (LA49_10==96) ) {s = 4;}

                         
                        input.seek(index49_10);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA49_14 = input.LA(1);

                         
                        int index49_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA49_14==95) && (synpred4_Ja())) {s = 18;}

                        else if ( (LA49_14==81) && (synpred4_Ja())) {s = 19;}

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

                        else if ( (LA49_14==EOF||(LA49_14>=INSTANCEOF && LA49_14<=COMPAREOP)||(LA49_14>=EQ && LA49_14<=SLASH)||LA49_14==75||(LA49_14>=77 && LA49_14<=80)||LA49_14==82||(LA49_14>=84 && LA49_14<=94)||LA49_14==96) ) {s = 4;}

                         
                        input.seek(index49_14);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA49_12 = input.LA(1);

                         
                        int index49_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA49_12==79) ) {s = 16;}

                        else if ( (LA49_12==96) ) {s = 4;}

                        else if ( (LA49_12==82) && (synpred3_Ja())) {s = 15;}

                         
                        input.seek(index49_12);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA49_7 = input.LA(1);

                         
                        int index49_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA49_7==82) && (synpred3_Ja())) {s = 15;}

                        else if ( (LA49_7==79) ) {s = 16;}

                        else if ( (LA49_7==96) ) {s = 4;}

                         
                        input.seek(index49_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA49_9 = input.LA(1);

                         
                        int index49_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA49_9==79) ) {s = 16;}

                        else if ( (LA49_9==96) ) {s = 4;}

                        else if ( (LA49_9==82) && (synpred3_Ja())) {s = 15;}

                         
                        input.seek(index49_9);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA49_6 = input.LA(1);

                         
                        int index49_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA49_6==82) && (synpred3_Ja())) {s = 15;}

                        else if ( (LA49_6==79) ) {s = 16;}

                        else if ( (LA49_6==96) ) {s = 4;}

                         
                        input.seek(index49_6);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA49_17 = input.LA(1);

                         
                        int index49_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA49_17==96) ) {s = 4;}

                        else if ( (LA49_17==79) ) {s = 34;}

                        else if ( (LA49_17==82) && (synpred4_Ja())) {s = 35;}

                         
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
        "\1\31\4\uffff\1\63\2\uffff\1\30\1\uffff\1\31\3\uffff";
    static final String DFA52_maxS =
        "\1\121\4\uffff\1\140\2\uffff\1\31\1\uffff\1\137\3\uffff";
    static final String DFA52_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\11\1\12\1\uffff\1\7\1\uffff"+
        "\1\5\1\10\1\6";
    static final String DFA52_specialS =
        "\16\uffff}>";
    static final String[] DFA52_transitionS = {
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
            return "354:1: primary : ( parExpression | THIS | SUPER superMemberAccess | literal | IDENTIFIER | ( IDENTIFIER -> IDENTIFIER ) ( '[' ']' -> ^( ARRAYTYPE $primary) )+ ( '.' CLASS -> ^( DOTCLASS $primary) ) | IDENTIFIER arguments -> ^( METHODCALL IDENTIFIER arguments THIS ) | IDENTIFIER '.' CLASS -> ^( DOTCLASS IDENTIFIER ) | ( primitiveType -> primitiveType ) ( '[' ']' -> ^( ARRAYTYPE $primary) )* ( '.' CLASS -> ^( DOTCLASS $primary) ) | VOID '.' CLASS -> ^( DOTCLASS VOID ) );";
        }
    }
 

    public static final BitSet FOLLOW_classDeclaration_in_compilationUnit119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_compilationUnit129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classModifier_in_classDeclaration152 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_CLASS_in_classDeclaration155 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classDeclaration158 = new BitSet(new long[]{0x0000000004000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_EXTENDS_in_classDeclaration172 = new BitSet(new long[]{0x0000001FC2000000L});
    public static final BitSet FOLLOW_type_in_classDeclaration175 = new BitSet(new long[]{0x0000000004000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_classBody_in_classDeclaration189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PUBLIC_in_classModifier216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_classBody245 = new BitSet(new long[]{0x0000000028000000L,0x0000000000002800L});
    public static final BitSet FOLLOW_classBodyDeclaration_in_classBody248 = new BitSet(new long[]{0x0000000028000000L,0x0000000000002800L});
    public static final BitSet FOLLOW_77_in_classBody251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_classBodyDeclaration271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_memberDeclaration_in_classBodyDeclaration282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifier_in_memberDeclaration306 = new BitSet(new long[]{0x0000001FC2000000L});
    public static final BitSet FOLLOW_type_in_memberDeclaration308 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_methodDeclaration_in_memberDeclaration317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldDeclaration_in_memberDeclaration341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifier_in_memberDeclaration368 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_VOID_in_memberDeclaration370 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_memberDeclaration372 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_voidMethodDeclaratorRest_in_memberDeclaration374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifier_in_memberDeclaration398 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_memberDeclaration408 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_formalParameters_in_memberDeclaration410 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_constructorBody_in_memberDeclaration412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_methodDeclaration451 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_formalParameters_in_methodDeclaration453 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_methodBody_in_methodDeclaration467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_methodDeclaration481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclarator_in_fieldDeclaration511 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004800L});
    public static final BitSet FOLLOW_78_in_fieldDeclaration514 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_variableDeclarator_in_fieldDeclaration516 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004800L});
    public static final BitSet FOLLOW_75_in_fieldDeclaration520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formalParameters_in_voidMethodDeclaratorRest555 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_methodBody_in_voidMethodDeclaratorRest569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_voidMethodDeclaratorRest583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_variableDeclarator612 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_EQ_in_variableDeclarator615 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_variableInitializer_in_variableDeclarator618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_variableDeclaratorId649 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_variableDeclaratorId654 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_variableDeclaratorId656 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_arrayInitializer_in_variableInitializer680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_variableInitializer690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_arrayInitializer717 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0023060L});
    public static final BitSet FOLLOW_variableInitializer_in_arrayInitializer720 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_78_in_arrayInitializer723 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_variableInitializer_in_arrayInitializer725 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_78_in_arrayInitializer730 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_arrayInitializer737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_modifier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_typeName785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonPrimitiveType_in_type803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_type810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classType_in_nonPrimitiveType828 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_nonPrimitiveType833 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_nonPrimitiveType835 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_primitiveType_in_nonPrimitiveType844 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_nonPrimitiveType849 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_nonPrimitiveType851 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classType870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_primitiveType892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BYTE_in_primitiveType904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHORT_in_primitiveType916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_primitiveType928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_in_primitiveType940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_primitiveType952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_primitiveType964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_formalParameters994 = new BitSet(new long[]{0x0000001FC2000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_formalParameterDecls_in_formalParameters996 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_formalParameters1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_formalParameterDecls1049 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_formalParameterDecls1051 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_formalParameterDecls1054 = new BitSet(new long[]{0x0000001FC2000000L});
    public static final BitSet FOLLOW_formalParameterDecls_in_formalParameterDecls1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_formalParameterDecls1092 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_formalParameterDecls1094 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_formalParameterDecls1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_methodBody1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_constructorBody1156 = new BitSet(new long[]{0x0023FFFFD2000000L,0x00000000E0023860L});
    public static final BitSet FOLLOW_explicitConstructorInvocation_in_constructorBody1158 = new BitSet(new long[]{0x0023FFFFD2000000L,0x00000000E0023860L});
    public static final BitSet FOLLOW_blockStatement_in_constructorBody1161 = new BitSet(new long[]{0x0023FFFFD2000000L,0x00000000E0023860L});
    public static final BitSet FOLLOW_77_in_constructorBody1164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_explicitConstructorInvocation1183 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_arguments_in_explicitConstructorInvocation1191 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_explicitConstructorInvocation1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_literal0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_block1290 = new BitSet(new long[]{0x0023FFFFD2000000L,0x00000000E0023860L});
    public static final BitSet FOLLOW_blockStatement_in_block1293 = new BitSet(new long[]{0x0023FFFFD2000000L,0x00000000E0023860L});
    public static final BitSet FOLLOW_77_in_block1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localVariableDeclarationStatement_in_blockStatement1320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_blockStatement1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localVariableDeclaration_in_localVariableDeclarationStatement1354 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_localVariableDeclarationStatement1356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_localVariableDeclaration1376 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_variableDeclarator_in_localVariableDeclaration1378 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_localVariableDeclaration1381 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_variableDeclarator_in_localVariableDeclaration1383 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_block_in_statement1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_statement1437 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_parExpression_in_statement1439 = new BitSet(new long[]{0x0023FFFFD2000000L,0x00000000E0021860L});
    public static final BitSet FOLLOW_statement_in_statement1441 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_elseStmt_in_statement1443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_statement1474 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_statement1476 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021860L});
    public static final BitSet FOLLOW_forInit_in_statement1478 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_statement1481 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021860L});
    public static final BitSet FOLLOW_expression_in_statement1483 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_statement1486 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0061060L});
    public static final BitSet FOLLOW_forUpdate_in_statement1488 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_statement1491 = new BitSet(new long[]{0x0023FFFFD2000000L,0x00000000E0021860L});
    public static final BitSet FOLLOW_statement_in_statement1493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_statement1539 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_parExpression_in_statement1541 = new BitSet(new long[]{0x0023FFFFD2000000L,0x00000000E0021860L});
    public static final BitSet FOLLOW_statement_in_statement1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_statement1567 = new BitSet(new long[]{0x0023FFFFD2000000L,0x00000000E0021860L});
    public static final BitSet FOLLOW_statement_in_statement1569 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_WHILE_in_statement1571 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_parExpression_in_statement1573 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_statement1575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_statement1599 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021860L});
    public static final BitSet FOLLOW_expression_in_statement1602 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_statement1605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_statement1616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementExpression_in_statement1628 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_statement1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_elseStmt1662 = new BitSet(new long[]{0x0023FFFFD2000000L,0x00000000E0021860L});
    public static final BitSet FOLLOW_statement_in_elseStmt1665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localVariableDeclaration_in_forInit1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionList_in_forInit1700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionList_in_forUpdate1719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_parExpression1740 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_expression_in_parExpression1743 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_parExpression1745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionList1769 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_expressionList1772 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_expression_in_expressionList1774 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_expression_in_statementExpression1795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_constantExpression1818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orExpression_in_expression1840 = new BitSet(new long[]{0x0000000000000002L,0x0000000000F00010L});
    public static final BitSet FOLLOW_assignmentOperator_in_expression1846 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_expression_in_expression1848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_assignmentOperator2028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_assignmentOperator2041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_assignmentOperator2054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_assignmentOperator2066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_assignmentOperator2078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andExpression_in_orExpression2099 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_orExpression2103 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_andExpression_in_orExpression2106 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_equalityExpression_in_andExpression2128 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_andExpression2132 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_equalityExpression_in_andExpression2135 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_instanceOfExpression_in_equalityExpression2157 = new BitSet(new long[]{0x0000000000000002L,0x000000000C000000L});
    public static final BitSet FOLLOW_set_in_equalityExpression2161 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_instanceOfExpression_in_equalityExpression2170 = new BitSet(new long[]{0x0000000000000002L,0x000000000C000000L});
    public static final BitSet FOLLOW_relationalExpression_in_instanceOfExpression2192 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_INSTANCEOF_in_instanceOfExpression2195 = new BitSet(new long[]{0x0000001FC2000000L});
    public static final BitSet FOLLOW_type_in_instanceOfExpression2198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression2219 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_COMPAREOP_in_relationalExpression2223 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression2226 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression2248 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000060L});
    public static final BitSet FOLLOW_set_in_additiveExpression2252 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression2261 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000060L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression2283 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000180L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression2287 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression2302 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000180L});
    public static final BitSet FOLLOW_PLUS_in_unaryExpression2328 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression2330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unaryExpression2340 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression2342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_unaryExpression2352 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression2354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_unaryExpression2364 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression2366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression2376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_unaryExpressionNotPlusMinus2393 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus2395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_unaryExpressionNotPlusMinus2416 = new BitSet(new long[]{0x0000001FC2000000L});
    public static final BitSet FOLLOW_primitiveType_in_unaryExpressionNotPlusMinus2418 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_unaryExpressionNotPlusMinus2420 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus2422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_unaryExpressionNotPlusMinus2450 = new BitSet(new long[]{0x0000001FC2000000L});
    public static final BitSet FOLLOW_nonPrimitiveType_in_unaryExpressionNotPlusMinus2452 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_unaryExpressionNotPlusMinus2455 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpressionNotPlusMinus2457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_unaryExpressionNotPlusMinus2467 = new BitSet(new long[]{0x0000001FC2000000L});
    public static final BitSet FOLLOW_creator_in_unaryExpressionNotPlusMinus2469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_in_unaryExpressionNotPlusMinus2479 = new BitSet(new long[]{0x0000000000000002L,0x0000000160008000L});
    public static final BitSet FOLLOW_selector_in_unaryExpressionNotPlusMinus2482 = new BitSet(new long[]{0x0000000000000002L,0x0000000160008000L});
    public static final BitSet FOLLOW_set_in_unaryExpressionNotPlusMinus2486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parExpression_in_primary2546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_primary2556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUPER_in_primary2567 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_superMemberAccess_in_primary2570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primary2580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_primary2590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_primary2601 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_primary2609 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_primary2611 = new BitSet(new long[]{0x0000000000000000L,0x0000000100008000L});
    public static final BitSet FOLLOW_96_in_primary2625 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_CLASS_in_primary2627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_primary2646 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_arguments_in_primary2649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_primary2669 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_primary2671 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_CLASS_in_primary2673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_primary2692 = new BitSet(new long[]{0x0000000000000000L,0x0000000100008000L});
    public static final BitSet FOLLOW_79_in_primary2700 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_primary2702 = new BitSet(new long[]{0x0000000000000000L,0x0000000100008000L});
    public static final BitSet FOLLOW_96_in_primary2716 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_CLASS_in_primary2718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_primary2738 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_primary2740 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_CLASS_in_primary2742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_selector2773 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_selector2775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_selector2791 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_selector2793 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_arguments_in_selector2795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_selector2826 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_expression_in_selector2828 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_selector2830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_identifierSuffix2857 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_identifierSuffix2859 = new BitSet(new long[]{0x0000000000000000L,0x0000000100008000L});
    public static final BitSet FOLLOW_96_in_identifierSuffix2863 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_CLASS_in_identifierSuffix2865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arguments_in_identifierSuffix2880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_identifierSuffix2890 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_CLASS_in_identifierSuffix2892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createdName_in_creator2920 = new BitSet(new long[]{0x0000000000000000L,0x0000000000028000L});
    public static final BitSet FOLLOW_arrayCreatorRest_in_creator2923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classCreatorRest_in_creator2927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classType_in_createdName2947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_createdName2957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_arrayCreatorRest2980 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_arrayCreatorRest2981 = new BitSet(new long[]{0x0000000000000000L,0x0000000000009000L});
    public static final BitSet FOLLOW_79_in_arrayCreatorRest2984 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_arrayCreatorRest2986 = new BitSet(new long[]{0x0000000000000000L,0x0000000000009000L});
    public static final BitSet FOLLOW_arrayInitializer_in_arrayCreatorRest2990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_arrayCreatorRest2998 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_expression_in_arrayCreatorRest3000 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_arrayCreatorRest3002 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_arrayCreatorRest3005 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_expression_in_arrayCreatorRest3007 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_arrayCreatorRest3009 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_arguments_in_classCreatorRest3032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_superMemberAccess3054 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_superMemberAccess3056 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_arguments_in_superMemberAccess3058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_arguments3076 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0061060L});
    public static final BitSet FOLLOW_expressionList_in_arguments3079 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_arguments3082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_synpred2_Ja1657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_synpred3_Ja2406 = new BitSet(new long[]{0x0000001FC2000000L});
    public static final BitSet FOLLOW_primitiveType_in_synpred3_Ja2408 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_synpred3_Ja2410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_synpred4_Ja2438 = new BitSet(new long[]{0x0000001FC2000000L});
    public static final BitSet FOLLOW_nonPrimitiveType_in_synpred4_Ja2440 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_synpred4_Ja2443 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_synpred4_Ja2445 = new BitSet(new long[]{0x0000000000000002L});

}