package extraspoo2;

import Entidad.Tiempo;
import Servicio.TiempoServicio;

public class ExtrasPOO2 {

    public static void main(String[] args) {
        TiempoServicio ts = new TiempoServicio();
        Tiempo t1 = new Tiempo();
        ts.mostrarConsola(t1);
    }
    
}
