


package javaapplication1;

import javax.swing.*;
public class Demoframe extends JFrame {
    
    
    private  ImageIcon  icon;
            
    Demoframe()
    {
        initComponents();
    }
    public void initComponents()
    {
      icon = new ImageIcon(getClass().getResource("image.png"));
        this.setIconImage(icon.getImage());   
    }
  

    public static void main(String[] args) {
       Demoframe frame = new Demoframe();
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setBounds(50, 50, 500, 400);
       frame.setTitle("file manager");
       frame.setVisible(true);
    }
}
