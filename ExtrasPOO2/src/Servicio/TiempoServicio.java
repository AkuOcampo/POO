/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Tiempo;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Agustina
 */
public class TiempoServicio {
    Scanner leer = new Scanner (System.in);
    Date horaCompleta;
    SimpleDateFormat formatoHora;
    String horaActual;
    public void crearHora (Tiempo t1){
        System.out.println("Ingrese la hora: ");
        do {
          t1.setHora(leer.nextInt());
        } while (t1.getHora()>=0 && t1.getHora()<24);
        System.out.println("Ingrese los minutos: ");
        do {
          t1.setMin(leer.nextInt());
        } while (t1.getMin()>=0 && t1.getMin()<=60);
        System.out.println("Ingrese los segundos: ");
        do {
          t1.setSeg(leer.nextInt());
        } while (t1.getSeg()>=0 && t1.getSeg()<=60);
    }
    public void mostrar(Tiempo t1){
        horaCompleta = new Date();

        horaCompleta.setHours(t1.getHora());
        horaCompleta.setMinutes(t1.getMin());
        horaCompleta.setSeconds(t1.getSeg());

        formatoHora = new SimpleDateFormat("HH:mm:ss");

        horaActual = formatoHora.format(horaCompleta);

        System.out.println("La hora completa es: " + horaActual);
    }

    /*public void simularPasoTiempo(Tiempo t1){

        int dias, horas, minutos, segundos;

        dias = 0;
        horas = t1.getHora();
        minutos = t1.getMin();
        segundos = t1.getSeg();

        do {

            Thread.sleep(1000);
            segundos = segundos + 1;

            if (segundos > 59) {
                segundos = 00;
                minutos = minutos + 1;
            }
            if (minutos > 59) {
                minutos = 00;
                horas = horas + 1;
            }
            if (horas > 23) {
                horas = 00;
                dias = dias + 1;
            }

            System.out.println("Hora actual: " + dias + ":" + horas + ":" + minutos + ":" + segundos);

            if (segundos == 6) {
                break;
            }

        } while (true);
    }*/
    public void mostrarConsola (Tiempo t1){
        crearHora(t1);
        mostrar(t1);
    }
}
