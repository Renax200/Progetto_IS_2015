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
public class MagazzinoException  extends Exception{
      private static final long serialVersionUID = 1L;
    
    private String m;
    
    public MagazzinoException(String message){
        this.m = message;
    }

    public MagazzinoException() {
        throw new UnsupportedOperationException("Errore nell'inserimento del nome e/o cognome"); //To change body of generated methods, choose Tools | Templates.
    }
    
      @Override
    public String getMessage(){
        return this.m;
    }
    
}
