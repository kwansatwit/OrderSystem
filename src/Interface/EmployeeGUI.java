package Interface;

public class EmployeeGUI extends javax.swing.JFrame {

    public EmployeeGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        button_add = new javax.swing.JButton();
        button_edit = new javax.swing.JButton();
        button_remove = new javax.swing.JButton();
        return_menu = new javax.swing.JButton();
        firstName = new javax.swing.JTextField();
        lastName = new javax.swing.JTextField();
        brith = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        position = new javax.swing.JTextField();
        access = new javax.swing.JTextField();
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
        backgroud = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        button_add.setBackground(new java.awt.Color(204, 204, 204));
        button_add.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        button_add.setText("Add");
        button_add.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        button_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_addActionPerformed(evt);
            }
        });
        jPanel1.add(button_add);
        button_add.setBounds(40, 420, 90, 40);

        button_edit.setBackground(new java.awt.Color(204, 204, 204));
        button_edit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        button_edit.setText("Edit");
        button_edit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        button_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_editActionPerformed(evt);
            }
        });
        jPanel1.add(button_edit);
        button_edit.setBounds(190, 420, 90, 40);

        button_remove.setBackground(new java.awt.Color(204, 204, 204));
        button_remove.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        button_remove.setText("Remove");
        button_remove.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        button_remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_removeActionPerformed(evt);
            }
        });
        jPanel1.add(button_remove);
        button_remove.setBounds(340, 420, 90, 40);

        return_menu.setBackground(new java.awt.Color(204, 204, 204));
        return_menu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        return_menu.setText("Return");
        return_menu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        return_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                return_menuActionPerformed(evt);
            }
        });
        jPanel1.add(return_menu);
        return_menu.setBounds(490, 420, 100, 40);

        firstName.setBackground(new java.awt.Color(204, 204, 204));
        firstName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        firstName.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        firstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameActionPerformed(evt);
            }
        });
        jPanel1.add(firstName);
        firstName.setBounds(150, 110, 140, 30);

        lastName.setBackground(new java.awt.Color(204, 204, 204));
        lastName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lastName.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        lastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameActionPerformed(evt);
            }
        });
        jPanel1.add(lastName);
        lastName.setBounds(150, 180, 140, 30);

        brith.setBackground(new java.awt.Color(204, 204, 204));
        brith.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        brith.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        brith.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brithActionPerformed(evt);
            }
        });
        jPanel1.add(brith);
        brith.setBounds(150, 240, 140, 30);

        address.setBackground(new java.awt.Color(204, 204, 204));
        address.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        address.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });
        jPanel1.add(address);
        address.setBounds(150, 310, 140, 30);

        phone.setBackground(new java.awt.Color(204, 204, 204));
        phone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        phone.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });
        jPanel1.add(phone);
        phone.setBounds(450, 110, 140, 30);

        email.setBackground(new java.awt.Color(204, 204, 204));
        email.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        email.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel1.add(email);
        email.setBounds(450, 180, 140, 30);

        position.setBackground(new java.awt.Color(204, 204, 204));
        position.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        position.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        position.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positionActionPerformed(evt);
            }
        });
        jPanel1.add(position);
        position.setBounds(450, 240, 140, 30);

        access.setBackground(new java.awt.Color(204, 204, 204));
        access.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        access.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        access.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accessActionPerformed(evt);
            }
        });
        jPanel1.add(access);
        access.setBounds(450, 310, 140, 30);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("First Name :");
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 110, 90, 30);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Last Name :");
        jLabel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 180, 90, 30);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Date of Brith :");
        jLabel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 240, 110, 30);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Address :");
        jLabel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(jLabel4);
        jLabel4.setBounds(60, 310, 80, 30);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Phone :");
        jLabel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(jLabel5);
        jLabel5.setBounds(380, 110, 70, 30);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Email :");
        jLabel6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(jLabel6);
        jLabel6.setBounds(380, 180, 90, 30);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Position :");
        jLabel7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(jLabel7);
        jLabel7.setBounds(360, 240, 90, 30);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Access :");
        jLabel8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(jLabel8);
        jLabel8.setBounds(370, 310, 70, 30);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/admin.png"))); // NOI18N
        jLabel9.setText("jLabel9");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(510, 20, 90, 70);

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Employee Management");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(160, 40, 310, 30);

        backgroud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/background3.jpg"))); // NOI18N
        jPanel1.add(backgroud);
        backgroud.setBounds(0, 0, 640, 520);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void button_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_addActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_addActionPerformed

    private void firstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameActionPerformed

    private void brithActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brithActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brithActionPerformed

    private void lastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameActionPerformed

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

    private void accessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accessActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accessActionPerformed

    private void button_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_editActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_editActionPerformed

    private void button_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_removeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_removeActionPerformed

    private void return_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_return_menuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_return_menuActionPerformed

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
    private javax.swing.JTextField access;
    private javax.swing.JTextField address;
    private javax.swing.JLabel backgroud;
    private javax.swing.JTextField brith;
    private javax.swing.JButton button_add;
    private javax.swing.JButton button_edit;
    private javax.swing.JButton button_remove;
    private javax.swing.JTextField email;
    private javax.swing.JTextField firstName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JButton return_menu;
    // End of variables declaration//GEN-END:variables
}
