package br.com.conversormoedas.ConversorMoedas.modelos;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)

public record Dados(@JsonAlias("amount") Integer quantidade, String base, @JsonAlias("rates") Map<String, Double> para) {
}
