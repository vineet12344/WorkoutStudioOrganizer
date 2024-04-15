package gympackage;
import java.sql.*;
import javax.swing.*;

public class MgrPanel extends javax.swing.JFrame {
Connection conn=null;
PreparedStatement pst=null;
ResultSet rs=null;
String thisuser=Login.username;


    public MgrPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabs = new javax.swing.JTabbedPane();
        hometab = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        homecontent = new javax.swing.JLabel();
        homebackground = new javax.swing.JLabel();
        custtab = new javax.swing.JPanel();
        addcustomer = new javax.swing.JButton();
        viewcustomer = new javax.swing.JButton();
        custbackground = new javax.swing.JLabel();
        equiptab = new javax.swing.JPanel();
        addequipment = new javax.swing.JButton();
        viewequipment = new javax.swing.JButton();
        equipbackground = new javax.swing.JLabel();
        memtab = new javax.swing.JPanel();
        viewmembership = new javax.swing.JButton();
        upgrademembership = new javax.swing.JButton();
        membackground = new javax.swing.JLabel();
        paytab = new javax.swing.JPanel();
        viewpayment = new javax.swing.JButton();
        acceptpayment = new javax.swing.JButton();
        paybackground = new javax.swing.JLabel();
        stafftab = new javax.swing.JPanel();
        viewstaff = new javax.swing.JButton();
        addstaff = new javax.swing.JButton();
        staffbackground = new javax.swing.JLabel();
        classtab = new javax.swing.JPanel();
        viewclass = new javax.swing.JButton();
        addclass = new javax.swing.JButton();
        classbackground = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        gymnametitle = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabs.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        tabs.setFont(new java.awt.Font("Segoe Print", 1, 17)); // NOI18N

        hometab.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N

        jPanel2.setLayout(null);

        homecontent.setFont(new java.awt.Font("Javanese Text", 1, 36)); // NOI18N
        homecontent.setForeground(new java.awt.Color(255, 255, 255));
        homecontent.setText("WELCOME TO WORKOUT STUDIO");
        jPanel2.add(homecontent);
        homecontent.setBounds(240, 80, 840, 82);

        homebackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gympackage/image/bg3.jpg"))); // NOI18N
        jPanel2.add(homebackground);
        homebackground.setBounds(0, 30, 1090, 500);

