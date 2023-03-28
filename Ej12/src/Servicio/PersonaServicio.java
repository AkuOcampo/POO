/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Agustina
 */
public class PersonaServicio {
    Scanner leer = new Scanner(System.in);
    public void crearPersona(Persona p1){
        System.out.println("Ingrese su nombre:");
        p1.setNombre(leer.next());
        System.out.print("Ingrese el día: ");
        int dia= leer.nextInt();
        System.out.print("Ingrese el mes: ");
        int mes = leer.nextInt();
        System.out.print("Ingrese el año: ");
        int anio= leer.nextInt();
        Date fecha = new Date(anio-1900, mes-1, dia);
        p1.setFechaN(fecha);
    }
    public int calcularEdad (Persona p1){
        Date fechaActual = new Date();
        int edad= fechaActual.getYear()- p1.getFechaN().getYear();
        if(fechaActual.getMonth()<p1.getFechaN().getMonth()){
            edad--;
        }else if (fechaActual.getMonth()==p1.getFechaN().getMonth()){
            if(fechaActual.getDay()>p1.getFechaN().getDay()){
                edad--;
            }
        }
        return edad;
    }
    public boolean menorQue(Persona p1){
        System.out.print("Ingrese la edad que desea comparar: ");
        int edadP = leer.nextInt();
        boolean menor;
        if(calcularEdad(p1)<edadP){
            menor=true;
            System.out.println("La persona es menor que la edad del parámetro.");
        }else{    
            menor=false;
            System.out.println("La persona es mayor o tiene la misma edad que la edad pasada por parámetro.");
        }
        return menor;
    }
    public void mostrarPersona(Persona p1){
        System.out.println("Nombre: " + p1.getNombre());
        System.out.println("Fecha de nacimiento: "+p1.getFechaN());
    }
    public void menuOpciones(Persona p1) {
        int opcion;
        String conf = "n";

        do {

            System.out.println("MENU:");
            System.out.println("1. Crear persona");
            System.out.println("2. Calcular edad");
            System.out.println("3. Calcular menor que(OtraEdad)");
            System.out.println("4. Mostrar persona");
            System.out.println("5. Salir");

            opcion = leer.nextInt();

            if (opcion == 5) {

                do {
                    System.out.println("Esta seguro que quiere salir? s/n");
                    conf = leer.next();
                } while (!conf.equalsIgnoreCase("n") && !conf.equalsIgnoreCase("s"));
                if (conf.equalsIgnoreCase("s")) {
                    break;
                }
            }
            
            if (opcion > 0 && opcion < 5) {
                switch (opcion) {
                    case 1:
                        crearPersona(p1);
                        break;
                    case 2:
                        System.out.println("La persona ingresada tiene "+ calcularEdad(p1) +" años.");
                        break;
                    case 3:
                        menorQue(p1);
                        break;
                    case 4:
                        mostrarPersona(p1);
                        break;
                }
            }
        } while (conf.equalsIgnoreCase("n"));

        System.out.println("El programa ha terminado");

    }   
}
