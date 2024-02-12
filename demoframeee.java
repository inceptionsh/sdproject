import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class demoframeee extends JFrame {
    
    private static  JButton b1,b2,b3,b4,b;
     private static  JButton a1,a2,a3,a4;
  
    private Container c;
    
    
    
    
            
    demoframeee()
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
     b1.setBorder(null);
     c.add(b1);
     
      b2 = new JButton("view");
     b2.setBounds(75,0,76,20);
     b2.setBackground(Color.white);
     b2.setForeground(Color.black);
     b2.setLayout(null);
     b2.setBorder(null);
     
     b2.addActionListener(new ActionListener() {
         
            public void actionPerformed(ActionEvent e) {
                
                createNewFrame();
       }});
     
     c.add(b2);
     

        
        
     
     
      b3 = new JButton("Sort");
     b3.setBounds(150,0,76,20);
     b3.setBackground(Color.white);
     b3.setForeground(Color.black);
     b3.setBorder(null);
     b3.setLayout(null);
     c.add(b3);
     
      b4 = new JButton("Search");
     b4.setBounds(225,0,76,20);
     b4.setBackground(Color.white);
     b4.setForeground(Color.black);
     b4.setBorder(null);
     b4.setLayout(null);
     c.add(b4);
     
   
    }
    
 
   
    private void createNewFrame() {
    
        JFrame newFrame = new JFrame("New Frame");
        newFrame.setSize(30, 60);
        JButton p = new JButton("List");
       
        p.setBounds(0,0,30,20);
        p.setBackground(Color.white);
        p.setForeground(Color.black);
        newFrame.add(p);
        
        
         JButton q = new JButton("Content");
       
        q.setBounds(0,20,30,20);
        q.setBackground(Color.white);
        q.setForeground(Color.black);
        newFrame.add(q);
        
         JButton r = new JButton("Details");
       
        r.setBounds(0,40,30,20);
        r.setBackground(Color.white);
        r.setForeground(Color.black);
        newFrame.add(r);
        
        newFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
        

        
        newFrame.setVisible(true);
    }
    
    
    
        
        
  
 
   

    public static void main(String[] args) {
       demoframeee frame = new demoframeee();
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setBounds(50, 50, 300, 400);
       frame.setTitle("File manager");
       frame.setVisible(true);
    }
}

