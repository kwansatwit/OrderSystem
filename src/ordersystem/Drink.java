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
public class Drink extends Food{

    private boolean isAlcoholic;

    public Drink(String id, String name, String size, boolean isAlcoholic, double price, int amountLeft) {
        super(id, name, size, price, amountLeft);
        this.isAlcoholic = isAlcoholic;
    }

    public boolean getIsAlcoholic() {
        return isAlcoholic;
    }

    public void setIsAlcoholic(boolean isAlcoholic) {
        this.isAlcoholic = isAlcoholic;
    }

}
