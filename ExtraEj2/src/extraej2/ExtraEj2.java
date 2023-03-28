package extraej2;

import Entidad.Punto;
import Servicio.PuntoServicio;

public class ExtraEj2 {

    public static void main(String[] args) {
        PuntoServicio ps = new PuntoServicio();
        ps.crearPunto();
        ps.calcularDistancia();
        
    }
    
}
