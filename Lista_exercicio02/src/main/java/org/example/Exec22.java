package org.example;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exec22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM");

        System.out.println("1° pessoa: Digite sua data de aniversário ");
        String data1 = scanner.nextLine();

        System.out.println("2° pessoa: Digite sua data de aniversário ");
        String data2 = scanner.nextLine();

        if (data1.equals(data2)){
            System.out.println("Vocês fazem aniversário no mesmo dia!!");
        }else {
            System.out.println("São datas diferentes");
        }

    }
}
