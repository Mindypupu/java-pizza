package ui;

import model.Pizza;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.io.IOException;

public class PizzaItem extends JPanel {
    static int IMAGE_WIDTH = 200;
    static int IMAGE_HEIGHT = 150;
    private Image image;
    private JButton pizzaImageButton;

    public PizzaItem(Pizza pizza) {
        loadImage(pizza.getImgPath());

//        setBorder(new LineBorder(Color.BLACK, 2));
//        setBorder(new CompoundBorder(getBorder(), new EmptyBorder(0, 0, 0, 0)));
        setBackground(Color.WHITE);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        pizzaImageButton = new JButton(new ImageIcon(image));
        pizzaImageButton.setBorder(BorderFactory.createEmptyBorder());

        add(pizzaImageButton);
        JLabel nameLabel = new JLabel(pizza.getName());
        nameLabel.setBorder(new EmptyBorder(5, 5, 5, 5));
        nameLabel.setFont(new Font("Arial", Font.BOLD, 20));
        add(nameLabel);
        add(new LargePriceLabel(pizza.getLargePrice()));
        add(new SmallPriceLabel(pizza.getSmallPrice()));
        AddToCartButton addToCartButton = new AddToCartButton();
        add(new AddToCartButton());
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