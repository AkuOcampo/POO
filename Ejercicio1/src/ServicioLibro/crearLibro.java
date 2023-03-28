/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioLibro;

import entidad.DatosLibro;
import java.util.Scanner;

/**
 *
 * @author Agustina
 */
public class crearLibro {
    public Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public DatosLibro crearLibro(){
        System.out.println("Ingrese el ISBN del libro:");
        int ISBN = leer.nextInt();
        System.out.println("Ingrese el título:");
        String titulo = leer.next();
        System.out.println("Ingrese el autor del libro: ");
        String autor = leer.next();
        System.out.println("Ingrese el número de páginas: ");
        int numPag= leer.nextInt();
        
        return new DatosLibro(ISBN, titulo, autor, numPag);
    }
    
}
