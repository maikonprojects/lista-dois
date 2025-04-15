package org.example;

import java.util.Scanner;

public class Exec65 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String txt = "*";

        System.out.println("Digite a quantidade de linha desejadas: ");
        Integer qtdLin = scanner.nextInt();


            for (int i = 1; i <= qtdLin; i++) {
                for (int j = 1; j <= qtdLin - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print("*");
                }
                System.out.println();
            }



    }
}
