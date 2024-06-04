package ui;

import model.Pizza;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.io.IOException;

public class PizzaItemPanel extends JPanel {
    static int IMAGE_WIDTH = 200;
    static int IMAGE_HEIGHT = 150;
    private Image image;
    private Integer selectedQuantity = 1;
    private String selectedSize = "large";

    public PizzaItemPanel(Pizza pizza, CartPanel cartPanel) {
        loadImage(pizza.getImgPath());

        setBackground(Color.WHITE);
        setLayout(new GridLayout(2, 1));

        JButton pizzaImageButton = new JButton(new ImageIcon(image));
        pizzaImageButton.setBorder(BorderFactory.createEmptyBorder());

        JLabel nameLabel = new JLabel(pizza.getName());
        nameLabel.setBorder(new EmptyBorder(5, 5, 5, 5));
        nameLabel.setFont(new Font("SansSerif", Font.BOLD, 20));

        JRadioButton largeRadioButton = new JRadioButton();
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(largeRadioButton);
        JRadioButton smallRadioButton = new JRadioButton();
        buttonGroup.add(smallRadioButton);
        largeRadioButton.setSelected(true);
        largeRadioButton.setText("大 $" + pizza.getLargePrice());
        smallRadioButton.setText("小 $" + pizza.getSmallPrice());
        largeRadioButton.setBackground(Color.WHITE);
        smallRadioButton.setBackground(Color.WHITE);
        largeRadioButton.setFont(new Font("SansSerif", Font.PLAIN, 16));
        smallRadioButton.setFont(new Font("SansSerif", Font.PLAIN, 16));
        largeRadioButton.addActionListener(e -> selectedSize = "large");
        smallRadioButton.addActionListener(e -> selectedSize = "small");


        JComboBox<Integer> quantityComboBox = new JComboBox<>();
        quantityComboBox.setModel(new DefaultComboBoxModel<>(new Integer[]{1, 2, 3, 4, 5}));
        quantityComboBox.setFont(new Font("SansSerif", Font.PLAIN, 16));
        quantityComboBox.addActionListener(e -> selectedQuantity = (Integer) quantityComboBox.getSelectedItem());


        AddToCartButton addToCartButton = new AddToCartButton();
        addToCartButton.addActionListener(e -> cartPanel.addItem(pizza, selectedSize, selectedQuantity));

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(6, 1));
        buttonPanel.setBackground(Color.WHITE);

        buttonPanel.add(nameLabel);
        buttonPanel.add(largeRadioButton);
        buttonPanel.add(smallRadioButton);
        buttonPanel.add(Box.createVerticalGlue());
        buttonPanel.add(quantityComboBox);
        buttonPanel.add(addToCartButton);

        add(pizzaImageButton);
        add(buttonPanel);
    }

    public void loadImage(String imgPath) {
        try {
            image = ImageIO.read(getClass().getResource(imgPath));
            image = image.getScaledInstance(IMAGE_WIDTH, IMAGE_HEIGHT, Image.SCALE_SMOOTH);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(IMAGE_WIDTH, 300);
    }

    @Override
    public Dimension getMinimumSize() {
        return getPreferredSize();
    }

    @Override
    public Dimension getMaximumSize() {
        return getPreferredSize();
    }
}

class AddToCartButton extends JButton {
    AddToCartButton() {
        setText("加入購物車");
        setBackground(Color.WHITE);
        setForeground(Color.BLACK);
        setFont(new Font("SansSerif", Font.PLAIN, 16));
        setFocusPainted(false);
    }
}