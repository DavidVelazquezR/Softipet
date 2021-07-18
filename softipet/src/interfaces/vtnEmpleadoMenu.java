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
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class vtnEmpleadoMenu extends javax.swing.JFrame {

    int xy, xx;
    ImageIcon icon1 = new ImageIcon("src/design/notificacion1.png");
    ImageIcon icon2 = new ImageIcon("src/design/notificacion2.png");
    ImageIcon icon3 = new ImageIcon("src/design/notificacion3.png");
    Icon a1 = new ImageIcon(icon1.getImage());
    Icon a2 = new ImageIcon(icon2.getImage());
    Icon a3 = new ImageIcon(icon3.getImage());

    /**
     * Creates new form vtnEmpleado
     */
    public vtnEmpleadoMenu() {
        initComponents();
        Image icono = Toolkit.getDefaultToolkit().getImage("src/design/softipet.png");
        this.setIconImage(icono);
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
        jLMU10 = new javax.swing.JLabel();
        jLManageBod = new javax.swing.JLabel();
        jLNotify = new javax.swing.JLabel();
        jLMU11 = new javax.swing.JLabel();
        jLManageBod1 = new javax.swing.JLabel();
        jLTitulo = new javax.swing.JLabel();
        jLUser = new javax.swing.JLabel();
        jLLayer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        jLCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/cerrar-sesion.png"))); // NOI18N
        jLCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLCerrarMouseClicked(evt);
            }
        });
        jPanel3.add(jLCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 30, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 40));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLMU10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/capital.png"))); // NOI18N
        jLMU10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLMU10MouseClicked(evt);
            }
        });
        jPanel1.add(jLMU10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 80, 80));

        jLManageBod.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLManageBod.setText("Adminitrar bodega");
        jPanel1.add(jLManageBod, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 140, 20));

        jLNotify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/notificacion1.png"))); // NOI18N
        jLNotify.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLNotifyMouseClicked(evt);
            }
        });
        jPanel1.add(jLNotify, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, 40, 40));

        jLMU11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/punto-de-venta.png"))); // NOI18N
        jLMU11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLMU11MouseClicked(evt);
            }
        });
        jPanel1.add(jLMU11, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 80, 80));

        jLManageBod1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLManageBod1.setText("Ventas");
        jPanel1.add(jLManageBod1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 70, 20));

        jLTitulo.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLTitulo.setText("Bienvenido:");
        jPanel1.add(jLTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLUser.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jPanel1.add(jLUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 230, 30));

        jLLayer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/softipet.png"))); // NOI18N
        jPanel1.add(jLLayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 350, 80, 100));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 800, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLMinimizarMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLMinimizarMouseClicked
    {//GEN-HEADEREND:event_jLMinimizarMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jLMinimizarMouseClicked

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

    private void jLMU10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLMU10MouseClicked
        this.dispose();
        new vtnAdminMenuBodega(Integer.parseInt((String) Sesion.datosUsuario.get(11))).setVisible(true);
    }//GEN-LAST:event_jLMU10MouseClicked

    private void jLNotifyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLNotifyMouseClicked
        if (jLNotify.getIcon().equals(a1)) {
            Mensaje.error(this, "No hay notificaciones");
        } else if (jLNotify.getIcon().equals(a3)) {
            this.dispose();
            new vtnAdminMenuBodegaNotify(Integer.parseInt((String) Sesion.datosUsuario.get(11))).setVisible(true);
        }
    }//GEN-LAST:event_jLNotifyMouseClicked

    private void jLMU11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLMU11MouseClicked
        this.dispose();
        new vtnAdminMenuVentas(Integer.parseInt((String) Sesion.datosUsuario.get(11))).setVisible(true);
    }//GEN-LAST:event_jLMU11MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Genera las perdidas correspondientes
        Querys q = new Querys();
        ArrayList<Object> mapeoProduct = new ArrayList<Object>();
        ArrayList<Object> mapeoPerdidas = new ArrayList<Object>();

        try {
            mapeoProduct = q.Seleccion(con,
                    "Id_medicamento, Caducidad, Existencia, Precio_fabricante", "medicamentos", "", false);
        } catch (Exception e) {
            System.out.println("Error al seleccionar los medicamentos..." + e);
        }
        String fechaCad;
        String idMedicamento;
        String existencia;
        String precio;
        String values = null;
        DateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaC = new Date();
        Date fechaActual = new Date();
        String fechaF = f.format(fechaActual);

        for (int i = 0; i < mapeoProduct.size(); i++) {
            idMedicamento = ((String) mapeoProduct.get(0)).trim();
            fechaCad = ((String) mapeoProduct.get(1)).trim();
            existencia = ((String) mapeoProduct.get(2)).trim();
            precio = ((String) mapeoProduct.get(3)).trim();

            float costoTotal = Float.parseFloat(precio) * Float.parseFloat(existencia);
            try {
                fechaC = f.parse(fechaCad);
            } catch (ParseException ex) {
                System.out.println("Error al tranformar string a date..." + ex);
            }
            if (fechaC.before(fechaActual) && Integer.parseInt(existencia) >= 1) {
                try {
                    q.Modificar(con, "medicamentos", "Existencia", "0", "Id_medicamento = " + idMedicamento);
                } catch (Exception e) {
                    System.out.println("Error en el modifica en medicamnetos..." + e);
                }
                try {
                    mapeoPerdidas = q.Seleccion(con, "MAX(Id_perdida)", "perdidas", "", false);
                } catch (Exception e) {
                    System.out.println("Error en la seleccion de perdidas..." + e);
                }

                if (mapeoPerdidas.get(0).equals("null")) {
                    values = "'" + 1 + "',"
                            + "'" + idMedicamento + "',"
                            + "'" + existencia + "',"
                            + "'" + costoTotal + "',"
                            + "'" + fechaF + "'";
                } else {
                    values = "'" + ((String) mapeoPerdidas.get(0)).trim() + "',"
                            + "'" + idMedicamento + "',"
                            + "'" + existencia + "',"
                            + "'" + costoTotal + "',"
                            + "'" + fechaF + "'";
                }
                try {
                    q.Insertar(con, "perdidas", values);
                } catch (Exception e) {
                    System.out.println("Error al insertar en perdidas..." + e);
                }
                System.out.println("Se quitaron los stocks caducados");
            }
            mapeoProduct.remove(0);
            mapeoProduct.remove(0);
            mapeoProduct.remove(0);
            mapeoProduct.remove(0);
        }

        //Verifica si hay notificaciones
        ArrayList<Object> mapeoProducto = new ArrayList<Object>();

        try {
            mapeoProducto = q.Seleccion(con, "Caducidad, Existencia", "medicamentos", "Existencia <= '20' OR "
                    + "Caducidad < DATE_ADD(NOW(),INTERVAL 2 MONTH)", false);
        } catch (Exception e) {
            System.out.println("Error al consultar medicamnetos..." + e);
        }

        if (mapeoProducto.get(0).equals("null")
                || mapeoProducto.get(0).equals("")
                || mapeoProducto.get(0).equals(" ")) {
            jLNotify.setIcon(a1);
        } else {
            jLNotify.setIcon(a3);
        }
        jLUser.setText((String) Sesion.datosUsuario.get(1));
    }//GEN-LAST:event_formWindowOpened

    private void jLCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCerrarMouseClicked

        if (Mensaje.pregunta(this, "¿Estas seguro que deseas salir de tu sesion?") == JOptionPane.YES_OPTION) {
            this.dispose();
            new vtnLogin().setVisible(true);
            Sesion.datosUsuario.clear();
        }

    }//GEN-LAST:event_jLCerrarMouseClicked

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
            java.util.logging.Logger.getLogger(vtnEmpleadoMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vtnEmpleadoMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vtnEmpleadoMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vtnEmpleadoMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vtnEmpleadoMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLCerrar;
    private javax.swing.JLabel jLLayer;
    private javax.swing.JLabel jLMU10;
    private javax.swing.JLabel jLMU11;
    private javax.swing.JLabel jLManageBod;
    private javax.swing.JLabel jLManageBod1;
    private javax.swing.JLabel jLMinimizar;
    private javax.swing.JLabel jLNotify;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JLabel jLUser;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}