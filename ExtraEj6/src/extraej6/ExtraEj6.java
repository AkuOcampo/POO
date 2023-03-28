package extraej6;

import Entidad.Ahorcado;
import Servicio.AhorcadoServicio;
import java.util.Scanner;

public class ExtraEj6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        AhorcadoServicio as = new AhorcadoServicio();
        Ahorcado j1 = new Ahorcado ();
        as.juego(j1);
        
    }
    
}
