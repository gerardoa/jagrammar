// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g 2010-07-04 20:21:17

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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:92:1: memberDeclaration : ( ( modifier type -> modifier type ) ( methodDeclaration[$modifier.pub, $type.t] -> ^( METHOD $memberDeclaration methodDeclaration ) | fieldDeclaration[(CommonTree)$memberDeclaration.tree, $modifier.pub, $type.t] -> fieldDeclaration ) | modifier VOID IDENTIFIER voidMethodDeclaratorRest[$modifier.pub, VoidType.TYPE, $IDENTIFIER.text] -> ^( METHOD modifier VOID IDENTIFIER voidMethodDeclaratorRest ) | modifier ( IDENTIFIER formalParameters )=> IDENTIFIER formalParameters constructorBody -> ^( CONSTR modifier IDENTIFIER formalParameters constructorBody ) );
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
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:93:5: ( ( modifier type -> modifier type ) ( methodDeclaration[$modifier.pub, $type.t] -> ^( METHOD $memberDeclaration methodDeclaration ) | fieldDeclaration[(CommonTree)$memberDeclaration.tree, $modifier.pub, $type.t] -> fieldDeclaration ) | modifier VOID IDENTIFIER voidMethodDeclaratorRest[$modifier.pub, VoidType.TYPE, $IDENTIFIER.text] -> ^( METHOD modifier VOID IDENTIFIER voidMethodDeclaratorRest ) | modifier ( IDENTIFIER formalParameters )=> IDENTIFIER formalParameters constructorBody -> ^( CONSTR modifier IDENTIFIER formalParameters constructorBody ) )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==PUBLIC) ) {
                switch ( input.LA(2) ) {
                case IDENTIFIER:
                    {
                    int LA6_3 = input.LA(3);

                    if ( (LA6_3==IDENTIFIER||LA6_3==79) ) {
                        alt6=1;
                    }
                    else if ( (LA6_3==81) ) {
                        alt6=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 3, input);

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
            else if ( (LA6_0==PRIVATE) ) {
                switch ( input.LA(2) ) {
                case IDENTIFIER:
                    {
                    int LA6_3 = input.LA(3);

                    if ( (LA6_3==IDENTIFIER||LA6_3==79) ) {
                        alt6=1;
                    }
                    else if ( (LA6_3==81) ) {
                        alt6=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 3, input);

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
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:93:9: ( modifier type -> modifier type ) ( methodDeclaration[$modifier.pub, $type.t] -> ^( METHOD $memberDeclaration methodDeclaration ) | fieldDeclaration[(CommonTree)$memberDeclaration.tree, $modifier.pub, $type.t] -> fieldDeclaration )
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
                    // 93:24: -> modifier type
                    {
                        adaptor.addChild(root_0, stream_modifier.nextTree());
                        adaptor.addChild(root_0, stream_type.nextTree());

                    }

                    retval.tree = root_0;}
                    }

                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:93:41: ( methodDeclaration[$modifier.pub, $type.t] -> ^( METHOD $memberDeclaration methodDeclaration ) | fieldDeclaration[(CommonTree)$memberDeclaration.tree, $modifier.pub, $type.t] -> fieldDeclaration )
                    int alt5=2;
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
                            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:93:42: methodDeclaration[$modifier.pub, $type.t]
                            {
                            pushFollow(FOLLOW_methodDeclaration_in_memberDeclaration317);
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
                            // 93:84: -> ^( METHOD $memberDeclaration methodDeclaration )
                            {
                                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:93:87: ^( METHOD $memberDeclaration methodDeclaration )
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
                            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:94:12: fieldDeclaration[(CommonTree)$memberDeclaration.tree, $modifier.pub, $type.t]
                            {
                            pushFollow(FOLLOW_fieldDeclaration_in_memberDeclaration342);
                            fieldDeclaration18=fieldDeclaration((CommonTree)((Object)retval.tree), (modifier15!=null?modifier15.pub:false), (type16!=null?type16.t:null));

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
                            // 94:90: -> fieldDeclaration
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
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:96:9: modifier VOID IDENTIFIER voidMethodDeclaratorRest[$modifier.pub, VoidType.TYPE, $IDENTIFIER.text]
                    {
                    pushFollow(FOLLOW_modifier_in_memberDeclaration369);
                    modifier19=modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_modifier.add(modifier19.getTree());
                    VOID20=(Token)match(input,VOID,FOLLOW_VOID_in_memberDeclaration371); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VOID.add(VOID20);

                    IDENTIFIER21=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_memberDeclaration373); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER21);

                    pushFollow(FOLLOW_voidMethodDeclaratorRest_in_memberDeclaration375);
                    voidMethodDeclaratorRest22=voidMethodDeclaratorRest((modifier19!=null?modifier19.pub:false), VoidType.TYPE, (IDENTIFIER21!=null?IDENTIFIER21.getText():null));

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
                    // 96:107: -> ^( METHOD modifier VOID IDENTIFIER voidMethodDeclaratorRest )
                    {
                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:96:110: ^( METHOD modifier VOID IDENTIFIER voidMethodDeclaratorRest )
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
                    pushFollow(FOLLOW_modifier_in_memberDeclaration400);
                    modifier23=modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_modifier.add(modifier23.getTree());
                    IDENTIFIER24=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_memberDeclaration410); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER24);

                    pushFollow(FOLLOW_formalParameters_in_memberDeclaration412);
                    formalParameters25=formalParameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formalParameters.add(formalParameters25.getTree());
                    pushFollow(FOLLOW_constructorBody_in_memberDeclaration414);
                    constructorBody26=constructorBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_constructorBody.add(constructorBody26.getTree());
                    if ( state.backtracking==0 ) {
                       rt.addConstructor((modifier23!=null?modifier23.pub:false), (formalParameters25!=null?formalParameters25.args:null)); 
                    }


                    // AST REWRITE
                    // elements: constructorBody, formalParameters, modifier, IDENTIFIER
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:101:1: methodDeclaration[boolean pub, Type t] : IDENTIFIER formalParameters ( methodBody | ';' ) ;
    public final JaParser.methodDeclaration_return methodDeclaration(boolean pub, Type t) throws RecognitionException {
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

            IDENTIFIER27=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_methodDeclaration455); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER27_tree = (Object)adaptor.create(IDENTIFIER27);
            adaptor.addChild(root_0, IDENTIFIER27_tree);
            }
            pushFollow(FOLLOW_formalParameters_in_methodDeclaration457);
            formalParameters28=formalParameters();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, formalParameters28.getTree());
            if ( state.backtracking==0 ) {
               rt.addMethod(pub, t, (IDENTIFIER27!=null?IDENTIFIER27.getText():null), (formalParameters28!=null?formalParameters28.args:null)); 
            }
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
                    pushFollow(FOLLOW_methodBody_in_methodDeclaration473);
                    methodBody29=methodBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, methodBody29.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:104:13: ';'
                    {
                    char_literal30=(Token)match(input,75,FOLLOW_75_in_methodDeclaration487); if (state.failed) return retval;
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:108:1: fieldDeclaration[CommonTree modAndTyp, boolean pub, Type t] : v1= variableDeclarator ( ',' v2= variableDeclarator )* ';' -> ( ^( FIELD variableDeclarator ) )+ ;
    public final JaParser.fieldDeclaration_return fieldDeclaration(CommonTree modAndTyp, boolean pub, Type t) throws RecognitionException {
        JaParser.fieldDeclaration_return retval = new JaParser.fieldDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal31=null;
        Token char_literal32=null;
        JaParser.variableDeclarator_return v1 = null;

        JaParser.variableDeclarator_return v2 = null;


        Object char_literal31_tree=null;
        Object char_literal32_tree=null;
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleSubtreeStream stream_variableDeclarator=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclarator");
        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:109:5: (v1= variableDeclarator ( ',' v2= variableDeclarator )* ';' -> ( ^( FIELD variableDeclarator ) )+ )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:109:9: v1= variableDeclarator ( ',' v2= variableDeclarator )* ';'
            {
            pushFollow(FOLLOW_variableDeclarator_in_fieldDeclaration519);
            v1=variableDeclarator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variableDeclarator.add(v1.getTree());
            if ( state.backtracking==0 ) {
               rt.addField((v1!=null?v1.varName:null), t, pub); 
            }
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:110:9: ( ',' v2= variableDeclarator )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==78) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:110:10: ',' v2= variableDeclarator
            	    {
            	    char_literal31=(Token)match(input,78,FOLLOW_78_in_fieldDeclaration538); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_78.add(char_literal31);

            	    pushFollow(FOLLOW_variableDeclarator_in_fieldDeclaration542);
            	    v2=variableDeclarator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_variableDeclarator.add(v2.getTree());
            	    if ( state.backtracking==0 ) {
            	       rt.addField((v2!=null?v2.varName:null), t, pub); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            char_literal32=(Token)match(input,75,FOLLOW_75_in_fieldDeclaration548); if (state.failed) return retval; 
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
            // 111:9: -> ( ^( FIELD variableDeclarator ) )+
            {
                if ( !(stream_variableDeclarator.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_variableDeclarator.hasNext() ) {
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:111:12: ^( FIELD variableDeclarator )
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:114:1: voidMethodDeclaratorRest[boolean pub, Type t, String methodName] : formalParameters ( methodBody | ';' ) ;
    public final JaParser.voidMethodDeclaratorRest_return voidMethodDeclaratorRest(boolean pub, Type t, String methodName) throws RecognitionException {
        JaParser.voidMethodDeclaratorRest_return retval = new JaParser.voidMethodDeclaratorRest_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal35=null;
        JaParser.formalParameters_return formalParameters33 = null;

        JaParser.methodBody_return methodBody34 = null;


        Object char_literal35_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:115:5: ( formalParameters ( methodBody | ';' ) )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:115:9: formalParameters ( methodBody | ';' )
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_formalParameters_in_voidMethodDeclaratorRest593);
            formalParameters33=formalParameters();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, formalParameters33.getTree());
            if ( state.backtracking==0 ) {
               rt.addMethod(pub, t, methodName, (formalParameters33!=null?formalParameters33.args:null)); 
            }
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:116:9: ( methodBody | ';' )
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
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:116:13: methodBody
                    {
                    pushFollow(FOLLOW_methodBody_in_voidMethodDeclaratorRest609);
                    methodBody34=methodBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, methodBody34.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:117:13: ';'
                    {
                    char_literal35=(Token)match(input,75,FOLLOW_75_in_voidMethodDeclaratorRest623); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal35_tree = (Object)adaptor.create(char_literal35);
                    adaptor.addChild(root_0, char_literal35_tree);
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
        public String varName;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variableDeclarator"
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:121:1: variableDeclarator returns [String varName] : variableDeclaratorId ( '=' variableInitializer )? ;
    public final JaParser.variableDeclarator_return variableDeclarator() throws RecognitionException {
        JaParser.variableDeclarator_return retval = new JaParser.variableDeclarator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal37=null;
        JaParser.variableDeclaratorId_return variableDeclaratorId36 = null;

        JaParser.variableInitializer_return variableInitializer38 = null;


        Object char_literal37_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:122:5: ( variableDeclaratorId ( '=' variableInitializer )? )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:122:9: variableDeclaratorId ( '=' variableInitializer )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_variableDeclaratorId_in_variableDeclarator656);
            variableDeclaratorId36=variableDeclaratorId();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaratorId36.getTree());
            if ( state.backtracking==0 ) {
               retval.varName = (variableDeclaratorId36!=null?input.toString(variableDeclaratorId36.start,variableDeclaratorId36.stop):null); 
            }
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:122:73: ( '=' variableInitializer )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==EQ) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:122:74: '=' variableInitializer
                    {
                    char_literal37=(Token)match(input,EQ,FOLLOW_EQ_in_variableDeclarator661); if (state.failed) return retval;
                    pushFollow(FOLLOW_variableInitializer_in_variableDeclarator664);
                    variableInitializer38=variableInitializer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableInitializer38.getTree());

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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:125:1: variableDeclaratorId returns [int arrayDim] : IDENTIFIER (l+= '[' ']' )* ;
    public final JaParser.variableDeclaratorId_return variableDeclaratorId() throws RecognitionException {
        JaParser.variableDeclaratorId_return retval = new JaParser.variableDeclaratorId_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENTIFIER39=null;
        Token char_literal40=null;
        Token l=null;
        List list_l=null;

        Object IDENTIFIER39_tree=null;
        Object char_literal40_tree=null;
        Object l_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:126:5: ( IDENTIFIER (l+= '[' ']' )* )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:126:9: IDENTIFIER (l+= '[' ']' )*
            {
            root_0 = (Object)adaptor.nil();

            IDENTIFIER39=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variableDeclaratorId695); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER39_tree = (Object)adaptor.create(IDENTIFIER39);
            adaptor.addChild(root_0, IDENTIFIER39_tree);
            }
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:126:20: (l+= '[' ']' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==79) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:126:21: l+= '[' ']'
            	    {
            	    l=(Token)match(input,79,FOLLOW_79_in_variableDeclaratorId700); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    l_tree = (Object)adaptor.create(l);
            	    adaptor.addChild(root_0, l_tree);
            	    }
            	    if (list_l==null) list_l=new ArrayList();
            	    list_l.add(l);

            	    char_literal40=(Token)match(input,80,FOLLOW_80_in_variableDeclaratorId702); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal40_tree = (Object)adaptor.create(char_literal40);
            	    adaptor.addChild(root_0, char_literal40_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
              if(list_l != null) retval.arrayDim = list_l.size();
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:129:1: variableInitializer : ( arrayInitializer | expression );
    public final JaParser.variableInitializer_return variableInitializer() throws RecognitionException {
        JaParser.variableInitializer_return retval = new JaParser.variableInitializer_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.arrayInitializer_return arrayInitializer41 = null;

        JaParser.expression_return expression42 = null;



        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:130:5: ( arrayInitializer | expression )
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
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:130:9: arrayInitializer
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_arrayInitializer_in_variableInitializer726);
                    arrayInitializer41=arrayInitializer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayInitializer41.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:131:9: expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expression_in_variableInitializer736);
                    expression42=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression42.getTree());

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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:134:1: arrayInitializer : '{' ( variableInitializer ( ',' variableInitializer )* ( ',' )? )? '}' ;
    public final JaParser.arrayInitializer_return arrayInitializer() throws RecognitionException {
        JaParser.arrayInitializer_return retval = new JaParser.arrayInitializer_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal43=null;
        Token char_literal45=null;
        Token char_literal47=null;
        Token char_literal48=null;
        JaParser.variableInitializer_return variableInitializer44 = null;

        JaParser.variableInitializer_return variableInitializer46 = null;


        Object char_literal43_tree=null;
        Object char_literal45_tree=null;
        Object char_literal47_tree=null;
        Object char_literal48_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:135:5: ( '{' ( variableInitializer ( ',' variableInitializer )* ( ',' )? )? '}' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:135:9: '{' ( variableInitializer ( ',' variableInitializer )* ( ',' )? )? '}'
            {
            root_0 = (Object)adaptor.nil();

            char_literal43=(Token)match(input,76,FOLLOW_76_in_arrayInitializer763); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal43_tree = (Object)adaptor.create(char_literal43);
            adaptor.addChild(root_0, char_literal43_tree);
            }
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:135:13: ( variableInitializer ( ',' variableInitializer )* ( ',' )? )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==IDENTIFIER||LA15_0==VOID||(LA15_0>=CHAR && LA15_0<=NULLLITERAL)||LA15_0==NEW||(LA15_0>=PLUS && LA15_0<=MINUS)||LA15_0==76||LA15_0==81||(LA15_0>=93 && LA15_0<=95)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:135:14: variableInitializer ( ',' variableInitializer )* ( ',' )?
                    {
                    pushFollow(FOLLOW_variableInitializer_in_arrayInitializer766);
                    variableInitializer44=variableInitializer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableInitializer44.getTree());
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:135:34: ( ',' variableInitializer )*
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
                    	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:135:35: ',' variableInitializer
                    	    {
                    	    char_literal45=(Token)match(input,78,FOLLOW_78_in_arrayInitializer769); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal45_tree = (Object)adaptor.create(char_literal45);
                    	    adaptor.addChild(root_0, char_literal45_tree);
                    	    }
                    	    pushFollow(FOLLOW_variableInitializer_in_arrayInitializer771);
                    	    variableInitializer46=variableInitializer();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableInitializer46.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:135:61: ( ',' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==78) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:135:62: ','
                            {
                            char_literal47=(Token)match(input,78,FOLLOW_78_in_arrayInitializer776); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal47_tree = (Object)adaptor.create(char_literal47);
                            adaptor.addChild(root_0, char_literal47_tree);
                            }

                            }
                            break;

                    }


                    }
                    break;

            }

            char_literal48=(Token)match(input,77,FOLLOW_77_in_arrayInitializer783); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal48_tree = (Object)adaptor.create(char_literal48);
            adaptor.addChild(root_0, char_literal48_tree);
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
        public boolean pub;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "modifier"
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:138:1: modifier returns [boolean pub] : ( PUBLIC | PRIVATE );
    public final JaParser.modifier_return modifier() throws RecognitionException {
        JaParser.modifier_return retval = new JaParser.modifier_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PUBLIC49=null;
        Token PRIVATE50=null;

        Object PUBLIC49_tree=null;
        Object PRIVATE50_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:139:5: ( PUBLIC | PRIVATE )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==PUBLIC) ) {
                alt16=1;
            }
            else if ( (LA16_0==PRIVATE) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:139:9: PUBLIC
                    {
                    root_0 = (Object)adaptor.nil();

                    PUBLIC49=(Token)match(input,PUBLIC,FOLLOW_PUBLIC_in_modifier806); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PUBLIC49_tree = (Object)adaptor.create(PUBLIC49);
                    adaptor.addChild(root_0, PUBLIC49_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.pub = true;  
                    }

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:140:9: PRIVATE
                    {
                    root_0 = (Object)adaptor.nil();

                    PRIVATE50=(Token)match(input,PRIVATE,FOLLOW_PRIVATE_in_modifier819); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PRIVATE50_tree = (Object)adaptor.create(PRIVATE50);
                    adaptor.addChild(root_0, PRIVATE50_tree);
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

    public static class typeName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeName"
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:143:1: typeName : IDENTIFIER ;
    public final JaParser.typeName_return typeName() throws RecognitionException {
        JaParser.typeName_return retval = new JaParser.typeName_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENTIFIER51=null;

        Object IDENTIFIER51_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:144:5: ( IDENTIFIER )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:144:9: IDENTIFIER
            {
            root_0 = (Object)adaptor.nil();

            IDENTIFIER51=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_typeName840); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER51_tree = (Object)adaptor.create(IDENTIFIER51);
            adaptor.addChild(root_0, IDENTIFIER51_tree);
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:147:1: type returns [Type t] : ( nonPrimitiveType | primitiveType );
    public final JaParser.type_return type() throws RecognitionException {
        JaParser.type_return retval = new JaParser.type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.nonPrimitiveType_return nonPrimitiveType52 = null;

        JaParser.primitiveType_return primitiveType53 = null;



        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:148:2: ( nonPrimitiveType | primitiveType )
            int alt17=2;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:148:4: nonPrimitiveType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_nonPrimitiveType_in_type858);
                    nonPrimitiveType52=nonPrimitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nonPrimitiveType52.getTree());
                    if ( state.backtracking==0 ) {
                      retval.t =(nonPrimitiveType52!=null?nonPrimitiveType52.t:null);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:149:4: primitiveType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primitiveType_in_type865);
                    primitiveType53=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType53.getTree());
                    if ( state.backtracking==0 ) {
                      retval.t =(primitiveType53!=null?primitiveType53.bs:null);
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:152:1: nonPrimitiveType returns [ComplexType t] : ( classType (l+= '[' ']' )* | primitiveType (l+= '[' ']' )+ );
    public final JaParser.nonPrimitiveType_return nonPrimitiveType() throws RecognitionException {
        JaParser.nonPrimitiveType_return retval = new JaParser.nonPrimitiveType_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal55=null;
        Token char_literal57=null;
        Token l=null;
        List list_l=null;
        JaParser.classType_return classType54 = null;

        JaParser.primitiveType_return primitiveType56 = null;


        Object char_literal55_tree=null;
        Object char_literal57_tree=null;
        Object l_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:153:2: ( classType (l+= '[' ']' )* | primitiveType (l+= '[' ']' )+ )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==IDENTIFIER) ) {
                alt20=1;
            }
            else if ( ((LA20_0>=CHAR && LA20_0<=DOUBLE)) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:153:4: classType (l+= '[' ']' )*
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_classType_in_nonPrimitiveType883);
                    classType54=classType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classType54.getTree());
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:153:14: (l+= '[' ']' )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==79) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:153:15: l+= '[' ']'
                    	    {
                    	    l=(Token)match(input,79,FOLLOW_79_in_nonPrimitiveType888); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    l_tree = (Object)adaptor.create(l);
                    	    adaptor.addChild(root_0, l_tree);
                    	    }
                    	    if (list_l==null) list_l=new ArrayList();
                    	    list_l.add(l);

                    	    char_literal55=(Token)match(input,80,FOLLOW_80_in_nonPrimitiveType890); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal55_tree = (Object)adaptor.create(char_literal55);
                    	    adaptor.addChild(root_0, char_literal55_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                      if(list_l != null) retval.t = createArrayType((classType54!=null?classType54.t:null), list_l.size());
                    }

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:154:4: primitiveType (l+= '[' ']' )+
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primitiveType_in_nonPrimitiveType899);
                    primitiveType56=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType56.getTree());
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:154:18: (l+= '[' ']' )+
                    int cnt19=0;
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==79) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:154:19: l+= '[' ']'
                    	    {
                    	    l=(Token)match(input,79,FOLLOW_79_in_nonPrimitiveType904); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    l_tree = (Object)adaptor.create(l);
                    	    adaptor.addChild(root_0, l_tree);
                    	    }
                    	    if (list_l==null) list_l=new ArrayList();
                    	    list_l.add(l);

                    	    char_literal57=(Token)match(input,80,FOLLOW_80_in_nonPrimitiveType906); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal57_tree = (Object)adaptor.create(char_literal57);
                    	    adaptor.addChild(root_0, char_literal57_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt19 >= 1 ) break loop19;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(19, input);
                                throw eee;
                        }
                        cnt19++;
                    } while (true);

                    if ( state.backtracking==0 ) {
                      if(list_l != null) retval.t = createArrayType((primitiveType56!=null?primitiveType56.bs:null), list_l.size());
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:157:1: classType returns [ReferenceType t] : IDENTIFIER ;
    public final JaParser.classType_return classType() throws RecognitionException {
        JaParser.classType_return retval = new JaParser.classType_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENTIFIER58=null;

        Object IDENTIFIER58_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:158:2: ( IDENTIFIER )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:158:4: IDENTIFIER
            {
            root_0 = (Object)adaptor.nil();

            IDENTIFIER58=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classType925); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER58_tree = (Object)adaptor.create(IDENTIFIER58);
            adaptor.addChild(root_0, IDENTIFIER58_tree);
            }
            if ( state.backtracking==0 ) {
               if(cTab.containsKey((IDENTIFIER58!=null?IDENTIFIER58.getText():null))) {
              	        			retval.t = cTab.get((IDENTIFIER58!=null?IDENTIFIER58.getText():null));
                      			} else {
                      				retval.t = new ReferenceType((IDENTIFIER58!=null?IDENTIFIER58.getText():null));
                      				cTab.put((IDENTIFIER58!=null?IDENTIFIER58.getText():null), retval.t);
                      				todo.add((IDENTIFIER58!=null?IDENTIFIER58.getText():null));	
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:168:1: primitiveType returns [BasicType bs] : ( CHAR | BYTE | SHORT | INT | LONG | FLOAT | DOUBLE );
    public final JaParser.primitiveType_return primitiveType() throws RecognitionException {
        JaParser.primitiveType_return retval = new JaParser.primitiveType_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CHAR59=null;
        Token BYTE60=null;
        Token SHORT61=null;
        Token INT62=null;
        Token LONG63=null;
        Token FLOAT64=null;
        Token DOUBLE65=null;

        Object CHAR59_tree=null;
        Object BYTE60_tree=null;
        Object SHORT61_tree=null;
        Object INT62_tree=null;
        Object LONG63_tree=null;
        Object FLOAT64_tree=null;
        Object DOUBLE65_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:169:5: ( CHAR | BYTE | SHORT | INT | LONG | FLOAT | DOUBLE )
            int alt21=7;
            switch ( input.LA(1) ) {
            case CHAR:
                {
                alt21=1;
                }
                break;
            case BYTE:
                {
                alt21=2;
                }
                break;
            case SHORT:
                {
                alt21=3;
                }
                break;
            case INT:
                {
                alt21=4;
                }
                break;
            case LONG:
                {
                alt21=5;
                }
                break;
            case FLOAT:
                {
                alt21=6;
                }
                break;
            case DOUBLE:
                {
                alt21=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:169:9: CHAR
                    {
                    root_0 = (Object)adaptor.nil();

                    CHAR59=(Token)match(input,CHAR,FOLLOW_CHAR_in_primitiveType947); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CHAR59_tree = (Object)adaptor.create(CHAR59);
                    adaptor.addChild(root_0, CHAR59_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.bs =BasicType.CHAR;
                    }

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:170:9: BYTE
                    {
                    root_0 = (Object)adaptor.nil();

                    BYTE60=(Token)match(input,BYTE,FOLLOW_BYTE_in_primitiveType959); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BYTE60_tree = (Object)adaptor.create(BYTE60);
                    adaptor.addChild(root_0, BYTE60_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.bs =BasicType.BYTE;
                    }

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:171:9: SHORT
                    {
                    root_0 = (Object)adaptor.nil();

                    SHORT61=(Token)match(input,SHORT,FOLLOW_SHORT_in_primitiveType971); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SHORT61_tree = (Object)adaptor.create(SHORT61);
                    adaptor.addChild(root_0, SHORT61_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.bs =BasicType.SHORT;
                    }

                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:172:9: INT
                    {
                    root_0 = (Object)adaptor.nil();

                    INT62=(Token)match(input,INT,FOLLOW_INT_in_primitiveType983); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT62_tree = (Object)adaptor.create(INT62);
                    adaptor.addChild(root_0, INT62_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.bs =BasicType.INT;
                    }

                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:173:9: LONG
                    {
                    root_0 = (Object)adaptor.nil();

                    LONG63=(Token)match(input,LONG,FOLLOW_LONG_in_primitiveType995); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LONG63_tree = (Object)adaptor.create(LONG63);
                    adaptor.addChild(root_0, LONG63_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.bs =BasicType.LONG;
                    }

                    }
                    break;
                case 6 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:174:9: FLOAT
                    {
                    root_0 = (Object)adaptor.nil();

                    FLOAT64=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_primitiveType1007); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FLOAT64_tree = (Object)adaptor.create(FLOAT64);
                    adaptor.addChild(root_0, FLOAT64_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.bs =BasicType.FLOAT;
                    }

                    }
                    break;
                case 7 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:175:9: DOUBLE
                    {
                    root_0 = (Object)adaptor.nil();

                    DOUBLE65=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_primitiveType1019); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOUBLE65_tree = (Object)adaptor.create(DOUBLE65);
                    adaptor.addChild(root_0, DOUBLE65_tree);
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
        public ArrayList<Type> args;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formalParameters"
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:178:1: formalParameters returns [ArrayList<Type> args] : '(' ( formalParameterDecls[args] )? ')' -> {$formalParameterDecls.tree != null}? ^( FPARMS ( formalParameterDecls )? ) ->;
    public final JaParser.formalParameters_return formalParameters() throws RecognitionException {
        JaParser.formalParameters_return retval = new JaParser.formalParameters_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal66=null;
        Token char_literal68=null;
        JaParser.formalParameterDecls_return formalParameterDecls67 = null;


        Object char_literal66_tree=null;
        Object char_literal68_tree=null;
        RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
        RewriteRuleSubtreeStream stream_formalParameterDecls=new RewriteRuleSubtreeStream(adaptor,"rule formalParameterDecls");

        	ArrayList<Type> args = new ArrayList<Type>();

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:182:5: ( '(' ( formalParameterDecls[args] )? ')' -> {$formalParameterDecls.tree != null}? ^( FPARMS ( formalParameterDecls )? ) ->)
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:182:9: '(' ( formalParameterDecls[args] )? ')'
            {
            char_literal66=(Token)match(input,81,FOLLOW_81_in_formalParameters1053); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_81.add(char_literal66);

            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:182:13: ( formalParameterDecls[args] )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==IDENTIFIER||(LA22_0>=CHAR && LA22_0<=DOUBLE)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:182:13: formalParameterDecls[args]
                    {
                    pushFollow(FOLLOW_formalParameterDecls_in_formalParameters1055);
                    formalParameterDecls67=formalParameterDecls(args);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formalParameterDecls.add(formalParameterDecls67.getTree());

                    }
                    break;

            }

            char_literal68=(Token)match(input,82,FOLLOW_82_in_formalParameters1059); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_82.add(char_literal68);

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
            // 182:61: -> {$formalParameterDecls.tree != null}? ^( FPARMS ( formalParameterDecls )? )
            if ((formalParameterDecls67!=null?((Object)formalParameterDecls67.tree):null) != null) {
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:182:102: ^( FPARMS ( formalParameterDecls )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FPARMS, "FPARMS"), root_1);

                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:182:111: ( formalParameterDecls )?
                if ( stream_formalParameterDecls.hasNext() ) {
                    adaptor.addChild(root_1, stream_formalParameterDecls.nextTree());

                }
                stream_formalParameterDecls.reset();

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 183:15: ->
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:186:1: formalParameterDecls[ArrayList<Type> args] : ( type variableDeclaratorId ( ',' formalParameterDecls[args] )? -> ^( FPARM type variableDeclaratorId ) ( formalParameterDecls )? | type '...' variableDeclaratorId -> ^( FMULTPARM type variableDeclaratorId ) );
    public final JaParser.formalParameterDecls_return formalParameterDecls(ArrayList<Type> args) throws RecognitionException {
        JaParser.formalParameterDecls_return retval = new JaParser.formalParameterDecls_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal71=null;
        Token string_literal74=null;
        JaParser.type_return type69 = null;

        JaParser.variableDeclaratorId_return variableDeclaratorId70 = null;

        JaParser.formalParameterDecls_return formalParameterDecls72 = null;

        JaParser.type_return type73 = null;

        JaParser.variableDeclaratorId_return variableDeclaratorId75 = null;


        Object char_literal71_tree=null;
        Object string_literal74_tree=null;
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleSubtreeStream stream_variableDeclaratorId=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaratorId");
        RewriteRuleSubtreeStream stream_formalParameterDecls=new RewriteRuleSubtreeStream(adaptor,"rule formalParameterDecls");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:187:5: ( type variableDeclaratorId ( ',' formalParameterDecls[args] )? -> ^( FPARM type variableDeclaratorId ) ( formalParameterDecls )? | type '...' variableDeclaratorId -> ^( FMULTPARM type variableDeclaratorId ) )
            int alt24=2;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:187:8: type variableDeclaratorId ( ',' formalParameterDecls[args] )?
                    {
                    pushFollow(FOLLOW_type_in_formalParameterDecls1111);
                    type69=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type69.getTree());
                    pushFollow(FOLLOW_variableDeclaratorId_in_formalParameterDecls1113);
                    variableDeclaratorId70=variableDeclaratorId();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_variableDeclaratorId.add(variableDeclaratorId70.getTree());
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:187:34: ( ',' formalParameterDecls[args] )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==78) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:187:35: ',' formalParameterDecls[args]
                            {
                            char_literal71=(Token)match(input,78,FOLLOW_78_in_formalParameterDecls1116); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_78.add(char_literal71);

                            pushFollow(FOLLOW_formalParameterDecls_in_formalParameterDecls1118);
                            formalParameterDecls72=formalParameterDecls(args);

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_formalParameterDecls.add(formalParameterDecls72.getTree());

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {
                      if((variableDeclaratorId70!=null?variableDeclaratorId70.arrayDim:0) > 0) {
                          								 args.add(createArrayType((type69!=null?type69.t:null), (variableDeclaratorId70!=null?variableDeclaratorId70.arrayDim:0)));
                          								} else {
                          								 args.add((type69!=null?type69.t:null));
                          								}
                          							     
                    }


                    // AST REWRITE
                    // elements: formalParameterDecls, type, variableDeclaratorId
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 194:6: -> ^( FPARM type variableDeclaratorId ) ( formalParameterDecls )?
                    {
                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:194:9: ^( FPARM type variableDeclaratorId )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FPARM, "FPARM"), root_1);

                        adaptor.addChild(root_1, stream_type.nextTree());
                        adaptor.addChild(root_1, stream_variableDeclaratorId.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }
                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:194:44: ( formalParameterDecls )?
                        if ( stream_formalParameterDecls.hasNext() ) {
                            adaptor.addChild(root_0, stream_formalParameterDecls.nextTree());

                        }
                        stream_formalParameterDecls.reset();

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:195:8: type '...' variableDeclaratorId
                    {
                    pushFollow(FOLLOW_type_in_formalParameterDecls1155);
                    type73=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type73.getTree());
                    string_literal74=(Token)match(input,83,FOLLOW_83_in_formalParameterDecls1157); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_83.add(string_literal74);

                    pushFollow(FOLLOW_variableDeclaratorId_in_formalParameterDecls1159);
                    variableDeclaratorId75=variableDeclaratorId();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_variableDeclaratorId.add(variableDeclaratorId75.getTree());


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
                    // 195:40: -> ^( FMULTPARM type variableDeclaratorId )
                    {
                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:195:43: ^( FMULTPARM type variableDeclaratorId )
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:198:1: methodBody : block -> ^( MBODY block ) ;
    public final JaParser.methodBody_return methodBody() throws RecognitionException {
        JaParser.methodBody_return retval = new JaParser.methodBody_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.block_return block76 = null;


        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:199:5: ( block -> ^( MBODY block ) )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:199:9: block
            {
            pushFollow(FOLLOW_block_in_methodBody1192);
            block76=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block76.getTree());


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
            // 199:15: -> ^( MBODY block )
            {
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:199:18: ^( MBODY block )
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:202:1: constructorBody : '{' ( explicitConstructorInvocation )? ( blockStatement )* '}' ;
    public final JaParser.constructorBody_return constructorBody() throws RecognitionException {
        JaParser.constructorBody_return retval = new JaParser.constructorBody_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal77=null;
        Token char_literal80=null;
        JaParser.explicitConstructorInvocation_return explicitConstructorInvocation78 = null;

        JaParser.blockStatement_return blockStatement79 = null;


        Object char_literal77_tree=null;
        Object char_literal80_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:203:5: ( '{' ( explicitConstructorInvocation )? ( blockStatement )* '}' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:203:9: '{' ( explicitConstructorInvocation )? ( blockStatement )* '}'
            {
            root_0 = (Object)adaptor.nil();

            char_literal77=(Token)match(input,76,FOLLOW_76_in_constructorBody1219); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal77_tree = (Object)adaptor.create(char_literal77);
            adaptor.addChild(root_0, char_literal77_tree);
            }
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:203:13: ( explicitConstructorInvocation )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==THIS) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==81) ) {
                    alt25=1;
                }
            }
            else if ( (LA25_0==SUPER) ) {
                int LA25_3 = input.LA(2);

                if ( (LA25_3==81) ) {
                    alt25=1;
                }
            }
            switch (alt25) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:203:13: explicitConstructorInvocation
                    {
                    pushFollow(FOLLOW_explicitConstructorInvocation_in_constructorBody1221);
                    explicitConstructorInvocation78=explicitConstructorInvocation();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, explicitConstructorInvocation78.getTree());

                    }
                    break;

            }

            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:203:44: ( blockStatement )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==IDENTIFIER||LA26_0==VOID||(LA26_0>=CHAR && LA26_0<=RETURN)||LA26_0==NEW||(LA26_0>=PLUS && LA26_0<=MINUS)||(LA26_0>=75 && LA26_0<=76)||LA26_0==81||(LA26_0>=93 && LA26_0<=95)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:203:44: blockStatement
            	    {
            	    pushFollow(FOLLOW_blockStatement_in_constructorBody1224);
            	    blockStatement79=blockStatement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, blockStatement79.getTree());

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            char_literal80=(Token)match(input,77,FOLLOW_77_in_constructorBody1227); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal80_tree = (Object)adaptor.create(char_literal80);
            adaptor.addChild(root_0, char_literal80_tree);
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:206:1: explicitConstructorInvocation : ( THIS | SUPER ) arguments ';' ;
    public final JaParser.explicitConstructorInvocation_return explicitConstructorInvocation() throws RecognitionException {
        JaParser.explicitConstructorInvocation_return retval = new JaParser.explicitConstructorInvocation_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set81=null;
        Token char_literal83=null;
        JaParser.arguments_return arguments82 = null;


        Object set81_tree=null;
        Object char_literal83_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:207:5: ( ( THIS | SUPER ) arguments ';' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:207:9: ( THIS | SUPER ) arguments ';'
            {
            root_0 = (Object)adaptor.nil();

            set81=(Token)input.LT(1);
            if ( (input.LA(1)>=THIS && input.LA(1)<=SUPER) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set81));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            pushFollow(FOLLOW_arguments_in_explicitConstructorInvocation1254);
            arguments82=arguments();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments82.getTree());
            char_literal83=(Token)match(input,75,FOLLOW_75_in_explicitConstructorInvocation1256); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal83_tree = (Object)adaptor.create(char_literal83);
            adaptor.addChild(root_0, char_literal83_tree);
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:211:1: literal : ( INTLITERAL | FloatingPointLiteral | CHARLITERAL | STRINGLITERAL | BOOLEANLITERAL | NULLLITERAL );
    public final JaParser.literal_return literal() throws RecognitionException {
        JaParser.literal_return retval = new JaParser.literal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set84=null;

        Object set84_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:212:5: ( INTLITERAL | FloatingPointLiteral | CHARLITERAL | STRINGLITERAL | BOOLEANLITERAL | NULLLITERAL )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:
            {
            root_0 = (Object)adaptor.nil();

            set84=(Token)input.LT(1);
            if ( (input.LA(1)>=INTLITERAL && input.LA(1)<=NULLLITERAL) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set84));
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:223:1: block : '{' ( blockStatement )* '}' ;
    public final JaParser.block_return block() throws RecognitionException {
        JaParser.block_return retval = new JaParser.block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal85=null;
        Token char_literal87=null;
        JaParser.blockStatement_return blockStatement86 = null;


        Object char_literal85_tree=null;
        Object char_literal87_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:224:5: ( '{' ( blockStatement )* '}' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:224:9: '{' ( blockStatement )* '}'
            {
            root_0 = (Object)adaptor.nil();

            char_literal85=(Token)match(input,76,FOLLOW_76_in_block1353); if (state.failed) return retval;
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:224:14: ( blockStatement )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==IDENTIFIER||LA27_0==VOID||(LA27_0>=CHAR && LA27_0<=RETURN)||LA27_0==NEW||(LA27_0>=PLUS && LA27_0<=MINUS)||(LA27_0>=75 && LA27_0<=76)||LA27_0==81||(LA27_0>=93 && LA27_0<=95)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:224:14: blockStatement
            	    {
            	    pushFollow(FOLLOW_blockStatement_in_block1356);
            	    blockStatement86=blockStatement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, blockStatement86.getTree());

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            char_literal87=(Token)match(input,77,FOLLOW_77_in_block1359); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:227:1: blockStatement : ( localVariableDeclarationStatement | statement );
    public final JaParser.blockStatement_return blockStatement() throws RecognitionException {
        JaParser.blockStatement_return retval = new JaParser.blockStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.localVariableDeclarationStatement_return localVariableDeclarationStatement88 = null;

        JaParser.statement_return statement89 = null;



        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:228:5: ( localVariableDeclarationStatement | statement )
            int alt28=2;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:228:9: localVariableDeclarationStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_localVariableDeclarationStatement_in_blockStatement1383);
                    localVariableDeclarationStatement88=localVariableDeclarationStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, localVariableDeclarationStatement88.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:229:9: statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_statement_in_blockStatement1393);
                    statement89=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement89.getTree());

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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:232:1: localVariableDeclarationStatement : localVariableDeclaration ';' ;
    public final JaParser.localVariableDeclarationStatement_return localVariableDeclarationStatement() throws RecognitionException {
        JaParser.localVariableDeclarationStatement_return retval = new JaParser.localVariableDeclarationStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal91=null;
        JaParser.localVariableDeclaration_return localVariableDeclaration90 = null;


        Object char_literal91_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:233:5: ( localVariableDeclaration ';' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:233:10: localVariableDeclaration ';'
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_localVariableDeclaration_in_localVariableDeclarationStatement1417);
            localVariableDeclaration90=localVariableDeclaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, localVariableDeclaration90.getTree());
            char_literal91=(Token)match(input,75,FOLLOW_75_in_localVariableDeclarationStatement1419); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:236:1: localVariableDeclaration : type variableDeclarator ( ',' variableDeclarator )* -> ( ^( VARDECL type variableDeclarator ) )+ ;
    public final JaParser.localVariableDeclaration_return localVariableDeclaration() throws RecognitionException {
        JaParser.localVariableDeclaration_return retval = new JaParser.localVariableDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal94=null;
        JaParser.type_return type92 = null;

        JaParser.variableDeclarator_return variableDeclarator93 = null;

        JaParser.variableDeclarator_return variableDeclarator95 = null;


        Object char_literal94_tree=null;
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleSubtreeStream stream_variableDeclarator=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclarator");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:237:5: ( type variableDeclarator ( ',' variableDeclarator )* -> ( ^( VARDECL type variableDeclarator ) )+ )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:237:9: type variableDeclarator ( ',' variableDeclarator )*
            {
            pushFollow(FOLLOW_type_in_localVariableDeclaration1439);
            type92=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type92.getTree());
            pushFollow(FOLLOW_variableDeclarator_in_localVariableDeclaration1441);
            variableDeclarator93=variableDeclarator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variableDeclarator.add(variableDeclarator93.getTree());
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:237:33: ( ',' variableDeclarator )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==78) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:237:34: ',' variableDeclarator
            	    {
            	    char_literal94=(Token)match(input,78,FOLLOW_78_in_localVariableDeclaration1444); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_78.add(char_literal94);

            	    pushFollow(FOLLOW_variableDeclarator_in_localVariableDeclaration1446);
            	    variableDeclarator95=variableDeclarator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_variableDeclarator.add(variableDeclarator95.getTree());

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);



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
            // 237:59: -> ( ^( VARDECL type variableDeclarator ) )+
            {
                if ( !(stream_variableDeclarator.hasNext()||stream_type.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_variableDeclarator.hasNext()||stream_type.hasNext() ) {
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:237:62: ^( VARDECL type variableDeclarator )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARDECL, "VARDECL"), root_1);

                    adaptor.addChild(root_1, stream_type.nextTree());
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
        return retval;
    }
    // $ANTLR end "localVariableDeclaration"

    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:241:1: statement : ( block -> ^( BLOCK block ) | IF parExpression statement elseStmt -> ^( IF ^( CONDITION parExpression ) ^( THEN statement ) ( elseStmt )? ) | FOR '(' ( forInit )? ';' ( expression )? ';' ( forUpdate )? ')' statement -> ^( FOR ( ^( INIT forInit ) )? ( ^( CONDITION expression ) )? ( ^( UPDATE forUpdate ) )? statement ) | WHILE parExpression statement -> ^( WHILE ^( CONDITION parExpression ) statement ) | DO statement WHILE parExpression ';' -> ^( DOWHILE ^( CONDITION parExpression ) statement ) | RETURN ( expression )? ';' | ';' | statementExpression ';' -> ^( STMT statementExpression ) );
    public final JaParser.statement_return statement() throws RecognitionException {
        JaParser.statement_return retval = new JaParser.statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IF97=null;
        Token FOR101=null;
        Token char_literal102=null;
        Token char_literal104=null;
        Token char_literal106=null;
        Token char_literal108=null;
        Token WHILE110=null;
        Token DO113=null;
        Token WHILE115=null;
        Token char_literal117=null;
        Token RETURN118=null;
        Token char_literal120=null;
        Token char_literal121=null;
        Token char_literal123=null;
        JaParser.block_return block96 = null;

        JaParser.parExpression_return parExpression98 = null;

        JaParser.statement_return statement99 = null;

        JaParser.elseStmt_return elseStmt100 = null;

        JaParser.forInit_return forInit103 = null;

        JaParser.expression_return expression105 = null;

        JaParser.forUpdate_return forUpdate107 = null;

        JaParser.statement_return statement109 = null;

        JaParser.parExpression_return parExpression111 = null;

        JaParser.statement_return statement112 = null;

        JaParser.statement_return statement114 = null;

        JaParser.parExpression_return parExpression116 = null;

        JaParser.expression_return expression119 = null;

        JaParser.statementExpression_return statementExpression122 = null;


        Object IF97_tree=null;
        Object FOR101_tree=null;
        Object char_literal102_tree=null;
        Object char_literal104_tree=null;
        Object char_literal106_tree=null;
        Object char_literal108_tree=null;
        Object WHILE110_tree=null;
        Object DO113_tree=null;
        Object WHILE115_tree=null;
        Object char_literal117_tree=null;
        Object RETURN118_tree=null;
        Object char_literal120_tree=null;
        Object char_literal121_tree=null;
        Object char_literal123_tree=null;
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
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:242:5: ( block -> ^( BLOCK block ) | IF parExpression statement elseStmt -> ^( IF ^( CONDITION parExpression ) ^( THEN statement ) ( elseStmt )? ) | FOR '(' ( forInit )? ';' ( expression )? ';' ( forUpdate )? ')' statement -> ^( FOR ( ^( INIT forInit ) )? ( ^( CONDITION expression ) )? ( ^( UPDATE forUpdate ) )? statement ) | WHILE parExpression statement -> ^( WHILE ^( CONDITION parExpression ) statement ) | DO statement WHILE parExpression ';' -> ^( DOWHILE ^( CONDITION parExpression ) statement ) | RETURN ( expression )? ';' | ';' | statementExpression ';' -> ^( STMT statementExpression ) )
            int alt34=8;
            switch ( input.LA(1) ) {
            case 76:
                {
                alt34=1;
                }
                break;
            case IF:
                {
                alt34=2;
                }
                break;
            case FOR:
                {
                alt34=3;
                }
                break;
            case WHILE:
                {
                alt34=4;
                }
                break;
            case DO:
                {
                alt34=5;
                }
                break;
            case RETURN:
                {
                alt34=6;
                }
                break;
            case 75:
                {
                alt34=7;
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
                alt34=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:242:9: block
                    {
                    pushFollow(FOLLOW_block_in_statement1482);
                    block96=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block96.getTree());


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
                    // 242:15: -> ^( BLOCK block )
                    {
                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:242:18: ^( BLOCK block )
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
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:243:9: IF parExpression statement elseStmt
                    {
                    IF97=(Token)match(input,IF,FOLLOW_IF_in_statement1500); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF97);

                    pushFollow(FOLLOW_parExpression_in_statement1502);
                    parExpression98=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression98.getTree());
                    pushFollow(FOLLOW_statement_in_statement1504);
                    statement99=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement99.getTree());
                    pushFollow(FOLLOW_elseStmt_in_statement1506);
                    elseStmt100=elseStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_elseStmt.add(elseStmt100.getTree());


                    // AST REWRITE
                    // elements: elseStmt, IF, statement, parExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 243:45: -> ^( IF ^( CONDITION parExpression ) ^( THEN statement ) ( elseStmt )? )
                    {
                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:243:48: ^( IF ^( CONDITION parExpression ) ^( THEN statement ) ( elseStmt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:243:53: ^( CONDITION parExpression )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONDITION, "CONDITION"), root_2);

                        adaptor.addChild(root_2, stream_parExpression.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:243:80: ^( THEN statement )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(THEN, "THEN"), root_2);

                        adaptor.addChild(root_2, stream_statement.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:243:98: ( elseStmt )?
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
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:244:9: FOR '(' ( forInit )? ';' ( expression )? ';' ( forUpdate )? ')' statement
                    {
                    FOR101=(Token)match(input,FOR,FOLLOW_FOR_in_statement1537); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOR.add(FOR101);

                    char_literal102=(Token)match(input,81,FOLLOW_81_in_statement1539); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_81.add(char_literal102);

                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:244:17: ( forInit )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==IDENTIFIER||LA30_0==VOID||(LA30_0>=CHAR && LA30_0<=NULLLITERAL)||LA30_0==NEW||(LA30_0>=PLUS && LA30_0<=MINUS)||LA30_0==81||(LA30_0>=93 && LA30_0<=95)) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:244:17: forInit
                            {
                            pushFollow(FOLLOW_forInit_in_statement1541);
                            forInit103=forInit();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_forInit.add(forInit103.getTree());

                            }
                            break;

                    }

                    char_literal104=(Token)match(input,75,FOLLOW_75_in_statement1544); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_75.add(char_literal104);

                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:244:30: ( expression )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==IDENTIFIER||LA31_0==VOID||(LA31_0>=CHAR && LA31_0<=NULLLITERAL)||LA31_0==NEW||(LA31_0>=PLUS && LA31_0<=MINUS)||LA31_0==81||(LA31_0>=93 && LA31_0<=95)) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:244:30: expression
                            {
                            pushFollow(FOLLOW_expression_in_statement1546);
                            expression105=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(expression105.getTree());

                            }
                            break;

                    }

                    char_literal106=(Token)match(input,75,FOLLOW_75_in_statement1549); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_75.add(char_literal106);

                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:244:46: ( forUpdate )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==IDENTIFIER||LA32_0==VOID||(LA32_0>=CHAR && LA32_0<=NULLLITERAL)||LA32_0==NEW||(LA32_0>=PLUS && LA32_0<=MINUS)||LA32_0==81||(LA32_0>=93 && LA32_0<=95)) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:244:46: forUpdate
                            {
                            pushFollow(FOLLOW_forUpdate_in_statement1551);
                            forUpdate107=forUpdate();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_forUpdate.add(forUpdate107.getTree());

                            }
                            break;

                    }

                    char_literal108=(Token)match(input,82,FOLLOW_82_in_statement1554); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_82.add(char_literal108);

                    pushFollow(FOLLOW_statement_in_statement1556);
                    statement109=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement109.getTree());


                    // AST REWRITE
                    // elements: forInit, FOR, statement, forUpdate, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 245:6: -> ^( FOR ( ^( INIT forInit ) )? ( ^( CONDITION expression ) )? ( ^( UPDATE forUpdate ) )? statement )
                    {
                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:245:9: ^( FOR ( ^( INIT forInit ) )? ( ^( CONDITION expression ) )? ( ^( UPDATE forUpdate ) )? statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_FOR.nextNode(), root_1);

                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:245:15: ( ^( INIT forInit ) )?
                        if ( stream_forInit.hasNext() ) {
                            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:245:15: ^( INIT forInit )
                            {
                            Object root_2 = (Object)adaptor.nil();
                            root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(INIT, "INIT"), root_2);

                            adaptor.addChild(root_2, stream_forInit.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_forInit.reset();
                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:245:32: ( ^( CONDITION expression ) )?
                        if ( stream_expression.hasNext() ) {
                            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:245:32: ^( CONDITION expression )
                            {
                            Object root_2 = (Object)adaptor.nil();
                            root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONDITION, "CONDITION"), root_2);

                            adaptor.addChild(root_2, stream_expression.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_expression.reset();
                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:245:57: ( ^( UPDATE forUpdate ) )?
                        if ( stream_forUpdate.hasNext() ) {
                            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:245:57: ^( UPDATE forUpdate )
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
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:246:9: WHILE parExpression statement
                    {
                    WHILE110=(Token)match(input,WHILE,FOLLOW_WHILE_in_statement1602); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE.add(WHILE110);

                    pushFollow(FOLLOW_parExpression_in_statement1604);
                    parExpression111=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression111.getTree());
                    pushFollow(FOLLOW_statement_in_statement1606);
                    statement112=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement112.getTree());


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
                    // 246:39: -> ^( WHILE ^( CONDITION parExpression ) statement )
                    {
                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:246:42: ^( WHILE ^( CONDITION parExpression ) statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_WHILE.nextNode(), root_1);

                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:246:50: ^( CONDITION parExpression )
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
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:247:9: DO statement WHILE parExpression ';'
                    {
                    DO113=(Token)match(input,DO,FOLLOW_DO_in_statement1630); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DO.add(DO113);

                    pushFollow(FOLLOW_statement_in_statement1632);
                    statement114=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement114.getTree());
                    WHILE115=(Token)match(input,WHILE,FOLLOW_WHILE_in_statement1634); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE.add(WHILE115);

                    pushFollow(FOLLOW_parExpression_in_statement1636);
                    parExpression116=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression116.getTree());
                    char_literal117=(Token)match(input,75,FOLLOW_75_in_statement1638); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_75.add(char_literal117);



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
                    // 247:46: -> ^( DOWHILE ^( CONDITION parExpression ) statement )
                    {
                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:247:49: ^( DOWHILE ^( CONDITION parExpression ) statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DOWHILE, "DOWHILE"), root_1);

                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:247:59: ^( CONDITION parExpression )
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
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:248:9: RETURN ( expression )? ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    RETURN118=(Token)match(input,RETURN,FOLLOW_RETURN_in_statement1662); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RETURN118_tree = (Object)adaptor.create(RETURN118);
                    root_0 = (Object)adaptor.becomeRoot(RETURN118_tree, root_0);
                    }
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:248:17: ( expression )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==IDENTIFIER||LA33_0==VOID||(LA33_0>=CHAR && LA33_0<=NULLLITERAL)||LA33_0==NEW||(LA33_0>=PLUS && LA33_0<=MINUS)||LA33_0==81||(LA33_0>=93 && LA33_0<=95)) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:248:17: expression
                            {
                            pushFollow(FOLLOW_expression_in_statement1665);
                            expression119=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression119.getTree());

                            }
                            break;

                    }

                    char_literal120=(Token)match(input,75,FOLLOW_75_in_statement1668); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:249:9: ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal121=(Token)match(input,75,FOLLOW_75_in_statement1679); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:250:9: statementExpression ';'
                    {
                    pushFollow(FOLLOW_statementExpression_in_statement1691);
                    statementExpression122=statementExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementExpression.add(statementExpression122.getTree());
                    char_literal123=(Token)match(input,75,FOLLOW_75_in_statement1693); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_75.add(char_literal123);



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
                    // 250:33: -> ^( STMT statementExpression )
                    {
                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:250:36: ^( STMT statementExpression )
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:253:1: elseStmt : ( ( ELSE )=> ELSE statement | );
    public final JaParser.elseStmt_return elseStmt() throws RecognitionException {
        JaParser.elseStmt_return retval = new JaParser.elseStmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ELSE124=null;
        JaParser.statement_return statement125 = null;


        Object ELSE124_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:253:9: ( ( ELSE )=> ELSE statement | )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==ELSE) ) {
                int LA35_1 = input.LA(2);

                if ( (synpred2_Ja()) ) {
                    alt35=1;
                }
                else if ( (true) ) {
                    alt35=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA35_0==IDENTIFIER||LA35_0==VOID||(LA35_0>=CHAR && LA35_0<=RETURN)||LA35_0==NEW||(LA35_0>=PLUS && LA35_0<=MINUS)||(LA35_0>=75 && LA35_0<=77)||LA35_0==81||(LA35_0>=93 && LA35_0<=95)) ) {
                alt35=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:254:2: ( ELSE )=> ELSE statement
                    {
                    root_0 = (Object)adaptor.nil();

                    ELSE124=(Token)match(input,ELSE,FOLLOW_ELSE_in_elseStmt1725); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ELSE124_tree = (Object)adaptor.create(ELSE124);
                    root_0 = (Object)adaptor.becomeRoot(ELSE124_tree, root_0);
                    }
                    pushFollow(FOLLOW_statement_in_elseStmt1728);
                    statement125=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement125.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:256:2: 
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:263:1: forInit : ( localVariableDeclaration | expressionList );
    public final JaParser.forInit_return forInit() throws RecognitionException {
        JaParser.forInit_return retval = new JaParser.forInit_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.localVariableDeclaration_return localVariableDeclaration126 = null;

        JaParser.expressionList_return expressionList127 = null;



        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:264:5: ( localVariableDeclaration | expressionList )
            int alt36=2;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:264:9: localVariableDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_localVariableDeclaration_in_forInit1753);
                    localVariableDeclaration126=localVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, localVariableDeclaration126.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:265:9: expressionList
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expressionList_in_forInit1763);
                    expressionList127=expressionList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList127.getTree());

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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:268:1: forUpdate : expressionList ;
    public final JaParser.forUpdate_return forUpdate() throws RecognitionException {
        JaParser.forUpdate_return retval = new JaParser.forUpdate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.expressionList_return expressionList128 = null;



        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:269:5: ( expressionList )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:269:9: expressionList
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expressionList_in_forUpdate1782);
            expressionList128=expressionList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList128.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:274:1: parExpression : '(' expression ')' ;
    public final JaParser.parExpression_return parExpression() throws RecognitionException {
        JaParser.parExpression_return retval = new JaParser.parExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal129=null;
        Token char_literal131=null;
        JaParser.expression_return expression130 = null;


        Object char_literal129_tree=null;
        Object char_literal131_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:275:5: ( '(' expression ')' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:275:9: '(' expression ')'
            {
            root_0 = (Object)adaptor.nil();

            char_literal129=(Token)match(input,81,FOLLOW_81_in_parExpression1803); if (state.failed) return retval;
            pushFollow(FOLLOW_expression_in_parExpression1806);
            expression130=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression130.getTree());
            char_literal131=(Token)match(input,82,FOLLOW_82_in_parExpression1808); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:278:1: expressionList : expression ( ',' expression )* ;
    public final JaParser.expressionList_return expressionList() throws RecognitionException {
        JaParser.expressionList_return retval = new JaParser.expressionList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal133=null;
        JaParser.expression_return expression132 = null;

        JaParser.expression_return expression134 = null;


        Object char_literal133_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:279:5: ( expression ( ',' expression )* )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:279:9: expression ( ',' expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expression_in_expressionList1832);
            expression132=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression132.getTree());
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:279:20: ( ',' expression )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==78) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:279:21: ',' expression
            	    {
            	    char_literal133=(Token)match(input,78,FOLLOW_78_in_expressionList1835); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal133_tree = (Object)adaptor.create(char_literal133);
            	    adaptor.addChild(root_0, char_literal133_tree);
            	    }
            	    pushFollow(FOLLOW_expression_in_expressionList1837);
            	    expression134=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression134.getTree());

            	    }
            	    break;

            	default :
            	    break loop37;
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:282:1: statementExpression : expression ;
    public final JaParser.statementExpression_return statementExpression() throws RecognitionException {
        JaParser.statementExpression_return retval = new JaParser.statementExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.expression_return expression135 = null;



        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:283:5: ( expression )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:283:9: expression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expression_in_statementExpression1858);
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
        return retval;
    }
    // $ANTLR end "statementExpression"

    public static class constantExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constantExpression"
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:286:1: constantExpression : expression ;
    public final JaParser.constantExpression_return constantExpression() throws RecognitionException {
        JaParser.constantExpression_return retval = new JaParser.constantExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.expression_return expression136 = null;



        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:287:5: ( expression )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:287:9: expression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expression_in_constantExpression1881);
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
    // $ANTLR end "constantExpression"

    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:290:1: expression : orExpression (ap= assignmentOperator expression )? -> {$ap.c == '='}? ^( '=' orExpression expression ) -> {$ap.c == '+'}? ^( EQ orExpression ^( PLUS orExpression expression ) ) -> {$ap.c == '-'}? ^( EQ orExpression ^( MINUS orExpression expression ) ) -> {$ap.c == '*'}? ^( EQ orExpression ^( STAR orExpression expression ) ) -> {$ap.c == '/'}? ^( EQ orExpression ^( SLASH orExpression expression ) ) -> orExpression ;
    public final JaParser.expression_return expression() throws RecognitionException {
        JaParser.expression_return retval = new JaParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.assignmentOperator_return ap = null;

        JaParser.orExpression_return orExpression137 = null;

        JaParser.expression_return expression138 = null;


        RewriteRuleSubtreeStream stream_assignmentOperator=new RewriteRuleSubtreeStream(adaptor,"rule assignmentOperator");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_orExpression=new RewriteRuleSubtreeStream(adaptor,"rule orExpression");
        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:291:5: ( orExpression (ap= assignmentOperator expression )? -> {$ap.c == '='}? ^( '=' orExpression expression ) -> {$ap.c == '+'}? ^( EQ orExpression ^( PLUS orExpression expression ) ) -> {$ap.c == '-'}? ^( EQ orExpression ^( MINUS orExpression expression ) ) -> {$ap.c == '*'}? ^( EQ orExpression ^( STAR orExpression expression ) ) -> {$ap.c == '/'}? ^( EQ orExpression ^( SLASH orExpression expression ) ) -> orExpression )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:291:8: orExpression (ap= assignmentOperator expression )?
            {
            pushFollow(FOLLOW_orExpression_in_expression1903);
            orExpression137=orExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_orExpression.add(orExpression137.getTree());
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:291:21: (ap= assignmentOperator expression )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==EQ||(LA38_0>=84 && LA38_0<=87)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:291:23: ap= assignmentOperator expression
                    {
                    pushFollow(FOLLOW_assignmentOperator_in_expression1909);
                    ap=assignmentOperator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_assignmentOperator.add(ap.getTree());
                    pushFollow(FOLLOW_expression_in_expression1911);
                    expression138=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression138.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: expression, orExpression, orExpression, orExpression, orExpression, expression, expression, orExpression, orExpression, orExpression, orExpression, EQ, expression, expression, orExpression, orExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 291:58: -> {$ap.c == '='}? ^( '=' orExpression expression )
            if ((ap!=null?ap.c:0) == '=') {
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:291:77: ^( '=' orExpression expression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EQ, "EQ"), root_1);

                adaptor.addChild(root_1, stream_orExpression.nextTree());
                adaptor.addChild(root_1, stream_expression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 292:13: -> {$ap.c == '+'}? ^( EQ orExpression ^( PLUS orExpression expression ) )
            if ((ap!=null?ap.c:0) == '+') {
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:292:32: ^( EQ orExpression ^( PLUS orExpression expression ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EQ, "EQ"), root_1);

                adaptor.addChild(root_1, stream_orExpression.nextTree());
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:292:50: ^( PLUS orExpression expression )
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
            else // 293:13: -> {$ap.c == '-'}? ^( EQ orExpression ^( MINUS orExpression expression ) )
            if ((ap!=null?ap.c:0) == '-') {
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:293:32: ^( EQ orExpression ^( MINUS orExpression expression ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EQ, "EQ"), root_1);

                adaptor.addChild(root_1, stream_orExpression.nextTree());
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:293:50: ^( MINUS orExpression expression )
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
            else // 294:13: -> {$ap.c == '*'}? ^( EQ orExpression ^( STAR orExpression expression ) )
            if ((ap!=null?ap.c:0) == '*') {
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:294:32: ^( EQ orExpression ^( STAR orExpression expression ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EQ, "EQ"), root_1);

                adaptor.addChild(root_1, stream_orExpression.nextTree());
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:294:50: ^( STAR orExpression expression )
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
            else // 295:13: -> {$ap.c == '/'}? ^( EQ orExpression ^( SLASH orExpression expression ) )
            if ((ap!=null?ap.c:0) == '/') {
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:295:32: ^( EQ orExpression ^( SLASH orExpression expression ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EQ, "EQ"), root_1);

                adaptor.addChild(root_1, stream_orExpression.nextTree());
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:295:50: ^( SLASH orExpression expression )
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
            else // 296:13: -> orExpression
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:299:1: assignmentOperator returns [char c] : ( '=' | '+=' | '-=' | '*=' | '/=' );
    public final JaParser.assignmentOperator_return assignmentOperator() throws RecognitionException {
        JaParser.assignmentOperator_return retval = new JaParser.assignmentOperator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal139=null;
        Token string_literal140=null;
        Token string_literal141=null;
        Token string_literal142=null;
        Token string_literal143=null;

        Object char_literal139_tree=null;
        Object string_literal140_tree=null;
        Object string_literal141_tree=null;
        Object string_literal142_tree=null;
        Object string_literal143_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:300:5: ( '=' | '+=' | '-=' | '*=' | '/=' )
            int alt39=5;
            switch ( input.LA(1) ) {
            case EQ:
                {
                alt39=1;
                }
                break;
            case 84:
                {
                alt39=2;
                }
                break;
            case 85:
                {
                alt39=3;
                }
                break;
            case 86:
                {
                alt39=4;
                }
                break;
            case 87:
                {
                alt39=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:300:9: '='
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal139=(Token)match(input,EQ,FOLLOW_EQ_in_assignmentOperator2091); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal139_tree = (Object)adaptor.create(char_literal139);
                    adaptor.addChild(root_0, char_literal139_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.c = '='; 
                    }

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:301:9: '+='
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal140=(Token)match(input,84,FOLLOW_84_in_assignmentOperator2104); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal140_tree = (Object)adaptor.create(string_literal140);
                    adaptor.addChild(root_0, string_literal140_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.c = '+';
                    }

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:302:9: '-='
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal141=(Token)match(input,85,FOLLOW_85_in_assignmentOperator2117); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal141_tree = (Object)adaptor.create(string_literal141);
                    adaptor.addChild(root_0, string_literal141_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.c = '-';
                    }

                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:303:9: '*='
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal142=(Token)match(input,86,FOLLOW_86_in_assignmentOperator2129); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal142_tree = (Object)adaptor.create(string_literal142);
                    adaptor.addChild(root_0, string_literal142_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.c = '*';
                    }

                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:304:9: '/='
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal143=(Token)match(input,87,FOLLOW_87_in_assignmentOperator2141); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal143_tree = (Object)adaptor.create(string_literal143);
                    adaptor.addChild(root_0, string_literal143_tree);
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:307:1: orExpression : andExpression ( '||' andExpression )* ;
    public final JaParser.orExpression_return orExpression() throws RecognitionException {
        JaParser.orExpression_return retval = new JaParser.orExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal145=null;
        JaParser.andExpression_return andExpression144 = null;

        JaParser.andExpression_return andExpression146 = null;


        Object string_literal145_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:308:5: ( andExpression ( '||' andExpression )* )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:308:9: andExpression ( '||' andExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_andExpression_in_orExpression2162);
            andExpression144=andExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, andExpression144.getTree());
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:308:23: ( '||' andExpression )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==88) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:308:25: '||' andExpression
            	    {
            	    string_literal145=(Token)match(input,88,FOLLOW_88_in_orExpression2166); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal145_tree = (Object)adaptor.create(string_literal145);
            	    root_0 = (Object)adaptor.becomeRoot(string_literal145_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_andExpression_in_orExpression2169);
            	    andExpression146=andExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, andExpression146.getTree());

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
    // $ANTLR end "orExpression"

    public static class andExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "andExpression"
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:311:1: andExpression : equalityExpression ( '&&' equalityExpression )* ;
    public final JaParser.andExpression_return andExpression() throws RecognitionException {
        JaParser.andExpression_return retval = new JaParser.andExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal148=null;
        JaParser.equalityExpression_return equalityExpression147 = null;

        JaParser.equalityExpression_return equalityExpression149 = null;


        Object string_literal148_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:312:5: ( equalityExpression ( '&&' equalityExpression )* )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:312:9: equalityExpression ( '&&' equalityExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equalityExpression_in_andExpression2191);
            equalityExpression147=equalityExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression147.getTree());
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:312:28: ( '&&' equalityExpression )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==89) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:312:30: '&&' equalityExpression
            	    {
            	    string_literal148=(Token)match(input,89,FOLLOW_89_in_andExpression2195); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal148_tree = (Object)adaptor.create(string_literal148);
            	    root_0 = (Object)adaptor.becomeRoot(string_literal148_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_equalityExpression_in_andExpression2198);
            	    equalityExpression149=equalityExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression149.getTree());

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
    // $ANTLR end "andExpression"

    public static class equalityExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "equalityExpression"
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:315:1: equalityExpression : instanceOfExpression ( ( '==' | '!=' ) instanceOfExpression )* ;
    public final JaParser.equalityExpression_return equalityExpression() throws RecognitionException {
        JaParser.equalityExpression_return retval = new JaParser.equalityExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set151=null;
        JaParser.instanceOfExpression_return instanceOfExpression150 = null;

        JaParser.instanceOfExpression_return instanceOfExpression152 = null;


        Object set151_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:316:5: ( instanceOfExpression ( ( '==' | '!=' ) instanceOfExpression )* )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:316:9: instanceOfExpression ( ( '==' | '!=' ) instanceOfExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_instanceOfExpression_in_equalityExpression2220);
            instanceOfExpression150=instanceOfExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, instanceOfExpression150.getTree());
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:316:30: ( ( '==' | '!=' ) instanceOfExpression )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=90 && LA42_0<=91)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:316:32: ( '==' | '!=' ) instanceOfExpression
            	    {
            	    set151=(Token)input.LT(1);
            	    set151=(Token)input.LT(1);
            	    if ( (input.LA(1)>=90 && input.LA(1)<=91) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set151), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_instanceOfExpression_in_equalityExpression2233);
            	    instanceOfExpression152=instanceOfExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, instanceOfExpression152.getTree());

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
    // $ANTLR end "equalityExpression"

    public static class instanceOfExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "instanceOfExpression"
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:319:1: instanceOfExpression : relationalExpression ( INSTANCEOF type )? ;
    public final JaParser.instanceOfExpression_return instanceOfExpression() throws RecognitionException {
        JaParser.instanceOfExpression_return retval = new JaParser.instanceOfExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INSTANCEOF154=null;
        JaParser.relationalExpression_return relationalExpression153 = null;

        JaParser.type_return type155 = null;


        Object INSTANCEOF154_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:320:5: ( relationalExpression ( INSTANCEOF type )? )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:320:9: relationalExpression ( INSTANCEOF type )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relationalExpression_in_instanceOfExpression2255);
            relationalExpression153=relationalExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression153.getTree());
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:320:30: ( INSTANCEOF type )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==INSTANCEOF) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:320:31: INSTANCEOF type
                    {
                    INSTANCEOF154=(Token)match(input,INSTANCEOF,FOLLOW_INSTANCEOF_in_instanceOfExpression2258); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INSTANCEOF154_tree = (Object)adaptor.create(INSTANCEOF154);
                    root_0 = (Object)adaptor.becomeRoot(INSTANCEOF154_tree, root_0);
                    }
                    pushFollow(FOLLOW_type_in_instanceOfExpression2261);
                    type155=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type155.getTree());

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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:323:1: relationalExpression : additiveExpression ( COMPAREOP additiveExpression )* ;
    public final JaParser.relationalExpression_return relationalExpression() throws RecognitionException {
        JaParser.relationalExpression_return retval = new JaParser.relationalExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMPAREOP157=null;
        JaParser.additiveExpression_return additiveExpression156 = null;

        JaParser.additiveExpression_return additiveExpression158 = null;


        Object COMPAREOP157_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:324:5: ( additiveExpression ( COMPAREOP additiveExpression )* )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:324:9: additiveExpression ( COMPAREOP additiveExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_additiveExpression_in_relationalExpression2282);
            additiveExpression156=additiveExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression156.getTree());
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:324:28: ( COMPAREOP additiveExpression )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==COMPAREOP) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:324:30: COMPAREOP additiveExpression
            	    {
            	    COMPAREOP157=(Token)match(input,COMPAREOP,FOLLOW_COMPAREOP_in_relationalExpression2286); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    COMPAREOP157_tree = (Object)adaptor.create(COMPAREOP157);
            	    root_0 = (Object)adaptor.becomeRoot(COMPAREOP157_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_additiveExpression_in_relationalExpression2289);
            	    additiveExpression158=additiveExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression158.getTree());

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
    // $ANTLR end "relationalExpression"

    public static class additiveExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "additiveExpression"
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:327:1: additiveExpression : multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )* ;
    public final JaParser.additiveExpression_return additiveExpression() throws RecognitionException {
        JaParser.additiveExpression_return retval = new JaParser.additiveExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set160=null;
        JaParser.multiplicativeExpression_return multiplicativeExpression159 = null;

        JaParser.multiplicativeExpression_return multiplicativeExpression161 = null;


        Object set160_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:328:5: ( multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )* )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:328:9: multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression2311);
            multiplicativeExpression159=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression159.getTree());
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:328:34: ( ( '+' | '-' ) multiplicativeExpression )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0>=PLUS && LA45_0<=MINUS)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:328:36: ( '+' | '-' ) multiplicativeExpression
            	    {
            	    set160=(Token)input.LT(1);
            	    set160=(Token)input.LT(1);
            	    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set160), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression2324);
            	    multiplicativeExpression161=multiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression161.getTree());

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
    // $ANTLR end "additiveExpression"

    public static class multiplicativeExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiplicativeExpression"
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:331:1: multiplicativeExpression : unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )* ;
    public final JaParser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        JaParser.multiplicativeExpression_return retval = new JaParser.multiplicativeExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set163=null;
        JaParser.unaryExpression_return unaryExpression162 = null;

        JaParser.unaryExpression_return unaryExpression164 = null;


        Object set163_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:332:5: ( unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )* )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:332:9: unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression2346);
            unaryExpression162=unaryExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression162.getTree());
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:332:25: ( ( '*' | '/' | '%' ) unaryExpression )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>=STAR && LA46_0<=SLASH)||LA46_0==92) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:332:27: ( '*' | '/' | '%' ) unaryExpression
            	    {
            	    set163=(Token)input.LT(1);
            	    set163=(Token)input.LT(1);
            	    if ( (input.LA(1)>=STAR && input.LA(1)<=SLASH)||input.LA(1)==92 ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set163), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression2365);
            	    unaryExpression164=unaryExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression164.getTree());

            	    }
            	    break;

            	default :
            	    break loop46;
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:335:1: unaryExpression : ( '+' unaryExpression | '-' unaryExpression | '++' unaryExpression | '--' unaryExpression | unaryExpressionNotPlusMinus );
    public final JaParser.unaryExpression_return unaryExpression() throws RecognitionException {
        JaParser.unaryExpression_return retval = new JaParser.unaryExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal165=null;
        Token char_literal167=null;
        Token string_literal169=null;
        Token string_literal171=null;
        JaParser.unaryExpression_return unaryExpression166 = null;

        JaParser.unaryExpression_return unaryExpression168 = null;

        JaParser.unaryExpression_return unaryExpression170 = null;

        JaParser.unaryExpression_return unaryExpression172 = null;

        JaParser.unaryExpressionNotPlusMinus_return unaryExpressionNotPlusMinus173 = null;


        Object char_literal165_tree=null;
        Object char_literal167_tree=null;
        Object string_literal169_tree=null;
        Object string_literal171_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:336:5: ( '+' unaryExpression | '-' unaryExpression | '++' unaryExpression | '--' unaryExpression | unaryExpressionNotPlusMinus )
            int alt47=5;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt47=1;
                }
                break;
            case MINUS:
                {
                alt47=2;
                }
                break;
            case 93:
                {
                alt47=3;
                }
                break;
            case 94:
                {
                alt47=4;
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
                alt47=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:336:9: '+' unaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal165=(Token)match(input,PLUS,FOLLOW_PLUS_in_unaryExpression2391); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal165_tree = (Object)adaptor.create(char_literal165);
                    adaptor.addChild(root_0, char_literal165_tree);
                    }
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression2393);
                    unaryExpression166=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression166.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:337:9: '-' unaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal167=(Token)match(input,MINUS,FOLLOW_MINUS_in_unaryExpression2403); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal167_tree = (Object)adaptor.create(char_literal167);
                    adaptor.addChild(root_0, char_literal167_tree);
                    }
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression2405);
                    unaryExpression168=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression168.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:338:9: '++' unaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal169=(Token)match(input,93,FOLLOW_93_in_unaryExpression2415); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal169_tree = (Object)adaptor.create(string_literal169);
                    adaptor.addChild(root_0, string_literal169_tree);
                    }
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression2417);
                    unaryExpression170=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression170.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:339:9: '--' unaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal171=(Token)match(input,94,FOLLOW_94_in_unaryExpression2427); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal171_tree = (Object)adaptor.create(string_literal171);
                    adaptor.addChild(root_0, string_literal171_tree);
                    }
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression2429);
                    unaryExpression172=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression172.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:340:9: unaryExpressionNotPlusMinus
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression2439);
                    unaryExpressionNotPlusMinus173=unaryExpressionNotPlusMinus();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpressionNotPlusMinus173.getTree());

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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:343:1: unaryExpressionNotPlusMinus : ( '!' unaryExpression | ( '(' primitiveType ')' )=> '(' primitiveType ')' unaryExpression | ( '(' nonPrimitiveType ')' unaryExpressionNotPlusMinus )=> '(' nonPrimitiveType ')' unaryExpressionNotPlusMinus | NEW creator | primary ( selector )* ( '++' | '--' )? );
    public final JaParser.unaryExpressionNotPlusMinus_return unaryExpressionNotPlusMinus() throws RecognitionException {
        JaParser.unaryExpressionNotPlusMinus_return retval = new JaParser.unaryExpressionNotPlusMinus_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal174=null;
        Token char_literal176=null;
        Token char_literal178=null;
        Token char_literal180=null;
        Token char_literal182=null;
        Token NEW184=null;
        Token set188=null;
        JaParser.unaryExpression_return unaryExpression175 = null;

        JaParser.primitiveType_return primitiveType177 = null;

        JaParser.unaryExpression_return unaryExpression179 = null;

        JaParser.nonPrimitiveType_return nonPrimitiveType181 = null;

        JaParser.unaryExpressionNotPlusMinus_return unaryExpressionNotPlusMinus183 = null;

        JaParser.creator_return creator185 = null;

        JaParser.primary_return primary186 = null;

        JaParser.selector_return selector187 = null;


        Object char_literal174_tree=null;
        Object char_literal176_tree=null;
        Object char_literal178_tree=null;
        Object char_literal180_tree=null;
        Object char_literal182_tree=null;
        Object NEW184_tree=null;
        Object set188_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:344:5: ( '!' unaryExpression | ( '(' primitiveType ')' )=> '(' primitiveType ')' unaryExpression | ( '(' nonPrimitiveType ')' unaryExpressionNotPlusMinus )=> '(' nonPrimitiveType ')' unaryExpressionNotPlusMinus | NEW creator | primary ( selector )* ( '++' | '--' )? )
            int alt50=5;
            alt50 = dfa50.predict(input);
            switch (alt50) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:344:7: '!' unaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal174=(Token)match(input,95,FOLLOW_95_in_unaryExpressionNotPlusMinus2456); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal174_tree = (Object)adaptor.create(char_literal174);
                    adaptor.addChild(root_0, char_literal174_tree);
                    }
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus2458);
                    unaryExpression175=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression175.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:345:9: ( '(' primitiveType ')' )=> '(' primitiveType ')' unaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal176=(Token)match(input,81,FOLLOW_81_in_unaryExpressionNotPlusMinus2479); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal176_tree = (Object)adaptor.create(char_literal176);
                    adaptor.addChild(root_0, char_literal176_tree);
                    }
                    pushFollow(FOLLOW_primitiveType_in_unaryExpressionNotPlusMinus2481);
                    primitiveType177=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType177.getTree());
                    char_literal178=(Token)match(input,82,FOLLOW_82_in_unaryExpressionNotPlusMinus2483); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal178_tree = (Object)adaptor.create(char_literal178);
                    adaptor.addChild(root_0, char_literal178_tree);
                    }
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus2485);
                    unaryExpression179=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression179.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:347:9: ( '(' nonPrimitiveType ')' unaryExpressionNotPlusMinus )=> '(' nonPrimitiveType ')' unaryExpressionNotPlusMinus
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal180=(Token)match(input,81,FOLLOW_81_in_unaryExpressionNotPlusMinus2513); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal180_tree = (Object)adaptor.create(char_literal180);
                    adaptor.addChild(root_0, char_literal180_tree);
                    }
                    pushFollow(FOLLOW_nonPrimitiveType_in_unaryExpressionNotPlusMinus2515);
                    nonPrimitiveType181=nonPrimitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nonPrimitiveType181.getTree());
                    char_literal182=(Token)match(input,82,FOLLOW_82_in_unaryExpressionNotPlusMinus2518); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal182_tree = (Object)adaptor.create(char_literal182);
                    adaptor.addChild(root_0, char_literal182_tree);
                    }
                    pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpressionNotPlusMinus2520);
                    unaryExpressionNotPlusMinus183=unaryExpressionNotPlusMinus();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpressionNotPlusMinus183.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:348:9: NEW creator
                    {
                    root_0 = (Object)adaptor.nil();

                    NEW184=(Token)match(input,NEW,FOLLOW_NEW_in_unaryExpressionNotPlusMinus2530); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NEW184_tree = (Object)adaptor.create(NEW184);
                    adaptor.addChild(root_0, NEW184_tree);
                    }
                    pushFollow(FOLLOW_creator_in_unaryExpressionNotPlusMinus2532);
                    creator185=creator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, creator185.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:349:9: primary ( selector )* ( '++' | '--' )?
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primary_in_unaryExpressionNotPlusMinus2542);
                    primary186=primary();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primary186.getTree());
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:349:26: ( selector )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==79||LA48_0==96) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:349:26: selector
                    	    {
                    	    pushFollow(FOLLOW_selector_in_unaryExpressionNotPlusMinus2545);
                    	    selector187=selector();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(selector187.getTree(), root_0);

                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);

                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:349:29: ( '++' | '--' )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( ((LA49_0>=93 && LA49_0<=94)) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:
                            {
                            set188=(Token)input.LT(1);
                            if ( (input.LA(1)>=93 && input.LA(1)<=94) ) {
                                input.consume();
                                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set188));
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:356:1: primary : ( parExpression | THIS | SUPER superMemberAccess | literal | IDENTIFIER | ( IDENTIFIER -> IDENTIFIER ) ( '[' ']' -> ^( ARRAYTYPE $primary) )+ ( '.' CLASS -> ^( DOTCLASS $primary) ) | IDENTIFIER arguments -> ^( METHODCALL IDENTIFIER arguments THIS ) | IDENTIFIER '.' CLASS -> ^( DOTCLASS IDENTIFIER ) | ( primitiveType -> primitiveType ) ( '[' ']' -> ^( ARRAYTYPE $primary) )* ( '.' CLASS -> ^( DOTCLASS $primary) ) | VOID '.' CLASS -> ^( DOTCLASS VOID ) );
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
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
        RewriteRuleTokenStream stream_CLASS=new RewriteRuleTokenStream(adaptor,"token CLASS");
        RewriteRuleTokenStream stream_VOID=new RewriteRuleTokenStream(adaptor,"token VOID");
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");
        RewriteRuleSubtreeStream stream_primitiveType=new RewriteRuleSubtreeStream(adaptor,"rule primitiveType");
        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:357:5: ( parExpression | THIS | SUPER superMemberAccess | literal | IDENTIFIER | ( IDENTIFIER -> IDENTIFIER ) ( '[' ']' -> ^( ARRAYTYPE $primary) )+ ( '.' CLASS -> ^( DOTCLASS $primary) ) | IDENTIFIER arguments -> ^( METHODCALL IDENTIFIER arguments THIS ) | IDENTIFIER '.' CLASS -> ^( DOTCLASS IDENTIFIER ) | ( primitiveType -> primitiveType ) ( '[' ']' -> ^( ARRAYTYPE $primary) )* ( '.' CLASS -> ^( DOTCLASS $primary) ) | VOID '.' CLASS -> ^( DOTCLASS VOID ) )
            int alt53=10;
            alt53 = dfa53.predict(input);
            switch (alt53) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:357:9: parExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_parExpression_in_primary2609);
                    parExpression189=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parExpression189.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:358:9: THIS
                    {
                    root_0 = (Object)adaptor.nil();

                    THIS190=(Token)match(input,THIS,FOLLOW_THIS_in_primary2619); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    THIS190_tree = (Object)adaptor.create(THIS190);
                    adaptor.addChild(root_0, THIS190_tree);
                    }

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:359:9: SUPER superMemberAccess
                    {
                    root_0 = (Object)adaptor.nil();

                    SUPER191=(Token)match(input,SUPER,FOLLOW_SUPER_in_primary2630); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SUPER191_tree = (Object)adaptor.create(SUPER191);
                    root_0 = (Object)adaptor.becomeRoot(SUPER191_tree, root_0);
                    }
                    pushFollow(FOLLOW_superMemberAccess_in_primary2633);
                    superMemberAccess192=superMemberAccess();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, superMemberAccess192.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:360:9: literal
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_literal_in_primary2643);
                    literal193=literal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, literal193.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:361:9: IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();

                    IDENTIFIER194=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary2653); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER194_tree = (Object)adaptor.create(IDENTIFIER194);
                    adaptor.addChild(root_0, IDENTIFIER194_tree);
                    }

                    }
                    break;
                case 6 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:362:9: ( IDENTIFIER -> IDENTIFIER ) ( '[' ']' -> ^( ARRAYTYPE $primary) )+ ( '.' CLASS -> ^( DOTCLASS $primary) )
                    {
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:362:9: ( IDENTIFIER -> IDENTIFIER )
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:362:10: IDENTIFIER
                    {
                    IDENTIFIER195=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary2664); if (state.failed) return retval; 
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
                    // 362:21: -> IDENTIFIER
                    {
                        adaptor.addChild(root_0, stream_IDENTIFIER.nextNode());

                    }

                    retval.tree = root_0;}
                    }

                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:362:36: ( '[' ']' -> ^( ARRAYTYPE $primary) )+
                    int cnt51=0;
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==79) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:362:37: '[' ']'
                    	    {
                    	    char_literal196=(Token)match(input,79,FOLLOW_79_in_primary2672); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_79.add(char_literal196);

                    	    char_literal197=(Token)match(input,80,FOLLOW_80_in_primary2674); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_80.add(char_literal197);



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
                    	    // 362:45: -> ^( ARRAYTYPE $primary)
                    	    {
                    	        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:362:48: ^( ARRAYTYPE $primary)
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
                    	    if ( cnt51 >= 1 ) break loop51;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(51, input);
                                throw eee;
                        }
                        cnt51++;
                    } while (true);

                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:362:72: ( '.' CLASS -> ^( DOTCLASS $primary) )
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:362:73: '.' CLASS
                    {
                    char_literal198=(Token)match(input,96,FOLLOW_96_in_primary2688); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_96.add(char_literal198);

                    CLASS199=(Token)match(input,CLASS,FOLLOW_CLASS_in_primary2690); if (state.failed) return retval; 
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
                    // 362:83: -> ^( DOTCLASS $primary)
                    {
                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:362:86: ^( DOTCLASS $primary)
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
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:363:8: IDENTIFIER arguments
                    {
                    IDENTIFIER200=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary2709); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER200);

                    pushFollow(FOLLOW_arguments_in_primary2712);
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
                    // 363:30: -> ^( METHODCALL IDENTIFIER arguments THIS )
                    {
                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:363:33: ^( METHODCALL IDENTIFIER arguments THIS )
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
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:364:7: IDENTIFIER '.' CLASS
                    {
                    IDENTIFIER202=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary2732); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER202);

                    char_literal203=(Token)match(input,96,FOLLOW_96_in_primary2734); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_96.add(char_literal203);

                    CLASS204=(Token)match(input,CLASS,FOLLOW_CLASS_in_primary2736); if (state.failed) return retval; 
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
                    // 364:28: -> ^( DOTCLASS IDENTIFIER )
                    {
                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:364:31: ^( DOTCLASS IDENTIFIER )
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
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:365:9: ( primitiveType -> primitiveType ) ( '[' ']' -> ^( ARRAYTYPE $primary) )* ( '.' CLASS -> ^( DOTCLASS $primary) )
                    {
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:365:9: ( primitiveType -> primitiveType )
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:365:10: primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_primary2755);
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
                    // 365:24: -> primitiveType
                    {
                        adaptor.addChild(root_0, stream_primitiveType.nextTree());

                    }

                    retval.tree = root_0;}
                    }

                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:365:42: ( '[' ']' -> ^( ARRAYTYPE $primary) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==79) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:365:43: '[' ']'
                    	    {
                    	    char_literal206=(Token)match(input,79,FOLLOW_79_in_primary2763); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_79.add(char_literal206);

                    	    char_literal207=(Token)match(input,80,FOLLOW_80_in_primary2765); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_80.add(char_literal207);



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
                    	    // 365:51: -> ^( ARRAYTYPE $primary)
                    	    {
                    	        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:365:54: ^( ARRAYTYPE $primary)
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
                    	    break loop52;
                        }
                    } while (true);

                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:365:78: ( '.' CLASS -> ^( DOTCLASS $primary) )
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:365:79: '.' CLASS
                    {
                    char_literal208=(Token)match(input,96,FOLLOW_96_in_primary2779); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_96.add(char_literal208);

                    CLASS209=(Token)match(input,CLASS,FOLLOW_CLASS_in_primary2781); if (state.failed) return retval; 
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
                    // 365:89: -> ^( DOTCLASS $primary)
                    {
                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:365:92: ^( DOTCLASS $primary)
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
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:366:9: VOID '.' CLASS
                    {
                    VOID210=(Token)match(input,VOID,FOLLOW_VOID_in_primary2801); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VOID.add(VOID210);

                    char_literal211=(Token)match(input,96,FOLLOW_96_in_primary2803); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_96.add(char_literal211);

                    CLASS212=(Token)match(input,CLASS,FOLLOW_CLASS_in_primary2805); if (state.failed) return retval; 
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
                    // 366:24: -> ^( DOTCLASS VOID )
                    {
                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:366:27: ^( DOTCLASS VOID )
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:369:1: selector : ( '.' IDENTIFIER -> ^( FIELDACCESS IDENTIFIER ) | '.' IDENTIFIER arguments -> ^( METHODCALL IDENTIFIER ( arguments )? ) | '[' expression ']' -> ^( ARRAYACCESS expression ) );
    public final JaParser.selector_return selector() throws RecognitionException {
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
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");
        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:370:5: ( '.' IDENTIFIER -> ^( FIELDACCESS IDENTIFIER ) | '.' IDENTIFIER arguments -> ^( METHODCALL IDENTIFIER ( arguments )? ) | '[' expression ']' -> ^( ARRAYACCESS expression ) )
            int alt54=3;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==96) ) {
                int LA54_1 = input.LA(2);

                if ( (LA54_1==IDENTIFIER) ) {
                    int LA54_3 = input.LA(3);

                    if ( (LA54_3==81) ) {
                        alt54=2;
                    }
                    else if ( (LA54_3==EOF||(LA54_3>=INSTANCEOF && LA54_3<=COMPAREOP)||(LA54_3>=EQ && LA54_3<=SLASH)||LA54_3==75||(LA54_3>=77 && LA54_3<=80)||LA54_3==82||(LA54_3>=84 && LA54_3<=94)||LA54_3==96) ) {
                        alt54=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 54, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 54, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA54_0==79) ) {
                alt54=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:370:9: '.' IDENTIFIER
                    {
                    char_literal213=(Token)match(input,96,FOLLOW_96_in_selector2836); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_96.add(char_literal213);

                    IDENTIFIER214=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_selector2838); if (state.failed) return retval; 
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
                    // 370:24: -> ^( FIELDACCESS IDENTIFIER )
                    {
                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:370:27: ^( FIELDACCESS IDENTIFIER )
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
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:371:7: '.' IDENTIFIER arguments
                    {
                    char_literal215=(Token)match(input,96,FOLLOW_96_in_selector2854); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_96.add(char_literal215);

                    IDENTIFIER216=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_selector2856); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER216);

                    pushFollow(FOLLOW_arguments_in_selector2858);
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
                    // 371:32: -> ^( METHODCALL IDENTIFIER ( arguments )? )
                    {
                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:371:35: ^( METHODCALL IDENTIFIER ( arguments )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(METHODCALL, "METHODCALL"), root_1);

                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:371:59: ( arguments )?
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
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:374:9: '[' expression ']'
                    {
                    char_literal218=(Token)match(input,79,FOLLOW_79_in_selector2889); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_79.add(char_literal218);

                    pushFollow(FOLLOW_expression_in_selector2891);
                    expression219=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression219.getTree());
                    char_literal220=(Token)match(input,80,FOLLOW_80_in_selector2893); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_80.add(char_literal220);



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
                    // 374:27: -> ^( ARRAYACCESS expression )
                    {
                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:374:30: ^( ARRAYACCESS expression )
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:377:1: identifierSuffix : ( ( '[' ']' )+ '.' CLASS | arguments | '.' CLASS );
    public final JaParser.identifierSuffix_return identifierSuffix() throws RecognitionException {
        JaParser.identifierSuffix_return retval = new JaParser.identifierSuffix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal221=null;
        Token char_literal222=null;
        Token char_literal223=null;
        Token CLASS224=null;
        Token char_literal226=null;
        Token CLASS227=null;
        JaParser.arguments_return arguments225 = null;


        Object char_literal221_tree=null;
        Object char_literal222_tree=null;
        Object char_literal223_tree=null;
        Object CLASS224_tree=null;
        Object char_literal226_tree=null;
        Object CLASS227_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:378:5: ( ( '[' ']' )+ '.' CLASS | arguments | '.' CLASS )
            int alt56=3;
            switch ( input.LA(1) ) {
            case 79:
                {
                alt56=1;
                }
                break;
            case 81:
                {
                alt56=2;
                }
                break;
            case 96:
                {
                alt56=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:378:9: ( '[' ']' )+ '.' CLASS
                    {
                    root_0 = (Object)adaptor.nil();

                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:378:9: ( '[' ']' )+
                    int cnt55=0;
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==79) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:378:10: '[' ']'
                    	    {
                    	    char_literal221=(Token)match(input,79,FOLLOW_79_in_identifierSuffix2920); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal221_tree = (Object)adaptor.create(char_literal221);
                    	    adaptor.addChild(root_0, char_literal221_tree);
                    	    }
                    	    char_literal222=(Token)match(input,80,FOLLOW_80_in_identifierSuffix2922); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal222_tree = (Object)adaptor.create(char_literal222);
                    	    adaptor.addChild(root_0, char_literal222_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt55 >= 1 ) break loop55;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(55, input);
                                throw eee;
                        }
                        cnt55++;
                    } while (true);

                    char_literal223=(Token)match(input,96,FOLLOW_96_in_identifierSuffix2926); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal223_tree = (Object)adaptor.create(char_literal223);
                    adaptor.addChild(root_0, char_literal223_tree);
                    }
                    CLASS224=(Token)match(input,CLASS,FOLLOW_CLASS_in_identifierSuffix2928); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CLASS224_tree = (Object)adaptor.create(CLASS224);
                    adaptor.addChild(root_0, CLASS224_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:380:9: arguments
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_arguments_in_identifierSuffix2943);
                    arguments225=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments225.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:381:9: '.' CLASS
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal226=(Token)match(input,96,FOLLOW_96_in_identifierSuffix2953); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal226_tree = (Object)adaptor.create(char_literal226);
                    adaptor.addChild(root_0, char_literal226_tree);
                    }
                    CLASS227=(Token)match(input,CLASS,FOLLOW_CLASS_in_identifierSuffix2955); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CLASS227_tree = (Object)adaptor.create(CLASS227);
                    adaptor.addChild(root_0, CLASS227_tree);
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:386:1: creator : createdName ( arrayCreatorRest | classCreatorRest ) ;
    public final JaParser.creator_return creator() throws RecognitionException {
        JaParser.creator_return retval = new JaParser.creator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.createdName_return createdName228 = null;

        JaParser.arrayCreatorRest_return arrayCreatorRest229 = null;

        JaParser.classCreatorRest_return classCreatorRest230 = null;



        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:387:5: ( createdName ( arrayCreatorRest | classCreatorRest ) )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:387:8: createdName ( arrayCreatorRest | classCreatorRest )
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_createdName_in_creator2983);
            createdName228=createdName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, createdName228.getTree());
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:387:20: ( arrayCreatorRest | classCreatorRest )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==79) ) {
                alt57=1;
            }
            else if ( (LA57_0==81) ) {
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
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:387:21: arrayCreatorRest
                    {
                    pushFollow(FOLLOW_arrayCreatorRest_in_creator2986);
                    arrayCreatorRest229=arrayCreatorRest();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayCreatorRest229.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:387:40: classCreatorRest
                    {
                    pushFollow(FOLLOW_classCreatorRest_in_creator2990);
                    classCreatorRest230=classCreatorRest();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classCreatorRest230.getTree());

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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:390:1: createdName : ( classType | primitiveType );
    public final JaParser.createdName_return createdName() throws RecognitionException {
        JaParser.createdName_return retval = new JaParser.createdName_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.classType_return classType231 = null;

        JaParser.primitiveType_return primitiveType232 = null;



        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:391:5: ( classType | primitiveType )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==IDENTIFIER) ) {
                alt58=1;
            }
            else if ( ((LA58_0>=CHAR && LA58_0<=DOUBLE)) ) {
                alt58=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:391:9: classType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_classType_in_createdName3010);
                    classType231=classType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classType231.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:392:9: primitiveType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primitiveType_in_createdName3020);
                    primitiveType232=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType232.getTree());

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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:395:1: arrayCreatorRest : ( '[' ']' ( '[' ']' )* arrayInitializer | '[' expression ']' ( '[' expression ']' )* );
    public final JaParser.arrayCreatorRest_return arrayCreatorRest() throws RecognitionException {
        JaParser.arrayCreatorRest_return retval = new JaParser.arrayCreatorRest_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal233=null;
        Token char_literal234=null;
        Token char_literal235=null;
        Token char_literal236=null;
        Token char_literal238=null;
        Token char_literal240=null;
        Token char_literal241=null;
        Token char_literal243=null;
        JaParser.arrayInitializer_return arrayInitializer237 = null;

        JaParser.expression_return expression239 = null;

        JaParser.expression_return expression242 = null;


        Object char_literal233_tree=null;
        Object char_literal234_tree=null;
        Object char_literal235_tree=null;
        Object char_literal236_tree=null;
        Object char_literal238_tree=null;
        Object char_literal240_tree=null;
        Object char_literal241_tree=null;
        Object char_literal243_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:396:5: ( '[' ']' ( '[' ']' )* arrayInitializer | '[' expression ']' ( '[' expression ']' )* )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==79) ) {
                int LA61_1 = input.LA(2);

                if ( (LA61_1==80) ) {
                    alt61=1;
                }
                else if ( (LA61_1==IDENTIFIER||LA61_1==VOID||(LA61_1>=CHAR && LA61_1<=NULLLITERAL)||LA61_1==NEW||(LA61_1>=PLUS && LA61_1<=MINUS)||LA61_1==81||(LA61_1>=93 && LA61_1<=95)) ) {
                    alt61=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 61, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:396:9: '[' ']' ( '[' ']' )* arrayInitializer
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal233=(Token)match(input,79,FOLLOW_79_in_arrayCreatorRest3043); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal233_tree = (Object)adaptor.create(char_literal233);
                    adaptor.addChild(root_0, char_literal233_tree);
                    }
                    char_literal234=(Token)match(input,80,FOLLOW_80_in_arrayCreatorRest3044); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal234_tree = (Object)adaptor.create(char_literal234);
                    adaptor.addChild(root_0, char_literal234_tree);
                    }
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:396:16: ( '[' ']' )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==79) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:396:17: '[' ']'
                    	    {
                    	    char_literal235=(Token)match(input,79,FOLLOW_79_in_arrayCreatorRest3047); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal235_tree = (Object)adaptor.create(char_literal235);
                    	    adaptor.addChild(root_0, char_literal235_tree);
                    	    }
                    	    char_literal236=(Token)match(input,80,FOLLOW_80_in_arrayCreatorRest3049); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal236_tree = (Object)adaptor.create(char_literal236);
                    	    adaptor.addChild(root_0, char_literal236_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop59;
                        }
                    } while (true);

                    pushFollow(FOLLOW_arrayInitializer_in_arrayCreatorRest3053);
                    arrayInitializer237=arrayInitializer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayInitializer237.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:397:7: '[' expression ']' ( '[' expression ']' )*
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal238=(Token)match(input,79,FOLLOW_79_in_arrayCreatorRest3061); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal238_tree = (Object)adaptor.create(char_literal238);
                    adaptor.addChild(root_0, char_literal238_tree);
                    }
                    pushFollow(FOLLOW_expression_in_arrayCreatorRest3063);
                    expression239=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression239.getTree());
                    char_literal240=(Token)match(input,80,FOLLOW_80_in_arrayCreatorRest3065); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal240_tree = (Object)adaptor.create(char_literal240);
                    adaptor.addChild(root_0, char_literal240_tree);
                    }
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:397:26: ( '[' expression ']' )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==79) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:397:27: '[' expression ']'
                    	    {
                    	    char_literal241=(Token)match(input,79,FOLLOW_79_in_arrayCreatorRest3068); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal241_tree = (Object)adaptor.create(char_literal241);
                    	    adaptor.addChild(root_0, char_literal241_tree);
                    	    }
                    	    pushFollow(FOLLOW_expression_in_arrayCreatorRest3070);
                    	    expression242=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression242.getTree());
                    	    char_literal243=(Token)match(input,80,FOLLOW_80_in_arrayCreatorRest3072); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal243_tree = (Object)adaptor.create(char_literal243);
                    	    adaptor.addChild(root_0, char_literal243_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop60;
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:400:1: classCreatorRest : arguments ;
    public final JaParser.classCreatorRest_return classCreatorRest() throws RecognitionException {
        JaParser.classCreatorRest_return retval = new JaParser.classCreatorRest_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.arguments_return arguments244 = null;



        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:401:5: ( arguments )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:401:9: arguments
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_arguments_in_classCreatorRest3095);
            arguments244=arguments();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments244.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:404:1: superMemberAccess : '.' IDENTIFIER ( arguments )? ;
    public final JaParser.superMemberAccess_return superMemberAccess() throws RecognitionException {
        JaParser.superMemberAccess_return retval = new JaParser.superMemberAccess_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal245=null;
        Token IDENTIFIER246=null;
        JaParser.arguments_return arguments247 = null;


        Object char_literal245_tree=null;
        Object IDENTIFIER246_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:405:2: ( '.' IDENTIFIER ( arguments )? )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:406:2: '.' IDENTIFIER ( arguments )?
            {
            root_0 = (Object)adaptor.nil();

            char_literal245=(Token)match(input,96,FOLLOW_96_in_superMemberAccess3117); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal245_tree = (Object)adaptor.create(char_literal245);
            adaptor.addChild(root_0, char_literal245_tree);
            }
            IDENTIFIER246=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_superMemberAccess3119); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER246_tree = (Object)adaptor.create(IDENTIFIER246);
            adaptor.addChild(root_0, IDENTIFIER246_tree);
            }
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:406:17: ( arguments )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==81) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:406:17: arguments
                    {
                    pushFollow(FOLLOW_arguments_in_superMemberAccess3121);
                    arguments247=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments247.getTree());

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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:409:1: arguments : '(' ( expressionList )? ')' ;
    public final JaParser.arguments_return arguments() throws RecognitionException {
        JaParser.arguments_return retval = new JaParser.arguments_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal248=null;
        Token char_literal250=null;
        JaParser.expressionList_return expressionList249 = null;


        Object char_literal248_tree=null;
        Object char_literal250_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:410:5: ( '(' ( expressionList )? ')' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:410:9: '(' ( expressionList )? ')'
            {
            root_0 = (Object)adaptor.nil();

            char_literal248=(Token)match(input,81,FOLLOW_81_in_arguments3139); if (state.failed) return retval;
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:410:14: ( expressionList )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==IDENTIFIER||LA63_0==VOID||(LA63_0>=CHAR && LA63_0<=NULLLITERAL)||LA63_0==NEW||(LA63_0>=PLUS && LA63_0<=MINUS)||LA63_0==81||(LA63_0>=93 && LA63_0<=95)) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:410:14: expressionList
                    {
                    pushFollow(FOLLOW_expressionList_in_arguments3142);
                    expressionList249=expressionList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList249.getTree());

                    }
                    break;

            }

            char_literal250=(Token)match(input,82,FOLLOW_82_in_arguments3145); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:254:2: ( ELSE )
        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:254:3: ELSE
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred2_Ja1720); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_Ja

    // $ANTLR start synpred3_Ja
    public final void synpred3_Ja_fragment() throws RecognitionException {   
        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:345:9: ( '(' primitiveType ')' )
        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:345:10: '(' primitiveType ')'
        {
        match(input,81,FOLLOW_81_in_synpred3_Ja2469); if (state.failed) return ;
        pushFollow(FOLLOW_primitiveType_in_synpred3_Ja2471);
        primitiveType();

        state._fsp--;
        if (state.failed) return ;
        match(input,82,FOLLOW_82_in_synpred3_Ja2473); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_Ja

    // $ANTLR start synpred4_Ja
    public final void synpred4_Ja_fragment() throws RecognitionException {   
        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:347:9: ( '(' nonPrimitiveType ')' unaryExpressionNotPlusMinus )
        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:347:10: '(' nonPrimitiveType ')' unaryExpressionNotPlusMinus
        {
        match(input,81,FOLLOW_81_in_synpred4_Ja2501); if (state.failed) return ;
        pushFollow(FOLLOW_nonPrimitiveType_in_synpred4_Ja2503);
        nonPrimitiveType();

        state._fsp--;
        if (state.failed) return ;
        match(input,82,FOLLOW_82_in_synpred4_Ja2506); if (state.failed) return ;
        pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_synpred4_Ja2508);
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


    protected DFA17 dfa17 = new DFA17(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA36 dfa36 = new DFA36(this);
    protected DFA50 dfa50 = new DFA50(this);
    protected DFA53 dfa53 = new DFA53(this);
    static final String DFA17_eotS =
        "\12\uffff";
    static final String DFA17_eofS =
        "\2\uffff\7\11\1\uffff";
    static final String DFA17_minS =
        "\1\31\1\uffff\7\31\1\uffff";
    static final String DFA17_maxS =
        "\1\44\1\uffff\7\133\1\uffff";
    static final String DFA17_acceptS =
        "\1\uffff\1\1\7\uffff\1\2";
    static final String DFA17_specialS =
        "\12\uffff}>";
    static final String[] DFA17_transitionS = {
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

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "147:1: type returns [Type t] : ( nonPrimitiveType | primitiveType );";
        }
    }
    static final String DFA24_eotS =
        "\17\uffff";
    static final String DFA24_eofS =
        "\17\uffff";
    static final String DFA24_minS =
        "\11\31\1\120\2\uffff\1\120\2\31";
    static final String DFA24_maxS =
        "\1\44\10\123\1\120\2\uffff\1\120\2\123";
    static final String DFA24_acceptS =
        "\12\uffff\1\2\1\1\3\uffff";
    static final String DFA24_specialS =
        "\17\uffff}>";
    static final String[] DFA24_transitionS = {
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

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "186:1: formalParameterDecls[ArrayList<Type> args] : ( type variableDeclaratorId ( ',' formalParameterDecls[args] )? -> ^( FPARM type variableDeclaratorId ) ( formalParameterDecls )? | type '...' variableDeclaratorId -> ^( FMULTPARM type variableDeclaratorId ) );";
        }
    }
    static final String DFA28_eotS =
        "\20\uffff";
    static final String DFA28_eofS =
        "\20\uffff";
    static final String DFA28_minS =
        "\11\31\1\uffff\1\31\1\uffff\1\120\2\31\1\120";
    static final String DFA28_maxS =
        "\1\137\10\140\1\uffff\1\137\1\uffff\1\120\2\140\1\120";
    static final String DFA28_acceptS =
        "\11\uffff\1\2\1\uffff\1\1\4\uffff";
    static final String DFA28_specialS =
        "\20\uffff}>";
    static final String[] DFA28_transitionS = {
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

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "227:1: blockStatement : ( localVariableDeclarationStatement | statement );";
        }
    }
    static final String DFA36_eotS =
        "\20\uffff";
    static final String DFA36_eofS =
        "\20\uffff";
    static final String DFA36_minS =
        "\11\31\1\uffff\1\31\1\uffff\1\120\2\31\1\120";
    static final String DFA36_maxS =
        "\1\137\10\140\1\uffff\1\137\1\uffff\1\120\2\140\1\120";
    static final String DFA36_acceptS =
        "\11\uffff\1\2\1\uffff\1\1\4\uffff";
    static final String DFA36_specialS =
        "\20\uffff}>";
    static final String[] DFA36_transitionS = {
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
            return "263:1: forInit : ( localVariableDeclaration | expressionList );";
        }
    }
    static final String DFA50_eotS =
        "\44\uffff";
    static final String DFA50_eofS =
        "\16\uffff\1\4\25\uffff";
    static final String DFA50_minS =
        "\1\31\1\uffff\1\31\2\uffff\1\63\7\117\2\31\1\120\1\uffff\1\117"+
        "\17\uffff\1\117\1\120\1\uffff";
    static final String DFA50_maxS =
        "\1\137\1\uffff\1\137\2\uffff\10\140\1\137\1\140\1\120\1\uffff\1"+
        "\140\17\uffff\1\140\1\120\1\uffff";
    static final String DFA50_acceptS =
        "\1\uffff\1\1\1\uffff\1\4\1\5\13\uffff\1\2\1\uffff\17\3\2\uffff"+
        "\1\3";
    static final String DFA50_specialS =
        "\6\uffff\1\7\1\2\1\10\1\5\1\1\1\11\1\3\1\uffff\1\6\2\uffff\1\0"+
        "\17\uffff\1\4\2\uffff}>";
    static final String[] DFA50_transitionS = {
            "\1\4\2\uffff\1\4\1\uffff\17\4\10\uffff\1\3\33\uffff\1\2\15"+
            "\uffff\1\1",
            "",
            "\1\5\2\uffff\1\4\1\uffff\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
            "\10\4\10\uffff\1\4\17\uffff\2\4\12\uffff\1\4\13\uffff\3\4",
            "",
            "",
            "\2\4\17\uffff\5\4\6\uffff\1\15\1\uffff\1\4\1\16\1\uffff\13"+
            "\4\1\uffff\1\4",
            "\1\17\2\uffff\1\20\15\uffff\1\4",
            "\1\17\2\uffff\1\20\15\uffff\1\4",
            "\1\17\2\uffff\1\20\15\uffff\1\4",
            "\1\17\2\uffff\1\20\15\uffff\1\4",
            "\1\17\2\uffff\1\20\15\uffff\1\4",
            "\1\17\2\uffff\1\20\15\uffff\1\4",
            "\1\17\2\uffff\1\20\15\uffff\1\4",
            "\1\4\2\uffff\1\4\1\uffff\17\4\10\uffff\1\4\17\uffff\2\4\11"+
            "\uffff\1\21\1\4\13\uffff\3\4",
            "\1\30\2\uffff\1\40\1\uffff\1\31\1\32\1\33\1\34\1\35\1\36\1"+
            "\37\1\25\1\26\6\27\6\uffff\2\4\1\24\16\uffff\5\4\2\uffff\1\4"+
            "\1\uffff\4\4\1\23\1\4\1\uffff\13\4\1\22\1\4",
            "\1\41",
            "",
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
            "\1\17\2\uffff\1\43\15\uffff\1\4",
            "\1\21",
            ""
    };

    static final short[] DFA50_eot = DFA.unpackEncodedString(DFA50_eotS);
    static final short[] DFA50_eof = DFA.unpackEncodedString(DFA50_eofS);
    static final char[] DFA50_min = DFA.unpackEncodedStringToUnsignedChars(DFA50_minS);
    static final char[] DFA50_max = DFA.unpackEncodedStringToUnsignedChars(DFA50_maxS);
    static final short[] DFA50_accept = DFA.unpackEncodedString(DFA50_acceptS);
    static final short[] DFA50_special = DFA.unpackEncodedString(DFA50_specialS);
    static final short[][] DFA50_transition;

    static {
        int numStates = DFA50_transitionS.length;
        DFA50_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA50_transition[i] = DFA.unpackEncodedString(DFA50_transitionS[i]);
        }
    }

    class DFA50 extends DFA {

        public DFA50(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 50;
            this.eot = DFA50_eot;
            this.eof = DFA50_eof;
            this.min = DFA50_min;
            this.max = DFA50_max;
            this.accept = DFA50_accept;
            this.special = DFA50_special;
            this.transition = DFA50_transition;
        }
        public String getDescription() {
            return "343:1: unaryExpressionNotPlusMinus : ( '!' unaryExpression | ( '(' primitiveType ')' )=> '(' primitiveType ')' unaryExpression | ( '(' nonPrimitiveType ')' unaryExpressionNotPlusMinus )=> '(' nonPrimitiveType ')' unaryExpressionNotPlusMinus | NEW creator | primary ( selector )* ( '++' | '--' )? );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA50_17 = input.LA(1);

                         
                        int index50_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA50_17==96) ) {s = 4;}

                        else if ( (LA50_17==79) ) {s = 34;}

                        else if ( (LA50_17==82) && (synpred4_Ja())) {s = 35;}

                         
                        input.seek(index50_17);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA50_10 = input.LA(1);

                         
                        int index50_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA50_10==79) ) {s = 15;}

                        else if ( (LA50_10==96) ) {s = 4;}

                        else if ( (LA50_10==82) && (synpred3_Ja())) {s = 16;}

                         
                        input.seek(index50_10);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA50_7 = input.LA(1);

                         
                        int index50_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA50_7==82) && (synpred3_Ja())) {s = 16;}

                        else if ( (LA50_7==79) ) {s = 15;}

                        else if ( (LA50_7==96) ) {s = 4;}

                         
                        input.seek(index50_7);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA50_12 = input.LA(1);

                         
                        int index50_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA50_12==82) && (synpred3_Ja())) {s = 16;}

                        else if ( (LA50_12==79) ) {s = 15;}

                        else if ( (LA50_12==96) ) {s = 4;}

                         
                        input.seek(index50_12);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA50_33 = input.LA(1);

                         
                        int index50_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA50_33==96) ) {s = 4;}

                        else if ( (LA50_33==79) ) {s = 15;}

                        else if ( (LA50_33==82) && (synpred4_Ja())) {s = 35;}

                         
                        input.seek(index50_33);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA50_9 = input.LA(1);

                         
                        int index50_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA50_9==79) ) {s = 15;}

                        else if ( (LA50_9==96) ) {s = 4;}

                        else if ( (LA50_9==82) && (synpred3_Ja())) {s = 16;}

                         
                        input.seek(index50_9);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA50_14 = input.LA(1);

                         
                        int index50_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA50_14==EOF||(LA50_14>=INSTANCEOF && LA50_14<=COMPAREOP)||(LA50_14>=EQ && LA50_14<=SLASH)||LA50_14==75||(LA50_14>=77 && LA50_14<=80)||LA50_14==82||(LA50_14>=84 && LA50_14<=94)||LA50_14==96) ) {s = 4;}

                        else if ( (LA50_14==95) && (synpred4_Ja())) {s = 18;}

                        else if ( (LA50_14==81) && (synpred4_Ja())) {s = 19;}

                        else if ( (LA50_14==NEW) && (synpred4_Ja())) {s = 20;}

                        else if ( (LA50_14==THIS) && (synpred4_Ja())) {s = 21;}

                        else if ( (LA50_14==SUPER) && (synpred4_Ja())) {s = 22;}

                        else if ( ((LA50_14>=INTLITERAL && LA50_14<=NULLLITERAL)) && (synpred4_Ja())) {s = 23;}

                        else if ( (LA50_14==IDENTIFIER) && (synpred4_Ja())) {s = 24;}

                        else if ( (LA50_14==CHAR) && (synpred4_Ja())) {s = 25;}

                        else if ( (LA50_14==BYTE) && (synpred4_Ja())) {s = 26;}

                        else if ( (LA50_14==SHORT) && (synpred4_Ja())) {s = 27;}

                        else if ( (LA50_14==INT) && (synpred4_Ja())) {s = 28;}

                        else if ( (LA50_14==LONG) && (synpred4_Ja())) {s = 29;}

                        else if ( (LA50_14==FLOAT) && (synpred4_Ja())) {s = 30;}

                        else if ( (LA50_14==DOUBLE) && (synpred4_Ja())) {s = 31;}

                        else if ( (LA50_14==VOID) && (synpred4_Ja())) {s = 32;}

                         
                        input.seek(index50_14);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA50_6 = input.LA(1);

                         
                        int index50_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA50_6==79) ) {s = 15;}

                        else if ( (LA50_6==96) ) {s = 4;}

                        else if ( (LA50_6==82) && (synpred3_Ja())) {s = 16;}

                         
                        input.seek(index50_6);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA50_8 = input.LA(1);

                         
                        int index50_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA50_8==82) && (synpred3_Ja())) {s = 16;}

                        else if ( (LA50_8==79) ) {s = 15;}

                        else if ( (LA50_8==96) ) {s = 4;}

                         
                        input.seek(index50_8);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA50_11 = input.LA(1);

                         
                        int index50_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA50_11==82) && (synpred3_Ja())) {s = 16;}

                        else if ( (LA50_11==79) ) {s = 15;}

                        else if ( (LA50_11==96) ) {s = 4;}

                         
                        input.seek(index50_11);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 50, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA53_eotS =
        "\16\uffff";
    static final String DFA53_eofS =
        "\5\uffff\1\12\10\uffff";
    static final String DFA53_minS =
        "\1\31\4\uffff\1\63\2\uffff\1\30\1\31\4\uffff";
    static final String DFA53_maxS =
        "\1\121\4\uffff\1\140\2\uffff\1\31\1\137\4\uffff";
    static final String DFA53_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\11\1\12\2\uffff\1\5\1\7\1\10"+
        "\1\6";
    static final String DFA53_specialS =
        "\16\uffff}>";
    static final String[] DFA53_transitionS = {
            "\1\5\2\uffff\1\7\1\uffff\7\6\1\2\1\3\6\4\44\uffff\1\1",
            "",
            "",
            "",
            "",
            "\2\12\17\uffff\5\12\2\uffff\1\12\1\uffff\2\12\1\11\1\12\1"+
            "\13\1\12\1\uffff\13\12\1\uffff\1\10",
            "",
            "",
            "\1\14\1\12",
            "\1\12\2\uffff\1\12\1\uffff\17\12\10\uffff\1\12\17\uffff\2"+
            "\12\11\uffff\1\15\1\12\13\uffff\3\12",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA53_eot = DFA.unpackEncodedString(DFA53_eotS);
    static final short[] DFA53_eof = DFA.unpackEncodedString(DFA53_eofS);
    static final char[] DFA53_min = DFA.unpackEncodedStringToUnsignedChars(DFA53_minS);
    static final char[] DFA53_max = DFA.unpackEncodedStringToUnsignedChars(DFA53_maxS);
    static final short[] DFA53_accept = DFA.unpackEncodedString(DFA53_acceptS);
    static final short[] DFA53_special = DFA.unpackEncodedString(DFA53_specialS);
    static final short[][] DFA53_transition;

    static {
        int numStates = DFA53_transitionS.length;
        DFA53_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA53_transition[i] = DFA.unpackEncodedString(DFA53_transitionS[i]);
        }
    }

    class DFA53 extends DFA {

        public DFA53(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 53;
            this.eot = DFA53_eot;
            this.eof = DFA53_eof;
            this.min = DFA53_min;
            this.max = DFA53_max;
            this.accept = DFA53_accept;
            this.special = DFA53_special;
            this.transition = DFA53_transition;
        }
        public String getDescription() {
            return "356:1: primary : ( parExpression | THIS | SUPER superMemberAccess | literal | IDENTIFIER | ( IDENTIFIER -> IDENTIFIER ) ( '[' ']' -> ^( ARRAYTYPE $primary) )+ ( '.' CLASS -> ^( DOTCLASS $primary) ) | IDENTIFIER arguments -> ^( METHODCALL IDENTIFIER arguments THIS ) | IDENTIFIER '.' CLASS -> ^( DOTCLASS IDENTIFIER ) | ( primitiveType -> primitiveType ) ( '[' ']' -> ^( ARRAYTYPE $primary) )* ( '.' CLASS -> ^( DOTCLASS $primary) ) | VOID '.' CLASS -> ^( DOTCLASS VOID ) );";
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
    public static final BitSet FOLLOW_fieldDeclaration_in_memberDeclaration342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifier_in_memberDeclaration369 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_VOID_in_memberDeclaration371 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_memberDeclaration373 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_voidMethodDeclaratorRest_in_memberDeclaration375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifier_in_memberDeclaration400 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_memberDeclaration410 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_formalParameters_in_memberDeclaration412 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_constructorBody_in_memberDeclaration414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_methodDeclaration455 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_formalParameters_in_methodDeclaration457 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_methodBody_in_methodDeclaration473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_methodDeclaration487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclarator_in_fieldDeclaration519 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004800L});
    public static final BitSet FOLLOW_78_in_fieldDeclaration538 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_variableDeclarator_in_fieldDeclaration542 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004800L});
    public static final BitSet FOLLOW_75_in_fieldDeclaration548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formalParameters_in_voidMethodDeclaratorRest593 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_methodBody_in_voidMethodDeclaratorRest609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_voidMethodDeclaratorRest623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_variableDeclarator656 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_EQ_in_variableDeclarator661 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_variableInitializer_in_variableDeclarator664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_variableDeclaratorId695 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_variableDeclaratorId700 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_variableDeclaratorId702 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_arrayInitializer_in_variableInitializer726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_variableInitializer736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_arrayInitializer763 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0023060L});
    public static final BitSet FOLLOW_variableInitializer_in_arrayInitializer766 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_78_in_arrayInitializer769 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_variableInitializer_in_arrayInitializer771 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_78_in_arrayInitializer776 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_arrayInitializer783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PUBLIC_in_modifier806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIVATE_in_modifier819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_typeName840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonPrimitiveType_in_type858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_type865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classType_in_nonPrimitiveType883 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_nonPrimitiveType888 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_nonPrimitiveType890 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_primitiveType_in_nonPrimitiveType899 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_nonPrimitiveType904 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_nonPrimitiveType906 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classType925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_primitiveType947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BYTE_in_primitiveType959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHORT_in_primitiveType971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_primitiveType983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_in_primitiveType995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_primitiveType1007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_primitiveType1019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_formalParameters1053 = new BitSet(new long[]{0x0000001FC2000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_formalParameterDecls_in_formalParameters1055 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_formalParameters1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_formalParameterDecls1111 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_formalParameterDecls1113 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_formalParameterDecls1116 = new BitSet(new long[]{0x0000001FC2000000L});
    public static final BitSet FOLLOW_formalParameterDecls_in_formalParameterDecls1118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_formalParameterDecls1155 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_formalParameterDecls1157 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_formalParameterDecls1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_methodBody1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_constructorBody1219 = new BitSet(new long[]{0x0023FFFFD2000000L,0x00000000E0023860L});
    public static final BitSet FOLLOW_explicitConstructorInvocation_in_constructorBody1221 = new BitSet(new long[]{0x0023FFFFD2000000L,0x00000000E0023860L});
    public static final BitSet FOLLOW_blockStatement_in_constructorBody1224 = new BitSet(new long[]{0x0023FFFFD2000000L,0x00000000E0023860L});
    public static final BitSet FOLLOW_77_in_constructorBody1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_explicitConstructorInvocation1246 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_arguments_in_explicitConstructorInvocation1254 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_explicitConstructorInvocation1256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_literal0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_block1353 = new BitSet(new long[]{0x0023FFFFD2000000L,0x00000000E0023860L});
    public static final BitSet FOLLOW_blockStatement_in_block1356 = new BitSet(new long[]{0x0023FFFFD2000000L,0x00000000E0023860L});
    public static final BitSet FOLLOW_77_in_block1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localVariableDeclarationStatement_in_blockStatement1383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_blockStatement1393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localVariableDeclaration_in_localVariableDeclarationStatement1417 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_localVariableDeclarationStatement1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_localVariableDeclaration1439 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_variableDeclarator_in_localVariableDeclaration1441 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_localVariableDeclaration1444 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_variableDeclarator_in_localVariableDeclaration1446 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_block_in_statement1482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_statement1500 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_parExpression_in_statement1502 = new BitSet(new long[]{0x0023FFFFD2000000L,0x00000000E0021860L});
    public static final BitSet FOLLOW_statement_in_statement1504 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_elseStmt_in_statement1506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_statement1537 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_statement1539 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021860L});
    public static final BitSet FOLLOW_forInit_in_statement1541 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_statement1544 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021860L});
    public static final BitSet FOLLOW_expression_in_statement1546 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_statement1549 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0061060L});
    public static final BitSet FOLLOW_forUpdate_in_statement1551 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_statement1554 = new BitSet(new long[]{0x0023FFFFD2000000L,0x00000000E0021860L});
    public static final BitSet FOLLOW_statement_in_statement1556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_statement1602 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_parExpression_in_statement1604 = new BitSet(new long[]{0x0023FFFFD2000000L,0x00000000E0021860L});
    public static final BitSet FOLLOW_statement_in_statement1606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_statement1630 = new BitSet(new long[]{0x0023FFFFD2000000L,0x00000000E0021860L});
    public static final BitSet FOLLOW_statement_in_statement1632 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_WHILE_in_statement1634 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_parExpression_in_statement1636 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_statement1638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_statement1662 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021860L});
    public static final BitSet FOLLOW_expression_in_statement1665 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_statement1668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_statement1679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementExpression_in_statement1691 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_statement1693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_elseStmt1725 = new BitSet(new long[]{0x0023FFFFD2000000L,0x00000000E0021860L});
    public static final BitSet FOLLOW_statement_in_elseStmt1728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localVariableDeclaration_in_forInit1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionList_in_forInit1763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionList_in_forUpdate1782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_parExpression1803 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_expression_in_parExpression1806 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_parExpression1808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionList1832 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_expressionList1835 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_expression_in_expressionList1837 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_expression_in_statementExpression1858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_constantExpression1881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orExpression_in_expression1903 = new BitSet(new long[]{0x0000000000000002L,0x0000000000F00010L});
    public static final BitSet FOLLOW_assignmentOperator_in_expression1909 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_expression_in_expression1911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_assignmentOperator2091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_assignmentOperator2104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_assignmentOperator2117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_assignmentOperator2129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_assignmentOperator2141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andExpression_in_orExpression2162 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_orExpression2166 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_andExpression_in_orExpression2169 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_equalityExpression_in_andExpression2191 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_andExpression2195 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_equalityExpression_in_andExpression2198 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_instanceOfExpression_in_equalityExpression2220 = new BitSet(new long[]{0x0000000000000002L,0x000000000C000000L});
    public static final BitSet FOLLOW_set_in_equalityExpression2224 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_instanceOfExpression_in_equalityExpression2233 = new BitSet(new long[]{0x0000000000000002L,0x000000000C000000L});
    public static final BitSet FOLLOW_relationalExpression_in_instanceOfExpression2255 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_INSTANCEOF_in_instanceOfExpression2258 = new BitSet(new long[]{0x0000001FC2000000L});
    public static final BitSet FOLLOW_type_in_instanceOfExpression2261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression2282 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_COMPAREOP_in_relationalExpression2286 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression2289 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression2311 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000060L});
    public static final BitSet FOLLOW_set_in_additiveExpression2315 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression2324 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000060L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression2346 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000180L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression2350 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression2365 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000180L});
    public static final BitSet FOLLOW_PLUS_in_unaryExpression2391 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression2393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unaryExpression2403 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression2405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_unaryExpression2415 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression2417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_unaryExpression2427 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression2429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression2439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_unaryExpressionNotPlusMinus2456 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus2458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_unaryExpressionNotPlusMinus2479 = new BitSet(new long[]{0x0000001FC2000000L});
    public static final BitSet FOLLOW_primitiveType_in_unaryExpressionNotPlusMinus2481 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_unaryExpressionNotPlusMinus2483 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus2485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_unaryExpressionNotPlusMinus2513 = new BitSet(new long[]{0x0000001FC2000000L});
    public static final BitSet FOLLOW_nonPrimitiveType_in_unaryExpressionNotPlusMinus2515 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_unaryExpressionNotPlusMinus2518 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpressionNotPlusMinus2520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_unaryExpressionNotPlusMinus2530 = new BitSet(new long[]{0x0000001FC2000000L});
    public static final BitSet FOLLOW_creator_in_unaryExpressionNotPlusMinus2532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_in_unaryExpressionNotPlusMinus2542 = new BitSet(new long[]{0x0000000000000002L,0x0000000160008000L});
    public static final BitSet FOLLOW_selector_in_unaryExpressionNotPlusMinus2545 = new BitSet(new long[]{0x0000000000000002L,0x0000000160008000L});
    public static final BitSet FOLLOW_set_in_unaryExpressionNotPlusMinus2549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parExpression_in_primary2609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_primary2619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUPER_in_primary2630 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_superMemberAccess_in_primary2633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primary2643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_primary2653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_primary2664 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_primary2672 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_primary2674 = new BitSet(new long[]{0x0000000000000000L,0x0000000100008000L});
    public static final BitSet FOLLOW_96_in_primary2688 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_CLASS_in_primary2690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_primary2709 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_arguments_in_primary2712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_primary2732 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_primary2734 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_CLASS_in_primary2736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_primary2755 = new BitSet(new long[]{0x0000000000000000L,0x0000000100008000L});
    public static final BitSet FOLLOW_79_in_primary2763 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_primary2765 = new BitSet(new long[]{0x0000000000000000L,0x0000000100008000L});
    public static final BitSet FOLLOW_96_in_primary2779 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_CLASS_in_primary2781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_primary2801 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_primary2803 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_CLASS_in_primary2805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_selector2836 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_selector2838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_selector2854 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_selector2856 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_arguments_in_selector2858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_selector2889 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_expression_in_selector2891 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_selector2893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_identifierSuffix2920 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_identifierSuffix2922 = new BitSet(new long[]{0x0000000000000000L,0x0000000100008000L});
    public static final BitSet FOLLOW_96_in_identifierSuffix2926 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_CLASS_in_identifierSuffix2928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arguments_in_identifierSuffix2943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_identifierSuffix2953 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_CLASS_in_identifierSuffix2955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createdName_in_creator2983 = new BitSet(new long[]{0x0000000000000000L,0x0000000000028000L});
    public static final BitSet FOLLOW_arrayCreatorRest_in_creator2986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classCreatorRest_in_creator2990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classType_in_createdName3010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_createdName3020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_arrayCreatorRest3043 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_arrayCreatorRest3044 = new BitSet(new long[]{0x0000000000000000L,0x0000000000009000L});
    public static final BitSet FOLLOW_79_in_arrayCreatorRest3047 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_arrayCreatorRest3049 = new BitSet(new long[]{0x0000000000000000L,0x0000000000009000L});
    public static final BitSet FOLLOW_arrayInitializer_in_arrayCreatorRest3053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_arrayCreatorRest3061 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_expression_in_arrayCreatorRest3063 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_arrayCreatorRest3065 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_arrayCreatorRest3068 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_expression_in_arrayCreatorRest3070 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_arrayCreatorRest3072 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_arguments_in_classCreatorRest3095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_superMemberAccess3117 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_superMemberAccess3119 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_arguments_in_superMemberAccess3121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_arguments3139 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0061060L});
    public static final BitSet FOLLOW_expressionList_in_arguments3142 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_arguments3145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_synpred2_Ja1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_synpred3_Ja2469 = new BitSet(new long[]{0x0000001FC2000000L});
    public static final BitSet FOLLOW_primitiveType_in_synpred3_Ja2471 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_synpred3_Ja2473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_synpred4_Ja2501 = new BitSet(new long[]{0x0000001FC2000000L});
    public static final BitSet FOLLOW_nonPrimitiveType_in_synpred4_Ja2503 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_synpred4_Ja2506 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_synpred4_Ja2508 = new BitSet(new long[]{0x0000000000000002L});

}