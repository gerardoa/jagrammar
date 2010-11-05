// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g 2010-11-05 19:01:52

	package jagrammar;
	
	import jagrammar.exception.*;
	import jagrammar.typehierarchy.*;
	import jagrammar.typehierarchy.exception.*;
	import jagrammar.util.*;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "METHODCALL", "CONSTRCALL", "FIELDACCESS", "ARRAYACCESS", "DOTCLASS", "ARRAYTYPE", "METHOD", "FIELD", "CONSTR", "FPARMS", "ARGUMENTS", "FPARM", "FMULTPARM", "MBODY", "CBODY", "VARDECL", "BLOCK", "STMT", "INIT", "CONDITION", "UPDATE", "DOWHILE", "THEN", "ARRAYINIT", "PREINC", "POSTINC", "PREDEC", "POSTDEC", "UNARYPLUS", "UNARYMINUS", "CAST", "CLASSBODY", "ARRAYALLOC", "ARRAYALLOCINIT", "PUBLIC", "CLASS", "IDENTIFIER", "EXTENDS", "VOID", "PRIVATE", "CHAR", "BYTE", "SHORT", "INT", "LONG", "FLOAT", "DOUBLE", "BOOLEAN", "THIS", "SUPER", "INTLITERAL", "LONGLITERAL", "FLOATLITERAL", "DOUBLELITERAL", "CHARLITERAL", "STRINGLITERAL", "BOOLEANLITERAL", "NULLLITERAL", "IF", "FOR", "WHILE", "DO", "RETURN", "ELSE", "INSTANCEOF", "COMPAREOP", "NEW", "Digit", "IntegerNumber", "LongSuffix", "Exponent", "FloatingPointLiteral", "FloatSuffix", "DoubleSuffix", "EscapeSequence", "WS", "COMMENT", "LINE_COMMENT", "EQ", "PLUS", "MINUS", "STAR", "SLASH", "Letter", "Currency", "';'", "'{'", "'}'", "','", "'('", "')'", "'+='", "'-='", "'*='", "'/='", "'||'", "'&&'", "'=='", "'!='", "'%'", "'++'", "'--'", "'!'", "'.'", "'['", "']'"
    };
    public static final int STMT=21;
    public static final int MINUS=84;
    public static final int CONSTR=12;
    public static final int ARRAYACCESS=7;
    public static final int UNARYMINUS=33;
    public static final int DOUBLE=50;
    public static final int T__109=109;
    public static final int METHOD=10;
    public static final int THEN=26;
    public static final int FPARM=15;
    public static final int IntegerNumber=72;
    public static final int ARRAYINIT=27;
    public static final int PREDEC=30;
    public static final int FIELDACCESS=6;
    public static final int PRIVATE=43;
    public static final int Letter=87;
    public static final int INTLITERAL=54;
    public static final int CONDITION=23;
    public static final int T__96=96;
    public static final int PREINC=28;
    public static final int CBODY=18;
    public static final int MBODY=17;
    public static final int STRINGLITERAL=59;
    public static final int CHARLITERAL=58;
    public static final int T__108=108;
    public static final int PLUS=83;
    public static final int ARRAYALLOC=36;
    public static final int EXTENDS=41;
    public static final int POSTDEC=31;
    public static final int UNARYPLUS=32;
    public static final int SUPER=53;
    public static final int DOUBLELITERAL=57;
    public static final int ARGUMENTS=14;
    public static final int T__89=89;
    public static final int LongSuffix=73;
    public static final int WS=79;
    public static final int CHAR=44;
    public static final int EQ=82;
    public static final int NEW=70;
    public static final int UPDATE=24;
    public static final int T__92=92;
    public static final int LINE_COMMENT=81;
    public static final int DOTCLASS=8;
    public static final int FIELD=11;
    public static final int POSTINC=29;
    public static final int ARRAYALLOCINIT=37;
    public static final int T__90=90;
    public static final int BOOLEAN=51;
    public static final int ELSE=67;
    public static final int T__91=91;
    public static final int BOOLEANLITERAL=60;
    public static final int CONSTRCALL=5;
    public static final int CLASSBODY=35;
    public static final int IDENTIFIER=40;
    public static final int T__93=93;
    public static final int SHORT=46;
    public static final int ARRAYTYPE=9;
    public static final int VARDECL=19;
    public static final int PUBLIC=38;
    public static final int LONG=48;
    public static final int Digit=71;
    public static final int T__94=94;
    public static final int T__100=100;
    public static final int T__95=95;
    public static final int FLOAT=49;
    public static final int CAST=34;
    public static final int T__101=101;
    public static final int FLOATLITERAL=56;
    public static final int INIT=22;
    public static final int FMULTPARM=16;
    public static final int T__104=104;
    public static final int T__107=107;
    public static final int DOWHILE=25;
    public static final int BLOCK=20;
    public static final int T__106=106;
    public static final int EscapeSequence=78;
    public static final int INT=47;
    public static final int COMPAREOP=69;
    public static final int VOID=42;
    public static final int INSTANCEOF=68;
    public static final int LONGLITERAL=55;
    public static final int NULLLITERAL=61;
    public static final int FloatingPointLiteral=75;
    public static final int T__98=98;
    public static final int DoubleSuffix=77;
    public static final int Exponent=74;
    public static final int FloatSuffix=76;
    public static final int DO=65;
    public static final int SLASH=86;
    public static final int WHILE=64;
    public static final int Currency=88;
    public static final int COMMENT=80;
    public static final int T__99=99;
    public static final int THIS=52;
    public static final int T__103=103;
    public static final int CLASS=39;
    public static final int METHODCALL=4;
    public static final int T__97=97;
    public static final int RETURN=66;
    public static final int T__105=105;
    public static final int BYTE=45;
    public static final int IF=62;
    public static final int FPARMS=13;
    public static final int EOF=-1;
    public static final int FOR=63;
    public static final int STAR=85;
    public static final int T__102=102;

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
    public String getGrammarFileName() { return "/Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g"; }


    	private String fileName = "Test";  // inizializzazione per ANTLRWORKS
    	private ErrorLogger errorLog;        
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
        	
        	public void setFileName(String fileName) {
        		this.fileName = fileName;
        	}
        	
        	public void setErrorLogger(ErrorLogger el) {
        		this.errorLog = el;
        	}
        	
        	@Override
        	public void emitErrorMessage(String msg) {
    		errorLog.add(msg);
        	}


    public static class compilationUnit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "compilationUnit"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:78:1: compilationUnit : ( classDeclaration | ';' );
    public final JaParser.compilationUnit_return compilationUnit() throws RecognitionException {
        JaParser.compilationUnit_return retval = new JaParser.compilationUnit_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal2=null;
        JaParser.classDeclaration_return classDeclaration1 = null;


        Object char_literal2_tree=null;

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:79:5: ( classDeclaration | ';' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==PUBLIC) ) {
                alt1=1;
            }
            else if ( (LA1_0==89) ) {
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
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:79:9: classDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_classDeclaration_in_compilationUnit184);
                    classDeclaration1=classDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(classDeclaration1.getTree(), root_0);

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:80:9: ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal2=(Token)match(input,89,FOLLOW_89_in_compilationUnit196); if (state.failed) return retval;
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
         
        	catch (RecognitionException e) { 
        		throw e; 
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:83:1: classDeclaration : PUBLIC CLASS IDENTIFIER ( EXTENDS classType )? classBody ;
    public final JaParser.classDeclaration_return classDeclaration() throws RecognitionException {
        JaParser.classDeclaration_return retval = new JaParser.classDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PUBLIC3=null;
        Token CLASS4=null;
        Token IDENTIFIER5=null;
        Token EXTENDS6=null;
        JaParser.classType_return classType7 = null;

        JaParser.classBody_return classBody8 = null;


        Object PUBLIC3_tree=null;
        Object CLASS4_tree=null;
        Object IDENTIFIER5_tree=null;
        Object EXTENDS6_tree=null;

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:84:5: ( PUBLIC CLASS IDENTIFIER ( EXTENDS classType )? classBody )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:84:9: PUBLIC CLASS IDENTIFIER ( EXTENDS classType )? classBody
            {
            root_0 = (Object)adaptor.nil();

            PUBLIC3=(Token)match(input,PUBLIC,FOLLOW_PUBLIC_in_classDeclaration219); if (state.failed) return retval;
            CLASS4=(Token)match(input,CLASS,FOLLOW_CLASS_in_classDeclaration222); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CLASS4_tree = (Object)adaptor.create(CLASS4);
            root_0 = (Object)adaptor.becomeRoot(CLASS4_tree, root_0);
            }
            IDENTIFIER5=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classDeclaration225); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER5_tree = (Object)adaptor.create(IDENTIFIER5);
            adaptor.addChild(root_0, IDENTIFIER5_tree);
            }
            if ( state.backtracking==0 ) {
               if (!fileName.equals((IDENTIFIER5!=null?IDENTIFIER5.getText():null))) {
                  	  	errorLog.add(new MismatchedClassNameException((IDENTIFIER5!=null?IDENTIFIER5.getText():null), (IDENTIFIER5!=null?IDENTIFIER5.getLine():0), (IDENTIFIER5!=null?IDENTIFIER5.getCharPositionInLine():0)));
                  	  }
                  	  // Potrebbe gia' esistere l'istanza prima che abbia analizzato il file .java
                  	  // Aggiunta effettuata dalla regola classType per recuperare subito l'istanza della classe anche se priva di interfaccia
              	  if(cTab.containsKey(fileName)) {
              	  	rt = cTab.get(fileName);
              	  } else { // crea una nuova istanza per la classe e la aggiunge alla tabella
              	  	rt = new ReferenceType(fileName);
              	  	cTab.put(fileName, rt);
              	  }
              	
            }
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:97:9: ( EXTENDS classType )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==EXTENDS) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:97:10: EXTENDS classType
                    {
                    EXTENDS6=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_classDeclaration244); if (state.failed) return retval;
                    pushFollow(FOLLOW_classType_in_classDeclaration247);
                    classType7=classType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classType7.getTree());
                    if ( state.backtracking==0 ) {
                       try { rt.addSuperType((classType7!=null?classType7.t:null)); } catch(CyclicInheritanceException ex) { errorLog.add(ex, (EXTENDS6!=null?EXTENDS6.getLine():0), (EXTENDS6!=null?EXTENDS6.getCharPositionInLine():0)); } 
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_classBody_in_classDeclaration266);
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
         
        	catch (RecognitionException e) { 
        		throw e; 
        	} 
        finally {
        }
        return retval;
    }
    // $ANTLR end "classDeclaration"

    public static class classBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classBody"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:101:1: classBody : '{' ( classBodyDeclaration )* '}' -> ^( CLASSBODY ( classBodyDeclaration )* ) ;
    public final JaParser.classBody_return classBody() throws RecognitionException {
        JaParser.classBody_return retval = new JaParser.classBody_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal9=null;
        Token char_literal11=null;
        JaParser.classBodyDeclaration_return classBodyDeclaration10 = null;


        Object char_literal9_tree=null;
        Object char_literal11_tree=null;
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleSubtreeStream stream_classBodyDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule classBodyDeclaration");
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:102:5: ( '{' ( classBodyDeclaration )* '}' -> ^( CLASSBODY ( classBodyDeclaration )* ) )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:102:9: '{' ( classBodyDeclaration )* '}'
            {
            char_literal9=(Token)match(input,90,FOLLOW_90_in_classBody287); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_90.add(char_literal9);

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:102:13: ( classBodyDeclaration )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==PUBLIC||LA3_0==PRIVATE||LA3_0==89) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:102:13: classBodyDeclaration
            	    {
            	    pushFollow(FOLLOW_classBodyDeclaration_in_classBody289);
            	    classBodyDeclaration10=classBodyDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_classBodyDeclaration.add(classBodyDeclaration10.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            char_literal11=(Token)match(input,91,FOLLOW_91_in_classBody292); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_91.add(char_literal11);



            // AST REWRITE
            // elements: classBodyDeclaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 102:39: -> ^( CLASSBODY ( classBodyDeclaration )* )
            {
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:102:42: ^( CLASSBODY ( classBodyDeclaration )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CLASSBODY, "CLASSBODY"), root_1);

                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:102:54: ( classBodyDeclaration )*
                while ( stream_classBodyDeclaration.hasNext() ) {
                    adaptor.addChild(root_1, stream_classBodyDeclaration.nextTree());

                }
                stream_classBodyDeclaration.reset();

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
         
        	catch (RecognitionException e) { 
        		throw e; 
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:105:1: classBodyDeclaration : ( ';' | memberDeclaration );
    public final JaParser.classBodyDeclaration_return classBodyDeclaration() throws RecognitionException {
        JaParser.classBodyDeclaration_return retval = new JaParser.classBodyDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal12=null;
        JaParser.memberDeclaration_return memberDeclaration13 = null;


        Object char_literal12_tree=null;

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:106:5: ( ';' | memberDeclaration )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==89) ) {
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
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:106:9: ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal12=(Token)match(input,89,FOLLOW_89_in_classBodyDeclaration320); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:107:9: memberDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_memberDeclaration_in_classBodyDeclaration331);
                    memberDeclaration13=memberDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, memberDeclaration13.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
         
        	catch (RecognitionException e) { 
        		throw e; 
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:110:1: memberDeclaration : (m= modifier t= type IDENTIFIER formalParameters bracketsOpt[(CommonTree)$t.tree] methodBody -> ^( METHOD modifier bracketsOpt IDENTIFIER ( formalParameters )? methodBody ) | m= modifier t= type fieldDeclaration[(CommonTree)$m.tree, (CommonTree)$t.tree, $m.pub, $t.t] | m= modifier VOID IDENTIFIER formalParameters methodBody -> ^( METHOD modifier VOID IDENTIFIER ( formalParameters )? methodBody ) | modifier IDENTIFIER formalParameters constructorBody -> ^( CONSTR modifier IDENTIFIER ( formalParameters )? ( constructorBody )? ) );
    public final JaParser.memberDeclaration_return memberDeclaration() throws RecognitionException {
        JaParser.memberDeclaration_return retval = new JaParser.memberDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENTIFIER14=null;
        Token VOID19=null;
        Token IDENTIFIER20=null;
        Token IDENTIFIER24=null;
        JaParser.modifier_return m = null;

        JaParser.type_return t = null;

        JaParser.formalParameters_return formalParameters15 = null;

        JaParser.bracketsOpt_return bracketsOpt16 = null;

        JaParser.methodBody_return methodBody17 = null;

        JaParser.fieldDeclaration_return fieldDeclaration18 = null;

        JaParser.formalParameters_return formalParameters21 = null;

        JaParser.methodBody_return methodBody22 = null;

        JaParser.modifier_return modifier23 = null;

        JaParser.formalParameters_return formalParameters25 = null;

        JaParser.constructorBody_return constructorBody26 = null;


        Object IDENTIFIER14_tree=null;
        Object VOID19_tree=null;
        Object IDENTIFIER20_tree=null;
        Object IDENTIFIER24_tree=null;
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_VOID=new RewriteRuleTokenStream(adaptor,"token VOID");
        RewriteRuleSubtreeStream stream_bracketsOpt=new RewriteRuleSubtreeStream(adaptor,"rule bracketsOpt");
        RewriteRuleSubtreeStream stream_formalParameters=new RewriteRuleSubtreeStream(adaptor,"rule formalParameters");
        RewriteRuleSubtreeStream stream_methodBody=new RewriteRuleSubtreeStream(adaptor,"rule methodBody");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        RewriteRuleSubtreeStream stream_modifier=new RewriteRuleSubtreeStream(adaptor,"rule modifier");
        RewriteRuleSubtreeStream stream_constructorBody=new RewriteRuleSubtreeStream(adaptor,"rule constructorBody");
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:111:5: (m= modifier t= type IDENTIFIER formalParameters bracketsOpt[(CommonTree)$t.tree] methodBody -> ^( METHOD modifier bracketsOpt IDENTIFIER ( formalParameters )? methodBody ) | m= modifier t= type fieldDeclaration[(CommonTree)$m.tree, (CommonTree)$t.tree, $m.pub, $t.t] | m= modifier VOID IDENTIFIER formalParameters methodBody -> ^( METHOD modifier VOID IDENTIFIER ( formalParameters )? methodBody ) | modifier IDENTIFIER formalParameters constructorBody -> ^( CONSTR modifier IDENTIFIER ( formalParameters )? ( constructorBody )? ) )
            int alt5=4;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:111:9: m= modifier t= type IDENTIFIER formalParameters bracketsOpt[(CommonTree)$t.tree] methodBody
                    {
                    pushFollow(FOLLOW_modifier_in_memberDeclaration356);
                    m=modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_modifier.add(m.getTree());
                    pushFollow(FOLLOW_type_in_memberDeclaration360);
                    t=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(t.getTree());
                    IDENTIFIER14=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_memberDeclaration362); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER14);

                    pushFollow(FOLLOW_formalParameters_in_memberDeclaration364);
                    formalParameters15=formalParameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formalParameters.add(formalParameters15.getTree());
                    pushFollow(FOLLOW_bracketsOpt_in_memberDeclaration366);
                    bracketsOpt16=bracketsOpt((CommonTree)(t!=null?((Object)t.tree):null));

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_bracketsOpt.add(bracketsOpt16.getTree());
                    pushFollow(FOLLOW_methodBody_in_memberDeclaration369);
                    methodBody17=methodBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_methodBody.add(methodBody17.getTree());
                    if ( state.backtracking==0 ) {
                       Type typ = ParserHelper.createArrayType((t!=null?t.t:null), (bracketsOpt16!=null?bracketsOpt16.arrayDim:0));
                          	  try { rt.addMethod((m!=null?m.pub:false), typ, (IDENTIFIER14!=null?IDENTIFIER14.getText():null), (formalParameters15!=null?formalParameters15.args:null)); } catch(UnacceptableMethodException ex) { errorLog.add(ex, (IDENTIFIER14!=null?IDENTIFIER14.getLine():0), (IDENTIFIER14!=null?IDENTIFIER14.getCharPositionInLine():0)); } 
                          	
                    }


                    // AST REWRITE
                    // elements: methodBody, IDENTIFIER, modifier, formalParameters, bracketsOpt
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 115:6: -> ^( METHOD modifier bracketsOpt IDENTIFIER ( formalParameters )? methodBody )
                    {
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:115:9: ^( METHOD modifier bracketsOpt IDENTIFIER ( formalParameters )? methodBody )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(METHOD, "METHOD"), root_1);

                        adaptor.addChild(root_1, stream_modifier.nextTree());
                        adaptor.addChild(root_1, stream_bracketsOpt.nextTree());
                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:115:50: ( formalParameters )?
                        if ( stream_formalParameters.hasNext() ) {
                            adaptor.addChild(root_1, stream_formalParameters.nextTree());

                        }
                        stream_formalParameters.reset();
                        adaptor.addChild(root_1, stream_methodBody.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:117:9: m= modifier t= type fieldDeclaration[(CommonTree)$m.tree, (CommonTree)$t.tree, $m.pub, $t.t]
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_modifier_in_memberDeclaration423);
                    m=modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_memberDeclaration428);
                    t=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_fieldDeclaration_in_memberDeclaration431);
                    fieldDeclaration18=fieldDeclaration((CommonTree)(m!=null?((Object)m.tree):null), (CommonTree)(t!=null?((Object)t.tree):null), (m!=null?m.pub:false), (t!=null?t.t:null));

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fieldDeclaration18.getTree());

                    }
                    break;
                case 3 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:119:9: m= modifier VOID IDENTIFIER formalParameters methodBody
                    {
                    pushFollow(FOLLOW_modifier_in_memberDeclaration456);
                    m=modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_modifier.add(m.getTree());
                    VOID19=(Token)match(input,VOID,FOLLOW_VOID_in_memberDeclaration458); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VOID.add(VOID19);

                    IDENTIFIER20=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_memberDeclaration460); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER20);

                    pushFollow(FOLLOW_formalParameters_in_memberDeclaration462);
                    formalParameters21=formalParameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formalParameters.add(formalParameters21.getTree());
                    pushFollow(FOLLOW_methodBody_in_memberDeclaration464);
                    methodBody22=methodBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_methodBody.add(methodBody22.getTree());
                    if ( state.backtracking==0 ) {
                       try { rt.addMethod((m!=null?m.pub:false), VoidType.TYPE, (IDENTIFIER20!=null?IDENTIFIER20.getText():null), (formalParameters21!=null?formalParameters21.args:null)); } catch(UnacceptableMethodException ex) { errorLog.add(ex, (IDENTIFIER20!=null?IDENTIFIER20.getLine():0), (IDENTIFIER20!=null?IDENTIFIER20.getCharPositionInLine():0)); } 
                    }


                    // AST REWRITE
                    // elements: methodBody, IDENTIFIER, formalParameters, VOID, modifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 121:6: -> ^( METHOD modifier VOID IDENTIFIER ( formalParameters )? methodBody )
                    {
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:121:9: ^( METHOD modifier VOID IDENTIFIER ( formalParameters )? methodBody )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(METHOD, "METHOD"), root_1);

                        adaptor.addChild(root_1, stream_modifier.nextTree());
                        adaptor.addChild(root_1, stream_VOID.nextNode());
                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:121:43: ( formalParameters )?
                        if ( stream_formalParameters.hasNext() ) {
                            adaptor.addChild(root_1, stream_formalParameters.nextTree());

                        }
                        stream_formalParameters.reset();
                        adaptor.addChild(root_1, stream_methodBody.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:123:9: modifier IDENTIFIER formalParameters constructorBody
                    {
                    pushFollow(FOLLOW_modifier_in_memberDeclaration513);
                    modifier23=modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_modifier.add(modifier23.getTree());
                    IDENTIFIER24=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_memberDeclaration515); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER24);

                    pushFollow(FOLLOW_formalParameters_in_memberDeclaration517);
                    formalParameters25=formalParameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formalParameters.add(formalParameters25.getTree());
                    pushFollow(FOLLOW_constructorBody_in_memberDeclaration519);
                    constructorBody26=constructorBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_constructorBody.add(constructorBody26.getTree());
                    if ( state.backtracking==0 ) {
                       if(rt.getName().equals((IDENTIFIER24!=null?IDENTIFIER24.getText():null)))
                          		try { rt.addConstructor((modifier23!=null?modifier23.pub:false), (formalParameters25!=null?formalParameters25.args:null)); } catch(UnacceptableConstructorException ex) { errorLog.add(ex, (IDENTIFIER24!=null?IDENTIFIER24.getLine():0), (IDENTIFIER24!=null?IDENTIFIER24.getCharPositionInLine():0)); } 
                         	  else 
                         	  	errorLog.add(new InvalidMethodDeclarationException((IDENTIFIER24!=null?IDENTIFIER24.getLine():0), (IDENTIFIER24!=null?IDENTIFIER24.getCharPositionInLine():0)));
                          	
                    }


                    // AST REWRITE
                    // elements: formalParameters, constructorBody, IDENTIFIER, modifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 129:6: -> ^( CONSTR modifier IDENTIFIER ( formalParameters )? ( constructorBody )? )
                    {
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:129:9: ^( CONSTR modifier IDENTIFIER ( formalParameters )? ( constructorBody )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONSTR, "CONSTR"), root_1);

                        adaptor.addChild(root_1, stream_modifier.nextTree());
                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:129:38: ( formalParameters )?
                        if ( stream_formalParameters.hasNext() ) {
                            adaptor.addChild(root_1, stream_formalParameters.nextTree());

                        }
                        stream_formalParameters.reset();
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:129:56: ( constructorBody )?
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
         
        	catch (RecognitionException e) { 
        		throw e; 
        	} 
        finally {
        }
        return retval;
    }
    // $ANTLR end "memberDeclaration"

    public static class fieldDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fieldDeclaration"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:132:1: fieldDeclaration[CommonTree mod, CommonTree typ, boolean pub, Type t] : v1= variableDeclarator[$typ] ( ',' v2= variableDeclarator[(CommonTree)$typ.dupNode()] )* ';' -> ( ^( FIELD variableDeclarator ) )+ ;
    public final JaParser.fieldDeclaration_return fieldDeclaration(CommonTree mod, CommonTree typ, boolean pub, Type t) throws RecognitionException {
        JaParser.fieldDeclaration_return retval = new JaParser.fieldDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal27=null;
        Token char_literal28=null;
        JaParser.variableDeclarator_return v1 = null;

        JaParser.variableDeclarator_return v2 = null;


        Object char_literal27_tree=null;
        Object char_literal28_tree=null;
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
        RewriteRuleSubtreeStream stream_variableDeclarator=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclarator");
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:133:5: (v1= variableDeclarator[$typ] ( ',' v2= variableDeclarator[(CommonTree)$typ.dupNode()] )* ';' -> ( ^( FIELD variableDeclarator ) )+ )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:133:9: v1= variableDeclarator[$typ] ( ',' v2= variableDeclarator[(CommonTree)$typ.dupNode()] )* ';'
            {
            pushFollow(FOLLOW_variableDeclarator_in_fieldDeclaration570);
            v1=variableDeclarator(typ);

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variableDeclarator.add(v1.getTree());
            if ( state.backtracking==0 ) {
               try { rt.addField((v1!=null?v1.varName:null), ParserHelper.createArrayType(t, (v1!=null?v1.arrayDim:0)), pub); } catch(UnacceptableFieldException ex) { errorLog.add(ex, (v1!=null?((Token)v1.start):null).getLine(), (v1!=null?((Token)v1.start):null).getCharPositionInLine()); } 
            }
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:134:9: ( ',' v2= variableDeclarator[(CommonTree)$typ.dupNode()] )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==92) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:134:10: ',' v2= variableDeclarator[(CommonTree)$typ.dupNode()]
            	    {
            	    char_literal27=(Token)match(input,92,FOLLOW_92_in_fieldDeclaration590); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_92.add(char_literal27);

            	    pushFollow(FOLLOW_variableDeclarator_in_fieldDeclaration594);
            	    v2=variableDeclarator((CommonTree)typ.dupNode());

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_variableDeclarator.add(v2.getTree());
            	    if ( state.backtracking==0 ) {
            	       try { rt.addField((v2!=null?v2.varName:null), ParserHelper.createArrayType(t, (v2!=null?v2.arrayDim:0)), pub); } catch(UnacceptableFieldException ex) { errorLog.add(ex, (v2!=null?((Token)v2.start):null).getLine(), (v2!=null?((Token)v2.start):null).getCharPositionInLine()); } 
            	    }

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            char_literal28=(Token)match(input,89,FOLLOW_89_in_fieldDeclaration611); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_89.add(char_literal28);



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
            // 136:9: -> ( ^( FIELD variableDeclarator ) )+
            {
                if ( !(stream_variableDeclarator.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_variableDeclarator.hasNext() ) {
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:136:12: ^( FIELD variableDeclarator )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FIELD, "FIELD"), root_1);

                    adaptor.addChild(root_1, mod.dupNode());
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
         
        	catch (RecognitionException e) { 
        		throw e; 
        	} 
        finally {
        }
        return retval;
    }
    // $ANTLR end "fieldDeclaration"

    public static class variableDeclarator_return extends ParserRuleReturnScope {
        public String varName;
        public int arrayDim;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variableDeclarator"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:139:1: variableDeclarator[CommonTree typ] returns [String varName, int arrayDim] : variableDeclaratorId[$typ] ( '=' variableInitializer )? ;
    public final JaParser.variableDeclarator_return variableDeclarator(CommonTree typ) throws RecognitionException {
        JaParser.variableDeclarator_return retval = new JaParser.variableDeclarator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal30=null;
        JaParser.variableDeclaratorId_return variableDeclaratorId29 = null;

        JaParser.variableInitializer_return variableInitializer31 = null;


        Object char_literal30_tree=null;

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:140:5: ( variableDeclaratorId[$typ] ( '=' variableInitializer )? )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:140:9: variableDeclaratorId[$typ] ( '=' variableInitializer )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_variableDeclaratorId_in_variableDeclarator656);
            variableDeclaratorId29=variableDeclaratorId(typ);

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaratorId29.getTree());
            if ( state.backtracking==0 ) {
               retval.varName = (variableDeclaratorId29!=null?variableDeclaratorId29.varName:null); retval.arrayDim = (variableDeclaratorId29!=null?variableDeclaratorId29.arrayDim:0); 
            }
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:140:126: ( '=' variableInitializer )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==EQ) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:140:127: '=' variableInitializer
                    {
                    char_literal30=(Token)match(input,EQ,FOLLOW_EQ_in_variableDeclarator662); if (state.failed) return retval;
                    pushFollow(FOLLOW_variableInitializer_in_variableDeclarator665);
                    variableInitializer31=variableInitializer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableInitializer31.getTree());

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
         
        	catch (RecognitionException e) { 
        		throw e; 
        	} 
        finally {
        }
        return retval;
    }
    // $ANTLR end "variableDeclarator"

    public static class variableDeclaratorId_return extends ParserRuleReturnScope {
        public String varName;
        public int arrayDim;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variableDeclaratorId"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:143:1: variableDeclaratorId[CommonTree typ] returns [String varName, int arrayDim] : IDENTIFIER bracketsOpt[$typ] -> bracketsOpt IDENTIFIER ;
    public final JaParser.variableDeclaratorId_return variableDeclaratorId(CommonTree typ) throws RecognitionException {
        JaParser.variableDeclaratorId_return retval = new JaParser.variableDeclaratorId_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENTIFIER32=null;
        JaParser.bracketsOpt_return bracketsOpt33 = null;


        Object IDENTIFIER32_tree=null;
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_bracketsOpt=new RewriteRuleSubtreeStream(adaptor,"rule bracketsOpt");
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:144:5: ( IDENTIFIER bracketsOpt[$typ] -> bracketsOpt IDENTIFIER )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:144:9: IDENTIFIER bracketsOpt[$typ]
            {
            IDENTIFIER32=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variableDeclaratorId697); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER32);

            pushFollow(FOLLOW_bracketsOpt_in_variableDeclaratorId699);
            bracketsOpt33=bracketsOpt(typ);

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bracketsOpt.add(bracketsOpt33.getTree());
            if ( state.backtracking==0 ) {
               retval.varName = (IDENTIFIER32!=null?IDENTIFIER32.getText():null); retval.arrayDim = (bracketsOpt33!=null?bracketsOpt33.arrayDim:0); 
            }


            // AST REWRITE
            // elements: IDENTIFIER, bracketsOpt
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 146:6: -> bracketsOpt IDENTIFIER
            {
                adaptor.addChild(root_0, stream_bracketsOpt.nextTree());
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
         
        	catch (RecognitionException e) { 
        		throw e; 
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:149:1: variableInitializer : ( arrayInitializer | expression );
    public final JaParser.variableInitializer_return variableInitializer() throws RecognitionException {
        JaParser.variableInitializer_return retval = new JaParser.variableInitializer_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.arrayInitializer_return arrayInitializer34 = null;

        JaParser.expression_return expression35 = null;



        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:150:5: ( arrayInitializer | expression )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==90) ) {
                alt8=1;
            }
            else if ( (LA8_0==IDENTIFIER||LA8_0==VOID||(LA8_0>=CHAR && LA8_0<=NULLLITERAL)||LA8_0==NEW||(LA8_0>=PLUS && LA8_0<=MINUS)||LA8_0==93||(LA8_0>=104 && LA8_0<=106)) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:150:9: arrayInitializer
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_arrayInitializer_in_variableInitializer739);
                    arrayInitializer34=arrayInitializer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayInitializer34.getTree());

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:151:9: expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expression_in_variableInitializer749);
                    expression35=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression35.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
         
        	catch (RecognitionException e) { 
        		throw e; 
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:154:1: arrayInitializer : lc= '{' ( variableInitializer ( ',' variableInitializer )* ( ',' )? )? '}' -> ^( ARRAYINIT[$lc, \"ARRAYINIT\"] ( variableInitializer )* ) ;
    public final JaParser.arrayInitializer_return arrayInitializer() throws RecognitionException {
        JaParser.arrayInitializer_return retval = new JaParser.arrayInitializer_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lc=null;
        Token char_literal37=null;
        Token char_literal39=null;
        Token char_literal40=null;
        JaParser.variableInitializer_return variableInitializer36 = null;

        JaParser.variableInitializer_return variableInitializer38 = null;


        Object lc_tree=null;
        Object char_literal37_tree=null;
        Object char_literal39_tree=null;
        Object char_literal40_tree=null;
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleSubtreeStream stream_variableInitializer=new RewriteRuleSubtreeStream(adaptor,"rule variableInitializer");
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:155:5: (lc= '{' ( variableInitializer ( ',' variableInitializer )* ( ',' )? )? '}' -> ^( ARRAYINIT[$lc, \"ARRAYINIT\"] ( variableInitializer )* ) )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:155:9: lc= '{' ( variableInitializer ( ',' variableInitializer )* ( ',' )? )? '}'
            {
            lc=(Token)match(input,90,FOLLOW_90_in_arrayInitializer778); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_90.add(lc);

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:155:16: ( variableInitializer ( ',' variableInitializer )* ( ',' )? )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==IDENTIFIER||LA11_0==VOID||(LA11_0>=CHAR && LA11_0<=NULLLITERAL)||LA11_0==NEW||(LA11_0>=PLUS && LA11_0<=MINUS)||LA11_0==90||LA11_0==93||(LA11_0>=104 && LA11_0<=106)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:155:17: variableInitializer ( ',' variableInitializer )* ( ',' )?
                    {
                    pushFollow(FOLLOW_variableInitializer_in_arrayInitializer781);
                    variableInitializer36=variableInitializer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_variableInitializer.add(variableInitializer36.getTree());
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:155:37: ( ',' variableInitializer )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==92) ) {
                            int LA9_1 = input.LA(2);

                            if ( (LA9_1==IDENTIFIER||LA9_1==VOID||(LA9_1>=CHAR && LA9_1<=NULLLITERAL)||LA9_1==NEW||(LA9_1>=PLUS && LA9_1<=MINUS)||LA9_1==90||LA9_1==93||(LA9_1>=104 && LA9_1<=106)) ) {
                                alt9=1;
                            }


                        }


                        switch (alt9) {
                    	case 1 :
                    	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:155:38: ',' variableInitializer
                    	    {
                    	    char_literal37=(Token)match(input,92,FOLLOW_92_in_arrayInitializer784); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_92.add(char_literal37);

                    	    pushFollow(FOLLOW_variableInitializer_in_arrayInitializer786);
                    	    variableInitializer38=variableInitializer();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_variableInitializer.add(variableInitializer38.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:155:64: ( ',' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==92) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:155:65: ','
                            {
                            char_literal39=(Token)match(input,92,FOLLOW_92_in_arrayInitializer791); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_92.add(char_literal39);


                            }
                            break;

                    }


                    }
                    break;

            }

            char_literal40=(Token)match(input,91,FOLLOW_91_in_arrayInitializer798); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_91.add(char_literal40);



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
            // 155:78: -> ^( ARRAYINIT[$lc, \"ARRAYINIT\"] ( variableInitializer )* )
            {
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:155:81: ^( ARRAYINIT[$lc, \"ARRAYINIT\"] ( variableInitializer )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAYINIT, lc, "ARRAYINIT"), root_1);

                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:155:111: ( variableInitializer )*
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
         
        	catch (RecognitionException e) { 
        		throw e; 
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:158:1: modifier returns [boolean pub] : ( PUBLIC | PRIVATE );
    public final JaParser.modifier_return modifier() throws RecognitionException {
        JaParser.modifier_return retval = new JaParser.modifier_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PUBLIC41=null;
        Token PRIVATE42=null;

        Object PUBLIC41_tree=null;
        Object PRIVATE42_tree=null;

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:159:5: ( PUBLIC | PRIVATE )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==PUBLIC) ) {
                alt12=1;
            }
            else if ( (LA12_0==PRIVATE) ) {
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
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:159:9: PUBLIC
                    {
                    root_0 = (Object)adaptor.nil();

                    PUBLIC41=(Token)match(input,PUBLIC,FOLLOW_PUBLIC_in_modifier832); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PUBLIC41_tree = (Object)adaptor.create(PUBLIC41);
                    adaptor.addChild(root_0, PUBLIC41_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.pub = true;  
                    }

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:160:9: PRIVATE
                    {
                    root_0 = (Object)adaptor.nil();

                    PRIVATE42=(Token)match(input,PRIVATE,FOLLOW_PRIVATE_in_modifier845); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PRIVATE42_tree = (Object)adaptor.create(PRIVATE42);
                    adaptor.addChild(root_0, PRIVATE42_tree);
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
         
        	catch (RecognitionException e) { 
        		throw e; 
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:163:1: type returns [Type t] : ( primitiveType | classType | arrayType );
    public final JaParser.type_return type() throws RecognitionException {
        JaParser.type_return retval = new JaParser.type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.primitiveType_return primitiveType43 = null;

        JaParser.classType_return classType44 = null;

        JaParser.arrayType_return arrayType45 = null;



        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:164:5: ( primitiveType | classType | arrayType )
            int alt13=3;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:164:7: primitiveType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primitiveType_in_type868);
                    primitiveType43=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType43.getTree());
                    if ( state.backtracking==0 ) {
                       retval.t = (primitiveType43!=null?primitiveType43.bs:null); 
                    }

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:165:7: classType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_classType_in_type878);
                    classType44=classType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classType44.getTree());
                    if ( state.backtracking==0 ) {
                       retval.t = (classType44!=null?classType44.t:null);      
                    }

                    }
                    break;
                case 3 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:166:7: arrayType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_arrayType_in_type892);
                    arrayType45=arrayType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayType45.getTree());
                    if ( state.backtracking==0 ) {
                       retval.t = (arrayType45!=null?arrayType45.t:null);      
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
         
        	catch (RecognitionException e) { 
        		throw e; 
        	} 
        finally {
        }
        return retval;
    }
    // $ANTLR end "type"

    public static class arrayType_return extends ParserRuleReturnScope {
        public ArrayType t;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arrayType"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:169:1: arrayType returns [ArrayType t] : ( primitiveType brackets[(CommonTree)$primitiveType.tree] | classType brackets[(CommonTree)$classType.tree] );
    public final JaParser.arrayType_return arrayType() throws RecognitionException {
        JaParser.arrayType_return retval = new JaParser.arrayType_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.primitiveType_return primitiveType46 = null;

        JaParser.brackets_return brackets47 = null;

        JaParser.classType_return classType48 = null;

        JaParser.brackets_return brackets49 = null;



        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:170:5: ( primitiveType brackets[(CommonTree)$primitiveType.tree] | classType brackets[(CommonTree)$classType.tree] )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=CHAR && LA14_0<=BOOLEAN)) ) {
                alt14=1;
            }
            else if ( (LA14_0==IDENTIFIER) ) {
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
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:170:9: primitiveType brackets[(CommonTree)$primitiveType.tree]
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primitiveType_in_arrayType922);
                    primitiveType46=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_brackets_in_arrayType925);
                    brackets47=brackets((CommonTree)(primitiveType46!=null?((Object)primitiveType46.tree):null));

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, brackets47.getTree());
                    if ( state.backtracking==0 ) {
                       retval.t = (ArrayType)ParserHelper.createArrayType((primitiveType46!=null?primitiveType46.bs:null), (brackets47!=null?brackets47.arrayDim:0)); 
                    }

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:173:9: classType brackets[(CommonTree)$classType.tree]
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_classType_in_arrayType945);
                    classType48=classType();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_brackets_in_arrayType952);
                    brackets49=brackets((CommonTree)(classType48!=null?((Object)classType48.tree):null));

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, brackets49.getTree());
                    if ( state.backtracking==0 ) {
                       retval.t = (ArrayType)ParserHelper.createArrayType((classType48!=null?classType48.t:null), (brackets49!=null?brackets49.arrayDim:0));      
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
         
        	catch (RecognitionException e) { 
        		throw e; 
        	} 
        finally {
        }
        return retval;
    }
    // $ANTLR end "arrayType"

    public static class classType_return extends ParserRuleReturnScope {
        public ReferenceType t;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classType"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:177:1: classType returns [ReferenceType t] : IDENTIFIER ;
    public final JaParser.classType_return classType() throws RecognitionException {
        JaParser.classType_return retval = new JaParser.classType_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENTIFIER50=null;

        Object IDENTIFIER50_tree=null;

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:178:5: ( IDENTIFIER )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:178:7: IDENTIFIER
            {
            root_0 = (Object)adaptor.nil();

            IDENTIFIER50=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classType979); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER50_tree = (Object)adaptor.create(IDENTIFIER50);
            adaptor.addChild(root_0, IDENTIFIER50_tree);
            }
            if ( state.backtracking==0 ) {
               if(cTab.containsKey((IDENTIFIER50!=null?IDENTIFIER50.getText():null))) {
                      	     	retval.t = cTab.get((IDENTIFIER50!=null?IDENTIFIER50.getText():null));
                     		     } else {
              		     	retval.t = new ReferenceType((IDENTIFIER50!=null?IDENTIFIER50.getText():null));
              			cTab.put((IDENTIFIER50!=null?IDENTIFIER50.getText():null), retval.t);
              			todo.add((IDENTIFIER50!=null?IDENTIFIER50.getText():null));	
                     		     }
                     		   
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
         
        	catch (RecognitionException e) { 
        		throw e; 
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:188:1: primitiveType returns [BasicType bs] : ( CHAR | BYTE | SHORT | INT | LONG | FLOAT | DOUBLE | BOOLEAN );
    public final JaParser.primitiveType_return primitiveType() throws RecognitionException {
        JaParser.primitiveType_return retval = new JaParser.primitiveType_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CHAR51=null;
        Token BYTE52=null;
        Token SHORT53=null;
        Token INT54=null;
        Token LONG55=null;
        Token FLOAT56=null;
        Token DOUBLE57=null;
        Token BOOLEAN58=null;

        Object CHAR51_tree=null;
        Object BYTE52_tree=null;
        Object SHORT53_tree=null;
        Object INT54_tree=null;
        Object LONG55_tree=null;
        Object FLOAT56_tree=null;
        Object DOUBLE57_tree=null;
        Object BOOLEAN58_tree=null;

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:189:5: ( CHAR | BYTE | SHORT | INT | LONG | FLOAT | DOUBLE | BOOLEAN )
            int alt15=8;
            switch ( input.LA(1) ) {
            case CHAR:
                {
                alt15=1;
                }
                break;
            case BYTE:
                {
                alt15=2;
                }
                break;
            case SHORT:
                {
                alt15=3;
                }
                break;
            case INT:
                {
                alt15=4;
                }
                break;
            case LONG:
                {
                alt15=5;
                }
                break;
            case FLOAT:
                {
                alt15=6;
                }
                break;
            case DOUBLE:
                {
                alt15=7;
                }
                break;
            case BOOLEAN:
                {
                alt15=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:189:9: CHAR
                    {
                    root_0 = (Object)adaptor.nil();

                    CHAR51=(Token)match(input,CHAR,FOLLOW_CHAR_in_primitiveType1004); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CHAR51_tree = (Object)adaptor.create(CHAR51);
                    adaptor.addChild(root_0, CHAR51_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.bs = BasicType.CHAR;    
                    }

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:190:9: BYTE
                    {
                    root_0 = (Object)adaptor.nil();

                    BYTE52=(Token)match(input,BYTE,FOLLOW_BYTE_in_primitiveType1019); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BYTE52_tree = (Object)adaptor.create(BYTE52);
                    adaptor.addChild(root_0, BYTE52_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.bs = BasicType.BYTE;    
                    }

                    }
                    break;
                case 3 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:191:9: SHORT
                    {
                    root_0 = (Object)adaptor.nil();

                    SHORT53=(Token)match(input,SHORT,FOLLOW_SHORT_in_primitiveType1034); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SHORT53_tree = (Object)adaptor.create(SHORT53);
                    adaptor.addChild(root_0, SHORT53_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.bs = BasicType.SHORT;   
                    }

                    }
                    break;
                case 4 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:192:9: INT
                    {
                    root_0 = (Object)adaptor.nil();

                    INT54=(Token)match(input,INT,FOLLOW_INT_in_primitiveType1048); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT54_tree = (Object)adaptor.create(INT54);
                    adaptor.addChild(root_0, INT54_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.bs = BasicType.INT;     
                    }

                    }
                    break;
                case 5 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:193:9: LONG
                    {
                    root_0 = (Object)adaptor.nil();

                    LONG55=(Token)match(input,LONG,FOLLOW_LONG_in_primitiveType1064); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LONG55_tree = (Object)adaptor.create(LONG55);
                    adaptor.addChild(root_0, LONG55_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.bs = BasicType.LONG;    
                    }

                    }
                    break;
                case 6 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:194:9: FLOAT
                    {
                    root_0 = (Object)adaptor.nil();

                    FLOAT56=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_primitiveType1079); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FLOAT56_tree = (Object)adaptor.create(FLOAT56);
                    adaptor.addChild(root_0, FLOAT56_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.bs = BasicType.FLOAT;   
                    }

                    }
                    break;
                case 7 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:195:9: DOUBLE
                    {
                    root_0 = (Object)adaptor.nil();

                    DOUBLE57=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_primitiveType1093); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOUBLE57_tree = (Object)adaptor.create(DOUBLE57);
                    adaptor.addChild(root_0, DOUBLE57_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.bs = BasicType.DOUBLE;  
                    }

                    }
                    break;
                case 8 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:196:9: BOOLEAN
                    {
                    root_0 = (Object)adaptor.nil();

                    BOOLEAN58=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_primitiveType1106); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BOOLEAN58_tree = (Object)adaptor.create(BOOLEAN58);
                    adaptor.addChild(root_0, BOOLEAN58_tree);
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
         
        	catch (RecognitionException e) { 
        		throw e; 
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:199:1: formalParameters returns [ArrayList<Type> args] : ( '(' ')' | '(' formalParameterDecls[$args] ')' -> ^( FPARMS formalParameterDecls ) );
    public final JaParser.formalParameters_return formalParameters() throws RecognitionException {
        JaParser.formalParameters_return retval = new JaParser.formalParameters_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal59=null;
        Token char_literal60=null;
        Token char_literal61=null;
        Token char_literal63=null;
        JaParser.formalParameterDecls_return formalParameterDecls62 = null;


        Object char_literal59_tree=null;
        Object char_literal60_tree=null;
        Object char_literal61_tree=null;
        Object char_literal63_tree=null;
        RewriteRuleTokenStream stream_94=new RewriteRuleTokenStream(adaptor,"token 94");
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleSubtreeStream stream_formalParameterDecls=new RewriteRuleSubtreeStream(adaptor,"rule formalParameterDecls");

        	retval.args = new ArrayList<Type>();

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:203:5: ( '(' ')' | '(' formalParameterDecls[$args] ')' -> ^( FPARMS formalParameterDecls ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==93) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==94) ) {
                    alt16=1;
                }
                else if ( (LA16_1==IDENTIFIER||(LA16_1>=CHAR && LA16_1<=BOOLEAN)) ) {
                    alt16=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:203:8: '(' ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal59=(Token)match(input,93,FOLLOW_93_in_formalParameters1139); if (state.failed) return retval;
                    char_literal60=(Token)match(input,94,FOLLOW_94_in_formalParameters1141); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:204:8: '(' formalParameterDecls[$args] ')'
                    {
                    char_literal61=(Token)match(input,93,FOLLOW_93_in_formalParameters1152); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_93.add(char_literal61);

                    pushFollow(FOLLOW_formalParameterDecls_in_formalParameters1154);
                    formalParameterDecls62=formalParameterDecls(retval.args);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formalParameterDecls.add(formalParameterDecls62.getTree());
                    char_literal63=(Token)match(input,94,FOLLOW_94_in_formalParameters1157); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_94.add(char_literal63);



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
                    // 204:44: -> ^( FPARMS formalParameterDecls )
                    {
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:204:47: ^( FPARMS formalParameterDecls )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FPARMS, "FPARMS"), root_1);

                        adaptor.addChild(root_1, stream_formalParameterDecls.nextTree());

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
         
        	catch (RecognitionException e) { 
        		throw e; 
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:207:1: formalParameterDecls[ArrayList<Type> args] : type variableDeclaratorId[(CommonTree)$type.tree] ( ',' formalParameterDecls[$args] )? -> ^( FPARM variableDeclaratorId ) ( formalParameterDecls )? ;
    public final JaParser.formalParameterDecls_return formalParameterDecls(ArrayList<Type> args) throws RecognitionException {
        JaParser.formalParameterDecls_return retval = new JaParser.formalParameterDecls_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal66=null;
        JaParser.type_return type64 = null;

        JaParser.variableDeclaratorId_return variableDeclaratorId65 = null;

        JaParser.formalParameterDecls_return formalParameterDecls67 = null;


        Object char_literal66_tree=null;
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleSubtreeStream stream_variableDeclaratorId=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaratorId");
        RewriteRuleSubtreeStream stream_formalParameterDecls=new RewriteRuleSubtreeStream(adaptor,"rule formalParameterDecls");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:208:5: ( type variableDeclaratorId[(CommonTree)$type.tree] ( ',' formalParameterDecls[$args] )? -> ^( FPARM variableDeclaratorId ) ( formalParameterDecls )? )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:208:7: type variableDeclaratorId[(CommonTree)$type.tree] ( ',' formalParameterDecls[$args] )?
            {
            pushFollow(FOLLOW_type_in_formalParameterDecls1187);
            type64=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type64.getTree());
            pushFollow(FOLLOW_variableDeclaratorId_in_formalParameterDecls1189);
            variableDeclaratorId65=variableDeclaratorId((CommonTree)(type64!=null?((Object)type64.tree):null));

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variableDeclaratorId.add(variableDeclaratorId65.getTree());
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:208:57: ( ',' formalParameterDecls[$args] )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==92) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:208:58: ',' formalParameterDecls[$args]
                    {
                    char_literal66=(Token)match(input,92,FOLLOW_92_in_formalParameterDecls1193); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_92.add(char_literal66);

                    pushFollow(FOLLOW_formalParameterDecls_in_formalParameterDecls1195);
                    formalParameterDecls67=formalParameterDecls(args);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formalParameterDecls.add(formalParameterDecls67.getTree());

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               args.add(ParserHelper.createArrayType((type64!=null?type64.t:null), (variableDeclaratorId65!=null?variableDeclaratorId65.arrayDim:0))); 
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
            // 210:6: -> ^( FPARM variableDeclaratorId ) ( formalParameterDecls )?
            {
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:210:9: ^( FPARM variableDeclaratorId )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FPARM, "FPARM"), root_1);

                adaptor.addChild(root_1, stream_variableDeclaratorId.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:210:39: ( formalParameterDecls )?
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
         
        	catch (RecognitionException e) { 
        		throw e; 
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:213:1: methodBody : block -> ^( MBODY ( block )? ) ;
    public final JaParser.methodBody_return methodBody() throws RecognitionException {
        JaParser.methodBody_return retval = new JaParser.methodBody_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.block_return block68 = null;


        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:214:5: ( block -> ^( MBODY ( block )? ) )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:214:9: block
            {
            pushFollow(FOLLOW_block_in_methodBody1245);
            block68=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block68.getTree());


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
            // 214:15: -> ^( MBODY ( block )? )
            {
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:214:18: ^( MBODY ( block )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MBODY, "MBODY"), root_1);

                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:214:26: ( block )?
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
         
        	catch (RecognitionException e) { 
        		throw e; 
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:217:1: constructorBody : '{' ( explicitConstructorInvocation )? ( blockStatement )* '}' -> ^( CBODY ( explicitConstructorInvocation )? ( blockStatement )* ) ;
    public final JaParser.constructorBody_return constructorBody() throws RecognitionException {
        JaParser.constructorBody_return retval = new JaParser.constructorBody_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal69=null;
        Token char_literal72=null;
        JaParser.explicitConstructorInvocation_return explicitConstructorInvocation70 = null;

        JaParser.blockStatement_return blockStatement71 = null;


        Object char_literal69_tree=null;
        Object char_literal72_tree=null;
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleSubtreeStream stream_blockStatement=new RewriteRuleSubtreeStream(adaptor,"rule blockStatement");
        RewriteRuleSubtreeStream stream_explicitConstructorInvocation=new RewriteRuleSubtreeStream(adaptor,"rule explicitConstructorInvocation");
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:218:5: ( '{' ( explicitConstructorInvocation )? ( blockStatement )* '}' -> ^( CBODY ( explicitConstructorInvocation )? ( blockStatement )* ) )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:218:7: '{' ( explicitConstructorInvocation )? ( blockStatement )* '}'
            {
            char_literal69=(Token)match(input,90,FOLLOW_90_in_constructorBody1272); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_90.add(char_literal69);

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:218:11: ( explicitConstructorInvocation )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==THIS) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==93) ) {
                    alt18=1;
                }
            }
            else if ( (LA18_0==SUPER) ) {
                int LA18_2 = input.LA(2);

                if ( (LA18_2==93) ) {
                    alt18=1;
                }
            }
            switch (alt18) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:218:11: explicitConstructorInvocation
                    {
                    pushFollow(FOLLOW_explicitConstructorInvocation_in_constructorBody1274);
                    explicitConstructorInvocation70=explicitConstructorInvocation();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_explicitConstructorInvocation.add(explicitConstructorInvocation70.getTree());

                    }
                    break;

            }

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:218:42: ( blockStatement )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==IDENTIFIER||LA19_0==VOID||(LA19_0>=CHAR && LA19_0<=RETURN)||LA19_0==NEW||(LA19_0>=PLUS && LA19_0<=MINUS)||(LA19_0>=89 && LA19_0<=90)||LA19_0==93||(LA19_0>=104 && LA19_0<=106)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:218:42: blockStatement
            	    {
            	    pushFollow(FOLLOW_blockStatement_in_constructorBody1277);
            	    blockStatement71=blockStatement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_blockStatement.add(blockStatement71.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            char_literal72=(Token)match(input,91,FOLLOW_91_in_constructorBody1280); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_91.add(char_literal72);



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
            // 218:62: -> ^( CBODY ( explicitConstructorInvocation )? ( blockStatement )* )
            {
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:218:65: ^( CBODY ( explicitConstructorInvocation )? ( blockStatement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CBODY, "CBODY"), root_1);

                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:218:73: ( explicitConstructorInvocation )?
                if ( stream_explicitConstructorInvocation.hasNext() ) {
                    adaptor.addChild(root_1, stream_explicitConstructorInvocation.nextTree());

                }
                stream_explicitConstructorInvocation.reset();
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:218:104: ( blockStatement )*
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
         
        	catch (RecognitionException e) { 
        		throw e; 
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:221:1: explicitConstructorInvocation : ( THIS arguments ';' -> ^( CONSTRCALL THIS ( arguments )? ) | SUPER arguments ';' -> ^( CONSTRCALL SUPER ( arguments )? ) );
    public final JaParser.explicitConstructorInvocation_return explicitConstructorInvocation() throws RecognitionException {
        JaParser.explicitConstructorInvocation_return retval = new JaParser.explicitConstructorInvocation_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token THIS73=null;
        Token char_literal75=null;
        Token SUPER76=null;
        Token char_literal78=null;
        JaParser.arguments_return arguments74 = null;

        JaParser.arguments_return arguments77 = null;


        Object THIS73_tree=null;
        Object char_literal75_tree=null;
        Object SUPER76_tree=null;
        Object char_literal78_tree=null;
        RewriteRuleTokenStream stream_SUPER=new RewriteRuleTokenStream(adaptor,"token SUPER");
        RewriteRuleTokenStream stream_THIS=new RewriteRuleTokenStream(adaptor,"token THIS");
        RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
        RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:222:5: ( THIS arguments ';' -> ^( CONSTRCALL THIS ( arguments )? ) | SUPER arguments ';' -> ^( CONSTRCALL SUPER ( arguments )? ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==THIS) ) {
                alt20=1;
            }
            else if ( (LA20_0==SUPER) ) {
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
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:222:9: THIS arguments ';'
                    {
                    THIS73=(Token)match(input,THIS,FOLLOW_THIS_in_explicitConstructorInvocation1311); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIS.add(THIS73);

                    pushFollow(FOLLOW_arguments_in_explicitConstructorInvocation1314);
                    arguments74=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arguments.add(arguments74.getTree());
                    char_literal75=(Token)match(input,89,FOLLOW_89_in_explicitConstructorInvocation1316); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_89.add(char_literal75);



                    // AST REWRITE
                    // elements: THIS, arguments
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 222:29: -> ^( CONSTRCALL THIS ( arguments )? )
                    {
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:222:32: ^( CONSTRCALL THIS ( arguments )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONSTRCALL, "CONSTRCALL"), root_1);

                        adaptor.addChild(root_1, stream_THIS.nextNode());
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:222:51: ( arguments )?
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
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:223:9: SUPER arguments ';'
                    {
                    SUPER76=(Token)match(input,SUPER,FOLLOW_SUPER_in_explicitConstructorInvocation1338); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SUPER.add(SUPER76);

                    pushFollow(FOLLOW_arguments_in_explicitConstructorInvocation1340);
                    arguments77=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arguments.add(arguments77.getTree());
                    char_literal78=(Token)match(input,89,FOLLOW_89_in_explicitConstructorInvocation1342); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_89.add(char_literal78);



                    // AST REWRITE
                    // elements: SUPER, arguments
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 223:29: -> ^( CONSTRCALL SUPER ( arguments )? )
                    {
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:223:32: ^( CONSTRCALL SUPER ( arguments )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONSTRCALL, "CONSTRCALL"), root_1);

                        adaptor.addChild(root_1, stream_SUPER.nextNode());
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:223:51: ( arguments )?
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
         
        	catch (RecognitionException e) { 
        		throw e; 
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:226:1: literal : ( INTLITERAL | LONGLITERAL | FLOATLITERAL | DOUBLELITERAL | CHARLITERAL | STRINGLITERAL | BOOLEANLITERAL | NULLLITERAL );
    public final JaParser.literal_return literal() throws RecognitionException {
        JaParser.literal_return retval = new JaParser.literal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set79=null;

        Object set79_tree=null;

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:227:5: ( INTLITERAL | LONGLITERAL | FLOATLITERAL | DOUBLELITERAL | CHARLITERAL | STRINGLITERAL | BOOLEANLITERAL | NULLLITERAL )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:
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
         
        	catch (RecognitionException e) { 
        		throw e; 
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:239:1: block : '{' ( blockStatement )* '}' ;
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
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:240:5: ( '{' ( blockStatement )* '}' )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:240:9: '{' ( blockStatement )* '}'
            {
            root_0 = (Object)adaptor.nil();

            char_literal80=(Token)match(input,90,FOLLOW_90_in_block1460); if (state.failed) return retval;
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:240:14: ( blockStatement )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==IDENTIFIER||LA21_0==VOID||(LA21_0>=CHAR && LA21_0<=RETURN)||LA21_0==NEW||(LA21_0>=PLUS && LA21_0<=MINUS)||(LA21_0>=89 && LA21_0<=90)||LA21_0==93||(LA21_0>=104 && LA21_0<=106)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:240:14: blockStatement
            	    {
            	    pushFollow(FOLLOW_blockStatement_in_block1463);
            	    blockStatement81=blockStatement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, blockStatement81.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            char_literal82=(Token)match(input,91,FOLLOW_91_in_block1466); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
         
        	catch (RecognitionException e) { 
        		throw e; 
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:243:1: blockStatement : ( localVariableDeclarationStatement | statement );
    public final JaParser.blockStatement_return blockStatement() throws RecognitionException {
        JaParser.blockStatement_return retval = new JaParser.blockStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.localVariableDeclarationStatement_return localVariableDeclarationStatement83 = null;

        JaParser.statement_return statement84 = null;



        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:244:5: ( localVariableDeclarationStatement | statement )
            int alt22=2;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:244:9: localVariableDeclarationStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_localVariableDeclarationStatement_in_blockStatement1490);
                    localVariableDeclarationStatement83=localVariableDeclarationStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, localVariableDeclarationStatement83.getTree());

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:245:9: statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_statement_in_blockStatement1500);
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
         
        	catch (RecognitionException e) { 
        		throw e; 
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:248:1: localVariableDeclarationStatement : localVariableDeclaration ';' ;
    public final JaParser.localVariableDeclarationStatement_return localVariableDeclarationStatement() throws RecognitionException {
        JaParser.localVariableDeclarationStatement_return retval = new JaParser.localVariableDeclarationStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal86=null;
        JaParser.localVariableDeclaration_return localVariableDeclaration85 = null;


        Object char_literal86_tree=null;

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:249:5: ( localVariableDeclaration ';' )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:249:7: localVariableDeclaration ';'
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_localVariableDeclaration_in_localVariableDeclarationStatement1521);
            localVariableDeclaration85=localVariableDeclaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, localVariableDeclaration85.getTree());
            char_literal86=(Token)match(input,89,FOLLOW_89_in_localVariableDeclarationStatement1523); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
         
        	catch (RecognitionException e) { 
        		throw e; 
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:252:1: localVariableDeclaration : type variableDeclarator[(CommonTree)$type.tree] ( ',' variableDeclarator[(CommonTree)((CommonTree)$type.tree).dupNode()] )* -> ( ^( VARDECL variableDeclarator ) )+ ;
    public final JaParser.localVariableDeclaration_return localVariableDeclaration() throws RecognitionException {
        JaParser.localVariableDeclaration_return retval = new JaParser.localVariableDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal89=null;
        JaParser.type_return type87 = null;

        JaParser.variableDeclarator_return variableDeclarator88 = null;

        JaParser.variableDeclarator_return variableDeclarator90 = null;


        Object char_literal89_tree=null;
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        RewriteRuleSubtreeStream stream_variableDeclarator=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclarator");
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:253:5: ( type variableDeclarator[(CommonTree)$type.tree] ( ',' variableDeclarator[(CommonTree)((CommonTree)$type.tree).dupNode()] )* -> ( ^( VARDECL variableDeclarator ) )+ )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:253:7: type variableDeclarator[(CommonTree)$type.tree] ( ',' variableDeclarator[(CommonTree)((CommonTree)$type.tree).dupNode()] )*
            {
            pushFollow(FOLLOW_type_in_localVariableDeclaration1541);
            type87=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type87.getTree());
            pushFollow(FOLLOW_variableDeclarator_in_localVariableDeclaration1543);
            variableDeclarator88=variableDeclarator((CommonTree)(type87!=null?((Object)type87.tree):null));

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variableDeclarator.add(variableDeclarator88.getTree());
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:253:55: ( ',' variableDeclarator[(CommonTree)((CommonTree)$type.tree).dupNode()] )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==92) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:253:56: ',' variableDeclarator[(CommonTree)((CommonTree)$type.tree).dupNode()]
            	    {
            	    char_literal89=(Token)match(input,92,FOLLOW_92_in_localVariableDeclaration1547); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_92.add(char_literal89);

            	    pushFollow(FOLLOW_variableDeclarator_in_localVariableDeclaration1549);
            	    variableDeclarator90=variableDeclarator((CommonTree)((CommonTree)(type87!=null?((Object)type87.tree):null)).dupNode());

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_variableDeclarator.add(variableDeclarator90.getTree());

            	    }
            	    break;

            	default :
            	    break loop23;
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
            // 254:6: -> ( ^( VARDECL variableDeclarator ) )+
            {
                if ( !(stream_variableDeclarator.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_variableDeclarator.hasNext() ) {
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:254:9: ^( VARDECL variableDeclarator )
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
         
        	catch (RecognitionException e) { 
        		throw e; 
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:258:1: statement : ( block -> ^( BLOCK ( block )? ) | tk= IF parExpression statement elseStmt -> ^( IF ^( CONDITION[$tk, \"CONDITION\"] parExpression ) ( ^( THEN statement ) )? ( elseStmt )? ) | FOR lp= '(' ( forInit )? ';' ( expression )? ';' ( forUpdate )? ')' statement -> ^( FOR ( ^( INIT forInit ) )? ( ^( CONDITION[$lp, \"CONDITION\"] expression ) )? ( ^( UPDATE forUpdate ) )? statement ) | tk= WHILE parExpression statement -> ^( WHILE ^( CONDITION[$tk, \"CONDITION\"] parExpression ) statement ) | DO statement tk= WHILE parExpression ';' -> ^( DOWHILE ^( CONDITION[$tk, \"CONDITION\"] parExpression ) statement ) | RETURN ( expression )? ';' | ';' | statementExpression ';' -> ^( STMT statementExpression ) );
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
        RewriteRuleTokenStream stream_94=new RewriteRuleTokenStream(adaptor,"token 94");
        RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleSubtreeStream stream_parExpression=new RewriteRuleSubtreeStream(adaptor,"rule parExpression");
        RewriteRuleSubtreeStream stream_statementExpression=new RewriteRuleSubtreeStream(adaptor,"rule statementExpression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_forUpdate=new RewriteRuleSubtreeStream(adaptor,"rule forUpdate");
        RewriteRuleSubtreeStream stream_forInit=new RewriteRuleSubtreeStream(adaptor,"rule forInit");
        RewriteRuleSubtreeStream stream_elseStmt=new RewriteRuleSubtreeStream(adaptor,"rule elseStmt");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:259:5: ( block -> ^( BLOCK ( block )? ) | tk= IF parExpression statement elseStmt -> ^( IF ^( CONDITION[$tk, \"CONDITION\"] parExpression ) ( ^( THEN statement ) )? ( elseStmt )? ) | FOR lp= '(' ( forInit )? ';' ( expression )? ';' ( forUpdate )? ')' statement -> ^( FOR ( ^( INIT forInit ) )? ( ^( CONDITION[$lp, \"CONDITION\"] expression ) )? ( ^( UPDATE forUpdate ) )? statement ) | tk= WHILE parExpression statement -> ^( WHILE ^( CONDITION[$tk, \"CONDITION\"] parExpression ) statement ) | DO statement tk= WHILE parExpression ';' -> ^( DOWHILE ^( CONDITION[$tk, \"CONDITION\"] parExpression ) statement ) | RETURN ( expression )? ';' | ';' | statementExpression ';' -> ^( STMT statementExpression ) )
            int alt28=8;
            switch ( input.LA(1) ) {
            case 90:
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
            case DO:
                {
                alt28=5;
                }
                break;
            case RETURN:
                {
                alt28=6;
                }
                break;
            case 89:
                {
                alt28=7;
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
            case 93:
            case 104:
            case 105:
            case 106:
                {
                alt28=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:259:9: block
                    {
                    pushFollow(FOLLOW_block_in_statement1590);
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
                    // 259:15: -> ^( BLOCK ( block )? )
                    {
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:259:18: ^( BLOCK ( block )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);

                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:259:26: ( block )?
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
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:261:9: tk= IF parExpression statement elseStmt
                    {
                    tk=(Token)match(input,IF,FOLLOW_IF_in_statement1616); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(tk);

                    pushFollow(FOLLOW_parExpression_in_statement1618);
                    parExpression92=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression92.getTree());
                    pushFollow(FOLLOW_statement_in_statement1620);
                    statement93=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement93.getTree());
                    pushFollow(FOLLOW_elseStmt_in_statement1622);
                    elseStmt94=elseStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_elseStmt.add(elseStmt94.getTree());


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
                    // 261:48: -> ^( IF ^( CONDITION[$tk, \"CONDITION\"] parExpression ) ( ^( THEN statement ) )? ( elseStmt )? )
                    {
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:261:51: ^( IF ^( CONDITION[$tk, \"CONDITION\"] parExpression ) ( ^( THEN statement ) )? ( elseStmt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:261:56: ^( CONDITION[$tk, \"CONDITION\"] parExpression )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONDITION, tk, "CONDITION"), root_2);

                        adaptor.addChild(root_2, stream_parExpression.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:261:101: ( ^( THEN statement ) )?
                        if ( stream_statement.hasNext() ) {
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:261:102: ^( THEN statement )
                            {
                            Object root_2 = (Object)adaptor.nil();
                            root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(THEN, "THEN"), root_2);

                            adaptor.addChild(root_2, stream_statement.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_statement.reset();
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:261:122: ( elseStmt )?
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
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:263:9: FOR lp= '(' ( forInit )? ';' ( expression )? ';' ( forUpdate )? ')' statement
                    {
                    FOR95=(Token)match(input,FOR,FOLLOW_FOR_in_statement1662); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOR.add(FOR95);

                    lp=(Token)match(input,93,FOLLOW_93_in_statement1666); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_93.add(lp);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:263:20: ( forInit )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==IDENTIFIER||LA24_0==VOID||(LA24_0>=CHAR && LA24_0<=NULLLITERAL)||LA24_0==NEW||(LA24_0>=PLUS && LA24_0<=MINUS)||LA24_0==93||(LA24_0>=104 && LA24_0<=106)) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:263:20: forInit
                            {
                            pushFollow(FOLLOW_forInit_in_statement1668);
                            forInit96=forInit();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_forInit.add(forInit96.getTree());

                            }
                            break;

                    }

                    char_literal97=(Token)match(input,89,FOLLOW_89_in_statement1671); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_89.add(char_literal97);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:263:33: ( expression )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==IDENTIFIER||LA25_0==VOID||(LA25_0>=CHAR && LA25_0<=NULLLITERAL)||LA25_0==NEW||(LA25_0>=PLUS && LA25_0<=MINUS)||LA25_0==93||(LA25_0>=104 && LA25_0<=106)) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:263:33: expression
                            {
                            pushFollow(FOLLOW_expression_in_statement1673);
                            expression98=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(expression98.getTree());

                            }
                            break;

                    }

                    char_literal99=(Token)match(input,89,FOLLOW_89_in_statement1676); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_89.add(char_literal99);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:263:49: ( forUpdate )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==IDENTIFIER||LA26_0==VOID||(LA26_0>=CHAR && LA26_0<=NULLLITERAL)||LA26_0==NEW||(LA26_0>=PLUS && LA26_0<=MINUS)||LA26_0==93||(LA26_0>=104 && LA26_0<=106)) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:263:49: forUpdate
                            {
                            pushFollow(FOLLOW_forUpdate_in_statement1678);
                            forUpdate100=forUpdate();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_forUpdate.add(forUpdate100.getTree());

                            }
                            break;

                    }

                    char_literal101=(Token)match(input,94,FOLLOW_94_in_statement1681); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_94.add(char_literal101);

                    pushFollow(FOLLOW_statement_in_statement1683);
                    statement102=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement102.getTree());


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
                    // 264:6: -> ^( FOR ( ^( INIT forInit ) )? ( ^( CONDITION[$lp, \"CONDITION\"] expression ) )? ( ^( UPDATE forUpdate ) )? statement )
                    {
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:264:9: ^( FOR ( ^( INIT forInit ) )? ( ^( CONDITION[$lp, \"CONDITION\"] expression ) )? ( ^( UPDATE forUpdate ) )? statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_FOR.nextNode(), root_1);

                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:264:15: ( ^( INIT forInit ) )?
                        if ( stream_forInit.hasNext() ) {
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:264:15: ^( INIT forInit )
                            {
                            Object root_2 = (Object)adaptor.nil();
                            root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(INIT, "INIT"), root_2);

                            adaptor.addChild(root_2, stream_forInit.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_forInit.reset();
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:264:32: ( ^( CONDITION[$lp, \"CONDITION\"] expression ) )?
                        if ( stream_expression.hasNext() ) {
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:264:32: ^( CONDITION[$lp, \"CONDITION\"] expression )
                            {
                            Object root_2 = (Object)adaptor.nil();
                            root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONDITION, lp, "CONDITION"), root_2);

                            adaptor.addChild(root_2, stream_expression.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_expression.reset();
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:264:75: ( ^( UPDATE forUpdate ) )?
                        if ( stream_forUpdate.hasNext() ) {
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:264:75: ^( UPDATE forUpdate )
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
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:266:9: tk= WHILE parExpression statement
                    {
                    tk=(Token)match(input,WHILE,FOLLOW_WHILE_in_statement1743); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE.add(tk);

                    pushFollow(FOLLOW_parExpression_in_statement1745);
                    parExpression103=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression103.getTree());
                    pushFollow(FOLLOW_statement_in_statement1747);
                    statement104=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement104.getTree());


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
                    // 266:42: -> ^( WHILE ^( CONDITION[$tk, \"CONDITION\"] parExpression ) statement )
                    {
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:266:45: ^( WHILE ^( CONDITION[$tk, \"CONDITION\"] parExpression ) statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_WHILE.nextNode(), root_1);

                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:266:53: ^( CONDITION[$tk, \"CONDITION\"] parExpression )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONDITION, tk, "CONDITION"), root_2);

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
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:268:9: DO statement tk= WHILE parExpression ';'
                    {
                    DO105=(Token)match(input,DO,FOLLOW_DO_in_statement1777); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DO.add(DO105);

                    pushFollow(FOLLOW_statement_in_statement1779);
                    statement106=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement106.getTree());
                    tk=(Token)match(input,WHILE,FOLLOW_WHILE_in_statement1783); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE.add(tk);

                    pushFollow(FOLLOW_parExpression_in_statement1785);
                    parExpression107=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression107.getTree());
                    char_literal108=(Token)match(input,89,FOLLOW_89_in_statement1787); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_89.add(char_literal108);



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
                    // 268:49: -> ^( DOWHILE ^( CONDITION[$tk, \"CONDITION\"] parExpression ) statement )
                    {
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:268:52: ^( DOWHILE ^( CONDITION[$tk, \"CONDITION\"] parExpression ) statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DOWHILE, "DOWHILE"), root_1);

                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:268:62: ^( CONDITION[$tk, \"CONDITION\"] parExpression )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONDITION, tk, "CONDITION"), root_2);

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
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:270:9: RETURN ( expression )? ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    RETURN109=(Token)match(input,RETURN,FOLLOW_RETURN_in_statement1817); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RETURN109_tree = (Object)adaptor.create(RETURN109);
                    root_0 = (Object)adaptor.becomeRoot(RETURN109_tree, root_0);
                    }
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:270:17: ( expression )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==IDENTIFIER||LA27_0==VOID||(LA27_0>=CHAR && LA27_0<=NULLLITERAL)||LA27_0==NEW||(LA27_0>=PLUS && LA27_0<=MINUS)||LA27_0==93||(LA27_0>=104 && LA27_0<=106)) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:270:17: expression
                            {
                            pushFollow(FOLLOW_expression_in_statement1820);
                            expression110=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression110.getTree());

                            }
                            break;

                    }

                    char_literal111=(Token)match(input,89,FOLLOW_89_in_statement1823); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:272:9: ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal112=(Token)match(input,89,FOLLOW_89_in_statement1839); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:274:9: statementExpression ';'
                    {
                    pushFollow(FOLLOW_statementExpression_in_statement1856);
                    statementExpression113=statementExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementExpression.add(statementExpression113.getTree());
                    char_literal114=(Token)match(input,89,FOLLOW_89_in_statement1858); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_89.add(char_literal114);



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
                    // 274:33: -> ^( STMT statementExpression )
                    {
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:274:36: ^( STMT statementExpression )
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
         
        	catch (RecognitionException e) { 
        		throw e; 
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:277:1: elseStmt : ( ( ELSE )=> ELSE statement | );
    public final JaParser.elseStmt_return elseStmt() throws RecognitionException {
        JaParser.elseStmt_return retval = new JaParser.elseStmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ELSE115=null;
        JaParser.statement_return statement116 = null;


        Object ELSE115_tree=null;

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:278:5: ( ( ELSE )=> ELSE statement | )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==ELSE) ) {
                int LA29_1 = input.LA(2);

                if ( (synpred1_Ja()) ) {
                    alt29=1;
                }
                else if ( (true) ) {
                    alt29=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA29_0==IDENTIFIER||LA29_0==VOID||(LA29_0>=CHAR && LA29_0<=RETURN)||LA29_0==NEW||(LA29_0>=PLUS && LA29_0<=MINUS)||(LA29_0>=89 && LA29_0<=91)||LA29_0==93||(LA29_0>=104 && LA29_0<=106)) ) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:278:7: ( ELSE )=> ELSE statement
                    {
                    root_0 = (Object)adaptor.nil();

                    ELSE115=(Token)match(input,ELSE,FOLLOW_ELSE_in_elseStmt1893); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ELSE115_tree = (Object)adaptor.create(ELSE115);
                    root_0 = (Object)adaptor.becomeRoot(ELSE115_tree, root_0);
                    }
                    pushFollow(FOLLOW_statement_in_elseStmt1896);
                    statement116=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement116.getTree());

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:280:5: 
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
         
        	catch (RecognitionException e) { 
        		throw e; 
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:282:1: forInit : ( localVariableDeclaration | expressionList );
    public final JaParser.forInit_return forInit() throws RecognitionException {
        JaParser.forInit_return retval = new JaParser.forInit_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.localVariableDeclaration_return localVariableDeclaration117 = null;

        JaParser.expressionList_return expressionList118 = null;



        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:283:5: ( localVariableDeclaration | expressionList )
            int alt30=2;
            alt30 = dfa30.predict(input);
            switch (alt30) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:283:9: localVariableDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_localVariableDeclaration_in_forInit1921);
                    localVariableDeclaration117=localVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, localVariableDeclaration117.getTree());

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:284:9: expressionList
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expressionList_in_forInit1931);
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
         
        	catch (RecognitionException e) { 
        		throw e; 
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:287:1: forUpdate : expressionList ;
    public final JaParser.forUpdate_return forUpdate() throws RecognitionException {
        JaParser.forUpdate_return retval = new JaParser.forUpdate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.expressionList_return expressionList119 = null;



        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:288:5: ( expressionList )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:288:9: expressionList
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expressionList_in_forUpdate1950);
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
         
        	catch (RecognitionException e) { 
        		throw e; 
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:291:1: parExpression : '(' expression ')' ;
    public final JaParser.parExpression_return parExpression() throws RecognitionException {
        JaParser.parExpression_return retval = new JaParser.parExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal120=null;
        Token char_literal122=null;
        JaParser.expression_return expression121 = null;


        Object char_literal120_tree=null;
        Object char_literal122_tree=null;

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:292:5: ( '(' expression ')' )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:292:9: '(' expression ')'
            {
            root_0 = (Object)adaptor.nil();

            char_literal120=(Token)match(input,93,FOLLOW_93_in_parExpression1969); if (state.failed) return retval;
            pushFollow(FOLLOW_expression_in_parExpression1972);
            expression121=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression121.getTree());
            char_literal122=(Token)match(input,94,FOLLOW_94_in_parExpression1974); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
         
        	catch (RecognitionException e) { 
        		throw e; 
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:295:1: expressionList : expression ( ',' expression )* ;
    public final JaParser.expressionList_return expressionList() throws RecognitionException {
        JaParser.expressionList_return retval = new JaParser.expressionList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal124=null;
        JaParser.expression_return expression123 = null;

        JaParser.expression_return expression125 = null;


        Object char_literal124_tree=null;

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:296:5: ( expression ( ',' expression )* )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:296:9: expression ( ',' expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expression_in_expressionList1998);
            expression123=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression123.getTree());
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:296:20: ( ',' expression )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==92) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:296:21: ',' expression
            	    {
            	    char_literal124=(Token)match(input,92,FOLLOW_92_in_expressionList2001); if (state.failed) return retval;
            	    pushFollow(FOLLOW_expression_in_expressionList2004);
            	    expression125=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression125.getTree());

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
         
        	catch (RecognitionException e) { 
        		throw e; 
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:299:1: statementExpression : expression ;
    public final JaParser.statementExpression_return statementExpression() throws RecognitionException {
        JaParser.statementExpression_return retval = new JaParser.statementExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.expression_return expression126 = null;



        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:300:5: ( expression )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:300:9: expression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expression_in_statementExpression2025);
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
         
        	catch (RecognitionException e) { 
        		throw e; 
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:303:1: expression : orExpression (ap= assignmentOperator expression )? -> {$ap.c == '='}? ^( EQ[$ap.tk, \"=\"] orExpression expression ) -> {$ap.c == '+'}? ^( EQ[$ap.tk, \"=\"] orExpression ^( PLUS[$ap.tk, \"+\"] orExpression expression ) ) -> {$ap.c == '-'}? ^( EQ[$ap.tk, \"=\"] orExpression ^( MINUS[$ap.tk, \"-\"] orExpression expression ) ) -> {$ap.c == '*'}? ^( EQ[$ap.tk, \"=\"] orExpression ^( STAR[$ap.tk, \"*\"] orExpression expression ) ) -> {$ap.c == '/'}? ^( EQ[$ap.tk, \"=\"] orExpression ^( SLASH[$ap.tk, \"/\"] orExpression expression ) ) -> orExpression ;
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
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:304:5: ( orExpression (ap= assignmentOperator expression )? -> {$ap.c == '='}? ^( EQ[$ap.tk, \"=\"] orExpression expression ) -> {$ap.c == '+'}? ^( EQ[$ap.tk, \"=\"] orExpression ^( PLUS[$ap.tk, \"+\"] orExpression expression ) ) -> {$ap.c == '-'}? ^( EQ[$ap.tk, \"=\"] orExpression ^( MINUS[$ap.tk, \"-\"] orExpression expression ) ) -> {$ap.c == '*'}? ^( EQ[$ap.tk, \"=\"] orExpression ^( STAR[$ap.tk, \"*\"] orExpression expression ) ) -> {$ap.c == '/'}? ^( EQ[$ap.tk, \"=\"] orExpression ^( SLASH[$ap.tk, \"/\"] orExpression expression ) ) -> orExpression )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:304:8: orExpression (ap= assignmentOperator expression )?
            {
            pushFollow(FOLLOW_orExpression_in_expression2044);
            orExpression127=orExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_orExpression.add(orExpression127.getTree());
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:304:21: (ap= assignmentOperator expression )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==EQ||(LA32_0>=95 && LA32_0<=98)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:304:23: ap= assignmentOperator expression
                    {
                    pushFollow(FOLLOW_assignmentOperator_in_expression2050);
                    ap=assignmentOperator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_assignmentOperator.add(ap.getTree());
                    pushFollow(FOLLOW_expression_in_expression2052);
                    expression128=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression128.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: expression, orExpression, orExpression, expression, expression, orExpression, orExpression, orExpression, orExpression, orExpression, expression, orExpression, orExpression, expression, orExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 305:8: -> {$ap.c == '='}? ^( EQ[$ap.tk, \"=\"] orExpression expression )
            if ((ap!=null?ap.c:0) == '=') {
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:305:27: ^( EQ[$ap.tk, \"=\"] orExpression expression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EQ, (ap!=null?ap.tk:null), "="), root_1);

                adaptor.addChild(root_1, stream_orExpression.nextTree());
                adaptor.addChild(root_1, stream_expression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 306:8: -> {$ap.c == '+'}? ^( EQ[$ap.tk, \"=\"] orExpression ^( PLUS[$ap.tk, \"+\"] orExpression expression ) )
            if ((ap!=null?ap.c:0) == '+') {
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:306:27: ^( EQ[$ap.tk, \"=\"] orExpression ^( PLUS[$ap.tk, \"+\"] orExpression expression ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EQ, (ap!=null?ap.tk:null), "="), root_1);

                adaptor.addChild(root_1, stream_orExpression.nextTree());
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:306:58: ^( PLUS[$ap.tk, \"+\"] orExpression expression )
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
            else // 307:8: -> {$ap.c == '-'}? ^( EQ[$ap.tk, \"=\"] orExpression ^( MINUS[$ap.tk, \"-\"] orExpression expression ) )
            if ((ap!=null?ap.c:0) == '-') {
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:307:27: ^( EQ[$ap.tk, \"=\"] orExpression ^( MINUS[$ap.tk, \"-\"] orExpression expression ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EQ, (ap!=null?ap.tk:null), "="), root_1);

                adaptor.addChild(root_1, stream_orExpression.nextTree());
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:307:58: ^( MINUS[$ap.tk, \"-\"] orExpression expression )
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
            else // 308:8: -> {$ap.c == '*'}? ^( EQ[$ap.tk, \"=\"] orExpression ^( STAR[$ap.tk, \"*\"] orExpression expression ) )
            if ((ap!=null?ap.c:0) == '*') {
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:308:27: ^( EQ[$ap.tk, \"=\"] orExpression ^( STAR[$ap.tk, \"*\"] orExpression expression ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EQ, (ap!=null?ap.tk:null), "="), root_1);

                adaptor.addChild(root_1, stream_orExpression.nextTree());
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:308:58: ^( STAR[$ap.tk, \"*\"] orExpression expression )
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
            else // 309:8: -> {$ap.c == '/'}? ^( EQ[$ap.tk, \"=\"] orExpression ^( SLASH[$ap.tk, \"/\"] orExpression expression ) )
            if ((ap!=null?ap.c:0) == '/') {
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:309:27: ^( EQ[$ap.tk, \"=\"] orExpression ^( SLASH[$ap.tk, \"/\"] orExpression expression ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EQ, (ap!=null?ap.tk:null), "="), root_1);

                adaptor.addChild(root_1, stream_orExpression.nextTree());
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:309:58: ^( SLASH[$ap.tk, \"/\"] orExpression expression )
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
            else // 310:8: -> orExpression
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
         
        	catch (RecognitionException e) { 
        		throw e; 
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:313:1: assignmentOperator returns [char c, Token tk] : (t= '=' | t= '+=' | t= '-=' | t= '*=' | t= '/=' );
    public final JaParser.assignmentOperator_return assignmentOperator() throws RecognitionException {
        JaParser.assignmentOperator_return retval = new JaParser.assignmentOperator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token t=null;

        Object t_tree=null;

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:314:5: (t= '=' | t= '+=' | t= '-=' | t= '*=' | t= '/=' )
            int alt33=5;
            switch ( input.LA(1) ) {
            case EQ:
                {
                alt33=1;
                }
                break;
            case 95:
                {
                alt33=2;
                }
                break;
            case 96:
                {
                alt33=3;
                }
                break;
            case 97:
                {
                alt33=4;
                }
                break;
            case 98:
                {
                alt33=5;
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
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:314:9: t= '='
                    {
                    root_0 = (Object)adaptor.nil();

                    t=(Token)match(input,EQ,FOLLOW_EQ_in_assignmentOperator2226); if (state.failed) return retval;
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
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:315:9: t= '+='
                    {
                    root_0 = (Object)adaptor.nil();

                    t=(Token)match(input,95,FOLLOW_95_in_assignmentOperator2241); if (state.failed) return retval;
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
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:316:9: t= '-='
                    {
                    root_0 = (Object)adaptor.nil();

                    t=(Token)match(input,96,FOLLOW_96_in_assignmentOperator2255); if (state.failed) return retval;
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
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:317:9: t= '*='
                    {
                    root_0 = (Object)adaptor.nil();

                    t=(Token)match(input,97,FOLLOW_97_in_assignmentOperator2269); if (state.failed) return retval;
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
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:318:9: t= '/='
                    {
                    root_0 = (Object)adaptor.nil();

                    t=(Token)match(input,98,FOLLOW_98_in_assignmentOperator2283); if (state.failed) return retval;
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
         
        	catch (RecognitionException e) { 
        		throw e; 
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:321:1: orExpression : andExpression ( '||' andExpression )* ;
    public final JaParser.orExpression_return orExpression() throws RecognitionException {
        JaParser.orExpression_return retval = new JaParser.orExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal130=null;
        JaParser.andExpression_return andExpression129 = null;

        JaParser.andExpression_return andExpression131 = null;


        Object string_literal130_tree=null;

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:322:5: ( andExpression ( '||' andExpression )* )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:322:9: andExpression ( '||' andExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_andExpression_in_orExpression2304);
            andExpression129=andExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, andExpression129.getTree());
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:322:23: ( '||' andExpression )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==99) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:322:25: '||' andExpression
            	    {
            	    string_literal130=(Token)match(input,99,FOLLOW_99_in_orExpression2308); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal130_tree = (Object)adaptor.create(string_literal130);
            	    root_0 = (Object)adaptor.becomeRoot(string_literal130_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_andExpression_in_orExpression2311);
            	    andExpression131=andExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, andExpression131.getTree());

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
         
        	catch (RecognitionException e) { 
        		throw e; 
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:325:1: andExpression : equalityExpression ( '&&' equalityExpression )* ;
    public final JaParser.andExpression_return andExpression() throws RecognitionException {
        JaParser.andExpression_return retval = new JaParser.andExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal133=null;
        JaParser.equalityExpression_return equalityExpression132 = null;

        JaParser.equalityExpression_return equalityExpression134 = null;


        Object string_literal133_tree=null;

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:326:5: ( equalityExpression ( '&&' equalityExpression )* )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:326:9: equalityExpression ( '&&' equalityExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equalityExpression_in_andExpression2333);
            equalityExpression132=equalityExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression132.getTree());
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:326:28: ( '&&' equalityExpression )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==100) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:326:30: '&&' equalityExpression
            	    {
            	    string_literal133=(Token)match(input,100,FOLLOW_100_in_andExpression2337); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal133_tree = (Object)adaptor.create(string_literal133);
            	    root_0 = (Object)adaptor.becomeRoot(string_literal133_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_equalityExpression_in_andExpression2340);
            	    equalityExpression134=equalityExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression134.getTree());

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
         
        	catch (RecognitionException e) { 
        		throw e; 
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:329:1: equalityExpression : instanceOfExpression ( ( '==' | '!=' ) instanceOfExpression )* ;
    public final JaParser.equalityExpression_return equalityExpression() throws RecognitionException {
        JaParser.equalityExpression_return retval = new JaParser.equalityExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set136=null;
        JaParser.instanceOfExpression_return instanceOfExpression135 = null;

        JaParser.instanceOfExpression_return instanceOfExpression137 = null;


        Object set136_tree=null;

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:330:5: ( instanceOfExpression ( ( '==' | '!=' ) instanceOfExpression )* )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:330:9: instanceOfExpression ( ( '==' | '!=' ) instanceOfExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_instanceOfExpression_in_equalityExpression2362);
            instanceOfExpression135=instanceOfExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, instanceOfExpression135.getTree());
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:330:30: ( ( '==' | '!=' ) instanceOfExpression )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=101 && LA36_0<=102)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:330:32: ( '==' | '!=' ) instanceOfExpression
            	    {
            	    set136=(Token)input.LT(1);
            	    set136=(Token)input.LT(1);
            	    if ( (input.LA(1)>=101 && input.LA(1)<=102) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set136), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_instanceOfExpression_in_equalityExpression2375);
            	    instanceOfExpression137=instanceOfExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, instanceOfExpression137.getTree());

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
         
        	catch (RecognitionException e) { 
        		throw e; 
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:333:1: instanceOfExpression : relationalExpression ( INSTANCEOF type )? ;
    public final JaParser.instanceOfExpression_return instanceOfExpression() throws RecognitionException {
        JaParser.instanceOfExpression_return retval = new JaParser.instanceOfExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INSTANCEOF139=null;
        JaParser.relationalExpression_return relationalExpression138 = null;

        JaParser.type_return type140 = null;


        Object INSTANCEOF139_tree=null;

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:334:5: ( relationalExpression ( INSTANCEOF type )? )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:334:9: relationalExpression ( INSTANCEOF type )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relationalExpression_in_instanceOfExpression2397);
            relationalExpression138=relationalExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression138.getTree());
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:334:30: ( INSTANCEOF type )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==INSTANCEOF) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:334:31: INSTANCEOF type
                    {
                    INSTANCEOF139=(Token)match(input,INSTANCEOF,FOLLOW_INSTANCEOF_in_instanceOfExpression2400); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INSTANCEOF139_tree = (Object)adaptor.create(INSTANCEOF139);
                    root_0 = (Object)adaptor.becomeRoot(INSTANCEOF139_tree, root_0);
                    }
                    pushFollow(FOLLOW_type_in_instanceOfExpression2403);
                    type140=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type140.getTree());

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
         
        	catch (RecognitionException e) { 
        		throw e; 
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:337:1: relationalExpression : additiveExpression ( COMPAREOP additiveExpression )* ;
    public final JaParser.relationalExpression_return relationalExpression() throws RecognitionException {
        JaParser.relationalExpression_return retval = new JaParser.relationalExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMPAREOP142=null;
        JaParser.additiveExpression_return additiveExpression141 = null;

        JaParser.additiveExpression_return additiveExpression143 = null;


        Object COMPAREOP142_tree=null;

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:338:5: ( additiveExpression ( COMPAREOP additiveExpression )* )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:338:9: additiveExpression ( COMPAREOP additiveExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_additiveExpression_in_relationalExpression2424);
            additiveExpression141=additiveExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression141.getTree());
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:338:28: ( COMPAREOP additiveExpression )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==COMPAREOP) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:338:30: COMPAREOP additiveExpression
            	    {
            	    COMPAREOP142=(Token)match(input,COMPAREOP,FOLLOW_COMPAREOP_in_relationalExpression2428); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    COMPAREOP142_tree = (Object)adaptor.create(COMPAREOP142);
            	    root_0 = (Object)adaptor.becomeRoot(COMPAREOP142_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_additiveExpression_in_relationalExpression2431);
            	    additiveExpression143=additiveExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression143.getTree());

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
         
        	catch (RecognitionException e) { 
        		throw e; 
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:341:1: additiveExpression : multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )* ;
    public final JaParser.additiveExpression_return additiveExpression() throws RecognitionException {
        JaParser.additiveExpression_return retval = new JaParser.additiveExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set145=null;
        JaParser.multiplicativeExpression_return multiplicativeExpression144 = null;

        JaParser.multiplicativeExpression_return multiplicativeExpression146 = null;


        Object set145_tree=null;

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:342:5: ( multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )* )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:342:9: multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression2453);
            multiplicativeExpression144=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression144.getTree());
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:342:34: ( ( '+' | '-' ) multiplicativeExpression )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=PLUS && LA39_0<=MINUS)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:342:36: ( '+' | '-' ) multiplicativeExpression
            	    {
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
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression2466);
            	    multiplicativeExpression146=multiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression146.getTree());

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
         
        	catch (RecognitionException e) { 
        		throw e; 
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:345:1: multiplicativeExpression : unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )* ;
    public final JaParser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        JaParser.multiplicativeExpression_return retval = new JaParser.multiplicativeExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set148=null;
        JaParser.unaryExpression_return unaryExpression147 = null;

        JaParser.unaryExpression_return unaryExpression149 = null;


        Object set148_tree=null;

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:346:5: ( unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )* )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:346:9: unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression2488);
            unaryExpression147=unaryExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression147.getTree());
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:346:25: ( ( '*' | '/' | '%' ) unaryExpression )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( ((LA40_0>=STAR && LA40_0<=SLASH)||LA40_0==103) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:346:27: ( '*' | '/' | '%' ) unaryExpression
            	    {
            	    set148=(Token)input.LT(1);
            	    set148=(Token)input.LT(1);
            	    if ( (input.LA(1)>=STAR && input.LA(1)<=SLASH)||input.LA(1)==103 ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set148), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression2507);
            	    unaryExpression149=unaryExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression149.getTree());

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
         
        	catch (RecognitionException e) { 
        		throw e; 
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:349:1: unaryExpression : (up= '+' unaryExpression -> ^( UNARYPLUS[$up] unaryExpression ) | um= '-' unaryExpression -> ^( UNARYMINUS[$um] unaryExpression ) | pi= '++' unaryExpression -> ^( PREINC[$pi] unaryExpression ) | pd= '--' unaryExpression -> ^( PREDEC[$pd] unaryExpression ) | unaryExpressionNotPlusMinus );
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
        RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
        RewriteRuleSubtreeStream stream_unaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule unaryExpression");
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:350:5: (up= '+' unaryExpression -> ^( UNARYPLUS[$up] unaryExpression ) | um= '-' unaryExpression -> ^( UNARYMINUS[$um] unaryExpression ) | pi= '++' unaryExpression -> ^( PREINC[$pi] unaryExpression ) | pd= '--' unaryExpression -> ^( PREDEC[$pd] unaryExpression ) | unaryExpressionNotPlusMinus )
            int alt41=5;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt41=1;
                }
                break;
            case MINUS:
                {
                alt41=2;
                }
                break;
            case 104:
                {
                alt41=3;
                }
                break;
            case 105:
                {
                alt41=4;
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
            case 93:
            case 106:
                {
                alt41=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:350:9: up= '+' unaryExpression
                    {
                    up=(Token)match(input,PLUS,FOLLOW_PLUS_in_unaryExpression2535); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUS.add(up);

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression2538);
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
                    // 350:33: -> ^( UNARYPLUS[$up] unaryExpression )
                    {
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:350:36: ^( UNARYPLUS[$up] unaryExpression )
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
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:351:9: um= '-' unaryExpression
                    {
                    um=(Token)match(input,MINUS,FOLLOW_MINUS_in_unaryExpression2561); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(um);

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression2564);
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
                    // 351:33: -> ^( UNARYMINUS[$um] unaryExpression )
                    {
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:351:36: ^( UNARYMINUS[$um] unaryExpression )
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
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:352:9: pi= '++' unaryExpression
                    {
                    pi=(Token)match(input,104,FOLLOW_104_in_unaryExpression2585); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_104.add(pi);

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression2587);
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
                    // 352:33: -> ^( PREINC[$pi] unaryExpression )
                    {
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:352:36: ^( PREINC[$pi] unaryExpression )
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
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:353:9: pd= '--' unaryExpression
                    {
                    pd=(Token)match(input,105,FOLLOW_105_in_unaryExpression2608); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_105.add(pd);

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression2610);
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
                    // 353:33: -> ^( PREDEC[$pd] unaryExpression )
                    {
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:353:36: ^( PREDEC[$pd] unaryExpression )
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
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:354:9: unaryExpressionNotPlusMinus
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression2629);
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
         
        	catch (RecognitionException e) { 
        		throw e; 
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:357:1: unaryExpressionNotPlusMinus : ( '!' unaryExpression | lp= '(' primitiveType ')' unaryExpression -> ^( CAST[$lp, \"CAST\"] primitiveType unaryExpression ) | lp= '(' arrayType ')' unaryExpression -> ^( CAST[$lp, \"CAST\"] arrayType unaryExpression ) | lp= '(' classType ')' unaryExpressionNotPlusMinus -> ^( CAST[$lp, \"CAST\"] classType unaryExpressionNotPlusMinus ) | NEW creator | ( primary -> primary ) ( selector[(CommonTree)$unaryExpressionNotPlusMinus.tree] -> selector )* ( '++' -> ^( POSTINC $unaryExpressionNotPlusMinus) | '--' -> ^( POSTDEC $unaryExpressionNotPlusMinus) )* );
    public final JaParser.unaryExpressionNotPlusMinus_return unaryExpressionNotPlusMinus() throws RecognitionException {
        JaParser.unaryExpressionNotPlusMinus_return retval = new JaParser.unaryExpressionNotPlusMinus_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lp=null;
        Token char_literal155=null;
        Token char_literal158=null;
        Token char_literal161=null;
        Token char_literal164=null;
        Token NEW166=null;
        Token string_literal170=null;
        Token string_literal171=null;
        JaParser.unaryExpression_return unaryExpression156 = null;

        JaParser.primitiveType_return primitiveType157 = null;

        JaParser.unaryExpression_return unaryExpression159 = null;

        JaParser.arrayType_return arrayType160 = null;

        JaParser.unaryExpression_return unaryExpression162 = null;

        JaParser.classType_return classType163 = null;

        JaParser.unaryExpressionNotPlusMinus_return unaryExpressionNotPlusMinus165 = null;

        JaParser.creator_return creator167 = null;

        JaParser.primary_return primary168 = null;

        JaParser.selector_return selector169 = null;


        Object lp_tree=null;
        Object char_literal155_tree=null;
        Object char_literal158_tree=null;
        Object char_literal161_tree=null;
        Object char_literal164_tree=null;
        Object NEW166_tree=null;
        Object string_literal170_tree=null;
        Object string_literal171_tree=null;
        RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
        RewriteRuleTokenStream stream_94=new RewriteRuleTokenStream(adaptor,"token 94");
        RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleSubtreeStream stream_unaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule unaryExpression");
        RewriteRuleSubtreeStream stream_primary=new RewriteRuleSubtreeStream(adaptor,"rule primary");
        RewriteRuleSubtreeStream stream_selector=new RewriteRuleSubtreeStream(adaptor,"rule selector");
        RewriteRuleSubtreeStream stream_unaryExpressionNotPlusMinus=new RewriteRuleSubtreeStream(adaptor,"rule unaryExpressionNotPlusMinus");
        RewriteRuleSubtreeStream stream_arrayType=new RewriteRuleSubtreeStream(adaptor,"rule arrayType");
        RewriteRuleSubtreeStream stream_classType=new RewriteRuleSubtreeStream(adaptor,"rule classType");
        RewriteRuleSubtreeStream stream_primitiveType=new RewriteRuleSubtreeStream(adaptor,"rule primitiveType");
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:358:5: ( '!' unaryExpression | lp= '(' primitiveType ')' unaryExpression -> ^( CAST[$lp, \"CAST\"] primitiveType unaryExpression ) | lp= '(' arrayType ')' unaryExpression -> ^( CAST[$lp, \"CAST\"] arrayType unaryExpression ) | lp= '(' classType ')' unaryExpressionNotPlusMinus -> ^( CAST[$lp, \"CAST\"] classType unaryExpressionNotPlusMinus ) | NEW creator | ( primary -> primary ) ( selector[(CommonTree)$unaryExpressionNotPlusMinus.tree] -> selector )* ( '++' -> ^( POSTINC $unaryExpressionNotPlusMinus) | '--' -> ^( POSTDEC $unaryExpressionNotPlusMinus) )* )
            int alt44=6;
            alt44 = dfa44.predict(input);
            switch (alt44) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:358:7: '!' unaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal155=(Token)match(input,106,FOLLOW_106_in_unaryExpressionNotPlusMinus2646); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal155_tree = (Object)adaptor.create(char_literal155);
                    root_0 = (Object)adaptor.becomeRoot(char_literal155_tree, root_0);
                    }
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus2649);
                    unaryExpression156=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression156.getTree());

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:360:9: lp= '(' primitiveType ')' unaryExpression
                    {
                    lp=(Token)match(input,93,FOLLOW_93_in_unaryExpressionNotPlusMinus2666); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_93.add(lp);

                    pushFollow(FOLLOW_primitiveType_in_unaryExpressionNotPlusMinus2668);
                    primitiveType157=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primitiveType.add(primitiveType157.getTree());
                    char_literal158=(Token)match(input,94,FOLLOW_94_in_unaryExpressionNotPlusMinus2670); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_94.add(char_literal158);

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus2672);
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
                    // 361:7: -> ^( CAST[$lp, \"CAST\"] primitiveType unaryExpression )
                    {
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:361:10: ^( CAST[$lp, \"CAST\"] primitiveType unaryExpression )
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
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:363:9: lp= '(' arrayType ')' unaryExpression
                    {
                    lp=(Token)match(input,93,FOLLOW_93_in_unaryExpressionNotPlusMinus2706); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_93.add(lp);

                    pushFollow(FOLLOW_arrayType_in_unaryExpressionNotPlusMinus2708);
                    arrayType160=arrayType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arrayType.add(arrayType160.getTree());
                    char_literal161=(Token)match(input,94,FOLLOW_94_in_unaryExpressionNotPlusMinus2710); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_94.add(char_literal161);

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus2712);
                    unaryExpression162=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression162.getTree());


                    // AST REWRITE
                    // elements: unaryExpression, arrayType
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 364:7: -> ^( CAST[$lp, \"CAST\"] arrayType unaryExpression )
                    {
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:364:10: ^( CAST[$lp, \"CAST\"] arrayType unaryExpression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CAST, lp, "CAST"), root_1);

                        adaptor.addChild(root_1, stream_arrayType.nextTree());
                        adaptor.addChild(root_1, stream_unaryExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:366:9: lp= '(' classType ')' unaryExpressionNotPlusMinus
                    {
                    lp=(Token)match(input,93,FOLLOW_93_in_unaryExpressionNotPlusMinus2748); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_93.add(lp);

                    pushFollow(FOLLOW_classType_in_unaryExpressionNotPlusMinus2750);
                    classType163=classType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_classType.add(classType163.getTree());
                    char_literal164=(Token)match(input,94,FOLLOW_94_in_unaryExpressionNotPlusMinus2753); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_94.add(char_literal164);

                    pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpressionNotPlusMinus2755);
                    unaryExpressionNotPlusMinus165=unaryExpressionNotPlusMinus();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpressionNotPlusMinus.add(unaryExpressionNotPlusMinus165.getTree());


                    // AST REWRITE
                    // elements: unaryExpressionNotPlusMinus, classType
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 367:7: -> ^( CAST[$lp, \"CAST\"] classType unaryExpressionNotPlusMinus )
                    {
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:367:10: ^( CAST[$lp, \"CAST\"] classType unaryExpressionNotPlusMinus )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CAST, lp, "CAST"), root_1);

                        adaptor.addChild(root_1, stream_classType.nextTree());
                        adaptor.addChild(root_1, stream_unaryExpressionNotPlusMinus.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:369:9: NEW creator
                    {
                    root_0 = (Object)adaptor.nil();

                    NEW166=(Token)match(input,NEW,FOLLOW_NEW_in_unaryExpressionNotPlusMinus2789); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NEW166_tree = (Object)adaptor.create(NEW166);
                    root_0 = (Object)adaptor.becomeRoot(NEW166_tree, root_0);
                    }
                    pushFollow(FOLLOW_creator_in_unaryExpressionNotPlusMinus2792);
                    creator167=creator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, creator167.getTree());

                    }
                    break;
                case 6 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:371:9: ( primary -> primary ) ( selector[(CommonTree)$unaryExpressionNotPlusMinus.tree] -> selector )* ( '++' -> ^( POSTINC $unaryExpressionNotPlusMinus) | '--' -> ^( POSTDEC $unaryExpressionNotPlusMinus) )*
                    {
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:371:9: ( primary -> primary )
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:371:10: primary
                    {
                    pushFollow(FOLLOW_primary_in_unaryExpressionNotPlusMinus2808);
                    primary168=primary();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primary.add(primary168.getTree());


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
                    // 371:18: -> primary
                    {
                        adaptor.addChild(root_0, stream_primary.nextTree());

                    }

                    retval.tree = root_0;}
                    }

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:371:31: ( selector[(CommonTree)$unaryExpressionNotPlusMinus.tree] -> selector )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( ((LA42_0>=107 && LA42_0<=108)) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:371:32: selector[(CommonTree)$unaryExpressionNotPlusMinus.tree]
                    	    {
                    	    pushFollow(FOLLOW_selector_in_unaryExpressionNotPlusMinus2817);
                    	    selector169=selector((CommonTree)((Object)retval.tree));

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_selector.add(selector169.getTree());


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
                    	    // 371:88: -> selector
                    	    {
                    	        adaptor.addChild(root_0, stream_selector.nextTree());

                    	    }

                    	    retval.tree = root_0;}
                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:372:7: ( '++' -> ^( POSTINC $unaryExpressionNotPlusMinus) | '--' -> ^( POSTDEC $unaryExpressionNotPlusMinus) )*
                    loop43:
                    do {
                        int alt43=3;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==104) ) {
                            alt43=1;
                        }
                        else if ( (LA43_0==105) ) {
                            alt43=2;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:372:8: '++'
                    	    {
                    	    string_literal170=(Token)match(input,104,FOLLOW_104_in_unaryExpressionNotPlusMinus2834); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_104.add(string_literal170);



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
                    	    // 372:13: -> ^( POSTINC $unaryExpressionNotPlusMinus)
                    	    {
                    	        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:372:16: ^( POSTINC $unaryExpressionNotPlusMinus)
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
                    	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:372:58: '--'
                    	    {
                    	    string_literal171=(Token)match(input,105,FOLLOW_105_in_unaryExpressionNotPlusMinus2847); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_105.add(string_literal171);



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
                    	    // 372:63: -> ^( POSTDEC $unaryExpressionNotPlusMinus)
                    	    {
                    	        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:372:66: ^( POSTDEC $unaryExpressionNotPlusMinus)
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

                    	default :
                    	    break loop43;
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
         
        	catch (RecognitionException e) { 
        		throw e; 
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:376:1: primary : ( parExpression | THIS | SUPER superMemberAccess | literal | IDENTIFIER | IDENTIFIER arguments -> ^( METHODCALL THIS IDENTIFIER ( arguments )? ) | type '.' CLASS -> ^( DOTCLASS type ) | VOID '.' CLASS -> ^( DOTCLASS VOID ) );
    public final JaParser.primary_return primary() throws RecognitionException {
        JaParser.primary_return retval = new JaParser.primary_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token THIS173=null;
        Token SUPER174=null;
        Token IDENTIFIER177=null;
        Token IDENTIFIER178=null;
        Token char_literal181=null;
        Token CLASS182=null;
        Token VOID183=null;
        Token char_literal184=null;
        Token CLASS185=null;
        JaParser.parExpression_return parExpression172 = null;

        JaParser.superMemberAccess_return superMemberAccess175 = null;

        JaParser.literal_return literal176 = null;

        JaParser.arguments_return arguments179 = null;

        JaParser.type_return type180 = null;


        Object THIS173_tree=null;
        Object SUPER174_tree=null;
        Object IDENTIFIER177_tree=null;
        Object IDENTIFIER178_tree=null;
        Object char_literal181_tree=null;
        Object CLASS182_tree=null;
        Object VOID183_tree=null;
        Object char_literal184_tree=null;
        Object CLASS185_tree=null;
        RewriteRuleTokenStream stream_CLASS=new RewriteRuleTokenStream(adaptor,"token CLASS");
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_VOID=new RewriteRuleTokenStream(adaptor,"token VOID");
        RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:377:5: ( parExpression | THIS | SUPER superMemberAccess | literal | IDENTIFIER | IDENTIFIER arguments -> ^( METHODCALL THIS IDENTIFIER ( arguments )? ) | type '.' CLASS -> ^( DOTCLASS type ) | VOID '.' CLASS -> ^( DOTCLASS VOID ) )
            int alt45=8;
            alt45 = dfa45.predict(input);
            switch (alt45) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:377:9: parExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_parExpression_in_primary2884);
                    parExpression172=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parExpression172.getTree());

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:378:9: THIS
                    {
                    root_0 = (Object)adaptor.nil();

                    THIS173=(Token)match(input,THIS,FOLLOW_THIS_in_primary2894); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    THIS173_tree = (Object)adaptor.create(THIS173);
                    adaptor.addChild(root_0, THIS173_tree);
                    }

                    }
                    break;
                case 3 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:379:9: SUPER superMemberAccess
                    {
                    root_0 = (Object)adaptor.nil();

                    SUPER174=(Token)match(input,SUPER,FOLLOW_SUPER_in_primary2905); if (state.failed) return retval;
                    pushFollow(FOLLOW_superMemberAccess_in_primary2908);
                    superMemberAccess175=superMemberAccess();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, superMemberAccess175.getTree());

                    }
                    break;
                case 4 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:380:9: literal
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_literal_in_primary2918);
                    literal176=literal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, literal176.getTree());

                    }
                    break;
                case 5 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:381:9: IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();

                    IDENTIFIER177=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary2928); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER177_tree = (Object)adaptor.create(IDENTIFIER177);
                    adaptor.addChild(root_0, IDENTIFIER177_tree);
                    }

                    }
                    break;
                case 6 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:382:8: IDENTIFIER arguments
                    {
                    IDENTIFIER178=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary2937); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER178);

                    pushFollow(FOLLOW_arguments_in_primary2940);
                    arguments179=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arguments.add(arguments179.getTree());


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
                    // 382:30: -> ^( METHODCALL THIS IDENTIFIER ( arguments )? )
                    {
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:382:33: ^( METHODCALL THIS IDENTIFIER ( arguments )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(METHODCALL, "METHODCALL"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(THIS, "THIS"));
                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:382:62: ( arguments )?
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
                case 7 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:383:7: type '.' CLASS
                    {
                    pushFollow(FOLLOW_type_in_primary2961);
                    type180=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type180.getTree());
                    char_literal181=(Token)match(input,107,FOLLOW_107_in_primary2963); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_107.add(char_literal181);

                    CLASS182=(Token)match(input,CLASS,FOLLOW_CLASS_in_primary2965); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLASS.add(CLASS182);



                    // AST REWRITE
                    // elements: type
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 383:22: -> ^( DOTCLASS type )
                    {
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:383:25: ^( DOTCLASS type )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DOTCLASS, "DOTCLASS"), root_1);

                        adaptor.addChild(root_1, stream_type.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:384:9: VOID '.' CLASS
                    {
                    VOID183=(Token)match(input,VOID,FOLLOW_VOID_in_primary2983); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VOID.add(VOID183);

                    char_literal184=(Token)match(input,107,FOLLOW_107_in_primary2985); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_107.add(char_literal184);

                    CLASS185=(Token)match(input,CLASS,FOLLOW_CLASS_in_primary2987); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLASS.add(CLASS185);



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
                    // 384:24: -> ^( DOTCLASS VOID )
                    {
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:384:27: ^( DOTCLASS VOID )
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
         
        	catch (RecognitionException e) { 
        		throw e; 
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:387:1: selector[CommonTree primary] : ( '.' IDENTIFIER -> ^( FIELDACCESS IDENTIFIER ) | '.' IDENTIFIER arguments -> ^( METHODCALL IDENTIFIER ( arguments )? ) | lb= '[' expression ']' -> ^( ARRAYACCESS[$lb, \"ARRAYACCESS\"] expression ) );
    public final JaParser.selector_return selector(CommonTree primary) throws RecognitionException {
        JaParser.selector_return retval = new JaParser.selector_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lb=null;
        Token char_literal186=null;
        Token IDENTIFIER187=null;
        Token char_literal188=null;
        Token IDENTIFIER189=null;
        Token char_literal192=null;
        JaParser.arguments_return arguments190 = null;

        JaParser.expression_return expression191 = null;


        Object lb_tree=null;
        Object char_literal186_tree=null;
        Object IDENTIFIER187_tree=null;
        Object char_literal188_tree=null;
        Object IDENTIFIER189_tree=null;
        Object char_literal192_tree=null;
        RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:388:5: ( '.' IDENTIFIER -> ^( FIELDACCESS IDENTIFIER ) | '.' IDENTIFIER arguments -> ^( METHODCALL IDENTIFIER ( arguments )? ) | lb= '[' expression ']' -> ^( ARRAYACCESS[$lb, \"ARRAYACCESS\"] expression ) )
            int alt46=3;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==107) ) {
                int LA46_1 = input.LA(2);

                if ( (LA46_1==IDENTIFIER) ) {
                    int LA46_3 = input.LA(3);

                    if ( (LA46_3==93) ) {
                        alt46=2;
                    }
                    else if ( ((LA46_3>=INSTANCEOF && LA46_3<=COMPAREOP)||(LA46_3>=EQ && LA46_3<=SLASH)||LA46_3==89||(LA46_3>=91 && LA46_3<=92)||(LA46_3>=94 && LA46_3<=105)||(LA46_3>=107 && LA46_3<=109)) ) {
                        alt46=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 46, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 46, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA46_0==108) ) {
                alt46=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:388:9: '.' IDENTIFIER
                    {
                    char_literal186=(Token)match(input,107,FOLLOW_107_in_selector3020); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_107.add(char_literal186);

                    IDENTIFIER187=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_selector3022); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER187);



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
                    // 388:34: -> ^( FIELDACCESS IDENTIFIER )
                    {
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:388:37: ^( FIELDACCESS IDENTIFIER )
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
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:389:7: '.' IDENTIFIER arguments
                    {
                    char_literal188=(Token)match(input,107,FOLLOW_107_in_selector3050); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_107.add(char_literal188);

                    IDENTIFIER189=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_selector3052); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER189);

                    pushFollow(FOLLOW_arguments_in_selector3054);
                    arguments190=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arguments.add(arguments190.getTree());


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
                    // 389:32: -> ^( METHODCALL IDENTIFIER ( arguments )? )
                    {
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:389:35: ^( METHODCALL IDENTIFIER ( arguments )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(METHODCALL, "METHODCALL"), root_1);

                        adaptor.addChild(root_1, primary);
                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:389:71: ( arguments )?
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
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:390:9: lb= '[' expression ']'
                    {
                    lb=(Token)match(input,108,FOLLOW_108_in_selector3080); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_108.add(lb);

                    pushFollow(FOLLOW_expression_in_selector3082);
                    expression191=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression191.getTree());
                    char_literal192=(Token)match(input,109,FOLLOW_109_in_selector3084); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_109.add(char_literal192);



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
                    // 390:34: -> ^( ARRAYACCESS[$lb, \"ARRAYACCESS\"] expression )
                    {
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:390:37: ^( ARRAYACCESS[$lb, \"ARRAYACCESS\"] expression )
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
         
        	catch (RecognitionException e) { 
        		throw e; 
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:393:1: creator : ( createdName arrayCreatorRest[(CommonTree)$createdName.tree] | classType classCreatorRest );
    public final JaParser.creator_return creator() throws RecognitionException {
        JaParser.creator_return retval = new JaParser.creator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.createdName_return createdName193 = null;

        JaParser.arrayCreatorRest_return arrayCreatorRest194 = null;

        JaParser.classType_return classType195 = null;

        JaParser.classCreatorRest_return classCreatorRest196 = null;



        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:394:5: ( createdName arrayCreatorRest[(CommonTree)$createdName.tree] | classType classCreatorRest )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==IDENTIFIER) ) {
                int LA47_1 = input.LA(2);

                if ( (LA47_1==93) ) {
                    alt47=2;
                }
                else if ( (LA47_1==108) ) {
                    alt47=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA47_0>=CHAR && LA47_0<=BOOLEAN)) ) {
                alt47=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:394:7: createdName arrayCreatorRest[(CommonTree)$createdName.tree]
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_createdName_in_creator3115);
                    createdName193=createdName();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_arrayCreatorRest_in_creator3118);
                    arrayCreatorRest194=arrayCreatorRest((CommonTree)(createdName193!=null?((Object)createdName193.tree):null));

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayCreatorRest194.getTree());

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:395:7: classType classCreatorRest
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_classType_in_creator3127);
                    classType195=classType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classType195.getTree());
                    pushFollow(FOLLOW_classCreatorRest_in_creator3129);
                    classCreatorRest196=classCreatorRest();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classCreatorRest196.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
         
        	catch (RecognitionException e) { 
        		throw e; 
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:398:1: createdName : ( classType | primitiveType );
    public final JaParser.createdName_return createdName() throws RecognitionException {
        JaParser.createdName_return retval = new JaParser.createdName_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.classType_return classType197 = null;

        JaParser.primitiveType_return primitiveType198 = null;



        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:399:5: ( classType | primitiveType )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==IDENTIFIER) ) {
                alt48=1;
            }
            else if ( ((LA48_0>=CHAR && LA48_0<=BOOLEAN)) ) {
                alt48=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:399:9: classType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_classType_in_createdName3148);
                    classType197=classType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classType197.getTree());

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:400:9: primitiveType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primitiveType_in_createdName3158);
                    primitiveType198=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType198.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
         
        	catch (RecognitionException e) { 
        		throw e; 
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:403:1: arrayCreatorRest[CommonTree createdName] : ( brackets[createdName] arrayInitializer -> ^( ARRAYALLOCINIT brackets arrayInitializer ) | (lb= '[' expression ']' -> ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] expression ) ) (lb= '[' expression ']' -> ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] expression $arrayCreatorRest) )* bracketsOpt[(CommonTree)$arrayCreatorRest.tree] -> ^( ARRAYALLOC bracketsOpt ) );
    public final JaParser.arrayCreatorRest_return arrayCreatorRest(CommonTree createdName) throws RecognitionException {
        JaParser.arrayCreatorRest_return retval = new JaParser.arrayCreatorRest_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lb=null;
        Token char_literal202=null;
        Token char_literal204=null;
        JaParser.brackets_return brackets199 = null;

        JaParser.arrayInitializer_return arrayInitializer200 = null;

        JaParser.expression_return expression201 = null;

        JaParser.expression_return expression203 = null;

        JaParser.bracketsOpt_return bracketsOpt205 = null;


        Object lb_tree=null;
        Object char_literal202_tree=null;
        Object char_literal204_tree=null;
        RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleSubtreeStream stream_bracketsOpt=new RewriteRuleSubtreeStream(adaptor,"rule bracketsOpt");
        RewriteRuleSubtreeStream stream_brackets=new RewriteRuleSubtreeStream(adaptor,"rule brackets");
        RewriteRuleSubtreeStream stream_arrayInitializer=new RewriteRuleSubtreeStream(adaptor,"rule arrayInitializer");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:404:5: ( brackets[createdName] arrayInitializer -> ^( ARRAYALLOCINIT brackets arrayInitializer ) | (lb= '[' expression ']' -> ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] expression ) ) (lb= '[' expression ']' -> ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] expression $arrayCreatorRest) )* bracketsOpt[(CommonTree)$arrayCreatorRest.tree] -> ^( ARRAYALLOC bracketsOpt ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==108) ) {
                int LA50_1 = input.LA(2);

                if ( (LA50_1==109) ) {
                    alt50=1;
                }
                else if ( (LA50_1==IDENTIFIER||LA50_1==VOID||(LA50_1>=CHAR && LA50_1<=NULLLITERAL)||LA50_1==NEW||(LA50_1>=PLUS && LA50_1<=MINUS)||LA50_1==93||(LA50_1>=104 && LA50_1<=106)) ) {
                    alt50=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 50, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:404:9: brackets[createdName] arrayInitializer
                    {
                    pushFollow(FOLLOW_brackets_in_arrayCreatorRest3182);
                    brackets199=brackets(createdName);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_brackets.add(brackets199.getTree());
                    pushFollow(FOLLOW_arrayInitializer_in_arrayCreatorRest3185);
                    arrayInitializer200=arrayInitializer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arrayInitializer.add(arrayInitializer200.getTree());


                    // AST REWRITE
                    // elements: arrayInitializer, brackets
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 404:48: -> ^( ARRAYALLOCINIT brackets arrayInitializer )
                    {
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:404:51: ^( ARRAYALLOCINIT brackets arrayInitializer )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAYALLOCINIT, "ARRAYALLOCINIT"), root_1);

                        adaptor.addChild(root_1, stream_brackets.nextTree());
                        adaptor.addChild(root_1, stream_arrayInitializer.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:405:7: (lb= '[' expression ']' -> ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] expression ) ) (lb= '[' expression ']' -> ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] expression $arrayCreatorRest) )* bracketsOpt[(CommonTree)$arrayCreatorRest.tree]
                    {
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:405:7: (lb= '[' expression ']' -> ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] expression ) )
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:405:8: lb= '[' expression ']'
                    {
                    lb=(Token)match(input,108,FOLLOW_108_in_arrayCreatorRest3209); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_108.add(lb);

                    pushFollow(FOLLOW_expression_in_arrayCreatorRest3211);
                    expression201=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression201.getTree());
                    char_literal202=(Token)match(input,109,FOLLOW_109_in_arrayCreatorRest3213); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_109.add(char_literal202);



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
                    // 405:30: -> ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] expression )
                    {
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:405:33: ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] expression )
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

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:405:91: (lb= '[' expression ']' -> ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] expression $arrayCreatorRest) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==108) ) {
                            int LA49_1 = input.LA(2);

                            if ( (LA49_1==IDENTIFIER||LA49_1==VOID||(LA49_1>=CHAR && LA49_1<=NULLLITERAL)||LA49_1==NEW||(LA49_1>=PLUS && LA49_1<=MINUS)||LA49_1==93||(LA49_1>=104 && LA49_1<=106)) ) {
                                alt49=1;
                            }


                        }


                        switch (alt49) {
                    	case 1 :
                    	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:405:93: lb= '[' expression ']'
                    	    {
                    	    lb=(Token)match(input,108,FOLLOW_108_in_arrayCreatorRest3231); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_108.add(lb);

                    	    pushFollow(FOLLOW_expression_in_arrayCreatorRest3233);
                    	    expression203=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression203.getTree());
                    	    char_literal204=(Token)match(input,109,FOLLOW_109_in_arrayCreatorRest3235); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_109.add(char_literal204);



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
                    	    // 405:115: -> ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] expression $arrayCreatorRest)
                    	    {
                    	        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:405:118: ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] expression $arrayCreatorRest)
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
                    	    break loop49;
                        }
                    } while (true);

                    pushFollow(FOLLOW_bracketsOpt_in_arrayCreatorRest3261);
                    bracketsOpt205=bracketsOpt((CommonTree)((Object)retval.tree));

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_bracketsOpt.add(bracketsOpt205.getTree());


                    // AST REWRITE
                    // elements: bracketsOpt
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 406:55: -> ^( ARRAYALLOC bracketsOpt )
                    {
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:406:58: ^( ARRAYALLOC bracketsOpt )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAYALLOC, "ARRAYALLOC"), root_1);

                        adaptor.addChild(root_1, stream_bracketsOpt.nextTree());

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
         
        	catch (RecognitionException e) { 
        		throw e; 
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:409:1: classCreatorRest : arguments ;
    public final JaParser.classCreatorRest_return classCreatorRest() throws RecognitionException {
        JaParser.classCreatorRest_return retval = new JaParser.classCreatorRest_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JaParser.arguments_return arguments206 = null;



        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:410:5: ( arguments )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:410:9: arguments
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_arguments_in_classCreatorRest3290);
            arguments206=arguments();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments206.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
         
        	catch (RecognitionException e) { 
        		throw e; 
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:413:1: superMemberAccess : ( '.' IDENTIFIER -> ^( FIELDACCESS SUPER IDENTIFIER ) | '.' IDENTIFIER arguments -> ^( METHODCALL SUPER IDENTIFIER ( arguments )? ) );
    public final JaParser.superMemberAccess_return superMemberAccess() throws RecognitionException {
        JaParser.superMemberAccess_return retval = new JaParser.superMemberAccess_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal207=null;
        Token IDENTIFIER208=null;
        Token char_literal209=null;
        Token IDENTIFIER210=null;
        JaParser.arguments_return arguments211 = null;


        Object char_literal207_tree=null;
        Object IDENTIFIER208_tree=null;
        Object char_literal209_tree=null;
        Object IDENTIFIER210_tree=null;
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:414:5: ( '.' IDENTIFIER -> ^( FIELDACCESS SUPER IDENTIFIER ) | '.' IDENTIFIER arguments -> ^( METHODCALL SUPER IDENTIFIER ( arguments )? ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==107) ) {
                int LA51_1 = input.LA(2);

                if ( (LA51_1==IDENTIFIER) ) {
                    int LA51_2 = input.LA(3);

                    if ( (LA51_2==93) ) {
                        alt51=2;
                    }
                    else if ( ((LA51_2>=INSTANCEOF && LA51_2<=COMPAREOP)||(LA51_2>=EQ && LA51_2<=SLASH)||LA51_2==89||(LA51_2>=91 && LA51_2<=92)||(LA51_2>=94 && LA51_2<=105)||(LA51_2>=107 && LA51_2<=109)) ) {
                        alt51=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 51, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:414:7: '.' IDENTIFIER
                    {
                    char_literal207=(Token)match(input,107,FOLLOW_107_in_superMemberAccess3314); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_107.add(char_literal207);

                    IDENTIFIER208=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_superMemberAccess3316); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER208);



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
                    // 414:32: -> ^( FIELDACCESS SUPER IDENTIFIER )
                    {
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:414:35: ^( FIELDACCESS SUPER IDENTIFIER )
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
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:415:9: '.' IDENTIFIER arguments
                    {
                    char_literal209=(Token)match(input,107,FOLLOW_107_in_superMemberAccess3346); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_107.add(char_literal209);

                    IDENTIFIER210=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_superMemberAccess3348); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER210);

                    pushFollow(FOLLOW_arguments_in_superMemberAccess3350);
                    arguments211=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arguments.add(arguments211.getTree());


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
                    // 415:34: -> ^( METHODCALL SUPER IDENTIFIER ( arguments )? )
                    {
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:415:37: ^( METHODCALL SUPER IDENTIFIER ( arguments )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(METHODCALL, "METHODCALL"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(SUPER, "SUPER"));
                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:415:68: ( arguments )?
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
         
        	catch (RecognitionException e) { 
        		throw e; 
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:418:1: arguments : ( '(' ')' | '(' expressionList ')' -> ^( ARGUMENTS expressionList ) );
    public final JaParser.arguments_return arguments() throws RecognitionException {
        JaParser.arguments_return retval = new JaParser.arguments_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal212=null;
        Token char_literal213=null;
        Token char_literal214=null;
        Token char_literal216=null;
        JaParser.expressionList_return expressionList215 = null;


        Object char_literal212_tree=null;
        Object char_literal213_tree=null;
        Object char_literal214_tree=null;
        Object char_literal216_tree=null;
        RewriteRuleTokenStream stream_94=new RewriteRuleTokenStream(adaptor,"token 94");
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:419:5: ( '(' ')' | '(' expressionList ')' -> ^( ARGUMENTS expressionList ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==93) ) {
                int LA52_1 = input.LA(2);

                if ( (LA52_1==94) ) {
                    alt52=1;
                }
                else if ( (LA52_1==IDENTIFIER||LA52_1==VOID||(LA52_1>=CHAR && LA52_1<=NULLLITERAL)||LA52_1==NEW||(LA52_1>=PLUS && LA52_1<=MINUS)||LA52_1==93||(LA52_1>=104 && LA52_1<=106)) ) {
                    alt52=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 52, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:419:9: '(' ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal212=(Token)match(input,93,FOLLOW_93_in_arguments3383); if (state.failed) return retval;
                    char_literal213=(Token)match(input,94,FOLLOW_94_in_arguments3386); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:420:7: '(' expressionList ')'
                    {
                    char_literal214=(Token)match(input,93,FOLLOW_93_in_arguments3395); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_93.add(char_literal214);

                    pushFollow(FOLLOW_expressionList_in_arguments3397);
                    expressionList215=expressionList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expressionList.add(expressionList215.getTree());
                    char_literal216=(Token)match(input,94,FOLLOW_94_in_arguments3399); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_94.add(char_literal216);



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
                    // 420:30: -> ^( ARGUMENTS expressionList )
                    {
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:420:33: ^( ARGUMENTS expressionList )
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
         
        	catch (RecognitionException e) { 
        		throw e; 
        	} 
        finally {
        }
        return retval;
    }
    // $ANTLR end "arguments"

    public static class brackets_return extends ParserRuleReturnScope {
        public int arrayDim;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "brackets"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:423:1: brackets[CommonTree t] returns [int arrayDim] : lb= '[' ']' bracketsOpt[$t] -> ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] bracketsOpt ) ;
    public final JaParser.brackets_return brackets(CommonTree t) throws RecognitionException {
        JaParser.brackets_return retval = new JaParser.brackets_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lb=null;
        Token char_literal217=null;
        JaParser.bracketsOpt_return bracketsOpt218 = null;


        Object lb_tree=null;
        Object char_literal217_tree=null;
        RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleSubtreeStream stream_bracketsOpt=new RewriteRuleSubtreeStream(adaptor,"rule bracketsOpt");
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:424:5: (lb= '[' ']' bracketsOpt[$t] -> ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] bracketsOpt ) )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:424:7: lb= '[' ']' bracketsOpt[$t]
            {
            lb=(Token)match(input,108,FOLLOW_108_in_brackets3434); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_108.add(lb);

            char_literal217=(Token)match(input,109,FOLLOW_109_in_brackets3435); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_109.add(char_literal217);

            pushFollow(FOLLOW_bracketsOpt_in_brackets3437);
            bracketsOpt218=bracketsOpt(t);

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bracketsOpt.add(bracketsOpt218.getTree());
            if ( state.backtracking==0 ) {
               retval.arrayDim = (bracketsOpt218!=null?bracketsOpt218.arrayDim:0) + 1; 
            }


            // AST REWRITE
            // elements: bracketsOpt
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 426:6: -> ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] bracketsOpt )
            {
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:426:9: ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] bracketsOpt )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAYTYPE, lb, "ARRAYTYPE"), root_1);

                adaptor.addChild(root_1, stream_bracketsOpt.nextTree());

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
         
        	catch (RecognitionException e) { 
        		throw e; 
        	} 
        finally {
        }
        return retval;
    }
    // $ANTLR end "brackets"

    public static class bracketsOpt_return extends ParserRuleReturnScope {
        public int arrayDim;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bracketsOpt"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:430:1: bracketsOpt[CommonTree t] returns [int arrayDim] : ( ->) (l+= (lb= '[' ']' -> ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] $bracketsOpt) ) )* ;
    public final JaParser.bracketsOpt_return bracketsOpt(CommonTree t) throws RecognitionException {
        JaParser.bracketsOpt_return retval = new JaParser.bracketsOpt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lb=null;
        Token char_literal219=null;
        Token l=null;
        List list_l=null;

        Object lb_tree=null;
        Object char_literal219_tree=null;
        Object l_tree=null;
        RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:431:5: ( ( ->) (l+= (lb= '[' ']' -> ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] $bracketsOpt) ) )* )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:431:9: ( ->) (l+= (lb= '[' ']' -> ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] $bracketsOpt) ) )*
            {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:431:9: ( ->)
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:431:10: 
            {

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
            // 431:10: ->
            {
                adaptor.addChild(root_0, t);

            }

            retval.tree = root_0;}
            }

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:431:22: (l+= (lb= '[' ']' -> ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] $bracketsOpt) ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==108) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:431:22: l+= (lb= '[' ']' -> ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] $bracketsOpt) )
            	    {
            	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:431:24: (lb= '[' ']' -> ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] $bracketsOpt) )
            	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:431:25: lb= '[' ']'
            	    {
            	    lb=(Token)match(input,108,FOLLOW_108_in_bracketsOpt3506); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_108.add(lb);

            	    char_literal219=(Token)match(input,109,FOLLOW_109_in_bracketsOpt3507); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_109.add(char_literal219);



            	    // AST REWRITE
            	    // elements: bracketsOpt
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 431:35: -> ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] $bracketsOpt)
            	    {
            	        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:431:38: ^( ARRAYTYPE[$lb, \"ARRAYTYPE\"] $bracketsOpt)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAYTYPE, lb, "ARRAYTYPE"), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
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
         
        	catch (RecognitionException e) { 
        		throw e; 
        	} 
        finally {
        }
        return retval;
    }
    // $ANTLR end "bracketsOpt"

    // $ANTLR start synpred1_Ja
    public final void synpred1_Ja_fragment() throws RecognitionException {   
        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:278:7: ( ELSE )
        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:278:8: ELSE
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred1_Ja1888); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_Ja

    // Delegated rules

    public final boolean synpred1_Ja() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_Ja_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA44 dfa44 = new DFA44(this);
    protected DFA45 dfa45 = new DFA45(this);
    static final String DFA5_eotS =
        "\31\uffff";
    static final String DFA5_eofS =
        "\31\uffff";
    static final String DFA5_minS =
        "\1\46\13\50\1\uffff\1\155\1\122\1\155\1\uffff\1\50\2\uffff\1\50"+
        "\2\155\2\50";
    static final String DFA5_maxS =
        "\1\53\2\63\11\154\1\uffff\1\155\1\154\1\155\1\uffff\1\154\2\uffff"+
        "\1\154\2\155\2\154";
    static final String DFA5_acceptS =
        "\14\uffff\1\3\3\uffff\1\4\1\uffff\1\1\1\2\5\uffff";
    static final String DFA5_specialS =
        "\31\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1\4\uffff\1\2",
            "\1\13\1\uffff\1\14\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1"+
            "\12",
            "\1\13\1\uffff\1\14\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1"+
            "\12",
            "\1\16\103\uffff\1\15",
            "\1\16\103\uffff\1\15",
            "\1\16\103\uffff\1\15",
            "\1\16\103\uffff\1\15",
            "\1\16\103\uffff\1\15",
            "\1\16\103\uffff\1\15",
            "\1\16\103\uffff\1\15",
            "\1\16\103\uffff\1\15",
            "\1\16\64\uffff\1\20\16\uffff\1\17",
            "",
            "\1\21",
            "\1\23\6\uffff\1\23\2\uffff\1\23\1\22\16\uffff\1\23",
            "\1\24",
            "",
            "\1\16\103\uffff\1\25",
            "",
            "",
            "\1\16\103\uffff\1\26",
            "\1\27",
            "\1\30",
            "\1\16\103\uffff\1\25",
            "\1\16\103\uffff\1\26"
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "110:1: memberDeclaration : (m= modifier t= type IDENTIFIER formalParameters bracketsOpt[(CommonTree)$t.tree] methodBody -> ^( METHOD modifier bracketsOpt IDENTIFIER ( formalParameters )? methodBody ) | m= modifier t= type fieldDeclaration[(CommonTree)$m.tree, (CommonTree)$t.tree, $m.pub, $t.t] | m= modifier VOID IDENTIFIER formalParameters methodBody -> ^( METHOD modifier VOID IDENTIFIER ( formalParameters )? methodBody ) | modifier IDENTIFIER formalParameters constructorBody -> ^( CONSTR modifier IDENTIFIER ( formalParameters )? ( constructorBody )? ) );";
        }
    }
    static final String DFA13_eotS =
        "\15\uffff";
    static final String DFA13_eofS =
        "\15\uffff";
    static final String DFA13_minS =
        "\12\50\3\uffff";
    static final String DFA13_maxS =
        "\1\63\11\155\3\uffff";
    static final String DFA13_acceptS =
        "\12\uffff\1\1\1\3\1\2";
    static final String DFA13_specialS =
        "\15\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\11\3\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10",
            "\1\12\51\uffff\1\12\6\uffff\1\12\1\uffff\2\12\1\uffff\11\12"+
            "\4\uffff\1\12\1\13\1\12",
            "\1\12\51\uffff\1\12\6\uffff\1\12\1\uffff\2\12\1\uffff\11\12"+
            "\4\uffff\1\12\1\13\1\12",
            "\1\12\51\uffff\1\12\6\uffff\1\12\1\uffff\2\12\1\uffff\11\12"+
            "\4\uffff\1\12\1\13\1\12",
            "\1\12\51\uffff\1\12\6\uffff\1\12\1\uffff\2\12\1\uffff\11\12"+
            "\4\uffff\1\12\1\13\1\12",
            "\1\12\51\uffff\1\12\6\uffff\1\12\1\uffff\2\12\1\uffff\11\12"+
            "\4\uffff\1\12\1\13\1\12",
            "\1\12\51\uffff\1\12\6\uffff\1\12\1\uffff\2\12\1\uffff\11\12"+
            "\4\uffff\1\12\1\13\1\12",
            "\1\12\51\uffff\1\12\6\uffff\1\12\1\uffff\2\12\1\uffff\11\12"+
            "\4\uffff\1\12\1\13\1\12",
            "\1\12\51\uffff\1\12\6\uffff\1\12\1\uffff\2\12\1\uffff\11\12"+
            "\4\uffff\1\12\1\13\1\12",
            "\1\14\51\uffff\1\14\6\uffff\1\14\1\uffff\2\14\1\uffff\11\14"+
            "\4\uffff\1\14\1\13\1\14",
            "",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "163:1: type returns [Type t] : ( primitiveType | classType | arrayType );";
        }
    }
    static final String DFA22_eotS =
        "\24\uffff";
    static final String DFA22_eofS =
        "\24\uffff";
    static final String DFA22_minS =
        "\12\50\2\uffff\1\155\3\50\2\155\2\50";
    static final String DFA22_maxS =
        "\1\152\11\154\2\uffff\2\155\2\154\2\155\2\154";
    static final String DFA22_acceptS =
        "\12\uffff\1\2\1\1\10\uffff";
    static final String DFA22_specialS =
        "\24\uffff}>";
    static final String[] DFA22_transitionS = {
            "\1\11\1\uffff\1\12\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10"+
            "\17\12\3\uffff\1\12\14\uffff\2\12\4\uffff\2\12\2\uffff\1\12"+
            "\12\uffff\3\12",
            "\1\13\102\uffff\1\12\1\14",
            "\1\13\102\uffff\1\12\1\14",
            "\1\13\102\uffff\1\12\1\14",
            "\1\13\102\uffff\1\12\1\14",
            "\1\13\102\uffff\1\12\1\14",
            "\1\13\102\uffff\1\12\1\14",
            "\1\13\102\uffff\1\12\1\14",
            "\1\13\102\uffff\1\12\1\14",
            "\1\13\33\uffff\2\12\14\uffff\5\12\2\uffff\1\12\3\uffff\1\12"+
            "\1\uffff\13\12\1\uffff\1\12\1\15",
            "",
            "",
            "\1\16",
            "\1\12\1\uffff\1\12\1\uffff\22\12\10\uffff\1\12\14\uffff\2\12"+
            "\10\uffff\1\12\12\uffff\3\12\2\uffff\1\17",
            "\1\13\102\uffff\1\12\1\20",
            "\1\13\102\uffff\1\12\1\21",
            "\1\22",
            "\1\23",
            "\1\13\102\uffff\1\12\1\20",
            "\1\13\102\uffff\1\12\1\21"
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
            return "243:1: blockStatement : ( localVariableDeclarationStatement | statement );";
        }
    }
    static final String DFA30_eotS =
        "\24\uffff";
    static final String DFA30_eofS =
        "\24\uffff";
    static final String DFA30_minS =
        "\12\50\1\uffff\1\155\1\uffff\3\50\2\155\2\50";
    static final String DFA30_maxS =
        "\1\152\11\154\1\uffff\1\155\1\uffff\1\155\2\154\2\155\2\154";
    static final String DFA30_acceptS =
        "\12\uffff\1\2\1\uffff\1\1\7\uffff";
    static final String DFA30_specialS =
        "\24\uffff}>";
    static final String[] DFA30_transitionS = {
            "\1\11\1\uffff\1\12\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10"+
            "\12\12\10\uffff\1\12\14\uffff\2\12\10\uffff\1\12\12\uffff\3"+
            "\12",
            "\1\14\102\uffff\1\12\1\13",
            "\1\14\102\uffff\1\12\1\13",
            "\1\14\102\uffff\1\12\1\13",
            "\1\14\102\uffff\1\12\1\13",
            "\1\14\102\uffff\1\12\1\13",
            "\1\14\102\uffff\1\12\1\13",
            "\1\14\102\uffff\1\12\1\13",
            "\1\14\102\uffff\1\12\1\13",
            "\1\14\33\uffff\2\12\14\uffff\5\12\2\uffff\1\12\2\uffff\2\12"+
            "\1\uffff\13\12\1\uffff\1\12\1\15",
            "",
            "\1\16",
            "",
            "\1\12\1\uffff\1\12\1\uffff\22\12\10\uffff\1\12\14\uffff\2\12"+
            "\10\uffff\1\12\12\uffff\3\12\2\uffff\1\17",
            "\1\14\102\uffff\1\12\1\20",
            "\1\14\102\uffff\1\12\1\21",
            "\1\22",
            "\1\23",
            "\1\14\102\uffff\1\12\1\20",
            "\1\14\102\uffff\1\12\1\21"
    };

    static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
    static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
    static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
    static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
    static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
    static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
    static final short[][] DFA30_transition;

    static {
        int numStates = DFA30_transitionS.length;
        DFA30_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = DFA30_eot;
            this.eof = DFA30_eof;
            this.min = DFA30_min;
            this.max = DFA30_max;
            this.accept = DFA30_accept;
            this.special = DFA30_special;
            this.transition = DFA30_transition;
        }
        public String getDescription() {
            return "282:1: forInit : ( localVariableDeclaration | expressionList );";
        }
    }
    static final String DFA44_eotS =
        "\32\uffff";
    static final String DFA44_eofS =
        "\32\uffff";
    static final String DFA44_minS =
        "\1\50\1\uffff\1\50\2\uffff\10\136\1\104\1\155\1\uffff\2\50\1\136"+
        "\1\uffff\1\136\1\155\1\uffff\1\155\2\136";
    static final String DFA44_maxS =
        "\1\152\1\uffff\1\152\2\uffff\11\154\1\155\1\uffff\2\155\1\154\1"+
        "\uffff\1\154\1\155\1\uffff\1\155\2\154";
    static final String DFA44_acceptS =
        "\1\uffff\1\1\1\uffff\1\5\1\6\12\uffff\1\2\3\uffff\1\4\2\uffff\1"+
        "\3\3\uffff";
    static final String DFA44_specialS =
        "\32\uffff}>";
    static final String[] DFA44_transitionS = {
            "\1\4\1\uffff\1\4\1\uffff\22\4\10\uffff\1\3\26\uffff\1\2\14\uffff"+
            "\1\1",
            "",
            "\1\15\1\uffff\1\4\1\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
            "\14\12\4\10\uffff\1\4\14\uffff\2\4\10\uffff\1\4\12\uffff\3\4",
            "",
            "",
            "\1\17\14\uffff\1\4\1\16",
            "\1\17\14\uffff\1\4\1\16",
            "\1\17\14\uffff\1\4\1\16",
            "\1\17\14\uffff\1\4\1\16",
            "\1\17\14\uffff\1\4\1\16",
            "\1\17\14\uffff\1\4\1\16",
            "\1\17\14\uffff\1\4\1\16",
            "\1\17\14\uffff\1\4\1\16",
            "\2\4\14\uffff\5\4\6\uffff\1\4\1\20\13\4\1\uffff\1\4\1\21",
            "\1\22",
            "",
            "\1\23\1\uffff\1\23\1\uffff\22\23\6\uffff\2\4\1\23\13\uffff"+
            "\5\4\2\uffff\1\4\1\uffff\2\4\1\23\14\4\1\23\3\4",
            "\1\4\1\uffff\1\4\1\uffff\22\4\10\uffff\1\4\14\uffff\2\4\10"+
            "\uffff\1\4\12\uffff\3\4\2\uffff\1\24",
            "\1\26\14\uffff\1\4\1\25",
            "",
            "\1\26\14\uffff\1\4\1\27",
            "\1\30",
            "",
            "\1\31",
            "\1\26\14\uffff\1\4\1\25",
            "\1\26\14\uffff\1\4\1\27"
    };

    static final short[] DFA44_eot = DFA.unpackEncodedString(DFA44_eotS);
    static final short[] DFA44_eof = DFA.unpackEncodedString(DFA44_eofS);
    static final char[] DFA44_min = DFA.unpackEncodedStringToUnsignedChars(DFA44_minS);
    static final char[] DFA44_max = DFA.unpackEncodedStringToUnsignedChars(DFA44_maxS);
    static final short[] DFA44_accept = DFA.unpackEncodedString(DFA44_acceptS);
    static final short[] DFA44_special = DFA.unpackEncodedString(DFA44_specialS);
    static final short[][] DFA44_transition;

    static {
        int numStates = DFA44_transitionS.length;
        DFA44_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA44_transition[i] = DFA.unpackEncodedString(DFA44_transitionS[i]);
        }
    }

    class DFA44 extends DFA {

        public DFA44(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 44;
            this.eot = DFA44_eot;
            this.eof = DFA44_eof;
            this.min = DFA44_min;
            this.max = DFA44_max;
            this.accept = DFA44_accept;
            this.special = DFA44_special;
            this.transition = DFA44_transition;
        }
        public String getDescription() {
            return "357:1: unaryExpressionNotPlusMinus : ( '!' unaryExpression | lp= '(' primitiveType ')' unaryExpression -> ^( CAST[$lp, \"CAST\"] primitiveType unaryExpression ) | lp= '(' arrayType ')' unaryExpression -> ^( CAST[$lp, \"CAST\"] arrayType unaryExpression ) | lp= '(' classType ')' unaryExpressionNotPlusMinus -> ^( CAST[$lp, \"CAST\"] classType unaryExpressionNotPlusMinus ) | NEW creator | ( primary -> primary ) ( selector[(CommonTree)$unaryExpressionNotPlusMinus.tree] -> selector )* ( '++' -> ^( POSTINC $unaryExpressionNotPlusMinus) | '--' -> ^( POSTDEC $unaryExpressionNotPlusMinus) )* );";
        }
    }
    static final String DFA45_eotS =
        "\14\uffff";
    static final String DFA45_eofS =
        "\14\uffff";
    static final String DFA45_minS =
        "\1\50\4\uffff\1\104\2\uffff\1\47\1\50\2\uffff";
    static final String DFA45_maxS =
        "\1\135\4\uffff\1\155\2\uffff\1\50\1\155\2\uffff";
    static final String DFA45_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\7\1\10\2\uffff\1\5\1\6";
    static final String DFA45_specialS =
        "\14\uffff}>";
    static final String[] DFA45_transitionS = {
            "\1\5\1\uffff\1\7\1\uffff\10\6\1\2\1\3\10\4\37\uffff\1\1",
            "",
            "",
            "",
            "",
            "\2\12\14\uffff\5\12\2\uffff\1\12\1\uffff\2\12\1\13\14\12\1"+
            "\uffff\1\10\1\11\1\12",
            "",
            "",
            "\1\6\1\12",
            "\1\12\1\uffff\1\12\1\uffff\22\12\10\uffff\1\12\14\uffff\2\12"+
            "\10\uffff\1\12\12\uffff\3\12\2\uffff\1\6",
            "",
            ""
    };

    static final short[] DFA45_eot = DFA.unpackEncodedString(DFA45_eotS);
    static final short[] DFA45_eof = DFA.unpackEncodedString(DFA45_eofS);
    static final char[] DFA45_min = DFA.unpackEncodedStringToUnsignedChars(DFA45_minS);
    static final char[] DFA45_max = DFA.unpackEncodedStringToUnsignedChars(DFA45_maxS);
    static final short[] DFA45_accept = DFA.unpackEncodedString(DFA45_acceptS);
    static final short[] DFA45_special = DFA.unpackEncodedString(DFA45_specialS);
    static final short[][] DFA45_transition;

    static {
        int numStates = DFA45_transitionS.length;
        DFA45_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA45_transition[i] = DFA.unpackEncodedString(DFA45_transitionS[i]);
        }
    }

    class DFA45 extends DFA {

        public DFA45(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 45;
            this.eot = DFA45_eot;
            this.eof = DFA45_eof;
            this.min = DFA45_min;
            this.max = DFA45_max;
            this.accept = DFA45_accept;
            this.special = DFA45_special;
            this.transition = DFA45_transition;
        }
        public String getDescription() {
            return "376:1: primary : ( parExpression | THIS | SUPER superMemberAccess | literal | IDENTIFIER | IDENTIFIER arguments -> ^( METHODCALL THIS IDENTIFIER ( arguments )? ) | type '.' CLASS -> ^( DOTCLASS type ) | VOID '.' CLASS -> ^( DOTCLASS VOID ) );";
        }
    }
 

    public static final BitSet FOLLOW_classDeclaration_in_compilationUnit184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_compilationUnit196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PUBLIC_in_classDeclaration219 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_CLASS_in_classDeclaration222 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classDeclaration225 = new BitSet(new long[]{0x0000020000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_EXTENDS_in_classDeclaration244 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_classType_in_classDeclaration247 = new BitSet(new long[]{0x0000020000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_classBody_in_classDeclaration266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_classBody287 = new BitSet(new long[]{0x0000084000000000L,0x000000000A000000L});
    public static final BitSet FOLLOW_classBodyDeclaration_in_classBody289 = new BitSet(new long[]{0x0000084000000000L,0x000000000A000000L});
    public static final BitSet FOLLOW_91_in_classBody292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_classBodyDeclaration320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_memberDeclaration_in_classBodyDeclaration331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifier_in_memberDeclaration356 = new BitSet(new long[]{0x000FF10000000000L});
    public static final BitSet FOLLOW_type_in_memberDeclaration360 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_memberDeclaration362 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_formalParameters_in_memberDeclaration364 = new BitSet(new long[]{0x0000000000000000L,0x0000100004000000L});
    public static final BitSet FOLLOW_bracketsOpt_in_memberDeclaration366 = new BitSet(new long[]{0x0000000000000000L,0x0000100004000000L});
    public static final BitSet FOLLOW_methodBody_in_memberDeclaration369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifier_in_memberDeclaration423 = new BitSet(new long[]{0x000FF10000000000L});
    public static final BitSet FOLLOW_type_in_memberDeclaration428 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_fieldDeclaration_in_memberDeclaration431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifier_in_memberDeclaration456 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_VOID_in_memberDeclaration458 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_memberDeclaration460 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_formalParameters_in_memberDeclaration462 = new BitSet(new long[]{0x0000000000000000L,0x0000100004000000L});
    public static final BitSet FOLLOW_methodBody_in_memberDeclaration464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifier_in_memberDeclaration513 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_memberDeclaration515 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_formalParameters_in_memberDeclaration517 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_constructorBody_in_memberDeclaration519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclarator_in_fieldDeclaration570 = new BitSet(new long[]{0x0000000000000000L,0x0000000012000000L});
    public static final BitSet FOLLOW_92_in_fieldDeclaration590 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_variableDeclarator_in_fieldDeclaration594 = new BitSet(new long[]{0x0000000000000000L,0x0000000012000000L});
    public static final BitSet FOLLOW_89_in_fieldDeclaration611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_variableDeclarator656 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_EQ_in_variableDeclarator662 = new BitSet(new long[]{0x3FFFF50000000000L,0x0000070024180040L});
    public static final BitSet FOLLOW_variableInitializer_in_variableDeclarator665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_variableDeclaratorId697 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_bracketsOpt_in_variableDeclaratorId699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayInitializer_in_variableInitializer739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_variableInitializer749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_arrayInitializer778 = new BitSet(new long[]{0x3FFFF50000000000L,0x000007002C180040L});
    public static final BitSet FOLLOW_variableInitializer_in_arrayInitializer781 = new BitSet(new long[]{0x0000000000000000L,0x0000000018000000L});
    public static final BitSet FOLLOW_92_in_arrayInitializer784 = new BitSet(new long[]{0x3FFFF50000000000L,0x0000070024180040L});
    public static final BitSet FOLLOW_variableInitializer_in_arrayInitializer786 = new BitSet(new long[]{0x0000000000000000L,0x0000000018000000L});
    public static final BitSet FOLLOW_92_in_arrayInitializer791 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_arrayInitializer798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PUBLIC_in_modifier832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIVATE_in_modifier845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_type868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classType_in_type878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayType_in_type892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_arrayType922 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_brackets_in_arrayType925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classType_in_arrayType945 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_brackets_in_arrayType952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classType979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_primitiveType1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BYTE_in_primitiveType1019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHORT_in_primitiveType1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_primitiveType1048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_in_primitiveType1064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_primitiveType1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_primitiveType1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_primitiveType1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_formalParameters1139 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_formalParameters1141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_formalParameters1152 = new BitSet(new long[]{0x000FF10000000000L});
    public static final BitSet FOLLOW_formalParameterDecls_in_formalParameters1154 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_formalParameters1157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_formalParameterDecls1187 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_formalParameterDecls1189 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_formalParameterDecls1193 = new BitSet(new long[]{0x000FF10000000000L});
    public static final BitSet FOLLOW_formalParameterDecls_in_formalParameterDecls1195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_methodBody1245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_constructorBody1272 = new BitSet(new long[]{0xFFFFF50000000000L,0x000017002E180047L});
    public static final BitSet FOLLOW_explicitConstructorInvocation_in_constructorBody1274 = new BitSet(new long[]{0xFFFFF50000000000L,0x000017002E180047L});
    public static final BitSet FOLLOW_blockStatement_in_constructorBody1277 = new BitSet(new long[]{0xFFFFF50000000000L,0x000017002E180047L});
    public static final BitSet FOLLOW_91_in_constructorBody1280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_explicitConstructorInvocation1311 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_arguments_in_explicitConstructorInvocation1314 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_explicitConstructorInvocation1316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUPER_in_explicitConstructorInvocation1338 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_arguments_in_explicitConstructorInvocation1340 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_explicitConstructorInvocation1342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_literal0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_block1460 = new BitSet(new long[]{0xFFFFF50000000000L,0x000017002E180047L});
    public static final BitSet FOLLOW_blockStatement_in_block1463 = new BitSet(new long[]{0xFFFFF50000000000L,0x000017002E180047L});
    public static final BitSet FOLLOW_91_in_block1466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localVariableDeclarationStatement_in_blockStatement1490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_blockStatement1500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localVariableDeclaration_in_localVariableDeclarationStatement1521 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_localVariableDeclarationStatement1523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_localVariableDeclaration1541 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_variableDeclarator_in_localVariableDeclaration1543 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_localVariableDeclaration1547 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_variableDeclarator_in_localVariableDeclaration1549 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_block_in_statement1590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_statement1616 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_parExpression_in_statement1618 = new BitSet(new long[]{0xFFFFF50000000000L,0x0000170026180047L});
    public static final BitSet FOLLOW_statement_in_statement1620 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_elseStmt_in_statement1622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_statement1662 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_statement1666 = new BitSet(new long[]{0x3FFFF50000000000L,0x0000070026180040L});
    public static final BitSet FOLLOW_forInit_in_statement1668 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_statement1671 = new BitSet(new long[]{0x3FFFF50000000000L,0x0000070026180040L});
    public static final BitSet FOLLOW_expression_in_statement1673 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_statement1676 = new BitSet(new long[]{0x3FFFF50000000000L,0x0000070064180040L});
    public static final BitSet FOLLOW_forUpdate_in_statement1678 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_statement1681 = new BitSet(new long[]{0xFFFFF50000000000L,0x0000170026180047L});
    public static final BitSet FOLLOW_statement_in_statement1683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_statement1743 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_parExpression_in_statement1745 = new BitSet(new long[]{0xFFFFF50000000000L,0x0000170026180047L});
    public static final BitSet FOLLOW_statement_in_statement1747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_statement1777 = new BitSet(new long[]{0xFFFFF50000000000L,0x0000170026180047L});
    public static final BitSet FOLLOW_statement_in_statement1779 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_WHILE_in_statement1783 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_parExpression_in_statement1785 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_statement1787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_statement1817 = new BitSet(new long[]{0x3FFFF50000000000L,0x0000070026180040L});
    public static final BitSet FOLLOW_expression_in_statement1820 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_statement1823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_statement1839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementExpression_in_statement1856 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_statement1858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_elseStmt1893 = new BitSet(new long[]{0xFFFFF50000000000L,0x0000170026180047L});
    public static final BitSet FOLLOW_statement_in_elseStmt1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localVariableDeclaration_in_forInit1921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionList_in_forInit1931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionList_in_forUpdate1950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_parExpression1969 = new BitSet(new long[]{0x3FFFF50000000000L,0x0000070024180040L});
    public static final BitSet FOLLOW_expression_in_parExpression1972 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_parExpression1974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionList1998 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_expressionList2001 = new BitSet(new long[]{0x3FFFF50000000000L,0x0000070024180040L});
    public static final BitSet FOLLOW_expression_in_expressionList2004 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_expression_in_statementExpression2025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orExpression_in_expression2044 = new BitSet(new long[]{0x0000000000000002L,0x0000000780040000L});
    public static final BitSet FOLLOW_assignmentOperator_in_expression2050 = new BitSet(new long[]{0x3FFFF50000000000L,0x0000070024180040L});
    public static final BitSet FOLLOW_expression_in_expression2052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_assignmentOperator2226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_assignmentOperator2241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_assignmentOperator2255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_assignmentOperator2269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_assignmentOperator2283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andExpression_in_orExpression2304 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_orExpression2308 = new BitSet(new long[]{0x3FFFF50000000000L,0x0000070024180040L});
    public static final BitSet FOLLOW_andExpression_in_orExpression2311 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000000L});
    public static final BitSet FOLLOW_equalityExpression_in_andExpression2333 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
    public static final BitSet FOLLOW_100_in_andExpression2337 = new BitSet(new long[]{0x3FFFF50000000000L,0x0000070024180040L});
    public static final BitSet FOLLOW_equalityExpression_in_andExpression2340 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
    public static final BitSet FOLLOW_instanceOfExpression_in_equalityExpression2362 = new BitSet(new long[]{0x0000000000000002L,0x0000006000000000L});
    public static final BitSet FOLLOW_set_in_equalityExpression2366 = new BitSet(new long[]{0x3FFFF50000000000L,0x0000070024180040L});
    public static final BitSet FOLLOW_instanceOfExpression_in_equalityExpression2375 = new BitSet(new long[]{0x0000000000000002L,0x0000006000000000L});
    public static final BitSet FOLLOW_relationalExpression_in_instanceOfExpression2397 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_INSTANCEOF_in_instanceOfExpression2400 = new BitSet(new long[]{0x000FF10000000000L});
    public static final BitSet FOLLOW_type_in_instanceOfExpression2403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression2424 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_COMPAREOP_in_relationalExpression2428 = new BitSet(new long[]{0x3FFFF50000000000L,0x0000070024180040L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression2431 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression2453 = new BitSet(new long[]{0x0000000000000002L,0x0000000000180000L});
    public static final BitSet FOLLOW_set_in_additiveExpression2457 = new BitSet(new long[]{0x3FFFF50000000000L,0x0000070024180040L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression2466 = new BitSet(new long[]{0x0000000000000002L,0x0000000000180000L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression2488 = new BitSet(new long[]{0x0000000000000002L,0x0000008000600000L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression2492 = new BitSet(new long[]{0x3FFFF50000000000L,0x0000070024180040L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression2507 = new BitSet(new long[]{0x0000000000000002L,0x0000008000600000L});
    public static final BitSet FOLLOW_PLUS_in_unaryExpression2535 = new BitSet(new long[]{0x3FFFF50000000000L,0x0000070024180040L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression2538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unaryExpression2561 = new BitSet(new long[]{0x3FFFF50000000000L,0x0000070024180040L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression2564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_unaryExpression2585 = new BitSet(new long[]{0x3FFFF50000000000L,0x0000070024180040L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression2587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_unaryExpression2608 = new BitSet(new long[]{0x3FFFF50000000000L,0x0000070024180040L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression2610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression2629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_unaryExpressionNotPlusMinus2646 = new BitSet(new long[]{0x3FFFF50000000000L,0x0000070024180040L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus2649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_unaryExpressionNotPlusMinus2666 = new BitSet(new long[]{0x000FF00000000000L});
    public static final BitSet FOLLOW_primitiveType_in_unaryExpressionNotPlusMinus2668 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_unaryExpressionNotPlusMinus2670 = new BitSet(new long[]{0x3FFFF50000000000L,0x0000070024180040L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus2672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_unaryExpressionNotPlusMinus2706 = new BitSet(new long[]{0x000FF10000000000L});
    public static final BitSet FOLLOW_arrayType_in_unaryExpressionNotPlusMinus2708 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_unaryExpressionNotPlusMinus2710 = new BitSet(new long[]{0x3FFFF50000000000L,0x0000070024180040L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus2712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_unaryExpressionNotPlusMinus2748 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_classType_in_unaryExpressionNotPlusMinus2750 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_unaryExpressionNotPlusMinus2753 = new BitSet(new long[]{0x3FFFF50000000000L,0x0000070024180040L});
    public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpressionNotPlusMinus2755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_unaryExpressionNotPlusMinus2789 = new BitSet(new long[]{0x000FF10000000000L});
    public static final BitSet FOLLOW_creator_in_unaryExpressionNotPlusMinus2792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_in_unaryExpressionNotPlusMinus2808 = new BitSet(new long[]{0x0000000000000002L,0x00001B0000000000L});
    public static final BitSet FOLLOW_selector_in_unaryExpressionNotPlusMinus2817 = new BitSet(new long[]{0x0000000000000002L,0x00001B0000000000L});
    public static final BitSet FOLLOW_104_in_unaryExpressionNotPlusMinus2834 = new BitSet(new long[]{0x0000000000000002L,0x0000030000000000L});
    public static final BitSet FOLLOW_105_in_unaryExpressionNotPlusMinus2847 = new BitSet(new long[]{0x0000000000000002L,0x0000030000000000L});
    public static final BitSet FOLLOW_parExpression_in_primary2884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_primary2894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUPER_in_primary2905 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_superMemberAccess_in_primary2908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primary2918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_primary2928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_primary2937 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_arguments_in_primary2940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_primary2961 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_primary2963 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_CLASS_in_primary2965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_primary2983 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_primary2985 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_CLASS_in_primary2987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_selector3020 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_selector3022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_selector3050 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_selector3052 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_arguments_in_selector3054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_selector3080 = new BitSet(new long[]{0x3FFFF50000000000L,0x0000070024180040L});
    public static final BitSet FOLLOW_expression_in_selector3082 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_selector3084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createdName_in_creator3115 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_arrayCreatorRest_in_creator3118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classType_in_creator3127 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_classCreatorRest_in_creator3129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classType_in_createdName3148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_createdName3158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_brackets_in_arrayCreatorRest3182 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_arrayInitializer_in_arrayCreatorRest3185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_arrayCreatorRest3209 = new BitSet(new long[]{0x3FFFF50000000000L,0x0000070024180040L});
    public static final BitSet FOLLOW_expression_in_arrayCreatorRest3211 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_arrayCreatorRest3213 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_108_in_arrayCreatorRest3231 = new BitSet(new long[]{0x3FFFF50000000000L,0x0000070024180040L});
    public static final BitSet FOLLOW_expression_in_arrayCreatorRest3233 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_arrayCreatorRest3235 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_bracketsOpt_in_arrayCreatorRest3261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arguments_in_classCreatorRest3290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_superMemberAccess3314 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_superMemberAccess3316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_superMemberAccess3346 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_superMemberAccess3348 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_arguments_in_superMemberAccess3350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_arguments3383 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_arguments3386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_arguments3395 = new BitSet(new long[]{0x3FFFF50000000000L,0x0000070024180040L});
    public static final BitSet FOLLOW_expressionList_in_arguments3397 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_arguments3399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_brackets3434 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_brackets3435 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_bracketsOpt_in_brackets3437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_bracketsOpt3506 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_bracketsOpt3507 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L});
    public static final BitSet FOLLOW_ELSE_in_synpred1_Ja1888 = new BitSet(new long[]{0x0000000000000002L});

}