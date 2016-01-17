package listeners;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener{

    private JPanel panel;

    public ButtonListener(JPanel panel) {
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() instanceof JButton){
            JButton button = (JButton)e.getSource();
            JOptionPane.showMessageDialog(panel, button.getText());
        }
    }
}
