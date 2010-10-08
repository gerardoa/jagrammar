// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g 2010-10-09 00:01:42

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
import java.util.Map;
import java.util.HashMap;
public class JaWalker extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "METHODCALL", "CONSTRCALL", "FIELDACCESS", "ARRAYACCESS", "DOTCLASS", "ARRAYTYPE", "METHOD", "FIELD", "CONSTR", "FPARMS", "ARGUMENTS", "FPARM", "FMULTPARM", "MBODY", "CBODY", "VARDECL", "BLOCK", "STMT", "INIT", "CONDITION", "UPDATE", "DOWHILE", "THEN", "ARRAYINIT", "PREINC", "POSTINC", "PREDEC", "POSTDEC", "UNARYPLUS", "UNARYMINUS", "CAST", "CLASS", "IDENTIFIER", "EXTENDS", "PUBLIC", "VOID", "PRIVATE", "CHAR", "BYTE", "SHORT", "INT", "LONG", "FLOAT", "DOUBLE", "BOOLEAN", "THIS", "SUPER", "INTLITERAL", "LONGLITERAL", "FLOATLITERAL", "DOUBLELITERAL", "CHARLITERAL", "STRINGLITERAL", "BOOLEANLITERAL", "NULLLITERAL", "IF", "FOR", "WHILE", "DO", "RETURN", "ELSE", "INSTANCEOF", "COMPAREOP", "NEW", "Digit", "IntegerNumber", "LongSuffix", "Exponent", "FloatingPointLiteral", "FloatSuffix", "DoubleSuffix", "EscapeSequence", "WS", "COMMENT", "LINE_COMMENT", "EQ", "PLUS", "MINUS", "STAR", "SLASH", "Letter", "Currency", "';'", "'{'", "'}'", "','", "'['", "']'", "'('", "')'", "'+='", "'-='", "'*='", "'/='", "'||'", "'&&'", "'=='", "'!='", "'%'", "'++'", "'--'", "'!'", "'.'"
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
    public static final int IntegerNumber=69;
    public static final int ARRAYINIT=27;
    public static final int PREDEC=30;
    public static final int FIELDACCESS=6;
    public static final int PRIVATE=40;
    public static final int Letter=84;
    public static final int INTLITERAL=51;
    public static final int CONDITION=23;
    public static final int PREINC=28;
    public static final int T__96=96;
    public static final int MBODY=17;
    public static final int CBODY=18;
    public static final int STRINGLITERAL=56;
    public static final int CHARLITERAL=55;
    public static final int PLUS=80;
    public static final int EXTENDS=37;
    public static final int POSTDEC=31;
    public static final int UNARYPLUS=32;
    public static final int DOUBLELITERAL=54;
    public static final int SUPER=50;
    public static final int ARGUMENTS=14;
    public static final int T__89=89;
    public static final int LongSuffix=70;
    public static final int WS=76;
    public static final int CHAR=41;
    public static final int NEW=67;
    public static final int EQ=79;
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
    public static final int T__99=99;
    public static final int COMMENT=77;
    public static final int THIS=49;
    public static final int T__103=103;
    public static final int CLASS=35;
    public static final int RETURN=63;
    public static final int T__97=97;
    public static final int METHODCALL=4;
    public static final int BYTE=42;
    public static final int T__105=105;
    public static final int IF=59;
    public static final int FPARMS=13;
    public static final int EOF=-1;
    public static final int FOR=60;
    public static final int STAR=82;
    public static final int T__102=102;

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
    public String getGrammarFileName() { return "/Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g"; }



    	private ErrorLogger errorLog = new ErrorLogger(); 
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
    	    String parameters = formalParameters.size() > 0 ? list.substring(0, list.length() - 2) : "";
    	    return ((JaScope_scope)JaScope_stack.elementAt(0)).name + '(' + parameters + ')';
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
        		errorLog.add(new UnacceptableLocalVariableException(id, getMethodSignature(), line, pos, rt)); 
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
    	        errorLog.add(new CannotBeAppliedToException(operator.getText(), op1.toString(), op2.toString(), operator.getLine(), operator.getCharPositionInLine(), rt));
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
    	        errorLog.add(new CannotBeAppliedToException(operator.getText(), op1.toString(), op2.toString(), operator.getLine(), operator.getCharPositionInLine(), rt));
    	    }
    	    return BasicType.BOOLEAN;
    	}
    	
    	private  Type assignOperation(CommonTree equal, Type var, Type expr) {
    	    if (!expr.isAssignableTo(var)) {
    	    	if (expr.isNumeric() && expr.isCastableTo(var))
    			errorLog.add(new PossibleLossOfPrecisionException(var.toString(), expr.toString(), equal.getLine(), equal.getCharPositionInLine(), rt));
    		else 
    			errorLog.add(new IncompatibleTypesException(var.toString(), expr.toString(), equal.getLine(), equal.getCharPositionInLine(), rt));    	       
    	    }
    	    return var;
    	}
    	
    	private void arrayExprCheck(CommonTree bracket, Type expr) {
    	    if (!expr.isAssignableTo(BasicType.INT)) {
    	    	if (expr.isCastableTo(BasicType.INT))
    			errorLog.add(new PossibleLossOfPrecisionException(BasicType.INT.toString(), expr.toString(), bracket.getLine(), bracket.getCharPositionInLine(), rt));
    		else 
    			errorLog.add(new IncompatibleTypesException(BasicType.INT.toString(), expr.toString(), bracket.getLine(), bracket.getCharPositionInLine(), rt));    	       
    	    }
    	}
        	
        	/** Verifica che sia stato assegnato un tipo di ritorno a tutte le sottoregole. 
        	*/	
        	private boolean ruleTypeCheck(Type ... rt) {
        	    for (int i = 0; i < rt.length; i++)
            	if (rt[i] == null) return false;
      	    return true;
        	}
        			 



    // $ANTLR start "compilationUnit"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:156:1: compilationUnit : classDeclaration ;
    public final void compilationUnit() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:160:5: ( classDeclaration )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:160:8: classDeclaration
            {
            pushFollow(FOLLOW_classDeclaration_in_compilationUnit63);
            classDeclaration();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {

              	System.out.println("ERROR LOG:" + errorLog);

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:163:1: classDeclaration : ^( CLASS IDENTIFIER ( classType )? classBody ) ;
    public final void classDeclaration() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:164:5: ( ^( CLASS IDENTIFIER ( classType )? classBody ) )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:164:9: ^( CLASS IDENTIFIER ( classType )? classBody )
            {
            match(input,CLASS,FOLLOW_CLASS_in_classDeclaration88); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classDeclaration90); if (state.failed) return ;
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:164:28: ( classType )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==IDENTIFIER) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:164:28: classType
                    {
                    pushFollow(FOLLOW_classType_in_classDeclaration92);
                    classType();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_classBody_in_classDeclaration95);
            classBody();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               System.out.println("Class Declaration in Tree grammar"); 
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
    // $ANTLR end "classDeclaration"


    // $ANTLR start "classBody"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:167:1: classBody : ( classBodyDeclaration )* ;
    public final void classBody() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:168:5: ( ( classBodyDeclaration )* )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:168:9: ( classBodyDeclaration )*
            {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:168:9: ( classBodyDeclaration )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=METHOD && LA2_0<=CONSTR)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:168:9: classBodyDeclaration
            	    {
            	    pushFollow(FOLLOW_classBodyDeclaration_in_classBody122);
            	    classBodyDeclaration();

            	    state._fsp--;
            	    if (state.failed) return ;

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:171:1: classBodyDeclaration : memberDeclaration ;
    public final void classBodyDeclaration() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:172:5: ( memberDeclaration )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:172:9: memberDeclaration
            {
            pushFollow(FOLLOW_memberDeclaration_in_classBodyDeclaration142);
            memberDeclaration();

            state._fsp--;
            if (state.failed) return ;

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:175:1: memberDeclaration : ( fieldDeclaration | methodAndConstructorDeclaration );
    public final void memberDeclaration() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:176:5: ( fieldDeclaration | methodAndConstructorDeclaration )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==FIELD) ) {
                alt3=1;
            }
            else if ( (LA3_0==METHOD||LA3_0==CONSTR) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:176:9: fieldDeclaration
                    {
                    pushFollow(FOLLOW_fieldDeclaration_in_memberDeclaration165);
                    fieldDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:177:7: methodAndConstructorDeclaration
                    {
                    pushFollow(FOLLOW_methodAndConstructorDeclaration_in_memberDeclaration173);
                    methodAndConstructorDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:180:1: methodAndConstructorDeclaration : ( ^( METHOD modifier type methodDeclaration ) | ^( METHOD modifier VOID IDENTIFIER voidMethodDeclaratorRest ) | ^( CONSTR modifier IDENTIFIER ( formalParameters )? ( constructorBody )? ) );
    public final void methodAndConstructorDeclaration() throws RecognitionException {
        JaScope_stack.push(new JaScope_scope());

        CommonTree IDENTIFIER1=null;
        CommonTree IDENTIFIER2=null;


        	((JaScope_scope)JaScope_stack.peek()).symbols = new HashMap<String, Type>();
        	formalParameters = new LinkedList<String>();

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:189:5: ( ^( METHOD modifier type methodDeclaration ) | ^( METHOD modifier VOID IDENTIFIER voidMethodDeclaratorRest ) | ^( CONSTR modifier IDENTIFIER ( formalParameters )? ( constructorBody )? ) )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==METHOD) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==DOWN) ) {
                    int LA6_3 = input.LA(3);

                    if ( (LA6_3==PUBLIC||LA6_3==PRIVATE) ) {
                        int LA6_4 = input.LA(4);

                        if ( (LA6_4==ARRAYTYPE||LA6_4==IDENTIFIER||(LA6_4>=CHAR && LA6_4<=BOOLEAN)) ) {
                            alt6=1;
                        }
                        else if ( (LA6_4==VOID) ) {
                            alt6=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA6_0==CONSTR) ) {
                alt6=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:189:9: ^( METHOD modifier type methodDeclaration )
                    {
                    match(input,METHOD,FOLLOW_METHOD_in_methodAndConstructorDeclaration212); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_modifier_in_methodAndConstructorDeclaration214);
                    modifier();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_type_in_methodAndConstructorDeclaration216);
                    type();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_methodDeclaration_in_methodAndConstructorDeclaration219);
                    methodDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:190:9: ^( METHOD modifier VOID IDENTIFIER voidMethodDeclaratorRest )
                    {
                    match(input,METHOD,FOLLOW_METHOD_in_methodAndConstructorDeclaration234); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_modifier_in_methodAndConstructorDeclaration236);
                    modifier();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,VOID,FOLLOW_VOID_in_methodAndConstructorDeclaration238); if (state.failed) return ;
                    IDENTIFIER1=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_methodAndConstructorDeclaration240); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       ((JaScope_scope)JaScope_stack.peek()).name = (IDENTIFIER1!=null?IDENTIFIER1.getText():null); 
                    }
                    pushFollow(FOLLOW_voidMethodDeclaratorRest_in_methodAndConstructorDeclaration244);
                    voidMethodDeclaratorRest();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:191:9: ^( CONSTR modifier IDENTIFIER ( formalParameters )? ( constructorBody )? )
                    {
                    match(input,CONSTR,FOLLOW_CONSTR_in_methodAndConstructorDeclaration259); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_modifier_in_methodAndConstructorDeclaration261);
                    modifier();

                    state._fsp--;
                    if (state.failed) return ;
                    IDENTIFIER2=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_methodAndConstructorDeclaration263); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       ((JaScope_scope)JaScope_stack.peek()).name = (IDENTIFIER2!=null?IDENTIFIER2.getText():null); 
                    }
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:191:77: ( formalParameters )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==FPARMS) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:191:77: formalParameters
                            {
                            pushFollow(FOLLOW_formalParameters_in_methodAndConstructorDeclaration267);
                            formalParameters();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:191:95: ( constructorBody )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==CBODY) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:191:95: constructorBody
                            {
                            pushFollow(FOLLOW_constructorBody_in_methodAndConstructorDeclaration270);
                            constructorBody();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return ;

                    }
                    break;

            }
            if ( state.backtracking==0 ) {

              	System.out.println("methodAndConstructorDeclaration: " + getMethodSignature());

            }
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:195:1: methodDeclaration : IDENTIFIER ( formalParameters )? methodBody ;
    public final void methodDeclaration() throws RecognitionException {
        CommonTree IDENTIFIER3=null;

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:196:5: ( IDENTIFIER ( formalParameters )? methodBody )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:196:9: IDENTIFIER ( formalParameters )? methodBody
            {
            IDENTIFIER3=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_methodDeclaration301); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               ((JaScope_scope)JaScope_stack.peek()).name = (IDENTIFIER3!=null?IDENTIFIER3.getText():null); 
            }
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:196:59: ( formalParameters )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==FPARMS) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:196:59: formalParameters
                    {
                    pushFollow(FOLLOW_formalParameters_in_methodDeclaration305);
                    formalParameters();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_methodBody_in_methodDeclaration308);
            methodBody();

            state._fsp--;
            if (state.failed) return ;

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:199:1: fieldDeclaration : ^( FIELD modifier variableDeclarator ) ;
    public final void fieldDeclaration() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:200:5: ( ^( FIELD modifier variableDeclarator ) )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:200:9: ^( FIELD modifier variableDeclarator )
            {
            match(input,FIELD,FOLLOW_FIELD_in_fieldDeclaration328); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_modifier_in_fieldDeclaration330);
            modifier();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_variableDeclarator_in_fieldDeclaration332);
            variableDeclarator();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:203:1: voidMethodDeclaratorRest : formalParameters methodBody ;
    public final void voidMethodDeclaratorRest() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:204:5: ( formalParameters methodBody )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:204:7: formalParameters methodBody
            {
            pushFollow(FOLLOW_formalParameters_in_voidMethodDeclaratorRest355);
            formalParameters();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_methodBody_in_voidMethodDeclaratorRest357);
            methodBody();

            state._fsp--;
            if (state.failed) return ;

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:207:1: variableDeclarator returns [CommonTree id, Type t] : variableDeclaratorId ( variableInitializer[$variableDeclaratorId.t] )? ;
    public final JaWalker.variableDeclarator_return variableDeclarator() throws RecognitionException {
        JaWalker.variableDeclarator_return retval = new JaWalker.variableDeclarator_return();
        retval.start = input.LT(1);

        JaWalker.variableDeclaratorId_return variableDeclaratorId4 = null;


        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:208:5: ( variableDeclaratorId ( variableInitializer[$variableDeclaratorId.t] )? )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:208:9: variableDeclaratorId ( variableInitializer[$variableDeclaratorId.t] )?
            {
            pushFollow(FOLLOW_variableDeclaratorId_in_variableDeclarator380);
            variableDeclaratorId4=variableDeclaratorId();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.id = (variableDeclaratorId4!=null?variableDeclaratorId4.id:null); retval.t = (variableDeclaratorId4!=null?variableDeclaratorId4.t:null); 
            }
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:208:96: ( variableInitializer[$variableDeclaratorId.t] )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==METHODCALL||(LA8_0>=FIELDACCESS && LA8_0<=DOTCLASS)||(LA8_0>=ARRAYINIT && LA8_0<=CAST)||LA8_0==IDENTIFIER||LA8_0==THIS||(LA8_0>=INTLITERAL && LA8_0<=NULLLITERAL)||(LA8_0>=INSTANCEOF && LA8_0<=NEW)||(LA8_0>=EQ && LA8_0<=SLASH)||(LA8_0>=98 && LA8_0<=102)||LA8_0==105) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:208:97: variableInitializer[$variableDeclaratorId.t]
                    {
                    pushFollow(FOLLOW_variableInitializer_in_variableDeclarator385);
                    variableInitializer((variableDeclaratorId4!=null?variableDeclaratorId4.t:null));

                    state._fsp--;
                    if (state.failed) return retval;

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:211:1: variableDeclaratorId returns [CommonTree id, Type t] : type IDENTIFIER ;
    public final JaWalker.variableDeclaratorId_return variableDeclaratorId() throws RecognitionException {
        JaWalker.variableDeclaratorId_return retval = new JaWalker.variableDeclaratorId_return();
        retval.start = input.LT(1);

        CommonTree IDENTIFIER5=null;
        Type type6 = null;


        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:212:5: ( type IDENTIFIER )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:212:9: type IDENTIFIER
            {
            pushFollow(FOLLOW_type_in_variableDeclaratorId415);
            type6=type();

            state._fsp--;
            if (state.failed) return retval;
            IDENTIFIER5=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variableDeclaratorId417); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.id = IDENTIFIER5; retval.t = type6; 
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
    // $ANTLR end "variableDeclaratorId"


    // $ANTLR start "variableInitializer"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:215:1: variableInitializer[Type tin] returns [Type t] : ( arrayInitializer[((ArrayType)$tin).getHostType()] | expression );
    public final Type variableInitializer(Type tin) throws RecognitionException {
        Type t = null;

        Type arrayInitializer7 = null;

        JaWalker.expression_return expression8 = null;


        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:216:5: ( arrayInitializer[((ArrayType)$tin).getHostType()] | expression )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==ARRAYINIT) ) {
                alt9=1;
            }
            else if ( (LA9_0==METHODCALL||(LA9_0>=FIELDACCESS && LA9_0<=DOTCLASS)||(LA9_0>=PREINC && LA9_0<=CAST)||LA9_0==IDENTIFIER||LA9_0==THIS||(LA9_0>=INTLITERAL && LA9_0<=NULLLITERAL)||(LA9_0>=INSTANCEOF && LA9_0<=NEW)||(LA9_0>=EQ && LA9_0<=SLASH)||(LA9_0>=98 && LA9_0<=102)||LA9_0==105) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return t;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:216:9: arrayInitializer[((ArrayType)$tin).getHostType()]
                    {
                    pushFollow(FOLLOW_arrayInitializer_in_variableInitializer448);
                    arrayInitializer7=arrayInitializer(((ArrayType)tin).getHostType());

                    state._fsp--;
                    if (state.failed) return t;
                    if ( state.backtracking==0 ) {
                       t = arrayInitializer7; 
                    }

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:217:9: expression
                    {
                    pushFollow(FOLLOW_expression_in_variableInitializer461);
                    expression8=expression();

                    state._fsp--;
                    if (state.failed) return t;
                    if ( state.backtracking==0 ) {
                       t = (expression8!=null?expression8.t:null); 
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
        return t;
    }
    // $ANTLR end "variableInitializer"


    // $ANTLR start "arrayInitializer"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:220:1: arrayInitializer[Type tin] returns [Type t] : ^( ARRAYINIT v1= variableInitializer[$tin] (v= variableInitializer[$tin] )* ) ;
    public final Type arrayInitializer(Type tin) throws RecognitionException {
        Type t = null;

        CommonTree ARRAYINIT9=null;
        Type v1 = null;

        Type v = null;


        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:221:5: ( ^( ARRAYINIT v1= variableInitializer[$tin] (v= variableInitializer[$tin] )* ) )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:221:9: ^( ARRAYINIT v1= variableInitializer[$tin] (v= variableInitializer[$tin] )* )
            {
            ARRAYINIT9=(CommonTree)match(input,ARRAYINIT,FOLLOW_ARRAYINIT_in_arrayInitializer489); if (state.failed) return t;

            match(input, Token.DOWN, null); if (state.failed) return t;
            pushFollow(FOLLOW_variableInitializer_in_arrayInitializer493);
            v1=variableInitializer(tin);

            state._fsp--;
            if (state.failed) return t;
            if ( state.backtracking==0 ) {
               
                  	  if (ruleTypeCheck(v1)) {
              	       t = tin; //t = (ComplexType)ParserHelper.createArrayType(tin, 1);
              	       System.out.println("VT -->" + v1 + "  TIN -->" + tin);
              	       if( !v1.isAssignableTo(((ArrayType)tin).getHostType())) errorLog.add(new IncompatibleTypesException(tin.toString(), t.toString(), (ARRAYINIT9!=null?ARRAYINIT9.getLine():0), (ARRAYINIT9!=null?ARRAYINIT9.getCharPositionInLine():0), rt));
                    	  }	
                     
            }
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:229:8: (v= variableInitializer[$tin] )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==METHODCALL||(LA10_0>=FIELDACCESS && LA10_0<=DOTCLASS)||(LA10_0>=ARRAYINIT && LA10_0<=CAST)||LA10_0==IDENTIFIER||LA10_0==THIS||(LA10_0>=INTLITERAL && LA10_0<=NULLLITERAL)||(LA10_0>=INSTANCEOF && LA10_0<=NEW)||(LA10_0>=EQ && LA10_0<=SLASH)||(LA10_0>=98 && LA10_0<=102)||LA10_0==105) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:229:10: v= variableInitializer[$tin]
            	    {
            	    pushFollow(FOLLOW_variableInitializer_in_arrayInitializer516);
            	    v=variableInitializer(tin);

            	    state._fsp--;
            	    if (state.failed) return t;
            	    if ( state.backtracking==0 ) {
            	       if (ruleTypeCheck(v)) {
            	      	       System.out.println("VT -->" + v1 + "  TIN -->" + tin);
            	      	       if( !v.isAssignableTo(((ArrayType)tin).getHostType())) errorLog.add(new IncompatibleTypesException(tin.toString(), t.toString(), (ARRAYINIT9!=null?ARRAYINIT9.getLine():0), (ARRAYINIT9!=null?ARRAYINIT9.getCharPositionInLine():0), rt));
            	            	 }
            	             
            	    }

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            match(input, Token.UP, null); if (state.failed) return t;

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
    // $ANTLR end "arrayInitializer"


    // $ANTLR start "modifier"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:237:1: modifier : ( PUBLIC | PRIVATE );
    public final void modifier() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:238:5: ( PUBLIC | PRIVATE )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:
            {
            if ( input.LA(1)==PUBLIC||input.LA(1)==PRIVATE ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:242:1: type returns [Type t] : ( nonPrimitiveType | primitiveType );
    public final Type type() throws RecognitionException {
        Type t = null;

        ComplexType nonPrimitiveType10 = null;

        BasicType primitiveType11 = null;


        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:243:5: ( nonPrimitiveType | primitiveType )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ARRAYTYPE||LA11_0==IDENTIFIER) ) {
                alt11=1;
            }
            else if ( ((LA11_0>=CHAR && LA11_0<=BOOLEAN)) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return t;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:243:7: nonPrimitiveType
                    {
                    pushFollow(FOLLOW_nonPrimitiveType_in_type590);
                    nonPrimitiveType10=nonPrimitiveType();

                    state._fsp--;
                    if (state.failed) return t;
                    if ( state.backtracking==0 ) {
                       t = nonPrimitiveType10; 
                    }

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:244:7: primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_type600);
                    primitiveType11=primitiveType();

                    state._fsp--;
                    if (state.failed) return t;
                    if ( state.backtracking==0 ) {
                       t = primitiveType11;   
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
        return t;
    }
    // $ANTLR end "type"


    // $ANTLR start "nonPrimitiveType"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:247:1: nonPrimitiveType returns [ComplexType t] : ( ^( ARRAYTYPE npt= nonPrimitiveType ) | classType | ^( ARRAYTYPE primitiveType ) );
    public final ComplexType nonPrimitiveType() throws RecognitionException {
        ComplexType t = null;

        ComplexType npt = null;

        ReferenceType classType12 = null;

        BasicType primitiveType13 = null;


        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:248:5: ( ^( ARRAYTYPE npt= nonPrimitiveType ) | classType | ^( ARRAYTYPE primitiveType ) )
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==ARRAYTYPE) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==DOWN) ) {
                    int LA12_3 = input.LA(3);

                    if ( ((LA12_3>=CHAR && LA12_3<=BOOLEAN)) ) {
                        alt12=3;
                    }
                    else if ( (LA12_3==ARRAYTYPE||LA12_3==IDENTIFIER) ) {
                        alt12=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return t;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return t;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA12_0==IDENTIFIER) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return t;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:248:7: ^( ARRAYTYPE npt= nonPrimitiveType )
                    {
                    match(input,ARRAYTYPE,FOLLOW_ARRAYTYPE_in_nonPrimitiveType628); if (state.failed) return t;

                    match(input, Token.DOWN, null); if (state.failed) return t;
                    pushFollow(FOLLOW_nonPrimitiveType_in_nonPrimitiveType632);
                    npt=nonPrimitiveType();

                    state._fsp--;
                    if (state.failed) return t;

                    match(input, Token.UP, null); if (state.failed) return t;
                    if ( state.backtracking==0 ) {
                       t = (ComplexType)ParserHelper.createArrayType(npt, 1); 
                    }

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:249:9: classType
                    {
                    pushFollow(FOLLOW_classType_in_nonPrimitiveType645);
                    classType12=classType();

                    state._fsp--;
                    if (state.failed) return t;
                    if ( state.backtracking==0 ) {
                       t = classType12; 
                    }

                    }
                    break;
                case 3 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:250:7: ^( ARRAYTYPE primitiveType )
                    {
                    match(input,ARRAYTYPE,FOLLOW_ARRAYTYPE_in_nonPrimitiveType679); if (state.failed) return t;

                    match(input, Token.DOWN, null); if (state.failed) return t;
                    pushFollow(FOLLOW_primitiveType_in_nonPrimitiveType681);
                    primitiveType13=primitiveType();

                    state._fsp--;
                    if (state.failed) return t;

                    match(input, Token.UP, null); if (state.failed) return t;
                    if ( state.backtracking==0 ) {
                       t = (ComplexType)ParserHelper.createArrayType(primitiveType13, 1); 
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
        return t;
    }
    // $ANTLR end "nonPrimitiveType"


    // $ANTLR start "classType"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:253:1: classType returns [ReferenceType t] : IDENTIFIER ;
    public final ReferenceType classType() throws RecognitionException {
        ReferenceType t = null;

        CommonTree IDENTIFIER14=null;

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:254:5: ( IDENTIFIER )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:254:7: IDENTIFIER
            {
            IDENTIFIER14=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classType712); if (state.failed) return t;
            if ( state.backtracking==0 ) {
               t = cTab.get((IDENTIFIER14!=null?IDENTIFIER14.getText():null)); 
            }

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:257:1: primitiveType returns [BasicType bs] : ( CHAR | BYTE | SHORT | INT | LONG | FLOAT | DOUBLE | BOOLEAN );
    public final BasicType primitiveType() throws RecognitionException {
        BasicType bs = null;

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:258:5: ( CHAR | BYTE | SHORT | INT | LONG | FLOAT | DOUBLE | BOOLEAN )
            int alt13=8;
            switch ( input.LA(1) ) {
            case CHAR:
                {
                alt13=1;
                }
                break;
            case BYTE:
                {
                alt13=2;
                }
                break;
            case SHORT:
                {
                alt13=3;
                }
                break;
            case INT:
                {
                alt13=4;
                }
                break;
            case LONG:
                {
                alt13=5;
                }
                break;
            case FLOAT:
                {
                alt13=6;
                }
                break;
            case DOUBLE:
                {
                alt13=7;
                }
                break;
            case BOOLEAN:
                {
                alt13=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return bs;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:258:9: CHAR
                    {
                    match(input,CHAR,FOLLOW_CHAR_in_primitiveType737); if (state.failed) return bs;
                    if ( state.backtracking==0 ) {
                       bs = BasicType.CHAR;    
                    }

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:259:9: BYTE
                    {
                    match(input,BYTE,FOLLOW_BYTE_in_primitiveType752); if (state.failed) return bs;
                    if ( state.backtracking==0 ) {
                       bs = BasicType.BYTE;    
                    }

                    }
                    break;
                case 3 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:260:9: SHORT
                    {
                    match(input,SHORT,FOLLOW_SHORT_in_primitiveType767); if (state.failed) return bs;
                    if ( state.backtracking==0 ) {
                       bs = BasicType.SHORT;   
                    }

                    }
                    break;
                case 4 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:261:9: INT
                    {
                    match(input,INT,FOLLOW_INT_in_primitiveType781); if (state.failed) return bs;
                    if ( state.backtracking==0 ) {
                       bs = BasicType.INT;     
                    }

                    }
                    break;
                case 5 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:262:9: LONG
                    {
                    match(input,LONG,FOLLOW_LONG_in_primitiveType797); if (state.failed) return bs;
                    if ( state.backtracking==0 ) {
                       bs = BasicType.LONG;    
                    }

                    }
                    break;
                case 6 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:263:9: FLOAT
                    {
                    match(input,FLOAT,FOLLOW_FLOAT_in_primitiveType812); if (state.failed) return bs;
                    if ( state.backtracking==0 ) {
                       bs = BasicType.FLOAT;   
                    }

                    }
                    break;
                case 7 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:264:9: DOUBLE
                    {
                    match(input,DOUBLE,FOLLOW_DOUBLE_in_primitiveType826); if (state.failed) return bs;
                    if ( state.backtracking==0 ) {
                       bs = BasicType.DOUBLE;  
                    }

                    }
                    break;
                case 8 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:265:9: BOOLEAN
                    {
                    match(input,BOOLEAN,FOLLOW_BOOLEAN_in_primitiveType839); if (state.failed) return bs;
                    if ( state.backtracking==0 ) {
                       bs = BasicType.BOOLEAN; 
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
        return bs;
    }
    // $ANTLR end "primitiveType"


    // $ANTLR start "formalParameters"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:268:1: formalParameters : ^( FPARMS ( formalParameterDecls )? ) ;
    public final void formalParameters() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:269:5: ( ^( FPARMS ( formalParameterDecls )? ) )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:269:9: ^( FPARMS ( formalParameterDecls )? )
            {
            match(input,FPARMS,FOLLOW_FPARMS_in_formalParameters865); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:269:18: ( formalParameterDecls )?
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==FPARM) ) {
                    alt14=1;
                }
                switch (alt14) {
                    case 1 :
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:269:18: formalParameterDecls
                        {
                        pushFollow(FOLLOW_formalParameterDecls_in_formalParameters867);
                        formalParameterDecls();

                        state._fsp--;
                        if (state.failed) return ;

                        }
                        break;

                }


                match(input, Token.UP, null); if (state.failed) return ;
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:272:1: formalParameterDecls : ^( FPARM variableDeclaratorId ) ( formalParameterDecls )? ;
    public final void formalParameterDecls() throws RecognitionException {
        JaWalker.variableDeclaratorId_return variableDeclaratorId15 = null;


        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:273:5: ( ^( FPARM variableDeclaratorId ) ( formalParameterDecls )? )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:273:7: ^( FPARM variableDeclaratorId ) ( formalParameterDecls )?
            {
            match(input,FPARM,FOLLOW_FPARM_in_formalParameterDecls892); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_variableDeclaratorId_in_formalParameterDecls894);
            variableDeclaratorId15=variableDeclaratorId();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               formalParameters.add((variableDeclaratorId15!=null?variableDeclaratorId15.id:null).getText()); addVariableToScope((variableDeclaratorId15!=null?variableDeclaratorId15.id:null), (variableDeclaratorId15!=null?variableDeclaratorId15.t:null)); 
            }
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:273:170: ( formalParameterDecls )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==FPARM) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:273:170: formalParameterDecls
                    {
                    pushFollow(FOLLOW_formalParameterDecls_in_formalParameterDecls899);
                    formalParameterDecls();

                    state._fsp--;
                    if (state.failed) return ;

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
    // $ANTLR end "formalParameterDecls"


    // $ANTLR start "methodBody"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:277:1: methodBody : ^( MBODY block ) ;
    public final void methodBody() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:278:5: ( ^( MBODY block ) )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:278:9: ^( MBODY block )
            {
            match(input,MBODY,FOLLOW_MBODY_in_methodBody925); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                pushFollow(FOLLOW_block_in_methodBody927);
                block();

                state._fsp--;
                if (state.failed) return ;

                match(input, Token.UP, null); if (state.failed) return ;
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:282:1: constructorBody : ^( CBODY ( explicitConstructorInvocation )? ( blockStatement )* ) ;
    public final void constructorBody() throws RecognitionException {
        JaScope_stack.push(new JaScope_scope());


        	((JaScope_scope)JaScope_stack.peek()).symbols = new HashMap<String, Type>();

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:290:5: ( ^( CBODY ( explicitConstructorInvocation )? ( blockStatement )* ) )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:290:7: ^( CBODY ( explicitConstructorInvocation )? ( blockStatement )* )
            {
            match(input,CBODY,FOLLOW_CBODY_in_constructorBody986); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:290:15: ( explicitConstructorInvocation )?
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==CONSTRCALL) ) {
                    alt16=1;
                }
                switch (alt16) {
                    case 1 :
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:290:15: explicitConstructorInvocation
                        {
                        pushFollow(FOLLOW_explicitConstructorInvocation_in_constructorBody988);
                        explicitConstructorInvocation();

                        state._fsp--;
                        if (state.failed) return ;

                        }
                        break;

                }

                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:290:46: ( blockStatement )*
                loop17:
                do {
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( ((LA17_0>=VARDECL && LA17_0<=STMT)||LA17_0==DOWHILE||(LA17_0>=IF && LA17_0<=WHILE)||LA17_0==RETURN) ) {
                        alt17=1;
                    }


                    switch (alt17) {
                	case 1 :
                	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:290:46: blockStatement
                	    {
                	    pushFollow(FOLLOW_blockStatement_in_constructorBody991);
                	    blockStatement();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    break loop17;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return ;
            }

            }

            if ( state.backtracking==0 ) {

              	System.out.println("constructorBody: " + getMethodSignature() + " Scope: " + ((JaScope_scope)JaScope_stack.peek()).symbols);

            }
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:293:1: explicitConstructorInvocation : ( ^( CONSTRCALL THIS ( arguments )? ) | ^( CONSTRCALL SUPER ( arguments )? ) );
    public final void explicitConstructorInvocation() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:294:5: ( ^( CONSTRCALL THIS ( arguments )? ) | ^( CONSTRCALL SUPER ( arguments )? ) )
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
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:294:9: ^( CONSTRCALL THIS ( arguments )? )
                    {
                    match(input,CONSTRCALL,FOLLOW_CONSTRCALL_in_explicitConstructorInvocation1013); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    match(input,THIS,FOLLOW_THIS_in_explicitConstructorInvocation1015); if (state.failed) return ;
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:294:28: ( arguments )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==ARGUMENTS) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:294:28: arguments
                            {
                            pushFollow(FOLLOW_arguments_in_explicitConstructorInvocation1018);
                            arguments();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:295:7: ^( CONSTRCALL SUPER ( arguments )? )
                    {
                    match(input,CONSTRCALL,FOLLOW_CONSTRCALL_in_explicitConstructorInvocation1029); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    match(input,SUPER,FOLLOW_SUPER_in_explicitConstructorInvocation1031); if (state.failed) return ;
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:295:26: ( arguments )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==ARGUMENTS) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:295:26: arguments
                            {
                            pushFollow(FOLLOW_arguments_in_explicitConstructorInvocation1033);
                            arguments();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return ;

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:298:1: literal returns [Type t] : ( INTLITERAL | LONGLITERAL | FLOATLITERAL | DOUBLELITERAL | CHARLITERAL | STRINGLITERAL | BOOLEANLITERAL | NULLLITERAL );
    public final Type literal() throws RecognitionException {
        Type t = null;

        CommonTree INTLITERAL16=null;

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:299:5: ( INTLITERAL | LONGLITERAL | FLOATLITERAL | DOUBLELITERAL | CHARLITERAL | STRINGLITERAL | BOOLEANLITERAL | NULLLITERAL )
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
                if (state.backtracking>0) {state.failed=true; return t;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:299:9: INTLITERAL
                    {
                    INTLITERAL16=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_literal1058); if (state.failed) return t;
                    if ( state.backtracking==0 ) {
                       int literal = Integer.parseInt((INTLITERAL16!=null?INTLITERAL16.getText():null));
                          			 if ((literal >= -128) &&( literal <= 127)) 
                          			 	{ t = BasicType.BYTE; } 
                          			 else 
                          			 	if ((literal >= -32.768) &&( literal <= 32.767)) 
                          			 		{ t = BasicType.SHORT; } 
                          			 	else
                          			 		{ t = BasicType.INT; }
                          		       
                    }

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:308:9: LONGLITERAL
                    {
                    match(input,LONGLITERAL,FOLLOW_LONGLITERAL_in_literal1074); if (state.failed) return t;
                    if ( state.backtracking==0 ) {
                       t = BasicType.LONG;       
                    }

                    }
                    break;
                case 3 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:309:9: FLOATLITERAL
                    {
                    match(input,FLOATLITERAL,FOLLOW_FLOATLITERAL_in_literal1089); if (state.failed) return t;
                    if ( state.backtracking==0 ) {
                       t = BasicType.FLOAT;      
                    }

                    }
                    break;
                case 4 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:310:7: DOUBLELITERAL
                    {
                    match(input,DOUBLELITERAL,FOLLOW_DOUBLELITERAL_in_literal1101); if (state.failed) return t;
                    if ( state.backtracking==0 ) {
                       t = BasicType.DOUBLE;     
                    }

                    }
                    break;
                case 5 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:311:9: CHARLITERAL
                    {
                    match(input,CHARLITERAL,FOLLOW_CHARLITERAL_in_literal1114); if (state.failed) return t;
                    if ( state.backtracking==0 ) {
                       t = BasicType.CHAR;       
                    }

                    }
                    break;
                case 6 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:312:9: STRINGLITERAL
                    {
                    match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_literal1129); if (state.failed) return t;
                    if ( state.backtracking==0 ) {
                       t = ReferenceType.STRING; 
                    }

                    }
                    break;
                case 7 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:313:9: BOOLEANLITERAL
                    {
                    match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_literal1142); if (state.failed) return t;
                    if ( state.backtracking==0 ) {
                       t = BasicType.BOOLEAN;    
                    }

                    }
                    break;
                case 8 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:314:9: NULLLITERAL
                    {
                    match(input,NULLLITERAL,FOLLOW_NULLLITERAL_in_literal1154); if (state.failed) return t;
                    if ( state.backtracking==0 ) {
                       t = NullType.TYPE;        
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
        return t;
    }
    // $ANTLR end "literal"


    // $ANTLR start "block"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:319:1: block : (b= blockStatement )* ;
    public final void block() throws RecognitionException {
        JaScope_stack.push(new JaScope_scope());

        JaWalker.blockStatement_return b = null;



        	((JaScope_scope)JaScope_stack.peek()).symbols = new HashMap<String, Type>();

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:327:5: ( (b= blockStatement )* )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:327:9: (b= blockStatement )*
            {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:327:9: (b= blockStatement )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=VARDECL && LA22_0<=STMT)||LA22_0==DOWHILE||(LA22_0>=IF && LA22_0<=WHILE)||LA22_0==RETURN) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:327:10: b= blockStatement
            	    {
            	    pushFollow(FOLLOW_blockStatement_in_block1198);
            	    b=blockStatement();

            	    state._fsp--;
            	    if (state.failed) return ;
            	     System.out.println("Statement text: " + (b!=null?(input.getTokenStream().toString(
            	      input.getTreeAdaptor().getTokenStartIndex(b.start),
            	      input.getTreeAdaptor().getTokenStopIndex(b.start))):null)); 

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	System.out.println("block: " + ((JaScope_scope)JaScope_stack.peek()).symbols);

            }
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

    public static class blockStatement_return extends TreeRuleReturnScope {
    };

    // $ANTLR start "blockStatement"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:330:1: blockStatement : ( localVariableDeclarationStatement | statement );
    public final JaWalker.blockStatement_return blockStatement() throws RecognitionException {
        JaWalker.blockStatement_return retval = new JaWalker.blockStatement_return();
        retval.start = input.LT(1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:331:5: ( localVariableDeclarationStatement | statement )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==VARDECL) ) {
                alt23=1;
            }
            else if ( ((LA23_0>=BLOCK && LA23_0<=STMT)||LA23_0==DOWHILE||(LA23_0>=IF && LA23_0<=WHILE)||LA23_0==RETURN) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:331:9: localVariableDeclarationStatement
                    {
                    pushFollow(FOLLOW_localVariableDeclarationStatement_in_blockStatement1225);
                    localVariableDeclarationStatement();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:332:9: statement
                    {
                    pushFollow(FOLLOW_statement_in_blockStatement1236);
                    statement();

                    state._fsp--;
                    if (state.failed) return retval;

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
        return retval;
    }
    // $ANTLR end "blockStatement"


    // $ANTLR start "localVariableDeclarationStatement"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:335:1: localVariableDeclarationStatement : localVariableDeclaration ;
    public final void localVariableDeclarationStatement() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:336:5: ( localVariableDeclaration )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:336:7: localVariableDeclaration
            {
            pushFollow(FOLLOW_localVariableDeclaration_in_localVariableDeclarationStatement1257);
            localVariableDeclaration();

            state._fsp--;
            if (state.failed) return ;

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:339:1: localVariableDeclaration : ^( VARDECL variableDeclarator ) ;
    public final void localVariableDeclaration() throws RecognitionException {
        JaWalker.variableDeclarator_return variableDeclarator17 = null;


        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:340:5: ( ^( VARDECL variableDeclarator ) )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:340:7: ^( VARDECL variableDeclarator )
            {
            match(input,VARDECL,FOLLOW_VARDECL_in_localVariableDeclaration1275); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_variableDeclarator_in_localVariableDeclaration1277);
            variableDeclarator17=variableDeclarator();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               addVariableToScope((variableDeclarator17!=null?variableDeclarator17.id:null), (variableDeclarator17!=null?variableDeclarator17.t:null)); 
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
    // $ANTLR end "localVariableDeclaration"


    // $ANTLR start "statement"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:345:1: statement : ( ^( BLOCK block ) | ^( IF ^( CONDITION expression ) ^( THEN statement ) ( elseStmt )? ) | ^( FOR ( ^( INIT forInit ) )? ( ^( CONDITION expression ) )? ( ^( UPDATE forUpdate ) )? statement ) | ^( WHILE ^( CONDITION expression ) statement ) | ^( DOWHILE ^( CONDITION expression ) statement ) | ^( RETURN ( expression )? ) | ^( STMT statementExpression ) );
    public final void statement() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:346:5: ( ^( BLOCK block ) | ^( IF ^( CONDITION expression ) ^( THEN statement ) ( elseStmt )? ) | ^( FOR ( ^( INIT forInit ) )? ( ^( CONDITION expression ) )? ( ^( UPDATE forUpdate ) )? statement ) | ^( WHILE ^( CONDITION expression ) statement ) | ^( DOWHILE ^( CONDITION expression ) statement ) | ^( RETURN ( expression )? ) | ^( STMT statementExpression ) )
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
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:346:9: ^( BLOCK block )
                    {
                    match(input,BLOCK,FOLLOW_BLOCK_in_statement1314); if (state.failed) return ;

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return ;
                        pushFollow(FOLLOW_block_in_statement1316);
                        block();

                        state._fsp--;
                        if (state.failed) return ;

                        match(input, Token.UP, null); if (state.failed) return ;
                    }

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:347:9: ^( IF ^( CONDITION expression ) ^( THEN statement ) ( elseStmt )? )
                    {
                    match(input,IF,FOLLOW_IF_in_statement1328); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    match(input,CONDITION,FOLLOW_CONDITION_in_statement1331); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_statement1333);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;
                    match(input,THEN,FOLLOW_THEN_in_statement1337); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_statement_in_statement1339);
                    statement();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:347:56: ( elseStmt )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==ELSE) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:347:56: elseStmt
                            {
                            pushFollow(FOLLOW_elseStmt_in_statement1342);
                            elseStmt();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:348:9: ^( FOR ( ^( INIT forInit ) )? ( ^( CONDITION expression ) )? ( ^( UPDATE forUpdate ) )? statement )
                    {
                    match(input,FOR,FOLLOW_FOR_in_statement1355); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:348:15: ( ^( INIT forInit ) )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==INIT) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:348:16: ^( INIT forInit )
                            {
                            match(input,INIT,FOLLOW_INIT_in_statement1359); if (state.failed) return ;

                            match(input, Token.DOWN, null); if (state.failed) return ;
                            pushFollow(FOLLOW_forInit_in_statement1361);
                            forInit();

                            state._fsp--;
                            if (state.failed) return ;

                            match(input, Token.UP, null); if (state.failed) return ;

                            }
                            break;

                    }

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:348:34: ( ^( CONDITION expression ) )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==CONDITION) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:348:35: ^( CONDITION expression )
                            {
                            match(input,CONDITION,FOLLOW_CONDITION_in_statement1368); if (state.failed) return ;

                            match(input, Token.DOWN, null); if (state.failed) return ;
                            pushFollow(FOLLOW_expression_in_statement1370);
                            expression();

                            state._fsp--;
                            if (state.failed) return ;

                            match(input, Token.UP, null); if (state.failed) return ;

                            }
                            break;

                    }

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:348:61: ( ^( UPDATE forUpdate ) )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==UPDATE) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:348:62: ^( UPDATE forUpdate )
                            {
                            match(input,UPDATE,FOLLOW_UPDATE_in_statement1377); if (state.failed) return ;

                            match(input, Token.DOWN, null); if (state.failed) return ;
                            pushFollow(FOLLOW_forUpdate_in_statement1379);
                            forUpdate();

                            state._fsp--;
                            if (state.failed) return ;

                            match(input, Token.UP, null); if (state.failed) return ;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_statement_in_statement1384);
                    statement();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:349:9: ^( WHILE ^( CONDITION expression ) statement )
                    {
                    match(input,WHILE,FOLLOW_WHILE_in_statement1397); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    match(input,CONDITION,FOLLOW_CONDITION_in_statement1400); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_statement1402);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;
                    pushFollow(FOLLOW_statement_in_statement1405);
                    statement();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:350:9: ^( DOWHILE ^( CONDITION expression ) statement )
                    {
                    match(input,DOWHILE,FOLLOW_DOWHILE_in_statement1417); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    match(input,CONDITION,FOLLOW_CONDITION_in_statement1420); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_statement1422);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;
                    pushFollow(FOLLOW_statement_in_statement1425);
                    statement();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:351:9: ^( RETURN ( expression )? )
                    {
                    match(input,RETURN,FOLLOW_RETURN_in_statement1437); if (state.failed) return ;

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return ;
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:351:18: ( expression )?
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==METHODCALL||(LA28_0>=FIELDACCESS && LA28_0<=DOTCLASS)||(LA28_0>=PREINC && LA28_0<=CAST)||LA28_0==IDENTIFIER||LA28_0==THIS||(LA28_0>=INTLITERAL && LA28_0<=NULLLITERAL)||(LA28_0>=INSTANCEOF && LA28_0<=NEW)||(LA28_0>=EQ && LA28_0<=SLASH)||(LA28_0>=98 && LA28_0<=102)||LA28_0==105) ) {
                            alt28=1;
                        }
                        switch (alt28) {
                            case 1 :
                                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:351:18: expression
                                {
                                pushFollow(FOLLOW_expression_in_statement1439);
                                expression();

                                state._fsp--;
                                if (state.failed) return ;

                                }
                                break;

                        }


                        match(input, Token.UP, null); if (state.failed) return ;
                    }

                    }
                    break;
                case 7 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:352:9: ^( STMT statementExpression )
                    {
                    match(input,STMT,FOLLOW_STMT_in_statement1453); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_statementExpression_in_statement1455);
                    statementExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:355:1: elseStmt : ^( ELSE statement ) ;
    public final void elseStmt() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:356:5: ( ^( ELSE statement ) )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:356:7: ^( ELSE statement )
            {
            match(input,ELSE,FOLLOW_ELSE_in_elseStmt1478); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_statement_in_elseStmt1480);
            statement();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:359:1: forInit : ( localVariableDeclaration | expressionList );
    public final void forInit() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:360:5: ( localVariableDeclaration | expressionList )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==VARDECL) ) {
                alt30=1;
            }
            else if ( (LA30_0==METHODCALL||(LA30_0>=FIELDACCESS && LA30_0<=DOTCLASS)||(LA30_0>=PREINC && LA30_0<=CAST)||LA30_0==IDENTIFIER||LA30_0==THIS||(LA30_0>=INTLITERAL && LA30_0<=NULLLITERAL)||(LA30_0>=INSTANCEOF && LA30_0<=NEW)||(LA30_0>=EQ && LA30_0<=SLASH)||(LA30_0>=98 && LA30_0<=102)||LA30_0==105) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:360:9: localVariableDeclaration
                    {
                    pushFollow(FOLLOW_localVariableDeclaration_in_forInit1500);
                    localVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:361:9: expressionList
                    {
                    pushFollow(FOLLOW_expressionList_in_forInit1510);
                    expressionList();

                    state._fsp--;
                    if (state.failed) return ;

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:364:1: forUpdate : expressionList ;
    public final void forUpdate() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:365:5: ( expressionList )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:365:9: expressionList
            {
            pushFollow(FOLLOW_expressionList_in_forUpdate1529);
            expressionList();

            state._fsp--;
            if (state.failed) return ;

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:372:1: expressionList returns [ArrayList<Type> types] : ( expression )+ ;
    public final ArrayList<Type> expressionList() throws RecognitionException {
        ArrayList<Type> types = null;

        JaWalker.expression_return expression18 = null;



        	types = new ArrayList<Type>();

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:376:5: ( ( expression )+ )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:376:9: ( expression )+
            {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:376:9: ( expression )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==METHODCALL||(LA31_0>=FIELDACCESS && LA31_0<=DOTCLASS)||(LA31_0>=PREINC && LA31_0<=CAST)||LA31_0==IDENTIFIER||LA31_0==THIS||(LA31_0>=INTLITERAL && LA31_0<=NULLLITERAL)||(LA31_0>=INSTANCEOF && LA31_0<=NEW)||(LA31_0>=EQ && LA31_0<=SLASH)||(LA31_0>=98 && LA31_0<=102)||LA31_0==105) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:376:10: expression
            	    {
            	    pushFollow(FOLLOW_expression_in_expressionList1564);
            	    expression18=expression();

            	    state._fsp--;
            	    if (state.failed) return types;
            	    if ( state.backtracking==0 ) {
            	       types.add((expression18!=null?expression18.t:null)); 
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt31 >= 1 ) break loop31;
            	    if (state.backtracking>0) {state.failed=true; return types;}
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:379:1: statementExpression : expression ;
    public final void statementExpression() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:380:5: ( expression )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:380:9: expression
            {
            pushFollow(FOLLOW_expression_in_statementExpression1587);
            expression();

            state._fsp--;
            if (state.failed) return ;

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:383:1: constantExpression : expression ;
    public final void constantExpression() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:384:5: ( expression )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:384:9: expression
            {
            pushFollow(FOLLOW_expression_in_constantExpression1610);
            expression();

            state._fsp--;
            if (state.failed) return ;

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

    public static class expression_return extends TreeRuleReturnScope {
        public Type t;
        public boolean b;
    };

    // $ANTLR start "expression"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:387:1: expression returns [Type t, boolean b] : ( ^( EQ e1= expression e2= expression ) | ^( PLUS e1= expression e2= expression ) | ^( MINUS e1= expression e2= expression ) | ^( STAR e1= expression e2= expression ) | ^( SLASH e1= expression e2= expression ) | ^(mod= '%' e1= expression e2= expression ) | ^(or= '||' e1= expression e2= expression ) | ^(and= '&&' e1= expression e2= expression ) | ^(eq= '==' e1= expression e2= expression ) | ^(nq= '!=' e1= expression e2= expression ) | ^( INSTANCEOF e= expression type ) | ^( COMPAREOP e1= expression e2= expression ) | ^(op= ( UNARYPLUS | UNARYMINUS | PREINC | PREDEC ) e= expression ) | ^(op= '!' e= expression ) | ^( CAST pt= primitiveType e= expression ) | ^( CAST npt= nonPrimitiveType e= expression ) | ^( NEW creator ) | ^(op= ( POSTINC | POSTDEC ) (sp= selector | sp= primary ) ) | selector | primary );
    public final JaWalker.expression_return expression() throws RecognitionException {
        JaWalker.expression_return retval = new JaWalker.expression_return();
        retval.start = input.LT(1);

        CommonTree mod=null;
        CommonTree or=null;
        CommonTree and=null;
        CommonTree eq=null;
        CommonTree nq=null;
        CommonTree op=null;
        CommonTree EQ19=null;
        CommonTree PLUS20=null;
        CommonTree MINUS21=null;
        CommonTree STAR22=null;
        CommonTree SLASH23=null;
        CommonTree INSTANCEOF25=null;
        CommonTree COMPAREOP26=null;
        CommonTree CAST27=null;
        CommonTree CAST28=null;
        JaWalker.expression_return e1 = null;

        JaWalker.expression_return e2 = null;

        JaWalker.expression_return e = null;

        BasicType pt = null;

        ComplexType npt = null;

        Type sp = null;

        Type type24 = null;

        Type creator29 = null;

        Type selector30 = null;

        Type primary31 = null;


        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:388:5: ( ^( EQ e1= expression e2= expression ) | ^( PLUS e1= expression e2= expression ) | ^( MINUS e1= expression e2= expression ) | ^( STAR e1= expression e2= expression ) | ^( SLASH e1= expression e2= expression ) | ^(mod= '%' e1= expression e2= expression ) | ^(or= '||' e1= expression e2= expression ) | ^(and= '&&' e1= expression e2= expression ) | ^(eq= '==' e1= expression e2= expression ) | ^(nq= '!=' e1= expression e2= expression ) | ^( INSTANCEOF e= expression type ) | ^( COMPAREOP e1= expression e2= expression ) | ^(op= ( UNARYPLUS | UNARYMINUS | PREINC | PREDEC ) e= expression ) | ^(op= '!' e= expression ) | ^( CAST pt= primitiveType e= expression ) | ^( CAST npt= nonPrimitiveType e= expression ) | ^( NEW creator ) | ^(op= ( POSTINC | POSTDEC ) (sp= selector | sp= primary ) ) | selector | primary )
            int alt33=20;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:388:9: ^( EQ e1= expression e2= expression )
                    {
                    EQ19=(CommonTree)match(input,EQ,FOLLOW_EQ_in_expression1638); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression1642);
                    e1=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression1646);
                    e2=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       if(ruleTypeCheck((e1!=null?e1.t:null), (e2!=null?e2.t:null))) {
                      	  	retval.t = getVariableType((e1!=null?(input.getTokenStream().toString(
                        input.getTreeAdaptor().getTokenStartIndex(e1.start),
                        input.getTreeAdaptor().getTokenStopIndex(e1.start))):null));
                      	    	if (retval.t == null) 
                      	    		errorLog.add(new UnexpectedTypeException("variable", "value", (EQ19!=null?EQ19.getLine():0), (EQ19!=null?EQ19.getCharPositionInLine():0), rt));
                      	    	else
                      	    	  	retval.t = assignOperation(EQ19, (e1!=null?e1.t:null), (e2!=null?e2.t:null));
                      	  } 
                          	
                    }

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:397:7: ^( PLUS e1= expression e2= expression )
                    {
                    PLUS20=(CommonTree)match(input,PLUS,FOLLOW_PLUS_in_expression1664); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression1671);
                    e1=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression1675);
                    e2=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       if(ruleTypeCheck((e1!=null?e1.t:null), (e2!=null?e2.t:null))) retval.t = plusOperation(PLUS20, (e1!=null?e1.t:null), (e2!=null?e2.t:null)); 
                    }

                    }
                    break;
                case 3 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:398:7: ^( MINUS e1= expression e2= expression )
                    {
                    MINUS21=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_expression1687); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression1693);
                    e1=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression1697);
                    e2=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       if(ruleTypeCheck((e1!=null?e1.t:null), (e2!=null?e2.t:null))) retval.t = arithmeticOperation(MINUS21, (e1!=null?e1.t:null), (e2!=null?e2.t:null)); 
                    }

                    }
                    break;
                case 4 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:399:7: ^( STAR e1= expression e2= expression )
                    {
                    STAR22=(CommonTree)match(input,STAR,FOLLOW_STAR_in_expression1709); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression1716);
                    e1=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression1720);
                    e2=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       if(ruleTypeCheck((e1!=null?e1.t:null), (e2!=null?e2.t:null))) retval.t = arithmeticOperation(STAR22,  (e1!=null?e1.t:null), (e2!=null?e2.t:null)); 
                    }

                    }
                    break;
                case 5 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:400:7: ^( SLASH e1= expression e2= expression )
                    {
                    SLASH23=(CommonTree)match(input,SLASH,FOLLOW_SLASH_in_expression1732); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression1738);
                    e1=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression1742);
                    e2=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       if(ruleTypeCheck((e1!=null?e1.t:null), (e2!=null?e2.t:null))) retval.t = arithmeticOperation(SLASH23, (e1!=null?e1.t:null), (e2!=null?e2.t:null)); 
                    }

                    }
                    break;
                case 6 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:401:9: ^(mod= '%' e1= expression e2= expression )
                    {
                    mod=(CommonTree)match(input,102,FOLLOW_102_in_expression1758); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression1762);
                    e1=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression1766);
                    e2=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       if(ruleTypeCheck((e1!=null?e1.t:null), (e2!=null?e2.t:null))) retval.t = arithmeticOperation(mod,   (e1!=null?e1.t:null), (e2!=null?e2.t:null)); 
                    }

                    }
                    break;
                case 7 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:402:9: ^(or= '||' e1= expression e2= expression )
                    {
                    or=(CommonTree)match(input,98,FOLLOW_98_in_expression1782); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression1787);
                    e1=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression1791);
                    e2=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       if(ruleTypeCheck((e1!=null?e1.t:null), (e2!=null?e2.t:null))) retval.t = booleanOperation(or,  (e1!=null?e1.t:null), (e2!=null?e2.t:null)); 
                    }

                    }
                    break;
                case 8 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:403:9: ^(and= '&&' e1= expression e2= expression )
                    {
                    and=(CommonTree)match(input,99,FOLLOW_99_in_expression1807); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression1811);
                    e1=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression1815);
                    e2=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       if(ruleTypeCheck((e1!=null?e1.t:null), (e2!=null?e2.t:null))) retval.t = booleanOperation(and, (e1!=null?e1.t:null), (e2!=null?e2.t:null)); 
                    }

                    }
                    break;
                case 9 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:404:9: ^(eq= '==' e1= expression e2= expression )
                    {
                    eq=(CommonTree)match(input,100,FOLLOW_100_in_expression1831); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression1836);
                    e1=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression1840);
                    e2=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       if(ruleTypeCheck((e1!=null?e1.t:null), (e2!=null?e2.t:null))) retval.t = booleanOperation(eq,  (e1!=null?e1.t:null), (e2!=null?e2.t:null)); 
                    }

                    }
                    break;
                case 10 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:405:9: ^(nq= '!=' e1= expression e2= expression )
                    {
                    nq=(CommonTree)match(input,101,FOLLOW_101_in_expression1856); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression1861);
                    e1=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression1865);
                    e2=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       if(ruleTypeCheck((e1!=null?e1.t:null), (e2!=null?e2.t:null))) retval.t = booleanOperation(nq,  (e1!=null?e1.t:null), (e2!=null?e2.t:null)); 
                    }

                    }
                    break;
                case 11 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:406:7: ^( INSTANCEOF e= expression type )
                    {
                    INSTANCEOF25=(CommonTree)match(input,INSTANCEOF,FOLLOW_INSTANCEOF_in_expression1877); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression1881);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_expression1883);
                    type24=type();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       if(ruleTypeCheck((e!=null?e.t:null), type24)) { 
                      	          if ( !((e!=null?e.t:null).isComplexType() || (e!=null?e.t:null).isNull()) ) errorLog.add(new UnexpectedTypeException("reference", (e!=null?e.t:null).toString(), (INSTANCEOF25!=null?INSTANCEOF25.getLine():0), (INSTANCEOF25!=null?INSTANCEOF25.getCharPositionInLine():0), rt));
                      	          if (!type24.isComplexType()) errorLog.add(new UnexpectedTypeException("class or array", type24.toString(), (INSTANCEOF25!=null?INSTANCEOF25.getLine():0), (INSTANCEOF25!=null?INSTANCEOF25.getCharPositionInLine():0), rt));
                      	          if (!(e!=null?e.t:null).isCastableTo(type24)) errorLog.add(new InconvertibleTypesException(type24.toString(), (e!=null?e.t:null).toString(), (INSTANCEOF25!=null?INSTANCEOF25.getLine():0), (INSTANCEOF25!=null?INSTANCEOF25.getCharPositionInLine():0), rt));
                      	          retval.t = BasicType.BOOLEAN;
                                } 
                              
                    }

                    }
                    break;
                case 12 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:414:7: ^( COMPAREOP e1= expression e2= expression )
                    {
                    COMPAREOP26=(CommonTree)match(input,COMPAREOP,FOLLOW_COMPAREOP_in_expression1903); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression1907);
                    e1=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression1911);
                    e2=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       if(ruleTypeCheck((e1!=null?e1.t:null), (e2!=null?e2.t:null))) { 
                      	    	  if ( !((e1!=null?e1.t:null).isNumeric() && (e2!=null?e2.t:null).isNumeric()) ) errorLog.add(new CannotBeAppliedToException((COMPAREOP26!=null?COMPAREOP26.getText():null), (e1!=null?e1.t:null).toString(), (e2!=null?e2.t:null).toString(), (COMPAREOP26!=null?COMPAREOP26.getLine():0), (COMPAREOP26!=null?COMPAREOP26.getCharPositionInLine():0), rt));
                      	    	  retval.t = BasicType.BOOLEAN;
                          	  } 
                          	
                    }

                    }
                    break;
                case 13 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:420:9: ^(op= ( UNARYPLUS | UNARYMINUS | PREINC | PREDEC ) e= expression )
                    {
                    op=(CommonTree)input.LT(1);
                    if ( input.LA(1)==PREINC||input.LA(1)==PREDEC||(input.LA(1)>=UNARYPLUS && input.LA(1)<=UNARYMINUS) ) {
                        input.consume();
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression1949);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       if(ruleTypeCheck((e!=null?e.t:null))) { 
                      	          if (!(e!=null?e.t:null).isNumeric()) errorLog.add(new CannotBeAppliedToException((op!=null?op.getText():null), (e!=null?e.t:null).toString(), "", (op!=null?op.getLine():0), (op!=null?op.getCharPositionInLine():0), rt));
                      	    	  retval.t = (e!=null?e.t:null);
                          	  }
                          	
                    }

                    }
                    break;
                case 14 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:429:7: ^(op= '!' e= expression )
                    {
                    op=(CommonTree)match(input,105,FOLLOW_105_in_expression1987); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression1991);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       if(ruleTypeCheck((e!=null?e.t:null))) {
                      	    	  if (!((e!=null?e.t:null) == BasicType.BOOLEAN)) errorLog.add(new CannotBeAppliedToException((op!=null?op.getText():null), (e!=null?e.t:null).toString(), "", (op!=null?op.getLine():0), (op!=null?op.getCharPositionInLine():0), rt));
                      	    	  retval.t = BasicType.BOOLEAN;
                          	  }
                          	
                    }

                    }
                    break;
                case 15 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:435:9: ^( CAST pt= primitiveType e= expression )
                    {
                    CAST27=(CommonTree)match(input,CAST,FOLLOW_CAST_in_expression2010); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_primitiveType_in_expression2014);
                    pt=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression2018);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       if(ruleTypeCheck(pt, (e!=null?e.t:null))) {
                      	    	  if (!(e!=null?e.t:null).isCastableTo(pt)) errorLog.add(new InconvertibleTypesException(pt.toString(), (e!=null?e.t:null).toString(), (CAST27!=null?CAST27.getLine():0), (CAST27!=null?CAST27.getCharPositionInLine():0), rt));
                      	    	  retval.t = pt;
                          	  }
                          	
                    }

                    }
                    break;
                case 16 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:441:9: ^( CAST npt= nonPrimitiveType e= expression )
                    {
                    CAST28=(CommonTree)match(input,CAST,FOLLOW_CAST_in_expression2037); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_nonPrimitiveType_in_expression2041);
                    npt=nonPrimitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression2045);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       if(ruleTypeCheck(npt, (e!=null?e.t:null))) {
                      	    	  if (!(e!=null?e.t:null).isCastableTo(npt)) errorLog.add(new InconvertibleTypesException(npt.toString(), (e!=null?e.t:null).toString(), (CAST28!=null?CAST28.getLine():0), (CAST28!=null?CAST28.getCharPositionInLine():0), rt));
                      	    	  retval.t = npt;
                          	  }
                          	
                    }

                    }
                    break;
                case 17 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:447:9: ^( NEW creator )
                    {
                    match(input,NEW,FOLLOW_NEW_in_expression2064); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_creator_in_expression2066);
                    creator29=creator();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.t = creator29; 
                    }

                    }
                    break;
                case 18 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:448:7: ^(op= ( POSTINC | POSTDEC ) (sp= selector | sp= primary ) )
                    {
                    op=(CommonTree)input.LT(1);
                    if ( input.LA(1)==POSTINC||input.LA(1)==POSTDEC ) {
                        input.consume();
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:448:32: (sp= selector | sp= primary )
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
                            else if ( (LA32_5==METHODCALL||(LA32_5>=FIELDACCESS && LA32_5<=DOTCLASS)||(LA32_5>=PREINC && LA32_5<=CAST)||LA32_5==IDENTIFIER||LA32_5==THIS||(LA32_5>=INTLITERAL && LA32_5<=NULLLITERAL)||(LA32_5>=INSTANCEOF && LA32_5<=NEW)||(LA32_5>=EQ && LA32_5<=SLASH)||(LA32_5>=98 && LA32_5<=102)||LA32_5==105) ) {
                                alt32=1;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 32, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
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
                            else if ( (LA32_6==METHODCALL||(LA32_6>=FIELDACCESS && LA32_6<=DOTCLASS)||(LA32_6>=PREINC && LA32_6<=CAST)||LA32_6==IDENTIFIER||LA32_6==THIS||(LA32_6>=INTLITERAL && LA32_6<=NULLLITERAL)||(LA32_6>=INSTANCEOF && LA32_6<=NEW)||(LA32_6>=EQ && LA32_6<=SLASH)||(LA32_6>=98 && LA32_6<=102)||LA32_6==105) ) {
                                alt32=1;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 32, 6, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
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
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 0, input);

                        throw nvae;
                    }

                    switch (alt32) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:448:33: sp= selector
                            {
                            pushFollow(FOLLOW_selector_in_expression2091);
                            sp=selector();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;
                        case 2 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:448:47: sp= primary
                            {
                            pushFollow(FOLLOW_primary_in_expression2097);
                            sp=primary();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       if (!sp.isNumeric()) {
                          	  	throw new CannotBeAppliedToException((op!=null?op.getText():null), sp.toString(), "", (op!=null?op.getLine():0), (op!=null?op.getCharPositionInLine():0), rt);
                          	  }
                          	  retval.t = sp;
                          	
                    }

                    }
                    break;
                case 19 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:455:9: selector
                    {
                    pushFollow(FOLLOW_selector_in_expression2122);
                    selector30=selector();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.t = selector30; 
                    }

                    }
                    break;
                case 20 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:456:9: primary
                    {
                    pushFollow(FOLLOW_primary_in_expression2134);
                    primary31=primary();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.t = primary31; 
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
        return retval;
    }
    // $ANTLR end "expression"


    // $ANTLR start "primary"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:459:1: primary returns [Type t] : ( THIS | superMemberAccess | literal | IDENTIFIER | ^( DOTCLASS ^( ARRAYTYPE type ) ) | ^( DOTCLASS IDENTIFIER ) | ^( DOTCLASS primitiveType ) | ^( DOTCLASS VOID ) );
    public final Type primary() throws RecognitionException {
        Type t = null;

        CommonTree IDENTIFIER34=null;
        Type superMemberAccess32 = null;

        Type literal33 = null;


        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:461:5: ( THIS | superMemberAccess | literal | IDENTIFIER | ^( DOTCLASS ^( ARRAYTYPE type ) ) | ^( DOTCLASS IDENTIFIER ) | ^( DOTCLASS primitiveType ) | ^( DOTCLASS VOID ) )
            int alt34=8;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:461:7: THIS
                    {
                    match(input,THIS,FOLLOW_THIS_in_primary2175); if (state.failed) return t;
                    if ( state.backtracking==0 ) {
                       t = rt; 
                    }

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:462:9: superMemberAccess
                    {
                    pushFollow(FOLLOW_superMemberAccess_in_primary2187);
                    superMemberAccess32=superMemberAccess();

                    state._fsp--;
                    if (state.failed) return t;
                    if ( state.backtracking==0 ) {
                       t = superMemberAccess32; 
                    }

                    }
                    break;
                case 3 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:463:9: literal
                    {
                    pushFollow(FOLLOW_literal_in_primary2199);
                    literal33=literal();

                    state._fsp--;
                    if (state.failed) return t;
                    if ( state.backtracking==0 ) {
                       t = literal33; 
                    }

                    }
                    break;
                case 4 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:464:9: IDENTIFIER
                    {
                    IDENTIFIER34=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary2211); if (state.failed) return t;
                    if ( state.backtracking==0 ) {
                       t = getVariableType((IDENTIFIER34!=null?IDENTIFIER34.getText():null)); 
                          		     if (t == null) errorLog.add(new CannotFindSymbolException(("variable " + (IDENTIFIER34!=null?IDENTIFIER34.getText():null)), getMethodSignature(), (IDENTIFIER34!=null?IDENTIFIER34.getLine():0), (IDENTIFIER34!=null?IDENTIFIER34.getCharPositionInLine():0), rt));
                          		   
                    }

                    }
                    break;
                case 5 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:468:9: ^( DOTCLASS ^( ARRAYTYPE type ) )
                    {
                    match(input,DOTCLASS,FOLLOW_DOTCLASS_in_primary2229); if (state.failed) return t;

                    match(input, Token.DOWN, null); if (state.failed) return t;
                    match(input,ARRAYTYPE,FOLLOW_ARRAYTYPE_in_primary2232); if (state.failed) return t;

                    match(input, Token.DOWN, null); if (state.failed) return t;
                    pushFollow(FOLLOW_type_in_primary2234);
                    type();

                    state._fsp--;
                    if (state.failed) return t;

                    match(input, Token.UP, null); if (state.failed) return t;

                    match(input, Token.UP, null); if (state.failed) return t;
                    if ( state.backtracking==0 ) {
                       t = ReferenceType.CLASS; 
                    }

                    }
                    break;
                case 6 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:469:7: ^( DOTCLASS IDENTIFIER )
                    {
                    match(input,DOTCLASS,FOLLOW_DOTCLASS_in_primary2249); if (state.failed) return t;

                    match(input, Token.DOWN, null); if (state.failed) return t;
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary2251); if (state.failed) return t;

                    match(input, Token.UP, null); if (state.failed) return t;
                    if ( state.backtracking==0 ) {
                       t = ReferenceType.CLASS; 
                    }

                    }
                    break;
                case 7 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:470:9: ^( DOTCLASS primitiveType )
                    {
                    match(input,DOTCLASS,FOLLOW_DOTCLASS_in_primary2272); if (state.failed) return t;

                    match(input, Token.DOWN, null); if (state.failed) return t;
                    pushFollow(FOLLOW_primitiveType_in_primary2274);
                    primitiveType();

                    state._fsp--;
                    if (state.failed) return t;

                    match(input, Token.UP, null); if (state.failed) return t;
                    if ( state.backtracking==0 ) {
                       t = ReferenceType.CLASS; 
                    }

                    }
                    break;
                case 8 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:471:9: ^( DOTCLASS VOID )
                    {
                    match(input,DOTCLASS,FOLLOW_DOTCLASS_in_primary2292); if (state.failed) return t;

                    match(input, Token.DOWN, null); if (state.failed) return t;
                    match(input,VOID,FOLLOW_VOID_in_primary2294); if (state.failed) return t;

                    match(input, Token.UP, null); if (state.failed) return t;
                    if ( state.backtracking==0 ) {
                       t = ReferenceType.CLASS; 
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
        return t;
    }
    // $ANTLR end "primary"


    // $ANTLR start "selector"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:474:1: selector returns [Type t] : ( ^( FIELDACCESS expression IDENTIFIER ) | ^( METHODCALL expression IDENTIFIER ( arguments )? ) | ^( ARRAYACCESS e1= expression e2= expression ) );
    public final Type selector() throws RecognitionException {
        Type t = null;

        CommonTree IDENTIFIER36=null;
        CommonTree IDENTIFIER39=null;
        CommonTree ARRAYACCESS40=null;
        JaWalker.expression_return e1 = null;

        JaWalker.expression_return e2 = null;

        JaWalker.expression_return expression35 = null;

        JaWalker.expression_return expression37 = null;

        JaWalker.arguments_return arguments38 = null;


        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:475:5: ( ^( FIELDACCESS expression IDENTIFIER ) | ^( METHODCALL expression IDENTIFIER ( arguments )? ) | ^( ARRAYACCESS e1= expression e2= expression ) )
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
                if (state.backtracking>0) {state.failed=true; return t;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:475:9: ^( FIELDACCESS expression IDENTIFIER )
                    {
                    match(input,FIELDACCESS,FOLLOW_FIELDACCESS_in_selector2338); if (state.failed) return t;

                    match(input, Token.DOWN, null); if (state.failed) return t;
                    pushFollow(FOLLOW_expression_in_selector2340);
                    expression35=expression();

                    state._fsp--;
                    if (state.failed) return t;
                    IDENTIFIER36=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_selector2342); if (state.failed) return t;

                    match(input, Token.UP, null); if (state.failed) return t;
                    if ( state.backtracking==0 ) {
                       if(ruleTypeCheck((expression35!=null?expression35.t:null))) {
                      	    	  if (!(expression35!=null?expression35.t:null).isReference())
                      	    	  	errorLog.add(new CannotBeDereferencedException((expression35!=null?expression35.t:null), (IDENTIFIER36!=null?IDENTIFIER36.getLine():0), (IDENTIFIER36!=null?IDENTIFIER36.getCharPositionInLine():0), rt)); 
                      	    	  ReferenceType expt = (ReferenceType)(expression35!=null?expression35.t:null);
                      	    	  boolean isSameClass = (expt.getName() == rt.getName()); 
                      	    	  t = expt.getField(isSameClass, (IDENTIFIER36!=null?IDENTIFIER36.getText():null));
                      		  if (t == null) errorLog.add(new CannotFindSymbolException(("field " + (IDENTIFIER36!=null?IDENTIFIER36.getText():null)), expt.getName(), (IDENTIFIER36!=null?IDENTIFIER36.getLine():0), (IDENTIFIER36!=null?IDENTIFIER36.getCharPositionInLine():0), rt));
                          	  }
                          	
                    }

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:485:7: ^( METHODCALL expression IDENTIFIER ( arguments )? )
                    {
                    match(input,METHODCALL,FOLLOW_METHODCALL_in_selector2361); if (state.failed) return t;

                    match(input, Token.DOWN, null); if (state.failed) return t;
                    pushFollow(FOLLOW_expression_in_selector2363);
                    expression37=expression();

                    state._fsp--;
                    if (state.failed) return t;
                    IDENTIFIER39=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_selector2365); if (state.failed) return t;
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:485:42: ( arguments )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==ARGUMENTS) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:485:42: arguments
                            {
                            pushFollow(FOLLOW_arguments_in_selector2367);
                            arguments38=arguments();

                            state._fsp--;
                            if (state.failed) return t;

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return t;
                    if ( state.backtracking==0 ) {
                       // Se ci sono argomenti, bisogna richiamare ruleTypeCheck su di essi
                                if( ruleTypeCheck((expression37!=null?expression37.t:null)) && ((arguments38!=null?arguments38.types:null) == null || ruleTypeCheck((Type[])(arguments38!=null?arguments38.types:null).toArray())) ) {
                      	    	  if (!(expression37!=null?expression37.t:null).isReference())
                      	    	  	errorLog.add(new CannotBeDereferencedException((expression37!=null?expression37.t:null), (IDENTIFIER39!=null?IDENTIFIER39.getLine():0), (IDENTIFIER39!=null?IDENTIFIER39.getCharPositionInLine():0), rt)); 
                      	    	  ReferenceType expt = (ReferenceType)(expression37!=null?expression37.t:null);
                      	    	  ArrayList<Type> argTypes = (arguments38!=null?arguments38.types:null); //((arguments38!=null?((CommonTree)arguments38.tree):null) == null)?null:(arguments38!=null?arguments38.types:null);
                      	    	  try {
                      		    	boolean isSameClass = (expt.getName() == rt.getName()); 
                      		    	t = expt.bindMethod(isSameClass, (IDENTIFIER39!=null?IDENTIFIER39.getText():null), argTypes);
                      	    	  } catch (EarlyBindingException ex) {
                      	    	  	errorLog.add(new CannotFindSymbolException(("method " + (IDENTIFIER39!=null?IDENTIFIER39.getText():null) + '(' + printArguments(argTypes) + ')'), expt.getName(), (IDENTIFIER39!=null?IDENTIFIER39.getLine():0), (IDENTIFIER39!=null?IDENTIFIER39.getCharPositionInLine():0), rt));
                      	    	  }
                          	  }
                          	
                    }

                    }
                    break;
                case 3 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:500:9: ^( ARRAYACCESS e1= expression e2= expression )
                    {
                    ARRAYACCESS40=(CommonTree)match(input,ARRAYACCESS,FOLLOW_ARRAYACCESS_in_selector2390); if (state.failed) return t;

                    match(input, Token.DOWN, null); if (state.failed) return t;
                    pushFollow(FOLLOW_expression_in_selector2394);
                    e1=expression();

                    state._fsp--;
                    if (state.failed) return t;
                    pushFollow(FOLLOW_expression_in_selector2398);
                    e2=expression();

                    state._fsp--;
                    if (state.failed) return t;

                    match(input, Token.UP, null); if (state.failed) return t;
                    if ( state.backtracking==0 ) {
                       if (ruleTypeCheck((e1!=null?e1.t:null), (e2!=null?e2.t:null))) {
                      	    	  if (!(e1!=null?e1.t:null).isArray()) errorLog.add(new ArrayRequiredException((e1!=null?e1.t:null).toString(), (ARRAYACCESS40!=null?ARRAYACCESS40.getLine():0), (ARRAYACCESS40!=null?ARRAYACCESS40.getCharPositionInLine():0), rt));
                      	    	  arrayExprCheck(ARRAYACCESS40, (e2!=null?e2.t:null));
                      	    	  t = ((ArrayType)(e1!=null?e1.t:null)).getHostType(); 
                          	  }
                          	
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
        return t;
    }
    // $ANTLR end "selector"


    // $ANTLR start "creator"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:509:1: creator returns [Type t] : ( ( arrayCreatorRest )=>acr= arrayCreatorRest ( arrayInitializer[$acr.t] )? | createdName ( classCreatorRest )? );
    public final Type creator() throws RecognitionException {
        Type t = null;

        Type acr = null;


        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:510:5: ( ( arrayCreatorRest )=>acr= arrayCreatorRest ( arrayInitializer[$acr.t] )? | createdName ( classCreatorRest )? )
            int alt39=2;
            alt39 = dfa39.predict(input);
            switch (alt39) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:510:10: ( arrayCreatorRest )=>acr= arrayCreatorRest ( arrayInitializer[$acr.t] )?
                    {
                    pushFollow(FOLLOW_arrayCreatorRest_in_creator2439);
                    acr=arrayCreatorRest();

                    state._fsp--;
                    if (state.failed) return t;
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:510:53: ( arrayInitializer[$acr.t] )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==ARRAYINIT) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:510:53: arrayInitializer[$acr.t]
                            {
                            pushFollow(FOLLOW_arrayInitializer_in_creator2441);
                            arrayInitializer(acr);

                            state._fsp--;
                            if (state.failed) return t;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:511:10: createdName ( classCreatorRest )?
                    {
                    pushFollow(FOLLOW_createdName_in_creator2454);
                    createdName();

                    state._fsp--;
                    if (state.failed) return t;
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:511:22: ( classCreatorRest )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==ARGUMENTS) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:511:22: classCreatorRest
                            {
                            pushFollow(FOLLOW_classCreatorRest_in_creator2456);
                            classCreatorRest();

                            state._fsp--;
                            if (state.failed) return t;

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
        return t;
    }
    // $ANTLR end "creator"


    // $ANTLR start "createdName"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:515:1: createdName returns [Type t] : ( classType | primitiveType );
    public final Type createdName() throws RecognitionException {
        Type t = null;

        ReferenceType classType41 = null;

        BasicType primitiveType42 = null;


        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:516:5: ( classType | primitiveType )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==IDENTIFIER) ) {
                alt40=1;
            }
            else if ( ((LA40_0>=CHAR && LA40_0<=BOOLEAN)) ) {
                alt40=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return t;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:516:9: classType
                    {
                    pushFollow(FOLLOW_classType_in_createdName2482);
                    classType41=classType();

                    state._fsp--;
                    if (state.failed) return t;
                    if ( state.backtracking==0 ) {
                       t = classType41;      
                    }

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:517:9: primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_createdName2498);
                    primitiveType42=primitiveType();

                    state._fsp--;
                    if (state.failed) return t;
                    if ( state.backtracking==0 ) {
                       t = primitiveType42; 
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
        return t;
    }
    // $ANTLR end "createdName"


    // $ANTLR start "arrayCreatorRest"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:520:1: arrayCreatorRest returns [Type t] : ( ^( ARRAYTYPE acr= arrayCreatorRest ) | createdName | ^( ARRAYTYPE e= expression acre= arrayCreatorRestExpr ) );
    public final Type arrayCreatorRest() throws RecognitionException {
        Type t = null;

        CommonTree ARRAYTYPE44=null;
        Type acr = null;

        JaWalker.expression_return e = null;

        Type acre = null;

        Type createdName43 = null;


        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:521:5: ( ^( ARRAYTYPE acr= arrayCreatorRest ) | createdName | ^( ARRAYTYPE e= expression acre= arrayCreatorRestExpr ) )
            int alt41=3;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==ARRAYTYPE) ) {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==DOWN) ) {
                    switch ( input.LA(3) ) {
                    case METHODCALL:
                    case FIELDACCESS:
                    case ARRAYACCESS:
                    case DOTCLASS:
                    case PREINC:
                    case POSTINC:
                    case PREDEC:
                    case POSTDEC:
                    case UNARYPLUS:
                    case UNARYMINUS:
                    case CAST:
                    case THIS:
                    case INTLITERAL:
                    case LONGLITERAL:
                    case FLOATLITERAL:
                    case DOUBLELITERAL:
                    case CHARLITERAL:
                    case STRINGLITERAL:
                    case BOOLEANLITERAL:
                    case NULLLITERAL:
                    case INSTANCEOF:
                    case COMPAREOP:
                    case NEW:
                    case EQ:
                    case PLUS:
                    case MINUS:
                    case STAR:
                    case SLASH:
                    case 98:
                    case 99:
                    case 100:
                    case 101:
                    case 102:
                    case 105:
                        {
                        alt41=3;
                        }
                        break;
                    case IDENTIFIER:
                        {
                        int LA41_5 = input.LA(4);

                        if ( (LA41_5==ARRAYTYPE||LA41_5==IDENTIFIER||(LA41_5>=CHAR && LA41_5<=BOOLEAN)) ) {
                            alt41=3;
                        }
                        else if ( (LA41_5==UP) ) {
                            alt41=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return t;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 41, 5, input);

                            throw nvae;
                        }
                        }
                        break;
                    case ARRAYTYPE:
                    case CHAR:
                    case BYTE:
                    case SHORT:
                    case INT:
                    case LONG:
                    case FLOAT:
                    case DOUBLE:
                    case BOOLEAN:
                        {
                        alt41=1;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return t;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 3, input);

                        throw nvae;
                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return t;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA41_0==IDENTIFIER||(LA41_0>=CHAR && LA41_0<=BOOLEAN)) ) {
                alt41=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return t;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:521:8: ^( ARRAYTYPE acr= arrayCreatorRest )
                    {
                    match(input,ARRAYTYPE,FOLLOW_ARRAYTYPE_in_arrayCreatorRest2527); if (state.failed) return t;

                    match(input, Token.DOWN, null); if (state.failed) return t;
                    pushFollow(FOLLOW_arrayCreatorRest_in_arrayCreatorRest2531);
                    acr=arrayCreatorRest();

                    state._fsp--;
                    if (state.failed) return t;

                    match(input, Token.UP, null); if (state.failed) return t;
                    if ( state.backtracking==0 ) {
                       if (ruleTypeCheck(acr)) t = (ComplexType)ParserHelper.createArrayType(acr, 1); 
                    }

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:523:7: createdName
                    {
                    pushFollow(FOLLOW_createdName_in_arrayCreatorRest2550);
                    createdName43=createdName();

                    state._fsp--;
                    if (state.failed) return t;
                    if ( state.backtracking==0 ) {
                       if (ruleTypeCheck(createdName43)) t = createdName43; 
                    }

                    }
                    break;
                case 3 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:524:9: ^( ARRAYTYPE e= expression acre= arrayCreatorRestExpr )
                    {
                    ARRAYTYPE44=(CommonTree)match(input,ARRAYTYPE,FOLLOW_ARRAYTYPE_in_arrayCreatorRest2563); if (state.failed) return t;

                    match(input, Token.DOWN, null); if (state.failed) return t;
                    pushFollow(FOLLOW_expression_in_arrayCreatorRest2567);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return t;
                    pushFollow(FOLLOW_arrayCreatorRestExpr_in_arrayCreatorRest2571);
                    acre=arrayCreatorRestExpr();

                    state._fsp--;
                    if (state.failed) return t;

                    match(input, Token.UP, null); if (state.failed) return t;
                    if ( state.backtracking==0 ) {
                       if (ruleTypeCheck(acre, (e!=null?e.t:null))) {
                             		t = (ComplexType)ParserHelper.createArrayType(acre, 1); 
                          	  	arrayExprCheck(ARRAYTYPE44, (e!=null?e.t:null));
                          	  }
                             	
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
        return t;
    }
    // $ANTLR end "arrayCreatorRest"


    // $ANTLR start "arrayCreatorRestExpr"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:532:1: arrayCreatorRestExpr returns [Type t] : ( ( ^( ARRAYTYPE e= expression acr= arrayCreatorRest ) ) | createdName );
    public final Type arrayCreatorRestExpr() throws RecognitionException {
        Type t = null;

        CommonTree ARRAYTYPE45=null;
        JaWalker.expression_return e = null;

        Type acr = null;

        Type createdName46 = null;


        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:533:5: ( ( ^( ARRAYTYPE e= expression acr= arrayCreatorRest ) ) | createdName )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==ARRAYTYPE) ) {
                alt42=1;
            }
            else if ( (LA42_0==IDENTIFIER||(LA42_0>=CHAR && LA42_0<=BOOLEAN)) ) {
                alt42=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return t;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:533:8: ( ^( ARRAYTYPE e= expression acr= arrayCreatorRest ) )
                    {
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:533:8: ( ^( ARRAYTYPE e= expression acr= arrayCreatorRest ) )
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:533:9: ^( ARRAYTYPE e= expression acr= arrayCreatorRest )
                    {
                    ARRAYTYPE45=(CommonTree)match(input,ARRAYTYPE,FOLLOW_ARRAYTYPE_in_arrayCreatorRestExpr2604); if (state.failed) return t;

                    match(input, Token.DOWN, null); if (state.failed) return t;
                    pushFollow(FOLLOW_expression_in_arrayCreatorRestExpr2608);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return t;
                    pushFollow(FOLLOW_arrayCreatorRest_in_arrayCreatorRestExpr2612);
                    acr=arrayCreatorRest();

                    state._fsp--;
                    if (state.failed) return t;

                    match(input, Token.UP, null); if (state.failed) return t;

                    }

                    if ( state.backtracking==0 ) {
                       if (ruleTypeCheck(acr, (e!=null?e.t:null))) {
                             		t = (ComplexType)ParserHelper.createArrayType(acr, 1); 
                          	  	arrayExprCheck(ARRAYTYPE45, (e!=null?e.t:null));
                          	 }
                             
                    }

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:539:8: createdName
                    {
                    pushFollow(FOLLOW_createdName_in_arrayCreatorRestExpr2632);
                    createdName46=createdName();

                    state._fsp--;
                    if (state.failed) return t;
                    if ( state.backtracking==0 ) {
                       if (ruleTypeCheck(createdName46)) t = createdName46; 
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
        return t;
    }
    // $ANTLR end "arrayCreatorRestExpr"


    // $ANTLR start "classCreatorRest"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:542:1: classCreatorRest returns [ArrayList<Type> types] : arguments ;
    public final ArrayList<Type> classCreatorRest() throws RecognitionException {
        ArrayList<Type> types = null;

        JaWalker.arguments_return arguments47 = null;


        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:543:5: ( arguments )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:543:9: arguments
            {
            pushFollow(FOLLOW_arguments_in_classCreatorRest2657);
            arguments47=arguments();

            state._fsp--;
            if (state.failed) return types;
            if ( state.backtracking==0 ) {
               types = (arguments47!=null?arguments47.types:null); 
            }

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
    // $ANTLR end "classCreatorRest"


    // $ANTLR start "superMemberAccess"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:546:1: superMemberAccess returns [Type t] : ( ^( METHODCALL SUPER IDENTIFIER ( arguments )? ) | ^( FIELDACCESS SUPER IDENTIFIER ) );
    public final Type superMemberAccess() throws RecognitionException {
        Type t = null;

        CommonTree IDENTIFIER49=null;
        CommonTree IDENTIFIER50=null;
        JaWalker.arguments_return arguments48 = null;


        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:547:5: ( ^( METHODCALL SUPER IDENTIFIER ( arguments )? ) | ^( FIELDACCESS SUPER IDENTIFIER ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==METHODCALL) ) {
                alt44=1;
            }
            else if ( (LA44_0==FIELDACCESS) ) {
                alt44=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return t;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:547:7: ^( METHODCALL SUPER IDENTIFIER ( arguments )? )
                    {
                    match(input,METHODCALL,FOLLOW_METHODCALL_in_superMemberAccess2689); if (state.failed) return t;

                    match(input, Token.DOWN, null); if (state.failed) return t;
                    match(input,SUPER,FOLLOW_SUPER_in_superMemberAccess2691); if (state.failed) return t;
                    IDENTIFIER49=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_superMemberAccess2693); if (state.failed) return t;
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:547:37: ( arguments )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==ARGUMENTS) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:547:37: arguments
                            {
                            pushFollow(FOLLOW_arguments_in_superMemberAccess2695);
                            arguments48=arguments();

                            state._fsp--;
                            if (state.failed) return t;

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return t;
                    if ( state.backtracking==0 ) {
                       if( (arguments48!=null?arguments48.types:null) == null || ruleTypeCheck((Type[])(arguments48!=null?arguments48.types:null).toArray()) ) {
                      	    	  try {
                      	          	t = rt.getSuperClass().bindMethod(false, (IDENTIFIER49!=null?IDENTIFIER49.getText():null), (arguments48!=null?arguments48.types:null));
                      		  } catch (EarlyBindingException ex) {
                      		   	errorLog.add(new CannotFindSymbolException(("method " + (IDENTIFIER49!=null?IDENTIFIER49.getText():null) + '(' + printArguments((arguments48!=null?arguments48.types:null)) + ')'), rt.getSuperClass().getName(), (IDENTIFIER49!=null?IDENTIFIER49.getLine():0), (IDENTIFIER49!=null?IDENTIFIER49.getCharPositionInLine():0), rt));
                      		  }
                      	  }
                          	
                    }

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:556:9: ^( FIELDACCESS SUPER IDENTIFIER )
                    {
                    match(input,FIELDACCESS,FOLLOW_FIELDACCESS_in_superMemberAccess2716); if (state.failed) return t;

                    match(input, Token.DOWN, null); if (state.failed) return t;
                    match(input,SUPER,FOLLOW_SUPER_in_superMemberAccess2718); if (state.failed) return t;
                    IDENTIFIER50=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_superMemberAccess2720); if (state.failed) return t;

                    match(input, Token.UP, null); if (state.failed) return t;
                    if ( state.backtracking==0 ) {
                       t = rt.getSuperClass().getField(false, (IDENTIFIER50!=null?IDENTIFIER50.getText():null));
                      	  if (t == null) errorLog.add(new CannotFindSymbolException(("field " + (IDENTIFIER50!=null?IDENTIFIER50.getText():null)), rt.getSuperClass().getName(), (IDENTIFIER50!=null?IDENTIFIER50.getLine():0), (IDENTIFIER50!=null?IDENTIFIER50.getCharPositionInLine():0), rt)); 
                      	
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
        return t;
    }
    // $ANTLR end "superMemberAccess"

    public static class arguments_return extends TreeRuleReturnScope {
        public ArrayList<Type> types;
    };

    // $ANTLR start "arguments"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:562:1: arguments returns [ArrayList<Type> types] : ^( ARGUMENTS expressionList ) ;
    public final JaWalker.arguments_return arguments() throws RecognitionException {
        JaWalker.arguments_return retval = new JaWalker.arguments_return();
        retval.start = input.LT(1);

        ArrayList<Type> expressionList51 = null;


        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:563:5: ( ^( ARGUMENTS expressionList ) )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:563:8: ^( ARGUMENTS expressionList )
            {
            match(input,ARGUMENTS,FOLLOW_ARGUMENTS_in_arguments2761); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_expressionList_in_arguments2763);
            expressionList51=expressionList();

            state._fsp--;
            if (state.failed) return retval;

            match(input, Token.UP, null); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.types = expressionList51; 
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
    // $ANTLR end "arguments"

    // $ANTLR start synpred1_JaWalker
    public final void synpred1_JaWalker_fragment() throws RecognitionException {   
        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:510:10: ( arrayCreatorRest )
        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:510:11: arrayCreatorRest
        {
        pushFollow(FOLLOW_arrayCreatorRest_in_synpred1_JaWalker2432);
        arrayCreatorRest();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_JaWalker

    // Delegated rules

    public final boolean synpred1_JaWalker() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_JaWalker_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA33 dfa33 = new DFA33(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA39 dfa39 = new DFA39(this);
    static final String DFA33_eotS =
        "\33\uffff";
    static final String DFA33_eofS =
        "\33\uffff";
    static final String DFA33_minS =
        "\1\4\16\uffff\1\2\2\uffff\2\2\2\uffff\1\11\2\4\2\uffff";
    static final String DFA33_maxS =
        "\1\151\16\uffff\1\2\2\uffff\2\2\2\uffff\1\60\2\151\2\uffff";
    static final String DFA33_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\uffff\1\21\1\22\2\uffff\1\23\1\24\3\uffff\1\20\1\17";
    static final String DFA33_specialS =
        "\33\uffff}>";
    static final String[] DFA33_transitionS = {
            "\1\23\1\uffff\1\22\1\24\1\25\23\uffff\1\15\1\21\1\15\1\21\2"+
            "\15\1\17\1\uffff\1\25\14\uffff\1\25\1\uffff\10\25\6\uffff\1"+
            "\13\1\14\1\20\13\uffff\1\1\1\2\1\3\1\4\1\5\16\uffff\1\7\1\10"+
            "\1\11\1\12\1\6\2\uffff\1\16",
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
            "\1\26",
            "",
            "",
            "\1\27",
            "\1\30",
            "",
            "",
            "\1\31\32\uffff\1\31\4\uffff\10\32",
            "\1\24\1\uffff\3\24\23\uffff\7\24\1\uffff\1\24\14\uffff\1\24"+
            "\1\25\10\24\6\uffff\3\24\13\uffff\5\24\16\uffff\5\24\2\uffff"+
            "\1\24",
            "\1\24\1\uffff\3\24\23\uffff\7\24\1\uffff\1\24\14\uffff\1\24"+
            "\1\25\10\24\6\uffff\3\24\13\uffff\5\24\16\uffff\5\24\2\uffff"+
            "\1\24",
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
            return "387:1: expression returns [Type t, boolean b] : ( ^( EQ e1= expression e2= expression ) | ^( PLUS e1= expression e2= expression ) | ^( MINUS e1= expression e2= expression ) | ^( STAR e1= expression e2= expression ) | ^( SLASH e1= expression e2= expression ) | ^(mod= '%' e1= expression e2= expression ) | ^(or= '||' e1= expression e2= expression ) | ^(and= '&&' e1= expression e2= expression ) | ^(eq= '==' e1= expression e2= expression ) | ^(nq= '!=' e1= expression e2= expression ) | ^( INSTANCEOF e= expression type ) | ^( COMPAREOP e1= expression e2= expression ) | ^(op= ( UNARYPLUS | UNARYMINUS | PREINC | PREDEC ) e= expression ) | ^(op= '!' e= expression ) | ^( CAST pt= primitiveType e= expression ) | ^( CAST npt= nonPrimitiveType e= expression ) | ^( NEW creator ) | ^(op= ( POSTINC | POSTDEC ) (sp= selector | sp= primary ) ) | selector | primary );";
        }
    }
    static final String DFA34_eotS =
        "\13\uffff";
    static final String DFA34_eofS =
        "\13\uffff";
    static final String DFA34_minS =
        "\1\4\4\uffff\1\2\1\11\4\uffff";
    static final String DFA34_maxS =
        "\1\72\4\uffff\1\2\1\60\4\uffff";
    static final String DFA34_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\2\uffff\1\5\1\6\1\10\1\7";
    static final String DFA34_specialS =
        "\13\uffff}>";
    static final String[] DFA34_transitionS = {
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
            return "459:1: primary returns [Type t] : ( THIS | superMemberAccess | literal | IDENTIFIER | ^( DOTCLASS ^( ARRAYTYPE type ) ) | ^( DOTCLASS IDENTIFIER ) | ^( DOTCLASS primitiveType ) | ^( DOTCLASS VOID ) );";
        }
    }
    static final String DFA39_eotS =
        "\14\uffff";
    static final String DFA39_eofS =
        "\14\uffff";
    static final String DFA39_minS =
        "\1\11\1\uffff\11\0\1\uffff";
    static final String DFA39_maxS =
        "\1\60\1\uffff\11\0\1\uffff";
    static final String DFA39_acceptS =
        "\1\uffff\1\1\11\uffff\1\2";
    static final String DFA39_specialS =
        "\1\0\1\uffff\1\5\1\4\1\7\1\2\1\6\1\1\1\11\1\3\1\10\1\uffff}>";
    static final String[] DFA39_transitionS = {
            "\1\1\32\uffff\1\2\4\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] DFA39_eot = DFA.unpackEncodedString(DFA39_eotS);
    static final short[] DFA39_eof = DFA.unpackEncodedString(DFA39_eofS);
    static final char[] DFA39_min = DFA.unpackEncodedStringToUnsignedChars(DFA39_minS);
    static final char[] DFA39_max = DFA.unpackEncodedStringToUnsignedChars(DFA39_maxS);
    static final short[] DFA39_accept = DFA.unpackEncodedString(DFA39_acceptS);
    static final short[] DFA39_special = DFA.unpackEncodedString(DFA39_specialS);
    static final short[][] DFA39_transition;

    static {
        int numStates = DFA39_transitionS.length;
        DFA39_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA39_transition[i] = DFA.unpackEncodedString(DFA39_transitionS[i]);
        }
    }

    class DFA39 extends DFA {

        public DFA39(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 39;
            this.eot = DFA39_eot;
            this.eof = DFA39_eof;
            this.min = DFA39_min;
            this.max = DFA39_max;
            this.accept = DFA39_accept;
            this.special = DFA39_special;
            this.transition = DFA39_transition;
        }
        public String getDescription() {
            return "509:1: creator returns [Type t] : ( ( arrayCreatorRest )=>acr= arrayCreatorRest ( arrayInitializer[$acr.t] )? | createdName ( classCreatorRest )? );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TreeNodeStream input = (TreeNodeStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA39_0 = input.LA(1);

                         
                        int index39_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA39_0==ARRAYTYPE) && (synpred1_JaWalker())) {s = 1;}

                        else if ( (LA39_0==IDENTIFIER) ) {s = 2;}

                        else if ( (LA39_0==CHAR) ) {s = 3;}

                        else if ( (LA39_0==BYTE) ) {s = 4;}

                        else if ( (LA39_0==SHORT) ) {s = 5;}

                        else if ( (LA39_0==INT) ) {s = 6;}

                        else if ( (LA39_0==LONG) ) {s = 7;}

                        else if ( (LA39_0==FLOAT) ) {s = 8;}

                        else if ( (LA39_0==DOUBLE) ) {s = 9;}

                        else if ( (LA39_0==BOOLEAN) ) {s = 10;}

                         
                        input.seek(index39_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA39_7 = input.LA(1);

                         
                        int index39_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_JaWalker()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index39_7);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA39_5 = input.LA(1);

                         
                        int index39_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_JaWalker()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index39_5);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA39_9 = input.LA(1);

                         
                        int index39_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_JaWalker()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index39_9);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA39_3 = input.LA(1);

                         
                        int index39_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_JaWalker()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index39_3);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA39_2 = input.LA(1);

                         
                        int index39_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_JaWalker()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index39_2);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA39_6 = input.LA(1);

                         
                        int index39_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_JaWalker()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index39_6);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA39_4 = input.LA(1);

                         
                        int index39_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_JaWalker()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index39_4);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA39_10 = input.LA(1);

                         
                        int index39_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_JaWalker()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index39_10);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA39_8 = input.LA(1);

                         
                        int index39_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_JaWalker()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index39_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 39, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_classDeclaration_in_compilationUnit63 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_in_classDeclaration88 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classDeclaration90 = new BitSet(new long[]{0x0000001000001C08L});
    public static final BitSet FOLLOW_classType_in_classDeclaration92 = new BitSet(new long[]{0x0000000000001C08L});
    public static final BitSet FOLLOW_classBody_in_classDeclaration95 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_classBodyDeclaration_in_classBody122 = new BitSet(new long[]{0x0000000000001C02L});
    public static final BitSet FOLLOW_memberDeclaration_in_classBodyDeclaration142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldDeclaration_in_memberDeclaration165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodAndConstructorDeclaration_in_memberDeclaration173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_METHOD_in_methodAndConstructorDeclaration212 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifier_in_methodAndConstructorDeclaration214 = new BitSet(new long[]{0x0001FE1000000200L});
    public static final BitSet FOLLOW_type_in_methodAndConstructorDeclaration216 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_methodDeclaration_in_methodAndConstructorDeclaration219 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_METHOD_in_methodAndConstructorDeclaration234 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifier_in_methodAndConstructorDeclaration236 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_VOID_in_methodAndConstructorDeclaration238 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_methodAndConstructorDeclaration240 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_voidMethodDeclaratorRest_in_methodAndConstructorDeclaration244 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONSTR_in_methodAndConstructorDeclaration259 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifier_in_methodAndConstructorDeclaration261 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_methodAndConstructorDeclaration263 = new BitSet(new long[]{0x0000000000042008L});
    public static final BitSet FOLLOW_formalParameters_in_methodAndConstructorDeclaration267 = new BitSet(new long[]{0x0000000000040008L});
    public static final BitSet FOLLOW_constructorBody_in_methodAndConstructorDeclaration270 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_methodDeclaration301 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_formalParameters_in_methodDeclaration305 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_methodBody_in_methodDeclaration308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIELD_in_fieldDeclaration328 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifier_in_fieldDeclaration330 = new BitSet(new long[]{0x0001FE1000000200L});
    public static final BitSet FOLLOW_variableDeclarator_in_fieldDeclaration332 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_formalParameters_in_voidMethodDeclaratorRest355 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_methodBody_in_voidMethodDeclaratorRest357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_variableDeclarator380 = new BitSet(new long[]{0x07FA0017F80001D2L,0x0000027C000F800EL});
    public static final BitSet FOLLOW_variableInitializer_in_variableDeclarator385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_variableDeclaratorId415 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_variableDeclaratorId417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayInitializer_in_variableInitializer448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_variableInitializer461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAYINIT_in_arrayInitializer489 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableInitializer_in_arrayInitializer493 = new BitSet(new long[]{0x07FA0017F80001D8L,0x0000027C000F800EL});
    public static final BitSet FOLLOW_variableInitializer_in_arrayInitializer516 = new BitSet(new long[]{0x07FA0017F80001D8L,0x0000027C000F800EL});
    public static final BitSet FOLLOW_set_in_modifier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonPrimitiveType_in_type590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_type600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAYTYPE_in_nonPrimitiveType628 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_nonPrimitiveType_in_nonPrimitiveType632 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_classType_in_nonPrimitiveType645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAYTYPE_in_nonPrimitiveType679 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primitiveType_in_nonPrimitiveType681 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classType712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_primitiveType737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BYTE_in_primitiveType752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHORT_in_primitiveType767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_primitiveType781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_in_primitiveType797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_primitiveType812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_primitiveType826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_primitiveType839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FPARMS_in_formalParameters865 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_formalParameterDecls_in_formalParameters867 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FPARM_in_formalParameterDecls892 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_formalParameterDecls894 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_formalParameterDecls_in_formalParameterDecls899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MBODY_in_methodBody925 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_methodBody927 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CBODY_in_constructorBody986 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_explicitConstructorInvocation_in_constructorBody988 = new BitSet(new long[]{0xB800000002380008L});
    public static final BitSet FOLLOW_blockStatement_in_constructorBody991 = new BitSet(new long[]{0xB800000002380008L});
    public static final BitSet FOLLOW_CONSTRCALL_in_explicitConstructorInvocation1013 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_THIS_in_explicitConstructorInvocation1015 = new BitSet(new long[]{0x0000000000004008L});
    public static final BitSet FOLLOW_arguments_in_explicitConstructorInvocation1018 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONSTRCALL_in_explicitConstructorInvocation1029 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SUPER_in_explicitConstructorInvocation1031 = new BitSet(new long[]{0x0000000000004008L});
    public static final BitSet FOLLOW_arguments_in_explicitConstructorInvocation1033 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INTLITERAL_in_literal1058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONGLITERAL_in_literal1074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOATLITERAL_in_literal1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLELITERAL_in_literal1101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARLITERAL_in_literal1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_literal1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_literal1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULLLITERAL_in_literal1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockStatement_in_block1198 = new BitSet(new long[]{0xB800000002380002L});
    public static final BitSet FOLLOW_localVariableDeclarationStatement_in_blockStatement1225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_blockStatement1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localVariableDeclaration_in_localVariableDeclarationStatement1257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARDECL_in_localVariableDeclaration1275 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableDeclarator_in_localVariableDeclaration1277 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLOCK_in_statement1314 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_statement1316 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_in_statement1328 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CONDITION_in_statement1331 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement1333 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_THEN_in_statement1337 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_statement1339 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_elseStmt_in_statement1342 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FOR_in_statement1355 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INIT_in_statement1359 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_forInit_in_statement1361 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONDITION_in_statement1368 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement1370 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UPDATE_in_statement1377 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_forUpdate_in_statement1379 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_statement_in_statement1384 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WHILE_in_statement1397 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CONDITION_in_statement1400 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement1402 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_statement_in_statement1405 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DOWHILE_in_statement1417 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CONDITION_in_statement1420 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement1422 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_statement_in_statement1425 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RETURN_in_statement1437 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement1439 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STMT_in_statement1453 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statementExpression_in_statement1455 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ELSE_in_elseStmt1478 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_elseStmt1480 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_localVariableDeclaration_in_forInit1500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionList_in_forInit1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionList_in_forUpdate1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionList1564 = new BitSet(new long[]{0x07FA0017F80001D2L,0x0000027C000F800EL});
    public static final BitSet FOLLOW_expression_in_statementExpression1587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_constantExpression1610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_expression1638 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1642 = new BitSet(new long[]{0x07FA0017F80001D0L,0x0000027C000F800EL});
    public static final BitSet FOLLOW_expression_in_expression1646 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_in_expression1664 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1671 = new BitSet(new long[]{0x07FA0017F80001D0L,0x0000027C000F800EL});
    public static final BitSet FOLLOW_expression_in_expression1675 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_expression1687 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1693 = new BitSet(new long[]{0x07FA0017F80001D0L,0x0000027C000F800EL});
    public static final BitSet FOLLOW_expression_in_expression1697 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STAR_in_expression1709 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1716 = new BitSet(new long[]{0x07FA0017F80001D0L,0x0000027C000F800EL});
    public static final BitSet FOLLOW_expression_in_expression1720 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SLASH_in_expression1732 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1738 = new BitSet(new long[]{0x07FA0017F80001D0L,0x0000027C000F800EL});
    public static final BitSet FOLLOW_expression_in_expression1742 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_102_in_expression1758 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1762 = new BitSet(new long[]{0x07FA0017F80001D0L,0x0000027C000F800EL});
    public static final BitSet FOLLOW_expression_in_expression1766 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_98_in_expression1782 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1787 = new BitSet(new long[]{0x07FA0017F80001D0L,0x0000027C000F800EL});
    public static final BitSet FOLLOW_expression_in_expression1791 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_99_in_expression1807 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1811 = new BitSet(new long[]{0x07FA0017F80001D0L,0x0000027C000F800EL});
    public static final BitSet FOLLOW_expression_in_expression1815 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_100_in_expression1831 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1836 = new BitSet(new long[]{0x07FA0017F80001D0L,0x0000027C000F800EL});
    public static final BitSet FOLLOW_expression_in_expression1840 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_101_in_expression1856 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1861 = new BitSet(new long[]{0x07FA0017F80001D0L,0x0000027C000F800EL});
    public static final BitSet FOLLOW_expression_in_expression1865 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INSTANCEOF_in_expression1877 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1881 = new BitSet(new long[]{0x0001FE1000000200L});
    public static final BitSet FOLLOW_type_in_expression1883 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COMPAREOP_in_expression1903 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1907 = new BitSet(new long[]{0x07FA0017F80001D0L,0x0000027C000F800EL});
    public static final BitSet FOLLOW_expression_in_expression1911 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_expression1933 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1949 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_105_in_expression1987 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1991 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CAST_in_expression2010 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primitiveType_in_expression2014 = new BitSet(new long[]{0x07FA0017F80001D0L,0x0000027C000F800EL});
    public static final BitSet FOLLOW_expression_in_expression2018 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CAST_in_expression2037 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_nonPrimitiveType_in_expression2041 = new BitSet(new long[]{0x07FA0017F80001D0L,0x0000027C000F800EL});
    public static final BitSet FOLLOW_expression_in_expression2045 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NEW_in_expression2064 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_creator_in_expression2066 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_expression2080 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_selector_in_expression2091 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_primary_in_expression2097 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_selector_in_expression2122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_in_expression2134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_primary2175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_superMemberAccess_in_primary2187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primary2199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_primary2211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOTCLASS_in_primary2229 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ARRAYTYPE_in_primary2232 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_primary2234 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DOTCLASS_in_primary2249 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_primary2251 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DOTCLASS_in_primary2272 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primitiveType_in_primary2274 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DOTCLASS_in_primary2292 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VOID_in_primary2294 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FIELDACCESS_in_selector2338 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_selector2340 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_selector2342 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_METHODCALL_in_selector2361 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_selector2363 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_selector2365 = new BitSet(new long[]{0x0000000000004008L});
    public static final BitSet FOLLOW_arguments_in_selector2367 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARRAYACCESS_in_selector2390 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_selector2394 = new BitSet(new long[]{0x07FA0017F80001D0L,0x0000027C000F800EL});
    public static final BitSet FOLLOW_expression_in_selector2398 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_arrayCreatorRest_in_creator2439 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_arrayInitializer_in_creator2441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createdName_in_creator2454 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_classCreatorRest_in_creator2456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classType_in_createdName2482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_createdName2498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAYTYPE_in_arrayCreatorRest2527 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arrayCreatorRest_in_arrayCreatorRest2531 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_createdName_in_arrayCreatorRest2550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAYTYPE_in_arrayCreatorRest2563 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_arrayCreatorRest2567 = new BitSet(new long[]{0x0001FE1000000200L});
    public static final BitSet FOLLOW_arrayCreatorRestExpr_in_arrayCreatorRest2571 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARRAYTYPE_in_arrayCreatorRestExpr2604 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_arrayCreatorRestExpr2608 = new BitSet(new long[]{0x0001FE1000000200L});
    public static final BitSet FOLLOW_arrayCreatorRest_in_arrayCreatorRestExpr2612 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_createdName_in_arrayCreatorRestExpr2632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arguments_in_classCreatorRest2657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_METHODCALL_in_superMemberAccess2689 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SUPER_in_superMemberAccess2691 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_superMemberAccess2693 = new BitSet(new long[]{0x0000000000004008L});
    public static final BitSet FOLLOW_arguments_in_superMemberAccess2695 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FIELDACCESS_in_superMemberAccess2716 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SUPER_in_superMemberAccess2718 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_superMemberAccess2720 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARGUMENTS_in_arguments2761 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expressionList_in_arguments2763 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_arrayCreatorRest_in_synpred1_JaWalker2432 = new BitSet(new long[]{0x0000000000000002L});

}