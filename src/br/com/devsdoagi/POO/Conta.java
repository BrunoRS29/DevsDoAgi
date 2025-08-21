package br.com.devsdoagi.POO;

abstract class Conta {
    protected String numeroConta;
    protected double saldo;

    public Conta(double saldo, String numeroConta) {
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }

    public abstract void atualizarMensal();
}
