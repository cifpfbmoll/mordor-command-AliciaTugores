package tratramientos;

import pedidos.PedidoPeligroso;

public class TratamientoPedidoPeligroso implements TratamientoPedido{

    private PedidoPeligroso pedido;

    public TratamientoPedidoPeligroso(PedidoPeligroso pedido){
        this.pedido = pedido;
    }

    @Override
    public boolean tratar() {
        return ! pedido.instrucciones().equals("No ponerselo en el dedo");
    }

    public PedidoPeligroso getPedido(){
        return this.pedido;
    }
}
