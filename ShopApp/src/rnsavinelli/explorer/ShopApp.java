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
    static String welcomeMessage = "Welcome to rnsavinelli.explorer.ShopApp!";    
    static double tax = 0.2;

    private static void greet() {
        System.out.println(welcomeMessage);
    }    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double total = 0.0;
                
        Customer customer = new Customer(
            "Pinky", 25, 3
        );
           
        greet();
                        
        Clothing item0 = new Clothing("Blue Jacket", 20.9, "M");
        Clothing item1 = new Clothing("Orange T-Shirt", 10.5, "S");
        Clothing item2 = new Clothing("Green Scarf", 5, "S");
        Clothing item3 = new Clothing("Blue T-Shirt", 10.5, "S");

        Clothing[] items = {item0, item1, item2, item3};

        System.out.println("\nBasket:");
        for (Clothing item: items) {
            System.out.println(item.getDescription() + ", " + item.getPrice() + ", " + item.getSize());        
        }

        System.out.println("\nNotice:");
        System.out.println("Only the items of the costumer's size will be checked out.");
        
        //subtotal = amounts[0] * items[0].price + amounts[1] * items[1].price;
        //taxes = subtotal * tax;
        
        for (int i = 0; i < items.length; i++) {
            if (items[i].getSize().equals(customer.getSize())) {            
                total += items[i].getPrice();
            }
        }
        
        System.out.println("\nTotal: " + total);
    }
}