/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordersystem;


import java.util.Date;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author Ahmed Diab
 */
public class Employee {
    
    String firstName;
    String lastName;
    String dateOfBirth;
    String address;
    String phoneNumber;
    String email;
    String position;
    int access;
    String userName;
    String password;
    
    public Employee() {
        this.access = 0;
        this.address = "";
        this.dateOfBirth = null;
        this.email = "";
        this.firstName = "";
        this.lastName = "";
        this.phoneNumber = "";
        this.position = "";
        this.userName = "";
        this.password = "";
    }
    
    public Employee(String firstName, String lastName, String dateOfBirth, String address, String phoneNumber, String email, String position, int access) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.position = position;
        this.access = access;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAccess() {
        return access;
    }

    public void setAccess(int access) {
        this.access = access;
    }
    
    public void generateUsername(){
        
        int rand = (int) (Math.random() * (1000 - 0)) + 0;
    
        userName = lastName + firstName.charAt(0) + rand;
        
    }
    
    public String getUserName(){
        return userName;
    }
    
    public void generatePassword(){
        
        String pwd = "";
        ComplexPassword pass = null;
        boolean isValid = false;
        
        while (!isValid) {

            try {
                String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789~`!@#$%^&*()-_=+[{]}\\|;:\'\",<.>/?";
                pwd = RandomStringUtils.random(9, characters);
                System.out.println(pwd);
                pass = new ComplexPassword(pwd);

                System.out.println(pass.validate());

                if (pass.validate() == true) {
                    isValid = true;
                }
            } catch (Exception e) {
                System.out.println(pass.errorMessage());
            }

            
        }
        
        password = pwd;
    }
    
    public String getPassword(){
        return password;
    }
    
    
}
