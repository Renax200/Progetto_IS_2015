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
    private String nome,descrizione,categoria;
    private int numeroPezzi,idProdotto;
    private float prezzo;

    public Prodotto(int idProdotto, String nome, String descrizione, String categoria, int numeroPezzi, float prezzo) {
        this.idProdotto = idProdotto;
        this.nome = nome;
        this.descrizione = descrizione;
        this.categoria = categoria;
        this.numeroPezzi = numeroPezzi;
        this.prezzo = prezzo;
    }
    
    public Prodotto(){
        
    }

    public Prodotto(int idProdotto, String nome, String descrizione, int numero_pezzi, float prezzo, String categoria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public int getIdProdotto() {
        return idProdotto;
    }

    public String getNome() {
        return nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getNumeroPezzi() {
        return numeroPezzi;
    }

    public float getPrezzo() {
        return prezzo;
    }

    public void setIdProdotto(int idProdotto) {
        this.idProdotto = idProdotto;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setNumeroPezzi(int numeroPezzi) {
        this.numeroPezzi = numeroPezzi;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }
    
    
}
