/*Vamos a usar la clase Date que ya existe en Java. Crearemos la clase FechaService,
en paquete Servicios, que tenga los siguientes métodos:
Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento.
Luego los pase por parámetro a un nuevo objeto Date. El método debe retornar el
objeto Date. Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Método fechaActual que cree un objeto fecha con el día actual. Par
esto usaremos el constructor vacío de la clase Date. Ejemplo: Date fechaActual = new  Date();
El método debe retornar el objeto Date.
Método diferencia que reciba las dos fechas por parámetro y retorna la
diferencia de años entre una y otra (edad del usuario).

 */
package Servicios;


import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author BANGHO
 */
public class DateService {
    Scanner leer = new Scanner(System.in);
    
    public Date fechaNacimiento(){
        System.out.println("Ingrese dia, mes y año de nacimiento.");
        System.out.print("Dia: ");
        int dia = leer.nextInt();
        System.out.print("Mes: ");
        int mes = leer.nextInt();
        System.out.print("Año: ");
        int año = leer.nextInt();
        return new Date(año-1900,mes-1,dia) ;
    }
    
    public Date fechaActual(){
    Date fechaActual = new  Date();
      
    return fechaActual;
    }
    
    public int diferencia(Date fechaN, Date fechaA){
        if (fechaA.getMonth()<fechaN.getMonth()|| fechaA.getDay()<fechaN.getDay()) {
            return fechaA.getYear() - fechaN.getYear()-1;
        }else{
      return fechaA.getYear() - fechaN.getYear();
        }
    }

}
