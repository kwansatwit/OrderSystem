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
 * 4/5/2022 - Ha
 * created a getAccess function to get employee access to set up permission function
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
            con = DriverManager.getConnection("jdbc:mysql://sql5.freemysqlhosting.net/" + databaseName, username, password);
            // creating statements
            String sql ="Select * from EMPLOYEE where userName='"+empUserName+"' AND password='"+empPassword+"'";
            st = con.createStatement();
            // execute query
            rs = st.executeQuery(sql);
            // processing  the resultSet
            while (rs.next()) {
                System.out.println(rs.getString("userName"));
                System.out.println(rs.getString("password"));
                System.out.println("----------------");
                System.out.println("Input Data: ");
                System.out.println(empUserName);
                System.out.println(empPassword);
                if ((empUserName == null ? rs.getString("userName") == null : empUserName.equals(rs.getString("userName"))) && (empPassword == null ? rs.getString("password") == null : empPassword.equals(rs.getString("password")))){
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
    
    /**
     * 
     * @param empUserName
     * @return
     * @throws Exception 
     */
    public int getAccess (String empUserName) throws Exception{
        int access = -1;
                //initialization 
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
          try {
            // getting the connection
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://sql5.freemysqlhosting.net/" + databaseName, username, password);
            // creating statements
            String sql ="Select access from EMPLOYEE where userName='"+empUserName+"'";
            st = con.createStatement();
            // execute query
            rs = st.executeQuery(sql);
            // processing  the resultSet
            while (rs.next()) {
                 access = rs.getInt("access");
                System.out.println(empUserName+ " " + access);
            }
        } finally {
            // Closing  the connection
            close(con, st, rs);
        }
          System.out.print("IN db access: " + access);
          return access;
    }
    
    
    /**
     * method that add employee to the database.
     * @param Employee
     * @throws Exception 
     */
    public void addEmployee(Employee employee) throws Exception {
        Connection con = null;
        PreparedStatement st = null;
        try {
            //con = dataSource.getConnection();

            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://sql5.freemysqlhosting.net/" + databaseName, username, password);
            //creating the statement
            String sql = "insert into EMPLOYEE"
                    + "(userName,firstName,lastName,password,dateOfBirth,address,phoneNumber,email,position,access)"
                    + "values(?,?,?,?,?,?,?,?,?,?)";
            st = con.prepareStatement(sql);
            
            // inserting employee data into the database.
            st.setString(1, employee.getUserName());
            st.setString(2, employee.getFirstName());
            st.setString(3, employee.getLastName());
            st.setString(4, employee.getPassword());
            st.setString(5, employee.getDateOfBirth());
            st.setString(6, employee.getAddress());
            st.setString(7, employee.getPhoneNumber());
            st.setString(8, employee.getEmail());
            st.setString(9, employee.getPosition());
            st.setInt(10, employee.getAccess());
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
