/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.proyecto1dba.GraphicInterface;

/**
 *
 * @author Jason
 */
public class JF_PedidoReporte extends javax.swing.JFrame {


    private PanelReportes _panRep;
    
    /**
     * Creates new form JF_Reportes
     */
    public JF_PedidoReporte() {
        initComponents();
        startComponents();
        //setLocation(StartWindow.getPosX(), StartWindow.getPosY());
        
    }
    
    private void startComponents(){

        
        _panRep = new PanelReportes();
        _panRep.setSize(760, 400);
        _panRep.setLocation(20, 60);
        jLayeredPane1.add(_panRep, 0);
        _panRep.setVisible(true);
        _panRep.setEnabled(true);
        
    }
    
 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        bttPedido = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bkgr = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(810, 530));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        jLayeredPane1.setBackground(new java.awt.Color(153, 153, 153));
        jLayeredPane1.setMinimumSize(new java.awt.Dimension(800, 500));
        jLayeredPane1.setOpaque(true);

        bttPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.proyecto1dba.Images/bttRepDct.png"))); // NOI18N
        bttPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLayeredPane1.add(bttPedido);
        bttPedido.setBounds(0, 11, 293, 32);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.proyecto1dba.Images/atras.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jLayeredPane1.add(jLabel2);
        jLabel2.setBounds(725, 471, 65, 29);

        bkgr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.proyecto1dba.Images/panelPrincipal.png"))); // NOI18N
        jLayeredPane1.add(bkgr);
        bkgr.setBounds(0, 0, 800, 500);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.proyecto1dba.Images/bttCrearProd.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.MODAL_LAYER);
        jLayeredPane1.add(jLabel1);
        jLabel1.setBounds(292, 7, 210, 40);

        getContentPane().add(jLayeredPane1);
        jLayeredPane1.setBounds(0, 0, 800, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.dispose();
        System.exit(1);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       // StartWindow.getInstance().enableMe();
    }//GEN-LAST:event_formWindowClosing

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        crearProducto cP = new crearProducto(null, true);
        cP.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bkgr;
    private javax.swing.JLabel bttPedido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration//GEN-END:variables
}
