/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

import entità.Prodotto;
import java.sql.SQLException;
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
public class MagazzinoManagerTest {
    
    MagazzinoManager instance;
    
    public MagazzinoManagerTest() {
    }
    
    
    @Before
    public void setUp() {
        instance = MagazzinoManager.getInstance();
    }
    
    
    
    @Test
    public void testgetInstance()throws Exception {
         MagazzinoManager result = MagazzinoManager.getInstance();
         assertNotNull(result);
         
    }
    
    
    @Test
    public void testInserimentoProdottoOK()throws Exception{
        String idP="15";
        String nome="Completini Inter";
        String descrizione="Completini di taglia XL L ed S"; 
        String numPz="50";
        String prz= "45.50";
        String categoria = "Completini";
        try{
             int idP2 = Integer.parseInt(idP);
             int numPz2 = Integer.parseInt(numPz);
             float prz2 = Float.parseFloat(prz);
            instance.inserisciProdotto(idP2,nome,descrizione,numPz2,prz2,categoria);
            assert(true);
        }catch(Exception e){
            fail("non sono riuscito ad effettuare l'operazione");
        }
    }
    
    @Test
    public void testInserimentoProdottoExist()throws Exception{
        String idP="15";
        String nome="Completini Inter";
        String descrizione="Completini di taglia XL L ed S"; 
        String numPz="50";
        String prz= "45.50";
        String categoria = "Completini";
        try{
             int idP2 = Integer.parseInt(idP);
             int numPz2 = Integer.parseInt(numPz);
             float prz2 = Float.parseFloat(prz);
            instance.inserisciProdotto(idP2,nome,descrizione,numPz2,prz2,categoria);
            fail("non sono riuscito ad effettuare l'operazione");
        }catch(Exception e){
            assert(true);
            
        }
    }
    
    @Test
    public void testInserimentoProdottoIdZero()throws Exception{
        String idP="0";
        String nome="Completini Inter";
        String descrizione="Completini di taglia XL L ed S"; 
        String numPz="50";
        String prz= "45.50";
        String categoria = "Completini";
        try{
             int idP2 = Integer.parseInt(idP);
             int numPz2 = Integer.parseInt(numPz);
             float prz2 = Float.parseFloat(prz);
            instance.inserisciProdotto(idP2,nome,descrizione,numPz2,prz2,categoria);
           fail("sono riuscito ad effettuare l'operazione");
        }catch(Exception e){
             assert(true);
        }
    }
    
    @Test
    public void testInserimentoProdottoIdMin()throws Exception{
        String idP="-50";
        String nome="Completini Inter";
        String descrizione="Completini di taglia XL L ed S"; 
        String numPz="50";
        String prz= "45.50";
        String categoria = "Completini";
        try{
             int idP2 = Integer.parseInt(idP);
             int numPz2 = Integer.parseInt(numPz);
             float prz2 = Float.parseFloat(prz);
            instance.inserisciProdotto(idP2,nome,descrizione,numPz2,prz2,categoria);
         fail("sono riuscito ad effettuare l'operazione");
        }catch(Exception e){
             assert(true);
        }
    }
    
    @Test
    public void testInserimentoProdottoIdNotNumber()throws Exception{
        String idP="hbhy";
        String nome="Completini Inter";
        String descrizione="Completini di taglia XL L ed S"; 
        String numPz="50";
        String prz= "45.50";
        String categoria = "Completini";
        try{
             int idP2 = Integer.parseInt(idP);
             int numPz2 = Integer.parseInt(numPz);
             float prz2 = Float.parseFloat(prz);
            instance.inserisciProdotto(idP2,nome,descrizione,numPz2,prz2,categoria);
            fail("sono riuscito ad effettuare l'operazione");
        }catch(Exception e){
             assert(true);
            
        }
    }
    
