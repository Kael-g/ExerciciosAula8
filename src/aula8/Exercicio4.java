package aula8;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        //Entrada: idade em anos, meses e dias
        //Saída: idade em dias

        Scanner input = new Scanner(System.in);

        System.out.println("Digite sua idade em anos, meses e dias (Ex: 1 ano, 3 meses e 2 dias)");
        System.out.println("Anos:");
        int anos = input.nextInt();
        while (anos < 0){
            System.out.println("Número inválido. Por favor, digite os anos:");
            anos = input.nextInt();
        }
        System.out.println("Meses:");
        int meses = input.nextInt();
        while (meses < 0 || meses > 12){
            System.out.println("Número inválido. Por favor, digite os meses:");
            meses = input.nextInt();
        }
        System.out.println("Dias:");
        int dias = input.nextInt();
        while (dias < 0 || dias > 31){
            System.out.println("Número inválido. Por favor, digite os dias:");
            dias = input.nextInt();
        }

        int idade_em_dias = anos*365 + meses*30 + dias;

        System.out.printf("Sua idade em dias é %d dias.", idade_em_dias);
    }
}
