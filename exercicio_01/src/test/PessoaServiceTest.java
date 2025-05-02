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
        boolean resultado = service.isMaiorDeIdade(pessoa);

        assertTrue(resultado);
        assertTrue(pessoa.isMaiorDeIdade());

        System.out.println(pessoa.getNome() + " tem " + pessoa.getIdade() + " anos e é " +
                (resultado ? "maior" : "menor") + " de idade.");
    }

    @Test
    public void testPessoaMenorDeIdade() {
        Pessoa pessoa = new Pessoa("Ana Clara", 17);
        boolean resultado = service.isMaiorDeIdade(pessoa);

        assertFalse(resultado);
        assertFalse(pessoa.isMaiorDeIdade());

        System.out.println(pessoa.getNome() + " tem " + pessoa.getIdade() + " anos e é " +
                (resultado ? "maior" : "menor") + " de idade.");
    }

    @Test
    public void testPessoaCom18Anos() {
        Pessoa pessoa = new Pessoa("Brunna", 18);
        boolean resultado = service.isMaiorDeIdade(pessoa);

        assertTrue(resultado);
        assertTrue(pessoa.isMaiorDeIdade());

        System.out.println(pessoa.getNome() + " tem " + pessoa.getIdade() + " anos e é " +
                (resultado ? "maior" : "menor") + " de idade.");
    }
}
