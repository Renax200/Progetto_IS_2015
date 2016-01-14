/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Managers;

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
public class CarrelloManager {
    
    private static final String RICERCA_PRODOTTO_DA_INSERIRE ="SELECT * FROM magazzino.prodotto WHERE idProdotto=?";
    
     public static Prodotto getProdottoDaInserire(int num){
         Connection conn = null;  
        PreparedStatement ps = null;  
        
        ResultSet rs = null;  
  
        String url = "jdbc:mysql://localhost:3306/";  
        String dbName = "magazzino";  
        String driver = "com.mysql.jdbc.Driver";  
        String userName = "root";  
        String password = "esameIs";  
        
        Prodotto p = null;
        try {  
            Class.forName(driver).newInstance();  
            conn = DriverManager.getConnection(url + dbName, userName, password);  
          
                        String sql = RICERCA_PRODOTTO_DA_INSERIRE;
                        Statement st = conn.createStatement();
                        ps = conn.prepareStatement(sql);
                        ps.setInt(1, num);
                        rs = ps.executeQuery();
                    while(rs.next()){
                        p = new Prodotto();
                        p.setIdProdotto(rs.getInt("idProdotto"));
                        p.setNome(rs.getString("nome"));
                        p.setNumeroPezzi(rs.getInt("numero_pezzi"));
                        p.setPrezzo(rs.getFloat("prezzo"));
                        p.setCategoria(rs.getString("categoria"));
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
        return p;
    }
    
}
