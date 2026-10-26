import java.util.Scanner;

public class att07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] v = new int[6];
        int soma = 0;
        int quantidade = 0;

        for (int i = 0; i < 6; i++) {
            System.out.print("Digite um numero: ");
            v[i] = sc.nextInt();
        }

        System.out.println("Numeros pares:");

        for (int i = 0; i < 6; i++) {
            if (v[i] % 2 == 0) {
                System.out.println(v[i]);
                soma += v[i];
            }
        }

        System.out.println("Soma dos pares: " + soma);
        System.out.println("Numeros impares:");

        for (int i = 0; i < 6; i++) {
            if (v[i] % 2 != 0) {
                System.out.println(v[i]);
                quantidade++;
            }
        }

        System.out.println("Quantidade de impares: " + quantidade);

        sc.close();
    }
}