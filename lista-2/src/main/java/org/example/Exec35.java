package org.example;

import java.util.Random;
import java.util.Scanner;

public class Exec35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de números sorteados que você quer: ");
        Integer numRes = scanner.nextInt();

        System.out.println("Digite o primeiro numero do range: ");
        Integer r1 = scanner.nextInt();

        System.out.println("Digite o segundo numero do range: ");
        Integer r2 = scanner.nextInt();

        Random random = new Random();

        for (int i = 1; i <= numRes; i++) {
            System.out.println(i+"° número da sorte: " + (random.nextInt(r1 + 101) + r2));
        }
    }
}
