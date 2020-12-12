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
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author david
 */
public class vtnAdminMenuBodegaNotify extends javax.swing.JFrame {

    int xy, xx;
    DefaultTableModel modelo1 = new DefaultTableModel();
    DefaultTableModel modelo2 = new DefaultTableModel();
    int rol;

    /**
     * Creates new form vtnAdminAU
     */
    public vtnAdminMenuBodegaNotify(int x) {
        initComponents();
        rol = x;
        Image icono = Toolkit.getDefaultToolkit().getImage("src/design/softipet.png");
        this.setIconImage(icono);
    }

    private vtnAdminMenuBodegaNotify() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        jTCaducidad = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTExistencia = new javax.swing.JTable();
        jLTitulo2 = new javax.swing.JLabel();
        jLTitulo3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Notificaciones SOFTIPET");
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
        jPanel3.add(jLMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, -1, 40));

        jLCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/regreso.png"))); // NOI18N
        jLCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLCerrarMouseClicked(evt);
            }
        });
        jPanel3.add(jLCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 30, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 40));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLTitulo1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLTitulo1.setText("Notificaciones");
        jPanel1.add(jLTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jTCaducidad.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTCaducidad.setModel(new javax.swing.table.DefaultTableModel(
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
        jTCaducidad.setGridColor(new java.awt.Color(255, 255, 255));
        jTCaducidad.setSelectionBackground(new java.awt.Color(153, 153, 255));
        jScrollPane1.setViewportView(jTCaducidad);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 730, 230));

        jTExistencia.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTExistencia.setModel(new javax.swing.table.DefaultTableModel(
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
        jTExistencia.setGridColor(new java.awt.Color(255, 255, 255));
        jTExistencia.setSelectionBackground(new java.awt.Color(153, 153, 255));
        jScrollPane2.setViewportView(jTExistencia);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 730, 220));

        jLTitulo2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLTitulo2.setText("Por existencia:");
        jPanel1.add(jLTitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        jLTitulo3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLTitulo3.setText("Por caducidad:");
        jPanel1.add(jLTitulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 800, 660));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLMinimizarMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLMinimizarMouseClicked
    {//GEN-HEADEREND:event_jLMinimizarMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jLMinimizarMouseClicked

    private void jLCerrarMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLCerrarMouseClicked
    {//GEN-HEADEREND:event_jLCerrarMouseClicked
        if (Integer.parseInt((String) Sesion.datosUsuario.get(11)) == 1) {
            this.dispose();
            new vtnAdminMenu().setVisible(true);
        } else {
            this.dispose();
            new vtnEmpleadoMenu().setVisible(true);
        }
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

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened

        CrearModelo1();
        CrearModelo2();
        llenaTabla1();
        llenaTabla2();

    }//GEN-LAST:event_formWindowOpened

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jPanel1MouseClicked
    {//GEN-HEADEREND:event_jPanel1MouseClicked
        jTCaducidad.clearSelection();
        jTExistencia.clearSelection();
    }//GEN-LAST:event_jPanel1MouseClicked

    private void CrearModelo1() {
        try {
            modelo1 = (new DefaultTableModel(
                    null, new String[]{
                        "ID Producto", "Nombre", "Descripción", "Precio Publico", "Caducidad"
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
            jTCaducidad.setModel(modelo1);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString() + "error en la creacion del modelo");
        }
    }

    private void CrearModelo2() {
        try {
            modelo2 = (new DefaultTableModel(
                    null, new String[]{
                        "ID Producto", "Nombre", "Descripción", "Precio Publico", "Existencia"
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
            jTExistencia.setModel(modelo2);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString() + "error en la creacion del modelo");
        }
    }

    public void llenaTabla1() {
        ArrayList<Object> mapeoUsers = new ArrayList<Object>();
        Querys q = new Querys();
        modelo1.setRowCount(0);
        try {
            mapeoUsers = q.Seleccion(con, "*", "medicamentos",
                    "Caducidad BETWEEN CURDATE() AND DATE_ADD(NOW(),INTERVAL 2 MONTH)", false);
            Object[] filas = new Object[5];

            while (!mapeoUsers.isEmpty()) {

                filas[0] = ((String) mapeoUsers.get(0)).trim();
                filas[1] = ((String) mapeoUsers.get(1)).trim();
                filas[2] = ((String) mapeoUsers.get(3)).trim();
                filas[3] = ((String) mapeoUsers.get(9)).trim();
                filas[4] = ((String) mapeoUsers.get(5)).trim();

                for (int i = 0; i < 11; i++) {
                    mapeoUsers.remove(0);
                }
                modelo1.addRow(filas);
            }

        } catch (Exception e) {
            System.out.println("Error en el llenado de la tabla: " + e.toString());
        }
    }

    public void llenaTabla2() {
        ArrayList<Object> mapeoUsers = new ArrayList<Object>();
        Querys q = new Querys();
        modelo2.setRowCount(0);
        try {
            mapeoUsers = q.Seleccion(con, "*", "medicamentos", "Existencia BETWEEN '1' AND '20'", false);

            Object[] filas = new Object[5];

            while (!mapeoUsers.isEmpty()) {

                filas[0] = ((String) mapeoUsers.get(0)).trim();
                filas[1] = ((String) mapeoUsers.get(1)).trim();
                filas[2] = ((String) mapeoUsers.get(3)).trim();
                filas[3] = ((String) mapeoUsers.get(9)).trim();
                filas[4] = ((String) mapeoUsers.get(10)).trim();

                for (int i = 0; i < 11; i++) {
                    mapeoUsers.remove(0);
                }
                modelo2.addRow(filas);
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
            java.util.logging.Logger.getLogger(vtnAdminMenuBodegaNotify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vtnAdminMenuBodegaNotify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vtnAdminMenuBodegaNotify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vtnAdminMenuBodegaNotify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new vtnAdminMenuBodegaNotify().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLCerrar;
    private javax.swing.JLabel jLMinimizar;
    private javax.swing.JLabel jLTitulo1;
    private javax.swing.JLabel jLTitulo2;
    private javax.swing.JLabel jLTitulo3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTCaducidad;
    private javax.swing.JTable jTExistencia;
    // End of variables declaration//GEN-END:variables
}
