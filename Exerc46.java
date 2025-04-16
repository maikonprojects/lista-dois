package org.example;

import java.util.Random;

public class Exerc46 {
    public static void main(String[] args) {
        Random random = new Random();

        int pessoa = 200;
        int homem = 0;
        int mulher = 0;

        for (int i = 1; i <= pessoa; i++) {
            char genero = random.nextBoolean() ? 'M' : 'F';
            // serve para sortear

            int idade = random.nextInt(101);
            // idade que um ser humano consegue viver

            if (idade >= 18) {
                if (genero == 'M') {
                    homem++;
                } else {
                    mulher++;
                }


            }

        }

        System.out.println("Total de pessoas: " + pessoa);
        System.out.println("Homens maiores de idade: " + homem);
        System.out.println("Mulheres maiores de idade: " + mulher);
    }
}
