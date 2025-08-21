package br.com.devsdoagi.POO;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PagamentoBoleto p1 = new PagamentoBoleto();
        PagamentoCartao p2 = new PagamentoCartao();

        p1.processarPagamento(200);
        p1.processarPagamento(600);


    }
}
