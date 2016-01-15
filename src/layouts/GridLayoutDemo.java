package layouts;

import javax.swing.*;
import java.awt.*;

public class GridLayoutDemo extends LayoutDefaultButtons {
    @Override
    public void useLayout(JPanel panel) {
        panel.setLayout(new GridLayout(2,5,4,4));
    }
}
