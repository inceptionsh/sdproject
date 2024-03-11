
package com.mycompany.mainexplorerapp;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExplorerMenuBar extends JMenuBar {

    private ExplorerPanel explorerPanel;

    public ExplorerMenuBar(ExplorerPanel explorerPanel) {
        this.explorerPanel = explorerPanel;
       

        JMenu fileMenu = new JMenu("File");
        JMenu sort = new JMenu("sort");
        JMenu view = new JMenu("view");
        JMenu Mode = new JMenu("Mode");
        JMenu Drive = new JMenu("Drive");
        JMenu Edit = new JMenu("edit");

        JMenuItem createFileItem = new JMenuItem("Create File");
        createFileItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FileOperations.createFile();
            }
        });
        JMenuItem createFolderItem = new JMenuItem("Create Folder");
         createFolderItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FileOperations.createFolder();
            }
        });
          JMenuItem Delete= new JMenuItem("Delete");
          Delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              FileOperations.deleteFile();
            }
        });
        JMenuItem exitItem = new JMenuItem("Exit");
         exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
      
        JMenuItem Day= new JMenuItem("Day");
      
        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
       
        fileMenu.add(createFileItem);
        fileMenu.add(createFolderItem);
        fileMenu.add(Delete);
      
        fileMenu.add(exitItem);
        

        
        

        add(fileMenu);
       
        
    }
}

