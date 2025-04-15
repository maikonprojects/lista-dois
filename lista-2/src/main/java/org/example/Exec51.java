package org.example;

import java.math.BigInteger;
import java.util.Scanner;

public class Exec51 {
    public static void main(String[] args) {
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        BigInteger c = BigInteger.ONE;
        BigInteger d;



        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantoidade de termos que deseja exibir: ");
        int n = scanner.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        for (int i = 3; i < n; i++) {
            d = a.add(b).add(c);
            System.out.println(d);
            a = b;
            b = c;
            c = d;
        }
    }
}
