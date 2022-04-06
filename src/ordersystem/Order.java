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
    private double total;
    private double tax;
    private double totalWithTax;
    
    public Order(){
        orderID = "";
        orderTime = "";
        orderLocation = "";
        phoneNumber = "";
       
    }
    
    public Order(String orderTime, String orderLocation, String phoneNumber, ArrayList<Item> items) {
        this.orderTime = orderTime;
        this.orderLocation = orderLocation;
        this.phoneNumber = phoneNumber;
        this.items = items;
        generateOrderID();
    }

    public String getOrderID() {
        return orderID;
    }

    public void generateOrderID() {
        int randomOrderID = (int) (Math.random() * (10000000 - 1000000)) + 1000000;
        orderID = String.valueOf(randomOrderID);
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
    
    public String printItems(){
        String itemsPrint = "";
        for(int i = 0; i < items.size(); i++){
            itemsPrint += (items.get(i).getDescription() + "\t\t" + items.get(i).getTotalPrice() + "\n");
        }     
        return itemsPrint;       
    }
    
    public String printOrder(){
        
        String itemsStr = "";
        
        itemsStr += "Order ID: " + orderID + "\n";
        itemsStr += "Time: " + orderTime + "\n";
        
        for(int i = 0; i < items.size(); i++){
            itemsStr += (items.get(i).getDescription() + "\t\t" + items.get(i).getTotalPrice() + "\n");
        }
        
        itemsStr += "--------------------------------------------";
        itemsStr += "\n" + "Price:" + "\t\t" + "$" + total;
        itemsStr += "\n" + "Tax:" + "\t\t" + "$" + tax;
        itemsStr += "\n" + "Total:" + "\t\t" + "$" + totalWithTax + "\n"
                + "----------------------------------------------" + "\n";
        
        return itemsStr;
    }
    
    public double totalPrice(){
        //double total = 0.0;
        double total_price = 0.0;
        for(int i = 0; i < items.size(); i++){
            total_price += items.get(i).getTotalPrice();
        }
        
        total = Math.round(total_price * 100.0)/100.0;
        
        return total;
    }
    
    public double getTax(){
        tax = Math.round((total * 0.06)*100.0)/100.0;
        return tax;
    }
    
    public double total_with_tax(){
        
        totalWithTax = Math.round((total + tax) * 100.0)/100.0;
        return totalWithTax;
        
    }
    
    
    
}
