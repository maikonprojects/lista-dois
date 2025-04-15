package org.example;

import java.time.DateTimeException;
import java.time.LocalTime;
import java.util.Scanner;

public class Exec25 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da hora");
        Integer hora = scanner.nextInt();
        System.out.println("Digite o valor dos minutos");
        Integer minutos = scanner.nextInt();
        System.out.println("Digite o valor dos segundos");
        Integer segundo = scanner.nextInt();


        try {
            LocalTime horaCheck = LocalTime.of(hora, minutos, segundo);

            System.out.println(horaCheck + " - Este horário está ok");
        }catch (DateTimeException i){
            System.out.println("horário inválido");
        }

    }
}
