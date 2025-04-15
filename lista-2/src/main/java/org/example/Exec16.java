package org.example;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class Exec16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o dia: ");
        int dia = scanner.nextInt();

        System.out.println("Digite o mês: ");
        int mes = scanner.nextInt();


        try {
                LocalDate check = LocalDate.of(2025, mes, dia);
                LocalDate data = LocalDate.of(2023, mes, 1); // qualquer dia serve

                String nomeMes = data.getMonth().getDisplayName(TextStyle.FULL, new Locale("pt", "BR"));
                System.out.println("Mês ok");
                System.out.println(nomeMes);

                if (mes >= 1 && mes <= 3) {
                    System.out.println("Você está no 1° Trimestre do mês");
                } else if (mes >= 4 && mes <= 6) {
                    System.out.println("Você está no 2° Trimestre do mês");
                } else if (mes >= 7 && mes <= 9) {
                    System.out.println("Você está no 3° Trimestre do mês");
                } else if (mes >= 10 && mes <= 12) {
                    System.out.println("Você está no 4° Trimestre do mês");
                }

        }
        catch (DateTimeException i) {
            System.out.println("Mês não valido");
        }




    }
}
