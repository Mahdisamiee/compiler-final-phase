grammar lulu2_grammer;
program : ft_dcl? ft_def+;
ft_dcl  : 'declare' '{' (func_dcl | type_dcl | var_def)+ '}';
func_dcl: ('(' args ')' '=')? ID '(' (args | args_var)? ')' ';';
args    : type ( '[' ']' )* | args ',' type ( '[' ']' )*;
args_var: type ( '[' ']' )* ID | args_var ',' type ( '[' ']' )* ID;
type_dcl: ID ';';
var_def : 'const'? type var_val ( ',' var_val )* ';';
var_val : ref ( '=' expr)?;
ft_def  : ( type_def | fun_def );
type_def: type ID ( ':' ID )? '{' component+ '}';
component: access_modifier? ( var_def | fun_def );
access_modifier: 'private' | 'public' | 'protected';
fun_def : ( '(' args_var ')' '=' )? 'function' ID '(' args_var? ')' block;
block   : '{' ( var_def | stmt )* '}';
stmt    : assign ';' | func_call ';' | cond_stmt | loop_stmt | 'break' ';' | 'continue' ';' | 'destruct' ( '[' ']' )* ID ';';
assign  : ( var | '(' var ( ',' var )* ')' ) '=' expr;
var     : ( ( 'this' | 'super' ) '.' )? ref ( '.' ref )*;
ref     : ID ( '[' expr ']' )*;

expr: unary_op expr | expr op1 expr | expr op2 expr| expr op3 expr | expr op4 expr | expr bitwise expr | expr logical expr
| '(' expr ')' |  const_val | 'allocate' handle_call | func_call | var | list | Nil;

func_call: ( var '.' )? handle_call | 'read' '(' ')' | 'write' '(' expr ')';
list    : '[' ( expr | list ) ( ',' ( expr | list ) )* ']';
handle_call: ID '(' params? ')';
params  : expr | expr ',' params;
cond_stmt: 'if' expr ( block | stmt ) ( 'else' ( block | stmt ) )? | 'switch' var '{' switch_body '}'; // here we had another error that was "if( expr)" is wrong and "if expr" is true
switch_body: ( 'caseof' INT_CONST ':' block )+ ( 'default' ':' block )?;
loop_stmt: 'for' ( type? assign )? ';' expr ';' assign? block | 'while' expr block;
type    : 'int' | 'bool' | 'float' | 'string' | ID;
const_val: INT_CONST | REAL_CONST | BOOL_CONST | STRING_CONST;
unary_op: '-' | '!' | '~';
op1: '*' | '/' | '%';
op2: '+' | '-';
op3: '<=' | '>=' | '<' | '>';
op4: '==' | '!=';
bitwise: '&' | '|';
logical: '||' | '&&';


ID      : [@_A-Za-z]+[@_A-Za-z0-9]*;
INT_CONST: ('0' [xX] [0-9a-fA-F]+) | ([0-9]+);
REAL_CONST: ((INT_CONST? '.' INT_CONST) | (INT_CONST '.') ) ('^' [+-]? INT_CONST)?; //an error acured here because of 'e' .we must used from '^' instead of 'e'
BOOL_CONST: 'true' | 'false' ;
STRING_CONST: '\'' ([a-zA-Z0-9] | WS | ('`'|'~'|'!'|'@'|'#'|'$'|'%'|'^'|'*'|'('|')'|'_'|'-'|'='|'+'|'/'|'\\'|'"'|']'|'['|'{'|'}'|'.'|','|':'|';'|'|'|'&'|'?'|'<'|'>') | ESCAPE | HEX )* '\'';
ESCAPE  : '\\' ('\'' | 't' | '0' | '\\' | 'r' );
HEX     : '\\' [xX] [A-Fa-f0-9] [A-Fa-f0-9];

WS      : [\t\r\n ]+ -> skip;
BLOCK_COMMENT: '#(' .*? ')#' -> skip;
LINE_COMMENT: '#$' ~[\r\n]* -> skip;