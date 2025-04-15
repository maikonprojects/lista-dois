package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exec23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da primeira pessoa: ");
        String nome1 = scanner.nextLine();

        System.out.println(nome1 + ", digite seu dia de nascimento: ");
        int dia = scanner.nextInt();

        System.out.println(nome1 + ", digite seu mês de nascimento: ");
        int mes = scanner.nextInt();
        scanner.nextLine();
        // -------------------------------------------

        System.out.println("Digite o nome da segunda pessoa: ");
        String nome2 = scanner.nextLine();

        System.out.println(nome2 + ", digite seu dia de nascimento: ");
        int dia2 = scanner.nextInt();

        System.out.println(nome2 + ", digite seu mês de nascimento: ");
        int mes2 = scanner.nextInt();

        if(mes2 < mes){
            System.out.println(nome2 + " faz aniversário primeiro!");
        }else if(mes < mes2){
            System.out.println(nome1 + " faz aniversário primeiro!");
        }else {
            if (dia2 < dia){
                System.out.println(nome2 + " faz aniversário primeiro!");
            }else {
                System.out.println(nome1 + " faz aniversário primeiro!");
            }
        }

    }
}
