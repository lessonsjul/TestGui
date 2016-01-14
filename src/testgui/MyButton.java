package testgui;

import javax.swing.*;

public class MyButton extends JButton {
    public MyButton(String text) {
        super.setText(text);
    }

    public MyButton(String text, int width, int height) {
        this(text);
        super.setSize(width, height);
    }
}
