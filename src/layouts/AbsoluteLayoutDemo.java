package layouts;

import listeners.ButtonListener;

import javax.swing.*;
import java.awt.*;

public class AbsoluteLayoutDemo extends LayoutDefaultButtons {

    private JPanel panel;
    @Override
    public void useLayout(JPanel panel) {
        panel.setLayout(null);
    }

    @Override
    public void addButtonsToPanel(JPanel panel, int buttonCount) {
        ButtonListener listenet = new ButtonListener(panel);
        JButton button = new JButton("Button 1");
        button.setSize(100, 100);
        button.setBounds(new Rectangle(150, 170, 200, 20));

        button.addActionListener(listenet);

        JButton button2 = new JButton("Button 2");
        button2.setBounds(new Rectangle(100, 100, 150, 30));
        button2.addActionListener(listenet);

        panel.add(button);
        panel.add(button2);
    }
}
