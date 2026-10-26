import java.util.Scanner;

public class att03{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] v = new int[8];
        int[] positivos = new int[8];
        int[] negativos = new int[8];
        int p = 0, n = 0;

        for (int i = 0; i < 8; i++) {
            System.out.print("Digite um numero: ");
            v[i] = sc.nextInt();

            if (v[i] > 0) {
                positivos[p] = v[i];
                p++;
            } else if (v[i] < 0) {
                negativos[n] = v[i];
                n++;
            }
        }

        System.out.println("Positivos:");
        for (int i = 0; i < p; i++) {
            System.out.println(positivos[i]);
        }

        System.out.println("Negativos:");
        for (int i = 0; i < n; i++) {
            System.out.println(negativos[i]);
        }

        sc.close();
    }
}