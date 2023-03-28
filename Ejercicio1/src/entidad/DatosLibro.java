/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author Agustina
 */
public class DatosLibro {
   public int ISNB;
   public String titulo;
   public String autor;
   public int numPag;
   
   public DatosLibro(){
       
   }
   public DatosLibro(int ISNB, String titulo, String autor, int numPag) {
       this.ISNB = ISNB;
       this.titulo = titulo;
       this.autor = autor;
       this.numPag = numPag;
   }

    @Override
    public String toString() {
        return "DatosLibro{" + "ISNB=" + ISNB + ", titulo=" + titulo + ", autor=" + autor + ", numPag=" + numPag + '}';
    }
   
   
}

