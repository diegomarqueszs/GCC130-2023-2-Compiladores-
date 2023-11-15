grammar MinhaGramatica;

DEC: 'DECLARACOES';
ALG: 'ALGORITMO';
TIPO: 'int' | 'real';
ATR: 'atribuir';
A: 'a';
AP: '(';
FP: ')';
ESC: 'ESCREVA';

ID: LETRA(DIGITO | LETRA)*;
NUM: DIGITO+('.' DIGITO+)?;
OP_ARIT: '+'|'-'|'*'|'/';

// Define as regras de tokens
fragment LETRA: [a-zA-Z];
fragment DIGITO: [0-9];

// Ignora espaços em branco
WS: [ \t\r\n]+ -> skip;