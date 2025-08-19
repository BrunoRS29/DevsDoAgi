package br.com.devsdoagi.POO;

public class ContaCorrente extends ContaBancaria{
    private double limiteChequeEspecial;

    public ContaCorrente(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public void sacarComChequeEspecial(double valor) {
        if(valor > 0 && valor <= limiteChequeEspecial) {
            setSaldo(getSaldo() - valor);
        }
    }
}
