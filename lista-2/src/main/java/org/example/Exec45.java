package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exec45 {
    public static void main(String[] args) {
        int ax = 0;
        Scanner scanner = new Scanner(System.in);
        double axSoma = 0.0;
        List<Double> lista = new ArrayList<>();

        while (ax <= 100){
            System.out.println("Digite número para adicionar na lista : ");
            axSoma = scanner.nextDouble();
            lista.add(axSoma);
            ax++;
        }

        double maiorNumero = 0.0;

        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i) > maiorNumero){
                maiorNumero = lista.get(i);
            }
        }
        System.out.println(maiorNumero + " é o maior número de todos adicionados!");

    }
}
