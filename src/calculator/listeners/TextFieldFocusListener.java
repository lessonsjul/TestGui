package calculator.listeners;

import calculator.gui.Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class TextFieldFocusListener implements FocusListener {

    private JTextField textField;

    public TextFieldFocusListener(JTextField textField) {
        this.textField = textField;
    }

    @Override
    public void focusGained(FocusEvent e) {
        if(textField.getText().trim().equals(Calculator.INPUT_CHISLO)) {
            textField.setText("");
            textField.setForeground(Color.BLACK);
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
        if(textField.getText().trim().equals("")) {
            textField.setText(Calculator.INPUT_CHISLO);
            textField.setForeground(Color.GRAY);
        }
    }
}
