/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej10;

import java.util.Arrays;

/**
 *
 * @author Agustina
 */
public class Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        float[] arregloA = new float[50];

        float[] arregloB = new float[20];

        for (int i = 0; i < 50; i++) {
            arregloA[i] = (float) (Math.random() * 10);
        }

        System.out.println("Arreglo A de 50 elementos");
        for (int i = 0; i < 50; i++) {
            System.out.print("[" + arregloA[i] + "]");

        }
        System.out.println("");

        System.out.println("----------------------");

        /*Arrays.sort(arregloA);
        
        System.out.println("Arreglo A ordenado de manera ascendente");
        System.out.println(Arrays.toString(arregloA));
        
        System.out.println("----------------------");*/
        Arrays.sort(arregloA, 0, 10);

        System.out.println("Arreglo A ordenado de manera ascendente solo los primeros 10 numeros");
        System.out.println(Arrays.toString(arregloA));

        System.out.println("----------------------");

        //Con el for le asigno los valores de A al arregloB, el program me recomendo aplicar el siguiente metodo
        /*for (int i = 0; i < 10; i++) {
        arregloB[i] = arregloA[i];
        }*/
        System.arraycopy(arregloA, 0, arregloB, 0, 10);

        System.out.println("Arreglo B con los primeros 10 nÃºmeros ordenados al arreglo A");
        System.out.println(Arrays.toString(arregloB));

        System.out.println("----------------------");

        /*Arrays.fill(arregloB, 0, 10, 666);
        
        System.out.println("Arreglo B con los primeros 10 numeros con el valor 666");
        System.out.println(Arrays.toString(arregloB));
        
        System.out.println("----------------------");*/
        //float valorFinal = (float) 0.5;
        Arrays.fill(arregloB, 10, 20, (float) 0.5);

        System.out.println("Arreglo B con los ultimos 10 numeros con el valor 0.5");
        System.out.println(Arrays.toString(arregloB));
        

    }
    
}
