
package guia9_extra2;

import Entidades.Ahorcado;
import Servicio.AhorcadoService;

/**
 *
 * @author BANGHO
 */
public class Guia9_Extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AhorcadoService as = new AhorcadoService();
        Ahorcado j1 = new Ahorcado();
    
        as.crearJuego(j1);
        as.longitud(j1);
        System.out.println(" ");
        System.out.println(" ");
        as.buscar(j1, j1.getPalabra());
    }
    
}
