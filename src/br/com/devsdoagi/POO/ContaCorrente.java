package br.com.devsdoagi.POO;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public void gerarRelatorio() {
        System.out.printf("Titular: %s, saldo: R$%.2f e taxa de manutenção de R$20,00\n", titular, saldo);
    }
}
