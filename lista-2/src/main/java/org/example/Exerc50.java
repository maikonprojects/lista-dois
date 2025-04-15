package org.example;

import java.util.Scanner;

public class Exerc50 {

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0, b = 1, c;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o n-ézimo: ");
        int n = scanner.nextInt();
        int resultado = fibonacci(n);

        System.out.println("O " + n + "º termo da sequência de Fibonacci é: " + resultado);

        scanner.close();
    }
}
