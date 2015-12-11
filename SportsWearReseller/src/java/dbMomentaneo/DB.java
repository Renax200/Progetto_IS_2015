/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbMomentaneo;

import Entità.Cliente;
import Entità.Utente;
import Entità.WebAdmin;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

/**
 *
 * @author carfo
 */
public class DB {
 
    private Cliente cliente;
    private WebAdmin admin;
    private ArrayList<Utente> utenti;
    
    public DB(){
        this.cliente= new Cliente("admin","admin",null,null, null, null, null,null);
        this.admin = new WebAdmin("admin","admin",null, null,null,null);
        this.utenti = new ArrayList<Utente>();
        this.utenti.add(admin);
        this.utenti.add(cliente);
    }
    
    public ArrayList<Utente> getArrayList(){
        return utenti;
    }

   
    
    
}
