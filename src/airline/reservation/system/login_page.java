/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airline.reservation.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author GARGI GHOSH
 */
public class login_page extends javax.swing.JFrame {
Connection con;
Statement stmt;
ResultSet rs;

    /**
     * Creates new form login_page
     */
    public login_page() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bot4 = new rojerusan.RSMaterialButtonCircle();
        bot5 = new rojerusan.RSMaterialButtonCircle();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        t1 = new javax.swing.JLabel();
        text1 = new javax.swing.JTextField();
        t2 = new javax.swing.JLabel();
        bot1 = new rojeru_san.complementos.RSButtonHover();
        bot2 = new rojeru_san.complementos.RSButtonHover();
        bot3 = new rojeru_san.complementos.RSButtonHover();
        bot6 = new rojeru_san.complementos.RSButtonHover();
        text2 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));

        bot4.setBackground(new java.awt.Color(255, 255, 255));
        bot4.setForeground(new java.awt.Color(0, 0, 0));
        bot4.setText("x");
        bot4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot4ActionPerformed(evt);
            }
        });

        bot5.setBackground(new java.awt.Color(255, 255, 255));
        bot5.setForeground(new java.awt.Color(0, 0, 0));
        bot5.setText("<--");
        bot5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot5ActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Customer Login");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(bot5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(113, 113, 113)
                .addComponent(bot4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bot5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bot4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel3)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 120));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        t1.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        t1.setText("Enter Your Password...");
        jPanel2.add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, 30));

        text1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        text1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        text1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text1ActionPerformed(evt);
            }
        });
        jPanel2.add(text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 430, 40));

        t2.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        t2.setText("Enter Your Username...");
        jPanel2.add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, 30));

        bot1.setBackground(new java.awt.Color(255, 255, 255));
        bot1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 1, true));
        bot1.setText("Create New Account");
        bot1.setColorText(new java.awt.Color(51, 102, 255));
        bot1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        bot1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot1ActionPerformed(evt);
            }
        });
        jPanel2.add(bot1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 220, 30));

        bot2.setBackground(new java.awt.Color(255, 255, 255));
        bot2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 1, true));
        bot2.setText("Reset");
        bot2.setColorText(new java.awt.Color(51, 102, 255));
        bot2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        bot2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot2ActionPerformed(evt);
            }
        });
        jPanel2.add(bot2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, 150, 30));

        bot3.setBackground(new java.awt.Color(255, 255, 255));
        bot3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255)));
        bot3.setText("Login");
        bot3.setColorHover(new java.awt.Color(255, 255, 255));
        bot3.setColorText(new java.awt.Color(51, 102, 255));
        bot3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        bot3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot3ActionPerformed(evt);
            }
        });
        jPanel2.add(bot3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 150, 40));

        bot6.setBackground(new java.awt.Color(255, 255, 255));
        bot6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 1, true));
        bot6.setText("Forget Password");
        bot6.setColorText(new java.awt.Color(51, 102, 255));
        bot6.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        bot6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot6ActionPerformed(evt);
            }
        });
        jPanel2.add(bot6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 320, 180, 30));

        text2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        text2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        text2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text2ActionPerformed(evt);
            }
        });
        jPanel2.add(text2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 430, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customer_loginpage img/icons8-password-100.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 100, 80));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customer_loginpage img/icons8-user-100.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 100, 80));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 820, 380));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bot4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot4ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_bot4ActionPerformed

    private void bot5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot5ActionPerformed
        // TODO add your handling code here:
        this.hide();
        homepage obx=new homepage();
        obx.show();
    }//GEN-LAST:event_bot5ActionPerformed

    private void text1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text1ActionPerformed

    private void bot1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot1ActionPerformed
        // TODO add your handling code here:
        this.hide();
        customer_register obx =new customer_register();
        obx.show();
        

    }//GEN-LAST:event_bot1ActionPerformed

    private void bot2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot2ActionPerformed
        // TODO add your handling code here:
        text1.setText("");
        text2.setText("");

    }//GEN-LAST:event_bot2ActionPerformed

    private void bot3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot3ActionPerformed
        // TODO add your handling code here:
         try
            {
     Class.forName("com.mysql.cj.jdbc.Driver");
     con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airline_reservation_system?useSSL=false","root","root");
     
     String unm,pwd,u;
     
     unm=text1.getText();
     pwd=text2.getText();
    // u=text1.getText();
     String sql="select * from user_login where Email ='"+unm+"' or UserName='"+unm+"' and Password='"+pwd+"' ";     
     stmt=con.createStatement();
     rs=stmt.executeQuery(sql);
     if(rs.next())
     {
     JOptionPane.showConfirmDialog(null,"Login Successful");
     //admin_indexpage obx = new admin_indexpage();
     this.hide();
     //obx.show();
      new customer_indexpage(unm).setVisible(true);        // TODO add your handling code here:
      
     }
     else
     {
      JOptionPane.showConfirmDialog(null, "Login UnSuccessFul");   
      //text1.setText("");
     // text2.setText("");
     }
    }
    catch(Exception e)
    {
      System.out.print(e);
    }
           
                                      

    }//GEN-LAST:event_bot3ActionPerformed

    private void bot6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot6ActionPerformed
        // TODO add your handling code here:
         new forgetpassword_user().setVisible(true);
        this.hide();
    }//GEN-LAST:event_bot6ActionPerformed

    private void text2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text2ActionPerformed

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
            java.util.logging.Logger.getLogger(login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.complementos.RSButtonHover bot1;
    private rojeru_san.complementos.RSButtonHover bot2;
    private rojeru_san.complementos.RSButtonHover bot3;
    private rojerusan.RSMaterialButtonCircle bot4;
    private rojerusan.RSMaterialButtonCircle bot5;
    private rojeru_san.complementos.RSButtonHover bot6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel t1;
    private javax.swing.JLabel t2;
    private javax.swing.JTextField text1;
    private javax.swing.JPasswordField text2;
    // End of variables declaration//GEN-END:variables
}
