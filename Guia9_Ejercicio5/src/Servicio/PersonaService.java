/*Implemente la clase Persona en el paquete entidades. Una persona tiene un 
nombre y una fecha de nacimiento (Tipo Date), constructor vacío, constructor
parametrizado, get y set. Crear una clase PersonaService, en el paquete servicio,
con los siguientes métodos:
Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. 
Retornar el objeto Persona creado.
Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de
nacimiento y la fecha actual.
Método menorQue recibe como parámetro una Persona y una edad. Retorna true si
la persona es menor que la edad consultada o false en caso contrario.
Método mostrarPersona que muestra la información de la persona deseada.*/
package Servicio;

import Entidades.Persona;
import java.util.Date;

import java.util.Scanner;

/**
 *
 * @author BANGHO
 */
public class PersonaService {
    Scanner leer = new Scanner(System.in);
    
    public Persona crearPersona(Persona p){
      
        System.out.print("Nombre: ");
        p.setNombre(leer.next());
        p.setFechaNacimiento(nacimiento());
        
        return new Persona();
    }
    
    public Date nacimiento(){
        System.out.println("Ingrese dia, mes y año de nacimiento.");
        System.out.print("Dia: ");
        int dia = leer.nextInt();
        System.out.print("Mes: ");
        int mes = leer.nextInt();
        System.out.print("Año: ");
        int año = leer.nextInt();
        return new Date(año-1900,mes-1,dia) ;
    }
    
    public int calcularEdad(Persona p){
       Date hoy = new Date();
       int año = hoy.getYear()+1900;
       int edad = año - p.getFechaNacimiento().getYear()-1900;
       return edad;
    }
    
    public boolean menorQue(Persona p, int edad){
        System.out.print("La edad de " + p.getNombre()+ " es menor que: ");
        int consulta = leer.nextInt();
        return consulta>edad;
     
    }
    
    public void mostrarPersona(Persona p, int edad){
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Fecha de nacimiento: " + p.getFechaNacimiento().toString());
        System.out.println("Edad: " + edad);
    }
        
}
