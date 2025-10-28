package app;

import entities.Garagem;
import entities.Veiculos;
import services.VServices;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        VServices servico = new VServices();

        Garagem garagem = new Garagem();

        System.out.println("____________________");
        System.out.println("      BEM VINDO     ");
        System.out.println("____________________");

        garagem.cadastrarVeiculos(sc);

        System.out.println("____________________");
        System.out.println("Pesquisa de veiculos");
        System.out.println("____________________");

        System.out.println("[1] MARCA \n");
        System.out.println("[2] MODELO \n");
        System.out.println("[3] ANO \n");
        System.out.println("[4] PRECO ");
        int opcao = sc.nextInt();
        sc.nextLine();
        switch (opcao) {
            case 1:
                System.out.println("____________________");
                System.out.println(" Veiculos por marca ");
                System.out.println("____________________");
                System.out.print("Marca: ");
                String marca1 = sc.nextLine();
                System.out.print("");
                List<Veiculos> buscarMarca = servico.buscarPorMarca(marca1, garagem.getVeiculosList());
                buscarMarca.forEach(System.out::println);
                break;
            case 2:
                System.out.println("____________________");
                System.out.println(" Veiculos por Valor ");
                System.out.println("____________________");
                System.out.print("Preco: ");
                double preco1 = sc.nextDouble();
                System.out.print("");
                List<Veiculos> buscarPreco = servico.buscarPorPreco(preco1, garagem.getVeiculosList());
                buscarPreco.forEach(System.out::println);
        }
        sc.close();
    }
}