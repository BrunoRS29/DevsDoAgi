package br.com.devsdoagi.Exerc01;
import java.util.Scanner;

public class Hackaton1408 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        // Variáveis principais (poderão ser preenchidas na opção 1)
        int idadeAtual = 0, idadeAposentadoria = 0, expectativaVida = 0;
        double contribuicaoMensal = 0;
        double[] taxasAnuais = null;
        double[] saldoAnual = null;
        double[][] matrizCenarios = null;
        double[] rendaMensal = null;
        do {
            System.out.println("\n===== MENU SIMULADOR DE PREVIDÊNCIA =====");
            System.out.println("1 - Inserir dados");
            System.out.println("2 - Calcular saldo anual (vetor)");
            System.out.println("3 - Gerar matriz de cenários");
            System.out.println("4 - Calcular renda mensal na aposentadoria");
            System.out.println("5 - Exibir todos os resultados");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    // >>> INSERIR DADOS (ler do usuário e armazenar nas variáveis)
                    System.out.print("Idade Atual: ");
                    idadeAtual = sc.nextInt();
                    System.out.print("Idade desejada para aposentadoria: ");
                    idadeAposentadoria = sc.nextInt();
                    System.out.print("Contribuição mensal (P): ");
                    contribuicaoMensal = sc.nextDouble();
                    taxasAnuais = new double[idadeAposentadoria-idadeAtual];

                    for (int i = 0; i < idadeAposentadoria - idadeAtual; i++) {
                        System.out.printf("Taxa de juros do ano %d esperada (%%): \n", i+1);
                        taxasAnuais[i] = (sc.nextDouble() / 100);
                    }
                    break;
                case 2:
                    // >>> CHAMAR O MÉTODO calcularSaldoAnual() e armazenar no vetor saldoAnual
                    break;
                case 3:
                    matrizCenarios = gerarMatrizCenarios(idadeAtual, idadeAposentadoria, contribuicaoMensal, taxasAnuais);
                    for (int i = 0; i < matrizCenarios.length; i++) {
                        for (int j = 0; j < matrizCenarios[0].length; j++) {
                            System.out.printf("%.2f  ", matrizCenarios[i][j]);
                        }
                        System.out.print("\n");
                    }
                    break;
                case 4:
                    // >>> CHAMAR O MÉTODO calcularRendaMensal() e armazenar no vetor rendaMensal
                    break;
                case 5:
                    // >>> CHAMAR O MÉTODO exibirResultados() para mostrar tudo
                    break;
                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("⚠ Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
        sc.close();
    }

    // ================================
    // ===== MÉTODOS ESTÁTICOS ========
    // ================================
    // 1. Cálculo do saldo acumulado ano a ano (Vetor)
    public static double[] calcularSaldoAnual(int idadeAtual, int idadeAposentadoria, double contribuicaoMensal, double taxaAnual) {
        // >>> IMPLEMENTAR O CÁLCULO DO SALDO ANUAL
        return null;
    }

    // 2. Projeção com cenários diferentes (Matriz)
    public static double[][] gerarMatrizCenarios(int idadeAtual, int idadeAposentadoria, double contribuicaoMensal, double[] taxasAnuais) {
        double [][] matriz = new double[taxasAnuais.length][idadeAposentadoria-idadeAtual];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (contribuicaoMensal * (Math.pow(1 + taxasAnuais[i],(j + 1) * 12) - 1)) / taxasAnuais[i];
            }
        }

        return matriz;
    }

    // 3. Cálculo da renda mensal na aposentadoria
    public static double[] calcularRendaMensal(double[][] matrizCenarios, double[] taxasAnuais, int expectativaVida) {
        // >>> IMPLEMENTAR O CÁLCULO DA RENDA MENSAL PARA CADA CENÁRIO
        return null;
    }

    // 4. Exibir todos os resultados
    public static void exibirResultados(double[] saldoAnual, double[][] matrizCenarios, double[] taxasAnuais, double[] rendaMensal) {
        // >>> IMPLEMENTAR A EXIBIÇÃO DOS RESULTADOS
    }
}

