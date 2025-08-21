package br.com.devsdoagi.POO;

public class CambioEuro extends Cambio{
    public CambioEuro(double valorEmReais, double taxaCambio) {
        super(valorEmReais, taxaCambio);
    }

    @Override
    public double converter() {
        return valorEmReais/taxaCambio;
    }
}
