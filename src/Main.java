import ui.CartPanel;
import ui.PizzaPanel;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello World");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
//        frame.setResizable(false);
        frame.setLayout(new BorderLayout());

        frame.add(new PizzaPanel(), BorderLayout.CENTER);
        frame.add(new CartPanel(), BorderLayout.EAST);
        frame.setVisible(true);
    }
}