# Maratona Java - DevDojo

🚀 Este repositório contém os exercícios práticos feitos durante a Maratona Java do canal DevDojo, com foco em aprendizado dos fundamentos da linguagem Java.

---

## 👨‍💻 Tópicos estudados até agora

### ✅ Aulas 10 a 26 — O que aprendi

**Aula 10 a 14 – Tipos Primitivos e Strings**

- Entendi os principais tipos primitivos: `int`, `double`, `char`, `boolean`
- Aprendi sobre o tipo `String` (que não é primitivo)
- Usei casting para conversões de tipos
- Pratiquei a declaração de variáveis e nomes significativos
- Realizei exercícios para fixar

**Aula 15 a 19 – Operadores**

- Usei operadores aritméticos: `+`, `-`, `*`, `/`, `%`
- Trabalhei com operadores relacionais: `>`, `<`, `==`, `!=`, `<=`, `>=`
- Entendi os operadores lógicos: `&&` (E), `||` (OU)
- Aprendi operadores de atribuição: `=`, `+=`, `-=`, etc.
- Combinei operadores em expressões mais complexas

**Aula 20 a 24 – Estruturas Condicionais**

- Usei `if`, `else if`, `else` para controle de fluxo
- Aprendi o operador ternário `(condição ? valor1 : valor2)`
- Compreendi a lógica da tabela verdade com exemplos reais
- Resolvi exercícios que combinam várias estruturas condicionais

**Aula 25 a 26 – Comando switch**

- Usei o `switch` para avaliar múltiplos casos
- Fiz exercícios práticos para substituir `if/else` por `switch`
- Entendi como o `break` funciona dentro do `switch`

---

### ✅ Aulas 26 a 31 — O que aprendi

**Aula 26 – Estruturas Condicionais com switch**

- Aprendi a usar o `switch` para substituir vários `if/else` quando há muitas condições a verificar
- Entendi como o `switch` deixa o código mais organizado e fácil de ler
- Aprendi o uso do `break` para evitar a execução contínua dos casos

**Aula 27 – Laços de repetição: `while`, `do-while` e `for`**

- Entendi a diferença entre os principais tipos de laços: `while` (condição antes), `do-while` (condição depois) e `for` (controle completo do loop)
- Aprendi quando usar cada tipo dependendo da situação e necessidade

**Aula 28 – Exercícios práticos com for**

- Pratiquei a criação de laços `for` com diferentes incrementos e condições
- Reforcei o controle do fluxo de repetição para resolver problemas práticos

**Aula 29 – Uso do break em loops**

- Aprendi a interromper um laço antes do fim usando `break` quando uma condição é satisfeita
- Entendi como isso pode otimizar o código evitando repetições desnecessárias

**Aula 30 – Exercícios aplicando break**

- Coloquei em prática o uso do `break` em situações reais, melhorando o desempenho dos loops
- Vi exemplos concretos de quando o `break` é útil para sair de laços

**Aula 31 – Uso do continue em loops**

- Aprendi a usar `continue` para pular a iteração atual do loop e seguir para a próxima
- Entendi que o `continue` ajuda a controlar melhor o fluxo sem sair totalmente do laço

---

### ✅ Aulas 32 a 38 — Estudo de Arrays em Java

**Aula 32 – Declaração e inicialização de arrays unidimensionais**

- Aprendi a declarar arrays do tipo primitivo e inicializar seus elementos
- Entendi como acessar e modificar valores em posições específicas do array

**Aula 33 – Arrays de Strings e iteração com for**

- Trabalhei com arrays do tipo `String`
- Usei laços `for` tradicionais para percorrer os arrays e imprimir seus elementos

**Aula 34 – Inicialização direta de arrays**

- Estudei como criar arrays já inicializados com valores pré-definidos
- Comparei diferentes formas de inicialização de arrays unidimensionais

**Aula 35 – Uso do laço foreach para percorrer arrays**

- Aprendi a usar o laço aprimorado `foreach` para iterar elementos de forma mais simples
- Pratiquei a leitura dos elementos sem usar índices explicitamente

**Aula 36 – Introdução a arrays multidimensionais**

- Entendi o conceito de arrays dentro de arrays, formando matrizes
- Declarei arrays bidimensionais e inicializei seus elementos manualmente

**Aula 37 – Percorrendo arrays multidimensionais com laços aninhados**

- Usei laços `for` aninhados para iterar linhas e colunas de uma matriz
- Aprendi a acessar cada elemento dentro da estrutura multidimensional

**Aula 38 – Uso de laços foreach aninhados para arrays multidimensionais**

- Simplifiquei a iteração em arrays multidimensionais usando `foreach` aninhados
- Fixei a manipulação de estruturas complexas de dados

---

### ✅ Aulas 39 a 40 — Introdução a Classes e Objetos

**Aula 39 – Criando a classe `Estudante`**

- Criei uma classe `Estudante` com atributos públicos: `nome` (String), `idade` (int) e `sexo` (char)
- Entendi que uma classe é um molde para criar objetos que armazenam dados relacionados

**Aula 40 – Testando objetos da classe `Estudante`**

- Criei objetos da classe `Estudante` e atribuí valores aos seus atributos
- Usei esses objetos para armazenar e imprimir informações diferentes para cada estudante
- Entendi que cada objeto tem seus próprios dados independentes de outros objetos da mesma classe

---

## 📁 Estrutura do Projeto
```bash
src/
└── AcademyDev/
    ├── Aula01Dev.java
    ├── Aula02TiposPrimitivos.java
    ├── Aula03Variaveis.java
    ├── Aula04Operadores.java
    ├── Aula05Condicionais.java
    ├── Aula06Switch.java
    ├── Aula07Arrays01.java
    ├── Aula08ArraysMultidimensionais01.java  (Aula 38)
    ├── Aula08ArraysMultidimensionais02.java  (Aula 38)
    ├── Aula09Laços.java
    ├── Aula10Funcoes.java
    ├── Aula26SwitchExercicio.java
    ├── Aula27Repeticao.java
    ├── Aula31Continue.java
    ├── Aula32Arrays01.java
    ├── Aula33Arrays02.java
    ├── Aula34Arrays03.java
    ├── Aula35ArraysMultidimensionais01.java
    ├── Aula39Estudante.java  (Aula 39 - classe Estudante)
    ├── Aula40EstudanteTest01.java  (Aula 40 - teste 1)
    ├── Aula40EstudanteTest02.java  (Aula 40 - teste 2)
    └── (próximas aulas...)
