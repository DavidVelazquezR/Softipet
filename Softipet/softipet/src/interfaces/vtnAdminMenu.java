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
import java.awt.Color;
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
public class vtnAdminMenu extends javax.swing.JFrame {

    int xy, xx;
    ImageIcon icon1 = new ImageIcon("src/design/notificacion1.png");
    ImageIcon icon2 = new ImageIcon("src/design/notificacion2.png");
    ImageIcon icon3 = new ImageIcon("src/design/notificacion3.png");
    Icon a1 = new ImageIcon(icon1.getImage());
    Icon a2 = new ImageIcon(icon2.getImage());
    Icon a3 = new ImageIcon(icon3.getImage());

    /**
     * Creates new form vtnMainAdmin
     */
    public vtnAdminMenu() {
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

        jPanel1 = new javax.swing.JPanel();
        jLTitulo = new javax.swing.JLabel();
        jLUser = new javax.swing.JLabel();
        jLManageUsers = new javax.swing.JLabel();
        jLMU1 = new javax.swing.JLabel();
        jLMU2 = new javax.swing.JLabel();
        jLMU3 = new javax.swing.JLabel();
        jLMU4 = new javax.swing.JLabel();
        jLMU5 = new javax.swing.JLabel();
        jLMU6 = new javax.swing.JLabel();
        jLMU7 = new javax.swing.JLabel();
        jLMU8 = new javax.swing.JLabel();
        jLMU9 = new javax.swing.JLabel();
        jLManageDrugs = new javax.swing.JLabel();
        jLManageProv = new javax.swing.JLabel();
        jLMU10 = new javax.swing.JLabel();
        jLManageBod = new javax.swing.JLabel();
        jLNotify = new javax.swing.JLabel();
        jLMU11 = new javax.swing.JLabel();
        jLManageBod1 = new javax.swing.JLabel();
        jLLayer = new javax.swing.JLabel();
        jLCerrar = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Admin SOFTIPET");
        setType(java.awt.Window.Type.POPUP);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLTitulo.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLTitulo.setText("Bienvenido:");
        jPanel1.add(jLTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLUser.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jPanel1.add(jLUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 230, 30));

        jLManageUsers.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLManageUsers.setText("Administracion de usuarios");
        jPanel1.add(jLManageUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, 20));

