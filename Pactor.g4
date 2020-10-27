grammar Pactor;

program
: commands* EOF
;

commands
: value=NUMBER                      # pushNumberToStack
| value=FLOAT                       # pushFloatToStack
| value=STRING                      # pushStringToStack
| value=WORD                        # commandRun
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
: [a-z]+ | '+' | '-' | '*' | '/'
;


