package org.example;

import java.util.Scanner;

public class Exec29 {
    public static void main(String[] args) {
        // Definição dos cantos opostos do retângulo
        int x1 = 0, y1 = 0;
        int x2 = 0, y2 = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro ponto (x1):");
        x1 = scanner.nextInt();
        System.out.println("Digite o primeiro ponto (y1):");
        y1 = scanner.nextInt();

        System.out.println("Digite o segundo ponto (x2):");
        x2 = scanner.nextInt();
        System.out.println("Digite o segundo ponto (y2):");
        y2 = scanner.nextInt();

        // Verificando o tipo de figura formada pelos dois pontos
        if (x1 == x2 && y1 == y2) {
            System.out.println("Os pontos formam um PONTO.");
        } else if (x1 == x2) {
            System.out.println("Os pontos formam uma RETA VERTICAL.");
        } else if (y1 == y2) {
            System.out.println("Os pontos formam uma RETA HORIZONTAL.");
        } else {
            System.out.println("Os pontos formam um RETÂNGULO.");
        }

        // Normalização das coordenadas para garantir que left seja o ponto mais à esquerda
        int left = Math.min(x1, x2);
        int right = Math.max(x1, x2);
        int top = Math.max(y1, y2);
        int bottom = Math.min(y1, y2);

        // Cálculo da área
        int area = (right - left) * (top - bottom);

        // Exibição do retângulo e área
        if (x1 != x2 && y1 != y2) {  // Se não for um ponto ou reta
            System.out.println("Retângulo definido de (" + left + "," + bottom + ") até (" + right + "," + top + ")");
            System.out.println("Área: " + area);
        }
        System.out.println();

        // Ponto a ser verificado
        System.out.println("Digite o ponto para verificar sua posição (px py):");
        int px = scanner.nextInt();
        int py = scanner.nextInt();

        // Verificação da posição do ponto em relação ao retângulo
        if (px > left && px < right && py > bottom && py < top) {
            System.out.println("Dentro do retângulo");
        } else if (px >= left && px <= right && py >= bottom && py <= top &&
                (px == left || px == right || py == top || py == bottom)) {
            System.out.println("Na linha do retângulo");
        } else if (px < left && py > top) {
            System.out.println("Acima e à esquerda");
        } else if (px >= left && px <= right && py > top) {
            System.out.println("Acima");
        } else if (px > right && py > top) {
            System.out.println("Acima e à direita");
        } else if (px < left && py < bottom) {
            System.out.println("Embaixo e à esquerda");
        } else if (px >= left && px <= right && py < bottom) {
            System.out.println("Embaixo");
        } else if (px > right && py < bottom) {
            System.out.println("Embaixo e à direita");
        } else if (px < left && py >= bottom && py <= top) {
            System.out.println("À esquerda");
        } else if (px > right && py >= bottom && py <= top) {
            System.out.println("À direita");
        }
    }
}
