package Teste;

import Main.FabricaServico;
import Main.LServico;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FabricaServicoTest {
    @Test
    void deveRetornarExcecaoParaServicoInexistente() {
        try {
            LServico servico = FabricaServico.obterServico("PedidoMaluco");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Serviço inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaServicoInvalido() {
        try {
            LServico servico = FabricaServico.obterServico("PedirCarona");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Serviço inválido", e.getMessage());
        }
    }
}
