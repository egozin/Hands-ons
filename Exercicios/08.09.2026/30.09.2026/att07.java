import java.util.Scanner;
import java.util.Locale;

public class att07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.forLanguageTag("pt-BR"));

        double subtotal = 0;
        int opcao;

        do {
            System.out.println("===== LANCHONETE =====");
            System.out.println("1 - Pizza         - R$ 30,00");
            System.out.println("2 - Hambúrguer    - R$ 20,00");
            System.out.println("3 - Batata        - R$ 12,00");
            System.out.println("4 - Refrigerante  - R$ 8,00");
            System.out.println("0 - Finalizar");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    subtotal += 30;
                    break;
                case 2:
                    subtotal += 20;
                    break;
                case 3:
                    subtotal += 12;
                    break;
                case 4:
                    subtotal += 8;
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        double percentualDesconto;
        if (subtotal < 50) {
            percentualDesconto = 0;
            System.out.println("Sem desconto.");
        } else if (subtotal < 100) {
            percentualDesconto = 0.05;
            System.out.println("5% de desconto.");
        } else {
            System.out.println("Você é estudante?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            System.out.print("Escolha uma opção: ");
            int estudante = input.nextInt();

            if (estudante == 1) {
                percentualDesconto = 0.15;
                System.out.println("15% de desconto.");
            } else {
                percentualDesconto = 0.10;
                System.out.println("10% de desconto.");
            }
        }

        double desconto = subtotal * percentualDesconto;
        double total = subtotal - desconto;
        System.out.printf("Subtotal: R$ %.2f%n", subtotal);
        System.out.printf("Desconto: R$ %.2f%n", desconto);
        System.out.printf("Total: R$ %.2f%n", total);
        input.close();
    }
}
