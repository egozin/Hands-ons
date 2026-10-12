import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int maiorIdade = Integer.MIN_VALUE;
        int mulheresVerdesLouros = 0;

        while (true) {
            System.out.print("Digite a idade (-1 para encerrar): ");
            int idade = input.nextInt();

            if (idade == -1) {
                break;
            }

            if (idade > maiorIdade) {
                maiorIdade = idade;
            }

            System.out.print("Digite o sexo (M/F): ");
            String sexo = input.next();
            System.out.print("Digite a cor dos olhos (azuis/ verdes / castanhos): ");
            String olhos = input.next().toLowerCase();
            System.out.print("Digite a cor dos cabelos (louros / castanhos / pretos): ");
            String cabelos = input.next().toLowerCase();

            if (sexo.equalsIgnoreCase("F") && idade >= 18 && idade <= 35 && olhos.equals("verdes") && cabelos.equals("louros")) {
                mulheresVerdesLouros++;
            }
        }

        System.out.println("Maior idade: " + maiorIdade);
        System.out.println("Quantidade de mulheres com olhos verdes, cabelos louros e idade entre 18 e 35: " + mulheresVerdesLouros);
    }
}
