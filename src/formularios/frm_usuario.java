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


public class frm_usuario extends javax.swing.JFrame {

    
    DefaultTableModel Usuario;
  
    public frm_usuario() {
        initComponents();
        
        this.Usuario = (DefaultTableModel) tabla_usuario.getModel();
        
         Mostrardatos("");
        
    }

       // Función para limpiar los textfield
       public void Limpiar() {
      
       try {
           txt_usuario.setText("");
           txt_nombre.setText("");
           txtp_contraseña.setText("");
           txt_correo.setText("");
           cmb_Rol.setSelectedIndex(0);
          
       }
       catch (Exception ex) {
             JOptionPane.showMessageDialog(null, "error "+ex);
       }   
   }
       
       public void RefrescarTabla(){
        //Funcion encargada de Refrescar la tabla utilizando Revalidate
        try {
        Usuario.setColumnCount(0);
        Usuario.setRowCount(0);
        tabla_usuario.revalidate();
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
            Usuario.addColumn("Código usuario");
            Usuario.addColumn("Usuario");
            Usuario.addColumn("Nombre");
            Usuario.addColumn("Contraseña");
            Usuario.addColumn("Correo");
            Usuario.addColumn("Rol");
           

            this.tabla_usuario.setModel(Usuario);
            String sql;
            if (valor.equals(""))
            {
            sql="SELECT * FROM registros";
            }
            else{
            sql="SELECT * FROM registros WHERE nombre='"+valor+"'";
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
            datos[5]=rs.getString(6);

            Usuario.addRow(datos);
            }
            tabla_usuario.setModel(Usuario);
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
        lbl_usuario1 = new javax.swing.JLabel();
        lbl_usuario = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        lbl_contraseña = new javax.swing.JLabel();
        lbl_nombre = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        lbl_correo = new javax.swing.JLabel();
        txt_correo = new javax.swing.JTextField();
        lbl_rol = new javax.swing.JLabel();
        btn_añadir = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_borrar = new javax.swing.JButton();
        btn_imprimir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_usuario = new javax.swing.JTable();
        txtp_contraseña = new javax.swing.JPasswordField();
        cmb_Rol = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("USUARIO");
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

        lbl_usuario1.setFont(new java.awt.Font("Corbel", 0, 36)); // NOI18N
        lbl_usuario1.setForeground(new java.awt.Color(10, 73, 123));
        lbl_usuario1.setText("CONTROL USUARIO");

        lbl_usuario.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        lbl_usuario.setText("Usuario");

        txt_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Busqueda(evt);
            }
        });

        lbl_contraseña.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        lbl_contraseña.setText("Contraseña");

        lbl_nombre.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        lbl_nombre.setText("Nombre");

        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Busqueda(evt);
            }
        });

        lbl_correo.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        lbl_correo.setText("Correo");

        lbl_rol.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        lbl_rol.setText("Rol");

        btn_añadir.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        btn_añadir.setText("GUARDAR");
        btn_añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_añadirActionPerformed(evt);
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

        tabla_usuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabla_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Rellenar(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_usuario);

        cmb_Rol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1" }));

        javax.swing.GroupLayout panelblancoLayout = new javax.swing.GroupLayout(panelblanco);
        panelblanco.setLayout(panelblancoLayout);
        panelblancoLayout.setHorizontalGroup(
            panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelazul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelazul2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelblancoLayout.createSequentialGroup()
                .addGroup(panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelblancoLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lbl_logo)
                        .addGap(197, 197, 197)
                        .addComponent(lbl_usuario1))
                    .addGroup(panelblancoLayout.createSequentialGroup()
                        .addGroup(panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelblancoLayout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addGroup(panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_contraseña)
                                    .addComponent(lbl_usuario)
                                    .addComponent(lbl_nombre))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(txt_nombre)
                                    .addComponent(txtp_contraseña)))
                            .addGroup(panelblancoLayout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addGroup(panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_rol)
                                    .addComponent(lbl_correo))
                                .addGroup(panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelblancoLayout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(btn_añadir)
                                        .addGap(64, 64, 64))
                                    .addGroup(panelblancoLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txt_correo)
                                            .addComponent(cmb_Rol, 0, 150, Short.MAX_VALUE))))))
                        .addGroup(panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelblancoLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(btn_modificar)
                                .addGap(83, 83, 83)
                                .addComponent(btn_borrar)
                                .addGap(59, 59, 59)
                                .addComponent(btn_imprimir))
                            .addGroup(panelblancoLayout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        panelblancoLayout.setVerticalGroup(
            panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelblancoLayout.createSequentialGroup()
                .addComponent(panelazul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelblancoLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(lbl_usuario1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(panelblancoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_logo)
                        .addGap(74, 74, 74)
                        .addGroup(panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_usuario)
                            .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_nombre)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_contraseña)
                            .addComponent(txtp_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_correo)
                            .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_rol)
                            .addComponent(cmb_Rol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_añadir)
                    .addComponent(btn_modificar)
                    .addComponent(btn_borrar)
                    .addComponent(btn_imprimir))
                .addGap(34, 34, 34)
                .addComponent(panelazul2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelblanco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelblanco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // Función para guardar un registro
    private void btn_añadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_añadirActionPerformed
        
       String usuario = txt_usuario.getText();
       String nombre = txt_nombre.getText();
       String contraseña = String.valueOf(txtp_contraseña.getPassword());
       String correo = txt_correo.getText();
       String rol = String.valueOf(cmb_Rol.getSelectedIndex());
        
        PreparedStatement ps;
        String query = "INSERT INTO `registros`(`usuario`,`nombre`,`contraseña`,`correo`,`rol`) VALUES (?,?,?,?,?)";
        
        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            
            ps.setString(1, usuario);
            ps.setString(2, nombre);
            ps.setString(3, contraseña);
            ps.setString(4, correo);
            ps.setString(5, rol);
            
            if("".equals(usuario) || "".equals(nombre) || "".equals(contraseña) || "".equals(correo) || "".equals(rol)) {
                JOptionPane.showMessageDialog(null, "Uno de los campos vacíos es requerido");   
            } else {
                
            if(ps.executeUpdate() > 0)
            {
                JOptionPane.showMessageDialog(null, "Usuario agregado");
                Limpiar();
                Mostrardatos("");
                 
            }
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(frm_mensaje.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error "+ex);
            
    }  
        
        
    }//GEN-LAST:event_btn_añadirActionPerformed

    // Función que al darle click a la imagen redirija al main
    private void Main(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Main
       
        frm_main mf = new frm_main();
        mf.setVisible(true);
        mf.pack();
        mf.setLocationRelativeTo(null);
        this.dispose();
        
    }//GEN-LAST:event_Main

    // Función para buscar un usuario por su nombre
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

    // Función que al darle click a la tabla se rellenen los textfield
    private void Rellenar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Rellenar
       
         try {  
        String usuario = (String) Usuario.getValueAt(tabla_usuario.getSelectedRow(),1);
        String nombre = (String) Usuario.getValueAt(tabla_usuario.getSelectedRow(),2);
        String contraseña = (String) Usuario.getValueAt(tabla_usuario.getSelectedRow(),3);
        String correo = (String) Usuario.getValueAt(tabla_usuario.getSelectedRow(),4);
        String rol = (String) Usuario.getValueAt(tabla_usuario.getSelectedRow(),5);


        txt_usuario.setText(usuario);
        txt_nombre.setText(nombre);
        txtp_contraseña.setText(contraseña);
        txt_correo.setText(correo);
        cmb_Rol.addItem(rol);
        }
        catch (Exception ex){
        JOptionPane.showMessageDialog(null, "error "+ex);
        }

        
    }//GEN-LAST:event_Rellenar

    // Botón para modificar un registro
    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
       
        String cod_usuario = (String)Usuario.getValueAt(tabla_usuario.getSelectedRow(),0);
        String usuario = txt_usuario.getText();
        String nombre = txt_nombre.getText();
        String contraseña = String.valueOf(txtp_contraseña.getPassword());
        String correo = txt_correo.getText();
        String rol = String.valueOf(cmb_Rol.getSelectedIndex());
        
       
        PreparedStatement ps;
        String query = "UPDATE registros SET usuario=?, nombre=?, contraseña=?, correo=?, rol=? WHERE id=?";
        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            
            ps.setString(6, cod_usuario);
            ps.setString(1, usuario);
            ps.setString(2, nombre);
            ps.setString(3, contraseña);
            ps.setString(4, correo);
            ps.setString(5, rol);
         
            if("".equals(usuario) || "".equals(nombre) || "".equals(contraseña) || "".equals(correo) || "".equals(rol)) {
               JOptionPane.showMessageDialog(null, "Uno de los campos vacíos es requerido");   
            } else {
            
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Usuario modificado");
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
     
        String id = (String)Usuario.getValueAt(tabla_usuario.getSelectedRow(),0);
        
        
        PreparedStatement ps;
        String query = "DELETE FROM registros WHERE id=?";
        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            
            ps.setString(1, id);

                if(ps.executeUpdate() > 0)
            {
              
                JOptionPane.showMessageDialog(null, "Usuario eliminado");
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
          JasperReport jr = (JasperReport) JRLoader.loadObject(frm_cliente.class.getResource("/Reporte/Usuarios.jasper"));
          Map parametros = new HashMap<>();
          parametros.put("Titulo", "Reporte usuario");
            

          JasperPrint jp = JasperFillManager.fillReport(jr, parametros, cn);
          JasperViewer jv = new JasperViewer(jp, false);
          jv.setVisible(true); 
        }
        
        catch (JRException ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
        }
    }//GEN-LAST:event_btn_imprimirActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_añadir;
    private javax.swing.JButton btn_borrar;
    private javax.swing.JButton btn_imprimir;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JComboBox<String> cmb_Rol;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_contraseña;
    private javax.swing.JLabel lbl_correo;
    private javax.swing.JLabel lbl_logo;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_rol;
    private javax.swing.JLabel lbl_usuario;
    private javax.swing.JLabel lbl_usuario1;
    private javax.swing.JPanel panelazul;
    private javax.swing.JPanel panelazul2;
    private javax.swing.JPanel panelblanco;
    private javax.swing.JTable tabla_usuario;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_usuario;
    private javax.swing.JPasswordField txtp_contraseña;
    // End of variables declaration//GEN-END:variables
}
