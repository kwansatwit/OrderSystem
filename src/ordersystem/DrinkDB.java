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
public class DrinkDB {
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
    public DrinkDB(String databaseName, String username, String password) {
        this.databaseName = databaseName;
        this.username = username;
        this.password = password;

    }

    public ArrayList<Drink> getDrinks() throws Exception {
        ArrayList<Drink> drinks = new ArrayList<>();
        //initialization 
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            // getting the connection
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://sql5.freemysqlhosting.net/" + databaseName, username, password);
            // creating statements
            String sql = "select * from DRINK order by name";
            st = con.createStatement();
            // execute query
            rs = st.executeQuery(sql);
            // processing  the resultSet
            while (rs.next()) {
                //retrieving data from the dataBase
                String id = rs.getString("DrinkID");
                String name = rs.getString("name");
                String size = rs.getString("size");
                double price = rs.getDouble("price");
                int amountLeft = rs.getInt("amountLeft");
                // creating a new drink object
                Drink drink = new Drink(id, name, size, price, amountLeft);
                // adding the drink to the list
                drinks.add(drink);
            }
        } finally {
            // Closing  the connection
            close(con, st, rs);
        }

        return drinks;
    }
    
    /**
     * method that retrieves a specific drink from the database.
     * @param number
     * @return
     * @throws Exception 
     */
    public void getDrink(String id) throws Exception {
        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            //get connection to the database
            //con = dataSource.getConnection();
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://sql5.freemysqlhosting.net/" + databaseName, username, password);
            //create sql to get the contact from the database
            String sql = "select * from DRINK where DrinkID=?";
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
                throw new Exception("could not find the drink with id:" + id + " !");
            }

        } finally {
            close(con, st, rs);
        }

    }
    
    /**
     * method that decrement a specific drink amount left with the amount entered.
     * @param id, amount
     * @throws Exception 
     */
    public void decrementAmount(String id, int amount) throws Exception {
        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        
        getDrink(id);
        System.out.println(amountLeft);
        System.out.println(amount);
        
        int newAmount = amountLeft - amount;
        System.out.println(newAmount);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://sql5.freemysqlhosting.net/" + databaseName, username, password);
            String sql = "update DRINK "
                    + "set amountLeft=? where DrinkID=?";
            
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
     * method that add drink to the database.
     * @param Drink
     * @throws Exception 
     */
    public void addDrink(Drink drink) throws Exception {
        Connection con = null;
        PreparedStatement st = null;
        try {
            //con = dataSource.getConnection();

            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://sql5.freemysqlhosting.net/" + databaseName, username, password);
            //creating the statement
            String sql = "insert into DRINK"
                    + "(DrinkID,name,size,price,amountLeft)"
                    + "values(?,?,?,?,?)";
            st = con.prepareStatement(sql);
            
            // inserting drink data into the database.
            st.setString(1, drink.getId());
            st.setString(2, drink.getName());
            st.setString(3, drink.getSize());
            st.setDouble(4, drink.getPrice());
            st.setInt(5, drink.getAmountLeft());
            st.execute();
        } finally {
            // Closing  the connection.
            close(con, st, null);
        }

    }
    
    /**
     * method that deletes a specific drink from the database.
     * @param drinkID
     * @throws Exception 
     */
    public void deleteDrink(String drinkID) throws Exception {
        Connection con = null;
        PreparedStatement st = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://sql5.freemysqlhosting.net/" + databaseName, username, password);
            //create sql to delete the drink from the database
            String sql = "delete  from DRINK where DrinkID=?";
            //create prepared statement
            st = con.prepareStatement(sql);
            //set parameters
            st.setString(1, drinkID);
            //execute statement
            st.execute();

        } finally {
            close(con, st, null);
        }

    }
    
    /**
     * method that updates a specific drink amount left in the database.
     * @param amount
     * @throws Exception 
     */
    public void updateDrinkAmount(String id, int amount) throws Exception {
        Connection con = null;
        PreparedStatement st = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://sql5.freemysqlhosting.net/" + databaseName, username, password);
            String sql = "update DRINK "
                    + "set amountLeft=? where DrinkID=?";
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

