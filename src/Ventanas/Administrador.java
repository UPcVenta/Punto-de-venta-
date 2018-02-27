/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import puntoventa.PuntoVenta;

/**
 *
 * @author Milh
 */
public class Administrador extends javax.swing.JFrame {
    PuntoVenta con = new PuntoVenta();
    Connection reg = con.conexion();
    /**
     * Creates new form ServicioUser
     */
    public Administrador() {
        initComponents();
        //TotalPago.setText("$"+ "Variable");
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Titulo = new javax.swing.JLabel();
        Cant = new javax.swing.JLabel();
        Cantidad = new javax.swing.JTextField();
        NomProducto = new javax.swing.JLabel();
        Producto = new javax.swing.JTextField();
        Agregar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Total = new javax.swing.JLabel();
        TotalPago = new javax.swing.JLabel();
        Cobrar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaAdmi = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        Opciones = new javax.swing.JMenu();
        closeUsr = new javax.swing.JMenuItem();
        CrearUSer = new javax.swing.JMenuItem();
        Almacen = new javax.swing.JMenuItem();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Titulo.setFont(new java.awt.Font("Cambria", 0, 70)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 0, 0));
        Titulo.setText("Caja Registradora");

        Cant.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Cant.setText("Cantidad:");

        Cantidad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        NomProducto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NomProducto.setText("Nombre o Codigo del producto:");

        Producto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        Agregar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Agregar.setText("Agregar");

        Eliminar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Eliminar.setText("Eliminar");

        Total.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Total.setText("Total a pagar:");

        TotalPago.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(Total)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TotalPago, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(157, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TotalPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Total)))
                .addGap(47, 47, 47))
        );

        Cobrar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Cobrar.setText("Cobrar");

        TablaAdmi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(TablaAdmi);

        Opciones.setText("Opciones Administrador");

        closeUsr.setText("Cerrar Sesión");
        closeUsr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                closeUsrMousePressed(evt);
            }
        });
        Opciones.add(closeUsr);

        CrearUSer.setText("Crear Usuario");
        CrearUSer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CrearUSerMousePressed(evt);
            }
        });
        Opciones.add(CrearUSer);

        Almacen.setText("Almacen");
        Almacen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AlmacenMousePressed(evt);
            }
        });
        Opciones.add(Almacen);

        jMenuBar1.add(Opciones);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(156, Short.MAX_VALUE)
                .addComponent(Titulo)
                .addGap(131, 131, 131))
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(Cobrar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Cant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NomProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addComponent(Agregar)
                        .addGap(35, 35, 35)
                        .addComponent(Eliminar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cant)
                    .addComponent(NomProducto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Agregar)
                    .addComponent(Eliminar))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Cobrar)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeUsrMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeUsrMousePressed
        // TODO add your handling code here:
        this.dispose();
        LoginUser log = new LoginUser ();
        log.setVisible(true);
    }//GEN-LAST:event_closeUsrMousePressed

    private void CrearUSerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrearUSerMousePressed
        // TODO add your handling code here:
        this.dispose();
        CrearUser mostrar = new CrearUser();
        mostrar.regresar = 1;
        mostrar.setVisible(true);
    }//GEN-LAST:event_CrearUSerMousePressed

    private void AlmacenMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AlmacenMousePressed
        // TODO add your handling code here:
        this.dispose();
        AdmiAlmacen admiAl = new AdmiAlmacen();
        
        String [] datos = new String [4];
        
        DefaultTableModel modelo= new DefaultTableModel();
        modelo.addColumn("CODIGO");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("CANTIDAD");
        modelo.addColumn("PRECIO UNITARIO $");
        Ventanas.AdmiAlmacen.TabInventario.setModel(modelo);
        
        try {
            Statement stmt = reg.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM productos");
            while(rs.next()){
                for(int i = 0; i < 4; i++)
                    datos[i] = rs.getString(i + 1);
                /*datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);*/
                modelo.addRow(datos);
            }
            Ventanas.AdmiAlmacen.TabInventario.setModel(modelo);
        } catch (SQLException ex) {
            
        }
        admiAl.setVisible(true);
    }//GEN-LAST:event_AlmacenMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JMenuItem Almacen;
    private javax.swing.JLabel Cant;
    private javax.swing.JTextField Cantidad;
    private javax.swing.JButton Cobrar;
    private javax.swing.JMenuItem CrearUSer;
    private javax.swing.JButton Eliminar;
    private javax.swing.JLabel NomProducto;
    private javax.swing.JMenu Opciones;
    private javax.swing.JTextField Producto;
    private javax.swing.JTable TablaAdmi;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel Total;
    private javax.swing.JLabel TotalPago;
    private javax.swing.JMenuItem closeUsr;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
