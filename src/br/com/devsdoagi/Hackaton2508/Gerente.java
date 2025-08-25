package br.com.devsdoagi.Hackaton2508;

public class Gerente extends Funcionario{
    private double bonus = 2000;

    //construtor, getters e setters
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    //metodo para somar o bonus
    public void salarioGerente() {
        setSalario(this.getSalario() + bonus);
    }
}
