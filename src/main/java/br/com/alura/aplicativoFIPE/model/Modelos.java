package br.com.alura.aplicativoFIPE.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

// o ignore usado auqi para ignorar o "ano" que vem na lista por enquanto
@JsonIgnoreProperties(ignoreUnknown = true)
public record Modelos(List<Dados> modelos) {
}