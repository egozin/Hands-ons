import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite N: ");
        int n = input.nextInt();

        int anterior = 0;
        int atual = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(anterior + " ");
            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }

        System.out.println();
    }
}
