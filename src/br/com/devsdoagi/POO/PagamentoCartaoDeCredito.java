package br.com.devsdoagi.POO;

public class PagamentoCartaoDeCredito extends Pagamento{
    protected String numeroCartao;

    public PagamentoCartaoDeCredito(double valor, String numeroCartao) {
        super(valor);
        this.numeroCartao = numeroCartao;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento realizado no cartão " + numeroCartao + " no valor de " + valor);
    }

}
