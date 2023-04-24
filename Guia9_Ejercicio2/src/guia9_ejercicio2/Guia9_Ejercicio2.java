/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9_ejercicio2;

import Entidades.ParDeNumeros;
import Servicios.ParDeNumerosService;

/**
 *
 * @author BANGHO
 */
public class Guia9_Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ParDeNumerosService ns = new ParDeNumerosService();
      ParDeNumeros numeros = new ParDeNumeros();
      
     ns.mostrarValores(numeros);
        System.out.println("El numero mayor es: " + ns.devolverMayor(numeros));
     ns.calcularPotencia(numeros);
     ns.calcularRaiz(numeros);
}
}
