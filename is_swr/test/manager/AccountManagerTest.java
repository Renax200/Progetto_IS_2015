/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author carfo
 */
public class AccountManagerTest {
     AccountManager instance;
     
    
   public AccountManagerTest() {
    }
    
    
    @Before
    public void setUp() {
        instance = AccountManager.getInstance();
    }
    
    
    
    @Test
    public void testgetInstance() {
         AccountManager result = AccountManager.getInstance();
         assertNotNull(result);
    }
    
    @Test
    public void testIscrizioneClienteok(){
        String mail="deLucia@gmail.com";
        String passr="unisaEsameIs";
        String nome="Andrea";
        String cognome="De Lucia";
        String societa="Ingegneria del SFW";
        String partitaIva="23344556678";
        String tipo="Cliente";
        String indirizzo = "Università di Salerno";
         try{
            instance.creaAccount(nome,cognome,mail,passr,societa,indirizzo,tipo,partitaIva);
           assertTrue(true);
        }catch(Exception e){
            fail("non sono riuscito ad effettuare l' op");
        }
    }
    
     @Test
    public void testMinEmailIscrizione(){
        String mail="";
        String passr="unisaEsameIs";
        String nome="Andrea";
        String cognome="De Lucia";
        String societa="Sports Wear Reseller";
        String partitaIva="23344556678";
        String tipo="Cliente";
        String indirizzo = "Università degli Studi di Salerno";  
         try{
            instance.creaAccount(nome,cognome,mail,passr,societa,indirizzo,partitaIva,tipo);
            fail("sono riuscito ad effettuare l' op");
        }catch(Exception e){
            assertTrue(true);
            }
    }
    
    
     @Test
    public void testMaxEmailIscrizione(){
	String mail="Prova stringa massimaProva stringa massimaProva stringa massimaProva stringa massimaProva stringa massimaProva stringa massimaProva stringa massimaProva stringa massimaProva stringa massimaProva stringa massimaProva stringa massimaProva stringa massimaProva stringa massimaProva stringa massima";
	String passr="unisaEsameIs";
        String nome="Andrea";
        String cognome="De Lucia";
        String societa="Sports Wear Reseller";
        String partitaIva="23344556678";
        String tipo="Cliente";
        String indirizzo = "Università degli Studi di Salerno"; 
         try{
            instance.creaAccount(nome,cognome,mail,passr,societa,indirizzo,partitaIva,tipo);
          fail("sono riuscito ad effettuare l' op");
        }catch(Exception e){
            assertTrue(true);
            }
    }
    
       @Test
    public void testFormatEmailIscrizione(){
        String mail = "antoniorossi";
        String passr="unisaEsameIs";
        String nome="Andrea";
        String cognome="De Lucia";
        String societa="Sports Wear Reseller";
        String partitaIva="23344556678";
        String tipo="Cliente";
        String indirizzo = "Università degli Studi di Salerno"; 
         try{
            instance.creaAccount(nome,cognome,mail,passr,societa,indirizzo,partitaIva,tipo);
          fail("sono riuscito ad effettuare l' op");
        }catch(Exception e){
            assertTrue(true);
            }
    }
    
    @Test
    public void testMinSurnameIscrizione(){
	String mail ="provakung@unisa.it";
	String passr="unisaEsameIs";
        String nome="Andrea";
        String cognome="";
        String societa="Sports Wear Reseller";
        String partitaIva="23344556678";
        String tipo="Cliente";
        String indirizzo = "Università degli Studi di Salerno";  
         try{
            instance.creaAccount(nome,cognome,mail,passr,societa,indirizzo,partitaIva,tipo);
          fail("sono riuscito ad effettuare l' op");
        }catch(Exception e){
            assertTrue(true);
            }
    }
    
    @Test
    public void testMaxSurnameIscrizione(){
	String mail ="provakxry@unisa.it";
	String passr="unisaEsameIs";
        String nome="Andrea";
        String cognome="provaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprova";
        String societa="Sports Wear Reseller";
        String partitaIva="23344556678";
        String tipo="Cliente";
        String indirizzo = "Università degli Studi di Salerno";  
        
         try{
            instance.creaAccount(nome,cognome,mail,passr,societa,indirizzo,partitaIva,tipo);
          fail("sono riuscito ad effettuare l' op");
        }catch(Exception e){
            assertTrue(true);
            }
    }
    
