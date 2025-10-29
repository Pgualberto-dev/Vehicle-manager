package services;

import entities.Veiculos;
import java.util.List;


public class VServices {

    public List<Veiculos> buscarPorMarca(String marca1, List<Veiculos> veiculos) { //metodo que filtra a lista de veiculos pela marca
        return veiculos.stream()
                .filter(v -> v.getMarca().equalsIgnoreCase(marca1))
                .toList();
    }

    public List<Veiculos> buscarPorPreco(double preco1, List<Veiculos> veiculos) {// metodo que filtra a lista de veiculos pelo preco
        return veiculos.stream()
                .filter(v -> v.getPreco() >= preco1)
                .toList();
    }

    public List<Veiculos> buscarPorModelo(String modelo1, List<Veiculos> veiculos) { //metodo que filtra a lista de veiculos pelo modelo
        return veiculos.stream()
                .filter(v -> v.getModelo().equalsIgnoreCase(modelo1))
                .toList();
    }

    public List<Veiculos> buscarPorAno(int ano1, List<Veiculos> veiculos) { //metodo que filtra a lista de veiculos pelo ano
        return veiculos.stream()
                .filter(v -> v.getAno() == ano1)
                .toList();
    }

    public boolean removerVeiculo(String modelo1, List<Veiculos> veiculos) {
        return veiculos.removeIf(v -> v.getModelo().equalsIgnoreCase(modelo1));// metodo removeIf retorna true se removeu algum elemento
    }

    }
