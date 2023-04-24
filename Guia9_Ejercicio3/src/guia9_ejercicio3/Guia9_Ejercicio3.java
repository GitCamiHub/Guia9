
package guia9_ejercicio3;

import Servicios.ArregloService;

/**
 *
 * @author BANGHO
 */
public class Guia9_Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArregloService as = new ArregloService();
        
        double [] arregloA = new double [50];
        double [] arregloB = new double [20];
        
        System.out.println("Inicializando A");
        as.inicializarA(arregloA);
        System.out.println("-----------------------------");
        System.out.print("Arreglo A = ");
        as.mostrar(arregloA);
        System.out.println("------------------------------");
        System.out.println("Arreglo A ordenado = ");
        as.ordenar(arregloA);
        as.mostrar(arregloA);
        System.out.println("------------------------------");
        System.out.println("Inicializando B");
        as.inicializarB(arregloA, arregloB);
        System.out.println("------------------------------");
        System.out.print("Arreglo B = ");
        as.mostrar(arregloB);
    }
    
}
