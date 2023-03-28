package ej13;

import Entidad.Curso;
import Servicio.CursoServicio;
import java.util.Scanner;

public class Ej13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CursoServicio cs = new CursoServicio();
        Curso c1 = new Curso();
        cs.mostrarCurso(c1);
    }
    
}
