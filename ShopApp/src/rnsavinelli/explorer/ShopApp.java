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
        Customer c1 = new Customer("Pinky", 25, "S");
        double totalPrice, finalPrice;        
        double tax = 0.2;
                
        ///////////////////////////////////////////////////////////
        
        greet();
        
        ///////////////////////////////////////////////////////////
        
        System.out.println( "\nTax = " + tax + "\n");
        
        Clothing item0 = new Clothing("Blue Jacket", 20.9, "M");
        Clothing item1 = new Clothing("Orange T-Shirt", 10.5, "S");
        
        int amountItem0 = 1, amountItem1 = 2;
        
        Clothing[] items = {item0, item1};
        
        int[] amounts = {amountItem0, amountItem1};
        
        System.out.println(amounts[0] + " x " + items[0].description + ", " + items[0].price + ", " + items[0].size);
        System.out.println(amounts[1] + " x " + items[1].description + ", " + items[1].price + ", " + items[1].size + "\n");
        
        totalPrice = amounts[0] * items[0].price + amounts[1] * items[1].price;
        finalPrice = totalPrice * (1 + tax);
        
        System.out.println("Total Price: " + totalPrice);        
        System.out.println("Final Price: " + finalPrice);
        
        ///////////////////////////////////////////////////////////
        
        int measurement = 4;
        
        c1.size = getCustomerSizeFromMeasurement(measurement);   
        
        ///////////////////////////////////////////////////////////
    }
    
}