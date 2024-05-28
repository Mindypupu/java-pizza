package ui;

import model.Pizza;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class PizzaItem extends JPanel {
    static int IMAGE_WIDTH = 200;
    static int IMAGE_HEIGHT = 150;
    private Image image;
    private JButton pizzaImageButton;
    private CartPanel cartPanel;
    private Pizza pizza;
    private JRadioButton largeRadioButton = new JRadioButton();
    private JRadioButton smallRadioButton = new JRadioButton();
    private JComboBox<Integer> quantityComboBox = new JComboBox<>();
    private ButtonGroup buttonGroup = new ButtonGroup();
    private Integer selectedQuantity = 1;
    private String selectedSize = "large";

    public PizzaItem(Pizza pizza, CartPanel cartPanel) {
        this.pizza = pizza;
        this.cartPanel = cartPanel;
        loadImage(pizza.getImgPath());

//        setBorder(new LineBorder(Color.BLACK, 2));
//        setBorder(new CompoundBorder(getBorder(), new EmptyBorder(0, 0, 0, 0)));
        setBackground(Color.WHITE);
//        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setLayout(new GridLayout(2, 1));
        pizzaImageButton = new JButton(new ImageIcon(image));
        pizzaImageButton.setBorder(BorderFactory.createEmptyBorder());

        JLabel nameLabel = new JLabel(pizza.getName());
        nameLabel.setBorder(new EmptyBorder(5, 5, 5, 5));
        nameLabel.setFont(new Font("Arial", Font.BOLD, 20));

        buttonGroup.add(largeRadioButton);
        buttonGroup.add(smallRadioButton);
        largeRadioButton.setSelected(true);
        largeRadioButton.setText("大 $" + pizza.getLargePrice());
        smallRadioButton.setText("小 $" + pizza.getSmallPrice());
        largeRadioButton.setFont(new Font("Arial", Font.PLAIN, 16));
        smallRadioButton.setFont(new Font("Arial", Font.PLAIN, 16));
        largeRadioButton.addActionListener(e -> selectedSize = "large");
        smallRadioButton.addActionListener(e -> selectedSize = "small");


        quantityComboBox.setModel(new DefaultComboBoxModel<>(new Integer[]{1, 2, 3, 4, 5}));
        quantityComboBox.setFont(new Font("Arial", Font.PLAIN, 16));
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
    class PizzaActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("add to cart");
            cartPanel.addItem(pizza, "large", 1);
        }
    }
}

class PriceLabel extends JLabel {
    static Font font = new Font("Arial", Font.PLAIN, 16);
    PriceLabel(double price, String prefix) {
        super(prefix + " $" + price);
        setFont(font);
    }
}

class LargePriceLabel extends PriceLabel {
    LargePriceLabel(double price) {
        super(price, "大");
    }
}
class SmallPriceLabel extends PriceLabel {
    SmallPriceLabel(double price) {
        super(price, "小");
    }
}

class AddToCartButton extends JButton {
    AddToCartButton() {
        setText("加入購物車");
        setBackground(Color.WHITE);
        setForeground(Color.BLACK);
        setFont(new Font("Arial", Font.PLAIN, 16));
        setFocusPainted(false);
    }
}