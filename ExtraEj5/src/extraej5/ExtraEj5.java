package extraej5;

import Entidad.Meses;
import Servicio.MesesServicio;
import java.util.Arrays;

public class ExtraEj5 {

    public static void main(String[] args) {
        MesesServicio ms = new MesesServicio();
        String [] ar = new String []{"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
        Meses a1 = new Meses(ar);
        ms.adivinanza(a1);
    }
    
}
