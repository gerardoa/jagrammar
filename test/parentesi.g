grammar parentesi;

stmt	: 	parexp
	|	cast
	;	
parexp	:	'('parexp')';
cast	:	'('T')';

T	:	'type';

ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;

