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
 * @author kievk
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
        txtTelefono_Cliente = new javax.swing.JTextField();
        txtEmail_Cliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNIT_Cliente = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        txtNombre_Cliente = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        txtDireccion_Cliente = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Clientes");
        setVisible(true);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel1.setText("NIT Cliente");

        jLabel4.setText("Telefono");

        jLabel5.setText("Email");

        txtTelefono_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefono_ClienteActionPerformed(evt);
            }
        });

        txtEmail_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmail_ClienteActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre Cliente");

        jLabel3.setText("Dirección Cliente");

        txtNIT_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNIT_ClienteActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        txtNombre_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombre_ClienteActionPerformed(evt);
            }
        });

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        txtDireccion_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccion_ClienteActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtTelefono_Cliente, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                                .addComponent(txtEmail_Cliente))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNIT_Cliente, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                                .addComponent(txtNombre_Cliente)
                                .addComponent(txtDireccion_Cliente))))
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
                                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNIT_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(txtDireccion_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtTelefono_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(txtEmail_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        try {
            Connection cn = DriverManager.getConnection(mdi_Principal.BD, mdi_Principal.Usuario, mdi_Principal.Contraseña);
            PreparedStatement pst = cn.prepareStatement("select * from cliente where nit_cliente =?");
            pst.setString(1, txtbuscado.getText().trim());

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                txtNombre_Cliente.setText(rs.getString("nombre"));
                txtDireccion_Cliente.setText(rs.getString("direccion"));
                txtTelefono_Cliente.setText(rs.getString("telefono"));
                txtEmail_Cliente.setText(rs.getString("correo"));

                btnModificar.setEnabled(true);
                btnEliminar.setEnabled(true);
                btnRegistrar.setEnabled(false);

            } else {
                JOptionPane.showMessageDialog(null, "Cliente no registrado.");
            }

        } catch (Exception e) {

        }
        // tablas();
        // bitacora_busqueda();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtTelefono_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefono_ClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefono_ClienteActionPerformed

    private void txtEmail_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmail_ClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmail_ClienteActionPerformed

    private void txtNIT_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNIT_ClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNIT_ClienteActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        try {
            Connection cn = DriverManager.getConnection(mdi_Principal.BD, mdi_Principal.Usuario, mdi_Principal.Contraseña);
            PreparedStatement pst = cn.prepareStatement("delete from cliente where nit_cliente = ?");

            pst.setString(1, txtbuscado.getText().trim());
            pst.executeUpdate();

            // bitacora_eliminar();
            JOptionPane.showMessageDialog(this, "¡ELIMINACION EXITOSA!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            txtNIT_Cliente.setText("");
            txtNombre_Cliente.setText("");
            txtDireccion_Cliente.setText("");
            txtTelefono_Cliente.setText("");
            txtEmail_Cliente.setText("");
            txtbuscado.setText("");
            btnRegistrar.setEnabled(true);
            btnModificar.setEnabled(false);
            btnEliminar.setEnabled(false);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error en Eliminacion", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtNombre_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombre_ClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre_ClienteActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        try {
            Connection cn = DriverManager.getConnection(mdi_Principal.BD, mdi_Principal.Usuario, mdi_Principal.Contraseña);
            //localhost es 127.0.0.1
            PreparedStatement pst = cn.prepareStatement("insert into cliente values(?,?,?,?,?)");

            pst.setString(1, txtNIT_Cliente.getText().trim());
            pst.setString(2, txtNombre_Cliente.getText());
            pst.setString(3, txtDireccion_Cliente.getText());
            pst.setString(4, txtTelefono_Cliente.getText().trim());
            pst.setString(5, txtEmail_Cliente.getText());

            //bitacora_guardar();
            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "¡REGISTRO EXITOSO!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            txtNIT_Cliente.setText("");
            txtNombre_Cliente.setText("");
            txtDireccion_Cliente.setText("");
            txtTelefono_Cliente.setText("");
            txtEmail_Cliente.setText("");
            txtbuscado.setText("");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error en registro", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtDireccion_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccion_ClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccion_ClienteActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        try {
            String ID = txtbuscado.getText().trim();

            Connection cn = DriverManager.getConnection(mdi_Principal.BD, mdi_Principal.Usuario, mdi_Principal.Contraseña);
            PreparedStatement pst = cn.prepareStatement("update cliente set  nombre = ?, direccion = ?, telefono = ?, correo = ?  where nit_cliente =" + ID);

            pst.setString(1, txtNombre_Cliente.getText());
            pst.setString(2, txtDireccion_Cliente.getText());
            pst.setString(3, txtTelefono_Cliente.getText().trim());
            pst.setString(4, txtEmail_Cliente.getText());

            pst.executeUpdate();

            //bitacora_modificar();
            JOptionPane.showMessageDialog(this, "¡MODIFICACION EXITOSA!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            txtNIT_Cliente.setText("");
            txtNombre_Cliente.setText("");
            txtDireccion_Cliente.setText("");
            txtTelefono_Cliente.setText("");
            txtEmail_Cliente.setText("");

            txtbuscado.setText("");
            btnRegistrar.setEnabled(true);
            btnModificar.setEnabled(false);
            btnEliminar.setEnabled(false);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error en Modificacion", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtNIT_Cliente.setText("");
        txtNombre_Cliente.setText("");
        txtDireccion_Cliente.setText("");
        txtTelefono_Cliente.setText("");
        txtEmail_Cliente.setText("");
        txtbuscado.setText("");
        btnRegistrar.setEnabled(true);
        btnModificar.setEnabled(false);
        btnEliminar.setEnabled(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarActionPerformed


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
    private javax.swing.JTextField txtDireccion_Cliente;
    private javax.swing.JTextField txtEmail_Cliente;
    private javax.swing.JTextField txtNIT_Cliente;
    private javax.swing.JTextField txtNombre_Cliente;
    private javax.swing.JTextField txtTelefono_Cliente;
    private javax.swing.JTextField txtbuscado;
    // End of variables declaration//GEN-END:variables
}
