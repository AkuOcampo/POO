/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.NIF;
import java.util.Scanner;

/**
 *
 * @author Agustina
 */
public class NIFServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    int num;
    String [] L = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
    public NIF crearNIF (NIF n1){
        System.out.print("Ingrese su DNI: ");
        n1.setDni(leer.nextLong());
        num = (int)n1.getDni()%23;
        for (int i = 0; i < L.length; i++) {
            if(num==i){
                n1.setLetras(L[i]);
            }
        }
        return n1;
    }
    public void mostrarNIF(NIF n1){
        System.out.println(n1.getDni() +"-" +n1.getLetras());
    }
}
