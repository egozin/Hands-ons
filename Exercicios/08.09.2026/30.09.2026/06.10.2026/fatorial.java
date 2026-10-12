import java.util.*;

public class fatorial {
    public static void main(String[] args) {
        System.out.println("Fatoriais de 1 a 10:");

        for (int numero = 1; numero <= 10; numero++) {
            long resultado = 1;

            for (int i = 2; i <= numero; i++) {
                resultado *= i;
            }

            System.out.println(numero + "! = " + resultado);
        }
    }
}