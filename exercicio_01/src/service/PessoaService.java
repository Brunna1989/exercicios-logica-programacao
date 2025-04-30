package service;

import model.Pessoa;

public class PessoaService {

    public boolean isMaiorDeIdade(Pessoa pessoa) {
        return pessoa.getIdade() >= 18;
    }

    public void imprimirResultado(Pessoa pessoa) {
        if (isMaiorDeIdade(pessoa)) {
            System.out.println(pessoa.getNome() + " é maior de idade.");
        } else {
            System.out.println(pessoa.getNome() + " é menor de idade.");
        }
    }
}