        jLMU1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/usuario (1).png"))); // NOI18N
        jLMU1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLMU1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLMU1MouseClicked(evt);
            }
        });
        jPanel1.add(jLMU1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 40, 40));

        jLMU2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/anadir.png"))); // NOI18N
        jLMU2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLMU2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLMU2MouseClicked(evt);
            }
        });
        jPanel1.add(jLMU2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 40, 40));

        jLMU3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/editar.png"))); // NOI18N
        jLMU3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLMU3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLMU3MouseClicked(evt);
            }
        });
        jPanel1.add(jLMU3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 40, 40));

        jLMU4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/usuario.png"))); // NOI18N
        jLMU4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLMU4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLMU4MouseClicked(evt);
            }
        });
        jPanel1.add(jLMU4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 40, 40));

        jLMU5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/farmaco.png"))); // NOI18N
        jLMU5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLMU5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLMU5MouseClicked(evt);
            }
        });
        jPanel1.add(jLMU5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 40, 40));

        jLMU6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/droga.png"))); // NOI18N
        jLMU6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLMU6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLMU6MouseClicked(evt);
            }
        });
        jPanel1.add(jLMU6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 40, 40));

        jLMU7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/jeringuilla.png"))); // NOI18N
        jLMU7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLMU7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLMU7MouseClicked(evt);
            }
        });
        jPanel1.add(jLMU7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 40, 40));

        jLMU8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/veterinario.png"))); // NOI18N
        jLMU8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLMU8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLMU8MouseClicked(evt);
            }
        });
        jPanel1.add(jLMU8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 40, 40));

        jLMU9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/inventario (1).png"))); // NOI18N
        jLMU9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLMU9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLMU9MouseClicked(evt);
            }
        });
        jPanel1.add(jLMU9, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, 80, 80));

        jLManageDrugs.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLManageDrugs.setText("Administración de productos");
        jPanel1.add(jLManageDrugs, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 210, 20));

        jLManageProv.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLManageProv.setText("Administración de proveedores");
        jPanel1.add(jLManageProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, 230, 20));

        jLMU10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/capital.png"))); // NOI18N
        jLMU10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLMU10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLMU10MouseClicked(evt);
            }
        });
        jPanel1.add(jLMU10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 80, 80));

        jLManageBod.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLManageBod.setText("Adminitrar bodega");
        jPanel1.add(jLManageBod, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 140, 20));

        jLNotify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/notificacion1.png"))); // NOI18N
        jLNotify.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLNotifyMouseClicked(evt);
            }
        });
        jPanel1.add(jLNotify, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, 40, 40));

        jLMU11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/punto-de-venta.png"))); // NOI18N
        jLMU11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLMU11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLMU11MouseClicked(evt);
            }
        });
        jPanel1.add(jLMU11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 80, 80));

        jLManageBod1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLManageBod1.setText("Ventas");
        jPanel1.add(jLManageBod1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, 70, 20));

        jLLayer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/softipet.png"))); // NOI18N
        jPanel1.add(jLLayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 350, 80, 100));

        jLCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/cerrar-sesion.png"))); // NOI18N
        jLCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLCerrarMouseClicked(evt);
            }
        });
        jPanel1.add(jLCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 400, 30, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 460));

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLCerrarMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLCerrarMouseClicked
    {//GEN-HEADEREND:event_jLCerrarMouseClicked
        if (Mensaje.pregunta(this, "¿Estas seguro que deseas salir de tu sesion?") == JOptionPane.YES_OPTION) {
            this.dispose();
            new vtnLogin().setVisible(true);
            Sesion.datosUsuario.clear();
        }
    }//GEN-LAST:event_jLCerrarMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
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

    private void jLMU2MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLMU2MouseClicked
    {//GEN-HEADEREND:event_jLMU2MouseClicked
        this.dispose();
        new vtnAdminMenuUsuarios().setVisible(true);
    }//GEN-LAST:event_jLMU2MouseClicked

    private void jLMU3MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLMU3MouseClicked
    {//GEN-HEADEREND:event_jLMU3MouseClicked
        this.dispose();
        new vtnAdminMenuUsuarios().setVisible(true);
    }//GEN-LAST:event_jLMU3MouseClicked

    private void jLMU4MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLMU4MouseClicked
    {//GEN-HEADEREND:event_jLMU4MouseClicked
        this.dispose();
        new vtnAdminMenuUsuarios().setVisible(true);
    }//GEN-LAST:event_jLMU4MouseClicked

    private void jLMU1MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLMU1MouseClicked
    {//GEN-HEADEREND:event_jLMU1MouseClicked
        this.dispose();
        new vtnAdminMenuUsuarios().setVisible(true);
    }//GEN-LAST:event_jLMU1MouseClicked

    private void jLMU5MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLMU5MouseClicked
    {//GEN-HEADEREND:event_jLMU5MouseClicked
        this.dispose();
        new vtnAdminMenuProductos().setVisible(true);
    }//GEN-LAST:event_jLMU5MouseClicked

    private void jLMU6MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLMU6MouseClicked
    {//GEN-HEADEREND:event_jLMU6MouseClicked
        this.dispose();
        new vtnAdminMenuProductos().setVisible(true);
    }//GEN-LAST:event_jLMU6MouseClicked

    private void jLMU7MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLMU7MouseClicked
    {//GEN-HEADEREND:event_jLMU7MouseClicked
        this.dispose();
        new vtnAdminMenuProductos().setVisible(true);
    }//GEN-LAST:event_jLMU7MouseClicked

    private void jLMU8MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLMU8MouseClicked
    {//GEN-HEADEREND:event_jLMU8MouseClicked
        this.dispose();
        new vtnAdminMenuProductos().setVisible(true);
    }//GEN-LAST:event_jLMU8MouseClicked

    private void jLMU9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLMU9MouseClicked
        this.dispose();
        new vtnAdminMenuProveedor().setVisible(true);
    }//GEN-LAST:event_jLMU9MouseClicked

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
            java.util.logging.Logger.getLogger(vtnAdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vtnAdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vtnAdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vtnAdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vtnAdminMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLCerrar;
    private javax.swing.JLabel jLLayer;
    private javax.swing.JLabel jLMU1;
    private javax.swing.JLabel jLMU10;
    private javax.swing.JLabel jLMU11;
    private javax.swing.JLabel jLMU2;
    private javax.swing.JLabel jLMU3;
    private javax.swing.JLabel jLMU4;
    private javax.swing.JLabel jLMU5;
    private javax.swing.JLabel jLMU6;
    private javax.swing.JLabel jLMU7;
    private javax.swing.JLabel jLMU8;
    private javax.swing.JLabel jLMU9;
    private javax.swing.JLabel jLManageBod;
    private javax.swing.JLabel jLManageBod1;
    private javax.swing.JLabel jLManageDrugs;
    private javax.swing.JLabel jLManageProv;
    private javax.swing.JLabel jLManageUsers;
    private javax.swing.JLabel jLNotify;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JLabel jLUser;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
