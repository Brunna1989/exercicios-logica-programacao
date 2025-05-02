package model;

public class Produto {
    private String nome;
    private double precoUnitario;
    private int quantidade;
    private double percentualDesconto;
    private double valorTotalSemDesconto;
    private double valorFinalComDesconto;

    public Produto(String nome, double precoUnitario, int quantidade) {
        this.nome = nome;
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPercentualDesconto() {
        return percentualDesconto;
    }

    public void setPercentualDesconto(double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

    public double getValorTotalSemDesconto() {
        return valorTotalSemDesconto;
    }

    public void setValorTotalSemDesconto(double valorTotalSemDesconto) {
        this.valorTotalSemDesconto = valorTotalSemDesconto;
    }

    public double getValorFinalComDesconto() {
        return valorFinalComDesconto;
    }

    public void setValorFinalComDesconto(double valorFinalComDesconto) {
        this.valorFinalComDesconto = valorFinalComDesconto;
    }
}
