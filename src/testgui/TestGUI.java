package testgui;

import com.jtattoo.plaf.mcwin.McWinLookAndFeel;

import javax.swing.*;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestGUI {
    public static void main(String[] args) {

        try {

//            Задает SKIN для внутренних кмпонентов программы, внутри контейнера JFrame
//            UIManager.setLookAndFeel(new MetalLookAndFeel());
//            UIManager.setLookAndFeel(new NimbusLookAndFeel());
            UIManager.setLookAndFeel(new McWinLookAndFeel());
//            UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
//            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//        } catch (ClassNotFoundException e) {
//            Logger.getLogger(TestGUI.class.getName()).log(Level.SEVERE, null, e);
//        } catch (InstantiationException e) {
//            Logger.getLogger(TestGUI.class.getName()).log(Level.SEVERE, null, e);
//        } catch (IllegalAccessException e) {
//            Logger.getLogger(TestGUI.class.getName()).log(Level.SEVERE, null, e);
        } catch (UnsupportedLookAndFeelException e) {
            Logger.getLogger(TestGUI.class.getName()).log(Level.SEVERE, null, e);
        }
//      Задает внешний вид для всего контейнера, полностью внешнее окно нашей программы
        JFrame.setDefaultLookAndFeelDecorated(true);

        JFrame frame = new JFrame("Test GUI");
        frame.setIconImage(new ImageIcon("mac.png").getImage());
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        FlowLayout fl = new FlowLayout();
        frame.setLayout(fl);

        JButton button = new JButton("Test Button");
        button.setSize(300, 200);

        JPanel panel = new JPanel(fl);
        panel.setBorder(BorderFactory.createEtchedBorder());
        panel.add(button);

        frame.getContentPane().add(panel);

    }
}
