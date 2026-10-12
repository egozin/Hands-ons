import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] faixa = new int[6];

        for (int i = 1; i <= 15; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = input.nextInt();

            if (idade <= 15) {
                faixa[1]++;
            } else if (idade <= 30) {
                faixa[2]++;
            } else if (idade <= 45) {
                faixa[3]++;
            } else if (idade <= 60) {
                faixa[4]++;
            } else {
                faixa[5]++;
            }
        }

        int total = 15;
        double percentualPrimeira = (faixa[1] * 100.0) / total;
        double percentualUltima = (faixa[5] * 100.0) / total;

        System.out.println("Faixa 1: " + faixa[1]);
        System.out.println("Faixa 2: " + faixa[2]);
        System.out.println("Faixa 3: " + faixa[3]);
        System.out.println("Faixa 4: " + faixa[4]);
        System.out.println("Faixa 5: " + faixa[5]);
        System.out.println("Percentual da primeira faixa: " + percentualPrimeira + "%");
        System.out.println("Percentual da ultima faixa: " + percentualUltima + "%");
    }
}
