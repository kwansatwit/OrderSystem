/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package User_Interface;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import ordersystem.SalesReport;
import ordersystem.SalesReportDB;

/**
 *
 * @author Shuk Ha Kwan
 * GUI class for display sale report
 */
public class ReportGUI extends javax.swing.JFrame {

    /**
     * Creates new form ReportGUI
     */
    ArrayList<SalesReport> orders;
    boolean monthlyClicked, daliyClicked;

    // close current page without close the main menu page
    public ReportGUI() throws Exception {
        initComponents();

        this.TotalPrice.setText("$ 0");
        // setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewReport = new javax.swing.JTable();
        backToMenuButton = new javax.swing.JButton();
        MonthlyReportButton = new javax.swing.JButton();
        DaliyReportButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        TotalPrice = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        viewReport.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Order No.", "Date", "Customer Name", "Address", "Items", "Total Price"
            }
        ));
        viewReport.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        viewReport.setGridColor(new java.awt.Color(204, 204, 255));
        viewReport.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(viewReport);

        backToMenuButton.setBackground(new java.awt.Color(0, 0, 153));
        backToMenuButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        backToMenuButton.setForeground(new java.awt.Color(255, 255, 255));
        backToMenuButton.setText("Back to menu");
        backToMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToMenuButtonActionPerformed(evt);
            }
        });

        MonthlyReportButton.setBackground(new java.awt.Color(255, 102, 153));
        MonthlyReportButton.setText("Monthly Report");
        MonthlyReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthlyReport(evt);
            }
        });

        DaliyReportButton.setBackground(new java.awt.Color(255, 204, 153));
        DaliyReportButton.setText("Daliy Report");
        DaliyReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daliyReport(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Total Sales Amount:");

        TotalPrice.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TotalPrice.setText("jLabel2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(MonthlyReportButton)
                            .addGap(26, 26, 26)
                            .addComponent(DaliyReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGap(0, 379, Short.MAX_VALUE)
                            .addComponent(jLabel1)
                            .addGap(31, 31, 31)
                            .addComponent(TotalPrice)
                            .addGap(81, 81, 81)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backToMenuButton)
                .addGap(41, 41, 41))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MonthlyReportButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DaliyReportButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TotalPrice))
                .addGap(29, 29, 29)
                .addComponent(backToMenuButton)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void daliyReport(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daliyReport
        // TODO add your handling code here:
        daliyClicked = true;
        monthlyClicked = false;
        LocalDate currentDate = LocalDate.now();

        orders = new ArrayList<>();
        try {
            System.out.println("clicked_daliy!");
            SalesReportDB report = new SalesReportDB();
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu/MM/dd");
            String date = dtf.format(currentDate);
            // populate the table with sandwiches data.
            orders = report.getReport(date, date);
            if(orders != null){
            addRowToJTable();
            double total = getTotalSalePrice(orders);
            this.TotalPrice.setText("$ "+String.format("%.2f", total));  
            System.out.println("here!daliy");
            }
        } catch (Exception ex) {
            Logger.getLogger(MainMenuGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_daliyReport

    private void monthlyReport(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthlyReport
        // TODO add your handling code here:
        daliyClicked = false;
        monthlyClicked = true;
        double total = 0;
        LocalDate currentDate = LocalDate.now();
        int year = currentDate.getYear();
        int month = currentDate.getMonthValue();
        int length = String.valueOf(month).length();
        String startDate = year + (length==1?"/0":"/") +  month + "/01";
        int day = findDay(month,year);
        String endDate = year+"/"+month+"/"+day;
        

        orders = new ArrayList<>();
        try {
            System.out.println("monthyClick!");
            SalesReportDB report = new SalesReportDB();

            // populate the table with sandwiches data.
            orders = report.getReport(startDate, endDate);
            
            if(orders != null){
            addRowToJTable();
            total = getTotalSalePrice(orders);
            //String.format('%.2f', total)
            this.TotalPrice.setText("$ "+String.format("%.2f", total));  
            
            System.out.println("here!monthly");
            }
            
        } catch (Exception ex) {
            Logger.getLogger(MainMenuGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_monthlyReport

    private void backToMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToMenuButtonActionPerformed
        // TODO add your handling code here:
        MainMenuGUI menu = new MainMenuGUI();         
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backToMenuButtonActionPerformed

    private double getTotalSalePrice(ArrayList<SalesReport> orders){
        double amount = 0;
        
        for(int i = 0; i<orders.size(); i++){
            amount+= orders.get(i).getTotalPrice();
        }
        
        return amount;
    }

    private int findDay(int month, int year) {
        int day = 0;
        //1,3,5,7,8,10,12
        // 2-28
        // 4,6,9,11
        if (month == 2) {
            if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    day = 29;
                } else {
                    day = 28;
                }

        } else {
            if ((month < 7 && month % 2 == 0) || (month > 8 && month % 2 != 0)) {
                day = 30;
            } else {
                day = 31;
            }
        }
        return day;
    }

    public void addRowToJTable() {

        DefaultTableModel model = (DefaultTableModel) viewReport.getModel();
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();

        Object rowData[] = new Object[7];

        
            for (int i = 0; i < orders.size(); i++) {
                rowData[0] = orders.get(i).getOrderID();
                rowData[1] = orders.get(i).getOrderTime();
                rowData[2] = orders.get(i).getOrderLocation();
                rowData[3] = orders.get(i).getPhoneNumber();
                rowData[4] = orders.get(i).getItems();
                rowData[5] = "$" + orders.get(i).getTotalPrice();
                model.insertRow(i, rowData);            
        }
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
            java.util.logging.Logger.getLogger(ReportGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReportGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReportGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReportGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ReportGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReportGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReportGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReportGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {

                    new ReportGUI().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(ReportGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DaliyReportButton;
    private javax.swing.JButton MonthlyReportButton;
    private javax.swing.JLabel TotalPrice;
    private javax.swing.JButton backToMenuButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable viewReport;
    // End of variables declaration//GEN-END:variables
}
