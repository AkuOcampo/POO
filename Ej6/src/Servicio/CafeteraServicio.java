package Servicio;

import Entidad.Cafetera;
import java.util.Scanner;

public class CafeteraServicio {
    Scanner leer = new Scanner(System.in);
    public Cafetera llenarCafetera(){
        Cafetera c1 = new Cafetera();
        c1.setCapacidadMaxima(1000);
        c1.setCapacidadActual(c1.getCapacidadMaxima());
        return c1;  
    }
    public void servirTaza(Cafetera c1){
        System.out.println("Ingrese el tamaño de la taza: (cm3");
        int tam = leer.nextInt();
        if (c1.getCapacidadActual()<tam){
            System.out.println("En la taza se sirvió "+(c1.getCapacidadActual())+" cm3. La cafetera quedó vacía");
            c1.setCapacidadActual(0);
        }else{
            System.out.println("Su taza ha sido servido correctamente");
            c1.setCapacidadActual(c1.getCapacidadActual()-tam);
        }
    }
    public void vaciarCafetera(Cafetera c1){
        c1.setCapacidadActual(0);
        System.out.println("La cafetera se vació correctamente");
    }
    public void agregarCafe(Cafetera c1){
        if (c1.getCapacidadActual()<c1.getCapacidadMaxima()-100){
            System.out.println("Ingrese 100gr de cafe");
            int cafe = leer.nextInt();
            c1.setCapacidadActual(cafe);
            System.out.println("Se ha ingresado su cafe correctamente");
        }else{
            System.out.println("La cafetera ya está llena.");
        }
    }
    
}
