import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite N: ");
        int n = input.nextInt();

        double soma = 0;
        System.out.print("S = ");

        for (int i = 1; i <= n; i++) {
            soma += 1.0 / i;
            if (i < n) {
                System.out.print("1/" + i + " + ");
            } else {
                System.out.print("1/" + i);
            }
        }

        System.out.println();
        System.out.println("S = " + soma);
    }
}
