package tratramientos;

import pedidos.Pedido;

import java.util.Set;

public class TratamientoPedidoMultiple implements TratamientoPedido{

    private Integer pesoTotal;
    private Long numBultos;
    private final Set<Pedido> pedidos;

    public TratamientoPedidoMultiple(Set<Pedido> pedidos){
        this.pedidos = pedidos;
    }

    @Override
    public boolean tratar() {
        return false;
    }

    public Integer getPesoTotal(){
        return this.pesoTotal;
    }

    public Long getNumBultos(){
        return this.numBultos;
    }

//    public void calcularPesoTotal(){}
//
//    public void calcularTotalBultos(){}
}
