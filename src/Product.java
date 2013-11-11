/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author unasscribed
 */
public class Product {

    //super class object properties
    private int productCode;
    private String description;
    private int avgRating;
    private double price;
    private int inventory;

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAvgRating() {
        return avgRating;
    }

    public void setAvgRating(int avgRating) {
        this.avgRating = avgRating;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    //consructor
    
    
    public Product() {
        this.avgRating = avgRating;
        this.description = description;
        this.inventory = inventory;
        this.price = price;
        this.productCode = productCode;
    }
    
    
    
    public Product(int productCode, String description, int avgRating, double price, int inventory) {
        this.productCode = productCode;
        this.description = description;
        this.avgRating = avgRating;
        this.price = price;
        this.inventory = inventory;
    }

    @Override
    public String toString() {
        return "You have selected: " + getDescription() + "(PC)" + getProductCode() + "\n It costs: " + getPrice() +
               "The average customer rating is: " + getAvgRating() + "\n  There are: " + getInventory() + " left in stock";
                
    }
}
