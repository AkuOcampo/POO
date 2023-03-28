package Servicio;

import Entidad.Operacion;
import java.util.Scanner;

public class OperacionServicio {
    public Operacion crearOperaciones(){
        Scanner leer = new Scanner(System.in);
        Operacion operacion1= new Operacion();
        System.out.println("Ingrese el primer número:");
        operacion1.setNum1(leer.nextInt());
        System.out.println("Ingrese el segundo número:");
        operacion1.setNum2(leer.nextInt());      
        return operacion1;
    }
    public void sumar (Operacion operacion1){
        int suma= operacion1.getNum1()+operacion1.getNum2();
        System.out.println("La suma de los dos números es: " +suma);
    }
    public void restar (Operacion operacion1){
        int resta= operacion1.getNum1()-operacion1.getNum2();
        System.out.println("La resta de los dos números es: " +resta);
    }
    public void multiplicar(Operacion operacion1){
        int mult=operacion1.getNum1()* operacion1.getNum2(); 
        if (operacion1.getNum1()==0 || operacion1.getNum2()==0){
            System.out.println("Error.");
        }
        System.out.println("La multiplicación de los números es igual a: "+mult);
    }
        public void dividir(Operacion operacion1){
        if (operacion1.getNum2()==0){
            System.out.println("Error. Se dividio por 0");
        }else {
            int div=operacion1.getNum1()/operacion1.getNum2();
            System.out.println("La división de los números es igual a: "+div);
        }
        
    }
}
