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
    private String description;
    private double price;
    private String size;
    
    private final int MINIMUM_PRICE = 10;
    private final double TAX_RATE = 0.2;

    Clothing(String description, double price, String size) {
        this.setDescription(description);
        this.setPrice(price);
        this.setSize(size);
    }    
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getDescription() {
        return this.description;
    }

    public void setPrice(double price) {
        this.price = (price > MINIMUM_PRICE) ? price : MINIMUM_PRICE;
    }
    
    public double getPrice() {
        return this.price * (1 + TAX_RATE);
    }   
    
    public void setSize(String size) {
        this.size = size;
    }
    
    public String getSize() {
        return this.size;
    }
}
