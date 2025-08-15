package br.com.devsdoagi.POO;

public class Aluno {
    public String nome;
    public double nota1;
    public double nota2;

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    public String verificarSituacao() {
        String situacao = null;
        if(calcularMedia() >= 5) {
            situacao = "Aluno aprovado";
        } else {
            situacao = "Aluno reprovado";
        }
        return situacao;
    }

    public void exibir() {
        System.out.printf("o Aluno %s tirou as notas %.2f e %.2f\n", this.nome, this.nota1, this.nota2);
        System.out.printf("A média foi: %.2f\n", calcularMedia());
        System.out.println(verificarSituacao());
    }
}

