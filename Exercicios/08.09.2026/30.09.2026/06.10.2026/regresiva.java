import java.util.*;
import java.util.concurrent.TimeUnit;

public class regresiva {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero inteiro positivo: ");
        int numero = input.nextInt();

        int soma = 0;

        System.out.print("Contagem regressiva: ");
        for (int i = numero; i >= 1; i--) {
            System.out.print(i + " ");
            soma += i;

            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println();
        System.out.println("Soma = " + soma);
    }
}
