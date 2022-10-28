package Teste;

import Main.FabricaServico;
import Main.LServico;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoPedirItemTest {
    @Test
    void deveTestarAdicao() {

        LServico servico = FabricaServico.obterServico("PedirItem");
        assertEquals("Pedido aceito", servico.adicionar());
    }

    @Test
    void deveTestarCancela() {
        LServico servico = FabricaServico.obterServico("PedirItem");
        assertEquals("Pedido de cancelamento do item do crdapio aceito", servico.pedirCancelamento());
    }
}