     @Test
    public void testMinPasswordIscrizione(){
	String mail ="Prugynkova@unisa.it";
	String passr="";
        String nome="Andrea";
        String cognome="De Lucia";
        String societa="Sports Wear Reseller";
        String partitaIva="23344556678";
        String tipo="Cliente";
        String indirizzo = "Università degli Studi di Salerno";  
         try{
            instance.creaAccount(nome,cognome,mail,passr,societa,indirizzo,partitaIva,tipo);
           fail("sono riuscito ad effettuare l' op");
        }catch(Exception e){
            assertTrue(true);
            }
    }
    
    
    @Test
    public void testMaxPasswordIscrizione(){
	String mail ="Prkvuyfghova@unisa.it";
	String passr="provaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprova";
        String nome="Andrea";
        String cognome="De Lucia";
        String societa="Sports Wear Reseller";
        String partitaIva="23344556678";
        String tipo="Cliente";
        String indirizzo = "Università degli Studi di Salerno";
         try{
            instance.creaAccount(nome,cognome,mail,passr,societa,indirizzo,partitaIva,tipo);
            fail("sono riuscito ad effettuare l' op");
        }catch(Exception e){
            assertTrue(true);
            }
    }
    
    @Test
    public void testMinSocietaIscrizione(){
	String mail ="Pubnrova@unisa.it";
	String passr="provaprty";
        String nome="Andrea";
        String cognome="De Lucia";
        String societa="";
        String partitaIva="23344556678";
        String tipo="Cliente";
        String indirizzo = "Università degli Studi di Salerno";
         try{
            instance.creaAccount(nome,cognome,mail,passr,societa,indirizzo,partitaIva,tipo);
           fail("sono riuscito ad effettuare l' op");
        }catch(Exception e){
            assertTrue(true);
            }
    }
    
   
     @Test
    public void testMaxSocietaIscrizione(){
	String mail ="Provayui@unisa.it";
	String passr="provaprty";
        String nome="Andrea";
        String cognome="De Lucia";
        String societa="provaSOCIETàprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprova";
        String partitaIva="23344556678";
        String tipo="Cliente";
        String indirizzo = "Università degli Studi di Salerno";
         try{
            instance.creaAccount(nome,cognome,mail,passr,societa,indirizzo,partitaIva,tipo);
           fail("sono riuscito ad effettuare l' op");
        }catch(Exception e){
            assertTrue(true);
            }
    }
    
	@Test
    public void testMinSocietaIndirizzoIscrizione(){
	String mail ="Provauykj@unisa.it";
	String passr="provaprty";
        String nome="Andrea";
        String cognome="De Lucia";
        String societa="itufygiuhkvl";
        String partitaIva="23344556678";
        String tipo="Cliente";
        String indirizzo = "";
         try{
            instance.creaAccount(nome,cognome,mail,passr,societa,indirizzo,partitaIva,tipo);
          fail("sono riuscito ad effettuare l' op");
        }catch(Exception e){
            assertTrue(true);
            }
    }
    
    
    
     @Test
    public void testMaxSocietaIndirizzoIscrizione(){
        String mail ="Provayui@unisa.it";
	String passr="provaprty";
        String nome="Andrea";
        String cognome="De Lucia";
        String societa="rtyfkughijuytfygu";
        String partitaIva="23344556678";
        String tipo="Cliente";
        String indirizzo = "provaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprovaprova";
         try{
            instance.creaAccount(nome,cognome,mail,passr,societa,indirizzo,partitaIva,tipo);
           fail("sono riuscito ad effettuare l' op");
        }catch(Exception e){
            assertTrue(true);
            }
    }
    
    
	@Test
    public void testMinPartitaIvaIscrizione(){
	String mail ="Provauykj@unisa.it";
	String passr="provaprty";
        String nome="Andrea";
        String cognome="De Lucia";
        String societa="itufygiuhkvl";
        String partitaIva="23344556678";
        String tipo="Cliente";
        String indirizzo = "";
         try{
            instance.creaAccount(nome,cognome,mail,passr,societa,indirizzo,partitaIva,tipo);
           fail("sono riuscito ad effettuare l' op");
        }catch(Exception e){
            assertTrue(true);
            }
    }
    
    
    
