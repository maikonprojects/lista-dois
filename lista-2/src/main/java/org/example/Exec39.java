package org.example;

import org.graalvm.nativeimage.Platform;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exec39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para verificar para ver se é perfeito: ");
        Double numResp = scanner.nextDouble();

        List<Double> listaDeDivisores = new ArrayList<>();

        for (double i = 1; i < numResp ; i++) {
            if(numResp % i == 0){
                listaDeDivisores.add(i);
            }
        }

        Double somaCheck = 0.0;

        for (int i = 0; i < listaDeDivisores.size(); i++) {
            somaCheck += listaDeDivisores.get(i);
        }

        if (somaCheck.equals(numResp)){
            System.out.println(numResp + " é um número perfeito!");
        }else {
            System.out.println(numResp + " não é um número perfeito!");
        }

    }
}
