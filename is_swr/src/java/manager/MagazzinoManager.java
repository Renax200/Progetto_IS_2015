/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

import entità.Account;
import entità.Prodotto;
import exception.MagazzinoException;
import exception.NameException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author carfo
 */
public class MagazzinoManager {
    
    private static MagazzinoManager manager = null;
    private  static final String INSERISCI_PRODOTTO="INSERT INTO magazzino.prodotto(idProdotto,nome,descrizione,numero_pezzi,prezzo,categoria)VALUES(?,?,?,?,?,?)";
    private  static final String LISTA_PRODOTTI ="SELECT * FROM magazzino.prodotto ORDER BY idProdotto ASC";
    private  static final String LISTA_PRODOTTI_CATEGORIA ="SELECT * FROM magazzino.prodotto WHERE categoria=? ORDER BY idProdotto ASC";
  
    public static MagazzinoManager getInstance(){
      if(manager == null) {
         manager = new MagazzinoManager();
        }
      return manager;
    }
            
    public synchronized void inserisciProdotto(int idProdotto,String nome,String descrizione,
              int numero_pezzi,float prezzo,String categoria) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, NameException, MagazzinoException{
        
        Connection conn = null;  
        PreparedStatement ps = null;  
        ResultSet rs = null;
        int res;
        
        String url = "jdbc:mysql://localhost:3306/";  
        String dbName = "magazzino";  
        String driver = "com.mysql.jdbc.Driver";  
        String userName = "root";  
        String password = "esameIs";  
        
        try {  
           Class.forName(driver).newInstance();  
           conn = DriverManager.getConnection(url + dbName, userName, password);  
                
           Statement st = conn.createStatement();
           String sql = INSERISCI_PRODOTTO;
                  
           ps = conn.prepareStatement(sql);
           ps.setInt(1, testIdProdotto(idProdotto));
           ps.setString(2, testNome(nome));
           ps.setString(3, testDescrizione(descrizione));
           ps.setInt(4, testNumPezzi(numero_pezzi));
           ps.setFloat(5, testPrezzo(prezzo));
           ps.setString(6, testCategoria(categoria));
          
           if(ps.executeUpdate()!= 1){
               throw new MagazzinoException("Errore nell'inserimento");
           }    
           
        } finally {  
            if (conn != null) {  
                try {  
                    conn.close();  
                } catch (SQLException e) {  
                    e.printStackTrace();  
                }  
            }  
            if (ps != null) {  
                try {  
                    ps.close();  
                } catch (SQLException e) {  
                    e.printStackTrace();  
                }  
            }  
            if (rs != null) {  
                try {  
                    rs.close();  
                } catch (SQLException e) {  
                    e.printStackTrace();  
                }  
            }  
        }  
    }
    
