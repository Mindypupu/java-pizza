import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    //Pizza class
    private List<CartItem> items;
    private double discountPercentage;

    public ShoppingCart() {
        items = new ArrayList<>();
        discountPercentage = 1.0;
    }

    public void changePizza(Pizza pizza, String size, int quantity, Pizza newPizza){
        for(CartItem item : items){
            //exist
            if(item.getPizza().equals(pizza) && item.getSize().equals(size) && item.getQuantity() == (quantity)){
                item.setPizza(newPizza);
                return;
            }
        }
        System.out.println("The item doesn't exist.");
    }
    public void changeSize(Pizza pizza, String size, int quantity, String newSize){
        for(CartItem item : items){
            //exist
            if(item.getPizza().equals(pizza) && item.getSize().equals(size) && item.getQuantity() == (quantity)){
                item.setSize(newSize);
                return;
            }
        }
        System.out.println("The item doesn't exist.");
    }
    public void changeQuantity(Pizza pizza, String size, int quantity, int newQuantity){
        for(CartItem item : items){
            //exist
            if(item.getPizza().equals(pizza) && item.getSize().equals(size) && item.getQuantity() == (quantity)){
                item.setQuantity(newQuantity);
                return;
            }
        }
        System.out.println("The item doesn't exist.");
    }

    public void addCartItem(Pizza pizza, String size, int quantity){
        for(CartItem item : items){
            //exist
            if(item.getPizza().equals(pizza) && item.getSize().equals(size)){
                item.setQuantity(item.getQuantity() + quantity);
                return;
            }
        }
        CartItem newItem = new CartItem(pizza, size, quantity);
        items.add(newItem);
    }
    public void removeCartItem(Pizza pizza, String size){
        for(CartItem item : items){
            //exist
            if(item.getPizza().equals(pizza) && item.getSize().equals(size)){
                items.remove(item);
                return;
            }
        }
    }
    public void applyDiscountCode(String code) {
        if (code.equals("DISCOUNT10")) {
            discountPercentage = 0.1;
        } else if (code.equals("DISCOUNT20")) {
            discountPercentage = 0.2;
        } else {
            System.out.println("Invalid discount code.");
        }
    }

    public double calculateTotal(){
        double total = 0;
        for(CartItem item : items) {
            if (item.getSize().equals("large")) {
                total += item.getPizza().getLargePrice() * item.getQuantity();
            }
            //small
            else {
                total += item.getPizza().getSmallPrice() * item.getQuantity();
            }
        }
        total *= discountPercentage;
        return total;
    }
}