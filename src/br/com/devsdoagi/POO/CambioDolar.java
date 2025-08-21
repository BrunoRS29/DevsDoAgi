package br.com.devsdoagi.POO;

public class CambioDolar extends Cambio{
    public CambioDolar(double valorEmReais, double taxaCambio) {
        super(valorEmReais, taxaCambio);
    }

    @Override
    public double converter() {
        return valorEmReais/taxaCambio;
    }
}
