/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frmMenu;

import ClasesPrincipales.Productos;
import ConexionSQLDB.DataBaseConexion;
import ConexionSQLDB.ProductosDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aaron
 */
public class Producto extends javax.swing.JFrame {

    ArrayList<ClasesPrincipales.Productos> producto;
    ProductosDB db = new ProductosDB();

    /**
     * Creates new form Productos
     */
    public Producto() {
        initComponents();
    }

    public void listarDatos() {
        producto = db.ListProducto();
        DefaultTableModel tb = (DefaultTableModel) tblProductos.getModel();
        for (ClasesPrincipales.Productos pr : producto) {
            tb.addRow(new Object[]{pr.getProducto_id(), pr.getNombre_producto(), pr.getCantidad_vendida(), pr.getPrecio_producto(), pr.getMantenimiento_anual(),
                pr.getMantenimiento_trimestral(), pr.getSucursal_id()});
        }
    }

    public void limpiarFormulario() {
        DefaultTableModel tb = (DefaultTableModel) tblProductos.getModel();
        for (int i = tb.getRowCount() - 1; i >= 0; i--) {
            tb.removeRow(i);
        }
    }

    public void limpiaTxt() {
        txtproducto_id.setText(null);
        txtnombre_producto.setText(null);
        txtcantidad_vendida.setText(null);
        txtprecio_producto.setText(null);
        txtmantenimiento_anual.setText(null);
        txtmantenimiento_trimestral.setText(null);
        txtsucursal_id.setText(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        sucursal_id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        mantenimiento_trimestral = new javax.swing.JTextField();
        mantenimiento_anual = new javax.swing.JTextField();
        precio_producto = new javax.swing.JTextField();
        cantidad_vendida = new javax.swing.JTextField();
        nombre_producto = new javax.swing.JTextField();
        producto_id = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        btnListar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtproducto_id = new javax.swing.JTextField();
        txtnombre_producto = new javax.swing.JTextField();
        txtcantidad_vendida = new javax.swing.JTextField();
        txtprecio_producto = new javax.swing.JTextField();
        txtmantenimiento_anual = new javax.swing.JTextField();
        txtmantenimiento_trimestral = new javax.swing.JTextField();
        txtsucursal_id = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();

        jLabel1.setText("ID del Producto");

        jLabel2.setText("Nombre");

        jLabel3.setText("Cantidad Vendida");

        jLabel4.setText("Precio");

        jLabel5.setText("Mantenimiento Anual");

        jLabel7.setText("Mantenimiento Trimestral");

        jLabel6.setText("ID de la Sucursal");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PRODUCTO_ID", "NOMBRE_PRODUCTO", "CANTIDAD_VENDIDA", "PRECIO_PRODUCTO", "MANTENIMIENTO_ANUAL", "MANTENIMIENTO_TRIMESTRAL", "SUCURSAL_ID"
            }
        ));
        jScrollPane1.setViewportView(tblProductos);

        btnListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/listinfo.png"))); // NOI18N
        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        txtproducto_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtproducto_idActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("ID del Producto");

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Nombre");

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Cantidad Vendida");

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Precio");

        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Mantenimiento Anual");

        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Mantenimiento Trimestral");

        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("ID de la Sucursal");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(108, 108, 108)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnombre_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtproducto_id, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtsucursal_id, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(317, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcantidad_vendida, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtprecio_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmantenimiento_anual, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmantenimiento_trimestral, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtproducto_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnombre_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcantidad_vendida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtprecio_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmantenimiento_anual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmantenimiento_trimestral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsucursal_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Save_37110.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscar.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete (2).png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/aircone.png"))); // NOI18N
        btnAtras.setText("Atrás");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        btnModificar.setText("modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(btnModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnListar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnModificar))
                    .addComponent(btnAtras))
                .addGap(63, 63, 63))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        limpiarFormulario();
        listarDatos();
    }//GEN-LAST:event_btnListarActionPerformed

    private void txtproducto_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtproducto_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtproducto_idActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        Productos pr = new Productos();

        pr.setProducto_id(Integer.parseInt(txtproducto_id.getText()));
        pr.setNombre_producto(txtnombre_producto.getText());
        pr.setCantidad_vendida(Integer.parseInt(txtcantidad_vendida.getText()));
        pr.setPrecio_producto(Integer.parseInt(txtprecio_producto.getText()));
        pr.setMantenimiento_anual(Integer.parseInt(txtmantenimiento_anual.getText()));
        pr.setMantenimiento_trimestral(Integer.parseInt(txtmantenimiento_trimestral.getText()));
        pr.setSucursal_id(Integer.parseInt(txtsucursal_id.getText()));
        if (!"".equals(txtproducto_id.getText()) && !"".equals(txtnombre_producto.getText()) && !"".equals(txtcantidad_vendida.getText()) && !"".equals(txtprecio_producto.getText()) && !"".equals(txtmantenimiento_anual.getText()) && !"".equals(txtmantenimiento_trimestral.getText()) && !"".equals(txtsucursal_id.getText())) {
            JOptionPane.showMessageDialog(this, "Datos Inresados correctamente", "", JOptionPane.INFORMATION_MESSAGE);
            db.insertarProductos(pr);
            limpiarFormulario();
            listarDatos();
        } else {
            JOptionPane.showMessageDialog(this, "Falta Ingresar Datos", "", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    @SuppressWarnings("deprecation")
    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        menu ir = new menu();
        ir.setVisible(true);
        hide();

    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            Connection cnx = DataBaseConexion.getConnection();
            PreparedStatement ps = cnx.prepareStatement("DELETE FROM INVENTARIO_PRODUCTO WHERE PRODUCTO_ID=?");
            ps.setString(1, txtproducto_id.getText());
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Registro borrado");
            } else {
                JOptionPane.showMessageDialog(null, "Error en borrado");
            }
            cnx.close();
            limpiaTxt();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Error en Eliminar");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            Connection cnx = DataBaseConexion.getConnection();
            PreparedStatement ps = cnx.prepareStatement("SELECT * FROM INVENTARIO_PRODUCTO WHERE PRODUCTO_ID=?");
            ps.setString(1, txtproducto_id.getText());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                txtproducto_id.setText(rs.getString("PRODUCTO_ID"));
                txtnombre_producto.setText(rs.getString("NOMBRE_PRODUCTO"));
                txtcantidad_vendida.setText(rs.getString("CANTIDAD_VENDIDA"));
                txtprecio_producto.setText(rs.getString("PRECIO_PRODUCTO"));
                txtmantenimiento_anual.setText(rs.getString("MANTENIMIENTO_ANUAL"));
                txtmantenimiento_trimestral.setText(rs.getString("MANTENIMIENTO_TRIMESTRAL"));
                txtsucursal_id.setText(rs.getString("SUCURSAL_ID"));

            } else {
                JOptionPane.showMessageDialog(null, "EL ID DE PRODUCTO NO ESTÁ REGISTRADO");
            }
            cnx.close();
            //aca no va limpiar 

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en Buscar");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        try {
            Connection cnx = DataBaseConexion.getConnection();
            PreparedStatement ps = cnx.prepareStatement("UPDATE INVENTARIO_PRODUCTO SET "
                    + "PRODUCTO_ID=?, NOMBRE_PRODUCTO=?, CANTIDAD_VENDIDA=?, PRECIO_PRODUCTO=?, MANTENIMIENTO_ANUAL=?, MANTENIMIENTO_TRIMESTRAL=?, SUCURSAL_ID=?"
                    + "WHERE PRODUCTO_ID=?");
            ps.setString(8, txtproducto_id.getText());
            ps.setString(1, txtproducto_id.getText());
            ps.setString(2, txtnombre_producto.getText());
            ps.setString(3, txtcantidad_vendida.getText());
            ps.setString(4, txtprecio_producto.getText());
            ps.setString(5, txtmantenimiento_anual.getText());
            ps.setString(6, txtmantenimiento_trimestral.getText());
            ps.setString(7, txtsucursal_id.getText());
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Registro modificado");
            } else {
                JOptionPane.showMessageDialog(null, "Error en modificado");
            }
            cnx.close();
            limpiaTxt();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en Buscar");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

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
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Producto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JTextField cantidad_vendida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mantenimiento_anual;
    private javax.swing.JTextField mantenimiento_trimestral;
    private javax.swing.JTextField nombre_producto;
    private javax.swing.JTextField precio_producto;
    private javax.swing.JTextField producto_id;
    private javax.swing.JTextField sucursal_id;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextField txtcantidad_vendida;
    private javax.swing.JTextField txtmantenimiento_anual;
    private javax.swing.JTextField txtmantenimiento_trimestral;
    private javax.swing.JTextField txtnombre_producto;
    private javax.swing.JTextField txtprecio_producto;
    private javax.swing.JTextField txtproducto_id;
    private javax.swing.JTextField txtsucursal_id;
    // End of variables declaration//GEN-END:variables
}
