package util;

public class DescontoUtil {

    public static double calcularPercentualDesconto(int quantidade) {
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

    public static double aplicarDesconto(double valorTotal, double percentualDesconto) {
        return valorTotal - (valorTotal * percentualDesconto);
    }
}
