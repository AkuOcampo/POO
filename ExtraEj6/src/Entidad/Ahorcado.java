package Entidad;

import Servicio.AhorcadoServicio;

public class Ahorcado {
    AhorcadoServicio as = new AhorcadoServicio();
    
    private String [] palabra;
    private int cantidadLetrasE;
    private int oportunidades;

    public Ahorcado() {
    }
    /*public Ahorcado(String[] palabra){
        this.palabra = new String [];
    }*/
    public Ahorcado( int cantidadLetrasE, int oportunidades) {
        this.cantidadLetrasE = cantidadLetrasE;
        this.oportunidades = oportunidades;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public int getCantidadLetrasE() {
        return cantidadLetrasE;
    }

    public int getOportunidades() {
        return oportunidades;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public void setCantidadLetrasE(int cantidadLetrasE) {
        this.cantidadLetrasE = cantidadLetrasE;
    }

    public void setOportunidades(int oportunidades) {
        this.oportunidades = oportunidades;
    }
    
    
}