     @Test
    public void testMaxPartitaIvaIscrizione(){
	String mail ="ProvaKYLyui@unisa.it";
        String passr="provaprty";
        String nome="Andrea";
        String cognome="De Lucia";
        String societa="rtyfkughijuytfygu";
        String partitaIva="";
        String tipo="Cliente";
        String indirizzo = "provaprovaprova";
         try{
            instance.creaAccount(nome,cognome,mail,passr,societa,indirizzo,partitaIva,tipo);
          fail("sono riuscito ad effettuare l' op");
        }catch(Exception e){
            assertTrue(true);
            }
    }
    
    
    @Test
    public void testFormatPartitaIvaIscrizione(){
	String mail ="ProvaKYLyui@unisa.it";
        String passr="provaprty";
        String nome="Andrea";
        String cognome="De Lucia";
        String societa="rtyfkughijuytfygu";
        String partitaIva="jbi56knkjl7";
        String tipo="Cliente";
        String indirizzo = "provaprovaprova";
        try{
            instance.creaAccount(nome,cognome,mail,passr,societa,indirizzo,partitaIva,tipo);
           fail("sono riuscito ad effettuare l' op");
        }catch(Exception e){
            assertTrue(true);
            }
    }
    

   
    
@Test
    public void testMinUserPassLogin(){
       String user = "";
       String pass = "";
         try{
            instance.logIn(user,pass);
            fail("sono riuscito a fare l' op");
        }catch(Exception x){
            assertTrue(true);
        }
    }

    
    @Test
    public void testMaxUserLogin(){
       String user = "Prova superamento stringa,Prova superamento stringa,Prova superamento stringa,Prova superamento stringa,Prova superamento stringa,Prova superamento stringa,Prova superamento stringa,Prova superamento stringa,Prova superamento stringa,Prova superamento stringa,Prova superamento stringa,";
       String pass = "cliente12";
         try{
            instance.logIn(user,pass);
            fail("sono riuscito a fare l' op");
        }catch(Exception x){
            assertTrue(true);
        }
    }
    
    
    @Test
    public void testMinPassLogin(){
       String user = "adelucia@hotmail.it";
       String pass = "";
         try{
            instance.logIn(user,pass);
            fail("sono riuscito a fare l' op");
        }catch(Exception x){
            assertTrue(true);
        }
    }
    
     @Test
    public void testEmailFormatLogin(){
       String user = "adeluciahotmail.it";
       String pass = "";
         try{
            instance.logIn(user,pass);
            fail("sono riuscito a fare l' op");
        }catch(Exception x){
            assertTrue(true);
        }
    }
    
    @Test
    public void testMaxPassLogin(){
       String user = "adelucia@hotmail.it";
       String pass = "Prova superamento stringa,Prova superamento stringa,Prova superamento stringa,Prova superamento stringa,Prova superamento stringa,Prova superamento stringa,Prova superamento stringa,Prova superamento stringa,Prova superamento stringa,Prova superamento stringa,Prova superamento stringa,";
         try{
            instance.logIn(user,pass);
            fail("sono riuscito a fare l' op");
        }catch(Exception x){
            assertTrue(true);
        }
    }
    
    @Test
    public void testFormarmatPassLogin(){
       String user = "antonio.parlato@gmail.com";
       String pass = "khjbnlyuij";
         try{
            instance.logIn(user,pass);
            fail("sono riuscito a fare l' op");
        }catch(Exception x){
            assertTrue(true);
        }
    }
    
    @Test
    public void testLoginok(){
      String user="deLucia@gmail.com";
      String pass="unisaEsameIs";
       try{
            instance.logIn(user,pass);
             assertTrue(true);
        }catch(Exception e){
            fail("non sono riuscito ad effettuare l' op");
        }
    }
    
    
}
