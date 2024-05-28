package model;

import model.Pizza;

public class CartItem {
    private Pizza pizza;
    private String size;
    private int quantity;

    public CartItem(Pizza pizza, String size, int quantity){
        this.pizza = pizza;
        this.size = size;
        this.quantity = quantity;
    }

    public void setPizza(Pizza pizza){
        this.pizza = pizza;
    }
    public void setSize(String size){
        this.size = size;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public Pizza getPizza(){
        return pizza;
    }
    public String getSize(){
        return size;
    }
    public int getQuantity(){
        return quantity;
    }
}