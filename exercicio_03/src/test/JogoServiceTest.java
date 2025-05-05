package test;

import model.Opcao;
import model.ResultadoRodada;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import service.JogoService;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class JogoServiceTest {

    private JogoService jogoService;
    private final ByteArrayOutputStream consoleOut = new ByteArrayOutputStream();
    private PrintStream originalOut;

    @Before
    public void setUp() throws Exception {
        jogoService = new JogoService();

        originalOut = System.out;
        System.setOut(new PrintStream(consoleOut));

        Field field = JogoService.class.getDeclaredField("random");
        field.setAccessible(true);
        field.set(jogoService, new Random() {
            @Override
            public int nextInt(int bound) {
                return 0; // Opcao.PEDRA
            }
        });

        // Limpa o histórico
        jogoService.limparHistorico();
    }

    @After
    public void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    public void testProcessarRodada_Empate() {
        ResultadoRodada resultado = jogoService.processarRodada(Opcao.PEDRA);
        assertTrue(resultado.getResultadoHtml().contains("Empate"));
        assertTrue(resultado.getLog().contains("Empate"));
    }

    @Test
    public void testProcessarRodada_Vitoria() throws Exception {
        mockRandom(Opcao.TESOURA); // Jogador: PEDRA, Computador: TESOURA → Vitória
        ResultadoRodada resultado = jogoService.processarRodada(Opcao.PEDRA);
        assertTrue(resultado.getResultadoHtml().contains("Você venceu"));
    }

    @Test
    public void testProcessarRodada_Derrota() throws Exception {
        mockRandom(Opcao.PAPEL); // Jogador: PEDRA, Computador: PAPEL → Derrota
        ResultadoRodada resultado = jogoService.processarRodada(Opcao.PEDRA);
        assertTrue(resultado.getResultadoHtml().contains("Você perdeu"));
    }

    @Test
    public void testLimparHistorico() throws Exception {
        jogoService.processarRodada(Opcao.PEDRA);
        jogoService.limparHistorico();

        Field historicoField = JogoService.class.getDeclaredField("historico");
        historicoField.setAccessible(true);
        StringBuilder historico = (StringBuilder) historicoField.get(jogoService);

        assertEquals(0, historico.length());
    }

    // Auxiliar para simular a opção retornada pelo computador
    private void mockRandom(final Opcao opcao) throws Exception {
        Field field = JogoService.class.getDeclaredField("random");
        field.setAccessible(true);
        field.set(jogoService, new Random() {
            @Override
            public int nextInt(int bound) {
                return opcao.ordinal();
            }
        });
    }
}
