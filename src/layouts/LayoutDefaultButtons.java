package layouts;

import javax.swing.*;

public abstract class LayoutDefaultButtons extends LayoutDemo{


    public void addButtonsToPanel(JPanel panel, int buttonCount){
        for(int i = 1; i <= buttonCount; i++)
            panel.add(new JButton("Button " + i));
    }
}
