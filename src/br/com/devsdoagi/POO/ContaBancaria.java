package br.com.devsdoagi.POO;

public class ContaBancaria {
    private String titular;
    private String numeroConta;
    private double saldo;

    public ContaBancaria() {
        this.numeroConta = null;
        this.titular = null;
        this.saldo = 0;
    }

    public ContaBancaria(String titular, String numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0;
    }

    public ContaBancaria(String titular, String numeroConta, double saldo) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

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

    public void depositar(double valor) {
        if(valor > 0 ) {
            this.saldo = saldo + valor;
        } else {
            System.out.println("Valor inválido!");
        }
    }

    public void sacar(double valor) {
        if(valor > 0 && valor <= this.saldo) {
            this.saldo = saldo - valor;
        } else {
            System.out.println("Valor inválido!");
        }
    }

    public void exibir() {
        System.out.println("Titular: " + getTitular());
        System.out.println("Numero da conta: " + getNumeroConta());
        System.out.println("Saldo: " + getSaldo());
    }
}
