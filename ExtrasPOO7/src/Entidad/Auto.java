package Entidad;

import java.time.LocalDate;
import java.util.Date;
import java.util.logging.Logger;

public class Auto {
    private String nombre;
    private LocalDate carnet;
    private String color;
    private int modelo;
    private int km = 7500;

    public Auto() {
    }

    public Auto(String nombre, LocalDate carnet, String color, int modelo,int km) {
        this.nombre = nombre;
        this.carnet = carnet;
        this.color = color;
        this.modelo = modelo;
        this.km= km;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getCarnet() {
        return carnet;
    }

    public String getColor() {
        return color;
    }

    public int getModelo() {
        return modelo;
    }

    public int getKm() {
        return km;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCarnet(LocalDate carnet) {
        this.carnet = carnet;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public void setKm(int km) {
        this.km = km;
    }

    @Override
    public String toString() {
        return "Auto{" + "nombre=" + nombre + ", carnet=" + carnet + ", color=" + color + ", modelo=" + modelo + ", km=" + km + '}';
    }
    

    
}
