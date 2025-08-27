package br.com.devsdoagi.HackatonBruno02;

public abstract class Investimento {
    private double valorInicial;

    //construtor
    public Investimento(double valorInicial) {
        this.valorInicial = valorInicial;
    }

    //getter e setter
    public double getValorInicial() {
        return valorInicial;
    }

    public void setValorInicial(double valorInicial) {
        this.valorInicial = valorInicial;
    }

    //metodo abstrato
    public abstract double calcularRendimento();
}
