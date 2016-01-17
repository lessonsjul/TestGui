package calculator.listeners;

import calculator.calc.CalcOperations;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonsListener implements ActionListener {

    private JTextField textNum1;
    private JTextField textNum2;
    private JTextField textResult;

    public ButtonsListener(JTextField textNum1, JTextField textNum2, JTextField textResult) {
       this.textNum1 = textNum1;
       this.textNum2 = textNum2;
       this.textResult = textResult;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(!(e.getSource() instanceof JButton)) return;

        TextFieldsInputVerifier textFieldsInputVerifier = new TextFieldsInputVerifier();

        if(!textFieldsInputVerifier.verify(textNum1)
                || !textFieldsInputVerifier.verify(textNum2)) return;

        JButton button = (JButton)e.getSource();

            final double firstNum = Double.parseDouble(textNum1.getText());
            final double secondNum = Double.parseDouble(textNum2.getText());

            if(button.getText().equals("Сложение")){
                textResult.setText(String.valueOf(CalcOperations.add(firstNum, secondNum)));
            }else if(button.getText().equals("Вычитание")){
                textResult.setText(String.valueOf(CalcOperations.substract(firstNum, secondNum)));
            }else if(button.getText().equals("Умножение")){
                textResult.setText(String.valueOf(CalcOperations.multiply(firstNum, secondNum)));
            }else if(button.getText().equals("Деление")){
                textResult.setText(String.valueOf(CalcOperations.divide(firstNum, secondNum)));
            }
    }
}
