package User_Interface;
/*
 fix the UI part, this page can close the sub page without close the main mneu page
*/
import java.awt.Color;
import java.awt.List;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ordersystem.Customer;
import ordersystem.CustomerDB;
import ordersystem.Dessert;
import ordersystem.DessertDB;
import ordersystem.Dish;
import ordersystem.DishDB;
import ordersystem.Drink;
import ordersystem.DrinkDB;
import ordersystem.Food;
import ordersystem.Item;
import ordersystem.Order;
import ordersystem.OrderDB;
import ordersystem.Pizza;
import ordersystem.PizzaDB;
import ordersystem.Sandwich;
import ordersystem.SandwichDB;

/**
 * 
 * @author zhangf2
 */
public class MainMenuGUI extends javax.swing.JFrame {
    
    String databaseName = "sql5475007";
    String dbUserName = "sql5475007";
    String dbPassword = "avlj8CSFyF";
    
    ArrayList<Pizza> pizzas;
    ArrayList<Dish> dishes;
    ArrayList<Sandwich> sandwiches;
    ArrayList<Drink> drinks;
    ArrayList<Dessert> desserts;
    
    CustomerDB customerDB = null;
    Customer customer = null;
    
    ArrayList<Item> items = new ArrayList<>();
    Order order = new Order();
    
    OrderDB orderDB = null;
    PizzaDB pizzaDB = null;
    DishDB dishDB = null;
    SandwichDB sandwichDB = null;
    DrinkDB drinkDB = null;
    DessertDB dessertDB = null;
    
    boolean pizzaClicked = false;
    boolean dishClicked = false;
    boolean sandwichClicked = false;
    boolean drinkClicked = false;
    boolean dessertClicked = false;

