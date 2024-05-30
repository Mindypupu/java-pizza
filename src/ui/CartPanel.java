package ui;

import model.CartItem;
import model.Pizza;
import model.ShoppingCart;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class CartPanel extends JPanel {
    final private ShoppingCart cart = new ShoppingCart();
    final private CartItemListPanel cartItemListPanel = new CartItemListPanel(cart);
    final private TotalPricePanel totalPricePanel = new TotalPricePanel(cart);

    public CartPanel() {
        setLayout(new BorderLayout());
        setBackground(Color.WHITE);

        ShoppingCart cart = new ShoppingCart();
        CartItemListPanel cartItemListPanel = new CartItemListPanel(cart);
        TotalPricePanel totalPricePanel = new TotalPricePanel(cart);

        CartTitlePanel titleLabel = new CartTitlePanel();
        titleLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        titleLabel.setBorder(new EmptyBorder(8, 8, 8, 8));

        JButton checkoutButton = new JButton("送出");
        checkoutButton.addActionListener(e -> JOptionPane.showMessageDialog(null, "已送出\n您的pizza將於30分鐘後抵達\uD83C\uDF55\uD83C\uDF55"));
        checkoutButton.setPreferredSize(new Dimension(100, 100));
        checkoutButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        add(titleLabel, BorderLayout.NORTH);
        add(cartItemListPanel, BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new BoxLayout(bottomPanel, BoxLayout.Y_AXIS));
        bottomPanel.setBackground(Color.WHITE);
        bottomPanel.add(totalPricePanel);
        bottomPanel.add(checkoutButton);
        bottomPanel.add(Box.createHorizontalGlue());

        add(bottomPanel, BorderLayout.SOUTH);
    }

    public void addItem(Pizza pizza, String size, int quantity) {
        cart.addCartItem(pizza, size, quantity);
        cartItemListPanel.paintItems();
        totalPricePanel.updateTotalPrice();
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(200, 0);
    }
}

class CartTitlePanel extends JPanel {
    public CartTitlePanel() {
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        setBackground(Color.WHITE);

        JLabel titleLabel = new JLabel("購物車");
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        titleLabel.setFont(new Font("Arial", Font.PLAIN, 22));
        titleLabel.setBorder(new EmptyBorder(8, 8, 8, 8));
        add(Box.createHorizontalGlue());
        add(titleLabel);
        add(Box.createHorizontalGlue());
    }
}

class CartItemListPanel extends JPanel {
    final private ShoppingCart cart;
    public CartItemListPanel(ShoppingCart cart) {
        this.cart = cart;
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(Color.WHITE);
    }


    public void paintItems() {
        removeAll();
        for (CartItem item : cart.getItems()) {
            add(new CartItemPanel(item));
        }
        revalidate();
        repaint();
    }
}

class TotalPricePanel extends JPanel {
    final private JLabel totalPriceLabel;
    final private ShoppingCart cart;
    public TotalPricePanel(ShoppingCart cart) {
        this.cart = cart;

        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        setBackground(Color.WHITE);

        totalPriceLabel = new JLabel("合計：$" + cart.calculateTotal());
        totalPriceLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        totalPriceLabel.setFont(new Font("Arial", Font.PLAIN, 22));
        totalPriceLabel.setBorder(new EmptyBorder(8, 8, 8, 8));

        add(Box.createHorizontalGlue());
        add(totalPriceLabel);
        add(Box.createHorizontalGlue());

    }
    public void updateTotalPrice() {
        totalPriceLabel.setText("合計：$" + cart.calculateTotal());
        revalidate();
        repaint();
    }
}