grammar PATO;

Tipo: 'qint' | 'qbool' | 'qdouble' | 'qchar' | 'if' | 'else';
Rep:  'while' | 'for';
Atr: '<-';
OpArit: '+' | '-' | '*' | '/' | '%';

AQ: '<quack>';
FQ: '</quack>';
AP: '(';
FP: ')';
OpRel: '<' |  '<>' | '<!>' |  '>';
OpBool: 'E' | 'OU';

Var: LETRA(DIGITO | LETRA)*;
NumI: DIGITO;
NumR: DIGITO + ('.' DIGITO+)?;

// Define as regras de tokens
fragment LETRA: [a-zA-Z];
fragment DIGITO: [0-9];

// Ignora espaços em branco
WS: [ \t\r\n]+ -> skip;
