package br.com.devsdoagi.Hackaton2508;

//Bruno Rodrigues dos Santos
public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Bruno", 5000);
        Analista analista = new Analista("Julia", 4000);

        //adição do bonus
        gerente.salarioGerente();
        analista.salarioAnalista();

        System.out.println("Informações dos funcionarios: ");
        System.out.printf("Nome: %s\n", gerente.getNome());
        System.out.printf("Salario: %.2f (com um bonus de %.2f incluso)\n\n", gerente.getSalario(), gerente.getBonus());

        System.out.printf("Nome: %s\n", analista.getNome());
        System.out.printf("Salario: %.2f (com um bonus de %.2f incluso)\n", analista.getSalario(), analista.getBonus());
    }
}
