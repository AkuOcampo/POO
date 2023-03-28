package Servicio;

import Entidad.Raices;

public class RaicesServicio {
    double discriminante; //(b^2)-4*a*c
    public void getDiscriminante(Raices r1){
        discriminante = Math.pow(r1.getB(), 2)-4*r1.getA()*r1.getC();
    }
    public void tieneRaices (Raices r1){
        
    }
}
