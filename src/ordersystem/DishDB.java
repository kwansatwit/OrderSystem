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
public class DishDB {

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
    public DishDB(String databaseName, String username, String password) {
        this.databaseName = databaseName;
        this.username = username;
        this.password = password;

    }

    public ArrayList<Dish> getDishes() throws Exception {
        ArrayList<Dish> dishes = new ArrayList<>();
        //initialization 
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            // getting the connection
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://sql5.freemysqlhosting.net/" + databaseName, username, password);
            // creating statements
            String sql = "select * from DISH order by name";
            st = con.createStatement();
            // execute query
            rs = st.executeQuery(sql);
            // processing  the resultSet
            while (rs.next()) {
                //retrieving data from the dataBase
                String id = rs.getString("DishID");
                String name = rs.getString("name");
                String size = rs.getString("size");
                double price = rs.getDouble("price");
                int amountLeft = rs.getInt("amountLeft");
                // creating a new dish object
                Dish dish = new Dish(id, name, size, price, amountLeft);
                // adding the dish to the list
                dishes.add(dish);
            }
        } finally {
            // Closing  the connection
            close(con, st, rs);
        }

        return dishes;
    }
    
    /**
     * method that retrieves a specific dish from the database.
     * @param number
     * @return
     * @throws Exception 
     */
    public void getDish(String id) throws Exception {
        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            //get connection to the database
            //con = dataSource.getConnection();
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://sql5.freemysqlhosting.net/" + databaseName, username, password);
            //create sql to get the contact from the database
            String sql = "select * from DISH where DishID=?";
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
                throw new Exception("could not find the dish with id:" + id + " !");
            }

        } finally {
            close(con, st, rs);
        }

    }
    
    /**
     * method that decrement a specific dish amount left with the amount entered.
     * @param id, amount
     * @throws Exception 
     */
    public void decrementAmount(String id, int amount) throws Exception {
        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        
        getDish(id);
        System.out.println(amountLeft);
        System.out.println(amount);
        
        int newAmount = amountLeft - amount;
        System.out.println(newAmount);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://sql5.freemysqlhosting.net/" + databaseName, username, password);
            String sql = "update DISH "
                    + "set amountLeft=? where DishID=?";
            
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
