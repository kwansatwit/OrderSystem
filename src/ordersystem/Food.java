/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordersystem;

/**
 *
 * @author Ahmed Diab
 */
public class Food {
    private String id;
    private String name;
    private String size;
    private double price;
    private int amountLeft;

    public Food(String id, String name, String size, double price, int amountLeft) {
        this.id = id;
        this.name = name;
        this.size = size;
        this.price = price;
        this.amountLeft = amountLeft;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmountLeft() {
        return amountLeft;
    }

    public void setAmountLeft(int amountLeft) {
        this.amountLeft = amountLeft;
    }
    
    public String toString(){
        return name + "\t\t" + size;
    }
}
