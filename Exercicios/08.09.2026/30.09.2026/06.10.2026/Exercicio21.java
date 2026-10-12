import java.util.Scanner;

public class Exercicio21 {
    public static final double SALARIO_MINIMO = 1621.00;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.println("Funcionario " + i);

            System.out.print("Codigo: ");
            int codigo = input.nextInt();

            System.out.print("Horas trabalhadas: ");
            double horas = input.nextDouble();

            char turno;
            do {
                System.out.print("Turno (M/V/N): ");
                turno = Character.toUpperCase(input.next().charAt(0));
            } while (turno != 'M' && turno != 'V' && turno != 'N');

            char categoria;
            do {
                System.out.print("Categoria (O/G): ");
                categoria = Character.toUpperCase(input.next().charAt(0));
            } while (categoria != 'O' && categoria != 'G');

            double valorHora = calcularValorHora(categoria, turno);
            double salarioInicial = horas * valorHora;
            double auxilio = calcularAuxilio(salarioInicial);
            double salarioFinal = salarioInicial + auxilio;

            System.out.println("Codigo: " + codigo);
            System.out.println("Horas trabalhadas: " + horas);
            System.out.println("Valor da hora: " + valorHora);
            System.out.println("Salario inicial: " + salarioInicial);
            System.out.println("Auxilio-alimentacao: " + auxilio);
            System.out.println("Salario final: " + salarioFinal);
            System.out.println();
        }
    }

    public static double calcularValorHora(char categoria, char turno) {
        if (categoria == 'G') {
            if (turno == 'N') {
                return 0.18 * SALARIO_MINIMO;
            }
            return 0.15 * SALARIO_MINIMO;
        }

        if (turno == 'N') {
            return 0.13 * SALARIO_MINIMO;
        }
        return 0.10 * SALARIO_MINIMO;
    }

    public static double calcularAuxilio(double salarioInicial) {
        if (salarioInicial <= 1080) {
            return 0.20 * salarioInicial;
        }
        if (salarioInicial <= 2160) {
            return 0.15 * salarioInicial;
        }
        return 0.05 * salarioInicial;
    }
}
