package model;

import java.awt.Color;
import java.io.File;

public class DisplayMode {

    private static ExplorerPanel explorerPanel = new ExplorerPanel();

    public static void dayMode() {
        if (explorerPanel != null) {
            explorerPanel.setBackground(Color.WHITE);
//            explorerPanel.getFileList().setBackground(Color.WHITE);
//            explorerPanel.getFileList().setForeground(Color.BLACK);
            explorerPanel.getLocationLabel().setForeground(Color.BLACK);
            repaintComponents();
        } else {
            System.out.println("ExplorerPanel instance is null.");
        }
    }

    public static void nightMode() {
        if (explorerPanel != null) {
            explorerPanel.setBackground(Color.BLACK);
//            explorerPanel.getFileList().setBackground(Color.BLACK);
//            explorerPanel.getFileList().setForeground(Color.WHITE);
            explorerPanel.getLocationLabel().setBackground(Color.BLACK);
            explorerPanel.getLocationLabel().setForeground(Color.WHITE);
            repaintComponents();
        } else {
            System.out.println("ExplorerPanel instance is null.");
        }
    }

    private static void repaintComponents() {
//        explorerPanel.getFileList().repaint();
        explorerPanel.getLocationLabel().repaint();
        explorerPanel.repaint();
    }
}
