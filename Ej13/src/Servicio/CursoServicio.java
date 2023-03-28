package Servicio;

import Entidad.Curso;
import java.util.Scanner;

public class CursoServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public void crearCurso(Curso c1){
        System.out.print("Nombre del curso: ");
        c1.setNombreCurso(leer.next());
        System.out.print("Valor hora: ");
        c1.setPrecioPorHora(leer.nextFloat());
        System.out.print("Cantidad de horas: ");
        c1.setCantidadHorasPorDia(leer.nextFloat());
        System.out.print("Cantidad de dias a la semana: ");
        c1.setCantidadDiasPorSemana(leer.nextInt());
        System.out.print("Turno: ");
        c1.setTurno(leer.next());
        System.out.print("Ingrese la cantidad de alumnos: ");
        int longitud= leer.nextInt();        
        while(longitud>5){
            System.out.print("Recuerde que el curso tiene un máximo de 5 alumnos. Vuelva a ingresar la cantidad: ");
            longitud= leer.nextInt();
        }
        c1.setAlumnos(new String [longitud]);
        for (int i = 0; i<longitud; i++) {
            System.out.println("Ingrese el nombre del alumno " +(i+1));
            c1.getAlumnos()[i]=leer.next();
        }
    }
    
    public void calcularGananciaSemanal(Curso c1){
        float ganancia = c1.getCantidadHorasPorDia()*c1.getPrecioPorHora()*c1.getCantidadDiasPorSemana()*c1.getAlumnos().length;
        System.out.println("La ganancia total de la semana del curso de " +c1.getNombreCurso()+" es de: "+ganancia);
    }
      public void mostrarCurso(Curso c1){
        String op;
        System.out.println("Ingrese un curso para comenzar: ");
        do{
            crearCurso(c1);
            calcularGananciaSemanal(c1);
            System.out.println(c1);
            System.out.println("Desea ingresar otro curso (S/N)?");
            op = leer.next();
        }while(op.equalsIgnoreCase("s"));
        System.out.println("Ha finalizado la tarea");
    }
  
}
