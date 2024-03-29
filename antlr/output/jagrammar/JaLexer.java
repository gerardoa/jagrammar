// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g 2010-11-17 16:30:26

	package jagrammar;
	
	import jagrammar.util.ErrorLogger;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class JaLexer extends Lexer {
    public static final int STMT=21;
    public static final int CONSTR=12;
    public static final int MINUS=84;
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
    public static final int PREINC=28;
    public static final int T__96=96;
    public static final int MBODY=17;
    public static final int CBODY=18;
    public static final int STRINGLITERAL=59;
    public static final int CHARLITERAL=58;
    public static final int T__108=108;
    public static final int PLUS=83;
    public static final int ARRAYALLOC=36;
    public static final int EXTENDS=41;
    public static final int POSTDEC=31;
    public static final int UNARYPLUS=32;
    public static final int DOUBLELITERAL=57;
    public static final int SUPER=53;
    public static final int ARGUMENTS=14;
    public static final int T__89=89;
    public static final int LongSuffix=73;
    public static final int WS=79;
    public static final int CHAR=44;
    public static final int NEW=70;
    public static final int EQ=82;
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
    public static final int T__99=99;
    public static final int COMMENT=80;
    public static final int THIS=52;
    public static final int T__103=103;
    public static final int CLASS=39;
    public static final int RETURN=66;
    public static final int T__97=97;
    public static final int METHODCALL=4;
    public static final int BYTE=45;
    public static final int T__105=105;
    public static final int IF=62;
    public static final int FPARMS=13;
    public static final int EOF=-1;
    public static final int FOR=63;
    public static final int STAR=85;
    public static final int T__102=102;

    	private ErrorLogger errorLog = new ErrorLogger("DEBUG"); // permette il debug da ANTLRWORKS
    	
    	public void setErrorLogger(ErrorLogger el) {
        		this.errorLog = el;
        	}
        	
    	@Override
        	public void emitErrorMessage(String msg) {
    		errorLog.add("lexer reports: " + msg);
        	}


    // delegates
    // delegators

    public JaLexer() {;} 
    public JaLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public JaLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g"; }

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:25:7: ( ';' )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:25:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:26:7: ( '{' )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:26:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:27:7: ( '}' )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:27:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:28:7: ( ',' )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:28:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:29:7: ( '(' )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:29:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:30:7: ( ')' )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:30:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:31:7: ( '+=' )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:31:9: '+='
            {
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:32:7: ( '-=' )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:32:9: '-='
            {
            match("-="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:33:7: ( '*=' )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:33:9: '*='
            {
            match("*="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:34:7: ( '/=' )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:34:9: '/='
            {
            match("/="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:35:7: ( '||' )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:35:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:36:8: ( '&&' )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:36:10: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:37:8: ( '==' )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:37:10: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:38:8: ( '!=' )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:38:10: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:39:8: ( '%' )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:39:10: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:40:8: ( '++' )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:40:10: '++'
            {
            match("++"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:41:8: ( '--' )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:41:10: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:42:8: ( '!' )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:42:10: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:43:8: ( '.' )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:43:10: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:44:8: ( '[' )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:44:10: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:45:8: ( ']' )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:45:10: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "IntegerNumber"
    public final void mIntegerNumber() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:466:5: ( '0' | '1' .. '9' ( Digit )* )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='0') ) {
                alt2=1;
            }
            else if ( ((LA2_0>='1' && LA2_0<='9')) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:466:9: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:467:9: '1' .. '9' ( Digit )*
                    {
                    matchRange('1','9'); 
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:467:18: ( Digit )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:467:18: Digit
                    	    {
                    	    mDigit(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "IntegerNumber"

    // $ANTLR start "Digit"
    public final void mDigit() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:472:5: ( '0' .. '9' )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:472:7: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "Digit"

    // $ANTLR start "LongSuffix"
    public final void mLongSuffix() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:478:5: ( 'l' | 'L' )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "LongSuffix"

    // $ANTLR start "INTLITERAL"
    public final void mINTLITERAL() throws RecognitionException {
        try {
            int _type = INTLITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:482:5: ( IntegerNumber )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:482:9: IntegerNumber
            {
            mIntegerNumber(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTLITERAL"

    // $ANTLR start "LONGLITERAL"
    public final void mLONGLITERAL() throws RecognitionException {
        try {
            int _type = LONGLITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:486:5: ( IntegerNumber LongSuffix )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:486:9: IntegerNumber LongSuffix
            {
            mIntegerNumber(); 
            mLongSuffix(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LONGLITERAL"

    // $ANTLR start "FloatingPointLiteral"
    public final void mFloatingPointLiteral() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:491:5: ( ( Digit )+ '.' ( Digit )* ( Exponent )? | ( '.' )? ( Digit )+ ( Exponent )? )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:491:9: ( Digit )+ '.' ( Digit )* ( Exponent )?
                    {
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:491:9: ( Digit )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:491:9: Digit
                    	    {
                    	    mDigit(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);

                    match('.'); 
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:491:20: ( Digit )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:491:20: Digit
                    	    {
                    	    mDigit(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:491:27: ( Exponent )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='E'||LA5_0=='e') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:491:27: Exponent
                            {
                            mExponent(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:492:9: ( '.' )? ( Digit )+ ( Exponent )?
                    {
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:492:9: ( '.' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='.') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:492:10: '.'
                            {
                            match('.'); 

                            }
                            break;

                    }

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:492:16: ( Digit )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:492:16: Digit
                    	    {
                    	    mDigit(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);

                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:492:23: ( Exponent )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='E'||LA8_0=='e') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:492:23: Exponent
                            {
                            mExponent(); 

                            }
                            break;

                    }


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "FloatingPointLiteral"

    // $ANTLR start "Exponent"
    public final void mExponent() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:497:5: ( ( 'e' | 'E' ) ( '+' | '-' )? ( Digit )+ )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:497:9: ( 'e' | 'E' ) ( '+' | '-' )? ( Digit )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:497:23: ( '+' | '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='+'||LA10_0=='-') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:497:38: ( Digit )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:497:38: Digit
            	    {
            	    mDigit(); 

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "Exponent"

    // $ANTLR start "FloatSuffix"
    public final void mFloatSuffix() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:502:5: ( 'f' | 'F' )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "FloatSuffix"

    // $ANTLR start "DoubleSuffix"
    public final void mDoubleSuffix() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:507:5: ( 'd' | 'D' )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "DoubleSuffix"

    // $ANTLR start "FLOATLITERAL"
    public final void mFLOATLITERAL() throws RecognitionException {
        try {
            int _type = FLOATLITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:511:5: ( FloatingPointLiteral FloatSuffix )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:511:9: FloatingPointLiteral FloatSuffix
            {
            mFloatingPointLiteral(); 
            mFloatSuffix(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FLOATLITERAL"

    // $ANTLR start "DOUBLELITERAL"
    public final void mDOUBLELITERAL() throws RecognitionException {
        try {
            int _type = DOUBLELITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:515:5: ( FloatingPointLiteral ( DoubleSuffix )? )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:515:9: FloatingPointLiteral ( DoubleSuffix )?
            {
            mFloatingPointLiteral(); 
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:515:30: ( DoubleSuffix )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='D'||LA12_0=='d') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:515:30: DoubleSuffix
                    {
                    mDoubleSuffix(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOUBLELITERAL"

    // $ANTLR start "CHARLITERAL"
    public final void mCHARLITERAL() throws RecognitionException {
        try {
            int _type = CHARLITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:519:5: ( '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' | '\\r' | '\\n' ) ) '\\'' )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:519:9: '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' | '\\r' | '\\n' ) ) '\\''
            {
            match('\''); 
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:520:12: ( EscapeSequence | ~ ( '\\'' | '\\\\' | '\\r' | '\\n' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\\') ) {
                alt13=1;
            }
            else if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='[')||(LA13_0>=']' && LA13_0<='\uFFFF')) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:520:14: EscapeSequence
                    {
                    mEscapeSequence(); 

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:520:31: ~ ( '\\'' | '\\\\' | '\\r' | '\\n' )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CHARLITERAL"

    // $ANTLR start "STRINGLITERAL"
    public final void mSTRINGLITERAL() throws RecognitionException {
        try {
            int _type = STRINGLITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:525:5: ( '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' | '\\r' | '\\n' ) )* '\"' )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:525:9: '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' | '\\r' | '\\n' ) )* '\"'
            {
            match('\"'); 
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:526:9: ( EscapeSequence | ~ ( '\\\\' | '\"' | '\\r' | '\\n' ) )*
            loop14:
            do {
                int alt14=3;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='\\') ) {
                    alt14=1;
                }
                else if ( ((LA14_0>='\u0000' && LA14_0<='\t')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='!')||(LA14_0>='#' && LA14_0<='[')||(LA14_0>=']' && LA14_0<='\uFFFF')) ) {
                    alt14=2;
                }


                switch (alt14) {
            	case 1 :
            	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:526:11: EscapeSequence
            	    {
            	    mEscapeSequence(); 

            	    }
            	    break;
            	case 2 :
            	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:526:28: ~ ( '\\\\' | '\"' | '\\r' | '\\n' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRINGLITERAL"

    // $ANTLR start "EscapeSequence"
    public final void mEscapeSequence() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:532:5: ( '\\\\' ( 't' | 'n' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:532:9: '\\\\' ( 't' | 'n' | 'r' | '\\\"' | '\\'' | '\\\\' )
            {
            match('\\'); 
            if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "EscapeSequence"

    // $ANTLR start "BOOLEANLITERAL"
    public final void mBOOLEANLITERAL() throws RecognitionException {
        try {
            int _type = BOOLEANLITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:536:5: ( 'true' | 'false' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='t') ) {
                alt15=1;
            }
            else if ( (LA15_0=='f') ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:536:9: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:537:9: 'false'
                    {
                    match("false"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BOOLEANLITERAL"

    // $ANTLR start "NULLLITERAL"
    public final void mNULLLITERAL() throws RecognitionException {
        try {
            int _type = NULLLITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:541:5: ( 'null' )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:541:9: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NULLLITERAL"

    // $ANTLR start "BOOLEAN"
    public final void mBOOLEAN() throws RecognitionException {
        try {
            int _type = BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:545:5: ( 'boolean' )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:545:9: 'boolean'
            {
            match("boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BOOLEAN"

    // $ANTLR start "BYTE"
    public final void mBYTE() throws RecognitionException {
        try {
            int _type = BYTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:549:5: ( 'byte' )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:549:9: 'byte'
            {
            match("byte"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BYTE"

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            int _type = CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:553:5: ( 'char' )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:553:9: 'char'
            {
            match("char"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CHAR"

    // $ANTLR start "SHORT"
    public final void mSHORT() throws RecognitionException {
        try {
            int _type = SHORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:557:5: ( 'short' )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:557:9: 'short'
            {
            match("short"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SHORT"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:561:5: ( 'int' )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:561:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "LONG"
    public final void mLONG() throws RecognitionException {
        try {
            int _type = LONG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:565:5: ( 'long' )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:565:9: 'long'
            {
            match("long"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LONG"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:569:5: ( 'float' )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:569:9: 'float'
            {
            match("float"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "DOUBLE"
    public final void mDOUBLE() throws RecognitionException {
        try {
            int _type = DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:573:5: ( 'double' )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:573:9: 'double'
            {
            match("double"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOUBLE"

    // $ANTLR start "VOID"
    public final void mVOID() throws RecognitionException {
        try {
            int _type = VOID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:577:5: ( 'void' )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:577:9: 'void'
            {
            match("void"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VOID"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:581:5: ( ( ' ' | '\\r' | '\\t' | '\\n' ) )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:581:9: ( ' ' | '\\r' | '\\t' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:586:5: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:586:9: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:587:9: ( options {greedy=false; } : . )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0=='*') ) {
                    int LA16_1 = input.LA(2);

                    if ( (LA16_1=='/') ) {
                        alt16=2;
                    }
                    else if ( ((LA16_1>='\u0000' && LA16_1<='.')||(LA16_1>='0' && LA16_1<='\uFFFF')) ) {
                        alt16=1;
                    }


                }
                else if ( ((LA16_0>='\u0000' && LA16_0<=')')||(LA16_0>='+' && LA16_0<='\uFFFF')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:587:36: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            match("*/"); 

             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "LINE_COMMENT"
    public final void mLINE_COMMENT() throws RecognitionException {
        try {
            int _type = LINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:593:5: ( '//' (~ ( '\\n' | '\\r' ) )* )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:593:7: '//' (~ ( '\\n' | '\\r' ) )*
            {
            match("//"); 

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:593:12: (~ ( '\\n' | '\\r' ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\u0000' && LA17_0<='\t')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:593:12: ~ ( '\\n' | '\\r' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LINE_COMMENT"

    // $ANTLR start "CLASS"
    public final void mCLASS() throws RecognitionException {
        try {
            int _type = CLASS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:598:5: ( 'class' )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:598:9: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CLASS"

    // $ANTLR start "EXTENDS"
    public final void mEXTENDS() throws RecognitionException {
        try {
            int _type = EXTENDS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:602:5: ( 'extends' )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:602:9: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXTENDS"

    // $ANTLR start "FOR"
    public final void mFOR() throws RecognitionException {
        try {
            int _type = FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:606:5: ( 'for' )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:606:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FOR"

    // $ANTLR start "DO"
    public final void mDO() throws RecognitionException {
        try {
            int _type = DO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:610:5: ( 'do' )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:610:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DO"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:614:5: ( 'while' )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:614:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:618:5: ( 'if' )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:618:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:622:5: ( 'else' )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:622:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "INSTANCEOF"
    public final void mINSTANCEOF() throws RecognitionException {
        try {
            int _type = INSTANCEOF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:626:5: ( 'instanceof' )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:626:9: 'instanceof'
            {
            match("instanceof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INSTANCEOF"

    // $ANTLR start "NEW"
    public final void mNEW() throws RecognitionException {
        try {
            int _type = NEW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:630:5: ( 'new' )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:630:9: 'new'
            {
            match("new"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEW"

    // $ANTLR start "PRIVATE"
    public final void mPRIVATE() throws RecognitionException {
        try {
            int _type = PRIVATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:634:5: ( 'private' )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:634:9: 'private'
            {
            match("private"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PRIVATE"

    // $ANTLR start "PUBLIC"
    public final void mPUBLIC() throws RecognitionException {
        try {
            int _type = PUBLIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:638:5: ( 'public' )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:638:9: 'public'
            {
            match("public"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PUBLIC"

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:642:5: ( 'return' )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:642:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RETURN"

    // $ANTLR start "SUPER"
    public final void mSUPER() throws RecognitionException {
        try {
            int _type = SUPER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:646:5: ( 'super' )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:646:9: 'super'
            {
            match("super"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SUPER"

    // $ANTLR start "THIS"
    public final void mTHIS() throws RecognitionException {
        try {
            int _type = THIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:650:5: ( 'this' )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:650:9: 'this'
            {
            match("this"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THIS"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:654:5: ( '=' )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:654:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQ"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:658:5: ( '+' )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:658:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:662:5: ( '-' )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:662:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "STAR"
    public final void mSTAR() throws RecognitionException {
        try {
            int _type = STAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:666:5: ( '*' )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:666:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STAR"

    // $ANTLR start "SLASH"
    public final void mSLASH() throws RecognitionException {
        try {
            int _type = SLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:670:5: ( '/' )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:670:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SLASH"

    // $ANTLR start "COMPAREOP"
    public final void mCOMPAREOP() throws RecognitionException {
        try {
            int _type = COMPAREOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:674:5: ( '>' | '<' | '>=' | '<=' )
            int alt18=4;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='>') ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1=='=') ) {
                    alt18=3;
                }
                else {
                    alt18=1;}
            }
            else if ( (LA18_0=='<') ) {
                int LA18_2 = input.LA(2);

                if ( (LA18_2=='=') ) {
                    alt18=4;
                }
                else {
                    alt18=2;}
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:674:7: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 2 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:675:7: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 3 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:676:7: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 4 :
                    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:677:7: '<='
                    {
                    match("<="); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMPAREOP"

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:681:5: ( ( Letter | Currency | '_' ) ( Digit | Letter | Currency | '_' )* )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:681:7: ( Letter | Currency | '_' ) ( Digit | Letter | Currency | '_' )*
            {
            if ( input.LA(1)=='$'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:682:3: ( Digit | Letter | Currency | '_' )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0=='$'||(LA19_0>='0' && LA19_0<='9')||(LA19_0>='A' && LA19_0<='Z')||LA19_0=='_'||(LA19_0>='a' && LA19_0<='z')) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IDENTIFIER"

    // $ANTLR start "Letter"
    public final void mLetter() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:687:5: ( 'a' .. 'z' | 'A' .. 'Z' )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "Letter"

    // $ANTLR start "Currency"
    public final void mCurrency() throws RecognitionException {
        try {
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:693:5: ( '$' )
            // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:693:7: '$'
            {
            match('$'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "Currency"

    public void mTokens() throws RecognitionException {
        // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:1:8: ( T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | INTLITERAL | LONGLITERAL | FLOATLITERAL | DOUBLELITERAL | CHARLITERAL | STRINGLITERAL | BOOLEANLITERAL | NULLLITERAL | BOOLEAN | BYTE | CHAR | SHORT | INT | LONG | FLOAT | DOUBLE | VOID | WS | COMMENT | LINE_COMMENT | CLASS | EXTENDS | FOR | DO | WHILE | IF | ELSE | INSTANCEOF | NEW | PRIVATE | PUBLIC | RETURN | SUPER | THIS | EQ | PLUS | MINUS | STAR | SLASH | COMPAREOP | IDENTIFIER )
        int alt20=62;
        alt20 = dfa20.predict(input);
        switch (alt20) {
            case 1 :
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:1:10: T__89
                {
                mT__89(); 

                }
                break;
            case 2 :
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:1:16: T__90
                {
                mT__90(); 

                }
                break;
            case 3 :
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:1:22: T__91
                {
                mT__91(); 

                }
                break;
            case 4 :
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:1:28: T__92
                {
                mT__92(); 

                }
                break;
            case 5 :
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:1:34: T__93
                {
                mT__93(); 

                }
                break;
            case 6 :
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:1:40: T__94
                {
                mT__94(); 

                }
                break;
            case 7 :
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:1:46: T__95
                {
                mT__95(); 

                }
                break;
            case 8 :
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:1:52: T__96
                {
                mT__96(); 

                }
                break;
            case 9 :
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:1:58: T__97
                {
                mT__97(); 

                }
                break;
            case 10 :
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:1:64: T__98
                {
                mT__98(); 

                }
                break;
            case 11 :
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:1:70: T__99
                {
                mT__99(); 

                }
                break;
            case 12 :
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:1:76: T__100
                {
                mT__100(); 

                }
                break;
            case 13 :
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:1:83: T__101
                {
                mT__101(); 

                }
                break;
            case 14 :
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:1:90: T__102
                {
                mT__102(); 

                }
                break;
            case 15 :
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:1:97: T__103
                {
                mT__103(); 

                }
                break;
            case 16 :
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:1:104: T__104
                {
                mT__104(); 

                }
                break;
            case 17 :
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:1:111: T__105
                {
                mT__105(); 

                }
                break;
            case 18 :
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:1:118: T__106
                {
                mT__106(); 

                }
                break;
            case 19 :
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:1:125: T__107
                {
                mT__107(); 

                }
                break;
            case 20 :
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:1:132: T__108
                {
                mT__108(); 

                }
                break;
            case 21 :
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:1:139: T__109
                {
                mT__109(); 

                }
                break;
            case 22 :
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:1:146: INTLITERAL
                {
                mINTLITERAL(); 

                }
                break;
            case 23 :
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:1:157: LONGLITERAL
                {
                mLONGLITERAL(); 

                }
                break;
            case 24 :
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:1:169: FLOATLITERAL
                {
                mFLOATLITERAL(); 

                }
                break;
            case 25 :
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:1:182: DOUBLELITERAL
                {
                mDOUBLELITERAL(); 

                }
                break;
            case 26 :
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:1:196: CHARLITERAL
                {
                mCHARLITERAL(); 

                }
                break;
            case 27 :
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:1:208: STRINGLITERAL
                {
                mSTRINGLITERAL(); 

                }
                break;
            case 28 :
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:1:222: BOOLEANLITERAL
                {
                mBOOLEANLITERAL(); 

                }
                break;
            case 29 :
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:1:237: NULLLITERAL
                {
                mNULLLITERAL(); 

                }
                break;
            case 30 :
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:1:249: BOOLEAN
                {
                mBOOLEAN(); 

                }
                break;
            case 31 :
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:1:257: BYTE
                {
                mBYTE(); 

                }
                break;
            case 32 :
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:1:262: CHAR
                {
                mCHAR(); 

                }
                break;
            case 33 :
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:1:267: SHORT
                {
                mSHORT(); 

                }
                break;
            case 34 :
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:1:273: INT
                {
                mINT(); 

                }
                break;
            case 35 :
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:1:277: LONG
                {
                mLONG(); 

                }
                break;
            case 36 :
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:1:282: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 37 :
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:1:288: DOUBLE
                {
                mDOUBLE(); 

                }
                break;
            case 38 :
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:1:295: VOID
                {
                mVOID(); 

                }
                break;
            case 39 :
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:1:300: WS
                {
                mWS(); 

                }
                break;
            case 40 :
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:1:303: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 41 :
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:1:311: LINE_COMMENT
                {
                mLINE_COMMENT(); 

                }
                break;
            case 42 :
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:1:324: CLASS
                {
                mCLASS(); 

                }
                break;
            case 43 :
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:1:330: EXTENDS
                {
                mEXTENDS(); 

                }
                break;
            case 44 :
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:1:338: FOR
                {
                mFOR(); 

                }
                break;
            case 45 :
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:1:342: DO
                {
                mDO(); 

                }
                break;
            case 46 :
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:1:345: WHILE
                {
                mWHILE(); 

                }
                break;
            case 47 :
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:1:351: IF
                {
                mIF(); 

                }
                break;
            case 48 :
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:1:354: ELSE
                {
                mELSE(); 

                }
                break;
            case 49 :
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:1:359: INSTANCEOF
                {
                mINSTANCEOF(); 

                }
                break;
            case 50 :
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:1:370: NEW
                {
                mNEW(); 

                }
                break;
            case 51 :
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:1:374: PRIVATE
                {
                mPRIVATE(); 

                }
                break;
            case 52 :
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:1:382: PUBLIC
                {
                mPUBLIC(); 

                }
                break;
            case 53 :
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:1:389: RETURN
                {
                mRETURN(); 

                }
                break;
            case 54 :
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:1:396: SUPER
                {
                mSUPER(); 

                }
                break;
            case 55 :
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:1:402: THIS
                {
                mTHIS(); 

                }
                break;
            case 56 :
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:1:407: EQ
                {
                mEQ(); 

                }
                break;
            case 57 :
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:1:410: PLUS
                {
                mPLUS(); 

                }
                break;
            case 58 :
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:1:415: MINUS
                {
                mMINUS(); 

                }
                break;
            case 59 :
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:1:421: STAR
                {
                mSTAR(); 

                }
                break;
            case 60 :
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:1:426: SLASH
                {
                mSLASH(); 

                }
                break;
            case 61 :
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:1:432: COMPAREOP
                {
                mCOMPAREOP(); 

                }
                break;
            case 62 :
                // /Users/IlianaPetrova/Desktop/JaSVN/antlr/Ja.g:1:442: IDENTIFIER
                {
                mIDENTIFIER(); 

                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    protected DFA20 dfa20 = new DFA20(this);
    static final String DFA9_eotS =
        "\1\uffff\1\2\2\uffff";
    static final String DFA9_eofS =
        "\4\uffff";
    static final String DFA9_minS =
        "\2\56\2\uffff";
    static final String DFA9_maxS =
        "\2\71\2\uffff";
    static final String DFA9_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA9_specialS =
        "\4\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "489:1: fragment FloatingPointLiteral : ( ( Digit )+ '.' ( Digit )* ( Exponent )? | ( '.' )? ( Digit )+ ( Exponent )? );";
        }
    }
    static final String DFA20_eotS =
        "\7\uffff\1\52\1\55\1\57\1\63\2\uffff\1\65\1\67\1\uffff\1\71\2\uffff"+
        "\2\72\2\uffff\12\47\1\uffff\4\47\22\uffff\1\76\2\uffff\2\76\4\uffff"+
        "\1\72\16\47\1\155\1\47\1\160\7\47\1\76\2\uffff\1\76\4\47\1\176\1"+
        "\47\1\u0080\6\47\1\u0087\1\47\1\uffff\2\47\1\uffff\7\47\1\uffff"+
        "\1\76\1\u0092\1\u0093\2\47\1\uffff\1\u0096\1\uffff\1\47\1\u0098"+
        "\1\u0099\3\47\1\uffff\1\47\1\u009e\1\47\1\u00a0\1\47\1\u00a2\4\47"+
        "\2\uffff\1\u0092\1\u00a7\1\uffff\1\47\2\uffff\1\u00a9\1\u00aa\1"+
        "\u00ab\1\47\1\uffff\1\47\1\uffff\1\47\1\uffff\1\u00af\3\47\1\uffff"+
        "\1\47\3\uffff\1\47\1\u00b5\1\47\1\uffff\1\47\1\u00b8\1\u00b9\1\u00ba"+
        "\1\47\1\uffff\1\u00bc\1\u00bd\3\uffff\1\47\2\uffff\1\47\1\u00c0"+
        "\1\uffff";
    static final String DFA20_eofS =
        "\u00c1\uffff";
    static final String DFA20_minS =
        "\1\11\6\uffff\1\53\1\55\1\75\1\52\2\uffff\2\75\1\uffff\1\60\2\uffff"+
        "\2\56\2\uffff\1\150\1\141\1\145\1\157\2\150\1\146\3\157\1\uffff"+
        "\1\154\1\150\1\162\1\145\22\uffff\1\60\2\uffff\1\60\1\56\1\53\3"+
        "\uffff\1\56\1\165\1\151\1\154\1\157\1\162\1\154\1\167\1\157\1\164"+
        "\2\141\1\157\1\160\1\163\1\44\1\156\1\44\1\151\1\164\1\163\2\151"+
        "\1\142\1\164\1\60\1\53\2\60\1\145\2\163\1\141\1\44\1\154\1\44\1"+
        "\154\1\145\1\162\1\163\1\162\1\145\1\44\1\164\1\uffff\1\147\1\142"+
        "\1\uffff\1\144\2\145\1\154\1\166\1\154\1\165\2\60\2\44\1\145\1\164"+
        "\1\uffff\1\44\1\uffff\1\145\2\44\1\163\1\164\1\162\1\uffff\1\141"+
        "\1\44\1\154\1\44\1\156\1\44\1\145\1\141\1\151\1\162\2\uffff\2\44"+
        "\1\uffff\1\141\2\uffff\3\44\1\156\1\uffff\1\145\1\uffff\1\144\1"+
        "\uffff\1\44\1\164\1\143\1\156\1\uffff\1\156\3\uffff\1\143\1\44\1"+
        "\163\1\uffff\1\145\3\44\1\145\1\uffff\2\44\3\uffff\1\157\2\uffff"+
        "\1\146\1\44\1\uffff";
    static final String DFA20_maxS =
        "\1\175\6\uffff\4\75\2\uffff\2\75\1\uffff\1\71\2\uffff\2\154\2\uffff"+
        "\1\162\1\157\1\165\1\171\1\154\1\165\1\156\3\157\1\uffff\1\170\1"+
        "\150\1\165\1\145\22\uffff\1\146\2\uffff\2\146\1\71\3\uffff\1\154"+
        "\1\165\1\151\1\154\1\157\1\162\1\154\1\167\1\157\1\164\2\141\1\157"+
        "\1\160\1\164\1\172\1\156\1\172\1\151\1\164\1\163\2\151\1\142\1\164"+
        "\1\146\2\71\1\146\1\145\2\163\1\141\1\172\1\154\1\172\1\154\1\145"+
        "\1\162\1\163\1\162\1\145\1\172\1\164\1\uffff\1\147\1\142\1\uffff"+
        "\1\144\2\145\1\154\1\166\1\154\1\165\1\71\1\146\2\172\1\145\1\164"+
        "\1\uffff\1\172\1\uffff\1\145\2\172\1\163\1\164\1\162\1\uffff\1\141"+
        "\1\172\1\154\1\172\1\156\1\172\1\145\1\141\1\151\1\162\2\uffff\2"+
        "\172\1\uffff\1\141\2\uffff\3\172\1\156\1\uffff\1\145\1\uffff\1\144"+
        "\1\uffff\1\172\1\164\1\143\1\156\1\uffff\1\156\3\uffff\1\143\1\172"+
        "\1\163\1\uffff\1\145\3\172\1\145\1\uffff\2\172\3\uffff\1\157\2\uffff"+
        "\1\146\1\172\1\uffff";
    static final String DFA20_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\4\uffff\1\13\1\14\2\uffff\1\17"+
        "\1\uffff\1\24\1\25\2\uffff\1\32\1\33\12\uffff\1\47\4\uffff\1\75"+
        "\1\76\1\7\1\20\1\71\1\10\1\21\1\72\1\11\1\73\1\12\1\50\1\51\1\74"+
        "\1\15\1\70\1\16\1\22\1\uffff\1\23\1\26\3\uffff\1\31\1\30\1\27\54"+
        "\uffff\1\57\2\uffff\1\55\15\uffff\1\54\1\uffff\1\62\6\uffff\1\42"+
        "\12\uffff\1\34\1\67\2\uffff\1\35\1\uffff\1\37\1\40\4\uffff\1\43"+
        "\1\uffff\1\46\1\uffff\1\60\4\uffff\1\44\1\uffff\1\52\1\41\1\66\3"+
        "\uffff\1\56\5\uffff\1\45\2\uffff\1\64\1\65\1\36\1\uffff\1\53\1\63"+
        "\2\uffff\1\61";
    static final String DFA20_specialS =
        "\u00c1\uffff}>";
    static final String[] DFA20_transitionS = {
            "\2\41\2\uffff\1\41\22\uffff\1\41\1\16\1\26\1\uffff\1\47\1\17"+
            "\1\14\1\25\1\5\1\6\1\11\1\7\1\4\1\10\1\20\1\12\1\23\11\24\1"+
            "\uffff\1\1\1\46\1\15\1\46\2\uffff\32\47\1\21\1\uffff\1\22\1"+
            "\uffff\1\47\1\uffff\1\47\1\32\1\33\1\37\1\42\1\30\2\47\1\35"+
            "\2\47\1\36\1\47\1\31\1\47\1\44\1\47\1\45\1\34\1\27\1\47\1\40"+
            "\1\43\3\47\1\2\1\13\1\3",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\51\21\uffff\1\50",
            "\1\54\17\uffff\1\53",
            "\1\56",
            "\1\61\4\uffff\1\62\15\uffff\1\60",
            "",
            "",
            "\1\64",
            "\1\66",
            "",
            "\12\70",
            "",
            "",
            "\1\73\1\uffff\12\74\12\uffff\1\76\1\75\1\77\5\uffff\1\100\27"+
            "\uffff\1\76\1\75\1\77\5\uffff\1\100",
            "\1\73\1\uffff\12\101\12\uffff\1\76\1\75\1\77\5\uffff\1\100"+
            "\27\uffff\1\76\1\75\1\77\5\uffff\1\100",
            "",
            "",
            "\1\103\11\uffff\1\102",
            "\1\104\12\uffff\1\105\2\uffff\1\106",
            "\1\110\17\uffff\1\107",
            "\1\111\11\uffff\1\112",
            "\1\113\3\uffff\1\114",
            "\1\115\14\uffff\1\116",
            "\1\120\7\uffff\1\117",
            "\1\121",
            "\1\122",
            "\1\123",
            "",
            "\1\125\13\uffff\1\124",
            "\1\126",
            "\1\127\2\uffff\1\130",
            "\1\131",
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
            "",
            "",
            "\12\70\13\uffff\1\75\1\77\36\uffff\1\75\1\77",
            "",
            "",
            "\12\132\13\uffff\1\133\1\77\36\uffff\1\133\1\77",
            "\1\73\1\uffff\12\74\13\uffff\1\75\1\77\36\uffff\1\75\1\77",
            "\1\134\1\uffff\1\134\2\uffff\12\135",
            "",
            "",
            "",
            "\1\73\1\uffff\12\101\12\uffff\1\76\1\75\1\77\5\uffff\1\100"+
            "\27\uffff\1\76\1\75\1\77\5\uffff\1\100",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\154\1\153",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\156",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\24"+
            "\47\1\157\5\47",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\12\132\13\uffff\1\133\1\77\36\uffff\1\133\1\77",
            "\1\170\1\uffff\1\170\2\uffff\12\171",
            "\12\135",
            "\12\135\14\uffff\1\77\37\uffff\1\77",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\177",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\u0088",
            "",
            "\1\u0089",
            "\1\u008a",
            "",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\12\171",
            "\12\171\14\uffff\1\77\37\uffff\1\77",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\u0094",
            "\1\u0095",
            "",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "",
            "\1\u0097",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "",
            "\1\u009d",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\u009f",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\u00a1",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "",
            "",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "",
            "\1\u00a8",
            "",
            "",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\u00ac",
            "",
            "\1\u00ad",
            "",
            "\1\u00ae",
            "",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "",
            "\1\u00b3",
            "",
            "",
            "",
            "\1\u00b4",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\u00b6",
            "",
            "\1\u00b7",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\u00bb",
            "",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "",
            "",
            "",
            "\1\u00be",
            "",
            "",
            "\1\u00bf",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            ""
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | INTLITERAL | LONGLITERAL | FLOATLITERAL | DOUBLELITERAL | CHARLITERAL | STRINGLITERAL | BOOLEANLITERAL | NULLLITERAL | BOOLEAN | BYTE | CHAR | SHORT | INT | LONG | FLOAT | DOUBLE | VOID | WS | COMMENT | LINE_COMMENT | CLASS | EXTENDS | FOR | DO | WHILE | IF | ELSE | INSTANCEOF | NEW | PRIVATE | PUBLIC | RETURN | SUPER | THIS | EQ | PLUS | MINUS | STAR | SLASH | COMPAREOP | IDENTIFIER );";
        }
    }
 

}