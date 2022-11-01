
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

public class frm_clienteusu extends javax.swing.JFrame {
    
    DefaultTableModel Cliente;

    public frm_clienteusu() {
        initComponents();
        
        this.Cliente = (DefaultTableModel) tabla_clientes.getModel();
        Mostrardatos("");
    }

        public void RefrescarTabla(){
        //Funcion encargada de Refrescar la tabla utilizando Revalidate
        try {
        Cliente.setColumnCount(0);
        Cliente.setRowCount(0);
        tabla_clientes.revalidate();
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

            this.tabla_clientes.setModel(Cliente);
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
            tabla_clientes.setModel(Cliente);
            } catch(SQLException ex){
            Logger.getLogger(frm_main.class.getName()).log(Level.SEVERE,null,ex);
            JOptionPane.showMessageDialog(null, "error "+ex);
          }
            
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_clientes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_clientes = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        btn_añadir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        lbl_clientes.setFont(new java.awt.Font("Corbel", 0, 36)); // NOI18N
        lbl_clientes.setForeground(new java.awt.Color(0, 73, 123));
        lbl_clientes.setText("CLIENTES");

        tabla_clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla_clientes);

        jLabel2.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel2.setText("Buscar cliente por el nombre");

        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Busqueda(evt);
            }
        });

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(148, 148, 148)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addComponent(lbl_clientes))))
                .addGap(33, 33, 33)
                .addComponent(btn_añadir)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lbl_clientes)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(58, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_añadir)
                        .addGap(264, 264, 264))))
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
       
        if(tabla_clientes.getSelectedRow()>=0){
            
            try {
                DefaultTableModel tc = (DefaultTableModel) tabla_clientes.getModel();
                
                String cod_cliente = String.valueOf(tc.getValueAt(tabla_clientes.getSelectedRow(),0));
                String cedula = String.valueOf(tc.getValueAt(tabla_clientes.getSelectedRow(),1));
                String rnc = String.valueOf(tc.getValueAt(tabla_clientes.getSelectedRow(),2));
                String nombre = String.valueOf(tc.getValueAt(tabla_clientes.getSelectedRow(),3));
                String apellido = String.valueOf(tc.getValueAt(tabla_clientes.getSelectedRow(),4));
               
                frm_mainusuario.txt_codcli.setText(cod_cliente);
                frm_mainusuario.txt_cedcli.setText(cedula);
                frm_mainusuario.txt_rnc.setText(rnc);
                frm_mainusuario.txt_nomcli.setText(nombre);
                frm_mainusuario.txt_apellido.setText(apellido);
                
                this.dispose();
                
            } catch(Exception e) {
                
            }
            
        }
        
        else {
            JOptionPane.showMessageDialog(this, "Seleccione un cliente");
            
        }
    }//GEN-LAST:event_btn_añadirActionPerformed

  
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_clienteusu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_añadir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_clientes;
    private javax.swing.JTable tabla_clientes;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
