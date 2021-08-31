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

    private static void welcome() {
        System.out.println(welcomeMessage);
    }    

    private static Clothing[] getClothingItemList() {        
        Clothing item0 = new Clothing("Blue Jacket", 20.9, "M");
        Clothing item1 = new Clothing("Orange T-Shirt", 10.5, "S");
        Clothing item2 = new Clothing("Green Scarf", 5, "S");
        Clothing item3 = new Clothing("Blue T-Shirt", 10.5, "S");
        
        Clothing items[] = {item0, item1, item2, item3};
        
        return items;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {                
        Customer customer = new Customer(
            "Duke", 22, 4, getClothingItemList()
        );

        welcome();
        
        System.out.println("\nShopping Basket:");
        for (Clothing item: customer.getItems()) {
            System.out.println(item.getDescription() + ", " + item.getPrice() + ", " + item.getSize());        
        }
        
        System.out.println("\nTotal: " + customer.getTotalClothingCost());
    }
}