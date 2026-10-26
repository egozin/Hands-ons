import java.util.Scanner;

public class att04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um numero: ");
            v[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            boolean primo = v[i] > 1;

            for (int j = 2; j < v[i]; j++) {
                if (v[i] % j == 0) {
                    primo = false;
                    break;
                }
            }

            if (primo) {
                System.out.println("Numero: " + v[i]
                        + " | Posicao: " + i);
            }
        }

        sc.close();
    }
}