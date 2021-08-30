/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rnsavinelli.explorer;

/**
 *
 * @author rnsavinelli
 */
public class ShopApp {
    final int MAX_CUSTOMERS = 50;
    
    // Constructors should be used
    private static Customer getCustomer(String name, int age) {
        Customer c = new Customer();
        
        c.name = name;
        c.age = age;
        
        return c;
    }
    
    // Constructors should be used
    private static Clothing getClothingItem(String description, double price, String size) {
        Clothing i = new Clothing();
        
        i.description = description;
        i.price = price;
        i.size = size;
        
        return i;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String welcomeMessage = "Welcome to rnsavinelli.explorer.ShopApp";
        double tax = 0.2, totalPrice, finalPrice;
        
        Customer c1 = getCustomer("Pinky", 25);
        
        System.out.println(welcomeMessage + " " + c1.name + "!\n");
        
        System.out.println( "Tax = " + tax + "\n");
        
        Clothing item1 = getClothingItem("Blue Jacket", 20.9, "M");
        Clothing item2 = getClothingItem("Orange T-Shirt", 10.5, "S");
        
        int amountItem1 = 1, amountItem2 = 2;
        
        System.out.println(amountItem1 + " " + item1.description + "," + item1.price + "," + item1.size);
        System.out.println(amountItem2 + " " + item2.description + "," + item2.price + "," + item2.size + "\n");
        
        totalPrice = amountItem1 * item1.price + amountItem2 * item2.price;
        finalPrice = totalPrice * (1 + tax);
        
        System.out.println("Total Price: " + totalPrice);        
        System.out.println("Final Price: " + finalPrice);
    }
    
}