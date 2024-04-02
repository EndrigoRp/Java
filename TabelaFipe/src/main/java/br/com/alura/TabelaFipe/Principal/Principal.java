package br.com.alura.TabelaFipe.Principal;

import br.com.alura.TabelaFipe.Service.ConsumoAPI;

import java.util.Scanner;

public class Principal {
    private Scanner leitura = new Scanner(System.in);
    private ConsumoAPI consumo = new ConsumoAPI();
    private final String URL_BASE = "https://parallelum.com.br/fipe/api/v1/";

    public void  exibeMenu(){
        var menu = """
                **** OPÇÕES ****
                CARRO
                MOTO
                CAMINHÃO
                
                Digiter uma das opções para consulta: 
                """;
        System.out.println(menu);
        var opcao = leitura.nextLine();
        String endereco;

        if(opcao.toLowerCase().contains("carr")){
            endereco = URL_BASE + "carros/marcas";
        } else if (opcao.toLowerCase().contains("mot")) {
            endereco = URL_BASE + "motos/marcas";
        } else {
            endereco = URL_BASE + "caminhoes/marcas";
        }

        var json = consumo.obterDados(endereco);
        System.out.println(json);

    }
}
