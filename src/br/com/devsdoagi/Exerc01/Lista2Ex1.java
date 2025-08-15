package br.com.devsdoagi.Exerc01;

import java.util.Random;
import java.util.Scanner;

public class Lista2Ex1 {
    public static double saldoFinal(double[][] saldos, int cliente) {
        double saldoFinal = 0;
        for (int i = 0; i < saldos[cliente].length; i++) {
            saldoFinal = saldoFinal + saldos[cliente][i];
        }

        return saldoFinal;
    }

    public static double[] saldoFinalTodos(double[][] saldos) {
        double[] saldoFinalTodos = new double[saldos.length];

        for (int i = 0; i < saldos.length ; i++) {
            for (int j = 0; j < saldos[i].length; j++) {
                saldoFinalTodos[i] += saldos[i][j];
            }
        }

        return saldoFinalTodos;
    }

    public static void imprimirExtratoClientes(double[][] saldos) {
        for (int i = 0; i < saldos.length; i++) {
            System.out.printf("Cliente %d: ", i+1);
            for (int j = 0; j < saldos[i].length; j++) {
                System.out.printf("%.2f  ", saldos[i][j]);
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.printf("Digite a quantidade de clientes: ");
        int N = sc.nextInt();

        System.out.printf("Digite a quantidade de dias: ");
        int M = sc.nextInt();

        double[][] saldos = new double[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                saldos[i][j] = rand.nextDouble(1000);
            }
        }

        System.out.printf("Digite o cliente q deseja consultar o saldo de 1 até %d: ", N);
        int cliente = (sc.nextInt()) - 1;

        double saldoFinal = saldoFinal(saldos, cliente);
        System.out.printf("O saldo final do cliente %d é: %.2f\n\n", cliente + 1, saldoFinal);

        double[] saldoFinalTodos = new double[N];

        saldoFinalTodos = saldoFinalTodos(saldos);
        System.out.println("O saldo final de todos os clientes é:");

        for (int i = 0; i < N; i++) {
            System.out.printf("Cliente %d: %.2f\n", (i+1), saldoFinalTodos[i]);
        }

        System.out.println("Todos os saldos dos clientes tabulados: ");
        imprimirExtratoClientes(saldos);
    }
}