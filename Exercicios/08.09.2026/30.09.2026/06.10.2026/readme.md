# Hands on - 06/10

🏁 “Bora transformar lógica em solução: começa agora!”

### 1. Sentinela – Maior e menor valor

Faça um programa que leia números inteiros repetidamente.

A leitura deve ser encerrada quando o usuário digitar **0**. O valor `0` funciona apenas como sentinela e **não deve ser considerado nos cálculos**.

Ao final, mostre:

* o maior número digitado;
* o menor número digitado.

***

### 2. Contagem de valores

Faça um programa que leia **10 números inteiros**.

Ao final, informe:

* quantidade de números positivos;
* quantidade de números negativos;
* quantidade de zeros.

***

### 3. Soma de 1 até N

Faça um programa que leia um número inteiro positivo `N`.

Utilizando uma estrutura de repetição, calcule e mostre a soma de todos os números inteiros de `1` até `N`.

Exemplo:

```
Entrada:
5

Saída:
Soma = 15
```

***

### 4. Contagem regressiva e soma

Faça um programa que leia um número inteiro positivo `N`.

O programa deverá:

1. mostrar uma contagem regressiva de `N` até `1`;
2. calcular a soma de todos os números exibidos;
3. mostrar o resultado da soma ao final.

Exemplo:

```
Entrada:
5

Saída:
5 4 3 2 1
Soma = 15
```

***

### 5. Fatorial

Faça um programa que calcule e mostre os fatoriais dos números de **1 até 10**.

O fatorial de um número `n` é definido por:

```
n! = n × (n - 1) × (n - 2) × ... × 1
```

Exemplos:

```
3! = 3 × 2 × 1 = 6
5! = 5 × 4 × 3 × 2 × 1 = 120
```

***

### 6. Cálculo da série E

Faça um programa que leia um número inteiro positivo `N` e calcule o valor da seguinte expressão:

```
E = 1 + 1/1! + 1/2! + 1/3! + ... + 1/N!
```

Ao final, mostre o valor calculado de `E`.

***

### 7. Pesquisa da Prefeitura

A prefeitura de uma cidade realizou uma pesquisa com seus habitantes. Para cada pessoa foram coletados:

* salário;
* número de filhos.

Faça um programa que leia os dados dos habitantes e determine:

a) a média salarial da população;\
b) a média do número de filhos;\
c) o maior salário informado;\
d) o percentual de pessoas com salário de até **R$ 100,00**.

A entrada de dados deve ser encerrada quando for informado um **salário negativo**.

O salário negativo é apenas um valor sentinela e não deve participar dos cálculos.

***

### 8. Crescimento de Chico e Zé

Chico possui atualmente **1,50 m** de altura e cresce **2 cm por ano**.

Zé possui atualmente **1,10 m** de altura e cresce **3 cm por ano**.

Faça um programa que determine quantos anos serão necessários para que **Zé fique mais alto que Chico**.

Ao final, mostre:

* quantidade de anos necessários;
* altura final de Chico;
* altura final de Zé.

***

### 9. Eleição

Em uma eleição presidencial existem quatro candidatos.

Cada voto é representado por um código:

```
1 → Candidato 1
2 → Candidato 2
3 → Candidato 3
4 → Candidato 4
5 → Voto nulo
6 → Voto em branco
0 → Encerrar votação
```

Faça um programa que leia os códigos dos votos até que seja informado o valor `0`.

Ao final, mostre:

* total de votos do candidato 1;
* total de votos do candidato 2;
* total de votos do candidato 3;
* total de votos do candidato 4;
* total de votos nulos;
* total de votos em branco.

O código `0` não deve ser contabilizado como voto.

***

### 10. Progressão Aritmética

Faça um programa que leia:

* `N`: quantidade de termos de uma Progressão Aritmética;
* `A1`: primeiro termo da progressão;
* `R`: razão da progressão.

O programa deverá:

1. gerar os `N` termos da Progressão Aritmética;
2. mostrar cada termo gerado;
3. calcular e mostrar a soma de todos os termos.

**Fórmula do termo geral:**&#x20;

```
an = a1 + (n - 1) * r
```

Onde:

* `an` = termo que se deseja encontrar;
* `a1` = primeiro termo;
* `n` = posição do termo;
* `r` = razão da PA.

**Soma dos termos de uma PA**

```
Sn = n * (a1 + an) / 2
```

Onde:

* `Sn` = soma dos termos;
* `n` = quantidade de termos;
* `a1` = primeiro termo;
* `an` = último termo.

Exemplo:

```
N = 5
A1 = 2
R = 3

PA:
2 5 8 11 14

Soma = 40
```

***

### 11. Tabuada

Faça um programa que leia **20 números inteiros**.

Para cada número `N` informado, mostre sua tabuada de `1` até `N`.

Exemplo para `N = 5`:

```
1 x 5 = 5
2 x 5 = 10
3 x 5 = 15
4 x 5 = 20
5 x 5 = 25
```

