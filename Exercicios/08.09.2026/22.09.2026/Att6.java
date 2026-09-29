import java.util.Scanner;
public class Att6 {
    public static void main(String[] args){
      double valorCompra;
      double tipoFuncionario;
      double desconto1 = 0.05; // 5% de desconto, Cliente Comum
      double desconto2 = 0.10; // 10% de desconto, Cliente Premium
      double desconto3 = 0.15; // 15% de desconto, Funcionario 

      Scanner teclado = new Scanner(System.in);
      System.out.println("Seja bem vindo, Digite a categoria do cliente:");
      System.out.println("1 - Comum");
      System.out.println("2 - Premium");
      System.out.println("3 - Funcionario");

      tipoFuncionario = teclado.nextInt();
       if(tipoFuncionario > 3 || tipoFuncionario < 1){
        System.out.println("Categoria inválida");
        return;
      }

      System.out.println("Digite o valor da compra: ");
      valorCompra = teclado.nextDouble();

      if(tipoFuncionario == 1){
      valorCompra -= desconto1;
        System.out.println("Voce ganhou:" + valorCompra * desconto1 + " de desconto");
      } else if(tipoFuncionario == 2){
        valorCompra -= desconto2;
        System.out.println("Total da compra: "+ valorCompra);
      } else if(tipoFuncionario == 3){
        valorCompra -= desconto3;
        System.out.println("Total da compra: "+ valorCompra);
        
      }




      







    }
}
