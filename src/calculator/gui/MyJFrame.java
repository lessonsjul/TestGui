package calculator.gui;

import javax.swing.*;
import java.awt.*;

public class MyJFrame extends JFrame {
    public MyJFrame(String title, int width, int height) {
        super(title);
        super.setSize(width, height);
        super.setLocationRelativeTo(null);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
