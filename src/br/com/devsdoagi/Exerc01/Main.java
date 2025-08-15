package br.com.devsdoagi.Exerc01;
import java.util.Random;

public class Main {
    public static void preencherMatriz(double[][] matriz) {
        Random rand = new Random();

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                double n = rand.nextDouble(200)+1;
                matriz[i][j] = n;
                System.out.printf("%.2f ",matriz[i][j]);
            }
            System.out.print("\n");
        }

        double soma = calcularSomaTotal(matriz);
        System.out.printf("A soma é: %.2f", soma);
    }

    public static double calcularSomaTotal(double[][] matriz) {
        double soma = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                soma = soma + matriz[i][j];
            }
        }
        return soma;
    }

    public static void main(String[] args) {
        double[][] matriz = new double[2][2];
        preencherMatriz(matriz);
    }
}
