package app;

import entities.Veiculos;
import services.VServices;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        VServices servico = new VServices();

        List<Veiculos> veiculos = new ArrayList<>();

        System.out.println("____________________");
        System.out.println("       BEM VINDO      ");
        System.out.println("____________________");

        cadastrarVeiculos(sc, veiculos);

        System.out.println("____________________");
        System.out.println("Pesquisa de veiculos");
        System.out.println("____________________");

        System.out.println("[1] MARCA \n");
        System.out.println("[2] MODELO \n");
        System.out.println("[3] ANO \n");
        System.out.println("[4] PRECO ");

        switch (sc.nextInt()) {
            case 1:
                System.out.println("____________________");
                System.out.println(" Veiculos por marca ");
                System.out.println("____________________");
                System.out.print("Marca: ");
                String marca1 = sc.nextLine();
                System.out.print("");
                List<Veiculos> resultadoDaBusca = servico.buscarPorMarca(marca1, veiculos);
                resultadoDaBusca.forEach(System.out::println);
                break;
            case 2:
                System.out.println("____________________");
                System.out.println(" Veiculos por Valor ");
                System.out.println("____________________");
                System.out.print("Preco: ");
                double valor = sc.nextDouble();
                System.out.print("");
                List<Veiculos> valorVeiculo = veiculos.stream()
                        .filter( m -> m.getPreco() <= valor)
                        .toList();
                valorVeiculo.forEach(System.out::println);
        }
        sc.close();
    }

    private static void cadastrarVeiculos(Scanner sc, List<Veiculos> veiculos) {
        int opc = 0;
        while (opc != 2 ) {
            System.out.println("Marca: ");
            String marca = sc.nextLine();
            System.out.println("Modelo: ");
            String modelo = sc.nextLine();
            System.out.println("Ano: ");
            int ano = sc.nextInt();
            System.out.println("Preço: ");
            double preco = sc.nextDouble();

            veiculos.add(new Veiculos(marca, modelo, ano, preco));

            System.out.println("____________________");
            System.out.println("Cadastrar outro veiculo");
            System.out.println("____________________");
            System.out.println("[1] Sim \n [2] Não");
            opc =  sc.nextInt();
            System.out.println("Veiculos cadastrados com sucesso ");
            sc.nextLine();
        }
    }
}