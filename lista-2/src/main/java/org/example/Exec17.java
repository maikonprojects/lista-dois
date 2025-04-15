package org.example;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class Exec17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o dia: ");
        int dia = scanner.nextInt();
        System.out.println("Digite o mês: ");
        int mes = scanner.nextInt();
        try {
            LocalDate check = LocalDate.of(2025, mes, dia);
            LocalDate data = LocalDate.of(2023, mes, 1);
            // qualquer dia serve
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

            String signo = "";

            if ((dia >= 21 && mes == 3) || (dia <= 19 && mes == 4)) {
                signo = "Áries";
            } else if ((dia >= 20 && mes == 4) || (dia <= 20 && mes == 5)) {
                signo = "Touro";
            } else if ((dia >= 21 && mes == 5) || (dia <= 20 && mes == 6)) {
                signo = "Gêmeos";
            } else if ((dia >= 21 && mes == 6) || (dia <= 22 && mes == 7)) {
                signo = "Câncer";
            } else if ((dia >= 23 && mes == 7) || (dia <= 22 && mes == 8)) {
                signo = "Leão";
            } else if ((dia >= 23 && mes == 8) || (dia <= 22 && mes == 9)) {
                signo = "Virgem";
            } else if ((dia >= 23 && mes == 9) || (dia <= 22 && mes == 10)) {
                signo = "Libra";
            } else if ((dia >= 23 && mes == 10) || (dia <= 21 && mes == 11)) {
                signo = "Escorpião";
            } else if ((dia >= 22 && mes == 11) || (dia <= 21 && mes == 12)) {
                signo = "Sagitário";
            } else if ((dia >= 22 && mes == 12) || (dia <= 19 && mes == 1)) {
                signo = "Capricórnio";
            } else if ((dia >= 20 && mes == 1) || (dia <= 18 && mes == 2)) {
                signo = "Aquário";
            } else if ((dia >= 19 && mes == 2) || (dia <= 20 && mes == 3)) {
                signo = "Peixes";
            }

            System.out.println(signo);

        }
        catch (DateTimeException i) {
            System.out.println("Mês não valido");
        }


    }}