package br.com.devsdoagi.POO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno a1 = new Aluno();


        System.out.println("Digite o nome:");
        a1.nome = sc.next();
        System.out.println("Nota 1:");
        a1.nota1 = sc.nextDouble();
        System.out.println("Nota 2:");
        a1.nota2 = sc.nextDouble();

        a1.exibir();
    }
}
