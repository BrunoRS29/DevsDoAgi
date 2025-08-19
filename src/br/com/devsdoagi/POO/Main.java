package br.com.devsdoagi.POO;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InvestimentoRendaFixa c1 = new InvestimentoRendaFixa(200, "asds", 0.005, 10);

        System.out.println(c1.calcularValorFinal());

    }
}
