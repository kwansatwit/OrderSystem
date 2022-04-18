/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package User_Interface;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import ordersystem.Employee;
import ordersystem.EmployeeDB;

/**
 *
 * @author zhangf2, Ahmed Diab
 */
public class EmployeeGUI extends javax.swing.JFrame {
    Employee employee = new Employee();
    String databaseName = "sql5475007";
    String dbUserName = "sql5475007";
    String dbPassword = "avlj8CSFyF";
    
    EmployeeDB employeeDB = null;
   // EmployeeDB addEmp = new EmployeeDB(databaseName, dbUserName, dbPassword);

    // close current page without close the main menu page
    public EmployeeGUI(){
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        userName = new javax.swing.JTextField();
        firstName = new javax.swing.JTextField();
        lastName = new javax.swing.JTextField();
        birth = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        position = new javax.swing.JTextField();
        access = new javax.swing.JTextField();
        BtnAdd = new javax.swing.JButton();
        BtnEdit = new javax.swing.JButton();
        BtnRemove = new javax.swing.JButton();
        BtnReturn = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Username :");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(60, 120, 100, 40);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("First Name :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(60, 190, 120, 40);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Last Name :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(60, 260, 120, 40);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Date of Birth :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 320, 120, 40);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Address :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(60, 380, 90, 40);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Phone :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(440, 120, 80, 40);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Email :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(440, 190, 70, 40);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Position :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(440, 260, 90, 40);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Access :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(440, 320, 80, 40);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Employee Management");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(220, 30, 430, 50);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/admin.png"))); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(100, 30, 62, 70);

        userName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        userName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameActionPerformed(evt);
            }
        });
        jPanel1.add(userName);
        userName.setBounds(200, 120, 190, 31);

        firstName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        firstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameActionPerformed(evt);
            }
        });
        jPanel1.add(firstName);
        firstName.setBounds(200, 190, 190, 31);

        lastName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameActionPerformed(evt);
            }
        });
        jPanel1.add(lastName);
        lastName.setBounds(200, 260, 190, 31);

        birth.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        birth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                birthActionPerformed(evt);
            }
        });
        jPanel1.add(birth);
        birth.setBounds(200, 320, 190, 31);

        address.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });
        jPanel1.add(address);
        address.setBounds(200, 380, 190, 31);

        phone.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });
        jPanel1.add(phone);
        phone.setBounds(540, 120, 190, 31);

        email.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel1.add(email);
        email.setBounds(540, 190, 190, 31);

        position.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        position.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positionActionPerformed(evt);
            }
        });
        jPanel1.add(position);
        position.setBounds(540, 260, 190, 31);

        access.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        access.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accessActionPerformed(evt);
            }
        });
        jPanel1.add(access);
        access.setBounds(540, 330, 190, 31);

        BtnAdd.setBackground(new java.awt.Color(204, 204, 204));
        BtnAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/add.png"))); // NOI18N
        BtnAdd.setText("Add");
        BtnAdd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddActionPerformed(evt);
            }
        });
        jPanel1.add(BtnAdd);
        BtnAdd.setBounds(110, 450, 110, 40);

        BtnEdit.setBackground(new java.awt.Color(204, 204, 204));
        BtnEdit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/edit-validated-icon (1).png"))); // NOI18N
        BtnEdit.setText("Edit");
        BtnEdit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditActionPerformed(evt);
            }
        });
        jPanel1.add(BtnEdit);
        BtnEdit.setBounds(260, 450, 110, 40);

        BtnRemove.setBackground(new java.awt.Color(204, 204, 204));
        BtnRemove.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/cancel.png"))); // NOI18N
        BtnRemove.setText("Remove");
        BtnRemove.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRemoveActionPerformed(evt);
            }
        });
        jPanel1.add(BtnRemove);
        BtnRemove.setBounds(420, 450, 110, 40);

        BtnReturn.setBackground(new java.awt.Color(204, 204, 204));
        BtnReturn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Go-back-icon 1.png"))); // NOI18N
        BtnReturn.setText("Return");
        BtnReturn.setToolTipText("");
        BtnReturn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReturnActionPerformed(evt);
            }
        });
        jPanel1.add(BtnReturn);
        BtnReturn.setBounds(580, 450, 110, 40);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/background3.jpg"))); // NOI18N
        background.setText("jLabel1");
        jPanel1.add(background);
        background.setBounds(0, 0, 790, 520);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 789, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameActionPerformed
      
    }//GEN-LAST:event_firstNameActionPerformed

    private void accessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accessActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accessActionPerformed

    private void BtnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReturnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_BtnReturnActionPerformed

    private void BtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddActionPerformed
        // TODO add your handling code here:
        EmployeeGUI employeeGUI = new EmployeeGUI();
        String first_name = firstName.getText();
        String last_name = lastName.getText();
        String date_of_birth = birth.getText();
        String addr = address.getText();
        String phone_number = phone.getText();
        String e = email.getText();
        String pos = position.getText();
        int acc = Integer.parseInt(access.getText());
        
        
        
        employee.setFirstName(first_name);
        employee.setLastName(last_name);
        employee.setDateOfBirth(date_of_birth);
        employee.setAddress(addr);
        employee.setPhoneNumber(phone_number);
        employee.setEmail(e);
        employee.setPosition(pos);
        employee.setAccess(acc);
        employee.generateUsername();
        employee.generatePassword();
        
        try {
            EmployeeDB addEmp = new EmployeeDB(databaseName, dbUserName, dbPassword);
            addEmp.addEmployee(employee);
            //System.out.println("The Employee was added to the database successfully");
            JOptionPane.showMessageDialog(this,"Employee has been created successfully" + "\n" +
                    "Username: " + employee.getUserName() + "\n" +
                    "Password: " + employee.getPassword());
            //employeeGUI.setVisible(false);
            firstName.setText("");
            lastName.setText("");
            birth.setText("");
            address.setText("");
            phone.setText("");
            email.setText("");
            position.setText("");
            access.setText("");
            firstName.setText("");
        } catch (Exception ex) {
            Logger.getLogger(EmployeeGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnAddActionPerformed

    private void lastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameActionPerformed

    private void birthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_birthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_birthActionPerformed

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void positionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_positionActionPerformed

    private void BtnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnEditActionPerformed

    private void BtnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRemoveActionPerformed
        // TODO add your handling code here:
        
        String username = userName.getText();
        
        employeeDB = new EmployeeDB(databaseName, dbUserName, dbPassword);
        
        try {
            System.out.println(username);
            employeeDB.deleteEmployee(username);
            JOptionPane.showMessageDialog(this,"Employee has been deleted from the database.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,"There is no employee with this username.");
            Logger.getLogger(EmployeeGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnRemoveActionPerformed

    private void userNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameActionPerformed

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
            java.util.logging.Logger.getLogger(EmployeeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAdd;
    private javax.swing.JButton BtnEdit;
    private javax.swing.JButton BtnRemove;
    private javax.swing.JButton BtnReturn;
    private javax.swing.JTextField access;
    private javax.swing.JTextField address;
    private javax.swing.JLabel background;
    private javax.swing.JTextField birth;
    private javax.swing.JTextField email;
    private javax.swing.JTextField firstName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lastName;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField position;
    private javax.swing.JTextField userName;
    // End of variables declaration//GEN-END:variables
}
