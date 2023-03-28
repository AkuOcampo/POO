package ej6;

import Entidad.Cafetera;
import Servicio.CafeteraServicio;
import java.util.Scanner;

public class Nespresso {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int op;
        CafeteraServicio cafe1 = new CafeteraServicio();
        Cafetera c1 = cafe1.llenarCafetera();
        System.out.println("Bienvenido");
        do{
            System.out.println("1- Llenar cafetera"
                               +"\n 2-Servir una taza"
                               +"\n 3-Vaciar cafetera"
                               +"\n 4-Agregar cafe"
                               +"\n 5-Salir");
            System.out.println(c1);
            switch (op =leer.nextInt()){
                case 1:
                    cafe1.llenarCafetera();
                    break;
                case 2:
                    cafe1.servirTaza(c1);
                    break;
                case 3:
                    cafe1.vaciarCafetera(c1);
                    break;
                case 4:
                    cafe1.agregarCafe(c1);
                    break;
                case 5:
                    System.out.println("Hasta la próxima");
                    break;
                default:
                    System.out.println("Opción inválida");     
            }
        }while(op!=5);
           
    }
    
}
