package org.example;

import java.util.Scanner;

public class Exec10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu salário bruto: ");
        double salBruto = scanner.nextDouble();

        System.out.println("Digite o valor dos descontos ");
        double desconto = scanner.nextDouble();

        System.out.println("Digite o valor do empréstimo desejado: ");
        double emprestimoVal = scanner.nextDouble();

        double salLiquido = salBruto - desconto;
        double salComparacao = salLiquido * 0.30;
        if( salComparacao >= emprestimoVal){
            System.out.println("Empréstimo concedido!");
        }else {
            System.out.println("Empréstimo negado!");
        }

    }
}
