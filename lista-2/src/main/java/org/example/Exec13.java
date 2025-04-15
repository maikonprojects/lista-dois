
package org.example;

import java.util.Scanner;

public class Exec13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua primeira nota do semestre: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite sua segunda nota do semestre: ");
        double nota2 = scanner.nextDouble();
        System.out.println("Digite sua terceira nota do semestre: ");
        double nota3 = scanner.nextDouble();
        double media = (nota1 + nota2 + nota3) / 3;
        if (media >= 7.0) {
            System.out.println("Você foi aprovado e sua média foi: " + media);
        } else if ((media >= 5.0) && (media < 7.0)) {
            System.out.println("Você está de recuperação, sua média foi e fará a prova final: " + media);
        } else {
            System.out.println("Você está reprovado, sua média foi: " + media);
        }
    }
}
 