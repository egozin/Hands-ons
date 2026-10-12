public class Exercicio16 {
    public static void main(String[] args) {
        int encontrados = 0;
        int numero = 1;

        while (encontrados < 5) {
            int somaDivisores = 0;

            for (int i = 1; i < numero; i++) {
                if (numero % i == 0) {
                    somaDivisores += i;
                }
            }

            if (somaDivisores == numero) {
                System.out.println(numero);
                encontrados++;
            }

            numero++;
        }
    }
}
