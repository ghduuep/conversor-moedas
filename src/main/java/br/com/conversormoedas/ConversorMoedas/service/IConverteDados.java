package br.com.conversormoedas.ConversorMoedas.service;

import java.util.Dictionary;
import java.util.Map;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
