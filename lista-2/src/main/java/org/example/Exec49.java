package org.example;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exec49 {
    public static void main(String[] args) {

        BigInteger a = BigInteger.valueOf(0);
        BigInteger b = BigInteger.valueOf(1);
        BigInteger c = BigInteger.ZERO;

        for (int i = 2; i < 50; i++) {
            c = a.add(b);
            a = b;
            b = c;
            System.out.println(c);
        }
    }
}
