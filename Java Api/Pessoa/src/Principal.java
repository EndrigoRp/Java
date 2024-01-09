import Pessoa.Pessoa;

import java.util.ArrayList;


public class Principal {
    public static void main(String[] args){

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        System.out.println("Tamanho da lista: " + listaDePessoas.size());

        Pessoa pessoa1 = new Pessoa("João", 26);
        System.out.println(pessoa1);
        Pessoa pessoa2 = new Pessoa("Endorigo", 35);
        System.out.println(pessoa2);
        Pessoa pessoa3 = new Pessoa("ZéRuela", 24);
        System.out.println(pessoa3);

        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println("Tamanho da lista: " + listaDePessoas.size());
        System.out.println("Primeira Pessoa: " + listaDePessoas.get(0));

        System.out.println("Lista de Pessoas: ");
        for(Pessoa pessoa: listaDePessoas){
            System.out.println(pessoa);
        }

    }


}


