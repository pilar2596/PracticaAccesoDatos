
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pilar
 */
public class Form extends javax.swing.JFrame {

    DefaultTableModel tablaModel;
    String cadenaResult = "";
    GestorConexion gc = new GestorConexion();

    public Form() {
        initComponents();
        
//        jTable1.addMouseListener(new MouseAdapter() 
//       {
//          public void mouseClicked(MouseEvent Mouse_evt)
//            {
//             
//             if(Mouse_evt.getClickCount() == 1)
//             {
//
//                //para que me ponga los datos en los jtextField
//                    dniCl.setText(jTable1.getValueAt(jTable1.getSelectedRow(),0).toString());
//                    nombre.setText(jTable1.getValueAt(jTable1.getSelectedRow(),1).toString());
//                    Apellido.setText(jTable1.getValueAt(jTable1.getSelectedRow(),2).toString());
//                    Direccion.setText(jTable1.getValueAt(jTable1.getSelectedRow(),3).toString());
//                    Correo.setText(jTable1.getValueAt(jTable1.getSelectedRow(),4).toString());
//                     Telefono.setText(jTable1.getValueAt(jTable1.getSelectedRow(),5).toString());
//         
//                
//             }
//            }
//       } );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BajaProducto = new javax.swing.JButton();
        NProducto = new javax.swing.JButton();
        codigo = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        precio = new javax.swing.JTextField();
        descripcion = new javax.swing.JTextField();
        stock = new javax.swing.JTextField();
        Modificar = new javax.swing.JButton();
        ConsultarProducto = new javax.swing.JButton();
        Error1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        codigoBa = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        BuscarPR = new javax.swing.JButton();
        codigoIn = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        NCliente = new javax.swing.JButton();
        dni = new javax.swing.JTextField();
        Nombre = new javax.swing.JTextField();
        Apellido = new javax.swing.JTextField();
        Telefono = new javax.swing.JTextField();
        Direccion = new javax.swing.JTextField();
        Correo = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        BajaCliente = new javax.swing.JButton();
        ConsultaCliente = new javax.swing.JButton();
        Error = new javax.swing.JLabel();
        ModificarCliente = new javax.swing.JButton();
        Buscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        dniCl = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        dniBa = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        Precio = new javax.swing.JTextField();
        cantidad = new javax.swing.JTextField();
        nTicket = new javax.swing.JTextField();
        dni_Cliente = new javax.swing.JTextField();
        codigo_producto = new javax.swing.JTextField();
        NuevaCompra = new javax.swing.JButton();
        fecha = new javax.swing.JTextField();
        ConsultaCompra = new javax.swing.JButton();
        ModificarCompra = new javax.swing.JButton();
        Error2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        TicketCom = new javax.swing.JTextField();
        BuscarCom = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1155, 121));

        BajaProducto.setText("Baja Producto");
        BajaProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BajaProductoMouseClicked(evt);
            }
        });
        jPanel1.add(BajaProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 308, 120, 40));

        NProducto.setText("Nuevo Producto");
        NProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NProductoMouseClicked(evt);
            }
        });
        jPanel1.add(NProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 419, -1, 45));
        jPanel1.add(codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 240, 130, 20));

        nombre.setText("Nombre");
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 193, 105, -1));

        precio.setText("Precio");
        jPanel1.add(precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 291, 87, -1));
        jPanel1.add(descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 193, 321, -1));

        stock.setText("Stock");
        jPanel1.add(stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 291, 87, -1));

        Modificar.setText("Modificar");
        Modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ModificarMouseClicked(evt);
            }
        });
        jPanel1.add(Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 419, 154, 45));

        ConsultarProducto.setText("Ver Productos");
        ConsultarProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConsultarProductoMouseClicked(evt);
            }
        });
        jPanel1.add(ConsultarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 419, 153, 45));
        jPanel1.add(Error1, new org.netbeans.lib.awtextra.AbsoluteConstraints(867, 444, 170, 19));

        jLabel17.setText("Codigo");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 155, -1, -1));

        jLabel18.setText("Nombre");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 155, -1, -1));

        jLabel19.setText("Descripcion");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 155, -1, -1));

        jLabel20.setText("Precio");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 257, -1, -1));

        jLabel21.setText("Stock");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 257, -1, -1));

        jLabel22.setText("Codigo");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 247, -1, -1));

        jLabel23.setText("Codigo");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 309, -1, 28));
        jPanel1.add(codigoBa, new org.netbeans.lib.awtextra.AbsoluteConstraints(863, 310, 132, -1));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 210, 360, 10));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 362, 360, 10));

        BuscarPR.setText("Buscar");
        BuscarPR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuscarPRMouseClicked(evt);
            }
        });
        jPanel1.add(BuscarPR, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 230, 90, 40));
        jPanel1.add(codigoIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 100, 20));

        jTabbedPane1.addTab("Producto", jPanel1);

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NCliente.setBackground(new java.awt.Color(255, 255, 255));
        NCliente.setText("Nuevo Cliente");
        NCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NClienteMousePressed(evt);
            }
        });
        jPanel2.add(NCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 118, 43));
        jPanel2.add(dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(892, 210, 120, -1));
        jPanel2.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 173, 172, -1));
        jPanel2.add(Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 173, 177, -1));

        Telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelefonoActionPerformed(evt);
            }
        });
        jPanel2.add(Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 283, 129, -1));
        jPanel2.add(Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 283, 177, -1));
        jPanel2.add(Correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 283, 172, -1));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable3);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1288, 125));

        BajaCliente.setBackground(new java.awt.Color(255, 255, 255));
        BajaCliente.setText("Baja Cliente");
        BajaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BajaClienteMouseClicked(evt);
            }
        });
        jPanel2.add(BajaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(1029, 280, -1, 39));

        ConsultaCliente.setBackground(new java.awt.Color(255, 255, 255));
        ConsultaCliente.setText("Ver Clientes");
        ConsultaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConsultaClienteMouseClicked(evt);
            }
        });
        jPanel2.add(ConsultaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 382, -1, 43));
        jPanel2.add(Error, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 470, 103, 27));

        ModificarCliente.setBackground(new java.awt.Color(255, 255, 255));
        ModificarCliente.setText("Modificar");
        ModificarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ModificarClienteMouseClicked(evt);
            }
        });
        jPanel2.add(ModificarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, -1, 43));

        Buscar.setBackground(new java.awt.Color(255, 255, 255));
        Buscar.setText("Buscar");
        Buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuscarMouseClicked(evt);
            }
        });
        jPanel2.add(Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1058, 205, -1, 39));

        jLabel1.setText("DNI");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 145, 66, 22));

        jLabel2.setText("NOMBRE");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 148, -1, -1));

        jLabel3.setText("APELLIDOS");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 148, 88, -1));

        jLabel4.setText("TELEFONO");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 261, -1, -1));

        jLabel5.setText("CORREO");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 267, -1, -1));

        jLabel6.setText("DIRECCION");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 267, -1, -1));
        jPanel2.add(dniCl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 173, 132, -1));

        jLabel7.setText("DNI");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(834, 215, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(834, 173, 321, 25));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(834, 252, 321, 25));

        jLabel9.setText("DNI");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(834, 293, -1, -1));
        jPanel2.add(dniBa, new org.netbeans.lib.awtextra.AbsoluteConstraints(892, 288, 120, -1));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 340, 330, 10));

        jTabbedPane1.addTab("Cliente", jPanel2);

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(jTable4);

        jPanel4.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 1149, 104));
        jPanel4.add(Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 130, 30));

        cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadActionPerformed(evt);
            }
        });
        jPanel4.add(cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 120, 30));
        jPanel4.add(nTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 250, 120, 30));
        jPanel4.add(dni_Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 120, 30));

        codigo_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigo_productoActionPerformed(evt);
            }
        });
        jPanel4.add(codigo_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 130, 30));

        NuevaCompra.setText("Nueva Compra");
        NuevaCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NuevaCompraMouseClicked(evt);
            }
        });
        jPanel4.add(NuevaCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 140, 50));
        jPanel4.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 110, 30));

        ConsultaCompra.setText("Ver Compra");
        ConsultaCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConsultaCompraMouseClicked(evt);
            }
        });
        jPanel4.add(ConsultaCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 127, 50));

        ModificarCompra.setText("Modificar");
        jPanel4.add(ModificarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, 112, 50));
        jPanel4.add(Error2, new org.netbeans.lib.awtextra.AbsoluteConstraints(698, 459, 55, 28));

        jLabel8.setText("nº Ticket");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 80, 20));

        jLabel10.setText("Dni Cliente");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 90, -1));

        jLabel11.setText("Codigo");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, -1, -1));

        jLabel12.setText("Fecha");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jLabel13.setText("Precio");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, -1, -1));

        jLabel14.setText("Cantidad");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, -1, -1));

        jLabel15.setText("nº Ticket");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 260, -1, -1));
        jPanel4.add(TicketCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 110, 30));

        BuscarCom.setText("Buscar");
        BuscarCom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuscarComMouseClicked(evt);
            }
        });
        jPanel4.add(BuscarCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 240, 90, 50));

        jTabbedPane1.addTab("Compra", jPanel4);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 1176, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NClienteMousePressed
        gc.insertarCliente(dniCl.getText(), Nombre.getText(), Apellido.getText(), Telefono.getText(), Correo.getText(), Direccion.getText());
        ConsultaClienteMouseClicked(evt);
        Error.setText(gc.cadenaResult);
    }//GEN-LAST:event_NClienteMousePressed

    private void TelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelefonoActionPerformed

    private void BajaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BajaClienteMouseClicked
        gc.bajaCliente(dniBa.getText());
        ConsultaClienteMouseClicked(evt);
        Error.setText(gc.cadenaResult);
       
    }//GEN-LAST:event_BajaClienteMouseClicked

    private void ConsultaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConsultaClienteMouseClicked
        try {
            gc.conn1.setAutoCommit(false);

            String query = "SELECT * FROM cliente ";

            Statement sta = gc.conn1.createStatement();

            ResultSet rs = sta.executeQuery(query);
            ResultSetMetaData metaDatos = rs.getMetaData();

            int numColumnas = metaDatos.getColumnCount();

            tablaModel = new DefaultTableModel();

            this.jTable3.setModel(tablaModel);

            for (int i = 1; i <= numColumnas; i++) {
                tablaModel.addColumn(metaDatos.getColumnLabel(i));
            }

            while (rs.next()) {
                Object[] fila = new Object[numColumnas];

                for (int i = 0; i < numColumnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                tablaModel.addRow(fila);
            }

            rs.close();

            sta.close();

        } catch (Exception e) {
            e.printStackTrace();
            cadenaResult = e.toString();
            Error.setText(cadenaResult);
        }

    }//GEN-LAST:event_ConsultaClienteMouseClicked

    private void BajaProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BajaProductoMouseClicked
        gc.bajaProducto(codigoBa.getText());
        ConsultarProductoMouseClicked(evt);
        Error1.setText(gc.cadenaResult);
    }//GEN-LAST:event_BajaProductoMouseClicked

    private void NProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NProductoMouseClicked
        gc.insertarProducto(codigoIn.getText(), nombre.getText(), precio.getText(), descripcion.getText(), stock.getText());
        ConsultarProductoMouseClicked(evt);
        Error1.setText(gc.cadenaResult);
    }//GEN-LAST:event_NProductoMouseClicked

    private void ModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModificarMouseClicked
        gc.ActualizarProducto(codigoIn.getText(), nombre.getText(), precio.getText(), descripcion.getText(), stock.getText());
        ConsultarProductoMouseClicked(evt);

        Error1.setText(gc.cadenaResult);
    }//GEN-LAST:event_ModificarMouseClicked

    private void NuevaCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NuevaCompraMouseClicked
        gc.insertarCompra(TicketCom.getText(), dni_Cliente.getText(), codigo_producto.getText(), fecha.getText(), cantidad.getText(), Precio.getText());
        ConsultarProductoMouseClicked(evt);
        Error2.setText(gc.cadenaResult);
    }//GEN-LAST:event_NuevaCompraMouseClicked

    private void ConsultarProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConsultarProductoMouseClicked
        try {
            gc.conn1.setAutoCommit(false);

            String query = "SELECT * FROM producto ";

            Statement sta = gc.conn1.createStatement();

            ResultSet rs = sta.executeQuery(query);
            ResultSetMetaData metaDatos = rs.getMetaData();

            int numColumnas = metaDatos.getColumnCount();

            tablaModel = new DefaultTableModel();

            this.jTable1.setModel(tablaModel);

            for (int i = 1; i <= numColumnas; i++) {
                tablaModel.addColumn(metaDatos.getColumnLabel(i));
            }

            while (rs.next()) {
                Object[] fila = new Object[numColumnas];

                for (int i = 0; i < numColumnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                tablaModel.addRow(fila);
            }

            rs.close();

            sta.close();

        } catch (Exception e) {
            e.printStackTrace();
            cadenaResult = e.toString();
            Error1.setText(cadenaResult);
        }

    }//GEN-LAST:event_ConsultarProductoMouseClicked

    private void ConsultaCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConsultaCompraMouseClicked
        try {
            gc.conn1.setAutoCommit(false);

            String query = "SELECT * FROM compra ";

            Statement sta = gc.conn1.createStatement();

            ResultSet rs = sta.executeQuery(query);
            ResultSetMetaData metaDatos = rs.getMetaData();

            int numColumnas = metaDatos.getColumnCount();

            tablaModel = new DefaultTableModel();

            this.jTable4.setModel(tablaModel);

            for (int i = 1; i <= numColumnas; i++) {
                tablaModel.addColumn(metaDatos.getColumnLabel(i));
            }

            while (rs.next()) {
                Object[] fila = new Object[numColumnas];

                for (int i = 0; i < numColumnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                tablaModel.addRow(fila);
            }

            rs.close();

            sta.close();

        } catch (Exception e) {
            e.printStackTrace();
            cadenaResult = e.toString();
            Error2.setText(cadenaResult);
        }
    }//GEN-LAST:event_ConsultaCompraMouseClicked

    private void ModificarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModificarClienteMouseClicked
        gc.ActualizarCliente(dniCl.getText(), Nombre.getText(), Apellido.getText(), Telefono.getText(), Correo.getText(), Direccion.getText());
        ConsultaClienteMouseClicked(evt);

        Error.setText(gc.cadenaResult);
    }//GEN-LAST:event_ModificarClienteMouseClicked

    private void BuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarMouseClicked
        try {
            String _dni = dni.getText();
            String query ="SELECT * FROM cliente WHERE dni like ?;";
        
           
            PreparedStatement pst = gc.conn1.prepareStatement(query);
            pst.setString(1,_dni);
            
            ResultSet rs = pst.executeQuery();
           
            ResultSetMetaData metaDatos = rs.getMetaData();

            int numColumnas = metaDatos.getColumnCount();

            tablaModel = new DefaultTableModel();

            this.jTable3.setModel(tablaModel);

            for (int i = 1; i <= numColumnas; i++) {
                tablaModel.addColumn(metaDatos.getColumnLabel(i));
            }

            while (rs.next()) {
                Object[] fila = new Object[numColumnas];

                for (int i = 0; i < numColumnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                tablaModel.addRow(fila);
            }

            rs.close();

            pst.close();
            

        } catch (Exception e) {
            
             e.printStackTrace();
            cadenaResult = e.toString();
            Error2.setText(cadenaResult);
        }

           
           
        
       
    }//GEN-LAST:event_BuscarMouseClicked

    private void BuscarComMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarComMouseClicked
            try {
            String _nTicket = nTicket.getText();
            String query ="SELECT * FROM compra WHERE nTicket like ?;";
        
           
            PreparedStatement pst = gc.conn1.prepareStatement(query);
            pst.setString(1,_nTicket);
            
            ResultSet rs = pst.executeQuery();
           
            ResultSetMetaData metaDatos = rs.getMetaData();

            int numColumnas = metaDatos.getColumnCount();

            tablaModel = new DefaultTableModel();

            this.jTable4.setModel(tablaModel);

            for (int i = 1; i <= numColumnas; i++) {
                tablaModel.addColumn(metaDatos.getColumnLabel(i));
            }

            while (rs.next()) {
                Object[] fila = new Object[numColumnas];

                for (int i = 0; i < numColumnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                tablaModel.addRow(fila);
            }

            rs.close();

            pst.close();
            

        } catch (Exception e) {
            
             e.printStackTrace();
            cadenaResult = e.toString();
            Error2.setText(cadenaResult);
        }
    }//GEN-LAST:event_BuscarComMouseClicked

    private void BuscarPRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarPRMouseClicked
         try {
            String _codigo = codigo.getText();
            String query ="SELECT * FROM productoo WHERE codigo like ?;";
        
           
            PreparedStatement pst = gc.conn1.prepareStatement(query);
            pst.setString(1,_codigo);
            
            ResultSet rs = pst.executeQuery();
           
            ResultSetMetaData metaDatos = rs.getMetaData();

            int numColumnas = metaDatos.getColumnCount();

            tablaModel = new DefaultTableModel();

            this.jTable4.setModel(tablaModel);

            for (int i = 1; i <= numColumnas; i++) {
                tablaModel.addColumn(metaDatos.getColumnLabel(i));
            }

            while (rs.next()) {
                Object[] fila = new Object[numColumnas];

                for (int i = 0; i < numColumnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                tablaModel.addRow(fila);
            }

            rs.close();

            pst.close();
            

        } catch (Exception e) {
            
             e.printStackTrace();
            cadenaResult = e.toString();
            Error2.setText(cadenaResult);
        }
    }//GEN-LAST:event_BuscarPRMouseClicked

    private void codigo_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigo_productoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigo_productoActionPerformed

    private void cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadActionPerformed

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
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Apellido;
    private javax.swing.JButton BajaCliente;
    private javax.swing.JButton BajaProducto;
    private javax.swing.JButton Buscar;
    private javax.swing.JButton BuscarCom;
    private javax.swing.JButton BuscarPR;
    private javax.swing.JButton ConsultaCliente;
    private javax.swing.JButton ConsultaCompra;
    private javax.swing.JButton ConsultarProducto;
    private javax.swing.JTextField Correo;
    private javax.swing.JTextField Direccion;
    private javax.swing.JLabel Error;
    private javax.swing.JLabel Error1;
    private javax.swing.JLabel Error2;
    private javax.swing.JButton Modificar;
    private javax.swing.JButton ModificarCliente;
    private javax.swing.JButton ModificarCompra;
    private javax.swing.JButton NCliente;
    private javax.swing.JButton NProducto;
    private javax.swing.JTextField Nombre;
    private javax.swing.JButton NuevaCompra;
    private javax.swing.JTextField Precio;
    private javax.swing.JTextField Telefono;
    private javax.swing.JTextField TicketCom;
    private javax.swing.JTextField cantidad;
    private javax.swing.JTextField codigo;
    private javax.swing.JTextField codigoBa;
    private javax.swing.JTextField codigoIn;
    private javax.swing.JTextField codigo_producto;
    private javax.swing.JTextField descripcion;
    private javax.swing.JTextField dni;
    private javax.swing.JTextField dniBa;
    private javax.swing.JTextField dniCl;
    private javax.swing.JTextField dni_Cliente;
    private javax.swing.JTextField fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField nTicket;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField precio;
    private javax.swing.JTextField stock;
    // End of variables declaration//GEN-END:variables
}
