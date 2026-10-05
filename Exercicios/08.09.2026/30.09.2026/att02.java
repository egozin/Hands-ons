import java.util.*;
public class att02 {
    public static void main(String[] args){
        int menu = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("===== STREAMING =====\r\n" + //
                        "\r\n" + 
                        "1 - Netflix\r\n" + 
                        "2 - Disney+\r\n" + 
                        "3 - Prime Video\r\n" + 
                        "4 - Spotify\r\n" + 
                        "5 - Sair\r\n" + 
                        "Escolha uma opção:");
        menu = input.nextInt();
        switch (menu){
            case 1 : 
            System.out.println("Você escolheu Netflix.\r\n" + //
                                "Prepare a pipoca!");
            break;

            case 2 : 
            System.out.println("Você escolheu Disney+.\r\n" + //
                                "Prepare a pipoca!");
            break;

            case 3 :
            System.out.println("Você escolheu Prime Video.\r\n" + //
                                "Prepare a pipoca!");
            break;

            case 4 :
            System.out.println("Você escolheu Spotify.\r\n" + //
                                "Prepare a pipoca!");
            break;

            case 5:
            System.out.println("Você escolheu Sair.\r\n" + //
                                "Até a proxima!!!");
            break;
            
            default:
            System.out.println("Opção invalida, tente novamente");

        }

    }

}
