/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordersystem;

import java.util.ArrayList;

/**
 *
 * @author diaba
 */
public class Order {
    
    private String orderID;
    private String orderTime;
    private String orderLocation;
    private String phoneNumber;
    private ArrayList<Item> items;

    public Order(String orderID, String orderTime, String orderLocation, String phoneNumber, ArrayList<Item> items) {
        this.orderID = orderID;
        this.orderTime = orderTime;
        this.orderLocation = orderLocation;
        this.phoneNumber = phoneNumber;
        this.items = items;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
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

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
    
    public String printOrder(){
        
        String itemsStr = "";
        
        for(int i = 0; i < items.size(); i++){
            itemsStr += (items.get(i).getDescription() + "\t\t" + items.get(i).getPrice() + "\n");
        }
        
        return itemsStr;
    }
    
    public double totalPrice(){
        double total = 0.0;
        
        for(int i = 0; i < items.size(); i++){
            total += items.get(i).getPrice();
        }
        
        return total;
    }
    
    
    
}
