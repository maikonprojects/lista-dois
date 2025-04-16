package org.example;

public class Exerc30 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        Ponto[] pontos1 = new Ponto[4];
        Ponto[] pontos2 = new Ponto[4];

        System.out.println("Digite os 4 pontos do primeiro retângulo (x y):");
        for (int i = 0; i < 4; i++) {
            pontos1[i] = new Ponto(sc.nextInt(), sc.nextInt());
        }

        System.out.println("Digite os 4 pontos do segundo retângulo (x y):");
        for (int i = 0; i < 4; i++) {
            pontos2[i] = new Ponto(sc.nextInt(), sc.nextInt());
        }

        Retangulo r1 = new Retangulo(pontos1);
        Retangulo r2 = new Retangulo(pontos2);

        boolean intersecao = r1.intercepta(r2);
        System.out.println("Os retângulos se interceptam? " + (intersecao ? "Sim" : "Não"));

    }
}

class Ponto {
    int x, y;

    Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Retangulo {
    int minX, maxX, minY, maxY;

    Retangulo(Ponto[] pontos) {
        minX = maxX = pontos[0].x;
        minY = maxY = pontos[0].y;

        for (int i = 1; i < 4; i++) {
            if (pontos[i].x < minX) minX = pontos[i].x;
            if (pontos[i].x > maxX) maxX = pontos[i].x;
            if (pontos[i].y < minY) minY = pontos[i].y;
            if (pontos[i].y > maxY) maxY = pontos[i].y;
        }
    }

    boolean intercepta(Retangulo outro) {
        return !(this.maxX <= outro.minX || this.minX >= outro.maxX ||
                this.maxY <= outro.minY || this.minY >= outro.maxY);
    }
}
