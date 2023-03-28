package ej3;


import Entidad.Operacion;
import Servicio.OperacionServicio;

public class Ej3 {
    
    public static void main(String[] args) {
        OperacionServicio op1= new OperacionServicio();
        Operacion operacion1 = op1.crearOperaciones();
        
        op1.sumar(operacion1);
        op1.restar(operacion1);
        op1.multiplicar(operacion1);
        op1.dividir(operacion1);
        
        
        
    }
    
}
