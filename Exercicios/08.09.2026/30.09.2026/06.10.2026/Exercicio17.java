import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int maiorAcidentes = Integer.MIN_VALUE;
        int menorAcidentes = Integer.MAX_VALUE;
        int codigoMaior = 0;
        int codigoMenor = 0;
        int totalVeiculos = 0;

        for (int i = 1; i <= 200; i++) {
            System.out.print("Cidade " + i + "\nCodigo: ");
            int codigo = input.nextInt();
            System.out.print("Estado: ");
            String estado = input.next();
            System.out.print("Numero de veiculos: ");
            int veiculos = input.nextInt();
            System.out.print("Numero de acidentes: ");
            int acidentes = input.nextInt();

            totalVeiculos += veiculos;

            if (acidentes > maiorAcidentes) {
                maiorAcidentes = acidentes;
                codigoMaior = codigo;
            }

            if (acidentes < menorAcidentes) {
                menorAcidentes = acidentes;
                codigoMenor = codigo;
            }
        }

        double mediaVeiculos = totalVeiculos / 200.0;

        System.out.println("Maior numero de acidentes: " + maiorAcidentes + " | Codigo: " + codigoMaior);
        System.out.println("Menor numero de acidentes: " + menorAcidentes + " | Codigo: " + codigoMenor);
        System.out.println("Media do numero de veiculos: " + mediaVeiculos);
    }
}
