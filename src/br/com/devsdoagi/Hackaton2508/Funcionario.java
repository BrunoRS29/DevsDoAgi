package br.com.devsdoagi.Hackaton2508;

//classe pi
public class Funcionario {
    private String nome;
    private double salario;

    //construtor, getters e setters
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
