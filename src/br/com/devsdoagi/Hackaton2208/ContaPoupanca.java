package br.com.devsdoagi.Hackaton2208;

public class ContaPoupanca extends Conta{
    //construtor
    public ContaPoupanca(String numeroConta, double saldo, String clienteTitular) {
        super(numeroConta, saldo, clienteTitular);
    }

    //metodo
    @Override
    public void aplicarJuros() {
        setSaldo(getSaldo() * 1.01) ;
        System.out.println("Juros de 1% aplicado");
    }
}
