package Pessoa;

public class Pessoa {
    private final String nome;
    private final int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString(){
        return "Nome: " + nome + ", Idade: " + idade;
    }

}
