/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airline.reservation.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author GARGI GHOSH
 */
public class customer_register extends javax.swing.JFrame {
Connection con;
PreparedStatement pst;

    /**
     * Creates new form customer_register
     */
    public customer_register() {
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        t2 = new javax.swing.JLabel();
        t3 = new javax.swing.JLabel();
        t4 = new javax.swing.JLabel();
        t5 = new javax.swing.JLabel();
        t6 = new javax.swing.JLabel();
        t7 = new javax.swing.JLabel();
        text1 = new javax.swing.JTextField();
        text2 = new javax.swing.JTextField();
        text4 = new javax.swing.JTextField();
        text5 = new javax.swing.JTextField();
        text6 = new javax.swing.JTextField();
        b1 = new rojeru_san.complementos.RSButtonHover();
        text3 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Create Your New Account");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(bot5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(bot4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bot5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bot4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(34, 34, 34))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 130));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        t2.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        t2.setText("Enter Your Username :");
        jPanel2.add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, 40));

        t3.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        t3.setText("Enter Your Password :");
        jPanel2.add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, 30));

        t4.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        t4.setText("Enter Your Name :");
        jPanel2.add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, 30));

        t5.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        t5.setText("Enter your Phone Number :");
        jPanel2.add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, -1, 30));

        t6.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        t6.setText("Enter Your Email Id :");
        jPanel2.add(t6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, -1, 40));

        t7.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        t7.setText("Confirm password :");
        jPanel2.add(t7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, 210, 40));

        text1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        text1.setForeground(new java.awt.Color(255, 0, 0));
        text1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        text1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text1ActionPerformed(evt);
            }
        });
        jPanel2.add(text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 330, 40));

        text2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        text2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        text2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text2ActionPerformed(evt);
            }
        });
        jPanel2.add(text2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 340, 40));

        text4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        text4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        text4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text4ActionPerformed(evt);
            }
        });
        jPanel2.add(text4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 300, 40));

        text5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        text5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        text5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text5ActionPerformed(evt);
            }
        });
        jPanel2.add(text5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, 360, 40));

        text6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        text6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        text6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text6ActionPerformed(evt);
            }
        });
        jPanel2.add(text6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 450, 370, 40));

        b1.setBackground(new java.awt.Color(255, 255, 255));
        b1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 102), 1, true));
        b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customer_loginpage img/follow (1).png"))); // NOI18N
        b1.setColorHover(new java.awt.Color(51, 102, 255));
        b1.setColorText(new java.awt.Color(51, 102, 255));
        b1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        jPanel2.add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 230, 70, 70));

        text3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        text3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        text3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text3ActionPerformed(evt);
            }
        });
        jPanel2.add(text3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 350, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customer_loginpage img/icons8-user-100.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 100, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customer_loginpage img/icons8-password-100.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 90, 60));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/create new account page img customer/icons8-user-64.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, 70));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/create new account page img customer/icons8-email-open-48.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 60, 60));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customer_loginpage img/icons8-password-100.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 90, 60));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/create new account page img customer/icons8-number-pad-100 (2).png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 90, 60));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Create");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 300, -1, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 127, 960, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bot4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot4ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_bot4ActionPerformed

    private void bot5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot5ActionPerformed
        // TODO add your handling code here:
        this.hide();
        login_page obx=new login_page();
        obx.show();
    }//GEN-LAST:event_bot5ActionPerformed

    private void text1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text1ActionPerformed

    private void text2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text2ActionPerformed

    private void text4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text4ActionPerformed

    private void text5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text5ActionPerformed

    private void text6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text6ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
           try{
      Class.forName("com.mysql.cj.jdbc.Driver");
      con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airline_reservation_system?useSSL=false","root","root");
      String unm,pwd,cpwd,fullname,email,pno;
      unm=text1.getText();
      fullname=text2.getText();
      pwd=text3.getText();
      pno=text4.getText();
      email=text5.getText();
      cpwd=text6.getText();

     if(pwd.equals(cpwd))
      {
     String sql="insert into user_login(UserName,Password,Ph_no,Email,full_name) values('"+unm+"','"+pwd+"','"+pno+"','"+email+"','"+fullname+"')";     
     pst=this.con.prepareStatement(sql);
     int i=pst.executeUpdate();
      if(i==1)
      {
          JOptionPane.showConfirmDialog(null, "Created your Accout Successfully !!!");
          this.hide();
          login_page ib = new login_page();
          ib.show();
      }
      else
          JOptionPane.showConfirmDialog(null, "Create unSuccessull !!!");
     }
     else
          JOptionPane.showConfirmDialog(null, "Create unSuccessfull !!!");
     }
           
     catch(Exception e)
     {
       System.out.print(e);
     }
        
    }//GEN-LAST:event_b1ActionPerformed
    
    private void text3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text3ActionPerformed

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
            java.util.logging.Logger.getLogger(customer_register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customer_register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customer_register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customer_register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new customer_register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.complementos.RSButtonHover b1;
    private rojerusan.RSMaterialButtonCircle bot4;
    private rojerusan.RSMaterialButtonCircle bot5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel t2;
    private javax.swing.JLabel t3;
    private javax.swing.JLabel t4;
    private javax.swing.JLabel t5;
    private javax.swing.JLabel t6;
    private javax.swing.JLabel t7;
    private javax.swing.JTextField text1;
    private javax.swing.JTextField text2;
    private javax.swing.JPasswordField text3;
    private javax.swing.JTextField text4;
    private javax.swing.JTextField text5;
    private javax.swing.JTextField text6;
    // End of variables declaration//GEN-END:variables
}
