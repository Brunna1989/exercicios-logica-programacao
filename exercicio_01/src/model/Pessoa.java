package model;

public class Pessoa {
    private String nome;
    private int idade;
    private boolean isMaiorDeIdade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public boolean isMaiorDeIdade() {
        return isMaiorDeIdade;
    }

    public void setMaiorDeIdade(boolean isMaiorDeIdade) {
        this.isMaiorDeIdade = isMaiorDeIdade;
    }
}
