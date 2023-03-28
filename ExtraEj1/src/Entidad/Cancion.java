package Entidad;

/**
 *
 * @author Agustina
 */
public class Cancion {
    public String titulo;
    public String autor;

    public Cancion() {
    }

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Cancion{" + "titulo=" + titulo + ", autor=" + autor + '}';
    }
    
}
