package br.com.devsdoagi.Exerc01;

import java.util.Random;
import java.util.Scanner;

public class Rotacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Digite o tamanho NxN da matriz: ");
        int N = sc.nextInt();

        int[][] mat = new int[N][N];

        // Preenche matriz original
        System.out.println("Matriz original:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                mat[i][j] = rand.nextInt(20);
                System.out.printf("%2d  ", mat[i][j]);
            }
            System.out.println();
        }

        // Cria matriz rotacionada
        int[][] mat2 = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                mat2[j][N - 1 - i] = mat[i][j];
            }
        }

        // Imprime matriz rotacionada
        System.out.println("\nMatriz rotacionada 90°:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.printf("%2d  ", mat2[i][j]);
            }
            System.out.println();
        }
    }
}
