package br.com.devsdoagi.POO;

abstract class Cartao {
    protected String numero;
    protected double limite;

    public Cartao(String numero, double limite) {
        this.numero = numero;
        this.limite = limite;
    }

    public abstract void processarCompra(double valor);
}
