/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Fracciones;
import java.util.Scanner;

/**
 *
 * @author Agustina
 */
public class FraccionesServicio {
    Scanner leer = new Scanner(System.in);
    Fracciones f1 = new Fracciones();
    int MCD;
    int a;
    int b;
    int TotalNum;
    int denC;
    public void crearFracciones(Fracciones f1){
        System.out.println("Fraccion 1: ");
        f1.setN1(leer.nextInt());
        System.out.print("/");
        f1.setD1(leer.nextInt());
        System.out.print("Fraccion 2: ");
        f1.setN2(leer.nextInt());
        System.out.print("/");
        f1.setD2(leer.nextInt());
    }
    public int mcm(int den1, int den2){
        int a = Math.max(den1, den2);
        int b = Math.min(den1, den2);
 
        int resultado = (a / mcd(den1, den2)) * b;
         
        return resultado;
    }
    public int mcd(int den1,int den2){
        int a = Math.max(den1, den2);
        int b = Math.min(den1, den2);
 
        int resultado = 0;
        do {
            resultado = b;
            b = a % b;
            a = resultado;
 
        } while (b != 0);
 
        return resultado;
    }
    
    public void sumar (Fracciones f1){
        if(f1.getD1()==f1.getD2()){
            TotalNum = f1.getN1()+f1.getN2();
            denC=f1.getD1();
            System.out.println("La suma es: "+TotalNum+"/"+denC);
        }else{
            denC=mcm(f1.getD1(),f1.getD2());            
            TotalNum= f1.getN1()*(denC/f1.getD1())+f1.getN2()*(denC/f1.getD2()); 
            System.out.println("La suma es: "+TotalNum+"/"+denC);
        }
    }
    public void restar (Fracciones f1){
        if(f1.getD1()==f1.getD2()){
            TotalNum = f1.getN1()-f1.getN2();
            denC=f1.getD1();
            System.out.println("La resta es: "+TotalNum+"/"+denC);
            
        }else{
            denC=mcm(f1.getD1(),f1.getD2());            
            TotalNum= f1.getN1()*(denC/f1.getD1())-f1.getN2()*(denC/f1.getD2()); 
            System.out.println("La resta es: "+TotalNum+"/"+denC);
        }
    }
    public void multiplicar(Fracciones f1) {
        TotalNum = f1.getN1() * f1.getN2();
        denC = f1.getD1() * f1.getD2();
        TotalNum = TotalNum / mcd(TotalNum,denC);
        denC = denC / mcd(TotalNum,denC);
        System.out.println("La multiplicación es: "+TotalNum+"/"+denC);

    }
    public void dividir(Fracciones f1){
        TotalNum=f1.getN1()*f1.getD2();
        denC=f1.getN2()*f1.getD1();
        TotalNum = TotalNum / mcd(TotalNum,denC);
        denC = denC / mcd(TotalNum,denC);
        System.out.println("La división es: "+TotalNum+"/"+denC);
    }
    
    public void menu(){
        crearFracciones(f1);
        String opc;
        do{
            System.out.println("A-SUMAR"
                + "\n B)RESTAR"
                + "\n C) MULTIPLICAR"
                + "\n D) DIVIDIR"
                + "\n E) SALIR");
            opc=leer.next();
            switch(opc.toUpperCase()){
                case "A":
                    sumar(f1);
                    break;
                case "B":
                    restar(f1);
                    break;
                case "C":
                    multiplicar(f1);
                    break;
                case "D":
                    dividir(f1);
                    break;
                case "E":
                    System.out.println("Hasta la próxima");
            }
        }while(!opc.equalsIgnoreCase("E"));
    }
}
