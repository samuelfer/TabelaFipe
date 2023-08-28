package br.com.marhasoft.TabelaFipe.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Modelos {
    private List<Dados> modelos;

    public List<Dados> getModelos() {
        return modelos;
    }

    @Override
    public String toString() {
        return "Modelos{" +
                "modelos=" + modelos +
                '}';
    }
}
