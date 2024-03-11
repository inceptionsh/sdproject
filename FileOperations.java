
package com.mycompany.mainexplorerapp;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;
import java.util.Comparator;

public class FileOperations extends ExplorerPanel {
    private ExplorerPanel explorerPanel;
    private static File clipboardFile;
    public static int a=1;
   


    public static void createFile() {
        
        String fileName = JOptionPane.showInputDialog("Enter file name:");
        if (fileName != null) {
            File newFile = new File(ExplorerPanel.getCurrentDirectory(), fileName);
            try {
                if (newFile.createNewFile()) {
                    ExplorerPanel.updateFileList(ExplorerPanel.getCurrentDirectory());
                } else {
                    JOptionPane.showMessageDialog(null, "Failed to create file.");
                }
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            }
        }
    }

    public  static  void createFolder() {
        String folderName = JOptionPane.showInputDialog("Enter folder name:");
        if (folderName != null) {
            File newFolder = new File(ExplorerPanel.getCurrentDirectory(), folderName);
            if (newFolder.mkdir()) {
                ExplorerPanel.updateFileList(ExplorerPanel.getCurrentDirectory());
            } else {
                JOptionPane.showMessageDialog(null, "Failed to create folder.");
            }
        }
    }

  
 
    
    
    
    
    
  

  
  
    public static void deleteFile() {
       File selectedFile = fileList.getSelectedValue();
     // File selectedFile = f();
        
        if (selectedFile != null) {
            int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete " + selectedFile.getName() + "?",
                    "Confirm Deletion", JOptionPane.YES_NO_OPTION);

            if (option == JOptionPane.YES_OPTION) {
                if (selectedFile.isDirectory()) {
                    deleteDirectory(selectedFile);
                } else {
                    if (selectedFile.delete()) {
                        updateFileList(currentDirectory);
                    } else {
                        JOptionPane.showMessageDialog(null, "Failed to delete file.");
                    }
                }
            }
        }
    }

    // Add the deleteDirectory method as well
    private static void deleteDirectory(File directory) {
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    deleteDirectory(file);
                } else {
                    if (!file.delete()) {
                        JOptionPane.showMessageDialog(null, "Failed to delete file: " + file.getName());
                    }
                }
            }
        }

        if (!directory.delete()) {
            JOptionPane.showMessageDialog(null, "Failed to delete directory: " + directory.getName());
        }

        updateFileList(currentDirectory);
    }
     
}

