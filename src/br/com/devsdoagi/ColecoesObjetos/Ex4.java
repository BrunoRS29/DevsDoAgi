    package br.com.devsdoagi.ColecoesObjetos;

    import java.util.*;

    public class Ex4 {
        public static void main(String[] args) {
            Set<Contato> contato = new HashSet<>();

            contato.add(new Contato("Bruno", "1996537021", "brunorosantos29@gail.com"));
            contato.add(new Contato("Lucas", "3284293874", "hdsjkhfskjdfh@gail.com"));
            contato.add(new Contato("Ryan", "89213987123", "lkndkandk@gail.com"));
            contato.add(new Contato("Matheus", "872987391", "kopskfpoksp@gail.com"));
            contato.add(new Contato("Alberto", "872987391", "kopskfpoksp@gail.com"));

            List<Contato> contato2 = new ArrayList<>(contato);
            Collections.sort(contato2);

            System.out.println(contato2);
        }
    }
