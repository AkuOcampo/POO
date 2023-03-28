package Servicio;

import Entidad.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

public class AhorcadoServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    int longitud;
    String letra;
    String frase;
    String [] fraseEscondida;
    public void crearJuego(Ahorcado j1){
        System.out.print("Bienvenido al juego, ingrese la palabra para comenzar: ");
        frase = leer.next();
                longitud = frase.length();
        j1.setPalabra(new String [longitud]);
        System.out.print("Ahora ingrese la cantidad de errores permitidos: ");
        j1.setOportunidades(leer.nextInt());
        for(int i = 0; i <longitud; i++) {
            j1.getPalabra()[i]=frase.substring(i, i+1);
        }
        j1.setCantidadLetrasE(0);
        //INICIALIZO EL VECTOR PARA ALMACENAR LAS LETRAS QUE SE VAN ENCONTRANDO Y LO LLENO
        fraseEscondida= new String [longitud];
        Arrays.fill(fraseEscondida,(String) "_");
    }
    /*public void crearJuego(Ahorcado j1){
        Ahorcado j1 = new Ahorcado {;
        
    }*/

    public void longitud(Ahorcado j1){
         /*for (String palabra : j1.getPalabra()) {
            System.out.print("_ ");
         }*/
        System.out.println("Longitud de la palabra: "+j1.getPalabra().length);
    }
    
    public void buscar(Ahorcado j1, String letra){        
        if(encontradas(j1,letra)){
            System.out.println("La letra pertenece a la palabra");
        }else{
            System.out.println("La letra no pertenece a la palabra");
            j1.setOportunidades(j1.getOportunidades()-1);   
        }
        System.out.println("Número de letras (encontradas/total): ("+j1.getCantidadLetrasE()+"/"+j1.getPalabra().length+")" );
    }
    public boolean encontradas(Ahorcado j1, String letra){
        boolean pertenece= false;
        for (int i = 0; i <j1.getPalabra().length; i++) {
            if(j1.getPalabra()[i].equalsIgnoreCase(letra)){
                pertenece = true;
                j1.setCantidadLetrasE(j1.getCantidadLetrasE()+1);
            }
        }
        return pertenece;
    }
    public void intentos(Ahorcado j1){
        System.out.println("Número de oportunidades restantes: "+j1.getOportunidades());
    }
    public void dibujo(Ahorcado j1, String letra) {
        for (int i = 0; i < longitud; i++) {
            if (letra.equals(j1.getPalabra()[i]) && !Arrays.equals(fraseEscondida, j1.getPalabra())) {
                fraseEscondida[i] = j1.getPalabra()[i];
            } else if (fraseEscondida.equals("_")) {
                fraseEscondida[i] = "_";
            }
        }
        for (int i = 0; i <longitud; i++) {
            System.out.print(fraseEscondida[i]+" ");
        }
        System.out.println("");
        //System.out.println(Arrays.toString(fraseEscondida));
    }
    public boolean verificar(Ahorcado j1, String letra){
        boolean repetida=false;
        for (int i = 0; i <longitud; i++) {
            if (letra.equals(fraseEscondida[i])){
                System.out.print("La letra ya fue usada.");
                repetida=true;     
            }
        }

        return repetida;
    }
    public void juego(Ahorcado j1){
        crearJuego(j1);
        longitud(j1);
        do{
            do{
            System.out.print("Ingrese una letra: ");
            letra = leer.next();
            }while(verificar(j1,letra));
            buscar(j1, letra);  
            dibujo(j1,letra);
            intentos(j1);
            System.out.println("------------------------------------");
        }while(j1.getOportunidades()!=0 && j1.getCantidadLetrasE()!=j1.getPalabra().length);
        if(j1.getCantidadLetrasE()==j1.getPalabra().length){
            System.out.println("------------------------------------");
            System.out.println("GANASTE! Hallazte la palabra.");
            System.out.println("------------------------------------");
        }else{
            System.out.println("------------------------------------");
            System.out.println("AHORCADO! Se agotarón los intentos.");
            System.out.println("------------------------------------");
        }
    }
}
