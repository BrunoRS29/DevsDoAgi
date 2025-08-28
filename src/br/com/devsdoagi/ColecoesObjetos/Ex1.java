package br.com.devsdoagi.ColecoesObjetos;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Ex1 {
    public static void main(String[] args) {
        List<Cliente> cliente = new ArrayList<>();

        cliente.add(new Cliente(1, "Bruno", "12345"));
        cliente.add(new Cliente(2, "A", "1267567"));
        cliente.add(new Cliente(3, "jorge", "32645"));
        cliente.add(new Cliente(4, "Pedro", "3873249"));
        cliente.add(new Cliente(5, "Leonardo", "63457"));

        for(Cliente c : cliente) {
            System.out.println(c.getNome() + c.getCpf());
        }

        buscaCPF(cliente, "63457");
    }

    public static void buscaCPF(List<Cliente> cliente, String cpf) {
        for(Cliente c : cliente) {
            if (c.getCpf().equals(cpf)) {
                System.out.printf("Cpf %s encontrado!", cpf);
            }
        }
    }
}
