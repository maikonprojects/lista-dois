package org.example;

import java.util.Scanner;

public class Exec21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu setor: ");
        String cargo = scanner.nextLine();

        System.out.println("Digite seu salário: ");
        Double sal = scanner.nextDouble();

        if(cargo.equalsIgnoreCase("Diretoria")){
            System.out.println("O valor máximo de empréstimo é: " + sal * 0.30);
        } else if(cargo.equalsIgnoreCase("Gerência")){
            System.out.println("O valor máximo de empréstimo é: " + sal * 0.25);
        } else if(cargo.equalsIgnoreCase("Operacional")){
            System.out.println("O valor máximo de empréstimo é: " + sal * 0.20);
        }

    }
}
