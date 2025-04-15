package org.example;

import java.util.Scanner;

public class Exec5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da dívida ");
        Double valorDivida = scanner.nextDouble();

        System.out.println("Digite a quantidade de meses: ");
        Double qtdMeses = scanner.nextDouble();

        System.out.println("Digite o valor do juros ");
        Double juros = scanner.nextDouble();



        System.out.println("Divida final: " + ((valorDivida * qtdMeses * (juros/100)) + valorDivida) );

    }
}
