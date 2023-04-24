/*nombreCurso, cantidadHorasPorDia,
cantidadDiasPorSemana, turno (mañana o tarde),  precioPorHora y alumnos
 */
package Entidades;

/**
 *
 * @author BANGHO
 */
public class Curso {
    private String nombreCurso;
    private double cantidadHorasPorDia;
    private double cantidadDiasPorSemana;
    private String turno; // mañana o tarde
    private double precioPorHora;
    private String [] alumnos;

    public Curso() {
    }

    public Curso(String nombreCurso, double cantidadHorasPorDia, double cantidadDiasPorSemana, String turno, double precioPorHora, String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
        this.alumnos = alumnos;
    }

    

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public double getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public void setCantidadHorasPorDia(double cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public double getCantidadHorasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public void setCantidadHorasPorSemana(double cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }
    
    

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }
    
    
    
}
