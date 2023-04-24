/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Meses;
import java.util.Scanner;


/**
 *
 * @author BANGHO
 */
public class MesesServicio {
    Scanner leer = new Scanner(System.in);
    
       public void adivinarMes(Meses m) {
       
        String intento;
        int contador = 0;
        System.out.println("Adivine el mes secreto: ");

        do {
            contador++;
            intento = leer.next();
            if (intento.equalsIgnoreCase(m.getMesSecreto())) {
                System.out.println("ADIVINASTE!!!");
                System.out.println("El mes secreto era " + m.getMesSecreto());
            } else {
                if (contador == 3) {
                    System.out.println("No quedan mas intentos :(");
                } else {
                    System.out.println("No acertaste. Intente otra vez.");
                }

            }
        } while (contador <= 2);

    }
}
