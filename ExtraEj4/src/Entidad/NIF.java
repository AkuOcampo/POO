/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Agustina
 */
public class NIF {
    private long dni;
    private String letras;

    public NIF() {
    }

    public NIF(long dni, String letras) {
        this.dni = dni;
        this.letras = letras;
    }

    public long getDni() {
        return dni;
    }

    public String getLetras() {
        return letras;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setLetras(String letras) {
        this.letras = letras;
    }
    
}
