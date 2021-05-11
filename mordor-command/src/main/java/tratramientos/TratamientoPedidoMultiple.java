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
        calcularPesoTotal();
        calcularTotalBultos();
        if (pesoTotal > 0 && numBultos == pedidos.size()) {
            return true;
        }
        else{
            return false;
        }
    }

    public Integer getPesoTotal(){
        return this.pesoTotal;
    }

    public Long getNumBultos(){
        return this.numBultos;
    }

    public void calcularPesoTotal(){
        this.pesoTotal = pedidos.stream().map(Pedido::peso).reduce(0, Integer::sum);
    }

    public void calcularTotalBultos(){
        this.numBultos = pedidos.stream().count();
    }
}