    public ArrayList<Prodotto> listaProdotti() throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, MagazzinoException{
         Connection conn = null;  
        PreparedStatement ps = null;  
        
        ResultSet rs = null;  
  
        String url = "jdbc:mysql://localhost:3306/";  
        String dbName = "magazzino";  
        String driver = "com.mysql.jdbc.Driver";  
        String userName = "root";  
        String password = "esameIs";  
        
        ArrayList<Prodotto> prodotti = null;
        Prodotto p = null;
        
        try {  
            Class.forName(driver).newInstance();  
            conn = DriverManager.getConnection(url + dbName, userName, password);  
            String sql = LISTA_PRODOTTI;
            Statement st = conn.createStatement();
            ps = conn.prepareStatement(sql);
            
            rs = ps.executeQuery();
            prodotti = new ArrayList<Prodotto>();
            
            while(rs.next()){
                p = new Prodotto();
                p.setIdProdotto(rs.getInt("idProdotto"));
                p.setNome(rs.getString("nome"));
                p.setDescrizione(rs.getString("descrizione"));
                p.setNumeroPezzi(rs.getInt("numero_pezzi"));
                p.setPrezzo(rs.getFloat("prezzo"));
                p.setCategoria(rs.getString("categoria"));
                prodotti.add(p);
            }
            
            if(prodotti.size()!= 0){
                return prodotti;
            }else{
                throw new MagazzinoException("Non sono presenti prodotti in Magazzino");
            }
            
        } finally {  
            if (conn != null) {  
                try {  
                    conn.close();  
                } catch (SQLException e) {  
                    e.printStackTrace();  
                }  
            }  
            if (ps != null) {  
                try {  
                    ps.close();  
                } catch (SQLException e) {  
                    e.printStackTrace();  
                }  
            }  
            if (rs != null) {  
                try {  
                    rs.close();  
                } catch (SQLException e) {  
                    e.printStackTrace();  
                }  
            }  
        }  
        
    }
    
public synchronized ArrayList<Prodotto> listaProdottiCatogoria(String cat) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException, MagazzinoException{
         Connection conn = null;  
        PreparedStatement ps = null;  
        ResultSet rs = null;  
        
  
        String url = "jdbc:mysql://localhost:3306/";  
        String dbName = "magazzino";  
        String driver = "com.mysql.jdbc.Driver";  
        String userName = "root";  
        String password = "esameIs";  
        ArrayList<Prodotto> prodotti = null;
        Prodotto p = null;
        try {  
            Class.forName(driver).newInstance();  
            conn = DriverManager.getConnection(url + dbName, userName, password);  
            String sql = LISTA_PRODOTTI_CATEGORIA;
            Statement st = conn.createStatement();
            ps = conn.prepareStatement(sql);
            ps.setString(1, cat);
            rs = ps.executeQuery();
            prodotti = new ArrayList<Prodotto>();
            
            while(rs.next()){
                p = new Prodotto();
                p.setIdProdotto(rs.getInt("idProdotto"));
                p.setNome(rs.getString("nome"));
                p.setDescrizione(rs.getString("descrizione"));
                p.setNumeroPezzi(rs.getInt("numero_pezzi"));
                p.setPrezzo(rs.getFloat("prezzo"));
                p.setCategoria(rs.getString("categoria"));
                prodotti.add(p);
            }
          
            if(prodotti.size() == 0){
                throw new MagazzinoException("Non ci sono prodotti relativi a questa categoria");
            }
           
        }finally {  
            if (conn != null) {  
                try {  
                    conn.close();  
                } catch (SQLException e) {  
                    e.printStackTrace();  
                }  
            }  
            if (ps != null) {  
                try {  
                    ps.close();  
                } catch (SQLException e) {  
                    e.printStackTrace();  
                }  
            }  
            if (rs != null) {  
                try {  
                    rs.close();  
                } catch (SQLException e) {  
                    e.printStackTrace();  
                }  
            }  
        }  
        return prodotti;
    }

    public synchronized ArrayList<Prodotto> ricercaProdotto(String ric) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException, MagazzinoException{
        
        Connection conn = null;  
        PreparedStatement ps = null;  
        
        ResultSet rs = null;  
  
        String url = "jdbc:mysql://localhost:3306/";  
        String dbName = "magazzino";  
        String driver = "com.mysql.jdbc.Driver";  
        String userName = "root";  
        String password = "esameIs";  
        ArrayList<Prodotto> prodotti = null;
        Prodotto p = null;
        try {  
            Class.forName(driver).newInstance();  
            conn = DriverManager.getConnection(url + dbName, userName, password);  
           
 String sql = "SELECT * FROM magazzino.prodotto WHERE nome LIKE '%"+ric+"%' OR descrizione LIKE '%"+ric+"%' ORDER BY idProdotto ASC";
                        Statement st = conn.createStatement();
                        ps = conn.prepareStatement(sql);
         
                        rs = ps.executeQuery();
                        prodotti = new ArrayList<Prodotto>();

                    while(rs.next()){
                        p = new Prodotto();
                        p.setIdProdotto(rs.getInt("idProdotto"));
                        p.setNome(rs.getString("nome"));
                        p.setDescrizione(rs.getString("descrizione"));
                        p.setNumeroPezzi(rs.getInt("numero_pezzi"));
                        p.setPrezzo(rs.getFloat("prezzo"));
                        p.setCategoria(rs.getString("categoria"));
                        prodotti.add(p);
                    }
                  
             if(prodotti.size()!= 0){
                 return prodotti;
             }
             else{
                 throw new MagazzinoException("Non ci sono prodotti che rispondano ai requisiti richiesti");
             }
                    
        } finally {  
            if (conn != null) {  
                try {  
                    conn.close();  
                } catch (SQLException e) {  
                    e.printStackTrace();  
                }  
            }  
            if (ps != null) {  
                try {  
                    ps.close();  
                } catch (SQLException e) {  
                    e.printStackTrace();  
                }  
            }  
            if (rs != null) {  
                try {  
                    rs.close();  
                } catch (SQLException e) {  
                    e.printStackTrace();  
                }  
            }  
        }  
    }
    
    
   
