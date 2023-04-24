/*Realizar una clase llamada ParDeNumeros que tenga como atributos dos números
reales con los cuales se realizarán diferentes operaciones matemáticas.
La clase debe tener un constructor vacío, getters y setters.
En el constructor vacío se usará el Math.random para generar los dos números.
Crear una clase ParDeNumerosService, en el paquete Servicios, 
que deberá además implementar los siguientes métodos:
Método mostrarValores que muestra cuáles son los dos números guardados.
Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
Método calcularPotencia para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.*/
package Servicios;

import Entidades.ParDeNumeros;

/**
 *
 * @author BANGHO
 */
public class ParDeNumerosService {
    
    
    public void mostrarValores(ParDeNumeros numeros){
        System.out.println("Numero 1: " + numeros.getNum1());
        System.out.println("Numero 2: " + numeros.getNum2());
    }
    
    public double devolverMayor(ParDeNumeros numeros){
       
        return Math.max(numeros.getNum1(),numeros.getNum2());
    }
    
    public void calcularPotencia(ParDeNumeros numeros){
        Double potencia;
        potencia = Math.pow(Math.round(devolverMayor(numeros)), 2);
        System.out.println("La potencia del numero mayor es: " + potencia);
    }
    
    public void calcularRaiz(ParDeNumeros numeros){
        double raiz, numAbs;
        numAbs = Math.abs(Math.min(numeros.getNum1(),numeros.getNum2()));
        raiz = Math.sqrt(numAbs);
        System.out.println("La raiz del numero menor es: " + raiz);
}
}