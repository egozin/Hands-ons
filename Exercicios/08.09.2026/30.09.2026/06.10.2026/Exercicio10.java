import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite N: ");
        int n = input.nextInt();
        System.out.print("Digite A1: ");
        int a1 = input.nextInt();
        System.out.print("Digite R: ");
        int r = input.nextInt();

        System.out.print("PA: ");
        int ultimo = a1 + (n - 1) * r;
        int soma = 0;

        for (int i = 0; i < n; i++) {
            int termo = a1 + i * r;
            soma += termo;
            System.out.print(termo + " ");
        }

        System.out.println();
        System.out.println("Soma = " + soma);
    }
}
