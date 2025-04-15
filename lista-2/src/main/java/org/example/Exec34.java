package org.example;

import java.util.Random;

public class Exec34 {
    public static void main(String[] args) {

        Random random = new Random();
        for (int i = 1; i <= 50; i++) {
            System.out.println(i+"° número da sorte: " + random.nextInt(101));
        }
    }
}
