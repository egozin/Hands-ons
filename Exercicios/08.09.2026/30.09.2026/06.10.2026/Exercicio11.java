import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite o " + i + "º numero: ");
            int numero = input.nextInt();

            System.out.println("Tabuada de " + numero + ":");
            for (int j = 1; j <= numero; j++) {
                System.out.println(j + " x " + numero + " = " + (j * numero));
            }
            System.out.println();
        }
    }
}
