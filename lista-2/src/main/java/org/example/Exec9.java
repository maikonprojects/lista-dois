package org.example;

import java.time.LocalDate;
import java.util.Scanner;

public class Exec9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o ano de nascimento: ");
        Integer ano = scanner.nextInt();

        Integer anoAtual =  LocalDate.now().getYear();

        System.out.println(anoAtual);
        if((anoAtual - ano) <= 18){
            System.out.println("Você é menor de idade");
        }else {
            System.out.println("Você é maior de idade");
        }

    }
}
