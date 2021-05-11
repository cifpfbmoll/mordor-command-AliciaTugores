package pedidos;

public class PedidoNacional implements Pedido{

    private final String id;
    private String destino = null;
    private int peso = 0;

    public PedidoNacional

    @Override
    public int peso() {
        return 0;
    }

    @Override
    public String destino() {
        return null;
    }
}
