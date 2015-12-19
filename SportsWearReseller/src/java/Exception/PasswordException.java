/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

/**
 *
 * @author carfo
 */
class PasswordException extends Exception{
      String m;
    
    public PasswordException(String m){
        this.m = m;
    }
    
    public String getMessage(){
        return m;
    }
}
