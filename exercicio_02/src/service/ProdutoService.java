package service;

import model.Produto;

public class ProdutoService {

    public void calcularValores(Produto produto) {
        double valorSemDesconto = produto.getPrecoUnitario() * produto.getQuantidade();
        double percentualDesconto = calcularPercentualDesconto(produto.getQuantidade());
        double valorFinal = aplicarDesconto(valorSemDesconto, percentualDesconto);

        produto.setValorTotalSemDesconto(valorSemDesconto);
        produto.setPercentualDesconto(percentualDesconto);
        produto.setValorFinalComDesconto(valorFinal);
    }

    private double calcularPercentualDesconto(int quantidade) {
        if (quantidade <= 10) {
            return 0.0;
        } else if (quantidade <= 20) {
            return 0.10;
        } else if (quantidade <= 50) {
            return 0.20;
        } else {
            return 0.25;
        }
    }

    private double aplicarDesconto(double valorTotal, double percentualDesconto) {
        return valorTotal * (1 - percentualDesconto);
    }

    public void imprimirResumo(Produto produto) {
        System.out.printf("Produto: %s%n", produto.getNome());
        System.out.printf("Preço unitário: R$ %.2f%n", produto.getPrecoUnitario());
        System.out.printf("Quantidade: %d unidades%n", produto.getQuantidade());
        System.out.printf("Valor total sem desconto: R$ %.2f%n", produto.getValorTotalSemDesconto());
        System.out.printf("Desconto aplicado: %.0f%%%n", produto.getPercentualDesconto() * 100);
        System.out.printf("Valor final com desconto: R$ %.2f%n", produto.getValorFinalComDesconto());
    }
}
