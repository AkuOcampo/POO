package Entidad;

public class Tiempo {
    private int hora;
    private int min;
    private int seg;

    public Tiempo() {
    }

    public Tiempo(int hora, int min, int seg) {
        this.hora = hora;
        this.min = min;
        this.seg = seg;
    }

    public int getHora() {
        return hora;
    }

    public int getMin() {
        return min;
    }

    public int getSeg() {
        return seg;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setSeg(int seg) {
        this.seg = seg;
    }
    
    
}
