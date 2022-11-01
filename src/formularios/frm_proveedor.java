package formularios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class frm_proveedor extends javax.swing.JFrame {

    DefaultTableModel Proveedor;
 
    public frm_proveedor() {
        initComponents();
        
        this.Proveedor = (DefaultTableModel) tabla_proveedor.getModel();
        Mostrardatos("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        panel_blanco = new javax.swing.JPanel();
        panel_azul = new javax.swing.JPanel();
        panel_azul1 = new javax.swing.JPanel();
        lbl_proveedor = new javax.swing.JLabel();
        lbl_logo = new javax.swing.JLabel();
        lbl_cedula = new javax.swing.JLabel();
        txt_cedprov = new javax.swing.JTextField();
        lbl_rnc = new javax.swing.JLabel();
        txt_rnc = new javax.swing.JTextField();
        lbl_nombre = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        lbl_apellido = new javax.swing.JLabel();
        txt_apellido = new javax.swing.JTextField();
        lbl_telefono = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        lbl_direccion = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_proveedor = new javax.swing.JTable();
        btn_guardar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_borrar = new javax.swing.JButton();
        btn_imprimir = new javax.swing.JButton();

        jLabel2.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel2.setText("Nombre");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_blanco.setBackground(new java.awt.Color(255, 255, 255));
        panel_blanco.setToolTipText("");

        panel_azul.setBackground(new java.awt.Color(10, 73, 123));

        javax.swing.GroupLayout panel_azulLayout = new javax.swing.GroupLayout(panel_azul);
        panel_azul.setLayout(panel_azulLayout);
        panel_azulLayout.setHorizontalGroup(
            panel_azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel_azulLayout.setVerticalGroup(
            panel_azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        panel_azul1.setBackground(new java.awt.Color(10, 73, 123));

        javax.swing.GroupLayout panel_azul1Layout = new javax.swing.GroupLayout(panel_azul1);
        panel_azul1.setLayout(panel_azul1Layout);
        panel_azul1Layout.setHorizontalGroup(
            panel_azul1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel_azul1Layout.setVerticalGroup(
            panel_azul1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        lbl_proveedor.setFont(new java.awt.Font("Corbel", 0, 36)); // NOI18N
        lbl_proveedor.setForeground(new java.awt.Color(10, 73, 123));
        lbl_proveedor.setText("CONTROL PROVEEDOR");

        lbl_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo nicadom.png"))); // NOI18N
        lbl_logo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Main(evt);
            }
        });

        lbl_cedula.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        lbl_cedula.setText("Cédula");

        lbl_rnc.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        lbl_rnc.setText("RNC");

        lbl_nombre.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        lbl_nombre.setText("Nombre");

        lbl_apellido.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        lbl_apellido.setText("Apellido");

        lbl_telefono.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        lbl_telefono.setText("Teléfono");

        lbl_direccion.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        lbl_direccion.setText("Dirección");

        tabla_proveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabla_proveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Rellenar(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_proveedor);

        btn_guardar.setText("GUARDAR");
        btn_guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_guardarMouseClicked(evt);
            }
        });

        btn_modificar.setText("MODIFICAR");
        btn_modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_modificarMouseClicked(evt);
            }
        });

        btn_borrar.setText("BORRAR");
        btn_borrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_borrarMouseClicked(evt);
            }
        });

        btn_imprimir.setText("IMPRIMIR");

        javax.swing.GroupLayout panel_blancoLayout = new javax.swing.GroupLayout(panel_blanco);
        panel_blanco.setLayout(panel_blancoLayout);
        panel_blancoLayout.setHorizontalGroup(
            panel_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_azul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_azul1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel_blancoLayout.createSequentialGroup()
                .addGroup(panel_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_blancoLayout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addGroup(panel_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_blancoLayout.createSequentialGroup()
                                .addComponent(lbl_direccion)
                                .addGap(18, 18, 18)
                                .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(panel_blancoLayout.createSequentialGroup()
                                    .addComponent(lbl_apellido)
                                    .addGap(18, 18, 18)
                                    .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel_blancoLayout.createSequentialGroup()
                                    .addGroup(panel_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lbl_nombre)
                                        .addGroup(panel_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbl_cedula)
                                            .addComponent(lbl_rnc)))
                                    .addGap(21, 21, 21)
                                    .addGroup(panel_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt_cedprov)
                                        .addComponent(txt_rnc)
                                        .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(panel_blancoLayout.createSequentialGroup()
                                    .addComponent(lbl_telefono)
                                    .addGap(18, 18, 18)
                                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(102, 102, 102)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_blancoLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lbl_logo)
                        .addGap(216, 216, 216)
                        .addComponent(lbl_proveedor)))
                .addContainerGap(153, Short.MAX_VALUE))
            .addGroup(panel_blancoLayout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(btn_guardar)
                .addGap(132, 132, 132)
                .addComponent(btn_modificar)
                .addGap(184, 184, 184)
                .addComponent(btn_borrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_imprimir)
                .addGap(99, 99, 99))
        );
        panel_blancoLayout.setVerticalGroup(
            panel_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_blancoLayout.createSequentialGroup()
                .addComponent(panel_azul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panel_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_blancoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_logo))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_blancoLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lbl_proveedor)
                        .addGroup(panel_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_blancoLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_blancoLayout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(panel_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_cedula)
                                    .addComponent(txt_cedprov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panel_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_rnc)
                                    .addComponent(txt_rnc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panel_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_nombre)
                                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(panel_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_apellido)
                                    .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(panel_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_telefono)
                                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(panel_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_direccion)
                                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGroup(panel_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_blancoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_guardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(panel_blancoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panel_blancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_modificar)
                            .addComponent(btn_borrar)
                            .addComponent(btn_imprimir))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)))
                .addComponent(panel_azul1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_blanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_blanco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Imagen que lleva al main
    private void Main(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Main

        frm_main mf = new frm_main();
        mf.setVisible(true);
        mf.pack();
        mf.setLocationRelativeTo(null);
        this.dispose(); 
    }//GEN-LAST:event_Main

    // Botón para guardar registro
    private void btn_guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_guardarMouseClicked

               String cedula = txt_cedprov.getText();
       String rnc = txt_rnc.getText();
       String nombre = txt_nombre.getText();
       String apellido = txt_apellido.getText();
       String direccion = txt_direccion.getText();
       String telefono = txt_telefono.getText();
   
        
        PreparedStatement ps;
        String query = "INSERT INTO `proveedor`(`cedula`,`rnc`,`nombre`,`apellido`,`direccion`,`telefono`) VALUES (?,?,?,?,?,?)";
        
       
        
        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            
            ps.setString(1, cedula);
            ps.setString(2, rnc);
            ps.setString(3, nombre);
            ps.setString(4, apellido);
            ps.setString(5, direccion);
            ps.setString(6, telefono);
            
             if("".equals(txt_nombre.getText()) || "".equals(txt_apellido.getText()) || "".equals(txt_cedprov.getText()) || "".equals(txt_telefono.getText()) || "".equals(txt_rnc.getText())  ) {
            JOptionPane.showMessageDialog(null, "El campo vacío es requerido");
        } else {
                 
             
            if(ps.executeUpdate() > 0)
            {
                JOptionPane.showMessageDialog(null, "Proveedor agregado");
                Limpiar();
                Mostrardatos("");
                  
            }
            
          }
        } catch (SQLException ex) {
            Logger.getLogger(frm_mensaje.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error "+ex);     
       }    
    }//GEN-LAST:event_btn_guardarMouseClicked

    // Botón para borrar un registro
    private void btn_borrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_borrarMouseClicked
      
       String id = (String)Proveedor.getValueAt(tabla_proveedor.getSelectedRow(),0);
        
        
        PreparedStatement ps;
        String query = "DELETE FROM proveedor WHERE cod_proveedor=?";
        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            
            ps.setString(1, id);

                if(ps.executeUpdate() > 0)
            {
              
                JOptionPane.showMessageDialog(null, "Proveedor eliminado");
                Limpiar();
                Mostrardatos("");
            }
                
        } catch (SQLException ex) {
            Logger.getLogger(frm_main.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error "+ex);
            }
    
        
    }//GEN-LAST:event_btn_borrarMouseClicked

    private void btn_modificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_modificarMouseClicked
 
        String cod_proveedor = (String)Proveedor.getValueAt(tabla_proveedor.getSelectedRow(),0);
        String rnc = txt_rnc.getText();
        String cedula = txt_cedprov.getText();
        String nombre = txt_nombre.getText();
        String apellido = txt_apellido.getText();
        String telefono = txt_telefono.getText();
        String direccion = txt_direccion.getText();
        
        
        PreparedStatement ps;
        String query = "UPDATE proveedor SET cedula=?, rnc=?, nombre=?, apellido=?, telefono=?, direccion=? WHERE cod_proveedor=?";
        try {
            if("".equals(txt_nombre.getText()) || "".equals(txt_apellido.getText()) || "".equals(txt_cedprov.getText()) || "".equals(txt_telefono.getText())) {
            JOptionPane.showMessageDialog(null, "El campo vacío es requerido"); 
            } else {
                
            ps = MyConnection.getConnection().prepareStatement(query);
            
            ps.setString(7, cod_proveedor);
            ps.setString(1, cedula);
            ps.setString(2, rnc);
            ps.setString(3, nombre);
            ps.setString(4, apellido);
            ps.setString(5, telefono);
            ps.setString(6, direccion);
         

            ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Producto modificado");
                Limpiar();
                Mostrardatos("");
                }
                
        } catch (SQLException ex) {
            Logger.getLogger(frm_main.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error "+ex);
            }
    }//GEN-LAST:event_btn_modificarMouseClicked

    private void Rellenar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Rellenar
       
        try {  
        String cedula = (String) Proveedor.getValueAt(tabla_proveedor.getSelectedRow(),1);
        String rnc = (String) Proveedor.getValueAt(tabla_proveedor.getSelectedRow(),2);
        String nombre = (String) Proveedor.getValueAt(tabla_proveedor.getSelectedRow(),3);
        String apellido = (String) Proveedor.getValueAt(tabla_proveedor.getSelectedRow(),4);
        String telefono = (String) Proveedor.getValueAt(tabla_proveedor.getSelectedRow(),5);
        String direccion = (String) Proveedor.getValueAt(tabla_proveedor.getSelectedRow(),6);


        txt_cedprov.setText(cedula);
        txt_nombre.setText(nombre);
        txt_apellido.setText(apellido);
        txt_telefono.setText(telefono);
        txt_rnc.setText(rnc);
        txt_direccion.setText(direccion);
        }
        catch (Exception ex){
        JOptionPane.showMessageDialog(null, "error "+ex);
        } 
  
    }//GEN-LAST:event_Rellenar

        // Función que limpia los textfield
    public void Limpiar() {
      
       try {
           txt_nombre.setText(" ");
           txt_apellido.setText(" ");
           txt_direccion.setText(" ");
           txt_telefono.setText(" ");
      
       }
       catch (Exception ex) {
             JOptionPane.showMessageDialog(null, "error "+ex);
       }   
   }
    
      public void RefrescarTabla(){
        //Funcion encargada de Refrescar la tabla utilizando Revalidate
        try {
        Proveedor.setColumnCount(0);
        Proveedor.setRowCount(0);
        tabla_proveedor.revalidate();
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
            Proveedor.addColumn("Código proveedor");
            Proveedor.addColumn("Cédula");
            Proveedor.addColumn("RNC");
            Proveedor.addColumn("Nombre");
            Proveedor.addColumn("Apellido");
            Proveedor.addColumn("Teléfono");
            Proveedor.addColumn("Dirección");
            
    
            this.tabla_proveedor.setModel(Proveedor);
            String sql;
            if (valor.equals(""))
            {
            sql="SELECT * FROM proveedor";
            }
            else{
            sql="SELECT * FROM proveedor WHERE nombre='"+valor+"'";
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

            Proveedor.addRow(datos);
            }
            tabla_proveedor.setModel(Proveedor);
            } catch(SQLException ex){
            Logger.getLogger(frm_main.class.getName()).log(Level.SEVERE,null,ex);
            JOptionPane.showMessageDialog(null, "error "+ex);
          } 
        }
            
 
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_proveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_borrar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_imprimir;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_apellido;
    private javax.swing.JLabel lbl_cedula;
    private javax.swing.JLabel lbl_direccion;
    private javax.swing.JLabel lbl_logo;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_proveedor;
    private javax.swing.JLabel lbl_rnc;
    private javax.swing.JLabel lbl_telefono;
    private javax.swing.JPanel panel_azul;
    private javax.swing.JPanel panel_azul1;
    private javax.swing.JPanel panel_blanco;
    private javax.swing.JTable tabla_proveedor;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_cedprov;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_rnc;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
