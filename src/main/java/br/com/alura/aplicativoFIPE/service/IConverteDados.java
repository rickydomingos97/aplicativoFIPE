package br.com.alura.aplicativoFIPE.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);

}