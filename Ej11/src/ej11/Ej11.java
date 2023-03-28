package ej11;

import java.util.Date;
import java.util.Scanner;

public class Ej11 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el día: ");
        int dia= leer.nextInt();
        System.out.print("Ingrese el mes: ");
        int mes = leer.nextInt();
        System.out.print("Ingrese el año: ");
        int anio= leer.nextInt();
        Date fecha = new Date(anio-1900, mes-1, dia);
        
        System.out.println("La fecha es: " +fecha);
        
        Date fechaActual = new Date();
        
        System.out.println("La fecha actual es: "+fechaActual);
        System.out.println(fechaActual.getYear()-fecha.getYear());
        
        
        // Calculamos la diferencia de años entre la fecha dada y la fecha actual
        long diferenciaEnMilisegundos = fechaActual.getTime() - fecha.getTime();

        long diferenciaEnAnos = diferenciaEnMilisegundos / (1000L * 60 * 60 * 24 * 365);

        // Mostramos la diferencia de años
        System.out.println("La diferencia de años entre " + fecha + " y la fecha actual es: " + diferenciaEnAnos);
    }
    
}
