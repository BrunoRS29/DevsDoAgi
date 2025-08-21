package br.com.devsdoagi.POO;

public class PagamentoCartao implements IPagamento{
    private double valor;

    @Override
    public void processarPagamento(double valor) {
        System.out.printf("Pagamento de %.2f no cartão\n", valor);
    }
}
