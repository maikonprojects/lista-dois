package org.example;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class Exec15 {
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

        }catch (DateTimeException i){
            System.out.println("Mês não valido");
        }



    }
}
