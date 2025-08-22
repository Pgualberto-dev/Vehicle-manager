package app;

import entities.Veiculos;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("____________________");
        System.out.println("       BEM VINDO      ");
        System.out.println("____________________");
        System.out.println("Marca: ");
        String marca = sc.nextLine();
        System.out.println("Modelo: ");
        String modelo = sc.nextLine();
        System.out.println("Ano: ");
        int ano = sc.nextInt();
        System.out.println("Preço: ");
        double preco = sc.nextDouble();

        Veiculos veiculos = new Veiculos(marca, modelo, ano, preco);

        System.out.println("Confirme os dados por gentileza: ");
        System.out.println(marca);
        System.out.println(modelo);
        System.out.println(ano);
        System.out.println(preco);
        System.out.println("Dados corretos? ");
        char opcao = sc.next().charAt(0);

        if (opcao == 's') {
            System.out.println(veiculos);
        } else {
            veiculos.corretor(veiculos, sc);
        }
        System.out.println("VEICULO CADASTRADO COM SUCESSO");
        System.out.println(veiculos);

        sc.close();
    }
}