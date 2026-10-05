import java.util.*;

public class att04 {
    public static void main(String[] args) {

        int ingresso;
        int idade;
        int responsavel;

        Scanner input = new Scanner(System.in);

        System.out.println("Seja bem-vindo(a)!");
        System.out.println("Digite sua idade:");
        idade = input.nextInt();

        System.out.println("Possui ingresso?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        ingresso = input.nextInt();

        // Primeiro verifica o ingresso
        if (ingresso == 2) {

            System.out.println("Entrada negada: ingresso obrigatório.");

        } else {

            // Depois verifica a idade
            if (idade < 18) {

                System.out.println("Está acompanhado de um responsável?");
                System.out.println("1 - Sim");
                System.out.println("2 - Não");
                responsavel = input.nextInt();

                if (responsavel == 2) {
                    System.out.println("Acesso negado, precisa estar acompanhado!");
                } else {
                    System.out.println("Entrada liberada!");
                }

            } else {

                System.out.println("Entrada liberada!");
            }
        }

        input.close();
    }
}
            