    @Test
    public void testInserimentoProdottoNameMax()throws Exception{
        String idP="25";
        String nome="provaNomeprovaNomeprovaNomeprovaNomeprovaNomeprovaNomeprovaNomeprovaNomeprovaNomeprovaNomeprovaNomeprovaNomeprovaNomeprovaNomeprovaNomeprovaNomeprovaNomeprovaNomeprovaNomeprovaNomeprovaNomeprovaNomeprovaNomeprovaNome";
        String descrizione="Completini di taglia XL L ed S"; 
        String numPz="50";
        String prz= "45.50";
        String categoria = "Completini";
        try{
             int idP2 = Integer.parseInt(idP);
             int numPz2 = Integer.parseInt(numPz);
             float prz2 = Float.parseFloat(prz);
            instance.inserisciProdotto(idP2,nome,descrizione,numPz2,prz2,categoria);
            fail("sono riuscito ad effettuare l'operazione");
        }catch(Exception e){
             assert(true);
            
        }
    }
    
    
    @Test
    public void testInserimentoProdottoNomeMin()throws Exception{
        String idP="55";
        String nome="";
        String descrizione="Completini di taglia XL L ed S"; 
        String numPz="50";
        String prz= "45.50";
        String categoria = "Completini";
        try{
             int idP2 = Integer.parseInt(idP);
             int numPz2 = Integer.parseInt(numPz);
             float prz2 = Float.parseFloat(prz);
            instance.inserisciProdotto(idP2,nome,descrizione,numPz2,prz2,categoria);
            fail("sono riuscito ad effettuare l'operazione");
        }catch(Exception e){
             assert(true);
            
        }
    }
    
    @Test
    public void testInserimentoProdottoMaxDescrizione()throws Exception{
        String idP="45";
        String nome="Completini Juve";
        String descrizione="DescrizioneProvaDescrizioneProvaDescrizioneProvaDescrizioneProvaDescrizioneProvaDescrizione"
                + "ProvaDescrizioneProvaDescrizioneProvaDescrizioneProvaDescrizioneProvaDescrizioneProvaDescrizioneProva4"
                + "DescrizioneProvaDescrizioneProvaDescrizioneProvaDescrizioneProvaDescrizioneProvaDescrizioneProvaDescri"
                + "zioneProvaDescrizioneProvaDescrizioneProvaDescrizioneProvaDescrizioneProvaDescrizioneProva"; 
        String numPz="50";
        String prz= "45.50";
        String categoria = "Completini";
        try{
             int idP2 = Integer.parseInt(idP);
             int numPz2 = Integer.parseInt(numPz);
             float prz2 = Float.parseFloat(prz);
            instance.inserisciProdotto(idP2,nome,descrizione,numPz2,prz2,categoria);
            fail("sono riuscito ad effettuare l'operazione");
        }catch(Exception e){
             assert(true);
            
        }
    }
    
    @Test
    public void testInserimentoProdottoNumPezzNotNumber()throws Exception{
        String idP="56";
        String nome="Completini Juve";
        String descrizione="DescrizioneProva"; 
        String numPz="cinque";
        String prz= "45.50";
        String categoria = "Completini";
        try{
             int idP2 = Integer.parseInt(idP);
             int numPz2 = Integer.parseInt(numPz);
             float prz2 = Float.parseFloat(prz);
            instance.inserisciProdotto(idP2,nome,descrizione,numPz2,prz2,categoria);
            fail("sono riuscito ad effettuare l'operazione");
        }catch(Exception e){
             assert(true);
            
        }
    }
    
     @Test
    public void testInserimentoProdottoNumPezzNegativ()throws Exception{
        String idP="59";
        String nome="Completini Juve";
        String descrizione="DescrizioneProva"; 
        String numPz="-50";
        String prz= "45.50";
        String categoria = "Completini";
        try{
             int idP2 = Integer.parseInt(idP);
             int numPz2 = Integer.parseInt(numPz);
             float prz2 = Float.parseFloat(prz);
            instance.inserisciProdotto(idP2,nome,descrizione,numPz2,prz2,categoria);
            fail("sono riuscito ad effettuare l'operazione");
        }catch(Exception e){
             assert(true);
            
        }
    }
    
