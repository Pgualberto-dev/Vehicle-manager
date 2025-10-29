package app;

import entities.Garagem;


import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Garagem garagem = new Garagem();
        int opcao = 0;
        boolean continuar = false;
        while (opcao != 4) {

            while (!continuar) {
                try {
                    System.out.println("____________________");
                    System.out.println("      BEM VINDO     ");
                    System.out.println("____________________");
                    System.out.println("CADASTRO DE VEICULOS - [1] ");
                    System.out.println("  PESQUISAR VEICULO  - [2] ");
                    System.out.println("   REMOVER VEICULO   - [3] ");
                    System.out.println("     ENCERRAR        - [4] ");
                    opcao = sc.nextInt();
                    sc.nextLine();
                    continuar = true;//muda a variavel para confirmar que passou
                } catch (InputMismatchException e) {
                    System.out.println("ERRO!");
                    System.out.println("Digite um numero inteiro");
                    sc.nextLine();
                }
            }

            continuar = switch (opcao) { // Switch Expression ele retorna um valor, como se fosse uma expressão switch agora pode gerar um resultado
                case 1 -> {
                    garagem.cadastrarVeiculos(sc); // chama o metodo cadastrar veiculos
                    yield false; //serve para retornar um valor dentro do case o resultádo final é atribuído à variável continuar.
                }
                case 2 -> {
                    garagem.pesquisarVeiculos(sc); // chama o metodo pesquisar veiculos
                    yield false;
                }
                case 3 -> {
                    garagem.removerVeiculos(sc);  // chama o metodo remover veiculos
                    yield false;
                }
                default -> true;
            };
        }
        System.out.println(" ENCERRANDO...");
        sc.close();
    }
}