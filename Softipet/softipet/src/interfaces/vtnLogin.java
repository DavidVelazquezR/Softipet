/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.awt.Color;

/**
 *
 * @author david
 */
public class vtnLogin extends javax.swing.JFrame {

    int xy, xx;
    
    /**
     * Creates new form vtnLogin
     */
    public vtnLogin() {
        initComponents();
        jPOverlay.setBackground(new Color(0, 50, 100, 100));//Hace el panel transparente
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel2 = new javax.swing.JPanel();
        jLCorreo = new javax.swing.JLabel();
        jLContrasena = new javax.swing.JLabel();
        jLLogin = new javax.swing.JLabel();
        jPFContra = new javax.swing.JPasswordField();
        jTFCorreo = new javax.swing.JTextField();
        jBIniciar = new javax.swing.JButton();
        jBLimpiar = new javax.swing.JButton();
        jPOverlay = new javax.swing.JPanel();
        jLBackground = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLMinimizar = new javax.swing.JLabel();
        jLCerrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(100, 162, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLCorreo.setText("Correo:");
        jPanel2.add(jLCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        jLContrasena.setText("Contraseña:");
        jPanel2.add(jLContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        jLLogin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLLogin.setText("Login");
        jPanel2.add(jLLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));
        jPanel2.add(jPFContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 190, -1));
        jPanel2.add(jTFCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 190, -1));

        jBIniciar.setText("Iniciar");
        jPanel2.add(jBIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 80, -1));

        jBLimpiar.setText("Limpiar");
        jPanel2.add(jBLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 80, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 380, 400));

        jPOverlay.setPreferredSize(new java.awt.Dimension(350, 400));
        jPOverlay.addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseDragged(java.awt.event.MouseEvent evt)
            {
                jPOverlayMouseDragged(evt);
            }
        });
        jPOverlay.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/log-background.jpg"))); // NOI18N
        jPOverlay.add(jLBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, -1));

        getContentPane().add(jPOverlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(0, 35));
        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseDragged(java.awt.event.MouseEvent evt)
            {
                jPanel3MouseDragged(evt);
            }
        });
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jPanel3MousePressed(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/minimizar-icon.png"))); // NOI18N
        jLMinimizar.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jLMinimizarMouseClicked(evt);
            }
        });
        jPanel3.add(jLMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(658, 0, -1, 40));

        jLCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/cerrar-icon.png"))); // NOI18N
        jLCerrar.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jLCerrarMouseClicked(evt);
            }
        });
        jPanel3.add(jLCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, 30, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_jLCerrarMouseClicked

    private void jLMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLMinimizarMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jLMinimizarMouseClicked

    private void jPOverlayMouseDragged(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jPOverlayMouseDragged
    {//GEN-HEADEREND:event_jPOverlayMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jPOverlayMouseDragged

    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jPanel3MouseDragged
    {//GEN-HEADEREND:event_jPanel3MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel3MouseDragged

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jPanel3MousePressed
    {//GEN-HEADEREND:event_jPanel3MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel3MousePressed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(vtnLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vtnLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vtnLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vtnLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vtnLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBIniciar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JLabel jLBackground;
    private javax.swing.JLabel jLCerrar;
    private javax.swing.JLabel jLContrasena;
    private javax.swing.JLabel jLCorreo;
    private javax.swing.JLabel jLLogin;
    private javax.swing.JLabel jLMinimizar;
    private javax.swing.JPasswordField jPFContra;
    private javax.swing.JPanel jPOverlay;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTFCorreo;
    // End of variables declaration//GEN-END:variables
}