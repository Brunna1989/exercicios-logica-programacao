package test;

import model.Operacao;
import exception.OperacaoInvalidaException;
import org.junit.Test;
import service.CalculadoraService;

import static org.junit.Assert.*;

public class CalculadoraServiceTest {

    private final CalculadoraService calculadora = new CalculadoraService();

    @Test
    public void testAdicao() {
        assertEquals(15.0, calculadora.calcular(10, 5, Operacao.ADICAO), 0.001);
    }

    @Test
    public void testSubtracao() {
        assertEquals(5.0, calculadora.calcular(10, 5, Operacao.SUBTRACAO), 0.001);
    }

    @Test
    public void testMultiplicacao() {
        assertEquals(50.0, calculadora.calcular(10, 5, Operacao.MULTIPLICACAO), 0.001);
    }

    @Test
    public void testDivisao() {
        assertEquals(2.0, calculadora.calcular(10, 5, Operacao.DIVISAO), 0.001);
    }

    @Test(expected = OperacaoInvalidaException.class)
    public void testDivisaoPorZero() {
        calculadora.calcular(10, 0, Operacao.DIVISAO);
    }

    @Test(expected = OperacaoInvalidaException.class)
    public void testOperacaoDesconhecida() {
        calculadora.calcular(10, 5, null);
    }
}
