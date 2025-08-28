package br.com.devsdoagi.ColecoesObjetos;

import java.util.Objects;

public class Assinante {
    private int id;
    private String nome;
    private String email;

    public Assinante(int id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Assinante)) return false;
        Assinante ass = (Assinante) obj;
        return Objects.equals(email, ass.email);
    }


    @Override
    public int hashCode() {
        return Objects.hash(id,nome,email);
    }
}
