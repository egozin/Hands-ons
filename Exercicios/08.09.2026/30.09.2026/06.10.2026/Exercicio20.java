import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de termos: ");
        int termos = input.nextInt();
        System.out.print("Digite o valor de X: ");
        double x = input.nextDouble();

        int[] denominadores = {1, 2, 3, 4, 3, 2, 1};
        int expoente = 2;
        int indice = 0;
        double soma = 0;
        int sinal = -1;

        for (int i = 1; i <= termos; i++) {
            int denominador = denominadores[indice % denominadores.length];
            double termo = Math.pow(x, expoente) / fatorial(denominador);
            soma += sinal * termo;
            sinal *= -1;
            expoente++;
            indice++;
        }

        System.out.println("S = " + soma);
    }

    public static int fatorial(int numero) {
        int resultado = 1;
        for (int i = 2; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
