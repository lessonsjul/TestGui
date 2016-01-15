package layouts;

import javax.swing.*;
import java.awt.*;

public class AbsoluteLayoutDemo extends LayoutDefaultButtons {

    @Override
    public void useLayout(JPanel panel) {
        panel.setLayout(null);
    }

    @Override
    public void addButtonsToPanel(JPanel panel, int buttonCount) {
        JButton button = new JButton("Button 1");
        button.setSize(100, 100);
        button.setBounds(new Rectangle(150, 170, 200, 20));

        JButton button2 = new JButton("Button 2");
        button2.setBounds(new Rectangle(100, 100, 150, 30));

        panel.add(button);
        panel.add(button2);
    }
}
