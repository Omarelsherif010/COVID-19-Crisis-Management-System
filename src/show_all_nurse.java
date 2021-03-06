
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmed Hosny
 */
public class show_all_nurse extends javax.swing.JFrame {

    /**
     * Creates new form show_all_nurse
     */
    
    DefaultTableModel dm;
    Connection con;
    ArrayList<Integer> doc_ids = new ArrayList<>();
    public show_all_nurse() {
        initComponents();
       this.setLocationRelativeTo(null);
        dm = new DefaultTableModel();
           dm.addColumn("ID");
            dm.addColumn("Name");
            dm.addColumn("Nation ID");
            dm.addColumn("Gender");
            dm.addColumn("Age");
            dm.addColumn("Phone");
            dm.addColumn("Address");
            
          try {
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clinic", "root", "ahmedhosny12345");
         } catch (SQLException ex) {
            Logger.getLogger(show_all_doctor.class.getName()).log(Level.SEVERE, null, ex);
        }   
          filldata();
    }
    
    
    private void filldata(){
    
          try {
            dm.setRowCount(0);
            PreparedStatement stm = con.prepareStatement("select * from nurse");
            ResultSet res = stm.executeQuery();     
            while(res.next()){
               doc_ids.add(res.getInt(1));
               String[] data = {res.getString(1),res.getString(2), res.getString(3), res.getString(4), res.getString(5),res.getString(6),res.getString(7)};
                dm.addRow(data);
            }
            show_data.setModel(dm);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"erorr");
            Logger.getLogger(show_all_doctor.class.getName()).log(Level.SEVERE, null, ex);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        show_data = new javax.swing.JTable();
        back = new javax.swing.JButton();
        rbtn_male = new javax.swing.JRadioButton();
        rbtn_femal = new javax.swing.JRadioButton();
        emp_update = new javax.swing.JButton();
        emp_delete = new javax.swing.JButton();
        id = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NURSE NAME");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 37, 180, 30));

        name.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        name.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 1, true));
        jPanel2.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 26, 338, 41));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NATION ID");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 95, 171, 31));

        age.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        age.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 1, true));
        jPanel2.add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 203, 336, 45));

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("NURSE phone");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 171, 33));

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("NURSE GENDER");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 163, 200, -1));

        show_data.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        show_data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nurse Name", "Nation ID", "GENDER", "AGE", "PHONE", "ADDRESS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        show_data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                show_dataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(show_data);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 425, 950, 250));

        back.setBackground(new java.awt.Color(204, 204, 204));
        back.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel2.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 710, 226, 50));

        buttonGroup1.add(rbtn_male);
        rbtn_male.setFont(new java.awt.Font("Tahoma", 3, 22)); // NOI18N
        rbtn_male.setForeground(new java.awt.Color(255, 255, 255));
        rbtn_male.setSelected(true);
        rbtn_male.setText("Male");
        jPanel2.add(rbtn_male, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 144, 95, -1));

        buttonGroup1.add(rbtn_femal);
        rbtn_femal.setFont(new java.awt.Font("Tahoma", 3, 22)); // NOI18N
        rbtn_femal.setForeground(new java.awt.Color(255, 255, 255));
        rbtn_femal.setText("Female");
        jPanel2.add(rbtn_femal, new org.netbeans.lib.awtextra.AbsoluteConstraints(818, 144, 120, -1));

        emp_update.setBackground(new java.awt.Color(204, 204, 204));
        emp_update.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        emp_update.setText("Update");
        emp_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emp_updateActionPerformed(evt);
            }
        });
        jPanel2.add(emp_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 710, 232, 50));

        emp_delete.setBackground(new java.awt.Color(204, 204, 204));
        emp_delete.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        emp_delete.setText("Delete");
        emp_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emp_deleteActionPerformed(evt);
            }
        });
        jPanel2.add(emp_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 710, 237, 50));

        id.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        id.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 1, true));
        jPanel2.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 85, 338, 41));

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("NURSE Age");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 171, 33));

        phone.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        phone.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 1, true));
        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });
        jPanel2.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 266, 336, 45));

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 22)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Address");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 171, 33));

        address.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        address.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 1, true));
        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });
        jPanel2.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 329, 336, 45));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home.jpg"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1090, 830));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 774, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void show_dataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_show_dataMouseClicked

         name.setText(show_data.getValueAt(show_data.getSelectedRow(), 1).toString());
        id.setText(show_data.getValueAt(show_data.getSelectedRow(), 2).toString());
        String gender = show_data.getValueAt(show_data.getSelectedRow(), 3).toString();
        if ("Male".equals(gender)) {
            rbtn_male.setSelected(true);
            }
        else {
            rbtn_femal.setSelected(true);
        }
//
        age.setText(show_data.getValueAt(show_data.getSelectedRow(), 4).toString());
        phone.setText(show_data.getValueAt(show_data.getSelectedRow(), 5).toString());
        address.setText(show_data.getValueAt(show_data.getSelectedRow(), 6).toString());
        
    }//GEN-LAST:event_show_dataMouseClicked

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.setVisible(false);
        homeForAdmin l = new homeForAdmin();
        l.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

    private void emp_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emp_updateActionPerformed

           try {
                String name = this.name.getText();
                String nation = id.getText();
                String gender;
                if (rbtn_male.isSelected()) {
                    gender = "Male";
                } else {
                    gender = "Femal";
                }
                 int age = Integer.parseInt(this.age.getText());             
                String addr = address.getText();
                String pho = phone.getText();
                PreparedStatement stmt = con.prepareStatement("update nurse set nurse_name=?,nurrse_nation=?,nurse_gender=?,nurse_age=?,nurse_phone=?,nurse_address=? where nurse_id=?");
                stmt.setString(1, name);
                stmt.setString(2, nation);
                stmt.setString(3, gender);
                  stmt.setInt(4, age);
                  stmt.setString(5, pho);
                   stmt.setString(6, addr);                  
                    stmt.setInt(7, doc_ids.get(show_data.getSelectedRow()));
                int res = stmt.executeUpdate();
                if (res > 0) {
                    JOptionPane.showMessageDialog(this, "Successed updated");
                    filldata();
                } else {
                    JOptionPane.showMessageDialog(this, "Faild insert");
                }

// TODO add your handling code here:
            } catch (SQLException ex) {
                Logger.getLogger(show_all_doctor.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_emp_updateActionPerformed

    private void emp_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emp_deleteActionPerformed
        
         try {
            // TODO add your handling code here           

            PreparedStatement stmt = con.prepareStatement("delete from nurse where nurse_id=?");
            stmt.setInt(1, doc_ids.get(show_data.getSelectedRow()));
            int res = stmt.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(this, "Successed deleted");
                filldata();
            } else {
                JOptionPane.showMessageDialog(this, "Faild deleted");
            }

        } catch (SQLException ex) {
            Logger.getLogger(show_all_doctor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_emp_deleteActionPerformed

    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneActionPerformed

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

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
            java.util.logging.Logger.getLogger(show_all_nurse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(show_all_nurse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(show_all_nurse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(show_all_nurse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new show_all_nurse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JTextField age;
    private javax.swing.JButton back;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton emp_delete;
    private javax.swing.JButton emp_update;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField phone;
    private javax.swing.JRadioButton rbtn_femal;
    private javax.swing.JRadioButton rbtn_male;
    private javax.swing.JTable show_data;
    // End of variables declaration//GEN-END:variables
}
