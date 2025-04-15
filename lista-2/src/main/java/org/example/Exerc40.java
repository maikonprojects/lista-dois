package org.example;

import java.util.Scanner;

public class Exerc40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de pessoas na equipe: ");
        int qtdPessoa = scanner.nextInt();

        int soma = 0;
        int maiorIdade = Integer.MIN_VALUE;
        int menorIdade = Integer.MAX_VALUE;
        int qtdMaiores = 0;

        for (int i = 1; i <= qtdPessoa; i++) {
            System.out.println("Digite a idade: ");
            int idade = scanner.nextInt();
            soma += idade;

            if (idade >= 18){
                qtdMaiores++;

            }

            if (idade < menorIdade) {
                menorIdade = idade;

            }


            if (idade > maiorIdade){
                maiorIdade = idade;

            }

        }

        double media = soma / qtdPessoa;


        System.out.println("Possúi: " + qtdMaiores + " pessoas maiores de idade");
        System.out.println("A menor idade é a de: " + menorIdade);
        System.out.println("A maior idade é a de: " + maiorIdade);
        System.out.println("A média de todas as idades é: " + media);




    }
}
