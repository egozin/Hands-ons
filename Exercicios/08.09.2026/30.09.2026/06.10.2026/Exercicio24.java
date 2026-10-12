import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantidade de criancas nascidas: ");
        int quantidade = input.nextInt();

        int femininas = 0;
        int masculinas = 0;
        int femininasMortas = 0;
        int masculinasMortas = 0;

        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Sexo (M/F): ");
            char sexo = Character.toUpperCase(input.next().charAt(0));
            System.out.print("Tempo de vida em meses: ");
            int tempoVida = input.nextInt();

            if (sexo == 'F') {
                femininas++;
                if (tempoVida <= 24) {
                    femininasMortas++;
                }
            } else if (sexo == 'M') {
                masculinas++;
                if (tempoVida <= 24) {
                    masculinasMortas++;
                }
            }
        }

        double percentualFeminino = femininas == 0 ? 0 : (femininasMortas * 100.0) / femininas;
        double percentualMasculino = masculinas == 0 ? 0 : (masculinasMortas * 100.0) / masculinas;
        double percentualAte24 = quantidade == 0 ? 0 : ((femininasMortas + masculinasMortas) * 100.0) / quantidade;

        System.out.println("Percentual de criancas femininas que morreram: " + percentualFeminino + "%");
        System.out.println("Percentual de criancas masculinas que morreram: " + percentualMasculino + "%");
        System.out.println("Percentual de criancas que viveram 24 meses ou menos: " + percentualAte24 + "%");
    }
}
