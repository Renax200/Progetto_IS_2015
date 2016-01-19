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

public class EmailException extends Exception{

    private static final long serialVersionUID = 1L;
    
    private String m;
    
    public EmailException(String message){
        this.m = message;
    }

    public EmailException() {
        throw new UnsupportedOperationException("Errore email"); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String getMessage(){
        return this.m;
    }
    
}
