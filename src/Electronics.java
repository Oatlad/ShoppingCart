/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author unasscribed
 */
public class Electronics extends Product {
    
    private String manufacturer;
    private String modelNum;
    private int serialNum;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModelNum() {
        return modelNum;
    }

    public void setModelNum(String modelNum) {
        this.modelNum = modelNum;
    }

    public int getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(int serialNum) {
        this.serialNum = serialNum;
    }

    public Electronics(String manufacturer, String modelNum, int serialNum) {
        this.manufacturer = manufacturer;
        this.modelNum = modelNum;
        this.serialNum = serialNum;
    }

    public Electronics(String manufacturer, String modelNum, int serialNum, int productCode, String description, int avgRating, double price, int inventory) {
        super(productCode, description, avgRating, price, inventory);
        this.manufacturer = manufacturer;
        this.modelNum = modelNum;
        this.serialNum = serialNum;
    }

    public Electronics() {
        this.manufacturer = manufacturer;
        this.modelNum = modelNum;
        this.serialNum = serialNum;
    }
    
    
    
    @Override 
    public String toString() {
        return "";
    }
    
    
    
}
