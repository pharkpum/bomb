package boom;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BooM{
    public static void main(String[] args) {
        JFrame f = new JFrame("BooM! Game");
        f.setSize(1000, 600);
        
        
       
        JLayeredPane layer = new JLayeredPane();
        layer.setPreferredSize(new Dimension(1000, 600));
        layer.setBorder(BorderFactory.createTitledBorder("test"));
        
        //ImageIcon bg = new ImageIcon(curDir + "\\button1.png");
        //ImageIcon ii = new ImageIcon(curDir + "\\button1.png");
        
        //bglabel
        final JLabel l0= new JLabel();
        l0.setSize(1000,600);
        l0.setOpaque(true);
        //l0.setBackground(bg);
        
       
                
         //label1
        final JLabel l1= new JLabel("boom");
        final JLabel l2= new JLabel("boom");
        final JLabel l3= new JLabel("boom");
        final JLabel l4= new JLabel("boom");
        final JLabel l5= new JLabel("boom");
        final JLabel l6= new JLabel("boom");
        l1.setBounds(100, 200, 50, 50);
        l1.setOpaque(true);
        //l1.setIcon(ii);
        l2.setBounds(100, 300, 50, 50);
        l2.setOpaque(true);
        //l2.setIcon(ii);
        l3.setBounds(100, 400, 50, 50);
        l3.setOpaque(true);
        //l3.setIcon(ii);
        l4.setBounds(850, 200, 50, 50);
        l4.setOpaque(true);
        //l4.setIcon(ii);
        l5.setBounds(850, 300, 50, 50);
        l5.setOpaque(true);
        //l5.setIcon(ii);
        l6.setBounds(850, 400, 50, 50);
        l6.setOpaque(true);
        //l6.setIcon(ii);
        
        l1.addMouseListener(new MouseAdapter() { 
        public void mouseClicked(MouseEvent e) 
        { 
        JOptionPane.showMessageDialog(null, "Hello");
        l1.setVisible(false);
        }}); 
        
        l2.addMouseListener(new MouseAdapter() { 
        public void mouseClicked(MouseEvent e) 
        { 
        JOptionPane.showMessageDialog(null, "Hello");
        l2.setVisible(false);
        }}); 
        
        l3.addMouseListener(new MouseAdapter() { 
        public void mouseClicked(MouseEvent e) 
        { 
        JOptionPane.showMessageDialog(null, "Hello");
        l3.setVisible(false);
        }}); 
        
        l4.addMouseListener(new MouseAdapter() { 
        public void mouseClicked(MouseEvent e) 
        { 
        JOptionPane.showMessageDialog(null, "Hello");
        l4.setVisible(false);
        }}); 
        
        l5.addMouseListener(new MouseAdapter() { 
        public void mouseClicked(MouseEvent e) 
        { 
        JOptionPane.showMessageDialog(null, "Hello");
        l5.setVisible(false);
        }}); 
        
        l6.addMouseListener(new MouseAdapter() { 
        public void mouseClicked(MouseEvent e) 
        { 
        JOptionPane.showMessageDialog(null, "Hello");
        l6.setVisible(false);
        }}); 
        
        
        layer.add(l1);
        layer.add(l2);
        layer.add(l3);
        layer.add(l4);
        layer.add(l5);
        layer.add(l6);
        layer.add(l0);
        
        f.add(layer);
        
        
        
        
        
        f.setVisible(true);
    }
}
