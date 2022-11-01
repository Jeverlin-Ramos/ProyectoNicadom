package formularios;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;


public class frm_factura extends javax.swing.JFrame {
    
    DefaultTableModel Factura;

  
    public frm_factura() {
        initComponents();
        
        this.Factura = (DefaultTableModel) tabla_factura.getModel();
        Mostrardatos("");
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelazul = new javax.swing.JPanel();
        panelblanco = new javax.swing.JPanel();
        lbl_logo = new javax.swing.JLabel();
        lbl_factura = new javax.swing.JLabel();
        lbl_codcli = new javax.swing.JLabel();
        txt_codcli = new javax.swing.JTextField();
        lbl_fecha = new javax.swing.JLabel();
        txt_fecha = new javax.swing.JTextField();
        lbl_hora = new javax.swing.JLabel();
        txt_hora = new javax.swing.JTextField();
        lbl_facturadopor = new javax.swing.JLabel();
        txt_facturadopor = new javax.swing.JTextField();
        lbl_montototal = new javax.swing.JLabel();
        txt_montototal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_factura = new javax.swing.JTable();
        btn_guardar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_imprimir = new javax.swing.JButton();
        lbl_cedcli = new javax.swing.JLabel();
        txt_cedcli = new javax.swing.JTextField();
        lbl_rnc = new javax.swing.JLabel();
        txt_rnc = new javax.swing.JTextField();
        lbl_nombre = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        lbl_apellido = new javax.swing.JLabel();
        txt_apellido = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FACTURA");
        setResizable(false);

        panelazul.setBackground(new java.awt.Color(4, 68, 124));

        panelblanco.setBackground(new java.awt.Color(255, 255, 255));

        lbl_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo nicadom.png"))); // NOI18N
        lbl_logo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Main(evt);
            }
        });

        lbl_factura.setFont(new java.awt.Font("Corbel", 0, 36)); // NOI18N
        lbl_factura.setForeground(new java.awt.Color(10, 73, 123));
        lbl_factura.setText("CONTROL FACTURA");

        lbl_codcli.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        lbl_codcli.setText("Código del cliente");

        txt_codcli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Busqueda(evt);
            }
        });

        lbl_fecha.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        lbl_fecha.setText("Fecha");

        lbl_hora.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        lbl_hora.setText("Hora");

        lbl_facturadopor.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        lbl_facturadopor.setText("Facturado por");

        lbl_montototal.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        lbl_montototal.setText("Monto total");

        tabla_factura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabla_factura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Rellenar(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_factura);

        btn_guardar.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        btn_guardar.setText("GUARDAR");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        btn_modificar.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        btn_modificar.setText("MODIFICAR");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });

        btn_eliminar.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        btn_eliminar.setText("ELIMINAR");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_imprimir.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        btn_imprimir.setText("IMPRIMIR");
        btn_imprimir.setToolTipText("");
        btn_imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_imprimirActionPerformed(evt);
            }
        });

        lbl_cedcli.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        lbl_cedcli.setText("Cédula cliente");

        lbl_rnc.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        lbl_rnc.setText("RNC");

        lbl_nombre.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        lbl_nombre.setText("Nombre");

        lbl_apellido.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        lbl_apellido.setText("Apellido");

        javax.swing.GroupLayout panelblancoLayout = new javax.swing.GroupLayout(panelblanco);
        panelblanco.setLayout(panelblancoLayout);
        panelblancoLayout.setHorizontalGroup(
            panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelblancoLayout.createSequentialGroup()
                .addGroup(panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelblancoLayout.createSequentialGroup()
                        .addGap(318, 318, 318)
                        .addComponent(txt_codcli, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelblancoLayout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addGroup(panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelblancoLayout.createSequentialGroup()
                                    .addComponent(btn_guardar)
                                    .addGap(118, 118, 118)
                                    .addComponent(btn_modificar))
                                .addGroup(panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panelblancoLayout.createSequentialGroup()
                                        .addGap(72, 72, 72)
                                        .addComponent(lbl_apellido)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelblancoLayout.createSequentialGroup()
                                        .addGroup(panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lbl_cedcli)
                                            .addComponent(lbl_codcli)
                                            .addGroup(panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lbl_nombre)
                                                .addComponent(lbl_rnc)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txt_cedcli)
                                            .addComponent(txt_rnc)
                                            .addComponent(txt_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelblancoLayout.createSequentialGroup()
                                .addGroup(panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_hora)
                                    .addComponent(lbl_fecha)
                                    .addComponent(lbl_montototal)
                                    .addComponent(lbl_facturadopor))
                                .addGap(10, 10, 10)
                                .addGroup(panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_montototal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_hora, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_facturadopor, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)))))
                .addGroup(panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelblancoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))
                    .addGroup(panelblancoLayout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(btn_eliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_imprimir)
                        .addGap(158, 158, 158))))
            .addGroup(panelblancoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lbl_logo)
                .addGap(269, 269, 269)
                .addComponent(lbl_factura)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelblancoLayout.setVerticalGroup(
            panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelblancoLayout.createSequentialGroup()
                .addGroup(panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelblancoLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(lbl_factura)
                        .addGap(15, 15, 15)
                        .addGroup(panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelblancoLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE))
                            .addGroup(panelblancoLayout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addGroup(panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_codcli)
                                    .addComponent(txt_codcli, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_cedcli)
                                    .addComponent(txt_cedcli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_rnc)
                                    .addComponent(txt_rnc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_nombre)
                                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_apellido)
                                    .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_montototal)
                                    .addComponent(txt_montototal, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_hora)
                                    .addComponent(txt_hora, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_fecha))
                                .addGap(18, 18, 18)
                                .addGroup(panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_facturadopor)
                                    .addComponent(txt_facturadopor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45))))
                    .addGroup(panelblancoLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lbl_logo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guardar)
                    .addComponent(btn_modificar)
                    .addComponent(btn_eliminar)
                    .addComponent(btn_imprimir))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout panelazulLayout = new javax.swing.GroupLayout(panelazul);
        panelazul.setLayout(panelazulLayout);
        panelazulLayout.setHorizontalGroup(
            panelazulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelazulLayout.createSequentialGroup()
                .addComponent(panelblanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelazulLayout.setVerticalGroup(
            panelazulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelazulLayout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(panelblanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelazul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelazul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // Función para limpiar los textfield
      public void Limpiar() {
      
       try {
           txt_codcli.setText(" ");
           txt_montototal.setText(" ");
           txt_hora.setText(" ");
           txt_fecha.setText(" ");
           txt_facturadopor.setText(" ");
       }
       catch (Exception ex) {
             JOptionPane.showMessageDialog(null, "error "+ex);
       }   
   }
      
         public void RefrescarTabla(){
        //Funcion encargada de Refrescar la tabla utilizando Revalidate
        try {
        Factura.setColumnCount(0);
        Factura.setRowCount(0);
        tabla_factura.revalidate();
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "error "+ex);
        }
         }
         
   public final void Mostrardatos(String valor){
       
        //Funcion para llenar la jtable de Usuarios desde la BD
            
            MyConnection cc=new MyConnection();
            Connection cn=MyConnection.getConnection();
            RefrescarTabla();
            Factura.addColumn("Código factura");
            Factura.addColumn("Código cliente");
            Factura.addColumn("Cédula");
            Factura.addColumn("RNC");
            Factura.addColumn("Nombre");
            Factura.addColumn("Apellido");
            Factura.addColumn("Fecha");
            Factura.addColumn("Hora");
            Factura.addColumn("Monto total");
            Factura.addColumn("Facturado por");

            this.tabla_factura.setModel(Factura);
            String sql;
            if (valor.equals(""))
            {
            sql="SELECT * FROM facturacion";
            }
            else{
            sql="SELECT * FROM facturacion WHERE cod_facturacion='"+valor+"'";
            } 

            String []datos=new String [10];
            try{
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            while(rs.next()){
            datos[0]=rs.getString(1);
            datos[1]=rs.getString(2);
            datos[2]=rs.getString(3);
            datos[3]=rs.getString(4);
            
            datos[4]=rs.getString(5);
            datos[5]=rs.getString(6);
            datos[6]=rs.getString(7);
            datos[7]=rs.getString(8);
            datos[8]=rs.getString(9);
            datos[9]=rs.getString(10);
            

            Factura.addRow(datos);
            }
            tabla_factura.setModel(Factura);
            } catch(SQLException ex){
            Logger.getLogger(frm_main.class.getName()).log(Level.SEVERE,null,ex);
            JOptionPane.showMessageDialog(null, "error "+ex);
          }
            
        }
    
   // Botón para guardar un registro en la tabla
    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        
       String codcli = txt_codcli.getText();
       String cedcli = txt_cedcli.getText();
       String rnc = txt_rnc.getText();
       String nombre = txt_nombre.getText();
       String apellido = txt_apellido.getText();
       String montototal = txt_montototal.getText();
       String hora = txt_hora.getText();
       String fecha = txt_fecha.getText();
       String facturadopor = txt_facturadopor.getText();
        
        PreparedStatement ps;
        String query = "INSERT INTO `facturacion`(`cod_cliente`,`cedcli`,`rnc`,`nomcli`,`apcli`,`fecha`,`hora`,`montotal`,`facturadopor`) VALUES (?,?,?,?,?,,?,?,?,?)";
        
        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            
            ps.setString(1, codcli);
            ps.setString(2, cedcli);
            ps.setString(3, rnc);
            ps.setString(4, nombre);
            ps.setString(5, apellido);
            ps.setString(6, fecha);
            ps.setString(7, hora);
            ps.setString(8, montototal);
            ps.setString(9, facturadopor);
            
            if(ps.executeUpdate() > 0)
            {
                JOptionPane.showMessageDialog(null, "Factura agregada");
                Limpiar();
                Mostrardatos("");
                  
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(frm_mensaje.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error "+ex);        
    }     
    }//GEN-LAST:event_btn_guardarActionPerformed

    
    
    // Botón para imprimir un reporte
    private void btn_imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_imprimirActionPerformed
       
        Connection cn=MyConnection.getConnection();
        
        try{
          JasperReport jr = (JasperReport) JRLoader.loadObject(frm_cliente.class.getResource("/Reporte/Factura.jasper"));
          Map parametros = new HashMap<>();
          parametros.put("Titulo", "Reporte factura");
            

          JasperPrint jp = JasperFillManager.fillReport(jr, parametros, cn);
          JasperViewer jv = new JasperViewer(jp, false);
          jv.setVisible(true); 
        }
        
        catch (JRException ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
        }
        
    }//GEN-LAST:event_btn_imprimirActionPerformed

    // Función que al darle click a la imagen redirija al main
    private void Main(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Main
        
        frm_main mf = new frm_main();
        mf.setVisible(true);
        mf.pack();
        mf.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_Main

    // Función para modificar un registro de la tabla
    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
     
        String cod_facturacion = (String)Factura.getValueAt(tabla_factura.getSelectedRow(),0);
        String codcli = txt_codcli.getText();
        String cedcli = txt_cedcli.getText();
        String rnc = txt_rnc.getText();
        String nombre = txt_nombre.getText();
        String apellido = txt_apellido.getText();
        String montototal = txt_montototal.getText();
        String hora = txt_hora.getText();
        String fecha = txt_fecha.getText();
        String facturadopor = txt_facturadopor.getText();
        
        
        PreparedStatement ps;
        String query = "UPDATE facturacion SET cod_cliente=?, fecha=?, hora=?, montotal=?, facturadopor=? WHERE cod_facturacion=?";
        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            
            ps.setString(10, cod_facturacion);
            ps.setString(1, codcli);
            ps.setString(2, cedcli);
            ps.setString(3, rnc);
            ps.setString(4, nombre);
            ps.setString(5, apellido);
            ps.setString(6, fecha);
            ps.setString(7, hora);
            ps.setString(8, montototal);
            ps.setString(9, facturadopor);
            
         

            ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Factura modificada");
                Limpiar();
                Mostrardatos("");
                
        } catch (SQLException ex) {
            Logger.getLogger(frm_main.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error "+ex);
            }
    }//GEN-LAST:event_btn_modificarActionPerformed

    // Botón para eliminar un registro de la bb.dd.
    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
      
       String id = (String)Factura.getValueAt(tabla_factura.getSelectedRow(),0);
        
        
        PreparedStatement ps;
        String query = "DELETE FROM facturacion WHERE cod_facturacion=?";
        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            
            ps.setString(1, id);

                if(ps.executeUpdate() > 0)
            {
              
                JOptionPane.showMessageDialog(null, "Factura eliminada");
                Limpiar();
                Mostrardatos("");
            }
                
        } catch (SQLException ex) {
            Logger.getLogger(frm_main.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error "+ex);
            }
        
        
    }//GEN-LAST:event_btn_eliminarActionPerformed

    // Función para rellenar los textfield dandole click a la tabla
    private void Rellenar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Rellenar
       
        try {  
        String cod_cliente = (String) Factura.getValueAt(tabla_factura.getSelectedRow(),1);
        String cedcli = (String) Factura.getValueAt(tabla_factura.getSelectedRow(),2);
        String rnc = (String) Factura.getValueAt(tabla_factura.getSelectedRow(),3);
        String nomcli = (String) Factura.getValueAt(tabla_factura.getSelectedRow(),4);
        String apcli = (String) Factura.getValueAt(tabla_factura.getSelectedRow(),5);
        String fecha = (String) Factura.getValueAt(tabla_factura.getSelectedRow(),6);
        String hora = (String) Factura.getValueAt(tabla_factura.getSelectedRow(),7);
        String montotal = (String) Factura.getValueAt(tabla_factura.getSelectedRow(),8);
        String facturadopor = (String) Factura.getValueAt(tabla_factura.getSelectedRow(),9);
        

        txt_codcli.setText(cod_cliente);;
        txt_fecha.setText(fecha);
        txt_hora.setText(hora);
        txt_montototal.setText(montotal);
        txt_facturadopor.setText(facturadopor);
        txt_cedcli.setText(cedcli);
        txt_rnc.setText(rnc);
        txt_nombre.setText(nomcli);
        txt_apellido.setText(apcli);
      
        }
        catch (Exception ex){
        JOptionPane.showMessageDialog(null, "error "+ex);
        }
        
        
    }//GEN-LAST:event_Rellenar

    // Función para buscar una factura con el código del cliente
    private void Busqueda(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Busqueda
       
         try {
         if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
        String B = txt_codcli.getText()+"";
        Mostrardatos(B);
            }
        }
        catch (Exception ex){
        JOptionPane.showMessageDialog(null, "error "+ex);
        }
        
    }//GEN-LAST:event_Busqueda


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
            java.util.logging.Logger.getLogger(frm_factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_factura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_imprimir;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_apellido;
    private javax.swing.JLabel lbl_cedcli;
    private javax.swing.JLabel lbl_codcli;
    private javax.swing.JLabel lbl_factura;
    private javax.swing.JLabel lbl_facturadopor;
    private javax.swing.JLabel lbl_fecha;
    private javax.swing.JLabel lbl_hora;
    private javax.swing.JLabel lbl_logo;
    private javax.swing.JLabel lbl_montototal;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_rnc;
    private javax.swing.JPanel panelazul;
    private javax.swing.JPanel panelblanco;
    private javax.swing.JTable tabla_factura;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_cedcli;
    private javax.swing.JTextField txt_codcli;
    private javax.swing.JTextField txt_facturadopor;
    private javax.swing.JTextField txt_fecha;
    private javax.swing.JTextField txt_hora;
    private javax.swing.JTextField txt_montototal;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_rnc;
    // End of variables declaration//GEN-END:variables
}
