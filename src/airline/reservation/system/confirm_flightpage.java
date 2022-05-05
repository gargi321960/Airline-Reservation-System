/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airline.reservation.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author GARGI GHOSH
 */
public class confirm_flightpage extends javax.swing.JFrame {
Connection con;
Statement stmt;
ResultSet rs;
PreparedStatement pst;
String user;

    /**
     * Creates new form confirm_flightpage
     */
    public confirm_flightpage() {
        initComponents();
        l1.setVisible(false);
        l2.setVisible(false);
            t1.removeColumn(t1.getColumnModel().getColumn(0));
            //t1.removeColumn(t1.getColumnModel().getColumn(1));
            //t1.removeColumn(t1.getColumnModel().getColumn(2));
            //t1.removeColumn(t1.getColumnModel().getColumn(3));
            t1.removeColumn(t1.getColumnModel().getColumn(4));
            t1.removeColumn(t1.getColumnModel().getColumn(5));
            //t1.removeColumn(t1.getColumnModel().getColumn(6));
            //t1.removeColumn(t1.getColumnModel().getColumn(7));
            //t1.removeColumn(t1.getColumnModel().getColumn(8));

           // t1.removeColumn(t1.getColumnModel().getColumn(9));
           // t1.removeColumn(t1.getColumnModel().getColumn(10));
           // t1.removeColumn(t1.getColumnModel().getColumn(11));
           // t1.removeColumn(t1.getColumnModel().getColumn(12));
            t1.removeColumn(t1.getColumnModel().getColumn(13));
            t1.removeColumn(t1.getColumnModel().getColumn(14));
            //t1.removeColumn(t1.getColumnModel().getColumn(11));
           // t1.removeColumn(t1.getColumnModel().getColumn(12));
           // t1.removeColumn(t1.getColumnModel().getColumn(13));
           // t1.removeColumn(t1.getColumnModel().getColumn(14));
            
           // t1.removeColumn(t1.getColumnModel().getColumn(22));
     

    String unm,pnm,em,phn,add,gen,age,contry,cla,pin,po,city,state,fid,cid,idno,ano,fno,src,destn,atym,dtym,price,ddate,adate,id;
 
          try
     { 
       
       Class.forName("com.mysql.cj.jdbc.Driver");
       con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airline_reservation_system?useSSL=false","root","root");
       String sql="select * from confirm_booking as cb,flight_airline as fb where cb.flightid=fb.ID";
       stmt=con.createStatement();
       rs=stmt.executeQuery(sql);
       while(rs.next())
            {
            unm=rs.getString("UserName");
            pnm=rs.getString("Passanger_name");
            age=rs.getString("age");
            em=rs.getString("Email");
            phn=rs.getString("ph_no");
            city=rs.getString("city");
            add=rs.getString("Address");
            pin=rs.getString("pin_code");
            state=rs.getString("state");
            po=rs.getString("post_office");
            contry=rs.getString("country");
            gen=rs.getString("Gender");
            cla=rs.getString("class");
            fid=rs.getString("flightid");
            //cid=rs.getString("customerid");
            //idno=rs.getString("id_no");
            ano=rs.getString("Airline_No");
            fno=rs.getString("Flight_No");
            src=rs.getString("Source");
            destn=rs.getString("Destination");
            ddate=rs.getString("Departure_date");
            dtym=rs.getString("Departure_time");
            adate=rs.getString("Arrival_date");
            atym=rs.getString("Arrival_Time");
            price=rs.getString("price");
            id=rs.getString("ID");


         String arr[]={unm,pnm,age,gen,phn,em,cla,add,pin,po,state,contry,city,fid,ano,fno,src,destn,ddate,dtym,adate,atym,price,id};
         DefaultTableModel ob=(DefaultTableModel)t1.getModel();
         ob.addRow(arr);
               
        }
        }
        catch(Exception e)
        {
            System.out.print(e);
        }
      
       
    
    }
    public confirm_flightpage(String u) {
                initComponents();

        user=u;
        l2.setText(user);
        System.out.println(u);
        
            t1.removeColumn(t1.getColumnModel().getColumn(0));
            //t1.removeColumn(t1.getColumnModel().getColumn(1));
            //t1.removeColumn(t1.getColumnModel().getColumn(2));
            //t1.removeColumn(t1.getColumnModel().getColumn(3));
            t1.removeColumn(t1.getColumnModel().getColumn(4));
            t1.removeColumn(t1.getColumnModel().getColumn(5));
            //t1.removeColumn(t1.getColumnModel().getColumn(6));
            //t1.removeColumn(t1.getColumnModel().getColumn(7));
            //t1.removeColumn(t1.getColumnModel().getColumn(8));

           // t1.removeColumn(t1.getColumnModel().getColumn(9));
           // t1.removeColumn(t1.getColumnModel().getColumn(10));
           // t1.removeColumn(t1.getColumnModel().getColumn(11));
           // t1.removeColumn(t1.getColumnModel().getColumn(12));
            t1.removeColumn(t1.getColumnModel().getColumn(13));
            t1.removeColumn(t1.getColumnModel().getColumn(14));
            //t1.removeColumn(t1.getColumnModel().getColumn(11));
           // t1.removeColumn(t1.getColumnModel().getColumn(12));
           // t1.removeColumn(t1.getColumnModel().getColumn(13));
           // t1.removeColumn(t1.getColumnModel().getColumn(14));
            
           // t1.removeColumn(t1.getColumnModel().getColumn(22));


    String unm,pnm,em,phn,add,gen,age,contry,cla,pin,po,city,state,fid,cid,idno,ano,fno,src,destn,atym,dtym,price,ddate,adate,id;
 
          try
     { 
         String usernam=l2.getText();
       
       Class.forName("com.mysql.cj.jdbc.Driver");
       con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airline_reservation_system?useSSL=false","root","root");
       String sql="select * from confirm_booking as cb,flight_airline as fb where cb.flightid=fb.ID and UserName='"+usernam+"'";
       stmt=con.createStatement();
       rs=stmt.executeQuery(sql);
       while(rs.next())
            {
            unm=rs.getString("UserName");
            pnm=rs.getString("Passanger_name");
            age=rs.getString("age");
            em=rs.getString("Email");
            phn=rs.getString("ph_no");
            city=rs.getString("city");
            add=rs.getString("Address");
            pin=rs.getString("pin_code");
            state=rs.getString("state");
            po=rs.getString("post_office");
            contry=rs.getString("country");
            gen=rs.getString("Gender");
            cla=rs.getString("class");
            fid=rs.getString("flightid");
            //cid=rs.getString("customerid");
            //idno=rs.getString("id_no");
            ano=rs.getString("Airline_No");
            fno=rs.getString("Flight_No");
            src=rs.getString("Source");
            destn=rs.getString("Destination");
            ddate=rs.getString("Departure_date");
            dtym=rs.getString("Departure_time");
            adate=rs.getString("Arrival_date");
            atym=rs.getString("Arrival_Time");
            price=rs.getString("price");
            id=rs.getString("ID");


         String arr[]={unm,pnm,age,gen,phn,em,cla,add,pin,po,state,contry,city,fid,ano,fno,src,destn,ddate,dtym,adate,atym,price,id};
         DefaultTableModel ob=(DefaultTableModel)t1.getModel();
         ob.addRow(arr);
               
        }
        }
        catch(Exception e)
        {
            System.out.print(e);
        }
      
       
    
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
        jScrollPane1 = new javax.swing.JScrollPane();
        t1 = new rojeru_san.complementos.RSTableMetro();
        l2 = new rojeru_san.complementos.RSButtonHover();
        l1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rSMaterialButtonCircle2 = new rojerusan.RSMaterialButtonCircle();
        rSMaterialButtonCircle3 = new rojerusan.RSMaterialButtonCircle();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        t1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "username", "Pssenger Name", "Age", "Gender", "Phone No", "Email", "Class", "Address", "pincode", "Post Office", "State", "Country", "city", "fid", "Airline no", "Flight no", "source", "Destination", "Departure date", "Departure time", "Arrival date", "Arrival time", "price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        t1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        t1.setFuenteFilas(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        t1.setFuenteFilasSelect(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        t1.setFuenteHead(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jScrollPane1.setViewportView(t1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1530, 240));

        l2.setForeground(new java.awt.Color(255, 51, 51));
        l2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l2ActionPerformed(evt);
            }
        });
        jPanel1.add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 0, 130, 30));

        l1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        l1.setText("Account");
        jPanel1.add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 30, -1, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Total booked ticket");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, 190, 30));

        rSMaterialButtonCircle2.setText("<--");
        rSMaterialButtonCircle2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonCircle2ActionPerformed(evt);
            }
        });
        jPanel1.add(rSMaterialButtonCircle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 70, 40));

        rSMaterialButtonCircle3.setText("X");
        rSMaterialButtonCircle3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonCircle3ActionPerformed(evt);
            }
        });
        jPanel1.add(rSMaterialButtonCircle3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 10, 70, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1610, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void l2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_l2ActionPerformed

    private void rSMaterialButtonCircle2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle2ActionPerformed
        // TODO add your handling code here:

        //obx.show();
        new customer_indexpage(user).setVisible(true);
        this.hide();
    }//GEN-LAST:event_rSMaterialButtonCircle2ActionPerformed

    private void rSMaterialButtonCircle3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle3ActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_rSMaterialButtonCircle3ActionPerformed

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
            java.util.logging.Logger.getLogger(confirm_flightpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(confirm_flightpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(confirm_flightpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(confirm_flightpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new confirm_flightpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel l1;
    private rojeru_san.complementos.RSButtonHover l2;
    private rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle2;
    private rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle3;
    private rojeru_san.complementos.RSTableMetro t1;
    // End of variables declaration//GEN-END:variables
}
