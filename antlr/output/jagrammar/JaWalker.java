// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g 2010-10-08 19:26:14

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
            pushFollow(FOLLOW_classDeclaration_in_compilationUnit61);
            classDeclaration();

            state._fsp--;


            }


            	System.out.println("ERROR LOG:" + errorLog);

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
            match(input,CLASS,FOLLOW_CLASS_in_classDeclaration86); 

            match(input, Token.DOWN, null); 
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classDeclaration88); 
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
                    pushFollow(FOLLOW_classType_in_classDeclaration90);
                    classType();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_classBody_in_classDeclaration93);
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
            	    pushFollow(FOLLOW_classBodyDeclaration_in_classBody120);
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:171:1: classBodyDeclaration : memberDeclaration ;
    public final void classBodyDeclaration() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:172:5: ( memberDeclaration )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:172:9: memberDeclaration
            {
            pushFollow(FOLLOW_memberDeclaration_in_classBodyDeclaration140);
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
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:176:9: fieldDeclaration
                    {
                    pushFollow(FOLLOW_fieldDeclaration_in_memberDeclaration163);
                    fieldDeclaration();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:177:7: methodAndConstructorDeclaration
                    {
                    pushFollow(FOLLOW_methodAndConstructorDeclaration_in_memberDeclaration171);
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
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:189:9: ^( METHOD modifier type methodDeclaration )
                    {
                    match(input,METHOD,FOLLOW_METHOD_in_methodAndConstructorDeclaration210); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_modifier_in_methodAndConstructorDeclaration212);
                    modifier();

                    state._fsp--;

                    pushFollow(FOLLOW_type_in_methodAndConstructorDeclaration214);
                    type();

                    state._fsp--;

                    pushFollow(FOLLOW_methodDeclaration_in_methodAndConstructorDeclaration217);
                    methodDeclaration();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:190:9: ^( METHOD modifier VOID IDENTIFIER voidMethodDeclaratorRest )
                    {
                    match(input,METHOD,FOLLOW_METHOD_in_methodAndConstructorDeclaration232); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_modifier_in_methodAndConstructorDeclaration234);
                    modifier();

                    state._fsp--;

                    match(input,VOID,FOLLOW_VOID_in_methodAndConstructorDeclaration236); 
                    IDENTIFIER1=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_methodAndConstructorDeclaration238); 
                     ((JaScope_scope)JaScope_stack.peek()).name = (IDENTIFIER1!=null?IDENTIFIER1.getText():null); 
                    pushFollow(FOLLOW_voidMethodDeclaratorRest_in_methodAndConstructorDeclaration242);
                    voidMethodDeclaratorRest();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:191:9: ^( CONSTR modifier IDENTIFIER ( formalParameters )? ( constructorBody )? )
                    {
                    match(input,CONSTR,FOLLOW_CONSTR_in_methodAndConstructorDeclaration257); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_modifier_in_methodAndConstructorDeclaration259);
                    modifier();

                    state._fsp--;

                    IDENTIFIER2=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_methodAndConstructorDeclaration261); 
                     ((JaScope_scope)JaScope_stack.peek()).name = (IDENTIFIER2!=null?IDENTIFIER2.getText():null); 
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
                            pushFollow(FOLLOW_formalParameters_in_methodAndConstructorDeclaration265);
                            formalParameters();

                            state._fsp--;


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
                            pushFollow(FOLLOW_constructorBody_in_methodAndConstructorDeclaration268);
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:195:1: methodDeclaration : IDENTIFIER ( formalParameters )? methodBody ;
    public final void methodDeclaration() throws RecognitionException {
        CommonTree IDENTIFIER3=null;

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:196:5: ( IDENTIFIER ( formalParameters )? methodBody )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:196:9: IDENTIFIER ( formalParameters )? methodBody
            {
            IDENTIFIER3=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_methodDeclaration299); 
             ((JaScope_scope)JaScope_stack.peek()).name = (IDENTIFIER3!=null?IDENTIFIER3.getText():null); 
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
                    pushFollow(FOLLOW_formalParameters_in_methodDeclaration303);
                    formalParameters();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_methodBody_in_methodDeclaration306);
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:199:1: fieldDeclaration : ^( FIELD modifier variableDeclarator ) ;
    public final void fieldDeclaration() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:200:5: ( ^( FIELD modifier variableDeclarator ) )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:200:9: ^( FIELD modifier variableDeclarator )
            {
            match(input,FIELD,FOLLOW_FIELD_in_fieldDeclaration326); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_modifier_in_fieldDeclaration328);
            modifier();

            state._fsp--;

            pushFollow(FOLLOW_variableDeclarator_in_fieldDeclaration330);
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:203:1: voidMethodDeclaratorRest : formalParameters methodBody ;
    public final void voidMethodDeclaratorRest() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:204:5: ( formalParameters methodBody )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:204:7: formalParameters methodBody
            {
            pushFollow(FOLLOW_formalParameters_in_voidMethodDeclaratorRest353);
            formalParameters();

            state._fsp--;

            pushFollow(FOLLOW_methodBody_in_voidMethodDeclaratorRest355);
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
            pushFollow(FOLLOW_variableDeclaratorId_in_variableDeclarator378);
            variableDeclaratorId4=variableDeclaratorId();

            state._fsp--;

             retval.id = (variableDeclaratorId4!=null?variableDeclaratorId4.id:null); retval.t = (variableDeclaratorId4!=null?variableDeclaratorId4.t:null); 
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
                    pushFollow(FOLLOW_variableInitializer_in_variableDeclarator383);
                    variableInitializer((variableDeclaratorId4!=null?variableDeclaratorId4.t:null));

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
            pushFollow(FOLLOW_type_in_variableDeclaratorId413);
            type6=type();

            state._fsp--;

            IDENTIFIER5=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variableDeclaratorId415); 
             retval.id = IDENTIFIER5; retval.t = type6; 

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
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:216:9: arrayInitializer[((ArrayType)$tin).getHostType()]
                    {
                    pushFollow(FOLLOW_arrayInitializer_in_variableInitializer446);
                    arrayInitializer7=arrayInitializer(((ArrayType)tin).getHostType());

                    state._fsp--;

                     t = arrayInitializer7; 

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:217:9: expression
                    {
                    pushFollow(FOLLOW_expression_in_variableInitializer459);
                    expression8=expression();

                    state._fsp--;

                     t = (expression8!=null?expression8.t:null); 

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:220:1: arrayInitializer[Type tin] returns [Type t] : ^( ARRAYINIT v1= variableInitializer[$tin] ( variableInitializer[$tin] )* ) ;
    public final Type arrayInitializer(Type tin) throws RecognitionException {
        Type t = null;

        CommonTree ARRAYINIT9=null;
        Type v1 = null;


        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:221:5: ( ^( ARRAYINIT v1= variableInitializer[$tin] ( variableInitializer[$tin] )* ) )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:221:9: ^( ARRAYINIT v1= variableInitializer[$tin] ( variableInitializer[$tin] )* )
            {
            ARRAYINIT9=(CommonTree)match(input,ARRAYINIT,FOLLOW_ARRAYINIT_in_arrayInitializer487); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_variableInitializer_in_arrayInitializer491);
            v1=variableInitializer(tin);

            state._fsp--;

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:221:51: ( variableInitializer[$tin] )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==METHODCALL||(LA10_0>=FIELDACCESS && LA10_0<=DOTCLASS)||(LA10_0>=ARRAYINIT && LA10_0<=CAST)||LA10_0==IDENTIFIER||LA10_0==THIS||(LA10_0>=INTLITERAL && LA10_0<=NULLLITERAL)||(LA10_0>=INSTANCEOF && LA10_0<=NEW)||(LA10_0>=EQ && LA10_0<=SLASH)||(LA10_0>=98 && LA10_0<=102)||LA10_0==105) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:221:52: variableInitializer[$tin]
            	    {
            	    pushFollow(FOLLOW_variableInitializer_in_arrayInitializer496);
            	    variableInitializer(tin);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            match(input, Token.UP, null); 
             
                	  if (ruleTypeCheck(v1)) {
            	        t = (ComplexType)ParserHelper.createArrayType(tin, 1);
            	     	if( !t.isAssignableTo(tin)) errorLog.add(new IncompatibleTypesException(tin.toString(), t.toString(), (ARRAYINIT9!=null?ARRAYINIT9.getLine():0), (ARRAYINIT9!=null?ARRAYINIT9.getCharPositionInLine():0), rt));
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
    // $ANTLR end "arrayInitializer"


    // $ANTLR start "modifier"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:230:1: modifier : ( PUBLIC | PRIVATE );
    public final void modifier() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:231:5: ( PUBLIC | PRIVATE )
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:235:1: type returns [Type t] : ( nonPrimitiveType | primitiveType );
    public final Type type() throws RecognitionException {
        Type t = null;

        ComplexType nonPrimitiveType10 = null;

        BasicType primitiveType11 = null;


        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:236:5: ( nonPrimitiveType | primitiveType )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ARRAYTYPE||LA11_0==IDENTIFIER) ) {
                alt11=1;
            }
            else if ( ((LA11_0>=CHAR && LA11_0<=BOOLEAN)) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:236:7: nonPrimitiveType
                    {
                    pushFollow(FOLLOW_nonPrimitiveType_in_type567);
                    nonPrimitiveType10=nonPrimitiveType();

                    state._fsp--;

                     t = nonPrimitiveType10; 

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:237:7: primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_type577);
                    primitiveType11=primitiveType();

                    state._fsp--;

                     t = primitiveType11;   

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:240:1: nonPrimitiveType returns [ComplexType t] : ( ^( ARRAYTYPE npt= nonPrimitiveType ) | classType | ^( ARRAYTYPE primitiveType ) );
    public final ComplexType nonPrimitiveType() throws RecognitionException {
        ComplexType t = null;

        ComplexType npt = null;

        ReferenceType classType12 = null;

        BasicType primitiveType13 = null;


        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:241:5: ( ^( ARRAYTYPE npt= nonPrimitiveType ) | classType | ^( ARRAYTYPE primitiveType ) )
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
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA12_0==IDENTIFIER) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:241:7: ^( ARRAYTYPE npt= nonPrimitiveType )
                    {
                    match(input,ARRAYTYPE,FOLLOW_ARRAYTYPE_in_nonPrimitiveType605); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_nonPrimitiveType_in_nonPrimitiveType609);
                    npt=nonPrimitiveType();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     t = (ComplexType)ParserHelper.createArrayType(npt, 1); 

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:242:9: classType
                    {
                    pushFollow(FOLLOW_classType_in_nonPrimitiveType622);
                    classType12=classType();

                    state._fsp--;

                     t = classType12; 

                    }
                    break;
                case 3 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:243:7: ^( ARRAYTYPE primitiveType )
                    {
                    match(input,ARRAYTYPE,FOLLOW_ARRAYTYPE_in_nonPrimitiveType656); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_primitiveType_in_nonPrimitiveType658);
                    primitiveType13=primitiveType();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     t = (ComplexType)ParserHelper.createArrayType(primitiveType13, 1); 

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:246:1: classType returns [ReferenceType t] : IDENTIFIER ;
    public final ReferenceType classType() throws RecognitionException {
        ReferenceType t = null;

        CommonTree IDENTIFIER14=null;

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:247:5: ( IDENTIFIER )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:247:7: IDENTIFIER
            {
            IDENTIFIER14=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classType689); 
             t = cTab.get((IDENTIFIER14!=null?IDENTIFIER14.getText():null)); 

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:250:1: primitiveType returns [BasicType bs] : ( CHAR | BYTE | SHORT | INT | LONG | FLOAT | DOUBLE | BOOLEAN );
    public final BasicType primitiveType() throws RecognitionException {
        BasicType bs = null;

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:251:5: ( CHAR | BYTE | SHORT | INT | LONG | FLOAT | DOUBLE | BOOLEAN )
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
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:251:9: CHAR
                    {
                    match(input,CHAR,FOLLOW_CHAR_in_primitiveType714); 
                     bs = BasicType.CHAR;    

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:252:9: BYTE
                    {
                    match(input,BYTE,FOLLOW_BYTE_in_primitiveType729); 
                     bs = BasicType.BYTE;    

                    }
                    break;
                case 3 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:253:9: SHORT
                    {
                    match(input,SHORT,FOLLOW_SHORT_in_primitiveType744); 
                     bs = BasicType.SHORT;   

                    }
                    break;
                case 4 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:254:9: INT
                    {
                    match(input,INT,FOLLOW_INT_in_primitiveType758); 
                     bs = BasicType.INT;     

                    }
                    break;
                case 5 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:255:9: LONG
                    {
                    match(input,LONG,FOLLOW_LONG_in_primitiveType774); 
                     bs = BasicType.LONG;    

                    }
                    break;
                case 6 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:256:9: FLOAT
                    {
                    match(input,FLOAT,FOLLOW_FLOAT_in_primitiveType789); 
                     bs = BasicType.FLOAT;   

                    }
                    break;
                case 7 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:257:9: DOUBLE
                    {
                    match(input,DOUBLE,FOLLOW_DOUBLE_in_primitiveType803); 
                     bs = BasicType.DOUBLE;  

                    }
                    break;
                case 8 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:258:9: BOOLEAN
                    {
                    match(input,BOOLEAN,FOLLOW_BOOLEAN_in_primitiveType816); 
                     bs = BasicType.BOOLEAN; 

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:261:1: formalParameters : ^( FPARMS ( formalParameterDecls )? ) ;
    public final void formalParameters() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:262:5: ( ^( FPARMS ( formalParameterDecls )? ) )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:262:9: ^( FPARMS ( formalParameterDecls )? )
            {
            match(input,FPARMS,FOLLOW_FPARMS_in_formalParameters842); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:262:18: ( formalParameterDecls )?
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==FPARM) ) {
                    alt14=1;
                }
                switch (alt14) {
                    case 1 :
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:262:18: formalParameterDecls
                        {
                        pushFollow(FOLLOW_formalParameterDecls_in_formalParameters844);
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:265:1: formalParameterDecls : ^( FPARM variableDeclaratorId ) ( formalParameterDecls )? ;
    public final void formalParameterDecls() throws RecognitionException {
        JaWalker.variableDeclaratorId_return variableDeclaratorId15 = null;


        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:266:5: ( ^( FPARM variableDeclaratorId ) ( formalParameterDecls )? )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:266:7: ^( FPARM variableDeclaratorId ) ( formalParameterDecls )?
            {
            match(input,FPARM,FOLLOW_FPARM_in_formalParameterDecls869); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_variableDeclaratorId_in_formalParameterDecls871);
            variableDeclaratorId15=variableDeclaratorId();

            state._fsp--;


            match(input, Token.UP, null); 
             formalParameters.add((variableDeclaratorId15!=null?variableDeclaratorId15.id:null).getText()); addVariableToScope((variableDeclaratorId15!=null?variableDeclaratorId15.id:null), (variableDeclaratorId15!=null?variableDeclaratorId15.t:null)); 
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:266:170: ( formalParameterDecls )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==FPARM) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:266:170: formalParameterDecls
                    {
                    pushFollow(FOLLOW_formalParameterDecls_in_formalParameterDecls876);
                    formalParameterDecls();

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
    // $ANTLR end "formalParameterDecls"


    // $ANTLR start "methodBody"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:270:1: methodBody : ^( MBODY block ) ;
    public final void methodBody() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:271:5: ( ^( MBODY block ) )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:271:9: ^( MBODY block )
            {
            match(input,MBODY,FOLLOW_MBODY_in_methodBody902); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                pushFollow(FOLLOW_block_in_methodBody904);
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:275:1: constructorBody : ^( CBODY ( explicitConstructorInvocation )? ( blockStatement )* ) ;
    public final void constructorBody() throws RecognitionException {
        JaScope_stack.push(new JaScope_scope());


        	((JaScope_scope)JaScope_stack.peek()).symbols = new HashMap<String, Type>();

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:283:5: ( ^( CBODY ( explicitConstructorInvocation )? ( blockStatement )* ) )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:283:7: ^( CBODY ( explicitConstructorInvocation )? ( blockStatement )* )
            {
            match(input,CBODY,FOLLOW_CBODY_in_constructorBody963); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:283:15: ( explicitConstructorInvocation )?
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==CONSTRCALL) ) {
                    alt16=1;
                }
                switch (alt16) {
                    case 1 :
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:283:15: explicitConstructorInvocation
                        {
                        pushFollow(FOLLOW_explicitConstructorInvocation_in_constructorBody965);
                        explicitConstructorInvocation();

                        state._fsp--;


                        }
                        break;

                }

                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:283:46: ( blockStatement )*
                loop17:
                do {
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( ((LA17_0>=VARDECL && LA17_0<=STMT)||LA17_0==DOWHILE||(LA17_0>=IF && LA17_0<=WHILE)||LA17_0==RETURN) ) {
                        alt17=1;
                    }


                    switch (alt17) {
                	case 1 :
                	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:283:46: blockStatement
                	    {
                	    pushFollow(FOLLOW_blockStatement_in_constructorBody968);
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


            	System.out.println("constructorBody: " + getMethodSignature() + " Scope: " + ((JaScope_scope)JaScope_stack.peek()).symbols);

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:286:1: explicitConstructorInvocation : ( ^( CONSTRCALL THIS ( arguments )? ) | ^( CONSTRCALL SUPER ( arguments )? ) );
    public final void explicitConstructorInvocation() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:287:5: ( ^( CONSTRCALL THIS ( arguments )? ) | ^( CONSTRCALL SUPER ( arguments )? ) )
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
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:287:9: ^( CONSTRCALL THIS ( arguments )? )
                    {
                    match(input,CONSTRCALL,FOLLOW_CONSTRCALL_in_explicitConstructorInvocation990); 

                    match(input, Token.DOWN, null); 
                    match(input,THIS,FOLLOW_THIS_in_explicitConstructorInvocation992); 
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:287:28: ( arguments )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==ARGUMENTS) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:287:28: arguments
                            {
                            pushFollow(FOLLOW_arguments_in_explicitConstructorInvocation995);
                            arguments();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:288:7: ^( CONSTRCALL SUPER ( arguments )? )
                    {
                    match(input,CONSTRCALL,FOLLOW_CONSTRCALL_in_explicitConstructorInvocation1006); 

                    match(input, Token.DOWN, null); 
                    match(input,SUPER,FOLLOW_SUPER_in_explicitConstructorInvocation1008); 
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:288:26: ( arguments )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==ARGUMENTS) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:288:26: arguments
                            {
                            pushFollow(FOLLOW_arguments_in_explicitConstructorInvocation1010);
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:291:1: literal returns [Type t] : ( INTLITERAL | LONGLITERAL | FLOATLITERAL | DOUBLELITERAL | CHARLITERAL | STRINGLITERAL | BOOLEANLITERAL | NULLLITERAL );
    public final Type literal() throws RecognitionException {
        Type t = null;

        CommonTree INTLITERAL16=null;

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:292:5: ( INTLITERAL | LONGLITERAL | FLOATLITERAL | DOUBLELITERAL | CHARLITERAL | STRINGLITERAL | BOOLEANLITERAL | NULLLITERAL )
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
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:292:9: INTLITERAL
                    {
                    INTLITERAL16=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_literal1035); 
                     int literal = Integer.parseInt((INTLITERAL16!=null?INTLITERAL16.getText():null));
                        			 if ((literal >= -128) &&( literal <= 127)) 
                        			 	{ t = BasicType.BYTE; } 
                        			 else 
                        			 	if ((literal >= -32.768) &&( literal <= 32.767)) 
                        			 		{ t = BasicType.SHORT; } 
                        			 	else
                        			 		{ t = BasicType.INT; }
                        		       

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:301:9: LONGLITERAL
                    {
                    match(input,LONGLITERAL,FOLLOW_LONGLITERAL_in_literal1051); 
                     t = BasicType.LONG;       

                    }
                    break;
                case 3 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:302:9: FLOATLITERAL
                    {
                    match(input,FLOATLITERAL,FOLLOW_FLOATLITERAL_in_literal1066); 
                     t = BasicType.FLOAT;      

                    }
                    break;
                case 4 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:303:7: DOUBLELITERAL
                    {
                    match(input,DOUBLELITERAL,FOLLOW_DOUBLELITERAL_in_literal1078); 
                     t = BasicType.DOUBLE;     

                    }
                    break;
                case 5 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:304:9: CHARLITERAL
                    {
                    match(input,CHARLITERAL,FOLLOW_CHARLITERAL_in_literal1091); 
                     t = BasicType.CHAR;       

                    }
                    break;
                case 6 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:305:9: STRINGLITERAL
                    {
                    match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_literal1106); 
                     t = ReferenceType.STRING; 

                    }
                    break;
                case 7 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:306:9: BOOLEANLITERAL
                    {
                    match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_literal1119); 
                     t = BasicType.BOOLEAN;    

                    }
                    break;
                case 8 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:307:9: NULLLITERAL
                    {
                    match(input,NULLLITERAL,FOLLOW_NULLLITERAL_in_literal1131); 
                     t = NullType.TYPE;        

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:312:1: block : (b= blockStatement )* ;
    public final void block() throws RecognitionException {
        JaScope_stack.push(new JaScope_scope());

        JaWalker.blockStatement_return b = null;



        	((JaScope_scope)JaScope_stack.peek()).symbols = new HashMap<String, Type>();

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:320:5: ( (b= blockStatement )* )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:320:9: (b= blockStatement )*
            {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:320:9: (b= blockStatement )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=VARDECL && LA22_0<=STMT)||LA22_0==DOWHILE||(LA22_0>=IF && LA22_0<=WHILE)||LA22_0==RETURN) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:320:10: b= blockStatement
            	    {
            	    pushFollow(FOLLOW_blockStatement_in_block1175);
            	    b=blockStatement();

            	    state._fsp--;

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

    public static class blockStatement_return extends TreeRuleReturnScope {
    };

    // $ANTLR start "blockStatement"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:323:1: blockStatement : ( localVariableDeclarationStatement | statement );
    public final JaWalker.blockStatement_return blockStatement() throws RecognitionException {
        JaWalker.blockStatement_return retval = new JaWalker.blockStatement_return();
        retval.start = input.LT(1);

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:324:5: ( localVariableDeclarationStatement | statement )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==VARDECL) ) {
                alt23=1;
            }
            else if ( ((LA23_0>=BLOCK && LA23_0<=STMT)||LA23_0==DOWHILE||(LA23_0>=IF && LA23_0<=WHILE)||LA23_0==RETURN) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:324:9: localVariableDeclarationStatement
                    {
                    pushFollow(FOLLOW_localVariableDeclarationStatement_in_blockStatement1202);
                    localVariableDeclarationStatement();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:325:9: statement
                    {
                    pushFollow(FOLLOW_statement_in_blockStatement1213);
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
        return retval;
    }
    // $ANTLR end "blockStatement"


    // $ANTLR start "localVariableDeclarationStatement"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:328:1: localVariableDeclarationStatement : localVariableDeclaration ;
    public final void localVariableDeclarationStatement() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:329:5: ( localVariableDeclaration )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:329:7: localVariableDeclaration
            {
            pushFollow(FOLLOW_localVariableDeclaration_in_localVariableDeclarationStatement1234);
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:332:1: localVariableDeclaration : ^( VARDECL variableDeclarator ) ;
    public final void localVariableDeclaration() throws RecognitionException {
        JaWalker.variableDeclarator_return variableDeclarator17 = null;


        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:333:5: ( ^( VARDECL variableDeclarator ) )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:333:7: ^( VARDECL variableDeclarator )
            {
            match(input,VARDECL,FOLLOW_VARDECL_in_localVariableDeclaration1252); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_variableDeclarator_in_localVariableDeclaration1254);
            variableDeclarator17=variableDeclarator();

            state._fsp--;


            match(input, Token.UP, null); 
             addVariableToScope((variableDeclarator17!=null?variableDeclarator17.id:null), (variableDeclarator17!=null?variableDeclarator17.t:null)); 

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:338:1: statement : ( ^( BLOCK block ) | ^( IF ^( CONDITION expression ) ^( THEN statement ) ( elseStmt )? ) | ^( FOR ( ^( INIT forInit ) )? ( ^( CONDITION expression ) )? ( ^( UPDATE forUpdate ) )? statement ) | ^( WHILE ^( CONDITION expression ) statement ) | ^( DOWHILE ^( CONDITION expression ) statement ) | ^( RETURN ( expression )? ) | ^( STMT statementExpression ) );
    public final void statement() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:339:5: ( ^( BLOCK block ) | ^( IF ^( CONDITION expression ) ^( THEN statement ) ( elseStmt )? ) | ^( FOR ( ^( INIT forInit ) )? ( ^( CONDITION expression ) )? ( ^( UPDATE forUpdate ) )? statement ) | ^( WHILE ^( CONDITION expression ) statement ) | ^( DOWHILE ^( CONDITION expression ) statement ) | ^( RETURN ( expression )? ) | ^( STMT statementExpression ) )
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
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:339:9: ^( BLOCK block )
                    {
                    match(input,BLOCK,FOLLOW_BLOCK_in_statement1291); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_block_in_statement1293);
                        block();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:340:9: ^( IF ^( CONDITION expression ) ^( THEN statement ) ( elseStmt )? )
                    {
                    match(input,IF,FOLLOW_IF_in_statement1305); 

                    match(input, Token.DOWN, null); 
                    match(input,CONDITION,FOLLOW_CONDITION_in_statement1308); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_statement1310);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    match(input,THEN,FOLLOW_THEN_in_statement1314); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_statement_in_statement1316);
                    statement();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:340:56: ( elseStmt )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==ELSE) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:340:56: elseStmt
                            {
                            pushFollow(FOLLOW_elseStmt_in_statement1319);
                            elseStmt();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:341:9: ^( FOR ( ^( INIT forInit ) )? ( ^( CONDITION expression ) )? ( ^( UPDATE forUpdate ) )? statement )
                    {
                    match(input,FOR,FOLLOW_FOR_in_statement1332); 

                    match(input, Token.DOWN, null); 
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:341:15: ( ^( INIT forInit ) )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==INIT) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:341:16: ^( INIT forInit )
                            {
                            match(input,INIT,FOLLOW_INIT_in_statement1336); 

                            match(input, Token.DOWN, null); 
                            pushFollow(FOLLOW_forInit_in_statement1338);
                            forInit();

                            state._fsp--;


                            match(input, Token.UP, null); 

                            }
                            break;

                    }

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:341:34: ( ^( CONDITION expression ) )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==CONDITION) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:341:35: ^( CONDITION expression )
                            {
                            match(input,CONDITION,FOLLOW_CONDITION_in_statement1345); 

                            match(input, Token.DOWN, null); 
                            pushFollow(FOLLOW_expression_in_statement1347);
                            expression();

                            state._fsp--;


                            match(input, Token.UP, null); 

                            }
                            break;

                    }

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:341:61: ( ^( UPDATE forUpdate ) )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==UPDATE) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:341:62: ^( UPDATE forUpdate )
                            {
                            match(input,UPDATE,FOLLOW_UPDATE_in_statement1354); 

                            match(input, Token.DOWN, null); 
                            pushFollow(FOLLOW_forUpdate_in_statement1356);
                            forUpdate();

                            state._fsp--;


                            match(input, Token.UP, null); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_statement_in_statement1361);
                    statement();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:342:9: ^( WHILE ^( CONDITION expression ) statement )
                    {
                    match(input,WHILE,FOLLOW_WHILE_in_statement1374); 

                    match(input, Token.DOWN, null); 
                    match(input,CONDITION,FOLLOW_CONDITION_in_statement1377); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_statement1379);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    pushFollow(FOLLOW_statement_in_statement1382);
                    statement();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:343:9: ^( DOWHILE ^( CONDITION expression ) statement )
                    {
                    match(input,DOWHILE,FOLLOW_DOWHILE_in_statement1394); 

                    match(input, Token.DOWN, null); 
                    match(input,CONDITION,FOLLOW_CONDITION_in_statement1397); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_statement1399);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    pushFollow(FOLLOW_statement_in_statement1402);
                    statement();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:344:9: ^( RETURN ( expression )? )
                    {
                    match(input,RETURN,FOLLOW_RETURN_in_statement1414); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:344:18: ( expression )?
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==METHODCALL||(LA28_0>=FIELDACCESS && LA28_0<=DOTCLASS)||(LA28_0>=PREINC && LA28_0<=CAST)||LA28_0==IDENTIFIER||LA28_0==THIS||(LA28_0>=INTLITERAL && LA28_0<=NULLLITERAL)||(LA28_0>=INSTANCEOF && LA28_0<=NEW)||(LA28_0>=EQ && LA28_0<=SLASH)||(LA28_0>=98 && LA28_0<=102)||LA28_0==105) ) {
                            alt28=1;
                        }
                        switch (alt28) {
                            case 1 :
                                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:344:18: expression
                                {
                                pushFollow(FOLLOW_expression_in_statement1416);
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
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:345:9: ^( STMT statementExpression )
                    {
                    match(input,STMT,FOLLOW_STMT_in_statement1430); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_statementExpression_in_statement1432);
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:348:1: elseStmt : ^( ELSE statement ) ;
    public final void elseStmt() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:349:5: ( ^( ELSE statement ) )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:349:7: ^( ELSE statement )
            {
            match(input,ELSE,FOLLOW_ELSE_in_elseStmt1455); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_statement_in_elseStmt1457);
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:352:1: forInit : ( localVariableDeclaration | expressionList );
    public final void forInit() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:353:5: ( localVariableDeclaration | expressionList )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==VARDECL) ) {
                alt30=1;
            }
            else if ( (LA30_0==METHODCALL||(LA30_0>=FIELDACCESS && LA30_0<=DOTCLASS)||(LA30_0>=PREINC && LA30_0<=CAST)||LA30_0==IDENTIFIER||LA30_0==THIS||(LA30_0>=INTLITERAL && LA30_0<=NULLLITERAL)||(LA30_0>=INSTANCEOF && LA30_0<=NEW)||(LA30_0>=EQ && LA30_0<=SLASH)||(LA30_0>=98 && LA30_0<=102)||LA30_0==105) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:353:9: localVariableDeclaration
                    {
                    pushFollow(FOLLOW_localVariableDeclaration_in_forInit1477);
                    localVariableDeclaration();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:354:9: expressionList
                    {
                    pushFollow(FOLLOW_expressionList_in_forInit1487);
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:357:1: forUpdate : expressionList ;
    public final void forUpdate() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:358:5: ( expressionList )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:358:9: expressionList
            {
            pushFollow(FOLLOW_expressionList_in_forUpdate1506);
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:365:1: expressionList returns [ArrayList<Type> types] : ( expression )+ ;
    public final ArrayList<Type> expressionList() throws RecognitionException {
        ArrayList<Type> types = null;

        JaWalker.expression_return expression18 = null;



        	types = new ArrayList<Type>();

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:369:5: ( ( expression )+ )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:369:9: ( expression )+
            {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:369:9: ( expression )+
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
            	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:369:10: expression
            	    {
            	    pushFollow(FOLLOW_expression_in_expressionList1541);
            	    expression18=expression();

            	    state._fsp--;

            	     types.add((expression18!=null?expression18.t:null)); 

            	    }
            	    break;

            	default :
            	    if ( cnt31 >= 1 ) break loop31;
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:372:1: statementExpression : expression ;
    public final void statementExpression() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:373:5: ( expression )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:373:9: expression
            {
            pushFollow(FOLLOW_expression_in_statementExpression1564);
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:376:1: constantExpression : expression ;
    public final void constantExpression() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:377:5: ( expression )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:377:9: expression
            {
            pushFollow(FOLLOW_expression_in_constantExpression1587);
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

    public static class expression_return extends TreeRuleReturnScope {
        public Type t;
        public boolean b;
    };

    // $ANTLR start "expression"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:380:1: expression returns [Type t, boolean b] : ( ^( EQ e1= expression e2= expression ) | ^( PLUS e1= expression e2= expression ) | ^( MINUS e1= expression e2= expression ) | ^( STAR e1= expression e2= expression ) | ^( SLASH e1= expression e2= expression ) | ^(mod= '%' e1= expression e2= expression ) | ^(or= '||' e1= expression e2= expression ) | ^(and= '&&' e1= expression e2= expression ) | ^(eq= '==' e1= expression e2= expression ) | ^(nq= '!=' e1= expression e2= expression ) | ^( INSTANCEOF e= expression type ) | ^( COMPAREOP e1= expression e2= expression ) | ^(op= ( UNARYPLUS | UNARYMINUS | PREINC | PREDEC ) e= expression ) | ^(op= '!' e= expression ) | ^( CAST pt= primitiveType e= expression ) | ^( CAST npt= nonPrimitiveType e= expression ) | ^( NEW creator ) | ^(op= ( POSTINC | POSTDEC ) (sp= selector | sp= primary ) ) | selector | primary );
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
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:381:5: ( ^( EQ e1= expression e2= expression ) | ^( PLUS e1= expression e2= expression ) | ^( MINUS e1= expression e2= expression ) | ^( STAR e1= expression e2= expression ) | ^( SLASH e1= expression e2= expression ) | ^(mod= '%' e1= expression e2= expression ) | ^(or= '||' e1= expression e2= expression ) | ^(and= '&&' e1= expression e2= expression ) | ^(eq= '==' e1= expression e2= expression ) | ^(nq= '!=' e1= expression e2= expression ) | ^( INSTANCEOF e= expression type ) | ^( COMPAREOP e1= expression e2= expression ) | ^(op= ( UNARYPLUS | UNARYMINUS | PREINC | PREDEC ) e= expression ) | ^(op= '!' e= expression ) | ^( CAST pt= primitiveType e= expression ) | ^( CAST npt= nonPrimitiveType e= expression ) | ^( NEW creator ) | ^(op= ( POSTINC | POSTDEC ) (sp= selector | sp= primary ) ) | selector | primary )
            int alt33=20;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:381:9: ^( EQ e1= expression e2= expression )
                    {
                    EQ19=(CommonTree)match(input,EQ,FOLLOW_EQ_in_expression1615); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1619);
                    e1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1623);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
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
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:390:7: ^( PLUS e1= expression e2= expression )
                    {
                    PLUS20=(CommonTree)match(input,PLUS,FOLLOW_PLUS_in_expression1641); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1648);
                    e1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1652);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck((e1!=null?e1.t:null), (e2!=null?e2.t:null))) retval.t = plusOperation(PLUS20, (e1!=null?e1.t:null), (e2!=null?e2.t:null)); 

                    }
                    break;
                case 3 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:391:7: ^( MINUS e1= expression e2= expression )
                    {
                    MINUS21=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_expression1664); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1670);
                    e1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1674);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck((e1!=null?e1.t:null), (e2!=null?e2.t:null))) retval.t = arithmeticOperation(MINUS21, (e1!=null?e1.t:null), (e2!=null?e2.t:null)); 

                    }
                    break;
                case 4 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:392:7: ^( STAR e1= expression e2= expression )
                    {
                    STAR22=(CommonTree)match(input,STAR,FOLLOW_STAR_in_expression1686); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1693);
                    e1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1697);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck((e1!=null?e1.t:null), (e2!=null?e2.t:null))) retval.t = arithmeticOperation(STAR22,  (e1!=null?e1.t:null), (e2!=null?e2.t:null)); 

                    }
                    break;
                case 5 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:393:7: ^( SLASH e1= expression e2= expression )
                    {
                    SLASH23=(CommonTree)match(input,SLASH,FOLLOW_SLASH_in_expression1709); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1715);
                    e1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1719);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck((e1!=null?e1.t:null), (e2!=null?e2.t:null))) retval.t = arithmeticOperation(SLASH23, (e1!=null?e1.t:null), (e2!=null?e2.t:null)); 

                    }
                    break;
                case 6 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:394:9: ^(mod= '%' e1= expression e2= expression )
                    {
                    mod=(CommonTree)match(input,102,FOLLOW_102_in_expression1735); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1739);
                    e1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1743);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck((e1!=null?e1.t:null), (e2!=null?e2.t:null))) retval.t = arithmeticOperation(mod,   (e1!=null?e1.t:null), (e2!=null?e2.t:null)); 

                    }
                    break;
                case 7 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:395:9: ^(or= '||' e1= expression e2= expression )
                    {
                    or=(CommonTree)match(input,98,FOLLOW_98_in_expression1759); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1764);
                    e1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1768);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck((e1!=null?e1.t:null), (e2!=null?e2.t:null))) retval.t = booleanOperation(or,  (e1!=null?e1.t:null), (e2!=null?e2.t:null)); 

                    }
                    break;
                case 8 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:396:9: ^(and= '&&' e1= expression e2= expression )
                    {
                    and=(CommonTree)match(input,99,FOLLOW_99_in_expression1784); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1788);
                    e1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1792);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck((e1!=null?e1.t:null), (e2!=null?e2.t:null))) retval.t = booleanOperation(and, (e1!=null?e1.t:null), (e2!=null?e2.t:null)); 

                    }
                    break;
                case 9 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:397:9: ^(eq= '==' e1= expression e2= expression )
                    {
                    eq=(CommonTree)match(input,100,FOLLOW_100_in_expression1808); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1813);
                    e1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1817);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck((e1!=null?e1.t:null), (e2!=null?e2.t:null))) retval.t = booleanOperation(eq,  (e1!=null?e1.t:null), (e2!=null?e2.t:null)); 

                    }
                    break;
                case 10 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:398:9: ^(nq= '!=' e1= expression e2= expression )
                    {
                    nq=(CommonTree)match(input,101,FOLLOW_101_in_expression1833); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1838);
                    e1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1842);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck((e1!=null?e1.t:null), (e2!=null?e2.t:null))) retval.t = booleanOperation(nq,  (e1!=null?e1.t:null), (e2!=null?e2.t:null)); 

                    }
                    break;
                case 11 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:399:7: ^( INSTANCEOF e= expression type )
                    {
                    INSTANCEOF25=(CommonTree)match(input,INSTANCEOF,FOLLOW_INSTANCEOF_in_expression1854); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1858);
                    e=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_type_in_expression1860);
                    type24=type();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck((e!=null?e.t:null), type24)) { 
                    	          if ( !((e!=null?e.t:null).isComplexType() || (e!=null?e.t:null).isNull()) ) errorLog.add(new UnexpectedTypeException("reference", (e!=null?e.t:null).toString(), (INSTANCEOF25!=null?INSTANCEOF25.getLine():0), (INSTANCEOF25!=null?INSTANCEOF25.getCharPositionInLine():0), rt));
                    	          if (!type24.isComplexType()) errorLog.add(new UnexpectedTypeException("class or array", type24.toString(), (INSTANCEOF25!=null?INSTANCEOF25.getLine():0), (INSTANCEOF25!=null?INSTANCEOF25.getCharPositionInLine():0), rt));
                    	          if (!(e!=null?e.t:null).isCastableTo(type24)) errorLog.add(new InconvertibleTypesException(type24.toString(), (e!=null?e.t:null).toString(), (INSTANCEOF25!=null?INSTANCEOF25.getLine():0), (INSTANCEOF25!=null?INSTANCEOF25.getCharPositionInLine():0), rt));
                    	          retval.t = BasicType.BOOLEAN;
                              } 
                            

                    }
                    break;
                case 12 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:407:7: ^( COMPAREOP e1= expression e2= expression )
                    {
                    COMPAREOP26=(CommonTree)match(input,COMPAREOP,FOLLOW_COMPAREOP_in_expression1880); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1884);
                    e1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1888);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck((e1!=null?e1.t:null), (e2!=null?e2.t:null))) { 
                    	    	  if ( !((e1!=null?e1.t:null).isNumeric() && (e2!=null?e2.t:null).isNumeric()) ) errorLog.add(new CannotBeAppliedToException((COMPAREOP26!=null?COMPAREOP26.getText():null), (e1!=null?e1.t:null).toString(), (e2!=null?e2.t:null).toString(), (COMPAREOP26!=null?COMPAREOP26.getLine():0), (COMPAREOP26!=null?COMPAREOP26.getCharPositionInLine():0), rt));
                    	    	  retval.t = BasicType.BOOLEAN;
                        	  } 
                        	

                    }
                    break;
                case 13 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:413:9: ^(op= ( UNARYPLUS | UNARYMINUS | PREINC | PREDEC ) e= expression )
                    {
                    op=(CommonTree)input.LT(1);
                    if ( input.LA(1)==PREINC||input.LA(1)==PREDEC||(input.LA(1)>=UNARYPLUS && input.LA(1)<=UNARYMINUS) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1926);
                    e=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck((e!=null?e.t:null))) { 
                    	          if (!(e!=null?e.t:null).isNumeric()) errorLog.add(new CannotBeAppliedToException((op!=null?op.getText():null), (e!=null?e.t:null).toString(), "", (op!=null?op.getLine():0), (op!=null?op.getCharPositionInLine():0), rt));
                    	    	  retval.t = (e!=null?e.t:null);
                        	  }
                        	

                    }
                    break;
                case 14 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:422:7: ^(op= '!' e= expression )
                    {
                    op=(CommonTree)match(input,105,FOLLOW_105_in_expression1964); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1968);
                    e=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck((e!=null?e.t:null))) {
                    	    	  if (!((e!=null?e.t:null) == BasicType.BOOLEAN)) errorLog.add(new CannotBeAppliedToException((op!=null?op.getText():null), (e!=null?e.t:null).toString(), "", (op!=null?op.getLine():0), (op!=null?op.getCharPositionInLine():0), rt));
                    	    	  retval.t = BasicType.BOOLEAN;
                        	  }
                        	

                    }
                    break;
                case 15 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:428:9: ^( CAST pt= primitiveType e= expression )
                    {
                    CAST27=(CommonTree)match(input,CAST,FOLLOW_CAST_in_expression1987); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_primitiveType_in_expression1991);
                    pt=primitiveType();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1995);
                    e=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck(pt, (e!=null?e.t:null))) {
                    	    	  if (!(e!=null?e.t:null).isCastableTo(pt)) errorLog.add(new InconvertibleTypesException(pt.toString(), (e!=null?e.t:null).toString(), (CAST27!=null?CAST27.getLine():0), (CAST27!=null?CAST27.getCharPositionInLine():0), rt));
                    	    	  retval.t = pt;
                        	  }
                        	

                    }
                    break;
                case 16 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:434:9: ^( CAST npt= nonPrimitiveType e= expression )
                    {
                    CAST28=(CommonTree)match(input,CAST,FOLLOW_CAST_in_expression2014); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_nonPrimitiveType_in_expression2018);
                    npt=nonPrimitiveType();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression2022);
                    e=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if(ruleTypeCheck(npt, (e!=null?e.t:null))) {
                    	    	  if (!(e!=null?e.t:null).isCastableTo(npt)) errorLog.add(new InconvertibleTypesException(npt.toString(), (e!=null?e.t:null).toString(), (CAST28!=null?CAST28.getLine():0), (CAST28!=null?CAST28.getCharPositionInLine():0), rt));
                    	    	  retval.t = npt;
                        	  }
                        	

                    }
                    break;
                case 17 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:440:9: ^( NEW creator )
                    {
                    match(input,NEW,FOLLOW_NEW_in_expression2041); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_creator_in_expression2043);
                    creator29=creator();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     retval.t = creator29; 

                    }
                    break;
                case 18 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:441:7: ^(op= ( POSTINC | POSTDEC ) (sp= selector | sp= primary ) )
                    {
                    op=(CommonTree)input.LT(1);
                    if ( input.LA(1)==POSTINC||input.LA(1)==POSTDEC ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input, Token.DOWN, null); 
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:441:32: (sp= selector | sp= primary )
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
                            else if ( (LA32_6==METHODCALL||(LA32_6>=FIELDACCESS && LA32_6<=DOTCLASS)||(LA32_6>=PREINC && LA32_6<=CAST)||LA32_6==IDENTIFIER||LA32_6==THIS||(LA32_6>=INTLITERAL && LA32_6<=NULLLITERAL)||(LA32_6>=INSTANCEOF && LA32_6<=NEW)||(LA32_6>=EQ && LA32_6<=SLASH)||(LA32_6>=98 && LA32_6<=102)||LA32_6==105) ) {
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
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 0, input);

                        throw nvae;
                    }

                    switch (alt32) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:441:33: sp= selector
                            {
                            pushFollow(FOLLOW_selector_in_expression2068);
                            sp=selector();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:441:47: sp= primary
                            {
                            pushFollow(FOLLOW_primary_in_expression2074);
                            sp=primary();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                     if (!sp.isNumeric()) {
                        	  	throw new CannotBeAppliedToException((op!=null?op.getText():null), sp.toString(), "", (op!=null?op.getLine():0), (op!=null?op.getCharPositionInLine():0), rt);
                        	  }
                        	  retval.t = sp;
                        	

                    }
                    break;
                case 19 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:448:9: selector
                    {
                    pushFollow(FOLLOW_selector_in_expression2099);
                    selector30=selector();

                    state._fsp--;

                     retval.t = selector30; 

                    }
                    break;
                case 20 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:449:9: primary
                    {
                    pushFollow(FOLLOW_primary_in_expression2111);
                    primary31=primary();

                    state._fsp--;

                     retval.t = primary31; 

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:452:1: primary returns [Type t] : ( THIS | superMemberAccess | literal | IDENTIFIER | ^( DOTCLASS ^( ARRAYTYPE type ) ) | ^( DOTCLASS IDENTIFIER ) | ^( DOTCLASS primitiveType ) | ^( DOTCLASS VOID ) );
    public final Type primary() throws RecognitionException {
        Type t = null;

        CommonTree IDENTIFIER34=null;
        Type superMemberAccess32 = null;

        Type literal33 = null;


        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:454:5: ( THIS | superMemberAccess | literal | IDENTIFIER | ^( DOTCLASS ^( ARRAYTYPE type ) ) | ^( DOTCLASS IDENTIFIER ) | ^( DOTCLASS primitiveType ) | ^( DOTCLASS VOID ) )
            int alt34=8;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:454:7: THIS
                    {
                    match(input,THIS,FOLLOW_THIS_in_primary2152); 
                     t = rt; 

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:455:9: superMemberAccess
                    {
                    pushFollow(FOLLOW_superMemberAccess_in_primary2164);
                    superMemberAccess32=superMemberAccess();

                    state._fsp--;

                     t = superMemberAccess32; 

                    }
                    break;
                case 3 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:456:9: literal
                    {
                    pushFollow(FOLLOW_literal_in_primary2176);
                    literal33=literal();

                    state._fsp--;

                     t = literal33; 

                    }
                    break;
                case 4 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:457:9: IDENTIFIER
                    {
                    IDENTIFIER34=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary2188); 
                     t = getVariableType((IDENTIFIER34!=null?IDENTIFIER34.getText():null)); 
                        		     if (t == null) errorLog.add(new CannotFindSymbolException(("variable " + (IDENTIFIER34!=null?IDENTIFIER34.getText():null)), getMethodSignature(), (IDENTIFIER34!=null?IDENTIFIER34.getLine():0), (IDENTIFIER34!=null?IDENTIFIER34.getCharPositionInLine():0), rt));
                        		   

                    }
                    break;
                case 5 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:461:9: ^( DOTCLASS ^( ARRAYTYPE type ) )
                    {
                    match(input,DOTCLASS,FOLLOW_DOTCLASS_in_primary2206); 

                    match(input, Token.DOWN, null); 
                    match(input,ARRAYTYPE,FOLLOW_ARRAYTYPE_in_primary2209); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_in_primary2211);
                    type();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 
                     t = ReferenceType.CLASS; 

                    }
                    break;
                case 6 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:462:7: ^( DOTCLASS IDENTIFIER )
                    {
                    match(input,DOTCLASS,FOLLOW_DOTCLASS_in_primary2226); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary2228); 

                    match(input, Token.UP, null); 
                     t = ReferenceType.CLASS; 

                    }
                    break;
                case 7 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:463:9: ^( DOTCLASS primitiveType )
                    {
                    match(input,DOTCLASS,FOLLOW_DOTCLASS_in_primary2249); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_primitiveType_in_primary2251);
                    primitiveType();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     t = ReferenceType.CLASS; 

                    }
                    break;
                case 8 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:464:9: ^( DOTCLASS VOID )
                    {
                    match(input,DOTCLASS,FOLLOW_DOTCLASS_in_primary2269); 

                    match(input, Token.DOWN, null); 
                    match(input,VOID,FOLLOW_VOID_in_primary2271); 

                    match(input, Token.UP, null); 
                     t = ReferenceType.CLASS; 

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:467:1: selector returns [Type t] : ( ^( FIELDACCESS expression IDENTIFIER ) | ^( METHODCALL expression IDENTIFIER ( arguments )? ) | ^( ARRAYACCESS e1= expression e2= expression ) );
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
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:468:5: ( ^( FIELDACCESS expression IDENTIFIER ) | ^( METHODCALL expression IDENTIFIER ( arguments )? ) | ^( ARRAYACCESS e1= expression e2= expression ) )
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
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:468:9: ^( FIELDACCESS expression IDENTIFIER )
                    {
                    match(input,FIELDACCESS,FOLLOW_FIELDACCESS_in_selector2315); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_selector2317);
                    expression35=expression();

                    state._fsp--;

                    IDENTIFIER36=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_selector2319); 

                    match(input, Token.UP, null); 
                     if(ruleTypeCheck((expression35!=null?expression35.t:null))) {
                    	    	  if (!(expression35!=null?expression35.t:null).isReference())
                    	    	  	errorLog.add(new CannotBeDereferencedException((expression35!=null?expression35.t:null), (IDENTIFIER36!=null?IDENTIFIER36.getLine():0), (IDENTIFIER36!=null?IDENTIFIER36.getCharPositionInLine():0), rt)); 
                    	    	  ReferenceType expt = (ReferenceType)(expression35!=null?expression35.t:null);
                    	    	  boolean isSameClass = (expt.getName() == rt.getName()); 
                    	    	  t = expt.getField(isSameClass, (IDENTIFIER36!=null?IDENTIFIER36.getText():null));
                    		  if (t == null) errorLog.add(new CannotFindSymbolException(("field " + (IDENTIFIER36!=null?IDENTIFIER36.getText():null)), expt.getName(), (IDENTIFIER36!=null?IDENTIFIER36.getLine():0), (IDENTIFIER36!=null?IDENTIFIER36.getCharPositionInLine():0), rt));
                        	  }
                        	

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:478:7: ^( METHODCALL expression IDENTIFIER ( arguments )? )
                    {
                    match(input,METHODCALL,FOLLOW_METHODCALL_in_selector2338); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_selector2340);
                    expression37=expression();

                    state._fsp--;

                    IDENTIFIER39=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_selector2342); 
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:478:42: ( arguments )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==ARGUMENTS) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:478:42: arguments
                            {
                            pushFollow(FOLLOW_arguments_in_selector2344);
                            arguments38=arguments();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
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
                    break;
                case 3 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:493:9: ^( ARRAYACCESS e1= expression e2= expression )
                    {
                    ARRAYACCESS40=(CommonTree)match(input,ARRAYACCESS,FOLLOW_ARRAYACCESS_in_selector2367); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_selector2371);
                    e1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_selector2375);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     if (ruleTypeCheck((e1!=null?e1.t:null), (e2!=null?e2.t:null))) {
                    	    	  if (!(e1!=null?e1.t:null).isArray()) errorLog.add(new ArrayRequiredException((e1!=null?e1.t:null).toString(), (ARRAYACCESS40!=null?ARRAYACCESS40.getLine():0), (ARRAYACCESS40!=null?ARRAYACCESS40.getCharPositionInLine():0), rt));
                    	    	  arrayExprCheck(ARRAYACCESS40, (e2!=null?e2.t:null));
                    	    	  t = ((ArrayType)(e1!=null?e1.t:null)).getHostType(); 
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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:502:1: creator returns [Type t] : ( arrayCreatorRest | createdName ( classCreatorRest )? );
    public final Type creator() throws RecognitionException {
        Type t = null;

        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:503:5: ( arrayCreatorRest | createdName ( classCreatorRest )? )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==ARRAYTYPE) ) {
                alt38=1;
            }
            else if ( (LA38_0==IDENTIFIER||(LA38_0>=CHAR && LA38_0<=BOOLEAN)) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:503:10: arrayCreatorRest
                    {
                    pushFollow(FOLLOW_arrayCreatorRest_in_creator2408);
                    arrayCreatorRest();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:504:10: createdName ( classCreatorRest )?
                    {
                    pushFollow(FOLLOW_createdName_in_creator2420);
                    createdName();

                    state._fsp--;

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:504:22: ( classCreatorRest )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==ARGUMENTS) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:504:22: classCreatorRest
                            {
                            pushFollow(FOLLOW_classCreatorRest_in_creator2422);
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
        return t;
    }
    // $ANTLR end "creator"


    // $ANTLR start "createdName"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:508:1: createdName returns [Type t] : ( classType | primitiveType );
    public final Type createdName() throws RecognitionException {
        Type t = null;

        ReferenceType classType41 = null;

        BasicType primitiveType42 = null;


        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:509:5: ( classType | primitiveType )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==IDENTIFIER) ) {
                alt39=1;
            }
            else if ( ((LA39_0>=CHAR && LA39_0<=BOOLEAN)) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:509:9: classType
                    {
                    pushFollow(FOLLOW_classType_in_createdName2448);
                    classType41=classType();

                    state._fsp--;

                     t = classType41;      

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:510:9: primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_createdName2464);
                    primitiveType42=primitiveType();

                    state._fsp--;

                     t = primitiveType42; 

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:513:1: arrayCreatorRest returns [Type t] : ( ^( ARRAYTYPE acr= arrayCreatorRest (e= expression )? ) ( arrayInitializer[$acr.t] )? | ^( ARRAYTYPE cn= createdName (e= expression )? ) );
    public final Type arrayCreatorRest() throws RecognitionException {
        Type t = null;

        CommonTree ARRAYTYPE43=null;
        CommonTree ARRAYTYPE44=null;
        Type acr = null;

        JaWalker.expression_return e = null;

        Type cn = null;


        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:514:5: ( ^( ARRAYTYPE acr= arrayCreatorRest (e= expression )? ) ( arrayInitializer[$acr.t] )? | ^( ARRAYTYPE cn= createdName (e= expression )? ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==ARRAYTYPE) ) {
                int LA43_1 = input.LA(2);

                if ( (LA43_1==DOWN) ) {
                    int LA43_2 = input.LA(3);

                    if ( (LA43_2==ARRAYTYPE) ) {
                        alt43=1;
                    }
                    else if ( (LA43_2==IDENTIFIER||(LA43_2>=CHAR && LA43_2<=BOOLEAN)) ) {
                        alt43=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:514:9: ^( ARRAYTYPE acr= arrayCreatorRest (e= expression )? ) ( arrayInitializer[$acr.t] )?
                    {
                    ARRAYTYPE43=(CommonTree)match(input,ARRAYTYPE,FOLLOW_ARRAYTYPE_in_arrayCreatorRest2494); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_arrayCreatorRest_in_arrayCreatorRest2498);
                    acr=arrayCreatorRest();

                    state._fsp--;

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:514:43: (e= expression )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==METHODCALL||(LA40_0>=FIELDACCESS && LA40_0<=DOTCLASS)||(LA40_0>=PREINC && LA40_0<=CAST)||LA40_0==IDENTIFIER||LA40_0==THIS||(LA40_0>=INTLITERAL && LA40_0<=NULLLITERAL)||(LA40_0>=INSTANCEOF && LA40_0<=NEW)||(LA40_0>=EQ && LA40_0<=SLASH)||(LA40_0>=98 && LA40_0<=102)||LA40_0==105) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:514:43: e= expression
                            {
                            pushFollow(FOLLOW_expression_in_arrayCreatorRest2502);
                            e=expression();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:514:57: ( arrayInitializer[$acr.t] )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==ARRAYINIT) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:514:57: arrayInitializer[$acr.t]
                            {
                            pushFollow(FOLLOW_arrayInitializer_in_arrayCreatorRest2506);
                            arrayInitializer(acr);

                            state._fsp--;


                            }
                            break;

                    }

                      System.out.println("arrayCreatorRest ->>" + (e!=null?e.t:null)); 
                        	  if (ruleTypeCheck(acr)) t = (ComplexType)ParserHelper.createArrayType(acr, 1); 
                        	  if (ruleTypeCheck((e!=null?e.t:null))) arrayExprCheck(ARRAYTYPE43, (e!=null?e.t:null));
                        	

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:519:7: ^( ARRAYTYPE cn= createdName (e= expression )? )
                    {
                    ARRAYTYPE44=(CommonTree)match(input,ARRAYTYPE,FOLLOW_ARRAYTYPE_in_arrayCreatorRest2524); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_createdName_in_arrayCreatorRest2528);
                    cn=createdName();

                    state._fsp--;

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:519:35: (e= expression )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==METHODCALL||(LA42_0>=FIELDACCESS && LA42_0<=DOTCLASS)||(LA42_0>=PREINC && LA42_0<=CAST)||LA42_0==IDENTIFIER||LA42_0==THIS||(LA42_0>=INTLITERAL && LA42_0<=NULLLITERAL)||(LA42_0>=INSTANCEOF && LA42_0<=NEW)||(LA42_0>=EQ && LA42_0<=SLASH)||(LA42_0>=98 && LA42_0<=102)||LA42_0==105) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:519:35: e= expression
                            {
                            pushFollow(FOLLOW_expression_in_arrayCreatorRest2532);
                            e=expression();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                     if (ruleTypeCheck(cn)) 
                    	    	  t = (ComplexType)ParserHelper.createArrayType(cn, 1);
                    	  if (ruleTypeCheck((e!=null?e.t:null))) arrayExprCheck(ARRAYTYPE44, (e!=null?e.t:null));	  
                        	

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


    // $ANTLR start "classCreatorRest"
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:526:1: classCreatorRest returns [ArrayList<Type> types] : arguments ;
    public final ArrayList<Type> classCreatorRest() throws RecognitionException {
        ArrayList<Type> types = null;

        JaWalker.arguments_return arguments45 = null;


        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:527:5: ( arguments )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:527:9: arguments
            {
            pushFollow(FOLLOW_arguments_in_classCreatorRest2565);
            arguments45=arguments();

            state._fsp--;

             types = (arguments45!=null?arguments45.types:null); 

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:530:1: superMemberAccess returns [Type t] : ( ^( METHODCALL SUPER IDENTIFIER ( arguments )? ) | ^( FIELDACCESS SUPER IDENTIFIER ) );
    public final Type superMemberAccess() throws RecognitionException {
        Type t = null;

        CommonTree IDENTIFIER47=null;
        CommonTree IDENTIFIER48=null;
        JaWalker.arguments_return arguments46 = null;


        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:531:5: ( ^( METHODCALL SUPER IDENTIFIER ( arguments )? ) | ^( FIELDACCESS SUPER IDENTIFIER ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==METHODCALL) ) {
                alt45=1;
            }
            else if ( (LA45_0==FIELDACCESS) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:531:7: ^( METHODCALL SUPER IDENTIFIER ( arguments )? )
                    {
                    match(input,METHODCALL,FOLLOW_METHODCALL_in_superMemberAccess2597); 

                    match(input, Token.DOWN, null); 
                    match(input,SUPER,FOLLOW_SUPER_in_superMemberAccess2599); 
                    IDENTIFIER47=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_superMemberAccess2601); 
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:531:37: ( arguments )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==ARGUMENTS) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:531:37: arguments
                            {
                            pushFollow(FOLLOW_arguments_in_superMemberAccess2603);
                            arguments46=arguments();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                     if( (arguments46!=null?arguments46.types:null) == null || ruleTypeCheck((Type[])(arguments46!=null?arguments46.types:null).toArray()) ) {
                    	    	  try {
                    	          	t = rt.getSuperClass().bindMethod(false, (IDENTIFIER47!=null?IDENTIFIER47.getText():null), (arguments46!=null?arguments46.types:null));
                    		  } catch (EarlyBindingException ex) {
                    		   	errorLog.add(new CannotFindSymbolException(("method " + (IDENTIFIER47!=null?IDENTIFIER47.getText():null) + '(' + printArguments((arguments46!=null?arguments46.types:null)) + ')'), rt.getSuperClass().getName(), (IDENTIFIER47!=null?IDENTIFIER47.getLine():0), (IDENTIFIER47!=null?IDENTIFIER47.getCharPositionInLine():0), rt));
                    		  }
                    	  }
                        	

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:540:9: ^( FIELDACCESS SUPER IDENTIFIER )
                    {
                    match(input,FIELDACCESS,FOLLOW_FIELDACCESS_in_superMemberAccess2624); 

                    match(input, Token.DOWN, null); 
                    match(input,SUPER,FOLLOW_SUPER_in_superMemberAccess2626); 
                    IDENTIFIER48=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_superMemberAccess2628); 

                    match(input, Token.UP, null); 
                     t = rt.getSuperClass().getField(false, (IDENTIFIER48!=null?IDENTIFIER48.getText():null));
                    	  if (t == null) errorLog.add(new CannotFindSymbolException(("field " + (IDENTIFIER48!=null?IDENTIFIER48.getText():null)), rt.getSuperClass().getName(), (IDENTIFIER48!=null?IDENTIFIER48.getLine():0), (IDENTIFIER48!=null?IDENTIFIER48.getCharPositionInLine():0), rt)); 
                    	

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
    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:546:1: arguments returns [ArrayList<Type> types] : ^( ARGUMENTS expressionList ) ;
    public final JaWalker.arguments_return arguments() throws RecognitionException {
        JaWalker.arguments_return retval = new JaWalker.arguments_return();
        retval.start = input.LT(1);

        ArrayList<Type> expressionList49 = null;


        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:547:5: ( ^( ARGUMENTS expressionList ) )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/JaWalker.g:547:8: ^( ARGUMENTS expressionList )
            {
            match(input,ARGUMENTS,FOLLOW_ARGUMENTS_in_arguments2669); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expressionList_in_arguments2671);
            expressionList49=expressionList();

            state._fsp--;


            match(input, Token.UP, null); 
             retval.types = expressionList49; 

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

    // Delegated rules


    protected DFA33 dfa33 = new DFA33(this);
    protected DFA34 dfa34 = new DFA34(this);
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
            return "380:1: expression returns [Type t, boolean b] : ( ^( EQ e1= expression e2= expression ) | ^( PLUS e1= expression e2= expression ) | ^( MINUS e1= expression e2= expression ) | ^( STAR e1= expression e2= expression ) | ^( SLASH e1= expression e2= expression ) | ^(mod= '%' e1= expression e2= expression ) | ^(or= '||' e1= expression e2= expression ) | ^(and= '&&' e1= expression e2= expression ) | ^(eq= '==' e1= expression e2= expression ) | ^(nq= '!=' e1= expression e2= expression ) | ^( INSTANCEOF e= expression type ) | ^( COMPAREOP e1= expression e2= expression ) | ^(op= ( UNARYPLUS | UNARYMINUS | PREINC | PREDEC ) e= expression ) | ^(op= '!' e= expression ) | ^( CAST pt= primitiveType e= expression ) | ^( CAST npt= nonPrimitiveType e= expression ) | ^( NEW creator ) | ^(op= ( POSTINC | POSTDEC ) (sp= selector | sp= primary ) ) | selector | primary );";
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
            return "452:1: primary returns [Type t] : ( THIS | superMemberAccess | literal | IDENTIFIER | ^( DOTCLASS ^( ARRAYTYPE type ) ) | ^( DOTCLASS IDENTIFIER ) | ^( DOTCLASS primitiveType ) | ^( DOTCLASS VOID ) );";
        }
    }
 

    public static final BitSet FOLLOW_classDeclaration_in_compilationUnit61 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_in_classDeclaration86 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classDeclaration88 = new BitSet(new long[]{0x0000001000001C08L});
    public static final BitSet FOLLOW_classType_in_classDeclaration90 = new BitSet(new long[]{0x0000000000001C08L});
    public static final BitSet FOLLOW_classBody_in_classDeclaration93 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_classBodyDeclaration_in_classBody120 = new BitSet(new long[]{0x0000000000001C02L});
    public static final BitSet FOLLOW_memberDeclaration_in_classBodyDeclaration140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldDeclaration_in_memberDeclaration163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodAndConstructorDeclaration_in_memberDeclaration171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_METHOD_in_methodAndConstructorDeclaration210 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifier_in_methodAndConstructorDeclaration212 = new BitSet(new long[]{0x0001FE1000000200L});
    public static final BitSet FOLLOW_type_in_methodAndConstructorDeclaration214 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_methodDeclaration_in_methodAndConstructorDeclaration217 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_METHOD_in_methodAndConstructorDeclaration232 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifier_in_methodAndConstructorDeclaration234 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_VOID_in_methodAndConstructorDeclaration236 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_methodAndConstructorDeclaration238 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_voidMethodDeclaratorRest_in_methodAndConstructorDeclaration242 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONSTR_in_methodAndConstructorDeclaration257 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifier_in_methodAndConstructorDeclaration259 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_methodAndConstructorDeclaration261 = new BitSet(new long[]{0x0000000000042008L});
    public static final BitSet FOLLOW_formalParameters_in_methodAndConstructorDeclaration265 = new BitSet(new long[]{0x0000000000040008L});
    public static final BitSet FOLLOW_constructorBody_in_methodAndConstructorDeclaration268 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_methodDeclaration299 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_formalParameters_in_methodDeclaration303 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_methodBody_in_methodDeclaration306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIELD_in_fieldDeclaration326 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifier_in_fieldDeclaration328 = new BitSet(new long[]{0x0001FE1000000200L});
    public static final BitSet FOLLOW_variableDeclarator_in_fieldDeclaration330 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_formalParameters_in_voidMethodDeclaratorRest353 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_methodBody_in_voidMethodDeclaratorRest355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_variableDeclarator378 = new BitSet(new long[]{0x07FA0017F80001D2L,0x0000027C000F800EL});
    public static final BitSet FOLLOW_variableInitializer_in_variableDeclarator383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_variableDeclaratorId413 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_variableDeclaratorId415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayInitializer_in_variableInitializer446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_variableInitializer459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAYINIT_in_arrayInitializer487 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableInitializer_in_arrayInitializer491 = new BitSet(new long[]{0x07FA0017F80001D8L,0x0000027C000F800EL});
    public static final BitSet FOLLOW_variableInitializer_in_arrayInitializer496 = new BitSet(new long[]{0x07FA0017F80001D8L,0x0000027C000F800EL});
    public static final BitSet FOLLOW_set_in_modifier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonPrimitiveType_in_type567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_type577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAYTYPE_in_nonPrimitiveType605 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_nonPrimitiveType_in_nonPrimitiveType609 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_classType_in_nonPrimitiveType622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAYTYPE_in_nonPrimitiveType656 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primitiveType_in_nonPrimitiveType658 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classType689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_primitiveType714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BYTE_in_primitiveType729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHORT_in_primitiveType744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_primitiveType758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_in_primitiveType774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_primitiveType789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_primitiveType803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_primitiveType816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FPARMS_in_formalParameters842 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_formalParameterDecls_in_formalParameters844 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FPARM_in_formalParameterDecls869 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_formalParameterDecls871 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_formalParameterDecls_in_formalParameterDecls876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MBODY_in_methodBody902 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_methodBody904 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CBODY_in_constructorBody963 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_explicitConstructorInvocation_in_constructorBody965 = new BitSet(new long[]{0xB800000002380008L});
    public static final BitSet FOLLOW_blockStatement_in_constructorBody968 = new BitSet(new long[]{0xB800000002380008L});
    public static final BitSet FOLLOW_CONSTRCALL_in_explicitConstructorInvocation990 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_THIS_in_explicitConstructorInvocation992 = new BitSet(new long[]{0x0000000000004008L});
    public static final BitSet FOLLOW_arguments_in_explicitConstructorInvocation995 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONSTRCALL_in_explicitConstructorInvocation1006 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SUPER_in_explicitConstructorInvocation1008 = new BitSet(new long[]{0x0000000000004008L});
    public static final BitSet FOLLOW_arguments_in_explicitConstructorInvocation1010 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INTLITERAL_in_literal1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONGLITERAL_in_literal1051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOATLITERAL_in_literal1066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLELITERAL_in_literal1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARLITERAL_in_literal1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_literal1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_literal1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULLLITERAL_in_literal1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockStatement_in_block1175 = new BitSet(new long[]{0xB800000002380002L});
    public static final BitSet FOLLOW_localVariableDeclarationStatement_in_blockStatement1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_blockStatement1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localVariableDeclaration_in_localVariableDeclarationStatement1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARDECL_in_localVariableDeclaration1252 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableDeclarator_in_localVariableDeclaration1254 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLOCK_in_statement1291 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_statement1293 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_in_statement1305 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CONDITION_in_statement1308 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement1310 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_THEN_in_statement1314 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_statement1316 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_elseStmt_in_statement1319 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FOR_in_statement1332 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INIT_in_statement1336 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_forInit_in_statement1338 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONDITION_in_statement1345 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement1347 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UPDATE_in_statement1354 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_forUpdate_in_statement1356 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_statement_in_statement1361 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WHILE_in_statement1374 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CONDITION_in_statement1377 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement1379 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_statement_in_statement1382 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DOWHILE_in_statement1394 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CONDITION_in_statement1397 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement1399 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_statement_in_statement1402 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RETURN_in_statement1414 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement1416 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STMT_in_statement1430 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statementExpression_in_statement1432 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ELSE_in_elseStmt1455 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_elseStmt1457 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_localVariableDeclaration_in_forInit1477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionList_in_forInit1487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionList_in_forUpdate1506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionList1541 = new BitSet(new long[]{0x07FA0017F80001D2L,0x0000027C000F800EL});
    public static final BitSet FOLLOW_expression_in_statementExpression1564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_constantExpression1587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_expression1615 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1619 = new BitSet(new long[]{0x07FA0017F80001D0L,0x0000027C000F800EL});
    public static final BitSet FOLLOW_expression_in_expression1623 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_in_expression1641 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1648 = new BitSet(new long[]{0x07FA0017F80001D0L,0x0000027C000F800EL});
    public static final BitSet FOLLOW_expression_in_expression1652 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_expression1664 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1670 = new BitSet(new long[]{0x07FA0017F80001D0L,0x0000027C000F800EL});
    public static final BitSet FOLLOW_expression_in_expression1674 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STAR_in_expression1686 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1693 = new BitSet(new long[]{0x07FA0017F80001D0L,0x0000027C000F800EL});
    public static final BitSet FOLLOW_expression_in_expression1697 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SLASH_in_expression1709 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1715 = new BitSet(new long[]{0x07FA0017F80001D0L,0x0000027C000F800EL});
    public static final BitSet FOLLOW_expression_in_expression1719 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_102_in_expression1735 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1739 = new BitSet(new long[]{0x07FA0017F80001D0L,0x0000027C000F800EL});
    public static final BitSet FOLLOW_expression_in_expression1743 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_98_in_expression1759 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1764 = new BitSet(new long[]{0x07FA0017F80001D0L,0x0000027C000F800EL});
    public static final BitSet FOLLOW_expression_in_expression1768 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_99_in_expression1784 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1788 = new BitSet(new long[]{0x07FA0017F80001D0L,0x0000027C000F800EL});
    public static final BitSet FOLLOW_expression_in_expression1792 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_100_in_expression1808 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1813 = new BitSet(new long[]{0x07FA0017F80001D0L,0x0000027C000F800EL});
    public static final BitSet FOLLOW_expression_in_expression1817 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_101_in_expression1833 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1838 = new BitSet(new long[]{0x07FA0017F80001D0L,0x0000027C000F800EL});
    public static final BitSet FOLLOW_expression_in_expression1842 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INSTANCEOF_in_expression1854 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1858 = new BitSet(new long[]{0x0001FE1000000200L});
    public static final BitSet FOLLOW_type_in_expression1860 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COMPAREOP_in_expression1880 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1884 = new BitSet(new long[]{0x07FA0017F80001D0L,0x0000027C000F800EL});
    public static final BitSet FOLLOW_expression_in_expression1888 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_expression1910 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1926 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_105_in_expression1964 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1968 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CAST_in_expression1987 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primitiveType_in_expression1991 = new BitSet(new long[]{0x07FA0017F80001D0L,0x0000027C000F800EL});
    public static final BitSet FOLLOW_expression_in_expression1995 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CAST_in_expression2014 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_nonPrimitiveType_in_expression2018 = new BitSet(new long[]{0x07FA0017F80001D0L,0x0000027C000F800EL});
    public static final BitSet FOLLOW_expression_in_expression2022 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NEW_in_expression2041 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_creator_in_expression2043 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_expression2057 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_selector_in_expression2068 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_primary_in_expression2074 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_selector_in_expression2099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_in_expression2111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_primary2152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_superMemberAccess_in_primary2164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primary2176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_primary2188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOTCLASS_in_primary2206 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ARRAYTYPE_in_primary2209 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_primary2211 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DOTCLASS_in_primary2226 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_primary2228 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DOTCLASS_in_primary2249 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primitiveType_in_primary2251 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DOTCLASS_in_primary2269 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VOID_in_primary2271 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FIELDACCESS_in_selector2315 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_selector2317 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_selector2319 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_METHODCALL_in_selector2338 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_selector2340 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_selector2342 = new BitSet(new long[]{0x0000000000004008L});
    public static final BitSet FOLLOW_arguments_in_selector2344 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARRAYACCESS_in_selector2367 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_selector2371 = new BitSet(new long[]{0x07FA0017F80001D0L,0x0000027C000F800EL});
    public static final BitSet FOLLOW_expression_in_selector2375 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_arrayCreatorRest_in_creator2408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createdName_in_creator2420 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_classCreatorRest_in_creator2422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classType_in_createdName2448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_createdName2464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAYTYPE_in_arrayCreatorRest2494 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arrayCreatorRest_in_arrayCreatorRest2498 = new BitSet(new long[]{0x07FA0017F80001D8L,0x0000027C000F800EL});
    public static final BitSet FOLLOW_expression_in_arrayCreatorRest2502 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_arrayInitializer_in_arrayCreatorRest2506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAYTYPE_in_arrayCreatorRest2524 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_createdName_in_arrayCreatorRest2528 = new BitSet(new long[]{0x07FA0017F80001D8L,0x0000027C000F800EL});
    public static final BitSet FOLLOW_expression_in_arrayCreatorRest2532 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_arguments_in_classCreatorRest2565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_METHODCALL_in_superMemberAccess2597 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SUPER_in_superMemberAccess2599 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_superMemberAccess2601 = new BitSet(new long[]{0x0000000000004008L});
    public static final BitSet FOLLOW_arguments_in_superMemberAccess2603 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FIELDACCESS_in_superMemberAccess2624 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SUPER_in_superMemberAccess2626 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_superMemberAccess2628 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARGUMENTS_in_arguments2669 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expressionList_in_arguments2671 = new BitSet(new long[]{0x0000000000000008L});

}