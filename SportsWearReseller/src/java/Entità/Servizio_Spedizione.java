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
public class Servizio_Spedizione {
    
    private String nomeCorriere,destinazione,destinatario,tracking;
    private float prezzo;

    public Servizio_Spedizione(String nomeCorriere, String destinazione, String destinatario, String tracking, float prezzo) {
        this.nomeCorriere = nomeCorriere;
        this.destinazione = destinazione;
        this.destinatario = destinatario;
        this.tracking = tracking;
        this.prezzo = prezzo;
    }

    public String getNomeCorriere() {
        return nomeCorriere;
    }

    public String getDestinazione() {
        return destinazione;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public String getTracking() {
        return tracking;
    }

    public float getPrezzo() {
        return prezzo;
    }

    public void setNomeCorriere(String nomeCorriere) {
        this.nomeCorriere = nomeCorriere;
    }

    public void setDestinazione(String destinazione) {
        this.destinazione = destinazione;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public void setTracking(String tracking) {
        this.tracking = tracking;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }
    
    
}
