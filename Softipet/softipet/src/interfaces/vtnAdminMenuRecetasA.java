/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import bd.Querys;
import bd.Autocomplete;
import bd.Sesion;
import cjb.ci.CtrlInterfaz;
import cjb.ci.Mensaje;
import cjb.ci.Validaciones;
import com.mxrck.autocompleter.TextAutoCompleter;
import com.sun.org.apache.bcel.internal.classfile.JavaClass;
import static interfaces.vtnLogin.con;
import java.awt.Color;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.text.StyledEditorKit;
import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;
import reporte.generadorReceta;

/**
 *
 * @author david
 */
public class vtnAdminMenuRecetasA extends javax.swing.JFrame {

    int xy, xx;
    TextAutoCompleter ac;
    vtnAdminMenuProductosPOPUP menuPOPUP = new vtnAdminMenuProductosPOPUP();

    /**
     * Creates new form vtnAdminAU
     */
    public vtnAdminMenuRecetasA() {
        initComponents();
        ac = new TextAutoCompleter(jTFAnimal);
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
        jPanel2 = new javax.swing.JPanel();
        jLTitulo1 = new javax.swing.JLabel();
        jBAlta = new javax.swing.JButton();
        jBLimpia = new javax.swing.JButton();
        jLAnimal = new javax.swing.JLabel();
        jTFAnimal = new javax.swing.JTextField();
        jLRaza = new javax.swing.JLabel();
        jTFRaza = new javax.swing.JTextField();
        jLDiagnostico = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTADiagnostico = new javax.swing.JTextArea();
        jLMedicacion = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTAMedicacion = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
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
        jPanel3.add(jLMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, -1, 40));

        jLCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/regreso.png"))); // NOI18N
        jLCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLCerrarMouseClicked(evt);
            }
        });
        jPanel3.add(jLCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 30, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 40));

        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel2MouseMoved(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLTitulo1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLTitulo1.setText("Receta");
        jPanel2.add(jLTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jBAlta.setText("Generar receta");
        jBAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAltaActionPerformed(evt);
            }
        });
        jPanel2.add(jBAlta, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 110, -1));

        jBLimpia.setText("Limpiar");
        jBLimpia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiaActionPerformed(evt);
            }
        });
        jPanel2.add(jBLimpia, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, 110, -1));

        jLAnimal.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLAnimal.setText("Animal:");
        jPanel2.add(jLAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jTFAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFAnimalActionPerformed(evt);
            }
        });
        jTFAnimal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFAnimalKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFAnimalKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFAnimalKeyTyped(evt);
            }
        });
        jPanel2.add(jTFAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 180, -1));

        jLRaza.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLRaza.setText("Raza:");
        jPanel2.add(jLRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, -1, -1));

        jTFRaza.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFRazaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFRazaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFRazaKeyTyped(evt);
            }
        });
        jPanel2.add(jTFRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 180, -1));

        jLDiagnostico.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLDiagnostico.setText("Diagnostico:");
        jPanel2.add(jLDiagnostico, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jTADiagnostico.setColumns(20);
        jTADiagnostico.setRows(5);
        jTADiagnostico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTADiagnosticoKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTADiagnostico);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 420, 40));

        jLMedicacion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLMedicacion.setText("Medicacion:");
        jPanel2.add(jLMedicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        jTAMedicacion.setColumns(20);
        jTAMedicacion.setRows(5);
        jTAMedicacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTAMedicacionKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTAMedicacion);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 420, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 550, 420));

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
        new vtnAdminMenuRecetas().setVisible(true);
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
        Querys q = new Querys();
        ArrayList<Object> mapeoProductos = new ArrayList<Object>();
        ArrayList<Object> mapeoProductosF = new ArrayList<Object>();

        try {
            mapeoProductos = q.Seleccion(con, "Id_medicamento, Nombre_generico", "medicamentos",
                    "Caducidad >= CURDATE()", false);
            int constant = mapeoProductos.size() / 2;
            int id;
            for (int i = 0; i < constant; i++) {
                String producto = ((String) mapeoProductos.get(1)).trim() + "." + ((String) mapeoProductos.get(0)).trim();
                mapeoProductosF.add(producto);
                mapeoProductos.remove(0);
                mapeoProductos.remove(0);
            }

            for (int i = 0; i < mapeoProductosF.size(); i++) {
                ac.addItem(((String) mapeoProductosF.get(i)).trim());
            }
        } catch (Exception e) {
            System.out.println("Error al consultar productos..." + e);
        }
    }//GEN-LAST:event_formWindowOpened

    private void formWindowStateChanged(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowStateChanged
    {//GEN-HEADEREND:event_formWindowStateChanged

    }//GEN-LAST:event_formWindowStateChanged

    private void jBAltaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jBAltaActionPerformed
    {//GEN-HEADEREND:event_jBAltaActionPerformed
        Querys q = new Querys();
        ArrayList<Object> infoDoc = new ArrayList<Object>();

        if (jLAnimal.getForeground().getRGB() == Color.GREEN.getRGB()
                && jLRaza.getForeground().getRGB() == Color.GREEN.getRGB()
                && jLDiagnostico.getForeground().getRGB() == Color.GREEN.getRGB()
                && jLMedicacion.getForeground().getRGB() == Color.GREEN.getRGB()) {

            crearReceta();

            Mensaje.exito(this, "Se creo la receta correctamente");
        } else {
            Mensaje.error(this, "Verifique que todos los campos esten en verde");
        }
    }//GEN-LAST:event_jBAltaActionPerformed

    private void jBLimpiaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jBLimpiaActionPerformed
    {//GEN-HEADEREND:event_jBLimpiaActionPerformed
        CtrlInterfaz.limpia(jTFAnimal, jTFRaza);
        jTADiagnostico.setText("");
        jTAMedicacion.setText("");

        jLAnimal.setForeground(Color.BLACK);
        jLRaza.setForeground(Color.BLACK);
        jLDiagnostico.setForeground(Color.BLACK);
        jLMedicacion.setForeground(Color.BLACK);

        CtrlInterfaz.selecciona(jTFAnimal);
    }//GEN-LAST:event_jBLimpiaActionPerformed

    private void jPanel2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseMoved

    }//GEN-LAST:event_jPanel2MouseMoved

    private void jTFAnimalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFAnimalKeyPressed

    }//GEN-LAST:event_jTFAnimalKeyPressed

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        menuPOPUP.dispose();
    }//GEN-LAST:event_jPanel2MouseClicked

    private void jTFAnimalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFAnimalKeyReleased
        if (jTFAnimal.getText().isEmpty()) {
            jLAnimal.setForeground(Color.BLACK);
        } else {
            jLAnimal.setForeground(Color.GREEN);
            Validaciones.enter(this, evt, jTFRaza);
        }
    }//GEN-LAST:event_jTFAnimalKeyReleased

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved

    }//GEN-LAST:event_formMouseMoved

    private void jTFAnimalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFAnimalKeyTyped
        Validaciones.validaAlfabeticos(evt);
    }//GEN-LAST:event_jTFAnimalKeyTyped

    private void jTFRazaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFRazaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFRazaKeyPressed

    private void jTFRazaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFRazaKeyReleased
        if (jTFRaza.getText().isEmpty()) {
            jLRaza.setForeground(Color.BLACK);
        } else {
            jLRaza.setForeground(Color.GREEN);
            Validaciones.enter(this, evt, jTADiagnostico);
        }
    }//GEN-LAST:event_jTFRazaKeyReleased

    private void jTFRazaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFRazaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFRazaKeyTyped

    private void jTFAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFAnimalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFAnimalActionPerformed

    private void jTAMedicacionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTAMedicacionKeyReleased
        if (jTAMedicacion.getText().isEmpty()) {
            jLMedicacion.setForeground(Color.BLACK);
        } else {
            jLMedicacion.setForeground(Color.GREEN);
        }
    }//GEN-LAST:event_jTAMedicacionKeyReleased

    private void jTADiagnosticoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTADiagnosticoKeyReleased
        if (jTADiagnostico.getText().isEmpty()) {
            jLDiagnostico.setForeground(Color.BLACK);
        } else {
            jLDiagnostico.setForeground(Color.GREEN);
        }
    }//GEN-LAST:event_jTADiagnosticoKeyReleased

    public ArrayList<Object> crearReceta() {
        Querys q = new Querys();
        ArrayList<Object> doc = new ArrayList<Object>();
        ArrayList<Object> user = new ArrayList<Object>();
        ArrayList<Object> folioMax = new ArrayList<Object>();
        generadorReceta g = new generadorReceta();
        try {
            user = q.Seleccion(con, "*", "usuarios",
                    "Id_empleado = " + Sesion.datosUsuario.get(0), false);
        } catch (Exception e) {
            System.out.println("Error al obtener data usarios..." + e);
        }

        try {
            doc = q.Seleccion(con, "*", "medicos",
                    "Id_medico = " + Sesion.datosUsuario.get(0), false);
        } catch (Exception e) {
            System.out.println("Error al obtener data veterinario..." + e);
        }

        try {
            folioMax = q.Seleccion(con, "MAX(Id_receta)", "receta", "", false);
        } catch (Exception e) {
            System.out.println("Error al obtener data usarios..." + e);
        }

        Calendar c = Calendar.getInstance();
        String dia = Integer.toString(c.get(Calendar.DATE));
        String mes = Integer.toString(c.get(Calendar.MONTH));
        String annio = Integer.toString(c.get(Calendar.YEAR));

        switch (Integer.parseInt(mes)) {
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

        String iconoSoftipet = "src\\design\\softipet.png";
        String header = "Veterinaria 'La croqueta'\n\n\n\n";
        String headerleft;
        if (((String) folioMax.get(0)).equals("null")) {
            headerleft = "Santiago Tianguistenco, Méx. a " + dia + " de " + mes + " del " + annio + "\n\n"
                    + "Cedula profesional: " + doc.get(2) + "\n\n"
                    + "Número de contacto: " + user.get(4) + "\n\n"
                    + "Veterinario: " + user.get(1) + " " + user.get(2) + " " + user.get(3) + " \n\n"
                    + "Folio de receta: 1 \n\n\n";
        } else {
            headerleft = "Santiago Tianguistenco, Méx. a " + dia + " de " + mes + " del " + annio + ".\n\n"
                    + "Cedula profesional: " + doc.get(2) + "\n\n"
                    + "Número de contacto: " + user.get(4) + "\n\n"
                    + "Veterinario: " + user.get(1) + " " + user.get(2) + " " + user.get(3) + " \n\n"
                    + "Folio de receta: " + (Integer.parseInt((String) folioMax.get(0)) + 1) + "\n\n\n";
        }
        jTADiagnostico.setLineWrap(false);
        jTAMedicacion.setLineWrap(false);

        String body1 = jTFAnimal.getText();
        String body2 = jTFRaza.getText();
        String body3 = jTADiagnostico.getText();
        String body4 = jTAMedicacion.getText();

        String footer = "\n\n____________________\t\t\t\t\t\t____________________\n"
                + "\tFirma del veterinario\t\t\t\t\tSello del veterinario\n";

        String salida = "src\\receta.pdf";

        g.generarPDF(header, iconoSoftipet, headerleft, body1, body2, body3, body4, footer, salida);

        DateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaC = new Date();
        Date fechaActual = new Date();
        String fechaF = f.format(fechaActual);
        String values = "";
        if (((String) folioMax.get(0)).equals("null")) {
            values = "'" + 1 + "',"
                    + "'" + doc.get(0) + "',"
                    + "'" + fechaF + "',"
                    + "'" + jTFAnimal.getText() + "',"
                    + "'" + jTFRaza.getText() + "',"
                    + "'" + jTADiagnostico.getText() + "',"
                    + "'" + jTAMedicacion.getText() + "'";

        } else {
            values = "'" + (Integer.parseInt((String) folioMax.get(0)) + 1) + "',"
                    + "'" + doc.get(0) + "',"
                    + "'" + fechaF + "',"
                    + "'" + jTFAnimal.getText() + "',"
                    + "'" + jTFRaza.getText() + "',"
                    + "'" + jTADiagnostico.getText() + "',"
                    + "'" + jTAMedicacion.getText() + "'";
        }

        try {
            q.Insertar(con, "receta", values);
        } catch (Exception e) {
        }
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
            java.util.logging.Logger.getLogger(vtnAdminMenuRecetasA.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vtnAdminMenuRecetasA.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vtnAdminMenuRecetasA.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vtnAdminMenuRecetasA.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vtnAdminMenuRecetasA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAlta;
    private javax.swing.JButton jBLimpia;
    private javax.swing.JLabel jLAnimal;
    private javax.swing.JLabel jLCerrar;
    private javax.swing.JLabel jLDiagnostico;
    private javax.swing.JLabel jLMedicacion;
    private javax.swing.JLabel jLMinimizar;
    private javax.swing.JLabel jLRaza;
    private javax.swing.JLabel jLTitulo1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTADiagnostico;
    private javax.swing.JTextArea jTAMedicacion;
    private javax.swing.JTextField jTFAnimal;
    private javax.swing.JTextField jTFRaza;
    // End of variables declaration//GEN-END:variables
}
