package org.example;

import java.util.ArrayList;import java.util.List;
import java.util.Scanner;
public class Exerc62 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de linhas desejadas: ");
        int qtdLinhas = scanner.nextInt();

        for (int i = 1; i <= qtdLinhas; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.printf("%02d ", i);
            }
            System.out.println();
        }
    }
}
