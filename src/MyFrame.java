import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame(){
        JFrame frame = new JFrame();
        JPanel backGroundPanel = createBackgroundPanel();
        this.setTitle("My ToDo List!");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(550,850);


//        this.getContentPane().setBackground(backGround);
        // frame.getContentPane().setBackground(new Color(48,64,125,));
    }

    public JPanel createBackgroundPanel() {
        JPanel backGroundPanel= new JPanel() {
            private final Image backGround = new ImageIcon("Resources/woodBackground.jpg").getImage();
            @Override
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                g.drawImage(backGround,0,0,getWidth(),getHeight(),this);
            }
        };
        return backGroundPanel;
    }



}

