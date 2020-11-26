/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto.de.venta;

import Holder.TextPrompt;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Rey Figuritas
 * @author Jaime Leyva
 */
public class AgregarProducto extends javax.swing.JFrame {
    
    DBConexion con = new DBConexion();
    Connection cn = con.getConnection();

    /**
     * Creates new form AgregarProducto
     */
    public AgregarProducto() {
        initComponents();
        TextPrompt TP = new TextPrompt("Nombre Producto",TextNameProducto);
        TextPrompt TP1 = new TextPrompt("00.00$$",TextPrecioProducto);
        TextPrompt TP2 = new TextPrompt("00.00$$",TextCantidadProducto);
        TextPrompt TP3 = new TextPrompt("###SZ###MO",TextCodigoProducto);
        TextPrompt TP4 = new TextPrompt("Szertegia",TextProvedorProducto);
        
    }

    void limpiar(){
    TextNameProducto.setText("");
    TextPrecioProducto.setText("");
    TextCantidadProducto.setText("");
    TextCodigoProducto.setText("");
    TextProvedorProducto.setText("");
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
        TextNameProducto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TextPrecioProducto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TextCantidadProducto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TextCodigoProducto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TextProvedorProducto = new javax.swing.JTextField();
        BotonAgregar = new javax.swing.JButton();
        BotonCanelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre del Poducto");

        TextNameProducto.setName(""); // NOI18N
        TextNameProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextNameProductoActionPerformed(evt);
            }
        });

        jLabel2.setText("Precio del Producto");

        TextPrecioProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextPrecioProductoActionPerformed(evt);
            }
        });

        jLabel3.setText("Cantidad del Producto");

        TextCantidadProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextCantidadProductoActionPerformed(evt);
            }
        });

        jLabel4.setText("Codigo del producto");

        jLabel5.setText("Codigo del producto");

        BotonAgregar.setText("Agregar");
        BotonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregarActionPerformed(evt);
            }
        });

        BotonCanelar.setText("Cancelar");
        BotonCanelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCanelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(TextNameProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(TextCantidadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(TextCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(TextProvedorProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(61, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BotonAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotonCanelar)
                        .addGap(26, 26, 26))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextNameProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextCantidadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextProvedorProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonAgregar)
                    .addComponent(BotonCanelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextNameProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextNameProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextNameProductoActionPerformed

    private void TextPrecioProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextPrecioProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextPrecioProductoActionPerformed

    private void TextCantidadProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextCantidadProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextCantidadProductoActionPerformed

    private void BotonCanelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCanelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_BotonCanelarActionPerformed

    private void BotonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregarActionPerformed
        
        try {
            PreparedStatement ps = cn.prepareStatement("insert into articulo(ArticuloName,ArticuloPrecio,ArticuloCantidad,ArticuloCode,ArticuloProvedor) values(?,?,?,?,?)");
            ps.setString(1, TextNameProducto.getText());
            ps.setString(2, TextPrecioProducto.getText());
            ps.setString(3, TextCantidadProducto.getText());
            ps.setString(4, TextCodigoProducto.getText());
            ps.setString(5, TextProvedorProducto.getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Articulo Agregado correctamente");
            limpiar();
            AlmacenAdmin aa = new AlmacenAdmin();
            aa.setVisible(true);
            this.setVisible(false);
            
                    } catch (SQLException ex) {
            Logger.getLogger(AgregarProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_BotonAgregarActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAgregar;
    private javax.swing.JButton BotonCanelar;
    private javax.swing.JTextField TextCantidadProducto;
    private javax.swing.JTextField TextCodigoProducto;
    private javax.swing.JTextField TextNameProducto;
    private javax.swing.JTextField TextPrecioProducto;
    private javax.swing.JTextField TextProvedorProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
