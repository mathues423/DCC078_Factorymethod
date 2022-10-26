package Main;

public class ServicoTempoInternet implements LServico{

    @Override
    public String adicionar() {
        return "Tempo de internet adicionado";
    }

    @Override
    public String pedirCancelamento() {
        return "Pedido de cancelamento de tempo de internet aceito";
    }
}
