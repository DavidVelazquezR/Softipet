/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import bd.Querys;
import bd.Sesion;
import cjb.ci.CtrlInterfaz;
import cjb.ci.Mensaje;
import cjb.ci.Validaciones;
import com.mxrck.autocompleter.TextAutoCompleter;
import static interfaces.vtnLogin.con;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author david
 */
public class vtnAdminMenuVentas extends javax.swing.JFrame {

    int xy, xx;
    DefaultTableModel modelo = new DefaultTableModel();
    vtnAdminMenuProductosPOPUP menuPOPUP = new vtnAdminMenuProductosPOPUP();
    TextAutoCompleter ac;
    float Total = 0;
    ArrayList<Object> listaVenta = new ArrayList<Object>();
    int rol;

    /**
     * Creates new form vtnAdminMenuUsuariosA
     */
    public vtnAdminMenuVentas(int x) {
        initComponents();
        ac = new TextAutoCompleter(jTFProducto);
        rol = x;
    }

    vtnAdminMenuVentas() {
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
        jTVentas = new javax.swing.JTable();
        jLIDProducto = new javax.swing.JLabel();
        jTFProducto = new javax.swing.JTextField();
        jBSearch = new javax.swing.JButton();
        jLCantidad = new javax.swing.JLabel();
        jTFCantidad = new javax.swing.JTextField();
        jBAdd = new javax.swing.JButton();
        jBDrop = new javax.swing.JButton();
        jLCantidad1 = new javax.swing.JLabel();
        jTFTotal = new javax.swing.JTextField();
        jBVenta = new javax.swing.JButton();
        jBLimpia = new javax.swing.JButton();

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

        jLCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/regreso.png"))); // NOI18N
        jLCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLCerrarMouseClicked(evt);
            }
        });
        jPanel3.add(jLCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 30, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 40));

        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLTitulo1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLTitulo1.setText("Ventas");
        jPanel1.add(jLTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jTVentas.setModel(new javax.swing.table.DefaultTableModel(
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
        jTVentas.getModel().addTableModelListener(
            new TableModelListener()
            {
                public void tableChanged(TableModelEvent evt)
                {

                }
            });
            jScrollPane1.setViewportView(jTVentas);

            jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 510, 360));

            jLIDProducto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
            jLIDProducto.setText("Producto:");
            jPanel1.add(jLIDProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

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
            jPanel1.add(jTFProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 180, -1));

            jBSearch.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
            jBSearch.setText("Search");
            jBSearch.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jBSearchActionPerformed(evt);
                }
            });
            jPanel1.add(jBSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 70, 20));

            jLCantidad.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
            jLCantidad.setText("Cantidad:");
            jPanel1.add(jLCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

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
            jPanel1.add(jTFCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 180, -1));

            jBAdd.setText("Agregar");
            jBAdd.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jBAddActionPerformed(evt);
                }
            });
            jPanel1.add(jBAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

            jBDrop.setText("Eliminar");
            jBDrop.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jBDropActionPerformed(evt);
                }
            });
            jPanel1.add(jBDrop, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, -1, -1));

            jLCantidad1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
            jLCantidad1.setText("Total:");
            jPanel1.add(jLCantidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 450, -1, 20));

            jTFTotal.setText("0.0");
            jTFTotal.setEnabled(false);
            jTFTotal.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyPressed(java.awt.event.KeyEvent evt) {
                    jTFTotalKeyPressed(evt);
                }
                public void keyReleased(java.awt.event.KeyEvent evt) {
                    jTFTotalKeyReleased(evt);
                }
                public void keyTyped(java.awt.event.KeyEvent evt) {
                    jTFTotalKeyTyped(evt);
                }
            });
            jPanel1.add(jTFTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 450, 200, -1));

            jBVenta.setText("Realizar venta");
            jBVenta.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jBVentaActionPerformed(evt);
                }
            });
            jPanel1.add(jBVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 180, -1));

            jBLimpia.setText("Cancelar venta");
            jBLimpia.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jBLimpiaActionPerformed(evt);
                }
            });
            jPanel1.add(jBLimpia, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 180, -1));

            getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 800, 520));

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
        CrearModelo();

        //Se cargan datos para el autocompletado
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

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jPanel1MouseClicked
    {//GEN-HEADEREND:event_jPanel1MouseClicked
        jTVentas.clearSelection();
        menuPOPUP.dispose();
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jTFProductoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFProductoKeyPressed

    }//GEN-LAST:event_jTFProductoKeyPressed

    private void jTFProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFProductoKeyReleased

        Validaciones.enter(this, evt, jTFCantidad);

    }//GEN-LAST:event_jTFProductoKeyReleased

    private void jTFProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFProductoKeyTyped
        Validaciones.validaAlfanumerico(evt);
    }//GEN-LAST:event_jTFProductoKeyTyped

    private void jBSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSearchActionPerformed
        menuPOPUP.setVisible(true);
    }//GEN-LAST:event_jBSearchActionPerformed

    private void jTFCantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFCantidadKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCantidadKeyPressed

    private void jTFCantidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFCantidadKeyReleased
        Validaciones.enter(this, evt, jBAdd);
    }//GEN-LAST:event_jTFCantidadKeyReleased

    private void jTFCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFCantidadKeyTyped
        Validaciones.validaEntero(evt);
    }//GEN-LAST:event_jTFCantidadKeyTyped

    private void jBDropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDropActionPerformed
        if (jTVentas.getSelectedRow() == -1) {
            Mensaje.error(this, "No hay valores seleccionados en la tabla");
        } else {

            ((DefaultTableModel) jTVentas.getModel()).removeRow(jTVentas.getSelectedRow());
            updateTotal();
        }
    }//GEN-LAST:event_jBDropActionPerformed

    private void jTFTotalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFTotalKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFTotalKeyPressed

    private void jTFTotalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFTotalKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFTotalKeyReleased

    private void jTFTotalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFTotalKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFTotalKeyTyped

    private void jBAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAddActionPerformed
        try {
            Querys q = new Querys();
            ArrayList<Object> mapeoProducto = new ArrayList<Object>();

            String cantidadSolicitada = jTFCantidad.getText();
            String idProd = jTFProducto.getText();

            String[] parts = idProd.split("\\.");
            String part1 = parts[0];
            String part2 = parts[1];

            boolean flagValorLista = false;
            int rowValor = 0;
            String nombreProduct, descProduct, precioProduct, stockProduct;

            //Busco el producto por ID en BD
            try {
                mapeoProducto = q.Seleccion(con, "Id_medicamento, Nombre_generico, Descripcion, Precio_publico, Existencia", "medicamentos",
                        "Id_medicamento = '" + part2 + "'", false);
            } catch (Exception e) {
                System.out.println("Error al obtener seleccion producto a venta..." + e);
            }
            nombreProduct = ((String) mapeoProducto.get(1)).trim();
            descProduct = ((String) mapeoProducto.get(2)).trim();
            precioProduct = ((String) mapeoProducto.get(3)).trim();
            stockProduct = ((String) mapeoProducto.get(4)).trim();

            //Verfica si el prodcuto esta en tabla
            for (int i = 0; i < jTVentas.getRowCount(); i++) {
                if (part2.equals(jTVentas.getValueAt(i, 0))) {
                    flagValorLista = true;
                    rowValor = i;
                    break;
                }
            }

            //Encontro producto en la tabla
            if (flagValorLista) {
                int cantTabla = Integer.parseInt((String) jTVentas.getValueAt(rowValor + 0, 3));
                int cantAdd = Integer.parseInt(jTFCantidad.getText());
                int newCant = cantTabla + cantAdd;
                float newPrec = (float) newCant * Float.parseFloat(precioProduct);

                if (newCant > Integer.parseInt(stockProduct)) {
                    Mensaje.error(this, "La cantidad solicitada supera la de Stock");
                    Mensaje.error(this, "Capture una cantidad menor o solicite al administrador\nrealizar pedido a proveedor");
                } else {

                    jTVentas.setValueAt(String.valueOf(newCant), rowValor, 3);
                    jTVentas.setValueAt(String.valueOf(newPrec), rowValor, 5);
                    jTFProducto.setText("");
                    jTFCantidad.setText("");
                    CtrlInterfaz.selecciona(jTFProducto);
                }
            } else {
                //No encontro producto en la tabla

                //Comparamos el stock con la cantidad solicitada
                if (Integer.parseInt(cantidadSolicitada) > Integer.parseInt(stockProduct)) {
                    //No agregar valor mayor al de stock
                    Mensaje.error(this, "La cantidad solicitada supera la de Stock");
                    Mensaje.error(this, "Capture una cantidad menor o solicite al administrador\nrealizar pedido a proveedor");
                } else {
                    //agreganos los valores en tabla
                    float precioF = Float.parseFloat(precioProduct) * Float.parseFloat(jTFCantidad.getText());

                    //todos los datos son pasados como String
                    modelo.addRow(new Object[]{
                        part2,
                        nombreProduct,
                        descProduct,
                        jTFCantidad.getText(),
                        precioProduct,
                        String.valueOf(precioF)
                    });
                    jTFProducto.setText("");
                    jTFCantidad.setText("");
                    CtrlInterfaz.selecciona(jTFProducto);
                }

            }

            updateTotal();

        } catch (Exception e) {
            System.out.println("Error al quere agregar campos vacios..." + e);
        }

    }//GEN-LAST:event_jBAddActionPerformed

    private void jBVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVentaActionPerformed
        if (Total == 0) {
            Mensaje.error(this, "No se pueden realizar ventas de $0\nAgrega productos a la venta");
        } else {
            Querys q = new Querys();
            ArrayList<Object> mapVP = new ArrayList<Object>();
            ArrayList<Object> mapVT = new ArrayList<Object>();
            ArrayList<Object> mapStock = new ArrayList<Object>();

            String values1, values2, idsVentaT = "";
            DateFormat f1 = new SimpleDateFormat("yyyy-MM-dd");
            DateFormat f2 = new SimpleDateFormat("hh:mm:ss");
            Date fechaActual = new Date();
            Date horaActual = new Date();

            if (Mensaje.pregunta(this, "¿Estas seguro de realizar la venta por $" + Total + "?") == JOptionPane.YES_OPTION) {
                for (int i = 0; i < jTVentas.getRowCount(); i++) {
                    try {
                        mapVP = q.Seleccion(con, "MAX(Id_ventaP)", "ventaproducto", "", false);
                    } catch (Exception e) {
                        System.out.println("Error al consultar ventas por producto..." + e);
                    }
                    //Inserta en el primer caso
                    if (mapVP.get(0).equals("null")) {
                        values1 = "'" + 1 + "',"
                                + "'" + (String) jTVentas.getValueAt(i, 0) + "',"
                                + "'" + Sesion.datosUsuario.get(0) + "',"
                                + "'" + (String) jTVentas.getValueAt(i, 3) + "',"
                                + "'" + (String) jTVentas.getValueAt(i, 5) + "',"
                                + "'" + f1.format(fechaActual) + "',"
                                + "'" + f2.format(horaActual) + "'";
                        idsVentaT += "1.";

                        String idProducto = ((String) jTVentas.getValueAt(i, 0)).trim();
                        try {
                            mapStock = q.Seleccion(con, "Existencia", "medicamentos",
                                    "Id_medicamento = '" + idProducto + "'", false);
                        } catch (Exception e) {
                            System.out.println("Error al consultar stock..." + e);
                        }

                        String cantidad = (String) jTVentas.getValueAt(i, 3);
                        int stock = Integer.parseInt(((String) mapStock.get(0)).trim()) - Integer.parseInt(cantidad);
                        String stockF = "'" + stock + "'";
                        try {
                            q.Modificar(con, "medicamentos", "Existencia", stockF,
                                    "Id_medicamento = " + idProducto);

                        } catch (Exception e) {
                            System.out.println("actualizacion erronea en medicamnetos..." + e);
                        }

                        try {
                            q.Insertar(con, "ventaproducto", values1);
                        } catch (Exception e) {
                            System.out.println("Error al insertar valor x producto..." + e);
                        }

                        values1 = "";

                    } else {
                        //INserta en id + 1
                        int idFinal1 = Integer.parseInt((String) mapVP.get(0)) + 1;
                        values1 = "'" + idFinal1 + "',"
                                + "'" + (String) jTVentas.getValueAt(i, 0) + "',"
                                + "'" + Sesion.datosUsuario.get(0) + "',"
                                + "'" + (String) jTVentas.getValueAt(i, 3) + "',"
                                + "'" + (String) jTVentas.getValueAt(i, 5) + "',"
                                + "'" + f1.format(fechaActual) + "',"
                                + "'" + f2.format(horaActual) + "'";
                        idsVentaT += String.valueOf(idFinal1) + ".";

                        String idProducto = ((String) jTVentas.getValueAt(i, 0)).trim();
                        try {
                            mapStock = q.Seleccion(con, "Existencia", "medicamentos",
                                    "Id_medicamento = '" + idProducto + "'", false);
                        } catch (Exception e) {
                            System.out.println("Error al consultar stock..." + e);
                        }

                        String cantidad = (String) jTVentas.getValueAt(i, 3);
                        int stock = Integer.parseInt(((String) mapStock.get(0)).trim()) - Integer.parseInt(cantidad);
                        String stockF = "'" + stock + "'";
                        try {
                            q.Modificar(con, "medicamentos", "Existencia", stockF,
                                    "Id_medicamento = " + idProducto);

                        } catch (Exception e) {
                            System.out.println("actualizacion erronea en medicamnetos..." + e);
                        }

                        try {
                            q.Insertar(con, "ventaproducto", values1);
                        } catch (Exception e) {
                            System.out.println("Error al insertar valor x producto..." + e);
                        }
                        values1 = "";
                    }
                }

                try {
                    mapVT = q.Seleccion(con, "MAX(Id_ventaT)", "ventatotal", "", false);
                } catch (Exception e) {
                    System.out.println("Error al consultar ventas totales..." + e);
                }

                if (mapVT.get(0).equals("null")) {
                    values2 = "'" + 1 + "',"
                            + "'" + Sesion.datosUsuario.get(0) + "',"
                            + "'" + idsVentaT + "',"
                            + "'" + Total + "'";
                    try {
                        q.Insertar(con, "ventatotal", values2);
                    } catch (Exception e) {
                        System.out.println("Error al insertar valor total..." + e);
                    }
                    values2 = "";
                } else {
                    int idFinal2 = Integer.parseInt((String) mapVT.get(0)) + 1;
                    values2 = "'" + idFinal2 + "',"
                            + "'" + Sesion.datosUsuario.get(0) + "',"
                            + "'" + idsVentaT + "',"
                            + "'" + Total + "'";

                    try {
                        q.Insertar(con, "ventatotal", values2);
                    } catch (Exception e) {
                        System.out.println("Error al insertar valor total..." + e);
                    }
                    values2 = "";
                }

                Mensaje.exito(this, "Se realizo la venta con exito");
                Total = 0;
                jTFProducto.setText("");
                jTFCantidad.setText("");
                jTFTotal.setText("0.0");;
                for (int i = jTVentas.getRowCount() - 1; i >= 0; i--) {
                    modelo.removeRow(i);
                }
                CtrlInterfaz.selecciona(jTFProducto);

            } else {
                Mensaje.error(this, "No se realizo venta");
            }
        }

    }//GEN-LAST:event_jBVentaActionPerformed

    private void jBLimpiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiaActionPerformed
        if (Mensaje.pregunta(this, "¿Estas seguro de realizar la venta?") == JOptionPane.YES_OPTION) {
            jTFProducto.setText("");
            jTFCantidad.setText("");
            jTFTotal.setText("0.0");
            Total = 0;
            for (int i = jTVentas.getRowCount() - 1; i >= 0; i--) {
                modelo.removeRow(i);
            }
            CtrlInterfaz.selecciona(jTFProducto);
            Mensaje.exito(this, "Se cancelo la venta");
        } else {
            Mensaje.error(this, "No se cancelo venta");
        }

    }//GEN-LAST:event_jBLimpiaActionPerformed

    private void updateTotal() {
        Total = 0;
        for (int i = 0; i < jTVentas.getRowCount(); i++) {
            Total += Float.parseFloat((String) jTVentas.getValueAt(i, 5));
        }
        jTFTotal.setText(String.valueOf(Total));
    }

    private void CrearModelo() {
        try {
            modelo = (new DefaultTableModel(
                    null, new String[]{
                        "ID Producto", "Nombre", "Descripción", "Cantidad", "Precio_publico", "Subtotal"
                    }) {
                Class[] types = new Class[]{
                    java.lang.Object.class,
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
            jTVentas.setModel(modelo);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString() + "error en la creacion del modelo");
        }
    }

    public void llenaTabla() {
        ArrayList<Object> mapeoUsers = new ArrayList<Object>();
        Querys q = new Querys();
        modelo.setRowCount(0);
        try {
            mapeoUsers = q.Seleccion(con, "*", "usuarios", "Email!='" + Sesion.datosUsuario.get(5) + "' AND Id_empleado!=1", true);

            Object[] filas = new Object[5];

            while (!mapeoUsers.isEmpty()) {

                filas[0] = mapeoUsers.get(0);
                filas[1] = mapeoUsers.get(1);
                filas[2] = mapeoUsers.get(2);
                filas[3] = mapeoUsers.get(3);
                filas[4] = mapeoUsers.get(5);

                if (mapeoUsers.get(11).equals("1")) {
                    filas[5] = "Administrador";
                } else if (mapeoUsers.get(11).equals("2")) {
                    filas[5] = "Médico";
                } else if (mapeoUsers.get(11).equals("3")) {
                    filas[5] = "Auxiliar";
                }

                for (int i = 0; i < 12; i++) {
                    mapeoUsers.remove(0);
                }
                modelo.addRow(filas);
            }

        } catch (Exception e) {
            System.out.println("Error en el llenado de la tabla: " + e.toString());
        }
    }

    public int buscaProductoTabla() {
        String producto = jTFProducto.getText();
        String[] parts = producto.split("\\.");
        String part1 = parts[0];
        String part2 = parts[1];

        for (int i = 0; i < jTVentas.getRowCount(); i++) {
            if (part1.equals(jTVentas.getValueAt(i, 0))) {
                return i;
            }
        }
        return -1;
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
            java.util.logging.Logger.getLogger(vtnAdminMenuVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vtnAdminMenuVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vtnAdminMenuVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vtnAdminMenuVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new vtnAdminMenuVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAdd;
    private javax.swing.JButton jBDrop;
    private javax.swing.JButton jBLimpia;
    private javax.swing.JButton jBSearch;
    private javax.swing.JButton jBVenta;
    private javax.swing.JLabel jLCantidad;
    private javax.swing.JLabel jLCantidad1;
    private javax.swing.JLabel jLCerrar;
    private javax.swing.JLabel jLIDProducto;
    private javax.swing.JLabel jLMinimizar;
    private javax.swing.JLabel jLTitulo1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFCantidad;
    private javax.swing.JTextField jTFProducto;
    private javax.swing.JTextField jTFTotal;
    private javax.swing.JTable jTVentas;
    // End of variables declaration//GEN-END:variables
}
