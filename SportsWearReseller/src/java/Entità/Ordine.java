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
public class Ordine {
    
    private String codiceOrdine,quantità_pezzi,importo_totale;

    public Ordine(String codiceOrdine, String quantità_pezzi, String importo_totale) {
        this.codiceOrdine = codiceOrdine;
        this.quantità_pezzi = quantità_pezzi;
        this.importo_totale = importo_totale;
    }

    public void setCodiceOrdine(String codiceOrdine) {
        this.codiceOrdine = codiceOrdine;
    }

    public void setQuantità_pezzi(String quantità_pezzi) {
        this.quantità_pezzi = quantità_pezzi;
    }

    public void setImporto_totale(String importo_totale) {
        this.importo_totale = importo_totale;
    }

    public String getCodiceOrdine() {
        return codiceOrdine;
    }

    public String getQuantità_pezzi() {
        return quantità_pezzi;
    }

    public String getImporto_totale() {
        return importo_totale;
    }
    
    
    
}
