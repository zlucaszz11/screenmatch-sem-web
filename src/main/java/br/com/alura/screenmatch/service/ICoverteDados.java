package br.com.alura.screenmatch.service;

public interface ICoverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
