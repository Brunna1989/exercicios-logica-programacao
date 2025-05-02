package test;

import model.Produto;
import org.junit.Before;
import org.junit.Test;
import service.ProdutoService;

import static org.junit.Assert.*;

public class ProdutoServiceTest {

    private ProdutoService service;

    @Before
    public void setUp() {
        service = new ProdutoService();
    }

    @Test
    public void testSemDescontoParaAte10Unidades() {
        Produto produto = new Produto("Caneta", 2.0, 10);
        service.calcularValores(produto);

        assertEquals(20.0, produto.getValorTotalSemDesconto(), 0.01);
        assertEquals(0.0, produto.getPercentualDesconto(), 0.01);
        assertEquals(20.0, produto.getValorFinalComDesconto(), 0.01);
    }

    @Test
    public void testDesconto10PorcentoPara11a20Unidades() {
        Produto produto = new Produto("Caderno", 5.0, 15);
        service.calcularValores(produto);

        assertEquals(75.0, produto.getValorTotalSemDesconto(), 0.01);
        assertEquals(0.10, produto.getPercentualDesconto(), 0.01);
        assertEquals(67.5, produto.getValorFinalComDesconto(), 0.01);
    }

    @Test
    public void testDesconto20PorcentoPara21a50Unidades() {
        Produto produto = new Produto("Lápis", 1.0, 30);
        service.calcularValores(produto);

        assertEquals(30.0, produto.getValorTotalSemDesconto(), 0.01);
        assertEquals(0.20, produto.getPercentualDesconto(), 0.01);
        assertEquals(24.0, produto.getValorFinalComDesconto(), 0.01);
    }

    @Test
    public void testDesconto25PorcentoParaMaisDe50Unidades() {
        Produto produto = new Produto("Notebook", 2000.0, 60);
        service.calcularValores(produto);

        assertEquals(120000.0, produto.getValorTotalSemDesconto(), 0.01);
        assertEquals(0.25, produto.getPercentualDesconto(), 0.01);
        assertEquals(90000.0, produto.getValorFinalComDesconto(), 0.01);
    }

    @Test
    public void testLimiteInferiorDesconto10Porcento() {
        Produto produto = new Produto("Mouse", 10.0, 11);
        service.calcularValores(produto);

        assertEquals(110.0, produto.getValorTotalSemDesconto(), 0.01);
        assertEquals(0.10, produto.getPercentualDesconto(), 0.01);
        assertEquals(99.0, produto.getValorFinalComDesconto(), 0.01);
    }

    @Test
    public void testLimiteSuperiorDesconto20Porcento() {
        Produto produto = new Produto("Teclado", 50.0, 50);
        service.calcularValores(produto);

        assertEquals(2500.0, produto.getValorTotalSemDesconto(), 0.01);
        assertEquals(0.20, produto.getPercentualDesconto(), 0.01);
        assertEquals(2000.0, produto.getValorFinalComDesconto(), 0.01);
    }

    @Test
    public void testLimiteSuperiorDesconto10Porcento() {
        Produto produto = new Produto("Agenda", 20.0, 20);
        service.calcularValores(produto);

        assertEquals(400.0, produto.getValorTotalSemDesconto(), 0.01);
        assertEquals(0.10, produto.getPercentualDesconto(), 0.01);
        assertEquals(360.0, produto.getValorFinalComDesconto(), 0.01);
    }
}
