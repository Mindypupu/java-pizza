package ui;

import javax.swing.*;
import java.awt.*;

public class CartPanel extends JPanel {
    public CartPanel() {
        setLayout(new FlowLayout());
        setBackground(Color.WHITE);
        add(new JLabel("購物車"));
    }
}