        javax.swing.GroupLayout hometabLayout = new javax.swing.GroupLayout(hometab);
        hometab.setLayout(hometabLayout);
        hometabLayout.setHorizontalGroup(
            hometabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hometabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1097, Short.MAX_VALUE)
                .addContainerGap())
        );
        hometabLayout.setVerticalGroup(
            hometabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hometabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        tabs.addTab("Home", hometab);

        custtab.setLayout(null);

        addcustomer.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addcustomer.setText("Add  Customer");
        addcustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addcustomerActionPerformed(evt);
            }
        });
        custtab.add(addcustomer);
        addcustomer.setBounds(610, 460, 221, 63);

        viewcustomer.setBackground(new java.awt.Color(204, 204, 255));
        viewcustomer.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewcustomer.setText("View Customers");
        viewcustomer.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        viewcustomer.setOpaque(false);
        viewcustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewcustomerActionPerformed(evt);
            }
        });
        custtab.add(viewcustomer);
        viewcustomer.setBounds(290, 460, 221, 63);

        custbackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gympackage/image/bg6.jpg"))); // NOI18N
        custtab.add(custbackground);
        custbackground.setBounds(10, 20, 1070, 510);

        tabs.addTab("Customers", custtab);

        equiptab.setLayout(null);

        addequipment.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addequipment.setText("Add Equipment");
        addequipment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addequipmentActionPerformed(evt);
            }
        });
        equiptab.add(addequipment);
        addequipment.setBounds(590, 120, 229, 50);

        viewequipment.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewequipment.setText("View Equipments");
        viewequipment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewequipmentActionPerformed(evt);
            }
        });
        equiptab.add(viewequipment);
        viewequipment.setBounds(300, 120, 229, 50);

        equipbackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gympackage/image/bg2.jpg"))); // NOI18N
        equiptab.add(equipbackground);
        equipbackground.setBounds(10, 30, 1100, 520);

        tabs.addTab("Equipments", equiptab);

        memtab.setLayout(null);

        viewmembership.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewmembership.setText("View Membership");
        viewmembership.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewmembershipActionPerformed(evt);
            }
        });
        memtab.add(viewmembership);
        viewmembership.setBounds(280, 430, 240, 63);

        upgrademembership.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        upgrademembership.setText("Upgrade Membership");
        upgrademembership.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upgrademembershipActionPerformed(evt);
            }
        });
        memtab.add(upgrademembership);
        upgrademembership.setBounds(610, 430, 240, 63);

        membackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gympackage/image/bg7.jpg"))); // NOI18N
        memtab.add(membackground);
        membackground.setBounds(10, 20, 1100, 550);

        tabs.addTab("Membership", memtab);

        paytab.setLayout(null);

        viewpayment.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewpayment.setText("View Payment");
        viewpayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewpaymentActionPerformed(evt);
            }
        });
        paytab.add(viewpayment);
        viewpayment.setBounds(310, 360, 222, 63);

        acceptpayment.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        acceptpayment.setText("Accept Payment");
        acceptpayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptpaymentActionPerformed(evt);
            }
        });
        paytab.add(acceptpayment);
        acceptpayment.setBounds(620, 360, 222, 66);

        paybackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gympackage/image/bg11.jpg"))); // NOI18N
        paytab.add(paybackground);
        paybackground.setBounds(11, 20, 1080, 550);

        tabs.addTab("Payment", paytab);

        stafftab.setLayout(null);

        viewstaff.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewstaff.setText("View Staff");
        viewstaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewstaffActionPerformed(evt);
            }
        });
        stafftab.add(viewstaff);
        viewstaff.setBounds(320, 450, 204, 65);

        addstaff.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addstaff.setText("Add Staff");
        addstaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addstaffActionPerformed(evt);
            }
        });
        stafftab.add(addstaff);
        addstaff.setBounds(580, 450, 204, 65);

        staffbackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gympackage/image/bg12.jpg"))); // NOI18N
        stafftab.add(staffbackground);
        staffbackground.setBounds(11, 10, 1100, 570);

        tabs.addTab("Staff", stafftab);

        classtab.setLayout(null);

        viewclass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewclass.setText("View Class");
        viewclass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewclassActionPerformed(evt);
            }
        });
        classtab.add(viewclass);
        viewclass.setBounds(290, 380, 202, 65);

        addclass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addclass.setText("Add Class");
        addclass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addclassActionPerformed(evt);
            }
        });
        classtab.add(addclass);
        addclass.setBounds(620, 380, 202, 58);

        classbackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gympackage/image/bg17.jpg"))); // NOI18N
        classtab.add(classbackground);
        classbackground.setBounds(10, 20, 1100, 550);

        tabs.addTab("Class", classtab);

        header.setBackground(new java.awt.Color(255, 255, 255));

        gymnametitle.setBackground(new java.awt.Color(255, 255, 255));
        gymnametitle.setFont(new java.awt.Font("Viner Hand ITC", 3, 36)); // NOI18N
        gymnametitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gympackage/image/gymlogo.jpg"))); // NOI18N
        gymnametitle.setText("Workout Studio Organizer");

        logout.setBackground(new java.awt.Color(204, 153, 255));
        logout.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        logout.setText("LOG OUT");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Viner Hand ITC", 1, 14)); // NOI18N
        jLabel2.setText("....A moto to change");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(gymnametitle, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(gymnametitle, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 22, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        Login w=new Login();
        w.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void addclassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addclassActionPerformed
        CreateClass w=new CreateClass();
        w.setVisible(true);
    }//GEN-LAST:event_addclassActionPerformed

    private void viewclassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewclassActionPerformed
        ViewClass w=new ViewClass();
        w.setVisible(true);
    }//GEN-LAST:event_viewclassActionPerformed

    private void addstaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addstaffActionPerformed
        AddStaff w=new AddStaff();
        w.setVisible(true);
    }//GEN-LAST:event_addstaffActionPerformed

    private void viewstaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewstaffActionPerformed
        ViewStaff w= new ViewStaff();
        w.setVisible(true);
    }//GEN-LAST:event_viewstaffActionPerformed

    private void acceptpaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptpaymentActionPerformed
        AcceptPayment w=new AcceptPayment();
        w.setVisible(true);
    }//GEN-LAST:event_acceptpaymentActionPerformed

    private void viewpaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewpaymentActionPerformed
        ViewPayment w=new ViewPayment();
        w.setVisible(true);
    }//GEN-LAST:event_viewpaymentActionPerformed

    private void upgrademembershipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upgrademembershipActionPerformed
        UpgradeMembership w=new UpgradeMembership();
        w.setVisible(true);
    }//GEN-LAST:event_upgrademembershipActionPerformed

    private void viewmembershipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewmembershipActionPerformed
        ViewMembership w=new ViewMembership();
        w.setVisible(true);
    }//GEN-LAST:event_viewmembershipActionPerformed

    private void viewequipmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewequipmentActionPerformed
        ViewEquipment w=new ViewEquipment();
        w.setVisible(true);
    }//GEN-LAST:event_viewequipmentActionPerformed

    private void addequipmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addequipmentActionPerformed
        AddEquipment w=new AddEquipment();
        w.setVisible(true);
    }//GEN-LAST:event_addequipmentActionPerformed

    private void viewcustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewcustomerActionPerformed
        ViewCustomer w=new ViewCustomer();
        w.setVisible(true);
    }//GEN-LAST:event_viewcustomerActionPerformed

    private void addcustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addcustomerActionPerformed
        AddCustomer w=new AddCustomer();
        w.setVisible(true);
    }//GEN-LAST:event_addcustomerActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MgrPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptpayment;
    private javax.swing.JButton addclass;
    private javax.swing.JButton addcustomer;
    private javax.swing.JButton addequipment;
    private javax.swing.JButton addstaff;
    private javax.swing.JLabel classbackground;
    private javax.swing.JPanel classtab;
    private javax.swing.JLabel custbackground;
    private javax.swing.JPanel custtab;
    private javax.swing.JLabel equipbackground;
    private javax.swing.JPanel equiptab;
    private javax.swing.JLabel gymnametitle;
    private javax.swing.JPanel header;
    private javax.swing.JLabel homebackground;
    private javax.swing.JLabel homecontent;
    private javax.swing.JPanel hometab;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logout;
    private javax.swing.JLabel membackground;
    private javax.swing.JPanel memtab;
    private javax.swing.JLabel paybackground;
    private javax.swing.JPanel paytab;
    private javax.swing.JLabel staffbackground;
    private javax.swing.JPanel stafftab;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JButton upgrademembership;
    private javax.swing.JButton viewclass;
    private javax.swing.JButton viewcustomer;
    private javax.swing.JButton viewequipment;
    private javax.swing.JButton viewmembership;
    private javax.swing.JButton viewpayment;
    private javax.swing.JButton viewstaff;
    // End of variables declaration//GEN-END:variables
}
