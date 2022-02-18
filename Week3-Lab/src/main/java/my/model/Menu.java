/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.model;

/**
 *
 * @author khushpreetkaurgulati
 */
public class Menu {
    
    private String ID;
    private String Name;
    private double Price;
    
    
    public Menu(String ID, String name, double price)
    {
        this.ID = ID;
        this.Name = name;
        this.Price = price;
               
    }

    /**
     * @return the ID
     */
    public String getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return Price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.Price = price;
    }
    
}
