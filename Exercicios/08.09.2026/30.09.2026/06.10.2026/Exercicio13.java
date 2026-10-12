import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double somaAntes = 0;
        double somaDepois = 0;
        int quantidade = 0;

        while (true) {
            System.out.print("Digite o codigo do produto (-1 para encerrar): ");
            int codigo = input.nextInt();

            if (codigo < 0) {
                break;
            }

            System.out.print("Digite o preco atual: ");
            double precoAtual = input.nextDouble();

            double novoPreco = precoAtual * 1.20;
            quantidade++;
            somaAntes += precoAtual;
            somaDepois += novoPreco;

            System.out.println("Codigo: " + codigo + " | Novo preco: " + novoPreco);
        }

        double mediaAntes = quantidade == 0 ? 0 : somaAntes / quantidade;
        double mediaDepois = quantidade == 0 ? 0 : somaDepois / quantidade;

        System.out.println("Media dos precos antes: " + mediaAntes);
        System.out.println("Media dos precos depois: " + mediaDepois);
    }
}
