package tratramientos;

import pedidos.PedidoInternacional;
import tratramientos.TratamientoPedido;

public class TratamientoPedidoInternacional implements TratamientoPedido {

    private final PedidoInternacional pedido;

    public TratamientoPedidoInternacional(PedidoInternacional pedido){
        this.pedido = pedido;
    }

    @Override
    public boolean tratar() {
        return ! pedido.destino().equals("Mordor");
    }

    public PedidoInternacional getPedido(){
        return this.pedido;
    }


}
