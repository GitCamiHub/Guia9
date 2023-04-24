/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9_ejercicio4;


import Servicios.DateService;
import java.util.Date;

/**
 *
 * @author BANGHO
 */
public class Guia9_Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       DateService ds = new DateService();
       
       Date fecha = ds.fechaNacimiento();
       Date fechaAc = ds.fechaActual();
       System.out.println("---------------------------------------");
       System.out.println("Fecha de nacimiento : " + fecha);
       System.out.println("---------------------------------------");
       System.out.println("Fecha actual : " + fechaAc);
       System.out.println("---------------------------------------");
       System.out.println("Edad : " + ds.diferencia(fecha, fechaAc));
    }
    
}
