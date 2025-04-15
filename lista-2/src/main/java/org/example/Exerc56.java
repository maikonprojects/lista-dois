package org.example;

import java.util.Scanner;

public class Exerc56 {
    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);

        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;
        int votoBranco = 0;
        int total = 0;


            System.out.println("Vote em um candidato: ");
            System.out.println("1 - Candidato 1");
            System.out.println("2 - Candidato 2");
            System.out.println("3 - Candidato 3");
            System.out.println("4 - Voto em Branco");
            System.out.println("5 - Sair");

            while (true){

                int opcao = menu.nextInt();

                switch (opcao){
                    case 1:
                        candidato1++;
                        total++;
                        break;

                    case 2:
                        candidato2++;
                        total++;
                        break;

                    case 3:
                        candidato3++;
                        total++;
                        break;

                    case 4:
                        votoBranco++;
                        total++;
                        break;

                }
                total++;
                if (opcao == 5){
                    mostrarResultado(candidato1, candidato2, candidato3, votoBranco);
                    break;

                }

            }

    }

    public static void mostrarResultado(int c1, int c2, int c3, int branco){
        int totalVotos = c1 + c2 + c3 + branco;

        double p1 = (c1 * 100.00)/totalVotos;
        double p2 = (c2 * 100.00)/totalVotos;
        double p3 = (c3 * 100.00)/totalVotos;
        double pBranco = (branco * 100.00)/totalVotos;

        System.out.println("Resultado da votação: ");
        System.out.printf("Candidato 1: %d votos (%.2f%%)\\n", c1, p1);
        System.out.printf("Candidato 2: %d votos (%.2f%%)\\n", c2, p2);
        System.out.printf("Candidato 3: %d votos (%.2f%%)\\n", c3, p3);
        System.out.printf("Votos em branco %d (%.2f%%)\\n ", branco,pBranco);

        String vencedor = "Empate";
        if (c1 > c2 && c1 > c3){
            vencedor = "Candidato 1";
        } else if (c2 > c1 && c2 > c3) {
            vencedor = "Candidato 2";
        }else {
            vencedor = "Candidato 3";
        }

        System.out.println("Vencedor: " + vencedor);

    }
}
