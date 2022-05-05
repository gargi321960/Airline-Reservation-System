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
import java.text.MessageFormat;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.w3c.dom.Document;


/**
 *
 * @author GARGI GHOSH
 */
public class showpassangerdetails extends javax.swing.JFrame {
String da,sa,user;
Connection con;
Statement stmt;
ResultSet rs;
PreparedStatement pst;
String f;
String idx;


int c=0;
int j;

    /**
     * Creates new form 
     */
    public showpassangerdetails() {
        initComponents();
        pp1.setVisible(false);
        b1.setVisible(false);
        b2.setVisible(false);
        b3.setVisible(false);
        b4.setVisible(false);

        try
        {
            t1.removeColumn(t1.getColumnModel().getColumn(14));
            t1.removeColumn(t1.getColumnModel().getColumn(13));
            t1.removeColumn(t1.getColumnModel().getColumn(0));

         String unm,pnm,em,phn,add,gen,age,contry,cla,pin,po,city,state,id,fid;
String s;
      Class.forName("com.mysql.cj.jdbc.Driver");
      con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airline_reservation_system?useSSL=false","root","root");
        
        String sql="select * from customer_airline as ca ,flight_airline as fa  where ca.flightid= fa.ID and Username='"+user+"'";

      // String sql="select * from customer_airline";
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
            id=rs.getString("id");
            fid=rs.getString("flightid");
            
         String arr[]={unm,pnm,age,gen,phn,em,cla,add,pin,po,state,contry,city,fid,id};
         DefaultTableModel ob=(DefaultTableModel)t1.getModel();
         ob.addRow(arr);
               
            }
        }
        catch(Exception e)
        {
            System.out.print(e);
        }

    }
  public showpassangerdetails(String d,String s,String u) {
        initComponents();
        sa=s;
        da=d;
        tx1.setText(da);
        tx2.setText(sa);
        f=tx2.getText();
        user=u;
        t4.setText(user);
        pp1.setVisible(false);
        b1.setVisible(false);
        b2.setVisible(false);
        b3.setVisible(false);
        b4.setVisible(false);
        tx17.setText(user);
        tx1.setVisible(false);
        tx2.setVisible(false);
        tx3.setVisible(false);
        t4.setVisible(false);
        s10.setVisible(false);
        s11.setVisible(false);

      try
        {
            t1.removeColumn(t1.getColumnModel().getColumn(14));
            t1.removeColumn(t1.getColumnModel().getColumn(13));
            t1.removeColumn(t1.getColumnModel().getColumn(0));
         String unm,pnm,em,phn,add,gen,age,contry,cla,pin,po,city,state,l,id,fid;

      Class.forName("com.mysql.cj.jdbc.Driver");
      con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airline_reservation_system?useSSL=false","root","root");
      
       String sql="select * from customer_airline as ca ,flight_airline as fa  where ca.flightid= fa.ID and Username='"+user+"'";
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
            id=rs.getString("id");
            fid=rs.getString("flightid");
            
         String arr[]={unm,pnm,age,gen,phn,em,cla,add,pin,po,state,contry,city,fid,id};
         DefaultTableModel ob=(DefaultTableModel)t1.getModel();
         ob.addRow(arr);
               
        }
        }
        catch(Exception e)
        {
            System.out.print(e);
        }

    }
  void delete()
  {
      try
        {
       
        
       Class.forName("com.mysql.cj.jdbc.Driver");
       con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airline_reservation_system?useSSL=false","root","root");
           String deleteid;
           deleteid=tx3.getText();
            String sql="delete from customer_airline where id='"+deleteid+"'";     
      pst=this.con.prepareStatement(sql);
       int i=pst.executeUpdate();
       if(i==1)
       {
        //JOptionPane.showConfirmDialog(null, "Deleted Successfully !!!");
       DefaultTableModel obf=(DefaultTableModel)t1.getModel();
       //c=obf.getRowCount();
       //System.out.print(c);
        obf.removeRow(j);
        this.hide();
      new showpassangerdetails(da,sa,user).setVisible(true);        // TODO add your handling code here:

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

        plasticButtonUI1 = new com.jgoodies.looks.plastic.PlasticButtonUI();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        t1 = new rojeru_san.complementos.RSTableMetro();
        tx1 = new javax.swing.JTextField();
        b3 = new rojeru_san.complementos.RSButtonHover();
        tx2 = new javax.swing.JTextField();
        b1 = new rojeru_san.complementos.RSButtonHover();
        b2 = new rojeru_san.complementos.RSButtonHover();
        tx3 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        b4 = new rojeru_san.complementos.RSButtonHover();
        pp1 = new javax.swing.JPanel();
        s1 = new javax.swing.JTextField();
        s6 = new javax.swing.JTextField();
        s2 = new javax.swing.JTextField();
        s4 = new javax.swing.JTextField();
        s7 = new javax.swing.JTextField();
        s8 = new javax.swing.JTextField();
        s3 = new javax.swing.JTextField();
        s5 = new javax.swing.JTextField();
        s9 = new javax.swing.JTextField();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label4 = new java.awt.Label();
        label3 = new java.awt.Label();
        label5 = new java.awt.Label();
        label6 = new java.awt.Label();
        label7 = new java.awt.Label();
        label8 = new java.awt.Label();
        label9 = new java.awt.Label();
        label10 = new java.awt.Label();
        label11 = new java.awt.Label();
        label12 = new java.awt.Label();
        c3 = new rojerusan.RSComboMetro();
        c1 = new rojerusan.RSComboMetro();
        c2 = new rojerusan.RSComboMetro();
        rSButtonHover4 = new rojeru_san.complementos.RSButtonHover();
        s10 = new javax.swing.JTextField();
        s11 = new javax.swing.JTextField();
        rSMaterialButtonCircle3 = new rojerusan.RSMaterialButtonCircle();
        rSMaterialButtonCircle4 = new rojerusan.RSMaterialButtonCircle();
        jLabel1 = new javax.swing.JLabel();
        b5 = new rojeru_san.complementos.RSButtonHover();
        tx17 = new rojeru_san.complementos.RSButtonHover();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        t1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usename", "Name", "Age", "Gender", "Ph NO", "Email", "Class", "Adress", "Pin code", "Post Office", "State", "Country", "City", "Flight id", "id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, true, true, true, true, true, true, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        t1.setFuenteFilas(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        t1.setFuenteFilasSelect(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t1.setFuenteHead(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(t1);
        if (t1.getColumnModel().getColumnCount() > 0) {
            t1.getColumnModel().getColumn(0).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1430, 240));

        tx1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx1ActionPerformed(evt);
            }
        });
        jPanel1.add(tx1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 137, -1));

        b3.setText("Delete Booking");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        jPanel1.add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 310, -1, -1));

        tx2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx2ActionPerformed(evt);
            }
        });
        jPanel1.add(tx2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 40, -1));

        b1.setText("Confirm Booking");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        jPanel1.add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        b2.setText("Edit Booking");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        jPanel1.add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, -1, -1));
        jPanel1.add(tx3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 40, -1));

        t4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t4ActionPerformed(evt);
            }
        });
        jPanel1.add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 90, -1));

        b4.setText("Genarate pdf");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        jPanel1.add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 310, -1, -1));

        pp1.setBackground(new java.awt.Color(51, 102, 255));
        pp1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        s1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s1ActionPerformed(evt);
            }
        });
        pp1.add(s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 290, 30));

        s6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s6ActionPerformed(evt);
            }
        });
        pp1.add(s6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 180, 30));

        s2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s2ActionPerformed(evt);
            }
        });
        pp1.add(s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 100, 30));

        s4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s4ActionPerformed(evt);
            }
        });
        pp1.add(s4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 270, 30));

        s7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s7ActionPerformed(evt);
            }
        });
        pp1.add(s7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 200, 30));

        s8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s8ActionPerformed(evt);
            }
        });
        pp1.add(s8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, 260, 30));

        s3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s3ActionPerformed(evt);
            }
        });
        pp1.add(s3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 40, 350, 30));

        s5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s5ActionPerformed(evt);
            }
        });
        pp1.add(s5, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 110, 260, 30));

        s9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s9ActionPerformed(evt);
            }
        });
        pp1.add(s9, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 200, 300, 50));

        label1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label1.setText("Email");
        pp1.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 10, -1, -1));

        label2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label2.setText("Passenger Name");
        pp1.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 130, -1));

        label4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label4.setText("Pin Code");
        pp1.add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 60, 20));

        label3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label3.setText("Class");
        pp1.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 40, -1));

        label5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label5.setText("Age");
        pp1.add(label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, -1, -1));

        label6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label6.setText("Phone Number");
        pp1.add(label6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, -1, 20));

        label7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label7.setText("Post Office");
        pp1.add(label7, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 80, -1, -1));

        label8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label8.setText("Gender");
        pp1.add(label8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, -1, -1));

        label9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label9.setText("Country");
        pp1.add(label9, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 90, -1, -1));

        label10.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label10.setText("State");
        pp1.add(label10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, -1, -1));

        label11.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label11.setText("Address");
        pp1.add(label11, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 170, -1, -1));

        label12.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label12.setText("city");
        pp1.add(label12, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 180, -1, -1));

        c3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Afghanistan", "Bangladesh", "Bhutan", "Brunei", "Cambodia", "China", "India", "Indonesia" }));
        c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c3ActionPerformed(evt);
            }
        });
        pp1.add(c3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 110, 190, -1));

        c1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female", "Transgender" }));
        pp1.add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, 150, -1));

        c2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "First Class", "Business Class", "Economy Class" }));
        c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c2ActionPerformed(evt);
            }
        });
        pp1.add(c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 170, -1));

        rSButtonHover4.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonHover4.setForeground(new java.awt.Color(51, 51, 51));
        rSButtonHover4.setText("Insert");
        rSButtonHover4.setColorText(new java.awt.Color(51, 51, 51));
        rSButtonHover4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover4ActionPerformed(evt);
            }
        });
        pp1.add(rSButtonHover4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 120, 150, 50));

        s10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s10ActionPerformed(evt);
            }
        });
        pp1.add(s10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 20, 160, 30));

        s11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s11ActionPerformed(evt);
            }
        });
        pp1.add(s11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 70, 110, 30));

        jPanel1.add(pp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 1430, 280));

        rSMaterialButtonCircle3.setText("X");
        rSMaterialButtonCircle3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonCircle3ActionPerformed(evt);
            }
        });
        jPanel1.add(rSMaterialButtonCircle3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 10, 70, 40));

        rSMaterialButtonCircle4.setText("<--");
        rSMaterialButtonCircle4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonCircle4ActionPerformed(evt);
            }
        });
        jPanel1.add(rSMaterialButtonCircle4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 70, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("** after confirming your data you can't delete and edit");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 350, -1));

        b5.setText("Back to Index");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        jPanel1.add(b5, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 310, -1, -1));

        tx17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx17ActionPerformed(evt);
            }
        });
        jPanel1.add(tx17, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 0, 150, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Account");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 30, -1, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1430, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:
        try
        {
       
        
       Class.forName("com.mysql.cj.jdbc.Driver");
       con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airline_reservation_system?useSSL=false","root","root");
           String deleteid;
           deleteid=tx3.getText();
            String sql="delete from customer_airline where id='"+deleteid+"'";     
      pst=this.con.prepareStatement(sql);
       int i=pst.executeUpdate();
       if(i==1)
       {
        JOptionPane.showConfirmDialog(null, "Deleted Successfully !!!");
       DefaultTableModel obf=(DefaultTableModel)t1.getModel();
       c=obf.getRowCount();
       //System.out.print(c);
        obf.removeRow(j);
        
      new showpassangerdetails(da,sa,user).setVisible(true); 
      this.hide();
      // TODO add your handling code here:
        //b1.setVisible(false);
        //b2.setVisible(false);
        //b3.setVisible(false);
       // b4.setVisible(false);
       } 
       
        }
        catch(Exception e)
        {
            System.out.print(e);
        }
    }//GEN-LAST:event_b3ActionPerformed

    private void tx1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx1ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
         //String unm,pnm,em,phn,add,gen,age,contry,cla,pin,po,city,state,fid;
    

         try
        {
      Class.forName("com.mysql.cj.jdbc.Driver");
      con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airline_reservation_system?useSSL=false","root","root");

          
            idx=tx3.getText();
            String sql="insert into confirm_booking(UserName,passanger_name,age,Email,Ph_no,class,Address,Gender,pin_code,state,post_office,country,city,flightid,customerid,Airline_No,Flight_No,Source,Destination,Departure_time,Arrival_Time,Price,Departure_date,Arrival_date)SELECT ca.UserName,ca.passanger_name,ca.age,ca.Email,ca.Ph_no,ca.class,ca.Address,ca.Gender,ca.pin_code,ca.state,ca.post_office,ca.country,ca.city,ca.flightid,ca.id,fa.Airline_No,fa.Flight_No,fa.Source,fa.Destination,fa.Departure_time,fa.Arrival_Time,fa.Price,fa.Departure_date,fa.Arrival_date FROM customer_airline as ca,flight_airline as fa where ca.id='"+idx+"' and ca.flightid=fa.Id ";

            pst=this.con.prepareStatement(sql);
            int i=pst.executeUpdate();
            if(i==1)
            {
            JOptionPane.showConfirmDialog(null, "booking confirm  Successfully!!!");
            delete();
            }
            else
            JOptionPane.showConfirmDialog(null, "booking confirm unSuccessfull !!!");
        }
        catch(Exception e)
        {
            System.out.print(e);
        }
     
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
        pp1.setVisible(true);
        b1.setVisible(false);
        b2.setVisible(false);
        b3.setVisible(false);
        //b4.setVisible(false);
    }//GEN-LAST:event_b2ActionPerformed

    private void tx2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx2ActionPerformed

    private void t1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t1MouseClicked
        // TODO add your handling code here:
        int rowno=t1.getSelectedRow();
        TableModel model=t1.getModel();
        tx3.setText(model.getValueAt(rowno, 14).toString());
        //t4.setText(model.getValueAt(rowno, 0).toString());
        s1.setText(model.getValueAt(rowno, 1).toString());
        s2.setText(model.getValueAt(rowno, 2).toString());
        s3.setText(model.getValueAt(rowno, 5).toString());
        s4.setText(model.getValueAt(rowno, 4).toString());
        s5.setText(model.getValueAt(rowno, 9).toString());
        s6.setText(model.getValueAt(rowno, 8).toString());
        s7.setText(model.getValueAt(rowno, 10).toString());
        s8.setText(model.getValueAt(rowno, 12).toString());
        s9.setText(model.getValueAt(rowno, 7).toString());
        s10.setText(model.getValueAt(rowno, 0).toString());
        s11.setText(model.getValueAt(rowno, 13).toString());
        c1.setSelectedItem(model.getValueAt(rowno, 3).toString());
        c2.setSelectedItem(model.getValueAt(rowno, 6).toString());
        c3.setSelectedItem(model.getValueAt(rowno,11 ).toString());
        b1.setVisible(true);
        b2.setVisible(true);
        b3.setVisible(true);
        


    }//GEN-LAST:event_t1MouseClicked

    private void s1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s1ActionPerformed

    private void s6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s6ActionPerformed

    private void s2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s2ActionPerformed

    private void s4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s4ActionPerformed

    private void s7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s7ActionPerformed

    private void s8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s8ActionPerformed

    private void s3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s3ActionPerformed

    private void s5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s5ActionPerformed

    private void s9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s9ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
 MessageFormat h=new MessageFormat("i am a header of print page");
 
 MessageFormat f=new MessageFormat("page (1,number,integer)");
 try
 {
     int rowno=t1.getSelectedRow();
        TableModel model=t1.getModel();
  //      tx3.setText(model.getValueAt(rowno, 13).toString());
   //     t4.setText(model.getValueAt(rowno, 0).toString());
  
//     t1.print(JTable.PrintMode.FIT_WIDTH,h,f);
     if(rowno!=0)
            t1.print(JTable.PrintMode.FIT_WIDTH,h,f);
 }
catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
// TODO add your handling code here:
    }//GEN-LAST:event_b4ActionPerformed

    private void c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c3ActionPerformed

    private void c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c2ActionPerformed

    private void rSButtonHover4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover4ActionPerformed
        // TODO add your handling code here:
        String unm,pnm,em,phn,add,gen,age,contry,cla,pin,po,city,state,idf,fid;
        
         try
        {
      Class.forName("com.mysql.cj.jdbc.Driver");
      con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airline_reservation_system?useSSL=false","root","root");

      
           // String unm,pnm,em,phn,add,gen,age,contry,cla,pin,po,city,state,fid;
            unm=s10.getText();
            pnm=s1.getText();
            age=s2.getText();
            em=s3.getText();
            phn=s4.getText();
            city=s8.getText();
            add=s9.getText();
            pin=s6.getText();
            state=s8.getText();
            po=s5.getText();
            contry=c2.getSelectedItem().toString();
            gen=c1.getSelectedItem().toString();
            cla=c3.getSelectedItem().toString();
            idf=tx3.getText();
            fid=s11.getText();
            //id='"+idf+"'
            String sql="update customer_airline set UserName='"+unm+"',passanger_name='"+pnm+"',age='"+age+"',Email='"+em+"',Ph_no='"+phn+"',class='"+cla+"',Address='"+add+"',Gender='"+gen+"',pin_code='"+pin+"',state='"+state+"',post_office='"+po+"',country='"+contry+"',city='"+city+"',flightid='"+fid+"' where id='"+idf+"' ";
//String sql="update Customer_AirLine set passanger_name='"+pnm+"',age='"+age+"',Email='"+em+"',Ph_no='"+phn+"',class='"+cla+"',Address='"+add+"',Gender='"+gen+"',pin_code='"+pin+"',state='"+state+"',post_offic'"+po+"',country='"+contry+"',city='"+city+"')set('"+pnm+"','"+age+"','"+em+"','"+phn+"','"+cla+"','"+add+"','"+gen+"','"+pin+"','"+state+"','"+po+"','"+contry+"','"+city+"',)where id='"+id+"' ";

            pst=this.con.prepareStatement(sql);
            int i=pst.executeUpdate();
            if(i==1)
            {
            JOptionPane.showConfirmDialog(null, "editing Successfully ,!!!");
            pp1.setVisible(false);
            new showpassangerdetails(da,sa,user).setVisible(true); 
            this.hide();
            
            }
            else
            JOptionPane.showConfirmDialog(null, "editing  unSuccessfully !!!");
        }
        catch(Exception e)
        {
            System.out.print(e);
        }
        
    }//GEN-LAST:event_rSButtonHover4ActionPerformed

    private void s10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s10ActionPerformed

    private void s11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s11ActionPerformed

    private void rSMaterialButtonCircle3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_rSMaterialButtonCircle3ActionPerformed

    private void rSMaterialButtonCircle4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle4ActionPerformed
        // TODO add your handling code here:
        String u=t4.getText();
        String i =tx2.getText();
        String date=tx1.getText();
        new flight_booking(i,u,date).setVisible(true);
    }//GEN-LAST:event_rSMaterialButtonCircle4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        // TODO add your handling code here:
         new customer_indexpage(user).setVisible(true);   
         this.hide();
    }//GEN-LAST:event_b5ActionPerformed

    private void tx17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx17ActionPerformed

    private void t4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t4ActionPerformed

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
            java.util.logging.Logger.getLogger(showpassangerdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(showpassangerdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(showpassangerdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(showpassangerdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new showpassangerdetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.complementos.RSButtonHover b1;
    private rojeru_san.complementos.RSButtonHover b2;
    private rojeru_san.complementos.RSButtonHover b3;
    private rojeru_san.complementos.RSButtonHover b4;
    private rojeru_san.complementos.RSButtonHover b5;
    private rojerusan.RSComboMetro c1;
    private rojerusan.RSComboMetro c2;
    private rojerusan.RSComboMetro c3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private java.awt.Label label10;
    private java.awt.Label label11;
    private java.awt.Label label12;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.Label label9;
    private com.jgoodies.looks.plastic.PlasticButtonUI plasticButtonUI1;
    private javax.swing.JPanel pp1;
    private rojeru_san.complementos.RSButtonHover rSButtonHover4;
    private rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle3;
    private rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle4;
    private javax.swing.JTextField s1;
    private javax.swing.JTextField s10;
    private javax.swing.JTextField s11;
    private javax.swing.JTextField s2;
    private javax.swing.JTextField s3;
    private javax.swing.JTextField s4;
    private javax.swing.JTextField s5;
    private javax.swing.JTextField s6;
    private javax.swing.JTextField s7;
    private javax.swing.JTextField s8;
    private javax.swing.JTextField s9;
    private rojeru_san.complementos.RSTableMetro t1;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField tx1;
    private rojeru_san.complementos.RSButtonHover tx17;
    private javax.swing.JTextField tx2;
    private javax.swing.JTextField tx3;
    // End of variables declaration//GEN-END:variables
}
