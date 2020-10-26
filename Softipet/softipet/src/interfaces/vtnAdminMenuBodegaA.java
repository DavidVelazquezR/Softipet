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

/**
 *
 * @author david
 */
public class vtnAdminMenuBodegaA extends javax.swing.JFrame {

    int xy, xx;
    TextAutoCompleter ac;
    vtnAdminMenuProductosPOPUP menuPOPUP = new vtnAdminMenuProductosPOPUP();

    /**
     * Creates new form vtnAdminAU
     */
    public vtnAdminMenuBodegaA() {
        initComponents();
        ac = new TextAutoCompleter(jTFProducto);
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
        jLIDProducto = new javax.swing.JLabel();
        jTFProducto = new javax.swing.JTextField();
        jLIDProveedor = new javax.swing.JLabel();
        jTFProveedor = new javax.swing.JTextField();
        jLCantidad = new javax.swing.JLabel();
        jTFCantidad = new javax.swing.JTextField();
        jTFNombreRepart = new javax.swing.JTextField();
        jLNombreRepart = new javax.swing.JLabel();
        jLAPRepart = new javax.swing.JLabel();
        jTFAPRepart = new javax.swing.JTextField();
        jLAMRepart = new javax.swing.JLabel();
        jTFAMRepart = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

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
        jLTitulo1.setText("Recibir productos en bodega");
        jPanel2.add(jLTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jBAlta.setText("Recibir pedido");
        jBAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAltaActionPerformed(evt);
            }
        });
        jPanel2.add(jBAlta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, -1, -1));

        jBLimpia.setText("Limpiar");
        jBLimpia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiaActionPerformed(evt);
            }
        });
        jPanel2.add(jBLimpia, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 110, -1));

        jLIDProducto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLIDProducto.setText("Producto:");
        jPanel2.add(jLIDProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jTFProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFProductoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFProductoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFProductoKeyTyped(evt);
            }
        });
        jPanel2.add(jTFProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 180, -1));

        jLIDProveedor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLIDProveedor.setText("Proveedor:");
        jPanel2.add(jLIDProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jTFProveedor.setEnabled(false);
        jTFProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFProveedorKeyPressed(evt);
            }
        });
        jPanel2.add(jTFProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 180, -1));

        jLCantidad.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLCantidad.setText("Cantidad:");
        jPanel2.add(jLCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        jTFCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFCantidadKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFCantidadKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFCantidadKeyTyped(evt);
            }
        });
        jPanel2.add(jTFCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 180, -1));

        jTFNombreRepart.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFNombreRepartKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFNombreRepartKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFNombreRepartKeyTyped(evt);
            }
        });
        jPanel2.add(jTFNombreRepart, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 180, -1));

        jLNombreRepart.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLNombreRepart.setText("Nombre del repartidor:");
        jPanel2.add(jLNombreRepart, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, -1, -1));

        jLAPRepart.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLAPRepart.setText("Apellido Paterno del repartidor:");
        jPanel2.add(jLAPRepart, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, -1, -1));

        jTFAPRepart.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFAPRepartKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFAPRepartKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFAPRepartKeyTyped(evt);
            }
        });
        jPanel2.add(jTFAPRepart, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 180, -1));

        jLAMRepart.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLAMRepart.setText("Apellido Materno del repartidor:");
        jPanel2.add(jLAMRepart, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, -1, -1));

        jTFAMRepart.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFAMRepartKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFAMRepartKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFAMRepartKeyTyped(evt);
            }
        });
        jPanel2.add(jTFAMRepart, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 180, -1));

        jButton1.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 70, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 550, 400));

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
        new vtnAdminMenuBodega(Integer.parseInt((String) Sesion.datosUsuario.get(11))).setVisible(true);
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
        ArrayList<Object> mapBodega = new ArrayList<Object>();
        ArrayList<Object> existencia = new ArrayList<Object>();

        if (jLIDProducto.getForeground().getRGB() == Color.GREEN.getRGB()
                && jLIDProveedor.getForeground().getRGB() == Color.GREEN.getRGB()
                && jLCantidad.getForeground().getRGB() == Color.GREEN.getRGB()
                && jLNombreRepart.getForeground().getRGB() == Color.GREEN.getRGB()
                && jLAPRepart.getForeground().getRGB() == Color.GREEN.getRGB()
                && jLAMRepart.getForeground().getRGB() == Color.GREEN.getRGB()) {
            try {
                mapBodega = q.Seleccion(con, "MAX(Id_historial)", "bodega", "", true);
            } catch (Exception e) {
                System.out.println("consulta max id historial erronea" + e);
            }

            int idFinal = Integer.parseInt((String) mapBodega.get(0)) + 1;

            Date fecha = new Date();
            fecha.getDate();
            DateFormat f1 = new SimpleDateFormat("yyyy-MM-dd");
            DateFormat f2 = new SimpleDateFormat("hh:mm:ss");
            String fechaF = f1.format(fecha);
            String horaF = f2.format(fecha);
            System.out.println(fechaF);
            System.out.println(horaF);
            String idProd = jTFProducto.getText();
            String[] parts = idProd.split("\\.");
            String part1 = parts[0];
            String part2 = parts[1];

            try {
                existencia = q.Seleccion(con, "Existencia", "medicamentos",
                        "Id_medicamento = " + part2, false);
            } catch (Exception e) {
                System.out.println("Error al consultar existencia dle producto a actualizar..." + e);
            }
            int existenciaFinal = Integer.parseInt((String) existencia.get(0)) + Integer.parseInt((String) jTFCantidad.getText());

            String values = "'" + idFinal + "',"
                    + "'" + Sesion.datosUsuario.get(0) + "',"
                    + "'" + part2 + "',"
                    + "'" + jTFCantidad.getText() + "',"
                    + "'" + jTFNombreRepart.getText() + "',"
                    + "'" + jTFAPRepart.getText() + "',"
                    + "'" + jTFAMRepart.getText() + "',"
                    + "'" + fechaF + "',"
                    + "'" + horaF + "'";
            String campos = "Existencia";
            String values2 = "'" + existenciaFinal + "'";

            if (Mensaje.pregunta(this, "¿Estas seguro que deseas recibir el pedido en bodega?") == JOptionPane.YES_OPTION) {
                try {
                    q.Insertar(con, "bodega", values);

                } catch (Exception e) {
                    System.out.println("insercion erronea en bodega..." + e);
                }

                try {

                    q.Modificar(con, "medicamentos", campos, values2,
                            "Id_medicamento=" + part2);

                } catch (Exception e) {
                    System.out.println("actualizacion erronea en medicamnetos..." + e);
                }

                Mensaje.exito(this, "Se registro correctamente el pedido y se actualizo el stock");
                jBLimpiaActionPerformed(null);
            } else {
                Mensaje.error(this, "No se dio el registro del pedido");
            }
        } else {
            Mensaje.error(this, "Verifique que todos los campos esten en verde");
        }

        menuPOPUP.dispose();
    }//GEN-LAST:event_jBAltaActionPerformed

    private void jBLimpiaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jBLimpiaActionPerformed
    {//GEN-HEADEREND:event_jBLimpiaActionPerformed
        CtrlInterfaz.limpia(jTFProducto, jTFProveedor, jTFCantidad, jTFNombreRepart,
                jTFAPRepart, jTFAMRepart);

        jLIDProducto.setForeground(Color.BLACK);
        jLIDProveedor.setForeground(Color.BLACK);
        jLCantidad.setForeground(Color.BLACK);
        jLNombreRepart.setForeground(Color.BLACK);
        jLAPRepart.setForeground(Color.BLACK);
        jLAMRepart.setForeground(Color.BLACK);

        CtrlInterfaz.selecciona(jTFProducto);
    }//GEN-LAST:event_jBLimpiaActionPerformed

    private void jPanel2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseMoved

    }//GEN-LAST:event_jPanel2MouseMoved

    private void jTFProductoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFProductoKeyPressed

    }//GEN-LAST:event_jTFProductoKeyPressed

    private void jTFProveedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFProveedorKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFProveedorKeyPressed

    private void jTFCantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFCantidadKeyPressed
        Querys q = new Querys();
        ArrayList<Object> proveedor = new ArrayList<Object>();

        try {
            String producto = jTFProducto.getText();

            if (producto.contains(".")) {
                String[] parts = producto.split("\\.");
                String part1 = parts[0];
                String part2 = parts[1];
                try {
                    proveedor = q.Seleccion(con, "Id_proveedor", "medicamentos",
                            "Id_medicamento='" + part2 + "'", false);
                } catch (Exception e) {
                    System.out.println("");
                }

                String idProv = (String) proveedor.get(0);
                try {
                    proveedor = q.Seleccion(con, "NombreProveedor", "proveedores",
                            "Id_proveedor='" + idProv + "'", false);
                } catch (Exception e) {
                    System.out.println("Error al intentar obtner nombre proveedro..." + e);
                }

                if (!proveedor.isEmpty()) {
                    jTFProveedor.setText(((String) proveedor.get(0)).trim());
                    jLIDProveedor.setForeground(Color.GREEN);
                } else {
                    jLIDProveedor.setForeground(Color.RED);
                }
            } else {
                jLIDProveedor.setForeground(Color.RED);
            }

        } catch (Exception e) {
            System.out.println("Error ya que no hay datos en proveedormap..." + e);
        }
    }//GEN-LAST:event_jTFCantidadKeyPressed

    private void jTFNombreRepartKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFNombreRepartKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNombreRepartKeyPressed

    private void jTFAPRepartKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFAPRepartKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFAPRepartKeyPressed

    private void jTFAMRepartKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFAMRepartKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFAMRepartKeyPressed

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        menuPOPUP.dispose();
    }//GEN-LAST:event_jPanel2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        menuPOPUP.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTFProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFProductoKeyReleased
        if (jTFProducto.getText().isEmpty()) {
            jLIDProducto.setForeground(Color.BLACK);
            jLIDProveedor.setForeground(Color.BLACK);
            jTFProveedor.setText("");
        } else {
            jLIDProducto.setForeground(Color.GREEN);
            Validaciones.enter(this, evt, jTFCantidad);
        }
    }//GEN-LAST:event_jTFProductoKeyReleased

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved

    }//GEN-LAST:event_formMouseMoved

    private void jTFCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFCantidadKeyTyped
        Validaciones.validaEntero(evt);
    }//GEN-LAST:event_jTFCantidadKeyTyped

    private void jTFCantidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFCantidadKeyReleased
        if (jTFCantidad.getText().isEmpty()) {
            jLCantidad.setForeground(Color.BLACK);
        } else if (jTFCantidad.getText().length() <= 5) {
            jLCantidad.setForeground(Color.GREEN);
            Validaciones.enter(this, evt, jTFNombreRepart);
        } else {
            jLCantidad.setForeground(Color.RED);
        }
    }//GEN-LAST:event_jTFCantidadKeyReleased

    private void jTFProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFProductoKeyTyped
        Validaciones.validaAlfanumerico(evt);
    }//GEN-LAST:event_jTFProductoKeyTyped

    private void jTFNombreRepartKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFNombreRepartKeyTyped
        Validaciones.validaAlfabeticos(evt);
    }//GEN-LAST:event_jTFNombreRepartKeyTyped

    private void jTFAPRepartKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFAPRepartKeyTyped
        Validaciones.validaAlfabeticos(evt);
    }//GEN-LAST:event_jTFAPRepartKeyTyped

    private void jTFAMRepartKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFAMRepartKeyTyped
        Validaciones.validaAlfabeticos(evt);
    }//GEN-LAST:event_jTFAMRepartKeyTyped

    private void jTFNombreRepartKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFNombreRepartKeyReleased
        if (jTFNombreRepart.getText().isEmpty()) {
            jLNombreRepart.setForeground(Color.BLACK);
        } else {
            jLNombreRepart.setForeground(Color.GREEN);
            Validaciones.enter(this, evt, jTFAPRepart);
        }
    }//GEN-LAST:event_jTFNombreRepartKeyReleased

    private void jTFAPRepartKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFAPRepartKeyReleased
        if (jTFAPRepart.getText().isEmpty()) {
            jLAPRepart.setForeground(Color.BLACK);
        } else {
            jLAPRepart.setForeground(Color.GREEN);
            Validaciones.enter(this, evt, jTFAMRepart);
        }
    }//GEN-LAST:event_jTFAPRepartKeyReleased

    private void jTFAMRepartKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFAMRepartKeyReleased
        if (jTFAMRepart.getText().isEmpty()) {
            jLAMRepart.setForeground(Color.BLACK);
        } else {
            jLAMRepart.setForeground(Color.GREEN);
            Validaciones.enter(this, evt, jBAlta);
        }
    }//GEN-LAST:event_jTFAMRepartKeyReleased

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
            java.util.logging.Logger.getLogger(vtnAdminMenuBodegaA.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vtnAdminMenuBodegaA.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vtnAdminMenuBodegaA.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vtnAdminMenuBodegaA.class
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vtnAdminMenuBodegaA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAlta;
    private javax.swing.JButton jBLimpia;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLAMRepart;
    private javax.swing.JLabel jLAPRepart;
    private javax.swing.JLabel jLCantidad;
    private javax.swing.JLabel jLCerrar;
    private javax.swing.JLabel jLIDProducto;
    private javax.swing.JLabel jLIDProveedor;
    private javax.swing.JLabel jLMinimizar;
    private javax.swing.JLabel jLNombreRepart;
    private javax.swing.JLabel jLTitulo1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTFAMRepart;
    private javax.swing.JTextField jTFAPRepart;
    private javax.swing.JTextField jTFCantidad;
    private javax.swing.JTextField jTFNombreRepart;
    private javax.swing.JTextField jTFProducto;
    private javax.swing.JTextField jTFProveedor;
    // End of variables declaration//GEN-END:variables
}