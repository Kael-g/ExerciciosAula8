package aula8;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        //Entrada: peso de peixes
        //Saída: excesso, multa (R$ 4,00 por quilo acima de 50)

        Scanner input = new Scanner(System.in);

        System.out.println("Qual o peso total dos peixes de hoje, em quilos?");
        double peso = input.nextDouble();
        while (peso<0){
            System.out.println("O peso não pode ser um valor negativo, por favor, insira um peso válido");
            peso = input.nextDouble();
        }

        double excesso = 0;
        if (peso > 50){
            excesso = peso - 50;
        }

        double multa = excesso*4;

        System.out.printf("Hoje foram pescados %.1fkg de peixe!\n", peso);
        if (excesso > 0){
            System.out.printf("%.1fkg a mais que o regulamento de pesca do estado de São Paulo permite.\n", excesso);
            System.out.printf("A multa pelo peso excedente é de R$%.2f.", multa);
        } else {
            System.out.println("Está dentro do limite estabelecido pelo regulamento de pesca do estado de São Paulo.\nNão há multa a ser paga.");
        }

    }
}
