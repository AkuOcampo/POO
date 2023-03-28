package ej2;

import Entidad.Circunferencia;
import Servicio.CircunferenciaServicio;
public class Ej2 {
    public static void main(String[] args) {
        CircunferenciaServicio cs = new CircunferenciaServicio();
        Circunferencia c1 = cs.crearCircunferencia();
        System.out.println("La circunferencia de radio "+c1.getRadio());
        cs.Area(c1);
        cs.Perimetro(c1);
        
        
    }
    
}
