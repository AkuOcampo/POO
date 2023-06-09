package Entidad;

public class Pass {
    private String pass;
    private String nombre;
    private int dni;

    public Pass() {
    }
    
    public Pass(String pass, String nombre, int dni) {
        this.pass = pass;
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getPass() {
        return pass;
    }

    public String getNombre() {
        return nombre;
    }

    public long getDni() {
        return dni;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Pass{" + "pass=" + pass + ", nombre=" + nombre + ", dni=" + dni + '}';
    }
    
    
    
}
