import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalPessoas = 0;
        double totalSalarios = 0;
        double totalFilhos = 0;
        double maiorSalario = Double.NEGATIVE_INFINITY;
        int pessoasAte100 = 0;

        while (true) {
            System.out.print("Digite o salario da pessoa (negativo para encerrar): ");
            double salario = input.nextDouble();

            if (salario < 0) {
                break;
            }

            System.out.print("Digite o numero de filhos: ");
            int filhos = input.nextInt();

            totalPessoas++;
            totalSalarios += salario;
            totalFilhos += filhos;

            if (salario > maiorSalario) {
                maiorSalario = salario;
            }

            if (salario <= 100) {
                pessoasAte100++;
            }
        }

        double mediaSalario = totalPessoas == 0 ? 0 : totalSalarios / totalPessoas;
        double mediaFilhos = totalPessoas == 0 ? 0 : totalFilhos / totalPessoas;
        double percentual = totalPessoas == 0 ? 0 : (pessoasAte100 * 100.0) / totalPessoas;

        System.out.println("Media salarial: " + mediaSalario);
        System.out.println("Media de filhos: " + mediaFilhos);
        System.out.println("Maior salario: " + maiorSalario);
        System.out.println("Percentual de pessoas com salario ate 100: " + percentual + "%");
    }
}
