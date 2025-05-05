package service;

import model.Opcao;
import model.ResultadoRodada;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class JogoService {

    private final Random random = new Random();
    private final StringBuilder historico = new StringBuilder();

    public ResultadoRodada processarRodada(Opcao jogador) {
        Opcao pc = gerarOpcao();
        String resultado = gerarResultado(jogador, pc);

        String log = "Jogador: " + jogador + " | Computador: " + pc + " => " + resultado;
        historico.append(log).append("\n");
        salvarResultadoEmArquivo(log);

        String resultadoHtml = "<html>Sua jogada: <b>" + jogador + "</b><br>Computador: <b>" + pc +
                "</b><br><br><b>" + resultado + "</b></html>";

        return new ResultadoRodada(resultadoHtml, log);
    }

    public void limparHistorico() {
        historico.setLength(0);
    }

    private Opcao gerarOpcao() {
        Opcao[] valores = Opcao.values();
        return valores[random.nextInt(valores.length)];
    }

    private String gerarResultado(Opcao jogador, Opcao pc) {
        if (jogador == pc) {
            return "Empate!";
        } else if (jogador.vence(pc)) {
            return "Você venceu!";
        } else {
            return "Você perdeu!";
        }
    }

    private void salvarResultadoEmArquivo(String texto) {
        try (FileWriter writer = new FileWriter("historico_jogo.txt", true)) {
            writer.write(texto + "\n");
        } catch (IOException e) {
            System.out.println("Erro ao salvar no arquivo: " + e.getMessage());
        }
    }
}
