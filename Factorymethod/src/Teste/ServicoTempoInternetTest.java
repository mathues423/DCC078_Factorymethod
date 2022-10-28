package Teste;

import Main.FabricaServico;
import Main.LServico;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoTempoInternetTest {
    @Test
    void deveTestarAdicao() {

        LServico servico = FabricaServico.obterServico("TempoInternet");
        assertEquals("Tempo de internet adicionado", servico.adicionar());
    }

    @Test
    void deveTestarCancela() {
        LServico servico = FabricaServico.obterServico("TempoInternet");
        assertEquals("Pedido de cancelamento de tempo de internet aceito", servico.pedirCancelamento());
    }
}