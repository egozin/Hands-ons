import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite N: ");
        int n = input.nextInt();

        double soma = 1.0;
        double fatorial = 1.0;

        for (int i = 1; i <= n; i++) {
            fatorial *= i;
            if (i > 0) {
                soma += 1.0 / fatorial;
            }
        }

        System.out.println("E = " + soma);
    }
}
