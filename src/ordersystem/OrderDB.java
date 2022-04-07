/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordersystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Ahmed Diab
 */
public class OrderDB {
    
    String databaseName;
    String username;
    String password;

    /**
     * Constructor.
     * @param databaseName
     * @param username
     * @param password 
     */
    public OrderDB(String databaseName, String username, String password) {
        this.databaseName = databaseName;
        this.username = username;
        this.password = password;
    }
    
    /**
     * method that add order to the database.
     * @param Order
     * @throws Exception 
     */
    public void addOrder(Order order) throws Exception {
        Connection con = null;
        PreparedStatement st = null;
        try {
            //con = dataSource.getConnection();

            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://sql5.freemysqlhosting.net/" + databaseName, username, password);
            //creating the statement
            String sql = "insert into ORDERS"
                    + "(OrderID,OrderTime,OrderDate,OrderLocation,phoneNumber,items,price)"
                    + "values(?,?,?,?,?,?,?)";
            st = con.prepareStatement(sql);
            
            // inserting order data into the database.
            st.setString(1, order.getOrderID());
            st.setString(2, order.getOrderTime());
            st.setString(3, order.getOrderDate());
            st.setString(4, order.getOrderLocation());
            st.setString(5, order.getPhoneNumber());
            st.setString(6, order.printItems());
            st.setDouble(7, order.total_with_tax());
            st.execute();
        } finally {
            // Closing  the connection.
            close(con, st, null);
        }

    }
    
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
