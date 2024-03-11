
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

  
  
}
