grammar PatoGr;

DEC: 'DECLARACOES';
ALG: 'ALGORITMO';
TIPO: 'int' | 'real';
ATR: '<-';
A: 'a';
AP: '(';
FP: ')';
ESC: 'ESCREVA';

ID: LETRA(DIGITO | LETRA)*;
NUM: DIGITO+('.' DIGITO+)?;
OP_ARIT: '+'|'-'|'*'|'/';
OP_LOG: '<!>' | '<>' ; // diferente | igual 


// Define as regras de tokens
fragment LETRA: [a-zA-Z];
fragment DIGITO: [0-9];

// Ignora espaços em branco
WS: [ \t\r\n]+ -> skip;