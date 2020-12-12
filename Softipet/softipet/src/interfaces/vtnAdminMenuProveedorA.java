/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import bd.Querys;
import cjb.ci.CtrlInterfaz;
import cjb.ci.Mensaje;
import cjb.ci.Validaciones;
import controladores.cambioColor;
import static interfaces.vtnLogin.con;
import java.awt.Color;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.StyledEditorKit;

/**
 *
 * @author david
 */
public class vtnAdminMenuProveedorA extends javax.swing.JFrame {

    int xy, xx;
    boolean flagMedico = false;
    cambioColor cc = new cambioColor();

    /**
     * Creates new form vtnAdminAU
     */
    public vtnAdminMenuProveedorA() {
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

        jPanel3 = new javax.swing.JPanel();
        jLMinimizar = new javax.swing.JLabel();
        jLCerrar = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLTitulo1 = new javax.swing.JLabel();
        jBAlta = new javax.swing.JButton();
        jBLimpiar = new javax.swing.JButton();
        jPNombre = new javax.swing.JPanel();
        jLNombre = new javax.swing.JLabel();
        jTFNombre = new javax.swing.JTextField();
        jPTelefono = new javax.swing.JPanel();
        jLTelefono = new javax.swing.JLabel();
        jTFTelefono = new javax.swing.JTextField();
        jPEmail = new javax.swing.JPanel();
        jLEmail = new javax.swing.JLabel();
        jTFEmail = new javax.swing.JTextField();
        jPRfc = new javax.swing.JPanel();
        jLRFC = new javax.swing.JLabel();
        jTFRFC = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Proveedores altas SOFTIPET");
        setUndecorated(true);
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(0, 35));
        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel3MouseDragged(evt);
            }
        });
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/minimizar-icon.png"))); // NOI18N
        jLMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLMinimizarMouseClicked(evt);
            }
        });
        jPanel3.add(jLMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, -1, 40));

        jLCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/regreso.png"))); // NOI18N
        jLCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLCerrarMouseClicked(evt);
            }
        });
        jPanel3.add(jLCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 30, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 40));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLTitulo1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLTitulo1.setText("Alta de proveedores");
        jPanel1.add(jLTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jBAlta.setBackground(new java.awt.Color(102, 255, 102));
        jBAlta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBAlta.setText("Dar de alta");
        jBAlta.setBorder(null);
        jBAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAltaActionPerformed(evt);
            }
        });
        jBAlta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBAltaKeyPressed(evt);
            }
        });
        jPanel1.add(jBAlta, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 120, 30));

        jBLimpiar.setBackground(new java.awt.Color(153, 153, 255));
        jBLimpiar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBLimpiar.setText("Limpiar");
        jBLimpiar.setBorder(null);
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(jBLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 120, 30));

        jPNombre.setBackground(new java.awt.Color(255, 255, 255));
        jPNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPNombre.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLNombre.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLNombre.setText("Nombre del proveedor:");
        jPNombre.add(jLNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jTFNombre.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTFNombre.setBorder(null);
        jTFNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFNombreKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFNombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFNombreKeyTyped(evt);
            }
        });
        jPNombre.add(jTFNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 160, 20));

        jPanel1.add(jPNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 200, 60));

        jPTelefono.setBackground(new java.awt.Color(255, 255, 255));
        jPTelefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPTelefono.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLTelefono.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLTelefono.setText("Teléfono:");
        jPTelefono.add(jLTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jTFTelefono.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTFTelefono.setBorder(null);
        jTFTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFTelefonoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFTelefonoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFTelefonoKeyTyped(evt);
            }
        });
        jPTelefono.add(jTFTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 160, 20));

        jPanel1.add(jPTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 200, 60));

        jPEmail.setBackground(new java.awt.Color(255, 255, 255));
        jPEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPEmail.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLEmail.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLEmail.setText("Email:");
        jPEmail.add(jLEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jTFEmail.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTFEmail.setBorder(null);
        jTFEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFEmailKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFEmailKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFEmailKeyTyped(evt);
            }
        });
        jPEmail.add(jTFEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 160, 20));

        jPanel1.add(jPEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 200, 60));

        jPRfc.setBackground(new java.awt.Color(255, 255, 255));
        jPRfc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPRfc.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLRFC.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLRFC.setText("RFC:");
        jPRfc.add(jLRFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jTFRFC.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTFRFC.setBorder(null);
        jTFRFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFRFCActionPerformed(evt);
            }
        });
        jTFRFC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFRFCKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFRFCKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFRFCKeyTyped(evt);
            }
        });
        jPRfc.add(jTFRFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 160, 20));

        jPanel1.add(jPRfc, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 200, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 440, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLMinimizarMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLMinimizarMouseClicked
    {//GEN-HEADEREND:event_jLMinimizarMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jLMinimizarMouseClicked

    private void jLCerrarMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLCerrarMouseClicked
    {//GEN-HEADEREND:event_jLCerrarMouseClicked
        this.dispose();
        new vtnAdminMenuProveedor().setVisible(true);
    }//GEN-LAST:event_jLCerrarMouseClicked

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

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jBLimpiarActionPerformed
    {//GEN-HEADEREND:event_jBLimpiarActionPerformed
        CtrlInterfaz.limpia(jTFNombre, jTFTelefono, jTFEmail, jTFRFC);

        cc.cDefault(jLNombre, jLTelefono, jLEmail, jLRFC);
        cc.cDefault(jTFNombre, jTFTelefono, jTFEmail, jTFRFC);
        cc.cDefault(jPNombre, jPTelefono, jPEmail, jPRfc);

        CtrlInterfaz.selecciona(jTFNombre);
    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jTFRFCKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTFRFCKeyTyped
    {//GEN-HEADEREND:event_jTFRFCKeyTyped
        Validaciones.validaAlfanumerico(evt);
        if (jTFRFC.getText().length() == 13) {
            evt.consume();
        }
    }//GEN-LAST:event_jTFRFCKeyTyped

    private void jTFNombreKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTFNombreKeyTyped
    {//GEN-HEADEREND:event_jTFNombreKeyTyped
        Validaciones.validaAlfanumerico(evt);
        if (jTFNombre.getText().length() == 30) {
            evt.consume();
        }
    }//GEN-LAST:event_jTFNombreKeyTyped

    private void jTFNombreKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTFNombreKeyPressed
    {//GEN-HEADEREND:event_jTFNombreKeyPressed

    }//GEN-LAST:event_jTFNombreKeyPressed

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
        CtrlInterfaz.selecciona(jTFNombre);
    }//GEN-LAST:event_formWindowOpened

    private void jTFTelefonoKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTFTelefonoKeyPressed
    {//GEN-HEADEREND:event_jTFTelefonoKeyPressed

    }//GEN-LAST:event_jTFTelefonoKeyPressed

    private void jTFTelefonoKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTFTelefonoKeyTyped
    {//GEN-HEADEREND:event_jTFTelefonoKeyTyped
        Validaciones.validaEntero(evt);
        if (jTFTelefono.getText().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_jTFTelefonoKeyTyped

    private void jTFEmailKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTFEmailKeyPressed
    {//GEN-HEADEREND:event_jTFEmailKeyPressed

    }//GEN-LAST:event_jTFEmailKeyPressed

    private void jTFEmailKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTFEmailKeyTyped
    {//GEN-HEADEREND:event_jTFEmailKeyTyped
        if (jTFEmail.getText().length() == 30) {
            evt.consume();
        }
    }//GEN-LAST:event_jTFEmailKeyTyped

    private void jTFRFCKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTFRFCKeyPressed
    {//GEN-HEADEREND:event_jTFRFCKeyPressed

    }//GEN-LAST:event_jTFRFCKeyPressed

    private void jBAltaKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jBAltaKeyPressed
    {//GEN-HEADEREND:event_jBAltaKeyPressed
        if (evt.getKeyChar() == '\n') {
            jBAltaActionPerformed(null);
        }
    }//GEN-LAST:event_jBAltaKeyPressed

    private void jBAltaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jBAltaActionPerformed
    {//GEN-HEADEREND:event_jBAltaActionPerformed
        Querys q = new Querys();
        ArrayList<Object> id = new ArrayList<Object>();

        if (jLNombre.getForeground().getRGB() == cc.getVerdeOscuro().getRGB()
                && jLTelefono.getForeground().getRGB() == cc.getVerdeOscuro().getRGB()
                && jLEmail.getForeground().getRGB() == cc.getVerdeOscuro().getRGB()
                && jLRFC.getForeground().getRGB() == cc.getVerdeOscuro().getRGB()) {

            try {
                id = q.Seleccion(con, "MAX(Id_proveedor)", "proveedores", "", true);
            } catch (Exception e) {
                System.out.println("consulta max id erronea" + e);
            }

            int idFinal = Integer.parseInt((String) id.get(0)) + 1;
            String values = "";

            if (id.get(0).equals("null")) {
                values = "'" + 1 + "',"
                        + "'" + jTFNombre.getText() + "',"
                        + "'" + jTFTelefono.getText() + "',"
                        + "'" + jTFEmail.getText() + "',"
                        + "'" + jTFRFC.getText() + "'";
            } else {
                values = "'" + idFinal + "',"
                        + "'" + jTFNombre.getText() + "',"
                        + "'" + jTFTelefono.getText() + "',"
                        + "'" + jTFEmail.getText() + "',"
                        + "'" + jTFRFC.getText() + "'";
            }

            if (Mensaje.pregunta(this, "¿Estas seguro de dar de alta el proveedor?") == JOptionPane.YES_OPTION) {
                try {
                    q.Insertar(con, "proveedores", values);
                } catch (Exception e) {
                    System.out.println("insercion erronea proveedores..." + e);
                }

                Mensaje.exito(this, "Se dio de alta el proveedor correctamente");
                jBLimpiarActionPerformed(null);
            } else {
                Mensaje.error(this, "No se dio de alta el proveedor");
            }

        } else {
            Mensaje.error(this, "Verifique que todos los campos esten en verde");
        }

    }//GEN-LAST:event_jBAltaActionPerformed

    private void jTFTelefonoKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTFTelefonoKeyReleased
    {//GEN-HEADEREND:event_jTFTelefonoKeyReleased
        if (jTFTelefono.getText().isEmpty()) {
            cc.cDefault(jTFTelefono, jLTelefono, jPTelefono);
        } else if (jTFTelefono.getText().length() == 10) {
            cc.cVerde(jTFTelefono, jLTelefono, jPTelefono);
            Validaciones.enter(this, evt, jTFEmail);
        } else {
            cc.cRojo(jTFTelefono, jLTelefono, jPTelefono);
        }
    }//GEN-LAST:event_jTFTelefonoKeyReleased

    private void formWindowStateChanged(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowStateChanged
    {//GEN-HEADEREND:event_formWindowStateChanged

    }//GEN-LAST:event_formWindowStateChanged

    private void jTFNombreKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTFNombreKeyReleased
    {//GEN-HEADEREND:event_jTFNombreKeyReleased
        if (jTFNombre.getText().isEmpty()) {
            cc.cDefault(jTFNombre, jLNombre, jPNombre);
        } else {
            cc.cVerde(jTFNombre, jLNombre, jPNombre);
            Validaciones.enter(this, evt, jTFTelefono);
        }
    }//GEN-LAST:event_jTFNombreKeyReleased

    private void jTFEmailKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTFEmailKeyReleased
    {//GEN-HEADEREND:event_jTFEmailKeyReleased
        ArrayList<Object> consultaEmail = new ArrayList<Object>();;
        Querys q = new Querys();
        try {
            consultaEmail = q.Seleccion(con, "Email", "proveedores", "Email='" + jTFEmail.getText() + "'", true);

        } catch (Exception e) {
            System.out.println("Error: exception ->" + e);
        }
        if (jTFEmail.getText().isEmpty()) {
            cc.cDefault(jTFEmail, jLEmail, jPEmail);
        } else if (jTFEmail.getText().matches("^[^@]+@[^@]+\\.[a-zA-Z]{2,}$")) {
            Validaciones.enter(this, evt, jTFRFC);
            cc.cVerde(jTFEmail, jLEmail, jPEmail);
        } else {
            cc.cRojo(jTFEmail, jLEmail, jPEmail);
        }
        try {

            if (consultaEmail.get(0).equals(jTFEmail.getText())) {
                cc.cAmarillo(jTFEmail, jLEmail, jPEmail);
            }

        } catch (Exception e) {
            System.out.println("no encontro resultado al mail aun-->" + e);
        }

    }//GEN-LAST:event_jTFEmailKeyReleased

    private void jTFRFCKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTFRFCKeyReleased
    {//GEN-HEADEREND:event_jTFRFCKeyReleased
        ArrayList<Object> consultaRFC = new ArrayList<Object>();;
        Querys q = new Querys();

        try {
            consultaRFC = q.Seleccion(con, "RFC", "proveedores", "RFC='" + jTFRFC.getText() + "'", true);

        } catch (Exception e) {
            System.out.println("Error: exception ->" + e);
        }

        jTFRFC.setText(jTFRFC.getText().toUpperCase());

        if (jTFRFC.getText().isEmpty()) {
            cc.cDefault(jTFRFC, jLRFC, jPRfc);
        } else if (jTFRFC.getText().length() == 12 || jTFRFC.getText().length() == 13) {
            cc.cVerde(jTFRFC, jLRFC, jPRfc);
            Validaciones.enter(this, evt, jBAlta);
        } else {
            cc.cRojo(jTFRFC, jLRFC, jPRfc);
        }

        try {

            if (consultaRFC.get(0).equals(jTFRFC.getText())) {
                cc.cAmarillo(jTFRFC, jLRFC, jPRfc);
            }

        } catch (Exception e) {
            System.out.println("no encontro resultado el curp aun-->" + e);
        }
    }//GEN-LAST:event_jTFRFCKeyReleased

    private void jTFRFCActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTFRFCActionPerformed
    {//GEN-HEADEREND:event_jTFRFCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFRFCActionPerformed

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
            java.util.logging.Logger.getLogger(vtnAdminMenuProveedorA.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vtnAdminMenuProveedorA.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vtnAdminMenuProveedorA.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vtnAdminMenuProveedorA.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vtnAdminMenuProveedorA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAlta;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JLabel jLCerrar;
    private javax.swing.JLabel jLEmail;
    private javax.swing.JLabel jLMinimizar;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLRFC;
    private javax.swing.JLabel jLTelefono;
    private javax.swing.JLabel jLTitulo1;
    private javax.swing.JPanel jPEmail;
    private javax.swing.JPanel jPNombre;
    private javax.swing.JPanel jPRfc;
    private javax.swing.JPanel jPTelefono;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTFEmail;
    private javax.swing.JTextField jTFNombre;
    private javax.swing.JTextField jTFRFC;
    private javax.swing.JTextField jTFTelefono;
    // End of variables declaration//GEN-END:variables
}
