package layouts;

import javax.swing.*;

public abstract class LayoutDemo {

    public LayoutDemo(){
        JPanel panel = new JPanel();
        useLayout(panel);
        addButtonsToPanel(panel, 10);

        JFrame frame = createFrame();
        frame.add(panel);
        frame.setVisible(true);
    }

    public JFrame createFrame() {
        JFrame frame = new JFrame("demo");
        frame.setSize(470, 450);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        return frame;
    }

    public abstract void useLayout(JPanel panel);

    public abstract void addButtonsToPanel(JPanel panel, int buttonCount);

}
