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
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import javax.swing.table.DefaultTableModel;


public class frm_cliente extends javax.swing.JFrame {


    DefaultTableModel Cliente;
    
    public frm_cliente() {
        initComponents();
        
        this.Cliente = (DefaultTableModel) tabla_cliente.getModel();
  
        Mostrardatos("");
       
    }
    
    // Función para limpiar los textfield
    public void Limpiar() {
      
       try {
           txt_cedulacli.setText(" ");
           txt_rnc.setText(" ");
           txt_nombre.setText(" ");
           txt_apellido.setText(" ");
           txt_telefono.setText(" ");
           txt_direccion.setText(" ");
          
       }
       catch (Exception ex) {
             JOptionPane.showMessageDialog(null, "error "+ex);
       }   
   }
    
    
    public void RefrescarTabla(){
        //Funcion encargada de Refrescar la tabla utilizando Revalidate
        try {
        Cliente.setColumnCount(0);
        Cliente.setRowCount(0);
        tabla_cliente.revalidate();
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
            Cliente.addColumn("Código cliente");
            Cliente.addColumn("Cédula");
            Cliente.addColumn("RNC");
            Cliente.addColumn("Nombre");
            Cliente.addColumn("Apellido");
            Cliente.addColumn("Teléfono");
            Cliente.addColumn("Dirección");

            this.tabla_cliente.setModel(Cliente);
            String sql;
            if (valor.equals(""))
            {
            sql="SELECT * FROM cliente";
            }
            else{
            sql="SELECT * FROM cliente WHERE nombre='"+valor+"'";
            } 

            String []datos=new String [7];
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

            Cliente.addRow(datos);
            }
            tabla_cliente.setModel(Cliente);
            } catch(SQLException ex){
            Logger.getLogger(frm_main.class.getName()).log(Level.SEVERE,null,ex);
            JOptionPane.showMessageDialog(null, "error "+ex);
          }
            
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_apellido1 = new javax.swing.JLabel();
        txt_apellido1 = new javax.swing.JTextField();
        lbl_apellido2 = new javax.swing.JLabel();
        txt_apellido2 = new javax.swing.JTextField();
        lbl_cedula = new javax.swing.JLabel();
        txt_cedula = new javax.swing.JTextField();
        panelblanco = new javax.swing.JPanel();
        lbl_logo = new javax.swing.JLabel();
        panelazul = new javax.swing.JPanel();
        panelazul2 = new javax.swing.JPanel();
        lbl_cliente = new javax.swing.JLabel();
        panelcampos = new javax.swing.JPanel();
        lbl_cedulacli = new javax.swing.JLabel();
        txt_cedulacli = new javax.swing.JTextField();
        lbl_nombre = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        lbl_apellido = new javax.swing.JLabel();
        txt_apellido = new javax.swing.JTextField();
        lbl_telefono = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        lbl_direccion = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JTextField();
        lbl_rnc = new javax.swing.JLabel();
        txt_rnc = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_cliente = new javax.swing.JTable();
        btn_guardar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_borrar = new javax.swing.JButton();
        btn_imprimir = new javax.swing.JButton();

        lbl_apellido1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_apellido1.setText("Apellido");

        lbl_apellido2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_apellido2.setText("Apellido");

        lbl_cedula.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        lbl_cedula.setText("Cédula");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CLIENTES");
        setResizable(false);

        panelblanco.setBackground(new java.awt.Color(255, 255, 255));

