package org.example;

import java.util.Scanner;

public class Exec55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double mensal = 50.0;
        double saldoExce = 0.0;
        int minutos = 100;
        int minutosVaiVai = 50;
        String resp = "";
        int respMinutos = 0;
        int axMinExcedente = 0;

        System.out.println("Digite 'fim' para finalizar!");
        while (true){

            System.out.print("Digite o tipo da ligação - [O] outros [V] vai-vai [F] fixo: ");
            resp = scanner.nextLine();

            System.out.print("Digite q quantidade de minutos: ");
            respMinutos = scanner.nextInt();

            if(resp.equalsIgnoreCase("fim")){
                break;
            }

            if (resp.equalsIgnoreCase("V") && (minutosVaiVai - respMinutos) >= 0){
                minutosVaiVai -= respMinutos;
            }else if(resp.equalsIgnoreCase("V") || resp.equalsIgnoreCase("F") || resp.equalsIgnoreCase("O") && (minutos - respMinutos) >= 0){
                minutos -= respMinutos;
            }else {
                if(minutos > 0){
                    axMinExcedente = respMinutos - minutos;
                    minutos -= (respMinutos - axMinExcedente);
                    if(resp.equalsIgnoreCase("V")){
                        saldoExce += 0.20 * axMinExcedente;
                    }
                    if(resp.equalsIgnoreCase("F")){
                        saldoExce += (0.65/2) * axMinExcedente;
                    }
                    if(resp.equalsIgnoreCase("o")){
                        saldoExce += 0.65 * axMinExcedente;
                    }

                }else {
                    if(resp.equalsIgnoreCase("V")){
                        saldoExce += 0.20 * respMinutos;
                    }
                    if(resp.equalsIgnoreCase("F")){
                        saldoExce += (0.65/2) * respMinutos;
                    }
                    if(resp.equalsIgnoreCase("o")){
                        saldoExce += 0.65 * respMinutos;
                    }
                }
            }

            System.out.println("Seus minutos: " + minutos);
            System.out.println("Seus minutos exclusivos para Vai-vai: " + minutosVaiVai);
            System.out.println("Seus saldo a pagar: " + saldoExce);

            scanner.nextLine();

        }


    }
}