***

### 12. Pesquisa sobre características da população

Foi realizada uma pesquisa sobre algumas características físicas dos habitantes de uma determinada região.

Para cada pessoa devem ser informados:

* sexo: `M` para masculino ou `F` para feminino;
* cor dos olhos: azuis, verdes ou castanhos;
* cor dos cabelos: louros, castanhos ou pretos;
* idade.

Faça um programa que determine:

a) a maior idade entre todos os habitantes pesquisados;

b) a quantidade de mulheres que:

* tenham idade entre **18 e 35 anos**, inclusive;
* possuam olhos verdes;
* possuam cabelos louros.

A pesquisa deve ser encerrada quando for informada a idade `-1`.

***

### 13. Atualização de preços

Uma empresa decidiu aumentar em **20%** o preço de seus produtos.

Para cada produto, leia:

* código;
* preço atual.

O programa deverá:

1. calcular o novo preço com aumento de 20%;
2. mostrar o código e o novo preço de cada produto.

Ao final, calcule e mostre:

* média dos preços antes do aumento;
* média dos preços após o aumento.

A entrada deverá ser encerrada quando for informado um **código negativo**.

***

### 14. Números entre 1000 e 1999

Faça um programa que percorra todos os números inteiros de **1000 até 1999**.

Mostre apenas os números que, quando divididos por `11`, apresentem **resto igual a 5**.

***

### 15. Série harmônica

Faça um programa que leia um número inteiro positivo `N` e calcule a seguinte soma:

```
S = 1 + 1/2 + 1/3 + 1/4 + ... + 1/N
```

O programa deverá mostrar:

* cada termo da série;
* o valor final de `S`.

Exemplo para `N = 4`:

```
1 + 1/2 + 1/3 + 1/4

S = 2.08
```

***

### 16. Números perfeitos

Um número é considerado **perfeito** quando é igual à soma de seus divisores positivos, excluindo o próprio número.

Exemplos:

```
6 = 1 + 2 + 3

28 = 1 + 2 + 4 + 7 + 14
```

Faça um programa que encontre e mostre os **cinco primeiros números perfeitos**.

***

### 17. Estatística de acidentes de trânsito

Foi realizada uma pesquisa nas **200 principais cidades brasileiras**.

Para cada cidade foram coletadas as seguintes informações:

* código da cidade;
* estado;
* número de veículos de passeio;
* número de acidentes de trânsito com vítimas.

Faça um programa que determine:

a) o maior número de acidentes e o código da cidade correspondente;

b) o menor número de acidentes e o código da cidade correspondente;

c) a média do número de veículos das 200 cidades;

***

### 18. Conceito final dos alunos

Uma turma possui **75 alunos**.

Para cada aluno devem ser informados:

* número de matrícula;
* nota numérica final.

| Conceito | Notas       |
| -------- | ----------- |
| A        | acima de 9  |
| B        | 7 a 9       |
| C        | 5 a 7       |
| D        | Abaixo de 5 |

Para cada estudante, mostre:

```
Matrícula
Nota final
Conceito
```

***

### 19. Faixa etária

Faça um programa que leia a idade de **15 pessoas**.

Classifique cada pessoa em uma das seguintes faixas:

| Faixa | Idade           |
| ----- | --------------- |
| 1     | Até 15 anos     |
| 2     | De 16 a 30 anos |
| 3     | De 31 a 45 anos |
| 4     | De 46 a 60 anos |
| 5     | 61 anos ou mais |

Ao final, mostre:

a) a quantidade de pessoas em cada faixa etária;

b) o percentual de pessoas da **primeira faixa** em relação ao total;

c) o percentual de pessoas da **última faixa** em relação ao total.

***

### 20. Cálculo de série

Faça um programa que leia:

* a quantidade de termos da série;
* um valor positivo para `X`.

Calcule e mostre o valor da seguinte série:

```
S = -X²/1! + X³/2! - X⁴/3! + X⁵/4!
    - X⁶/3! + X⁷/2! - X⁸/1!
    + X⁹/2! - X¹⁰/3! + X¹¹/4! - ...
```

O programa deverá gerar a quantidade de termos informada pelo usuário.

Ao final, mostre o valor de `S`.

***

### 21. Folha de pagamento

Uma empresa possui **10 funcionários**.

Para cada funcionário devem ser informados:

* código;
* número de horas trabalhadas no mês;
* turno:
  * `M` — matutino;
  * `V` — vespertino;
  * `N` — noturno;
* categoria:
  * `O` — operário;
  * `G` — gerente.

Não permita a entrada de turnos ou categorias inexistentes.

Considere um salário mínimo de:

```
R$ 1621,00
```

#### Valor da hora trabalhada

| Categoria | Turno  | Valor da hora         |
| --------- | ------ | --------------------- |
| G         | N      | 18% do salário mínimo |
| G         | M ou V | 15% do salário mínimo |
| O         | N      | 13% do salário mínimo |
| O         | M ou V | 10% do salário mínimo |

