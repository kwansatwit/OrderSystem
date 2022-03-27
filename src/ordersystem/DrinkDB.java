/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordersystem;

import java.sql.Connection;
import java.sql.DriverManager;
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
                boolean isAlcoholic = rs.getBoolean("isAlcoholic");
                double price = rs.getDouble("price");
                int amountLeft = rs.getInt("amountLeft");
                // creating a new drink object
                Drink drink = new Drink(id, name, size, isAlcoholic, price, amountLeft);
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

