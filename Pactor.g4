grammar Pactor;

program
: create_words* (statement|commands|quote)* EOF
;

create_words
: name=WORD '(' params_in+=WORD* '--' params_out+=WORD* ')' ':' body=statement+ ';'  # createWord
;

commands
: quote quote 'if' # createIf
| quote 'when'                        # createWhen
| quote 'times'                       # createTimes
;

quote
: '[' statement* ']' # createQuote
;

statement
: value=NUMBER             # pushNumberToStack
| value=FLOAT              # pushFloatToStack
| value=STRING             # pushStringToStack
| value=BOOLEAN            # pushBooleanToStack
| value=(WORD|MATH_WORDS)  # commandRun
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

BOOLEAN
: ('t'|'f')
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