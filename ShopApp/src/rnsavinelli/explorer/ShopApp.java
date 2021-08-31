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
    
    private static String getCustomerSizeFromMeasurement(int measurement) {
        String size;
                
        switch (measurement) {
            case 1:
            case 2:
            case 3:
                size = "S";
                break;
            case 4:
            case 5:
            case 6:
                size = "M";
                break;
            case 7:
            case 8:
            case 9:
                size = "L";
                break;                
            default:
                size = "X";
                break;
        }
        
        return size;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double subtotal, taxes, total;          
        int measurement = 3;
        Customer c1 = new Customer("Pinky", 25, getCustomerSizeFromMeasurement(measurement));
           
        greet();
                        
        Clothing item0 = new Clothing("Blue Jacket", 20.9, "M");
        Clothing item1 = new Clothing("Orange T-Shirt", 10.5, "S");
        
        Clothing[] items = {item0, item1};

        System.out.println("\nInventory:");
        for (Clothing item: items) {
            System.out.println(item.description + ", " + item.price + ", " + item.size);        
        }
        
        int amountItem0 = 1, amountItem1 = 2;
        int[] amounts = {amountItem0, amountItem1};
        
        System.out.println("\nBasket:");
        for (int i = 0; i < items.length; i++) {
            System.out.println(amounts[i] + " x " + items[i].description + ", " + items[i].price + ", " + items[i].size);
        }
        
        subtotal = amounts[0] * items[0].price + amounts[1] * items[1].price;
        taxes = subtotal * (tax);
        total = subtotal + taxes;
        
        System.out.println("\nSubtotal: " + subtotal);
        System.out.println("Taxes: " + taxes);
        System.out.println("------------------------");
        System.out.println("Total: " + total);
    }
    
}