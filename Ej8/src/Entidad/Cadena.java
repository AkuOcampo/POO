package Entidad;

public class Cadena {
    public String frase;
    public int longFrase;

    public Cadena() {
    }

    public Cadena(String frase, int longFrase) {
        this.frase = frase;
        this.longFrase = longFrase;
    }

    public String getFrase() {
        return frase;
    }

    public int getLongFrase() {
        return longFrase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public void setLongFrase(int longFrase) {
        this.longFrase = longFrase;
    }
    //si lo hago en la entidad le paso el caracter por parámetro desde el main.
    public int vecesRepetido(String caract){
        int contChar =0;
        for (int i = 0; i <getLongFrase(); i++) {
            String caracterFrase = frase.substring(i,i+1);
            if (caracterFrase.equalsIgnoreCase(caract)) {
                contChar++;  
            }
        }
        return contChar;
    }
    //lo hice en la entidad porque entendí que debía devolver el valor al main.
    public boolean contiene(char caractB){
        boolean rdo = frase.contains(String.valueOf(caractB));
        return rdo;
    }
}
