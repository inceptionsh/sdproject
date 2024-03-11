package com.mycompany.mainexplorerapp;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExplorerMenuBar extends JMenuBar {

    private ExplorerPanel explorerPanel;

    public ExplorerMenuBar(ExplorerPanel explorerPanel) {
        this.explorerPanel = explorerPanel;
       

        JMenu fileMenu = new JMenu("File");
        
        
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
  
        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
       
       
          //implements edit menu
           JMenuItem copy = new JMenuItem("copy");
         copy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FileOperations.copyFile();
                
            }
        });
         
           JMenuItem paste = new JMenuItem("paste ");
         paste.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 FileOperations.pasteFile();
                
            }
        });
         
           JMenuItem cut = new JMenuItem("cut");
         cut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               FileOperations.cutFile();
                
            }
        });
        fileMenu.add(createFileItem);
        fileMenu.add(createFolderItem);
        fileMenu.add(Delete);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);
        Edit.add(copy);
        Edit.add(cut);
        Edit.add(paste);

        
        

        add(fileMenu);
        
        add(Edit);
       
    }
}