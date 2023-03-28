package ej14;

import Entidad.Movil;
import Servicio.MovilServicio;

public class Ej14 {

    public static void main(String[] args) {
        MovilServicio ms = new MovilServicio();
        //Creamos un arreglo de dimensión 10 donde guardaremos cada objeto.
        Movil m1 [] = new Movil[10];
        for (int i = 0; i < 10 ; i++) {
            m1[i]=new Movil();
        }
        ms.mostrarModelo(m1);
    }
    
}
