/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entità;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author carfo
 */
public class Transazione {
    
    private int giorno,mese,anno;
    private String descrizione;
    private float prezzoTotale;
    private GregorianCalendar data;
    
    public Transazione(int giorno,int mese,int anno,String descrizione, float prezzoTotale){
    
        this.anno = anno;
        this.mese = mese;
        this.giorno = giorno;
        this.data = new GregorianCalendar(this.giorno,this.mese,this.anno);
        this.descrizione = descrizione;
        this.prezzoTotale = prezzoTotale;   
    }

    public String getDescrizione() {
        return descrizione;
    }

    public float getPrezzoTotale() {
        return prezzoTotale;
    }

    public GregorianCalendar getData() {
        return data;
    }
    
    
}
