public class Exercicio08 {
    public static void main(String[] args) {
        double alturaChico = 1.50;
        double alturaZe = 1.10;
        int anos = 0;

        while (alturaZe <= alturaChico) {
            alturaChico += 0.02;
            alturaZe += 0.03;
            anos++;
        }

        System.out.println("Anos necessarios: " + anos);
        System.out.printf("Altura final de Chico: %.2f m%n", alturaChico);
        System.out.printf("Altura final de Ze: %.2f m%n", alturaZe);
    }
}
