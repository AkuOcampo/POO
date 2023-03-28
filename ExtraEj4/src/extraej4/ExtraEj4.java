/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extraej4;

import Entidad.NIF;
import Servicio.NIFServicio;

/**
 *
 * @author Agustina
 */
public class ExtraEj4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NIFServicio ns = new NIFServicio();
        NIF n1 = new NIF();
        ns.crearNIF(n1);
        ns.mostrarNIF(n1);
    }
    
}
