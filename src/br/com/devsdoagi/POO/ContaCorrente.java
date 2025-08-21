package br.com.devsdoagi.POO;

public class ContaCorrente extends Conta{

    public ContaCorrente(double saldo, String numeroConta) {
        super(saldo, numeroConta);
    }

    @Override
    public void atualizarMensal() {
        System.out.printf("Houve um desconto de R$15 mensal, ficando com um saldo de: %.2f", saldo - 15);
    }
}
