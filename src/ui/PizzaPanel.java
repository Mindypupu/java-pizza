package ui;

import javax.swing.*;
import java.awt.*;

public class PizzaPanel extends JPanel {
    public PizzaPanel(){
        setLayout(new FlowLayout());

        add(new PizzaItem("/pizza.png", "Pepperoni", "A classic pizza", 10, 5));
        add(new PizzaItem("/pizza.png", "Margherita", "A classic pizza", 10, 5));
        add(new PizzaItem("/pizza.png", "Hawaiian", "A classic pizza", 10, 5));
        add(new PizzaItem("/pizza.png", "Veggie", "A classic pizza", 10, 5));

    }
}
