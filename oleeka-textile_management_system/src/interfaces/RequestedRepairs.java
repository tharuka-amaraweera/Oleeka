/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import javax.swing.JFrame;

/**
 *
 * @author prabhavi
 */
public class RequestedRepairs extends javax.swing.JFrame {

    /**
     * Creates new form RequestedRepairs
     */
    public RequestedRepairs() {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        back = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Title = new javax.swing.JTextField();
        Name = new javax.swing.JTextField();
        Department = new javax.swing.JTextField();
        Date = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        SerialNum = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        GetApproval = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(22, 63, 130));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(20, 41, 77));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/appbar.close.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 10, 70, 20));
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 40));

        jLabel5.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Welcome");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/appbar.chevron.down.png"))); // NOI18N
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        jPanel2.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 10, 60, 20));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/appbar.circle.growth.png"))); // NOI18N
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 40));

        jPanel3.setBackground(new java.awt.Color(20, 41, 77));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/appbar.arrow.left.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        jPanel4.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 50, 20));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 40));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/rsz_4.png"))); // NOI18N
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 140, 150));

        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/appbar.home.png"))); // NOI18N
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });
        jPanel3.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 60, 40));

        jLabel18.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Home");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 190, 580));

        jPanel5.setBackground(new java.awt.Color(255, 102, 0));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Requested Repairs");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 940, 40));

        jPanel6.setBackground(new java.awt.Color(22, 63, 130));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        jLabel11.setText("Type of Request");
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jLabel10.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        jLabel10.setText("Serial Number");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        jLabel9.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        jLabel9.setText("Date");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jLabel8.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        jLabel8.setText("Department");
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jLabel7.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        jLabel7.setText("Requestor's Name");
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel6.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        jLabel6.setText("Equipment Name");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 130, -1));
        jPanel6.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 140, -1));

        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });
        jPanel6.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 140, -1));
        jPanel6.add(Department, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 140, -1));
        jPanel6.add(Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 140, -1));

        jRadioButton1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        jRadioButton1.setText("Electrical");
        jPanel6.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 100, -1));

        jRadioButton2.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        jRadioButton2.setText("Carpentary");
        jPanel6.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 100, -1));

        jRadioButton3.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        jRadioButton3.setText("Glasswork");
        jPanel6.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 100, -1));

        jRadioButton4.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        jRadioButton4.setText("Other");
        jPanel6.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 100, -1));

        jCheckBox1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        jCheckBox1.setText("Urgent");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel6.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 120, -1));

        jCheckBox2.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        jCheckBox2.setText("Should be done soon");
        jPanel6.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, -1, -1));

        jCheckBox3.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        jCheckBox3.setText("Can wait until season");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        jPanel6.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, -1, -1));
        jPanel6.add(SerialNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 140, -1));

        jButton1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        jButton1.setText("Submit");
        jPanel6.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, 90, 50));

        Clear.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        jPanel6.add(Clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 390, 90, 50));

        GetApproval.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        GetApproval.setText("Get Approval");
        GetApproval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GetApprovalActionPerformed(evt);
            }
        });
        jPanel6.add(GetApproval, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, -1, 50));

        jLabel12.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        jLabel12.setText("Title");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 60, -1));

        jCheckBox4.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        jCheckBox4.setText("Hangers");
        jPanel6.add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 130, -1));

        jCheckBox5.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        jCheckBox5.setText("Security System");
        jPanel6.add(jCheckBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, -1, -1));

        jCheckBox6.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        jCheckBox6.setText("Cashier Machine");
        jPanel6.add(jCheckBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, -1, -1));

        jCheckBox7.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        jCheckBox7.setText("Air Conditions");
        jPanel6.add(jCheckBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, 130, -1));

        jCheckBox8.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        jCheckBox8.setText("Mirrors");
        jPanel6.add(jCheckBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 230, 130, -1));

        jCheckBox9.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        jCheckBox9.setText("Clothing Racks");
        jPanel6.add(jCheckBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, 130, -1));

        jCheckBox10.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        jCheckBox10.setText("Cash register");
        jPanel6.add(jCheckBox10, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, 130, -1));

        jCheckBox11.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        jCheckBox11.setText("Other");
        jPanel6.add(jCheckBox11, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, 130, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/appbar.notification.png"))); // NOI18N
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 20, 60, 30));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 890, 490));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
       
    }//GEN-LAST:event_ClearActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void GetApprovalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GetApprovalActionPerformed
       Approvalform a1= new Approvalform();
       a1.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_GetApprovalActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
       Maintenance m1= new Maintenance();
       m1.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
         Main_menu m1 = new Main_menu();
        m1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeMouseClicked

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
            java.util.logging.Logger.getLogger(RequestedRepairs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RequestedRepairs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RequestedRepairs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RequestedRepairs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RequestedRepairs().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JTextField Date;
    private javax.swing.JTextField Department;
    private javax.swing.JButton GetApproval;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField SerialNum;
    private javax.swing.JTextField Title;
    private javax.swing.JLabel back;
    private javax.swing.JLabel home;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JLabel minimize;
    // End of variables declaration//GEN-END:variables
}
