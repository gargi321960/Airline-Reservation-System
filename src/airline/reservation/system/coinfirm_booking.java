/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airline.reservation.system;


import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.MessageFormat;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.w3c.dom.Document;
import java.awt.print.PrinterJob;
/**
 *
 * @author GARGI GHOSH
 */
public class coinfirm_booking extends javax.swing.JFrame {
Connection con;
Statement stmt;
ResultSet rs;
PreparedStatement pst;
int x,idno;
String idd;
String s3;
String user;
    /**
     * Creates new form coinfirm_booking
     */
    public coinfirm_booking() {
        initComponents();
          try
        {
         //text10.setVisible(false);
         //tbl_flightdetils.removeColumn(tbl_flightdetils.getColumnModel().getColumn(9));
        b1.setVisible(false);
        //b2.setVisible(false);
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airline_reservation_system?useSSL=false","root","root");
        String sql;
        sql="select * from confirm_booking where UserName='"+user+"'";
        stmt=this.con.createStatement();
        rs=stmt.executeQuery(sql);
        while(rs.next())
        {
           c1.addItem(rs.getString("passanger_name"));
           //c2.addItem(rs.getString("Destination"));
           c2.addItem(rs.getString("Departure_date"));
           //idno=Integer.parseInt(rs.getString("id_no"));
           //   
           //c++;
           //f1.setText(rs.getString(2));
        }
        
        
       // System.out.println(idno);
        }
        catch(Exception e)
        {
        
        }
    }
       public coinfirm_booking(String u) {
                     initComponents();
           user=u;
           l2.setText(user);
             try
        {
         //text10.setVisible(false);
         //tbl_flightdetils.removeColumn(tbl_flightdetils.getColumnModel().getColumn(9));
        b1.setVisible(false);
        //b2.setVisible(false);
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airline_reservation_system?useSSL=false","root","root");
        String sql;
        sql="select * from confirm_booking where UserName='"+user+"'";
        stmt=this.con.createStatement();
        rs=stmt.executeQuery(sql);
        while(rs.next())
        {
           c1.addItem(rs.getString("passanger_name"));
           //c2.addItem(rs.getString("Destination"));
           c2.addItem(rs.getString("Departure_date"));
           //idno=Integer.parseInt(rs.getString("id_no"));
           //   
           //c++;
           //f1.setText(rs.getString(2));
        }
        
        
       // System.out.println(idno);
        }
        catch(Exception e)
        {
        
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
        c1 = new rojerusan.RSComboMetro();
        p1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        f13 = new app.bolivia.swing.JCTextField();
        jPanel3 = new javax.swing.JPanel();
        f14 = new app.bolivia.swing.JCTextField();
        f15 = new app.bolivia.swing.JCTextField();
        f16 = new app.bolivia.swing.JCTextField();
        f17 = new app.bolivia.swing.JCTextField();
        f18 = new app.bolivia.swing.JCTextField();
        f19 = new app.bolivia.swing.JCTextField();
        f1 = new app.bolivia.swing.JCTextField();
        f5 = new app.bolivia.swing.JCTextField();
        f2 = new app.bolivia.swing.JCTextField();
        f12 = new app.bolivia.swing.JCTextField();
        f6 = new app.bolivia.swing.JCTextField();
        f7 = new app.bolivia.swing.JCTextField();
        f8 = new app.bolivia.swing.JCTextField();
        f3 = new app.bolivia.swing.JCTextField();
        f4 = new app.bolivia.swing.JCTextField();
        f11 = new app.bolivia.swing.JCTextField();
        f9 = new app.bolivia.swing.JCTextField();
        f10 = new app.bolivia.swing.JCTextField();
        b2 = new rojeru_san.complementos.RSButtonHover();
        c2 = new rojerusan.RSComboMetro();
        b1 = new rojeru_san.complementos.RSButtonHover();
        rSButtonHover2 = new rojeru_san.complementos.RSButtonHover();
        id1 = new javax.swing.JTextField();
        l2 = new rojeru_san.complementos.RSButtonHover();
        jLabel1 = new javax.swing.JLabel();
        rSMaterialButtonCircle2 = new rojerusan.RSMaterialButtonCircle();
        rSMaterialButtonCircle3 = new rojerusan.RSMaterialButtonCircle();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, -1, -1));

