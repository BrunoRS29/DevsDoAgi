package br.com.devsdoagi.Colecoes;

import java.util.HashSet;
import java.util.Set;

public class Ex2 {
    public static void main(String[] args) {
        Set<String> produtos = new HashSet<>();

        adicionarProduto(produtos, "Cadeira");
        adicionarProduto(produtos, "Cadeira");
        adicionarProduto(produtos, "Mesa");

        exibirProdutos(produtos);
    }

    public static void adicionarProduto(Set<String> produtos, String nomeProduto) {
        if(!produtos.contains(nomeProduto)) {
            produtos.add(nomeProduto);
        } else {
            System.out.println("Produto ja cadastrado");
        }
    }

    public static void exibirProdutos(Set<String> produtos) {
        System.out.println(produtos);
    }
}
