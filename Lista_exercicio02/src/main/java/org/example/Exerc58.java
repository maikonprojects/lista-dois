package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exerc58 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Digite a data: ");
        String data = scanner.nextLine();

        System.out.print("Digite a quantidade de dias a somar: ");
        int dias = scanner.nextInt();

        try {

            LocalDate dataFinal = LocalDate.parse(data, formatter);


            LocalDate novaData = dataFinal.plusDays(dias);


            System.out.println("Nova data: " + novaData.format(formatter));
        } catch (Exception e) {
            System.out.println("Data inválida! Certifique-se de usar o formato dd/MM/yyyy.");
        }

    }
}
