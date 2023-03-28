/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Date;

/**
 *
 * @author Agustina
 */
public class Persona {
    public String nombre;
    public Date fechaN;

    public Persona() {
    }

    public Persona(String nombre, Date fechaN) {
        this.nombre = nombre;
        this.fechaN = fechaN;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFechaN() {
        return fechaN;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaN(Date fechaN) {
        this.fechaN = fechaN;
    }
    
}
