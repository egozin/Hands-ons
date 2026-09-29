import java.util.Scanner;
public class Att1{
    public static void main(String[] args){
        int numero;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número: ");
        numero = teclado.nextInt();
        if (numero % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }
    }
}

