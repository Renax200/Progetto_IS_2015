/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author Grappone Renato
 */
public class PasswordException extends Exception {
     private static final long serialVersionUID = 1L;
    
    private String m;
    
    public PasswordException(String message){
        this.m = message;
    }

    public PasswordException() {
        throw new UnsupportedOperationException("Errore password"); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String getMessage(){
        return this.m;
    }
    
}
