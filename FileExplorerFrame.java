package com.mycompany.mainframe;

import javax.swing.*;
import java.awt.*;

public class FileExplorerFrame extends JFrame {

    private ExplorerPanel explorerPanel;
    

    public FileExplorerFrame() {
        setTitle("File Explorer");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
     
        

        explorerPanel = new ExplorerPanel();
        add(explorerPanel);

        setVisible(true);
    }
}
