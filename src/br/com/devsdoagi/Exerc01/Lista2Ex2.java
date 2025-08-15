package br.com.devsdoagi.Exerc01;

import java.util.Random;
import java.util.Scanner;

public class Lista2Ex2 {
    public static double totalPago(double[][] pagamentos, int cliente) {
        double totalPago = 0;

        for (int i = 0; i < pagamentos[cliente].length; i++) {
            totalPago += pagamentos[cliente][i];
        }

        return totalPago;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.printf("Digite a quantidade de clientes: ");
        int C = sc.nextInt();

        System.out.printf("Digite a quantidade de parcelas: ");
        int P = sc.nextInt();

        double[][] valores = new double[C][P];

        for (int i = 0; i < C; i++) {
            for (int j = 0; j < P; j++) {
                valores[i][j] = rand.nextDouble(500);
            }
        }

        System.out.printf("Digite o cliente q deseja consultar o saldo de 1 até %d: ", C);
        int cliente = (sc.nextInt()) - 1;

        double totalPago = totalPago(valores, cliente);

        System.out.printf("Total pago pelo cliente %d é: %.2f", cliente + 1, totalPago);

    }
}
