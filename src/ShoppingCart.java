import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    //Pizza class
    private List<Pizza> pizzas;
    private double discountPercentage;

    public ShoppingCart(){
        pizzas = new ArrayList<>();
        discountPercentage = 0.0;
    }
    public void addPizza(String name, int quantity){
        for (Pizza pizza : pizzas) {
            if (pizza.getName().equals(name)) {
                pizza.setQuantity(pizza.getQuantity() + quantity);
                return;
            }
        }
        pizzas.add(new Pizza(name, quantity));
    }
    public void removePizza(Pizza pizza){
        pizzas.remove(pizza);
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
        for(Pizza pizza : pizzas){
            total += pizza.getQuantity() * pizza.getPrice();
        }
        total *= discountPercentage;
        return total;
    }
    
}