    public MainMenuGUI() throws Exception {
        initComponents();
        /*String databaseName = "sql5475007";
        String dbUserName = "sql5475007";
        String dbPassword = "avlj8CSFyF";

        PizzaDB DBpizzas = new PizzaDB(databaseName,dbUserName,dbPassword);
        
        ArrayList<Pizza> pizzas = new ArrayList<>();

 
        try {
            // populate the table with pizzas data.
            pizzas = DBpizzas.getPizzas();
        } catch (Exception ex) {
            Logger.getLogger(MainMenuGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        addRowToJTable(pizzas);*/
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_menu = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        sandwich = new javax.swing.JButton();
        pizza = new javax.swing.JButton();
        dish = new javax.swing.JButton();
        drink = new javax.swing.JButton();
        dessert = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_menu = new javax.swing.JTable();
        label_check = new javax.swing.JLabel();
        save = new javax.swing.JButton();
        employee_management = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        food_management = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        customer_check = new javax.swing.JButton();
        check_phoneNum = new javax.swing.JTextField();
        print = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        customer_info = new javax.swing.JTextArea();
        backgroud = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel_menu.setFont(new java.awt.Font("Arial", 3, 48)); // NOI18N
        jLabel_menu.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_menu.setText("Order Menu");
        jPanel1.add(jLabel_menu);
        jLabel_menu.setBounds(210, 60, 290, 50);

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        sandwich.setBackground(new java.awt.Color(204, 204, 204));
        sandwich.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sandwich.setForeground(new java.awt.Color(0, 153, 153));
        sandwich.setText("Sandwich");
        sandwich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sandwichActionPerformed(evt);
            }
        });

        pizza.setBackground(new java.awt.Color(204, 204, 204));
        pizza.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pizza.setForeground(new java.awt.Color(0, 153, 153));
        pizza.setText("Pizza");
        pizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pizzaActionPerformed(evt);
            }
        });

        dish.setBackground(new java.awt.Color(204, 204, 204));
        dish.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dish.setForeground(new java.awt.Color(0, 153, 153));
        dish.setText("Dish");
        dish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dishActionPerformed(evt);
            }
        });

        drink.setBackground(new java.awt.Color(204, 204, 204));
        drink.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        drink.setForeground(new java.awt.Color(0, 153, 153));
        drink.setText("Drink");
        drink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drinkActionPerformed(evt);
            }
        });

        dessert.setBackground(new java.awt.Color(204, 204, 204));
        dessert.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dessert.setForeground(new java.awt.Color(0, 153, 153));
        dessert.setText("Dessert");
        dessert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dessertActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sandwich)
                    .addComponent(pizza, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dish, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drink, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dessert, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(sandwich, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(pizza, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(dish, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(drink, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(dessert, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(50, 140, 150, 440);

        table_menu.setAutoCreateRowSorter(true);
        table_menu.setBackground(new java.awt.Color(51, 51, 0));
        table_menu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        table_menu.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        table_menu.setForeground(new java.awt.Color(102, 255, 255));
        table_menu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Size", "Price", "Inventory", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table_menu.setAlignmentX(1.2F);
        table_menu.setAlignmentY(2.0F);
        table_menu.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        table_menu.setGridColor(new java.awt.Color(204, 255, 255));
        table_menu.setIntercellSpacing(new java.awt.Dimension(1, 2));
        table_menu.setRowHeight(25);
        jScrollPane1.setViewportView(table_menu);
        table_menu.getAccessibleContext().setAccessibleName("");

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(200, 140, 640, 440);

        label_check.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        label_check.setForeground(new java.awt.Color(255, 255, 255));
        label_check.setText("Customer Information:");
        jPanel1.add(label_check);
        label_check.setBounds(850, 160, 160, 40);

        save.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Button-Ok-icon.png"))); // NOI18N
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel1.add(save);
        save.setBounds(930, 460, 130, 40);

        employee_management.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        employee_management.setText("Employee Management");
        employee_management.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employee_managementActionPerformed(evt);
            }
        });
        jPanel1.add(employee_management);
        employee_management.setBounds(550, 90, 190, 40);

        logout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        logout.setText("Log out");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel1.add(logout);
        logout.setBounds(960, 30, 90, 30);

        food_management.setBackground(new java.awt.Color(204, 204, 204));
        food_management.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        food_management.setText("Food Management");
        food_management.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                food_managementActionPerformed(evt);
            }
        });
        jPanel1.add(food_management);
        food_management.setBounds(550, 30, 190, 38);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/addItem.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 20, 190, 100);

        customer_check.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        customer_check.setText("Check");
        customer_check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customer_checkActionPerformed(evt);
            }
        });
        jPanel1.add(customer_check);
        customer_check.setBounds(960, 130, 90, 29);

        check_phoneNum.setText("Input a phone number");
        jPanel1.add(check_phoneNum);
        check_phoneNum.setBounds(840, 80, 210, 30);

        print.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/print48.png"))); // NOI18N
        print.setText("Print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        jPanel1.add(print);
        print.setBounds(930, 530, 130, 40);

        customer_info.setColumns(20);
        customer_info.setRows(5);
        jScrollPane2.setViewportView(customer_info);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(850, 200, 210, 240);

        backgroud.setForeground(new java.awt.Color(204, 204, 204));
        backgroud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/background3.jpg"))); // NOI18N
        backgroud.setText("jLabel1");
        jPanel1.add(backgroud);
        backgroud.setBounds(0, 0, 1100, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1100, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void phoneNum_checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNum_checkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNum_checkActionPerformed

    private void button_checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_checkActionPerformed
         //CustomerGUI customer = new CustomerGUI();
         //customer.setVisible(true);
    }//GEN-LAST:event_button_checkActionPerformed

    private void button_sandwichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_sandwichActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_sandwichActionPerformed

    private void button_employeeMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_employeeMActionPerformed
        try {
            MainMenuGUI mainMenu = new MainMenuGUI();
        } catch (Exception ex) {
            Logger.getLogger(MainMenuGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
       // mainMenu.setVisible(false); 
       // dispose(); //Destroy the JFrame object
       EmployeeGUI employee = new EmployeeGUI();
       employee.setVisible(true);
    }//GEN-LAST:event_button_employeeMActionPerformed

    private void button_itemMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_itemMActionPerformed
        //FoodManageGUI food = new FoodManageGUI();
        //food.setVisible(true);
    }//GEN-LAST:event_button_itemMActionPerformed

    private void button_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_printActionPerformed
        //PrintGUI print = new PrintGUI();
        //print.setVisible(true);
    }//GEN-LAST:event_button_printActionPerformed

    private void button_pizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_pizzaActionPerformed
        EmployeeGUI employee = new EmployeeGUI();
        employee.setVisible(true);
    }//GEN-LAST:event_button_pizzaActionPerformed

    private void button_dishesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_dishesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_dishesActionPerformed

    private void button_drinksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_drinksActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_drinksActionPerformed

    private void button_dessertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_dessertActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_dessertActionPerformed

    private void button_logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_logOutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_logOutActionPerformed

    private void button_saveOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_saveOrderActionPerformed
        // TODO add your handling code here:
        EmployeeGUI employee = new EmployeeGUI();
        employee.setVisible(true);
    }//GEN-LAST:event_button_saveOrderActionPerformed

    private void employee_managementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employee_managementActionPerformed
        try {
            MainMenuGUI mainMenu = new MainMenuGUI();
            mainMenu.setVisible(false);
            // dispose(); //Destroy the JFrame object
            EmployeeGUI employee = new EmployeeGUI();
            employee.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(MainMenuGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_employee_managementActionPerformed

    private void food_managementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_food_managementActionPerformed
        ProductGUI food = new ProductGUI();
        food.setVisible(true);
    }//GEN-LAST:event_food_managementActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        // dispose the main menu, and replay login page again, to allow another employee to login.
        this.dispose();  
        LoginGUI login = new LoginGUI();
        login.setVisible(true);
        
    }//GEN-LAST:event_logoutActionPerformed

    private void sandwichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sandwichActionPerformed
        sandwichClicked = true;
        dessertClicked = false;
        drinkClicked = false;
        dishClicked = false;
        pizzaClicked = false;
        try {
            System.out.println("clicked!");       
            SandwichDB DBsandwiches = new SandwichDB(databaseName,dbUserName,dbPassword);
            
            sandwiches = new ArrayList<>();
            
            
            
            // populate the table with sandwiches data.
            sandwiches = DBsandwiches.getSandwiches();
            
            addRowToJTable();
            
            System.out.println("here!");
        } catch (Exception ex) {
            Logger.getLogger(MainMenuGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_sandwichActionPerformed

    private void pizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pizzaActionPerformed
        
        pizzaClicked = true;
        dishClicked = false;
        sandwichClicked = false;
        drinkClicked = false;
        dessertClicked = false;
        try {
            System.out.println("clicked!");       
            PizzaDB DBpizzas = new PizzaDB(databaseName,dbUserName,dbPassword);
            
            pizzas = new ArrayList<>();
            
            
            
            // populate the table with pizzas data.
            pizzas = DBpizzas.getPizzas();
            
            addRowToJTable();
            
            System.out.println("here!");
        } catch (Exception ex) {
            Logger.getLogger(MainMenuGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_pizzaActionPerformed

    private void dishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dishActionPerformed
        dishClicked = true;
        pizzaClicked = false;
        sandwichClicked = false;
        drinkClicked = false;
        dessertClicked = false;
        try {
            System.out.println("clicked!");       
            DishDB DBdishes = new DishDB(databaseName,dbUserName,dbPassword);
            
            dishes = new ArrayList<>();
            
            
            
            // populate the table with dishes data.
            dishes = DBdishes.getDishes();
            
            addRowToJTable();
            
            System.out.println("here!");
        } catch (Exception ex) {
            Logger.getLogger(MainMenuGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dishActionPerformed

    private void drinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drinkActionPerformed
        drinkClicked = true;
        dishClicked = false;
        pizzaClicked = false;
        sandwichClicked = false;
        dessertClicked = false;
        try {
            System.out.println("clicked!");       
            DrinkDB DBdrinks = new DrinkDB(databaseName,dbUserName,dbPassword);
            
            drinks = new ArrayList<>();
            
            
            
            // populate the table with drinks data.
            drinks = DBdrinks.getDrinks();
            
            addRowToJTable();
            
            System.out.println("here!");
        } catch (Exception ex) {
            Logger.getLogger(MainMenuGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_drinkActionPerformed

    private void dessertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dessertActionPerformed
        dessertClicked = true;
        drinkClicked = false;
        dishClicked = false;
        pizzaClicked = false;
        sandwichClicked = false;
        try {
            System.out.println("clicked!");       
            DessertDB DBdesserts = new DessertDB(databaseName,dbUserName,dbPassword);
            
            desserts = new ArrayList<>();
            
            
            
            // populate the table with desserts data.
            desserts = DBdesserts.getDesserts();
            
            addRowToJTable();
            
            System.out.println("here!");
        } catch (Exception ex) {
            Logger.getLogger(MainMenuGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dessertActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        String id = String.valueOf(table_menu.getModel().getValueAt(table_menu.getSelectedRow(), 0));
        String name = String.valueOf(table_menu.getModel().getValueAt(table_menu.getSelectedRow(), 1));
        String size = String.valueOf(table_menu.getModel().getValueAt(table_menu.getSelectedRow(), 2));
        String p = String.valueOf(table_menu.getModel().getValueAt(table_menu.getSelectedRow(), 3));
        int amount = Integer.parseInt(String.valueOf(table_menu.getModel().getValueAt(table_menu.getSelectedRow(), 5)));
        String description = amount + " " + name + "\t" + size;
        
        // remove dollar sign from price and convert it to double.
        String convertPrice = p.replace("$", "");
        double price = Double.parseDouble(convertPrice);
        
        Item item = new Item(description, price, amount);
        
        System.out.println(item.getDescription() + "\t\t" + item.getTotalPrice());
        items.add(item);
        if(pizzaClicked){
           
            pizzaDB = new PizzaDB(databaseName, dbUserName, dbPassword);
            
            try {
                pizzaDB.decrementAmount(id, amount);
            } catch (Exception ex) {
                Logger.getLogger(MainMenuGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }
        
        if(dishClicked){
           
            dishDB = new DishDB(databaseName, dbUserName, dbPassword);
            
            try {
                dishDB.decrementAmount(id, amount);
            } catch (Exception ex) {
                Logger.getLogger(MainMenuGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }
        
        if(sandwichClicked){
           
            sandwichDB = new SandwichDB(databaseName, dbUserName, dbPassword);
            
            try {
                sandwichDB.decrementAmount(id, amount);
            } catch (Exception ex) {
                Logger.getLogger(MainMenuGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }
        
        if(drinkClicked){
           
            drinkDB = new DrinkDB(databaseName, dbUserName, dbPassword);
            
            try {
                drinkDB.decrementAmount(id, amount);
            } catch (Exception ex) {
                Logger.getLogger(MainMenuGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }
        
        if(dessertClicked){
           
            dessertDB = new DessertDB(databaseName, dbUserName, dbPassword);
            
            try {
                dessertDB.decrementAmount(id, amount);
            } catch (Exception ex) {
                Logger.getLogger(MainMenuGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }
        
        
        System.out.println(amount);
    }//GEN-LAST:event_saveActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String time = String.valueOf(dtf.format(now));
        System.out.println(time);
        String[] dateTime = time.split(" ");
        
        order = new Order(dateTime[1], dateTime[0], customer.getAddress(), customer.getPhoneNumber(), items);
        order.totalPrice();
        order.getTax();
        order.total_with_tax();
        orderDB = new OrderDB(databaseName, dbUserName, dbPassword);
        try {
            orderDB.addOrder(order);
        } catch (Exception ex) {
            Logger.getLogger(MainMenuGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        PrintGUI printGUI = new PrintGUI();
        printGUI.printOrder(order.printOrder() + customer.printCustomer());
        
        items.removeAll(items);
        printGUI.setVisible(true);
    }//GEN-LAST:event_printActionPerformed

    private void customer_checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customer_checkActionPerformed
        
        customerDB = new CustomerDB("sql5475007", "sql5475007", "avlj8CSFyF");
        customer_info.setText("");
        
        try {
            if(customerDB.isCustomer(check_phoneNum.getText())){
                customer = customerDB.getCustomer(check_phoneNum.getText());
                customer_info.setText(customer.printCustomer());           
            }
            else{
                CustomerGUI customer = new CustomerGUI();
                customer.setVisible(true);
            }
        } catch (Exception ex) {
            Logger.getLogger(MainMenuGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_customer_checkActionPerformed

     public void close(){
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MainMenuGUI().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(MainMenuGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
    }
    
    
    // add rows to table and populate them with list of pizzas data.
     public void addRowToJTable()
    {

        DefaultTableModel model = (DefaultTableModel) table_menu.getModel();
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();

        Object rowData[] = new Object[6];
        
        /*if(pizzas.getClass().isInstance(Pizza)){
            
        }*/
       
        if (pizzaClicked) {
            for (int i = 0; i < pizzas.size(); i++) {
                rowData[0] = pizzas.get(i).getId();
                rowData[1] = pizzas.get(i).getName();
                rowData[2] = pizzas.get(i).getSize();
                rowData[3] = "$" + pizzas.get(i).getPrice();
                rowData[4] = pizzas.get(i).getAmountLeft();

                model.insertRow(i, rowData);

            }
        }
        
        if (dishClicked){
            for (int i = 0; i < dishes.size(); i++) {
                rowData[0] = dishes.get(i).getId();
                rowData[1] = dishes.get(i).getName();
                rowData[2] = dishes.get(i).getSize();
                rowData[3] = "$" + dishes.get(i).getPrice();
                rowData[4] = dishes.get(i).getAmountLeft();

                model.insertRow(i, rowData);

            }
        }
        
        if (sandwichClicked){
            for (int i = 0; i < sandwiches.size(); i++) {
                rowData[0] = sandwiches.get(i).getId();
                rowData[1] = sandwiches.get(i).getName();
                rowData[2] = sandwiches.get(i).getSize();
                rowData[3] = "$" + dishes.get(i).getPrice();
                rowData[4] = sandwiches.get(i).getAmountLeft();

                model.insertRow(i, rowData);

            }
        }
        
        if (drinkClicked){
            for (int i = 0; i < drinks.size(); i++) {
                rowData[0] = drinks.get(i).getId();
                rowData[1] = drinks.get(i).getName();
                rowData[2] = drinks.get(i).getSize();
                rowData[3] = "$" + drinks.get(i).getPrice();
                rowData[4] = drinks.get(i).getAmountLeft();

                model.insertRow(i, rowData);

            }
        }
        
        if (dessertClicked){
            for (int i = 0; i < desserts.size(); i++) {
                rowData[0] = desserts.get(i).getId();
                rowData[1] = desserts.get(i).getName();
                rowData[2] = desserts.get(i).getSize();
                rowData[3] = "$" + desserts.get(i).getPrice();
                rowData[4] = desserts.get(i).getAmountLeft();
                

                model.insertRow(i, rowData);

            }
        }
        
        
        
                
    }
     
    // add rows to table and populate them with list of pizzas data.
     public void addRowToDishJTable(ArrayList<Dish> listDishes)
    {

        DefaultTableModel model = (DefaultTableModel) table_menu.getModel();
        Object rowData[] = new Object[6];
        
        /*if(pizzas.getClass().isInstance(Pizza)){
            
        }*/
       
        
        for(int i = 0; i < listDishes.size(); i++)
        {
            rowData[0] = listDishes.get(i).getId();
            rowData[1] = listDishes.get(i).getName();
            rowData[2] = listDishes.get(i).getSize();
            rowData[3] = listDishes.get(i).getPrice();
            rowData[4] = listDishes.get(i).getAmountLeft();
           // rowData[6] = pizzas.get(i).getSauce();
            
            
            model.insertRow(i, rowData);      
            
        }
        
                
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroud;
    private javax.swing.JTextField check_phoneNum;
    private javax.swing.JButton customer_check;
    private javax.swing.JTextArea customer_info;
    private javax.swing.JButton dessert;
    private javax.swing.JButton dish;
    private javax.swing.JButton drink;
    private javax.swing.JButton employee_management;
    private javax.swing.JButton food_management;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_menu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label_check;
    private javax.swing.JButton logout;
    private javax.swing.JButton pizza;
    private javax.swing.JButton print;
    private javax.swing.JButton sandwich;
    private javax.swing.JButton save;
    private javax.swing.JTable table_menu;
    // End of variables declaration//GEN-END:variables
}
