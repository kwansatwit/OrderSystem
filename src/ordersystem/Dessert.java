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
public class Dessert extends Food {
    private int calories;

    public Dessert(String id, String name, String size, double price, int amountLeft) {
        super(id, name, size, price, amountLeft);

    }
    
}
