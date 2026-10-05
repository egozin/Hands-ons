import java.util.Scanner;

public class att06 {
    public static void main(String[] args) {

        double moedas = 1500;
        int menu = 0;

        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("===== LOJA DE SKINS =====");
            System.out.println();
            System.out.println("1 - Skin Básica   - 100 moedas");
            System.out.println("2 - Skin Rara     - 250 moedas");
            System.out.println("3 - Skin Épica    - 500 moedas");
            System.out.println("4 - Skin Lendária - 1000 moedas");
            System.out.println("0 - Sair");

            System.out.println("Escolha uma opção:");
            menu = input.nextInt();

            switch (menu) {

                case 1:
                    if (moedas >= 100) {
                        moedas -= 100;
                        System.out.println("Você comprou a Skin Básica.");
                        System.out.println("Moedas restantes: " + moedas);
                    } else {
                        System.out.println("Saldo insuficiente para comprar a Skin Básica.");
                    }
                    break;

                case 2:
                    if (moedas >= 250) {
                        moedas -= 250;
                        System.out.println("Você comprou a Skin Rara.");
                        System.out.println("Moedas restantes: " + moedas);
                    } else {
                        System.out.println("Saldo insuficiente para comprar a Skin Rara.");
                    }
                    break;

                case 3:
                    if (moedas >= 500) {
                        moedas -= 500;
                        System.out.println("Você comprou a Skin Épica.");
                        System.out.println("Moedas restantes: " + moedas);
                    } else {
                        System.out.println("Saldo insuficiente para comprar a Skin Épica.");
                    }
                    break;

                case 4:
                    if (moedas >= 1000) {
                        moedas -= 1000;
                        System.out.println("Você comprou a Skin Lendária.");
                        System.out.println("Moedas restantes: " + moedas);
                    } else {
                        System.out.println("Saldo insuficiente para comprar a Skin Lendária.");
                    }
                    break;

                case 0:
                    System.out.println("Você escolheu sair.");
                    System.out.println("Até a próxima!");
                    input.close();
                    return;

                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }
    }
}