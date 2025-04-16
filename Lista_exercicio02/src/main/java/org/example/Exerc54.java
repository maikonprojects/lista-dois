package org.example;

import java.util.Scanner;

public class Exerc54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o valor em reais: ");
        double real = scanner.nextDouble();

        System.out.println("Insira o valor em dolar: ");
        double dolar = scanner.nextDouble();

        double realParaDolar = real / 5.87;
        double dolarParaReal = dolar * 5.87;

        System.out.println("Seu valor em real: " + real);
        System.out.println("Seu valor em real para dolar: " + realParaDolar);
        System.out.println("Seu valor em dolar: " + dolar);
        System.out.println("Seu valor em dolar para real: " + dolarParaReal);
    }
}
