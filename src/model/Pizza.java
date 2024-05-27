package model;
import java.util.List;
//加入imgPath
//price

// 父类 Pizza
public class Pizza {
    private String name;
    private double largePrice;
    private double smallPrice;
    private List<String> toppings;
    private String description;
    private String imgPath;

    // Constructor
    public Pizza(String name, double largePrice, double smallPrice, List<String> toppings, String description, String imgPath) {
        this.name = name;
        this.largePrice = largePrice;
        this.smallPrice = smallPrice;
        this.toppings = toppings;
        this.description = description;
        this.imgPath = imgPath;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for largePrice
    public double getLargePrice() {
        return largePrice;
    }

    public void setLargePrice(double largePrice) {
        this.largePrice = largePrice;
    }

    // Getter and Setter for smallPrice
    public double getSmallPrice() {
        return smallPrice;
    }

    public void setSmallPrice(double smallPrice) {
        this.smallPrice = smallPrice;
    }

    // Getter and Setter for toppings
    public List<String> getToppings() {
        return toppings;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }

    // Getter and Setter for description
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Getter and Setter for imgPath
    public String getImgPath() { return imgPath; }

    public void setImgPath(String imgPath) { this.imgPath = imgPath; }

    // Override toString method
    @Override
    public String toString() {
        return  name + "Pizza" +
                ", largePrice: NT$" + largePrice +
                ", smallPrice: NT$" + smallPrice +
                ", toppings: " + toppings +
                ", description: '" + description + '\'' +
                ", imgPath: "+ imgPath +
                '}';
    }
}

