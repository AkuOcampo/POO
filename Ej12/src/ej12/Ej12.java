package ej12;

import Entidad.Persona;
import Servicio.PersonaServicio;


public class Ej12 {

   
    public static void main(String[] args) {
        PersonaServicio ps = new PersonaServicio();
        Persona pM = new Persona();
        ps.menuOpciones(pM);    
    }
    
}
