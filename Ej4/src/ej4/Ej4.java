package ej4;

import Entidad.Rectangulo;
import Servicio.RectanguloServicio;

public class Ej4 {

    public static void main(String[] args) {
        RectanguloServicio rec1 = new RectanguloServicio();
        Rectangulo r1= rec1.crearRectangulo();
        
        rec1.calcularSup(r1);
        rec1.calcularPer(r1);
        rec1.mostrarRec(r1);

    }
    
}
