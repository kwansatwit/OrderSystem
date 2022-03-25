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
public class Pizza extends Food {

    private String sauce;

    public Pizza(String id, String name, String size, String sauce, double price, int amountLeft) {
        super(id, name, size, price, amountLeft);
        this.sauce = sauce;

    }
    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }


    
}
