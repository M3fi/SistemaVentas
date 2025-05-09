/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Modelo.LoginDAO;
import Modelo.login;

/**
 *
 * @author Luisa
 */
public class Login extends javax.swing.JFrame {
    login lg = new login();
    LoginDAO login  = new LoginDAO();
   
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public void validar(){
        String correo = txtCorreoLog.getText();
        String pass = String.valueOf(txtPassLog.getPassword());
        
        if (! "".equals(correo)||!"".equals(pass)){
            
            lg = login.log(correo, pass);
            if (lg.getCorreo()!= null && lg.getPass()!= null){
                Sistema sis = new Sistema();
                sis.setVisible(true);
                dispose();
                
                
            }
            
                
            
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelIzquierda = new javax.swing.JPanel();
        labelCorreoLog = new javax.swing.JLabel();
        labelPassLog = new javax.swing.JLabel();
        txtCorreoLog = new javax.swing.JTextField();
        txtPassLog = new javax.swing.JPasswordField();
        btnLog = new javax.swing.JButton();
        labelCorreoLog1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        labelNombrelog = new javax.swing.JLabel();
        labelLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelIzquierda.setBackground(new java.awt.Color(255, 255, 255));

        labelCorreoLog.setBackground(new java.awt.Color(255, 255, 255));
        labelCorreoLog.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 18)); // NOI18N
        labelCorreoLog.setText("Correo Electronico");

        labelPassLog.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 18)); // NOI18N
        labelPassLog.setText("Password");

        txtCorreoLog.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        txtCorreoLog.setBorder(null);

        txtPassLog.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        txtPassLog.setBorder(null);

        btnLog.setText("Iniciar");
        btnLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogActionPerformed(evt);
            }
        });

        labelCorreoLog1.setBackground(new java.awt.Color(255, 255, 255));
        labelCorreoLog1.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 24)); // NOI18N
        labelCorreoLog1.setForeground(new java.awt.Color(51, 153, 255));
        labelCorreoLog1.setText("INICIAR SESIÓN");

        jSeparator2.setForeground(new java.awt.Color(51, 51, 51));

        jSeparator3.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout panelIzquierdaLayout = new javax.swing.GroupLayout(panelIzquierda);
        panelIzquierda.setLayout(panelIzquierdaLayout);
        panelIzquierdaLayout.setHorizontalGroup(
            panelIzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIzquierdaLayout.createSequentialGroup()
                .addGroup(panelIzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelIzquierdaLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(panelIzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelCorreoLog1)
                            .addComponent(labelCorreoLog)
                            .addComponent(labelPassLog)
                            .addComponent(txtCorreoLog)
                            .addComponent(txtPassLog, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                            .addComponent(jSeparator2)
                            .addComponent(jSeparator3)))
                    .addGroup(panelIzquierdaLayout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(btnLog, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        panelIzquierdaLayout.setVerticalGroup(
            panelIzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIzquierdaLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(labelCorreoLog1)
                .addGap(66, 66, 66)
                .addComponent(labelCorreoLog)
                .addGap(6, 6, 6)
                .addComponent(txtCorreoLog, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(labelPassLog)
                .addGap(6, 6, 6)
                .addComponent(txtPassLog, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(btnLog, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        getContentPane().add(panelIzquierda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 530));

        labelNombrelog.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 30)); // NOI18N
        labelNombrelog.setText("OUT-SOFT");
        getContentPane().add(labelNombrelog, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, -1, -1));

        labelLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/fondologin (1) (1) (1).jpg"))); // NOI18N
        getContentPane().add(labelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 310, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogActionPerformed
        validar(); 
        
    }//GEN-LAST:event_btnLogActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLog;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel labelCorreoLog;
    private javax.swing.JLabel labelCorreoLog1;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelNombrelog;
    private javax.swing.JLabel labelPassLog;
    private javax.swing.JPanel panelIzquierda;
    private javax.swing.JTextField txtCorreoLog;
    private javax.swing.JPasswordField txtPassLog;
    // End of variables declaration//GEN-END:variables
}
