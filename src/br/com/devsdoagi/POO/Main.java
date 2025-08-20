package br.com.devsdoagi.POO;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaBancaria c1 = new ContaBancaria("Bruno", 1500);
        ContaBancaria c2 = new ContaCorrente("Julia", 1600);

        List<ContaBancaria> Contas = new ArrayList<>();

        Contas.add(c1);
        Contas.add(c2);

        for(ContaBancaria conta : Contas ) {
            conta.gerarRelatorio();
        }
    }
}
