package Servicio;

import Entidad.Movil;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Agustina
 */
public class MovilServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public void cargarCelular (Movil m1){
        System.out.print("Marca: ");
        m1.setMarca(leer.next());
        System.out.print("Modelo: ");
        m1.setModelo(leer.next());
        System.out.print("Precio: ");
        m1.setPrecio(leer.nextFloat());
        System.out.print("Memoria ram: ");
        m1.setMemoriaRam(leer.nextInt());
        System.out.print("Almacenaiento: ");
        m1.setAlmacenamiento(leer.nextInt());
        System.out.print("Código (7 digitos): ");
        ingresarCodigo(m1); 
    }
    public void ingresarCodigo(Movil m1){
        for (int i = 0; i <7; i++) {
            m1.getCodigo()[i]= leer.nextInt();
        }
    }
   
    public void mostrarModelo(Movil m1[]) {
        int op;
        int cont = 0;
        System.out.println("Ingrese un móvil para comenzar");
        cargarCelular(m1[cont]);
        do {
            System.out.println("1- Ingresar un nuevo móvil");
            System.out.println("2- Código para ver los modelos");
            System.out.println("3- Salir");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    cont++;
                    cargarCelular(m1[cont]);
                    break;
                case 2:
                    for (int i = 0; i < 10; i++) {
                        System.out.println(Arrays.toString(m1[i].getCodigo()));
                    }
                    System.out.println("Ingrese el modelo que desee ver:");
                    int opt = leer.nextInt();
                    System.out.println(m1[opt - 1]);
                    break;
                case 3:
                    System.out.println("Ha finalizado el programa, hasta la próxima");
            }
        } while (op != 3 || cont == 9);

    }
    
}
