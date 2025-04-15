package org.example;

import java.util.Scanner;

public class Exec7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da conta: ");
        double valorConta = scanner.nextDouble();

        System.out.println("O valor do 10% para o garçom: " + valorConta*0.10);

    }
}
