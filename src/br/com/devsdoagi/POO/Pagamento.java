package br.com.devsdoagi.POO;

public class Pagamento {
    protected double valor;

    public Pagamento(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void processarPagamento() {
        System.out.println("Processando pagamento genérico de " + valor);
    }
}
