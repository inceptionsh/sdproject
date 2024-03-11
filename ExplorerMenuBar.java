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
        JMenuItem Ascending = new JMenuItem("Ascending");
        Ascending.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               FileOperations.sortFilesAscending();
            }
        });

        JMenuItem Descending = new JMenuItem("Descending");
        Descending.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FileOperations.sortFilesDescending();
            }
        });
        JMenuItem list= new JMenuItem("list");
        list.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              //  FileOperations.listview(); 
            }
        });
        JMenuItem grid= new JMenuItem("grid");
        grid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               // FileOperations.gridview(); 
            }
        });
        JMenuItem Day= new JMenuItem("Day");
        Day.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             
            }
        });
        JMenuItem Night= new JMenuItem("Night");
        Night.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             // FileOperations.panelbackground(); 
            }
        });
        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
       
         JMenuItem CDrive = new JMenuItem("CDrive");
         CDrive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                
            }
        });
         
         
          JMenuItem DDrive = new JMenuItem("DDrive");
         DDrive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
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
       
        sort.add(Ascending);
        sort.add(Descending);
        view.add(list);
        view.add(grid);
        Mode.add(Day);
        Mode.add(Night);
        Drive.add(CDrive);
        Drive.add(DDrive);

        
        

        add(fileMenu);
        add(sort);
        add(view);
        add(Edit);
        add(Mode);
        
        add(Drive);
        
    }
}