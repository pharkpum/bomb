package boom;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.*;

public class BooM {
    public static void main(String[] args) {
        JFrame f = new JFrame("BooM! Game");
        f.setSize(1000, 600);
        f.setVisible(true);
        JFrame f = new JFrame("BooM! Game");
             f.setSize(1000, 600);
             f.setVisible(true);

            JPanel panel = new JPanel();
            f.add(panel);

            JLabel label = new JLabel();
            label.setIcon(new ImageIcon("Head_inside.jpg"));
            panel.add(label);
            panel.setVisible(true);
            label.setVisible(true);
    }
}
