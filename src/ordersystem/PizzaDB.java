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
import java.sql.PreparedStatement;
import java.util.ArrayList;

/**
 *
 * @author Ahmed Diab
 */
public class PizzaDB {

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
    public PizzaDB(String databaseName, String username, String password) {
        this.databaseName = databaseName;
        this.username = username;
        this.password = password;

    }

    public ArrayList<Pizza> getPizzas() throws Exception {
        ArrayList<Pizza> pizzas = new ArrayList<>();
        //initialization 
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            // getting the connection
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://sql5.freemysqlhosting.net/" + databaseName, username, password);
            // creating statements
            String sql = "select * from PIZZA order by name";
            st = con.createStatement();
            // execute query
            rs = st.executeQuery(sql);
            // processing  the resultSet
            while (rs.next()) {
                //retrieving data from the dataBase
                String id = rs.getString("PizzaID");
                String name = rs.getString("name");
                String size = rs.getString("size");
                double price = rs.getDouble("price");
                int amountLeft = rs.getInt("amountLeft");
                String sauce = rs.getString("sauce");
                // creating a new pizza object
                Pizza pizza = new Pizza(id, name, size, sauce, price, amountLeft);
                // adding the pizza to the list
                pizzas.add(pizza);
            }
        } finally {
            // Closing  the connection
            close(con, st, rs);
        }

        return pizzas;
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
