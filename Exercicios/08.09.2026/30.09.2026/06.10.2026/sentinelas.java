import java.util.Scanner;

public class sentinelas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um numero (0 para sair): ");
        int numero = scanner.nextInt();

        if (numero == 0) {
            System.out.println("Nenhum numero foi informado.");
            return;
        }

        int maior = numero;
        int menor = numero;

        while (true) {
            System.out.print("Informe outro numero (0 para sair): ");
            numero = scanner.nextInt();

            if (numero == 0) {
                break;
            }

            if (numero > maior) {
                maior = numero;
            }

            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);

        scanner.close();
    }
}