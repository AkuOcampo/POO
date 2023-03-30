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
public class Fracciones {
    private int n1;
    private int d1;
    private int n2;
    private int d2;

    public Fracciones() {
    }

    public Fracciones(int n1, int d1, int n2, int d2) {
        this.n1 = n1;
        this.d1 = d1;
        this.n2 = n2;
        this.d2 = d2;
    }

    public int getN1() {
        return n1;
    }

    public int getD1() {
        return d1;
    }

    public int getN2() {
        return n2;
    }

    public int getD2() {
        return d2;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public void setD1(int d1) {
        this.d1 = d1;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public void setD2(int d2) {
        this.d2 = d2;
    }
    
    
}
