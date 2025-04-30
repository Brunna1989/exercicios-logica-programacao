package service;

import model.Produto;
import util.DescontoUtil;

public class ProdutoService {

    public double calcularValorFinal(Produto produto) {
        double valorSemDesconto = produto.getValorTotalSemDesconto();
        double percentualDesconto = DescontoUtil.calcularPercentualDesconto(produto.getQuantidade());
        return DescontoUtil.aplicarDesconto(valorSemDesconto, percentualDesconto);
    }

    public void imprimirResumo(Produto produto) {
        double valorFinal = calcularValorFinal(produto);
        System.out.printf("Produto: %s%nValor total a pagar: R$ %.2f%n",
                produto.getNome(), valorFinal);
    }
}
