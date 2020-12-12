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
import java.io.File;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import reporte.generadorReceta;

/**
 *
 * @author david
 */
public class vtnAdminMenuRecetas extends javax.swing.JFrame {

    int xy, xx;
    DefaultTableModel modelo = new DefaultTableModel();

    /**
     * Creates new form vtnAdminAU
     */
    public vtnAdminMenuRecetas() {
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
        jLTitulo1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTRecetas = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Recetas Principal SOFTIPET");
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
        jPanel3.add(jLMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, -1, 40));

        jLCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/regreso.png"))); // NOI18N
        jLCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLCerrarMouseClicked(evt);
            }
        });
        jPanel3.add(jLCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 0, 30, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 40));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLTitulo1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLTitulo1.setText("Recetas:");
        jPanel1.add(jLTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jTRecetas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTRecetas.setModel(new javax.swing.table.DefaultTableModel(
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
        jTRecetas.setGridColor(new java.awt.Color(255, 255, 255));
        jTRecetas.setSelectionBackground(new java.awt.Color(153, 153, 255));
        jScrollPane1.setViewportView(jTRecetas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 710, 320));

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setText("Consultar receta");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, 150, 30));

        jButton2.setBackground(new java.awt.Color(102, 255, 102));
        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setText("Generar receta");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 150, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 770, 470));

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
        new vtnMedicoMenu().setVisible(true);
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
        CrearModelo();
        llenaTabla();
    }//GEN-LAST:event_formWindowOpened

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jPanel1MouseClicked
    {//GEN-HEADEREND:event_jPanel1MouseClicked
        jTRecetas.clearSelection();
        try {
            File archivo = new File("src\\recetaConsulta.pdf");

            if (archivo.delete()) {
                System.out.println("Se borro el archivo correctamente");
            } else {
                System.out.println("no se borro el archivo");
            }
        } catch (Exception e) {
            System.out.println("error al eliminar archivo");
        }
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        new vtnAdminMenuRecetasA().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Querys q = new Querys();
        ArrayList<Object> mapeoReceta = new ArrayList<Object>();
        generadorReceta g = new generadorReceta();
        if (jTRecetas.getSelectedRow() == -1) {
            Mensaje.error(this, "No hay valores seleccionados en la tabla");
        } else {

            int row = jTRecetas.getSelectedRow();
            String idReceta = (String) jTRecetas.getValueAt(row, 0);
            try {
                mapeoReceta = q.Seleccion(con, "*", "receta",
                        "Id_receta='" + idReceta + "'", false);

            } catch (Exception e) {
                System.out.println("Error al consultar receta..." + e);
            }
            crearReceta(mapeoReceta);

            try {
                Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler " + "src\\recetaConsulta.pdf");
            } catch (Exception e) {
                System.out.println("Error al abrir el PDF");
            }

            Mensaje.exito(this, "Se consulto la receta correctamente");

        }

        try {
            File archivo = new File("src\\recetaConsulta.pdf");

            if (archivo.delete()) {
                System.out.println("Se borro el archivo correctamente");
            } else {
                System.out.println("no se borro el archivo");
            }
        } catch (Exception e) {
            System.out.println("error al eliminar archivo");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CrearModelo() {
        try {
            modelo = (new DefaultTableModel(
                    null, new String[]{
                        "ID Receta", "Medico", "Fecha de consulta", "Animal"
                    }) {
                Class[] types = new Class[]{
                    java.lang.Object.class,
                    java.lang.Object.class,
                    java.lang.Object.class,
                    java.lang.Object.class,};
                boolean[] canEdit = new boolean[]{
                    false, false, false, false
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
            jTRecetas.setModel(modelo);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString() + "error en la creacion del modelo");
        }
    }

    public void llenaTabla() {
        ArrayList<Object> mapeoRecetas = new ArrayList<Object>();
        ArrayList<Object> mapeoMedico = new ArrayList<Object>();
        ArrayList<Object> mapeoUsuario = new ArrayList<Object>();

        Querys q = new Querys();
        modelo.setRowCount(0);
        try {
            mapeoRecetas = q.Seleccion(con, "*", "receta", "", false);

            Object[] filas = new Object[4];

            while (!mapeoRecetas.isEmpty()) {

                filas[0] = ((String) mapeoRecetas.get(0)).trim();

                try {
                    mapeoMedico = q.Seleccion(con, "Id_medico", "medicos",
                            "Folio='" + ((String) mapeoRecetas.get(1)).trim() + "'", false);

                } catch (Exception e) {
                    System.out.println("Error accediendo al folio medico..." + e);
                }

                try {
                    mapeoUsuario = q.Seleccion(con, "Nombre, Apellido_paterno, Apellido_materno", "usuarios",
                            "Id_empleado='" + ((String) mapeoMedico.get(0)).trim() + "'", false);

                    filas[1] = ((String) mapeoUsuario.get(0)).trim() + " "
                            + ((String) mapeoUsuario.get(1)).trim() + " "
                            + ((String) mapeoUsuario.get(2)).trim();
                } catch (Exception e) {
                    System.out.println("Error accediendo informacion del medico..." + e);
                }

                filas[2] = (String) mapeoRecetas.get(2);
                System.out.println(filas[2]);
                filas[3] = ((String) mapeoRecetas.get(3)).trim();

                for (int i = 0; i < 7; i++) {
                    mapeoRecetas.remove(0);
                }
                modelo.addRow(filas);
            }

        } catch (Exception e) {
            System.out.println("Error en el llenado de la tabla: " + e.toString());
        }
    }

    public ArrayList<Object> crearReceta(ArrayList<Object> mapeoReceta) {
        Querys q = new Querys();
        ArrayList<Object> doc = new ArrayList<Object>();
        ArrayList<Object> user = new ArrayList<Object>();
        generadorReceta g = new generadorReceta();

        try {
            doc = q.Seleccion(con, "*", "medicos",
                    "Folio = " + ((String) mapeoReceta.get(1)).trim(), false);
        } catch (Exception e) {
            System.out.println("Error al obtener data veterinario..." + e);
        }

        try {
            user = q.Seleccion(con, "*", "usuarios",
                    "Id_empleado = " + ((String) doc.get(1)).trim(), false);
        } catch (Exception e) {
            System.out.println("Error al obtener data usarios..." + e);
        }

        String fechaC = (String) mapeoReceta.get(2);
        String[] parts = fechaC.split("-");
        String part1 = parts[0];
        String part2 = parts[1];;
        String part3 = parts[2];;
        String mes = "";

        switch (Integer.parseInt(part2)) {
            case 1:
                mes = "Enero";
                break;
            case 2:
                mes = "Febrero";
                break;
            case 3:
                mes = "Marzo";
                break;
            case 4:
                mes = "Abril";
                break;
            case 5:
                mes = "Mayo";
                break;
            case 6:
                mes = "Junio";
                break;
            case 7:
                mes = "Julio";
                break;
            case 8:
                mes = "Agosto";
                break;
            case 9:
                mes = "Septiembre";
                break;
            case 10:
                mes = "Octubre";
                break;
            case 11:
                mes = "Noviembre";
                break;
            case 12:
                mes = "Diciembre";
                break;
            default:
                break;
        }

        System.out.println(part1 + " de " + part2 + " del " + part3);

        String iconoSoftipet = "src\\design\\softipet.png";
        String header = "Veterinaria 'La croqueta'\n\n\n\n";
        String headerleft = "Santiago Tianguistenco, Méx. a " + part3 + " de " + mes + " del " + part1 + "\n\n"
                + "Cedula profesional: " + ((String) doc.get(2)).trim() + "\n\n"
                + "Número de contacto: " + ((String) user.get(4)).trim() + "\n\n"
                + "Veterinario: " + ((String) user.get(1)).trim() + " " + ((String) user.get(2)).trim() + " " + ((String) user.get(3)).trim() + " \n\n"
                + "Folio de receta: " + mapeoReceta.get(0) + " \n\n\n";

        String body1 = ((String) mapeoReceta.get(3)).trim();
        String body2 = ((String) mapeoReceta.get(4)).trim();
        String body3 = ((String) mapeoReceta.get(5)).trim();
        String body4 = ((String) mapeoReceta.get(6)).trim();

        String footer = "\n\n____________________\t\t\t\t\t\t____________________\n"
                + "\tFirma del veterinario\t\t\t\t\tSello del veterinario\n";

        String salida = "src\\recetaConsulta.pdf";

        g.generarPDF(header, iconoSoftipet, headerleft, body1, body2, body3, body4, footer, salida);

        return doc;
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
            java.util.logging.Logger.getLogger(vtnAdminMenuRecetas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vtnAdminMenuRecetas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vtnAdminMenuRecetas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vtnAdminMenuRecetas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vtnAdminMenuRecetas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLCerrar;
    private javax.swing.JLabel jLMinimizar;
    private javax.swing.JLabel jLTitulo1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTRecetas;
    // End of variables declaration//GEN-END:variables
}
