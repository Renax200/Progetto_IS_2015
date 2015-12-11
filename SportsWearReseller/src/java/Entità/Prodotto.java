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
public class Prodotto {
    
    private String codice,nomeProdotto,descrizione;
    private float prezzo;
    private int quantità;
    private Categoria categoria;

    public Prodotto(String codice, String nomeProdotto, String descrizione, float prezzo, int quantità, Categoria categoria) {
        this.codice = codice;
        this.nomeProdotto = nomeProdotto;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.quantità = quantità;
        this.categoria = categoria;
    }

    public String getCodice() {
        return codice;
    }

    public String getNomeProdotto() {
        return nomeProdotto;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public float getPrezzo() {
        return prezzo;
    }

    public int getQuantità() {
        return quantità;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public void setNomeProdotto(String nomeProdotto) {
        this.nomeProdotto = nomeProdotto;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

    public void setQuantità(int quantità) {
        this.quantità = quantità;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
  
    
    
    
}
