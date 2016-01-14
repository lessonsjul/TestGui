package testgui;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    public MyPanel(String name, int width, int height) {
        super.setSize(width, height);
        super.setName(name);
        super.setBorder(BorderFactory.createEtchedBorder());
    }

    public MyPanel(String name, int width, int height, Component comp){
        this(name, width, height);
        super.add(comp);
    }

    public MyPanel(String name, int width, int height, LayoutManager layout){
        this(name, width, height);
        super.setLayout(layout);
    }

    public MyPanel(String name, int width, int height, Component comp, LayoutManager layout){
        this(name, width, height);
        super.setLayout(layout);
        super.add(comp);
    }
}
