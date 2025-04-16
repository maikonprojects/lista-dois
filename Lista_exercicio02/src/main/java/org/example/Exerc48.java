package org.example;

import java.util.Scanner;

public class Exerc48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas provas você fez: ");
        int nota = scanner.nextInt();

        int soma =0;
        int faltas;

        for (int i = 1; i <= nota ; i++) {
            System.out.println("Qual foi a nota: ");
            double resultado = scanner.nextDouble();
            soma+=resultado;
        }

        double media = soma/nota;
        if (media >= 7.0){
            System.out.println("Você está aprovado pela sua média " + media);
        }else {
            System.out.println("Você está reprovado pela sua média: " + media);
        }

        System.out.println("Informe a quantidade de faltas: ");
        faltas = scanner.nextInt();

        if (faltas >= 25){
            System.out.println("Você está reprovado por faltas");
        }

        if (faltas >= 25 && media < 7.0){
            System.out.println("Resultado final: Reprovado!");
        } else {
            System.out.println("Resultado final: Aprovado!");
        }


    }
}
