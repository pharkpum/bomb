package boom;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BooM{
<<<<<<< HEAD
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
=======
    public static int bomb;
    public static Ran ran = new Ran();
    public static JLabel l1, l2, l3, l4, l5, l6;
    public static JLabel boom;
    public static String imageDir = System.getProperty("user.dir") + "\\src\\images";
    public static void init(){
        boom= new JLabel();
        ImageIcon boomImg = new ImageIcon(imageDir + "\\explode.gif");
        boom.setBounds(300, 200, 300, 200);
        boom.setOpaque(true);
        boom.setIcon(boomImg);
        boom.setVisible(false);
        
        l1= new JLabel("boom");
        l2= new JLabel("boom");
        l3= new JLabel("boom");
        l4= new JLabel("boom");
        l5= new JLabel("boom");
        l6= new JLabel("boom");
>>>>>>> origin/bomb-effect
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
        
        boom.addMouseListener(new MouseAdapter() { 
        public void mouseClicked(MouseEvent e) 
        { 
            boom.setVisible(false);
            reset();
        }}); 
        
        l1.addMouseListener(new MouseAdapter() { 
        public void mouseClicked(MouseEvent e) 
        { 
            if(bomb == 1){
                boom.setVisible(true);
            }
            l1.setVisible(false);
        }}); 
        
        l2.addMouseListener(new MouseAdapter() { 
        public void mouseClicked(MouseEvent e) 
        { 
            if(bomb == 2){
                boom.setVisible(true);
            }
            l2.setVisible(false);
        }}); 
        
        l3.addMouseListener(new MouseAdapter() { 
        public void mouseClicked(MouseEvent e) 
        { 
            if(bomb == 3){
                boom.setVisible(true);
            }
            l3.setVisible(false);
        }}); 
        
        l4.addMouseListener(new MouseAdapter() { 
        public void mouseClicked(MouseEvent e) 
        { 
            if(bomb == 4){
                boom.setVisible(true);
            }
            l4.setVisible(false);
        }}); 
        
        l5.addMouseListener(new MouseAdapter() { 
        public void mouseClicked(MouseEvent e) 
        { 
            if(bomb == 5){
                boom.setVisible(true);
            }
            l5.setVisible(false);
        }}); 
        
        l6.addMouseListener(new MouseAdapter() { 
        public void mouseClicked(MouseEvent e) 
        { 
            if(bomb == 6){
                boom.setVisible(true);
            }
            l6.setVisible(false);
        }}); 
    }
    
    public static void reset(){
        bomb = ran.Randombomb();
        l1.setVisible(true);
        l2.setVisible(true);
        l3.setVisible(true);
        l4.setVisible(true);
        l5.setVisible(true);
        l6.setVisible(true);
    }
    
    public static void main(String[] args) {
        init();
        bomb = ran.Randombomb();
        JFrame f = new JFrame("BooM! Game");
        f.setSize(1000, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLayeredPane layer = new JLayeredPane();
        layer.setPreferredSize(new Dimension(1000, 600));
        layer.setBorder(BorderFactory.createTitledBorder("test"));        
        
        layer.add(boom);
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
