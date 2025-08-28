package br.com.devsdoagi.ColecoesObjetos;

import java.util.HashSet;
import java.util.Set;

public class Ex2 {
    public static void main(String[] args) {
        Set<Assinante> ass = new HashSet<>();

        ass.add(new Assinante(1, "Bruno", "brunorosantos29@gmail.com"));
        ass.add(new Assinante(1, "Bruno", "brunorosantos29@gmail.com"));
        ass.add(new Assinante(2, "Lucas", "adkfsdkjfhk@gmail.com"));
        ass.add(new Assinante(3, "Matheus", "Matheus276@gmail.com"));

        for(Assinante a  : ass) {
            System.out.println(a.getEmail());
        }
    }
}