        lbl_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo nicadom.png"))); // NOI18N
        lbl_logo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Main(evt);
            }
        });

        panelazul.setBackground(new java.awt.Color(10, 73, 123));

        javax.swing.GroupLayout panelazulLayout = new javax.swing.GroupLayout(panelazul);
        panelazul.setLayout(panelazulLayout);
        panelazulLayout.setHorizontalGroup(
            panelazulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelazulLayout.setVerticalGroup(
            panelazulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panelazul2.setBackground(new java.awt.Color(10, 73, 123));

        javax.swing.GroupLayout panelazul2Layout = new javax.swing.GroupLayout(panelazul2);
        panelazul2.setLayout(panelazul2Layout);
        panelazul2Layout.setHorizontalGroup(
            panelazul2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelazul2Layout.setVerticalGroup(
            panelazul2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        lbl_cliente.setFont(new java.awt.Font("Corbel", 0, 36)); // NOI18N
        lbl_cliente.setForeground(new java.awt.Color(10, 73, 123));
        lbl_cliente.setText("CONTROL CLIENTE");

        panelcampos.setBackground(new java.awt.Color(255, 255, 255));

        lbl_cedulacli.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        lbl_cedulacli.setText("Cédula");

        lbl_nombre.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        lbl_nombre.setText("Nombre");

        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Busqueda(evt);
            }
        });

        lbl_apellido.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        lbl_apellido.setText("Apellido");

        lbl_telefono.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        lbl_telefono.setText("Teléfono");

        lbl_direccion.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        lbl_direccion.setText("Dirección");

        lbl_rnc.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        lbl_rnc.setText("RNC");

        javax.swing.GroupLayout panelcamposLayout = new javax.swing.GroupLayout(panelcampos);
        panelcampos.setLayout(panelcamposLayout);
        panelcamposLayout.setHorizontalGroup(
            panelcamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelcamposLayout.createSequentialGroup()
                .addGroup(panelcamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelcamposLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(panelcamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_rnc)
                            .addComponent(lbl_cedulacli))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelcamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_rnc, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_cedulacli))
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelcamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(panelcamposLayout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(lbl_telefono)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelcamposLayout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addComponent(lbl_apellido)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelcamposLayout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_nombre)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(14, 14, 14)))
                    .addGroup(panelcamposLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_direccion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_direccion)))
                .addGap(44, 44, 44))
        );
        panelcamposLayout.setVerticalGroup(
            panelcamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelcamposLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelcamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cedulacli)
                    .addComponent(txt_cedulacli, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(panelcamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_rnc)
                    .addComponent(txt_rnc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelcamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nombre)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelcamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_apellido)
                    .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(panelcamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_telefono)
                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelcamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_direccion)
                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        tabla_cliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabla_cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Rellenar(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_cliente);

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

        btn_borrar.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        btn_borrar.setText("BORRAR");
        btn_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarActionPerformed(evt);
            }
        });

        btn_imprimir.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        btn_imprimir.setText("IMPRIMIR");
        btn_imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_imprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelblancoLayout = new javax.swing.GroupLayout(panelblanco);
        panelblanco.setLayout(panelblancoLayout);
        panelblancoLayout.setHorizontalGroup(
            panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelazul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelazul2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelblancoLayout.createSequentialGroup()
                .addGroup(panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelblancoLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(lbl_logo)
                        .addGap(256, 256, 256)
                        .addComponent(lbl_cliente))
                    .addGroup(panelblancoLayout.createSequentialGroup()
                        .addGroup(panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelblancoLayout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addComponent(btn_guardar)
                                .addGap(99, 99, 99)
                                .addComponent(btn_modificar))
                            .addGroup(panelblancoLayout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(panelcampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelblancoLayout.createSequentialGroup()
                                .addGap(153, 153, 153)
                                .addComponent(btn_borrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_imprimir)
                                .addGap(29, 29, 29)))))
                .addContainerGap(152, Short.MAX_VALUE))
        );
        panelblancoLayout.setVerticalGroup(
            panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelblancoLayout.createSequentialGroup()
                .addComponent(panelazul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_logo)
                    .addGroup(panelblancoLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lbl_cliente)))
                .addGap(9, 9, 9)
                .addGroup(panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelblancoLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addGroup(panelblancoLayout.createSequentialGroup()
                        .addComponent(panelcampos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addGroup(panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guardar)
                    .addComponent(btn_modificar)
                    .addComponent(btn_borrar)
                    .addComponent(btn_imprimir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelazul2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    // Botón para guardar un registro en la tabla
    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
      
       String cedula = txt_cedulacli.getText();
       String rnc = txt_rnc.getText();
       String nombre = txt_nombre.getText();
       String apellido = txt_apellido.getText();
       String telefono = txt_telefono.getText();
       String direccion = txt_direccion.getText();
        
        PreparedStatement ps;
        String query = "INSERT INTO `cliente`(`cedula`,`rnc`,`nombre`,`apellido`,`telefono`,`direccion`) VALUES (?,?,?,?,?,?)";
        
        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            
            ps.setString(1, cedula);
            ps.setString(2, rnc);
            ps.setString(3, nombre);
            ps.setString(4, apellido);
            ps.setString(5, telefono);
            ps.setString(6, direccion);
            
            
            if("".equals(txt_cedulacli.getText()) || "".equals(txt_rnc.getText()) || "".equals(txt_nombre.getText()) || "".equals(txt_apellido.getText())) {
                JOptionPane.showMessageDialog(null, "Uno de los campos vacíos es requerido");
            } else {
                
            
            if(ps.executeUpdate() > 0)
            {
                JOptionPane.showMessageDialog(null, "Cliente agregado");
               Limpiar(); 
               Mostrardatos("");
               
            }
          }
        } catch (SQLException ex) {
            Logger.getLogger(frm_mensaje.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error "+ex);
            
    }   
 
    }//GEN-LAST:event_btn_guardarActionPerformed

    // Botón para modificar un registro de la tabla
    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed

        
        String cod_cliente = (String)Cliente.getValueAt(tabla_cliente.getSelectedRow(),0);
        String cedula = txt_cedulacli.getText();
        String rnc = txt_rnc.getText();
        String nombre = txt_nombre.getText();
        String apellido = txt_apellido.getText();
        String telefono = txt_telefono.getText();
        String direccion = txt_direccion.getText();
        
        
        PreparedStatement ps;
        String query = "UPDATE cliente SET cedula=?, rnc=?, nombre=?, apellido=?, telefono=?, direccion=? WHERE cod_cliente=?";
        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            
            ps.setString(7, cod_cliente);
            ps.setString(1, cedula);
            ps.setString(2, rnc);
            ps.setString(3, nombre);
            ps.setString(4, apellido);
            ps.setString(5, telefono);
            ps.setString(6, direccion);
         
            if("".equals(txt_cedulacli.getText()) || "".equals(txt_rnc.getText()) || "".equals(txt_nombre.getText()) || "".equals(txt_apellido.getText())) {
                JOptionPane.showMessageDialog(null, "Uno de los campos vacíos es requerido");
            } else {
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Cliente modificado");
                Limpiar();
                Mostrardatos("");
                }
                
        } catch (SQLException ex) {
            Logger.getLogger(frm_main.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error "+ex);
            }

        
    }//GEN-LAST:event_btn_modificarActionPerformed

    // Botón para borrar un registro de la tabla
    private void btn_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarActionPerformed
     
       String id = (String)Cliente.getValueAt(tabla_cliente.getSelectedRow(),0);
        
        
        PreparedStatement ps;
        String query = "DELETE FROM cliente WHERE cod_cliente=?";
        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            
            ps.setString(1, id);

                if(ps.executeUpdate() > 0)
            {
              
                JOptionPane.showMessageDialog(null, "Cliente eliminado");
                Limpiar();
                Mostrardatos("");
            }
                
        } catch (SQLException ex) {
            Logger.getLogger(frm_main.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error "+ex);
            }

    }//GEN-LAST:event_btn_borrarActionPerformed

    // Botón para imprimir un reporte
    private void btn_imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_imprimirActionPerformed
        
        Connection cn=MyConnection.getConnection();
        
        try{
          JasperReport jr = (JasperReport) JRLoader.loadObject(frm_cliente.class.getResource("/Reporte/Cliente.jasper"));
          Map parametros = new HashMap<>();
          parametros.put("Titulo", "Reporte clientes");
            

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

    // Función que busca a un cliente con su nombre
    private void Busqueda(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Busqueda
     
        try {
            if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
        String B = txt_nombre.getText()+"";
        Mostrardatos(B);
            }
        }
        catch (Exception ex){
        JOptionPane.showMessageDialog(null, "error "+ex);
        }
    }//GEN-LAST:event_Busqueda

    // Función que al darle click a la tabla rellene los textfield
    private void Rellenar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Rellenar
      
        try {  
        String cedula = (String) Cliente.getValueAt(tabla_cliente.getSelectedRow(),1);
        String rnc = (String) Cliente.getValueAt(tabla_cliente.getSelectedRow(),2);
        String nombre = (String) Cliente.getValueAt(tabla_cliente.getSelectedRow(),3);
        String apellido = (String) Cliente.getValueAt(tabla_cliente.getSelectedRow(),4);
        String telefono = (String) Cliente.getValueAt(tabla_cliente.getSelectedRow(),5);
        String direccion = (String) Cliente.getValueAt(tabla_cliente.getSelectedRow(),6);


        txt_cedulacli.setText(cedula);
        txt_rnc.setText(rnc);
        txt_nombre.setText(nombre);
        txt_apellido.setText(apellido);
        txt_telefono.setText(telefono);
        txt_direccion.setText(direccion);
        }
        catch (Exception ex){
        JOptionPane.showMessageDialog(null, "error "+ex);
        }

    }//GEN-LAST:event_Rellenar

 
    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_borrar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_imprimir;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_apellido;
    private javax.swing.JLabel lbl_apellido1;
    private javax.swing.JLabel lbl_apellido2;
    private javax.swing.JLabel lbl_cedula;
    private javax.swing.JLabel lbl_cedulacli;
    private javax.swing.JLabel lbl_cliente;
    private javax.swing.JLabel lbl_direccion;
    private javax.swing.JLabel lbl_logo;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_rnc;
    private javax.swing.JLabel lbl_telefono;
    private javax.swing.JPanel panelazul;
    private javax.swing.JPanel panelazul2;
    private javax.swing.JPanel panelblanco;
    private javax.swing.JPanel panelcampos;
    private javax.swing.JTable tabla_cliente;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_apellido1;
    private javax.swing.JTextField txt_apellido2;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_cedulacli;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_rnc;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
