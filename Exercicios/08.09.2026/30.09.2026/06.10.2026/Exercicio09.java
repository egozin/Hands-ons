import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int voto1 = 0, voto2 = 0, voto3 = 0, voto4 = 0, nulos = 0, brancos = 0;

        while (true) {
            System.out.print("Digite o codigo do voto (0 para encerrar): ");
            int voto = input.nextInt();

            if (voto == 0) {
                break;
            }

            switch (voto) {
                case 1:
                    voto1++;
                    break;
                case 2:
                    voto2++;
                    break;
                case 3:
                    voto3++;
                    break;
                case 4:
                    voto4++;
                    break;
                case 5:
                    nulos++;
                    break;
                case 6:
                    brancos++;
                    break;
                default:
                    System.out.println("Codigo invalido. Tente novamente.");
                    break;
            }
        }

        System.out.println("Total candidato 1: " + voto1);
        System.out.println("Total candidato 2: " + voto2);
        System.out.println("Total candidato 3: " + voto3);
        System.out.println("Total candidato 4: " + voto4);
        System.out.println("Total votos nulos: " + nulos);
        System.out.println("Total votos em branco: " + brancos);
    }
}
