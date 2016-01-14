package layouts;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemo extends LayoutDefaultButtons {

    @Override
    public void useLayout(JPanel panel) {
        panel.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        panel.setLayout(new FlowLayout(FlowLayout.LEFT, 15, 5));
    }
}
