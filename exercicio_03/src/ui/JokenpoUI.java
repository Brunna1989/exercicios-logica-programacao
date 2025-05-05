package ui;

import model.Opcao;
import model.ResultadoRodada;
import service.JogoService;

import javax.swing.*;
import java.awt.*;

public class JokenpoUI {

    private final JogoService jogo = new JogoService();
    private JLabel resultadoLabel;
    private JTextArea historicoArea;

    public void criarJanela() {
        JFrame frame = new JFrame("Jokenpô");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(new BorderLayout(10, 10));

        resultadoLabel = new JLabel("Escolha sua jogada:", SwingConstants.CENTER);
        resultadoLabel.setFont(new Font("Arial", Font.BOLD, 16));
        frame.add(resultadoLabel, BorderLayout.NORTH);

        JPanel botoesPanel = new JPanel();
        for (Opcao opcao : Opcao.values()) {
            JButton botao = new JButton(opcao.name());
            botao.addActionListener(e -> {
                ResultadoRodada resultado = jogo.processarRodada(opcao);
                resultadoLabel.setText(resultado.getResultadoHtml());
                historicoArea.append(resultado.getLog() + "\n");
                System.out.println(resultado.getLog());
            });
            botoesPanel.add(botao);
        }
        frame.add(botoesPanel, BorderLayout.CENTER);

        historicoArea = new JTextArea(10, 25);
        historicoArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(historicoArea);
        scrollPane.setBorder(BorderFactory.createTitledBorder("Histórico de Partidas"));
        frame.add(scrollPane, BorderLayout.EAST);

        JPanel botoesInferiores = new JPanel();
        JButton novaRodada = new JButton("Nova Rodada");
        novaRodada.addActionListener(e -> {
            resultadoLabel.setText("Escolha sua jogada:");
            jogo.limparHistorico();
            historicoArea.setText("");
        });

        JButton sair = new JButton("Sair");
        sair.addActionListener(e -> System.exit(0));

        botoesInferiores.add(novaRodada);
        botoesInferiores.add(sair);
        frame.add(botoesInferiores, BorderLayout.SOUTH);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
