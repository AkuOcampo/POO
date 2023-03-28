package Servicio;

import Entidad.Meses;
import java.util.Scanner;

public class MesesServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
   
    public void adivinanza(Meses a1){
        String mesSecreto = a1.getMeses()[4];
        System.out.print("Adivine el mes secreto. Introduzca el nombre del mes en minúscula: ");
        String opcion= leer.next();
        while(!opcion.equalsIgnoreCase(mesSecreto)){ 
            System.out.print("No ha acertado. Intente adivinarlo introduciendo otro mes: ");
            opcion= leer.next();
        }
        System.out.println("Ha acertado, el mes secreto es: "+opcion);
        
    }
}
