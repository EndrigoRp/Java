package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComLista {
    public static void main(String[] args) {


        Filme favorito = new Filme("The Matrix - ", 1999);
        favorito.avalia(10);

        Filme outro = new Filme("Jhon Wick - ", 2014);
        outro.avalia(9);

        Filme meuFilme = new Filme("O Poderoso Chefão - ", 1970);
        meuFilme.avalia(8);

        Filme outroFilme = new Filme("A Espada era Lei - ", 1987);
        outroFilme.avalia(7);

        var filmeDoPaulo = new Filme("Dogville - ", 2003);
        filmeDoPaulo.avalia(9);

        Serie lost = new Serie("Lost - ", 2000);
        lost.avalia(6);

        Serie casaDePapel = new Serie("La Casa de Papel - ", 2017);
        casaDePapel.avalia(7);


        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(favorito);
        lista.add(outro);
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        lista.add(casaDePapel);

        Collections.sort(lista);


        for (Titulo item: lista) {
            System.out.println("Nome: " + item.getNome() + item.getAnoDeLancamento());

            if(item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificação " + filme.getClassificacao());
            }else if (item instanceof Serie serie && serie.getClassificacao() > 2){
                System.out.println("Classificação " + serie.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtistas = new ArrayList<>();
        buscaPorArtistas.add("Adam Sandler");
        buscaPorArtistas.add("Endrigo");
        buscaPorArtistas.add("Paulo");
        buscaPorArtistas.add("Jaqueline");
        System.out.println(buscaPorArtistas);

        Collections.sort(buscaPorArtistas);
        System.out.println("Depois da ordenação: " + buscaPorArtistas);

        Collections.sort(lista);
        System.out.println("Lista de Titulos ordenados");
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(lista);
    }
}
