package ej5;

import Entidad.Cuenta;
import Servicio.CuentaServicio;
import java.util.Scanner;

public class Ej5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CuentaServicio cliente1 = new CuentaServicio();
        Cuenta c1 = cliente1.crearCuenta();
        int opc;
        do{
            System.out.println("\n Bienvenido, seleccione la opción que desea ejecutar: "
                                + "\n 1-Ingresar dinero"
                                + "\n 2-Retirar dinero"
                                +"\n 3-Extracción rápida de dinero"
                                +"\n 4-Consultar saldo"
                                +"\n 5-Consultar datos"
                                +"\n 6-Salir");
            opc = leer.nextInt();
            switch (opc){
                case 1:
                    cliente1.deposito(c1);
                    break;
                case 2:
                    cliente1.retiro(c1);
                    break;
                case 3:
                    cliente1.retiroR(c1);
                    break;
                case 4:
                    cliente1.mostrarSaldo(c1);
                    break;
                case 5:
                    System.out.println(c1);
                    break;
                case 6:
                    System.out.println("Hasta la próxima");
                    break;
                default:
                    System.out.println("ERROR, ingrese un valor válido");
            }
        }while(opc!=6);    
    }

}
