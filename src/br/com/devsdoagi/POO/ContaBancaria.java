package br.com.devsdoagi.POO;

public class ContaBancaria {
    public String titular;
    public String numeroConta;
    public double saldo;

    public void depositar(double valor) {
        this.saldo = saldo + valor;
    }

    public void sacar(double valor) {
        this.saldo = saldo - valor;
    }

    public void exibir() {
        System.out.println(this.titular);
        System.out.println(this.numeroConta);
        System.out.println(this.saldo);
    }
}
