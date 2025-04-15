package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exec27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        Double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo numero: ");
        Double num2 = scanner.nextDouble();

        System.out.println("Digite o terceiro numero: ");
        Double num3 = scanner.nextDouble();

        List<Double> lista = new ArrayList<>();

        lista.add(num1);
        lista.add(num2);
        lista.add(num3);

        Double maiorNum = 0.0;
        for (int i = 0; i < lista.size() - 1; i++) {
            if(lista.get(i) > maiorNum){
                maiorNum = lista.get(i);
            }
        }

        System.out.println("O maior número é " + maiorNum);
    }
}
