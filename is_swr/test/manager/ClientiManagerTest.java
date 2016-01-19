/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

import entità.Account;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author carfo
 */
public class ClientiManagerTest {
    
    ClientiManager instance;
    
    @Before
    public void setUp() {
        instance = ClientiManager.getInstance();
    }
    
    
    /**
     * Test of getInstance method, of class ClientiManager.
     */
    @Test
    public void testgetInstance() {
         ClientiManager result = ClientiManager.getInstance();
         assertNotNull(result);
         
    }

    /**
     * Test of listaClienti method, of class ClientiManager.
     */
    @Test
    public void testListaClienti() {
       try{ 
            instance.listaClienti();
            assert(true);
       }catch(Exception e){
           fail("non sono riuscito a fare l'operazione");
       }
    }

    /**
     * Test of ricercaAccount method, of class ClientiManager.
     */
    @Test
    public void testRicercaAccount(){
        String ric = "deLucia";
        try{
            instance.ricercaAccount(ric);
            assert(true);
        }catch(Exception e){
            fail("non sono riuscito a fare l'op");
        }
    }
    
     @Test
    public void testRicercaAccountNull() throws Exception {
        String ric = "deLuca";
        try{
            instance.ricercaAccount(ric);
            fail("non sono riuscito a fare l'op");
        }catch(Exception e){
            assert(true);
        }
    }
    
}
