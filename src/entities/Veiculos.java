package entities;

import java.util.Scanner;

public class Veiculos {
    private String marca;
    private String modelo;
    private int ano;
    private double preco;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }


    public Veiculos(String marca, String modelo, int ano, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }


    public void corretor(Veiculos veiculos, Scanner sc) {
        char fimSwitch = 'S';

        while (fimSwitch == 'S') {
            System.out.println("Qual dado está incorreto?");
            System.out.println("Marca: " + veiculos.getMarca());
            System.out.println("Modelo: " + veiculos.getModelo());
            System.out.println("Ano: " + veiculos.getAno());
            System.out.println("Preço: " + veiculos.getPreco());
            sc.nextLine();
            String correcao = sc.nextLine().toLowerCase(); // padroniza para minúscula

            switch (correcao) {
                case "marca":
                    System.out.println("Marca correta: ");
                    veiculos.setMarca(sc.nextLine());
                    break;

                case "modelo":
                    System.out.println("Modelo correto: ");
                    veiculos.setModelo(sc.nextLine());
                    break;

                case "ano":
                    System.out.println("Ano correto: ");
                    veiculos.setAno(sc.nextInt());
                    sc.nextLine(); // limpa buffer
                    break;

                case "preco":
                    System.out.println("Preço correto: ");
                    veiculos.setPreco(sc.nextDouble());
                    sc.nextLine(); // limpa buffer
                    break;

                default:
                    System.out.println("Nenhuma opção selecionada, fim do cadastro");
                    break;
            }

            System.out.println("Algo a mais para corrigir? (S/N)");
            fimSwitch = sc.nextLine().toUpperCase().charAt(0);
        }
    }

    @Override
    public String toString() {
        return "Veiculo [marca: " + marca + ", modelo: " + modelo + ", ano: " + ano + ", preco: " + preco + "]";
    }


}
