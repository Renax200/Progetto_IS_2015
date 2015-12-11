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
public class Categoria {
    
    private String nomeCategoria,descrizione;

    public Categoria(String nomeCategoria, String descrizione) {
        this.nomeCategoria = nomeCategoria;
        this.descrizione = descrizione;
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
    
    
    
}
