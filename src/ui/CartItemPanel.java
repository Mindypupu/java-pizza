package ui;

import model.CartItem;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class CartItemPanel extends JPanel {
    private JButton removeButton;
    public CartItemPanel(CartItem item) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setAlignmentX(Component.LEFT_ALIGNMENT);
        setBackground(Color.WHITE);
        setBorder(new EmptyBorder(8, 8, 8, 8));

        String size = item.getSize().equals("large") ? "大" : "小";


        JLabel nameLabel = new JLabel("（" + size + "）" +item.getPizza().getName());
        JLabel quantityLabel = new JLabel("\t\tx" + item.getQuantity());
        nameLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        quantityLabel.setFont(new Font("Arial", Font.PLAIN, 16));

        add(nameLabel);
        add(quantityLabel);
    }
}
