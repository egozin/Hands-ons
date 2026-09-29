import java.util.Scanner;
public class Att2 {
    public static void main(String[] args){
        int numero, numero2;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Oii, Digite o primeiro numero:"); 
        numero = teclado.nextInt();
        System.out.println("Digite o segundo numero:");
        numero2 = teclado.nextInt();
        if(numero > numero2) {
            System.out.println(numero + " e maior que " + numero2);
          } else if (numero2 > numero) {
             System.out.println(numero2 + " e maior que " + numero);
          } else if (numero == numero2) {
            System.out.println("Voce digitou dois numeros iguais");
          };
            

    }

}