        p1.setBackground(new java.awt.Color(204, 204, 255));
        p1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Passenger Name");
        p1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 120, 23));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Phone Number");
        p1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 90, 28));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Gender");
        p1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 60, 23));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Age");
        p1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 68, 23));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("State");
        p1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 40, 23));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("pin code");
        p1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, 60, 23));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Email  Id");
        p1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 60, 23));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("Post Office");
        p1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 490, 80, 23));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("City");
        p1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 40, 23));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setText("Address");
        p1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 63, 23));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setText("Class");
        p1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 50, 23));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setText("FLIGHT NO");
        p1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, 120, 30));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setText("country :");
        p1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 105, 23));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setText("Arrival Time ");
        p1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 360, 100, 23));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setText("Departure Time ");
        p1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 360, 120, 23));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel28.setText("TO");
        p1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 170, 40, 23));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel29.setText("FROM");
        p1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 170, 90, 23));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel30.setText("Departure Date :");
        p1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 280, 180, 23));

        jPanel2.setBackground(new java.awt.Color(51, 102, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/confirm booking img/icons8-airport-100.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 70));

        jLabel4.setFont(new java.awt.Font("Wide Latin", 1, 18)); // NOI18N
        jLabel4.setText("SKY AIRLINES");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 300, 60));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel24.setText("TICKET NO :");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 130, 40));

        f13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f13ActionPerformed(evt);
            }
        });
        jPanel2.add(f13, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 22, -1, 40));

        p1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 90));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        p1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 10, 450));

        f14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f14ActionPerformed(evt);
            }
        });
        p1.add(f14, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 110, -1, -1));
        p1.add(f15, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, 210, -1));
        p1.add(f16, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 200, 210, -1));

        f17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f17ActionPerformed(evt);
            }
        });
        p1.add(f17, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 272, -1, 40));
        p1.add(f18, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 400, -1, -1));

        f19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f19ActionPerformed(evt);
            }
        });
        p1.add(f19, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 400, -1, -1));

        f1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f1ActionPerformed(evt);
            }
        });
        p1.add(f1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 310, -1));
        p1.add(f5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 160, -1));
        p1.add(f2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 80, -1));
        p1.add(f12, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 480, 170, -1));
        p1.add(f6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 290, -1));
        p1.add(f7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 350, 40));
        p1.add(f8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 290, -1));
        p1.add(f3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 160, -1));
        p1.add(f4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 120, -1));
        p1.add(f11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 480, 180, -1));

        f9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f9ActionPerformed(evt);
            }
        });
        p1.add(f9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 180, -1));
        p1.add(f10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 430, 180, -1));

        jPanel1.add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 1060, 550));

        b2.setText("Genarate pdf");
        b2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b2MouseClicked(evt);
            }
        });
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        jPanel1.add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 70, 140, -1));
        jPanel1.add(c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        b1.setText("Generate Ticket Id");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        jPanel1.add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 70, 170, -1));

        rSButtonHover2.setText("Show");
        rSButtonHover2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover2ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonHover2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, 140, -1));

        id1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id1ActionPerformed(evt);
            }
        });
        jPanel1.add(id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 70, -1));

        l2.setForeground(new java.awt.Color(255, 51, 51));
        l2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l2ActionPerformed(evt);
            }
        });
        jPanel1.add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, 130, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Account");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 30, -1, 20));

        rSMaterialButtonCircle2.setText("<--");
        rSMaterialButtonCircle2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonCircle2ActionPerformed(evt);
            }
        });
        jPanel1.add(rSMaterialButtonCircle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 70, 40));

        rSMaterialButtonCircle3.setText("X");
        rSMaterialButtonCircle3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonCircle3ActionPerformed(evt);
            }
        });
        jPanel1.add(rSMaterialButtonCircle3, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, 70, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
       // MessageFormat h=new MessageFormat("i am a header of print page");

       // MessageFormat f=new MessageFormat("page (1,number,integer)");
       // try
       // {
            //int rowno=p1.getSelectedRow();
            //TableModel model=t1.getModel();
            //      tx3.setText(model.getValueAt(rowno, 13).toString());
            //     t4.setText(model.getValueAt(rowno, 0).toString());

            //     t1.print(JTable.PrintMode.FIT_WIDTH,h,f);
           // if(rowno!=0)
          // p1.print(JPanel..p.FIT_WIDTH,h,f);
        //}
      //  catch(Exception e)
       // {
       //     JOptionPane.showMessageDialog(null, e);
       // }
        // TODO add your handling code here:
    }//GEN-LAST:event_b2ActionPerformed

    private void b2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b2MouseClicked
        // TODO add your handling code here:
        
        PrinterJob job = PrinterJob.getPrinterJob();
            job.setJobName("Print Data");
            
            job.setPrintable(new Printable(){
            public int print(Graphics pg,PageFormat pf, int pageNum){
                    pf.setOrientation(PageFormat.LANDSCAPE);
                 if(pageNum > 0){
                    return Printable.NO_SUCH_PAGE;
                }
                
                Graphics2D g = (Graphics2D)pg;
                g.translate(pf.getImageableX(), pf.getImageableY());
                g.scale(0.60,0.60);
               
                
                p1.print(g);
         
               
                return Printable.PAGE_EXISTS;
                         
                
            }
    });
            boolean ok = job.printDialog();
        if(ok){
        try{
            
        job.print();
        }
        catch (PrinterException ex){
}
        }

    }//GEN-LAST:event_b2MouseClicked

    private void f13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f13ActionPerformed

    private void f14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f14ActionPerformed

    private void f17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f17ActionPerformed

    private void f19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f19ActionPerformed

    private void f1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f1ActionPerformed

    private void f9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f9ActionPerformed
