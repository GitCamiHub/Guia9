/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9_ejercicio5;

import Entidades.Persona;
import Servicio.PersonaService;

/**
 *
 * @author BANGHO
 */
public class Guia9_Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaService ps = new PersonaService();
        Persona p1 = new Persona();
        ps.crearPersona(p1);
        
        System.out.println("Datos de la persona.");
        ps.mostrarPersona(p1, ps.calcularEdad(p1));
        System.out.println("-------------------------------------------------");
        System.out.println("Respuesta: " + ps.menorQue(p1, ps.calcularEdad(p1)));
    }
    
}
 