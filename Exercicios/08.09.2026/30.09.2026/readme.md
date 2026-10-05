# Hands on - 30/09

🏁 “Bora transformar lógica em solução: começa agora!”

## 1. Classificação de Jogador 🎮

Crie um programa que receba:

* idade do jogador;
* quantidade de horas jogadas por semana.

#### Regras

Se o jogador tiver menos de 12 anos→ `Jogador Mirim`

Se tiver entre 12 e 17 anos:

* até 10 horas por semana → `Jogador Casual`
* acima de 10 horas → `Jogador Frequente`

Se tiver 18 anos ou mais:

* até 5 horas → `Jogador Casual`
* entre 6 e 15 horas → `Jogador Gamer`
* acima de 15 horas → `Gamer Hardcore`

***

## 2. Plataforma de Streaming 📺

Crie um programa que apresente o seguinte menu:

```
===== STREAMING =====

1 - Netflix
2 - Disney+
3 - Prime Video
4 - Spotify
5 - Sair

Escolha uma opção:
```

Para cada opção, imprima na tela a opção escolhida e uma mensagem. Exemplo:

```
Você escolheu Netflix.
Prepare a pipoca!
```

Caso seja informada uma opção inválida:

```
Opção inválida.
```

***

## 3. Tentativas de Login 📱

Crie um programa que simule o login em uma rede social.

Considere que a senha correta seja:

```
1234
```

Enquanto a senha digitada estiver incorreta, o programa deverá continuar solicitando uma nova senha.

#### Exemplo

```
Digite sua senha:
1111

Senha incorreta.

Digite sua senha:
2222

Senha incorreta.

Digite sua senha:
1234

Login realizado com sucesso!
```

Crie uma variável para contar quantas tentativas foram realizadas.

Ao final, exiba:

```
Login realizado após 3 tentativas.
```

***

## 4. Entrada no Show 🎤

Crie um programa que verifique se uma pessoa poderá entrar em um show.

Solicite:

```
Digite sua idade:
```

Depois:

```
Possui ingresso?
1 - Sim
2 - Não
```

Caso seja menor de idade, pergunte também:

```
Está acompanhado de um responsável?
1 - Sim
2 - Não
```

#### Regras

Sem ingresso:

```
Entrada negada: ingresso obrigatório.
```

Com ingresso e idade maior ou igual a 18 anos:

```
Entrada liberada!
```

Com ingresso e idade menor que 18 anos:

* acompanhado → entrada liberada;
* desacompanhado → entrada negada.

***

***

## 5. Escolha do Rolê 🍿

Crie um programa que ajude uma pessoa a escolher um rolê para o fim de semana.

Solicite:

```
Quanto dinheiro você possui?
```

Também pergunte:

```
Está chovendo?

1 - Sim
2 - Não
```

#### Regras

Se possuir menos de R$ 20:

```
Rolê em casa.
```

Entre R$ 20 e R$ 49:

Se estiver chovendo:

```
Streaming + comida.
```

Se não estiver chovendo:

```
Praça ou parque.
```

Entre R$ 50 e R$ 99:

```
Cinema.
```

Com R$ 100 ou mais, pergunte também a idade.

Se tiver menos de 18 anos:

```
Shopping + cinema.
```

Caso contrário:

```
Show, restaurante ou churrasco com a galera.
```

***

## 6. Loja de Skins 🕹️

Crie um programa que simule uma loja de skins de um jogo.

O jogador inicia com:

```
1500 moedas
```

Apresente:

```
===== LOJA DE SKINS =====

1 - Skin Básica   - 100 moedas
2 - Skin Rara     - 250 moedas
3 - Skin Épica    - 500 moedas
4 - Skin Lendária - 1000 moedas
0 - Sair
```

O programa deverá verificar se o jogador possui moedas suficientes antes da compra.

#### Exemplo

```
Saldo: 1500 moedas

Escolha uma skin:
3

Skin Épica comprada!

Saldo restante: 1000 moedas
```

Caso não tenha moedas suficientes:

```
Saldo insuficiente.
```

O menu deverá continuar aparecendo até que o jogador escolha `0`.

***

## 7. Lanchonete Universitária 🍕

Crie um programa que simule um sistema de pedidos.

Apresente:

```
===== LANCHONETE =====

1 - Pizza         - R$ 30,00
2 - Hambúrguer    - R$ 20,00
3 - Batata        - R$ 12,00
4 - Refrigerante  - R$ 8,00
0 - Finalizar
```

O usuário poderá realizar vários pedidos.

#### Regras de desconto

Valor abaixo de R$ 50:

```
Sem desconto.
```

Entre R$ 50 e R$ 99:

```
5% de desconto.
```

A partir de R$ 100, pergunte:

```
Você é estudante?

1 - Sim
2 - Não
```

Se for estudante:

```
15% de desconto.
```

Caso contrário:

```
10% de desconto.
```

***

## 8. Sistema de Vidas — Duelo entre Dois Jogadores 👾

Crie um programa que simule uma disputa entre dois jogadores.

Cada jogador começa com 3 vidas. Além das vidas, cada jogador também deverá possuir uma variável para armazenar sua pontuação.

A cada rodada, o programa deverá gerar um número aleatório (1 a 10) para cada jogador.

### Regras da disputa

Em cada rodada:

* cada jogador recebe um número aleatório;
* o jogador que obtiver o maior número vence a rodada;
* o jogador que obtiver o menor número perde uma vida;
* o vencedor da rodada recebe `10 pontos`;
* em caso de empate, ninguém perde vida e recebe `5 pontos`;
* quando um dos jogadores chegar a `0` vidas, o jogo deverá terminar.

Exemplo:

```
===== RODADA 1 =====

Jogador 1 tirou: 8
Jogador 2 tirou: 4

Jogador 1 venceu a rodada!
Jogador 2 perdeu uma vida!

Vidas do Jogador 1: 3
Pontos do Jogador 1: 10

Vidas do Jogador 2: 2
Pontos do Jogador 2: 0
```

Em caso de empate:

```
===== RODADA 2 =====

Jogador 1 tirou: 6
Jogador 2 tirou: 6

Empate!
Ninguém perdeu vida.

Cada jogador recebeu 5 pontos.
```

Ao final, o programa deverá exibir:

* quantidade de vidas restantes;
* pontuação final de cada jogador;
* jogador vencedor.

Exemplo:

```
===== RESULTADO FINAL =====

Jogador 1
Vidas: 2
Pontos: 35

Jogador 2
Vidas: 0
Pontos: 20

Vencedor: Jogador 1
```
