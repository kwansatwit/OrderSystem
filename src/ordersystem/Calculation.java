package ordersystem;


import java.util.ArrayList;

/**
 *
 * @author Shuk Ha Kwan
 * 
 * 1/27/22: 
 * Created Class for calculate bills and sales report - Ha
 * 3/8/22:
 * added setter and getter for total and price
 * in case need to reset total
 */
public class Calculation {
    private double total, price;
    
    /**
     * default constructor
     * initialize price and total to be 0
     */
    Calculation(){
         price = 0;      
         total = 0;
    }    
    
    /**
     * Constructor with one argument 
     * @param price 
     */
    Calculation(double price){
        this.price = price;
    }
    
    /**
     * set total function
     * can use it to reset total
     * @param total 
     */
    public void setTotal(double total){
        this.total = total;
    }
    
    /**
     * Set price function
     * @param price 
     */
    public void setPrice(double price){
        this.price = price;
    }
    
    /**
     * get total amount
     * @return 
     */
    public final double  getTotal(){
        return this.total;        
    }
    
    /**
     * get price
     * @return 
     */
    public final double getPrice(){
        return this.price;
    }
    /**
     * added price each time and updated the total prices
     * @param price
     * @return the sum of price 
     */
   public double addTotal(double price)
    {
        return total += price;
    }
    
    /**
     * subtract price each time and updated the total prices
     * @param price
     * @return the sum of price
     */
    public double subtractTotal(double price){
        
        return total -= price;
    }
    

    /**
     * 
     * @param sales - an arraylist contained all the sales value as double
     * the arraylist passed from gui, which come from database
     * @return a sum of all sales value
     */
    public double totalSale(ArrayList<Double> sales){
      return sales.stream().mapToDouble(Double::doubleValue).sum();
   }
    
    
    
}
