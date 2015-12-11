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
public class Magazzino {
    
    private int capienzaTotale, quantità_prodotti_Presenti;
    private String idMagazzino;

    public Magazzino(int capienzaTotale, int quantità_prodotti_Presenti, String idMagazzino) {
        this.capienzaTotale = capienzaTotale;
        this.quantità_prodotti_Presenti = quantità_prodotti_Presenti;
        this.idMagazzino = idMagazzino;
    }

    public int getCapienzaTotale() {
        return capienzaTotale;
    }

    public int getQuantità_prodotti_Presenti() {
        return quantità_prodotti_Presenti;
    }

    public String getIdMagazzino() {
        return idMagazzino;
    }

    public void setCapienzaTotale(int capienzaTotale) {
        this.capienzaTotale = capienzaTotale;
    }

    public void setQuantità_prodotti_Presenti(int quantità_prodotti_Presenti) {
        this.quantità_prodotti_Presenti = quantità_prodotti_Presenti;
    }

    public void setIdMagazzino(String idMagazzino) {
        this.idMagazzino = idMagazzino;
    }
    
    
}
