import java.util.Scanner;

public class Exercicio23 {
    public static final double SALARIO_MINIMO = 1621.00;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double totalFolha = 0;
        int totalPecas = 0;
        int homensPecas = 0;
        int mulheresPecas = 0;
        int homens = 0;
        int mulheres = 0;
        int operarioMaiorSalario = 0;
        double maiorSalario = Double.NEGATIVE_INFINITY;

        for (int i = 1; i <= 15; i++) {
            System.out.print("Numero do operario: ");
            int numero = input.nextInt();
            System.out.print("Quantidade de pecas: ");
            int pecas = input.nextInt();
            System.out.print("Sexo (M/F): ");
            char sexo = Character.toUpperCase(input.next().charAt(0));

            double salario = calcularSalario(pecas);
            totalFolha += salario;
            totalPecas += pecas;

            if (sexo == 'M') {
                homens++;
                homensPecas += pecas;
            } else if (sexo == 'F') {
                mulheres++;
                mulheresPecas += pecas;
            }

            if (salario > maiorSalario) {
                maiorSalario = salario;
                operarioMaiorSalario = numero;
            }

            System.out.println("Operario: " + numero + " | Salario: " + salario);
        }

        double mediaHomens = homens == 0 ? 0 : homensPecas / (double) homens;
        double mediaMulheres = mulheres == 0 ? 0 : mulheresPecas / (double) mulheres;

        System.out.println("Total da folha de pagamento: " + totalFolha);
        System.out.println("Quantidade total de pecas: " + totalPecas);
        System.out.println("Media de pecas dos homens: " + mediaHomens);
        System.out.println("Media de pecas das mulheres: " + mediaMulheres);
        System.out.println("Operario com maior salario: " + operarioMaiorSalario);
    }

    public static double calcularSalario(int pecas) {
        double salario = SALARIO_MINIMO;

        if (pecas <= 30) {
            return salario;
        }

        if (pecas <= 50) {
            return salario + (0.03 * SALARIO_MINIMO * (pecas - 30));
        }

        return salario + (0.05 * SALARIO_MINIMO * (pecas - 30));
    }
}
