package org.example;

import java.util.*;

public class Exerc42 {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("40 Grupos de 3 números sorteados de 0 a 59: ");

        for (int i = 1; i <= 40; i++) {
            Set<Integer> grupo = new HashSet<>();


            while (grupo.size() < 3) {
                int numero = random.nextInt(60);
                grupo.add(numero);
            }


            List<Integer> numerosOrdenados = new ArrayList<>(grupo);
            Collections.sort(numerosOrdenados);

            System.out.printf("Grupo %02d: %s\n", i, numerosOrdenados);


        }
    }
}
