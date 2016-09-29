/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto1dba.GraphicInterface;


import com.proyecto1dba.AccessData.AcessData;
import java.awt.Point;

import java.util.ArrayList;

import javax.swing.JOptionPane;



/**
 *
 * @author Jason
 */
public class crearProducto extends javax.swing.JDialog {

    /**
     * Creates new form EditRoutes
     *
     * @param parent
     * @param modal
     */
    private final Point point = new Point(0, 0);
AcessData AD;

    public crearProducto(java.awt.Frame parent, boolean modal) {

        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        AD = new AcessData();
        
       ArrayList<String> tipoPred = AD.getTiposProd();
             this.jComboBox1.removeAllItems();
        for (String tipo : tipoPred) {            
            this.jComboBox1.addItem(tipo);
        } 
                
                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCearCuentaAhorroVista = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jFormattedTextFieldEnterName = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jFormattedTextFieldPrecio = new javax.swing.JFormattedTextField();
        jLabelDescrip = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(460, 418));
        setMinimumSize(new java.awt.Dimension(460, 418));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(460, 418));

        jPanelCearCuentaAhorroVista.setBackground(new java.awt.Color(255, 255, 255));
        jPanelCearCuentaAhorroVista.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelCearCuentaAhorroVista.setAlignmentX(0.0F);
        jPanelCearCuentaAhorroVista.setAlignmentY(0.0F);
        jPanelCearCuentaAhorroVista.setMaximumSize(new java.awt.Dimension(460, 418));
        jPanelCearCuentaAhorroVista.setMinimumSize(new java.awt.Dimension(460, 418));
        jPanelCearCuentaAhorroVista.setPreferredSize(new java.awt.Dimension(460, 418));
        jPanelCearCuentaAhorroVista.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanelCearCuentaAhorroVistaMouseDragged(evt);
            }
        });
        jPanelCearCuentaAhorroVista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelCearCuentaAhorroVistaMousePressed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Khmer UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Ingrese la información de producto");

        jLabel7.setFont(new java.awt.Font("Khmer UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Crear Producto");

        jFormattedTextFieldEnterName.setCaretColor(new java.awt.Color(204, 204, 204));
        jFormattedTextFieldEnterName.setDisabledTextColor(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Tipo:");

        jFormattedTextFieldPrecio.setCaretColor(new java.awt.Color(204, 204, 204));
        jFormattedTextFieldPrecio.setDisabledTextColor(new java.awt.Color(204, 204, 204));

        jLabelDescrip.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelDescrip.setText("Precio:");

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "$", "₡" }));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.proyecto1dba.Images/atras2.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.proyecto1dba.Images/hecho2.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCearCuentaAhorroVistaLayout = new javax.swing.GroupLayout(jPanelCearCuentaAhorroVista);
        jPanelCearCuentaAhorroVista.setLayout(jPanelCearCuentaAhorroVistaLayout);
        jPanelCearCuentaAhorroVistaLayout.setHorizontalGroup(
            jPanelCearCuentaAhorroVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCearCuentaAhorroVistaLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanelCearCuentaAhorroVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCearCuentaAhorroVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelCearCuentaAhorroVistaLayout.createSequentialGroup()
                            .addGap(45, 45, 45)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelCearCuentaAhorroVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelCearCuentaAhorroVistaLayout.createSequentialGroup()
                                .addGroup(jPanelCearCuentaAhorroVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelDescrip))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelCearCuentaAhorroVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFormattedTextFieldEnterName, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jFormattedTextFieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanelCearCuentaAhorroVistaLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 289, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
        );
        jPanelCearCuentaAhorroVistaLayout.setVerticalGroup(
            jPanelCearCuentaAhorroVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCearCuentaAhorroVistaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addGap(45, 45, 45)
                .addGroup(jPanelCearCuentaAhorroVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jFormattedTextFieldEnterName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanelCearCuentaAhorroVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanelCearCuentaAhorroVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDescrip)
                    .addComponent(jFormattedTextFieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(jPanelCearCuentaAhorroVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanelCearCuentaAhorroVista, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCearCuentaAhorroVista, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if (validateUI()) {
            String nombre = jFormattedTextFieldEnterName.getText();
            String precio = jFormattedTextFieldPrecio.getText();
            String idTipoProd = (jComboBox1.getSelectedIndex()+1)+"";
            
            dispose();
            
            JOptionPane.showMessageDialog(
                    null,
                    "El producto se creo correctamente",
                    "Mensaje", JOptionPane.INFORMATION_MESSAGE); 
            
            

        } else {
            
             JOptionPane.showMessageDialog(
                    null,
                    "Atención: Faltan Algunos Campos "
                    + "Por Rellenar",
                    "Alerta", JOptionPane.ERROR_MESSAGE);  
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jPanelCearCuentaAhorroVistaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCearCuentaAhorroVistaMouseDragged
        if (!evt.isMetaDown()) {
            Point p = getLocation();
            setLocation(p.x + evt.getX() - point.x, p.y + evt.getY() - point.y);
        }
    }//GEN-LAST:event_jPanelCearCuentaAhorroVistaMouseDragged

    private void jPanelCearCuentaAhorroVistaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCearCuentaAhorroVistaMousePressed
        if (!evt.isMetaDown()) {
            point.x = evt.getX();
            point.y = evt.getY();
        }
    }//GEN-LAST:event_jPanelCearCuentaAhorroVistaMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JFormattedTextField jFormattedTextFieldEnterName;
    private javax.swing.JFormattedTextField jFormattedTextFieldPrecio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelDescrip;
    private javax.swing.JPanel jPanelCearCuentaAhorroVista;
    // End of variables declaration//GEN-END:variables

    //Validar que se han llenado todos los campos
    private boolean validateUI() {

        if ("".equals(jFormattedTextFieldEnterName.getText().
                replace(" ", ""))) {

            return false;
        }
                
         if ("".equals(jFormattedTextFieldPrecio.getText().
                replace(" ", ""))) {

            return false;
        }

        return true;
    }

  

}
