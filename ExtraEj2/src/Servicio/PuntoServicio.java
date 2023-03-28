package Servicio;

import Entidad.Punto;
import java.util.Scanner;

public class PuntoServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Punto p1 = new Punto();
    public Punto crearPunto(){
        System.out.println("Ingrese las coordenadas del primer punto (x,y): ");
        p1.setX1(leer.nextInt());
        p1.setY1(leer.nextInt());
        System.out.println("Ingrese las coordenadas del segundo punto (x,y): ");
        p1.setX2(leer.nextInt());
        p1.setY2(leer.nextInt());
        return p1;
    }
    public void calcularDistancia (){
        double distancia = Math.sqrt(Math.pow((p1.getX2()-p1.getX1()),2)+Math.pow((p1.getY2()-p1.getY1()),2));
        System.out.println("La distacia entre los puntos P1("+p1.getX1()+","+p1.getY1()+") y P2 ("+p1.getX2()+","+p1.getY2()+") es: " + distancia);
    }
    
}
