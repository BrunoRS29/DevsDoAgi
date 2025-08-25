package br.com.devsdoagi.Hackaton2208;

public abstract class Conta implements OperacoesBancarias {
    private String numeroConta;
    private double saldo;
    private String clienteTitular;

    //construtor
    public Conta(String numeroConta, double saldo, String clienteTitular) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.clienteTitular = clienteTitular;
    }

    //getters e setters
    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getClienteTitular() {
        return clienteTitular;
    }

    public void setClienteTitular(String clienteTitular) {
        this.clienteTitular = clienteTitular;
    }

    //métodos
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado!");
    }

    public void sacar(double valor) {
        if(valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado!");
        }
    }

    public abstract void aplicarJuros();
}
