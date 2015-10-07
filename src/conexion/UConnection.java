/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author crackz
 */
public class UConnection {
    
    private static Connection con=null;
    
    public static Connection getConnection(){
      
        try{
        
            if(con == null){
            
                Runtime.getRuntime().addShutdownHook(new MiShDwnHook());
                
                String driver = "com.mysql.jdbc.Driver";
                String url = "jdbc:mysql://localhost/catalogo";
                String user = "crackz";
                String pass = "Cartelrifa10";
                
                Class.forName(driver);
                con = DriverManager.getConnection(url,user,pass);
            }
        
            return con;        
            
        } catch(ClassNotFoundException | SQLException ex){
        
            ex.printStackTrace();
            throw new RuntimeException("Error al crear la conexion",ex);
            
        }
    }
    
    static class MiShDwnHook extends Thread{
    
        public void run(){
        
            try{
            
                Connection con = UConnection.getConnection();
                con.close();
            
            } catch(Exception ex){
            
                ex.printStackTrace();
                throw new RuntimeException(ex);
            }
        
        }
    
    }
    
    
    
}
