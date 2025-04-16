package org.example;

public class Exerc52 {
    public static void main(String[] args) {
        long totalGrao = 0;

        for (int i = 1; i <= 64; i++) {
            totalGrao += Math.pow(2, i - 1);
        }

       long totalSaco = totalGrao/1000000;
        if (totalGrao % 1000000 != 0){
            totalSaco++;
        }

        System.out.println("A quantidade de sacos de arroz é: " + totalSaco);

    }
}
