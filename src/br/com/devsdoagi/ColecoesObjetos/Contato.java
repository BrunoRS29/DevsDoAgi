package br.com.devsdoagi.ColecoesObjetos;

public class Contato implements Comparable<Contato>{
    private String nome;
    private String tel;
    private String email;

    public Contato(String nome, String tel, String email) {
        this.nome = nome;
        this.tel = tel;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int compareTo(Contato outro) {
        return this.nome.compareToIgnoreCase(outro.getNome());
    }

    @Override
    public String toString() {
        return nome;
    }
}


