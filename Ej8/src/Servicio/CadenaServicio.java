package Servicio;

import Entidad.Cadena;
import java.util.Scanner;

public class CadenaServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public void mostrarVocales(Cadena frase1){
       int cantVocal = 0;
        for (int i = 0; i <frase1.getLongFrase(); i++) {
            char vocal = frase1.getFrase().charAt(i);
            switch (vocal){
                case 'a': case 'e': case 'i': case 'o': case 'u': 
                case 'A': case 'E': case 'I': case 'O': case 'U':
                    cantVocal++;
                    break;
            }
        }
        System.out.println("En la frase hay "+cantVocal+" vocales.");
    }
    public void invertirFrase(Cadena frase1){
        String fraseInvertida="";
        for (int i = frase1.getLongFrase()-1; i>=0; i--) {
            fraseInvertida+=frase1.getFrase().charAt(i);
        }
        System.out.println("Frase invertida: "+fraseInvertida);
    }
    //Si lo hago como método en el servicio, le paso el objeto como parámetro y pido todo acá.
    public void vecesRepetido(Cadena frase1){
        int contChar =0;
        System.out.println("Ingrese el caracter que desea analizar: ");
        char caract = leer.next().charAt(0);
        for (int i = 0; i <frase1.getLongFrase(); i++) {
            char caracterFrase = frase1.getFrase().charAt(i);
            if (String.valueOf(caracterFrase).equalsIgnoreCase(String.valueOf(caract))) {
                contChar++;  
            }
        }
        System.out.println("El caracter "+caract+ " se encuentra: "+frase1.vecesRepetido(String.valueOf(caract))+ " veces.");
    }
    public void compararLongitud(Cadena frase1){
        System.out.print("Ingrese una nueva frase para comparar la longitud: ");
        String fraseComparar = leer.next();
        System.out.print("La frase nueva tiene " + fraseComparar.length()+ " caracteres,");
        if (fraseComparar.length()<frase1.getLongFrase()){
            System.out.println(" por lo tanto la frase ingresada tiene una longitud menor.");
        }else if(fraseComparar.length()==frase1.getLongFrase()){
            System.out.println(" por lo tanto las frase son iguales.");
        }else{
            System.out.println(" por lo tanto la frase ingresada tiene una longitud mayor");
        }   
    }
    public void unirFrases(Cadena frase1){
        System.out.println("Ingrese una nueva frase para concatenarle a la frase original: ");
        String fraseUnir = leer.next();
        System.out.println("La frase nueva es: "+frase1.getFrase().concat(fraseUnir));
    }
    
    public void reemplazar (Cadena frase1){
        System.out.println("Ingrese el caracter que utilizara para reemplazar a 'A': ");
        char caract = leer.next().charAt(0);
        System.out.println("La frase nueva es: "+frase1.getFrase().replace('a',caract));
    }
    
}
