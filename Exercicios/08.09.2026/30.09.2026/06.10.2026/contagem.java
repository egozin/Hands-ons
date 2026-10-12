import java.util.*;

public class contagem {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int positivos = 0;
        int negativos = 0;
        int zeros = 0;

        for (int contador = 1; contador <= 10; contador++) {
            System.out.print("Digite o " + contador + "º numero: ");
            int numero = teclado.nextInt();

            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                zeros++;
            }
        }

        System.out.println("Quantidade de positivos: " + positivos);
        System.out.println("Quantidade de negativos: " + negativos);
        System.out.println("Quantidade de zeros: " + zeros);
    }
}
