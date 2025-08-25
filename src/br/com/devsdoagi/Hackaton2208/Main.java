package br.com.devsdoagi.Hackaton2208;

public class Main {
    public static void main(String[] args) {
        //criação de objeto
        Cliente cliente1 = new Cliente("Bruno", "1111111111");

        Conta contaCorrente = new ContaCorrente("1234", 1000, cliente1.getNome());
        Conta contaPoupanca = new ContaPoupanca("5678", 2000, cliente1.getNome());

        contaCorrente.sacar(200);
        contaPoupanca.depositar(1500);

        contaCorrente.aplicarJuros();
        contaPoupanca.aplicarJuros();

        System.out.printf("\nSaldos do cliente %s: \n", cliente1.getNome());
        System.out.println("Saldo final da conta corrente: " + contaCorrente.getSaldo());
        System.out.println("Saldo final da conta poupança: " + contaPoupanca.getSaldo());
    }


}
