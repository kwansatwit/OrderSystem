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

/**
 *
 * @author diaba
 */
public class EmployeeDB {
    
    String databaseName;
    String username;
    String password;

    /**
     * Constructor.
     * @param databaseName
     * @param username
     * @param password 
     */
    public EmployeeDB(String databaseName, String username, String password) {
        this.databaseName = databaseName;
        this.username = username;
        this.password = password;
    }
    
    /**
     * method that check if the username and password entered are valid or no.
     * @return
     * @throws Exception 
     */
    public boolean isEmployee(String empUserName, String empPassword) throws Exception {
        
        boolean isEmp = false;
        
        //initialization 
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            // getting the connection
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://34.94.136.83/" + databaseName, username, password);
            // creating statements
            String sql ="Select * from EMPLOYEE where employeeUserName='"+empUserName+"' AND employeePassword='"+empPassword+"'";
            st = con.createStatement();
            // execute query
            rs = st.executeQuery(sql);
            // processing  the resultSet
            while (rs.next()) {
                System.out.println(rs.getString("employeeUserName"));
                System.out.println(rs.getString("employeePassword"));
                System.out.println("----------------");
                System.out.println("Input Data: ");
                System.out.println(empUserName);
                System.out.println(empPassword);
                if ((empUserName == null ? rs.getString("employeeUserName") == null : empUserName.equals(rs.getString("employeeUserName"))) && (empPassword == null ? rs.getString("employeePassword") == null : empPassword.equals(rs.getString("employeePassword")))){
                    isEmp = true;
                    return isEmp;
                }
            }
        } finally {
            // Closing  the connection
            close(con, st, rs);
        }

        return isEmp;
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
