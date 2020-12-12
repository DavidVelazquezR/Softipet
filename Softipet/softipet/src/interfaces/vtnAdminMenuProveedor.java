/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import bd.Querys;
import bd.Sesion;
import cjb.ci.Mensaje;
import static interfaces.vtnLogin.con;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author david
 */
public class vtnAdminMenuProveedor extends javax.swing.JFrame {

    int xy, xx;
    DefaultTableModel modelo = new DefaultTableModel();

    /**
     * Creates new form vtnAdminAU
     */
    public vtnAdminMenuProveedor() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTUsers = new javax.swing.JTable();
        jBAlta = new javax.swing.JButton();
        jBBaja = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Proveedores Principal SOFTIPET");
        setUndecorated(true);
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
        jPanel3.add(jLMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 0, -1, 40));

        jLCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/regreso.png"))); // NOI18N
        jLCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLCerrarMouseClicked(evt);
            }
        });
        jPanel3.add(jLCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 30, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 40));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLTitulo1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLTitulo1.setText("Administración de proveedores");
        jPanel1.add(jLTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jTUsers.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTUsers.setModel(new javax.swing.table.DefaultTableModel(
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
        jTUsers.setGridColor(new java.awt.Color(255, 255, 255));
        jTUsers.setSelectionBackground(new java.awt.Color(153, 153, 255));
        jScrollPane1.setViewportView(jTUsers);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 740, 320));

        jBAlta.setBackground(new java.awt.Color(102, 255, 102));
        jBAlta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBAlta.setText("Alta de proveedores");
        jBAlta.setBorder(null);
        jBAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAltaActionPerformed(evt);
            }
        });
        jPanel1.add(jBAlta, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 200, 30));

        jBBaja.setBackground(new java.awt.Color(255, 204, 102));
        jBBaja.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBBaja.setText("Modifica de proveedores");
        jBBaja.setBorder(null);
        jBBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBajaActionPerformed(evt);
            }
        });
        jPanel1.add(jBBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 410, 200, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 810, 460));

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
        new vtnAdminMenu().setVisible(true);
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

    private void jBAltaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jBAltaActionPerformed
    {//GEN-HEADEREND:event_jBAltaActionPerformed
        this.dispose();
        new vtnAdminMenuProveedorA().setVisible(true);
    }//GEN-LAST:event_jBAltaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
        CrearModelo();
        llenaTabla();
    }//GEN-LAST:event_formWindowOpened

    private void jBBajaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jBBajaActionPerformed
    {//GEN-HEADEREND:event_jBBajaActionPerformed
        if (jTUsers.getSelectedRow() == -1) {
            Mensaje.error(this, "No hay valores seleccionados en la tabla");
        } else {
            int row = jTUsers.getSelectedRow();
            String idProveedor = (String) jTUsers.getValueAt(row, 0);
            Sesion.datosModifica.add(idProveedor);
            this.dispose();
            new vtnAdminMenuProveedorM().setVisible(true);
        }
    }//GEN-LAST:event_jBBajaActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jPanel1MouseClicked
    {//GEN-HEADEREND:event_jPanel1MouseClicked
        jTUsers.clearSelection();
    }//GEN-LAST:event_jPanel1MouseClicked

    private void CrearModelo() {
        try {
            modelo = (new DefaultTableModel(
                    null, new String[]{
                        "ID Proveedor", "Nombre de proveedro", "Telefono", "Email", "RFC"
                    }) {
                Class[] types = new Class[]{
                    java.lang.Object.class,
                    java.lang.Object.class,
                    java.lang.Object.class,
                    java.lang.Object.class,
                    java.lang.Object.class,};
                boolean[] canEdit = new boolean[]{
                    false, false, false, false, false, false
                };

                @Override
                public Class getColumnClass(int columnIndex) {
                    return types[columnIndex];
                }

                @Override
                public boolean isCellEditable(int rowIndex, int colIndex) {
                    return canEdit[colIndex];
                }
            });
            jTUsers.setModel(modelo);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString() + "error en la creacion del modelo");
        }
    }

    public void llenaTabla() {
        ArrayList<Object> mapeoProv = new ArrayList<Object>();
        Querys q = new Querys();
        modelo.setRowCount(0);
        try {
            mapeoProv = q.Seleccion(con, "*", "proveedores", "", false);

            Object[] filas = new Object[5];

            while (!mapeoProv.isEmpty()) {

                filas[0] = ((String) mapeoProv.get(0)).trim();
                filas[1] = ((String) mapeoProv.get(1)).trim();
                filas[2] = ((String) mapeoProv.get(2)).trim();
                filas[3] = ((String) mapeoProv.get(3)).trim();
                filas[4] = ((String) mapeoProv.get(4)).trim();

                for (int i = 0; i < 5; i++) {
                    mapeoProv.remove(0);
                }
                modelo.addRow(filas);
            }

        } catch (Exception e) {
            System.out.println("Error en el llenado de la tabla: " + e.toString());
        }
    }

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
            java.util.logging.Logger.getLogger(vtnAdminMenuProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vtnAdminMenuProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vtnAdminMenuProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vtnAdminMenuProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new vtnAdminMenuProveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAlta;
    private javax.swing.JButton jBBaja;
    private javax.swing.JLabel jLCerrar;
    private javax.swing.JLabel jLMinimizar;
    private javax.swing.JLabel jLTitulo1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTUsers;
    // End of variables declaration//GEN-END:variables
}
