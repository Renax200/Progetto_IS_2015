/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Managers;
  
import Entità.Account;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Carfora Andrea
 */
public class AccountManager {

   
    public void visualizzaAccount(){
      
    }
    
    
    public Account logIn(String email, String pass){
     
        Connection conn = null;  
        PreparedStatement ps = null;  
        ResultSet rs = null;  
        String mail=null;
        String passr=null;
        String nome=null;
        String cognome=null;
        String societa=null;
        String partitaIva=null;
        String tipo=null;
  
        String url = "jdbc:mysql://localhost:3306/";  
        String dbName = "magazzino";  
        String driver = "com.mysql.jdbc.Driver";  
        String userName = "root";  
        String password = "esameIs";  
        
        try {  
            Class.forName(driver).newInstance();  
            conn = DriverManager.getConnection(url + dbName, userName, password);  
            
            String sql = "select * from account where email=? and password=?"; 
            
            Statement st = conn.createStatement();
            ps = conn.prepareStatement(sql);
            ps.setString(1, email);  
            ps.setString(2, pass);  
            rs = ps.executeQuery();
          
              Account account = new Account();
            while(rs.next()){
                 mail = rs.getString("email");
                 passr = rs.getString("password");
                 nome = rs.getString("nome");
                 cognome = rs.getString("cognome");
                 partitaIva = rs.getString("partita_iva");
                 societa = rs.getString("nome_società");
                 tipo = rs.getString("tipo");
            }
            
                account.setEmail(mail);
                account.setPassword(passr);
                account.setNome(nome);
                account.setCognome(cognome);
                account.setPartitaIva(partitaIva);
                account.setSocieta(societa);
                account.setTipo(tipo);
            
           return account;
           
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
        return null;
    }
    
    
    public void logOut(){
        
    }
    public int creaAccount(String nome,String cognome,String email,String pass,String societa,String partitaIva,String tipo){
        
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
           String sql = "INSERT INTO magazzino.account (email, password, nome, cognome, nome_società, partita_iva, tipo) VALUES"
                   +"(?,?,?,?,?,?,?)";
                  
           ps = conn.prepareStatement(sql);
           ps.setString(1, email);
           ps.setString(2, pass);
           ps.setString(3, nome);
           ps.setString(4, cognome);
           ps.setString(5, societa);
           ps.setString(6, partitaIva);
           ps.setString(7, tipo);
       
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
    
    public void eliminaAccount(){
        
    }
    
}
