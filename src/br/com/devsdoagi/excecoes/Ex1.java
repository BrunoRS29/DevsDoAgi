package br.com.devsdoagi.excecoes;

import java.util.Random;

public class Ex1 {
    public static void main(String[] args) {
        try {
            double[] contas = new double[10];
            Random random = new Random();
            for (int i = 0; i < 10; i++) {
                contas[i] = random.nextInt(100);
            }
            contas[1] = 10;

        } catch (IndexOutOfBoundsException e) {
            System.out.println("ai");
        }
    }
}
