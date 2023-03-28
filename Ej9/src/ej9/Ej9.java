package ej9;

import Entidad.Matematica;
import Servicio.MatematicaServicio;

public class Ej9 {

    public static void main(String[] args) {
        MatematicaServicio prueba = new MatematicaServicio();
        
        Matematica m1 = prueba.crearNum();
        prueba.devolverMayor(m1);
        prueba.calcularPotencia();
        prueba.calcularRaiz();
    }
    
}