Calcule o **salário inicial** utilizando:

```
salário inicial = horas trabalhadas × valor da hora
```

#### Auxílio-alimentação

| Salário inicial                      | Auxílio-alimentação    |
| ------------------------------------ | ---------------------- |
| Até R$ 1.080,00                      | 20% do salário inicial |
| Acima de R$ 1.080,00 até R$ 2.160,00 | 15% do salário inicial |
| Acima de R$ 2.160,00                 | 5% do salário inicial  |

Calcule:

```
salário final = salário inicial + auxílio-alimentação
```

Para cada funcionário, mostre:

* código;
* horas trabalhadas;
* valor da hora trabalhada;
* salário inicial;
* auxílio-alimentação;
* salário final.

***

### 22. Sequência de Fibonacci

Faça um programa que gere e mostre os **n primeiros termos** da sequência de Fibonacci.

A sequência inicia com:

```
0 1 1 2 3 5 8 13 ....
```

Cada novo termo, a partir do terceiro, é obtido pela soma dos dois termos anteriores.

***

### 23. Produção de uma fábrica

Uma fábrica possui **15 operários**, homens e mulheres.

Os trabalhadores são classificados de acordo com a quantidade de peças produzidas mensalmente.

#### Classe 1

Até 30 peças por mês.

Recebe apenas o salário mínimo.

#### Classe 2

De 31 a 50 peças por mês.

Recebe:

```
salário mínimo +
3% do salário mínimo para cada peça produzida acima de 30
```

#### Classe 3

Mais de 50 peças por mês.

Recebe:

```
salário mínimo +
5% do salário mínimo para cada peça produzida acima de 30
```

Para cada operário, leia:

* número do operário;
* quantidade de peças produzidas;
* sexo.

Calcule e mostre:

a) número e salário de cada operário;

b) total da folha de pagamento;

c) quantidade total de peças produzidas;

d) média de peças produzidas pelos homens;

e) média de peças produzidas pelas mulheres;

f) número do operário ou operária que recebeu o maior salário.

***

### 24. Mortalidade infantil

Foi realizada uma pesquisa para determinar o índice de mortalidade infantil em determinado período.

Inicialmente, leia a quantidade de crianças nascidas no período.

Para cada criança, informe:

* sexo: `M` ou `F`;
* tempo de vida.

Considere que o tempo de vida deve ser informado em **meses**.

O programa deverá calcular e mostrar:

a) percentual de crianças do sexo feminino que morreram no período;

b) percentual de crianças do sexo masculino que morreram no período;

c) percentual de crianças que viveram 24 meses ou menos.

***

### 25. Produtos, estoque e classificação de preços

Uma empresa deseja analisar **12 produtos**.

Para cada produto, leia:

* preço unitário;
* necessidade de refrigeração:
  * `S` — sim;
  * `N` — não;
* categoria:
  * `A` — alimentação;
  * `L` — limpeza;
  * `V` — vestuário.

#### 1. Custo de estocagem

Para produtos com preço de até **R$ 20,00**:

| Categoria | Custo   |
| --------- | ------- |
| A         | R$ 2,00 |
| L         | R$ 3,00 |
| V         | R$ 4,00 |

Para produtos com preço entre **R$ 20,00 e R$ 50,00**, inclusive:

| Refrigeração | Custo   |
| ------------ | ------- |
| S            | R$ 6,00 |
| N            | R$ 0,00 |

Para produtos com preço superior a **R$ 50,00**:

| Refrigeração | Categoria | Custo   |
| ------------ | --------- | ------- |
| S            | A         | R$ 5,00 |
| S            | L         | R$ 2,00 |
| S            | V         | R$ 4,00 |
| N            | A ou V    | R$ 0,00 |
| N            | L         | R$ 1,00 |

#### 2. Imposto

Se o produto atender simultaneamente às seguintes condições:

```
Categoria = A
Refrigeração = S
```

o imposto será de **4% do preço unitário**.

Para os demais produtos, o imposto será de **2% do preço unitário**.

#### 3. Preço final

Calcule:

```
preço final =
preço unitário + custo de estocagem + imposto
```

#### 4. Classificação

Classifique o produto de acordo com seu preço final:

| Preço final                     | Classificação |
| ------------------------------- | ------------- |
| Até R$ 20,00                    | Barato        |
| Acima de R$ 20,00 até R$ 100,00 | Normal        |
| Acima de R$ 100,00              | Caro          |

Para cada produto, mostre:

* preço unitário;
* custo de estocagem;
* imposto;
* preço final;
* classificação.

Ao final dos 12 produtos, mostre:

* média dos valores adicionais, considerando custo de estocagem e imposto;
* maior preço final;
* menor preço final;
* total de impostos;
* quantidade de produtos classificados como **Barato**;
* quantidade de produtos classificados como **Normal**;
* quantidade de produtos classificados como **Caro**.
