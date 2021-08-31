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
public class Clothing {
    String description;
    double price;
    String size = "M";
    
    Clothing(String d, double p, String s) {
        description = d;
        price = p;
        size = s;
    }    
}
