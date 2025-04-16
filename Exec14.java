package org.example;

import java.util.Scanner;

public class Exec14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva o nome do mês: ");
        String mes = scanner.nextLine();


            if (mes.equals("Janeiro")){
                System.out.println("O mês de Janeiro é número 01 do calendário");
            } else if (mes.equals("Fevereiro")) {
                System.out.println("O mês de Fevereiro é o número 02 do calendário");
            } else if (mes.equals("Março")) {
                System.out.println("O mês de Março é o número 03 do calendário");
            } else if (mes.equals("Abril")) {
                System.out.println("O mês de Abril é o número 04 do calendário");
            } else if (mes.equals("Maio")) {
                System.out.println("O mês de Maio é o número 05 do calendário");
            } else if (mes.equals("Junho")) {
                System.out.println("O mês de Junho é o número 06 do calendário");
            } else if (mes.equals("Julho")) {
                System.out.println("O mês de Julho é o número 07 do calendário");
            } else if (mes.equals("Agosto")) {
                System.out.println("O mês de Agosto é o número 08 do calendário");
            } else if (mes.equals("Setembro")) {
                System.out.println("O mês de Setembro é o número 09 do calendário");
            } else if (mes.equals("Outubro")) {
                System.out.println("O mês de Outubro é o número 10 do calendário");
            } else if (mes.equals("Novembro")) {
                System.out.println("O mês de Novembro é o número 11 do calendário");
            } else if (mes.equals("Dezembro")) {
                System.out.println("O mês de Dezembro é o número 12 do calendário");
            } else {
                System.out.println("Não existe esse nome de mês!");
            }


    }
}
