grammar Pactor;

program
: using* create_words* (statement|commands|quote)* EOF
;

using
: 'USING:' packages+=WORD* ';'    # createUsing
;

create_words
: ':' name=WORD '(' params_in+=WORD* '--' params_out+=WORD* ')' block ';'   # createWord
| '::' name=WORD '(' params_in+=WORD* '--' params_out+=WORD* ')' block ';'  # createVariableWord
;

block
: (statement|commands|quote|block_commands)*
;

commands
: quote quote 'if'                    # createIf
| quote 'when'                        # createWhen
| quote 'times'                       # createTimes
;

quote
: '[' block ']' # createQuote
;

block_commands
: '->' variable=WORD                  # createLocalVars
| '->' '(' variables+=WORD+ ')'       # createLocalVars
;

statement
: value=NUMBER             # pushNumberToStack
| value=FLOAT              # pushFloatToStack
| value=STRING             # pushStringToStack
| value=EXPRESSIONS        # pushExpressionToStack
| value=BOOLEAN            # pushBooleanToStack
| value=(WORD|MATH_WORDS)  # commandRun
;

EXPRESSIONS
: '=' | '<' | '>' | '<=' | '>=' | '!=' | 'not' | 'and' | 'or'
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
: [a-z0-9_]+ '?'*
;

MATH_WORDS
: '+' | '-' | '*' | '/'
;

WS
: [ \n\r\t,]+ -> skip
;