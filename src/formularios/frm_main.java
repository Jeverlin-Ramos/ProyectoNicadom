package formularios;

import static formularios.frm_login.txt_usuario;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class frm_main extends javax.swing.JFrame {

   
    public frm_main() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_main = new javax.swing.JLabel();
        btn_cliente = new javax.swing.JButton();
        btn_almacen = new javax.swing.JButton();
        btn_factura = new javax.swing.JButton();
        btn_entrega = new javax.swing.JButton();
        btn_producto = new javax.swing.JButton();
        btn_empleado = new javax.swing.JButton();
        lbl_logo = new javax.swing.JLabel();
        franja_azul = new javax.swing.JPanel();
        lbl_entrega = new javax.swing.JLabel();
        lbl_almacen = new javax.swing.JLabel();
        lbl_cliente = new javax.swing.JLabel();
        lbl_factura = new javax.swing.JLabel();
        lbl_producto = new javax.swing.JLabel();
        lbl_empleado = new javax.swing.JLabel();
        btn_usuario = new javax.swing.JButton();
        lbl_usuario = new javax.swing.JLabel();
        btn_cerrarsesion = new javax.swing.JButton();
        btn_facturacion = new javax.swing.JButton();
        lbl_facturacion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MAIN");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lbl_main.setFont(new java.awt.Font("Corbel", 0, 36)); // NOI18N
        lbl_main.setForeground(new java.awt.Color(10, 73, 123));
        lbl_main.setText("ADMINISTRADOR");

        btn_cliente.setBackground(new java.awt.Color(255, 255, 255));
        btn_cliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cliente.png"))); // NOI18N
        btn_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clienteActionPerformed(evt);
            }
        });

        btn_almacen.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_almacen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/almacen.png"))); // NOI18N
        btn_almacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_almacenActionPerformed(evt);
            }
        });

        btn_factura.setBackground(new java.awt.Color(255, 255, 255));
        btn_factura.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_factura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/factura.png"))); // NOI18N
        btn_factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_facturaActionPerformed(evt);
            }
        });

        btn_entrega.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_entrega.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/entrega.png"))); // NOI18N
        btn_entrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_entregaActionPerformed(evt);
            }
        });

        btn_producto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/paquete.png"))); // NOI18N
        btn_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_productoActionPerformed(evt);
            }
        });

        btn_empleado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_empleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/empleado.png"))); // NOI18N
        btn_empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_empleadoActionPerformed(evt);
            }
        });

        lbl_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo nicadom 2.png"))); // NOI18N

        franja_azul.setBackground(new java.awt.Color(4, 68, 124));

        javax.swing.GroupLayout franja_azulLayout = new javax.swing.GroupLayout(franja_azul);
        franja_azul.setLayout(franja_azulLayout);
        franja_azulLayout.setHorizontalGroup(
            franja_azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 124, Short.MAX_VALUE)
        );
        franja_azulLayout.setVerticalGroup(
            franja_azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        lbl_entrega.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        lbl_entrega.setForeground(new java.awt.Color(12, 26, 70));
        lbl_entrega.setText("Entrega");

        lbl_almacen.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        lbl_almacen.setForeground(new java.awt.Color(12, 26, 70));
        lbl_almacen.setText("Almacén");

        lbl_cliente.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        lbl_cliente.setForeground(new java.awt.Color(12, 26, 70));
        lbl_cliente.setText("Cliente");

        lbl_factura.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        lbl_factura.setForeground(new java.awt.Color(12, 26, 70));
        lbl_factura.setText("Control Factura");

        lbl_producto.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        lbl_producto.setForeground(new java.awt.Color(12, 26, 70));
        lbl_producto.setText("Producto");

        lbl_empleado.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        lbl_empleado.setForeground(new java.awt.Color(12, 26, 70));
        lbl_empleado.setText("Empleado");

        btn_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario 2.png"))); // NOI18N
        btn_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_usuarioActionPerformed(evt);
            }
        });

        lbl_usuario.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        lbl_usuario.setForeground(new java.awt.Color(12, 26, 70));
        lbl_usuario.setText("Usuario");

        btn_cerrarsesion.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        btn_cerrarsesion.setText("CERRAR SESIÓN");
        btn_cerrarsesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarsesionActionPerformed(evt);
            }
        });

        btn_facturacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cuenta.png"))); // NOI18N
        btn_facturacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_facturacionActionPerformed(evt);
            }
        });

        lbl_facturacion.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        lbl_facturacion.setForeground(new java.awt.Color(12, 26, 70));
        lbl_facturacion.setText("Facturación");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(franja_azul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(lbl_producto))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_factura))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btn_cerrarsesion)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_logo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn_almacen, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(lbl_almacen)
                                                .addGap(15, 15, 15)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(lbl_empleado))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btn_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                                        .addComponent(btn_entrega, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(84, 84, 84)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_usuario)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_facturacion)
                                    .addComponent(btn_facturacion, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14)))
                        .addGap(72, 72, 72))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(lbl_main)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addComponent(lbl_cliente)
                        .addGap(138, 138, 138)
                        .addComponent(lbl_entrega)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_usuario)
                        .addGap(94, 94, 94))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_logo)
                    .addComponent(btn_cerrarsesion))
                .addGap(27, 27, 27)
                .addComponent(lbl_main)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_cliente, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_usuario, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_entrega, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_factura, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_entrega)
                    .addComponent(lbl_cliente)
                    .addComponent(lbl_usuario)
                    .addComponent(lbl_factura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_producto))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_almacen, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_almacen))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_facturacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_empleado, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_empleado)
                            .addComponent(lbl_facturacion))))
                .addContainerGap(53, Short.MAX_VALUE))
            .addComponent(franja_azul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    
    
    private void btn_empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_empleadoActionPerformed

        frm_empleado mf = new frm_empleado();
        mf.setVisible(true);
        mf.pack();
        mf.setLocationRelativeTo(null);
        this.dispose();

    }//GEN-LAST:event_btn_empleadoActionPerformed

    private void btn_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_productoActionPerformed

        frm_producto mf = new frm_producto();
        mf.setVisible(true);
        mf.pack();
        mf.setLocationRelativeTo(null);
        this.dispose();

    }//GEN-LAST:event_btn_productoActionPerformed

    private void btn_entregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_entregaActionPerformed

        frm_entrega mf = new frm_entrega();
        mf.setVisible(true);
        mf.pack();
        mf.setLocationRelativeTo(null);
        this.dispose();

    }//GEN-LAST:event_btn_entregaActionPerformed

    private void btn_facturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_facturaActionPerformed

        frm_factura mf = new frm_factura();
        mf.setVisible(true);
        mf.pack();
        mf.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btn_facturaActionPerformed

    private void btn_almacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_almacenActionPerformed

        frm_almacen mf = new frm_almacen();
        mf.setVisible(true);
        mf.pack();
        mf.setLocationRelativeTo(null);
        this.dispose();

    }//GEN-LAST:event_btn_almacenActionPerformed

    private void btn_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clienteActionPerformed

        frm_cliente mf = new frm_cliente();
        mf.setVisible(true);
        mf.pack();
        mf.setLocationRelativeTo(null);
        this.dispose();

    }//GEN-LAST:event_btn_clienteActionPerformed

    private void btn_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_usuarioActionPerformed
       
        frm_usuario mf = new frm_usuario();
        mf.setVisible(true);
        mf.pack();
        mf.setLocationRelativeTo(null);
        this.dispose();
        
    }//GEN-LAST:event_btn_usuarioActionPerformed

    private void btn_cerrarsesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarsesionActionPerformed
        
        frm_login mf = new frm_login();
        mf.setVisible(true);
        mf.pack();
        mf.setLocationRelativeTo(null);
        this.dispose();
        
    }//GEN-LAST:event_btn_cerrarsesionActionPerformed

    private void btn_facturacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_facturacionActionPerformed
    
        frm_mainusuario mf = null;
        try {
            mf = new frm_mainusuario();
        } catch (SQLException ex) {
            Logger.getLogger(frm_main.class.getName()).log(Level.SEVERE, null, ex);
        }
                    mf.setVisible(true);
                    mf.pack();
                    mf.setLocationRelativeTo(null);
                    String info = txt_usuario.getText();
                    frm_mainusuario.txt_facturadopor.setText(info);
        
                    this.dispose();
    
            
    }//GEN-LAST:event_btn_facturacionActionPerformed

   
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frm_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_almacen;
    private javax.swing.JButton btn_cerrarsesion;
    private javax.swing.JButton btn_cliente;
    private javax.swing.JButton btn_empleado;
    private javax.swing.JButton btn_entrega;
    private javax.swing.JButton btn_factura;
    private javax.swing.JButton btn_facturacion;
    private javax.swing.JButton btn_producto;
    private javax.swing.JButton btn_usuario;
    private javax.swing.JPanel franja_azul;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_almacen;
    private javax.swing.JLabel lbl_cliente;
    private javax.swing.JLabel lbl_empleado;
    private javax.swing.JLabel lbl_entrega;
    private javax.swing.JLabel lbl_factura;
    private javax.swing.JLabel lbl_facturacion;
    private javax.swing.JLabel lbl_logo;
    private javax.swing.JLabel lbl_main;
    private javax.swing.JLabel lbl_producto;
    private javax.swing.JLabel lbl_usuario;
    // End of variables declaration//GEN-END:variables
}
