import java.util.Scanner;
public class Att4 {
    public static void main(String[] args) {
       double numero;
       Scanner teclado = new Scanner(System.in);
       do {
        System.out.println("Digite um numero de 0 a 100");
        numero = teclado.nextDouble();
       } while (numero < 0 || numero > 100); 

       System.out.println("Fim do Programa");
}
    } 