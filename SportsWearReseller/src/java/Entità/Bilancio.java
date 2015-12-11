/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entità;

/**
 *
 * @author carfo
 */
public class Bilancio {
    
    private String idMagazzino;
    private float totale,tot_dare,tot_avere;

    public Bilancio(String idMagazzino, float totale, float tot_dare, float tot_avere) {
        this.idMagazzino = idMagazzino;
        this.totale = totale;
        this.tot_dare = tot_dare;
        this.tot_avere = tot_avere;
    }

    public String getIdMagazzino() {
        return idMagazzino;
    }

    public float getTotale() {
        return totale;
    }

    public float getTot_dare() {
        return tot_dare;
    }

    public float getTot_avere() {
        return tot_avere;
    }

    public void setIdMagazzino(String idMagazzino) {
        this.idMagazzino = idMagazzino;
    }

    public void setTotale(float totale) {
        this.totale = totale;
    }

    public void setTot_dare(float tot_dare) {
        this.tot_dare = tot_dare;
    }

    public void setTot_avere(float tot_avere) {
        this.tot_avere = tot_avere;
    }
    
    
    
    
}
