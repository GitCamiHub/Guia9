/*Un profesor particular está dando cursos para grupos de cinco alumnos y necesita 
un programa para organizar la información de cada curso. Para ello, crearemos una
clase entidad llamada Curso, cuyos atributos serán: nombreCurso, cantidadHorasPorDia,
cantidadDiasPorSemana, turno (mañana o tarde),  precioPorHora y alumnos. Donde alumnos
es un arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los nombres de cada alumno.
A continuación, se implementarán los siguientes métodos:
Un constructor por defecto.
Un constructor con todos los atributos como parámetro.
Métodos getters y setters de cada atributo.
Método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos que asisten
a las clases. Nosotros nos encargaremos de almacenar esta información en un arreglo e 
iterar con un bucle, solicitando en cada repetición que se ingrese el nombre de cada alumno.
Método crearCurso(): el método crear curso, le pide los valores de los atributos al usuario
y después se le asignan a sus respectivos atributos para llenar el objeto Curso. En este
método invocamos al método cargarAlumnos() para asignarle valor al atributo alumnos
Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia en una 
semana por curso. Para ello, se deben multiplicar la cantidad de horas por día, el precio por hora,
la cantidad de alumnos y la cantidad de días a la semana que se repite el encuentro. */
package Servicio;

import Entidades.Curso;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author BANGHO
 */
public class CursoService {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
  
    public String[] cargarAlumnos(Curso c){
        String[] alumnos = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Nombre del alumno " + (i+1));
            Arrays.fill(alumnos,i, i+1, leer.next());
        }
       return alumnos;
    }
     
     public void crearCurso(Curso c){
         System.out.print("Nombre del curso: ");
         c.setNombreCurso(leer.next());
         System.out.print("Cantidad de horas por dia: ");
         c.setCantidadHorasPorDia(leer.nextDouble());
         System.out.print("Cantidad de dias a la semana: ");
         c.setCantidadHorasPorSemana(leer.nextDouble());
         System.out.print("Turno (mañana/tarde): ");
         c.setTurno(leer.next());
         System.out.println("Precio de la hora: ");
         c.setPrecioPorHora(leer.nextDouble());
         c.setAlumnos(cargarAlumnos(c));
     }
     
     public void calcularGananciaSemanal(Curso c){
         double ganancia = ((c.getCantidadHorasPorDia()*c.getPrecioPorHora())*c.getCantidadHorasPorSemana())*5;
         System.out.println("La ganancia semanal es: $" + ganancia);
     }
}
