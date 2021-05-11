package pingpong;

import pedidos.Pedido;
import pedidos.PedidoInternacional;
import pedidos.PedidoPeligroso;
import pedidos.PedidoPeligrosoOrden;
import procesador.Oficina;
import tratramientos.TratamientoPedido;
import tratramientos.TratamientoPedidoInternacional;
import tratramientos.TratamientoPedidoPeligroso;

public class App {

    public static void main(String[] args) {

        Oficina oficina = new Oficina();

        Pedido pedido = new PedidoInternacional("Comarca", 10);
        TratamientoPedido tratamientoInt = new TratamientoPedidoInternacional(
                (PedidoInternacional) pedido);

        System.out.println(oficina.printarStatus(oficina.procesa(tratamientoInt), pedido));

        pedido = new PedidoInternacional("Mordor", 10);
        tratamientoInt = new TratamientoPedidoInternacional((PedidoInternacional) pedido);

        System.out.println(oficina.printarStatus(oficina.procesa(tratamientoInt), pedido));

        pedido = new PedidoPeligrosoOrden("Cima de los vientos",
                "No urgarse en las uñas con este puñal");
        TratamientoPedido peligroso = new TratamientoPedidoPeligroso((PedidoPeligroso) pedido);

        System.out.println(oficina.printarStatus(oficina.procesa(peligroso), pedido));

        pedido = new PedidoPeligrosoOrden("Monte del destino",
                "No ponerselo en el dedo");
        peligroso = new TratamientoPedidoPeligroso((PedidoPeligroso) pedido);

        System.out.println(oficina.printarStatus(oficina.procesa(peligroso), pedido));
    }
}
