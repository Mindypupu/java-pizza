import ui.CartPanel;
import ui.PizzaPanel;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Pizza Ordering System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1400, 850);
        frame.setResizable(false);
        frame.setLayout(new BorderLayout());

        CartPanel cartPanel = new CartPanel();
        frame.add(new PizzaPanel(cartPanel), BorderLayout.CENTER);
        frame.add(cartPanel, BorderLayout.EAST);

        frame.setVisible(true);
        frame.revalidate();
        frame.repaint();
    }
}