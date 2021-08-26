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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String welcomeMessage = "Welcome to rnsavinelli.explorer.ShopApp";
        
        Customer c1 = new Customer();
        
        c1.name = "Pinky";
        
        System.out.println(welcomeMessage + " " + c1.name + "!");
    }
    
}