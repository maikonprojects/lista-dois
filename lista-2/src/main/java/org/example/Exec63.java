package org.example;

import java.util.Scanner;

public class Exec63 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de linha desejadas: ");
        Integer qtdLin = scanner.nextInt();

        String num = "";

        for (int i = 1; i <= qtdLin; i++) {
            if(i < 10){
                num += "0" + i + " ";
            }else {
                num += i + " ";
            }
            System.out.println(num);
        }

    }
}
