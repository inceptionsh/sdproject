package controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import javax.swing.JOptionPane;
import model.ExplorerPanel;

public class FileManipulation {

    private static File clipboardFile;

    public static void copyFile() {
        File selectedFile = ExplorerPanel.fileList.getSelectedValue();
        if (selectedFile != null) {
            clipboardFile = selectedFile;
            System.out.println("File copied: " + selectedFile.getName());
        }
    }

    public static File getClipboardFile() {
        return clipboardFile;
    }

    public static void pasteFile() {
        switch (clipboardFile != null ? 1 : 0) {
            case 1:
                copyFileToDestination();
                break;
            case 0:
                // Do nothing if clipboard is empty
                break;
            default:
                break;
        }
    }

    private static Path getDestinationPath() {
        File destinationDirectory = ExplorerPanel.getCurrentDirectory();
        return new File(destinationDirectory, clipboardFile.getName()).toPath();
    }

    private static void copyFileToDestination() {
        if (clipboardFile != null) {
            Path destinationPath = getDestinationPath();
            try {
                Path copy = Files.copy(clipboardFile.toPath(), destinationPath, StandardCopyOption.REPLACE_EXISTING);
                System.out.println("File pasted: " + destinationPath.toString());
                ExplorerPanel.updateFileList(ExplorerPanel.getCurrentDirectory());
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            }
        }
        clipboardFile = null;
    }

    public static void cutFile() {
        switch (clipboardFile == null ? 1 : 0) {
            case 1:
                File selectedFile = ExplorerPanel.fileList.getSelectedValue();
                switch (selectedFile == null ? 0 : 1) {
                    case 0:
                        FileDeletion.deleteFile();
                        clipboardFile = null; // Update clipboardFile after cutting the file
                        break;
                    case 1:
                        pasteFile();
                        break;
                    default:
                        break;
                }
                break;
            case 0:
                // Do nothing if clipboard is empty
                break;
            default:
                break;
        }
    }
}
