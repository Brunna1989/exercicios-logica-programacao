package test;

import model.Pessoa;
import org.junit.Before;
import org.junit.Test;
import service.PessoaService;

import static org.junit.Assert.*;

public class PessoaServiceTest {

    private PessoaService service;

    @Before
    public void setUp() {
        service = new PessoaService();
    }

    @Test
    public void testPessoaMaiorDeIdade() {
        Pessoa pessoa = new Pessoa("Felipe", 20);
        assertTrue(pessoa.isMaiorDeIdade());

        service.verificarMaioridade(pessoa);
    }

    @Test
    public void testPessoaMenorDeIdade() {
        Pessoa pessoa = new Pessoa("Ana Clara", 17);
        assertFalse(pessoa.isMaiorDeIdade());

        service.verificarMaioridade(pessoa);
    }

    @Test
    public void testPessoaCom18Anos() {
        Pessoa pessoa = new Pessoa("Brunna", 18);
        assertTrue(pessoa.isMaiorDeIdade());

        service.verificarMaioridade(pessoa);
    }
}
