/*Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como
atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la cantidad 
jugadas máximas que puede realizar el usuario. Definir los siguientes métodos en AhorcadoService:
-Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con la palabra 
del usuario, pone la longitud de la palabra, como la longitud del vector. Después ingresa la palabra 
en el vector, letra por letra, quedando cada letra de la palabra en un índice del vector. Y también,
guarda la cantidad de jugadas máximas y el valor que ingresó el usuario.
-Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota: buscar como se usa el vector.length.
-Método buscar(letra):  este método recibe una letra dada por el usuario y busca si la letra
ingresada es parte de la palabra o no. También informará si la letra estaba o no.
-Método encontradas(letra):  que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuántas le faltan. Este método además deberá 
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que
se busque una letra que no esté, se le restará uno a sus oportunidades.
-Método intentos(): para mostrar cuántas oportunidades le queda al jugador.
-Método juego(): el método juego se encargará de llamar todos los métodos previamente mencionados
e informará cuando el usuario descubra toda la palabra o se quede sin intentos. Este método se llamará en el main.*/
package Servicio;

import Entidades.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author BANGHO
 */
public class AhorcadoService {
    Scanner leer = new Scanner(System.in);
    
    
   public void crearJuego(Ahorcado juego){
       System.out.print("JUGADOR 1, ingresá la palabra a adivinar: ");
       juego.setPalabra(leer.next());
       
       String [] v = new String [juego.getPalabra().length()];
       
       for (int i = 0; i < juego.getPalabra().length(); i++) {
           Arrays.fill(v, i, i+1, juego.getPalabra().substring(i,i+1));
       }
       juego.setVector(v);
       
       System.out.println("------------------------------------------------");
       System.out.print("Cuantos intentos querés tenga tu contrincante? ");
       juego.setJugadasMaximas(leer.nextInt());
       
      
       
   }
   
   public void longitud(Ahorcado juego){
       System.out.println("------------------------------------------------");
       System.out.println("JUGADOR 2, la palabra que tenes que adivinar tiene " + juego.getVector().length + " letras.");
       for (int i = 0; i < juego.getVector().length; i++) {
           System.out.print(" _ ");
           
       }
   }
  
    public void buscar(Ahorcado juego,String palabra) {
      String [] v = juego.getVector();
      int intentos=0;
      
        String[] vectorAux = new String[juego.getVector().length];

        for (int i = 0; i < vectorAux.length; i++) {
            Arrays.fill(vectorAux,i, i+1, " _ ");
           }
        
      do{
          if (Arrays.equals(vectorAux, v)) {
              System.out.println("ADIVINASTE!!!");
              System.out.println("La palabra era " + palabra);
              break;
          } 
        System.out.print("Ingrese una letra: ");
        String letra = leer.next();
        int pertenece=0;
       
        for (int i = 0; i < juego.getVector().length; i++) {
    
            if (v[i].equals(letra)){
                vectorAux[i]=v[i];
                
                pertenece++;
            } 
        }
        System.out.println(Arrays.toString(vectorAux));
          if (pertenece!=0) {
                System.out.println("-----------------------------------------------------");
                System.out.println("La letra fue encontrada " + pertenece + " vez/veces.");
                System.out.println("-----------------------------------------------------");
            } else {
                System.out.println("-----------------------------------------------------");
                System.out.println("La letra NO pertenece a la palabra.");
                System.out.println("-----------------------------------------------------");
            }
        intentos++;
       
        }while (intentos<=juego.getJugadasMaximas());
      
      if (!Arrays.equals(vectorAux, v)){
        System.out.println("-----------------------------------------------------");
        System.out.println("No quedan mas intentos :(");
      }
    }

}
