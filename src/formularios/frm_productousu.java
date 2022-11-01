
package formularios;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frm_productousu extends javax.swing.JFrame {

    DefaultTableModel Producto;
    
    public frm_productousu() {
        initComponents();
        
        this.Producto = (DefaultTableModel) tabla_productos.getModel();
        Mostrardatos("");
    }

        public void RefrescarTabla(){
        //Funcion encargada de Refrescar la tabla utilizando Revalidate
        try {
        Producto.setColumnCount(0);
        Producto.setRowCount(0);
        tabla_productos.revalidate();
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

            this.tabla_productos.setModel(Producto);
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
            tabla_productos.setModel(Producto);
            } catch(SQLException ex){
            Logger.getLogger(frm_main.class.getName()).log(Level.SEVERE,null,ex);
            JOptionPane.showMessageDialog(null, "error "+ex);
          }
            
        }  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_productos = new javax.swing.JLabel();
        lbl_texto = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_productos = new javax.swing.JTable();
        btn_añadir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        lbl_productos.setFont(new java.awt.Font("Corbel", 0, 30)); // NOI18N
        lbl_productos.setForeground(new java.awt.Color(10, 73, 123));
        lbl_productos.setText("PRODUCTOS");

        lbl_texto.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        lbl_texto.setText("Buscar producto por el nombre");

        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Busqueda(evt);
            }
        });

        tabla_productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla_productos);

        btn_añadir.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        btn_añadir.setText("AÑADIR");
        btn_añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_añadirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(lbl_productos))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_texto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btn_añadir)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lbl_productos)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_texto)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_añadir)
                        .addGap(218, 218, 218))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void btn_añadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_añadirActionPerformed
        
                if(tabla_productos.getSelectedRow()>=0){
            
            try {
                DefaultTableModel tp = (DefaultTableModel) tabla_productos.getModel();
                
                String cant = String.valueOf(tp.getValueAt(tabla_productos.getSelectedRow(),8));
                int cantidad = Integer.parseInt(cant);
                
                if(cantidad <= 0) {
                    JOptionPane.showMessageDialog(null, "El producto no tiene suficiente stock");
                    
                }  else if(cantidad<=5) {     
                        
                        JOptionPane.showMessageDialog(null, "Quedan pocas unidades de este producto");
                        
                        String id = String.valueOf(tp.getValueAt(tabla_productos.getSelectedRow(),0));
                        String nombre = String.valueOf(tp.getValueAt(tabla_productos.getSelectedRow(),1));
                        String precio = String.valueOf(tp.getValueAt(tabla_productos.getSelectedRow(),3));

                        frm_mainusuario.txt_codprod.setText(id);
                        frm_mainusuario.txt_nombreprod.setText(nombre);
                        frm_mainusuario.txt_precioprod.setText(precio);
                        this.dispose();
              
                }  else {
                    
                        String id = String.valueOf(tp.getValueAt(tabla_productos.getSelectedRow(),0));
                        String nombre = String.valueOf(tp.getValueAt(tabla_productos.getSelectedRow(),1));
                        String precio = String.valueOf(tp.getValueAt(tabla_productos.getSelectedRow(),3));

                        frm_mainusuario.txt_codprod.setText(id);
                        frm_mainusuario.txt_nombreprod.setText(nombre);
                        frm_mainusuario.txt_precioprod.setText(precio);
                        this.dispose();
                    
                               
                    }
                
            } catch(Exception e) {
                
            }
            
        }
        
        else {
            JOptionPane.showMessageDialog(this, "Seleccione un producto");
            
        }
            
    }//GEN-LAST:event_btn_añadirActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_productousu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_añadir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_productos;
    private javax.swing.JLabel lbl_texto;
    private javax.swing.JTable tabla_productos;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
