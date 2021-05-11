package pedidos;

import java.util.UUID;

public class PedidoInternacional implements Pedido {

    private final String id;
    private String destino;
    private int peso;

    public PedidoInternacional(String destino, int peso){
        this.id = UUID.randomUUID().toString();
        this.destino = destino;
        this.peso = peso;
    }

    @Override
    public int peso() {
        return peso;
    }

    @Override
    public String destino() {
        return destino;
    }

    public String getId(){
        return this.id;
    }
}
