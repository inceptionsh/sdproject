


import java.awt.Color;
import java.awt.Container;
import javax.swing.*;
public class Demoframe extends JFrame {
    
    private static  JButton b1,b2,b3,b4,b,d;
     
  
    private Container c;
  
    
    
    
            
    Demoframe()
    {
        initComponents();
       
       
    }
    public void initComponents()
    {
        
      
       
      c = this.getContentPane();
      c.setLayout(null);
      c.setBounds(0,0,300,400);
     
     
  
    
     b1 = new JButton("File");
     b1.setBounds(0,0,76,20);
     b1.setBackground(Color.white);
     b1.setForeground(Color.black);
     b1.setLayout(null);
     c.add(b1);
     
      b2 = new JButton("view");
     b2.setBounds(75,0,76,20);
     b2.setBackground(Color.white);
     b2.setForeground(Color.black);
     b2.setLayout(null);
     c.add(b2);
     
      b3 = new JButton("Sort");
     b3.setBounds(150,0,76,20);
     b3.setBackground(Color.white);
     b3.setForeground(Color.black);
     b3.setLayout(null);
     c.add(b3);
     
      b4 = new JButton("Search");
     b4.setBounds(225,0,76,20);
     b4.setBackground(Color.white);
     b4.setForeground(Color.black);
     b4.setLayout(null);
     c.add(b4);
     
   
    }
    
    
        
  

    
   

    public static void main(String[] args) {
       Demoframe frame = new Demoframe();
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setBounds(50, 50, 300, 400);
       frame.setTitle("File manager");
       frame.setVisible(true);
    }
}


