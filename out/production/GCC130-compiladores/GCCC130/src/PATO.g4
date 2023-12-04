grammar PATO;

// Definição sintática
main: (blocoFunc)* EOF #NRegraIinicio;
//Corpo da funcao
blocoFunc: Tipo Var AP parametros FP escopoFunc #NRegraBlocoDeFuncao;
parametros: (Tipo Var (',' Tipo Var)*)?  #RegraParametros; // Lista de parâmetros de função
escopoFunc: AQ (declaracao | comandos | condicoes | retorno | atribuicao | funcao)+ FQ #NRegraEscopoDeclaracao;

declaracao: Tipo Var (Atr expressao)? DELIM #RegraDeclaracao;
retorno: RTN ( expressao | atribuicao | AP funcao OpArit funcao? FP ) DELIM #RegraRetorno;
funcao: Var AP expressao  FP DELIM #RegraFuncao;
atribuicao: Var Atr expressao DELIM? #RegraAtribuicao;
expressao: termo (OpArit termo)* #RegraExpressao;
termo: fator (OpArit fator)* #RegraTermo;
fator: Var #RegraFatorVariavel | Numero #RegraFatorNumero | funcao #RegraFatorFuncao;
comandos: input #RegraComandosInput| output #RegraComandosOutput;
condicoes: Cond (AP  parametrosCondicao (OpBool  parametrosCondicao)* FP)? ( retorno | escopoFunc ) #RegraCondicoes;
parametrosCondicao: expressao OpRel  expressao #RegraParametrosDeCondicoes;
input: QIN OPIN Var (OPIN Var)* DELIM #RegraInput;
output: QOUT OPOUT (expressao | Var) DELIM #RegraOutput;

// Definição léxica
Tipo: 'qint' | 'qbool' | 'qdouble' | 'qchar' | 'qvoid'; // Tipos de variáveis
Numero: NumI | NumR; // Números inteiros ou reais
//Func: 'func'; // Palavra-chave para definir função
RTN: 'queck'; // Palavra-chave para retorno
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
OPIN: '>>'; // Operadores de entrada;
OPOUT: '<<'; // Operadores de saída

Var: LETRA(DIGITO | LETRA)*; // Variável
NumI: DIGITO; // Números inteiros
NumR: DIGITO + ('.' DIGITO+)?; // Números reais

// Define as regras de tokens
fragment LETRA: [a-zA-Z];
fragment DIGITO: [0-9];

COMMENT: '//' ~[\r\n]* -> skip; // Ignora comentários de linha única

// Ignora espaços em branco
WS: [ \t\r\n]+ -> skip;
