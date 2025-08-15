package br.com.devsdoagi.POO;

public class Carro {
    public String marca;
    public String modelo;
    public int ano;

    public void acelerar() {
        System.out.println("ta acelerando");
    }

    public void mostrar() {
        System.out.println(this.marca);
        System.out.println(this.modelo);
        System.out.println(this.ano);
    }
}
