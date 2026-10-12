public class Exercicio14 {
    public static void main(String[] args) {
        System.out.println("Numeros entre 1000 e 1999 com resto 5 na divisao por 11:");
        for (int i = 1000; i <= 1999; i++) {
            if (i % 11 == 5) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
