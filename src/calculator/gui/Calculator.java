package calculator.gui;

import calculator.listeners.ButtonsListener;
import calculator.listeners.ChangeSkinListener;
import com.jtattoo.plaf.bernstein.BernsteinLookAndFeel;
import calculator.listeners.KeyTextFieldsListener;
import calculator.listeners.TextFieldFocusListener;
import com.jtattoo.plaf.aluminium.AluminiumLookAndFeel;
import com.jtattoo.plaf.mint.MintLookAndFeel;

import javax.swing.*;
import java.awt.*;

public class Calculator{

    public static final String INPUT_CHISLO = "Введите число";

    private MyJButton btnAdd;
    private MyJButton btnMinus;
    private MyJButton btnMulty;
    private MyJButton btnDiv;

    private MyJButton skin1;
    private MyJButton skin2;

    private JLabel labelNum1;
    private JLabel labelNum2;
    private JLabel labelResult;

    private MyJTextField jTextNum1;
    private MyJTextField jTextNum2;
    private MyJTextField jTextResult;

    private MyJPanel panel1;
    private MyJPanel panel2;
    private MyJPanel panel3;

    private JFrame frame;

    private ButtonsListener buttonListener;


    public static void main(String[] args) {

        try{
            UIManager.setLookAndFeel(new BernsteinLookAndFeel());
        }catch(UnsupportedLookAndFeelException ex){
            ex.printStackTrace();
        }

        JFrame.setDefaultLookAndFeelDecorated(true);

        Calculator calc = new Calculator();

        calc.createLabels();
        calc.createTextFields();
        calc.createButtons();
        calc.createPanels();
        calc.createFrame();
        calc.addChangeSkinListener();
    }

    private void createButtons(){
        btnAdd = new MyJButton("Сложение");
        btnMinus = new MyJButton("Вычитание");
        btnMulty = new MyJButton("Умножение");
        btnDiv = new MyJButton("Деление");

        addButtonsListeners();

        skin1 = new MyJButton("Aluminium Skin");
        skin2 = new MyJButton("Mint Skin");
    }

    private void createLabels(){
        labelNum1 = new JLabel("Число 1");
        labelNum2 = new JLabel("Число 2");
        labelResult = new JLabel("Результат");
    }

    private void createTextFields(){
        jTextNum1 = new MyJTextField(INPUT_CHISLO,20);
        jTextNum2 = new MyJTextField(INPUT_CHISLO,20);

        jTextResult = new MyJTextField(20, Color.RED);
        jTextResult.setFocusable(false);
        jTextResult.setEditable(false);

        addTextFieldsListeners();
    }

    private void createPanels(){
        panel1 = new MyJPanel("panel1", 200, 50,new FlowLayout(FlowLayout.LEFT));
        panel2 = new MyJPanel("panel2", 200, 50,new FlowLayout(FlowLayout.LEFT));
        panel3 = new MyJPanel("panel3", 200, 50,new FlowLayout(FlowLayout.LEFT));

        panel1.add(labelNum1);
        panel1.add(jTextNum1);
        panel1.add(labelNum2);
        panel1.add(jTextNum2);

        panel2.add(btnAdd);
        panel2.add(btnMinus);
        panel2.add(btnMulty);
        panel2.add(btnDiv);

        panel3.add(labelResult);
        panel3.add(jTextResult);
        panel3.add(skin1);
        panel3.add(skin2);
    }

    private void createFrame(){
        frame = new MyJFrame("calculator", 480, 200,new BorderLayout(2, 2));

        frame.setMinimumSize(new Dimension(480, 200));
        frame.setResizable(false);

        frame.getContentPane().add(panel1, BorderLayout.NORTH);
        frame.getContentPane().add(panel2, BorderLayout.CENTER);
        frame.getContentPane().add(panel3, BorderLayout.SOUTH);


        frame.setVisible(true);
    }

    private void addButtonsListeners(){
        buttonListener = new ButtonsListener(jTextNum1, jTextNum2,jTextResult);

        btnAdd.addActionListener(buttonListener);
        btnMinus.addActionListener(buttonListener);
        btnMulty.addActionListener(buttonListener);
        btnDiv.addActionListener(buttonListener);
    }

    private void addTextFieldsListeners(){
        jTextNum1.addFocusListener(new TextFieldFocusListener(jTextNum1));
        jTextNum2.addFocusListener(new TextFieldFocusListener(jTextNum2));

        jTextNum1.addKeyListener(new KeyTextFieldsListener());
        jTextNum2.addKeyListener(new KeyTextFieldsListener());
    }

    private void addChangeSkinListener(){
        skin1.addActionListener(new ChangeSkinListener(frame, new AluminiumLookAndFeel()));
        skin2.addActionListener(new ChangeSkinListener(frame, new MintLookAndFeel()));
    }
}