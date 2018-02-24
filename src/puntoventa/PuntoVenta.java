/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntoventa;
import java.sql.*;

/**
 *
 * @author Usuario
 */
public class PuntoVenta {
   
   Connection conectar = null;
   public Connection conexion(){
       try{
           Class.forName("com.mysql.jdbc.Driver");
           conectar=DriverManager.getConnection("jdbc:mysql://localhost/test-db", "root", "");
       }
       catch(ClassNotFoundException | SQLException e) {
           System.out.print(e.getMessage());
       }
       return conectar;
   }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
