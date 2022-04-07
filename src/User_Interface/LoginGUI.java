package User_Interface;

/**
 * @author zhangf2, Ahmed Diab
 * 4/5/2022 - Ha
 * got employee permission from database and passed into mainmenu page
 */
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import ordersystem.EmployeeDB;

public class LoginGUI extends javax.swing.JFrame {

    public LoginGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_username = new javax.swing.JLabel();
        jLabel_password = new javax.swing.JLabel();
        jLabel_welcome = new javax.swing.JLabel();
        button_login = new javax.swing.JButton();
        text_password = new javax.swing.JPasswordField();
        text_username = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        backgroud1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setFocusable(false);
        jPanel1.setLayout(null);

        jLabel_username.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_username.setFont(new java.awt.Font("Arial", 3, 48)); // NOI18N
        jLabel_username.setForeground(new java.awt.Color(51, 51, 0));
        jLabel_username.setText("Welcome to Order System");
        jPanel1.add(jLabel_username);
        jLabel_username.setBounds(60, 90, 620, 50);

        jLabel_password.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_password.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel_password.setForeground(new java.awt.Color(51, 51, 0));
        jLabel_password.setText("Password :");
        jPanel1.add(jLabel_password);
        jLabel_password.setBounds(20, 280, 200, 30);

        jLabel_welcome.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_welcome.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel_welcome.setForeground(new java.awt.Color(51, 51, 0));
        jLabel_welcome.setText("Username :");
        jPanel1.add(jLabel_welcome);
        jLabel_welcome.setBounds(20, 180, 210, 30);

        button_login.setBackground(new java.awt.Color(204, 204, 204));
        button_login.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        button_login.setForeground(new java.awt.Color(51, 51, 51));
        button_login.setText("Login");
        button_login.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), null, null));
        button_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_loginActionPerformed(evt);
            }
        });
        jPanel1.add(button_login);
        button_login.setBounds(540, 390, 100, 50);

        text_password.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        text_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_passwordActionPerformed(evt);
            }
        });
        jPanel1.add(text_password);
        text_password.setBounds(180, 280, 230, 50);

        text_username.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        text_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_usernameActionPerformed(evt);
            }
        });
        jPanel1.add(text_username);
        text_username.setBounds(180, 180, 230, 50);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Forgot Password ?");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(490, 300, 180, 50);

        backgroud1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/ordered.jpg"))); // NOI18N
        backgroud1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(backgroud1);
        backgroud1.setBounds(0, 0, 790, 480);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(590, 100, 100, 100);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void button_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_loginActionPerformed
        try {                                             
            LoginGUI welcome = new LoginGUI();
            String username, password;
            username = text_username.getText();
            password = new String(text_password.getPassword());
            MainMenuGUI menu;
            
            String databaseName = "sql5475007";
            String dbUserName = "sql5475007";
            String dbPassword = "avlj8CSFyF";
            
            EmployeeDB inputEmp = new EmployeeDB(databaseName, dbUserName, dbPassword);
            
            try {
                
                boolean isEmployee = inputEmp.isEmployee(username, password);
                System.out.println(isEmployee);
                if(isEmployee){
                    System.out.println(inputEmp.isEmployee(username, password));
                    welcome.setVisible(false); //you can't see me!
                    //dispose(); //Destroy the JFrame object
                    JOptionPane.showMessageDialog(this,"login sucess!");
                    int access = inputEmp.getAccess(username);
                    menu = new MainMenuGUI(username,inputEmp.getAccess(username));
                    System.out.print("access = " + access);
                    if(access == 0){
                        menu.setButton();
                    }
                    menu.setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(this,"Invalid username or password!");
                    welcome.setVisible(false); //you can't see me!
                    // dispose(); //Destroy the JFrame object
                }
            } catch (Exception ex) {
                Logger.getLogger(LoginGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (Exception ex) {
            Logger.getLogger(LoginGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                            

    public void close(){
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
        
    }//GEN-LAST:event_button_loginActionPerformed

    private void text_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_usernameActionPerformed

    private void text_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_passwordActionPerformed

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
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroud1;
    private javax.swing.JButton button_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_password;
    private javax.swing.JLabel jLabel_username;
    private javax.swing.JLabel jLabel_welcome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField text_password;
    private javax.swing.JTextField text_username;
    // End of variables declaration//GEN-END:variables
}
