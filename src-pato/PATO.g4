grammar PATO;

// Definição sintática
main: (blocoFunc)* EOF;
blocoFunc: Func Tipo Var '(' parametros ')' '{' escopoFunc '}';
parametros: Tipo Var (',' Tipo Var)*; // Lista de parâmetros de função
escopoFunc: (declaracao | comandos | condicoes | retorno | atribuicao)+;
declaracao: Tipo Var ';';
retorno: RTN;
atribuicao: Var Atr expressao ';';
expressao: termo (OpArit termo)*;
termo: fator (OpArit fator)*;
fator: Var | Numero;
comandos: OpArit | input | output;
condicoes: Cond | OpBool;
input: QIN OPIO '(' Var (',' Var)* ')' ';';
output: QOUT OPIO '(' Var (',' Var)* ')' ';';

// Definição léxica
Tipo: 'qint' | 'qbool' | 'qdouble' | 'qchar' | 'qvoid'; // Tipos de variáveis
Numero: NumI | NumR; // Números inteiros ou reais
Func: 'func'; // Palavra-chave para definir função
RTN: 'return'; // Palavra-chave para retorno
AQ: '<quack>'; // Abre chaves
FQ: '</quack>'; // Fecha chaves
AP: '('; // Abre parêntese
FP: ')'; // Fecha parêntese
OpRel: '<' |  '<>' | '<!>' |  '>' |  '>=' |  '<='; // Operadores relacionais
OpBool: 'E' | 'OU'; // Operadores lógicos
Cond: 'if' | 'else' ;   //operadores condicionais
OpArit: '+' | '-' | '*' | '/' | '%';    //operadores aritiméticos
DELIM: ';'; // Final de linha
COMMA: ','; // Separador de parâmetros

Atr: '<-';  //atribuição
QIN: 'quackin'; // Palavra-chave para entrada de dados
QOUT:'quackout'; // Palavra-chave para saída de dados
OPIO: '<<' | '>>'; // Operadores de entrada e saída

Var: LETRA(DIGITO | LETRA)*; // Variável
NumI: DIGITO; // Números inteiros
NumR: DIGITO + ('.' DIGITO+)?; // Números reais

// Define as regras de tokens
fragment LETRA: [a-zA-Z];
fragment DIGITO: [0-9];

// Ignora espaços em branco
WS: [ \t\r\n]+ -> skip;
