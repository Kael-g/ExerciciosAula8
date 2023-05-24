package aula8;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        //Entrada: salário do usuário
        //Saída: quantidade de salários mínimos que o usupario recebe (salário mínimo: R$1.212,00)

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o seu salário:");
        double salario_usuario = input.nextDouble();
        while (salario_usuario<0){
            System.out.println("Valor inválido. Por favor, digite o seu salário:");
            salario_usuario = input.nextDouble();
        }

        int qtde_salarios_minimos = (int)salario_usuario / 1212;

        if (salario_usuario%1212 == 0){
            System.out.printf("Você recebe %d salário(s) mínimo(s).", qtde_salarios_minimos);
        } else {
            System.out.printf("Você recebe entre %d e %d salários mínimos.", qtde_salarios_minimos, qtde_salarios_minimos+1);
        }
    }
}
