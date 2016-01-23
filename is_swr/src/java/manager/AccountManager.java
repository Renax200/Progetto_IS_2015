/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;
import entità.Account;
import exception.*;
import com.sun.mail.iap.ConnectionException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Carfora Andrea
 */
public class AccountManager {

    private static AccountManager manager = null;
    private static final String LOGIN ="SELECT * FROM magazzino.account WHERE email=? and password=?"; 
    private static final String CREA_ACCOUNT="INSERT INTO magazzino.account (email, password, nome,cognome,nome_società,indirizzo,tipo,partita_iva)VALUES(?,?,?,?,?,?,?,?)";     
    private static final String ELIMINA_ACCOUNT="DELETE FROM magazzino.account WHERE email=?";
    
    public static AccountManager getInstance(){
      if(manager == null) {
         manager = new AccountManager();
      }
      return manager;
   }
    
    public synchronized Account logIn(String email, String pass)throws SQLException, ConnectionException,
            ClassNotFoundException, EmailException, PasswordException, NullAccountException, InstantiationException, IllegalAccessException{
     
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
        String indirizzo = null;
  
        String url = "jdbc:mysql://localhost:3306/";  
        String dbName = "magazzino";  
        String driver = "com.mysql.jdbc.Driver";  
        String userName = "root";  
        String password = "esameIs";  
        Account account = null;
        try {  
            Class.forName(driver).newInstance();  
            conn = DriverManager.getConnection(url + dbName, userName, password); 
            
            if (conn == null) {
                throw new ConnectionException();
            }
            
            String sql = LOGIN;
            
            Statement st = conn.createStatement();
            ps = conn.prepareStatement(sql);
            ps.setString(1, testEmail(email));  
            ps.setString(2, testPassword(pass));  
            rs = ps.executeQuery();
          
           
            if(rs.next()){
                 account = new Account();
                 mail = rs.getString("email");
                 passr = rs.getString("password");
                 nome = rs.getString("nome");
                 cognome = rs.getString("cognome");
                 partitaIva = rs.getString("partita_iva");
                 societa = rs.getString("nome_società");
                 indirizzo = rs.getString("indirizzo");
                 tipo = rs.getString("tipo");
                 account.setEmail(mail);
                 account.setPassword(passr);
                 account.setNome(nome);
                 account.setCognome(cognome);
                 account.setPartitaIva(partitaIva);
                 account.setSocieta(societa);
                 account.setIndirizzo(indirizzo);
                 account.setTipo(tipo);
                 return testAccount(account);
            }
            else{
                throw new EmailException("Email o Password errate ");
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
    
    
    public synchronized Account creaAccount(String nome,String cognome,String email,String pass,
            String societa,String indirizzo,String tipo,String partitaIva)throws SQLException, ConnectionException,
            ClassNotFoundException, EmailException, NullAccountException, PasswordException,
			NameException, SocietaException, PIvaException, InstantiationException, IllegalAccessException{
        
        Connection conn = null;  
        PreparedStatement ps = null;  
        ResultSet rs = null;
        int res;
        System.out.println(societa);
        String url = "jdbc:mysql://localhost:3306/";  
        String dbName = "magazzino";  
        String driver = "com.mysql.jdbc.Driver";  
        String userName = "root";  
        String password = "esameIs";  
        
        try {  
           Class.forName(driver).newInstance();  
           conn = DriverManager.getConnection(url + dbName, userName, password);  
                
           Statement st = conn.createStatement();
           String sql = CREA_ACCOUNT;
                  
           ps = conn.prepareStatement(sql);
           ps.setString(1, testEmail(email));
           ps.setString(2, testPassword(pass));
           ps.setString(3, testNome(nome));
           ps.setString(4, testCognome(cognome));
           ps.setString(5, testSocieta(societa));
           ps.setString(6, testIndirizzoSocieta(indirizzo));
           ps.setString(7, tipo);
           ps.setString(8, testPartitaIva(partitaIva));
           
       
          if(ps.executeUpdate() != 0){
              Account account = new Account(email,pass,nome,cognome,societa,indirizzo,tipo,partitaIva);
              return testAccount(account);
          }
          else{
              throw new EmailException("Errore durante l'inserimento dei parametri si prega di riprovare");
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
    
    public synchronized void eliminaAccount(Account account) throws ClassNotFoundException, InstantiationException, SQLException, IllegalAccessException, EmailException{
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
           String sql = ELIMINA_ACCOUNT;
            
            ps = conn.prepareStatement(sql);
            ps.setString(1, account.getEmail());
            
            if(ps.executeUpdate()== 0){
                throw new EmailException("Errore durante l'eliminazione");
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
    
        //test
    
    
    private static Account testAccount(Account account) throws NullAccountException {
        if (account == null) {
            throw new NullAccountException("Non è presente nessun account con questi requisiti");
        }
        return account;
    }
    
    private static String testEmail(String email) throws EmailException {
        if ((email.length() > 50) || (email.isEmpty()) || email==null || (email.length() < 5) || !(email.contains("@"))) {
            throw new EmailException("Formato Email Errato");
        }
        return email;
    }


    private static String testPassword(String pass) throws PasswordException {
        if ((pass.length() > 16) || (pass.length() < 8)) {
            throw new PasswordException("Errore lunghezza password");
        }
        return pass;
    }

   
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

    private static String testCognome(String surname) throws NameException {
        if (surname.isEmpty() || (surname.length() < 1) || (surname.length() > 25)) {
            throw new NameException("Errore Lunghezza Cognome");
        }
        int n = surname.length();
        char c;
        for (int i = 0; i < n; i++) {
            c = surname.substring(i, i + 1).charAt(0);
            if (!Character.isLetter(c) && !Character.isSpaceChar(c)) {
                throw new NameException("Errore formato Congnome");
            }
        }
        return surname;
    }
    
    private static String testPartitaIva(String pIva) throws PIvaException {
        if (pIva.isEmpty() || (pIva.length() < 11) || (pIva.length() > 11)) {
            throw new PIvaException("Errore Lunghezza Partita Iva");
        }
        int n = pIva.length();
        char c;
        for (int i = 0; i < n; i++) {
            c = pIva.substring(i, i + 1).charAt(0);
            if (Character.isLetter(c) || Character.isSpaceChar(c)) {
                throw new PIvaException("Errore formato partità Iva");
            }
        }
        return pIva;
    }
    
    private static String testSocieta(String societa) throws SocietaException {
        if ((societa.length() < 1) || (societa.length() > 45) ) {
            throw new SocietaException("Lunghezza nome Società non conforme");
        }
        return societa;
    }
    
    private static String testIndirizzoSocieta(String societa) throws SocietaException {
        if (societa.isEmpty() || (societa.length() < 1) || (societa.length() > 25)) {
            throw new SocietaException("Lunghezza nome Società non conforme");
        }
        return societa;
    }
    
    
    
    
}
