/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Managers;

import Entità.Account;
import Entità.Prodotto;
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
    
    private  static String inserisciProdotto="INSERT INTO magazzino.prodotto(idProdotto,nome,descrizione,numero_pezzi,prezzo,categoria)VALUES(?,?,?,?,?,?)";
    private  static String listaProdotti ="SELECT * FROM magazzino.prodotto ORDER BY idProdotto ASC";
    private  static String listaProdottiCategoria ="SELECT * FROM magazzino.prodotto WHERE categoria=? ORDER BY idProdotto ASC";
     
    public static int inserisciProdotto(int idProdotto,String nome,String descrizione,
            int numero_pezzi,float prezzo,String categoria){
        
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
           String sql = inserisciProdotto;
                  
           ps = conn.prepareStatement(sql);
           ps.setInt(1, idProdotto);
           ps.setString(2, nome);
           ps.setString(3, descrizione);
           ps.setInt(4, numero_pezzi);
           ps.setFloat(5, prezzo);
           ps.setString(6, categoria);
          
       
           res = ps.executeUpdate();

          return res;     
           
        } catch (Exception e) {  
            System.out.println(e);  
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
        return 0;
    }
    
    public static ArrayList<Prodotto> listaProdotti(){
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
            String sql = listaProdotti;
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
           
        } catch (Exception e) {  
            System.out.println(e);  
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
        return prodotti;
    }
    
public static ArrayList<Prodotto> listaProdottiCatogoria(String cat){
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
            String sql = listaProdottiCategoria;
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
           
        } catch (Exception e) {  
            System.out.println(e);  
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
        return prodotti;
    }
   
}
