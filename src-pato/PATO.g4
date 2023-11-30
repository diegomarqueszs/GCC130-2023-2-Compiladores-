grammar PATO;
// Definição semântica
main: (blocoFunc)* EOF;
blocoFunc: Func Tipo Var '(' parametros ')' '{' escopoFunc '}';
parametros: (Tipo Var',' parametros)?; //duvida
escopoFunc: ((Tipo Var)* ';')? | operacoes? | condicoes? | return?;
return: RTN;
operacoes: OpArit? | OpRel? | Atr?;
condicoes: Cond | OpBool?;

//Tirar duvida com maumau
//valor: ();
input: 'quackin' '('(Var)')'';';
output: 'quackout' '('valor')'';';


// Definição sintática
Tipo: 'qint' | 'qbool' | 'qdouble' | 'qchar' | 'qvoid';
Rep:  'while' | 'for';
Cond: 'if' | 'else' ;
Atr: '<-';
OpArit: '+' | '-' | '*' | '/' | '%';
Func: 'func';

RTN: 'return';
AQ: '<quack>';
FQ: '</quack>';
AP: '(';
FP: ')';
OpRel: '<' |  '<>' | '<!>' |  '>' |  '>=' |  '<=';
OpBool: 'E' | 'OU';
DELIM: ';';
COMMA: ',';

QIN: 'quackin';
QOUT:'quackout';

Var: LETRA(DIGITO | LETRA)*;
NumI: DIGITO;
NumR: DIGITO + ('.' DIGITO+)?;

// Define as regras de tokens
fragment LETRA: [a-zA-Z];
fragment DIGITO: [0-9];

// Ignora espaços em branco
WS: [ \t\r\n]+ -> skip;
