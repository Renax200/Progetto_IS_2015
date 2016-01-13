/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entità;

import java.util.ArrayList;

/**
 *
 * @author carfo
 */
public class Carrello {
    
    private ArrayList<Prodotto> mioCarrello;

    public Carrello() {
        this.mioCarrello = new ArrayList<Prodotto>();
    }
    
    public ArrayList<Prodotto> getContenuto(){
        return this.mioCarrello;
    }
    
    public int getNumProdotti(){
        return this.mioCarrello.size();
    }
    
    public float getPrezzoTotate(){
       float sum=0;
        for(Prodotto p : this.mioCarrello){
            sum = sum+p.getPrezzo();
        }
        
        return sum;
    }
    
}
