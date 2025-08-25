package br.com.devsdoagi.Hackaton2208;

public class ContaCorrente extends Conta{
    //construtor
    public ContaCorrente(String numeroConta, double saldo, String clienteTitular) {
        super(numeroConta, saldo, clienteTitular);
    }

    //metodo
    @Override
    public void aplicarJuros() {
        System.out.println("Nenhum juros aplicado!");
    }
}
