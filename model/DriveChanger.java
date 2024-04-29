package model;

import java.awt.Color;
import java.io.File;

public class DriveChanger {
    private static ExplorerPanel explorerPanel;

    public DriveChanger(ExplorerPanel explorerPanel) {
        DriveChanger.explorerPanel = explorerPanel;
    }



    public static void changeDrive(String drive) {
        File directory = null;
        switch (drive.toLowerCase()) {
            case "d":
                directory = new File("D:\\");
                break;
            case "c":
                directory = new File("C:\\");
                break;
            // Add cases for other drives if needed
            default:
                break;
        }
        if (directory != null) {
            ExplorerPanel.updateFileList(directory);
        }
    }

    public static void dayMode() {
        explorerPanel.setBackground(Color.WHITE);
        ExplorerPanel.fileList.setBackground(Color.WHITE);
        ExplorerPanel.fileList.setForeground(Color.BLACK);
        ExplorerPanel.locationLabel.setForeground(Color.BLACK);
        repaintComponents();
    }

    public static  void nightMode() {
        explorerPanel.setBackground(Color.BLACK);
        ExplorerPanel.fileList.setBackground(Color.BLACK);
        ExplorerPanel.fileList.setForeground(Color.WHITE);
        ExplorerPanel.locationLabel.setBackground(Color.BLACK);
        ExplorerPanel.locationLabel.setForeground(Color.WHITE);
        repaintComponents();
    }

    private static void repaintComponents() {
        ExplorerPanel.fileList.repaint();
        ExplorerPanel.locationLabel.repaint();
        explorerPanel.repaint();
    }
}
