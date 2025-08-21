package br.com.devsdoagi.POO;

public class PagamentoBoleto implements IPagamento{
    private double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public void processarPagamento(double valor) {
        System.out.printf("Pagamento de %.2f no boleto\n", valor);
    }
}
