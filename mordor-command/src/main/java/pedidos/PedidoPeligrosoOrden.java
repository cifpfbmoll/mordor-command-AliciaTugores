package pedidos;

import java.util.UUID;

public class PedidoPeligrosoOrden implements PedidoPeligroso{

    private final String id;
    private String destino = null;
    private int peso = 0;
    private String instrucciones = null;

    public PedidoPeligrosoOrden(String destino, String instrucciones){
        this.id = UUID.randomUUID().toString();
        this.destino = destino;
        this.instrucciones = instrucciones;
    }

    @Override
    public String instrucciones() {
        return this.instrucciones;
    }

    @Override
    public int peso() {
        return this.peso;
    }

    @Override
    public String destino() {
        return this.destino;
    }

    public String getId(){
        return this.id;
    }
}
