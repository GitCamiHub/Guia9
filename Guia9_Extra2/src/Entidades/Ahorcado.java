/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author BANGHO
 */
public class Ahorcado {
    private String [] vector;
    private int letrasEncontradas;
    private int jugadasMaximas;
    private String palabra;

    public Ahorcado() {
    }

    public Ahorcado(String [] vector, int letrasEncontradas, int jugadasMaximas) {
        this.vector = vector;
        this.letrasEncontradas = letrasEncontradas;
        this.jugadasMaximas = jugadasMaximas;
    }

    public String [] getVector() {
        return vector;
    }

    public void setVector(String[] vector) {
        this.vector = vector;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getJugadasMaximas() {
        return jugadasMaximas;
    }

    public void setJugadasMaximas(int jugadasMaximas) {
        this.jugadasMaximas = jugadasMaximas;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }
    
    
    
}
