### 1. Visão geral: Nome da linguagem e exemplos de algoritmos escritos na linguagem:
> Nome da linguagem: PATO (PSEUDO-ALGORITMOS TONTOS E ORDENADOS)

#### Exemplos de algoritmos escritos:
```java
    void fib(qint n)<quack>
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
Tipo    -> qint | qbool | qdouble | qchar | if | else
Rep     ->  while | for;
Atr     ->  <-
OpArit  ->  + | - | * | / | %;
AQ      ->  <quack>
FQ      ->  </quack>
AP      ->  (
FP      ->  )
OpRel:  ->  < |  <> | <!> |  >
OpBool: ->  E | OU;
```

### 5.  Implementação do Analisador Sintático: Detalhes da implementação do analisador sintático semântico (incluir capturas de tela com descrição de tudo que foi gerado tanto pela equipe, quanto pelo ANTLR);