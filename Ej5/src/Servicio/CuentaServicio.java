/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;
import Entidad.Cuenta;
import java.util.Scanner;

/**
 *
 * @author Agustina
 */
public class CuentaServicio {
    Scanner leer = new Scanner(System.in);
    public Cuenta crearCuenta(){
        Cuenta c1= new Cuenta();
        System.out.println("Ingrese el número de cuenta: ");
        c1.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese el número de dni: ");
        c1.setDni(leer.nextInt());
        System.out.println("Ingrese su saldo actual: ");
        c1.setSaldoAct(leer.nextDouble());
        return c1;  
    }
    public void deposito (Cuenta c1){
        System.out.println("Ingrese el monto a depositar: $");
        double saldo = leer.nextDouble();
        c1.setSaldoAct(c1.getSaldoAct()+saldo);
        
    }
    public void retiro (Cuenta c1){
        System.out.println("Ingrese el monto a retirar: $");
        double retiro = leer.nextDouble();
        if(retiro>c1.getSaldoAct()){
            System.out.println("Su saldo actual es menor.");
        }else{
            c1.setSaldoAct(c1.getSaldoAct()-retiro);
        }   
    }
    public void retiroR(Cuenta c1){
        System.out.println("Ingrese el monto a retirar: $");
        double retiroR = leer.nextDouble();
        if(retiroR>(c1.getSaldoAct())*0.2){
            System.out.println("Su retiro no puede superar" +(c1.getSaldoAct())*0.2);
        }else{
            c1.setSaldoAct(c1.getSaldoAct()-retiroR);
        }   
    }
    public void mostrarSaldo (Cuenta c1){
        System.out.println("Su saldo actual es: $" + c1.getSaldoAct());
    }
    
}
