package calculator.listeners;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.regex.Pattern;

public class KeyTextFieldsListener extends KeyAdapter {

    @Override
    public void keyTyped(KeyEvent e) {

        if(!(e.getSource() instanceof JTextField)) return;

        JTextField textField = (JTextField) e.getSource();

        if(e.getKeyChar() == '.'){
            if(textField.getText().contains(".")) e.consume();
        }
        else if(Pattern.matches("[^0-9]", String.valueOf(e.getKeyChar()))){
            e.consume();
        }
    }

}
