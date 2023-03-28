package Entidad;

public class Meses {
    private String [] meses;

    public Meses(String meses []) {
        this.meses = meses;
    }

    public Meses(){
        meses = new String[12];
    }

    public String[] getMeses() {
        return meses;
    }

    public void setMeses(String[] meses) {
        this.meses = meses;
    }
    
}
