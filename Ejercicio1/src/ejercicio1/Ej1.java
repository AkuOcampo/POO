
package ejercicio1;

import ServicioLibro.crearLibro;
import entidad.DatosLibro;

/**
 *
 * @author Agustina
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
 //     DatosLibro libro1= new DatosLibro();
        crearLibro book1 = new crearLibro();
        DatosLibro libro1 = book1.crearLibro();
        System.out.println(libro1);
    }
    
}
