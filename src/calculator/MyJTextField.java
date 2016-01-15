package calculator;

import javax.swing.*;
import java.awt.*;

public class MyJTextField extends JTextField{

    public MyJTextField(int columns) {
        super(columns);
        Font font = new Font("Arial",Font.BOLD,14);
        super.setFont(font);
        super.setBackground(Color.GRAY);
    }

    public MyJTextField(String text, int columns) {
        this(columns);
        super.setText(text);
    }

    public MyJTextField(int columns, Color color) {
        this(columns);
        super.setBackground(color);
    }
}
