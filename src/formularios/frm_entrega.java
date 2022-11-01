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


public class frm_entrega extends javax.swing.JFrame {
    
    DefaultTableModel Entrega;

  
    public frm_entrega() {
        initComponents();
        
        
        this.Entrega = (DefaultTableModel) tabla_entrega.getModel();
        
        Mostrardatos("");
    }
    
        // Función para limpiar los textfield
        public void Limpiar() {
      
       try {
           txt_nombre.setText(" ");
           txt_telefono.setText(" ");
           txt_direccion.setText(" ");
           txt_fechaentrega.setText(" ");
       }
       catch (Exception ex) {
             JOptionPane.showMessageDialog(null, "error "+ex);
       }   
   }
        
        public void RefrescarTabla(){
        //Funcion encargada de Refrescar la tabla utilizando Revalidate
        try {
        Entrega.setColumnCount(0);
        Entrega.setRowCount(0);
        tabla_entrega.revalidate();
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
            Entrega.addColumn("Código entrega");
            Entrega.addColumn("Nombre");
            Entrega.addColumn("Teléfono");
            Entrega.addColumn("Dirección");
            Entrega.addColumn("Fecha");
        
            this.tabla_entrega.setModel(Entrega);
            String sql;
            if (valor.equals(""))
            {
            sql="SELECT * FROM entrega";
            }
            else{
            sql="SELECT * FROM entrega WHERE nombre='"+valor+"'";
            } 

            String []datos=new String [6];
            try{
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            while(rs.next()){
            datos[0]=rs.getString(1);
            datos[1]=rs.getString(2);
            datos[2]=rs.getString(3);
            datos[3]=rs.getString(4);
            
            datos[4]=rs.getString(5);
       

            Entrega.addRow(datos);
            }
            tabla_entrega.setModel(Entrega);
            } catch(SQLException ex){
            Logger.getLogger(frm_main.class.getName()).log(Level.SEVERE,null,ex);
            JOptionPane.showMessageDialog(null, "error "+ex);
          }
            
        }
            
                                     
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelblanco = new javax.swing.JPanel();
        lbl_logo = new javax.swing.JLabel();
        panelazul = new javax.swing.JPanel();
        panelazul1 = new javax.swing.JPanel();
        lbl_entrega = new javax.swing.JLabel();
        lbl_fechaentrega = new javax.swing.JLabel();
        txt_fechaentrega = new javax.swing.JTextField();
        btn_guardar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_imprimir = new javax.swing.JButton();
        lbl_nombre = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        lbl_telefono = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        lbl_direccion = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_entrega = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ENTREGA");
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

        panelazul1.setBackground(new java.awt.Color(10, 73, 123));

        javax.swing.GroupLayout panelazul1Layout = new javax.swing.GroupLayout(panelazul1);
        panelazul1.setLayout(panelazul1Layout);
        panelazul1Layout.setHorizontalGroup(
            panelazul1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelazul1Layout.setVerticalGroup(
            panelazul1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
        );

        lbl_entrega.setFont(new java.awt.Font("Corbel", 0, 36)); // NOI18N
        lbl_entrega.setForeground(new java.awt.Color(10, 73, 123));
        lbl_entrega.setText("CONTROL ENTREGA");

        lbl_fechaentrega.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        lbl_fechaentrega.setText("Fecha");

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
        btn_imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_imprimirActionPerformed(evt);
            }
        });

        lbl_nombre.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        lbl_nombre.setText("Nombre");

        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Busqueda(evt);
            }
        });

        lbl_telefono.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        lbl_telefono.setText("Teléfono");

        lbl_direccion.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        lbl_direccion.setText("Dirección");

        tabla_entrega.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabla_entrega.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Rellenar(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_entrega);

        javax.swing.GroupLayout panelblancoLayout = new javax.swing.GroupLayout(panelblanco);
        panelblanco.setLayout(panelblancoLayout);
        panelblancoLayout.setHorizontalGroup(
            panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelazul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelazul1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelblancoLayout.createSequentialGroup()
                .addGroup(panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelblancoLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lbl_logo)
                        .addGap(181, 181, 181)
                        .addComponent(lbl_entrega))
                    .addGroup(panelblancoLayout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addGroup(panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelblancoLayout.createSequentialGroup()
                                .addGroup(panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_telefono)
                                    .addComponent(lbl_nombre))
                                .addGap(18, 18, 18)
                                .addGroup(panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelblancoLayout.createSequentialGroup()
                                .addComponent(lbl_direccion)
                                .addGap(18, 18, 18)
                                .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelblancoLayout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addGroup(panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelblancoLayout.createSequentialGroup()
                                .addComponent(btn_guardar)
                                .addGap(29, 29, 29)
                                .addComponent(btn_modificar)
                                .addGap(30, 30, 30)
                                .addComponent(btn_eliminar))
                            .addGroup(panelblancoLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(lbl_fechaentrega)
                                .addGap(18, 18, 18)
                                .addComponent(txt_fechaentrega, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35)
                        .addComponent(btn_imprimir)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        panelblancoLayout.setVerticalGroup(
            panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelblancoLayout.createSequentialGroup()
                .addGroup(panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelblancoLayout.createSequentialGroup()
                        .addComponent(panelazul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_logo)
                            .addGroup(panelblancoLayout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(lbl_entrega)))
                        .addGap(21, 21, 21)
                        .addGroup(panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_nombre)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_telefono)
                            .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_direccion)
                            .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_fechaentrega)
                            .addComponent(txt_fechaentrega, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelblancoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)))
                .addGroup(panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guardar)
                    .addComponent(btn_modificar)
                    .addComponent(btn_eliminar)
                    .addComponent(btn_imprimir))
                .addGap(42, 42, 42)
                .addComponent(panelazul1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelblanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelblanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Botón para guardar un registro en la tabla
    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        
       String nombre = txt_nombre.getText();
       String telefono = txt_telefono.getText();
       String direccion = txt_direccion.getText();
       String fecha = txt_fechaentrega.getText();
       
        
        PreparedStatement ps;
        String query = "INSERT INTO `entrega`(`nombre`,`telefono`,`direccion`,`fecha`) VALUES (?,?,?,?)";
        
        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            
            ps.setString(1, nombre);
            ps.setString(2, telefono);
            ps.setString(3, direccion);
            ps.setString(4, fecha);
        
            
            if(ps.executeUpdate() > 0)
            {
                JOptionPane.showMessageDialog(null, "Entrega almacenada");
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
          JasperReport jr = (JasperReport) JRLoader.loadObject(frm_cliente.class.getResource("/Reporte/Entrega.jasper"));
          Map parametros = new HashMap<>();
          parametros.put("Titulo", "Reporte entrega");
            

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

    // Función para buscar una entrega con el nombre
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

    // Función para rellenar los textfield al darle click a la tabla
    private void Rellenar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Rellenar
  
         try {  
        String nombre = (String) Entrega.getValueAt(tabla_entrega.getSelectedRow(),1);
        String telefono = (String) Entrega.getValueAt(tabla_entrega.getSelectedRow(),2);
        String direccion = (String) Entrega.getValueAt(tabla_entrega.getSelectedRow(),3);
        String fecha = (String) Entrega.getValueAt(tabla_entrega.getSelectedRow(),4);


    
        txt_nombre.setText(nombre);
        txt_telefono.setText(telefono);
        txt_direccion.setText(direccion);
        txt_fechaentrega.setText(fecha);
        }
        catch (Exception ex){
        JOptionPane.showMessageDialog(null, "error "+ex);
        }
    }//GEN-LAST:event_Rellenar

    // Botón para modificar un registro de la tabla
    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
      
        String cod_entrega = (String)Entrega.getValueAt(tabla_entrega.getSelectedRow(),0);
        String nombre = txt_nombre.getText();
        String telefono = txt_telefono.getText();
        String direccion = txt_direccion.getText();
        String fecha = txt_fechaentrega.getText();
        
        
        PreparedStatement ps;
        String query = "UPDATE entrega SET nombre=?, telefono=?, direccion=?, fecha=? WHERE cod_entrega=?";
        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            
            ps.setString(5, cod_entrega);
            ps.setString(1, nombre);
            ps.setString(2, telefono);
            ps.setString(3, direccion);
            ps.setString(4, fecha);
         

            ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Entrega modificada");
                Limpiar();
                Mostrardatos("");
                
        } catch (SQLException ex) {
            Logger.getLogger(frm_main.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error "+ex);
            }

    }//GEN-LAST:event_btn_modificarActionPerformed

    // Botón para eliminar un registro de la tabla
    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
       
        String id = (String)Entrega.getValueAt(tabla_entrega.getSelectedRow(),0);
        
        
        PreparedStatement ps;
        String query = "DELETE FROM entrega WHERE cod_entrega=?";
        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            
            ps.setString(1, id);

                if(ps.executeUpdate() > 0)
            {
              
                JOptionPane.showMessageDialog(null, "Entrega eliminada");
                Limpiar();
                Mostrardatos("");
            }
                
        } catch (SQLException ex) {
            Logger.getLogger(frm_main.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error "+ex);
            }

    }//GEN-LAST:event_btn_eliminarActionPerformed

   
    public static void main(String args[]) {

   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_entrega().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_imprimir;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_direccion;
    private javax.swing.JLabel lbl_entrega;
    private javax.swing.JLabel lbl_fechaentrega;
    private javax.swing.JLabel lbl_logo;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_telefono;
    private javax.swing.JPanel panelazul;
    private javax.swing.JPanel panelazul1;
    private javax.swing.JPanel panelblanco;
    private javax.swing.JTable tabla_entrega;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_fechaentrega;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
