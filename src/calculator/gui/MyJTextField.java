package calculator.gui;

import javax.swing.*;
import java.awt.*;

public class MyJTextField extends JTextField{

    public MyJTextField(int columns) {
        super(columns);
        Font font = new Font("Courier",Font.ITALIC,12);
        super.setFont(font);
        super.setForeground(Color.GRAY);
    }

    public MyJTextField(String text, int columns) {
        this(columns);
        super.setText(text);
    }

    public MyJTextField(int columns, Color color) {
        this(columns);
        super.setForeground(color);
    }
}
