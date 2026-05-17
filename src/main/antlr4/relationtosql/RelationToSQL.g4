grammar RelationToSQL;

prog
    : expression SEMI EOF
    ;

expression
    : setExpression
    ;

setExpression
    : joinExpression ((BING | JIAO | CHU) joinExpression)*
    ;

joinExpression
    : unaryExpression (NJOIN unaryExpression)*
    ;

unaryExpression
    : project
    | choose
    | atom
    ;

project
    : PAI columnList LEFT expression RIGHT
    ;

choose
    : XIGEMA condition LEFT expression RIGHT
    ;

atom
    : ident=IDENT
    | LEFT expression RIGHT
    ;

columnList
    : IDENT (DOU IDENT)*
    ;

condition
    : predicate ((AND | OR) predicate)*
    ;

predicate
    : ident=IDENT operator=(EQUAL | NEQUAL | LESS | GREATER) num=NUM
    ;

PAI
    : 'H'
    ;

XIGEMA
    : 'G'
    ;

AND
    : '@'
    ;

BING
    : '*'
    ;

JIAO
    : '~'
    ;

NJOIN
    : '&'
    ;

CHU
    : '/'
    ;

DOU
    : ','
    ;

OR
    : '^'
    ;

LESS
    : '<'
    ;

GREATER
    : '>'
    ;

EQUAL
    : '='
    ;

NEQUAL
    : '!='
    ;

SEMI
    : ';'
    ;

LEFT
    : '('
    ;

RIGHT
    : ')'
    ;

IDENT
    : [a-z]+
    ;

NUM
    : [0-9]+
    ;

WS
    : [ \t\n\r]+ -> skip
    ;
