package service;

import model.Pessoa;

public class PessoaService {

    public boolean isMaiorDeIdade(Pessoa pessoa) {
        boolean resultado = pessoa.getIdade() >= 18;
        pessoa.setMaiorDeIdade(resultado);
        return resultado;
    }


}
