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
public class ClientiManager {
    
      private  static String LISTA_CLIENTI ="SELECT * FROM magazzino.account WHERE tipo='Cliente' ORDER BY cognome ASC";
      private static String RICERCA_CLIENTE="SELECT * FROM magazzino.account WHERE tipo='Cliente' AND nome LIKE ? OR nome_società LIKE ? ORDER BY cognome ASC";
  public static ArrayList<Account> listaClienti(){
        Connection conn = null;  
        PreparedStatement ps = null;  
        
        ResultSet rs = null;  
  
        String url = "jdbc:mysql://localhost:3306/";  
        String dbName = "magazzino";  
        String driver = "com.mysql.jdbc.Driver";  
        String userName = "root";  
        String password = "esameIs";  
        ArrayList<Account> clienti = null;
        Account a = null;
        try {  
            Class.forName(driver).newInstance();  
            conn = DriverManager.getConnection(url + dbName, userName, password);  
            String sql = LISTA_CLIENTI;
            Statement st = conn.createStatement();
            ps = conn.prepareStatement(sql);
            
            rs = ps.executeQuery();
            clienti = new ArrayList<Account>();
            
            while(rs.next()){
                a = new Account();
                a.setEmail(rs.getString("email"));
                a.setPassword(rs.getString("password"));
                a.setNome(rs.getString("nome"));
                a.setCognome(rs.getString("cognome"));
                a.setPartitaIva(rs.getString("partita_iva"));
                a.setSocieta(rs.getString("nome_società"));
                a.setTipo(rs.getString("tipo"));
                clienti.add(a);
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
        return clienti;
    }
  
  public static ArrayList<Account> ricercaAccount(String ric) {
      Connection conn = null;  
        PreparedStatement ps = null;  
        
        ResultSet rs = null;  
  
        String url = "jdbc:mysql://localhost:3306/";  
        String dbName = "magazzino";  
        String driver = "com.mysql.jdbc.Driver";  
        String userName = "root";  
        String password = "esameIs";  
        ArrayList<Account> clienti = null;
        Account a = null;
        try {  
            Class.forName(driver).newInstance();  
            conn = DriverManager.getConnection(url + dbName, userName, password);  
           
             
                        String sql = RICERCA_CLIENTE;
                        Statement st = conn.createStatement();
                        ps = conn.prepareStatement(sql);
                        ps.setString(1, ric);
                        ps.setString(2,ric);
                        rs = ps.executeQuery();
                        clienti = new ArrayList<Account>();

                    while(rs.next()){
                        a = new Account();
                        a.setEmail(rs.getString("email"));
                        a.setPassword(rs.getString("password"));
                        a.setNome(rs.getString("nome"));
                        a.setCognome(rs.getString("cognome"));
                        a.setPartitaIva(rs.getString("partita_iva"));
                        a.setSocieta(rs.getString("nome_società"));
                        a.setTipo(rs.getString("tipo"));
                        clienti.add(a);
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
        return clienti;
  }
}
