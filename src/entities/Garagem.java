package entities;

import services.VServices;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Garagem {


    private final List<Veiculos> veiculosList = new ArrayList<>();

    public List<Veiculos> getVeiculosList() {
        return veiculosList;
    }

    public void cadastrarVeiculos(Scanner sc) {
        int qtd;
        System.out.print("Veiculos a cadastrar: ");
        qtd = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < qtd; i++) {
            System.out.println("Veiculo N " + "[" + (i + 1) + "]");
            System.out.println("Marca: ");
            String marca = sc.nextLine();
            System.out.println("Modelo: ");
            String modelo = sc.nextLine();
            System.out.println(" Ano: ");
            int ano = sc.nextInt();
            System.out.println("Preço: ");
            double preco = sc.nextDouble();
            sc.nextLine();
            veiculosList.add(new Veiculos(marca, modelo, ano, preco));
        }
        System.out.println("Veiculos cadastrado com sucesso!");
    }


    public void pesquisarVeiculos(Scanner sc) {
        VServices servico = new VServices();
        boolean validator = false;
        int opcao = 0;
        System.out.println("____________________");
        System.out.println("Pesquisa de veiculos");
        System.out.println("____________________");
        while (!validator) {
            try {
                System.out.println("[1] MARCA \n");
                System.out.println("[2] MODELO \n");
                System.out.println("[3] ANO \n");
                System.out.println("[4] PRECO ");
                opcao = sc.nextInt();
                validator = true;
                sc.nextLine();
            } catch (InputMismatchException e ) {
                System.out.println("      ERRO      ");
                System.out.println("Digite um numero");
                sc.nextLine();
            }
        }
        switch (opcao) {
            case 1:
                System.out.println("____________________");
                System.out.println(" Veiculos por marca ");
                System.out.println("____________________");
                System.out.print("Marca: ");
                String marca1 = sc.nextLine();
                System.out.print("");
                List<Veiculos> buscarMarca = servico.buscarPorMarca(marca1, getVeiculosList());
                buscarMarca.forEach(System.out::println);
                break;
            case 2:
                System.out.println("____________________");
                System.out.println(" Veiculos por Valor ");
                System.out.println("____________________");
                System.out.print("Preco: ");
                double preco1 = sc.nextDouble();
                System.out.print("");
                List<Veiculos> buscarPreco = servico.buscarPorPreco(preco1, getVeiculosList());
                buscarPreco.forEach(System.out::println);
        }
    }
}

