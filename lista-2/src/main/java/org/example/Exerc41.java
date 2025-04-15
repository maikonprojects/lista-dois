package org.example;
import java.util.Random;
import java.util.Scanner;

public class Exerc41 {
    public static void main(String[] args) {
        Random numSorteAx = new Random();
        Scanner scanner = new Scanner(System.in);

        Integer numSorteado = numSorteAx.nextInt(101);

        Integer numResp = 0;
        Integer contadorDeTentativas = 0;

        while (numResp != numSorteado){
            System.out.println("Digite um número: ");

            numResp = scanner.nextInt();

            if(numResp > numSorteado){
                System.out.println("DICA: O número sorteado é menor que " + numResp);
            }else {
                System.out.println("DICA: O número sorteado é maior que " + numResp);
            }System.out.println("");
            contadorDeTentativas++;

            if(numResp.equals(numSorteado)){
                System.out.println("PARABÉNS VOCÊ ACERTOU!!!");
                System.out.println("Número de tentativa(s): "+ contadorDeTentativas);
            }
        }
    }
}
