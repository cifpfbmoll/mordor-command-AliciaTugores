package procesador;

import pedidos.Pedido;
import tratramientos.TratamientoPedido;

public class Oficina implements Procesador{

    public Oficina(){}

    @Override
    public boolean procesa(TratamientoPedido tratamiento) {
        return tratamiento.tratar();
    }

    public String printarStatus(boolean status, Pedido pedido){
        return status?
                pedido.destino() + " " + Status.ACEPTADO.name():
                pedido.destino() + " " + Status.RECHAZADO.name();
    }
}
