import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    //Pizza class
    private Map<Pizza, Integer> pizzas;
    private double discountPercentage;

    public ShoppingCart(){
        pizzas = new HashMap<>();
        discountPercentage = 1.0;
    }
    public void addPizza(Pizza newPizza, int quantity){
        pizzas.merge(newPizza, quantity, Integer::sum);
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
        for(Map.Entry<Pizza, Integer> entry: pizzas.entrySet()){
            total += entry.getValue() * entry.getKey().getPrice();
        }
        total *= discountPercentage;
        return total;
    }
    
}

