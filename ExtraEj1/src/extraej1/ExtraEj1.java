package extraej1;

import Entidad.Cancion;
import java.util.Scanner;

public class ExtraEj1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cancion c1 = new Cancion();
        System.out.print("Ingrese el título de la canción: ");
        c1.setTitulo(leer.next());
        System.out.print("Ahora, ingrese el autor: ");
        c1.setAutor(leer.next());
        System.out.println(c1);
    }
    
}
