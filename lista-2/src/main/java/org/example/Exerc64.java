package org.example;


import java.util.ArrayList;import java.util.List;
import java.util.Scanner;

public class Exerc64 {
    public static void main(String[] args) {
        String tst = "*";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantide de linhas desejadas: ");
        int qtdLinhas = scanner.nextInt();

        for (int i = 1; i < qtdLinhas; i++) {
            for (int j = 1; j <=i ; j++) {
                for (int k = 1; k <= j; k++) {
                    System.out.print(tst);
                }
                System.out.println();
            }
            System.out.println();

        }
    }
}