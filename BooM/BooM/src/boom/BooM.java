package boom;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BooM{
    public static int bomb,step = 5;
    public static int player = 1;
    public static Ran ran = new Ran();
    public static JLabel BG,l1, l2, l3, l4, l5, l6,count1;
    public static JLabel boom, player1, player2;
    public static String imageDir = System.getProperty("user.dir") + "\\src\\images";
    public static Timer timer;
    public static boolean start = false;
    public static void init(){
        
        count1 = new JLabel();
        ImageIcon count = new ImageIcon(imageDir + "\\5.jpg");
        count1.setBounds(540, 376, 33, 57);
        count1.setOpaque(false);
        count1.setIcon(count);
        
        player1= new JLabel();
        ImageIcon p1img = new ImageIcon(imageDir + "\\player1.gif");
        player1.setBounds(-30, 350, 200, 200);
        player1.setOpaque(false);
        player1.setIcon(p1img);
        player2= new JLabel();
        ImageIcon p2img = new ImageIcon(imageDir + "\\player2.gif");
        player2.setBounds(810, 320, 220, 240);
        player2.setOpaque(false);
        player2.setIcon(p2img);
        player2.setVisible(false);
        
        boom= new JLabel();
        ImageIcon boomImg = new ImageIcon(imageDir + "\\explode.gif");
        boom.setBounds(359, 300, 300, 180);
        boom.setOpaque(true);
        boom.setIcon(boomImg);
        boom.setVisible(false);
        
        BG= new JLabel();
        ImageIcon bg = new ImageIcon(imageDir + "\\BGimg.jpg");
        BG.setBounds(0,0,1000,600);
        BG.setOpaque(true);
        BG.setIcon(bg);
        
        l1= new JLabel("boom");
        l2= new JLabel("boom");
        l3= new JLabel("boom");
        l4= new JLabel("boom");
        l5= new JLabel("boom");
        l6= new JLabel("boom");
        l1.setBounds(200, 200, 50, 50);
        l1.setOpaque(true);
        //l1.setIcon(ii);
        l2.setBounds(200, 300, 50, 50);
        l2.setOpaque(true);
        //l2.setIcon(ii);
        l3.setBounds(200, 400, 50, 50);
        l3.setOpaque(true);
        //l3.setIcon(ii);
        l4.setBounds(750, 200, 50, 50);
        l4.setOpaque(true);
        //l4.setIcon(ii);
        l5.setBounds(750, 300, 50, 50);
        l5.setOpaque(true);
        //l5.setIcon(ii);
        l6.setBounds(750, 400, 50, 50);
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
            if(!start){
                start=true;
                timer.start();
            }
            if(bomb == 1){
                boom.setVisible(true);
            }
            l1.setVisible(false);
            changePlayer();
        }}); 
        
        l2.addMouseListener(new MouseAdapter() { 
        public void mouseClicked(MouseEvent e) 
        { 
            if(!start){
                start=true;
                timer.start();
            }
            if(bomb == 2){
                boom.setVisible(true);
            }
            l2.setVisible(false);
            changePlayer();
        }}); 
        
        l3.addMouseListener(new MouseAdapter() { 
        public void mouseClicked(MouseEvent e) 
        { 
            if(!start){
                start=true;
                timer.start();
            }
            if(bomb == 3){
                boom.setVisible(true);
            }
            l3.setVisible(false);
            changePlayer();
        }}); 
        
        l4.addMouseListener(new MouseAdapter() { 
        public void mouseClicked(MouseEvent e) 
        { 
            if(!start){
                start=true;
                timer.start();
            }
            if(bomb == 4){
                boom.setVisible(true);
            }
            l4.setVisible(false);
            changePlayer();
        }}); 
        
        l5.addMouseListener(new MouseAdapter() { 
        public void mouseClicked(MouseEvent e) 
        { 
            if(!start){
                start=true;
                timer.start();
            }
            if(bomb == 5){
                boom.setVisible(true);
            }
            l5.setVisible(false);
            changePlayer();
        }}); 
        
        l6.addMouseListener(new MouseAdapter() { 
        public void mouseClicked(MouseEvent e) 
        { 
            if(!start){
                start=true;
                timer.start();
            }
            if(bomb == 6){
                boom.setVisible(true);
            }
            l6.setVisible(false);
            changePlayer();
        }}); 
    }
    
    public static void changePlayer(){
        
        step=5;
        ImageIcon count = new ImageIcon(imageDir + "\\5.jpg");
        count1.setBounds(540, 376, 33, 57);
        count1.setOpaque(false);
        count1.setIcon(count);
        timer.start();
        
        if(player == 1){       
            player2.setVisible(true);
            player1.setVisible(false);
            player = 2;
        }
        else{
            player2.setVisible(false);
            player1.setVisible(true);
            player = 1;
        }
    }
    
    public static void reset(){
        step=5;
        ImageIcon count = new ImageIcon(imageDir + "\\5.jpg");
        count1.setBounds(540, 376, 33, 57);
        count1.setOpaque(false);
        count1.setIcon(count);
        timer.start();
        bomb = ran.Randombomb();
        player = 1;
        player1.setVisible(true);
        player2.setVisible(false);
        l1.setVisible(true);
        l2.setVisible(true);
        l3.setVisible(true);
        l4.setVisible(true);
        l5.setVisible(true);
        l6.setVisible(true);
    }
    
    public static void main(String[] args) {
        
        //JOptionPane.showMessageDialog(null ,"Time start");
        
        int delay = 1000; //milliseconds
        ActionListener taskPerformer = new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            step--;
            ImageIcon count = new ImageIcon(imageDir + "\\"+step+".jpg");
            count1.setBounds(540, 376, 33, 57);
            count1.setOpaque(false);
            count1.setIcon(count);
        
        if(step<=0) {
            timer.stop();}
        }
        };
        timer = new Timer(delay, taskPerformer);
        
        
        //timer.start();
        
        
        
        init();
        bomb = ran.Randombomb();
        JFrame f = new JFrame("BooM! Game");
        f.setSize(1000, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLayeredPane layer = new JLayeredPane();
        layer.setPreferredSize(new Dimension(1000, 600));
        layer.setBorder(BorderFactory.createTitledBorder("BooM! Game"));        
        
        layer.add(count1);
        layer.add(player1);
        layer.add(player2);
        layer.add(boom);
        layer.add(l1);
        layer.add(l2);
        layer.add(l3);
        layer.add(l4);
        layer.add(l5);
        layer.add(l6);
        layer.add(BG);
        
     
        f.add(layer); 
        f.setVisible(true);
    }
}
