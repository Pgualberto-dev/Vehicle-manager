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
        while (opcao != 3) {

            while (!continuar) {
                try {
                    System.out.println("____________________");
                    System.out.println("      BEM VINDO     ");
                    System.out.println("____________________");
                    System.out.println("CADASTRO DE VEICULOS - [1] ");
                    System.out.println(" PESQUISAR VEICULO   - [2] ");
                    System.out.println("  ENCERRAR - [3] ");
                    opcao = sc.nextInt();
                    continuar = true;//muda a variavel para confirmar que passou
                } catch (InputMismatchException e) {
                    System.out.println("ERRO!");
                    System.out.println("Digite um numero inteiro");
                    sc.nextLine();
                }
            }

            continuar = switch (opcao) { // Switch Expression ele retorna um valor, como se fosse uma expressão switch agora pode gerar um resultado
                case 1 -> {
                    garagem.cadastrarVeiculos(sc);
                    yield false; //serve para retornar um valor dentro do case o resultádo final é atribuído à variável continuar.
                }
                case 2 -> {
                    garagem.pesquisarVeiculos(sc);
                    yield false;
                }
                default -> true;
            };
        }
        System.out.println(" ENCERRANDO...");
        sc.close();
    }
}