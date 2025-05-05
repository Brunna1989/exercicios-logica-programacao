package service;

import exception.OperacaoInvalidaException;
import model.Operacao;

public class CalculadoraService {

    public double calcular(double a, double b, Operacao operacao) {
        if (operacao == null) {
            throw new OperacaoInvalidaException("Operação inválida: null");
        }

        switch (operacao) {
            case ADICAO:
                return a + b;
            case SUBTRACAO:
                return a - b;
            case MULTIPLICACAO:
                return a * b;
            case DIVISAO:
                if (b == 0) throw new OperacaoInvalidaException("Divisão por zero");
                return a / b;
            default:
                throw new OperacaoInvalidaException("Operação desconhecida");
        }
    }
}
