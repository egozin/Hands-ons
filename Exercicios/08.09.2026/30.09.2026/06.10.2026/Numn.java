import java.util.Scanner;

public class Numn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero inteiro positivo N: ");
        int numero = input.nextInt();

        int soma = 0;

        for (int i = 1; i <= numero; i++) {
            soma += i;
        }

        System.out.println("Soma = " + soma);
    }
}
