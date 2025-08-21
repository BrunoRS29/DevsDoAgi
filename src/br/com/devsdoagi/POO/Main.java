package br.com.devsdoagi.POO;

public class Main {
    public static void main(String[] args) {
        Conta c1 = new ContaCorrente(200, "12345");
        Cartao c2 = new CartaoCredito("12345", 1000);
        Cambio cam1 = new CambioDolar(200, 5.40);
        Cambio cam2 = new CambioEuro(200, 6.37);

        //c1.atualizarMensal()
        //c2.processarCompra(348);
        System.out.printf("Valor em dólar: %.2f\n", cam1.converter());
        System.out.printf("Valor em euros: %.2f\n", cam2.converter());
    }
}
