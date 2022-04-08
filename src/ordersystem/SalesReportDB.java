/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordersystem;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.DriverManager;
import java.sql.Date; 

/**
 *
 * @author Shuk Ha Kwan
 * Sales Report database connected to the order table
 */
public class SalesReportDB {

    private Connection con;

   private String databaseName = "sql5475007";
   private String dbUserName = "sql5475007";
  private  String dbPassword = "avlj8CSFyF";

    public SalesReportDB() {
        con = null;
    }

    public ArrayList<SalesReport> getReport(String startDate, String endDate) throws Exception {
        ArrayList<SalesReport> orders = new ArrayList<>();
        //initialization 

        Statement st = null;
        ResultSet rs = null;
        try {
            // getting the connection
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://sql5.freemysqlhosting.net/" + databaseName, dbUserName, dbPassword);
            // creating statements
            String sql = "select * from ORDERS WHERE OrderDate BETWEEN \'" + startDate + "\' AND \'" + endDate + "\' order by OrderDate";
          
            st = con.createStatement();
            // execute query
            rs = st.executeQuery(sql);
            // processing  the resultSet

            while (rs.next()) {
                //retrieving data from the dataBase               
                String id = rs.getString("OrderID");
                Date date = rs.getDate("OrderDate");
                String location = rs.getString("OrderLocation");
                String phone = rs.getString("phoneNumber");
                String items = rs.getString("items");
                double totalPrice = rs.getDouble("price");

                System.out.println("I have next:" + id +" "+ date + " "+ location+" "+ phone +" "+ items+" "+ totalPrice );

              
                SalesReport orderList = new SalesReport(id, date, location, phone, items, totalPrice);
               
                orders.add(orderList);
            }
            System.out.println("Out of while?");
        } finally {
            // Closing  the connection
              close(con, st, rs);
        }

        return orders;
    }

    /**
     * method that close the connection.
     *
     * @param con
     * @param st
     * @param rs
     * @throws Exception
     */
    private static void close(Connection con, Statement st, ResultSet rs) throws Exception {
        try {
            if (con != null) {
                con.close();
            }
            if (st != null) {
                st.close();
            }
            if (rs != null) {
                rs.close();
            }

        } catch (Exception ex) {
            throw new Exception();
        }

    }
}
