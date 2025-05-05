package service;

import model.Pessoa;

public class PessoaService {

    public void verificarMaioridade(Pessoa pessoa) {
        if (pessoa.isMaiorDeIdade()) {
            System.out.println(pessoa.getNome() + " é maior de idade.");
        } else {
            System.out.println(pessoa.getNome() + " não é maior de idade.");
        }
    }
}
