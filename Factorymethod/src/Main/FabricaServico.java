package Main;

public class FabricaServico {
    public static LServico obterServico(String servico) {
        Object objeto = null;
        try {
            objeto = Class.forName("Main.Servico" + servico).newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Serviço inexistente");
        }
        if (!(objeto instanceof LServico)) {
            throw new IllegalArgumentException("Serviço inválido");
        }
        return (LServico) objeto;
    }

}
