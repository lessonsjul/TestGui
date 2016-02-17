package calculator.gui;

import javax.swing.*;
import java.awt.*;

public class MyJFrame extends JFrame {

    private Image iconImage = new ImageIcon(getClass().getResource("../images/icon.png")).getImage();

    public MyJFrame(String title, int width, int height) {
        super(title);
        super.setSize(width, height);
        super.setLocationRelativeTo(null);
        super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        super.setIconImage(iconImage);
    }

    public MyJFrame(String title, int width, int height, LayoutManager layout) {
        this(title, width, height);
        super.setLayout(layout);
    }

    public MyJFrame(String title, int width, int height, Component component) {
        this(title,  width, height);
        super.getContentPane().add(component);
    }
}
