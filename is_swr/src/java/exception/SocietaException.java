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
public class SocietaException extends Exception{
     private static final long serialVersionUID = 1L;
    
    private String m;
    
    public SocietaException(String message){
        this.m = message;
    }

    public SocietaException() {
        throw new UnsupportedOperationException("Errore nome società"); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String getMessage(){
        return this.m;
    }
    
}
