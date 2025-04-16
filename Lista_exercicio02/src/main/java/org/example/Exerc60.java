package org.example;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class Exerc60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DecimalFormatSymbols symbols = new DecimalFormatSymbols(new Locale("pt", "BR"));
        symbols.setDecimalSeparator(',');
        symbols.setGroupingSeparator('.');
        DecimalFormat df = new DecimalFormat("###,##0.00", symbols);


        System.out.print("Digite o valor inicial da dívida (R$): ");
        double divida = sc.nextDouble();

        System.out.print("Digite a taxa de correção mensal (%): ");
        double taxa = sc.nextDouble();

        System.out.print("Digite a quantidade de anos: ");
        int anos = sc.nextInt();


        System.out.printf("%-8s", "Anos");
        String[] meses = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun",
                "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        for (String mes : meses) {
            System.out.printf("%8s", mes);
        }
        System.out.println();


        int anoAtual = 2007;
        for (int i = 0; i < anos; i++) {
            System.out.printf("%-8d", anoAtual);
            for (int m = 0; m < 12; m++) {
                System.out.printf("%8s", df.format(divida));
                divida *= (1 + taxa / 100.0);
            }
            System.out.println();
            anoAtual++;
        }

    }
}