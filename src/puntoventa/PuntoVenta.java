/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntoventa;
import Ventanas.Inventario;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

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
           JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de coneccion", JOptionPane.ERROR_MESSAGE);
       }
       return conectar;
   } 
   /* public void desconectar(){
        conectar = null;
        if (conectar == null){
            System.out.println("Coneccion terminada..");
    
        }
    }*/
    
    
}