 public synchronized ArrayList<Prodotto> ricercaProdottoCategoria(String ric, String categoria) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException, MagazzinoException{
        
        Connection conn = null;  
        PreparedStatement ps = null;  
        ResultSet rs = null;  
  
        String url = "jdbc:mysql://localhost:3306/";  
        String dbName = "magazzino";  
        String driver = "com.mysql.jdbc.Driver";  
        String userName = "root";  
        String password = "esameIs";  
        ArrayList<Prodotto> prodotti = null;
        Prodotto p = null;
        
        try {  
            Class.forName(driver).newInstance();  
            conn = DriverManager.getConnection(url + dbName, userName, password);  
           
                        String sql = "SELECT * FROM magazzino.prodotto WHERE categoria ='"+categoria+"' AND nome LIKE '%"+ric+"%' OR descrizione LIKE '%"+ric+"%' ORDER BY idProdotto ASC";
                        Statement st = conn.createStatement();
                        ps = conn.prepareStatement(sql);
                        rs = ps.executeQuery();
                        prodotti = new ArrayList<Prodotto>();

                    while(rs.next()){
                        p = new Prodotto();
                        p.setIdProdotto(rs.getInt("idProdotto"));
                        p.setNome(rs.getString("nome"));
                        p.setDescrizione(rs.getString("descrizione"));
                        p.setNumeroPezzi(rs.getInt("numero_pezzi"));
                        p.setPrezzo(rs.getFloat("prezzo"));
                        p.setCategoria(rs.getString("categoria"));
                        prodotti.add(p);
                    }
                  
              if(prodotti.size()!=0){
                  return prodotti;
              }
              else{
                  throw new MagazzinoException("Non ci sono prodotti in questa categoria che corrispondano ai requisiti richiesti");
              }
           
        } finally {  
            if (conn != null) {  
                try {  
                    conn.close();  
                } catch (SQLException e) {  
                    e.printStackTrace();  
                }  
            }  
            if (ps != null) {  
                try {  
                    ps.close();  
                } catch (SQLException e) {  
                    e.printStackTrace();  
                }  
            }  
            if (rs != null) {  
                try {  
                    rs.close();  
                } catch (SQLException e) {  
                    e.printStackTrace();  
                }  
            }  
        }  
    }
       
  
       // test
       
       private static String testNome(String name) throws NameException {
        if (name.isEmpty() || (name.length() < 1) || (name.length() > 25)) {
            throw new NameException("Errore lughezza Nome");
        }
        int n = name.length();
        char c;
        for (int i = 0; i < n; i++) {
            c = name.substring(i, i + 1).charAt(0);
            if (!Character.isLetter(c) && !Character.isSpaceChar(c)) {
                throw new NameException("Errore formato Nome");
            }
        }
        return name;
    }
       
    private static String testCategoria(String categoria) throws NameException {
        if (categoria.isEmpty() || (categoria.length() < 1) || (categoria.length() > 25)) {
            throw new NameException("Errore lughezza Categoria");
        }
        int n = categoria.length();
        char c;
        for (int i = 0; i < n; i++) {
            c = categoria.substring(i, i + 1).charAt(0);
            if (!Character.isLetter(c) && !Character.isSpaceChar(c)) {
                throw new NameException("Errore formato Categoria");
            }
        }
        return categoria;
    }
       
    
    private static String testDescrizione(String desk) throws NameException {
        if ((desk.length() > 45)) {
            throw new NameException("Errore lughezza Categoria");
        }
        return desk;
    }
    
    
    
    private static float testPrezzo(float s) throws NameException {
       
        if (s > 0 ) {
            return s;
        }else{
            throw new NameException("Errore prezzo minore o uguale di zero");
        }
        
    }  
    
    private static int testIdProdotto(int s) throws NameException {
       
        if (s  >  0 ) {
            return s;
        }else{
            throw new NameException("Errore idProdotto minore o uguale di zero");
        }
        
    }  
    
    
    private static int testNumPezzi(int s) throws NameException {
       
        if (s  >=  0 ) {
            return s;
        }else{
            throw new NameException("Errore Numero pezzi minore o uguale di zero");
        }
        
    }    
       
}
