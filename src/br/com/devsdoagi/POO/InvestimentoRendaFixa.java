package br.com.devsdoagi.POO;

public class InvestimentoRendaFixa extends Investiimento{
    private double taxaAnual;
    private int periodoMeses;

    public InvestimentoRendaFixa(double valorInicial, String codigo, double taxaAnual, int periodoMeses) {
        super(valorInicial, codigo);
        this.taxaAnual = taxaAnual;
        this.periodoMeses = periodoMeses;
    }

    public double getTaxaAnual() {
        return taxaAnual;
    }

    public void setTaxaAnual(double taxaAnual) {
        this.taxaAnual = taxaAnual;
    }

    public int getPeriodoMeses() {
        return periodoMeses;
    }

    public void setPeriodoMeses(int periodoMeses) {
        this.periodoMeses = periodoMeses;
    }

    public double calcularValorFinal() {
        return getValorInicial() * (1 + taxaAnual * (periodoMeses / 12));
    }
}
