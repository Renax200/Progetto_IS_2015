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
 * @author Grappone Renato
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
    public void testgetInstance(){
         MagazzinoManager result = MagazzinoManager.getInstance();
         assertNotNull(result);
         
    }
    
    
    @Test
    public void testInserimentoProdottoOK(){
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
    public void testInserimentoProdottoExist(){
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
    public void testInserimentoProdottoIdZero(){
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
    public void testInserimentoProdottoIdMin(){
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
    public void testInserimentoProdottoIdNotNumber(){
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
    public void testInserimentoProdottoNameMax(){
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
    public void testInserimentoProdottoNomeMin(){
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
    public void testInserimentoProdottoMaxDescrizione(){
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
    public void testInserimentoProdottoNumPezzNotNumber(){
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
    public void testInserimentoProdottoNumPezzNegativ(){
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
    public void testInserimentoProdottoPrezzoNotNumber(){
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
    public void testInserimentoProdottoPrezzoNegativ(){
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
    public void testInserimentoProdottoPrezzoZero(){
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
    public void testGetListaProdottiOK(){
        try{
            instance.listaProdotti();
            assert(true);
        }catch(Exception e){
            fail("non sono riuscito ad effettuare l'operazione");
        }
    }
    
    @Test
    public void testGetListaProdottiCateogiaOK(){
        try{
            instance.listaProdottiCatogoria("Completini");
            assert(true);
        }catch(Exception e){
            fail("non sono riuscito ad effettuare l'operazione");
        }
    }
    
    @Test
    public void testGetListaProdottiCategoriaNull(){
        try{
            instance.listaProdottiCatogoria("Scarpette");
            fail("sono riuscito a fare l'operazione");
        }catch(Exception e){
            assert(true);
        }
    }
    
    
    @Test 
    public void testRicercaProdottoOK(){
        try{
            instance.ricercaProdotto("inter");
            assert(true);
        }catch(Exception e){
            fail("non sono riuscito ad effettuate l'operazione");
        }
    }
    
    @Test
    public void testRicercaProdottoNULL(){
        try{
            instance.ricercaProdotto("Nike");
            fail("sono riuscito ad effettuare l'operazione");
        }catch(Exception e){
            assert(true);
        }
    }
    
    @Test
    public void testRicercaProdottoCategoriaOk(){
        try{
            instance.ricercaProdottoCategoria("inter", "Completini");
            assert(true);
        }catch(Exception e){
            fail("non sono riuscito ad effettuare l'operazione");
        }
    }
    
    @Test
    public void testRicercaProdottoCatecoriaNull(){
        try{
            instance.ricercaProdottoCategoria("Milan", "Completini");
            fail("sono riuscito ad effettuare l'operazione");
        }
        catch(Exception e ){
            assert(true);
        }
    }
    
}
