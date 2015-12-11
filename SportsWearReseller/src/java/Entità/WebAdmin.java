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
public class WebAdmin implements Utente {
    
    private String username,password,nome,cognome,sede,email;

    public WebAdmin(String username, String password, String nome,String cognome,String sede,String email) {
        this.username = username;
        this.password = password;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.sede = sede;
    }
    
    
    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getSede() {
        return sede;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setSede(String sede) {
        this.sede = sede;
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
    
    
    
    
}
