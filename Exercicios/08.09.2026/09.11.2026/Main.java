
import java.util.Scanner;

public class ArenaDosHerois {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Vetores dos herois
        String[] herois = {"Guerreiro", "Arqueiro", "Mago"};

        int[] vidaInicial = {100, 80, 60};
        int[] ataque = {20, 15, 25};

        // Matriz com a vida dos dois jogadores
        int[][] vida = {
            {100, 80, 60},
            {100, 80, 60}
        };

        // Placar de vitorias
        int[] vitorias = {0, 0};

        int opcao = -1;
        boolean batalhaFinalizada = false;

        // Menu principal
        while (opcao != 0) {

            System.out.println("\n================================");
            System.out.println("       ARENA DOS HEROIS");
            System.out.println("================================");
            System.out.println("1 - Iniciar batalha");
            System.out.println("2 - Consultar herois");
            System.out.println("3 - Consultar status da batalha");
            System.out.println("4 - Reiniciar jogo");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opcao: ");

            opcao = input.nextInt();

            switch (opcao) {

                case 1:

                    if (batalhaFinalizada) {
                        System.out.println("Reinicie o jogo antes de outra batalha!");
                    } else {

                        int jogador = 0;

                        // A batalha continua enquanto houver equipes vivas
                        while (true) {

                            int adversario = 1 - jogador;

                            System.out.println("\n================================");
                            System.out.println("VEZ DO JOGADOR " + (jogador + 1));
                            System.out.println("================================");

                            // Escolher heroi atacante
                            int atacante = -1;

                            while (atacante < 0 || vida[jogador][atacante] <= 0) {

                                System.out.println("\nEscolha seu heroi:");

                                for (int i = 0; i < 3; i++) {
                                    System.out.println((i + 1) + " - " +
                                        herois[i] + " - Vida: " +
                                        vida[jogador][i]);
                                }

                                System.out.print("Opcao: ");
                                atacante = input.nextInt() - 1;

                                if (atacante < 0 || atacante > 2) {
                                    System.out.println("Opcao invalida!");
                                    atacante = -1;
                                } else if (vida[jogador][atacante] <= 0) {
                                    System.out.println("Heroi eliminado! Escolha outro.");
                                    atacante = -1;
                                }
                            }

                            // Escolher heroi adversario
                            int alvo = -1;

                            while (alvo < 0 || vida[adversario][alvo] <= 0) {

                                System.out.println("\nEscolha o adversario:");

                                for (int i = 0; i < 3; i++) {
                                    System.out.println((i + 1) + " - " +
                                        herois[i] + " - Vida: " +
                                        vida[adversario][i]);
                                }

                                System.out.print("Opcao: ");
                                alvo = input.nextInt() - 1;

                                if (alvo < 0 || alvo > 2) {
                                    System.out.println("Opcao invalida!");
                                    alvo = -1;
                                } else if (vida[adversario][alvo] <= 0) {
                                    System.out.println("Esse heroi ja foi eliminado!");
                                    alvo = -1;
                                }
                            }

                            // Calcular e aplicar dano
                            int dano = ataque[atacante];

                            vida[adversario][alvo] -= dano;

                            // Impedir vida negativa
                            if (vida[adversario][alvo] < 0) {
                                vida[adversario][alvo] = 0;
                            }

                            // Mostrar resultado
                            System.out.println("\n================================");
                            System.out.println("         RESULTADO");
                            System.out.println("================================");

                            System.out.println(herois[atacante] +
                                " atacou " + herois[alvo] + "!");

                            System.out.println("Dano causado: " + dano);

                            System.out.println("Vida restante do " +
                                herois[alvo] + ": " + vida[adversario][alvo]);

                            if (vida[adversario][alvo] == 0) {
                                System.out.println(herois[alvo] + " foi eliminado!");
                            }

                            // Verificar se todos os herois morreram
                            boolean equipeEliminada = true;

                            for (int i = 0; i < 3; i++) {
                                if (vida[adversario][i] > 0) {
                                    equipeEliminada = false;
                                }
                            }

                            // Declarar vencedor
                            if (equipeEliminada) {

                                System.out.println("\n================================");
                                System.out.println("JOGADOR " + (jogador + 1) +
                                    " VENCEU A BATALHA!");
                                System.out.println("================================");

                                vitorias[jogador]++;
                                batalhaFinalizada = true;

                                System.out.println("\nPLACAR DE VITORIAS");
                                System.out.println("Jogador 1: " + vitorias[0]);
                                System.out.println("Jogador 2: " + vitorias[1]);

                                break;
                            }

                            // Alternar jogador
                            jogador = adversario;
                        }
                    }

                    break;

                case 2:

                    // Consultar herois
                    System.out.println("\n===== HEROIS =====");

                    for (int i = 0; i < 3; i++) {
                        System.out.println("\nNome: " + herois[i]);
                        System.out.println("Vida inicial: " + vidaInicial[i]);
                        System.out.println("Poder de ataque: " + ataque[i]);
                    }

                    break;

                case 3:

                    // Consultar vida atual
                    System.out.println("\n===== STATUS DA BATALHA =====");

                    for (int j = 0; j < 2; j++) {

                        System.out.println("\nJogador " + (j + 1));

                        for (int i = 0; i < 3; i++) {

                            System.out.println(herois[i] +
                                " - Vida: " + vida[j][i]);

                            if (vida[j][i] == 0) {
                                System.out.println("ELIMINADO!");
                            }
                        }
                    }

                    System.out.println("\n===== PLACAR =====");
                    System.out.println("Jogador 1: " + vitorias[0]);
                    System.out.println("Jogador 2: " + vitorias[1]);

                    break;

                case 4:

                    // Reiniciar jogo
                    for (int j = 0; j < 2; j++) {
                        for (int i = 0; i < 3; i++) {
                            vida[j][i] = vidaInicial[i];
                        }
                    }

                    vitorias[0] = 0;
                    vitorias[1] = 0;

                    batalhaFinalizada = false;

                    System.out.println("\nJogo reiniciado com sucesso!");

                    break;

                case 0:

                    System.out.println("Saindo do jogo...");
                    break;

                default:

                    System.out.println("Opcao invalida!");
            }
        }

        input.close();
    }
}
