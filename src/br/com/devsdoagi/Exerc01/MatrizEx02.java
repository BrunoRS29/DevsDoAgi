package br.com.devsdoagi.Exerc01;
import java.util.Random;

public class MatrizEx02 {
    public static double encontrarMaiorValor(double[][] matriz) {
        double maior = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
        }
        return maior;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        double[][] matriz = new double[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                double n = rand.nextDouble(100);
                matriz[i][j] = n;
                System.out.printf("%.2f   ",matriz[i][j]);
            }
            System.out.print("\n");
        }

        double maior = encontrarMaiorValor(matriz);
        System.out.printf("\nmaior valor: %.2f", maior);
    }
}