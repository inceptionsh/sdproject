package controller;

import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;
import model.ExplorerPanel;

public class FileCreation {

    public static void getUserInputAndCreateFile() {
        String fileName = JOptionPane.showInputDialog("Enter file name:");
        if (fileName != null) {
            switch (createFile(fileName)) {
                case 0:
                    ExplorerPanel.updateFileList(ExplorerPanel.getCurrentDirectory());
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "Failed to create file.");
                    break;
                default:
                    break;
            }
        }
    }

    private static int createFile(String fileName) {
        File newFile = new File(ExplorerPanel.getCurrentDirectory(), fileName);
        try {
            return newFile.createNewFile() ? 0 : 1;
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            return -1;
        }
    }

    public static void createFolder() {
        String folderName = JOptionPane.showInputDialog("Enter folder name:");
        if (folderName != null) {
            switch (createDirectory(folderName)) {
                case 0:
                    ExplorerPanel.updateFileList(ExplorerPanel.getCurrentDirectory());
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "Failed to create folder.");
                    break;
                default:
                    break;
            }
        }
    }
    
    private static int createDirectory(String folderName) {
        File newFolder = new File(ExplorerPanel.getCurrentDirectory(), folderName);
        return newFolder.mkdir() ? 0 : 1;
    }
}
