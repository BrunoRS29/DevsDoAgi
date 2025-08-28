package br.com.devsdoagi.ColecoesObjetos;

import java.util.HashMap;
import java.util.Map;

public class Ex3 {
    public static void main(String[] args) {
        Map<String, Produto> produto = new HashMap<>();

        produto.put("1", new Produto("cadeira", 10));
        produto.put("2", new Produto("mesa", 20));
        produto.put("3", new Produto("escada", 5));
        produto.put("4", new Produto("quadro", 1));
        produto.put("5", new Produto("furadeira", 500));

        buscaCodigo(produto, "9");

    }

    public static void buscaCodigo(Map<String, Produto> produto, String codigo) {
        if (produto.containsKey(codigo)) {
            Produto p = produto.get(codigo);
            System.out.println("Código encontrado: " + codigo);
            System.out.println("Produto: " + p.getNome());
        } else {
            System.out.println("Código não encontrado!");
        }
    }

}

