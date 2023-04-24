/*Realizar una clase llamada Cadena, en el paquete de entidades, que tenga
como atributos una frase (String) y su longitud. Agregar constructor vacío
y con atributo frase solamente. Agregar getters y setters. El constructor
con frase como atributo debe setear la longitud de la frase de manera automática.
Crear una clase CadenaServicio en el paquete servicios que implemente los siguientes métodos:
Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.
Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
Método vecesRepetido(String letra), recibirá un carácter ingresado por el 
usuario y contabilizar cuántas veces se repite el carácter en la frase,por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
Método compararLongitud(String frase), deberá comparar la longitud de 
la frase que compone la clase con otra nueva frase ingresada por el usuario.
Método unirFrases(String frase), deberá unir la frase contenida en la 
clase Cadena con una nueva frase ingresada por el usuario y mostrar la frase resultante.
Método reemplazar(String letra), deberá reemplazar todas las letras 
“a” que se encuentren en la frase, por algún otro carácter seleccionado
por el usuario y mostrar la frase resultante.
Método contiene(String letra), deberá comprobar si la frase contiene
una letra que ingresa el usuario y devuelve verdadero si la contiene y falso si no.

 */
package Servicios;

import Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author BANGHO
 */
public class CadenaServicio {
   
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
   
  
    
    public void mostrarVocales(Cadena c1){
      int contador=0;
        for (int i = 0; i < c1.getLongitud(); i++) {
            
          if (c1.getFrase().charAt(i)=='a' || c1.getFrase().charAt(i)=='e' || c1.getFrase().charAt(i)=='i'|| c1.getFrase().charAt(i)=='o' || c1.getFrase().charAt(i)=='u') {
                contador++;
            }
           
    }
     System.out.println("La frase tiene " + contador + " vocales.");
    }
    
    public void invertirFrase(Cadena c1){
        System.out.print("Frase invertida : ");
        for (int i = c1.getLongitud()-1; i >= 0 ; i--) {
            System.out.print(c1.getFrase().charAt(i));
        }
        System.out.println(" ");
    }
    
    public void vecesRepetido(Cadena c1){
        System.out.println("Ingrese la letra que quiere buscar:");
        String letra = leer.next();
        
        int contador=0;
        for (int i = 0; i < c1.getLongitud(); i++) {
            if(c1.getFrase().substring(i,i+1).equals(letra)){
                contador++;
            }
            
        }
        System.out.println("La letra se repite " + contador + " veces.");
    }
    
    public void compararLongitud(Cadena c1){
        System.out.println("Ingrese otra frase para comparar la longitud.");
        String frase2 = leer.next();
       
        if (c1.getLongitud()==frase2.length()){
            System.out.println("Las frases tienen la misma longitud");
            
        }else if (c1.getLongitud()<frase2.length()){
            System.out.println("La frase ingresada es mayor que la anterior");
        }else{
            System.out.println("La frase anterior es mayor que la ingresada");
        }
    }
    
    public void unirFrases(Cadena c1){
        System.out.println("Ingrese una tercera frase.");
        String frase3 = leer.next();
        
        System.out.println(c1.getFrase().concat(" " + frase3));
    }
 
    public void reemplazar(Cadena c1) {
        System.out.println(c1.getFrase().replace("a", "@"));

    }

    public boolean contiene(Cadena c1) {
        System.out.println("Ingrese una letra para ver si se encuentra en la frase");
        String letra = leer.next();
        for (int i = 0; i < c1.getLongitud(); i++) {
            if (c1.getFrase().substring(i, i + 1).equals(letra)) {
                return true;
            }
        }
        return false;

    }
}

