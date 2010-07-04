// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g 2010-07-04 17:41:31

	package jagrammar;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class JaLexer extends Lexer {
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
    public static final int RETURN=49;
    public static final int THIS=37;
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
    public static final int INTLITERAL=39;
    public static final int T__85=85;
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
    public static final int FLOATLITERAL=61;
    public static final int PUBLIC=27;
    public static final int EXTENDS=26;
    public static final int COMPAREOP=52;
    public static final int METHOD=9;
    public static final int DOWHILE=22;

    // delegates
    // delegators

    public JaLexer() {;} 
    public JaLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public JaLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g"; }

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:11:7: ( ';' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:11:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:12:7: ( '{' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:12:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:13:7: ( '}' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:13:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:14:7: ( ',' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:14:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:15:7: ( '[' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:15:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:16:7: ( ']' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:16:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:17:7: ( '(' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:17:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:18:7: ( ')' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:18:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:19:7: ( '...' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:19:9: '...'
            {
            match("..."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:20:7: ( '+=' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:20:9: '+='
            {
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:21:7: ( '-=' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:21:9: '-='
            {
            match("-="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:22:7: ( '*=' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:22:9: '*='
            {
            match("*="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:23:7: ( '/=' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:23:9: '/='
            {
            match("/="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:24:7: ( '||' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:24:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:25:7: ( '&&' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:25:9: '&&'
            {
            match("&&"); 


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
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:26:7: ( '==' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:26:9: '=='
            {
            match("=="); 


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
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:27:7: ( '!=' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:27:9: '!='
            {
            match("!="); 


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
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:28:7: ( '%' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:28:9: '%'
            {
            match('%'); 

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
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:29:7: ( '++' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:29:9: '++'
            {
            match("++"); 


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
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:30:7: ( '--' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:30:9: '--'
            {
            match("--"); 


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
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:31:7: ( '!' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:31:9: '!'
            {
            match('!'); 

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
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:32:7: ( '.' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:32:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "IntegerNumber"
    public final void mIntegerNumber() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:415:5: ( '0' | '1' .. '9' ( Digit )* )
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
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:415:9: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:416:9: '1' .. '9' ( Digit )*
                    {
                    matchRange('1','9'); 
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:416:18: ( Digit )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:416:18: Digit
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
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:421:5: ( '0' .. '9' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:421:7: '0' .. '9'
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
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:427:5: ( 'l' | 'L' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:
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
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:431:5: ( IntegerNumber )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:431:9: IntegerNumber
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
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:435:5: ( IntegerNumber LongSuffix )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:435:9: IntegerNumber LongSuffix
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
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:440:5: ( ( Digit )+ '.' ( Digit )* ( Exponent )? | ( '.' )? ( Digit )+ ( Exponent )? )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:440:9: ( Digit )+ '.' ( Digit )* ( Exponent )?
                    {
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:440:9: ( Digit )+
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
                    	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:440:9: Digit
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
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:440:20: ( Digit )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:440:20: Digit
                    	    {
                    	    mDigit(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:440:27: ( Exponent )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='E'||LA5_0=='e') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:440:27: Exponent
                            {
                            mExponent(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:441:9: ( '.' )? ( Digit )+ ( Exponent )?
                    {
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:441:9: ( '.' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='.') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:441:10: '.'
                            {
                            match('.'); 

                            }
                            break;

                    }

                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:441:16: ( Digit )+
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
                    	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:441:16: Digit
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

                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:441:23: ( Exponent )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='E'||LA8_0=='e') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:441:23: Exponent
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
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:446:5: ( ( 'e' | 'E' ) ( '+' | '-' )? ( Digit )+ )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:446:9: ( 'e' | 'E' ) ( '+' | '-' )? ( Digit )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:446:23: ( '+' | '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='+'||LA10_0=='-') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:
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

            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:446:38: ( Digit )+
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
            	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:446:38: Digit
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
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:451:5: ( 'f' | 'F' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:
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
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:456:5: ( 'd' | 'D' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:
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
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:460:5: ( FloatingPointLiteral FloatSuffix )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:460:9: FloatingPointLiteral FloatSuffix
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
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:464:5: ( FloatingPointLiteral ( DoubleSuffix )? )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:464:9: FloatingPointLiteral ( DoubleSuffix )?
            {
            mFloatingPointLiteral(); 
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:464:30: ( DoubleSuffix )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='D'||LA12_0=='d') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:464:30: DoubleSuffix
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
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:468:5: ( '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' | '\\r' | '\\n' ) ) '\\'' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:468:9: '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' | '\\r' | '\\n' ) ) '\\''
            {
            match('\''); 
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:469:9: ( EscapeSequence | ~ ( '\\'' | '\\\\' | '\\r' | '\\n' ) )
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
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:469:13: EscapeSequence
                    {
                    mEscapeSequence(); 

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:470:13: ~ ( '\\'' | '\\\\' | '\\r' | '\\n' )
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
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:476:5: ( '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' | '\\r' | '\\n' ) )* '\"' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:476:9: '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' | '\\r' | '\\n' ) )* '\"'
            {
            match('\"'); 
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:477:9: ( EscapeSequence | ~ ( '\\\\' | '\"' | '\\r' | '\\n' ) )*
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
            	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:477:13: EscapeSequence
            	    {
            	    mEscapeSequence(); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:478:13: ~ ( '\\\\' | '\"' | '\\r' | '\\n' )
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
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:485:5: ( '\\\\' ( 't' | 'n' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:485:9: '\\\\' ( 't' | 'n' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:497:2: ( 'true' | 'false' )
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
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:497:4: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:498:4: 'false'
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
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:501:5: ( 'null' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:501:9: 'null'
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
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:506:5: ( 'boolean' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:506:9: 'boolean'
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
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:510:5: ( 'byte' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:510:9: 'byte'
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
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:514:5: ( 'char' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:514:9: 'char'
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
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:518:5: ( 'short' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:518:9: 'short'
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
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:522:5: ( 'int' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:522:9: 'int'
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
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:526:5: ( 'long' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:526:9: 'long'
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
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:530:5: ( 'float' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:530:9: 'float'
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
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:534:5: ( 'double' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:534:9: 'double'
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
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:538:5: ( 'void' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:538:9: 'void'
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
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:543:5: ( ( ' ' | '\\r' | '\\t' | '\\n' ) )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:543:9: ( ' ' | '\\r' | '\\t' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

             _channel=HIDDEN; 

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
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:553:5: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:553:9: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:554:9: ( options {greedy=false; } : . )*
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
            	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:554:36: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            match("*/"); 

             _channel=HIDDEN; 

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
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:560:5: ( '//' (~ ( '\\n' | '\\r' ) )* )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:560:7: '//' (~ ( '\\n' | '\\r' ) )*
            {
            match("//"); 

            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:560:12: (~ ( '\\n' | '\\r' ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\u0000' && LA17_0<='\t')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:560:12: ~ ( '\\n' | '\\r' )
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

             _channel=HIDDEN; 

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
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:565:5: ( 'class' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:565:9: 'class'
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
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:569:5: ( 'extends' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:569:9: 'extends'
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
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:573:5: ( 'for' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:573:9: 'for'
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
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:577:5: ( 'do' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:577:9: 'do'
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
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:581:5: ( 'while' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:581:9: 'while'
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
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:585:5: ( 'if' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:585:9: 'if'
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
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:589:5: ( 'else' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:589:9: 'else'
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
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:593:5: ( 'instanceof' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:593:9: 'instanceof'
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
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:597:5: ( 'new' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:597:9: 'new'
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
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:601:5: ( 'private' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:601:9: 'private'
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
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:605:5: ( 'public' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:605:9: 'public'
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
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:609:5: ( 'return' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:609:9: 'return'
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
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:613:5: ( 'super' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:613:9: 'super'
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
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:617:5: ( 'this' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:617:9: 'this'
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
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:621:5: ( '=' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:621:9: '='
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
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:625:5: ( '+' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:625:9: '+'
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
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:629:5: ( '-' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:629:9: '-'
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
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:633:5: ( '*' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:633:9: '*'
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
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:637:5: ( '/' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:637:9: '/'
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
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:642:5: ( '>' | '<' | '>=' | '<=' )
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
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:642:8: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:643:8: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:644:8: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:645:8: '<='
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
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:649:5: ( ( Letter | Currency | '_' ) ( Digit | Letter | Currency | '_' )* )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:649:8: ( Letter | Currency | '_' ) ( Digit | Letter | Currency | '_' )*
            {
            if ( input.LA(1)=='$'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='\u00A3' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:653:3: ( Digit | Letter | Currency | '_' )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0=='$'||(LA19_0>='0' && LA19_0<='9')||(LA19_0>='A' && LA19_0<='Z')||LA19_0=='_'||(LA19_0>='a' && LA19_0<='z')||LA19_0=='\u00A3') ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='\u00A3' ) {
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
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:663:5: ( 'a' .. 'z' | 'A' .. 'Z' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:
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
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:670:5: ( '$' | '£' )
            // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:
            {
            if ( input.LA(1)=='$'||input.LA(1)=='\u00A3' ) {
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
    // $ANTLR end "Currency"

    public void mTokens() throws RecognitionException {
        // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:1:8: ( T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | INTLITERAL | LONGLITERAL | FLOATLITERAL | DOUBLELITERAL | CHARLITERAL | STRINGLITERAL | BOOLEANLITERAL | NULLLITERAL | BOOLEAN | BYTE | CHAR | SHORT | INT | LONG | FLOAT | DOUBLE | VOID | WS | COMMENT | LINE_COMMENT | CLASS | EXTENDS | FOR | DO | WHILE | IF | ELSE | INSTANCEOF | NEW | PRIVATE | PUBLIC | RETURN | SUPER | THIS | EQ | PLUS | MINUS | STAR | SLASH | COMPAREOP | IDENTIFIER )
        int alt20=63;
        alt20 = dfa20.predict(input);
        switch (alt20) {
            case 1 :
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:1:10: T__75
                {
                mT__75(); 

                }
                break;
            case 2 :
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:1:16: T__76
                {
                mT__76(); 

                }
                break;
            case 3 :
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:1:22: T__77
                {
                mT__77(); 

                }
                break;
            case 4 :
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:1:28: T__78
                {
                mT__78(); 

                }
                break;
            case 5 :
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:1:34: T__79
                {
                mT__79(); 

                }
                break;
            case 6 :
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:1:40: T__80
                {
                mT__80(); 

                }
                break;
            case 7 :
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:1:46: T__81
                {
                mT__81(); 

                }
                break;
            case 8 :
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:1:52: T__82
                {
                mT__82(); 

                }
                break;
            case 9 :
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:1:58: T__83
                {
                mT__83(); 

                }
                break;
            case 10 :
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:1:64: T__84
                {
                mT__84(); 

                }
                break;
            case 11 :
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:1:70: T__85
                {
                mT__85(); 

                }
                break;
            case 12 :
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:1:76: T__86
                {
                mT__86(); 

                }
                break;
            case 13 :
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:1:82: T__87
                {
                mT__87(); 

                }
                break;
            case 14 :
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:1:88: T__88
                {
                mT__88(); 

                }
                break;
            case 15 :
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:1:94: T__89
                {
                mT__89(); 

                }
                break;
            case 16 :
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:1:100: T__90
                {
                mT__90(); 

                }
                break;
            case 17 :
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:1:106: T__91
                {
                mT__91(); 

                }
                break;
            case 18 :
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:1:112: T__92
                {
                mT__92(); 

                }
                break;
            case 19 :
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:1:118: T__93
                {
                mT__93(); 

                }
                break;
            case 20 :
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:1:124: T__94
                {
                mT__94(); 

                }
                break;
            case 21 :
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:1:130: T__95
                {
                mT__95(); 

                }
                break;
            case 22 :
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:1:136: T__96
                {
                mT__96(); 

                }
                break;
            case 23 :
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:1:142: INTLITERAL
                {
                mINTLITERAL(); 

                }
                break;
            case 24 :
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:1:153: LONGLITERAL
                {
                mLONGLITERAL(); 

                }
                break;
            case 25 :
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:1:165: FLOATLITERAL
                {
                mFLOATLITERAL(); 

                }
                break;
            case 26 :
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:1:178: DOUBLELITERAL
                {
                mDOUBLELITERAL(); 

                }
                break;
            case 27 :
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:1:192: CHARLITERAL
                {
                mCHARLITERAL(); 

                }
                break;
            case 28 :
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:1:204: STRINGLITERAL
                {
                mSTRINGLITERAL(); 

                }
                break;
            case 29 :
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:1:218: BOOLEANLITERAL
                {
                mBOOLEANLITERAL(); 

                }
                break;
            case 30 :
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:1:233: NULLLITERAL
                {
                mNULLLITERAL(); 

                }
                break;
            case 31 :
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:1:245: BOOLEAN
                {
                mBOOLEAN(); 

                }
                break;
            case 32 :
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:1:253: BYTE
                {
                mBYTE(); 

                }
                break;
            case 33 :
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:1:258: CHAR
                {
                mCHAR(); 

                }
                break;
            case 34 :
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:1:263: SHORT
                {
                mSHORT(); 

                }
                break;
            case 35 :
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:1:269: INT
                {
                mINT(); 

                }
                break;
            case 36 :
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:1:273: LONG
                {
                mLONG(); 

                }
                break;
            case 37 :
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:1:278: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 38 :
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:1:284: DOUBLE
                {
                mDOUBLE(); 

                }
                break;
            case 39 :
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:1:291: VOID
                {
                mVOID(); 

                }
                break;
            case 40 :
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:1:296: WS
                {
                mWS(); 

                }
                break;
            case 41 :
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:1:299: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 42 :
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:1:307: LINE_COMMENT
                {
                mLINE_COMMENT(); 

                }
                break;
            case 43 :
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:1:320: CLASS
                {
                mCLASS(); 

                }
                break;
            case 44 :
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:1:326: EXTENDS
                {
                mEXTENDS(); 

                }
                break;
            case 45 :
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:1:334: FOR
                {
                mFOR(); 

                }
                break;
            case 46 :
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:1:338: DO
                {
                mDO(); 

                }
                break;
            case 47 :
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:1:341: WHILE
                {
                mWHILE(); 

                }
                break;
            case 48 :
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:1:347: IF
                {
                mIF(); 

                }
                break;
            case 49 :
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:1:350: ELSE
                {
                mELSE(); 

                }
                break;
            case 50 :
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:1:355: INSTANCEOF
                {
                mINSTANCEOF(); 

                }
                break;
            case 51 :
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:1:366: NEW
                {
                mNEW(); 

                }
                break;
            case 52 :
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:1:370: PRIVATE
                {
                mPRIVATE(); 

                }
                break;
            case 53 :
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:1:378: PUBLIC
                {
                mPUBLIC(); 

                }
                break;
            case 54 :
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:1:385: RETURN
                {
                mRETURN(); 

                }
                break;
            case 55 :
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:1:392: SUPER
                {
                mSUPER(); 

                }
                break;
            case 56 :
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:1:398: THIS
                {
                mTHIS(); 

                }
                break;
            case 57 :
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:1:403: EQ
                {
                mEQ(); 

                }
                break;
            case 58 :
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:1:406: PLUS
                {
                mPLUS(); 

                }
                break;
            case 59 :
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:1:411: MINUS
                {
                mMINUS(); 

                }
                break;
            case 60 :
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:1:417: STAR
                {
                mSTAR(); 

                }
                break;
            case 61 :
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:1:422: SLASH
                {
                mSLASH(); 

                }
                break;
            case 62 :
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:1:428: COMPAREOP
                {
                mCOMPAREOP(); 

                }
                break;
            case 63 :
                // C:\\Documents and Settings\\Gerardo\\Desktop\\jagrammar\\antlr\\Ja.g:1:438: IDENTIFIER
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
            return "438:1: fragment FloatingPointLiteral : ( ( Digit )+ '.' ( Digit )* ( Exponent )? | ( '.' )? ( Digit )+ ( Exponent )? );";
        }
    }
    static final String DFA20_eotS =
        "\11\uffff\1\52\1\55\1\60\1\62\1\66\2\uffff\1\70\1\72\1\uffff\2"+
        "\73\2\uffff\12\47\1\uffff\4\47\3\uffff\1\101\22\uffff\2\101\4\uffff"+
        "\1\73\16\47\1\156\1\47\1\161\7\47\1\101\2\uffff\1\101\4\47\1\177"+
        "\1\47\1\u0081\6\47\1\u0088\1\47\1\uffff\2\47\1\uffff\7\47\1\uffff"+
        "\1\101\1\u0093\1\u0094\2\47\1\uffff\1\u0097\1\uffff\1\47\1\u0099"+
        "\1\u009a\3\47\1\uffff\1\47\1\u009f\1\47\1\u00a1\1\47\1\u00a3\4\47"+
        "\2\uffff\1\u0093\1\u00a8\1\uffff\1\47\2\uffff\1\u00aa\1\u00ab\1"+
        "\u00ac\1\47\1\uffff\1\47\1\uffff\1\47\1\uffff\1\u00b0\3\47\1\uffff"+
        "\1\47\3\uffff\1\47\1\u00b6\1\47\1\uffff\1\47\1\u00b9\1\u00ba\1\u00bb"+
        "\1\47\1\uffff\1\u00bd\1\u00be\3\uffff\1\47\2\uffff\1\47\1\u00c1"+
        "\1\uffff";
    static final String DFA20_eofS =
        "\u00c2\uffff";
    static final String DFA20_minS =
        "\1\11\10\uffff\1\56\1\53\1\55\1\75\1\52\2\uffff\2\75\1\uffff\2"+
        "\56\2\uffff\1\150\1\141\1\145\1\157\2\150\1\146\3\157\1\uffff\1"+
        "\154\1\150\1\162\1\145\3\uffff\1\60\22\uffff\1\60\1\56\1\53\3\uffff"+
        "\1\56\1\165\1\151\1\154\1\157\1\162\1\154\1\167\1\157\1\164\2\141"+
        "\1\157\1\160\1\163\1\44\1\156\1\44\1\151\1\164\1\163\2\151\1\142"+
        "\1\164\1\60\1\53\2\60\1\145\2\163\1\141\1\44\1\154\1\44\1\154\1"+
        "\145\1\162\1\163\1\162\1\145\1\44\1\164\1\uffff\1\147\1\142\1\uffff"+
        "\1\144\2\145\1\154\1\166\1\154\1\165\2\60\2\44\1\145\1\164\1\uffff"+
        "\1\44\1\uffff\1\145\2\44\1\163\1\164\1\162\1\uffff\1\141\1\44\1"+
        "\154\1\44\1\156\1\44\1\145\1\141\1\151\1\162\2\uffff\2\44\1\uffff"+
        "\1\141\2\uffff\3\44\1\156\1\uffff\1\145\1\uffff\1\144\1\uffff\1"+
        "\44\1\164\1\143\1\156\1\uffff\1\156\3\uffff\1\143\1\44\1\163\1\uffff"+
        "\1\145\3\44\1\145\1\uffff\2\44\3\uffff\1\157\2\uffff\1\146\1\44"+
        "\1\uffff";
    static final String DFA20_maxS =
        "\1\u00a3\10\uffff\1\71\4\75\2\uffff\2\75\1\uffff\2\154\2\uffff"+
        "\1\162\1\157\1\165\1\171\1\154\1\165\1\156\3\157\1\uffff\1\170\1"+
        "\150\1\165\1\145\3\uffff\1\146\22\uffff\2\146\1\71\3\uffff\1\154"+
        "\1\165\1\151\1\154\1\157\1\162\1\154\1\167\1\157\1\164\2\141\1\157"+
        "\1\160\1\164\1\u00a3\1\156\1\u00a3\1\151\1\164\1\163\2\151\1\142"+
        "\1\164\1\146\2\71\1\146\1\145\2\163\1\141\1\u00a3\1\154\1\u00a3"+
        "\1\154\1\145\1\162\1\163\1\162\1\145\1\u00a3\1\164\1\uffff\1\147"+
        "\1\142\1\uffff\1\144\2\145\1\154\1\166\1\154\1\165\1\71\1\146\2"+
        "\u00a3\1\145\1\164\1\uffff\1\u00a3\1\uffff\1\145\2\u00a3\1\163\1"+
        "\164\1\162\1\uffff\1\141\1\u00a3\1\154\1\u00a3\1\156\1\u00a3\1\145"+
        "\1\141\1\151\1\162\2\uffff\2\u00a3\1\uffff\1\141\2\uffff\3\u00a3"+
        "\1\156\1\uffff\1\145\1\uffff\1\144\1\uffff\1\u00a3\1\164\1\143\1"+
        "\156\1\uffff\1\156\3\uffff\1\143\1\u00a3\1\163\1\uffff\1\145\3\u00a3"+
        "\1\145\1\uffff\2\u00a3\3\uffff\1\157\2\uffff\1\146\1\u00a3\1\uffff";
    static final String DFA20_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\5\uffff\1\16\1\17\2\uffff"+
        "\1\22\2\uffff\1\33\1\34\12\uffff\1\50\4\uffff\1\76\1\77\1\11\1\uffff"+
        "\1\26\1\12\1\23\1\72\1\13\1\24\1\73\1\14\1\74\1\15\1\51\1\52\1\75"+
        "\1\20\1\71\1\21\1\25\1\27\3\uffff\1\31\1\30\1\32\54\uffff\1\60\2"+
        "\uffff\1\56\15\uffff\1\55\1\uffff\1\63\6\uffff\1\43\12\uffff\1\35"+
        "\1\70\2\uffff\1\36\1\uffff\1\40\1\41\4\uffff\1\44\1\uffff\1\47\1"+
        "\uffff\1\61\4\uffff\1\45\1\uffff\1\53\1\42\1\67\3\uffff\1\57\5\uffff"+
        "\1\46\2\uffff\1\65\1\66\1\37\1\uffff\1\54\1\64\2\uffff\1\62";
    static final String DFA20_specialS =
        "\u00c2\uffff}>";
    static final String[] DFA20_transitionS = {
            "\2\41\2\uffff\1\41\22\uffff\1\41\1\21\1\26\1\uffff\1\47\1\22"+
            "\1\17\1\25\1\7\1\10\1\14\1\12\1\4\1\13\1\11\1\15\1\23\11\24"+
            "\1\uffff\1\1\1\46\1\20\1\46\2\uffff\32\47\1\5\1\uffff\1\6\1"+
            "\uffff\1\47\1\uffff\1\47\1\32\1\33\1\37\1\42\1\30\2\47\1\35"+
            "\2\47\1\36\1\47\1\31\1\47\1\44\1\47\1\45\1\34\1\27\1\47\1\40"+
            "\1\43\3\47\1\2\1\16\1\3\45\uffff\1\47",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\50\1\uffff\12\51",
            "\1\54\21\uffff\1\53",
            "\1\57\17\uffff\1\56",
            "\1\61",
            "\1\64\4\uffff\1\65\15\uffff\1\63",
            "",
            "",
            "\1\67",
            "\1\71",
            "",
            "\1\74\1\uffff\12\75\12\uffff\1\101\1\76\1\77\5\uffff\1\100"+
            "\27\uffff\1\101\1\76\1\77\5\uffff\1\100",
            "\1\74\1\uffff\12\102\12\uffff\1\101\1\76\1\77\5\uffff\1\100"+
            "\27\uffff\1\101\1\76\1\77\5\uffff\1\100",
            "",
            "",
            "\1\104\11\uffff\1\103",
            "\1\105\12\uffff\1\106\2\uffff\1\107",
            "\1\111\17\uffff\1\110",
            "\1\112\11\uffff\1\113",
            "\1\114\3\uffff\1\115",
            "\1\116\14\uffff\1\117",
            "\1\121\7\uffff\1\120",
            "\1\122",
            "\1\123",
            "\1\124",
            "",
            "\1\126\13\uffff\1\125",
            "\1\127",
            "\1\130\2\uffff\1\131",
            "\1\132",
            "",
            "",
            "",
            "\12\51\13\uffff\1\76\1\77\36\uffff\1\76\1\77",
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
            "\12\133\13\uffff\1\134\1\77\36\uffff\1\134\1\77",
            "\1\74\1\uffff\12\75\13\uffff\1\76\1\77\36\uffff\1\76\1\77",
            "\1\135\1\uffff\1\135\2\uffff\12\136",
            "",
            "",
            "",
            "\1\74\1\uffff\12\102\12\uffff\1\101\1\76\1\77\5\uffff\1\100"+
            "\27\uffff\1\101\1\76\1\77\5\uffff\1\100",
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
            "\1\153",
            "\1\155\1\154",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47\50\uffff\1\47",
            "\1\157",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\24"+
            "\47\1\160\5\47\50\uffff\1\47",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\12\133\13\uffff\1\134\1\77\36\uffff\1\134\1\77",
            "\1\171\1\uffff\1\171\2\uffff\12\172",
            "\12\136",
            "\12\136\14\uffff\1\77\37\uffff\1\77",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47\50\uffff\1\47",
            "\1\u0080",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47\50\uffff\1\47",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47\50\uffff\1\47",
            "\1\u0089",
            "",
            "\1\u008a",
            "\1\u008b",
            "",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\12\172",
            "\12\172\14\uffff\1\77\37\uffff\1\77",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47\50\uffff\1\47",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47\50\uffff\1\47",
            "\1\u0095",
            "\1\u0096",
            "",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47\50\uffff\1\47",
            "",
            "\1\u0098",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47\50\uffff\1\47",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47\50\uffff\1\47",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "",
            "\1\u009e",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47\50\uffff\1\47",
            "\1\u00a0",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47\50\uffff\1\47",
            "\1\u00a2",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47\50\uffff\1\47",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "",
            "",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47\50\uffff\1\47",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47\50\uffff\1\47",
            "",
            "\1\u00a9",
            "",
            "",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47\50\uffff\1\47",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47\50\uffff\1\47",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47\50\uffff\1\47",
            "\1\u00ad",
            "",
            "\1\u00ae",
            "",
            "\1\u00af",
            "",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47\50\uffff\1\47",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "",
            "\1\u00b4",
            "",
            "",
            "",
            "\1\u00b5",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47\50\uffff\1\47",
            "\1\u00b7",
            "",
            "\1\u00b8",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47\50\uffff\1\47",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47\50\uffff\1\47",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47\50\uffff\1\47",
            "\1\u00bc",
            "",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47\50\uffff\1\47",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47\50\uffff\1\47",
            "",
            "",
            "",
            "\1\u00bf",
            "",
            "",
            "\1\u00c0",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47\50\uffff\1\47",
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
            return "1:1: Tokens : ( T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | INTLITERAL | LONGLITERAL | FLOATLITERAL | DOUBLELITERAL | CHARLITERAL | STRINGLITERAL | BOOLEANLITERAL | NULLLITERAL | BOOLEAN | BYTE | CHAR | SHORT | INT | LONG | FLOAT | DOUBLE | VOID | WS | COMMENT | LINE_COMMENT | CLASS | EXTENDS | FOR | DO | WHILE | IF | ELSE | INSTANCEOF | NEW | PRIVATE | PUBLIC | RETURN | SUPER | THIS | EQ | PLUS | MINUS | STAR | SLASH | COMPAREOP | IDENTIFIER );";
        }
    }
 

}