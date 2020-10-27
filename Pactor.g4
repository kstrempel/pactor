grammar Pactor;

program
: commands* EOF
;

commands
: name=WORD '(' params_in+=WORD* '--' params_out+=WORD* ')' ':' body=commands+ ';'  # createWord
| '[' value=commands+ ']'  # quote
| value=NUMBER             # pushNumberToStack
| value=FLOAT              # pushFloatToStack
| value=STRING             # pushStringToStack
| value=(WORD|MATH_WORDS)  # commandRun
| WS                       # commandIgnore
;

NUMBER
: ('0' .. '9') + (('e' | 'E') NUMBER)*
;

FLOAT
: ('0' .. '9')* '.' ('0' .. '9') + (('e' | 'E') ('0' .. '9') +)*
;

STRING
:  '"' ( ~'"' | '\\' '"' )* '"'
;

WORD
: [a-z0-9]+
;

MATH_WORDS
: '+' | '-' | '*' | '/'
;

WS
: [ \n\r\t,]+ -> skip
;