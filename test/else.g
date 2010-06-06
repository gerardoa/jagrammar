grammar else;

s	:	stmt;

stmt	:	IF stmt (ELSE stmt)?;

IF	:	'if';
ELSE	:	'else';

ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;

