/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9_ejercicio6;

import Entidades.Curso;
import Servicio.CursoService;

/**
 *
 * @author BANGHO
 */
public class Guia9_Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CursoService cs = new CursoService();
        Curso curso1 = new Curso();
        cs.crearCurso(curso1);
        cs.calcularGananciaSemanal(curso1);
    }
    
}
