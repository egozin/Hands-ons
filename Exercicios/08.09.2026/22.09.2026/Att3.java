import java.util.Scanner;
public class Att3 {
    public static void main(String[] args){
        double numero, numero2;
        double operacao;
        char repetir;
        do {
        

        Scanner teclado = new Scanner(System.in);       

        System.out.println("Digite o primeiro numero");
        numero = teclado.nextDouble();
        System.out.println("Anotado!");
        System.out.println("Digite o segundo numero");
        numero2 = teclado.nextDouble();
        System.out.println("Anotado, Agora vamos selecionar qual operacao matematica iremos realizar!");
        System.out.println("Digite o numero de acordo com a solucao matematica que deseja realizar:");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");

        operacao = teclado.nextDouble();

        double somar = numero + numero2;
        double subtrair = numero - numero2;
        double multiplicar = numero * numero2;
        double dividir = numero/ numero2;

        if(operacao == 1){
            System.out.println("O resultado da soma e "+ somar);
        }

        else if (operacao == 2) {
            System.out.println("O resultado da Subtracao e "+ subtrair);
        }

        else if (operacao == 3) {
            System.out.println("O resultado da Multiplicao e "+ multiplicar);
        }

        else if (operacao == 4) {
            if (numero2 == 0) {
                System.out.println("não é possível dividir um número por zero. Na matemática padrão, essa operação não tem resposta e é chamada de indefinida ou impossível");
            }
            else{
                System.out.println("O resultado da Divisao e "+ dividir);
            }
        }

        System.out.print("Deseja comecar novamente? (s/n): ");
        repetir = teclado.next().charAt(0);
        } while (repetir ==  's' || repetir == 'S');
        System.out.println("Fim do programa.");
 
    }

}

    

