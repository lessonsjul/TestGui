package testgui;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame(String title, int width, int height){
        super(title);
        super.setSize(width, height);

        //для того что бы фрейм поялялся посередине окна
        super.setLocationRelativeTo(null);
        super.setDefaultCloseOperation(super.EXIT_ON_CLOSE);
        super.setVisible(true);
    }

    public MyFrame(String title, int width, int height, Component component){
        this(title, width, height);
        super.getContentPane().add(component);
    }
}
