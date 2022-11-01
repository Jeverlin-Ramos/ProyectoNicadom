
package formularios;

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

public class frm_venta extends javax.swing.JFrame {
    
    DefaultTableModel Venta;

    public frm_venta() {
        initComponents();
        this.Venta = (DefaultTableModel)tbl_venta.getModel();
        Mostrardatos("");
    }

           public void RefrescarTabla(){
        //Funcion encargada de Refrescar la tabla utilizando Revalidate
        try {
        Venta.setColumnCount(0);
        Venta.setRowCount(0);
        tbl_venta.revalidate();
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
            Venta.addColumn("Código");
            Venta.addColumn("Nombre");
            Venta.addColumn("Cantidad producto");
 
  

            this.tbl_venta.setModel(Venta);
            String sql;
            if (valor.equals(""))
            {
            sql="SELECT * FROM inventarios";
            }
            else{
            sql="SELECT * FROM inventarios WHERE nombre='"+valor+"'";
            } 

            String []datos=new String [3];
            try{
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            while(rs.next()){
            datos[0]=rs.getString(1);
            datos[1]=rs.getString(2);
            datos[2]=rs.getString(3);
//            datos[3]=rs.getString(4);
//            
//            datos[4]=rs.getString(5);
//            datos[5]=rs.getString(6);

            Venta.addRow(datos);
            }
            tbl_venta.setModel(Venta);
            } catch(SQLException ex){
            Logger.getLogger(frm_main.class.getName()).log(Level.SEVERE,null,ex);
            JOptionPane.showMessageDialog(null, "error "+ex);
          }
            
        }  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_venta = new javax.swing.JLabel();
        lbl_producto = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        lbl_cantv = new javax.swing.JLabel();
        txt_cantv = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_venta = new javax.swing.JTable();
        btn_vender = new javax.swing.JButton();
        lbl_cantT = new javax.swing.JLabel();
        txt_cantT = new javax.swing.JTextField();
        btn_reporte = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_venta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_venta.setText("VENTA");

        lbl_producto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_producto.setText("Nombre");

        lbl_cantv.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_cantv.setText("Cantidad productos vendidos");

        tbl_venta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_venta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Rellenar(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_venta);

        btn_vender.setText("VENDER");
        btn_vender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_venderActionPerformed(evt);
            }
        });

        lbl_cantT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_cantT.setText("Cantidad total");

        btn_reporte.setText("REPORTE");
        btn_reporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(329, 329, 329)
                .addComponent(lbl_venta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_vender)
                        .addGap(139, 139, 139))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_producto)
                                    .addComponent(lbl_cantv))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_nombre)
                                    .addComponent(txt_cantv, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_cantT)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_cantT, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_reporte)
                .addGap(126, 126, 126))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lbl_venta)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_producto)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_cantT)
                            .addComponent(txt_cantT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_cantv)
                            .addComponent(txt_cantv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addComponent(btn_vender))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(btn_reporte)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Rellenar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Rellenar
    
            
          try {  
        String nombre = (String) Venta.getValueAt(tbl_venta.getSelectedRow(),1);
        String cantT = (String) Venta.getValueAt(tbl_venta.getSelectedRow(),2);



        txt_nombre.setText(nombre);
        txt_cantT.setText(cantT);

        }
        catch (Exception ex){
        JOptionPane.showMessageDialog(null, "error "+ex);
        }
    }//GEN-LAST:event_Rellenar

    private void btn_venderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_venderActionPerformed
        
        String cod_producto = (String)Venta.getValueAt(tbl_venta.getSelectedRow(),0);
        String nombre = txt_nombre.getText();
        String cantv = txt_cantv.getText();
        String canttotal = txt_cantT.getText();
        
        
        int cant_v = Integer.parseInt(cantv);
        int cant_total = Integer.parseInt(canttotal);
        
      
        int cant_A = cant_total - cant_v;
        
        String cantA = String.valueOf(cant_A);
        
        PreparedStatement ps;
        String query = "UPDATE inventarios SET nombre=?, cantprod=? WHERE id=?";
        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            
            ps.setString(3, cod_producto);
            ps.setString(1, nombre);
            ps.setString(2, cantA);
            
            ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Venta realizada");
                Mostrardatos("");
                
        } catch (SQLException ex) {
            Logger.getLogger(frm_main.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error "+ex);
            }
    }//GEN-LAST:event_btn_venderActionPerformed

    private void btn_reporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reporteActionPerformed
       
        Connection cn=MyConnection.getConnection();
        
        try{
          JasperReport jr = (JasperReport) JRLoader.loadObject(frm_cliente.class.getResource("/Evaluacion3/Venta.jasper"));
          Map parametros = new HashMap<>();
          parametros.put("Titulo", "Reporte productos");
            

          JasperPrint jp = JasperFillManager.fillReport(jr, parametros, cn);
          JasperViewer jv = new JasperViewer(jp, false);
          jv.setVisible(true); 
        }
        
        catch (JRException ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
        }
        
        
    }//GEN-LAST:event_btn_reporteActionPerformed

    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_venta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_reporte;
    private javax.swing.JButton btn_vender;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_cantT;
    private javax.swing.JLabel lbl_cantv;
    private javax.swing.JLabel lbl_producto;
    private javax.swing.JLabel lbl_venta;
    private javax.swing.JTable tbl_venta;
    private javax.swing.JTextField txt_cantT;
    private javax.swing.JTextField txt_cantv;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
