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
import java.util.ArrayList;

/**
 *
 * @author Ahmed Diab
 */
public class CustomerDB {

    String databaseName;
    String username;
    String password;

    /**
     * Constructor.
     *
     * @param databaseName
     * @param username
     * @param password
     */
    public CustomerDB(String databaseName, String username, String password) {
        this.databaseName = databaseName;
        this.username = username;
        this.password = password;

    }
    
    /**
     * method that retrieves a specific customer from the database.
     * @param number
     * @return
     * @throws Exception 
     */
    public Customer getCustomer(String number) throws Exception {
        Customer customer = null;
        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            //get connection to the database
            //con = dataSource.getConnection();
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://sql5.freemysqlhosting.net/" + databaseName, username, password);
            //create sql to get the contact from the database
            String sql = "select * from CUSTOMER where phoneNumber=?";
            //create prepared statement
            st = con.prepareStatement(sql);
            //set parameters
            st.setString(1, number);
            //execute statement
            rs = st.executeQuery();
            //retrieve data from the resultSet
            if (rs.next()) {
                String phoneNumber = rs.getString("phoneNumber");
                String firstName = rs.getString("firstName");
                String lastName = rs.getString("lastName");
                String email = rs.getString("email");
                String address = rs.getString("address");
                customer = new Customer(phoneNumber, firstName, lastName, email, address);
            } else {
                throw new Exception("could not find the customer with phone number:" + number + " !");
            }

        } finally {
            close(con, st, rs);
        }

        return customer;

    }
    
    /**
     * method that checks if a customer with this phone number is in our database or no.
     * @param number
     * @return
     * @throws Exception 
     */
    public boolean isCustomer(String number) throws Exception {
        boolean isCustomer;
        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            //get connection to the database
            //con = dataSource.getConnection();
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://sql5.freemysqlhosting.net/" + databaseName, username, password);
            //create sql to get the contact from the database
            String sql = "select * from CUSTOMER where phoneNumber=?";
            //create prepared statement
            st = con.prepareStatement(sql);
            //set parameters
            st.setString(1, number);
            //execute statement
            rs = st.executeQuery();
            //retrieve data from the resultSet
            if (rs.next()) {
                isCustomer = true;
            } else {
                isCustomer = false;
            }

        } finally {
            close(con, st, rs);
        }

        return isCustomer;

    }
    
    /**
     * method that add customer to the database.
     * @param Customer
     * @throws Exception 
     */
    public void addCustomer(Customer customer) throws Exception {
        Connection con = null;
        PreparedStatement st = null;
        try {
            //con = dataSource.getConnection();

            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://sql5.freemysqlhosting.net/" + databaseName, username, password);
            //creating the statement
            String sql = "insert into CUSTOMER"
                    + "(phoneNumber,firstName,lastName,email,address)"
                    + "values(?,?,?,?,?)";
            st = con.prepareStatement(sql);
            
            // inserting customer data into the database.
            st.setString(1, customer.getPhoneNumber());
            st.setString(2, customer.getFirstName());
            st.setString(3, customer.getLastName());
            st.setString(4, customer.getEmail());
            st.setString(5, customer.getAddress());
            st.execute();
        } finally {
            // Closing  the connection.
            close(con, st, null);
        }

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