void update()
  {
      try
        {
       
        
       Class.forName("com.mysql.cj.jdbc.Driver");
       con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airline_reservation_system?useSSL=false","root","root");
           
       f13.setText(String.valueOf(x));    
       String sql="update confirm_booking set TKCT_ID='"+f13.getText()+"' where id_no='"+x+"'";     
      pst=this.con.prepareStatement(sql);
       int i=pst.executeUpdate();
       if(i==1)
       {
        //JOptionPane.showConfirmDialog(null, "Deleted Successfully !!!");
      // DefaultTableModel obf=(DefaultTableModel)t1.getModel();
       //c=obf.getRowCount();
       //System.out.print(c);
        //obf.removeRow(j);
        this.hide();
      //new showpassangerdetails(da,sa,user).setVisible(true);        // TODO add your handling code here:

       } 
       
        }
        catch(Exception e)
        {
            System.out.print(e);
        }
  }
        // TODO add your handling code here:
 
    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        try
        {
      
           

        Class.forName("com.mysql.cj.jdbc.Driver");
       con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airline_reservation_system?useSSL=false","root","root");
       f13.setText(String.valueOf(s3));  
       //String ss=f13.getText();
       String sql="update confirm_booking set ticket_no='"+f13.getText()+"' where id_no='"+idd+"'";     
      pst=this.con.prepareStatement(sql);
       int i=pst.executeUpdate();
    

        if(i==1)
        {
         JOptionPane.showConfirmDialog(null, "ticket genarate Successfully ,!!!");
          b1.setVisible(false);
          //f13.setText(s3);
          // c++;
        }
        
        }
        catch(Exception e)
        {
        
        }     
            
        
    }//GEN-LAST:event_b1ActionPerformed

    private void rSButtonHover2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover2ActionPerformed
    try
   {     
   
        String sql1;
        sql1="select * from confirm_booking  where passanger_name='"+c1.getSelectedItem()+"'  and departure_date='"+c2.getSelectedItem()+"' ";
        pst=this.con.prepareStatement(sql1);
        rs=pst.executeQuery();
        b1.setVisible(true);

        while(rs.next())
        { 
          b1.setVisible(true);
          f1.setText(rs.getString(2));
          f2.setText(rs.getString(3));
          f3.setText(rs.getString(6));
          //c1.setSelectedItem(rs.getString(4));
          f4.setText(rs.getString(8));
          f5.setText(rs.getString(12));
          f6.setText(rs.getString(5));
          f7.setText(rs.getString(4));
          f8.setText(rs.getString(7));
          f9.setText(rs.getString(13));
          f10.setText(rs.getString(9));
          f11.setText(rs.getString("state"));
          f12.setText(rs.getString(11));
          f13.setText(rs.getString(25));
          f14.setText(rs.getString(17));
          f15.setText(rs.getString(18));
          f16.setText(rs.getString(19));
          f17.setText(rs.getString(23));
          f18.setText(rs.getString(20));
          f19.setText(rs.getString(21));
         // f13.setText(rs.getString(""));
          idd=rs.getString(26);
          id1.setText(idd);

          //x=Integer.parseInt(rs.getString("fa.ID"));
          
        }
        String idgen=id1.getText();
           //System.out.print(idgen);
          String t="TK ";
          s3=t.concat(idgen);  
          

        System.out.print(s3);
        
   }
   catch(Exception e)
   {}        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover2ActionPerformed

    private void l2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_l2ActionPerformed

    private void id1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id1ActionPerformed

    private void rSMaterialButtonCircle2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle2ActionPerformed
        // TODO add your handling code here:
          
        //obx.show();
      new customer_indexpage(user).setVisible(true);      
        this.hide();
    }//GEN-LAST:event_rSMaterialButtonCircle2ActionPerformed

    private void rSMaterialButtonCircle3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);

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
            java.util.logging.Logger.getLogger(coinfirm_booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(coinfirm_booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(coinfirm_booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(coinfirm_booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new coinfirm_booking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.complementos.RSButtonHover b1;
    private rojeru_san.complementos.RSButtonHover b2;
    private rojerusan.RSComboMetro c1;
    private rojerusan.RSComboMetro c2;
    private app.bolivia.swing.JCTextField f1;
    private app.bolivia.swing.JCTextField f10;
    private app.bolivia.swing.JCTextField f11;
    private app.bolivia.swing.JCTextField f12;
    private app.bolivia.swing.JCTextField f13;
    private app.bolivia.swing.JCTextField f14;
    private app.bolivia.swing.JCTextField f15;
    private app.bolivia.swing.JCTextField f16;
    private app.bolivia.swing.JCTextField f17;
    private app.bolivia.swing.JCTextField f18;
    private app.bolivia.swing.JCTextField f19;
    private app.bolivia.swing.JCTextField f2;
    private app.bolivia.swing.JCTextField f3;
    private app.bolivia.swing.JCTextField f4;
    private app.bolivia.swing.JCTextField f5;
    private app.bolivia.swing.JCTextField f6;
    private app.bolivia.swing.JCTextField f7;
    private app.bolivia.swing.JCTextField f8;
    private app.bolivia.swing.JCTextField f9;
    private javax.swing.JTextField id1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private rojeru_san.complementos.RSButtonHover l2;
    private javax.swing.JPanel p1;
    private rojeru_san.complementos.RSButtonHover rSButtonHover2;
    private rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle2;
    private rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle3;
    // End of variables declaration//GEN-END:variables
}