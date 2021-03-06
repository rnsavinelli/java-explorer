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
public class Customer {
    private String name;
    private int age;
    private String size;
    private Clothing items[];
    
    Customer(String name, int age, String size, Clothing items[]) {
        this.setName(name);
        this.setAge(age);
        this.setSize(size);
        this.addItems(items);
    }

    Customer(String name, int age, int measurement, Clothing items[]) {
        this.setName(name);
        this.setAge(age);
        this.setSize(measurement);
        this.addItems(items);
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public int getPrice() {
        return this.age;
    }   
    
    private String getCustomerSizeFromMeasurement(int measurement) {
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
 
    public void setSize(int measurement) {
        this.size = this.getCustomerSizeFromMeasurement(measurement);
    }    
    
    public void setSize(String size) {
        this.size = size;
    }
    
    public String getSize() {
        return this.size;
    }    
    
    public void addItems(Clothing items[]) {
        this.items = items;
    }
    
    public Clothing[] getItems() {
        return this.items;
    }
    
    public double getTotalClothingCost() {
        double cost = 0.0;
        
        for (Clothing item: items) {
            cost += item.getPrice();
        }
        
        return cost;
    }
}
