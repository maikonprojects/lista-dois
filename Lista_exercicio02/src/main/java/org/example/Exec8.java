package org.example;

import java.util.Scanner;

public class Exec8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numerador: ");
        double numerador = scanner.nextDouble();

        System.out.println("Digite o denominador: ");
        double denominador = scanner.nextDouble();

        if (denominador != 0){
            double resultado = numerador / denominador;
            System.out.println("O número real deste número Racional é: " + resultado);
        }else {
            System.out.println("O denominador não pode ser igual a 0");
        }



    }
}
