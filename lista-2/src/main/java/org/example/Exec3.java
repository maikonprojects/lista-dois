package org.example;

import java.util.Scanner;

public class Exec3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a quantidade de homens na sala de aula: ");
        int qtdHomen = scanner.nextInt();

        System.out.println("Qual a quantidade de mulheres na sala de aula: ");
        int qtdMulher = scanner.nextInt();
        double percentMulher = (double) ((qtdHomen + qtdMulher) * qtdMulher) / 100;
        double percentHomem = (double) ((qtdHomen + qtdMulher) * qtdMulher) / 100;
        System.out.println("Mulheres: " + percentMulher +"%");
        System.out.println("Homens: " +percentHomem+"%");
    }
}
