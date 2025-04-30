import model.Pessoa;
import service.PessoaService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o nome da pessoa: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade da pessoa: ");
        int idade = scanner.nextInt();

        Pessoa pessoa = new Pessoa(nome, idade);
        PessoaService verificador = new PessoaService();

        verificador.imprimirResultado(pessoa);

        scanner.close();
    }
}