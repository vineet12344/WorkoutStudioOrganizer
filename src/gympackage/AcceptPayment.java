
package gympackage;
import java.sql.*;
import java.util.Calendar;
import javax.swing.*;

public class AcceptPayment extends javax.swing.JFrame {
Connection conn=null;
PreparedStatement pst=null;
ResultSet rs=null;

    public AcceptPayment() {
        initComponents();
        getCustomerName();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        custname = new javax.swing.JLabel();
        money = new javax.swing.JLabel();
        jtxtMoney = new javax.swing.JTextField();
        jbtnReset = new javax.swing.JButton();
        jbtnSubmit = new javax.swing.JButton();
        jtxtmode = new javax.swing.JTextField();
        mode = new javax.swing.JLabel();
        header = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jComboboxname = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        body.setBackground(new java.awt.Color(51, 204, 255));
        body.setForeground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        custname.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        custname.setText("Customer Name");
        body.add(custname, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 184, 173, 37));

        money.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        money.setText("Amount");
        body.add(money, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 265, 112, 35));

        jtxtMoney.setBackground(new java.awt.Color(204, 255, 204));
        jtxtMoney.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtxtMoney.setBorder(null);
        body.add(jtxtMoney, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 264, 175, 36));

        jbtnReset.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtnReset.setText("Reset");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });
        body.add(jbtnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 462, 97, 36));

        jbtnSubmit.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtnSubmit.setText("Submit");
        jbtnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSubmitActionPerformed(evt);
            }
        });
        body.add(jbtnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 462, -1, 36));

        jtxtmode.setBackground(new java.awt.Color(204, 255, 204));
        jtxtmode.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        body.add(jtxtmode, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 347, 175, 36));

        mode.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        mode.setText("Mode Of Payment");
        body.add(mode, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 347, -1, 36));

        header.setFont(new java.awt.Font("Cambria Math", 1, 48)); // NOI18N
        header.setText("ACCEPT PAYMETS");
        body.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 53, -1, 81));

        back.setText("<<Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        body.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(819, 574, -1, -1));

        jComboboxname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboboxname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboboxnameActionPerformed(evt);
            }
        });
        body.add(jComboboxname, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 184, 175, 37));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
        jtxtMoney.setText(null);
        jComboboxname.setSelectedIndex(0);
    }//GEN-LAST:event_jbtnResetActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void jbtnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSubmitActionPerformed
        conn=MysqlConnect.ConnectDB();
        java.sql.Date today= new java.sql.Date(Calendar.getInstance().getTime().getTime());
        String Sql="update payment set Amount=Amount-?,LastDateOfPayment=?,ModeOfPayment=? where CID=(Select CID from customer where CName=?)";
        try{
            pst=conn.prepareStatement(Sql);
            pst.setString(1,jtxtMoney.getText());
            pst.setDate(2,today);
            pst.setString(3,jtxtmode.getText());
            pst.setString(4,jComboboxname.getSelectedItem().toString());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Entry Successful...!");
            this.dispose();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jbtnSubmitActionPerformed

    private void jComboboxnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboboxnameActionPerformed

    }//GEN-LAST:event_jComboboxnameActionPerformed

    public void getCustomerName(){
        conn=MysqlConnect.ConnectDB();
        String Sql="select * from customer";
        try{
            pst=conn.prepareStatement(Sql);
            rs=pst.executeQuery();
            while(rs.next()){
                String hello= rs.getString("CName");
                jComboboxname.addItem(hello);
            }
            //JOptionPane.showMessageDialog(null,"Entry Successful...!");
            this.dispose();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AcceptPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AcceptPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AcceptPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AcceptPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }



        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AcceptPayment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JPanel body;
    private javax.swing.JLabel custname;
    private javax.swing.JLabel header;
    private javax.swing.JComboBox<String> jComboboxname;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JButton jbtnSubmit;
    private javax.swing.JTextField jtxtMoney;
    private javax.swing.JTextField jtxtmode;
    private javax.swing.JLabel mode;
    private javax.swing.JLabel money;
    // End of variables declaration//GEN-END:variables
}
