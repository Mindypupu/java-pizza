package ui;

import model.AvailablePizza;
import model.Pizza;
import utils.WrapLayout;

import javax.swing.*;

public class PizzaPanel extends JScrollPane {
    public PizzaPanel(CartPanel cartPanel) {
        JPanel panel = new JPanel();
        panel.setLayout(new WrapLayout());

        AvailablePizza availablePizza = new AvailablePizza();
        for (Pizza pizza : availablePizza.getPizzas()) {
            panel.add(new PizzaItem(pizza, cartPanel));
        }

        setAutoscrolls(true);
        setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        this.getVerticalScrollBar().setUnitIncrement(16);
        setViewportView(panel);
        setVisible(true);
    }
}

