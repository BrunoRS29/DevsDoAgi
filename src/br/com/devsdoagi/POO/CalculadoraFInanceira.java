package br.com.devsdoagi.POO;

public class CalculadoraFInanceira {
    public double calcularJuros(double capital, double taxaDeJuros, int meses) {
        return capital * taxaDeJuros * meses;
    }

    public double calcularJuros(double capital, double taxaDeJuros) {
        return capital * taxaDeJuros * 12;
    }

    public double calcularJuros(double capital) {
        return capital * 0.015 * 12;
    }

}