     @Test
    public void testInserimentoProdottoPrezzoNotNumber()throws Exception{
        String idP="90";
        String nome="Completini Juve";
        String descrizione="DescrizioneProva"; 
        String numPz="50";
        String prz= "cento";
        String categoria = "Completini";
        try{
             int idP2 = Integer.parseInt(idP);
             int numPz2 = Integer.parseInt(numPz);
             float prz2 = Float.parseFloat(prz);
            instance.inserisciProdotto(idP2,nome,descrizione,numPz2,prz2,categoria);
            fail("sono riuscito ad effettuare l'operazione");
        }catch(Exception e){
             assert(true);
            
        }
    }
    
    @Test
    public void testInserimentoProdottoPrezzoNegativ()throws Exception{
        String idP="20555";
        String nome="Completini Juve";
        String descrizione="DescrizioneProva"; 
        String numPz="50";
        String prz= "-26.35";
        String categoria = "Completini";
        try{
             int idP2 = Integer.parseInt(idP);
             int numPz2 = Integer.parseInt(numPz);
             float prz2 = Float.parseFloat(prz);
            instance.inserisciProdotto(idP2,nome,descrizione,numPz2,prz2,categoria);
            fail("sono riuscito ad effettuare l'operazione");
        }catch(Exception e){
             assert(true);
            
        }
    }
    
    @Test
    public void testInserimentoProdottoPrezzoZero()throws Exception{
        String idP="20555";
        String nome="Completini Juve";
        String descrizione="DescrizioneProva"; 
        String numPz="50";
        String prz= "0";
        String categoria = "Completini";
        try{
             int idP2 = Integer.parseInt(idP);
             int numPz2 = Integer.parseInt(numPz);
             float prz2 = Float.parseFloat(prz);
            instance.inserisciProdotto(idP2,nome,descrizione,numPz2,prz2,categoria);
            fail("sono riuscito ad effettuare l'operazione");
        }catch(Exception e){
             assert(true);
            
        }
    }
    
    
    @Test
    public void testGetLitaProdottiOK() throws Exception{
        try{
            instance.listaProdotti();
            assert(true);
        }catch(Exception e){
            fail("non sono riuscito ad effettuare l'operazione");
        }
    }
    
    @Test
    public void testGetListaProdottiCateogiaOK() throws Exception{
        try{
            instance.listaProdottiCatogoria("Completini");
            assert(true);
        }catch(Exception e){
            fail("non sono riuscito ad effettuare l'operazione");
        }
    }
    
    @Test
    public void testGetListaProdottiCategoriaNull()throws Exception{
        try{
            instance.listaProdottiCatogoria("Scarpette");
            fail("sono riuscito a fare l'operazione");
        }catch(Exception e){
            assert(true);
        }
    }
    
    
    @Test 
    public void testRicercaProdottoOK()throws Exception{
        try{
            instance.ricercaProdotto("inter");
            assert(true);
        }catch(Exception e){
            fail("non sono riuscito ad effettuate l'operazione");
        }
    }
    
    @Test
    public void testRicercaProdottoNULL()throws Exception{
        try{
            instance.ricercaProdotto("Nike");
            fail("sono riuscito ad effettuare l'operazione");
        }catch(Exception e){
            assert(true);
        }
    }
    
    @Test
    public void testRicercaProdottoCategoriaOk()throws Exception{
        try{
            instance.ricercaProdottoCategoria("inter", "Completini");
            assert(true);
        }catch(Exception e){
            fail("non sono riuscito ad effettuare l'operazione");
        }
    }
    
    @Test
    public void testRicercaProdottoCatecoriaNull()throws Exception{
        try{
            instance.ricercaProdottoCategoria("Milan", "Completini");
            fail("sono riuscito ad effettuare l'operazione");
        }
        catch(Exception e ){
            assert(true);
        }
    }
    
}
