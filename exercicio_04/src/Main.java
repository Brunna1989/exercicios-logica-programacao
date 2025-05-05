import model.Operacao;
import service.CalculadoraService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculadoraService calculadora = new CalculadoraService();

        System.out.println("=== CALCULADORA ===");

        try {
            System.out.print("Digite o primeiro número: ");
            double a = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double b = scanner.nextDouble();

            System.out.print("Escolha a operação (+, -, *, /): ");
            char simbolo = scanner.next().charAt(0);
            Operacao operacao = fromChar(simbolo); // switch-case aqui

            double resultado = calculadora.calcular(a, b, operacao);
            System.out.println("Resultado: " + resultado);

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        scanner.close();
    }

    public static Operacao fromChar(char c) {
        switch (c) {
            case '+':
                return Operacao.ADICAO;
            case '-':
                return Operacao.SUBTRACAO;
            case '*':
                return Operacao.MULTIPLICACAO;
            case '/':
                return Operacao.DIVISAO;
            default:
                throw new IllegalArgumentException("Operação inválida: " + c);
        }
    }
}