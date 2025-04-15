package org.example;

import java.util.Scanner;

public class Exec53 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual taboada você deseja: ");
        int tabuada = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println( tabuada + " X " + i + " = " + (tabuada * i));
        }

    }
}
