package calculator.gui;

import javax.swing.*;
import java.awt.*;

public class MyJPanel extends JPanel {

    private Dimension d;

    public MyJPanel(String name, int width, int height) {

        super.setName(name);
        super.setSize(width, height);
        d = new Dimension(width, height);
        super.setPreferredSize(d);
    }

    public MyJPanel(String name, int width, int height, LayoutManager layout){
        this(name, width, height);
        super.setLayout(layout);
    }
}
