package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exec19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        Double primeiroNum = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        Double segundoNum = scanner.nextDouble();

        List<Double> lista = new ArrayList<>();
        lista.add(primeiroNum);
        lista.add(segundoNum);
        Collections.sort(lista);
        System.out.println(lista);
    }
}
