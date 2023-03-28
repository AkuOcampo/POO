/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author Agustina
 */
public class CircunferenciaServicio {
    public Circunferencia crearCircunferencia(){
        Circunferencia c1 = new Circunferencia();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio: ");
        c1.setRadio(leer.nextDouble());
        return c1;
    }
    public void Area(Circunferencia c1){
        double area= Math.PI*Math.pow(c1.getRadio(),2);
        System.out.println("El area es: " + area);
    }
    public void Perimetro(Circunferencia c1){
        double perimetro =2*Math.PI*c1.getRadio();
        System.out.println("El perímetro es: " + perimetro);
    }
}
