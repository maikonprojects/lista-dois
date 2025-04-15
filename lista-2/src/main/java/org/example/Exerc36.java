package org.example;

import java.util.Scanner;

public class Exerc36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.println("Insira o segundo número: ");
        int num2 = scanner.nextInt();

        int inicio = Math.min(num1, num2);
        int fim = Math.max(num1,num2);

        for (int i = inicio; i <= fim ; i++) {
            if (i % 2 != 0){
                System.out.println(i);
            }
        }



    }
}
