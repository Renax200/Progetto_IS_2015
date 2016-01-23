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
public class NullAccountException extends Exception {
     private static final long serialVersionUID = 1L;
    
    private String m;
    
    public NullAccountException(String message){
        this.m = message;
    }

    public NullAccountException() {
        throw new UnsupportedOperationException("Account non trovato"); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String getMessage(){
        return this.m;
    }
    
}
