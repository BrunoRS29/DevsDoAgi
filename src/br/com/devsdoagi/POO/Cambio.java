package br.com.devsdoagi.POO;

abstract class Cambio {
    protected double valorEmReais;
    protected double taxaCambio;

    public Cambio(double valorEmReais, double taxaCambio) {
        this.valorEmReais = valorEmReais;
        this.taxaCambio = taxaCambio;
    }

    public abstract double converter();
}
