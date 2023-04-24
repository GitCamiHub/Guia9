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
public class Meses {
    private String [] meses = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
    private String mesSecreto;
    
    public Meses() {
        this.mesSecreto = meses[8];
    }

    public String[] getMeses() {
        return meses;
    }

    public void setMeses(String[] meses) {
        this.meses = meses;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

   

    

 
    
    
    
}
