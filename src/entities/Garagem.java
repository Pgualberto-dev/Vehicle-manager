package entities;

import services.VServices;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Garagem {

    private final List<Veiculos> veiculosList = new ArrayList<>();

    public List<Veiculos> getVeiculosList() {// metodo que retorna a lista de veículos
        return veiculosList;
    }

    public void cadastrarVeiculos(Scanner sc) { // metodo que cadastra veiculos na lista
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


    public void pesquisarVeiculos(Scanner sc) { // metodo que pesquisa veiculos na lista
        VServices servico = new VServices();
        boolean validator = false; // validação para o while
        int opcao = 0; // opção de pesquisa
        System.out.println("____________________");
        System.out.println("Pesquisa de veiculos");
        System.out.println("____________________");
        while (!validator) {
            try {
                System.out.println("[1] MARCA \n");
                System.out.println("[2] MODELO \n");
                System.out.println("[3] ANO \n");
                System.out.println("[4] VALOR ");
                opcao = sc.nextInt();
                validator = true;
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("      ERRO      ");
                System.out.println("Digite um numero");
                sc.nextLine();
            }
        }
        switch (opcao) {
            case 1: // pesquisar por marca
                System.out.println("____________________");
                System.out.println(" Veiculos por marca ");
                System.out.println("____________________");
                System.out.print("Marca: ");
                String marca1 = sc.nextLine();
                System.out.print("");
                List<Veiculos> buscarMarca = servico.buscarPorMarca(marca1, getVeiculosList()); // chama o metodo buscarPorMarca da classe VServices
                buscarMarca.forEach(System.out::println);
                break;
            case 2: // pesquisar por preco
                System.out.println("____________________");
                System.out.println(" Veiculos por Valor ");
                System.out.println("____________________");
                System.out.print("Preco: ");
                double preco1 = sc.nextDouble();
                System.out.print("");
                List<Veiculos> buscarPreco = servico.buscarPorPreco(preco1, getVeiculosList()); // chama o metodo buscarPorPreco da classe VServices
                buscarPreco.forEach(System.out::println);
                break;
            case 3: // pesquisar por modelo
                System.out.println("____________________");
                System.out.println(" Veiculos por Modelo ");
                System.out.println("____________________");
                System.out.print("Modelo: ");
                String modelo1 = sc.nextLine();
                System.out.print("");
                List<Veiculos> buscarModelo = servico.buscarPorModelo(modelo1, getVeiculosList()); // chama o metodo buscarPorModelo da classe VServices
                buscarModelo.forEach(System.out::println);
                break;
            case 4: // pesquisar por ano
                System.out.println("____________________");
                System.out.println("  Veiculos por Ano  ");
                System.out.println("____________________");
                System.out.print("Ano: ");
                int ano1 = sc.nextInt();
                System.out.print("");
                List<Veiculos> buscarAno = servico.buscarPorAno(ano1, getVeiculosList()); // chama o metodo buscarPorAno da classe VServices
                buscarAno.forEach(System.out::println);
                break;
            default:
                System.out.println("ERRO");
        }
    }

    public void removerVeiculos(Scanner sc) { // metodo que remove veiculos da lista
        VServices servico = new VServices();
        System.out.println("____________________");
        System.out.println("   Remover Veiculo  ");
        System.out.println("____________________");
        System.out.print("Modelo do veiculo a ser removido: ");
        String modelo1 = sc.nextLine();
        boolean removed = servico.removerVeiculo(modelo1, getVeiculosList()); // chama o metodo removerVeiculo da classe VServices
        if (removed) {
            System.out.println("Veiculo removido com sucesso!");
        } else {
            System.out.println("Veiculo nao encontrado.");
        }
    }
}

