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
public class Account {
    
    private String email,password,nome,cognome,societa,partitaIva,tipo;
    private Carrello mioCarrello;

    public Account(String email, String password, String nome, String cognome, String societa, String partitaIva, String tipo) {
        this.email = email;
        this.password = password;
        this.partitaIva = partitaIva;
        this.tipo = tipo;
        this.societa = societa;
        this.nome = nome;
        this.cognome = cognome;
        this.mioCarrello = new Carrello();
    }
        public Account() {
      
         }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setPartitaIva(String partitaIva) {
        this.partitaIva = partitaIva;
    }

    public String getPartitaIva() {
        return partitaIva;
    }


    public String getTipo() {
        return tipo;
    }

    public String getSocieta() {
        return societa;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setSocieta(String societa) {
        this.societa = societa;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    
    public Carrello getMioCarrello(){
        return this.mioCarrello;
    }
    
}
