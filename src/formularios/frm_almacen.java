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


public class frm_almacen extends javax.swing.JFrame {
    
    DefaultTableModel Almacen;

  
    public frm_almacen() {
        initComponents();
        
        this.Almacen = (DefaultTableModel) tabla_almacen.getModel();
        Mostrardatos("");
    }
    
        public void RefrescarTabla(){
        //Funcion encargada de Refrescar la tabla utilizando Revalidate
        try {
        Almacen.setColumnCount(0);
        Almacen.setRowCount(0);
        tabla_almacen.revalidate();
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
            Almacen.addColumn("Código almacen");
            Almacen.addColumn("Código producto");
            Almacen.addColumn("Cantidad");
         

            this.tabla_almacen.setModel(Almacen);
            String sql;
            if (valor.equals(""))
            {
            sql="SELECT * FROM detalle_almacen";
            }
            else{
            sql="SELECT * FROM detalle_almacen WHERE cod_almacen='"+valor+"'";
            } 

            String []datos=new String [6];
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

            Almacen.addRow(datos);
            }
            tabla_almacen.setModel(Almacen);
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
        lbl_almacen = new javax.swing.JLabel();
        lbl_codprod = new javax.swing.JLabel();
        txt_codprod = new javax.swing.JTextField();
        lbl_cantprod = new javax.swing.JLabel();
        txt_cantprod = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_almacen = new javax.swing.JTable();
        btn_guardar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_imprimir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ALMACEN");
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
            .addGap(0, 38, Short.MAX_VALUE)
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
            .addGap(0, 38, Short.MAX_VALUE)
        );

        lbl_almacen.setBackground(new java.awt.Color(10, 73, 123));
        lbl_almacen.setFont(new java.awt.Font("Corbel", 0, 36)); // NOI18N
        lbl_almacen.setForeground(new java.awt.Color(10, 73, 123));
        lbl_almacen.setText("CONTROL ALMACÉN");

        lbl_codprod.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        lbl_codprod.setText("Código del producto");

