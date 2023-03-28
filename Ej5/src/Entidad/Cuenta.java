package Entidad;

public class Cuenta {
    private int numeroCuenta;
    private int dni;
    private double saldoAct;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, int dni, double saldoAct) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoAct = saldoAct;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public int getDni() {
        return dni;
    }

    public double getSaldoAct() {
        return saldoAct;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setSaldoAct(double saldoAct) {
        this.saldoAct = saldoAct;
    }
    
    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", dni=" + dni + ", saldoAct=" + saldoAct + '}';
    }
    
    
}
