package formularios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class frm_mainusuario extends javax.swing.JFrame implements Runnable {

    String hora, minutos, segundos;
    Thread hilo;
   
    int ultimoid;
    Statement st;
    ResultSet rs;
    

    DefaultTableModel dtm;
    Object[] objeto = new Object[6];  
    
    public frm_mainusuario() throws SQLException {
       initComponents(); 
       txt_fecha.setText(fecha()); //Fecha
       ObtenerUltimoId();
 

      
       //Hora
       hilo = new Thread(this);
       hilo.start();
       setVisible(true);
       
        dtm = (DefaultTableModel) tabla_factura.getModel();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelblanco = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lbl_logo = new javax.swing.JLabel();
        btn_clientes = new javax.swing.JButton();
        btn_cerrarsesion = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lbl_ventas = new javax.swing.JLabel();
        tab_productos = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_factura = new javax.swing.JTable();
        btn_añadircliente = new javax.swing.JButton();
        lbl_cedcli = new javax.swing.JLabel();
        txt_cedcli = new javax.swing.JTextField();
        lbl_nomcli = new javax.swing.JLabel();
        txt_nomcli = new javax.swing.JTextField();
        lbl_codprod = new javax.swing.JLabel();
        txt_codprod = new javax.swing.JTextField();
        btn_añadirprod = new javax.swing.JButton();
        lbl_nombreprod = new javax.swing.JLabel();
        txt_nombreprod = new javax.swing.JTextField();
        lbl_precioprod = new javax.swing.JLabel();
        txt_precioprod = new javax.swing.JTextField();
        lbl_cantprod = new javax.swing.JLabel();
        txt_cantprod = new javax.swing.JTextField();
        btn_agregar = new javax.swing.JButton();
        btn_guardarfactura = new javax.swing.JButton();
        lbl_apellido = new javax.swing.JLabel();
        txt_apellido = new javax.swing.JTextField();
        btn_borrar = new javax.swing.JButton();
        lbl_subtotal = new javax.swing.JLabel();
        txt_subtotal = new javax.swing.JTextField();
        lbl_fecha = new javax.swing.JLabel();
        lbl_hora = new javax.swing.JLabel();
        lbl_rnc = new javax.swing.JLabel();
        txt_rnc = new javax.swing.JTextField();
        lbl_nrofac = new javax.swing.JLabel();
        txt_nrofact = new javax.swing.JTextField();
        txt_fecha = new javax.swing.JTextField();
        txt_hora = new javax.swing.JTextField();
        lbl_codcli = new javax.swing.JLabel();
        txt_codcli = new javax.swing.JTextField();
        lbl_facturadopor = new javax.swing.JLabel();
        txt_facturadopor = new javax.swing.JTextField();
        lbl_total = new javax.swing.JLabel();
        txt_total = new javax.swing.JTextField();
        lbl_itbis = new javax.swing.JLabel();
        txt_itbis = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panelblanco.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(10, 73, 123));

        lbl_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo nicadom.png"))); // NOI18N

        btn_clientes.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        btn_clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/clientes.png"))); // NOI18N
        btn_clientes.setText("CLIENTES");
        btn_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clientesActionPerformed(evt);
            }
        });

        btn_cerrarsesion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_cerrarsesion.setText("CERRAR SESIÓN");
        btn_cerrarsesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarsesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(btn_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(lbl_logo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(btn_cerrarsesion)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(lbl_logo)
                .addGap(135, 135, 135)
                .addComponent(btn_clientes)
                .addGap(38, 38, 38)
                .addComponent(btn_cerrarsesion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(205, 205, 205));

        lbl_ventas.setFont(new java.awt.Font("Corbel", 0, 48)); // NOI18N
        lbl_ventas.setForeground(new java.awt.Color(10, 73, 123));
        lbl_ventas.setText("VENTAS");

        tabla_factura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "COD", "NOMBRE", "PRECIO", "CANT", "TOTAL"
            }
        ));
        jScrollPane2.setViewportView(tabla_factura);

        btn_añadircliente.setFont(new java.awt.Font("Corbel", 0, 16)); // NOI18N
        btn_añadircliente.setText("Añadir cliente");
        btn_añadircliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_añadirclienteActionPerformed(evt);
            }
        });

        lbl_cedcli.setFont(new java.awt.Font("Corbel", 0, 16)); // NOI18N
        lbl_cedcli.setText("Cédula cliente");

        txt_cedcli.setFont(new java.awt.Font("Corbel", 0, 16)); // NOI18N
        txt_cedcli.setEnabled(false);

        lbl_nomcli.setFont(new java.awt.Font("Corbel", 0, 16)); // NOI18N
        lbl_nomcli.setText("Nombre");

        txt_nomcli.setFont(new java.awt.Font("Corbel", 0, 16)); // NOI18N
        txt_nomcli.setEnabled(false);

        lbl_codprod.setFont(new java.awt.Font("Corbel", 0, 16)); // NOI18N
        lbl_codprod.setText("Código del producto");

        txt_codprod.setFont(new java.awt.Font("Corbel", 0, 16)); // NOI18N
        txt_codprod.setEnabled(false);

        btn_añadirprod.setFont(new java.awt.Font("Corbel", 0, 16)); // NOI18N
        btn_añadirprod.setText("Añadir producto");
        btn_añadirprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_añadirprodActionPerformed(evt);
            }
        });

        lbl_nombreprod.setFont(new java.awt.Font("Corbel", 0, 16)); // NOI18N
        lbl_nombreprod.setText("Nombre del producto");

        txt_nombreprod.setFont(new java.awt.Font("Corbel", 0, 16)); // NOI18N
        txt_nombreprod.setEnabled(false);

        lbl_precioprod.setFont(new java.awt.Font("Corbel", 0, 16)); // NOI18N
        lbl_precioprod.setText("Precio");

        txt_precioprod.setFont(new java.awt.Font("Corbel", 0, 16)); // NOI18N
        txt_precioprod.setEnabled(false);

        lbl_cantprod.setFont(new java.awt.Font("Corbel", 0, 16)); // NOI18N
        lbl_cantprod.setText("Cantidad producto");

        txt_cantprod.setFont(new java.awt.Font("Corbel", 0, 16)); // NOI18N

        btn_agregar.setFont(new java.awt.Font("Corbel", 0, 16)); // NOI18N
        btn_agregar.setText("Agregar producto");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        btn_guardarfactura.setFont(new java.awt.Font("Corbel", 0, 16)); // NOI18N
        btn_guardarfactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btn_guardarfactura.setText("Generar factura");
        btn_guardarfactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarfacturaActionPerformed(evt);
            }
        });

        lbl_apellido.setFont(new java.awt.Font("Corbel", 0, 16)); // NOI18N
        lbl_apellido.setText("Apellido");

        txt_apellido.setFont(new java.awt.Font("Corbel", 0, 16)); // NOI18N
        txt_apellido.setEnabled(false);

        btn_borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrar.png"))); // NOI18N
        btn_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarActionPerformed(evt);
            }
        });

        lbl_subtotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_subtotal.setText("Subtotal");

        txt_subtotal.setEnabled(false);

        lbl_fecha.setFont(new java.awt.Font("Corbel", 1, 16)); // NOI18N
        lbl_fecha.setText("FECHA");

        lbl_hora.setFont(new java.awt.Font("Corbel", 1, 16)); // NOI18N
        lbl_hora.setText("HORA");

        lbl_rnc.setFont(new java.awt.Font("Corbel", 0, 16)); // NOI18N
        lbl_rnc.setText("RNC");

        txt_rnc.setEnabled(false);

        lbl_nrofac.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        lbl_nrofac.setText("NRO. FACTURA");

        txt_nrofact.setEnabled(false);

        txt_fecha.setEnabled(false);

        txt_hora.setEnabled(false);

        lbl_codcli.setFont(new java.awt.Font("Corbel", 0, 16)); // NOI18N
        lbl_codcli.setText("Código del cliente");

        txt_codcli.setEnabled(false);

        lbl_facturadopor.setFont(new java.awt.Font("Corbel", 0, 16)); // NOI18N
        lbl_facturadopor.setText("Facturado por");

        txt_facturadopor.setEnabled(false);

        lbl_total.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_total.setText("TOTAL");

        txt_total.setEnabled(false);

        lbl_itbis.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_itbis.setText("ITBIS");

        txt_itbis.setEnabled(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_nrofac)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_nrofact)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_fecha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_hora)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_hora, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                            .addComponent(lbl_cedcli)
                                            .addGap(18, 18, 18)
                                            .addComponent(txt_cedcli, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                            .addComponent(lbl_codcli)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txt_codcli, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btn_añadircliente))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lbl_apellido)
                                            .addComponent(lbl_nomcli))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_nomcli, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_apellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(btn_añadirprod))
                                .addGap(39, 39, 39)
                                .addComponent(lbl_rnc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_rnc, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                            .addGap(8, 8, 8)
                                            .addComponent(lbl_codprod)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txt_codprod, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                            .addComponent(lbl_nombreprod)
                                            .addGap(18, 18, 18)
                                            .addComponent(txt_nombreprod, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(lbl_precioprod)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_precioprod, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(42, 42, 42)
                                        .addComponent(lbl_cantprod)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_cantprod, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_borrar)
                .addGap(68, 68, 68))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(btn_agregar)
                        .addGap(171, 171, 171)
                        .addComponent(btn_guardarfactura)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_subtotal, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_total, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_itbis, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_facturadopor)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_facturadopor, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_itbis, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(142, 142, 142))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_fecha)
                            .addComponent(lbl_hora)
                            .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_nrofac)
                            .addComponent(txt_nrofact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btn_añadircliente)
                        .addGap(10, 10, 10)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbl_rnc)
                                .addComponent(txt_rnc, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_codcli)
                                    .addComponent(txt_codcli, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_cedcli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_cedcli))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(lbl_nomcli)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_apellido))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txt_nomcli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37)
                        .addComponent(btn_añadirprod)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_codprod)
                            .addComponent(txt_codprod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_nombreprod)
                            .addComponent(txt_nombreprod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_precioprod)
                            .addComponent(txt_precioprod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_cantprod)
                            .addComponent(txt_cantprod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_agregar)
                            .addComponent(btn_guardarfactura))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_borrar))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_subtotal)
                            .addComponent(txt_subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_itbis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_itbis))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_total, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_total, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_facturadopor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_facturadopor))
                        .addGap(41, 41, 41))))
        );

        tab_productos.addTab("Venta", jPanel5);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(447, 447, 447)
                .addComponent(lbl_ventas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tab_productos, javax.swing.GroupLayout.PREFERRED_SIZE, 1152, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(lbl_ventas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tab_productos, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tab_productos.getAccessibleContext().setAccessibleName("Clientes");

        javax.swing.GroupLayout panelblancoLayout = new javax.swing.GroupLayout(panelblanco);
        panelblanco.setLayout(panelblancoLayout);
        panelblancoLayout.setHorizontalGroup(
            panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelblancoLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1115, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelblancoLayout.setVerticalGroup(
            panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelblanco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelblanco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
          public void Limpiar() {
      
       try {
           txt_codcli.setText(" ");
           txt_cedcli.setText(" ");
           txt_nomcli.setText(" ");
           txt_apellido.setText(" ");
           txt_rnc.setText(" ");
           txt_codprod.setText(" ");
           txt_nombreprod.setText(" ");
           txt_precioprod.setText(" ");
           txt_cantprod.setText(" ");
           txt_subtotal.setText(" ");
       }
       catch (Exception ex) {
             JOptionPane.showMessageDialog(null, "error "+ex);
       }   
   }
      
         public void RefrescarTabla(){
        //Funcion encargada de Refrescar la tabla utilizando Revalidate
        try {
        dtm.setColumnCount(0);
        dtm.setRowCount(0);
        tabla_factura.revalidate();
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "error "+ex);
        }
         }
    
    
        // Función que pone la fecha automática
        public static String fecha() {
            Date fecha = new Date();
            SimpleDateFormat formatofecha = new SimpleDateFormat("dd/MM/YYYY");
            return formatofecha.format(fecha);
        }
        
        //Función para poner la hora
        public void hora() {
            Calendar calendario = new GregorianCalendar();
            Date horaactual = new Date();
            calendario.setTime(horaactual);
            hora= calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);
            minutos= calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
            segundos= calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND);
        }
        
        public void run() {
            Thread current= Thread.currentThread();
            while(current==hilo) {
                hora();
                txt_hora.setText(hora+":"+minutos+":"+segundos);
            }
        } 
        
        
        // Función para sumar todos los totales
        public void SumarTotales() {
        
        float subtotal = 0;
        float fila = 0;
        float resultado = 0;
        float total = 0;
        
        try {
            for (int i = 0; i < tabla_factura.getRowCount(); i++) {
                fila =+ Float.parseFloat(dtm.getValueAt(i,4).toString());
                subtotal += fila;
                resultado = (float) (subtotal * 0.18);
                total = resultado + subtotal;
                
                
            } txt_subtotal.setText(Float.toString(subtotal));
              txt_itbis.setText(Float.toString(resultado));
              txt_total.setText(Float.toString(total));
                
        } catch (NumberFormatException e) {

        }
    }
        
        // Función para restar un total eliminado
      public void RestarTotales() {
          
        float total = 0;
        float fila = 0;
        
        try {
            for (int i = 0; i < tabla_factura.getRowCount(); i++) {
                fila =- Float.parseFloat(dtm.getValueAt(i,4).toString());
                total -= fila;
                
            } txt_subtotal.setText(Float.toString(total));
        } catch (NumberFormatException e) {
        }
      }
      
      //Función para calcular el itbis
      
//      public float CalcularITBIS() {
//      
//          String subtotal = txt_subtotal.getText();
//          float sub = Integer.parseInt(subtotal);
//          float resultado = 0;
//          resultado = (float) (sub * 0.18);
//          
//          txt_itbis.setText(Float.toString(resultado));
//          
//          return resultado;
//  
//      }
    
    
    // Botón que lleva a la tabla para seleccionar a los clientes
    private void btn_añadirclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_añadirclienteActionPerformed
      
        frm_clienteusu mf = new frm_clienteusu();
        mf.setVisible(true);
        mf.pack();
        mf.setLocationRelativeTo(null);

    }//GEN-LAST:event_btn_añadirclienteActionPerformed

    //Botón que lleva a la tabla para seleccionar los productos
    private void btn_añadirprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_añadirprodActionPerformed
        
        frm_productousu mf = new frm_productousu();
        mf.setVisible(true);
        mf.pack();
        mf.setLocationRelativeTo(null);
    }//GEN-LAST:event_btn_añadirprodActionPerformed

    //Botón para borrar un registro de la tabla local
    private void btn_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarActionPerformed

        if(tabla_factura.getSelectedRow() != -1) {
            dtm.removeRow(tabla_factura.getSelectedRow());
            
        } else {
            JOptionPane.showMessageDialog(null,"No has seleccionado una fila");
        }
        
        RestarTotales();
    }//GEN-LAST:event_btn_borrarActionPerformed

    //Botón para agregar un registro a la tabla local
    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
       
        PreparedStatement ps;
        ResultSet rs;
        
        String cant = txt_cantprod.getText();
        String codprod = txt_codprod.getText();
 
        String query = "SELECT * FROM `producto` WHERE `cod_producto` = ? ";
        
         try {
            ps = MyConnection.getConnection().prepareStatement(query);
            ps.setString(1, codprod);
            
            rs = ps.executeQuery();
            
            if(rs.next())
            {
                 Integer cantidad = rs.getInt("cant");
                 int canti = Integer.parseInt(cant);
                 
                 if(canti>cantidad) {
                      JOptionPane.showMessageDialog(null, "No hay suficiente productos");
                      
                 } else {
                     
                    objeto[0] = txt_codprod.getText();
                    objeto[1] = txt_nombreprod.getText();
                    objeto[2] = txt_precioprod.getText();
                    objeto[3] = txt_cantprod.getText();

                    objeto[4] = Float.parseFloat(txt_precioprod.getText()) * Float.parseFloat(txt_cantprod.getText());
                    
                    dtm.addRow(objeto);
                    SumarTotales();
               
                }
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(frm_mainusuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }//GEN-LAST:event_btn_agregarActionPerformed

    // Botón para guardar en tabla principal de factura
    private void btn_guardarfacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarfacturaActionPerformed

       String nro_factura = txt_nrofact.getText();
       String cod_cliente = txt_codcli.getText();
       String cedcli = txt_cedcli.getText();
       String nomcli = txt_nomcli.getText();
       String apcli = txt_apellido.getText();
       String rnc = txt_rnc.getText();
       String fecha = txt_fecha.getText();
       String hora = txt_hora.getText();
       String montotal = txt_subtotal.getText();
       String facturadopor = txt_facturadopor.getText();
        
        PreparedStatement ps;
        String query = "INSERT INTO `facturacion`(`cod_facturacion`,`cod_cliente`,`cedcli`,`rnc`,`nomcli`,`apcli`,`fecha`,`hora`,`montotal`,`facturadopor`) VALUES (?,?,?,?,?,?,?,?,?,?)";
        
        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            
            ps.setString(1, nro_factura);
            ps.setString(2, cod_cliente);
            ps.setString(3, cedcli);
            ps.setString(4, rnc);
            ps.setString(5, nomcli);
            ps.setString(6, apcli);
            ps.setString(7, fecha);
            ps.setString(8, hora);
            ps.setString(9, montotal);
            ps.setString(10, facturadopor);

     
            if(ps.executeUpdate() > 0)
            {
                JOptionPane.showMessageDialog(null, "Factura agregada");
                GuardarDetalleFactura();
                ImprimirFactura();
                Reiniciar();
                
          }
        } catch (SQLException ex) {
            Logger.getLogger(frm_mensaje.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error "+ex);
            
    }
          
        Limpiar();
        RefrescarTabla();
        
        try {
            ObtenerUltimoId();
        } catch (SQLException ex) {
            Logger.getLogger(frm_mainusuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_guardarfacturaActionPerformed

    private void btn_cerrarsesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarsesionActionPerformed
        
        frm_login mf = new frm_login();
        mf.setVisible(true);
        mf.pack();
        mf.setLocationRelativeTo(null);
        this.dispose();
        
    }//GEN-LAST:event_btn_cerrarsesionActionPerformed

    private void btn_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clientesActionPerformed
      
        frm_registrarcliente mf = new frm_registrarcliente();
        mf.setVisible(true);
        mf.pack();
        mf.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_btn_clientesActionPerformed

        // Función que genera el id de la factura automático
       private void ObtenerUltimoId() throws SQLException {
        try {
            Connection con = MyConnection.getConnection();
            String sql = "select max(cod_facturacion) from facturacion";
            st = con.createStatement();
            
            rs = st.executeQuery(sql);
            if (rs.next()) {
                ultimoid = rs.getInt(1);
                ultimoid++;
                frm_mainusuario.txt_nrofact.setText(Integer.toString(ultimoid));
            } else { 
            }  
           
             } catch (SQLException ex) { 
        }
    }
    
       // Función para guardar el detalle de factura
       public void GuardarDetalleFactura() {
       
       String nro_factura = txt_nrofact.getText();
       int credito = 0;
      
        for (int i = 0; i < tabla_factura.getRowCount(); i++) {
             
        PreparedStatement ps;
        String query = "INSERT INTO `detalle_facturacion`(`id_detalle`,`cod_credito`,`cod_producto`,`nombreprod`,`total_producto`,`precio`) VALUES (?,?,?,?,?,?)";
        
        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            
            ps.setString(1, nro_factura);
            ps.setInt(2, credito);
            ps.setString(3, tabla_factura.getValueAt(i,0).toString());
            ps.setString(4, tabla_factura.getValueAt(i,1).toString());
            ps.setString(5, tabla_factura.getValueAt(i,3).toString());
            ps.setString(6, tabla_factura.getValueAt(i,2).toString());
        
            
            if("".equals(tabla_factura.getValueAt(i,3))) {
                JOptionPane.showMessageDialog(null, "El campo vacío es requerido");
            } else {
                
            
            if(ps.executeUpdate() > 0)
            {
       
            }
          }
            
        } catch (SQLException ex) {
            Logger.getLogger(frm_mensaje.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error "+ex);
            
             }
         }
     }

       // Función para imprimir la factura
       public void ImprimirFactura() {
           
           Connection cn=MyConnection.getConnection();
           
        try{
            int txtFac;
          JasperReport jr = (JasperReport) JRLoader.loadObject(frm_mainusuario.class.getResource("/Reporte/Facturacion.jasper"));
          Map parametros = new HashMap<>();
          parametros.put("ID",txtFac = Integer.parseInt(txt_nrofact.getText()));
          JasperPrint jp = JasperFillManager.fillReport(jr, parametros, cn);
          JasperViewer jv = new JasperViewer(jp, false);
          jv.setVisible(true); 
        }
        catch (JRException ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
        }  
       }
       
       //Método que reinicia la pantalla de factura cada vez que se genera una factura
       public void Reiniciar() throws SQLException, SQLException {
        frm_mainusuario mf = new frm_mainusuario();
        mf.setVisible(true);
        mf.pack();
        mf.setLocationRelativeTo(null);
        String info = frm_login.txt_usuario.getText();
        frm_mainusuario.txt_facturadopor.setText(info);
        this.dispose();
       }
       
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new frm_mainusuario().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(frm_mainusuario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_añadircliente;
    private javax.swing.JButton btn_añadirprod;
    private javax.swing.JButton btn_borrar;
    private javax.swing.JButton btn_cerrarsesion;
    private javax.swing.JButton btn_clientes;
    private javax.swing.JButton btn_guardarfactura;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_apellido;
    private javax.swing.JLabel lbl_cantprod;
    private javax.swing.JLabel lbl_cedcli;
    private javax.swing.JLabel lbl_codcli;
    private javax.swing.JLabel lbl_codprod;
    private javax.swing.JLabel lbl_facturadopor;
    private javax.swing.JLabel lbl_fecha;
    private javax.swing.JLabel lbl_hora;
    private javax.swing.JLabel lbl_itbis;
    private javax.swing.JLabel lbl_logo;
    private javax.swing.JLabel lbl_nombreprod;
    private javax.swing.JLabel lbl_nomcli;
    private javax.swing.JLabel lbl_nrofac;
    private javax.swing.JLabel lbl_precioprod;
    private javax.swing.JLabel lbl_rnc;
    private javax.swing.JLabel lbl_subtotal;
    private javax.swing.JLabel lbl_total;
    private javax.swing.JLabel lbl_ventas;
    private javax.swing.JPanel panelblanco;
    private javax.swing.JTabbedPane tab_productos;
    private javax.swing.JTable tabla_factura;
    public static javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_cantprod;
    public static javax.swing.JTextField txt_cedcli;
    public static javax.swing.JTextField txt_codcli;
    public static javax.swing.JTextField txt_codprod;
    public static javax.swing.JTextField txt_facturadopor;
    private javax.swing.JTextField txt_fecha;
    private javax.swing.JTextField txt_hora;
    private javax.swing.JTextField txt_itbis;
    public static javax.swing.JTextField txt_nombreprod;
    public static javax.swing.JTextField txt_nomcli;
    public static javax.swing.JTextField txt_nrofact;
    public static javax.swing.JTextField txt_precioprod;
    public static javax.swing.JTextField txt_rnc;
    private javax.swing.JTextField txt_subtotal;
    private javax.swing.JTextField txt_total;
    // End of variables declaration//GEN-END:variables



}
