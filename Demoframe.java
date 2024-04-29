import java.awt.Color;
import java.awt.Container;
import javax.swing.*;
public class Demoframe extends JFrame {
    
    private static  JButton b1,b2,b3,b4,b,d;
     private static  JButton a1,a2,a3,a4;
  
    private Container c;
 
    
    
    
            
    Demoframe()
    {
        initComponents();
        intitfile();
       
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
     
      b2 = new JButton("VIEW");
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
    
    public void  intitfile(){
        
        
     a1 = new JButton("Desktop");
     a1.setBounds(0,30,120,20);
     a1.setBackground(Color.white);
     a1.setHorizontalTextPosition(JButton.LEFT);
     a1.setForeground(Color.black);
     a1.setLayout(null);
     c.add(a1);
     
     
     a2 = new JButton("Downloads");
     a2.setBounds(0,60,120,20);
     a2.setHorizontalTextPosition(JButton.LEFT);
     a2.setBackground(Color.white);
     a2.setForeground(Color.black);
     a2.setLayout(null);
     c.add(a2);
     
     a3 = new JButton("Documents");
     a3.setBounds(0,90,120,20);
     a3.setHorizontalTextPosition(JButton.LEFT);
     a3.setBackground(Color.white);
     a3.setForeground(Color.black);
     a3.setLayout(null);
     c.add(a3);
     
     a4 = new JButton("Picture");
     a4.setBounds(0,120,120,20);
     a4.setBackground(Color.white);
     a4.setHorizontalTextPosition(JButton.LEFT);
     a4.setForeground(Color.black);
     a4.setLayout(null);
     c.add(a4);
    }
        
        
  

    
   

    public static void main(String[] args) {
       Demoframe frame = new Demoframe();
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setBounds(50, 50, 300, 400);
       frame.setTitle("File manager");
       frame.setVisible(true);
    }
}