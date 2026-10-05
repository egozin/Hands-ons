import java.util.Scanner;
public class att03 {
    public static void main(String[] args){
        int senhaCorreta = 1234;
        int senhaDigitada = 0;
        int tentativas = 0;
        String erro = "Erro, tente novamente!";
        Scanner input = new Scanner(System.in);
        System.out.println("Seja bem vindo ao Instagram, Digite sua senha:");
        while (senhaCorreta != senhaDigitada){
        if (input.hasNextInt())
             { senhaDigitada = input.nextInt();
             if(senhaDigitada != senhaCorreta){
            System.out.println("Senha incorreta, tente novamente !!");
            tentativas ++;
             }else{
            System.out.print("Login realizado com sucesso após "+tentativas);
            System.out.println(" tentativas.");
            }
        } else{
            System.out.println("Erro! Digite apenas números.");
            tentativas ++;
            input.next();
        }
  }
 }
}
