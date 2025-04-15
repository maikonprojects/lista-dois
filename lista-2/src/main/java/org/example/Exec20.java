package org.example;

import java.util.Scanner;

public class Exec20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1° pessoa: Escreva seu nome ");
        String nome1 = scanner.nextLine();

        System.out.println("2° pessoa: Escreva seu nome ");
        String nome2 = scanner.nextLine();

        System.out.println("1° pessoa: Digite sua idade ");
        int idade1 = scanner.nextInt();


        System.out.println("2° pessoa: Digite sua idade ");
        int idade2 = scanner.nextInt();

        if (idade1 > idade2){
            System.out.println("A pessoa mais velha é: " + nome1);
        }else {
            System.out.println("A pessoa mais velha é: " + nome2);
        }

    }
}
