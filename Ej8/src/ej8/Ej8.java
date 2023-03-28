package ej8;

import Entidad.Cadena;
import Servicio.CadenaServicio;
import java.util.Scanner;

public class Ej8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CadenaServicio fraseS = new CadenaServicio();
        Cadena frase1 = new Cadena();
        System.out.print("Ingrese una frase: ");
        frase1.setFrase(leer.nextLine());
        frase1.setLongFrase(frase1.getFrase().length());
        //A) MÉTODO EN EL SERVICIO
        fraseS.mostrarVocales(frase1);
        //B) MÉTODO EN EL SERVICIO
        System.out.println("----------------------------");
        fraseS.invertirFrase(frase1);
        //C) MÉTODO EN LA ENTIDAD
        System.out.println("----------------------------");
        System.out.println("Ingrese el caracter que desea encontrar en la frase: ");
        String caract = leer.next();
        System.out.println("El caracter "+caract+ " se encuentra: "+frase1.vecesRepetido(caract)+ " veces.");
        //D) MÉTODO EN EL SERVICIO
        System.out.println("----------------------------");
        fraseS.vecesRepetido(frase1);
        //E) MÉTODO EN EL SERVICIO
        System.out.println("----------------------------");
        fraseS.compararLongitud(frase1);
        //F) MÉTODO EN EL SERVICIO
        System.out.println("----------------------------");
        fraseS.unirFrases(frase1);
        //G) MÉTODO EN EL SERVICIO
        System.out.println("----------------------------");
        fraseS.reemplazar(frase1);
        //H) MÉTODO EN LA ENTIDAD
        System.out.println("----------------------------");
        System.out.println("Ingrese el caracter que desea encontrar en la frase: ");
        char caractB = leer.next().charAt(0);
        System.out.println("La afirmación que la frase contiene el caracter "+ caractB+ " es " +frase1.contiene(caractB));
    }
}
