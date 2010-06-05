grammar JaLexer;
options {
    language=Java;
}

@members {
}

r : INTLITERAL {System.out.println("let's see "+$INTLITERAL.text);} ;
      	  
fragment
Digit
    : '0'..'9'
    ;
        
fragment
IntegerNumber
    :   '0' 
    |   '1'..'9' Digit*    
    ;

fragment
LongSuffix
    :   'l' | 'L'
    ;

INTLITERAL
    :   IntegerNumber 
    ;
	
LONGLITERAL
    :   IntegerNumber LongSuffix
    ;
	
fragment
NonIntegerNumber
    :   Digit+ '.' Digit* Exponent?
    |   ('.')? Digit+ Exponent?  
     /*  
    |   '.' Digit+ Exponent?  
    |   Digit+ Exponent  
    |   Digit+ */ 
    ;
        
fragment 
Exponent    
    :   ( 'e' | 'E' ) ( '+' | '-' )? Digit+ 
    ;
    
fragment 
FloatSuffix
    :   'f' | 'F' 
    ;     

fragment
DoubleSuffix
    :   'd' | 'D'
    ;
        
FLOATLITERAL
    :   NonIntegerNumber FloatSuffix
    ;
    
DOUBLELITERAL
    :   NonIntegerNumber DoubleSuffix?
    ;

CHARLITERAL
    :   '\'' 
        (   EscapeSequence 
        |   ~( '\'' | '\\' | '\r' | '\n' )
        ) 
        '\''
    ; 

STRINGLITERAL
    :   '"' 
        (   EscapeSequence
        |   ~( '\\' | '"' | '\r' | '\n' )        
        )* 
        '"' 
    ;

fragment
EscapeSequence 
    :   '\\' (
                 't' 
             |   'n' 
             |   'r' 
             |   '\"' 
             |   '\'' 
             |   '\\'
             )          
;     

BOOLEAN
    :   'boolean'
    ;
    
BYTE
    :   'byte'
    ;

CHAR
    :   'char'
    ;
    	
SHORT
    :   'short'
    ;
	
INT
    :   'int'
    ;

LONG
    :   'long'
    ;

FLOAT
    :   'float'
    ;

DOUBLE
    :   'double'
    ;		

VOID
    :   'void'
    ;	

TRUE
    :   'true'
    ;

FALSE
    :   'false'
    ;

NULL
    :   'null'
    ;
	
WS  
    :   (
             ' '
        |    '\r'
        |    '\t'
        |    '\n'
        ) 
			{ skip(); }          
;

COMMENT
    :   '/*'
        (options {greedy=false;} : . )* // ~('*/')
        '*/'
            { skip(); }
    ;

LINE_COMMENT
    :   // '//' ~('\n'|'\r')*  ('\r\n' | '\r' | '\n') 
        //    { skip(); }
       '//' ~('\n'|'\r')*
            { skip(); }
    ;   
        

CLASS
    :   'class'
    ;

EXTENDS
    :   'extends'
    ;
		
FOR
    :   'for'
    ;

DO
    :   'do'
    ;

WHILE
    :   'while'
    ;
	
IF
    :   'if'
    ;

ELSE
    :   'else'
    ;	
	
INSTANCEOF
    :   'instanceof'
    ;
	
NEW
    :   'new'
    ;

PRIVATE
    :   'private'
    ;

PUBLIC
    :   'public'
    ;

RETURN
    :   'return'
    ;

SUPER
    :   'super'
    ;

THIS
    :   'this'
    ;

LPAREN
    :   '('
    ;

RPAREN
    :   ')'
    ;

LBRACE
    :   '{'
    ;

RBRACE
    :   '}'
    ;

LBRACKET
    :   '['
    ;

RBRACKET
    :   ']'
    ;

SEMICOLUMN
    :   ';'
    ;

COMMA
    :   ','
    ;

DOT
    :   '.'
    ;

EQ
    :   '='
    ;

PLUS
    :   '+'
    ;

SUB
    :   '-'
    ;

STAR
    :   '*'
    ;

SLASH
    :   '/'
    ;

BANG
    :   '!'
    ;

EQEQ
    :   '=='
    ;

AND
    :   '&&'
    ;

OR
    :   '||'
    ;

PLUSPLUS
    :   '++'
    ;

SUBSUB
    :   '--'
    ;
	
PLUSEQ
    :   '+='
    ; 
    
SUBEQ
    :   '-='
    ;

STAREQ
    :   '*='
    ;

SLASHEQ
    :   '/='
    ;

BANGEQ
    :   '!='
    ;

GT
    :   '>'
    ;

LT
    :   '<'
    ;
    
GTEQ
    :   '>='
    ;

LTEQ
    :   '<='
    ;         

IDENTIFIER
    :  (
		Letter 
		|   Currency 
		|	'_') 
		(
			Digit 
		| 	Letter 
		| 	Currency 
		|	'_'
		)*
    ;    			
   
fragment
Letter
    : 	'a'..'z' 
	|	'A'..'Z'
    ;
   
fragment 
Currency
    : 	'$'
    | 	'£'
    ;
