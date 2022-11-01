package formularios;


import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class frm_login extends javax.swing.JFrame {

  
    public frm_login() {
        initComponents();
    }
    
    public boolean RevisarUsuario(String usuario) {
        PreparedStatement ps;
        ResultSet rs;
        boolean checkUser = false;
        String query = "Select * from 'usuario' where 'usuario' = ?";
        
        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            ps.setString(1, usuario);
            rs = ps.executeQuery();
            if (rs.next()){
                checkUser = true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error" + ex);
        }
        return checkUser;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_azul = new javax.swing.JPanel();
        panel_blanco = new javax.swing.JPanel();
        lbl_logo = new javax.swing.JLabel();
        lbl_bienvenida = new javax.swing.JLabel();
        lbl_usuario = new javax.swing.JLabel();
        lbl_contraseña = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        btn_enviar = new javax.swing.JButton();
        lbl_iniciesesion = new javax.swing.JLabel();
        txtp_contraseña = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setBackground(new java.awt.Color(255, 0, 0));
        setResizable(false);

        panel_azul.setBackground(new java.awt.Color(4, 68, 124));
        panel_azul.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_blanco.setBackground(new java.awt.Color(255, 255, 255));
        panel_blanco.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo nicadom.png"))); // NOI18N
        panel_blanco.add(lbl_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 90, 110));

        lbl_bienvenida.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        lbl_bienvenida.setText("Bienvenido a Nicadom");
        panel_blanco.add(lbl_bienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 260, 30));

        lbl_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario.png"))); // NOI18N
        panel_blanco.add(lbl_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, -1));

        lbl_contraseña.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/contraseña.png"))); // NOI18N
        panel_blanco.add(lbl_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, -1, -1));
        panel_blanco.add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 140, 30));

        btn_enviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iniciar.png"))); // NOI18N
        btn_enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enviarActionPerformed(evt);
            }
        });
        panel_blanco.add(btn_enviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, -1, -1));

        lbl_iniciesesion.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        lbl_iniciesesion.setText("Inicie sesión");
        panel_blanco.add(lbl_iniciesesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 100, 20));
        panel_blanco.add(txtp_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 140, 30));

        panel_azul.add(panel_blanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 450, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_azul, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_azul, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enviarActionPerformed
   
        PreparedStatement ps;
        ResultSet rs;
        String usu = txt_usuario.getText();
        String cla = String.valueOf(txtp_contraseña.getText());
        
        String query = "SELECT * FROM `registros` WHERE `usuario` =? AND `contraseña` =? ";
        
        
        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            
            ps.setString(1, usu);
            ps.setString(2, cla);
           
            rs = ps.executeQuery();
            
           
            if(rs.next())
            {
                
                    Integer rol = rs.getInt("rol");

                    if(rol == 1){
                        
                    frm_main mf = new frm_main();
                    mf.setVisible(true);
                    mf.pack();
                    mf.setLocationRelativeTo(null);


                    } else{
                    frm_mainusuario mf = new frm_mainusuario();
                    mf.setVisible(true);
                    mf.pack();
                    mf.setLocationRelativeTo(null);
                    String info = txt_usuario.getText();
                    frm_mainusuario.txt_facturadopor.setText(info);
                    
                    }
                    
                    this.dispose();

            }
            
            else {
                JOptionPane.showMessageDialog(null, "Usuario o Clave incorrectos", "Fallo en Acesso", 2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(frm_login.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error "+ex);
        }
         
    }//GEN-LAST:event_btn_enviarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_enviar;
    private javax.swing.JLabel lbl_bienvenida;
    private javax.swing.JLabel lbl_contraseña;
    private javax.swing.JLabel lbl_iniciesesion;
    private javax.swing.JLabel lbl_logo;
    private javax.swing.JLabel lbl_usuario;
    private javax.swing.JPanel panel_azul;
    private javax.swing.JPanel panel_blanco;
    public static javax.swing.JTextField txt_usuario;
    private javax.swing.JPasswordField txtp_contraseña;
    // End of variables declaration//GEN-END:variables
}
