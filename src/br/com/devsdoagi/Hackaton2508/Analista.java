package br.com.devsdoagi.Hackaton2508;

public class Analista  extends Funcionario{
    private double bonus = 1000;

    //construtor, getters e setters
    public Analista(String nome, double salario) {
        super(nome, salario);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    //metodo para somar o bonus
    public void salarioAnalista() {
        setSalario(getSalario() + bonus);
    }
}
