package aula8;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        //Entrada: altura e peso
        //Saída: IMC (peso/(altura*altura))

        Scanner input = new Scanner(System.in);

        System.out.println("Qual é a sua altura, em metros?");
        double altura = input.nextDouble();
        while (altura<0 || altura>3){
            System.out.println("Valor inválido. Por favor, digite sua altura, em metros (ex: 1,60)");
            altura = input.nextDouble();
        }

        System.out.println("Qual é o seu peso, em quilos?");
        double peso = input.nextDouble();
        while (peso < 0){
            System.out.println("Valor inválido. Por favor, digite o seu peso, em quilos (ex: 70)");
            peso = input.nextDouble();
        }
        double imc = peso / (Math.pow(altura, 2));

        System.out.printf("Seu IMC é de %.1f, que se classifica como ", imc);

        if (imc < 18.5){
            System.out.println("magreza");
        } else if (imc < 25){
            System.out.println("normal");
        } else if (imc < 30){
            System.out.println("sobrepeso");
        } else if (imc < 35) {
            System.out.println("obesidade grau I");
        } else if (imc < 40) {
            System.out.println("obesidade grau II");
        } else {
            System.out.println("obesidade grau III");
        }

    }
}
