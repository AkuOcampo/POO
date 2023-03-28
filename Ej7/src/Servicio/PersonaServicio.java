package Servicio;

import Entidad.Persona;
import java.util.Scanner;

public class PersonaServicio {
    Scanner leer = new Scanner(System.in);
    String sex;
    public Persona crearPersona(){
        Persona ps = new Persona();
        System.out.print("Nombre:");
        ps.setNombre(leer.next());
        System.out.print("Edad:");
        ps.setEdad(leer.nextInt());
        System.out.print("Sexo (H/M/O):");
        sex=leer.next();
        while(!sex.equalsIgnoreCase("H")&&!sex.equalsIgnoreCase("M")&&!sex.equalsIgnoreCase("O")){
            System.out.println("Error, opción inválida. Vuelva a ingresar el sexo: ");
            sex=leer.next();
        }
        ps.setSexo(sex);
        System.out.print("Peso(kg): ");
        ps.setPeso(leer.nextDouble());
        System.out.print("Altura(m): ");
        ps.setAltura(leer.nextDouble());
        return ps;
    }
    public void calcularIMC(Persona ps){
        double pesoIdeal= ps.getPeso()/Math.pow(ps.getAltura(), 2);
        if(pesoIdeal<20){
            ps.setIMC(-1);
            System.out.print(" está por debajo de su peso ideal");
        }else if(pesoIdeal>=20 && pesoIdeal<=25){
            ps.setIMC(0);
            System.out.print(" está en su peso ideal.");
        }else{
            ps.setIMC(1);
            System.out.print(" está por sobre su peso ideal");
        }
    }
    public void esMayorDeEdad(Persona ps){
        boolean mayor;
        if(ps.getEdad() >= 18){
            System.out.println(" y es mayor de edad.");
        }else{
            System.out.println(" y es menor de edad.");
        }
    }
}    
