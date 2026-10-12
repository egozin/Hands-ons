import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 75; i++) {
            System.out.println("Aluno " + i);
            System.out.print("Matricula: ");
            int matricula = input.nextInt();
            System.out.print("Nota final: ");
            double nota = input.nextDouble();

            String conceito;
            if (nota > 9) {
                conceito = "A";
            } else if (nota >= 7) {
                conceito = "B";
            } else if (nota >= 5) {
                conceito = "C";
            } else {
                conceito = "D";
            }

            System.out.println("Matricula: " + matricula);
            System.out.println("Nota final: " + nota);
            System.out.println("Conceito: " + conceito);
        }
    }
}
