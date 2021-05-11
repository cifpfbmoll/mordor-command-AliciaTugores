package procesador;

import tratramientos.TratamientoPedido;

public interface Procesador {

    boolean procesa(TratamientoPedido tratamiento);
}
