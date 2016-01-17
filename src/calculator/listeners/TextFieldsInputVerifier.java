package calculator.listeners;

import calculator.gui.Calculator;

import javax.swing.*;

public class TextFieldsInputVerifier extends InputVerifier{


    @Override
    public boolean verify(JComponent input) {

        JTextField textField = (JTextField) input;

        if(textField.getText().equals(Calculator.INPUT_CHISLO)) {
            return false;
        }

        return true;
    }
}
