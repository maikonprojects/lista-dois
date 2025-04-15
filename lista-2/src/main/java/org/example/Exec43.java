package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exec43 {
    public static void main(String[] args) {

        List<Double> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int ax = 0;
        double axSoma = 0.0;

        while (ax < 500){
            System.out.println("Digite um número para somar: ");
            axSoma = scanner.nextDouble();
            lista.add(axSoma);
            ax++;
        }

        for (int i = 0; i < lista.size() - 1; i++) {
            axSoma += lista.get(i);
        }

        System.out.println("A média aritmética é: " + axSoma/lista.size());
    }
}
