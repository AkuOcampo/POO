/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Agustina
 */
public class RectanguloServicio {
    public Rectangulo crearRectangulo(){
        Scanner leer = new Scanner(System.in);
        Rectangulo rec = new Rectangulo();
        System.out.println("Ingrese la base y la altura del rectangulo: ");
        rec.setBase(leer.nextInt());
        rec.setAlt(leer.nextInt());
        return rec;
    }
    public void calcularSup(Rectangulo rec){
        int sup= rec.getAlt()*rec.getBase();
        System.out.println("La superficie es igual: " +sup);
    }
    public void calcularPer(Rectangulo rec){
        int per= 2*(rec.getAlt()+rec.getBase());
        System.out.println("La superficie es igual: " +per);
    }
    public void mostrarRec(Rectangulo rec){
        for(int i=0; i<rec.getAlt();i++){
            System.out.println("");
            for(int j=0; j<rec.getBase();j++){
                if(i==0 || i==rec.getAlt()-1){
                    System.out.print("* ");
                }
                else if(j==0 || j==rec.getBase()-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                    } 
            }
        }
    }
    
}
