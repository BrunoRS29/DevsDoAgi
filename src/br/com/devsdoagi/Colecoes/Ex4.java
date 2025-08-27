package br.com.devsdoagi.Colecoes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex4 {
    public static void main(String[] args) {
        Map<String, List<Double>> cliente = new HashMap<>();

        adicionarParcela(cliente, "47358734", 200);
        adicionarParcela(cliente, "47358734", 1500);
        adicionarParcela(cliente, "47358734", 400);
        adicionarParcela(cliente, "123", 400);

        System.out.println(totalDevedor(cliente, "47358734"));

        System.out.println(exibirTotal(cliente));
    }

    public static void adicionarParcela(Map<String, List<Double>> emprestimos, String cpf, double valorParcela) {
        if (!emprestimos.containsKey(cpf)) {
            emprestimos.put(cpf, new ArrayList<>());
        }
        emprestimos.get(cpf).add(valorParcela);
    }

    public static double totalDevedor(Map<String, List<Double>> emprestimos, String cpf) {
        double soma = 0;

        for(double parcela : emprestimos.get(cpf)) {
            soma = soma + parcela;
        }

        return soma;
    }

    public static double exibirTotal(Map<String, List<Double>> emprestimos) {
        double soma = 0;

        for(List<Double> parcelas : emprestimos.values()) {
            for(double parcela : parcelas) {
                soma += parcela;
            }
        }

        return soma;
    }
}
