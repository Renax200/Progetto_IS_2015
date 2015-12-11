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
public class Cliente implements Utente{
    
    private String username,password,nome,cognome,indirizzoSocietà,partitaIva,nomeSocietà,email;

    public Cliente(String username,String password,String nome, String cognome, String indirizzoSocietà, String partitaIva, String nomeSocietà, String email) {
        this.username = username;
        this.password = password;
        this.nome = nome;
        this.cognome = cognome;
        this.indirizzoSocietà = indirizzoSocietà;
        this.partitaIva = partitaIva;
        this.nomeSocietà = nomeSocietà;
        this.email = email;
        
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setIndirizzoSocietà(String indirizzoSocietà) {
        this.indirizzoSocietà = indirizzoSocietà;
    }


    public void setPartitaIva(String partitaIva) {
        this.partitaIva = partitaIva;
    }

    public void setNomeSocietà(String nomeSocietà) {
        this.nomeSocietà = nomeSocietà;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getIndirizzoSocietà() {
        return indirizzoSocietà;
    }

 
    public String getUsername() {
        return username;
    }


    public String getPassword() {
        return password;
    }

    public String getPartitaIva() {
        return partitaIva;
    }

    public String getNomeSocietà() {
        return nomeSocietà;
    }

    public String getEmail() {
        return email;
    }
    
    
    
    
    
}
