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
    
    private static final ArrayList<Prodotto> mioCarrello = new ArrayList<Prodotto>();


    
    public static ArrayList<Prodotto> getContenuto(){
        return mioCarrello;
    }
    
    public static  int getNumProdotti(){
        return mioCarrello.size();
    }
    
    public static void InserisciNelCarrello(Prodotto p){
        mioCarrello.add(p);
    }
    
    
    public static float getPrezzoTotate(){
       float sum=0;
        for(Prodotto p : mioCarrello){
            sum = sum+p.getPrezzo();
        }
        
        return sum;
    }
    
}
