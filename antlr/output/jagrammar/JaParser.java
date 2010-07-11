// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g 2010-07-11 12:35:31

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
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:62:9: ( EXTENDS type )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==EXTENDS) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:62:10: EXTENDS type
                    {
                    EXTENDS6=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_classDeclaration171); if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_classDeclaration174);
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

            pushFollow(FOLLOW_classBody_in_classDeclaration195);
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:75:1: classModifier : PUBLIC ;
    public final JaParser.classModifier_return classModifier() throws RecognitionException {
        JaParser.classModifier_return retval = new JaParser.classModifier_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PUBLIC9=null;

        Object PUBLIC9_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:76:5: ( PUBLIC )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:77:9: PUBLIC
            {
            root_0 = (Object)adaptor.nil();

            PUBLIC9=(Token)match(input,PUBLIC,FOLLOW_PUBLIC_in_classModifier222); if (state.failed) return retval;
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:80:1: classBody : '{' ( classBodyDeclaration )* '}' ;
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
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:81:5: ( '{' ( classBodyDeclaration )* '}' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:81:9: '{' ( classBodyDeclaration )* '}'
            {
            root_0 = (Object)adaptor.nil();

            char_literal10=(Token)match(input,76,FOLLOW_76_in_classBody243); if (state.failed) return retval;
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:81:14: ( classBodyDeclaration )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==PUBLIC||LA3_0==PRIVATE||LA3_0==75) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:81:14: classBodyDeclaration
            	    {
            	    pushFollow(FOLLOW_classBodyDeclaration_in_classBody246);
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

            char_literal12=(Token)match(input,77,FOLLOW_77_in_classBody249); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:84:1: classBodyDeclaration : ( ';' | memberDeclaration );
    public final JaParser.classBodyDeclaration_return classBodyDeclaration() throws RecognitionException {
        JaParser.classBodyDeclaration_return retval = new JaParser.classBodyDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal13=null;
        JaParser.memberDeclaration_return memberDeclaration14 = null;


        Object char_literal13_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:85:5: ( ';' | memberDeclaration )
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
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:85:9: ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal13=(Token)match(input,75,FOLLOW_75_in_classBodyDeclaration269); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:86:9: memberDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_memberDeclaration_in_classBodyDeclaration280);
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:89:1: memberDeclaration : ( ( modifier type -> modifier type ) ( methodDeclaration[$modifier.pub, $type.t] -> ^( METHOD $memberDeclaration methodDeclaration ) | fieldDeclaration[(CommonTree)$modifier.tree, (CommonTree)$type.tree, $modifier.pub, $type.t] -> fieldDeclaration ) | modifier VOID IDENTIFIER voidMethodDeclaratorRest[$modifier.pub, VoidType.TYPE, $IDENTIFIER.text] -> ^( METHOD modifier VOID IDENTIFIER voidMethodDeclaratorRest ) | modifier ( IDENTIFIER formalParameters )=> IDENTIFIER formalParameters constructorBody -> ^( CONSTR modifier IDENTIFIER formalParameters constructorBody ) );
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
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:90:5: ( ( modifier type -> modifier type ) ( methodDeclaration[$modifier.pub, $type.t] -> ^( METHOD $memberDeclaration methodDeclaration ) | fieldDeclaration[(CommonTree)$modifier.tree, (CommonTree)$type.tree, $modifier.pub, $type.t] -> fieldDeclaration ) | modifier VOID IDENTIFIER voidMethodDeclaratorRest[$modifier.pub, VoidType.TYPE, $IDENTIFIER.text] -> ^( METHOD modifier VOID IDENTIFIER voidMethodDeclaratorRest ) | modifier ( IDENTIFIER formalParameters )=> IDENTIFIER formalParameters constructorBody -> ^( CONSTR modifier IDENTIFIER formalParameters constructorBody ) )
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

                    if ( (LA6_4==81) ) {
                        alt6=3;
                    }
                    else if ( (LA6_4==IDENTIFIER||LA6_4==79) ) {
                        alt6=1;
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
                case VOID:
                    {
                    alt6=2;
                    }
                    break;
                case IDENTIFIER:
                    {
                    int LA6_4 = input.LA(3);

                    if ( (LA6_4==81) ) {
                        alt6=3;
                    }
                    else if ( (LA6_4==IDENTIFIER||LA6_4==79) ) {
                        alt6=1;
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
                    {
                    alt6=1;
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
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:90:9: ( modifier type -> modifier type ) ( methodDeclaration[$modifier.pub, $type.t] -> ^( METHOD $memberDeclaration methodDeclaration ) | fieldDeclaration[(CommonTree)$modifier.tree, (CommonTree)$type.tree, $modifier.pub, $type.t] -> fieldDeclaration )
                    {
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:90:9: ( modifier type -> modifier type )
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:90:10: modifier type
                    {
                    pushFollow(FOLLOW_modifier_in_memberDeclaration304);
                    modifier15=modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_modifier.add(modifier15.getTree());
                    pushFollow(FOLLOW_type_in_memberDeclaration306);
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
                    // 90:24: -> modifier type
                    {
                        adaptor.addChild(root_0, stream_modifier.nextTree());
                        adaptor.addChild(root_0, stream_type.nextTree());

                    }

                    retval.tree = root_0;}
                    }

                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:91:7: ( methodDeclaration[$modifier.pub, $type.t] -> ^( METHOD $memberDeclaration methodDeclaration ) | fieldDeclaration[(CommonTree)$modifier.tree, (CommonTree)$type.tree, $modifier.pub, $type.t] -> fieldDeclaration )
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
                            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:91:9: methodDeclaration[$modifier.pub, $type.t]
                            {
                            pushFollow(FOLLOW_methodDeclaration_in_memberDeclaration323);
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
                            // 91:51: -> ^( METHOD $memberDeclaration methodDeclaration )
                            {
                                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:91:54: ^( METHOD $memberDeclaration methodDeclaration )
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
                            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:92:9: fieldDeclaration[(CommonTree)$modifier.tree, (CommonTree)$type.tree, $modifier.pub, $type.t]
                            {
                            pushFollow(FOLLOW_fieldDeclaration_in_memberDeclaration345);
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
                            // 92:102: -> fieldDeclaration
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
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:95:9: modifier VOID IDENTIFIER voidMethodDeclaratorRest[$modifier.pub, VoidType.TYPE, $IDENTIFIER.text]
                    {
                    pushFollow(FOLLOW_modifier_in_memberDeclaration376);
                    modifier19=modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_modifier.add(modifier19.getTree());
                    VOID20=(Token)match(input,VOID,FOLLOW_VOID_in_memberDeclaration378); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VOID.add(VOID20);

                    IDENTIFIER21=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_memberDeclaration380); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER21);

                    pushFollow(FOLLOW_voidMethodDeclaratorRest_in_memberDeclaration382);
                    voidMethodDeclaratorRest22=voidMethodDeclaratorRest((modifier19!=null?modifier19.pub:false), VoidType.TYPE, (IDENTIFIER21!=null?IDENTIFIER21.getText():null));

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_voidMethodDeclaratorRest.add(voidMethodDeclaratorRest22.getTree());


                    // AST REWRITE
                    // elements: voidMethodDeclaratorRest, modifier, VOID, IDENTIFIER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 96:6: -> ^( METHOD modifier VOID IDENTIFIER voidMethodDeclaratorRest )
                    {
                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:96:9: ^( METHOD modifier VOID IDENTIFIER voidMethodDeclaratorRest )
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
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:98:9: modifier ( IDENTIFIER formalParameters )=> IDENTIFIER formalParameters constructorBody
                    {
                    pushFollow(FOLLOW_modifier_in_memberDeclaration419);
                    modifier23=modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_modifier.add(modifier23.getTree());
                    IDENTIFIER24=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_memberDeclaration429); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER24);

                    pushFollow(FOLLOW_formalParameters_in_memberDeclaration431);
                    formalParameters25=formalParameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formalParameters.add(formalParameters25.getTree());
                    pushFollow(FOLLOW_constructorBody_in_memberDeclaration433);
                    constructorBody26=constructorBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_constructorBody.add(constructorBody26.getTree());
                    if ( state.backtracking==0 ) {
                       rt.addConstructor((modifier23!=null?modifier23.pub:false), (formalParameters25!=null?formalParameters25.args:null)); 
                    }


                    // AST REWRITE
                    // elements: modifier, constructorBody, IDENTIFIER, formalParameters
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 100:6: -> ^( CONSTR modifier IDENTIFIER formalParameters constructorBody )
                    {
                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:100:9: ^( CONSTR modifier IDENTIFIER formalParameters constructorBody )
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:103:1: methodDeclaration[boolean pub, Type t] : IDENTIFIER formalParameters methodBody ;
    public final JaParser.methodDeclaration_return methodDeclaration(boolean pub, Type t) throws RecognitionException {
        JaParser.methodDeclaration_return retval = new JaParser.methodDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENTIFIER27=null;
        JaParser.formalParameters_return formalParameters28 = null;

        JaParser.methodBody_return methodBody29 = null;


        Object IDENTIFIER27_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:104:5: ( IDENTIFIER formalParameters methodBody )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:104:9: IDENTIFIER formalParameters methodBody
            {
            root_0 = (Object)adaptor.nil();

            IDENTIFIER27=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_methodDeclaration480); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER27_tree = (Object)adaptor.create(IDENTIFIER27);
            adaptor.addChild(root_0, IDENTIFIER27_tree);
            }
            pushFollow(FOLLOW_formalParameters_in_methodDeclaration482);
            formalParameters28=formalParameters();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, formalParameters28.getTree());
            pushFollow(FOLLOW_methodBody_in_methodDeclaration484);
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:108:1: fieldDeclaration[CommonTree mod, CommonTree typ, boolean pub, Type t] : v1= variableDeclarator[$typ] ( ',' v2= variableDeclarator[$typ] )* ';' -> ( ^( FIELD variableDeclarator ) )+ ;
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
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleSubtreeStream stream_variableDeclarator=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclarator");
        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:109:5: (v1= variableDeclarator[$typ] ( ',' v2= variableDeclarator[$typ] )* ';' -> ( ^( FIELD variableDeclarator ) )+ )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:109:9: v1= variableDeclarator[$typ] ( ',' v2= variableDeclarator[$typ] )* ';'
            {
            pushFollow(FOLLOW_variableDeclarator_in_fieldDeclaration514);
            v1=variableDeclarator(typ);

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variableDeclarator.add(v1.getTree());
            if ( state.backtracking==0 ) {
               rt.addField((v1!=null?v1.varName:null), t, pub); 
            }
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:110:9: ( ',' v2= variableDeclarator[$typ] )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==78) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:110:10: ',' v2= variableDeclarator[$typ]
            	    {
            	    char_literal30=(Token)match(input,78,FOLLOW_78_in_fieldDeclaration534); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_78.add(char_literal30);

            	    pushFollow(FOLLOW_variableDeclarator_in_fieldDeclaration538);
            	    v2=variableDeclarator(typ);

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_variableDeclarator.add(v2.getTree());
            	    if ( state.backtracking==0 ) {
            	       rt.addField((v2!=null?v2.varName:null), t, pub); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            char_literal31=(Token)match(input,75,FOLLOW_75_in_fieldDeclaration555); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_75.add(char_literal31);



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
            // 112:9: -> ( ^( FIELD variableDeclarator ) )+
            {
                if ( !(stream_variableDeclarator.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_variableDeclarator.hasNext() ) {
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:112:12: ^( FIELD variableDeclarator )
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:115:1: voidMethodDeclaratorRest[boolean pub, Type t, String methodName] : formalParameters methodBody ;
    public final JaParser.voidMethodDeclaratorRest_return voidMethodDeclaratorRest(boolean pub, Type t, String methodName) throws RecognitionException {
        JaParser.voidMethodDeclaratorRest_return retval = new JaParser.voidMethodDeclaratorRest_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.formalParameters_return formalParameters32 = null;

        JaParser.methodBody_return methodBody33 = null;



        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:116:5: ( formalParameters methodBody )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:116:7: formalParameters methodBody
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_formalParameters_in_voidMethodDeclaratorRest598);
            formalParameters32=formalParameters();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, formalParameters32.getTree());
            pushFollow(FOLLOW_methodBody_in_voidMethodDeclaratorRest600);
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
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variableDeclarator"
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:119:1: variableDeclarator[CommonTree typ] returns [String varName] : variableDeclaratorId[$typ] ( '=' variableInitializer )? ;
    public final JaParser.variableDeclarator_return variableDeclarator(CommonTree typ) throws RecognitionException {
        JaParser.variableDeclarator_return retval = new JaParser.variableDeclarator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal35=null;
        JaParser.variableDeclaratorId_return variableDeclaratorId34 = null;

        JaParser.variableInitializer_return variableInitializer36 = null;


        Object char_literal35_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:120:5: ( variableDeclaratorId[$typ] ( '=' variableInitializer )? )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:120:9: variableDeclaratorId[$typ] ( '=' variableInitializer )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_variableDeclaratorId_in_variableDeclarator626);
            variableDeclaratorId34=variableDeclaratorId(typ);

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaratorId34.getTree());
            if ( state.backtracking==0 ) {
               retval.varName = (variableDeclaratorId34!=null?input.toString(variableDeclaratorId34.start,variableDeclaratorId34.stop):null); 
            }
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:120:79: ( '=' variableInitializer )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==EQ) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:120:80: '=' variableInitializer
                    {
                    char_literal35=(Token)match(input,EQ,FOLLOW_EQ_in_variableDeclarator632); if (state.failed) return retval;
                    pushFollow(FOLLOW_variableInitializer_in_variableDeclarator635);
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:123:1: variableDeclaratorId[CommonTree typ] returns [int arrayDim] : ( IDENTIFIER ->) (l+= '[' ']' -> ^( ARRAYTYPE $variableDeclaratorId) )* -> $variableDeclaratorId IDENTIFIER ;
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
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:124:5: ( ( IDENTIFIER ->) (l+= '[' ']' -> ^( ARRAYTYPE $variableDeclaratorId) )* -> $variableDeclaratorId IDENTIFIER )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:124:9: ( IDENTIFIER ->) (l+= '[' ']' -> ^( ARRAYTYPE $variableDeclaratorId) )*
            {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:124:9: ( IDENTIFIER ->)
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:124:10: IDENTIFIER
            {
            IDENTIFIER37=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variableDeclaratorId668); if (state.failed) return retval; 
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
            // 124:21: ->
            {
                adaptor.addChild(root_0, typ);

            }

            retval.tree = root_0;}
            }

            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:124:32: (l+= '[' ']' -> ^( ARRAYTYPE $variableDeclaratorId) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==79) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:124:34: l+= '[' ']'
            	    {
            	    l=(Token)match(input,79,FOLLOW_79_in_variableDeclaratorId679); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_79.add(l);

            	    if (list_l==null) list_l=new ArrayList();
            	    list_l.add(l);

            	    char_literal38=(Token)match(input,80,FOLLOW_80_in_variableDeclaratorId681); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_80.add(char_literal38);



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
            	    // 124:45: -> ^( ARRAYTYPE $variableDeclaratorId)
            	    {
            	        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:124:48: ^( ARRAYTYPE $variableDeclaratorId)
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
            // 126:6: -> $variableDeclaratorId IDENTIFIER
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:129:1: variableInitializer : ( arrayInitializer | expression );
    public final JaParser.variableInitializer_return variableInitializer() throws RecognitionException {
        JaParser.variableInitializer_return retval = new JaParser.variableInitializer_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.arrayInitializer_return arrayInitializer39 = null;

        JaParser.expression_return expression40 = null;



        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:130:5: ( arrayInitializer | expression )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==76) ) {
                alt10=1;
            }
            else if ( (LA10_0==IDENTIFIER||LA10_0==VOID||(LA10_0>=CHAR && LA10_0<=NULLLITERAL)||LA10_0==NEW||(LA10_0>=PLUS && LA10_0<=MINUS)||LA10_0==81||(LA10_0>=93 && LA10_0<=95)) ) {
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
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:130:9: arrayInitializer
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_arrayInitializer_in_variableInitializer734);
                    arrayInitializer39=arrayInitializer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayInitializer39.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:131:9: expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expression_in_variableInitializer744);
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:134:1: arrayInitializer : '{' ( variableInitializer ( ',' variableInitializer )* ( ',' )? )? '}' ;
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

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:135:5: ( '{' ( variableInitializer ( ',' variableInitializer )* ( ',' )? )? '}' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:135:9: '{' ( variableInitializer ( ',' variableInitializer )* ( ',' )? )? '}'
            {
            root_0 = (Object)adaptor.nil();

            char_literal41=(Token)match(input,76,FOLLOW_76_in_arrayInitializer771); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal41_tree = (Object)adaptor.create(char_literal41);
            adaptor.addChild(root_0, char_literal41_tree);
            }
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:135:13: ( variableInitializer ( ',' variableInitializer )* ( ',' )? )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==IDENTIFIER||LA13_0==VOID||(LA13_0>=CHAR && LA13_0<=NULLLITERAL)||LA13_0==NEW||(LA13_0>=PLUS && LA13_0<=MINUS)||LA13_0==76||LA13_0==81||(LA13_0>=93 && LA13_0<=95)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:135:14: variableInitializer ( ',' variableInitializer )* ( ',' )?
                    {
                    pushFollow(FOLLOW_variableInitializer_in_arrayInitializer774);
                    variableInitializer42=variableInitializer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableInitializer42.getTree());
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:135:34: ( ',' variableInitializer )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==78) ) {
                            int LA11_1 = input.LA(2);

                            if ( (LA11_1==IDENTIFIER||LA11_1==VOID||(LA11_1>=CHAR && LA11_1<=NULLLITERAL)||LA11_1==NEW||(LA11_1>=PLUS && LA11_1<=MINUS)||LA11_1==76||LA11_1==81||(LA11_1>=93 && LA11_1<=95)) ) {
                                alt11=1;
                            }


                        }


                        switch (alt11) {
                    	case 1 :
                    	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:135:35: ',' variableInitializer
                    	    {
                    	    char_literal43=(Token)match(input,78,FOLLOW_78_in_arrayInitializer777); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal43_tree = (Object)adaptor.create(char_literal43);
                    	    adaptor.addChild(root_0, char_literal43_tree);
                    	    }
                    	    pushFollow(FOLLOW_variableInitializer_in_arrayInitializer779);
                    	    variableInitializer44=variableInitializer();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableInitializer44.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:135:61: ( ',' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==78) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:135:62: ','
                            {
                            char_literal45=(Token)match(input,78,FOLLOW_78_in_arrayInitializer784); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal45_tree = (Object)adaptor.create(char_literal45);
                            adaptor.addChild(root_0, char_literal45_tree);
                            }

                            }
                            break;

                    }


                    }
                    break;

            }

            char_literal46=(Token)match(input,77,FOLLOW_77_in_arrayInitializer791); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal46_tree = (Object)adaptor.create(char_literal46);
            adaptor.addChild(root_0, char_literal46_tree);
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

        Token PUBLIC47=null;
        Token PRIVATE48=null;

        Object PUBLIC47_tree=null;
        Object PRIVATE48_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:139:5: ( PUBLIC | PRIVATE )
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
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:139:9: PUBLIC
                    {
                    root_0 = (Object)adaptor.nil();

                    PUBLIC47=(Token)match(input,PUBLIC,FOLLOW_PUBLIC_in_modifier814); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PUBLIC47_tree = (Object)adaptor.create(PUBLIC47);
                    adaptor.addChild(root_0, PUBLIC47_tree);
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

                    PRIVATE48=(Token)match(input,PRIVATE,FOLLOW_PRIVATE_in_modifier827); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PRIVATE48_tree = (Object)adaptor.create(PRIVATE48);
                    adaptor.addChild(root_0, PRIVATE48_tree);
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

        Token IDENTIFIER49=null;

        Object IDENTIFIER49_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:144:5: ( IDENTIFIER )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:144:9: IDENTIFIER
            {
            root_0 = (Object)adaptor.nil();

            IDENTIFIER49=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_typeName848); if (state.failed) return retval;
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

        JaParser.nonPrimitiveType_return nonPrimitiveType50 = null;

        JaParser.primitiveType_return primitiveType51 = null;



        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:148:5: ( nonPrimitiveType | primitiveType )
            int alt15=2;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:148:7: nonPrimitiveType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_nonPrimitiveType_in_type869);
                    nonPrimitiveType50=nonPrimitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nonPrimitiveType50.getTree());
                    if ( state.backtracking==0 ) {
                       retval.t = (nonPrimitiveType50!=null?nonPrimitiveType50.t:null); 
                    }

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:149:7: primitiveType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primitiveType_in_type879);
                    primitiveType51=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType51.getTree());
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
        return retval;
    }
    // $ANTLR end "type"

    public static class nonPrimitiveType_return extends ParserRuleReturnScope {
        public ComplexType t;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nonPrimitiveType"
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:152:1: nonPrimitiveType returns [ComplexType t] : ( ( classType -> classType ) (l+= '[' ']' -> ^( ARRAYTYPE $nonPrimitiveType) )* | ( primitiveType -> primitiveType ) (l+= '[' ']' -> ^( ARRAYTYPE $nonPrimitiveType) )+ );
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
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
        RewriteRuleSubtreeStream stream_primitiveType=new RewriteRuleSubtreeStream(adaptor,"rule primitiveType");
        RewriteRuleSubtreeStream stream_classType=new RewriteRuleSubtreeStream(adaptor,"rule classType");
        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:153:5: ( ( classType -> classType ) (l+= '[' ']' -> ^( ARRAYTYPE $nonPrimitiveType) )* | ( primitiveType -> primitiveType ) (l+= '[' ']' -> ^( ARRAYTYPE $nonPrimitiveType) )+ )
            int alt18=2;
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

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:153:7: ( classType -> classType ) (l+= '[' ']' -> ^( ARRAYTYPE $nonPrimitiveType) )*
                    {
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:153:7: ( classType -> classType )
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:153:8: classType
                    {
                    pushFollow(FOLLOW_classType_in_nonPrimitiveType906);
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
                    // 153:22: -> classType
                    {
                        adaptor.addChild(root_0, stream_classType.nextTree());

                    }

                    retval.tree = root_0;}
                    }

                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:153:40: (l+= '[' ']' -> ^( ARRAYTYPE $nonPrimitiveType) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==79) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:153:42: l+= '[' ']'
                    	    {
                    	    l=(Token)match(input,79,FOLLOW_79_in_nonPrimitiveType925); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_79.add(l);

                    	    if (list_l==null) list_l=new ArrayList();
                    	    list_l.add(l);

                    	    char_literal53=(Token)match(input,80,FOLLOW_80_in_nonPrimitiveType927); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_80.add(char_literal53);



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
                    	    // 153:53: -> ^( ARRAYTYPE $nonPrimitiveType)
                    	    {
                    	        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:153:56: ^( ARRAYTYPE $nonPrimitiveType)
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
                       if(list_l != null) retval.t = (ComplexType)createArrayType((classType52!=null?classType52.t:null),      list_l.size()); 
                    }

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:156:7: ( primitiveType -> primitiveType ) (l+= '[' ']' -> ^( ARRAYTYPE $nonPrimitiveType) )+
                    {
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:156:7: ( primitiveType -> primitiveType )
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:156:8: primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_nonPrimitiveType956);
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
                    // 156:22: -> primitiveType
                    {
                        adaptor.addChild(root_0, stream_primitiveType.nextTree());

                    }

                    retval.tree = root_0;}
                    }

                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:156:40: (l+= '[' ']' -> ^( ARRAYTYPE $nonPrimitiveType) )+
                    int cnt17=0;
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==79) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:156:42: l+= '[' ']'
                    	    {
                    	    l=(Token)match(input,79,FOLLOW_79_in_nonPrimitiveType967); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_79.add(l);

                    	    if (list_l==null) list_l=new ArrayList();
                    	    list_l.add(l);

                    	    char_literal55=(Token)match(input,80,FOLLOW_80_in_nonPrimitiveType969); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_80.add(char_literal55);



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
                    	    // 156:53: -> ^( ARRAYTYPE $nonPrimitiveType)
                    	    {
                    	        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:156:56: ^( ARRAYTYPE $nonPrimitiveType)
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
        return retval;
    }
    // $ANTLR end "nonPrimitiveType"

    public static class classType_return extends ParserRuleReturnScope {
        public ReferenceType t;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classType"
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:160:1: classType returns [ReferenceType t] : IDENTIFIER ;
    public final JaParser.classType_return classType() throws RecognitionException {
        JaParser.classType_return retval = new JaParser.classType_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENTIFIER56=null;

        Object IDENTIFIER56_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:161:5: ( IDENTIFIER )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:161:7: IDENTIFIER
            {
            root_0 = (Object)adaptor.nil();

            IDENTIFIER56=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classType1006); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER56_tree = (Object)adaptor.create(IDENTIFIER56);
            adaptor.addChild(root_0, IDENTIFIER56_tree);
            }
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
        return retval;
    }
    // $ANTLR end "classType"

    public static class primitiveType_return extends ParserRuleReturnScope {
        public BasicType bs;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primitiveType"
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:171:1: primitiveType returns [BasicType bs] : ( CHAR | BYTE | SHORT | INT | LONG | FLOAT | DOUBLE );
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

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:172:5: ( CHAR | BYTE | SHORT | INT | LONG | FLOAT | DOUBLE )
            int alt19=7;
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

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:172:9: CHAR
                    {
                    root_0 = (Object)adaptor.nil();

                    CHAR57=(Token)match(input,CHAR,FOLLOW_CHAR_in_primitiveType1031); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CHAR57_tree = (Object)adaptor.create(CHAR57);
                    adaptor.addChild(root_0, CHAR57_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.bs = BasicType.CHAR;   
                    }

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:173:9: BYTE
                    {
                    root_0 = (Object)adaptor.nil();

                    BYTE58=(Token)match(input,BYTE,FOLLOW_BYTE_in_primitiveType1045); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BYTE58_tree = (Object)adaptor.create(BYTE58);
                    adaptor.addChild(root_0, BYTE58_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.bs = BasicType.BYTE;   
                    }

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:174:9: SHORT
                    {
                    root_0 = (Object)adaptor.nil();

                    SHORT59=(Token)match(input,SHORT,FOLLOW_SHORT_in_primitiveType1059); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SHORT59_tree = (Object)adaptor.create(SHORT59);
                    adaptor.addChild(root_0, SHORT59_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.bs = BasicType.SHORT;  
                    }

                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:175:9: INT
                    {
                    root_0 = (Object)adaptor.nil();

                    INT60=(Token)match(input,INT,FOLLOW_INT_in_primitiveType1072); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT60_tree = (Object)adaptor.create(INT60);
                    adaptor.addChild(root_0, INT60_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.bs = BasicType.INT;    
                    }

                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:176:9: LONG
                    {
                    root_0 = (Object)adaptor.nil();

                    LONG61=(Token)match(input,LONG,FOLLOW_LONG_in_primitiveType1087); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LONG61_tree = (Object)adaptor.create(LONG61);
                    adaptor.addChild(root_0, LONG61_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.bs = BasicType.LONG;   
                    }

                    }
                    break;
                case 6 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:177:9: FLOAT
                    {
                    root_0 = (Object)adaptor.nil();

                    FLOAT62=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_primitiveType1101); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FLOAT62_tree = (Object)adaptor.create(FLOAT62);
                    adaptor.addChild(root_0, FLOAT62_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.bs = BasicType.FLOAT;  
                    }

                    }
                    break;
                case 7 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:178:9: DOUBLE
                    {
                    root_0 = (Object)adaptor.nil();

                    DOUBLE63=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_primitiveType1114); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOUBLE63_tree = (Object)adaptor.create(DOUBLE63);
                    adaptor.addChild(root_0, DOUBLE63_tree);
                    }
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
        return retval;
    }
    // $ANTLR end "primitiveType"

    public static class formalParameters_return extends ParserRuleReturnScope {
        public ArrayList<Type> args;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formalParameters"
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:181:1: formalParameters returns [ArrayList<Type> args] : '(' ( formalParameterDecls[args] )? ')' -> {$formalParameterDecls.tree != null}? ^( FPARMS ( formalParameterDecls )? ) ->;
    public final JaParser.formalParameters_return formalParameters() throws RecognitionException {
        JaParser.formalParameters_return retval = new JaParser.formalParameters_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal64=null;
        Token char_literal66=null;
        JaParser.formalParameterDecls_return formalParameterDecls65 = null;


        Object char_literal64_tree=null;
        Object char_literal66_tree=null;
        RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
        RewriteRuleSubtreeStream stream_formalParameterDecls=new RewriteRuleSubtreeStream(adaptor,"rule formalParameterDecls");

        	ArrayList<Type> args = new ArrayList<Type>();

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:185:5: ( '(' ( formalParameterDecls[args] )? ')' -> {$formalParameterDecls.tree != null}? ^( FPARMS ( formalParameterDecls )? ) ->)
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:185:9: '(' ( formalParameterDecls[args] )? ')'
            {
            char_literal64=(Token)match(input,81,FOLLOW_81_in_formalParameters1148); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_81.add(char_literal64);

            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:185:13: ( formalParameterDecls[args] )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==IDENTIFIER||(LA20_0>=CHAR && LA20_0<=DOUBLE)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:185:13: formalParameterDecls[args]
                    {
                    pushFollow(FOLLOW_formalParameterDecls_in_formalParameters1150);
                    formalParameterDecls65=formalParameterDecls(args);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formalParameterDecls.add(formalParameterDecls65.getTree());

                    }
                    break;

            }

            char_literal66=(Token)match(input,82,FOLLOW_82_in_formalParameters1154); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_82.add(char_literal66);

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
            // 185:61: -> {$formalParameterDecls.tree != null}? ^( FPARMS ( formalParameterDecls )? )
            if ((formalParameterDecls65!=null?((Object)formalParameterDecls65.tree):null) != null) {
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:185:102: ^( FPARMS ( formalParameterDecls )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FPARMS, "FPARMS"), root_1);

                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:185:111: ( formalParameterDecls )?
                if ( stream_formalParameterDecls.hasNext() ) {
                    adaptor.addChild(root_1, stream_formalParameterDecls.nextTree());

                }
                stream_formalParameterDecls.reset();

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 186:16: ->
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:189:1: formalParameterDecls[ArrayList<Type> args] : ( type variableDeclaratorId[(CommonTree)$type.tree] ( ',' formalParameterDecls[args] )? -> ^( FPARM variableDeclaratorId ) ( formalParameterDecls )? | type '...' variableDeclaratorId[(CommonTree)$type.tree] -> ^( FMULTPARM variableDeclaratorId ) );
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
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleSubtreeStream stream_variableDeclaratorId=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaratorId");
        RewriteRuleSubtreeStream stream_formalParameterDecls=new RewriteRuleSubtreeStream(adaptor,"rule formalParameterDecls");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:190:5: ( type variableDeclaratorId[(CommonTree)$type.tree] ( ',' formalParameterDecls[args] )? -> ^( FPARM variableDeclaratorId ) ( formalParameterDecls )? | type '...' variableDeclaratorId[(CommonTree)$type.tree] -> ^( FMULTPARM variableDeclaratorId ) )
            int alt22=2;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:190:7: type variableDeclaratorId[(CommonTree)$type.tree] ( ',' formalParameterDecls[args] )?
                    {
                    pushFollow(FOLLOW_type_in_formalParameterDecls1207);
                    type67=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type67.getTree());
                    pushFollow(FOLLOW_variableDeclaratorId_in_formalParameterDecls1209);
                    variableDeclaratorId68=variableDeclaratorId((CommonTree)(type67!=null?((Object)type67.tree):null));

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_variableDeclaratorId.add(variableDeclaratorId68.getTree());
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:190:57: ( ',' formalParameterDecls[args] )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==78) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:190:58: ',' formalParameterDecls[args]
                            {
                            char_literal69=(Token)match(input,78,FOLLOW_78_in_formalParameterDecls1213); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_78.add(char_literal69);

                            pushFollow(FOLLOW_formalParameterDecls_in_formalParameterDecls1215);
                            formalParameterDecls70=formalParameterDecls(args);

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_formalParameterDecls.add(formalParameterDecls70.getTree());

                            }
                            break;

                    }

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
                    // 192:6: -> ^( FPARM variableDeclaratorId ) ( formalParameterDecls )?
                    {
                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:192:9: ^( FPARM variableDeclaratorId )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FPARM, "FPARM"), root_1);

                        adaptor.addChild(root_1, stream_variableDeclaratorId.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }
                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:192:39: ( formalParameterDecls )?
                        if ( stream_formalParameterDecls.hasNext() ) {
                            adaptor.addChild(root_0, stream_formalParameterDecls.nextTree());

                        }
                        stream_formalParameterDecls.reset();

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:194:8: type '...' variableDeclaratorId[(CommonTree)$type.tree]
                    {
                    pushFollow(FOLLOW_type_in_formalParameterDecls1257);
                    type71=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type71.getTree());
                    string_literal72=(Token)match(input,83,FOLLOW_83_in_formalParameterDecls1259); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_83.add(string_literal72);

                    pushFollow(FOLLOW_variableDeclaratorId_in_formalParameterDecls1261);
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
                    // 194:64: -> ^( FMULTPARM variableDeclaratorId )
                    {
                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:194:67: ^( FMULTPARM variableDeclaratorId )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FMULTPARM, "FMULTPARM"), root_1);

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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:197:1: methodBody : block -> ^( MBODY ( block )? ) ;
    public final JaParser.methodBody_return methodBody() throws RecognitionException {
        JaParser.methodBody_return retval = new JaParser.methodBody_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.block_return block74 = null;


        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:198:5: ( block -> ^( MBODY ( block )? ) )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:198:9: block
            {
            pushFollow(FOLLOW_block_in_methodBody1293);
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
            // 198:15: -> ^( MBODY ( block )? )
            {
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:198:18: ^( MBODY ( block )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MBODY, "MBODY"), root_1);

                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:198:26: ( block )?
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:201:1: constructorBody : '{' ( explicitConstructorInvocation )? ( blockStatement )* '}' ;
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

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:202:5: ( '{' ( explicitConstructorInvocation )? ( blockStatement )* '}' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:202:9: '{' ( explicitConstructorInvocation )? ( blockStatement )* '}'
            {
            root_0 = (Object)adaptor.nil();

            char_literal75=(Token)match(input,76,FOLLOW_76_in_constructorBody1321); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal75_tree = (Object)adaptor.create(char_literal75);
            adaptor.addChild(root_0, char_literal75_tree);
            }
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:202:13: ( explicitConstructorInvocation )?
            int alt23=2;
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
            switch (alt23) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:202:13: explicitConstructorInvocation
                    {
                    pushFollow(FOLLOW_explicitConstructorInvocation_in_constructorBody1323);
                    explicitConstructorInvocation76=explicitConstructorInvocation();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, explicitConstructorInvocation76.getTree());

                    }
                    break;

            }

            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:202:44: ( blockStatement )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==IDENTIFIER||LA24_0==VOID||(LA24_0>=CHAR && LA24_0<=RETURN)||LA24_0==NEW||(LA24_0>=PLUS && LA24_0<=MINUS)||(LA24_0>=75 && LA24_0<=76)||LA24_0==81||(LA24_0>=93 && LA24_0<=95)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:202:44: blockStatement
            	    {
            	    pushFollow(FOLLOW_blockStatement_in_constructorBody1326);
            	    blockStatement77=blockStatement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, blockStatement77.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            char_literal78=(Token)match(input,77,FOLLOW_77_in_constructorBody1329); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal78_tree = (Object)adaptor.create(char_literal78);
            adaptor.addChild(root_0, char_literal78_tree);
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:205:1: explicitConstructorInvocation : ( THIS | SUPER ) arguments ';' ;
    public final JaParser.explicitConstructorInvocation_return explicitConstructorInvocation() throws RecognitionException {
        JaParser.explicitConstructorInvocation_return retval = new JaParser.explicitConstructorInvocation_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set79=null;
        Token char_literal81=null;
        JaParser.arguments_return arguments80 = null;


        Object set79_tree=null;
        Object char_literal81_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:206:5: ( ( THIS | SUPER ) arguments ';' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:206:9: ( THIS | SUPER ) arguments ';'
            {
            root_0 = (Object)adaptor.nil();

            set79=(Token)input.LT(1);
            if ( (input.LA(1)>=THIS && input.LA(1)<=SUPER) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set79));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            pushFollow(FOLLOW_arguments_in_explicitConstructorInvocation1356);
            arguments80=arguments();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments80.getTree());
            char_literal81=(Token)match(input,75,FOLLOW_75_in_explicitConstructorInvocation1358); if (state.failed) return retval;
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
    // $ANTLR end "explicitConstructorInvocation"

    public static class literal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "literal"
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:210:1: literal : ( INTLITERAL | FloatingPointLiteral | CHARLITERAL | STRINGLITERAL | BOOLEANLITERAL | NULLLITERAL );
    public final JaParser.literal_return literal() throws RecognitionException {
        JaParser.literal_return retval = new JaParser.literal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set82=null;

        Object set82_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:211:5: ( INTLITERAL | FloatingPointLiteral | CHARLITERAL | STRINGLITERAL | BOOLEANLITERAL | NULLLITERAL )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:
            {
            root_0 = (Object)adaptor.nil();

            set82=(Token)input.LT(1);
            if ( (input.LA(1)>=INTLITERAL && input.LA(1)<=NULLLITERAL) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set82));
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

        Token char_literal83=null;
        Token char_literal85=null;
        JaParser.blockStatement_return blockStatement84 = null;


        Object char_literal83_tree=null;
        Object char_literal85_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:222:5: ( '{' ( blockStatement )* '}' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:222:9: '{' ( blockStatement )* '}'
            {
            root_0 = (Object)adaptor.nil();

            char_literal83=(Token)match(input,76,FOLLOW_76_in_block1454); if (state.failed) return retval;
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:222:14: ( blockStatement )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==IDENTIFIER||LA25_0==VOID||(LA25_0>=CHAR && LA25_0<=RETURN)||LA25_0==NEW||(LA25_0>=PLUS && LA25_0<=MINUS)||(LA25_0>=75 && LA25_0<=76)||LA25_0==81||(LA25_0>=93 && LA25_0<=95)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:222:14: blockStatement
            	    {
            	    pushFollow(FOLLOW_blockStatement_in_block1457);
            	    blockStatement84=blockStatement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, blockStatement84.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            char_literal85=(Token)match(input,77,FOLLOW_77_in_block1460); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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

        JaParser.localVariableDeclarationStatement_return localVariableDeclarationStatement86 = null;

        JaParser.statement_return statement87 = null;



        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:226:5: ( localVariableDeclarationStatement | statement )
            int alt26=2;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:226:9: localVariableDeclarationStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_localVariableDeclarationStatement_in_blockStatement1484);
                    localVariableDeclarationStatement86=localVariableDeclarationStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, localVariableDeclarationStatement86.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:227:9: statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_statement_in_blockStatement1494);
                    statement87=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement87.getTree());

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

        Token char_literal89=null;
        JaParser.localVariableDeclaration_return localVariableDeclaration88 = null;


        Object char_literal89_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:231:5: ( localVariableDeclaration ';' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:231:7: localVariableDeclaration ';'
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_localVariableDeclaration_in_localVariableDeclarationStatement1515);
            localVariableDeclaration88=localVariableDeclaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, localVariableDeclaration88.getTree());
            char_literal89=(Token)match(input,75,FOLLOW_75_in_localVariableDeclarationStatement1517); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:234:1: localVariableDeclaration : type variableDeclarator[(CommonTree)$type.tree] ( ',' variableDeclarator[(CommonTree)$type.tree] )* -> ( ^( VARDECL variableDeclarator ) )+ ;
    public final JaParser.localVariableDeclaration_return localVariableDeclaration() throws RecognitionException {
        JaParser.localVariableDeclaration_return retval = new JaParser.localVariableDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal92=null;
        JaParser.type_return type90 = null;

        JaParser.variableDeclarator_return variableDeclarator91 = null;

        JaParser.variableDeclarator_return variableDeclarator93 = null;


        Object char_literal92_tree=null;
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleSubtreeStream stream_variableDeclarator=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclarator");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:235:5: ( type variableDeclarator[(CommonTree)$type.tree] ( ',' variableDeclarator[(CommonTree)$type.tree] )* -> ( ^( VARDECL variableDeclarator ) )+ )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:235:7: type variableDeclarator[(CommonTree)$type.tree] ( ',' variableDeclarator[(CommonTree)$type.tree] )*
            {
            pushFollow(FOLLOW_type_in_localVariableDeclaration1535);
            type90=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type90.getTree());
            pushFollow(FOLLOW_variableDeclarator_in_localVariableDeclaration1537);
            variableDeclarator91=variableDeclarator((CommonTree)(type90!=null?((Object)type90.tree):null));

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variableDeclarator.add(variableDeclarator91.getTree());
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:235:55: ( ',' variableDeclarator[(CommonTree)$type.tree] )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==78) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:235:56: ',' variableDeclarator[(CommonTree)$type.tree]
            	    {
            	    char_literal92=(Token)match(input,78,FOLLOW_78_in_localVariableDeclaration1541); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_78.add(char_literal92);

            	    pushFollow(FOLLOW_variableDeclarator_in_localVariableDeclaration1543);
            	    variableDeclarator93=variableDeclarator((CommonTree)(type90!=null?((Object)type90.tree):null));

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_variableDeclarator.add(variableDeclarator93.getTree());

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
            // 236:6: -> ( ^( VARDECL variableDeclarator ) )+
            {
                if ( !(stream_variableDeclarator.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_variableDeclarator.hasNext() ) {
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:236:9: ^( VARDECL variableDeclarator )
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:240:1: statement : ( block -> ^( BLOCK block ) | IF parExpression statement elseStmt -> ^( IF ^( CONDITION parExpression ) ^( THEN statement ) ( elseStmt )? ) | FOR '(' ( forInit )? ';' ( expression )? ';' ( forUpdate )? ')' statement -> ^( FOR ( ^( INIT forInit ) )? ( ^( CONDITION expression ) )? ( ^( UPDATE forUpdate ) )? statement ) | WHILE parExpression statement -> ^( WHILE ^( CONDITION parExpression ) statement ) | DO statement WHILE parExpression ';' -> ^( DOWHILE ^( CONDITION parExpression ) statement ) | RETURN ( expression )? ';' | ';' | statementExpression ';' -> ^( STMT statementExpression ) );
    public final JaParser.statement_return statement() throws RecognitionException {
        JaParser.statement_return retval = new JaParser.statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IF95=null;
        Token FOR99=null;
        Token char_literal100=null;
        Token char_literal102=null;
        Token char_literal104=null;
        Token char_literal106=null;
        Token WHILE108=null;
        Token DO111=null;
        Token WHILE113=null;
        Token char_literal115=null;
        Token RETURN116=null;
        Token char_literal118=null;
        Token char_literal119=null;
        Token char_literal121=null;
        JaParser.block_return block94 = null;

        JaParser.parExpression_return parExpression96 = null;

        JaParser.statement_return statement97 = null;

        JaParser.elseStmt_return elseStmt98 = null;

        JaParser.forInit_return forInit101 = null;

        JaParser.expression_return expression103 = null;

        JaParser.forUpdate_return forUpdate105 = null;

        JaParser.statement_return statement107 = null;

        JaParser.parExpression_return parExpression109 = null;

        JaParser.statement_return statement110 = null;

        JaParser.statement_return statement112 = null;

        JaParser.parExpression_return parExpression114 = null;

        JaParser.expression_return expression117 = null;

        JaParser.statementExpression_return statementExpression120 = null;


        Object IF95_tree=null;
        Object FOR99_tree=null;
        Object char_literal100_tree=null;
        Object char_literal102_tree=null;
        Object char_literal104_tree=null;
        Object char_literal106_tree=null;
        Object WHILE108_tree=null;
        Object DO111_tree=null;
        Object WHILE113_tree=null;
        Object char_literal115_tree=null;
        Object RETURN116_tree=null;
        Object char_literal118_tree=null;
        Object char_literal119_tree=null;
        Object char_literal121_tree=null;
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
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:241:5: ( block -> ^( BLOCK block ) | IF parExpression statement elseStmt -> ^( IF ^( CONDITION parExpression ) ^( THEN statement ) ( elseStmt )? ) | FOR '(' ( forInit )? ';' ( expression )? ';' ( forUpdate )? ')' statement -> ^( FOR ( ^( INIT forInit ) )? ( ^( CONDITION expression ) )? ( ^( UPDATE forUpdate ) )? statement ) | WHILE parExpression statement -> ^( WHILE ^( CONDITION parExpression ) statement ) | DO statement WHILE parExpression ';' -> ^( DOWHILE ^( CONDITION parExpression ) statement ) | RETURN ( expression )? ';' | ';' | statementExpression ';' -> ^( STMT statementExpression ) )
            int alt32=8;
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

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:241:9: block
                    {
                    pushFollow(FOLLOW_block_in_statement1584);
                    block94=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block94.getTree());


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
                    // 241:15: -> ^( BLOCK block )
                    {
                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:241:18: ^( BLOCK block )
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
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:242:9: IF parExpression statement elseStmt
                    {
                    IF95=(Token)match(input,IF,FOLLOW_IF_in_statement1602); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF95);

                    pushFollow(FOLLOW_parExpression_in_statement1604);
                    parExpression96=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression96.getTree());
                    pushFollow(FOLLOW_statement_in_statement1606);
                    statement97=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement97.getTree());
                    pushFollow(FOLLOW_elseStmt_in_statement1608);
                    elseStmt98=elseStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_elseStmt.add(elseStmt98.getTree());


                    // AST REWRITE
                    // elements: statement, parExpression, IF, elseStmt
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 242:45: -> ^( IF ^( CONDITION parExpression ) ^( THEN statement ) ( elseStmt )? )
                    {
                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:242:48: ^( IF ^( CONDITION parExpression ) ^( THEN statement ) ( elseStmt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:242:53: ^( CONDITION parExpression )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONDITION, "CONDITION"), root_2);

                        adaptor.addChild(root_2, stream_parExpression.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:242:80: ^( THEN statement )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(THEN, "THEN"), root_2);

                        adaptor.addChild(root_2, stream_statement.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:242:98: ( elseStmt )?
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
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:243:9: FOR '(' ( forInit )? ';' ( expression )? ';' ( forUpdate )? ')' statement
                    {
                    FOR99=(Token)match(input,FOR,FOLLOW_FOR_in_statement1639); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOR.add(FOR99);

                    char_literal100=(Token)match(input,81,FOLLOW_81_in_statement1641); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_81.add(char_literal100);

                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:243:17: ( forInit )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==IDENTIFIER||LA28_0==VOID||(LA28_0>=CHAR && LA28_0<=NULLLITERAL)||LA28_0==NEW||(LA28_0>=PLUS && LA28_0<=MINUS)||LA28_0==81||(LA28_0>=93 && LA28_0<=95)) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:243:17: forInit
                            {
                            pushFollow(FOLLOW_forInit_in_statement1643);
                            forInit101=forInit();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_forInit.add(forInit101.getTree());

                            }
                            break;

                    }

                    char_literal102=(Token)match(input,75,FOLLOW_75_in_statement1646); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_75.add(char_literal102);

                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:243:30: ( expression )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==IDENTIFIER||LA29_0==VOID||(LA29_0>=CHAR && LA29_0<=NULLLITERAL)||LA29_0==NEW||(LA29_0>=PLUS && LA29_0<=MINUS)||LA29_0==81||(LA29_0>=93 && LA29_0<=95)) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:243:30: expression
                            {
                            pushFollow(FOLLOW_expression_in_statement1648);
                            expression103=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(expression103.getTree());

                            }
                            break;

                    }

                    char_literal104=(Token)match(input,75,FOLLOW_75_in_statement1651); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_75.add(char_literal104);

                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:243:46: ( forUpdate )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==IDENTIFIER||LA30_0==VOID||(LA30_0>=CHAR && LA30_0<=NULLLITERAL)||LA30_0==NEW||(LA30_0>=PLUS && LA30_0<=MINUS)||LA30_0==81||(LA30_0>=93 && LA30_0<=95)) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:243:46: forUpdate
                            {
                            pushFollow(FOLLOW_forUpdate_in_statement1653);
                            forUpdate105=forUpdate();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_forUpdate.add(forUpdate105.getTree());

                            }
                            break;

                    }

                    char_literal106=(Token)match(input,82,FOLLOW_82_in_statement1656); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_82.add(char_literal106);

                    pushFollow(FOLLOW_statement_in_statement1658);
                    statement107=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement107.getTree());


                    // AST REWRITE
                    // elements: forUpdate, FOR, statement, expression, forInit
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 244:6: -> ^( FOR ( ^( INIT forInit ) )? ( ^( CONDITION expression ) )? ( ^( UPDATE forUpdate ) )? statement )
                    {
                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:244:9: ^( FOR ( ^( INIT forInit ) )? ( ^( CONDITION expression ) )? ( ^( UPDATE forUpdate ) )? statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_FOR.nextNode(), root_1);

                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:244:15: ( ^( INIT forInit ) )?
                        if ( stream_forInit.hasNext() ) {
                            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:244:15: ^( INIT forInit )
                            {
                            Object root_2 = (Object)adaptor.nil();
                            root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(INIT, "INIT"), root_2);

                            adaptor.addChild(root_2, stream_forInit.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_forInit.reset();
                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:244:32: ( ^( CONDITION expression ) )?
                        if ( stream_expression.hasNext() ) {
                            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:244:32: ^( CONDITION expression )
                            {
                            Object root_2 = (Object)adaptor.nil();
                            root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONDITION, "CONDITION"), root_2);

                            adaptor.addChild(root_2, stream_expression.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_expression.reset();
                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:244:57: ( ^( UPDATE forUpdate ) )?
                        if ( stream_forUpdate.hasNext() ) {
                            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:244:57: ^( UPDATE forUpdate )
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
                    WHILE108=(Token)match(input,WHILE,FOLLOW_WHILE_in_statement1710); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE.add(WHILE108);

                    pushFollow(FOLLOW_parExpression_in_statement1712);
                    parExpression109=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression109.getTree());
                    pushFollow(FOLLOW_statement_in_statement1714);
                    statement110=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement110.getTree());


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
                    DO111=(Token)match(input,DO,FOLLOW_DO_in_statement1738); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DO.add(DO111);

                    pushFollow(FOLLOW_statement_in_statement1740);
                    statement112=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement112.getTree());
                    WHILE113=(Token)match(input,WHILE,FOLLOW_WHILE_in_statement1742); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE.add(WHILE113);

                    pushFollow(FOLLOW_parExpression_in_statement1744);
                    parExpression114=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression114.getTree());
                    char_literal115=(Token)match(input,75,FOLLOW_75_in_statement1746); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_75.add(char_literal115);



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

                    RETURN116=(Token)match(input,RETURN,FOLLOW_RETURN_in_statement1770); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RETURN116_tree = (Object)adaptor.create(RETURN116);
                    root_0 = (Object)adaptor.becomeRoot(RETURN116_tree, root_0);
                    }
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:248:17: ( expression )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==IDENTIFIER||LA31_0==VOID||(LA31_0>=CHAR && LA31_0<=NULLLITERAL)||LA31_0==NEW||(LA31_0>=PLUS && LA31_0<=MINUS)||LA31_0==81||(LA31_0>=93 && LA31_0<=95)) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:248:17: expression
                            {
                            pushFollow(FOLLOW_expression_in_statement1773);
                            expression117=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression117.getTree());

                            }
                            break;

                    }

                    char_literal118=(Token)match(input,75,FOLLOW_75_in_statement1776); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:249:9: ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal119=(Token)match(input,75,FOLLOW_75_in_statement1787); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:250:9: statementExpression ';'
                    {
                    pushFollow(FOLLOW_statementExpression_in_statement1799);
                    statementExpression120=statementExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementExpression.add(statementExpression120.getTree());
                    char_literal121=(Token)match(input,75,FOLLOW_75_in_statement1801); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_75.add(char_literal121);



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

        Token ELSE122=null;
        JaParser.statement_return statement123 = null;


        Object ELSE122_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:254:5: ( ( ELSE )=> ELSE statement | )
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
            else if ( (LA33_0==IDENTIFIER||LA33_0==VOID||(LA33_0>=CHAR && LA33_0<=RETURN)||LA33_0==NEW||(LA33_0>=PLUS && LA33_0<=MINUS)||(LA33_0>=75 && LA33_0<=77)||LA33_0==81||(LA33_0>=93 && LA33_0<=95)) ) {
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
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:254:7: ( ELSE )=> ELSE statement
                    {
                    root_0 = (Object)adaptor.nil();

                    ELSE122=(Token)match(input,ELSE,FOLLOW_ELSE_in_elseStmt1836); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ELSE122_tree = (Object)adaptor.create(ELSE122);
                    root_0 = (Object)adaptor.becomeRoot(ELSE122_tree, root_0);
                    }
                    pushFollow(FOLLOW_statement_in_elseStmt1839);
                    statement123=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement123.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:256:5: 
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:258:1: forInit : ( localVariableDeclaration | expressionList );
    public final JaParser.forInit_return forInit() throws RecognitionException {
        JaParser.forInit_return retval = new JaParser.forInit_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.localVariableDeclaration_return localVariableDeclaration124 = null;

        JaParser.expressionList_return expressionList125 = null;



        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:259:5: ( localVariableDeclaration | expressionList )
            int alt34=2;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:259:9: localVariableDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_localVariableDeclaration_in_forInit1864);
                    localVariableDeclaration124=localVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, localVariableDeclaration124.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:260:9: expressionList
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expressionList_in_forInit1874);
                    expressionList125=expressionList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList125.getTree());

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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:263:1: forUpdate : expressionList ;
    public final JaParser.forUpdate_return forUpdate() throws RecognitionException {
        JaParser.forUpdate_return retval = new JaParser.forUpdate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.expressionList_return expressionList126 = null;



        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:264:5: ( expressionList )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:264:9: expressionList
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expressionList_in_forUpdate1893);
            expressionList126=expressionList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList126.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:267:1: parExpression : '(' expression ')' ;
    public final JaParser.parExpression_return parExpression() throws RecognitionException {
        JaParser.parExpression_return retval = new JaParser.parExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal127=null;
        Token char_literal129=null;
        JaParser.expression_return expression128 = null;


        Object char_literal127_tree=null;
        Object char_literal129_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:268:5: ( '(' expression ')' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:268:9: '(' expression ')'
            {
            root_0 = (Object)adaptor.nil();

            char_literal127=(Token)match(input,81,FOLLOW_81_in_parExpression1912); if (state.failed) return retval;
            pushFollow(FOLLOW_expression_in_parExpression1915);
            expression128=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression128.getTree());
            char_literal129=(Token)match(input,82,FOLLOW_82_in_parExpression1917); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:271:1: expressionList : expression ( ',' expression )* ;
    public final JaParser.expressionList_return expressionList() throws RecognitionException {
        JaParser.expressionList_return retval = new JaParser.expressionList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal131=null;
        JaParser.expression_return expression130 = null;

        JaParser.expression_return expression132 = null;


        Object char_literal131_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:272:5: ( expression ( ',' expression )* )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:272:9: expression ( ',' expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expression_in_expressionList1941);
            expression130=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression130.getTree());
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:272:20: ( ',' expression )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==78) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:272:21: ',' expression
            	    {
            	    char_literal131=(Token)match(input,78,FOLLOW_78_in_expressionList1944); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal131_tree = (Object)adaptor.create(char_literal131);
            	    adaptor.addChild(root_0, char_literal131_tree);
            	    }
            	    pushFollow(FOLLOW_expression_in_expressionList1946);
            	    expression132=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression132.getTree());

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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:275:1: statementExpression : expression ;
    public final JaParser.statementExpression_return statementExpression() throws RecognitionException {
        JaParser.statementExpression_return retval = new JaParser.statementExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.expression_return expression133 = null;



        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:276:5: ( expression )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:276:9: expression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expression_in_statementExpression1967);
            expression133=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression133.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:279:1: constantExpression : expression ;
    public final JaParser.constantExpression_return constantExpression() throws RecognitionException {
        JaParser.constantExpression_return retval = new JaParser.constantExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.expression_return expression134 = null;



        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:280:5: ( expression )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:280:9: expression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expression_in_constantExpression1990);
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
        return retval;
    }
    // $ANTLR end "constantExpression"

    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:283:1: expression : orExpression (ap= assignmentOperator expression )? -> {$ap.c == '='}? ^( '=' orExpression expression ) -> {$ap.c == '+'}? ^( EQ orExpression ^( PLUS orExpression expression ) ) -> {$ap.c == '-'}? ^( EQ orExpression ^( MINUS orExpression expression ) ) -> {$ap.c == '*'}? ^( EQ orExpression ^( STAR orExpression expression ) ) -> {$ap.c == '/'}? ^( EQ orExpression ^( SLASH orExpression expression ) ) -> orExpression ;
    public final JaParser.expression_return expression() throws RecognitionException {
        JaParser.expression_return retval = new JaParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.assignmentOperator_return ap = null;

        JaParser.orExpression_return orExpression135 = null;

        JaParser.expression_return expression136 = null;


        RewriteRuleSubtreeStream stream_assignmentOperator=new RewriteRuleSubtreeStream(adaptor,"rule assignmentOperator");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_orExpression=new RewriteRuleSubtreeStream(adaptor,"rule orExpression");
        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:284:5: ( orExpression (ap= assignmentOperator expression )? -> {$ap.c == '='}? ^( '=' orExpression expression ) -> {$ap.c == '+'}? ^( EQ orExpression ^( PLUS orExpression expression ) ) -> {$ap.c == '-'}? ^( EQ orExpression ^( MINUS orExpression expression ) ) -> {$ap.c == '*'}? ^( EQ orExpression ^( STAR orExpression expression ) ) -> {$ap.c == '/'}? ^( EQ orExpression ^( SLASH orExpression expression ) ) -> orExpression )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:284:8: orExpression (ap= assignmentOperator expression )?
            {
            pushFollow(FOLLOW_orExpression_in_expression2012);
            orExpression135=orExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_orExpression.add(orExpression135.getTree());
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:284:21: (ap= assignmentOperator expression )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==EQ||(LA36_0>=84 && LA36_0<=87)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:284:23: ap= assignmentOperator expression
                    {
                    pushFollow(FOLLOW_assignmentOperator_in_expression2018);
                    ap=assignmentOperator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_assignmentOperator.add(ap.getTree());
                    pushFollow(FOLLOW_expression_in_expression2020);
                    expression136=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression136.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: orExpression, expression, orExpression, orExpression, orExpression, expression, expression, orExpression, orExpression, orExpression, expression, orExpression, orExpression, expression, orExpression, EQ
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 284:58: -> {$ap.c == '='}? ^( '=' orExpression expression )
            if ((ap!=null?ap.c:0) == '=') {
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:284:77: ^( '=' orExpression expression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EQ, "EQ"), root_1);

                adaptor.addChild(root_1, stream_orExpression.nextTree());
                adaptor.addChild(root_1, stream_expression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 285:13: -> {$ap.c == '+'}? ^( EQ orExpression ^( PLUS orExpression expression ) )
            if ((ap!=null?ap.c:0) == '+') {
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:285:32: ^( EQ orExpression ^( PLUS orExpression expression ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EQ, "EQ"), root_1);

                adaptor.addChild(root_1, stream_orExpression.nextTree());
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:285:50: ^( PLUS orExpression expression )
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
            else // 286:13: -> {$ap.c == '-'}? ^( EQ orExpression ^( MINUS orExpression expression ) )
            if ((ap!=null?ap.c:0) == '-') {
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:286:32: ^( EQ orExpression ^( MINUS orExpression expression ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EQ, "EQ"), root_1);

                adaptor.addChild(root_1, stream_orExpression.nextTree());
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:286:50: ^( MINUS orExpression expression )
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
            else // 287:13: -> {$ap.c == '*'}? ^( EQ orExpression ^( STAR orExpression expression ) )
            if ((ap!=null?ap.c:0) == '*') {
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:287:32: ^( EQ orExpression ^( STAR orExpression expression ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EQ, "EQ"), root_1);

                adaptor.addChild(root_1, stream_orExpression.nextTree());
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:287:50: ^( STAR orExpression expression )
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
            else // 288:13: -> {$ap.c == '/'}? ^( EQ orExpression ^( SLASH orExpression expression ) )
            if ((ap!=null?ap.c:0) == '/') {
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:288:32: ^( EQ orExpression ^( SLASH orExpression expression ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EQ, "EQ"), root_1);

                adaptor.addChild(root_1, stream_orExpression.nextTree());
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:288:50: ^( SLASH orExpression expression )
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
            else // 289:13: -> orExpression
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:292:1: assignmentOperator returns [char c] : ( '=' | '+=' | '-=' | '*=' | '/=' );
    public final JaParser.assignmentOperator_return assignmentOperator() throws RecognitionException {
        JaParser.assignmentOperator_return retval = new JaParser.assignmentOperator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal137=null;
        Token string_literal138=null;
        Token string_literal139=null;
        Token string_literal140=null;
        Token string_literal141=null;

        Object char_literal137_tree=null;
        Object string_literal138_tree=null;
        Object string_literal139_tree=null;
        Object string_literal140_tree=null;
        Object string_literal141_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:293:5: ( '=' | '+=' | '-=' | '*=' | '/=' )
            int alt37=5;
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

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:293:9: '='
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal137=(Token)match(input,EQ,FOLLOW_EQ_in_assignmentOperator2200); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal137_tree = (Object)adaptor.create(char_literal137);
                    adaptor.addChild(root_0, char_literal137_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.c = '='; 
                    }

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:294:9: '+='
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal138=(Token)match(input,84,FOLLOW_84_in_assignmentOperator2213); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal138_tree = (Object)adaptor.create(string_literal138);
                    adaptor.addChild(root_0, string_literal138_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.c = '+'; 
                    }

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:295:9: '-='
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal139=(Token)match(input,85,FOLLOW_85_in_assignmentOperator2225); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal139_tree = (Object)adaptor.create(string_literal139);
                    adaptor.addChild(root_0, string_literal139_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.c = '-'; 
                    }

                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:296:9: '*='
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal140=(Token)match(input,86,FOLLOW_86_in_assignmentOperator2237); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal140_tree = (Object)adaptor.create(string_literal140);
                    adaptor.addChild(root_0, string_literal140_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.c = '*'; 
                    }

                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:297:9: '/='
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal141=(Token)match(input,87,FOLLOW_87_in_assignmentOperator2249); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal141_tree = (Object)adaptor.create(string_literal141);
                    adaptor.addChild(root_0, string_literal141_tree);
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:300:1: orExpression : andExpression ( '||' andExpression )* ;
    public final JaParser.orExpression_return orExpression() throws RecognitionException {
        JaParser.orExpression_return retval = new JaParser.orExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal143=null;
        JaParser.andExpression_return andExpression142 = null;

        JaParser.andExpression_return andExpression144 = null;


        Object string_literal143_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:301:5: ( andExpression ( '||' andExpression )* )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:301:9: andExpression ( '||' andExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_andExpression_in_orExpression2270);
            andExpression142=andExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, andExpression142.getTree());
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:301:23: ( '||' andExpression )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==88) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:301:25: '||' andExpression
            	    {
            	    string_literal143=(Token)match(input,88,FOLLOW_88_in_orExpression2274); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal143_tree = (Object)adaptor.create(string_literal143);
            	    root_0 = (Object)adaptor.becomeRoot(string_literal143_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_andExpression_in_orExpression2277);
            	    andExpression144=andExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, andExpression144.getTree());

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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:304:1: andExpression : equalityExpression ( '&&' equalityExpression )* ;
    public final JaParser.andExpression_return andExpression() throws RecognitionException {
        JaParser.andExpression_return retval = new JaParser.andExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal146=null;
        JaParser.equalityExpression_return equalityExpression145 = null;

        JaParser.equalityExpression_return equalityExpression147 = null;


        Object string_literal146_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:305:5: ( equalityExpression ( '&&' equalityExpression )* )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:305:9: equalityExpression ( '&&' equalityExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equalityExpression_in_andExpression2299);
            equalityExpression145=equalityExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression145.getTree());
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:305:28: ( '&&' equalityExpression )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==89) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:305:30: '&&' equalityExpression
            	    {
            	    string_literal146=(Token)match(input,89,FOLLOW_89_in_andExpression2303); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal146_tree = (Object)adaptor.create(string_literal146);
            	    root_0 = (Object)adaptor.becomeRoot(string_literal146_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_equalityExpression_in_andExpression2306);
            	    equalityExpression147=equalityExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression147.getTree());

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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:308:1: equalityExpression : instanceOfExpression ( ( '==' | '!=' ) instanceOfExpression )* ;
    public final JaParser.equalityExpression_return equalityExpression() throws RecognitionException {
        JaParser.equalityExpression_return retval = new JaParser.equalityExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set149=null;
        JaParser.instanceOfExpression_return instanceOfExpression148 = null;

        JaParser.instanceOfExpression_return instanceOfExpression150 = null;


        Object set149_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:309:5: ( instanceOfExpression ( ( '==' | '!=' ) instanceOfExpression )* )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:309:9: instanceOfExpression ( ( '==' | '!=' ) instanceOfExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_instanceOfExpression_in_equalityExpression2328);
            instanceOfExpression148=instanceOfExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, instanceOfExpression148.getTree());
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:309:30: ( ( '==' | '!=' ) instanceOfExpression )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( ((LA40_0>=90 && LA40_0<=91)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:309:32: ( '==' | '!=' ) instanceOfExpression
            	    {
            	    set149=(Token)input.LT(1);
            	    set149=(Token)input.LT(1);
            	    if ( (input.LA(1)>=90 && input.LA(1)<=91) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set149), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_instanceOfExpression_in_equalityExpression2341);
            	    instanceOfExpression150=instanceOfExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, instanceOfExpression150.getTree());

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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:312:1: instanceOfExpression : relationalExpression ( INSTANCEOF type )? ;
    public final JaParser.instanceOfExpression_return instanceOfExpression() throws RecognitionException {
        JaParser.instanceOfExpression_return retval = new JaParser.instanceOfExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INSTANCEOF152=null;
        JaParser.relationalExpression_return relationalExpression151 = null;

        JaParser.type_return type153 = null;


        Object INSTANCEOF152_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:313:5: ( relationalExpression ( INSTANCEOF type )? )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:313:9: relationalExpression ( INSTANCEOF type )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relationalExpression_in_instanceOfExpression2363);
            relationalExpression151=relationalExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression151.getTree());
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:313:30: ( INSTANCEOF type )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==INSTANCEOF) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:313:31: INSTANCEOF type
                    {
                    INSTANCEOF152=(Token)match(input,INSTANCEOF,FOLLOW_INSTANCEOF_in_instanceOfExpression2366); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INSTANCEOF152_tree = (Object)adaptor.create(INSTANCEOF152);
                    root_0 = (Object)adaptor.becomeRoot(INSTANCEOF152_tree, root_0);
                    }
                    pushFollow(FOLLOW_type_in_instanceOfExpression2369);
                    type153=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type153.getTree());

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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:316:1: relationalExpression : additiveExpression ( COMPAREOP additiveExpression )* ;
    public final JaParser.relationalExpression_return relationalExpression() throws RecognitionException {
        JaParser.relationalExpression_return retval = new JaParser.relationalExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMPAREOP155=null;
        JaParser.additiveExpression_return additiveExpression154 = null;

        JaParser.additiveExpression_return additiveExpression156 = null;


        Object COMPAREOP155_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:317:5: ( additiveExpression ( COMPAREOP additiveExpression )* )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:317:9: additiveExpression ( COMPAREOP additiveExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_additiveExpression_in_relationalExpression2390);
            additiveExpression154=additiveExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression154.getTree());
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:317:28: ( COMPAREOP additiveExpression )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==COMPAREOP) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:317:30: COMPAREOP additiveExpression
            	    {
            	    COMPAREOP155=(Token)match(input,COMPAREOP,FOLLOW_COMPAREOP_in_relationalExpression2394); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    COMPAREOP155_tree = (Object)adaptor.create(COMPAREOP155);
            	    root_0 = (Object)adaptor.becomeRoot(COMPAREOP155_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_additiveExpression_in_relationalExpression2397);
            	    additiveExpression156=additiveExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression156.getTree());

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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:320:1: additiveExpression : multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )* ;
    public final JaParser.additiveExpression_return additiveExpression() throws RecognitionException {
        JaParser.additiveExpression_return retval = new JaParser.additiveExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set158=null;
        JaParser.multiplicativeExpression_return multiplicativeExpression157 = null;

        JaParser.multiplicativeExpression_return multiplicativeExpression159 = null;


        Object set158_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:321:5: ( multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )* )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:321:9: multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression2419);
            multiplicativeExpression157=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression157.getTree());
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:321:34: ( ( '+' | '-' ) multiplicativeExpression )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=PLUS && LA43_0<=MINUS)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:321:36: ( '+' | '-' ) multiplicativeExpression
            	    {
            	    set158=(Token)input.LT(1);
            	    set158=(Token)input.LT(1);
            	    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set158), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression2432);
            	    multiplicativeExpression159=multiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression159.getTree());

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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:324:1: multiplicativeExpression : unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )* ;
    public final JaParser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        JaParser.multiplicativeExpression_return retval = new JaParser.multiplicativeExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set161=null;
        JaParser.unaryExpression_return unaryExpression160 = null;

        JaParser.unaryExpression_return unaryExpression162 = null;


        Object set161_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:325:5: ( unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )* )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:325:9: unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression2454);
            unaryExpression160=unaryExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression160.getTree());
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:325:25: ( ( '*' | '/' | '%' ) unaryExpression )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=STAR && LA44_0<=SLASH)||LA44_0==92) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:325:27: ( '*' | '/' | '%' ) unaryExpression
            	    {
            	    set161=(Token)input.LT(1);
            	    set161=(Token)input.LT(1);
            	    if ( (input.LA(1)>=STAR && input.LA(1)<=SLASH)||input.LA(1)==92 ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set161), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression2473);
            	    unaryExpression162=unaryExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression162.getTree());

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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:328:1: unaryExpression : ( '+' unaryExpression | '-' unaryExpression | '++' unaryExpression | '--' unaryExpression | unaryExpressionNotPlusMinus );
    public final JaParser.unaryExpression_return unaryExpression() throws RecognitionException {
        JaParser.unaryExpression_return retval = new JaParser.unaryExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal163=null;
        Token char_literal165=null;
        Token string_literal167=null;
        Token string_literal169=null;
        JaParser.unaryExpression_return unaryExpression164 = null;

        JaParser.unaryExpression_return unaryExpression166 = null;

        JaParser.unaryExpression_return unaryExpression168 = null;

        JaParser.unaryExpression_return unaryExpression170 = null;

        JaParser.unaryExpressionNotPlusMinus_return unaryExpressionNotPlusMinus171 = null;


        Object char_literal163_tree=null;
        Object char_literal165_tree=null;
        Object string_literal167_tree=null;
        Object string_literal169_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:329:5: ( '+' unaryExpression | '-' unaryExpression | '++' unaryExpression | '--' unaryExpression | unaryExpressionNotPlusMinus )
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

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:329:9: '+' unaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal163=(Token)match(input,PLUS,FOLLOW_PLUS_in_unaryExpression2499); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal163_tree = (Object)adaptor.create(char_literal163);
                    adaptor.addChild(root_0, char_literal163_tree);
                    }
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression2501);
                    unaryExpression164=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression164.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:330:9: '-' unaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal165=(Token)match(input,MINUS,FOLLOW_MINUS_in_unaryExpression2511); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal165_tree = (Object)adaptor.create(char_literal165);
                    adaptor.addChild(root_0, char_literal165_tree);
                    }
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression2513);
                    unaryExpression166=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression166.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:331:9: '++' unaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal167=(Token)match(input,93,FOLLOW_93_in_unaryExpression2523); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal167_tree = (Object)adaptor.create(string_literal167);
                    adaptor.addChild(root_0, string_literal167_tree);
                    }
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression2525);
                    unaryExpression168=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression168.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:332:9: '--' unaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal169=(Token)match(input,94,FOLLOW_94_in_unaryExpression2535); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal169_tree = (Object)adaptor.create(string_literal169);
                    adaptor.addChild(root_0, string_literal169_tree);
                    }
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression2537);
                    unaryExpression170=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression170.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:333:9: unaryExpressionNotPlusMinus
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression2547);
                    unaryExpressionNotPlusMinus171=unaryExpressionNotPlusMinus();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpressionNotPlusMinus171.getTree());

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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:336:1: unaryExpressionNotPlusMinus : ( '!' unaryExpression | ( '(' primitiveType ')' )=> '(' primitiveType ')' unaryExpression | ( '(' nonPrimitiveType ')' unaryExpressionNotPlusMinus )=> '(' nonPrimitiveType ')' unaryExpressionNotPlusMinus | NEW creator | primary ( selector )* ( '++' | '--' )? );
    public final JaParser.unaryExpressionNotPlusMinus_return unaryExpressionNotPlusMinus() throws RecognitionException {
        JaParser.unaryExpressionNotPlusMinus_return retval = new JaParser.unaryExpressionNotPlusMinus_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal172=null;
        Token char_literal174=null;
        Token char_literal176=null;
        Token char_literal178=null;
        Token char_literal180=null;
        Token NEW182=null;
        Token set186=null;
        JaParser.unaryExpression_return unaryExpression173 = null;

        JaParser.primitiveType_return primitiveType175 = null;

        JaParser.unaryExpression_return unaryExpression177 = null;

        JaParser.nonPrimitiveType_return nonPrimitiveType179 = null;

        JaParser.unaryExpressionNotPlusMinus_return unaryExpressionNotPlusMinus181 = null;

        JaParser.creator_return creator183 = null;

        JaParser.primary_return primary184 = null;

        JaParser.selector_return selector185 = null;


        Object char_literal172_tree=null;
        Object char_literal174_tree=null;
        Object char_literal176_tree=null;
        Object char_literal178_tree=null;
        Object char_literal180_tree=null;
        Object NEW182_tree=null;
        Object set186_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:337:5: ( '!' unaryExpression | ( '(' primitiveType ')' )=> '(' primitiveType ')' unaryExpression | ( '(' nonPrimitiveType ')' unaryExpressionNotPlusMinus )=> '(' nonPrimitiveType ')' unaryExpressionNotPlusMinus | NEW creator | primary ( selector )* ( '++' | '--' )? )
            int alt48=5;
            alt48 = dfa48.predict(input);
            switch (alt48) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:337:7: '!' unaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal172=(Token)match(input,95,FOLLOW_95_in_unaryExpressionNotPlusMinus2564); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal172_tree = (Object)adaptor.create(char_literal172);
                    adaptor.addChild(root_0, char_literal172_tree);
                    }
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus2566);
                    unaryExpression173=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression173.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:338:9: ( '(' primitiveType ')' )=> '(' primitiveType ')' unaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal174=(Token)match(input,81,FOLLOW_81_in_unaryExpressionNotPlusMinus2587); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal174_tree = (Object)adaptor.create(char_literal174);
                    adaptor.addChild(root_0, char_literal174_tree);
                    }
                    pushFollow(FOLLOW_primitiveType_in_unaryExpressionNotPlusMinus2589);
                    primitiveType175=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType175.getTree());
                    char_literal176=(Token)match(input,82,FOLLOW_82_in_unaryExpressionNotPlusMinus2591); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal176_tree = (Object)adaptor.create(char_literal176);
                    adaptor.addChild(root_0, char_literal176_tree);
                    }
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus2593);
                    unaryExpression177=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression177.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:340:9: ( '(' nonPrimitiveType ')' unaryExpressionNotPlusMinus )=> '(' nonPrimitiveType ')' unaryExpressionNotPlusMinus
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal178=(Token)match(input,81,FOLLOW_81_in_unaryExpressionNotPlusMinus2621); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal178_tree = (Object)adaptor.create(char_literal178);
                    adaptor.addChild(root_0, char_literal178_tree);
                    }
                    pushFollow(FOLLOW_nonPrimitiveType_in_unaryExpressionNotPlusMinus2623);
                    nonPrimitiveType179=nonPrimitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nonPrimitiveType179.getTree());
                    char_literal180=(Token)match(input,82,FOLLOW_82_in_unaryExpressionNotPlusMinus2626); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal180_tree = (Object)adaptor.create(char_literal180);
                    adaptor.addChild(root_0, char_literal180_tree);
                    }
                    pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpressionNotPlusMinus2628);
                    unaryExpressionNotPlusMinus181=unaryExpressionNotPlusMinus();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpressionNotPlusMinus181.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:341:9: NEW creator
                    {
                    root_0 = (Object)adaptor.nil();

                    NEW182=(Token)match(input,NEW,FOLLOW_NEW_in_unaryExpressionNotPlusMinus2638); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NEW182_tree = (Object)adaptor.create(NEW182);
                    adaptor.addChild(root_0, NEW182_tree);
                    }
                    pushFollow(FOLLOW_creator_in_unaryExpressionNotPlusMinus2640);
                    creator183=creator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, creator183.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:342:9: primary ( selector )* ( '++' | '--' )?
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primary_in_unaryExpressionNotPlusMinus2650);
                    primary184=primary();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primary184.getTree());
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:342:26: ( selector )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==79||LA46_0==96) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:342:26: selector
                    	    {
                    	    pushFollow(FOLLOW_selector_in_unaryExpressionNotPlusMinus2653);
                    	    selector185=selector();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(selector185.getTree(), root_0);

                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);

                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:342:29: ( '++' | '--' )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( ((LA47_0>=93 && LA47_0<=94)) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:
                            {
                            set186=(Token)input.LT(1);
                            if ( (input.LA(1)>=93 && input.LA(1)<=94) ) {
                                input.consume();
                                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set186));
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:349:1: primary : ( parExpression | THIS | SUPER superMemberAccess | literal | IDENTIFIER | ( IDENTIFIER -> IDENTIFIER ) ( '[' ']' -> ^( ARRAYTYPE $primary) )+ ( '.' CLASS -> ^( DOTCLASS $primary) ) | IDENTIFIER arguments -> ^( METHODCALL IDENTIFIER arguments THIS ) | IDENTIFIER '.' CLASS -> ^( DOTCLASS IDENTIFIER ) | ( primitiveType -> primitiveType ) ( '[' ']' -> ^( ARRAYTYPE $primary) )* ( '.' CLASS -> ^( DOTCLASS $primary) ) | VOID '.' CLASS -> ^( DOTCLASS VOID ) );
    public final JaParser.primary_return primary() throws RecognitionException {
        JaParser.primary_return retval = new JaParser.primary_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token THIS188=null;
        Token SUPER189=null;
        Token IDENTIFIER192=null;
        Token IDENTIFIER193=null;
        Token char_literal194=null;
        Token char_literal195=null;
        Token char_literal196=null;
        Token CLASS197=null;
        Token IDENTIFIER198=null;
        Token IDENTIFIER200=null;
        Token char_literal201=null;
        Token CLASS202=null;
        Token char_literal204=null;
        Token char_literal205=null;
        Token char_literal206=null;
        Token CLASS207=null;
        Token VOID208=null;
        Token char_literal209=null;
        Token CLASS210=null;
        JaParser.parExpression_return parExpression187 = null;

        JaParser.superMemberAccess_return superMemberAccess190 = null;

        JaParser.literal_return literal191 = null;

        JaParser.arguments_return arguments199 = null;

        JaParser.primitiveType_return primitiveType203 = null;


        Object THIS188_tree=null;
        Object SUPER189_tree=null;
        Object IDENTIFIER192_tree=null;
        Object IDENTIFIER193_tree=null;
        Object char_literal194_tree=null;
        Object char_literal195_tree=null;
        Object char_literal196_tree=null;
        Object CLASS197_tree=null;
        Object IDENTIFIER198_tree=null;
        Object IDENTIFIER200_tree=null;
        Object char_literal201_tree=null;
        Object CLASS202_tree=null;
        Object char_literal204_tree=null;
        Object char_literal205_tree=null;
        Object char_literal206_tree=null;
        Object CLASS207_tree=null;
        Object VOID208_tree=null;
        Object char_literal209_tree=null;
        Object CLASS210_tree=null;
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
        RewriteRuleTokenStream stream_CLASS=new RewriteRuleTokenStream(adaptor,"token CLASS");
        RewriteRuleTokenStream stream_VOID=new RewriteRuleTokenStream(adaptor,"token VOID");
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");
        RewriteRuleSubtreeStream stream_primitiveType=new RewriteRuleSubtreeStream(adaptor,"rule primitiveType");
        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:350:5: ( parExpression | THIS | SUPER superMemberAccess | literal | IDENTIFIER | ( IDENTIFIER -> IDENTIFIER ) ( '[' ']' -> ^( ARRAYTYPE $primary) )+ ( '.' CLASS -> ^( DOTCLASS $primary) ) | IDENTIFIER arguments -> ^( METHODCALL IDENTIFIER arguments THIS ) | IDENTIFIER '.' CLASS -> ^( DOTCLASS IDENTIFIER ) | ( primitiveType -> primitiveType ) ( '[' ']' -> ^( ARRAYTYPE $primary) )* ( '.' CLASS -> ^( DOTCLASS $primary) ) | VOID '.' CLASS -> ^( DOTCLASS VOID ) )
            int alt51=10;
            alt51 = dfa51.predict(input);
            switch (alt51) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:350:9: parExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_parExpression_in_primary2717);
                    parExpression187=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parExpression187.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:351:9: THIS
                    {
                    root_0 = (Object)adaptor.nil();

                    THIS188=(Token)match(input,THIS,FOLLOW_THIS_in_primary2727); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    THIS188_tree = (Object)adaptor.create(THIS188);
                    adaptor.addChild(root_0, THIS188_tree);
                    }

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:352:9: SUPER superMemberAccess
                    {
                    root_0 = (Object)adaptor.nil();

                    SUPER189=(Token)match(input,SUPER,FOLLOW_SUPER_in_primary2738); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SUPER189_tree = (Object)adaptor.create(SUPER189);
                    root_0 = (Object)adaptor.becomeRoot(SUPER189_tree, root_0);
                    }
                    pushFollow(FOLLOW_superMemberAccess_in_primary2741);
                    superMemberAccess190=superMemberAccess();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, superMemberAccess190.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:353:9: literal
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_literal_in_primary2751);
                    literal191=literal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, literal191.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:354:9: IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();

                    IDENTIFIER192=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary2761); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER192_tree = (Object)adaptor.create(IDENTIFIER192);
                    adaptor.addChild(root_0, IDENTIFIER192_tree);
                    }

                    }
                    break;
                case 6 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:355:9: ( IDENTIFIER -> IDENTIFIER ) ( '[' ']' -> ^( ARRAYTYPE $primary) )+ ( '.' CLASS -> ^( DOTCLASS $primary) )
                    {
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:355:9: ( IDENTIFIER -> IDENTIFIER )
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:355:10: IDENTIFIER
                    {
                    IDENTIFIER193=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary2772); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER193);



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
                    // 355:21: -> IDENTIFIER
                    {
                        adaptor.addChild(root_0, stream_IDENTIFIER.nextNode());

                    }

                    retval.tree = root_0;}
                    }

                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:355:36: ( '[' ']' -> ^( ARRAYTYPE $primary) )+
                    int cnt49=0;
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==79) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:355:37: '[' ']'
                    	    {
                    	    char_literal194=(Token)match(input,79,FOLLOW_79_in_primary2780); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_79.add(char_literal194);

                    	    char_literal195=(Token)match(input,80,FOLLOW_80_in_primary2782); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_80.add(char_literal195);



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
                    	    // 355:45: -> ^( ARRAYTYPE $primary)
                    	    {
                    	        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:355:48: ^( ARRAYTYPE $primary)
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

                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:355:72: ( '.' CLASS -> ^( DOTCLASS $primary) )
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:355:73: '.' CLASS
                    {
                    char_literal196=(Token)match(input,96,FOLLOW_96_in_primary2796); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_96.add(char_literal196);

                    CLASS197=(Token)match(input,CLASS,FOLLOW_CLASS_in_primary2798); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLASS.add(CLASS197);



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
                    // 355:83: -> ^( DOTCLASS $primary)
                    {
                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:355:86: ^( DOTCLASS $primary)
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
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:356:8: IDENTIFIER arguments
                    {
                    IDENTIFIER198=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary2817); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER198);

                    pushFollow(FOLLOW_arguments_in_primary2820);
                    arguments199=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arguments.add(arguments199.getTree());


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
                    // 356:30: -> ^( METHODCALL IDENTIFIER arguments THIS )
                    {
                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:356:33: ^( METHODCALL IDENTIFIER arguments THIS )
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
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:357:7: IDENTIFIER '.' CLASS
                    {
                    IDENTIFIER200=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary2840); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER200);

                    char_literal201=(Token)match(input,96,FOLLOW_96_in_primary2842); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_96.add(char_literal201);

                    CLASS202=(Token)match(input,CLASS,FOLLOW_CLASS_in_primary2844); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLASS.add(CLASS202);



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
                    // 357:28: -> ^( DOTCLASS IDENTIFIER )
                    {
                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:357:31: ^( DOTCLASS IDENTIFIER )
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
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:358:9: ( primitiveType -> primitiveType ) ( '[' ']' -> ^( ARRAYTYPE $primary) )* ( '.' CLASS -> ^( DOTCLASS $primary) )
                    {
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:358:9: ( primitiveType -> primitiveType )
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:358:10: primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_primary2863);
                    primitiveType203=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primitiveType.add(primitiveType203.getTree());


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
                    // 358:24: -> primitiveType
                    {
                        adaptor.addChild(root_0, stream_primitiveType.nextTree());

                    }

                    retval.tree = root_0;}
                    }

                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:358:42: ( '[' ']' -> ^( ARRAYTYPE $primary) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==79) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:358:43: '[' ']'
                    	    {
                    	    char_literal204=(Token)match(input,79,FOLLOW_79_in_primary2871); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_79.add(char_literal204);

                    	    char_literal205=(Token)match(input,80,FOLLOW_80_in_primary2873); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_80.add(char_literal205);



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
                    	    // 358:51: -> ^( ARRAYTYPE $primary)
                    	    {
                    	        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:358:54: ^( ARRAYTYPE $primary)
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

                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:358:78: ( '.' CLASS -> ^( DOTCLASS $primary) )
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:358:79: '.' CLASS
                    {
                    char_literal206=(Token)match(input,96,FOLLOW_96_in_primary2887); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_96.add(char_literal206);

                    CLASS207=(Token)match(input,CLASS,FOLLOW_CLASS_in_primary2889); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLASS.add(CLASS207);



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
                    // 358:89: -> ^( DOTCLASS $primary)
                    {
                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:358:92: ^( DOTCLASS $primary)
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
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:359:9: VOID '.' CLASS
                    {
                    VOID208=(Token)match(input,VOID,FOLLOW_VOID_in_primary2909); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VOID.add(VOID208);

                    char_literal209=(Token)match(input,96,FOLLOW_96_in_primary2911); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_96.add(char_literal209);

                    CLASS210=(Token)match(input,CLASS,FOLLOW_CLASS_in_primary2913); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLASS.add(CLASS210);



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
                    // 359:24: -> ^( DOTCLASS VOID )
                    {
                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:359:27: ^( DOTCLASS VOID )
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:362:1: selector : ( '.' IDENTIFIER -> ^( FIELDACCESS IDENTIFIER ) | '.' IDENTIFIER arguments -> ^( METHODCALL IDENTIFIER ( arguments )? ) | '[' expression ']' -> ^( ARRAYACCESS expression ) );
    public final JaParser.selector_return selector() throws RecognitionException {
        JaParser.selector_return retval = new JaParser.selector_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal211=null;
        Token IDENTIFIER212=null;
        Token char_literal213=null;
        Token IDENTIFIER214=null;
        Token char_literal216=null;
        Token char_literal218=null;
        JaParser.arguments_return arguments215 = null;

        JaParser.expression_return expression217 = null;


        Object char_literal211_tree=null;
        Object IDENTIFIER212_tree=null;
        Object char_literal213_tree=null;
        Object IDENTIFIER214_tree=null;
        Object char_literal216_tree=null;
        Object char_literal218_tree=null;
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");
        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:363:5: ( '.' IDENTIFIER -> ^( FIELDACCESS IDENTIFIER ) | '.' IDENTIFIER arguments -> ^( METHODCALL IDENTIFIER ( arguments )? ) | '[' expression ']' -> ^( ARRAYACCESS expression ) )
            int alt52=3;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==96) ) {
                int LA52_1 = input.LA(2);

                if ( (LA52_1==IDENTIFIER) ) {
                    int LA52_3 = input.LA(3);

                    if ( (LA52_3==EOF||(LA52_3>=INSTANCEOF && LA52_3<=COMPAREOP)||(LA52_3>=EQ && LA52_3<=SLASH)||LA52_3==75||(LA52_3>=77 && LA52_3<=80)||LA52_3==82||(LA52_3>=84 && LA52_3<=94)||LA52_3==96) ) {
                        alt52=1;
                    }
                    else if ( (LA52_3==81) ) {
                        alt52=2;
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
            else if ( (LA52_0==79) ) {
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
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:363:9: '.' IDENTIFIER
                    {
                    char_literal211=(Token)match(input,96,FOLLOW_96_in_selector2944); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_96.add(char_literal211);

                    IDENTIFIER212=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_selector2946); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER212);



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
                    // 363:24: -> ^( FIELDACCESS IDENTIFIER )
                    {
                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:363:27: ^( FIELDACCESS IDENTIFIER )
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
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:364:7: '.' IDENTIFIER arguments
                    {
                    char_literal213=(Token)match(input,96,FOLLOW_96_in_selector2962); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_96.add(char_literal213);

                    IDENTIFIER214=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_selector2964); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER214);

                    pushFollow(FOLLOW_arguments_in_selector2966);
                    arguments215=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arguments.add(arguments215.getTree());


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
                    // 364:32: -> ^( METHODCALL IDENTIFIER ( arguments )? )
                    {
                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:364:35: ^( METHODCALL IDENTIFIER ( arguments )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(METHODCALL, "METHODCALL"), root_1);

                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:364:59: ( arguments )?
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
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:367:9: '[' expression ']'
                    {
                    char_literal216=(Token)match(input,79,FOLLOW_79_in_selector2997); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_79.add(char_literal216);

                    pushFollow(FOLLOW_expression_in_selector2999);
                    expression217=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression217.getTree());
                    char_literal218=(Token)match(input,80,FOLLOW_80_in_selector3001); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_80.add(char_literal218);



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
                    // 367:27: -> ^( ARRAYACCESS expression )
                    {
                        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:367:30: ^( ARRAYACCESS expression )
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:370:1: identifierSuffix : ( ( '[' ']' )+ '.' CLASS | arguments | '.' CLASS );
    public final JaParser.identifierSuffix_return identifierSuffix() throws RecognitionException {
        JaParser.identifierSuffix_return retval = new JaParser.identifierSuffix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal219=null;
        Token char_literal220=null;
        Token char_literal221=null;
        Token CLASS222=null;
        Token char_literal224=null;
        Token CLASS225=null;
        JaParser.arguments_return arguments223 = null;


        Object char_literal219_tree=null;
        Object char_literal220_tree=null;
        Object char_literal221_tree=null;
        Object CLASS222_tree=null;
        Object char_literal224_tree=null;
        Object CLASS225_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:371:5: ( ( '[' ']' )+ '.' CLASS | arguments | '.' CLASS )
            int alt54=3;
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

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:371:9: ( '[' ']' )+ '.' CLASS
                    {
                    root_0 = (Object)adaptor.nil();

                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:371:9: ( '[' ']' )+
                    int cnt53=0;
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==79) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:371:10: '[' ']'
                    	    {
                    	    char_literal219=(Token)match(input,79,FOLLOW_79_in_identifierSuffix3028); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal219_tree = (Object)adaptor.create(char_literal219);
                    	    adaptor.addChild(root_0, char_literal219_tree);
                    	    }
                    	    char_literal220=(Token)match(input,80,FOLLOW_80_in_identifierSuffix3030); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal220_tree = (Object)adaptor.create(char_literal220);
                    	    adaptor.addChild(root_0, char_literal220_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt53 >= 1 ) break loop53;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(53, input);
                                throw eee;
                        }
                        cnt53++;
                    } while (true);

                    char_literal221=(Token)match(input,96,FOLLOW_96_in_identifierSuffix3034); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal221_tree = (Object)adaptor.create(char_literal221);
                    adaptor.addChild(root_0, char_literal221_tree);
                    }
                    CLASS222=(Token)match(input,CLASS,FOLLOW_CLASS_in_identifierSuffix3036); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CLASS222_tree = (Object)adaptor.create(CLASS222);
                    adaptor.addChild(root_0, CLASS222_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:373:9: arguments
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_arguments_in_identifierSuffix3051);
                    arguments223=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments223.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:374:9: '.' CLASS
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal224=(Token)match(input,96,FOLLOW_96_in_identifierSuffix3061); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal224_tree = (Object)adaptor.create(char_literal224);
                    adaptor.addChild(root_0, char_literal224_tree);
                    }
                    CLASS225=(Token)match(input,CLASS,FOLLOW_CLASS_in_identifierSuffix3063); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CLASS225_tree = (Object)adaptor.create(CLASS225);
                    adaptor.addChild(root_0, CLASS225_tree);
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:379:1: creator : createdName ( arrayCreatorRest | classCreatorRest ) ;
    public final JaParser.creator_return creator() throws RecognitionException {
        JaParser.creator_return retval = new JaParser.creator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.createdName_return createdName226 = null;

        JaParser.arrayCreatorRest_return arrayCreatorRest227 = null;

        JaParser.classCreatorRest_return classCreatorRest228 = null;



        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:380:5: ( createdName ( arrayCreatorRest | classCreatorRest ) )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:380:7: createdName ( arrayCreatorRest | classCreatorRest )
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_createdName_in_creator3090);
            createdName226=createdName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, createdName226.getTree());
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:380:19: ( arrayCreatorRest | classCreatorRest )
            int alt55=2;
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

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:380:20: arrayCreatorRest
                    {
                    pushFollow(FOLLOW_arrayCreatorRest_in_creator3093);
                    arrayCreatorRest227=arrayCreatorRest();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayCreatorRest227.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:380:39: classCreatorRest
                    {
                    pushFollow(FOLLOW_classCreatorRest_in_creator3097);
                    classCreatorRest228=classCreatorRest();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classCreatorRest228.getTree());

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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:383:1: createdName : ( classType | primitiveType );
    public final JaParser.createdName_return createdName() throws RecognitionException {
        JaParser.createdName_return retval = new JaParser.createdName_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.classType_return classType229 = null;

        JaParser.primitiveType_return primitiveType230 = null;



        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:384:5: ( classType | primitiveType )
            int alt56=2;
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

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:384:9: classType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_classType_in_createdName3117);
                    classType229=classType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classType229.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:385:9: primitiveType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primitiveType_in_createdName3127);
                    primitiveType230=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType230.getTree());

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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:388:1: arrayCreatorRest : ( '[' ']' ( '[' ']' )* arrayInitializer | '[' expression ']' ( '[' expression ']' )* );
    public final JaParser.arrayCreatorRest_return arrayCreatorRest() throws RecognitionException {
        JaParser.arrayCreatorRest_return retval = new JaParser.arrayCreatorRest_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal231=null;
        Token char_literal232=null;
        Token char_literal233=null;
        Token char_literal234=null;
        Token char_literal236=null;
        Token char_literal238=null;
        Token char_literal239=null;
        Token char_literal241=null;
        JaParser.arrayInitializer_return arrayInitializer235 = null;

        JaParser.expression_return expression237 = null;

        JaParser.expression_return expression240 = null;


        Object char_literal231_tree=null;
        Object char_literal232_tree=null;
        Object char_literal233_tree=null;
        Object char_literal234_tree=null;
        Object char_literal236_tree=null;
        Object char_literal238_tree=null;
        Object char_literal239_tree=null;
        Object char_literal241_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:389:5: ( '[' ']' ( '[' ']' )* arrayInitializer | '[' expression ']' ( '[' expression ']' )* )
            int alt59=2;
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
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:389:9: '[' ']' ( '[' ']' )* arrayInitializer
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal231=(Token)match(input,79,FOLLOW_79_in_arrayCreatorRest3150); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal231_tree = (Object)adaptor.create(char_literal231);
                    adaptor.addChild(root_0, char_literal231_tree);
                    }
                    char_literal232=(Token)match(input,80,FOLLOW_80_in_arrayCreatorRest3151); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal232_tree = (Object)adaptor.create(char_literal232);
                    adaptor.addChild(root_0, char_literal232_tree);
                    }
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:389:16: ( '[' ']' )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==79) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:389:17: '[' ']'
                    	    {
                    	    char_literal233=(Token)match(input,79,FOLLOW_79_in_arrayCreatorRest3154); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal233_tree = (Object)adaptor.create(char_literal233);
                    	    adaptor.addChild(root_0, char_literal233_tree);
                    	    }
                    	    char_literal234=(Token)match(input,80,FOLLOW_80_in_arrayCreatorRest3156); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal234_tree = (Object)adaptor.create(char_literal234);
                    	    adaptor.addChild(root_0, char_literal234_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop57;
                        }
                    } while (true);

                    pushFollow(FOLLOW_arrayInitializer_in_arrayCreatorRest3160);
                    arrayInitializer235=arrayInitializer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayInitializer235.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:390:7: '[' expression ']' ( '[' expression ']' )*
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal236=(Token)match(input,79,FOLLOW_79_in_arrayCreatorRest3168); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal236_tree = (Object)adaptor.create(char_literal236);
                    adaptor.addChild(root_0, char_literal236_tree);
                    }
                    pushFollow(FOLLOW_expression_in_arrayCreatorRest3170);
                    expression237=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression237.getTree());
                    char_literal238=(Token)match(input,80,FOLLOW_80_in_arrayCreatorRest3172); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal238_tree = (Object)adaptor.create(char_literal238);
                    adaptor.addChild(root_0, char_literal238_tree);
                    }
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:390:26: ( '[' expression ']' )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==79) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:390:27: '[' expression ']'
                    	    {
                    	    char_literal239=(Token)match(input,79,FOLLOW_79_in_arrayCreatorRest3175); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal239_tree = (Object)adaptor.create(char_literal239);
                    	    adaptor.addChild(root_0, char_literal239_tree);
                    	    }
                    	    pushFollow(FOLLOW_expression_in_arrayCreatorRest3177);
                    	    expression240=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression240.getTree());
                    	    char_literal241=(Token)match(input,80,FOLLOW_80_in_arrayCreatorRest3179); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal241_tree = (Object)adaptor.create(char_literal241);
                    	    adaptor.addChild(root_0, char_literal241_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop58;
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:393:1: classCreatorRest : arguments ;
    public final JaParser.classCreatorRest_return classCreatorRest() throws RecognitionException {
        JaParser.classCreatorRest_return retval = new JaParser.classCreatorRest_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.arguments_return arguments242 = null;



        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:394:5: ( arguments )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:394:9: arguments
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_arguments_in_classCreatorRest3202);
            arguments242=arguments();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments242.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:397:1: superMemberAccess : '.' IDENTIFIER ( arguments )? ;
    public final JaParser.superMemberAccess_return superMemberAccess() throws RecognitionException {
        JaParser.superMemberAccess_return retval = new JaParser.superMemberAccess_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal243=null;
        Token IDENTIFIER244=null;
        JaParser.arguments_return arguments245 = null;


        Object char_literal243_tree=null;
        Object IDENTIFIER244_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:398:5: ( '.' IDENTIFIER ( arguments )? )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:398:7: '.' IDENTIFIER ( arguments )?
            {
            root_0 = (Object)adaptor.nil();

            char_literal243=(Token)match(input,96,FOLLOW_96_in_superMemberAccess3226); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal243_tree = (Object)adaptor.create(char_literal243);
            adaptor.addChild(root_0, char_literal243_tree);
            }
            IDENTIFIER244=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_superMemberAccess3228); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER244_tree = (Object)adaptor.create(IDENTIFIER244);
            adaptor.addChild(root_0, IDENTIFIER244_tree);
            }
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:398:22: ( arguments )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==81) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:398:22: arguments
                    {
                    pushFollow(FOLLOW_arguments_in_superMemberAccess3230);
                    arguments245=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments245.getTree());

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
    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:401:1: arguments : '(' ( expressionList )? ')' ;
    public final JaParser.arguments_return arguments() throws RecognitionException {
        JaParser.arguments_return retval = new JaParser.arguments_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal246=null;
        Token char_literal248=null;
        JaParser.expressionList_return expressionList247 = null;


        Object char_literal246_tree=null;
        Object char_literal248_tree=null;

        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:402:5: ( '(' ( expressionList )? ')' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:402:9: '(' ( expressionList )? ')'
            {
            root_0 = (Object)adaptor.nil();

            char_literal246=(Token)match(input,81,FOLLOW_81_in_arguments3251); if (state.failed) return retval;
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:402:14: ( expressionList )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==IDENTIFIER||LA61_0==VOID||(LA61_0>=CHAR && LA61_0<=NULLLITERAL)||LA61_0==NEW||(LA61_0>=PLUS && LA61_0<=MINUS)||LA61_0==81||(LA61_0>=93 && LA61_0<=95)) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:402:14: expressionList
                    {
                    pushFollow(FOLLOW_expressionList_in_arguments3254);
                    expressionList247=expressionList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList247.getTree());

                    }
                    break;

            }

            char_literal248=(Token)match(input,82,FOLLOW_82_in_arguments3257); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:254:7: ( ELSE )
        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:254:8: ELSE
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred2_Ja1831); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_Ja

    // $ANTLR start synpred3_Ja
    public final void synpred3_Ja_fragment() throws RecognitionException {   
        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:338:9: ( '(' primitiveType ')' )
        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:338:10: '(' primitiveType ')'
        {
        match(input,81,FOLLOW_81_in_synpred3_Ja2577); if (state.failed) return ;
        pushFollow(FOLLOW_primitiveType_in_synpred3_Ja2579);
        primitiveType();

        state._fsp--;
        if (state.failed) return ;
        match(input,82,FOLLOW_82_in_synpred3_Ja2581); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_Ja

    // $ANTLR start synpred4_Ja
    public final void synpred4_Ja_fragment() throws RecognitionException {   
        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:340:9: ( '(' nonPrimitiveType ')' unaryExpressionNotPlusMinus )
        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:340:10: '(' nonPrimitiveType ')' unaryExpressionNotPlusMinus
        {
        match(input,81,FOLLOW_81_in_synpred4_Ja2609); if (state.failed) return ;
        pushFollow(FOLLOW_nonPrimitiveType_in_synpred4_Ja2611);
        nonPrimitiveType();

        state._fsp--;
        if (state.failed) return ;
        match(input,82,FOLLOW_82_in_synpred4_Ja2614); if (state.failed) return ;
        pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_synpred4_Ja2616);
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
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA48 dfa48 = new DFA48(this);
    protected DFA51 dfa51 = new DFA51(this);
    static final String DFA15_eotS =
        "\12\uffff";
    static final String DFA15_eofS =
        "\2\uffff\7\11\1\uffff";
    static final String DFA15_minS =
        "\1\31\1\uffff\7\31\1\uffff";
    static final String DFA15_maxS =
        "\1\44\1\uffff\7\133\1\uffff";
    static final String DFA15_acceptS =
        "\1\uffff\1\1\7\uffff\1\2";
    static final String DFA15_specialS =
        "\12\uffff}>";
    static final String[] DFA15_transitionS = {
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
            return "147:1: type returns [Type t] : ( nonPrimitiveType | primitiveType );";
        }
    }
    static final String DFA22_eotS =
        "\17\uffff";
    static final String DFA22_eofS =
        "\17\uffff";
    static final String DFA22_minS =
        "\11\31\1\120\2\uffff\1\120\2\31";
    static final String DFA22_maxS =
        "\1\44\10\123\1\120\2\uffff\1\120\2\123";
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
            return "189:1: formalParameterDecls[ArrayList<Type> args] : ( type variableDeclaratorId[(CommonTree)$type.tree] ( ',' formalParameterDecls[args] )? -> ^( FPARM variableDeclaratorId ) ( formalParameterDecls )? | type '...' variableDeclaratorId[(CommonTree)$type.tree] -> ^( FMULTPARM variableDeclaratorId ) );";
        }
    }
    static final String DFA26_eotS =
        "\20\uffff";
    static final String DFA26_eofS =
        "\20\uffff";
    static final String DFA26_minS =
        "\11\31\1\uffff\1\31\1\uffff\1\120\2\31\1\120";
    static final String DFA26_maxS =
        "\1\137\10\140\1\uffff\1\137\1\uffff\1\120\2\140\1\120";
    static final String DFA26_acceptS =
        "\11\uffff\1\2\1\uffff\1\1\4\uffff";
    static final String DFA26_specialS =
        "\20\uffff}>";
    static final String[] DFA26_transitionS = {
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
            return "225:1: blockStatement : ( localVariableDeclarationStatement | statement );";
        }
    }
    static final String DFA34_eotS =
        "\20\uffff";
    static final String DFA34_eofS =
        "\20\uffff";
    static final String DFA34_minS =
        "\11\31\1\uffff\1\31\1\uffff\1\120\2\31\1\120";
    static final String DFA34_maxS =
        "\1\137\10\140\1\uffff\1\137\1\uffff\1\120\2\140\1\120";
    static final String DFA34_acceptS =
        "\11\uffff\1\2\1\uffff\1\1\4\uffff";
    static final String DFA34_specialS =
        "\20\uffff}>";
    static final String[] DFA34_transitionS = {
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
            return "258:1: forInit : ( localVariableDeclaration | expressionList );";
        }
    }
    static final String DFA48_eotS =
        "\44\uffff";
    static final String DFA48_eofS =
        "\20\uffff\1\4\23\uffff";
    static final String DFA48_minS =
        "\1\31\1\uffff\1\31\2\uffff\7\117\1\63\1\uffff\1\120\2\31\2\117"+
        "\20\uffff\1\120";
    static final String DFA48_maxS =
        "\1\137\1\uffff\1\137\2\uffff\10\140\1\uffff\1\120\1\137\3\140\20"+
        "\uffff\1\120";
    static final String DFA48_acceptS =
        "\1\uffff\1\1\1\uffff\1\4\1\5\10\uffff\1\2\5\uffff\20\3\1\uffff";
    static final String DFA48_specialS =
        "\5\uffff\1\0\1\3\1\10\1\2\1\5\1\11\1\6\4\uffff\1\7\1\1\1\4\21\uffff}>";
    static final String[] DFA48_transitionS = {
            "\1\4\2\uffff\1\4\1\uffff\17\4\10\uffff\1\3\33\uffff\1\2\15"+
            "\uffff\1\1",
            "",
            "\1\14\2\uffff\1\4\1\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13"+
            "\10\4\10\uffff\1\4\17\uffff\2\4\12\uffff\1\4\13\uffff\3\4",
            "",
            "",
            "\1\16\2\uffff\1\15\15\uffff\1\4",
            "\1\16\2\uffff\1\15\15\uffff\1\4",
            "\1\16\2\uffff\1\15\15\uffff\1\4",
            "\1\16\2\uffff\1\15\15\uffff\1\4",
            "\1\16\2\uffff\1\15\15\uffff\1\4",
            "\1\16\2\uffff\1\15\15\uffff\1\4",
            "\1\16\2\uffff\1\15\15\uffff\1\4",
            "\2\4\17\uffff\5\4\6\uffff\1\17\1\uffff\1\4\1\20\1\uffff\13"+
            "\4\1\uffff\1\4",
            "",
            "\1\21",
            "\1\4\2\uffff\1\4\1\uffff\17\4\10\uffff\1\4\17\uffff\2\4\11"+
            "\uffff\1\22\1\4\13\uffff\3\4",
            "\1\31\2\uffff\1\41\1\uffff\1\32\1\33\1\34\1\35\1\36\1\37\1"+
            "\40\1\26\1\27\6\30\6\uffff\2\4\1\25\16\uffff\5\4\2\uffff\1\4"+
            "\1\uffff\4\4\1\24\1\4\1\uffff\13\4\1\23\1\4",
            "\1\16\2\uffff\1\42\15\uffff\1\4",
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
            return "336:1: unaryExpressionNotPlusMinus : ( '!' unaryExpression | ( '(' primitiveType ')' )=> '(' primitiveType ')' unaryExpression | ( '(' nonPrimitiveType ')' unaryExpressionNotPlusMinus )=> '(' nonPrimitiveType ')' unaryExpressionNotPlusMinus | NEW creator | primary ( selector )* ( '++' | '--' )? );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA48_5 = input.LA(1);

                         
                        int index48_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA48_5==82) && (synpred3_Ja())) {s = 13;}

                        else if ( (LA48_5==79) ) {s = 14;}

                        else if ( (LA48_5==96) ) {s = 4;}

                         
                        input.seek(index48_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA48_17 = input.LA(1);

                         
                        int index48_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA48_17==96) ) {s = 4;}

                        else if ( (LA48_17==79) ) {s = 14;}

                        else if ( (LA48_17==82) && (synpred4_Ja())) {s = 34;}

                         
                        input.seek(index48_17);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA48_8 = input.LA(1);

                         
                        int index48_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA48_8==79) ) {s = 14;}

                        else if ( (LA48_8==96) ) {s = 4;}

                        else if ( (LA48_8==82) && (synpred3_Ja())) {s = 13;}

                         
                        input.seek(index48_8);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA48_6 = input.LA(1);

                         
                        int index48_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA48_6==82) && (synpred3_Ja())) {s = 13;}

                        else if ( (LA48_6==79) ) {s = 14;}

                        else if ( (LA48_6==96) ) {s = 4;}

                         
                        input.seek(index48_6);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA48_18 = input.LA(1);

                         
                        int index48_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA48_18==82) && (synpred4_Ja())) {s = 34;}

                        else if ( (LA48_18==79) ) {s = 35;}

                        else if ( (LA48_18==96) ) {s = 4;}

                         
                        input.seek(index48_18);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA48_9 = input.LA(1);

                         
                        int index48_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA48_9==82) && (synpred3_Ja())) {s = 13;}

                        else if ( (LA48_9==79) ) {s = 14;}

                        else if ( (LA48_9==96) ) {s = 4;}

                         
                        input.seek(index48_9);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA48_11 = input.LA(1);

                         
                        int index48_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA48_11==79) ) {s = 14;}

                        else if ( (LA48_11==82) && (synpred3_Ja())) {s = 13;}

                        else if ( (LA48_11==96) ) {s = 4;}

                         
                        input.seek(index48_11);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA48_16 = input.LA(1);

                         
                        int index48_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA48_16==95) && (synpred4_Ja())) {s = 19;}

                        else if ( (LA48_16==81) && (synpred4_Ja())) {s = 20;}

                        else if ( (LA48_16==NEW) && (synpred4_Ja())) {s = 21;}

                        else if ( (LA48_16==THIS) && (synpred4_Ja())) {s = 22;}

                        else if ( (LA48_16==SUPER) && (synpred4_Ja())) {s = 23;}

                        else if ( ((LA48_16>=INTLITERAL && LA48_16<=NULLLITERAL)) && (synpred4_Ja())) {s = 24;}

                        else if ( (LA48_16==IDENTIFIER) && (synpred4_Ja())) {s = 25;}

                        else if ( (LA48_16==CHAR) && (synpred4_Ja())) {s = 26;}

                        else if ( (LA48_16==BYTE) && (synpred4_Ja())) {s = 27;}

                        else if ( (LA48_16==SHORT) && (synpred4_Ja())) {s = 28;}

                        else if ( (LA48_16==INT) && (synpred4_Ja())) {s = 29;}

                        else if ( (LA48_16==LONG) && (synpred4_Ja())) {s = 30;}

                        else if ( (LA48_16==FLOAT) && (synpred4_Ja())) {s = 31;}

                        else if ( (LA48_16==DOUBLE) && (synpred4_Ja())) {s = 32;}

                        else if ( (LA48_16==VOID) && (synpred4_Ja())) {s = 33;}

                        else if ( (LA48_16==EOF||(LA48_16>=INSTANCEOF && LA48_16<=COMPAREOP)||(LA48_16>=EQ && LA48_16<=SLASH)||LA48_16==75||(LA48_16>=77 && LA48_16<=80)||LA48_16==82||(LA48_16>=84 && LA48_16<=94)||LA48_16==96) ) {s = 4;}

                         
                        input.seek(index48_16);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA48_7 = input.LA(1);

                         
                        int index48_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA48_7==82) && (synpred3_Ja())) {s = 13;}

                        else if ( (LA48_7==79) ) {s = 14;}

                        else if ( (LA48_7==96) ) {s = 4;}

                         
                        input.seek(index48_7);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA48_10 = input.LA(1);

                         
                        int index48_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA48_10==79) ) {s = 14;}

                        else if ( (LA48_10==82) && (synpred3_Ja())) {s = 13;}

                        else if ( (LA48_10==96) ) {s = 4;}

                         
                        input.seek(index48_10);
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
        "\1\31\4\uffff\1\63\2\uffff\1\30\1\31\4\uffff";
    static final String DFA51_maxS =
        "\1\121\4\uffff\1\140\2\uffff\1\31\1\137\4\uffff";
    static final String DFA51_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\11\1\12\2\uffff\1\7\1\5\1\10"+
        "\1\6";
    static final String DFA51_specialS =
        "\16\uffff}>";
    static final String[] DFA51_transitionS = {
            "\1\5\2\uffff\1\7\1\uffff\7\6\1\2\1\3\6\4\44\uffff\1\1",
            "",
            "",
            "",
            "",
            "\2\13\17\uffff\5\13\2\uffff\1\13\1\uffff\2\13\1\11\1\13\1"+
            "\12\1\13\1\uffff\13\13\1\uffff\1\10",
            "",
            "",
            "\1\14\1\13",
            "\1\13\2\uffff\1\13\1\uffff\17\13\10\uffff\1\13\17\uffff\2"+
            "\13\11\uffff\1\15\1\13\13\uffff\3\13",
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
            return "349:1: primary : ( parExpression | THIS | SUPER superMemberAccess | literal | IDENTIFIER | ( IDENTIFIER -> IDENTIFIER ) ( '[' ']' -> ^( ARRAYTYPE $primary) )+ ( '.' CLASS -> ^( DOTCLASS $primary) ) | IDENTIFIER arguments -> ^( METHODCALL IDENTIFIER arguments THIS ) | IDENTIFIER '.' CLASS -> ^( DOTCLASS IDENTIFIER ) | ( primitiveType -> primitiveType ) ( '[' ']' -> ^( ARRAYTYPE $primary) )* ( '.' CLASS -> ^( DOTCLASS $primary) ) | VOID '.' CLASS -> ^( DOTCLASS VOID ) );";
        }
    }
 

    public static final BitSet FOLLOW_classDeclaration_in_compilationUnit119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_compilationUnit129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classModifier_in_classDeclaration152 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_CLASS_in_classDeclaration155 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classDeclaration158 = new BitSet(new long[]{0x0000000004000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_EXTENDS_in_classDeclaration171 = new BitSet(new long[]{0x0000001FC2000000L});
    public static final BitSet FOLLOW_type_in_classDeclaration174 = new BitSet(new long[]{0x0000000004000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_classBody_in_classDeclaration195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PUBLIC_in_classModifier222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_classBody243 = new BitSet(new long[]{0x0000000028000000L,0x0000000000002800L});
    public static final BitSet FOLLOW_classBodyDeclaration_in_classBody246 = new BitSet(new long[]{0x0000000028000000L,0x0000000000002800L});
    public static final BitSet FOLLOW_77_in_classBody249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_classBodyDeclaration269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_memberDeclaration_in_classBodyDeclaration280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifier_in_memberDeclaration304 = new BitSet(new long[]{0x0000001FC2000000L});
    public static final BitSet FOLLOW_type_in_memberDeclaration306 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_methodDeclaration_in_memberDeclaration323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldDeclaration_in_memberDeclaration345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifier_in_memberDeclaration376 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_VOID_in_memberDeclaration378 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_memberDeclaration380 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_voidMethodDeclaratorRest_in_memberDeclaration382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifier_in_memberDeclaration419 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_memberDeclaration429 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_formalParameters_in_memberDeclaration431 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_constructorBody_in_memberDeclaration433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_methodDeclaration480 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_formalParameters_in_methodDeclaration482 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_methodBody_in_methodDeclaration484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclarator_in_fieldDeclaration514 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004800L});
    public static final BitSet FOLLOW_78_in_fieldDeclaration534 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_variableDeclarator_in_fieldDeclaration538 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004800L});
    public static final BitSet FOLLOW_75_in_fieldDeclaration555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formalParameters_in_voidMethodDeclaratorRest598 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_methodBody_in_voidMethodDeclaratorRest600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_variableDeclarator626 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_EQ_in_variableDeclarator632 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_variableInitializer_in_variableDeclarator635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_variableDeclaratorId668 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_variableDeclaratorId679 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_variableDeclaratorId681 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_arrayInitializer_in_variableInitializer734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_variableInitializer744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_arrayInitializer771 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0023060L});
    public static final BitSet FOLLOW_variableInitializer_in_arrayInitializer774 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_78_in_arrayInitializer777 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_variableInitializer_in_arrayInitializer779 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_78_in_arrayInitializer784 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_arrayInitializer791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PUBLIC_in_modifier814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIVATE_in_modifier827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_typeName848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonPrimitiveType_in_type869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_type879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classType_in_nonPrimitiveType906 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_nonPrimitiveType925 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_nonPrimitiveType927 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_primitiveType_in_nonPrimitiveType956 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_nonPrimitiveType967 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_nonPrimitiveType969 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classType1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_primitiveType1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BYTE_in_primitiveType1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHORT_in_primitiveType1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_primitiveType1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_in_primitiveType1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_primitiveType1101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_primitiveType1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_formalParameters1148 = new BitSet(new long[]{0x0000001FC2000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_formalParameterDecls_in_formalParameters1150 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_formalParameters1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_formalParameterDecls1207 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_formalParameterDecls1209 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_formalParameterDecls1213 = new BitSet(new long[]{0x0000001FC2000000L});
    public static final BitSet FOLLOW_formalParameterDecls_in_formalParameterDecls1215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_formalParameterDecls1257 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_formalParameterDecls1259 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_formalParameterDecls1261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_methodBody1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_constructorBody1321 = new BitSet(new long[]{0x0023FFFFD2000000L,0x00000000E0023860L});
    public static final BitSet FOLLOW_explicitConstructorInvocation_in_constructorBody1323 = new BitSet(new long[]{0x0023FFFFD2000000L,0x00000000E0023860L});
    public static final BitSet FOLLOW_blockStatement_in_constructorBody1326 = new BitSet(new long[]{0x0023FFFFD2000000L,0x00000000E0023860L});
    public static final BitSet FOLLOW_77_in_constructorBody1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_explicitConstructorInvocation1348 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_arguments_in_explicitConstructorInvocation1356 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_explicitConstructorInvocation1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_literal0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_block1454 = new BitSet(new long[]{0x0023FFFFD2000000L,0x00000000E0023860L});
    public static final BitSet FOLLOW_blockStatement_in_block1457 = new BitSet(new long[]{0x0023FFFFD2000000L,0x00000000E0023860L});
    public static final BitSet FOLLOW_77_in_block1460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localVariableDeclarationStatement_in_blockStatement1484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_blockStatement1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localVariableDeclaration_in_localVariableDeclarationStatement1515 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_localVariableDeclarationStatement1517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_localVariableDeclaration1535 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_variableDeclarator_in_localVariableDeclaration1537 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_localVariableDeclaration1541 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_variableDeclarator_in_localVariableDeclaration1543 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_block_in_statement1584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_statement1602 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_parExpression_in_statement1604 = new BitSet(new long[]{0x0023FFFFD2000000L,0x00000000E0021860L});
    public static final BitSet FOLLOW_statement_in_statement1606 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_elseStmt_in_statement1608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_statement1639 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_statement1641 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021860L});
    public static final BitSet FOLLOW_forInit_in_statement1643 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_statement1646 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021860L});
    public static final BitSet FOLLOW_expression_in_statement1648 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_statement1651 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0061060L});
    public static final BitSet FOLLOW_forUpdate_in_statement1653 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_statement1656 = new BitSet(new long[]{0x0023FFFFD2000000L,0x00000000E0021860L});
    public static final BitSet FOLLOW_statement_in_statement1658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_statement1710 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_parExpression_in_statement1712 = new BitSet(new long[]{0x0023FFFFD2000000L,0x00000000E0021860L});
    public static final BitSet FOLLOW_statement_in_statement1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_statement1738 = new BitSet(new long[]{0x0023FFFFD2000000L,0x00000000E0021860L});
    public static final BitSet FOLLOW_statement_in_statement1740 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_WHILE_in_statement1742 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_parExpression_in_statement1744 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_statement1746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_statement1770 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021860L});
    public static final BitSet FOLLOW_expression_in_statement1773 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_statement1776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_statement1787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementExpression_in_statement1799 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_statement1801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_elseStmt1836 = new BitSet(new long[]{0x0023FFFFD2000000L,0x00000000E0021860L});
    public static final BitSet FOLLOW_statement_in_elseStmt1839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localVariableDeclaration_in_forInit1864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionList_in_forInit1874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionList_in_forUpdate1893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_parExpression1912 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_expression_in_parExpression1915 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_parExpression1917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionList1941 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_expressionList1944 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_expression_in_expressionList1946 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_expression_in_statementExpression1967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_constantExpression1990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orExpression_in_expression2012 = new BitSet(new long[]{0x0000000000000002L,0x0000000000F00010L});
    public static final BitSet FOLLOW_assignmentOperator_in_expression2018 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_expression_in_expression2020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_assignmentOperator2200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_assignmentOperator2213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_assignmentOperator2225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_assignmentOperator2237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_assignmentOperator2249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andExpression_in_orExpression2270 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_orExpression2274 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_andExpression_in_orExpression2277 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_equalityExpression_in_andExpression2299 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_andExpression2303 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_equalityExpression_in_andExpression2306 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_instanceOfExpression_in_equalityExpression2328 = new BitSet(new long[]{0x0000000000000002L,0x000000000C000000L});
    public static final BitSet FOLLOW_set_in_equalityExpression2332 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_instanceOfExpression_in_equalityExpression2341 = new BitSet(new long[]{0x0000000000000002L,0x000000000C000000L});
    public static final BitSet FOLLOW_relationalExpression_in_instanceOfExpression2363 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_INSTANCEOF_in_instanceOfExpression2366 = new BitSet(new long[]{0x0000001FC2000000L});
    public static final BitSet FOLLOW_type_in_instanceOfExpression2369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression2390 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_COMPAREOP_in_relationalExpression2394 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression2397 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression2419 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000060L});
    public static final BitSet FOLLOW_set_in_additiveExpression2423 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression2432 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000060L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression2454 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000180L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression2458 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression2473 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000180L});
    public static final BitSet FOLLOW_PLUS_in_unaryExpression2499 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression2501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unaryExpression2511 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression2513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_unaryExpression2523 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression2525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_unaryExpression2535 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression2537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression2547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_unaryExpressionNotPlusMinus2564 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus2566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_unaryExpressionNotPlusMinus2587 = new BitSet(new long[]{0x0000001FC2000000L});
    public static final BitSet FOLLOW_primitiveType_in_unaryExpressionNotPlusMinus2589 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_unaryExpressionNotPlusMinus2591 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus2593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_unaryExpressionNotPlusMinus2621 = new BitSet(new long[]{0x0000001FC2000000L});
    public static final BitSet FOLLOW_nonPrimitiveType_in_unaryExpressionNotPlusMinus2623 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_unaryExpressionNotPlusMinus2626 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpressionNotPlusMinus2628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_unaryExpressionNotPlusMinus2638 = new BitSet(new long[]{0x0000001FC2000000L});
    public static final BitSet FOLLOW_creator_in_unaryExpressionNotPlusMinus2640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_in_unaryExpressionNotPlusMinus2650 = new BitSet(new long[]{0x0000000000000002L,0x0000000160008000L});
    public static final BitSet FOLLOW_selector_in_unaryExpressionNotPlusMinus2653 = new BitSet(new long[]{0x0000000000000002L,0x0000000160008000L});
    public static final BitSet FOLLOW_set_in_unaryExpressionNotPlusMinus2657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parExpression_in_primary2717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_primary2727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUPER_in_primary2738 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_superMemberAccess_in_primary2741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primary2751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_primary2761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_primary2772 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_primary2780 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_primary2782 = new BitSet(new long[]{0x0000000000000000L,0x0000000100008000L});
    public static final BitSet FOLLOW_96_in_primary2796 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_CLASS_in_primary2798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_primary2817 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_arguments_in_primary2820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_primary2840 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_primary2842 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_CLASS_in_primary2844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_primary2863 = new BitSet(new long[]{0x0000000000000000L,0x0000000100008000L});
    public static final BitSet FOLLOW_79_in_primary2871 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_primary2873 = new BitSet(new long[]{0x0000000000000000L,0x0000000100008000L});
    public static final BitSet FOLLOW_96_in_primary2887 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_CLASS_in_primary2889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_primary2909 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_primary2911 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_CLASS_in_primary2913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_selector2944 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_selector2946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_selector2962 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_selector2964 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_arguments_in_selector2966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_selector2997 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_expression_in_selector2999 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_selector3001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_identifierSuffix3028 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_identifierSuffix3030 = new BitSet(new long[]{0x0000000000000000L,0x0000000100008000L});
    public static final BitSet FOLLOW_96_in_identifierSuffix3034 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_CLASS_in_identifierSuffix3036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arguments_in_identifierSuffix3051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_identifierSuffix3061 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_CLASS_in_identifierSuffix3063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createdName_in_creator3090 = new BitSet(new long[]{0x0000000000000000L,0x0000000000028000L});
    public static final BitSet FOLLOW_arrayCreatorRest_in_creator3093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classCreatorRest_in_creator3097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classType_in_createdName3117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_createdName3127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_arrayCreatorRest3150 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_arrayCreatorRest3151 = new BitSet(new long[]{0x0000000000000000L,0x0000000000009000L});
    public static final BitSet FOLLOW_79_in_arrayCreatorRest3154 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_arrayCreatorRest3156 = new BitSet(new long[]{0x0000000000000000L,0x0000000000009000L});
    public static final BitSet FOLLOW_arrayInitializer_in_arrayCreatorRest3160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_arrayCreatorRest3168 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_expression_in_arrayCreatorRest3170 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_arrayCreatorRest3172 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_arrayCreatorRest3175 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_expression_in_arrayCreatorRest3177 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_arrayCreatorRest3179 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_arguments_in_classCreatorRest3202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_superMemberAccess3226 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_superMemberAccess3228 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_arguments_in_superMemberAccess3230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_arguments3251 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0061060L});
    public static final BitSet FOLLOW_expressionList_in_arguments3254 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_arguments3257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_synpred2_Ja1831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_synpred3_Ja2577 = new BitSet(new long[]{0x0000001FC2000000L});
    public static final BitSet FOLLOW_primitiveType_in_synpred3_Ja2579 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_synpred3_Ja2581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_synpred4_Ja2609 = new BitSet(new long[]{0x0000001FC2000000L});
    public static final BitSet FOLLOW_nonPrimitiveType_in_synpred4_Ja2611 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_synpred4_Ja2614 = new BitSet(new long[]{0x00201FFFD2000000L,0x00000000E0021060L});
    public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_synpred4_Ja2616 = new BitSet(new long[]{0x0000000000000002L});

}