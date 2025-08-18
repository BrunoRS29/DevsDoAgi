package br.com.devsdoagi.POO;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ClienteVip c1 = new ClienteVip();


        System.out.println("Digite o nome:");
        c1.setNome(sc.next());
        System.out.println("Digite o CPF: ");
        c1.setCPF(sc.next());
        System.out.println("Digite o limite: ");
        c1.setLimite(sc.nextFloat());


        c1.exibirCLiente();
    }
}
