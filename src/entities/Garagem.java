package entities;

import java.util.ArrayList;
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
                System.out.println("Veiculo N " + "["+(i+1)+"]");
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
            sc.nextLine();
        }
    }

