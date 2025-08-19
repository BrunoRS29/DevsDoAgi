package br.com.devsdoagi.POO;

public class Investiimento {
    private String codigo;
    private double valorInicial;

    public Investiimento(double valorInicial, String codigo) {
        this.valorInicial = valorInicial;
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getValorInicial() {
        return valorInicial;
    }

    public void setValorInicial(double valorInicial) {
        this.valorInicial = valorInicial;
    }
}
