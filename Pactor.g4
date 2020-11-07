grammar Pactor;

program
: using* create_words* (statement|quote|array|dictionary)* EOF
;

using
: 'USING:' packages+=WORD* ';'    # createUsing
;

create_words
: ':' name=WORD '(' params_in+=WORD* '--' params_out+=WORD* ')' block ';'   # createWord
| '::' name=WORD '(' params_in+=WORD* '--' params_out+=WORD* ')' block ';'  # createVariableWord
;

block
: (statement|quote|block_commands|array|dictionary)*
;

array
: '(' statement* ')' # createArray
;

dictionary
: '{' dictionary_entry* '}' # createDictionary
;

dictionary_entry
: key_value (quote|statement) # createDictionaryEntry
;

quote
: '[' block ']' # createQuote
;

block_commands
: '->' variable=WORD                  # createLocalVars
| '->' '(' variables+=WORD+ ')'       # createLocalVars
;

statement
: non_key_value
| key_value
;

non_key_value
: value=FLOAT              # pushFloatToStack
| value=EXPRESSIONS        # pushExpressionToStack
| value=BOOLEAN            # pushBooleanToStack
| value=(WORD|MATH_WORDS)  # commandRun
;

key_value
: value=NUMBER             # pushNumberToStack
| value=STRING             # pushStringToStack
| ':' value=WORD         # pushSymbolToStack
;


COMMENT
:  '#'+ ~( '\r' | '\n' )* -> skip
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
: [a-z0-9_]+ ([a-z0-9_>])* '?'*
;

MATH_WORDS
: '+' | '-' | '*' | '/'
;

WS
: [ \n\r\t,]+ -> skip
;