package br.com.alura.TabelaFipe.Service;

public interface IConverteDados {
    <T> T obterDados(String Json, Class<T> classe);
}
