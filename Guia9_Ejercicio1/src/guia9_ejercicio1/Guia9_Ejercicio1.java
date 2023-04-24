
package guia9_ejercicio1;

import Entidades.Cadena;
import Servicios.CadenaServicio;
import java.util.Scanner;

/**
 *
 * @author BANGHO
 */
public class Guia9_Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CadenaServicio cs = new CadenaServicio();

    
       System.out.println("Ingrese una frase.");
       Cadena c1 = new Cadena(leer.nextLine().toLowerCase());
 
        cs.mostrarVocales(c1);
        cs.invertirFrase(c1);
        cs.vecesRepetido(c1);
        cs.compararLongitud(c1);
        cs.unirFrases(c1);
        cs.reemplazar(c1);
        if (cs.contiene(c1)) {
            System.out.println("La letra se encuentra en la frase");
        } else {
            System.out.println("La letra NO se encuentra en la frase");
        }
    }
    
}
