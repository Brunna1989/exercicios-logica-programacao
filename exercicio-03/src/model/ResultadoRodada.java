package model;

public class ResultadoRodada {
    private final String resultadoHtml;
    private final String log;

    public ResultadoRodada(String resultadoHtml, String log) {
        this.resultadoHtml = resultadoHtml;
        this.log = log;
    }

    public String getResultadoHtml() {
        return resultadoHtml;
    }

    public String getLog() {
        return log;
    }
}
