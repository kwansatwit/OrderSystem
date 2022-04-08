/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordersystem;

import java.util.ArrayList;
import java.sql.Date; 

/**
 *
 * @author Shuk Ha Kwan
 * 
 */
public class SalesReport {
    
    private String orderID;
    private Date orderDate;
    private String orderLocation;
    private String phoneNumber;
    private String items;
    private double totalPrice;
    
        public SalesReport(String orderID, Date orderDate, String orderLocation, String phoneNumber, String items, double totalPrice){
            this.orderID = orderID;
            this.orderDate = orderDate;
            this.orderLocation = orderLocation;
            this.phoneNumber = phoneNumber;
            this.items = items;
            this.totalPrice = totalPrice;
            
            
        
    }
        
         public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public Date getOrderTime() {
        return orderDate;
    }

    public void setOrderTime(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderLocation() {
        return orderLocation;
    }

    public void setOrderLocation(String orderLocation) {
        this.orderLocation = orderLocation;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
       public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }
    
        
       public double getTotalPrice() {
        return totalPrice;
    }

    public void setItems(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    
    /**
     * 
     * @param sales
     * @return total price amount
     */
   public double totalSale(ArrayList<Double> sales){
      return sales.stream().mapToDouble(Double::doubleValue).sum();
   }
}
