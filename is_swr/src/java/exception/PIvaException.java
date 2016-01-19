/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author carfo
 */
public class PIvaException extends Exception{
     private static final long serialVersionUID = 1L;
    
    private String m;
    
    public PIvaException(String message){
        this.m = message;
    }

    public PIvaException() {
        throw new UnsupportedOperationException("Errore Partita Iva"); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String getMessage(){
        return this.m;
    }
    
}
