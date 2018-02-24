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
   //pinche puto
   Connection conectar = null;
   public Connection conexion(){
       try{
           Class.forName("com.mysql.jdbc.Driver");
           conectar=DriverManager.getConnection("jdbc:mysql://localhost/puntoventa", "root", "");
           System.out.println("Coneccion establecida..");
       }
       catch(ClassNotFoundException | SQLException e) {
           System.out.print(e.getMessage());
       }
       return conectar;
   } 
   public void desconectar(){
        conectar = null;
        if (conectar == null){
            System.out.println("Coneccion terminada..");
    
        }
    }
}
