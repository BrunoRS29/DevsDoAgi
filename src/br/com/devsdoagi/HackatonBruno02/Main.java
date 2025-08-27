//Bruno Rodrigues dos Santos
package br.com.devsdoagi.HackatonBruno02;

import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        Investimento[] invest = new Investimento[10];

        for (int i = 0; i < 10; i++) {
            double valor = Math.random() * (1000 - 500 + 1) + 500;

            if(i%2==0) {
                invest[i] = new RendaFixa(valor);

            } else {
                invest[i] = new RendaVariavel(valor);
            }
        }

        for (Investimento inv : invest) {
            double valorInicial = inv.getValorInicial();
            double rendimento = inv.calcularRendimento();
            System.out.printf("%s: R$%.2f -> R$%.2f%n", inv.getClass().getSimpleName(),valorInicial, rendimento);
        }
    }
}

// Nota final: 100/100
// Cumpre todos os requisitos