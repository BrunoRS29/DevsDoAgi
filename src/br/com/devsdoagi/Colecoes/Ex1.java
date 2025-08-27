package br.com.devsdoagi.Colecoes;

import java.util.HashSet;
import java.util.Set;

public class Ex1 {

    public static void main(String[] args) {
        Set<Integer> contas = new HashSet<>();

        adicionarConta(contas, 123);
        adicionarConta(contas, 34);
        adicionarConta(contas, 234);
        adicionarConta(contas, 7567);

        if(existeConta(contas, 123)) {
            System.out.println("Existe!");
        }

        exibirContas(contas);
    }

    public static void adicionarConta(Set<Integer> contas, int numeroConta) {
        contas.add(numeroConta);
    }

    public static boolean existeConta(Set<Integer> contas, int numeroConta) {
        if(contas.contains(numeroConta)) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void exibirContas(Set<Integer> contas) {
        System.out.println(contas);
    }
}
