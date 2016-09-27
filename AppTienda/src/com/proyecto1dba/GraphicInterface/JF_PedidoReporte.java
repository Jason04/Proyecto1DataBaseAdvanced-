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

    private static final int PED = 0;
    private static final int REP = 1;
    
    private int _activePanel;
    private PanelPedido _panPed;
    private PanelReportes _panRep;
    
    /**
     * Creates new form JF_Reportes
     */
    public JF_PedidoReporte() {
        initComponents();
        startComponents();
        //setLocation(StartWindow.getPosX(), StartWindow.getPosY());
        labUsuario.setText("Admin");
    }
    
    private void startComponents(){
        _activePanel = PED;
        
      
        _panPed = new PanelPedido();
        _panPed.setSize(760, 400);
        _panPed.setLocation(0, 45);
        jLayeredPane1.add(_panPed, 0);
        _panPed.setVisible(true);
        _panPed.setEnabled(true);
        
        _panRep = new PanelReportes();
        _panRep.setSize(760, 400);
        _panRep.setLocation(20, 60);
        jLayeredPane1.add(_panRep, 0);
        _panRep.setVisible(false);
        _panRep.setEnabled(false);
    }
    
    private  void changeTab(){
        if (_activePanel == PED){
            bttPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.proyecto1dba.Images/bttPedDct.png")));
            bttRep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.proyecto1dba.Images/bttRepAct.png")));
            
            _panPed.setVisible(false);
            _panPed.setEnabled(false);
           
            _panRep.setEnabled(true);
            _panRep.setVisible(true);
            
            _activePanel = REP;
            
        } else {
            bttRep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.proyecto1dba.Images/bttRepDct.png")));
            bttPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.proyecto1dba.Images/bttPedAct.png")));
            
            _panRep.setEnabled(false);
            _panRep.setVisible(false);
            
            _panPed.setVisible(true);
            _panPed.setEnabled(true);
            
            _activePanel = PED;
            
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

        jLayeredPane1 = new javax.swing.JLayeredPane();
        labUsuario = new javax.swing.JLabel();
        bttPedido = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bttRep = new javax.swing.JLabel();
        bkgr = new javax.swing.JLabel();

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

        labUsuario.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        labUsuario.setForeground(new java.awt.Color(255, 255, 255));
        labUsuario.setText("Nombre de Usuario Aquí - Cargo");
        jLayeredPane1.add(labUsuario);
        labUsuario.setBounds(80, 480, 540, 17);

        bttPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.proyecto1dba.Images/bttPedAct.png"))); // NOI18N
        bttPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bttPedidoMouseClicked(evt);
            }
        });
        jLayeredPane1.add(bttPedido);
        bttPedido.setBounds(0, 11, 311, 32);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.proyecto1dba.Images/atras.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jLayeredPane1.add(jLabel2);
        jLabel2.setBounds(725, 471, 65, 29);

        bttRep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.proyecto1dba.Images/bttRepDct.png"))); // NOI18N
        bttRep.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttRep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bttRepMouseClicked(evt);
            }
        });
        jLayeredPane1.add(bttRep);
        bttRep.setBounds(311, 11, 293, 32);

        bkgr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.proyecto1dba.Images/panelPrincipal.png"))); // NOI18N
        jLayeredPane1.add(bkgr);
        bkgr.setBounds(0, 0, 800, 500);

        getContentPane().add(jLayeredPane1);
        jLayeredPane1.setBounds(0, 0, 800, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttPedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttPedidoMouseClicked
        if (_activePanel != PED){
            changeTab();
        }
    }//GEN-LAST:event_bttPedidoMouseClicked

    private void bttRepMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttRepMouseClicked
        if (_activePanel != REP){
            changeTab();
        }
    }//GEN-LAST:event_bttRepMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
       // StartWindow.getInstance().enableMe();
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       // StartWindow.getInstance().enableMe();
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bkgr;
    private javax.swing.JLabel bttPedido;
    private javax.swing.JLabel bttRep;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel labUsuario;
    // End of variables declaration//GEN-END:variables
}
