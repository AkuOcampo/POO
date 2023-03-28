package Servicio;

import Entidad.Auto;
import java.time.LocalDate;
import java.util.Scanner;

public class AutoServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Auto a1 = new Auto();
    String opc;
    boolean s=false;
    public Auto crearFicha (){
        System.out.println("Bienvenido ingrese los datos: ");
        System.out.print("Nombre y apellido: ");
        a1.setNombre(leer.next());
        System.out.print("fecha vencimiento carnet: ");
        System.out.print("Día: ");
        int dia= leer.nextInt();
        System.out.print("Mes: ");
        int mes = leer.nextInt();
        System.out.print("Año: ");
        int anio= leer.nextInt();
        a1.setCarnet(LocalDate.of(anio, mes, dia));
        System.out.print("Color vehículo: ");
        a1.setColor(leer.next());
        System.out.print("Modelo: ");
        a1.setModelo(leer.nextInt());
        System.out.print("Km: ");
        a1.setKm(leer.nextInt());
        return a1;
    }
    public void titularidad(){
        System.out.print("Ingrese el nombre del nuevo titular:");
        a1.setNombre(leer.next());
    }
    public void trayectoRecorrido(){
        System.out.print("Ingrese el trayecto en km: ");
        a1.setKm(a1.getKm()+leer.nextInt());
    }
    public boolean service(){
        if(a1.getKm()>=10000){
            s=true;
        }
        return s;
    }
 

    public void menu() {

        do {
            System.out.println(a1);
            System.out.println("\nA) Cargar ficha"
                    + "\nB) Modifique titularidad"
                    + "\nC) Trayecto recorrido"
                    + "\nD) Service"
                    + "\nE) Salir");
            opc = leer.next();
            switch (opc.toUpperCase()) {
                case "A":
                    System.out.println(a1);
                    crearFicha();
                    if (service()) {
                        System.out.println("Es necesario hacer un service, ya que tiene " + a1.getKm() + " km");
                    }
                    break;
                case "B":
                    titularidad();
                    break;
                case "C":
                    trayectoRecorrido();
                    break;
                case "D":
                    if (service()) {
                        System.out.println("Es necesario hacer un service, ya que tiene " + a1.getKm() + " km");
                    } else {
                        System.out.println("No es necesario hacer un service, ya que tiene " + a1.getKm() + " km. Le quedan " + (10000 - a1.getKm()) + " km.");
                    }
                    break;
                case "E":
                    System.out.println("Hasta la próxima");
            }
        } while (!opc.equalsIgnoreCase("E"));

    }
}
