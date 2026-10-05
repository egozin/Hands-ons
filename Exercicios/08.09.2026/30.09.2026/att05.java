import java.util.*;

public class att05 {
    public static void main(String[] args) {
        double dinheiro;
        int chuva;

        Scanner input = new Scanner(System.in);

        System.out.println("Quanto dinheiro você possui?");
        dinheiro = input.nextDouble();

        System.out.println("Está chovendo?\n" +
                "1 - Sim\n" +
                "2 - Não");
        chuva = input.nextInt();

        if (dinheiro < 20) {
            System.out.println("Rolê em casa.");
        } else if (dinheiro >= 20 && dinheiro < 50) {
            if (chuva == 1) {
                System.out.println("Streaming + comida.");
            } else {
                System.out.println("Praça ou parque.");
            }
        } else if (dinheiro >= 50 && dinheiro < 100) {
            System.out.println("Cinema.");
        } else if (dinheiro >= 100) {
            int idade;
            System.out.println("Qual sua idade?");
            idade = input.nextInt();

            if (idade < 18) {
                System.out.println("Shopping + cinema.");
            } else {
                System.out.println("Show, restaurante ou churrasco com a galera.");
            }
        } else {
            System.out.println("Valor inválido.");
        }

        input.close();
    }
}
