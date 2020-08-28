package PrimerParcialDBI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Kevin Flores
 */
public class inf_Productos extends javax.swing.JInternalFrame {

    /**
     * Creates new form inf_Cliente
     */
    public inf_Productos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBuscar = new javax.swing.JButton();
        txtbuscado = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtID_Proveedor = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtID_Producto = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        txtNombre_Producto = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        txtID_Inventario = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtExistencias = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Productos");
        setVisible(true);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel1.setText("ID Producto");

        jLabel4.setText("ID_Proveedor");

        jLabel5.setText("Precio");

        txtID_Proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtID_ProveedorActionPerformed(evt);
            }
        });

        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre Producto");

        jLabel3.setText("ID Inventario");

        txtID_Producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtID_ProductoActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        txtNombre_Producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombre_ProductoActionPerformed(evt);
            }
        });

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        txtID_Inventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtID_InventarioActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.setEnabled(false);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel6.setText("Existencias");

        txtExistencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExistenciasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtbuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtID_Proveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                                .addComponent(txtPrecio)
                                .addComponent(txtExistencias, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtID_Producto, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                                .addComponent(txtNombre_Producto)
                                .addComponent(txtID_Inventario)))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtID_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(txtID_Inventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtID_Proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtExistencias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnEliminar)
                    .addComponent(btnModificar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbuscado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(btnLimpiar))
                .addGap(24, 24, 24))
        );

        getAccessibleContext().setAccessibleName("Produrcto");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        try {
            Connection cn = DriverManager.getConnection(mdi_Principal.BD, mdi_Principal.Usuario, mdi_Principal.Contraseña);
            PreparedStatement pst = cn.prepareStatement("select * from producto where id_producto =?");
            pst.setString(1, txtbuscado.getText().trim());

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                txtNombre_Producto.setText(rs.getString("nombre_producto"));
                txtID_Inventario.setText(rs.getString("id_inventario"));
                txtID_Proveedor.setText(rs.getString("id_proveedor"));
                txtPrecio.setText(rs.getString("existencias"));
                txtExistencias.setText(rs.getString("precio"));

                btnModificar.setEnabled(true);
                btnEliminar.setEnabled(true);
                btnRegistrar.setEnabled(false);

            } else {
                JOptionPane.showMessageDialog(null, "Producto no registrado.");
            }

        } catch (Exception e) {

        }
        // tablas();
        // bitacora_busqueda();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtID_ProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtID_ProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtID_ProveedorActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void txtID_ProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtID_ProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtID_ProductoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        try {
            Connection cn = DriverManager.getConnection(mdi_Principal.BD, mdi_Principal.Usuario, mdi_Principal.Contraseña);
            PreparedStatement pst = cn.prepareStatement("delete from producto where id_producto = ?");

            pst.setString(1, txtbuscado.getText().trim());
            pst.executeUpdate();

            // bitacora_eliminar();
            JOptionPane.showMessageDialog(this, "¡ELIMINACION EXITOSA!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            txtID_Producto.setText("");
            txtNombre_Producto.setText("");
            txtID_Inventario.setText("");
            txtID_Proveedor.setText("");
            txtPrecio.setText("");
            txtExistencias.setText("");
            txtbuscado.setText("");

            btnRegistrar.setEnabled(true);
            btnModificar.setEnabled(false);
            btnEliminar.setEnabled(false);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error en Eliminacion", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtNombre_ProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombre_ProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre_ProductoActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        try {
            Connection cn = DriverManager.getConnection(mdi_Principal.BD, mdi_Principal.Usuario, mdi_Principal.Contraseña);
            //localhost es 127.0.0.1
            PreparedStatement pst = cn.prepareStatement("insert into producto values(?,?,?,?,?,?)");

            pst.setString(1, txtID_Producto.getText().trim());
            pst.setString(2, txtNombre_Producto.getText());
            pst.setString(3, txtID_Inventario.getText());
            pst.setString(4, txtID_Proveedor.getText().trim());
            pst.setString(5, txtPrecio.getText().trim());
            pst.setString(6, txtExistencias.getText().trim());

            //bitacora_guardar();
            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "¡REGISTRO EXITOSO!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            txtID_Producto.setText("");
            txtNombre_Producto.setText("");
            txtID_Inventario.setText("");
            txtID_Proveedor.setText("");
            txtPrecio.setText("");
            txtExistencias.setText("");
            txtbuscado.setText("");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error en registro", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtID_InventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtID_InventarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtID_InventarioActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        try {
            String ID = txtbuscado.getText().trim();

            Connection cn = DriverManager.getConnection(mdi_Principal.BD, mdi_Principal.Usuario, mdi_Principal.Contraseña);
            PreparedStatement pst = cn.prepareStatement("update producto set  nombre_producto = ?, id_inventario = ?, id_proveedor = ?, precio = ?, existencias =?  where id_producto =" + ID);

            pst.setString(1, txtNombre_Producto.getText());
            pst.setString(2, txtID_Inventario.getText());
            pst.setString(3, txtID_Proveedor.getText().trim());
            pst.setString(4, txtPrecio.getText());
            pst.setString(5, txtExistencias.getText());

            pst.executeUpdate();

            //bitacora_modificar();
            JOptionPane.showMessageDialog(this, "¡MODIFICACION EXITOSA!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            txtID_Producto.setText("");
            txtNombre_Producto.setText("");
            txtID_Inventario.setText("");
            txtID_Proveedor.setText("");
            txtPrecio.setText("");
            txtExistencias.setText("");
            txtbuscado.setText("");
            btnRegistrar.setEnabled(true);
            btnModificar.setEnabled(false);
            btnEliminar.setEnabled(false);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error en Modificacion", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtID_Producto.setText("");
        txtNombre_Producto.setText("");
        txtID_Inventario.setText("");
        txtID_Proveedor.setText("");
        txtPrecio.setText("");
        txtExistencias.setText("");
        txtbuscado.setText("");
        btnRegistrar.setEnabled(true);
        btnModificar.setEnabled(false);
        btnEliminar.setEnabled(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtExistenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExistenciasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtExistenciasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtExistencias;
    private javax.swing.JTextField txtID_Inventario;
    private javax.swing.JTextField txtID_Producto;
    private javax.swing.JTextField txtID_Proveedor;
    private javax.swing.JTextField txtNombre_Producto;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtbuscado;
    // End of variables declaration//GEN-END:variables
}
