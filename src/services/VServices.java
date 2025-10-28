package services;

import entities.Veiculos;
import java.util.List;


public class VServices {

    public List<Veiculos> buscarPorMarca(String marca1, List<Veiculos> veiculos) {
        return veiculos.stream()
                .filter(v -> v.getMarca().equalsIgnoreCase(marca1))
                .toList();
    }

    public List<Veiculos> buscarPorPreco ( double preco1, List<Veiculos> veiculos) {
        return veiculos.stream()
                .filter(v -> v.getPreco() >= preco1)
                .toList();
    }

}