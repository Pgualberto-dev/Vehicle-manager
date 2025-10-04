package app;

import entities.Veiculos;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int opc = 0;

        List<Veiculos> veiculo = new ArrayList<>();

        System.out.println("____________________");
        System.out.println("       BEM VINDO      ");
        System.out.println("____________________");


        while (opc != 2 ) {
            System.out.println("Marca: ");
                String marca = sc.nextLine();
            System.out.println("Modelo: ");
                String modelo = sc.nextLine();
            System.out.println("Ano: ");
                int ano = sc.nextInt();
            System.out.println("Preço: ");
                double preco = sc.nextDouble();

            veiculo.add(new Veiculos(marca, modelo, ano, preco));

            System.out.println("____________________");
            System.out.println("Cadastrar outro veiculo");
            System.out.println("____________________");
            System.out.println("[1] Sim \n [2] Não");
            opc =  sc.nextInt();
            sc.nextLine();
        }

        System.out.println("Veiculos cadastrados com sucesso ");

        System.out.println("____________________");
        System.out.println(" Veiculos por marca ");
        System.out.println("____________________");
        System.out.print("Marca: ");
        String marca1 = sc.nextLine();
        System.out.print("");
        List<Veiculos> nomeMarca = veiculo.stream()
                .filter( m -> m.getMarca().equalsIgnoreCase(marca1))
                        .toList();
        nomeMarca.forEach(System.out::println);





        System.out.println("____________________");
        System.out.println("Veiculos para manutenção");
        System.out.println("____________________");



        sc.close();
    }
}