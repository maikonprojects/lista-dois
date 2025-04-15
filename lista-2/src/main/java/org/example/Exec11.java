package org.example;

import java.util.Scanner;

public class Exec11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade ");
        Integer idade = scanner.nextInt();

        if(idade < 16){
            System.out.println("Você não pode votar");
        }else if (idade > 65 || idade < 18){
            System.out.println("Seu voto é facultativo");
        }else {
            System.out.println("Seu voto é obrigatório");
        }

    }
}
