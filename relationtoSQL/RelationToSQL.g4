grammar RelationToSQL;
prog	
    :	((choose|project) SEMI)+
    ;
projectStart
    :	LEFT (projectSub|chooseSub)* 
        ident=IDENT RIGHT
    ;
project	
    :	PAI projectColumns 
        (loopProjectColumns)* 
        projectStart 
        (relation exprSub)*
    ; 
choose	
    :	XIGEMA chooseColumns 
        (equal|notEqual|small|big) 
        (loopChooseColumns 
        chooseColumnsAfterAndOr 
        (equal|notEqual|small|big))* 
        (relation exprSub)*
    ;
projectColumns	
    :	ident=IDENT 
    ;
chooseColumns
    :	ident=IDENT
    ;
loopProjectColumns
    :	dou=DOU ident=IDENT
    ;
relation
    :	(bin|jia|njo|chu)
    ;
bin	
    :	BING
    ;
jia	
    :	JIAO 
    ;
njo	
    :	NJOIN
    ;
chu	
    :	CHU
    ;
exprSub	
    :	chooseSub
    |   projectSub
    ;
loopChooseColumns
    :	t=(AND
    |   OR) 
    ;
chooseColumnsAfterAndOr
    :	ident=IDENT 
    ;
projectSub
    :	PAI projectColumns 
        LEFT (projectSub|chooseSub)* 
        ident=IDENT RIGHT
    ;
chooseSub
    :	XIGEMA chooseColumns 
        (equal|notEqual|small|big) 
        (loopChooseColumns 
        chooseColumnsAfterAndOr 
        (equal|notEqual|small|big))*
    ;
equal	
    :	equ=EQUAL num=NUM
    ;
notEqual
    :	nequ=NEQUAL num=NUM 
    ;
small	
    :	less=LESS num=NUM
    ;
big	
    :	more=MORE num=NUM 
    ;
PAI
    :   'H'
    ;

XIGEMA
    :   'G'
    ;
AND
    :   '@'
    ;
BING
    :   '*'
    ;
JIAO
    :   '~'
    ;
NJOIN
    :   '&'
    ;
CHU
    :   '/'
    ;
DOU
    :   ','
    ;
OR  :   '^'
    ;
LESS
    :   '<'
    ;
MORE
    :   '>'
    ;
EQUAL   
    :   '='
    ;
NEQUAL
    :   '!='
    ;
SEMI
    :   ';'
    ;
LEFT
    :   '('
    ;
RIGHT
    :   ')'
    ;
IDENT
    :   ('a'..'z')+
    ;
NUM
    :   ('0'..'9')+
    ;
WS
    :   (' '|'\t'|'\n'|'\r')+ -> skip
    ;






