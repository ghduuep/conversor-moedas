package br.com.conversormoedas.ConversorMoedas.principal;

import br.com.conversormoedas.ConversorMoedas.modelos.Dados;
import br.com.conversormoedas.ConversorMoedas.service.ConsumoApi;
import br.com.conversormoedas.ConversorMoedas.service.ConverteDados;

import java.util.Scanner;

public class Principal {
    private ConsumoApi consumoApi = new ConsumoApi();
    private ConverteDados conversor = new ConverteDados();
    private Scanner leitura = new Scanner(System.in);
    private final String URL_BASE = "https://api.frankfurter.app/latest?";
    public void exibeMenu() {

        System.out.println("Bem-vindo(a) ao CoinConverter");
        System.out.println("De: (USD)");
        var base = leitura.next();
        System.out.println("Para: ");
        var convertida = leitura.next();
        System.out.println("Qual a quantidade de " + base + " que você deseja converter?");
        var quantidade = leitura.next();
        var endereco = URL_BASE + "amount=" + quantidade + "&from=" + base.toUpperCase() + "&to=" + convertida.toUpperCase();

        var json = consumoApi.obterDados(endereco);
        var convetido = conversor.obterDados(json, Dados.class);
        System.out.println(convetido);
    }
}
