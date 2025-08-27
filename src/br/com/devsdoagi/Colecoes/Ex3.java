package br.com.devsdoagi.Colecoes;

import java.util.HashMap;
import java.util.Map;

public class Ex3 {
    public static void main(String[] args) {
        Map<String, Double> contas = new HashMap<>();

        adicionarCliente(contas, "0001", 1500);
        adicionarCliente(contas, "0002", 2000);
        adicionarCliente(contas, "0003", 3000);

        exibirSaldos(contas);

        depositar(contas, "0001", 123);

        exibirSaldos(contas);


    }

    public static void adicionarCliente(Map<String, Double> contas, String numeroConta, double saldoConta) {
        contas.put(numeroConta, saldoConta);
    }

    public static void depositar(Map<String, Double> contas, String numeroConta, double valor) {
        contas.put(numeroConta, contas.get(numeroConta) + valor);
    }

    public static void exibirSaldos(Map<String, Double> contas) {
        System.out.println(contas);
    }
}