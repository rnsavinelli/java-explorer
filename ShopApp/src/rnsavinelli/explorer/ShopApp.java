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
        double subtotal = 0.0, taxes = 0.0, total = 0.0;
        
        int measurement = 3;
        
        Customer customer = new Customer(
            "Pinky", 25, getCustomerSizeFromMeasurement(measurement)
        );
           
        greet();
                        
        Clothing item0 = new Clothing("Blue Jacket", 20.9, "M");
        Clothing item1 = new Clothing("Orange T-Shirt", 10.5, "S");
        Clothing item2 = new Clothing("Green Scarf", 5, "S");
        Clothing item3 = new Clothing("Blue T-Shirt", 10.5, "S");

        Clothing[] items = {item0, item1, item2, item3};

        System.out.println("\nBasket:");
        for (Clothing item: items) {
            System.out.println(item.description + ", " + item.price + ", " + item.size);        
        }

        System.out.println("\nNotice:");
        System.out.println("Only the items of the costumer's size will be checked out.");
        
        //subtotal = amounts[0] * items[0].price + amounts[1] * items[1].price;
        //taxes = subtotal * tax;
        
        for (int i = 0; i < items.length; i++) {
            if (items[i].size.equals(customer.size)) {
                double itemSubtotal = items[i].price;
            
                subtotal += itemSubtotal;
                taxes += itemSubtotal * tax;
            }
        }
        
        total = subtotal + taxes;
       
        System.out.println("\nSubtotal: " + subtotal);
        System.out.println("Taxes: " + taxes);
        System.out.println("------------------------");
        System.out.println("Total: " + total);
    }
}