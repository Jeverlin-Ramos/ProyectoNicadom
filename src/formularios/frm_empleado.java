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


public class frm_empleado extends javax.swing.JFrame {

    DefaultTableModel Empleado;
  

    public frm_empleado() {
        initComponents();
        
       
        this.Empleado = (DefaultTableModel) tabla_empleado.getModel();
        Mostrardatos("");
    }
    
    
    // Función que limpia los textfield
    public void Limpiar() {
      
       try {
           txt_cedula.setText(" ");
           txt_nombre.setText(" ");
           txt_apellido.setText(" ");
           txt_direccion.setText(" ");
           txt_telefono.setText(" ");
           txt_numeroemergencia.setText(" ");
       }
       catch (Exception ex) {
             JOptionPane.showMessageDialog(null, "error "+ex);
       }   
   }
         
       public void RefrescarTabla(){
        //Funcion encargada de Refrescar la tabla utilizando Revalidate
        try {
        Empleado.setColumnCount(0);
        Empleado.setRowCount(0);
        tabla_empleado.revalidate();
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
            Empleado.addColumn("Código empleado");
            Empleado.addColumn("Cédula");
            Empleado.addColumn("Nombre");
            Empleado.addColumn("Apellido");
            Empleado.addColumn("Dirección");
            Empleado.addColumn("Teléfono");
            Empleado.addColumn("Número de emergencia");

            this.tabla_empleado.setModel(Empleado);
            String sql;
            if (valor.equals(""))
            {
            sql="SELECT * FROM empleado";
            }
            else{
            sql="SELECT * FROM empleado WHERE nombre='"+valor+"'";
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

            Empleado.addRow(datos);
            }
            tabla_empleado.setModel(Empleado);
            } catch(SQLException ex){
            Logger.getLogger(frm_main.class.getName()).log(Level.SEVERE,null,ex);
            JOptionPane.showMessageDialog(null, "error "+ex);
          }
            
        }


 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelazul = new javax.swing.JPanel();
        panel_blanco = new javax.swing.JPanel();
        lbl_logo = new javax.swing.JLabel();
        lbl_empleado = new javax.swing.JLabel();
        lbl_cedula = new javax.swing.JLabel();
        txt_cedula = new javax.swing.JTextField();
        lbl_nombre = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        lbl_apellido = new javax.swing.JLabel();
        txt_apellido = new javax.swing.JTextField();
        lbl_direccion = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JTextField();
        lbl_telefono = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        lbl_tnumemergencia = new javax.swing.JLabel();
        txt_numeroemergencia = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_empleado = new javax.swing.JTable();
        btn_guardar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_borrar = new javax.swing.JButton();
        btn_imprimir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EMPLEADO");
        setResizable(false);

        panelazul.setBackground(new java.awt.Color(10, 73, 123));

        panel_blanco.setBackground(new java.awt.Color(255, 255, 255));

