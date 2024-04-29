
package view;
import javax.swing.*;
import java.awt.*;
import model.ExplorerPanel;

public class ExplorerFrame extends JFrame {

    private ExplorerPanel explorerPanel;
   

    public ExplorerFrame() {
        setTitle("File Explorer");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        explorerPanel = new ExplorerPanel();
        

        add(explorerPanel, BorderLayout.CENTER);
      

        setJMenuBar(new ExplorerMenuBar(explorerPanel));

        setVisible(true);
       
       
    }

  
}


