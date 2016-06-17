grammar Calc;
assign
    : setExpr
    | getExpr
    ;
setExpr
    : SET agmts
    ;
agmts
    : agmt (SEMI agmts)? SEMI?
    ;
agmt
    : id=ID EQ atom;

getExpr
    : expr
    ;

expr
   : multExpr ((PLUS | MINUS) expr)*
   ;
multExpr
   : powExpr ((TIMES | DIV) powExpr)*
   ;
powExpr
   : atom (POW expr)?
   ;
atom
   : (op1=MINUS)? n=number
   | (op2=MINUS)? id=ID
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
   : [0-9]+('.'([0-9]+)?)? 
   ;
SEMI
    :';'
    ;
SET
    :'SET'
    ;
EQ
    :'='
    ;
ID
    :[a-z]+ 
    ; 
WS
   : [ \r\n\t] + -> skip
   ;