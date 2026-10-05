import java.util.Scanner;
public class att01{
    public static void main(String[] args){
        int idade;
        double horas;

        Scanner input = new Scanner(System.in);

        System.out.println("Bem vindo ao programa de Classificação de Jogador");
        System.out.println("Qual idade do Jogador?");
        idade = input.nextInt();

        System.out.println("Qual a quantidade de horas jogadas por semana?");
        horas = input.nextDouble();

        if(idade <= 12){
            System.out.println("Jogador Mirim");
        }
        else if(idade > 12 && idade < 18 ){
            if(horas <= 10){
                System.out.println("Jogador Casual");
            } else{
                System.out.println("Jogador Frequente");
            }
        }
        else{
            if(horas <= 5){
                System.out.println("Jogador Casual");
            }
            else if(horas > 5 && horas <= 15){
                System.out.println("Jogador Gamer");
            }
            else{
                System.out.println("Gamer Hardcore");
            }
        }
    }
}