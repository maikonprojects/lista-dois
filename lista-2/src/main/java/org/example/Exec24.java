package org.example;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Exec24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Informe uma data: ");
        String dataTexto = scanner.nextLine();



        try {

            LocalDate data = LocalDate.parse(dataTexto, formatter);

            int dia = data.getDayOfMonth();
            int mes = data.getMonthValue();
            int ano = data.getYear();

           boolean bissexto = (ano % 4 == 0 && ano % 100 == 0)  || (ano % 400 == 0);

           if (bissexto == false){
               System.out.println("Os mesês que possui 30 dias são: 4, 6, 9 e 11");
               System.out.println("O ano: " + ano + " é bissexto: " + bissexto);
           }else {
               System.out.println("O ano é bissexto pois o mês de feverero possui 29 dias!");
           }



        }catch (Exception e){
            System.out.println("Data inválida");
        }



    }

}
