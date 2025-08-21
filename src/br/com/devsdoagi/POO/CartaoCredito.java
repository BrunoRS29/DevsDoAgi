package br.com.devsdoagi.POO;

public class CartaoCredito extends Cartao{
    public CartaoCredito(String numero, double limite) {
        super(numero, limite);
    }

    @Override
    public void processarCompra(double valor) {
        limite -= valor;
        System.out.printf("Foi feita uma compra no valor de R$%.2f, seu novo limite é de R$%.2f", valor, limite);
    }
}
