import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double totalAdicionais = 0;
        double maiorPrecoFinal = Double.NEGATIVE_INFINITY;
        double menorPrecoFinal = Double.POSITIVE_INFINITY;
        double totalImpostos = 0;
        int baratos = 0;
        int normais = 0;
        int caros = 0;

        for (int i = 1; i <= 12; i++) {
            System.out.println("Produto " + i);
            System.out.print("Preco unitario: ");
            double preco = input.nextDouble();
            System.out.print("Refrigeracao (S/N): ");
            char refrigeracao = Character.toUpperCase(input.next().charAt(0));
            System.out.print("Categoria (A/L/V): ");
            char categoria = Character.toUpperCase(input.next().charAt(0));

            double custoEstocagem = calcularCustoEstocagem(preco, refrigeracao, categoria);
            double imposto = calcularImposto(preco, refrigeracao, categoria);
            double precoFinal = preco + custoEstocagem + imposto;

            String classificacao;
            if (precoFinal <= 20) {
                classificacao = "Barato";
                baratos++;
            } else if (precoFinal <= 100) {
                classificacao = "Normal";
                normais++;
            } else {
                classificacao = "Caro";
                caros++;
            }

            totalAdicionais += custoEstocagem + imposto;
            totalImpostos += imposto;

            if (precoFinal > maiorPrecoFinal) {
                maiorPrecoFinal = precoFinal;
            }
            if (precoFinal < menorPrecoFinal) {
                menorPrecoFinal = precoFinal;
            }

            System.out.println("Preco unitario: " + preco);
            System.out.println("Custo de estocagem: " + custoEstocagem);
            System.out.println("Imposto: " + imposto);
            System.out.println("Preco final: " + precoFinal);
            System.out.println("Classificacao: " + classificacao);
            System.out.println();
        }

        double mediaAdicionais = totalAdicionais / 12.0;

        System.out.println("Media dos valores adicionais: " + mediaAdicionais);
        System.out.println("Maior preco final: " + maiorPrecoFinal);
        System.out.println("Menor preco final: " + menorPrecoFinal);
        System.out.println("Total de impostos: " + totalImpostos);
        System.out.println("Quantidade de produtos Baratos: " + baratos);
        System.out.println("Quantidade de produtos Normais: " + normais);
        System.out.println("Quantidade de produtos Caros: " + caros);
    }

    public static double calcularCustoEstocagem(double preco, char refrigeracao, char categoria) {
        if (preco <= 20) {
            switch (categoria) {
                case 'A': return 2.00;
                case 'L': return 3.00;
                case 'V': return 4.00;
                default: return 0.00;
            }
        }

        if (preco <= 50) {
            return refrigeracao == 'S' ? 6.00 : 0.00;
        }

        if (refrigeracao == 'S') {
            switch (categoria) {
                case 'A': return 5.00;
                case 'L': return 2.00;
                case 'V': return 4.00;
                default: return 0.00;
            }
        }

        switch (categoria) {
            case 'A':
            case 'V':
                return 0.00;
            case 'L':
                return 1.00;
            default:
                return 0.00;
        }
    }

    public static double calcularImposto(double preco, char refrigeracao, char categoria) {
        if (categoria == 'A' && refrigeracao == 'S') {
            return preco * 0.04;
        }
        return preco * 0.02;
    }
}
