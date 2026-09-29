import java.util.Scanner;

public class Att5 {
    public static void main(String[] args) {

        double saldo = 1000;
        int opcao;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Seja bem-vindo ao Banco Egox!");
        System.out.println("Seu saldo inicial é: R$ " + saldo);

        do {
            System.out.println("\nO que você gostaria de fazer?");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Realizar deposito");
            System.out.println("3 - Sacar");
            System.out.println("4 - Sair");

            opcao = teclado.nextInt();

            if (opcao == 1) {

                System.out.println("Seu saldo atual é de: R$ " + saldo);

            } else if (opcao == 2) {

                System.out.println("Qual valor você gostaria de depositar?");
                double depositar = teclado.nextDouble();

                if (depositar <= 0) {
                    System.out.println("Deposito não realizado. O valor deve ser maior que R$ 0.");
                } else {
                    saldo += depositar;
                    System.out.println("Deposito realizado com sucesso!");
                }

            } else if (opcao == 3) {

                System.out.println("Qual valor você gostaria de sacar?");
                double saque = teclado.nextDouble();

                if (saque <= 0 || saque > saldo) {
                    System.out.println("Saque não realizado. Tente novamente!");
                } else {
                    saldo -= saque;
                    System.out.println("Saque realizado com sucesso!");
                }

            } else if (opcao == 4) {

                System.out.println("Programa finalizado!");
                System.out.println("Seu saldo final é: R$ " + saldo);
                break;

            } else {

                System.out.println("Opção inválida!");

            }

        } while (opcao != 4);

        teclado.close();
    }
}
