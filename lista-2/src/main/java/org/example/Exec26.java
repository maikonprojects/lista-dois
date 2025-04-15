package org.example;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exec26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");


        try {
            System.out.println("Insira uma horário: ");
            String horarioTexto1 = scanner.nextLine();
            LocalTime horario1 = LocalTime.parse(horarioTexto1, formatter);



            System.out.println("Insira o segundo horário: ");
            String horarioTexto2 = scanner.nextLine();
            LocalTime horario2 = LocalTime.parse(horarioTexto2, formatter);

            int segundo1 = horario1.toSecondOfDay();
            int segundo2 = horario2.toSecondOfDay();

            int diferenca = Math.abs(segundo1 - segundo2);
            //Math.abs -> não importa a ordem

            System.out.println("A diferença é de: " + diferenca + " segundos");

        }catch (Exception e){
            System.out.println("Horário inválido!");
        }


    }
}
