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
        String welcomeMessage = "Welcome to rnsavinelli.explorer.ShopApp";
        
        Customer c1 = new Customer("Pinky", 25, "S");
        
        System.out.println(welcomeMessage + " " + c1.name + "!\n");
        
        ///////////////////////////////////////////////////////////
        
        double tax = 0.2, totalPrice, finalPrice;        
        
        System.out.println( "Tax = " + tax + "\n");
        
        Clothing item1 = new Clothing("Blue Jacket", 20.9, "M");
        Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");
        
        int amountItem1 = 1, amountItem2 = 2;
        
        System.out.println(amountItem1 + " x " + item1.description + ", " + item1.price + ", " + item1.size);
        System.out.println(amountItem2 + " x " + item2.description + ", " + item2.price + ", " + item2.size + "\n");
        
        totalPrice = amountItem1 * item1.price + amountItem2 * item2.price;
        finalPrice = totalPrice * (1 + tax);
        
        System.out.println("Total Price: " + totalPrice);        
        System.out.println("Final Price: " + finalPrice);
        
        ///////////////////////////////////////////////////////////
        
        int measurement = 4;
        
        c1.size = getCustomerSizeFromMeasurement(measurement);   
        
        ///////////////////////////////////////////////////////////
    }
    
}