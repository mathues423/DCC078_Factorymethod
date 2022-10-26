package Main;

public class ServicoPedirItem implements LServico{

    @Override
    public String adicionar() {
        return "Pedido aceito";
    }

    @Override
    public String pedirCancelamento() {
        return "Pedido de cancelamento do item do crdapio aceito";
    }
}
