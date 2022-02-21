/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordersystem;

import java.util.Date;

/**
 *
 * @author diaba
 */
public class Employee {
    
    String firstName;
    String lastName;
    Date dateOfBirth;
    String address;
    String phoneNumber;
    String email;
    String position;
    char access;
    String userName;
    
    public Employee(String firstName, String lastName, Date dateOfBirth, String address, String phoneNumber, String email, String position, char access) {
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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
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

    public char getAccess() {
        return access;
    }

    public void setAccess(char access) {
        this.access = access;
    }
    
    public void generateUsername(){
        
        int rand = (int) (Math.random() * (1000 - 0)) + 0;
    
        userName = lastName + firstName.charAt(0) + rand;
        
    }
    
    public String getUserName(){
        return userName;
    }
    
    
}
