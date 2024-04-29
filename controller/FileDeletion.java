package controller;

import java.io.File;
import javax.swing.JOptionPane;
import model.ExplorerPanel;

public class FileDeletion {

    public static void deleteFile() {
        File selectedFile = ExplorerPanel.fileList.getSelectedValue();
        if (selectedFile != null) {
            int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete " + selectedFile.getName() + "?",
                    "Confirm Deletion", JOptionPane.YES_NO_OPTION);

            switch (option) {
                case JOptionPane.YES_OPTION:
                    handleDeletion(selectedFile);
                    break;
                case JOptionPane.NO_OPTION:
                    // User chose not to delete the file
                    break;
                default:
                    // Do nothing
                    break;
            }
        }
    }

    static void handleDeletion(File file) {
        switch (file.isDirectory() ? 0 : 1) {
            case 0:
                deleteDirectory(file);
                break;
            case 1:
                deleteSingleFile(file);
                break;
            default:
                break;
        }
    }

    private static void deleteSingleFile(File file) {
        switch (file.delete() ? 0 : 1) {
            case 0:
                ExplorerPanel.updateFileList(ExplorerPanel.currentDirectory);
                break;
            case 1:
                JOptionPane.showMessageDialog(null, "Failed to delete file.");
                break;
            default:
                break;
        }
    }

    private static void deleteDirectory(File directory) {
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                deleteFile(file);
            }
        }
        deleteDirectoryAndHandleResult(directory);
    }

    private static void deleteFile(File file) {
        switch (file.isDirectory() ? 0 : 1) {
            case 0:
                deleteDirectory(file);
                break;
            case 1:
                deleteSingleFile(file);
                break;
            default:
                break;
        }
    }

    private static void deleteDirectoryAndHandleResult(File directory) {
        switch (directory.delete() ? 0 : 1) {
            case 0:
                ExplorerPanel.updateFileList(ExplorerPanel.currentDirectory);
                break;
            case 1:
                JOptionPane.showMessageDialog(null, "Failed to delete directory: " + directory.getName());
                break;
            default:
                break;
        }
    }
}
