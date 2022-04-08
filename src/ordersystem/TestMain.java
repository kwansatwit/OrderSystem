package ordersystem;
import static java.lang.Character.isUpperCase;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.sql.Date; 
import org.apache.commons.lang3.RandomStringUtils;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Shuk Ha Kwan, Ahmed Diab
 * 1/27/2022:
 * Class for testing only
 */
public class TestMain {

    public static void main(String[] args) throws ClassNotFoundException, SQLException, Exception {
    	
    	String databaseName = "sql5475007";
    	String userName = "sql5475007";
    	String password = "avlj8CSFyF";
    	
    	
    	/*DbConnection connection = new DbConnection(databaseName, userName, password);
    	Connection con = connection.openConnection();    	

        Scanner input =  new Scanner(System.in);  
        
        
        Employee employee = new Employee("ahmed", "diab", "02/05/1997", "122 main st.", "617-765-6464", "ahmed@exm.com", "emp", 0);
        
        employee.generateUsername();
        employee.generatePassword();
        
        
        System.out.println(employee.getUserName());
        System.out.println(employee.getPassword());
        
        DataCryption data = new DataCryption();
        data.setData(password);
        String pw = data.getData();
        String en = data.enCryption();
        data.setData(en);
        String de = data.deCryption(); 
        System.out.println("Origin Pw: " + pw+" \nEncrypted: " + en + " \nDeCryption: " + de);*/
        
        /*int rand = (int) (Math.random() * (10000000 - 1000000)) + 1000000;
        System.out.println(rand);*/
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String time = String.valueOf(dtf.format(now));
        System.out.println(time);  
        
        /*String id = "21351";
        int amount = 11;
        
        PizzaDB pizzaDB = new PizzaDB(databaseName, userName, password);
        
        pizzaDB.decrementAmount(id, amount);
        
        String dishID = "18923";
        
        DishDB dishDB = new DishDB(databaseName, userName, password);
        
        dishDB.decrementAmount(dishID, amount);
        
        String text = java.text.MessageFormat.format("You''re about to delete {0} rows.", 5);
        System.out.println(text);*/

        String phoneNum = "6178919999";
        
        CustomerDB cDB = new CustomerDB("sql5475007", "sql5475007", "avlj8CSFyF");
        
        Customer customer = cDB.getCustomer(phoneNum);
        
        System.out.println(customer.printCustomer());
        
        System.out.println(cDB.isCustomer("6761223173"));
        
        Pizza pizza = new Pizza("sadadss", "pepperoni pizza", "M", "tomato sauce", 14.99, 290);
        Dish dish = new Dish("khhj", "Lasagna", "L", 22.45, 190);
        Drink drink = new Drink("dsadads", "Margarita", "M", true, 60.56, 78);
        
        //System.out.println(pizza.toString());
        
        Item item1 = new Item(pizza.toString(), pizza.getPrice(), 3);
        Item item2 = new Item(dish.toString(), dish.getPrice(), 2);
        Item item3 = new Item(drink.toString(), drink.getPrice(), 1);
        
        
        ArrayList<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);
        
       // Date date = "04/07/2022";
        Date date = Date.valueOf("2022-04-07"); 
        Order order = new Order("09:45 pm", date, "122 main st. Boston, MA", "617-999-9891", items);
        System.out.println(order.printOrder());

       


    }
    
    public static void oldTest(){
             
     // testing for the password creator
      /*ComplexPassword pw = new ComplexPassword();
      boolean isPw = false;
      String pws = "";*/
      
      
      
      /*while(true){

         try{
          System.out.print("Enter PW: ");
          pws = input.nextLine();
          pw.setPassword(pws); 
          pw.validate();

          
          
         }catch(Exception e){
             System.out.print("Here?");
             System.out.print(e.getMessage()+"\n");
             System.out.println(pw.errorMessage());   
   
        }
      }*/
      
      /*       ArrayList<Double> amount = new ArrayList<Double>();
        Calculation cal = new Calculation();
        double upperbound = 1500;
        Random rand = new Random();
        double r, sum = 0;
        System.out.println("Total: ");
        
        for (int i = 0; i < 10; i++) {
            r = Math.floor(rand.nextDouble()*100)/100;
            
            amount.add(r);
            sum += r;
            System.out.print(r + " ");
            
        }
        System.out.println("sum= " + sum + " ");

        double total = 0.0;
        total = cal.totalSale(amount);

        System.out.println("TestMain.main()" + total);

        double price = 0, sumTotal=0.0;
        while (price >= 0) {
            System.out.println("Add enter +, Subtract enter - ");
            System.out.print("Enter: ");            
            char c = input.next().charAt(0);
            System.out.print("price: ");
            price = input.nextDouble();
            if(c == '+'){        
            sumTotal = cal.addTotal(price);
            }else if(c== '-'){
               sumTotal = cal.subtractTotal(price);
            }else
            {
                System.out.println("Wrong Input! Enter again");
            }
             System.out.println("getTotal = "+ cal.getTotal());
        }
        */
    }

}
