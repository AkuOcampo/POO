package ej7;

import Entidad.Persona;
import Servicio.PersonaServicio;

public class Ej7 {

    public static void main(String[] args) {
        PersonaServicio ps = new PersonaServicio();
        System.out.println("PERSONA 1");
        Persona p1 = ps.crearPersona();
        System.out.println("PERSONA 2");
        Persona p2 = ps.crearPersona();
        System.out.println("PERSONA 3");        
        Persona p3 = ps.crearPersona();
        System.out.println("PERSONA 4");        
        Persona p4 = ps.crearPersona();
        
        System.out.print(p1.getNombre());
        ps.calcularIMC(p1);ps.esMayorDeEdad(p1);        
        System.out.print(p2.getNombre());
        ps.calcularIMC(p2);ps.esMayorDeEdad(p2);
        System.out.print(p3.getNombre());
        ps.calcularIMC(p3);ps.esMayorDeEdad(p3);
        System.out.print(p4.getNombre());
        ps.calcularIMC(p4);ps.esMayorDeEdad(p4);
        

        int [] peso = {p1.getIMC(),p2.getIMC(),p3.getIMC(),p4.getIMC()};
        int bajoPeso=0;
        int sobrePeso=0;
        int pesoN=0;
        for (int i = 0; i < 4; i++) {
            switch (peso[i]){
                case -1:
                    bajoPeso++;
                    break;
                case 0:
                    pesoN++;
                    break;
                case 1:
                    sobrePeso++;
                    break;    
            }
        }
        System.out.println( bajoPeso*100/4 + "% de personas con bajo peso, " + pesoN*100/4 + "% de personas con peso normal y " + sobrePeso*100/4 + "% de personas con sobrepeso");
        
        int menorEdad=0;
        int mayorEdad=0;
        int [] edad = {p1.getEdad(),p2.getEdad(),p3.getEdad(),p4.getEdad()};
        for (int i = 0; i < 4; i++) {
            if (edad[i]<18){
                menorEdad++;
            }else{
                mayorEdad++;
            }
        }
        System.out.println(menorEdad*100/4+"% son menores de edad y "+mayorEdad*100/4+"% son mayores de edad");
    }
    
}
