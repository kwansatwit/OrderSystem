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
public class SandwichDB {
    String databaseName;
    String username;
    String password;
    
    int amountLeft;

    /**
     * Constructor.
     *
     * @param databaseName
     * @param username
     * @param password
     */
    public SandwichDB(String databaseName, String username, String password) {
        this.databaseName = databaseName;
        this.username = username;
        this.password = password;

    }

    public ArrayList<Sandwich> getSandwiches() throws Exception {
        ArrayList<Sandwich> sandwiches = new ArrayList<>();
        //initialization 
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            // getting the connection
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://sql5.freemysqlhosting.net/" + databaseName, username, password);
            // creating statements
            String sql = "select * from SANDWICH order by name";
            st = con.createStatement();
            // execute query
            rs = st.executeQuery(sql);
            // processing  the resultSet
            while (rs.next()) {
                //retrieving data from the dataBase
                String id = rs.getString("SandwichID");
                String name = rs.getString("name");
                String size = rs.getString("size");
                double price = rs.getDouble("price");
                int amountLeft = rs.getInt("amountLeft");
                // creating a new sandwich object
                Sandwich sandwich = new Sandwich(id, name, size, price, amountLeft);
                // adding the sandwich to the list
                sandwiches.add(sandwich);
            }
        } finally {
            // Closing  the connection
            close(con, st, rs);
        }

        return sandwiches;
    }
    
    /**
     * method that retrieves a specific sandwich from the database.
     * @param number
     * @return
     * @throws Exception 
     */
    public void getSandwich(String id) throws Exception {
        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            //get connection to the database
            //con = dataSource.getConnection();
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://sql5.freemysqlhosting.net/" + databaseName, username, password);
            //create sql to get the contact from the database
            String sql = "select * from SANDWICH where SandwichID=?";
            //create prepared statement
            st = con.prepareStatement(sql);
            //set parameters
            st.setString(1, id);
            //execute statement
            rs = st.executeQuery();
            //retrieve data from the resultSet
            if (rs.next()) {
                amountLeft = rs.getInt("amountLeft");
            } else {
                throw new Exception("could not find the sandwich with id:" + id + " !");
            }

        } finally {
            close(con, st, rs);
        }

    }
    
    /**
     * method that decrement a specific sandwich amount left with the amount entered.
     * @param id, amount
     * @throws Exception 
     */
    public void decrementAmount(String id, int amount) throws Exception {
        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        
        getSandwich(id);
        System.out.println(amountLeft);
        System.out.println(amount);
        
        int newAmount = amountLeft - amount;
        System.out.println(newAmount);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://sql5.freemysqlhosting.net/" + databaseName, username, password);
            String sql = "update SANDWICH "
                    + "set amountLeft=? where SandwichID=?";
            
            st = con.prepareStatement(sql);
            
            st.setInt(1, newAmount);
            st.setString(2, id);
            
            st.execute();
            
            System.out.println("amount updated!");

        } finally {
            close(con, st, null);
        }
    }
    
    /**
     * method that add sandwich to the database.
     * @param Sandwich
     * @throws Exception 
     */
    public void addSandwich(Sandwich sandwich) throws Exception {
        Connection con = null;
        PreparedStatement st = null;
        try {
            //con = dataSource.getConnection();

            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://sql5.freemysqlhosting.net/" + databaseName, username, password);
            //creating the statement
            String sql = "insert into SANDWICH"
                    + "(SandwichID,name,size,price,amountLeft)"
                    + "values(?,?,?,?,?)";
            st = con.prepareStatement(sql);
            
            // inserting sandwich data into the database.
            st.setString(1, sandwich.getId());
            st.setString(2, sandwich.getName());
            st.setString(3, sandwich.getSize());
            st.setDouble(4, sandwich.getPrice());
            st.setInt(5, sandwich.getAmountLeft());
            st.execute();
        } finally {
            // Closing  the connection.
            close(con, st, null);
        }

    }
    
    /**
     * method that deletes a specific dish from the database.
     * @param sandwichID
     * @throws Exception 
     */
    public void deleteSandwich(String sandwichID) throws Exception {
        Connection con = null;
        PreparedStatement st = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://sql5.freemysqlhosting.net/" + databaseName, username, password);
            //create sql to delete the sandwich from the database
            String sql = "delete  from SANDWICH where SandwichID=?";
            //create prepared statement
            st = con.prepareStatement(sql);
            //set parameters
            st.setString(1, sandwichID);
            //execute statement
            st.execute();

        } finally {
            close(con, st, null);
        }

    }
    
    /**
     * method that updates a specific sandwich amount left in the database.
     * @param amount
     * @throws Exception 
     */
    public void updateSandwichAmount(String id, int amount) throws Exception {
        Connection con = null;
        PreparedStatement st = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://sql5.freemysqlhosting.net/" + databaseName, username, password);
            String sql = "update SANDWICH "
                    + "set amountLeft=? where SandwichID=?";
            st = con.prepareStatement(sql);

            st.setInt(1, amount);
            st.setString(2, id);
            st.execute();

        } finally {
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
