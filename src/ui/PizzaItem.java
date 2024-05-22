package ui;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.io.IOException;

public class PizzaItem extends JPanel {
    static int IMAGE_WIDTH = 200;
    static int IMAGE_HEIGHT = 150;
    private Image image;
    private String pizzaName;
    private String pizzaDescription;
    private int bigPrice;
    private int smallPrice;
    private JButton pizzaImageButton;

    public PizzaItem(String imgPath, String pizzaName, String pizzaDescription, int bigPrice, int smallPrice) {
        this.pizzaName = pizzaName;
        this.pizzaDescription = pizzaDescription;
        this.bigPrice = bigPrice;
        this.smallPrice = smallPrice;
        loadImage(imgPath);

//        setBorder(new LineBorder(Color.BLACK, 2));
//        setBorder(new CompoundBorder(getBorder(), new EmptyBorder(0, 0, 0, 0)));
        setBackground(Color.WHITE);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        pizzaImageButton = new JButton(new ImageIcon(image));
        pizzaImageButton.setBorder(BorderFactory.createEmptyBorder());

        add(pizzaImageButton);
        JLabel nameLabel = new JLabel(pizzaName);
        nameLabel.setBorder(new EmptyBorder(5, 5, 5, 5));
        nameLabel.setFont(new Font("Arial", Font.BOLD, 20));
        add(nameLabel);
        add(new LargePriceLabel(bigPrice));
        add(new SmallPriceLabel(smallPrice));
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
    PriceLabel(int price, String prefix) {
        super(prefix + " $" + price);
        setFont(font);
    }
}

class LargePriceLabel extends PriceLabel {
    LargePriceLabel(int price) {
        super(price, "大");
    }
}
class SmallPriceLabel extends PriceLabel {
    SmallPriceLabel(int price) {
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