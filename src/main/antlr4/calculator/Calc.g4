grammar Calc;

statement
    : setStatement EOF
    | expr EOF
    ;

setStatement
    : SET assignments
    ;

assignments
    : assignment (SEMI assignment)* SEMI?
    ;

assignment
    : id=ID EQ expr
    ;

expr
    : additive
    ;

additive
    : multiplicative ((PLUS | MINUS) multiplicative)*
    ;

multiplicative
    : unary ((TIMES | DIV) unary)*
    ;

unary
    : MINUS unary
    | power
    ;

power
    : atom (POW unary)?
    ;

atom
    : n=number
    | id=ID
    | LPAREN expr RPAREN
    | func
    ;

func
    : funcname=(COS | TAN | SIN | ACOS | ATAN | ASIN | LOG | LN) LPAREN expr RPAREN
    ;

number
    : DIGIT
    ;

COS
    : 'cos'
    ;

SIN
    : 'sin'
    ;

TAN
    : 'tan'
    ;

ACOS
    : 'acos'
    ;

ASIN
    : 'asin'
    ;

ATAN
    : 'atan'
    ;

LN
    : 'ln'
    ;

LOG
    : 'log'
    ;

LPAREN
    : '('
    ;

RPAREN
    : ')'
    ;

PLUS
    : '+'
    ;

MINUS
    : '-'
    ;

TIMES
    : '*'
    ;

DIV
    : '/'
    ;

POW
    : '^'
    ;

DIGIT
    : [0-9]+ ('.' [0-9]+)?
    ;

SEMI
    : ';'
    ;

SET
    : 'SET'
    ;

EQ
    : '='
    ;

ID
    : [a-z]+
    ;

WS
    : [ \r\n\t]+ -> skip
    ;
