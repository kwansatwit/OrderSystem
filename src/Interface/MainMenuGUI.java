package Interface;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;

public class MainMenuGUI extends javax.swing.JFrame {

    public MainMenuGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_menu = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        button_sandwich = new javax.swing.JButton();
        button_pizza = new javax.swing.JButton();
        button_dishes = new javax.swing.JButton();
        button_drinks = new javax.swing.JButton();
        button_dessert = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_menu = new javax.swing.JTable();
        phoneNum_check = new javax.swing.JTextField();
        button_check = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        button_saveOrder = new javax.swing.JButton();
        button_employeeM = new javax.swing.JButton();
        button_logOut = new javax.swing.JButton();
        button_print = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        customerInfo = new javax.swing.JTextArea();
        button_itemM = new javax.swing.JButton();
        backgroud = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel_menu.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        jLabel_menu.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/addItem.png"))); // NOI18N
        jLabel_menu.setText("   Order  Menu");
        jPanel1.add(jLabel_menu);
        jLabel_menu.setBounds(60, 30, 430, 90);

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));

        button_sandwich.setBackground(new java.awt.Color(204, 204, 204));
        button_sandwich.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        button_sandwich.setForeground(new java.awt.Color(51, 51, 255));
        button_sandwich.setText("Sandwich");
        button_sandwich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_sandwichActionPerformed(evt);
            }
        });

        button_pizza.setBackground(new java.awt.Color(204, 204, 204));
        button_pizza.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        button_pizza.setForeground(new java.awt.Color(51, 51, 255));
        button_pizza.setText("Pizza");
        button_pizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_pizzaActionPerformed(evt);
            }
        });

        button_dishes.setBackground(new java.awt.Color(204, 204, 204));
        button_dishes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        button_dishes.setForeground(new java.awt.Color(51, 51, 255));
        button_dishes.setText("Dishes");
        button_dishes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_dishesActionPerformed(evt);
            }
        });

        button_drinks.setBackground(new java.awt.Color(204, 204, 204));
        button_drinks.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        button_drinks.setForeground(new java.awt.Color(51, 51, 255));
        button_drinks.setText("Drinks");
        button_drinks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_drinksActionPerformed(evt);
            }
        });

        button_dessert.setBackground(new java.awt.Color(204, 204, 204));
        button_dessert.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        button_dessert.setForeground(new java.awt.Color(51, 51, 255));
        button_dessert.setText("Dessert");
        button_dessert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_dessertActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(button_sandwich, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button_pizza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button_dishes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button_drinks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button_dessert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(button_sandwich, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(button_pizza, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(button_dishes, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(button_drinks, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(button_dessert, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(50, 130, 130, 450);

        table_menu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Item_ID", "Item_Name", "Addtion", "Price", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_menu);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(180, 130, 690, 450);

        phoneNum_check.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        phoneNum_check.setForeground(new java.awt.Color(204, 204, 204));
        phoneNum_check.setText(" Enter your Phone Number");
        phoneNum_check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNum_checkActionPerformed(evt);
            }
        });
        jPanel1.add(phoneNum_check);
        phoneNum_check.setBounds(900, 90, 170, 40);

        button_check.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        button_check.setText("Check");
        button_check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_checkActionPerformed(evt);
            }
        });
        jPanel1.add(button_check);
        button_check.setBounds(980, 140, 90, 30);

        jLabel2.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Customer Information:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(870, 180, 180, 50);

        button_saveOrder.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        button_saveOrder.setText("Save Order");
        button_saveOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_saveOrderActionPerformed(evt);
            }
        });
        jPanel1.add(button_saveOrder);
        button_saveOrder.setBounds(960, 490, 110, 30);

        button_employeeM.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        button_employeeM.setText("Employee management");
        button_employeeM.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        button_employeeM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_employeeMActionPerformed(evt);
            }
        });
        jPanel1.add(button_employeeM);
        button_employeeM.setBounds(710, 60, 160, 40);

        button_logOut.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        button_logOut.setText("Log out");
        button_logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_logOutActionPerformed(evt);
            }
        });
        jPanel1.add(button_logOut);
        button_logOut.setBounds(970, 40, 90, 30);

        button_print.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        button_print.setText("Print");
        button_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_printActionPerformed(evt);
            }
        });
        jPanel1.add(button_print);
        button_print.setBounds(960, 530, 110, 30);

        jScrollPane2.setForeground(new java.awt.Color(255, 255, 255));

        customerInfo.setColumns(20);
        customerInfo.setRows(5);
        customerInfo.setText("Display customer's infomation:\n\nPhone:\n\nFirst name:\n\nLast name:\n\nemail:\n\naddress:");
        jScrollPane2.setViewportView(customerInfo);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(900, 230, 170, 230);

        button_itemM.setBackground(new java.awt.Color(204, 204, 204));
        button_itemM.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        button_itemM.setForeground(new java.awt.Color(51, 51, 51));
        button_itemM.setText("Item Management");
        button_itemM.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        button_itemM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_itemMActionPerformed(evt);
            }
        });
        jPanel1.add(button_itemM);
        button_itemM.setBounds(510, 60, 170, 38);

        backgroud.setForeground(new java.awt.Color(204, 204, 204));
        backgroud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/background3.jpg"))); // NOI18N
        backgroud.setText("jLabel1");
        jPanel1.add(backgroud);
        backgroud.setBounds(0, 0, 1100, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1100, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void phoneNum_checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNum_checkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNum_checkActionPerformed

    private void button_checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_checkActionPerformed
         CustomerGUI customer = new CustomerGUI();
         customer.setVisible(true);
    }//GEN-LAST:event_button_checkActionPerformed

    private void button_sandwichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_sandwichActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_sandwichActionPerformed

    private void button_employeeMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_employeeMActionPerformed
       MainMenuGUI mainMenu = new MainMenuGUI();
       // mainMenu.setVisible(false); 
       // dispose(); //Destroy the JFrame object
       EmployeeGUI employee = new EmployeeGUI();
       employee.setVisible(true);
    }//GEN-LAST:event_button_employeeMActionPerformed

    private void button_itemMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_itemMActionPerformed
        FoodManageGUI food = new FoodManageGUI();
        food.setVisible(true);
    }//GEN-LAST:event_button_itemMActionPerformed

    private void button_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_printActionPerformed
        PrintGUI print = new PrintGUI();
        print.setVisible(true);
    }//GEN-LAST:event_button_printActionPerformed

    private void button_pizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_pizzaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_pizzaActionPerformed

    private void button_dishesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_dishesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_dishesActionPerformed

    private void button_drinksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_drinksActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_drinksActionPerformed

    private void button_dessertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_dessertActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_dessertActionPerformed

    private void button_logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_logOutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_logOutActionPerformed

    private void button_saveOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_saveOrderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_saveOrderActionPerformed

     public void close(){
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }    
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
            java.util.logging.Logger.getLogger(MainMenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenuGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroud;
    private javax.swing.JButton button_check;
    private javax.swing.JButton button_dessert;
    private javax.swing.JButton button_dishes;
    private javax.swing.JButton button_drinks;
    private javax.swing.JButton button_employeeM;
    private javax.swing.JButton button_itemM;
    private javax.swing.JButton button_logOut;
    private javax.swing.JButton button_pizza;
    private javax.swing.JButton button_print;
    private javax.swing.JButton button_sandwich;
    private javax.swing.JButton button_saveOrder;
    private javax.swing.JTextArea customerInfo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_menu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField phoneNum_check;
    private javax.swing.JTable table_menu;
    // End of variables declaration//GEN-END:variables
}
