package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exec57 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Digite primeira data para o primeiro intervalo: ");
        String data1Res = scanner.nextLine();
        System.out.println("Digite segunda data para o primeiro intervalo: ");
        String data2Res = scanner.nextLine();


        LocalDate data1 = LocalDate.parse(data1Res, formatter);
        LocalDate data2 = LocalDate.parse(data2Res, formatter);



        while (!data1.equals(data2)){
            System.out.println(data1);
            data1 = data1.plusDays(1);
        }

    }
}
