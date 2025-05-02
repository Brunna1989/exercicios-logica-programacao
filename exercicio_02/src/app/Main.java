package app;

import model.Produto;
import service.ProdutoService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProdutoService produtoService = new ProdutoService();

        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o preço unitário: ");
        double preco = scanner.nextDouble();

        System.out.print("Digite a quantidade comprada: ");
        int quantidade = scanner.nextInt();

        Produto produto = new Produto(nome, preco, quantidade);

        produtoService.calcularValores(produto);
        produtoService.imprimirResumo(produto);

        scanner.close();
    }
}