        lbl_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo nicadom.png"))); // NOI18N
        lbl_logo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Main(evt);
            }
        });

        lbl_empleado.setFont(new java.awt.Font("Corbel", 0, 36)); // NOI18N
        lbl_empleado.setForeground(new java.awt.Color(10, 73, 123));
        lbl_empleado.setText("CONTROL EMPLEADO");

        lbl_cedula.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        lbl_cedula.setText("Cédula");

        lbl_nombre.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        lbl_nombre.setText("Nombre");

        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Busqueda(evt);
            }
        });

        lbl_apellido.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        lbl_apellido.setText("Apellido");

        lbl_direccion.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        lbl_direccion.setText("Dirección");

        lbl_telefono.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        lbl_telefono.setText("Teléfono");

        lbl_tnumemergencia.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        lbl_tnumemergencia.setText("Número de emergencia");

        tabla_empleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabla_empleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Rellenar(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_empleado);

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

        btn_imprimir.setText("IMPRIMIR");
        btn_imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_imprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_blancoLayout = new javax.swing.GroupLayout(panel_blanco);
        panel_blanco.setLayout(panel_blancoLayout);
        panel_blancoLayout.setHorizontalGroup(
            panel_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_blancoLayout.createSequentialGroup()
                .addGroup(panel_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_blancoLayout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addGroup(panel_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_blancoLayout.createSequentialGroup()
                                .addComponent(lbl_apellido)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_blancoLayout.createSequentialGroup()
                                .addComponent(lbl_nombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_nombre))))
                    .addGroup(panel_blancoLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(lbl_direccion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_blancoLayout.createSequentialGroup()
                        .addGroup(panel_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_blancoLayout.createSequentialGroup()
                                .addGap(148, 148, 148)
                                .addComponent(lbl_telefono))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_blancoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbl_tnumemergencia)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_guardar)
                            .addComponent(txt_numeroemergencia, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_blancoLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lbl_logo))
                    .addGroup(panel_blancoLayout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(lbl_cedula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(panel_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_blancoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110))
                    .addGroup(panel_blancoLayout.createSequentialGroup()
                        .addGroup(panel_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_blancoLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(lbl_empleado))
                            .addGroup(panel_blancoLayout.createSequentialGroup()
                                .addComponent(btn_modificar)
                                .addGap(137, 137, 137)
                                .addComponent(btn_borrar)
                                .addGap(146, 146, 146)
                                .addComponent(btn_imprimir)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panel_blancoLayout.setVerticalGroup(
            panel_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_blancoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panel_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_blancoLayout.createSequentialGroup()
                        .addComponent(lbl_logo)
                        .addGap(32, 32, 32)
                        .addGroup(panel_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_cedula))
                        .addGap(18, 18, 18)
                        .addGroup(panel_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_nombre)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_apellido)
                            .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_direccion)
                            .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_telefono)
                            .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_numeroemergencia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_tnumemergencia)))
                    .addGroup(panel_blancoLayout.createSequentialGroup()
                        .addComponent(lbl_empleado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addGroup(panel_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guardar)
                    .addComponent(btn_modificar)
                    .addComponent(btn_borrar)
                    .addComponent(btn_imprimir))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout panelazulLayout = new javax.swing.GroupLayout(panelazul);
        panelazul.setLayout(panelazulLayout);
        panelazulLayout.setHorizontalGroup(
            panelazulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelazulLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panel_blanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelazulLayout.setVerticalGroup(
            panelazulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelazulLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel_blanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelazul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelazul, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Botón para guardar un registro en la tabla
    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
     
       String cedula = txt_cedula.getText();
       String nombre = txt_nombre.getText();
       String apellido = txt_apellido.getText();
       String direccion = txt_direccion.getText();
       String telefono = txt_telefono.getText();
       String numeroemergencia = txt_numeroemergencia.getText();
        
        PreparedStatement ps;
        String query = "INSERT INTO `empleado`(`cedula`,`nombre`,`apellido`,`direccion`,`telefono`,`num_emergencia`) VALUES (?,?,?,?,?,?)";
        
       
        
        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            
            ps.setString(1, cedula);
            ps.setString(2, nombre);
            ps.setString(3, apellido);
            ps.setString(4, direccion);
            ps.setString(5, telefono);
            ps.setString(6, numeroemergencia);
            
             if("".equals(txt_nombre.getText()) || "".equals(txt_apellido.getText()) || "".equals(txt_cedula.getText()) || "".equals(txt_telefono.getText())) {
            JOptionPane.showMessageDialog(null, "El campo vacío es requerido");
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

    // Botón para imprimir un reporte 
    private void btn_imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_imprimirActionPerformed
        
        
        Connection cn=MyConnection.getConnection();
        
        try{
          JasperReport jr = (JasperReport) JRLoader.loadObject(frm_cliente.class.getResource("/Reporte/Empleado.jasper"));
          Map parametros = new HashMap<>();
          parametros.put("Titulo", "Reporte empleado");
            

          JasperPrint jp = JasperFillManager.fillReport(jr, parametros, cn);
          JasperViewer jv = new JasperViewer(jp, false);
          jv.setVisible(true); 
        }
        
        catch (JRException ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
        }
    }//GEN-LAST:event_btn_imprimirActionPerformed

    // Función que al darle click redirija al main
    private void Main(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Main

        frm_main mf = new frm_main();
        mf.setVisible(true);
        mf.pack();
        mf.setLocationRelativeTo(null);
        this.dispose();




    }//GEN-LAST:event_Main

    // Función que busca un empleado por el nombre
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

    // Función que al darle clikk
    private void Rellenar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Rellenar
    
         try {  
        String cedula = (String) Empleado.getValueAt(tabla_empleado.getSelectedRow(),1);
        String nombre = (String) Empleado.getValueAt(tabla_empleado.getSelectedRow(),2);
        String apellido = (String) Empleado.getValueAt(tabla_empleado.getSelectedRow(),3);
        String direccion = (String) Empleado.getValueAt(tabla_empleado.getSelectedRow(),4);
        String telefono = (String) Empleado.getValueAt(tabla_empleado.getSelectedRow(),5);
        String num_em = (String) Empleado.getValueAt(tabla_empleado.getSelectedRow(),6);


        txt_cedula.setText(cedula);
        txt_nombre.setText(nombre);
        txt_apellido.setText(apellido);
        txt_telefono.setText(telefono);
        txt_direccion.setText(direccion);
        txt_numeroemergencia.setText(num_em);
        }
        catch (Exception ex){
        JOptionPane.showMessageDialog(null, "error "+ex);
        } 
    }//GEN-LAST:event_Rellenar

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
       
        String cod_empleado = (String)Empleado.getValueAt(tabla_empleado.getSelectedRow(),0);
        String cedula = txt_cedula.getText();
        String nombre = txt_nombre.getText();
        String apellido = txt_apellido.getText();
        String telefono = txt_telefono.getText();
        String direccion = txt_direccion.getText();
        String num_em = txt_numeroemergencia.getText();
        
        
        PreparedStatement ps;
        String query = "UPDATE empleado SET cedula=?, nombre=?, apellido=?, direccion=?, telefono=?, num_emergencia=? WHERE cod_emp=?";
        try {
            if("".equals(txt_nombre.getText()) || "".equals(txt_apellido.getText()) || "".equals(txt_cedula.getText()) || "".equals(txt_telefono.getText())) {
            JOptionPane.showMessageDialog(null, "El campo vacío es requerido"); 
            } else {
                
            ps = MyConnection.getConnection().prepareStatement(query);
            
            ps.setString(7, cod_empleado);
            ps.setString(1, cedula);
            ps.setString(2, nombre);
            ps.setString(3, apellido);
            ps.setString(4, telefono);
            ps.setString(5, direccion);
            ps.setString(6, num_em);
         

            ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Empleado modificado");
                Limpiar();
                Mostrardatos("");
                }
                
        } catch (SQLException ex) {
            Logger.getLogger(frm_main.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error "+ex);
            }
        
        
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarActionPerformed
       
        String id = (String)Empleado.getValueAt(tabla_empleado.getSelectedRow(),0);
        
        
        PreparedStatement ps;
        String query = "DELETE FROM empleado WHERE cod_emp=?";
        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            
            ps.setString(1, id);

                if(ps.executeUpdate() > 0)
            {
              
                JOptionPane.showMessageDialog(null, "Empleado eliminado");
                Limpiar();
                Mostrardatos("");
            }
                
        } catch (SQLException ex) {
            Logger.getLogger(frm_main.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error "+ex);
            }
    }//GEN-LAST:event_btn_borrarActionPerformed

  
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_empleado().setVisible(true);
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
    private javax.swing.JLabel lbl_cedula;
    private javax.swing.JLabel lbl_direccion;
    private javax.swing.JLabel lbl_empleado;
    private javax.swing.JLabel lbl_logo;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_telefono;
    private javax.swing.JLabel lbl_tnumemergencia;
    private javax.swing.JPanel panel_blanco;
    private javax.swing.JPanel panelazul;
    private javax.swing.JTable tabla_empleado;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_numeroemergencia;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
