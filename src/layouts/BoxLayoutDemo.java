package layouts;

import javax.swing.*;

public class BoxLayoutDemo extends LayoutDefaultButtons{
    @Override
    public void useLayout(JPanel panel) {
        BoxLayout b1 = new BoxLayout(panel, BoxLayout.Y_AXIS);
        panel.setLayout(b1);
    }
}