        txt_codprod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Busqueda(evt);
            }
        });

        lbl_cantprod.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        lbl_cantprod.setText("Cantidad del producto");

        tabla_almacen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabla_almacen.getTableHeader().setReorderingAllowed(false);
        tabla_almacen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Rellenar(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_almacen);

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

        javax.swing.GroupLayout panelblancoLayout = new javax.swing.GroupLayout(panelblanco);
        panelblanco.setLayout(panelblancoLayout);
        panelblancoLayout.setHorizontalGroup(
            panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelazul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelazul1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelblancoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111))
            .addGroup(panelblancoLayout.createSequentialGroup()
                .addGroup(panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelblancoLayout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(btn_guardar)
                        .addGap(51, 51, 51)
                        .addComponent(btn_modificar)
                        .addGap(59, 59, 59)
                        .addComponent(btn_eliminar)
                        .addGap(50, 50, 50)
                        .addComponent(btn_imprimir))
                    .addGroup(panelblancoLayout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(lbl_codprod)
                        .addGap(18, 18, 18)
                        .addComponent(txt_codprod, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(lbl_cantprod)
                        .addGap(18, 18, 18)
                        .addComponent(txt_cantprod, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelblancoLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(lbl_logo)
                        .addGap(176, 176, 176)
                        .addComponent(lbl_almacen)))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        panelblancoLayout.setVerticalGroup(
            panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelblancoLayout.createSequentialGroup()
                .addComponent(panelazul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelblancoLayout.createSequentialGroup()
                        .addComponent(lbl_logo)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelblancoLayout.createSequentialGroup()
                        .addComponent(lbl_almacen)
                        .addGap(33, 33, 33)))
                .addGroup(panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_codprod)
                    .addComponent(txt_codprod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_cantprod)
                    .addComponent(txt_cantprod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(panelblancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guardar)
                    .addComponent(btn_modificar)
                    .addComponent(btn_eliminar)
                    .addComponent(btn_imprimir))
                .addGap(18, 18, 18)
                .addComponent(panelazul1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelblanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelblanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 
    // Función para limpiar los textfields
    public void Limpiar() {
      
       try {
           txt_codprod.setText(" ");
           txt_cantprod.setText(" ");
       }
       catch (Exception ex) {
             JOptionPane.showMessageDialog(null, "error "+ex);
       }   
   }
    
    //Botón para guardar un registro en la tabla
    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        
       String cod_producto = txt_codprod.getText();
       String cant_producto = txt_cantprod.getText();
       
        
        PreparedStatement ps;
        String query = "INSERT INTO `detalle_almacen`(`cod_producto`,`cant`) VALUES (?,?)";
        
        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            
            ps.setString(1, cod_producto);
            ps.setString(2, cant_producto);
        
            
            if(ps.executeUpdate() > 0)
            {
                JOptionPane.showMessageDialog(null, "Producto en el almacén agregado");
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
          JasperReport jr = (JasperReport) JRLoader.loadObject(frm_cliente.class.getResource("/Reporte/almacen.jasper"));
          Map parametros = new HashMap<>();
          parametros.put("Titulo", "Reporte almacen");
            

          JasperPrint jp = JasperFillManager.fillReport(jr, parametros, cn);
          JasperViewer jv = new JasperViewer(jp, false);
          jv.setVisible(true); 
        }
        
        catch (JRException ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
        }
        
        
        
    }//GEN-LAST:event_btn_imprimirActionPerformed

        
    // Función que al darle click al logo redirija al formulario principal
    private void Main(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Main
       
        frm_main mf = new frm_main();
        mf.setVisible(true);
        mf.pack();
        mf.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_Main

    // Función para buscar un producto con el código del producto
    private void Busqueda(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Busqueda
   
       try {
            if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
        String B = txt_codprod.getText()+"";
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
        String codprod = (String) Almacen.getValueAt(tabla_almacen.getSelectedRow(),1);
        String cantprod = (String) Almacen.getValueAt(tabla_almacen.getSelectedRow(),2);

        
        txt_codprod.setText(codprod);
        txt_cantprod.setText(cantprod);

        }
        catch (Exception ex){
        JOptionPane.showMessageDialog(null, "error "+ex);
        }
    }//GEN-LAST:event_Rellenar

    // Botón para modificar un registro de la tabla
    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
    
        String cod_almacen = (String)Almacen.getValueAt(tabla_almacen.getSelectedRow(),0);
        String codprod = txt_codprod.getText();
        String cantprod = txt_cantprod.getText();
       
        
        PreparedStatement ps;
        String query = "UPDATE detalle_almacen SET cod_producto=?, cant=? WHERE cod_almacen=?";
        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            
            ps.setString(3, cod_almacen);
            ps.setString(1, codprod);
            ps.setString(2, cantprod);


            ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Registro modificado");
                Limpiar();
                Mostrardatos("");
                
        } catch (SQLException ex) {
            Logger.getLogger(frm_main.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error "+ex);
            }

    }//GEN-LAST:event_btn_modificarActionPerformed

    // Botón para eliminar un registro de la tabla
    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
      
           String id = (String)Almacen.getValueAt(tabla_almacen.getSelectedRow(),0);
        
        
        PreparedStatement ps;
        String query = "DELETE FROM detalle_almacen WHERE cod_almacen=?";
        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            
            ps.setString(1, id);

                if(ps.executeUpdate() > 0)
            {
              
                JOptionPane.showMessageDialog(null, "Registro eliminado");
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
                new frm_almacen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_imprimir;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_almacen;
    private javax.swing.JLabel lbl_cantprod;
    private javax.swing.JLabel lbl_codprod;
    private javax.swing.JLabel lbl_logo;
    private javax.swing.JPanel panelazul;
    private javax.swing.JPanel panelazul1;
    private javax.swing.JPanel panelblanco;
    private javax.swing.JTable tabla_almacen;
    private javax.swing.JTextField txt_cantprod;
    private javax.swing.JTextField txt_codprod;
    // End of variables declaration//GEN-END:variables
}
