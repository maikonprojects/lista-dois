package org.example;

import java.awt.desktop.SystemSleepEvent;
import java.math.BigInteger;
import java.util.Locale;
import java.util.Scanner;

public class Exec37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double num = scanner.nextDouble();

        BigInteger total = BigInteger.ONE;
        for (double i = num; i >= 1 ; i--) {
            total = total.multiply(BigInteger.valueOf((long) i));
        }
        System.out.println(total);

    }
}
