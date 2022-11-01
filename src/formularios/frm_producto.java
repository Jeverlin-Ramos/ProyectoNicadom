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


public class frm_producto extends javax.swing.JFrame {


    DefaultTableModel Producto;

    public frm_producto() {
        initComponents();
        
        this.Producto = (DefaultTableModel)tabla_producto.getModel();
        Mostrardatos("");
    }

    
    //Función para limpiar los textfield    
    public void Limpiar() {
      
       try {
           txt_nombre.setText(" ");
           txt_preciocompra.setText(" ");
           txt_precioventa.setText(" ");
           txt_presentacion.setText(" ");
           txt_color.setText(" ");
           txt_descripcion.setText(" ");
           txt_codproveedor.setText(" ");
           txt_cantidad.setText(" ");
       }
       catch (Exception ex) {
             JOptionPane.showMessageDialog(null, "error "+ex);
       }   
   }
   
       public void RefrescarTabla(){
        //Funcion encargada de Refrescar la tabla utilizando Revalidate
        try {
        Producto.setColumnCount(0);
        Producto.setRowCount(0);
        tabla_producto.revalidate();
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
            Producto.addColumn("Código producto");
            Producto.addColumn("Nombre");
            Producto.addColumn("Precio compra");
            Producto.addColumn("Precio venta");
            Producto.addColumn("Presentación");
            Producto.addColumn("Color");
            Producto.addColumn("Descripción");
            Producto.addColumn("Código del proveedor");
            Producto.addColumn("Cantidad producto");

            this.tabla_producto.setModel(Producto);
            String sql;
            if (valor.equals(""))
            {
            sql="SELECT * FROM producto";
            }
            else{
            sql="SELECT * FROM producto WHERE nom_prod='"+valor+"'";
            } 

            String []datos=new String [9];
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

            Producto.addRow(datos);
            }
            tabla_producto.setModel(Producto);
            } catch(SQLException ex){
            Logger.getLogger(frm_main.class.getName()).log(Level.SEVERE,null,ex);
            JOptionPane.showMessageDialog(null, "error "+ex);
          }
            
        }  
         
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelblanco = new javax.swing.JPanel();
        panelazul = new javax.swing.JPanel();
        panelazul2 = new javax.swing.JPanel();
        lbl_logo = new javax.swing.JLabel();
        lbl_producto = new javax.swing.JLabel();
        lbl_nombre = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        lbl_precio = new javax.swing.JLabel();
        txt_preciocompra = new javax.swing.JTextField();
        lbl_presentacion = new javax.swing.JLabel();
        txt_presentacion = new javax.swing.JTextField();
        lbl_color = new javax.swing.JLabel();
        txt_color = new javax.swing.JTextField();
        lbl_descripcion = new javax.swing.JLabel();
        txt_descripcion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_producto = new javax.swing.JTable();
        btn_guardar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_borrar = new javax.swing.JButton();
        btn_imprimir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_precioventa = new javax.swing.JTextField();
        lbl_codproveedor = new javax.swing.JLabel();
        txt_codproveedor = new javax.swing.JTextField();
        lbl_cantidad = new javax.swing.JLabel();
        txt_cantidad = new javax.swing.JTextField();
        btn_proveedor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PRODUCTO");
        setResizable(false);

        panelblanco.setBackground(new java.awt.Color(255, 255, 255));

        panelazul.setBackground(new java.awt.Color(10, 73, 123));

        javax.swing.GroupLayout panelazulLayout = new javax.swing.GroupLayout(panelazul);
        panelazul.setLayout(panelazulLayout);
        panelazulLayout.setHorizontalGroup(
            panelazulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelazulLayout.setVerticalGroup(
            panelazulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
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
            .addGap(0, 30, Short.MAX_VALUE)
        );

        lbl_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo nicadom.png"))); // NOI18N
        lbl_logo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Main(evt);
            }
        });

        lbl_producto.setFont(new java.awt.Font("Corbel", 0, 36)); // NOI18N
        lbl_producto.setForeground(new java.awt.Color(10, 73, 123));
        lbl_producto.setText("CONTROL PRODUCTO");

        lbl_nombre.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        lbl_nombre.setText("Nombre");

        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Busqueda(evt);
            }
        });

        lbl_precio.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        lbl_precio.setText("Precio compra");

        lbl_presentacion.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        lbl_presentacion.setText("Presentación");
        lbl_presentacion.setToolTipText("");

        lbl_color.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        lbl_color.setText("Color");
        lbl_color.setToolTipText("");

        lbl_descripcion.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        lbl_descripcion.setText("Descripción");
        lbl_descripcion.setToolTipText("");

        tabla_producto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabla_producto.setCellSelectionEnabled(true);
        tabla_producto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Rellenar(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_producto);

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

        jLabel1.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel1.setText("Precio venta");

        lbl_codproveedor.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        lbl_codproveedor.setText("Código del proveedor");
        lbl_codproveedor.setToolTipText("");

        lbl_cantidad.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        lbl_cantidad.setText("Cantidad");
        lbl_cantidad.setToolTipText("");

        btn_proveedor.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        btn_proveedor.setText("PROVEEDOR");
        btn_proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_proveedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelblancoLayout = new javax.swing.GroupLayout(panelblanco);
        panelblanco.setLayout(panelblancoLayout);
        panelblancoLayout.setHorizontalGroup(
            panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelazul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelazul2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelblancoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_color, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_presentacion, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_descripcion, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_precio, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_nombre, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_codproveedor, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_cantidad, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_nombre)
                    .addComponent(txt_presentacion)
                    .addComponent(txt_color)
                    .addComponent(txt_descripcion)
                    .addComponent(txt_precioventa)
                    .addComponent(txt_preciocompra)
                    .addComponent(txt_codproveedor)
                    .addComponent(txt_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(btn_proveedor)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addGroup(panelblancoLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lbl_logo)
                .addGap(197, 197, 197)
                .addComponent(lbl_producto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelblancoLayout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(btn_guardar)
                .addGap(123, 123, 123)
                .addComponent(btn_modificar)
                .addGap(140, 140, 140)
                .addComponent(btn_borrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 186, Short.MAX_VALUE)
                .addComponent(btn_imprimir)
                .addGap(87, 87, 87))
        );
        panelblancoLayout.setVerticalGroup(
            panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelblancoLayout.createSequentialGroup()
                .addComponent(panelazul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelblancoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lbl_logo))
                    .addGroup(panelblancoLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(lbl_producto)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelblancoLayout.createSequentialGroup()
                        .addGroup(panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_nombre)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_precio)
                            .addComponent(txt_preciocompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_precioventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_presentacion)
                            .addComponent(txt_presentacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 18, Short.MAX_VALUE)
                        .addGroup(panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_color)
                            .addComponent(txt_color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_descripcion))
                        .addGap(22, 22, 22)
                        .addGroup(panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_codproveedor)
                            .addComponent(txt_codproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_proveedor))
                        .addGap(18, 18, 18)
                        .addGroup(panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_cantidad)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guardar)
                    .addComponent(btn_modificar)
                    .addComponent(btn_borrar)
                    .addComponent(btn_imprimir))
                .addGap(35, 35, 35)
                .addComponent(panelazul2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelblanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelblanco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Botón para guardar un registro en la tabla 
    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
       
       String nombre = txt_nombre.getText();
       String preciocompra = txt_preciocompra.getText();
       String precioventa = txt_precioventa.getText();
       String presentacion = txt_presentacion.getText();
       String color = txt_color.getText();
       String descripcion = txt_descripcion.getText();
       String codprov = txt_codproveedor.getText();
       String cant = txt_cantidad.getText();
        
        PreparedStatement ps;
        String query = "INSERT INTO `producto`(`nom_prod`,`preciocompra`,`precioventa`,`presentacion`,`color`,`descripcion`,`codproveedor`,`cant`) VALUES (?,?,?,?,?,?,?,?)";
        
        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            
            ps.setString(1, nombre);
            ps.setString(2, preciocompra);
            ps.setString(3, precioventa);
            ps.setString(4, presentacion);
            ps.setString(5, color);
            ps.setString(6, descripcion);
            ps.setString(7, codprov);
            ps.setString(8, cant);
            
           if("".equals(txt_nombre.getText()) || "".equals(txt_preciocompra.getText()) || "".equals(txt_precioventa.getText()) || "".equals(txt_codproveedor.getText()) || "".equals(txt_cantidad.getText()))  {
               JOptionPane.showMessageDialog(null, "El campo vacío es requerido");
           } else {
              
            if(ps.executeUpdate() > 0)
            {
                JOptionPane.showMessageDialog(null, "Producto agregado");
                Limpiar();
                Mostrardatos("");
            
            }   
    }   
           } catch (SQLException ex) {
            Logger.getLogger(frm_producto.class.getName()).log(Level.SEVERE, null, ex);
        }
            
 
    }//GEN-LAST:event_btn_guardarActionPerformed

    // Botón para imprimir un reporte
    private void btn_imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_imprimirActionPerformed
      
        Connection cn=MyConnection.getConnection();
        
        try{
          JasperReport jr = (JasperReport) JRLoader.loadObject(frm_cliente.class.getResource("/Reporte/Producto.jasper"));
          Map parametros = new HashMap<>();
          parametros.put("Titulo", "Reporte productos");
            

          JasperPrint jp = JasperFillManager.fillReport(jr, parametros, cn);
          JasperViewer jv = new JasperViewer(jp, false);
          jv.setVisible(true); 
        }
        
        catch (JRException ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
        }
         
    }//GEN-LAST:event_btn_imprimirActionPerformed

    //Función que al darle click a la imagen redirija al main
    private void Main(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Main
        
        frm_main mf = new frm_main();
        mf.setVisible(true);
        mf.pack();
        mf.setLocationRelativeTo(null);
        this.dispose();
        
    }//GEN-LAST:event_Main

    // Función para buscar un producto escribiendo el nombre de este
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

    
    //Función para rellenar los textfield dando click a la tabla
    private void Rellenar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Rellenar
       
          try {  
        String nombre = (String) Producto.getValueAt(tabla_producto.getSelectedRow(),1);
        String preciocompra = (String) Producto.getValueAt(tabla_producto.getSelectedRow(),2);
        String precioventa = (String) Producto.getValueAt(tabla_producto.getSelectedRow(),3);
        String presentacion = (String) Producto.getValueAt(tabla_producto.getSelectedRow(),4);
        String color = (String) Producto.getValueAt(tabla_producto.getSelectedRow(),5);
        String descripcion = (String) Producto.getValueAt(tabla_producto.getSelectedRow(),6);
        String codprov = (String) Producto.getValueAt(tabla_producto.getSelectedRow(),7);
        String cant = (String) Producto.getValueAt(tabla_producto.getSelectedRow(),8);


        txt_nombre.setText(nombre);
        txt_preciocompra.setText(preciocompra);
        txt_precioventa.setText(precioventa);
        txt_presentacion.setText(presentacion);
        txt_color.setText(color);
        txt_descripcion.setText(descripcion);
        txt_codproveedor.setText(codprov);
        txt_cantidad.setText(cant);
        }
        catch (Exception ex){
        JOptionPane.showMessageDialog(null, "error "+ex);
        }
    }//GEN-LAST:event_Rellenar

    //Botón para modificar un registro de la tabla
    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        
        String cod_producto = (String)Producto.getValueAt(tabla_producto.getSelectedRow(),0);
        String nombre = txt_nombre.getText();
        String preciocompra = txt_preciocompra.getText();
        String precioventa = txt_precioventa.getText();
        String presentacion = txt_presentacion.getText();
        String color = txt_color.getText();
        String descripcion = txt_descripcion.getText();
        String codprov = txt_codproveedor.getText();
        String cant = txt_cantidad.getText();
        
        
        PreparedStatement ps;
        String query = "UPDATE producto SET nom_prod=?, preciocompra=?,precioventa=?, presentacion=?, color=?, descripcion=?, codproveedor=?, cant=? WHERE cod_producto=?";
        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            
            ps.setString(9, cod_producto);
            ps.setString(1, nombre);
            ps.setString(2, preciocompra);
            ps.setString(3, precioventa);
            ps.setString(4, presentacion);
            ps.setString(5, color);
            ps.setString(6, descripcion);
            ps.setString(7, codprov);
            ps.setString(8, cant);
         

            if("".equals(txt_nombre.getText()) || "".equals(txt_preciocompra.getText()) || "".equals(txt_precioventa.getText()) || "".equals(txt_codproveedor.getText()) || "".equals(txt_cantidad.getText()))  {
               JOptionPane.showMessageDialog(null, "El campo vacío es requerido");
            
              } else {
                       
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Producto modificado");
                Limpiar();
                Mostrardatos("");
                }
                
        } catch (SQLException ex) {
            Logger.getLogger(frm_main.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error "+ex);
            }
    }//GEN-LAST:event_btn_modificarActionPerformed

    
    // Botón de borrar registro de la base de datos
    private void btn_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarActionPerformed
       
        String id = (String)Producto.getValueAt(tabla_producto.getSelectedRow(),0);
        
        
        PreparedStatement ps;
        String query = "DELETE FROM producto WHERE cod_producto=?";
        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            
            ps.setString(1, id);

                if(ps.executeUpdate() > 0)
            {
              
                JOptionPane.showMessageDialog(null, "Producto eliminado");
                Limpiar();
                Mostrardatos("");
            }
                
        } catch (SQLException ex) {
            Logger.getLogger(frm_main.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error "+ex);
            }
        
    }//GEN-LAST:event_btn_borrarActionPerformed

    private void btn_proveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_proveedorActionPerformed
   
        frm_proveedor mf = new frm_proveedor();
        mf.setVisible(true);
        mf.pack();
        mf.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_btn_proveedorActionPerformed

    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_producto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_borrar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_imprimir;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_proveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_cantidad;
    private javax.swing.JLabel lbl_codproveedor;
    private javax.swing.JLabel lbl_color;
    private javax.swing.JLabel lbl_descripcion;
    private javax.swing.JLabel lbl_logo;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_precio;
    private javax.swing.JLabel lbl_presentacion;
    private javax.swing.JLabel lbl_producto;
    private javax.swing.JPanel panelazul;
    private javax.swing.JPanel panelazul2;
    private javax.swing.JPanel panelblanco;
    private javax.swing.JTable tabla_producto;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_codproveedor;
    private javax.swing.JTextField txt_color;
    private javax.swing.JTextField txt_descripcion;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_preciocompra;
    private javax.swing.JTextField txt_precioventa;
    private javax.swing.JTextField txt_presentacion;
    // End of variables declaration//GEN-END:variables
}
