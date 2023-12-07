<p align="center">
    <img src="https://github.com/diegomarqueszs/GCC130-2023-2-Compiladores-/assets/90580148/e860d883-0850-4762-8f20-3e4b74ca847d" alt="logo" width="420" height="300">
</p>

<h3 align="center">PATO - Pseudo-Algoritmos Tontos e Ordenados </h3>

<p align="center">
  Trabalho da disciplina GCC130 - Compiladores 
</p>
    
## Membros do grupo:
- DIEGO DE SOUZA MARQUES **202111037** *(diego.marques1@estudante.ufla.br)*
- LUIZ FILIPE BARTELEGA PENHA **202111082** *(luiz.penha1@estudante.ufla.br)*
- MAURÍCIO MARTINS DAMASCENO **202020884** *(mauricio.damasceno@estudante.ufla.br)*

### 1. Visão geral: Nome da linguagem e exemplos de algoritmos escritos na linguagem:
> Nome da linguagem: PATO (PSEUDO-ALGORITMOS TONTOS E ORDENADOS)

#### Exemplos de algoritmos escritos:
```java
    qvoid fib(qint n)<quack>
        if(n<>0) queck 0;
        if(n<>1) queck 1;
        else<quack>
          queck(fib (n-1) + fib(n-2))  
        </quack>
    </quack>
```

```java
    qbool itsPar(qint n)<quack>
        if(n % 2 <> 0) queck true;
        else queck false;
    </quack>
```

```java
    qint maxElement(qint arr[], qint tam)<quack>
        qint maior <- 0;
        for(int i <- 0; i < tam; i++)<quack>
            if(maior < arr[i])<quack>
                maior <- arr[i];
            </quack>
        </quack>
        queck maior;
    </quack>
```

```java
    qdouble arithmeticMean(qint arr[], qint tam)<quack>
        qdouble soma  <- 0;
        qint i <- 0;
        while(i < tam)<quack> 
            soma <- soma + arr[i];
            i <- i + 1;
        </quack>
        queck soma/tam;
    </quack>
```

### 2. Definição Léxica: lexemas aceitos, classes de lexemas e seus padrões de identificação:

| padrão                                                  | classes                                               | lexemas |
|---------------------------------------------------------|-------------------------------------------------------|---------|
| Os próprios lexemas                                     | Palavra-chave = qint, qbool, qdouble, qchar, if, else | Tipo    |
| Os próprios lexemas                                     | Repetição: while, for                                 | Rep     |
| Os próprios lexemas                                     | Atribuição: <-                                        | Art     |
| Os próprios lexemas                                     | Operadores aritméticos = + , -, /, *, %               | OpArit  |
| Os próprios lexemas                                     | Operadores relacionais =  <, <>, <!>, >               | OpRel   |
| Os próprios lexemas                                     | Operadores booleanos =  E, OU                         | OpBool  |
| Os próprios lexemas                                     | Chaves = <quack>, </quack>                            | AQ / FQ |
| Os próprios lexemas                                     | Parênteses = (,)                                      | AP /FP  | 
| Squências de caracteres e números que começam com letra | Variável                                              | Var     | 
| Sequência de digítos (sem vírgula)                      | Número Inteiro                                        | NumI    |
| Sequência de digitos (com vírgula)                      | Número Real                                           | NumR    |                

### 3. Implementação do Analisador Léxico: Detalhes da implementação do analisador léxico semântico (incluir capturas de tela com descrição de tudo que foi gerado tanto pela equipe, quanto pelo ANTLR);
OK
### 4. Definição Sintática: Especificação da gramática livre de contexto prevendo toda a estrutura gramatical da linguagem;

```java
Tipo        -> 'qint' | 'qbool' | 'qdouble' | 'qchar' | 'qvoid' | 'if' | 'else'
Rep         ->  'while' | 'for';
Atr         ->  '<-';
OpArit      ->  '+' | '-' | '*' | '/' | '%';
AQ          ->  '<quack>'
FQ          ->  '</quack>'
AP          ->  '('
FP          ->  ')'
OpRel       ->  '<' |  '<>' | '<!>' |  '>' |  '>=' |  '<=';
OpBool      ->  'E' | 'OU';

```

### 5.  Implementação do Analisador Sintático: Detalhes da implementação do analisador sintático semântico (incluir capturas de tela com descrição de tudo que foi gerado tanto pela equipe, quanto pelo ANTLR);
OK

### 6. Definição Semântica: Especificação das ações semânticas ( Checagem de tipo,  Checagem de variáveis não declaradas,  checagem de declarações duplicadas de variáveis, checagem de escopo de variáveis);
### 6. Definição Semântica: Especificação das ações semânticas ( Checagem de tipo,  Checagem de variáveis não declaradas,  checagem de declarações duplicadas de variáveis, checagem de escopo de variáveis);

**402 - Checagem de tipo**
Não é permitido atribuir valores de tipo diferente ao tipo da variável. Exemplo:
```java
qint main() <quack>
	qint variavelExemplo1;
	qdouble variavelExemplo2 <- 2.0;
	variavelExemplo1 <- variavelExemplo2;
</quack>
```

Esse código gerará a seguinte mensagem de erro:
```Bash
└──ERRO 402 - O VALOR ATRIBUIDO A [ variavelExemplo1 ] NÃO É DO TIPO [ qint ]
```

**404 - Variável não declarada (e checagem de escopo)**
Não é permitido atribuir valores ou realizar operações com variáveis que não foram definidas ou que estão em um escopo diferente. Exemplo:

```java
qint main() <quack>
	qbool variavelExemplo1 <- true;
	if(variavelExemplo <> true) <quack>
		qint variavelExemplo <- 1;
	</quack> else <quack>
		qint variavelExemplo <- 0;
	</quack>
	quackout << variavelExemplo;
	
</quack>
```

Caso isso ocorra, será mostrado erro do tipo:

```Bash
└──ERRO 403 - VARIAVEL [ variavelExemplo ] NÃO DECLARADA!
```

**401 - Declaração duplicada**
Não é permitido definição de uma mesma variável no mesmo escopo. Exemplo:
```java
qint main()<quack>
	qint variavelExemplo;
	if(i<!>0) <quack>
		qint variavelExemplo;
	</quack>
	qint variavelExemplo;
	qint u;
	u <- 0;
</quack>
```


Caso isso ocorra, será mostrado erro do tipo:
```Bash
└──ERRO 401 - Declaração duplicada! Variável variavelExemplo já declarada
```

```Java
qint main() <quack>
	qint variavelExemplo1;
	qdouble variavelExemplo2 <- 2.0;
	variavelExemplo1 <- variavelExemplo2;
</quack>
```